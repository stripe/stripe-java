package com.stripe.model;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.EventDataObjectDeserializationException;
import com.stripe.net.ApiResource;
import java.io.IOException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EventDataObjectDeserializerTest extends BaseStripeTest {
  private static final String OLD_EVENT_VERSION = "2013-08-15";
  private static final String NO_MATCH_VERSION = "2000-08-15";

  private void verifyDeserializedStripeObject(StripeObject stripeObject) {
    final Customer customer = (Customer) stripeObject;
    assertNotNull(customer);
    assertNotNull(customer.getId());
    assertNotNull(customer.getName());

    assertDoesNotThrow(() -> customer.delete(new HashMap<>()));
  }

  private String getCurrentEventStringFixture() throws IOException {
    String eventJson = getResourceAsString("/api_fixtures/customer_created.json");
    return eventJson.replace(
        "\"api_version\": \"2017-08-15\",", "\"api_version\": \"" + Stripe.API_VERSION + "\",");
  }

  private String getNoMatchEventStringFixture() throws IOException {
    String eventJson = getResourceAsString("/api_fixtures/customer_created.json");
    return eventJson.replace(
        "\"api_version\": \"2017-08-15\",", "\"api_version\": \"" + NO_MATCH_VERSION + "\",");
  }

  private String getOldEventStringFixture() throws IOException {
    return getResourceAsString("/api_fixtures/account_application_deauthorized_old_version.json");
  }

  @Test
  public void testDeserializeOnApiVersionMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertEquals(Stripe.API_VERSION, event.getApiVersion());

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertTrue(deserializer.getObject().isPresent());
    verifyDeserializedStripeObject(deserializer.getObject().get());
  }

  @Test
  public void testDeserializeUnsafeOnApiVersionMismatch() throws Exception {
    final String data = getNoMatchEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertNotEquals(Stripe.API_VERSION, event.getApiVersion());

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertFalse(deserializer.getObject().isPresent());

    // although version mismatch, schema is still compatible
    // so force deserialization is successful
    assertNotNull(deserializer.deserializeUnsafe());
    verifyDeserializedStripeObject(deserializer.deserializeUnsafe());
  }

  @Test
  public void testDeserializeUnsafeDoesNotMutateState()
      throws IOException, EventDataObjectDeserializationException {

    final String data = getNoMatchEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertFalse(deserializer.getObject().isPresent());

    StripeObject unsafeDeserialized = deserializer.deserializeUnsafe();
    assertNotNull(unsafeDeserialized);
    // successful forced deserialization, but getting object remains empty
    assertFalse(deserializer.getObject().isPresent());
  }

  @Test
  public void testFailureOnApiVersionMatch() throws Exception {
    // This is a little funky: basically, it is used to test what happens if
    // the versions match but we encounter an error parsing the event which
    // will occur if we use the data format of the old event fixture.
    // This was more of a risk when Stripe.stripeVersion was overrideable
    // but even still, the case is worth testing.
    final String data =
        getOldEventStringFixture()
            .replace(
                "\"api_version\": \"" + OLD_EVENT_VERSION + "\",",
                "\"api_version\": \"" + Stripe.API_VERSION + "\",");
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(Stripe.API_VERSION, event.getApiVersion());

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertFalse(deserializer.getObject().isPresent());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataObjectDeserializationException e) {
      JsonElement originalEventData =
          JsonParser.parseString(data)
              .getAsJsonObject()
              .get("data")
              .getAsJsonObject()
              .get("object");
      assertEquals(originalEventData.toString(), e.getRawJson());
      assertTrue(
          e.getMessage()
              .contains("Unable to deserialize event data object to respective Stripe object"));
    }
  }

  @Test
  public void testFailureOnApiVersionMisMatch() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertFalse(deserializer.getObject().isPresent());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataObjectDeserializationException e) {
      assertTrue(e.getMessage().contains("Stripe API version " + Stripe.API_VERSION));
      assertTrue(e.getMessage().contains("event data object has " + OLD_EVENT_VERSION));
    }
  }

  @Test
  public void testIgnoresBetaHeadersInLibraryVersionWhenDeterminingMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(Stripe.API_VERSION, event.getApiVersion());

    Stripe.addBetaVersion("some_beta", "v1");
    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertTrue(deserializer.getObject().isPresent());
    verifyDeserializedStripeObject(deserializer.getObject().get());
  }

  @Test
  public void testIgnoresBetaHeadersInEventVersionWhenDeterminingMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);
    event.apiVersion = Stripe.API_VERSION + "; some_beta=v1";

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertTrue(deserializer.getObject().isPresent());
    verifyDeserializedStripeObject(deserializer.getObject().get());
  }

  @Test
  public void testApiVersionMismatchReportedEvenWhenBetaHeadersPresent() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());

    Stripe.addBetaVersion("some_beta", "v1");
    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertFalse(deserializer.getObject().isPresent());
  }

  @Test
  public void testDeserializeUnsafeWith() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertFalse(deserializer.getObject().isPresent());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataObjectDeserializationException e) {
      StripeObject deserialized =
          deserializer.deserializeUnsafeWith(
              new EventDataObjectDeserializer.CompatibilityTransformer() {
                @Override
                public JsonObject transform(
                    JsonObject rawJsonObject, String apiVersion, String eventType) {

                  assertNotSame(deserializer.rawJsonObject, rawJsonObject);
                  rawJsonObject.add("name", new JsonPrimitive("foo_name"));
                  return rawJsonObject;
                }
              });
      assertNotNull(deserialized);
    }
  }

  @Test
  public void testGetRawJson() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    String rawJson = deserializer.getRawJson();
    assertNotNull(rawJson);
    assertEquals(event.getData().object.toString(), rawJson);
  }

  private EventDataObjectDeserializer stubIntegrationApiVersion(
      EventDataObjectDeserializer data, String stripeVersion) {
    EventDataObjectDeserializer dataSpy = Mockito.spy(data);
    Mockito.doReturn(stripeVersion).when(dataSpy).getIntegrationApiVersion();
    return dataSpy;
  }

  @Test
  public void testDeserializeSetsResponseGetter() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(Stripe.API_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    assertTrue(deserializer.getObject().isPresent());
    verifyDeserializedStripeObject(deserializer.getObject().get());
  }

  @Test
  public void testGetDataObjectWithGaVersionMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final String ApiVersion = "2025-04-01.basil";

    // the SDK is on a GA version that matches the event version exactly
    event.setApiVersion(ApiVersion);

    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), ApiVersion);

    assertTrue(deserializer.getObject().isPresent());
  }

  @Test
  public void testGetDataObjectWithPreviewVersionMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final String ApiVersion = "2025-04-01.preview";

    // the SDK is on a preview version that matches the event version exactly
    event.setApiVersion(ApiVersion);

    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), ApiVersion);

    assertTrue(deserializer.getObject().isPresent());
  }

  @Test
  public void testGetDataObjectWithPreviewVersionMismatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final String eventApiVersion = "2025-04-01.preview";
    final String sdkApiVersion = "2025-05-01.preview";

    // the SDK is on a preview version that is different from the preview version of the event
    event.setApiVersion(eventApiVersion);

    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), sdkApiVersion);

    assertFalse(deserializer.getObject().isPresent());
  }

  @Test
  public void testGetDataObjectWithGaVersionMismatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final String eventApiVersion = "2025-04-01.preview";
    final String sdkApiVersion = "2025-05-01.basil";

    // the SDK is on a preview version that is different from the preview version of the event
    event.setApiVersion(eventApiVersion);

    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), sdkApiVersion);

    assertFalse(deserializer.getObject().isPresent());
  }

  @Test
  public void testGetDataObjectWithGaPreviewVersionMismatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final String eventApiVersion = "2025-04-01.basil";
    final String sdkApiVersion = "2025-05-01.preview";

    // the SDK is on a preview version that is different from the preview version of the event
    event.setApiVersion(eventApiVersion);

    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), sdkApiVersion);

    assertFalse(deserializer.getObject().isPresent());
  }
}

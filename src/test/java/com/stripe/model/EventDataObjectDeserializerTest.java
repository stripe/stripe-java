package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.stripe.BaseStripeTest;
import com.stripe.exception.EventDataObjectDeserializationException;
import com.stripe.net.ApiResource;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EventDataObjectDeserializerTest extends BaseStripeTest {
  private static final String OLD_EVENT_VERSION = "2013-08-15";
  private static final String CURRENT_EVENT_VERSION = "2017-08-15";
  private static final String NO_MATCH_VERSION = "2000-08-15";

  private void verifyDeserializedStripeObject(StripeObject stripeObject) {
    final Application application = (Application) stripeObject;
    assertNotNull(application);
    assertNotNull(application.getId());
    assertNotNull(application.getName());
  }

  private String getCurrentEventStringFixture() throws IOException {
    return getResourceAsString("/api_fixtures/account_application_deauthorized.json");
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

    assertEquals(CURRENT_EVENT_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), CURRENT_EVENT_VERSION);

    assertTrue(deserializer.getObject().isPresent());
    verifyDeserializedStripeObject(deserializer.getObject().get());
  }

  @Test
  public void testDeserializeUnsafeOnApiVersionMismatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertNotEquals(NO_MATCH_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.getObject().isPresent());

    // although version mismatch, schema is still compatible
    // so force deserialization is successful
    assertNotNull(deserializer.deserializeUnsafe());
    verifyDeserializedStripeObject(deserializer.deserializeUnsafe());
  }

  @Test
  public void testDeserializeUnsafeDoesNotMutateState()
      throws IOException, EventDataObjectDeserializationException {

    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.getObject().isPresent());

    StripeObject unsafeDeserialized = deserializer.deserializeUnsafe();
    assertNotNull(unsafeDeserialized);
    // successful forced deserialization, but getting object remains empty
    assertFalse(deserializer.getObject().isPresent());
  }

  @Test
  public void testFailureOnApiVersionMatch() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), OLD_EVENT_VERSION);

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
    EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.getObject().isPresent());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataObjectDeserializationException e) {
      assertTrue(e.getMessage().contains("Stripe API version " + NO_MATCH_VERSION));
      assertTrue(e.getMessage().contains("event data object has " + OLD_EVENT_VERSION));
    }
  }

  @Test
  public void testDeserializeUnsafeWith() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    final EventDataObjectDeserializer deserializer =
        stubIntegrationApiVersion(event.getDataObjectDeserializer(), NO_MATCH_VERSION);

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
}

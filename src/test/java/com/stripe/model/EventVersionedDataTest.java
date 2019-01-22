package com.stripe.model;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.stripe.BaseStripeTest;
import com.stripe.exception.EventDataDeserializationException;
import com.stripe.net.ApiResource;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class EventVersionedDataTest extends BaseStripeTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

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
    return getResourceAsString(
        "/api_fixtures/account_application_deauthorized_old_version.json");
  }

  @Test
  public void testSafeDeserializationOnApiVersionMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertEquals(CURRENT_EVENT_VERSION, event.getApiVersion());
    EventVersionedData stubbedData = stubIntegrationApiVersion(
        event.getVersionedData(), CURRENT_EVENT_VERSION);

    assertTrue(stubbedData.safeDeserialize());
    assertNotNull(stubbedData.getObject());
    verifyDeserializedStripeObject(stubbedData.getObject());
  }

  @Test
  public void testForceDeserializationOnApiVersionMismatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertNotEquals(NO_MATCH_VERSION, event.getApiVersion());
    EventVersionedData stubbedData = stubIntegrationApiVersion(
        event.getVersionedData(), NO_MATCH_VERSION);

    assertFalse(stubbedData.safeDeserialize());

    // although version mismatch, schema is still compatible
    // so force deserialization is successful
    assertNotNull(stubbedData.forceDeserialize());
    verifyDeserializedStripeObject(stubbedData.forceDeserialize());
  }

  @Test
  public void testForceDeserializationDoesNotMutateState() throws IOException,
      EventDataDeserializationException {

    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventVersionedData stubbedData = stubIntegrationApiVersion(
        event.getVersionedData(), NO_MATCH_VERSION);

    assertFalse(stubbedData.safeDeserialize());
    // when it is unsafe, getting normal object returns nothing.
    assertNull(stubbedData.getObject());

    StripeObject forceDeserialized = stubbedData.forceDeserialize();
    assertNotNull(forceDeserialized);
    // successful forced deserialization, but getting object remains empty
    assertNull(stubbedData.getObject());
  }

  @Test
  public void testFailureOnApiVersionMatch() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());
    EventVersionedData stubbedData = stubIntegrationApiVersion(
        event.getVersionedData(), OLD_EVENT_VERSION);

    assertFalse(stubbedData.safeDeserialize());

    try {
      stubbedData.forceDeserialize();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      JsonElement originalEventData = new JsonParser().parse(data)
          .getAsJsonObject().get("data")
          .getAsJsonObject().get("object");
      assertEquals(originalEventData, e.getRawJsonObject());
      assertEquals(stubbedData.getRawJsonObject(), e.getRawJsonObject());
      assertTrue(e.getMessage()
          .contains("Unable to deserialize event data to respective Stripe object"));
    }
  }

  @Test
  public void testFailureOnApiVersionMisMatch() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());
    EventVersionedData stubbedData = stubIntegrationApiVersion(
        event.getVersionedData(), NO_MATCH_VERSION);

    assertFalse(stubbedData.safeDeserialize());

    try {
      stubbedData.forceDeserialize();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      assertTrue(e.getMessage().contains(
          "Current integration has Stripe API version "
              + NO_MATCH_VERSION + ", but the event data has version "
              + OLD_EVENT_VERSION));
    }
  }

  @Test
  public void testRetryDeserializeOnFailure() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventVersionedData stubbedData = stubIntegrationApiVersion(
        event.getVersionedData(), NO_MATCH_VERSION);

    assertFalse(stubbedData.safeDeserialize());

    try {
      stubbedData.forceDeserialize();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      JsonObject jsonObject = e.getRawJsonObject();

      // set string value to correspond to the schema
      jsonObject.add("name", new JsonPrimitive("foo_name"));
      verifyDeserializedStripeObject(stubbedData.retryDeserialize(jsonObject));
      // retry deserialize does not mutate the state
      assertNull(stubbedData.getObject());
    }
  }

  @Test
  public void testObjectRawJsonAvailable() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventVersionedData eventData = event.getVersionedData();

    assertNotNull(eventData.getRawJsonObject());
    assertEquals(event.getData().object, eventData.getRawJsonObject());
  }

  private EventVersionedData stubIntegrationApiVersion(EventVersionedData data,
                                                       String stripeVersion) {
    EventVersionedData dataSpy = Mockito.spy(data);
    Mockito.doReturn(stripeVersion).when(dataSpy).getIntegrationApiVersion();
    return dataSpy;
  }
}
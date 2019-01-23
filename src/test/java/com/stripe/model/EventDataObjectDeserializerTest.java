package com.stripe.model;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
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

public class EventDataObjectDeserializerTest extends BaseStripeTest {

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
  public void testDeserializeOnApiVersionMatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertEquals(CURRENT_EVENT_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), CURRENT_EVENT_VERSION);

    assertTrue(deserializer.deserialize());
    assertNotNull(deserializer.getObject());
    verifyDeserializedStripeObject(deserializer.getObject());
  }

  @Test
  public void testDeserializeUnsafeOnApiVersionMismatch() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertNotNull(event);
    assertNotNull(event.getId());

    assertNotEquals(NO_MATCH_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.deserialize());

    // although version mismatch, schema is still compatible
    // so force deserialization is successful
    assertNotNull(deserializer.deserializeUnsafe());
    verifyDeserializedStripeObject(deserializer.deserializeUnsafe());
  }

  @Test
  public void testDeserializeUnsafeDoesNotMutateState() throws IOException,
      EventDataDeserializationException {

    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.deserialize());
    // when it is unsafe, getting normal object returns nothing.
    assertNull(deserializer.getObject());

    StripeObject unsafeDeserialized = deserializer.deserializeUnsafe();
    assertNotNull(unsafeDeserialized);
    // successful forced deserialization, but getting object remains empty
    assertNull(deserializer.getObject());
  }

  @Test
  public void testFailureOnApiVersionMatch() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);
    
    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), OLD_EVENT_VERSION);

    assertFalse(deserializer.deserialize());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      JsonElement originalEventData = new JsonParser().parse(data)
          .getAsJsonObject().get("data")
          .getAsJsonObject().get("object");
      assertEquals(originalEventData, e.getRawJsonObject());
      assertEquals(deserializer.getRawJsonObject(), e.getRawJsonObject());
      assertTrue(e.getMessage()
          .contains("Unable to deserialize event data object to respective Stripe object"));
    }
  }

  @Test
  public void testFailureOnApiVersionMisMatch() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    assertEquals(OLD_EVENT_VERSION, event.getApiVersion());
    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.deserialize());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      assertTrue(e.getMessage().contains(
          "Current integration has Stripe API version "
              + NO_MATCH_VERSION + ", but the event data object has version "
              + OLD_EVENT_VERSION));
    }
  }

  @Test
  public void testDeserializeUnsafeWith() throws Exception {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    assertFalse(deserializer.deserialize());

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      JsonObject jsonObject = e.getRawJsonObject();

      // set string value to correspond to the schema
      jsonObject.add("name", new JsonPrimitive("foo_name"));
      verifyDeserializedStripeObject(deserializer.deserializeUnsafeWith(jsonObject));
      // retry deserialize does not mutate the state
      assertNull(deserializer.getObject());
    }
  }

  @Test
  public void testGetRawJsonObjectAsDeepCopy() throws Exception {
    final String data = getCurrentEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();

    JsonObject rawJsonObject = deserializer.getRawJsonObject();
    assertNotNull(rawJsonObject);
    assertEquals(event.getData().object, rawJsonObject);
    assertNotSame(event.getData().object, rawJsonObject);

    rawJsonObject.remove("name");
    assertNull(rawJsonObject.get("name"));
    assertNotNull(event.getData().object.get("name"));
  }

  @Test
  public void testFailureGetRawJsonObjectAsDeepCopy() throws IOException {
    final String data = getOldEventStringFixture();
    final Event event = ApiResource.GSON.fromJson(data, Event.class);

    EventDataObjectDeserializer deserializer = stubIntegrationApiVersion(
        event.getDataObjectDeserializer(), NO_MATCH_VERSION);

    try {
      deserializer.deserializeUnsafe();
      fail("Expect event data deserialization failure.");
    } catch (EventDataDeserializationException e) {
      assertNotSame(event.getData().object, e.getRawJsonObject());
    }
  }

  private EventDataObjectDeserializer stubIntegrationApiVersion(EventDataObjectDeserializer data,
                                                                String stripeVersion) {
    EventDataObjectDeserializer dataSpy = Mockito.spy(data);
    Mockito.doReturn(stripeVersion).when(dataSpy).getIntegrationApiVersion();
    return dataSpy;
  }
}
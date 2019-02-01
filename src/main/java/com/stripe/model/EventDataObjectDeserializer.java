package com.stripe.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.stripe.Stripe;
import com.stripe.exception.EventDataObjectDeserializationException;
import lombok.EqualsAndHashCode;

/**
 * Deserialization helper to get {@code StripeObject} and handle failure due to schema
 * incompatibility between the data object and the model classes. Event data object always
 * corresponds to the schema at API version of its creation time, available at
 * {@link Event#getApiVersion()}, while the model classes correspond to schemas at a specific
 * version pinned to this library {@link Stripe#API_VERSION}. Thus, only data object with same
 * API versions is guaranteed to deserialize safely.
 *
 * <p>In practice, each {@link Stripe#API_VERSION} update only affects specific set of classes,
 * so event data object for the unaffected classes can still be serialized successfully -- even when
 * the API versions do not match. (Although it is considered unsafe by the API version comparison.)
 *
 * <p>Upon seeing deserialization failure from retrieving events or during receiving webhook events,
 * consider defining your own custom {@link CompatibilityTransformer} to transform the raw JSON to
 * one with schema compatible with the current model classes. (Events in failed webhooks can be
 * retrieved again from the event API.)
 *
 * <p>An example of event data object deserialization is:
 *
 * <pre>
 * Event event = Event.retrieve("evt_123");
 * EventDataObjectDeserializer deserializer = event.getDataObjectDeserializer();
 * StripeObject stripeObject;
 * if (deserializer.deserialize()) {
 *   stripeObject = deserializer.getObject();
 * } else {
 *   try {
 *     stripeObject = deserializer.deserializeUnsafe();
 *   } catch (EventDataObjectDeserializationException e) {
 *     EventDataObjectDeserializer.CompatibilityTransformer transformer = myCustomerTransformer();
 *     stripeObject = deserializer.deserializeUnsafeWith(transformer);
 *   }
 * }
 * </pre>
 */
@EqualsAndHashCode(callSuper = false)
public class EventDataObjectDeserializer {
  /**
   * API version of the event data object. This value is not made accessible, because
   * {@link Event#getApiVersion()} should be used instead.
   */
  String apiVersion;
  /**
   * Event type to which this event data object belongs to.
   */
  String eventType;
  /**
   * Raw JSON response to be deserialized into {@code StripeObject}.
   */
  JsonObject rawJsonObject;
  /**
   * Deserialized {@code StripeObject} set during successful/safe deserialization.
   */
  private StripeObject object;

  EventDataObjectDeserializer(String apiVersion,
                              String eventType,
                              JsonObject rawJsonObject) {
    this.apiVersion = apiVersion;
    this.rawJsonObject = rawJsonObject;
    this.eventType = eventType;
  }

  /**
   * Gets data event object, in favor of the deprecated {@link EventData#getObject()}.
   * When non-null, the deserialized {@code StripeObject} preserves high data integrity because of
   * correspondence between schema of the API response and the model class (the underlying
   * concrete class for abstract {@code StripeObject}) schema. This is when
   * {@link Event#getApiVersion()} matches {@link Stripe#API_VERSION}.
   * @return stripe object that fully represent its original raw JSON response.
   */
  public StripeObject getObject() {
    if (object != null) {
      return object;
    }
    if (deserialize()) {
      return object;
    } else {
      return null;
    }
  }

  /**
   * Get raw JSON string for the data object. This is the same data available in
   * {@link EventDataObjectDeserializationException#getRawJson()} ()} upon deserialization
   * failure.
   * @return JSON string the event data object.
   */
  public String getRawJson() {
    return rawJsonObject.toString();
  }

  /**
   * Safe deserialize raw JSON into {@code StripeObject}. This operation mutates the state, and the
   * successful result can be accessed via {@link EventDataObjectDeserializer#getObject()}.
   * Matching {@link Event#getApiVersion()} and {@link Stripe#API_VERSION} is necessary condition
   * to guarantee safe deserialization.
   * @return whether deserialization has been successful.
   */
  public boolean deserialize() {
    if (!apiVersionMatch()) {
      // when version mismatch, even when deserialization is successful,
      // we cannot guarantee data correctness. Old events containing fields that should be
      // translated/mapped to the new schema will simply not be captured by the new schema.
      return false;
    } else if (object != null) {
      // already successfully deserialized
      return true;
    } else {
      try {
        object = EventDataDeserializer.deserializeStripeObject(rawJsonObject);
        return true;
      } catch (JsonParseException e) {
        // intentionally ignore exception to fulfill simply whether deserialization succeeds
        return false;
      }
    }
  }

  /**
   * Force deserialize raw JSON to {@code StripeObject}. The deserialized data is not guaranteed
   * to fully represent the JSON. For example, events of new API version having fields that are not
   * captured by current model class will be lost. Similarly, events of old API version
   * having fields that should be translated into the new fields, like field rename, will be lost.
   *
   * <p>Upon deserialization failure, consider making the JSON compatible to the current model
   * classes and recover from failure with
   * {@link EventDataObjectDeserializer#deserializeUnsafeWith(CompatibilityTransformer)}.
   *
   * @return Object with no guarantee on full representation of its original raw JSON response.
   * @throws EventDataObjectDeserializationException exception that contains the message error
   *     and the raw JSON response of the {@code StripeObject} to be deserialized.
   */
  public StripeObject deserializeUnsafe() throws EventDataObjectDeserializationException {
    try {
      return EventDataDeserializer.deserializeStripeObject(rawJsonObject);
    } catch (JsonParseException e) {
      String errorMessage;
      if (!apiVersionMatch()) {
        errorMessage = String.format(
            "Current `stripe-java` integration has Stripe API version %s, but the event data "
                + "object has %s. The JSON data might have schema not compatible with the "
                + "current model classes; such incompatibility can be the cause of "
                + "deserialization failure. Please see our API version upgrade guide, "
                + "and consider transforming the raw JSON data object to be compatible with "
                + "current model class schemas and use `deserializeUnsafeWith`. "
                + "Original error message: %s",
            getIntegrationApiVersion(), this.apiVersion, e.getMessage()
        );
      } else {
        errorMessage = String.format("Unable to deserialize event data object to respective Stripe "
            + "object. Please see the raw JSON, and contact support@stripe.com for "
            + "assistance. Original error message: %s", e.getMessage());
      }
      throw new EventDataObjectDeserializationException(errorMessage, rawJsonObject.toString());
    }
  }

  /**
   * Deserialize JSON that has been processed by
   * {@link CompatibilityTransformer#transform(JsonObject, String, String)} into
   * {@code StripeObject}. This deserialization method should only be used to handle events with
   * schema incompatible to model class schema of this library. Throws
   * {@link JsonParseException} when the transformed JSON remains incompatible with the model
   * classes.
   * @return deserialized {@code StripeObject} from user-supplied compatible JSON.
   */
  public StripeObject deserializeUnsafeWith(CompatibilityTransformer transformer) {
    return EventDataDeserializer.deserializeStripeObject(
        transformer.transform(rawJsonObject.deepCopy(), apiVersion, eventType));
  }

  private boolean apiVersionMatch() {
    return getIntegrationApiVersion().equals(this.apiVersion);
  }

  /**
   * Internal method to allow for testing with different Stripe version.
   */
  String getIntegrationApiVersion() {
    return Stripe.API_VERSION;
  }

  /**
   * Definition of event data object JSON transformation to be compatible to API version of the
   * library.
   */
  public interface CompatibilityTransformer {
    /**
     * Transform event data object JSON into a schema compatible with model classes of the library.
     * When used in
     * {@link EventDataObjectDeserializer#deserializeUnsafeWith(CompatibilityTransformer)}.
     * the resulting JSON will be deserialized to {@code StripeObject}.
     *
     * @param rawJsonObject event data object JSON to be transformed. Direct mutation is
     *     allowed.
     * @param apiVersion API version of the event data object
     * @param eventType event type to which this event data object belongs to.
     * @return transformed JSON with schema compatible to the model class in this library.
     */
    JsonObject transform(JsonObject rawJsonObject, String apiVersion, String eventType);
  }
}

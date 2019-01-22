package com.stripe.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.stripe.Stripe;
import com.stripe.exception.EventDataDeserializationException;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Event data with explicit deserialization support to handle failure due to schema incompatibility
 * between the event data and the model classes. Event data always corresponds to schema at API
 * version of its creation time, while the model classes correspond to schema at a specific API
 * version pinned to this library. Thus, only event data whose API version matches that of
 * the model classes is guaranteed to deserialize safely.
 *
 * <p>In practice, each API version update only affects specific set of classes, so event data
 * for the unaffected classes can be serialized successfully -- even when the API versions do
 * not match. (Although it is considered unsafe by the API version comparison.)
 *
 * <p>Upon seeing deserialization failure from retrieving events or during receiving webhook events,
 * consider defining your own custom mapper that transforms the raw JSON to one with
 * schema compatible with the current model classes. (Events in failed webhooks can be retrieved
 * again from the event API.)
 *
 * <p>An example of event data deserialization is:
 *
 * <pre>
 * Event event =  Event.retrieve("evt_123");
 * EventVersionedData versionedData = event.getVersionedData();
 * StripeObject stripeObject;
 * if (versionedData.safeDeserialize()) {
 *   stripeObject = versionedData.getObject();
 * } else {
 *   try {
 *     stripeObject = versionedData.forceDeserialize();
 *   } catch (EventDataDeserializationException e) {
 *     JsonElement compatibleJson = compatibilityMapper(
 *       e.getRawJsonObject(),
 *       event.getApiVersion());
 *     stripeObject = versionedData.retryDeserialize(compatibleJson);
 *   }
 * }
 * </pre>
 */
@EqualsAndHashCode(callSuper = false)
public class EventVersionedData extends StripeObject {
  /**
   * API version of the event data. This value is not made accessible, because
   * {@link Event#getApiVersion()} should be used instead.
   */
  String apiVersion;

  /**
   * Deserialized {@code StripeObject} set during successful/safe deserialization.
   */
  StripeObject object;

  /**
   * Original previous attributes, same as {@link EventData#getPreviousAttributes()}.
   */
  @Getter
  Map<String, Object> previousAttributes;

  /**
   * Raw JSON response to be deserialized into {@code StripeObject}. This is the same
   * response in {@link EventDataDeserializationException#getRawJsonObject()}.
   */
  @Getter
  JsonObject rawJsonObject;

  EventVersionedData(String apiVersion,
                     Map<String, Object> previousAttributes,
                     JsonObject rawJsonObject) {
    this.apiVersion = apiVersion;
    this.previousAttributes = previousAttributes;
    this.rawJsonObject = rawJsonObject;
  }

  /**
   * Safe deserialize raw JSON into {@code StripeObject}. This operation mutates the state, and the
   * successful result can be accessed via {@link EventVersionedData#getObject()}. Matching API
   * version between the current integration and the event is necessary to guarantee safe
   * deserialization.
   * @return whether deserialization has been successful.
   */
  public boolean safeDeserialize() {
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
   * When non-null, the deserialized {@code StripeObject} preserves high data integrity because of
   * strong correspondence between schema of the API response and the model class (the underlying
   * concrete class for abstract {@code StripeObject}). It is set in
   * {@link EventVersionedData#safeDeserialize()}
   * @return stripe object that fully represent its original raw JSON response.
   */
  public StripeObject getObject() {
    if (object != null) {
      return object;
    }
    if (safeDeserialize()) {
      return object;
    } else {
      return null;
    }
  }

  /**
   * Force deserialize raw JSON to {@code StripeObject}. The deserialized data is not guaranteed
   * to fully represent the JSON. For example, events of new API version having fields that are not
   * captured by current model class will be lost. Similarly, events of old API version
   * having fields that should be translated into the new fields, like field rename, will be lost.
   *
   * <p>Upon deserialization failure, {@link EventVersionedData#retryDeserialize(JsonObject)} can
   * be used to recover after making the JSON compatible to the current model classes.
   *
   * @return Object with no guarantee on full representation of its original raw JSON response.
   * @throws EventDataDeserializationException exception that contains the message error and the
   *     raw JSON response of the {@code StripeObject} to be deserialized.
   */
  public StripeObject forceDeserialize() throws EventDataDeserializationException {
    try {
      return EventDataDeserializer.deserializeStripeObject(rawJsonObject);
    } catch (JsonParseException e) {
      String errorMessage;
      if (!apiVersionMatch()) {
        errorMessage = String.format(
            "Current integration has Stripe API version %s, but the event data has version %s. "
                + "This schema mismatch can cause the deserialization failure. Please see our API "
                + "version upgrade guide, and consider evolve the JSON to be compatible with "
                + "current integration schema. Original error message: ",
            getIntegrationApiVersion(), this.apiVersion, e.getMessage()
        );
      } else {
        errorMessage = String.format("Unable to deserialize event data to respective Stripe "
            + "object. Please see the raw JSON object, and contact support@stripe.com for "
            + "assistance. Original error message: %s", e.getMessage());
      }
      throw new EventDataDeserializationException(errorMessage, rawJsonObject);
    }
  }

  /**
   * Retry deserialization with user-supplied JSON object, whose schema now corresponds to
   * the current model classes. This should be used only when
   * {@link EventVersionedData#forceDeserialize()} fails.
   * @return deserialized {@code StripeObject} from user-supplied compatible JSON.
   */
  public StripeObject retryDeserialize(JsonObject schemaCompatibleJson) {
    return EventDataDeserializer.deserializeStripeObject(schemaCompatibleJson);
  }

  private boolean apiVersionMatch() {
    return (this.apiVersion != null)
        && (this.apiVersion.equals(getIntegrationApiVersion()));
  }

  /**
   * Internal method to allow for testing with different Stripe version.
   */
  String getIntegrationApiVersion() {
    return Stripe.apiVersion;
  }
}

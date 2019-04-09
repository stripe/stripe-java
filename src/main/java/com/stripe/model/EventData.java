package com.stripe.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventData extends StripeObject {
  /**
   * Raw JSON object intended to be deserialized as {@code StripeObject}. The deserialization
   * should be deferred to the user. See the now deprecated method {@link EventData#getObject()}.
   */
  JsonObject object;

  /**
   * Object containing the names of the attributes that have changed, and their previous values
   * (sent along only with *.updated events). The untyped object here is composed of
   * {@code Map<String, Object>}, {@code List<Object>}, and basic Java data types.
   * The array was previously represented as {@code Object[]} in `stripe-java` below v9.x
   */
  Map<String, Object> previousAttributes;

  /**
   * Deprecated in favor of getting {@code StripeObject} from
   * {@link Event#getDataObjectDeserializer()} and {@link EventDataObjectDeserializer#getObject()}.
   * Throws {@link JsonParseException} deserialization failure due to general invalid JSON,
   * or more specifically when JSON data and model class have incompatible schemas.
   * @return deserialized stripe object for event data.
   */
  @Deprecated
  public StripeObject getObject() {
    return EventDataDeserializer.deserializeStripeObject(object);
  }
}
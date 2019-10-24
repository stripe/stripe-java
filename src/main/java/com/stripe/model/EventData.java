package com.stripe.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventData extends StripeObject {
  /**
   * Object containing the names of the attributes that have changed, and their previous values
   * (sent along only with *.updated events).
   */
  @SerializedName("previous_attributes")
  Map<String, Object> previousAttributes;

  /**
   * Raw JSON object intended to be deserialized as {@code StripeObject}. The deserialization should
   * be deferred to the user. See the now deprecated method {@link #getObject()}.
   */
  @SerializedName("object")
  JsonObject object;

  /**
   * @deprecated Deprecated in favor of getting {@code StripeObject} from {@link
   *     Event#getDataObjectDeserializer()} and {@link EventDataObjectDeserializer#getObject()}.
   *     Throws {@link JsonParseException} deserialization failure due to general invalid JSON, or
   *     more specifically when JSON data and model class have incompatible schemas.
   * @return Deserialized StripeObject for event data.
   */
  @Deprecated
  public StripeObject getObject() {
    return EventDataDeserializer.deserializeStripeObject(object);
  }
}

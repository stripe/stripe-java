package com.stripe.exception;

import com.google.gson.JsonObject;
import lombok.Getter;

public class EventDataDeserializationException extends StripeException {
  private static final long serialVersionUID = 2L;

  /**
   * JSON that fails deserialization to {@code StripeObject}.
   */
  @Getter
  private final JsonObject rawJsonObject;

  public EventDataDeserializationException(String message,
                                           JsonObject rawJsonObject) {
    super(message, null, null, null);
    this.rawJsonObject = rawJsonObject;
  }
}
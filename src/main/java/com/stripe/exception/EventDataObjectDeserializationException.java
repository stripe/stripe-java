package com.stripe.exception;

import lombok.Getter;

public class EventDataObjectDeserializationException extends StripeException {
  private static final long serialVersionUID = 2L;

  /**
   * JSON that fails deserialization to {@code StripeObject}.
   */
  @Getter
  private final String rawJson;

  public EventDataObjectDeserializationException(String message,
                                                 String rawJson) {
    super(message, null, null, null);
    this.rawJson = rawJson;
  }
}
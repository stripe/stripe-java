package com.stripe.exception;

/**
 * {@link ApiKeyMissingException} is thrown when the API key is not set for a request. The API key
 * for a request may be set either globally through {@link com.stripe.Stripe#apiKey} or through
 * {@link com.stripe.net.RequestOptions}.
 */
public class ApiKeyMissingException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /** Initializes a new instance of the {@link ApiKeyMissingException}. */
  public ApiKeyMissingException() {
    super();
  }

  /** Initializes a new instance of the {@link ApiKeyMissingException} with a message. */
  public ApiKeyMissingException(String message) {
    super(message);
  }
}

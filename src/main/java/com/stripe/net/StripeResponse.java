package com.stripe.net;

import static java.util.Objects.requireNonNull;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.Accessors;
import lombok.experimental.NonFinal;

/** A response from Stripe's API. */
@Value
@Accessors(fluent = true)
public class StripeResponse {
  /** The HTTP status code of the response. */
  int code;

  /** The HTTP headers of the response. */
  HttpHeaders headers;

  /** The body of the response. */
  String body;

  /** Number of times the request was retried. Used for internal tests only. */
  @NonFinal
  @Getter(AccessLevel.PACKAGE)
  @Setter(AccessLevel.PACKAGE)
  int numRetries;

  /**
   * Initializes a new instance of the {@link StripeResponse} class.
   *
   * @param code the HTTP status code of the response
   * @param headers the HTTP headers of the response
   * @param body the body of the response
   * @throws NullPointerException if {@code headers} or {@code body} is {@code null}
   */
  public StripeResponse(int code, HttpHeaders headers, String body) {
    requireNonNull(headers);
    requireNonNull(body);

    this.code = code;
    this.headers = headers;
    this.body = body;
  }

  /**
   * Gets the date of the request, as returned by Stripe.
   *
   * @return the date of the request, as returned by Stripe
   */
  public Instant date() {
    Optional<String> dateStr = this.headers.firstValue("Date");
    if (!dateStr.isPresent()) {
      return null;
    }
    return ZonedDateTime.parse(dateStr.get(), DateTimeFormatter.RFC_1123_DATE_TIME).toInstant();
  }

  /**
   * Gets the idempotency key of the request, as returned by Stripe.
   *
   * @return the idempotency key of the request, as returned by Stripe
   */
  public String idempotencyKey() {
    return this.headers.firstValue("Idempotency-Key").orElse(null);
  }

  /**
   * Gets the ID of the request, as returned by Stripe.
   *
   * @return the ID of the request, as returned by Stripe
   */
  public String requestId() {
    return this.headers.firstValue("Request-Id").orElse(null);
  }
}

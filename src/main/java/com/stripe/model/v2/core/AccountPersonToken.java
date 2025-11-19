// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Person Tokens are single-use tokens which tokenize person information, and are used for creating
 * or updating a Person.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountPersonToken extends StripeObject implements HasId {
  /**
   * Time at which the token was created. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Time at which the token will expire. */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** Unique identifier for the token. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the token exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.account_person_token}.
   */
  @SerializedName("object")
  String object;

  /** Determines if the token has already been used (tokens can only be used once). */
  @SerializedName("used")
  Boolean used;
}

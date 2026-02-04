// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Billing Profile is a representation of how a bill is paid, separating payment behavior from
 * customer identity.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Profile extends StripeObject implements HasId {
  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the customer object. */
  @SerializedName("customer")
  String customer;

  /** The ID of the payment method object. */
  @SerializedName("default_payment_method")
  String defaultPaymentMethod;

  /** A customer-facing name for the billing profile. Maximum length of 250 characters. */
  @SerializedName("display_name")
  String displayName;

  /** The ID of the billing profile object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * An internal key you can use to search for a particular billing profile. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.profile}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current status of the billing profile.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;
}

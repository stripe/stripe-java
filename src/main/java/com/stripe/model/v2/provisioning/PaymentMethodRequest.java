// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The result of an in-progress request for a customer to authorize a new payment method. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodRequest extends StripeObject {
  /** URL for the customer to complete payment method authorization. */
  @SerializedName("checkout_session_url")
  String checkoutSessionUrl;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.payment_method_request}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the payment method request.
   *
   * <p>One of {@code checkout_initiated}, or {@code complete}.
   */
  @SerializedName("status")
  String status;
}

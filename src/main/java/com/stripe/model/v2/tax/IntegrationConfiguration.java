// File generated from our OpenAPI spec
package com.stripe.model.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Per-account configuration controlling implicit behavior of Stripe Tax across supported
 * integration surfaces.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IntegrationConfiguration extends StripeObject {
  /** Configuration for Checkout Sessions automatic tax behavior. */
  @SerializedName("checkout_sessions")
  CheckoutSessions checkoutSessions;

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
   * <p>Equal to {@code v2.tax.integration_configuration}.
   */
  @SerializedName("object")
  String object;

  /** Configuration for Checkout Sessions automatic tax behavior. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CheckoutSessions extends StripeObject {
    /**
     * Controls the default value of automatic_tax[enabled] on new Checkout Sessions.
     *
     * <p>One of {@code disabled}, or {@code enabled_when_possible}.
     */
    @SerializedName("automatic_tax_default_value")
    String automaticTaxDefaultValue;
  }
}

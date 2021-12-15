// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentTypeSpecificPaymentMethodOptionsClient extends StripeObject {
  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * <p>Providing this parameter will <a
   * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a> to
   * the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any required
   * actions from the user are complete. If no Customer was provided, the payment method can still
   * be <a href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
   * after the transaction completes.
   *
   * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to dynamically
   * optimize your payment flow and comply with regional legislation and network rules, such as <a
   * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
   *
   * <p>One of {@code none}, {@code off_session}, or {@code on_session}.
   */
  @SerializedName("setup_future_usage")
  String setupFutureUsage;
}

// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeError extends StripeObject {
  /** For card errors, the ID of the failed charge. */
  @SerializedName("charge")
  String charge;

  /**
   * For some errors that could be handled programmatically, a short string indicating the <a
   * href="https://stripe.com/docs/error-codes">error code</a> reported.
   */
  @SerializedName("code")
  String code;

  /**
   * For card errors resulting from a card issuer decline, a short string indicating the <a
   * href="https://stripe.com/docs/declines#issuer-declines">card issuer's reason for the
   * decline</a> if they provide one.
   */
  @SerializedName("decline_code")
  String declineCode;

  /**
   * A URL to more information about the <a href="https://stripe.com/docs/error-codes">error
   * code</a> reported.
   */
  @SerializedName("doc_url")
  String docUrl;

  /**
   * A human-readable message providing more details about the error. For card errors, these
   * messages can be shown to your users.
   */
  @SerializedName("message")
  String message;

  /**
   * If the error is parameter-specific, the parameter related to the error. For example, you can
   * use this to display a message near the correct form field.
   */
  @SerializedName("param")
  String param;

  /**
   * A PaymentIntent guides you through the process of collecting a payment from your customer. We
   * recommend that you create exactly one PaymentIntent for each order or customer session in your
   * system. You can reference the PaymentIntent later to see the history of payment attempts for a
   * particular session.
   *
   * <p>A PaymentIntent transitions through <a
   * href="https://stripe.com/docs/payments/intents#intent-statuses">multiple statuses</a>
   * throughout its lifetime as it interfaces with Stripe.js to perform authentication flows and
   * ultimately creates at most one successful charge.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/payments/payment-intents">Payment Intents
   * API</a>.
   */
  @SerializedName("payment_intent")
  PaymentIntent paymentIntent;

  /**
   * PaymentMethod objects represent your customer's payment instruments. They can be used with <a
   * href="https://stripe.com/docs/payments/payment-intents">PaymentIntents</a> to collect payments
   * or saved to Customer objects to store instrument details for future payments.
   *
   * <p>Related guides: <a href="https://stripe.com/docs/payments/payment-methods">Payment
   * Methods</a> and <a href="https://stripe.com/docs/payments/more-payment-scenarios">More Payment
   * Scenarios</a>.
   */
  @SerializedName("payment_method")
  PaymentMethod paymentMethod;

  /**
   * If the error is specific to the type of payment method, the payment method type that had a
   * problem. This field is only populated for invoice-related errors.
   */
  @SerializedName("payment_method_type")
  String paymentMethodType;

  /**
   * A SetupIntent guides you through the process of setting up and saving a customer's payment
   * credentials for future payments. For example, you could use a SetupIntent to set up and save
   * your customer's card without immediately collecting a payment. Later, you can use <a
   * href="https://stripe.com/docs/api#payment_intents">PaymentIntents</a> to drive the payment
   * flow.
   *
   * <p>Create a SetupIntent as soon as you're ready to collect your customer's payment credentials.
   * Do not maintain long-lived, unconfirmed SetupIntents as they may no longer be valid. The
   * SetupIntent then transitions through multiple <a
   * href="https://stripe.com/docs/payments/intents#intent-statuses">statuses</a> as it guides you
   * through the setup process.
   *
   * <p>Successful SetupIntents result in payment credentials that are optimized for future
   * payments. For example, cardholders in <a
   * href="https://stripe.com/guides/strong-customer-authentication">certain regions</a> may need to
   * be run through <a href="https://stripe.com/docs/strong-customer-authentication">Strong Customer
   * Authentication</a> at the time of payment method collection in order to streamline later <a
   * href="https://stripe.com/docs/payments/setup-intents">off-session payments</a>. If the
   * SetupIntent is used with a <a
   * href="https://stripe.com/docs/api#setup_intent_object-customer">Customer</a>, upon success, it
   * will automatically attach the resulting payment method to that Customer. We recommend using
   * SetupIntents or <a
   * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>
   * on PaymentIntents to save payment methods in order to prevent saving invalid or unoptimized
   * payment methods.
   *
   * <p>By using SetupIntents, you ensure that your customers experience the minimum set of required
   * friction, even as regulations change over time.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/payments/setup-intents">Setup Intents
   * API</a>.
   */
  @SerializedName("setup_intent")
  SetupIntent setupIntent;

  @SerializedName("source")
  PaymentSource source;

  /**
   * The type of error returned. One of {@code api_error}, {@code card_error}, {@code
   * idempotency_error}, or {@code invalid_request_error}
   */
  @SerializedName("type")
  String type;
}

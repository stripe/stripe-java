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
   *
   * <p>One of {@code account_closed}, {@code account_country_invalid_address}, {@code
   * account_error_country_change_requires_additional_steps}, {@code account_information_mismatch},
   * {@code account_invalid}, {@code account_number_invalid}, {@code acss_debit_session_incomplete},
   * {@code alipay_upgrade_required}, {@code amount_too_large}, {@code amount_too_small}, {@code
   * api_key_expired}, {@code application_fees_not_allowed}, {@code authentication_required}, {@code
   * balance_insufficient}, {@code balance_invalid_parameter}, {@code
   * bank_account_bad_routing_numbers}, {@code bank_account_declined}, {@code bank_account_exists},
   * {@code bank_account_restricted}, {@code bank_account_unusable}, {@code
   * bank_account_unverified}, {@code bank_account_verification_failed}, {@code
   * billing_invalid_mandate}, {@code bitcoin_upgrade_required}, {@code
   * capture_charge_authorization_expired}, {@code capture_unauthorized_payment}, {@code
   * card_decline_rate_limit_exceeded}, {@code card_declined}, {@code
   * cardholder_phone_number_required}, {@code charge_already_captured}, {@code
   * charge_already_refunded}, {@code charge_disputed}, {@code charge_exceeds_source_limit}, {@code
   * charge_expired_for_capture}, {@code charge_invalid_parameter}, {@code charge_not_refundable},
   * {@code clearing_code_unsupported}, {@code country_code_invalid}, {@code country_unsupported},
   * {@code coupon_expired}, {@code customer_max_payment_methods}, {@code
   * customer_max_subscriptions}, {@code customer_tax_location_invalid}, {@code
   * debit_not_authorized}, {@code email_invalid}, {@code expired_card}, {@code
   * financial_connections_account_inactive}, {@code
   * financial_connections_no_successful_transaction_refresh}, {@code forwarding_api_inactive},
   * {@code forwarding_api_invalid_parameter}, {@code forwarding_api_upstream_connection_error},
   * {@code forwarding_api_upstream_connection_timeout}, {@code idempotency_key_in_use}, {@code
   * incorrect_address}, {@code incorrect_cvc}, {@code incorrect_number}, {@code incorrect_zip},
   * {@code instant_payouts_config_disabled}, {@code instant_payouts_currency_disabled}, {@code
   * instant_payouts_limit_exceeded}, {@code instant_payouts_unsupported}, {@code
   * insufficient_funds}, {@code intent_invalid_state}, {@code intent_verification_method_missing},
   * {@code invalid_card_type}, {@code invalid_characters}, {@code invalid_charge_amount}, {@code
   * invalid_cvc}, {@code invalid_expiry_month}, {@code invalid_expiry_year}, {@code
   * invalid_number}, {@code invalid_source_usage}, {@code invalid_tax_location}, {@code
   * invoice_no_customer_line_items}, {@code invoice_no_payment_method_types}, {@code
   * invoice_no_subscription_line_items}, {@code invoice_not_editable}, {@code
   * invoice_on_behalf_of_not_editable}, {@code invoice_payment_intent_requires_action}, {@code
   * invoice_upcoming_none}, {@code livemode_mismatch}, {@code lock_timeout}, {@code missing},
   * {@code no_account}, {@code not_allowed_on_standard_account}, {@code out_of_inventory}, {@code
   * ownership_declaration_not_allowed}, {@code parameter_invalid_empty}, {@code
   * parameter_invalid_integer}, {@code parameter_invalid_string_blank}, {@code
   * parameter_invalid_string_empty}, {@code parameter_missing}, {@code parameter_unknown}, {@code
   * parameters_exclusive}, {@code payment_intent_action_required}, {@code
   * payment_intent_authentication_failure}, {@code payment_intent_incompatible_payment_method},
   * {@code payment_intent_invalid_parameter}, {@code
   * payment_intent_konbini_rejected_confirmation_number}, {@code payment_intent_mandate_invalid},
   * {@code payment_intent_payment_attempt_expired}, {@code payment_intent_payment_attempt_failed},
   * {@code payment_intent_unexpected_state}, {@code payment_method_bank_account_already_verified},
   * {@code payment_method_bank_account_blocked}, {@code
   * payment_method_billing_details_address_missing}, {@code payment_method_configuration_failures},
   * {@code payment_method_currency_mismatch}, {@code payment_method_customer_decline}, {@code
   * payment_method_invalid_parameter}, {@code payment_method_invalid_parameter_testmode}, {@code
   * payment_method_microdeposit_failed}, {@code
   * payment_method_microdeposit_verification_amounts_invalid}, {@code
   * payment_method_microdeposit_verification_amounts_mismatch}, {@code
   * payment_method_microdeposit_verification_attempts_exceeded}, {@code
   * payment_method_microdeposit_verification_descriptor_code_mismatch}, {@code
   * payment_method_microdeposit_verification_timeout}, {@code payment_method_not_available}, {@code
   * payment_method_provider_decline}, {@code payment_method_provider_timeout}, {@code
   * payment_method_unactivated}, {@code payment_method_unexpected_state}, {@code
   * payment_method_unsupported_type}, {@code payout_reconciliation_not_ready}, {@code
   * payouts_limit_exceeded}, {@code payouts_not_allowed}, {@code platform_account_required}, {@code
   * platform_api_key_expired}, {@code postal_code_invalid}, {@code processing_error}, {@code
   * product_inactive}, {@code progressive_onboarding_limit_exceeded}, {@code rate_limit}, {@code
   * refer_to_customer}, {@code refund_disputed_payment}, {@code resource_already_exists}, {@code
   * resource_missing}, {@code return_intent_already_processed}, {@code routing_number_invalid},
   * {@code secret_key_required}, {@code sepa_unsupported_account}, {@code setup_attempt_failed},
   * {@code setup_intent_authentication_failure}, {@code setup_intent_invalid_parameter}, {@code
   * setup_intent_mandate_invalid}, {@code setup_intent_setup_attempt_expired}, {@code
   * setup_intent_unexpected_state}, {@code shipping_calculation_failed}, {@code sku_inactive},
   * {@code state_unsupported}, {@code status_transition_invalid}, {@code stripe_tax_inactive},
   * {@code tax_id_invalid}, {@code taxes_calculation_failed}, {@code
   * terminal_location_country_unsupported}, {@code terminal_reader_busy}, {@code
   * terminal_reader_hardware_fault}, {@code terminal_reader_offline}, {@code
   * terminal_reader_timeout}, {@code testmode_charges_only}, {@code tls_version_unsupported},
   * {@code token_already_used}, {@code token_card_network_invalid}, {@code token_in_use}, {@code
   * transfer_source_balance_parameters_mismatch}, {@code transfers_not_allowed}, or {@code
   * url_invalid}.
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
   * API</a>
   */
  @SerializedName("payment_intent")
  PaymentIntent paymentIntent;

  /**
   * PaymentMethod objects represent your customer's payment instruments. You can use them with <a
   * href="https://stripe.com/docs/payments/payment-intents">PaymentIntents</a> to collect payments
   * or save them to Customer objects to store instrument details for future payments.
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

  /** A URL to the request log entry in your dashboard. */
  @SerializedName("request_log_url")
  String requestLogUrl;

  /**
   * A SetupIntent guides you through the process of setting up and saving a customer's payment
   * credentials for future payments. For example, you can use a SetupIntent to set up and save your
   * customer's card without immediately collecting a payment. Later, you can use <a
   * href="https://stripe.com/docs/api#payment_intents">PaymentIntents</a> to drive the payment
   * flow.
   *
   * <p>Create a SetupIntent when you're ready to collect your customer's payment credentials. Don't
   * maintain long-lived, unconfirmed SetupIntents because they might not be valid. The SetupIntent
   * transitions through multiple <a
   * href="https://stripe.com/docs/payments/intents#intent-statuses">statuses</a> as it guides you
   * through the setup process.
   *
   * <p>Successful SetupIntents result in payment credentials that are optimized for future
   * payments. For example, cardholders in <a
   * href="https://stripe.com/guides/strong-customer-authentication">certain regions</a> might need
   * to be run through <a href="https://stripe.com/docs/strong-customer-authentication">Strong
   * Customer Authentication</a> during payment method collection to streamline later <a
   * href="https://stripe.com/docs/payments/setup-intents">off-session payments</a>. If you use the
   * SetupIntent with a <a
   * href="https://stripe.com/docs/api#setup_intent_object-customer">Customer</a>, it automatically
   * attaches the resulting payment method to that Customer after successful setup. We recommend
   * using SetupIntents or <a
   * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>
   * on PaymentIntents to save payment methods to prevent saving invalid or unoptimized payment
   * methods.
   *
   * <p>By using SetupIntents, you can reduce friction for your customers, even as regulations
   * change over time.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/payments/setup-intents">Setup Intents
   * API</a>
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

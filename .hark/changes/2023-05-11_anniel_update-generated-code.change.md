---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1561
is_stripe_api_change: true
released_in_version: 22.20.0-beta.1
---

* Add support for `payer_email`, `payer_name`, and `seller_protection` on `Charge.payment_method_details.paypal`
* Add support for `capture_method`, `preferred_locale`, `reference_id`, and `setup_future_usage` on `CheckoutSessionCreateParams.payment_method_options.paypal`
* Add support for `reference` on `CheckoutSessionCreateParams.payment_method_options.paypal`, `Order.payment.settings.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntent.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
* Add support for `risk_correlation_id` on `CheckoutSessionCreateParams.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
* Remove support for `billing_agreement_id` and `currency` on `CheckoutSessionCreateParams.payment_method_options.paypal`
* Add support for `fingerprint`, `payer_id`, and `verified_email` on `Mandate.payment_method_details.paypal` and `PaymentMethod.paypal`
* Add support for `taxability_reason` and `taxable_amount` on `Order.shipping_cost.taxes[]`, `Order.total_details.breakdown.taxes[]`, and `QuotePhase.total_details.breakdown.taxes[]`
* Add support for `head_office` on `Tax.Settings` and `TaxSettingsUpdateParams`

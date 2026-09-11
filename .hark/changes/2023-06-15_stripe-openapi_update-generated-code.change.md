---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1587
is_stripe_api_change: true
released_in_version: 22.24.0-beta.2
---

* Add support for `payment_details` on `ChargeCaptureParams`, `ChargeUpdateParams`, `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
* Add support for `statement_details` on `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`

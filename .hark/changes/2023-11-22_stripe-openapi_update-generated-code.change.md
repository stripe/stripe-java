---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1693
is_stripe_api_change: true
released_in_version: 24.5.0
---

* Add support for `electronic_commerce_indicator` and `transaction_id` on `Charge.payment_method_details.card.three_d_secure` and `SetupAttempt.payment_method_details.card.three_d_secure`
* Add support for `exemption_indicator_applied` and `exemption_indicator` on `Charge.payment_method_details.card.three_d_secure`
* Add support for `three_d_secure` on `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, `SetupIntentConfirmParams.payment_method_options.card`, `SetupIntentCreateParams.payment_method_options.card`, and `SetupIntentUpdateParams.payment_method_options.card`

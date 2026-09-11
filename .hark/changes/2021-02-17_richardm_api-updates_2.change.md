---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1185
is_stripe_api_change: true
released_in_version: 20.39.0
---

* Add support for `afterpay_clearpay` on `PaymentMethod`, `PaymentIntent.payment_method_data`, and `Charge.payment_method_details`.
* Add support for `afterpay_clearpay` as a payment method type on `PaymentMethod.type`, `PaymentIntent.PaymentMethodData.type`, and `Checkout.SessionCreateParams.payment_method_types`.
* Add support for `adjustable_quantity` on `SessionCreateParams.LineItem`
* Add support for `bacs_debit`, `au_becs_debit` and `sepa_debit` on `SetupAttempt.payment_method_details`

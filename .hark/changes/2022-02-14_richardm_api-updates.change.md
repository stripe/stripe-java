---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1312
is_stripe_api_change: true
released_in_version: 20.100.0
---

* Add support for `verify_microdeposits` method on resources `PaymentIntent` and `SetupIntent`
* Add support for new value `grabpay` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]
`

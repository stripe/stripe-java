---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1288
is_stripe_api_change: true
released_in_version: 20.90.0
---

* Add support for `interac_present` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
* Add support for new value `jct` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

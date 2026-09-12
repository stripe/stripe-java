---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1301
is_stripe_api_change: true
released_in_version: 20.95.0
---

* Add support for `customer_creation` on `checkout.SessionCreateParams` and `Checkout.Session`
* Add support for `fpx` and `grabpay` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
* Add support for `PaidOutOfBand` on `Invoice`

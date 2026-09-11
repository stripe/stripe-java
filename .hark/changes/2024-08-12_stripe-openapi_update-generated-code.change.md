---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1844
is_breaking: true
is_stripe_api_change: true
released_in_version: 26.8.0-beta.1
---

* Add support for `capital_financing_application` and `capital_financing` on `AccountSession.components`
* Add support for `payto` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `payto` on enum `checkout.SessionCreateParams.payment_method_types[]`
* Add support for new value `custom` on enum `checkout.SessionCreateParams.ui_mode`
* ⚠️  Remove support for `risk_correlation_id` on `PaymentIntent.payment_method_options.rechnung`, `PaymentIntentConfirmParams.payment_method_options.rechnung`, `PaymentIntentCreateParams.payment_method_options.rechnung`, and `PaymentIntentUpdateParams.payment_method_options.rechnung`
* Add support for new value `payto` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`

---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1406
is_stripe_api_change: true
released_in_version: 20.136.0
---

* Add support for `customer_balance` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `customer_balance` on enum `checkout.SessionCreateParams.payment_method_types[]`
* Add support for new values `en-CA` and `fr-CA` on enums `OrderCreateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `OrderUpdateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`

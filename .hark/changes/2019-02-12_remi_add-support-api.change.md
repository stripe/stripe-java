---
title: Add support for API version `2019-02-11` with changes to Payment Intents
pr_link: https://github.com/stripe/stripe-java/pull/670
released_in_version: 7.20.0
---

* `PaymentIntentSourceAction`, `PaymentIntentSourceActionValueAuthorizeWithUrl` and `next_source_action` are now depreacated. Use `PaymentIntent.NextAction`, `PaymentIntent.NextActionRedirectToUrl` and `next_action` instead.
* `allowed_source_types` is now depreacated. Use `payment_method_types` instead.

---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/1148
is_stripe_api_change: true
released_in_version: 20.26.0
---

* Add support for `last_finalization_error` on `Invoice`
* Add support for deserializing Issuing `Dispute` as a `source` on `BalanceTransaction`
* Add support for `payment_method_type` on `StripeError` used by other API resources

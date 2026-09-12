---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/967
is_stripe_api_change: true
released_in_version: 17.10.0
---

* Add `fpx` as a valid `source_type` on `Balance`, `Payout` and `Transfer`
* Add `fpx` support on Checkout `Session`
* Fields inside `verification_data` on Issuing `Authorization` are now enums
* Support updating `payment_method_options` on `PaymentIntent` and `SetupIntent`

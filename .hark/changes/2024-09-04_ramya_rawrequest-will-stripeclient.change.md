---
title: RawRequest will be on StripeClient only
pr_link: https://github.com/stripe/stripe-java/pull/1861
released_in_version: 26.11.0-beta.1
---

* Remove the deprecated method `Stripe.rawRequest()` and `Stripe.deserialize()` in favor of `StripeClient.rawRequest()` and `StripeClient.deserialize()`

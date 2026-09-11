---
title: Add webhook parsing method on StripeClient
pr_link: https://github.com/stripe/stripe-java/pull/1724
released_in_version: 24.12.0
---

* Add support for `constructEvent()` instance method on `StripeClient` that parses Webhook events and uses the settings inherited from the StripeClient instance to make further requests.

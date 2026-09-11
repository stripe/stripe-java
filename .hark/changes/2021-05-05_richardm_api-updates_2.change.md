---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1201
is_stripe_api_change: true
released_in_version: 20.48.0
---

* Add support for `card_present` on `PaymentIntent.payment_method_options`
* Add support for `default_incomplete` as a `payment_behavior` on `SubscriptionItemCreateParams`, `SubscriptionUpdateParams`, and `SubscriptionCreateParams`.
* Add support for `single_member_llc` as a `structure` on `AccountCreateParams.company` and `AccountUpdateParams.company`.

---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1483
is_stripe_api_change: true
released_in_version: 22.2.0
---

* Add support for `india_international_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `invoice_creation` on `Checkout.Session` and `checkout.SessionCreateParams`
* Add support for `invoice` on `Checkout.Session`
* Add support for `metadata` on `SubscriptionSchedule.phases[].items[]`, `SubscriptionScheduleCreateParams.phases[].items[]`, and `SubscriptionScheduleUpdateParams.phases[].items[]`

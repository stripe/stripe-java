---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/1033
is_stripe_api_change: true
released_in_version: 19.13.0
---

* Add `anticipation_repayment` as a `type` on `BalanceTransaction`
* Add `interac_present` as a `type` on `PaymentMethod`
* Add `payment_method_details[interac_present]` on `Charge`
* Add `transfer_data` on `SubscriptionSchedule`

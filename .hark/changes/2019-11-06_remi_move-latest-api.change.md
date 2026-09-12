---
title: Move to the latest API version and add new changes
pr_url: https://github.com/stripe/stripe-java/pull/886
released_in_version: 15.0.0
---

* Move to API version `2019-11-05`
* Add `default_settings` on `SubscritionSchedule`
* Remove `billing_thresholds`, `collection_method`, `default_payment_method`, `default_source` and `invoice_settings` from `SubscriptionSchedule
* Add `charge` filter when listing `Dispute`

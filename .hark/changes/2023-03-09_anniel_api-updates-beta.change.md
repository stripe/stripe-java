---
title: API Updates for beta branch
pr_link: https://github.com/stripe/stripe-java/pull/1524
is_stripe_api_change: true
released_in_version: 22.13.0-beta.1
---

* Updated stable APIs to the latest version
* Remove support for `list_transactions` method on resource `Tax.Transaction`
* Add support for `amendment_start` and `timestamp` on `SubscriptionScheduleAmendParams.prebilling[].bill_from`
* Change type of `SubscriptionScheduleAmendParams.prebilling[].bill_from.type` from `literal('now')` to `enum('amendment_start'|'now'|'timestamp')`
* Add support for `tax_behavior` on `Tax.Settings.defaults` and `TaxSettingsUpdateParams.defaults`

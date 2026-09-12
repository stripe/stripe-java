---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/794
released_in_version: 10.2.0
---

* Add `collection_method` to `Invoice`, `Subscription` and `SubscriptionSchedule`
* Add `unified_propration` to `InvoiceLineItem`
* Support unsetting `dob` on an `Account`
* Removed `native_url` from WeChat `Source`. While technically breaking, this field has never been used

---
title: "Multiple API changes:"
pr_link: https://github.com/stripe/stripe-java/pull/977
released_in_version: 18.0.0
---

* Pin to API version `2020-03-02`
* Remove `uob_regional` as a value on `bank` for FPX as this is deprecated and was never used
* Add support for `next_invoice_sequence` on `Customer`
* Add support for `proration_behavior` on `SubscriptionItem` delete

---
title: Upgrade to new API version [`2019-10-17`](https://docs.stripe.com/changelog/2019-10-17)
pr_url: https://github.com/stripe/stripe-java/pull/863
released_in_version: 14.0.0
---

* Pin to API version `2019-10-17`
* Remove `account_balance` from Customer model and parameter classes
* Remove `billing` from Invoice, Subscription and Subscription Schedule model and parameter classes
* Remove `start` from Subscription model
* Remove `renewal_behavior` from Subscription Schedule parameter classes
* **Note:** This release was missing some breaking changes. Please use 14.0.1 instead.

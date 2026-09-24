---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/911
is_stripe_api_change: true
released_in_version: 16.0.0
---

* Pin to API version `2019-12-03`
* Remove `tax_info` and `tax_info_verification` on `Customer`
* Remove `cardholder` on Issuing `Card` update
* Remove `invoice_customer_balance_settings` from `Subscription`

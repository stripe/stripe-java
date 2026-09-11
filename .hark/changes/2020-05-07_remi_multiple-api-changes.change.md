---
title: Multiple API changes
pr_link: https://github.com/stripe/stripe-java/pull/1025
is_stripe_api_change: true
released_in_version: 19.9.0
---

* Remove parameters in `price_data[recurring]` across APIs as they were never supported
* Move `payment_method_details[card][three_d_secure]` to a list of enum values on `Charge`
* Add support for for `business_profile[support_address]` on `Account` create and update

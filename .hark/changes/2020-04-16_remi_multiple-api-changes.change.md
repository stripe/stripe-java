---
title: Multiple API changes
pr_link: https://github.com/stripe/stripe-java/pull/1010
is_stripe_api_change: true
released_in_version: 19.1.0
---

* Add `institution_number` and `transit_number` in `payment_method_details[acss]` on `Charge`
* Add `cvc` and `number` as properties that can be included when retrieving an Issuing `Card`

---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/1034
is_stripe_api_change: true
released_in_version: 19.14.0
---

* Add support for `ae_trn`, `cl_tin` and `sa_vat` as `type` on `TaxId`
* Add `result` and `result_reason` inside `payment_method_details[card][three_d_secure]` on `Charge`

---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/1002
is_stripe_api_change: true
released_in_version: 18.14.0
---

* Make `payment_intent` expandable on `Charge`
* Add support for `sg_gst` as a value for `type` on `TaxId` and related APIs
* Add `cancellation_reason` and new enum values for `replacement_reason` on Issuing `Card`

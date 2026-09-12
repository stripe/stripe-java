---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/773
is_stripe_api_change: true
released_in_version: 9.10.0
---

* Add support for `extraParams` in all sub-classes of ApiRequestParams their nested classes
* Add support for webhook event `payment_method.updated`
* Add support for `payment_intent` filter when listing `Charge`
* Add support for `legacy_payments` enum `RequestedCapability` in `AccountCreateParams` and `AccountUpdateParams`

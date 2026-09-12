---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1740
is_breaking: true
is_stripe_api_change: true
released_in_version: 24.14.0
---

* Add support for `swish` payment method throughout the API
* Add support for `relationship` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, and `TokenCreateParams.account.individual`
* Add support for `jurisdiction_level` on `TaxRate`
* ⚠️  Fix broken reference to `com.stripe.model.Discount` from `checkout.Session.TotalDetails.Breakdown.Discount` (this represents a bugfix as this class would never have worked, but might be a breaking type change)

---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1778
is_stripe_api_change: true
released_in_version: 24.24.0
---

* Add support for new resources `Entitlements.ActiveEntitlement` and `Entitlements.Feature`
* Add support for `list` and `retrieve` methods on resource `ActiveEntitlement`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `Feature`
* Add support for `controller` on `AccountCreateParams`
* Add support for `fees`, `losses`, `requirement_collection`, and `stripe_dashboard` on `Account.controller`
* Add support for `event_name` on `Billing.MeterEventAdjustment` and `billing.MeterEventAdjustmentCreateParams`
* Add support for `cancel` and `type` on `Billing.MeterEventAdjustment`

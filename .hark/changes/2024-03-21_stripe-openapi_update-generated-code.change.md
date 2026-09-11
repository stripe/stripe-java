---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1766
is_stripe_api_change: true
released_in_version: 24.22.0-beta.1
---

* Add support for new resources `Entitlements.ActiveEntitlementSummary` and `Entitlements.ActiveEntitlement`
* Add support for `list` method on resource `ActiveEntitlement`
* Add support for `mobilepay` on `ConfirmationToken.payment_method_preview` and `ConfirmationTokenCreateParams.payment_method_data`
* Add support for new value `mobilepay` on enum `ConfirmationTokenCreateParams.payment_method_data.type`
* Add support for `use_stripe_sdk` on `ConfirmationToken`
* Remove support for `payment_method` on `ConfirmationToken`
* Add support for `metadata` on `Entitlements.Feature` and `entitlements.FeatureCreateParams`
* Add support for `active` on `Entitlements.Feature`
* Add support for new value `entitlements.active_entitlement_summary.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* Remove support for value `customer.entitlement_summary.updated` from enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

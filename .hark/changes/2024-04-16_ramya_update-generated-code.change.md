---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1780
is_stripe_api_change: true
released_in_version: 25.2.0
---

* Add support for new resource `Entitlements.ActiveEntitlementSummary`
* Add support for `balances` and `payouts_list` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Change `billing.MeterEventCreateParams.timestamp` to be optional
* Remove support for `config` on `Forwarding.Request` and `forwarding.RequestCreateParams`. This field is no longer used by the Forwarding Request API.
* Add support for `capture_method` on `PaymentIntent.payment_method_options.revolut_pay`, `PaymentIntentConfirmParams.payment_method_options.revolut_pay`, `PaymentIntentCreateParams.payment_method_options.revolut_pay`, and `PaymentIntentUpdateParams.payment_method_options.revolut_pay`
* Add support for `swish` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for new value `entitlements.active_entitlement_summary.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

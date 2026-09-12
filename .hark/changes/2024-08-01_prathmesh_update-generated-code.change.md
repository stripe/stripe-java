---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1841
is_breaking: true
is_stripe_api_change: true
released_in_version: 26.6.0
---

* Add support for new resources `Billing.AlertTriggered` and `Billing.Alert`
* ⚠️ Remove support for `authorization_code` on `Charge.payment_method_details.card`. This was accidentally released last week.
* Add support for new value `billing.alert.triggered` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

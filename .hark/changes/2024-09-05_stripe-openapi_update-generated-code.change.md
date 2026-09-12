---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1859
is_stripe_api_change: true
released_in_version: 26.11.0-beta.1
---

* Add support for `recipients` on `AccountSessionCreateParams.components`
* Add support for new value `mb_way` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
* Add support for new value `billing.meter_error_report.triggered` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1836
is_stripe_api_change: true
released_in_version: 26.4.0
---

* Add support for `customer` on `ConfirmationToken.payment_method_preview`
* Add support for new value `multibanco` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
* Add support for new value `stripe_s700` on enum `terminal.ReaderListParams.device_type`
* Add support for new value `issuing_dispute.funds_rescinded` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

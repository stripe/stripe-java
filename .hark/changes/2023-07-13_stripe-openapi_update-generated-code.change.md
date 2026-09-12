---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1606
is_stripe_api_change: true
released_in_version: 22.27.0
---

* Add support for new resource `Tax.Settings`
* Add support for `retrieve` and `update` methods on resource `Settings`
* Add support for `order_id` on `Charge.payment_method_details.afterpay_clearpay`
* Add support for `allow_redirects` on `PaymentIntent.automatic_payment_methods`, `PaymentIntentCreateParams.automatic_payment_methods`, `SetupIntent.automatic_payment_methods`, and `SetupIntentCreateParams.automatic_payment_methods`
* Add support for `product` on `Tax.TransactionLineItem`
* Add support for new value `tax.settings.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

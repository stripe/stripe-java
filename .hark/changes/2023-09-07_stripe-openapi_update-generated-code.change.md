---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1643
is_stripe_api_change: true
released_in_version: 23.4.0
---

* Add support for new resource `PaymentMethodDomain`
* Add support for `create`, `list`, `retrieve`, `update`, and `validate` methods on resource `PaymentMethodDomain`
* Add support for new value `n26` on enums `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for `features` on `ProductCreateParams`, `ProductUpdateParams`, and `Product`
* Remove support for value `invoiceitem.updated` from enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

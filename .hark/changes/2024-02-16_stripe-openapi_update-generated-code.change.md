---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1746
is_stripe_api_change: true
released_in_version: 24.17.0-beta.1
---

* Add support for `payto` and `twint` payment methods across the API
* Add support for `decrement_authorization` method on resource `PaymentIntent`
* Add support for `decremental_authorization` on `Charge.payment_method_details.card`
* Add support for `display_brand` on `ConfirmationToken.payment_method_preview.card`
* Add support for new value `no_voec` on enums `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for `request_decremental_authorization` on `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`

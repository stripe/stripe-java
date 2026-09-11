---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1225
is_stripe_api_change: true
released_in_version: 20.59.0
---

* Added support for `boleto` on `PaymentMethodCreateParams`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `Charge.payment_method_details` and `PaymentMethod`
* `PaymentMethodListParams.type`, `PaymentMethodCreateParams.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`  added new enum members: `boleto`
* Added support for `boleto_display_details` on `PaymentIntent.next_action`
* `TaxIdCreateParams.type`, `InvoiceLineItemListUpcomingParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, and `CustomerCreateParams.tax_id_data[].type`, added new enum members: `il_vat`.

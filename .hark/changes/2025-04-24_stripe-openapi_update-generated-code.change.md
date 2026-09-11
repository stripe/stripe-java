---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1986
is_stripe_api_change: true
released_in_version: 29.1.0
---

This release changes the pinned API version to `2025-04-30.basil`.

* Add support for `minorityOwnedBusinessDesignation` on `Account.business_profile`, `AccountCreateParams.business_profile`, and `AccountUpdateParams.business_profile`
* Add support for `registrationDate` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Add support for `usCfpbData` on `AccountCreateParams`, `AccountPersonCreateParams`, `AccountPersonUpdateParams`, `AccountUpdateParams`, `Person`, and `TokenCreateParams.person`
* Add support for `taxId` on `Charge.billing_details`, `ConfirmationToken.payment_method_preview.billing_details`, `ConfirmationTokenCreateParams.payment_method_data.billing_details`, `PaymentIntentConfirmParams.payment_method_data.billing_details`, `PaymentIntentCreateParams.payment_method_data.billing_details`, `PaymentIntentUpdateParams.payment_method_data.billing_details`, `PaymentMethod.billing_details`, `PaymentMethodCreateParams.billing_details`, `PaymentMethodUpdateParams.billing_details`, `SetupIntentConfirmParams.payment_method_data.billing_details`, `SetupIntentCreateParams.payment_method_data.billing_details`, `SetupIntentUpdateParams.payment_method_data.billing_details`, `testhelpers.ConfirmationTokenCreateParams.payment_method_data.billing_details`, and `treasury.OutboundPaymentCreateParams.destination_payment_method_data.billing_details`
* Add support for `walletOptions` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for `provider` on `Invoice.automatic_tax`, `Quote.automatic_tax`, and `checkout.Session.automatic_tax`
* Add support for `paymentMethodOptions` on `ConfirmationTokenCreateParams` and `testhelpers.ConfirmationTokenCreateParams`
* Add support for `installments` on `ConfirmationToken.payment_method_options.card`
* Add support for new values `aw_tin`, `az_tin`, `bd_bin`, `bf_ifu`, `bj_ifu`, `cm_niu`, `cv_nif`, `et_tin`, `kg_tin`, and `la_tin` on enums `CustomerCreateParams.tax_id_data[].type`, `CustomerCreateParams.type`, `CustomerTaxIdCreateParams.type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `context` on `Event`
* Add support for new value `affirm` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `billie` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
* Add support for `pix` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `klarna` on `PaymentMethodDomain`
* Add support for `pendingReason` on `Refund`
* Add support for `aw`, `az`, `bd`, `bf`, `bj`, `cm`, `cv`, `et`, `in`, `kg`, `la`, and `ph` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for new value `2025-04-30.basil` on enums `WebhookEndpointCreateParams.apiVersion`

---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1834
is_stripe_api_change: true
released_in_version: 26.6.0-beta.1
---

⚠️ `InvoicePayment.charge` and `InvoicePayment.paymentIntent` were removed in favor of `InvoicePayment.Payment`, which encapsulates both. The `Charge` and `PaymentIntent` fields are now found at `InvoicePayment.Payment.Charge` `InvoicePaymentPayment.paymentIntent`

* Add support for new resources `Billing.AlertTriggered`, `Billing.Alert`, and `Tax.Association`
* Add support for `activate`, `archive`, `create`, `deactivate`, `list`, and `retrieve` methods on resource `Alert`
* Add support for `find` method on resource `Association`
* Add support for `capital` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* Add support for `async_workflows` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentDecrementAuthorizationParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
* Add support for `payto` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `display_name` on `Treasury.FinancialAccount`, `treasury.FinancialAccountCreateParams`, and `treasury.FinancialAccountUpdateParams`

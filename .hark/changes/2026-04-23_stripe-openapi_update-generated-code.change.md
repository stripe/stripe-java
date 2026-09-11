---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/2203
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.1.0
---

* Add support for `balanceReport` and `payoutReconciliationReport` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `appDistribution` and `sunbitPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `sunbit` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `location` and `reader` on `Charge.payment_method_details.klarna`, `PaymentAttemptRecord.payment_method_details.klarna`, and `PaymentRecord.payment_method_details.klarna`
* Add support for `mandate` on `Charge.payment_method_details.pix`, `PaymentAttemptRecord.payment_method_details.pix`, and `PaymentRecord.payment_method_details.pix`
* Add support for `managedPayments` on `PaymentIntent`, `PaymentLinkCreateParams`, `PaymentLink`, `SetupIntent`, `Subscription`, `checkout.SessionCreateParams`, and `checkout.Session`
* Add support for new value `sunbit` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, `SetupIntentUpdateParams.excludedPaymentMethodTypes`, and `checkout.SessionCreateParams.excludedPaymentMethodTypes`
* Add support for `mandateOptions` on `PaymentIntent.payment_method_options.pix`, `PaymentIntentConfirmParams.payment_method_options.pix`, `PaymentIntentCreateParams.payment_method_options.pix`, `PaymentIntentUpdateParams.payment_method_options.pix`, `checkout.Session.payment_method_options.pix`, and `checkout.SessionCreateParams.payment_method_options.pix`
* Change type of `PaymentIntentConfirmParams.payment_method_options.pix.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.pix.setupFutureUsage`, `PaymentIntentUpdateParams.payment_method_options.pix.setupFutureUsage`, and `checkout.SessionCreateParams.payment_method_options.pix.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for new value `sunbit` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* ⚠️ Change type of `PaymentIntent.payment_method_options.pix.setupFutureUsage` and `checkout.Session.payment_method_options.pix.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for new value `sunbit` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new values `fo_vat`, `gi_tin`, `it_cf`, and `py_ruc` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for new value `sunbit` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `pix` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `Mandate.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for `upi` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for new values `pix` and `upi` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `cardPresence` on `issuing.Authorization`
* Add support for `allowedCardPresences` and `blockedCardPresences` on `issuing.Card.spending_controls`, `issuing.CardCreateParams.spending_controls`, `issuing.CardUpdateParams.spending_controls`, `issuing.Cardholder.spending_controls`, `issuing.CardholderCreateParams.spending_controls`, and `issuing.CardholderUpdateParams.spending_controls`
* Add support for `amount` and `currency` on `Mandate.multi_use`
* Add support for `amountToConfirm` on `PaymentIntentConfirmParams`
* Add support for `klarnaDisplayQrCode` on `PaymentIntent.next_action`
* Add support for new value `sunbit` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for new value `account` on enum `radar.ValueListCreateParams.itemType`
* Add support for `moto` on `SetupAttempt.payment_method_details.card`
* Add support for `pixDisplayQrCode` on `SetupIntent.next_action`
* Add support for new value `2026-04-22.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`

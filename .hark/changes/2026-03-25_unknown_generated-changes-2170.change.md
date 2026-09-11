---
title: "Generated changes from [#2170](https://github.com/stripe/stripe-java/pull/2170), [#2193](https://github.com/stripe/stripe-java/pull/2193), [#2191](https://github.com/stripe/stripe-java/pull/2191)"
is_breaking: true
is_stripe_api_change: true
section: ⚠️ Breaking changes due to changes in the Stripe API
released_in_version: 32.0.0
---

* Add support for `upiPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `upi` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `Mandate.payment_method_details`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_options`, `checkout.Session.payment_method_options`, and `checkout.SessionCreateParams.payment_method_options`
* Add support for `integrationIdentifier` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for new value `upi` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, `SetupIntentUpdateParams.excludedPaymentMethodTypes`, and `checkout.SessionCreateParams.excludedPaymentMethodTypes`
* Add support for `crypto` on `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `upi` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for `pendingInvoiceItemInterval` on `checkout.SessionCreateParams.subscription_data`
* Add support for new values `elements`, `embedded_page`, `form`, and `hosted_page` on enum `checkout.SessionCreateParams.uiMode`
* Add support for new value `upi` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for `metadata` on `CreditNoteCreateParams.lines[]`, `CreditNoteLineItem`, `CreditNotePreviewLinesParams.lines[]`, and `CreditNotePreviewParams.lines[]`
* Add support for new value `upi` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `quantityDecimal` on `InvoiceAddLinesParams.lines[]`, `InvoiceCreatePreviewParams.invoice_items[]`, `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, `InvoiceItem`, `InvoiceLineItemUpdateParams`, `InvoiceLineItem`, and `InvoiceUpdateLinesParams.lines[]`
* ⚠️ Add support for `level` on `issuing.AuthorizationCreateParams.risk_assessment.card_testing_risk` and `issuing.AuthorizationCreateParams.risk_assessment.merchant_dispute_risk`
* ⚠️ Remove support for `riskLevel` on `issuing.AuthorizationCreateParams.risk_assessment.card_testing_risk` and `issuing.AuthorizationCreateParams.risk_assessment.merchant_dispute_risk`
* Add support for `lifecycleControls` on `issuing.CardCreateParams` and `issuing.Card`
* Add support for `cryptogram`, `electronicCommerceIndicator`, `exemptionIndicatorApplied`, and `exemptionIndicator` on `PaymentAttemptRecord.payment_method_details.card.three_d_secure` and `PaymentRecord.payment_method_details.card.three_d_secure`
* Add support for `upiHandleRedirectOrDisplayQrCode` on `PaymentIntent.next_action` and `SetupIntent.next_action`
* Add support for new value `upi` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for `recommendedAction` and `signals` on `radar.PaymentEvaluation`
* ⚠️ Remove support for `insights` on `radar.PaymentEvaluation`
* Add support for new value `crypto_fingerprint` on enum `radar.ValueListCreateParams.itemType`
* Add support for new value `2026-03-25.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`
* ⚠️ Change type of `v2.core.EventDestinationCreateParams.eventsFrom` from `enum('other_accounts'|'self')` to `string`

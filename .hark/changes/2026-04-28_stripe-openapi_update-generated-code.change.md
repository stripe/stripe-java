---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2211
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.2.0-alpha.2
---

* Add support for new resource `v2.data.analytics.MetricQueryResult`
* Add support for `create`, `retrieve`, and `revoke` methods on resource `sharedpayment.IssuedToken`
* Add support for `create` method on resource `v2.data.analytics.MetricQueryResult`
* Add support for `balanceReport` and `payoutReconciliationReport` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `appDistribution` and `sunbitPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `sunbit` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `last4` on `Charge.payment_method_details.gift_card`, `PaymentAttemptRecord.payment_method_details.gift_card`, and `PaymentRecord.payment_method_details.gift_card`
* Add support for `location` and `reader` on `Charge.payment_method_details.klarna`, `PaymentAttemptRecord.payment_method_details.klarna`, and `PaymentRecord.payment_method_details.klarna`
* Add support for new value `sunbit` on enum `checkout.SessionCreateParams.excludedPaymentMethodTypes`
* Add support for `blik` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options`, and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `sunbit` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for `sharedPaymentGrantedToken` on `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new value `sunbit` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* ⚠️ Change type of `CreditNote.total_taxes[].tax_rate_details.taxRate`, `CreditNoteLineItem.taxes[].tax_rate_details.taxRate`, `Invoice.total_taxes[].tax_rate_details.taxRate`, `InvoiceLineItem.taxes[].tax_rate_details.taxRate`, and `QuotePreviewInvoice.total_taxes[].tax_rate_details.taxRate` from `string` to `expandable($TaxRate)`
* Add support for new values `fo_vat`, `gi_tin`, `it_cf`, and `py_ruc` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for new value `sunbit` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `buyerConsents` on `delegatedcheckout.RequestedSessionConfirmParams`
* Add support for `consents` on `delegatedcheckout.RequestedSession.buyer_consents.marketing`
* Add support for new value `blik` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `paymentFacilitatorId` and `subMerchantId` on `issuing.AuthorizationCreateParams.merchant_data`, `issuing.TransactionCreateForceCaptureParams.merchant_data`, and `issuing.TransactionCreateUnlinkedRefundParams.merchant_data`
* Add support for `cardPresence` on `issuing.Authorization`
* Add support for `allowedCardPresences` and `blockedCardPresences` on `issuing.Card.spending_controls`, `issuing.CardCreateParams.spending_controls`, `issuing.CardUpdateParams.spending_controls`, `issuing.Cardholder.spending_controls`, `issuing.CardholderCreateParams.spending_controls`, and `issuing.CardholderUpdateParams.spending_controls`
* ⚠️ Change type of `PaymentAttemptRecord.payment_method_details.gift_card.balance` and `PaymentRecord.payment_method_details.gift_card.balance` from `PaymentFlowsPrivatePaymentMethodsGiftCardDeprecatedDetailsResourceBalanceAmount` to `nullable(PaymentsPrimitivesPaymentRecordsResourcePaymentMethodGiftCardDetailsResourceBalance)`
* Add support for new value `sunbit` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* Add support for `amountToConfirm` on `PaymentIntentConfirmParams`
* Add support for `klarnaDisplayQrCode` on `PaymentIntent.next_action`
* Add support for new value `sunbit` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for `validationErrors` on `privacy.RedactionJob`
* Add support for `taxDetails` on `Product`
* Add support for new value `account` on enum `radar.ValueListCreateParams.itemType`
* Add support for `moto` on `SetupAttempt.payment_method_details.card`
* Add support for `admissionsTax`, `attendanceTax`, `entertainmentTax`, `grossReceiptsTax`, `hospitalityTax`, `luxuryTax`, `resortTax`, and `tourismTax` on `tax.RegistrationCreateParams.country_options.us`
* Add support for `purpose` on `treasury.OutboundPaymentCreateParams` and `treasury.OutboundPayment`
* Add support for new value `2026-04-22.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `cryptoWallet` on `v2.moneymanagement.FinancialAddress.credentials`
* Add support for `mxBankAccount` on `v2.moneymanagement.FinancialAddress.credentials` and `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Add support for `cryptoWalletTransfer` on `v2.moneymanagement.ReceivedCredit`
* Add support for `euBankAccount` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Change `v2.payments.OffSessionPaymentCaptureParams.metadata` and `v2.payments.OffSessionPaymentCreateParams.metadata` to be optional
* Add support for `cryptoProperties` and `settlementCurrency` on `v2.moneymanagement.FinancialAddressCreateParams`
* Add support for new values `crypto_wallet` and `mx_bank_account` on enum `v2.moneymanagement.FinancialAddressCreateParams.type`
* Add support for event notifications `V2CoreApprovalRequestCreatedEvent` and `V2CoreApprovalRequestExpiredEvent` with related object `v2.core.ApprovalRequest`
* Add support for event notification `V2ExtendExtensionRunFailedEvent`

---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2332
semver_level: major
is_stripe_api_change: true
---

* Add support for new resources `tax.Certificate`, `tax.FormCorrection`, `v2.core.AccountSession`, `v2.extend.ObjectDefinitionVersion`, `v2.extend.ObjectDefinition`, and `v2.moneymanagement.SpendingMandate`
* ⚠️ Remove support for resource `v2.core.AccountSessionResource`
* Add support for `create`, `delete`, `list`, and `retrieve` methods on resource `tax.Certificate`
* Add support for `create` method on resource `tax.Form`
* Add support for `cancel`, `list`, and `retrieve` methods on resource `v2.moneymanagement.SpendingMandate`
* Add support for `list` and `retrieve` methods on resources `v2.extend.ObjectDefinitionVersion` and `v2.extend.ObjectDefinition`
* Add support for `bills`, `financialAccountRewards`, `financialAccountsTransactions`, `financialAccounts`, `networkCostPassthroughReport`, and `recipientsList` on `AccountSessionCreateParams.components`
* Add support for `businessProfileManagement` on `AccountSessionCreateParams.components` and `v2.core.AccountSessionResourceCreateParams.components`
* Add support for `exportTaxTransactions`, `productTaxCodeSelector`, and `taxThresholdMonitoring` on `AccountSession.components`
* Add support for `aeonPay`, `auPay`, `dbarai`, and `merpay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `fundingSources` on `Charge.payment_method_details.card.wallet.link` and `Charge.payment_method_details.link`
* Add support for `fleet` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
* Add support for `cardholderMessage` on `Charge.payment_method_details.card_present.receipt`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present.receipt`, `PaymentAttemptRecord.payment_method_details.card_present.receipt`, `PaymentMethod.card.generated_from.payment_method_details.card_present.receipt`, and `PaymentRecord.payment_method_details.card_present.receipt`
* Add support for `fingerprint` on `Charge.payment_method_details.paypay`, `PaymentAttemptRecord.payment_method_details.paypay`, `PaymentRecord.payment_method_details.paypay`, and `SetupAttempt.payment_method_details.paypay`
* Add support for `customPaymentMethodOptions` and `pricingToken` on `checkout.SessionCreateParams`
* Add support for new value `tamara` on enum `checkout.SessionCreateParams.allowedPaymentMethodTypes`
* Add support for new value `tamara` on enum `checkout.SessionCreateParams.excludedPaymentMethodTypes`
* Add support for `stripeBalance` on `checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `buyer_choice` on enum `checkout.SessionCreateParams.payment_method_options.acss_debit.mandate_options.transactionType`
* Add support for new value `instant` on enums `InvoiceCreateParams.payment_settings.payment_method_options.bacs_debit.verificationMethod`, `InvoiceUpdateParams.payment_settings.payment_method_options.bacs_debit.verificationMethod`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit.verificationMethod`, `PaymentIntentCreateParams.payment_method_options.bacs_debit.verificationMethod`, `PaymentIntentUpdateParams.payment_method_options.bacs_debit.verificationMethod`, `SetupIntentConfirmParams.payment_method_options.bacs_debit.verificationMethod`, `SetupIntentCreateParams.payment_method_options.bacs_debit.verificationMethod`, `SetupIntentUpdateParams.payment_method_options.bacs_debit.verificationMethod`, `SubscriptionCreateParams.payment_settings.payment_method_options.bacs_debit.verificationMethod`, `SubscriptionUpdateParams.payment_settings.payment_method_options.bacs_debit.verificationMethod`, and `checkout.SessionCreateParams.payment_method_options.bacs_debit.verificationMethod`
* Add support for `setupFutureUsage` on `checkout.Session.payment_method_options.paypay` and `checkout.SessionCreateParams.payment_method_options.paypay`
* Add support for new values `aeon_pay`, `au_pay`, `dbarai`, and `merpay` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for `marketingAttributions` on `CustomerUpdateParams`
* Add support for new values `aeon_pay`, `au_pay`, `dbarai`, and `merpay` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `reasonDetails` and `reason` on `CustomerTaxExemptionCreateParams` and `CustomerTaxExemption`
* Add support for `taxCodeGroup` on `CustomerTaxExemption.us` and `CustomerTaxExemptionCreateParams.us`
* Add support for `fraudulentSelfie` on `identity.VerificationReport.signals`
* Add support for `targetDate` on `Invoice.payment_settings.payment_method_options.sepa_debit`, `InvoiceCreateParams.payment_settings.payment_method_options.sepa_debit`, and `InvoiceUpdateParams.payment_settings.payment_method_options.sepa_debit`
* Add support for `tossPay` on `Mandate.payment_method_details`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, and `SetupAttempt.payment_method_details`
* Add support for `paymentEvaluations` and `paymentMethodDetails` on `PaymentAttemptRecordReportAuthenticatedParams`
* Add support for `threeDSecure` on `PaymentAttemptRecordReportAuthorizedParams.payment_method_details.card`, `PaymentAttemptRecordReportGuaranteedParams.payment_method_details.card`, `PaymentRecordReportPaymentAttemptGuaranteedParams.payment_method_details.card`, `PaymentRecordReportPaymentAttemptParams.payment_method_details.card`, and `PaymentRecordReportPaymentParams.payment_method_details.card`
* Change type of `PaymentAttemptRecordReportGuaranteedParams.payment_method_details.type` and `PaymentRecordReportPaymentAttemptGuaranteedParams.payment_method_details.type` from `literal('card')` to `enum('card'|'us_bank_account')`
* Add support for `disputeDetails` on `PaymentAttemptRecord` and `PaymentRecord`
* Add support for new values `aeon_pay`, `au_pay`, `dbarai`, and `merpay` on enums `PaymentIntentConfirmParams.allowedPaymentMethodTypes`, `PaymentIntentCreateParams.allowedPaymentMethodTypes`, `PaymentIntentUpdateParams.allowedPaymentMethodTypes`, `SetupIntentConfirmParams.allowedPaymentMethodTypes`, `SetupIntentCreateParams.allowedPaymentMethodTypes`, and `SetupIntentUpdateParams.allowedPaymentMethodTypes`
* Add support for `evCharging` and `fleetData` on `PaymentIntentAmountDetailsLineItem.payment_method_options.card_present`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.card_present`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.card_present`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.card_present`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[].payment_method_options.card_present`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.card_present`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.card_present`
* Add support for new values `aeon_pay`, `au_pay`, `dbarai`, and `merpay` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* Add support for `financialConnections` on `PaymentIntent.payment_method_options.bacs_debit`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit`, `PaymentIntentCreateParams.payment_method_options.bacs_debit`, `PaymentIntentUpdateParams.payment_method_options.bacs_debit`, `SetupIntent.payment_method_options.bacs_debit`, `SetupIntentConfirmParams.payment_method_options.bacs_debit`, `SetupIntentCreateParams.payment_method_options.bacs_debit`, and `SetupIntentUpdateParams.payment_method_options.bacs_debit`
* ⚠️ Remove support for value `on_session` from enums `PaymentIntentConfirmParams.payment_method_options.paypay.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.paypay.setupFutureUsage`, and `PaymentIntentUpdateParams.payment_method_options.paypay.setupFutureUsage`
* Add support for `wechatPayRedirectToMiniProgram` on `PaymentIntent.next_action`
* Add support for `paymentDetails` on `PaymentIntent.payment_method_options.card_present` and `PaymentIntent.payment_method_options.card`
* Add support for new value `tamara` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for `rakutenPay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `sepaDebit` on `radar.PaymentEvaluation.payment_details.money_movement_details` and `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details`
* Add support for new value `sepa_debit` on enum `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details.moneyMovementType`
* Add support for `cardTesting` on `radar.PaymentEvaluation.signals`
* Add support for `paymentMethod` on `RefundCreateParams`
* Add support for new values `aeon_pay`, `au_pay`, `dbarai`, and `merpay` on enum `RefundCreateParams.payment_method_data.type`
* Add support for `paymentRecord` on `Refund`
* Add support for `bizum` and `upi` on `Refund.destination_details`
* Add support for `taxInvoiceMonth` on `reporting.ReportRun.parameters`
* Add support for `radarOptions` on `SetupIntentConfirmParams`, `SetupIntentCreateParams`, and `SetupIntent`
* Add support for `referralFeeDetails` on `sharedpayment.GrantedToken`, `sharedpayment.IssuedTokenCreateParams`, and `sharedpayment.IssuedToken`
* Add support for `billingGroup` on `SubscriptionCreateParams`, `SubscriptionListParams`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for new values `stripe_s700_devkit`, `stripe_s710_devkit`, `stripe_t600_devkit`, `verifone_ux700_devkit`, and `verifone_v660p_devkit` on enum `terminal.ReaderListParams.deviceType`
* Add support for `deviceHealthDetails` and `deviceHealth` on `terminal.Reader`
* Add support for `networkDetails` on `treasury.InboundTransfer.failure_details`, `treasury.OutboundPayment.returned_details`, and `treasury.OutboundTransfer.returned_details`
* Add support for `reference` on `v2.moneymanagement.FinancialAddress.bank_account.iban`
* Add support for `checkSend` on `v2.moneymanagement.OutboundPayment.to.payout_method_options`, `v2.moneymanagement.OutboundPayment.tracking_details`, `v2.moneymanagement.OutboundPaymentCreateParams.to.payout_method_options`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data`, `v2.moneymanagement.PayoutIntent.to.payout_method_options`, `v2.moneymanagement.PayoutIntentCreateParams.to.payout_method_options`, `v2.moneymanagement.PayoutIntentUpdateParams.to.payout_method_options`, and `v2.moneymanagement.PayoutMethod`
* Add support for `spendingMandate` on `v2.moneymanagement.ReceivedDebit.bank_transfer` and `v2.moneymanagement.ReceivedDebitListParams`
* Add support for `additionalDetails` on `v2.signals.AccountSignal.customer_risk`
* Add support for new value `check_send` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* Add support for new value `pln` on enum `v2.moneymanagement.FinancialAddressCreateParams.bank_account.currency`
* Add support for event notification `V2ExtendObjectDefinitionCreatedEvent` with related object `v2.extend.ObjectDefinition`
* Add support for event notification `V2ExtendObjectDefinitionVersionCreatedEvent` with related object `v2.extend.ObjectDefinitionVersion`
* Add support for event notifications `V2MoneyManagementSpendingMandateCanceledEvent`, `V2MoneyManagementSpendingMandateCreatedEvent`, `V2MoneyManagementSpendingMandateExpiredEvent`, `V2MoneyManagementSpendingMandatePendingCancellationEvent`, and `V2MoneyManagementSpendingMandateUpdatedEvent` with related object `v2.moneymanagement.SpendingMandate`
* ⚠️ Add error type `MerchantNotGatedException` on `v2.core.vault.NetworkToken#create_from_credential`

---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2278
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.5.0-alpha.2
---

* Add support for new resources `radar.BillingEvaluation`, `v2.signals.PaymentRetryEvaluation`, `v2.signals.PaymentRetrySignal`, and `v2.tax.IntegrationConfiguration`
* Add support for `create` method on resource `radar.BillingEvaluation`
* Add support for `create`, `deactivate`, `list`, `retrieve`, and `update` methods on resource `billing.FeedbackOption`
* Add support for `retrieve` and `update` methods on resource `v2.tax.IntegrationConfiguration`
* Add support for `retrieve` method on resource `v2.signals.PaymentRetrySignal`
* Add support for `cancel`, `create`, `retrieve`, and `update` methods on resource `v2.signals.PaymentRetryEvaluation`
* Add support for `disable` method on resource `v2.moneymanagement.PayoutMethod`
* Add support for `update` method on resource `v2.core.ApprovalRequest`
* ⚠️ Remove support for `execute` and `submit` methods on resource `v2.core.ApprovalRequest`
* Add support for `disableStripeUserAuthentication` on `AccountSessionCreateParams.components.payment_method_settings.features`
* Add support for `capitalFinancingManualPayment` on `AccountSession.components`
* Add support for `sequraPayments` on `Account.capabilities`
* Add support for `feedbackOptions` on `billingportal.ConfigurationCreateParams.features.subscription_cancel.cancellation_reason` and `billingportal.ConfigurationUpdateParams.features.subscription_cancel.cancellation_reason`
* Add support for `sequra` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentRecord.payment_method_details`, and `checkout.Session.payment_method_options`
* Add support for `fundingTypesBlocked` on `checkout.SessionCreateParams.payment_method_options.card.restrictions`
* Add support for `paymentIntentData` on `checkout.SessionUpdateParams`
* ⚠️ Change type of `checkout.Session.payment_method_options.bancontact.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for new value `sequra` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for `metadata` on `ConfirmationToken`, `v2.signals.AccountActivityCreateParams`, and `v2.signals.AccountActivity`
* Add support for `activeEntitlements` and `customerPortal` on `CustomerSessionCreateParams.components`
* Add support for new value `sequra` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `addressMatchConfidence` and `nameMatchConfidence` on `identity.VerificationReport.email` and `identity.VerificationReport.phone`
* Add support for `domainCountry`, `emailExistsConfidence`, `observedDomainTenureDays`, `observedEmailTenureDays`, and `phoneMatchConfidence` on `identity.VerificationReport.email`
* Add support for `carrier`, `lineType`, and `observedPhoneTenureDays` on `identity.VerificationReport.phone`
* Add support for new value `truemoney` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for new value `merchant_canceled` on enums `PaymentAttemptRecordReportCanceledParams.reason` and `PaymentRecordReportPaymentAttemptCanceledParams.reason`
* ⚠️ Remove support for `paymentMethodTypes` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `SetupIntentCreateParams`, and `SetupIntentUpdateParams`
* Add support for new value `touch_n_go` on enums `PaymentIntentConfirmParams.allowedPaymentMethodTypes`, `PaymentIntentCreateParams.allowedPaymentMethodTypes`, `PaymentIntentUpdateParams.allowedPaymentMethodTypes`, `SetupIntentConfirmParams.allowedPaymentMethodTypes`, `SetupIntentCreateParams.allowedPaymentMethodTypes`, and `SetupIntentUpdateParams.allowedPaymentMethodTypes`
* Add support for new value `sequra` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* Add support for `verificationMethod` on `PaymentIntent.payment_method_options.bacs_debit`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit`, `PaymentIntentCreateParams.payment_method_options.bacs_debit`, `PaymentIntentUpdateParams.payment_method_options.bacs_debit`, `SetupIntent.payment_method_options.bacs_debit`, `SetupIntentConfirmParams.payment_method_options.bacs_debit`, `SetupIntentCreateParams.payment_method_options.bacs_debit`, and `SetupIntentUpdateParams.payment_method_options.bacs_debit`
* Add support for `applicationFeeAmount`, `applicationFeePercent`, `onBehalfOf`, and `transferData` on `PaymentLinkUpdateParams`
* Add support for `canceled` on `PaymentRecordReportPaymentAttemptParams` and `PaymentRecordReportPaymentParams`
* ⚠️ Change type of `productcatalog.TrialOffer.price` from `$Price` to `deletable($Price)`
* Add support for `recurring` on `sharedpayment.GrantedToken.usage_limits`, `sharedpayment.GrantedTokenCreateParams.usage_limits`, `sharedpayment.IssuedToken.usage_limits`, and `sharedpayment.IssuedTokenCreateParams.usage_limits`
* Add support for `feedbackOption` on `SubscriptionCancelParams.cancellation_details` and `SubscriptionUpdateParams.cancellation_details`
* Add support for `pricingToken` on `SubscriptionUpdateParams`
* Add support for `igic` on `tax.RegistrationCreateParams.country_options.at`, `tax.RegistrationCreateParams.country_options.be`, `tax.RegistrationCreateParams.country_options.bg`, `tax.RegistrationCreateParams.country_options.cy`, `tax.RegistrationCreateParams.country_options.cz`, `tax.RegistrationCreateParams.country_options.de`, `tax.RegistrationCreateParams.country_options.dk`, `tax.RegistrationCreateParams.country_options.ee`, `tax.RegistrationCreateParams.country_options.es`, `tax.RegistrationCreateParams.country_options.fi`, `tax.RegistrationCreateParams.country_options.fr`, `tax.RegistrationCreateParams.country_options.gr`, `tax.RegistrationCreateParams.country_options.hr`, `tax.RegistrationCreateParams.country_options.hu`, `tax.RegistrationCreateParams.country_options.ie`, `tax.RegistrationCreateParams.country_options.it`, `tax.RegistrationCreateParams.country_options.lt`, `tax.RegistrationCreateParams.country_options.lu`, `tax.RegistrationCreateParams.country_options.lv`, `tax.RegistrationCreateParams.country_options.mt`, `tax.RegistrationCreateParams.country_options.nl`, `tax.RegistrationCreateParams.country_options.pl`, `tax.RegistrationCreateParams.country_options.pt`, `tax.RegistrationCreateParams.country_options.ro`, `tax.RegistrationCreateParams.country_options.se`, `tax.RegistrationCreateParams.country_options.si`, and `tax.RegistrationCreateParams.country_options.sk`
* Add support for new value `2026-08-26.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `oneTimeFees` on `v2.billing.ContractCreateParams` and `v2.billing.Contract`
* ⚠️ Remove support for `paymentMethodCollection` on `v2.core.Account.configuration.merchant.gross_settlement`, `v2.core.AccountCreateParams.configuration.merchant.gross_settlement`, and `v2.core.AccountUpdateParams.configuration.merchant.gross_settlement`
* Add support for `payoutMethods` on `v2.core.Account.defaults` and `v2.core.AccountUpdateParams.defaults`
* Add support for `reason` on `v2.core.ApprovalRequest`
* ⚠️ Remove support for `description` on `v2.core.ApprovalRequest`
* Add support for `apiKey`, `type`, and `user` on `v2.core.ApprovalRequest.requested_by` and `v2.core.ApprovalRequest.review.reviewed_by`
* ⚠️ Remove support for `id` and `name` on `v2.core.ApprovalRequest.requested_by` and `v2.core.ApprovalRequest.review.reviewed_by`
* Add support for `approvedAt` on `v2.core.ApprovalRequest.status_transitions`
* ⚠️ Remove support for `requiresExecutionAt` on `v2.core.ApprovalRequest.status_transitions`
* Add support for `cryptoTransaction` on `v2.core.FeeBatch.collection_records[]`
* Add support for `restricted` on `v2.core.vault.GbBankAccount` and `v2.core.vault.UsBankAccount`
* Add support for `savings` on `v2.moneymanagement.FinancialAccountCreateParams` and `v2.moneymanagement.FinancialAccount`
* Add support for `enabledDeliverySchemes` on `v2.moneymanagement.PayoutMethod.bank_account`
* ⚠️ Remove support for `enabledDeliveryOptions` on `v2.moneymanagement.PayoutMethod.bank_account`
* Add support for `toAccount` on `v2.moneymanagement.ReceivedDebit.balance_transfer`
* Add support for `accountRestricted` and `accountSuspended` on `v2.signals.AccountActivityCreateParams` and `v2.signals.AccountActivity`
* Add support for `additionalDetails` on `v2.signals.AccountSignal.fraudulent_merchant` and `v2.signals.AccountSignal.merchant_delinquency`
* ⚠️ Remove support for `indicators` on `v2.signals.AccountSignal.fraudulent_merchant` and `v2.signals.AccountSignal.merchant_delinquency`
* Add support for new values `account_restricted` and `account_suspended` on enums `v2.signals.AccountActivityCreateParams.type` and `v2.signals.AccountEvaluationCreateParams.account_activity_details.data.type`
* Add support for new value `disabled` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.payments`
* Add support for new value `disabled` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.transfers`
* Add support for new value `savings` on enum `v2.moneymanagement.FinancialAccountListParams.types`
* Add support for new value `savings` on enum `v2.moneymanagement.FinancialAccountCreateParams.type`
* Add support for `action`, `created`, and `status` on `v2.core.ApprovalRequestListParams`
* Add support for `oneTimeFeeActions` on `v2.billing.ContractUpdateParams`
* Add support for event notifications `V2CoreHealthMetronomeNotificationLatencyFiringEvent`, `V2CoreHealthMetronomeNotificationLatencyResolvedEvent`, and `V2SignalsPaymentRetryEvaluationsRetryRecommendedEvent`
* Add support for event notifications `V2MoneyManagementPayoutIntentCanceledEvent`, `V2MoneyManagementPayoutIntentCreatedEvent`, `V2MoneyManagementPayoutIntentPostedEvent`, `V2MoneyManagementPayoutIntentProcessingEvent`, and `V2MoneyManagementPayoutIntentRequiresActionEvent` with related object `v2.moneymanagement.PayoutIntent`

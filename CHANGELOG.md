<!--
THIS IS A GENERATED FILE. Any changes you make to it directly will be blown away.
Instead, edit a corresponding `.change.md` file and run `hark build`.
-->

# Changelog

> This changelog only covers the **private preview** releases. Each release builds on the most recent GA release; see those notes in [the GA changelog](https://github.com/stripe/stripe-java/blob/master/CHANGELOG.md).

## 33.5.0-alpha.3 - 2026-09-09
* [#2285](https://github.com/stripe/stripe-java/pull/2285) Update generated code for private-preview
  * Add support for `customerTaxExemption` on `tax.Calculation.shipping_cost.tax_breakdown[]`, `tax.CalculationLineItem.tax_breakdown[]`, and `tax.Transaction.shipping_cost.tax_breakdown[]`
  * Add support for `backdateStartDate` on `checkout.Session.items[].subscription` and `checkout.SessionCreateParams.items[].subscription`
  * Add support for `signals` on `identity.VerificationReport`
  * Add support for `networkResponseCode` on `issuing.Authorization.request_history[]`
  * Add support for `unitCostPrecision` on `PaymentIntentAmountDetailsLineItem`, `PaymentIntentCaptureParams.amount_details.line_items[]`, `PaymentIntentConfirmParams.amount_details.line_items[]`, `PaymentIntentCreateParams.amount_details.line_items[]`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[]`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[]`, and `PaymentIntentUpdateParams.amount_details.line_items[]`
  * Add support for `active` on `productcatalog.TrialOfferListParams`

## 33.5.0-alpha.2 - 2026-09-02
* ⚠️ [#2278](https://github.com/stripe/stripe-java/pull/2278) Update generated code for private-preview
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

## 33.5.0-alpha.1 - 2026-08-26
This release changes the pinned API version to `2026-08-26.preview`.

* [#2268](https://github.com/stripe/stripe-java/pull/2268) Add non-verified manged handlers
* ⚠️ [#2272](https://github.com/stripe/stripe-java/pull/2272) Update generated code for private-preview
  * Add support for new resource `CustomerTaxExemption`
  * Add support for `create`, `delete`, `list`, and `retrieve` methods on resource `CustomerTaxExemption`
  * Add support for `details` on `Account.future_requirements.errors[]`, `Account.requirements.errors[]`, `BankAccount.future_requirements.errors[]`, `BankAccount.requirements.errors[]`, `Capability.future_requirements.errors[]`, `Capability.requirements.errors[]`, `Person.future_requirements.errors[]`, and `Person.requirements.errors[]`
  * ⚠️ Remove support for `sequraPayments` on `Account.capabilities`
  * Add support for `subscriptionPause` on `billingportal.SessionCreateParams.flow_data`
  * ⚠️ Remove support for `sequra` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentRecord.payment_method_details`, and `checkout.Session.payment_method_options`
  * Add support for `enablementDetails` on `checkout.Session.automatic_tax`
  * ⚠️ Remove support for value `sequra` from enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * ⚠️ Remove support for value `sequra` from enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `credit` on `financialconnections.Transaction.classifications[]`
  * Add support for `userConsent` on `identity.VerificationSessionCreateParams` and `identity.VerificationSessionUpdateParams`
  * Add support for `companyDetails` on `Invoice.payment_settings.payment_method_options.billie`, `PaymentIntent.payment_method_options.billie`, `PaymentIntentConfirmParams.payment_method_options.billie`, `PaymentIntentCreateParams.payment_method_options.billie`, `PaymentIntentUpdateParams.payment_method_options.billie`, `QuotePreviewInvoice.payment_settings.payment_method_options.billie`, and `Subscription.payment_settings.payment_method_options.billie`
  * Add support for `reference` on `Invoice.payment_settings.payment_method_options.billie`, `PaymentIntent.payment_method_options.billie`, `PaymentIntentConfirmParams.payment_method_options.billie`, `PaymentIntentCreateParams.payment_method_options.billie`, `PaymentIntentUpdateParams.payment_method_options.billie`, and `QuotePreviewInvoice.payment_settings.payment_method_options.billie`
  * Add support for `posCondition` on `issuing.AuthorizationCreateParams` and `issuing.Authorization`
  * Add support for `cryptoWallet` on `issuing.CardCreateParams`, `issuing.CardUpdateParams`, and `issuing.Card`
  * Add support for `paymentEvaluations` and `paymentMethodDetails` on `PaymentAttemptRecordReportAuthorizedParams`
  * Add support for `aadeData` on `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
  * ⚠️ Remove support for `cancelAtPeriodEnd` on `Subscription.pending_update`
  * Add support for `blikRecurringPayments` on `v2.core.Account.configuration.merchant.capabilities`, `v2.core.AccountCreateParams.configuration.merchant.capabilities`, and `v2.core.AccountUpdateParams.configuration.merchant.capabilities`
  * Add support for `userAccess` on `v2.iam.ActivityLog.details`
  * Add support for new value `user_access` on enum `v2.iam.ActivityLogListParams.actionGroups`
  * Add support for new value `user_access_started` on enum `v2.iam.ActivityLogListParams.actions`
  * Add support for new value `blik_recurring_payments` on enum `EventsV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent.updatedCapability`

## 33.4.0-alpha.2 - 2026-08-19
* ⚠️ [#2266](https://github.com/stripe/stripe-java/pull/2266) Update generated code for private-preview
  * Add support for new resources `PaymentPlan` and `billing.FeedbackOption`
  * ⚠️ Remove support for resource `billing.FeedbackOptions`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resource `PaymentPlan`
  * Add support for `update` method on resource `v2.moneymanagement.Transaction`
  * Add support for `wechatPayPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
  * ⚠️ Change type of `billingportal.Configuration.features.subscription_cancel.cancellation_reason.feedbackOptions` from `$Billing.FeedbackOptions` to `$Billing.FeedbackOption`
  * Add support for `subscriptionPause` on `billingportal.Session.flow`
  * Add support for new value `usdt` on enums `crypto.OnrampSessionCreateParams.destinationCurrency` and `crypto.OnrampSessionListParams.destinationCurrency`
  * Add support for new value `usdt` on enum `crypto.OnrampSessionCreateParams.destinationCurrencies`
  * Add support for `activeEntitlements` on `CustomerSession.components`
  * Add support for `sharedPaymentIssuedToken` on `delegatedcheckout.RequestedSessionConfirmParams`
  * Add support for `managedPayments` on `InvoiceCreateParams`, `InvoiceItemCreateParams`, `InvoiceItem`, `Invoice`, and `QuotePreviewInvoice`
  * Add support for `paymentPlan` on `Invoice`
  * Add support for `estimatedFeeDetails` and `estimatedFee` on `issuing.Authorization.pending_request.hold_amount_details` and `issuing.Authorization.request_history[].hold_amount_details`
  * ⚠️ Remove support for `cryptogram` on `PaymentAttemptRecord.payment_method_details.card.three_d_secure` and `PaymentRecord.payment_method_details.card.three_d_secure`
  * ⚠️ Change type of `productcatalog.TrialOffer.end_behavior.transition.price` from `$Price` to `deletable($Price)`
  * ⚠️ Change type of `Subscription.cancellation_details.feedbackOption` from `$Billing.FeedbackOptions` to `$Billing.FeedbackOption`
  * Add support for `cancelAtPeriodEnd` on `Subscription.pending_update`
  * Add support for `igic` on `tax.Registration.country_options.at`, `tax.Registration.country_options.be`, `tax.Registration.country_options.bg`, `tax.Registration.country_options.cy`, `tax.Registration.country_options.cz`, `tax.Registration.country_options.de`, `tax.Registration.country_options.dk`, `tax.Registration.country_options.ee`, `tax.Registration.country_options.es`, `tax.Registration.country_options.fi`, `tax.Registration.country_options.fr`, `tax.Registration.country_options.gr`, `tax.Registration.country_options.hr`, `tax.Registration.country_options.hu`, `tax.Registration.country_options.ie`, `tax.Registration.country_options.it`, `tax.Registration.country_options.lt`, `tax.Registration.country_options.lu`, `tax.Registration.country_options.lv`, `tax.Registration.country_options.mt`, `tax.Registration.country_options.nl`, `tax.Registration.country_options.pl`, `tax.Registration.country_options.pt`, `tax.Registration.country_options.ro`, `tax.Registration.country_options.se`, `tax.Registration.country_options.si`, and `tax.Registration.country_options.sk`
  * Add support for `metadata` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[]`, `v2.billing.Contract.pricing_overrides.data[]`, `v2.billing.ContractCreateParams.pricing_overrides[]`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add`, `v2.billing.ContractUpdateParams.pricing_override_actions[].update`, `v2.billing.ContractUpdateParams`, and `v2.moneymanagement.Transaction`
  * Add support for `taxAmount` on `v2.moneymanagement.OutboundPaymentQuote.estimated_fees[]`
  * Add support for `payoutMethodOptions` on `v2.moneymanagement.OutboundPaymentQuote.to` and `v2.moneymanagement.OutboundPaymentQuoteCreateParams.to`
  * Change type of `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.metadata` from `string` to `emptyable(string)`
  * Add support for snapshot events `payment_plan.created`, `payment_plan.installment_due`, `payment_plan.installment_paid`, `payment_plan.installment_will_be_due`, and `payment_plan.updated` with resource `PaymentPlan`

## 33.4.0-alpha.1 - 2026-08-12
This release changes the pinned API version to `2026-08-12.preview`.

* ⚠️ [#2264](https://github.com/stripe/stripe-java/pull/2264) Update generated code for private-preview
  * Add support for new resource `v2.tax.OperationsResolveAddressResult`
  * Add support for `resolve_address` method on resource `v2.tax.OperationsResolveAddressResult`
  * Add support for `confirm` and `fx_quote` methods on resource `v2.moneymanagement.PayoutIntent`
  * Add support for `customerUpdate` on `billingportal.Session.flow`
  * Add support for `fundingSourceGroup` on `Charge.payment_method_details.link`
  * ⚠️ Remove support for `pricingGroup` on `Charge.payment_method_details.link`
  * Add support for new value `celo` on enums `crypto.OnrampSessionCreateParams.destinationNetwork`, `crypto.OnrampSessionListParams.destinationNetwork`, and `crypto.OnrampTransactionLimitsRetrieveParams.destinationNetwork`
  * Add support for new value `celo` on enum `crypto.OnrampSessionCreateParams.destinationNetworks`
  * Add support for `celo` on `crypto.OnrampSession.transaction_details.wallet_addresses`
  * Add support for `customerPortal` on `CustomerSession.components`
  * Add support for `appliedToInvoice` and `type` on `CustomerBalanceTransactionCreateParams`
  * Add support for `classificationState` and `enrichmentState` on `financialconnections.Account`
  * Add support for `country` on `financialconnections.Session.filters`
  * Add support for `classifications` and `enrichments` on `financialconnections.Transaction`
  * Add support for new values `billie`, `paypay`, and `vipps` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `customerBalance` on `Invoice` and `QuotePreviewInvoice`
  * Add support for `billie` on `Invoice.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, and `Subscription.payment_settings.payment_method_options`
  * Add support for `holdAmountDetails` and `holdAmount` on `issuing.Authorization.pending_request` and `issuing.Authorization.request_history[]`
  * Add support for new values `hu` and `ro` on enums `issuing.CardholderCreateParams.preferredLocales` and `issuing.CardholderUpdateParams.preferredLocales`
  * Add support for new values `authentication_failure`, `expired_payment_method`, `incorrect_cvc`, `incorrect_number`, `incorrect_postal_code`, `insufficient_funds`, `payment_method_restricted`, and `processing_error` on enums `PaymentAttemptRecordReportFailedParams.failureCode`, `PaymentRecordReportPaymentAttemptFailedParams.failureCode`, `PaymentRecordReportPaymentAttemptParams.failed.failureCode`, and `PaymentRecordReportPaymentParams.failed.failureCode`
  * Add support for `networkDeclineCode` on `PaymentAttemptRecordReportFailedParams.payment_method_details.card` and `PaymentRecordReportPaymentAttemptFailedParams.payment_method_details.card`
  * Add support for `setupFutureUsage` on `PaymentIntent.payment_method_options.sequra`
  * Add support for `status` on `QuotePreviewSubscriptionSchedule.pause_schedules[].pause`, `QuotePreviewSubscriptionSchedule.pause_schedules[].resume`, `SubscriptionSchedule.pause_schedules[].pause`, and `SubscriptionSchedule.pause_schedules[].resume`
  * Change `SubscriptionScheduleCreateParams.pause_schedules[].pause` to be optional
  * Change type of `SubscriptionScheduleUpdateParams.pause_schedules[].resume` from `pause_schedule_update_resume_params` to `emptyable(pause_schedule_update_resume_params)`
  * Add support for `acquirer` on `EventsV2CoreHealthAuthorizationRateDropFiringEvent.impact.dimensions[]`, `EventsV2CoreHealthAuthorizationRateDropResolvedEvent.impact.dimensions[]`, `v2.core.health.Alert.authorization_rate_drop.dimensions[]`, and `v2.core.health.AlertHistoryEntry.authorization_rate_drop.dimensions[]`
  * ⚠️ Change type of `EventsV2CoreHealthAuthorizationRateDropFiringEvent.impact.dimensions[].type`, `EventsV2CoreHealthAuthorizationRateDropResolvedEvent.impact.dimensions[].type`, `v2.core.health.Alert.authorization_rate_drop.dimensions[].type`, and `v2.core.health.AlertHistoryEntry.authorization_rate_drop.dimensions[].type` from `literal('issuer')` to `enum('acquirer'|'issuer')`
  * Add support for `confirmationMethod` on `v2.moneymanagement.PayoutIntentCreateParams` and `v2.moneymanagement.PayoutIntent`
  * Add support for `estimatedFees` and `fxQuote` on `v2.moneymanagement.PayoutIntent`
  * Add support for `debited` on `v2.moneymanagement.PayoutIntent.from`
  * Add support for `confirm` on `v2.moneymanagement.PayoutIntent.next_action`
  * ⚠️ Change type of `v2.moneymanagement.PayoutIntent.next_action.type` from `literal('handle_failure')` to `enum('confirm'|'handle_failure')`
  * Add support for `credited` on `v2.moneymanagement.PayoutIntent.to`
  * Add support for new value `one_time_fees` on enums `v2.billing.ContractActivateParams.include`, `v2.billing.ContractCancelParams.include`, `v2.billing.ContractCreateParams.include`, `v2.billing.ContractListParams.include`, `v2.billing.ContractRetrieveParams.include`, and `v2.billing.ContractUpdateParams.include`
  * Add support for event notification `V1BalanceSettingsUpdatedEvent` with related object `BalanceSettings`
  * Add support for event notification `V1BillingCreditBalanceTransactionCreatedEvent` with related object `billing.CreditBalanceTransaction`
  * Add support for event notifications `V1BillingCreditGrantCreatedEvent` and `V1BillingCreditGrantUpdatedEvent` with related object `billing.CreditGrant`
  * Add support for event notifications `V1BillingMeterCreatedEvent`, `V1BillingMeterDeactivatedEvent`, `V1BillingMeterReactivatedEvent`, and `V1BillingMeterUpdatedEvent` with related object `billing.Meter`
  * Add support for event notifications `V1FinancialConnectionsAccountAccountNumbersUpdatedEvent`, `V1FinancialConnectionsAccountExpectedDeactivationDateUpdatedEvent`, `V1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdatedEvent`, `V1FinancialConnectionsAccountUpcomingAccountNumberExpiryEvent`, and `V1FinancialConnectionsAccountUpcomingDeactivationEvent` with related object `financialconnections.Account`
  * Add support for event notification `V1InvoicePaymentAttemptRequiredEvent` with related object `Invoice`
  * Add support for error type `FxQuoteNeedsRefreshException`

## 33.3.0-alpha.2 - 2026-08-05
* [#2259](https://github.com/stripe/stripe-java/pull/2259) Update generated code for private-preview
  * Add support for new resource `billing.FeedbackOptions`
  * Add support for `sequraPayments` on `Account.capabilities`
  * Add support for `feedbackOptions` on `billingportal.Configuration.features.subscription_cancel.cancellation_reason`
  * Add support for `sequra` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentRecord.payment_method_details`, and `checkout.Session.payment_method_options`
  * Add support for `retrievalReferenceNumber` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
  * Add support for `pricingGroup` on `Charge.payment_method_details.link`
  * Add support for `taxRates` on `checkout.Session.shipping_options[]`, `checkout.SessionCreateParams.shipping_options[]`, and `checkout.SessionUpdateParams.shipping_options[]`
  * Add support for `fundingTypesBlocked` on `checkout.Session.payment_method_options.card.restrictions`
  * Add support for new value `sequra` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `sequra` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `healthcare` on `issuing.AuthorizationCaptureParams.purchase_details`, `issuing.AuthorizationCreateParams`, `issuing.TransactionCreateForceCaptureParams.purchase_details`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details`
  * Add support for `isAnomalous` on `PaymentAttemptRecordReportGuaranteedParams`
  * Add support for new value `sequra` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
  * Add support for `aadeData` on `PaymentIntent.payment_method_options.card_present`
  * Add support for `feedbackOption` on `Subscription.cancellation_details`
  * Add support for `application` on `v2.payments.OffSessionPayment`
  * Add support for `status` on `v2.moneymanagement.FinancialAccountStatementListParams`
  * Change `v2.billing.ContractCreateParams.pricingLines` to be optional

## 33.3.0-alpha.1 - 2026-07-29
This release changes the pinned API version to `2026-07-29.preview`.

* ⚠️ [#2255](https://github.com/stripe/stripe-java/pull/2255) Update generated code for private-preview
  * Add support for new resources `v2.moneymanagement.ReceivedDebitMandate`, `v2.risk.Inquiry`, `v2.signals.AccountActivity`, and `v2.signals.AccountEvaluation`
  * Add support for `create` and `retrieve` methods on resource `v2.signals.AccountEvaluation`
  * Add support for `create`, `delete`, and `retrieve` methods on resource `v2.signals.AccountActivity`
  * Add support for `list`, `retrieve`, and `update` methods on resource `v2.risk.Inquiry`
  * Add support for `cancel`, `list`, and `retrieve` methods on resource `v2.moneymanagement.ReceivedDebitMandate`
  * Add support for `rateCards` on `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope`, `billing.CreditGrant.applicability_config.scope`, and `billing.CreditGrantCreateParams.applicability_config.scope`
  * ⚠️ Change type of `ConfirmationToken.payment_method_preview.gift_card.brand`, `GiftCard.brand`, `GiftCardCreateParams.brand`, `PaymentMethod.gift_card.brand`, `terminal.ReaderActivateGiftCardParams.brand`, `terminal.ReaderCashoutGiftCardParams.brand`, `terminal.ReaderCheckGiftCardBalanceParams.brand`, and `terminal.ReaderReloadGiftCardParams.brand` from `enum('fiserv_valuelink'|'givex'|'svs')` to `literal('svs')`
  * Add support for new value `tempo` on enums `crypto.OnrampSessionCreateParams.destinationNetwork`, `crypto.OnrampSessionListParams.destinationNetwork`, and `crypto.OnrampTransactionLimitsRetrieveParams.destinationNetwork`
  * Add support for new value `tempo` on enum `crypto.OnrampSessionCreateParams.destinationNetworks`
  * Add support for `tempo` on `crypto.OnrampSession.transaction_details.wallet_addresses`
  * Add support for `healthcare` on `issuing.Authorization`
  * Add support for `productCode` on `issuing.CardCreateParams`, `issuing.CardUpdateParams`, and `issuing.Card`
  * Add support for `productGraduationState` on `issuing.Card`
  * Add support for `cvc` and `number` on `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details.card`
  * Change `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details.card.first6` to be optional
  * Change `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details.card.last4` to be optional
  * Add support for `card` on `radar.PaymentEvaluation.payment_details.payment_method_details`
  * ⚠️ Change type of `terminal.ReaderCollectPaymentMethodParams.collect_config.giftCardBrand` and `terminal.ReaderProcessPaymentIntentParams.process_config.giftCardBrand` from `enum('fiserv_valuelink'|'givex'|'svs')` to `literal('svs')`
  * Add support for `giftCard` on `terminal.ReaderPresentPaymentMethodParams`
  * Add support for new value `gift_card` on enum `terminal.ReaderPresentPaymentMethodParams.type`
  * Add support for `amountDue` and `customerBalanceApplied` on `v2.billing.Intent.amount_details`
  * ⚠️ Change type of `v2.core.AccountEvaluation.evaluationsTriggered` from `literal('fraudulent_website')` to `enum('fraudulent_website'|'user_account_sharing'|'user_multi_accounting')`
  * Add support for `grossSettlement` on `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
  * ⚠️ Change type of `v2.moneymanagement.DebitDispute.bank_transfer.network` from `literal('ach')` to `enum('ach'|'bacs')`
  * ⚠️ Remove support for `managedBy` on `v2.moneymanagement.FinancialAccount`
  * Add support for `payoutIntent` on `v2.moneymanagement.OutboundPayment`
  * Add support for `settlesAt` on `v2.moneymanagement.ReceivedDebit`
  * Add support for `gbBankAccount` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
  * ⚠️ Change type of `v2.moneymanagement.ReceivedDebit.bank_transfer.originType` from `literal('us_bank_account')` to `enum('gb_bank_account'|'us_bank_account')`
  * ⚠️ Change type of `v2.moneymanagement.ReceivedDebit.bank_transfer.paymentMethodType` from `literal('us_bank_account')` to `enum('gb_bank_account'|'us_bank_account')`
  * Add support for `targetDate` on `v2.payments.OffSessionPaymentCreateParams` and `v2.payments.OffSessionPayment`
  * Add support for `accountEvaluation`, `fraudulentWebsite`, `paymentDelinquencyExposure`, `userAccountSharing`, and `userMultiAccounting` on `v2.signals.AccountSignal`
  * Add support for new values `fraudulent_website`, `user_account_sharing`, and `user_multi_accounting` on enum `v2.signals.AccountSignalListParams.type`
  * Change type of `v2.moneymanagement.FinancialAddressDebitSimulationDebitParams.network` from `literal('ach')` to `enum('ach'|'bacs')`
  * Add support for `receivedDebitMandate` on `v2.moneymanagement.ReceivedDebitListParams`
  * ⚠️ Remove support for `payoutIntent` on `v2.moneymanagement.OutboundPaymentCreateParams`
  * Change type of `v2.core.AccountEvaluationCreateParams.signals` from `literal('fraudulent_website')` to `enum('fraudulent_website'|'user_account_sharing'|'user_multi_accounting')`
  * ⚠️ Remove support for `id` on `EventsV2SignalsAccountSignalFraudulentMerchantReadyEvent`
  * Add support for event notifications `V2MoneyManagementReceivedDebitCreatedEvent` and `V2MoneyManagementReceivedDebitScheduledEvent` with related object `v2.moneymanagement.ReceivedDebit`
  * Add support for event notifications `V2MoneyManagementReceivedDebitMandateCanceledEvent`, `V2MoneyManagementReceivedDebitMandateCreatedEvent`, `V2MoneyManagementReceivedDebitMandateExpiredEvent`, `V2MoneyManagementReceivedDebitMandatePendingCancellationEvent`, and `V2MoneyManagementReceivedDebitMandateUpdatedEvent` with related object `v2.moneymanagement.ReceivedDebitMandate`
  * Add support for event notification `V2SignalsAccountEvaluationCompleteEvent` with related object `v2.signals.AccountEvaluation`
  * Add support for event notifications `V2SignalsAccountSignalFraudulentWebsiteReadyEvent` and `V2SignalsAccountSignalPaymentDelinquencyExposureReadyEvent` with related object `v2.signals.AccountSignal`

## 33.2.0-alpha.6 - 2026-07-22
* [#2254](https://github.com/stripe/stripe-java/pull/2254) Remove unnecessary logging from EventDataObjectDeserializer.java
  * Deserializing an event webhook will no longer print `Stripe API version:...` to stdout.

## 33.2.0-alpha.5 - 2026-07-22
* [#2250](https://github.com/stripe/stripe-java/pull/2250) Fix flakey testTelemetryEnabled test
* ⚠️ [#2253](https://github.com/stripe/stripe-java/pull/2253) Update generated code for private-preview
  * Add support for new resources `billing.AlertNotification` and `crypto.DepositAddress`
  * Add support for `create`, `list`, and `retrieve` methods on resource `crypto.DepositAddress`
  * Add support for `list` method on resource `billing.AlertNotification`
  * Add support for `vipps` on `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new value `vipps` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `sui` on enums `crypto.OnrampSessionCreateParams.destinationNetwork`, `crypto.OnrampSessionListParams.destinationNetwork`, and `crypto.OnrampTransactionLimitsRetrieveParams.destinationNetwork`
  * Add support for new value `sui` on enum `crypto.OnrampSessionCreateParams.destinationNetworks`
  * Add support for `sui` on `crypto.OnrampSession.transaction_details.wallet_addresses`
  * Add support for new value `vipps` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `useStripeSdk` on `delegatedcheckout.RequestedSessionConfirmParams`
  * Add support for new value `mb_way` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `evCharging` on `PaymentIntentAmountDetailsLineItem.payment_method_options.card`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.card`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.card`
  * Add support for new values `ev_battery_exchanges`, `ev_charging_fee`, `evc_level_1`, `evc_level_2`, `evc_level_3`, `evc_level_4`, and `evc_level_5` on enums `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`
  * Add support for new value `vipps` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
  * Add support for `taxItems` on `PaymentIntent.payment_details.car_rental_data[].total.tax`, `PaymentIntent.payment_details.flight_data[].total.tax`, and `PaymentIntent.payment_details.lodging_data[].total.tax`
  * ⚠️ Remove support for `taxes` on `PaymentIntent.payment_details.car_rental_data[].total.tax`, `PaymentIntent.payment_details.flight_data[].total.tax`, and `PaymentIntent.payment_details.lodging_data[].total.tax`
  * Change `PaymentRecordCreateParams.closed` to be optional
  * Change `PaymentRecordCreateParams.funded` to be optional
  * Add support for `card` on `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details`
  * ⚠️ Remove support for `acssDebit`, `afterpayClearpay`, `alipay`, `alma`, `amazonPay`, `auBecsDebit`, `bacsDebit`, `bancontact`, `billie`, `bizum`, `blik`, `boleto`, `cardPresent`, `cashapp`, `crypto`, `customerBalance`, `eps`, `fpx`, `giftCard`, `giropay`, `gopay`, `grabpay`, `idBankTransfer`, `ideal`, `interacPresent`, `kakaoPay`, `konbini`, `krCard`, `mbWay`, `mobilepay`, `multibanco`, `naverPay`, `nzBankAccount`, `oxxo`, `p24`, `payByBank`, `payco`, `paynow`, `paypal`, `paypay`, `payto`, `pix`, `promptpay`, `qris`, `rechnung`, `revolutPay`, `samsungPay`, `satispay`, `scalapay`, `sepaDebit`, `shopeepay`, `sofort`, `stripeBalance`, `sunbit`, `swish`, `tamara`, `twint`, `upi`, `usBankAccount`, `wechatPay`, and `zip` on `sharedpayment.GrantedToken.payment_method_details`
  * Add support for `spendCard` on `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.stripe`, and `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.stripe`
  * Add support for new value `payment_delinquency_exposure` on enum `v2.signals.AccountSignalListParams.type`
  * Add support for new value `commercial.stripe.spend_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

## 33.2.0-alpha.4 - 2026-07-16
* ⚠️ [#2247](https://github.com/stripe/stripe-java/pull/2247) Update generated code for private-preview
  * ⚠️ Remove support for resource `FrMealVouchersOnboarding`
  * ⚠️ Remove support for `create`, `list`, `retrieve`, and `update` methods on resource `FrMealVouchersOnboarding`
  * Add support for `create` method on resource `PaymentRecord`
  * ⚠️ Remove support for `financialAccountsTransactions`, `financialAccounts`, and `recipientsList` on `AccountSessionCreateParams.components`
  * Add support for `smartDisputesManagement` on `AccountSession.components.disputes_list.features`, `AccountSession.components.payment_details.features`, `AccountSession.components.payment_disputes.features`, and `AccountSession.components.payments.features`
  * Add support for `mode` on `financialconnections.Session.manual_entry`
  * Add support for new values `alipay` and `sequra` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `businessName` on `issuing.Card.shipping`
  * Add support for `pauseSchedules` on `QuotePreviewSubscriptionSchedule`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams`, and `SubscriptionSchedule`
  * Add support for `trial` on `QuotePreviewSubscriptionSchedule.phases[]` and `SubscriptionSchedule.phases[]`
  * Add support for `paymentRecord` on `RefundCreateParams`
  * Add support for `redirectToUrl` on `sharedpayment.IssuedToken.next_action`
  * ⚠️ Change type of `sharedpayment.IssuedToken.next_action.type` from `literal('use_stripe_sdk')` to `enum('redirect_to_url'|'use_stripe_sdk')`
  * Add support for new values `financial_connections.account.expected_deactivation_date_updated`, `financial_connections.account.supported_payment_method_types_updated`, `financial_connections.account.upcoming_deactivation`, `financial_connections.authorization.expected_deactivation_date_updated`, and `financial_connections.authorization.upcoming_deactivation` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for snapshot events `financial_connections.account.expected_deactivation_date_updated`, `financial_connections.account.supported_payment_method_types_updated`, and `financial_connections.account.upcoming_deactivation` with resource `financialconnections.Account`
  * Add support for snapshot events `financial_connections.authorization.expected_deactivation_date_updated` and `financial_connections.authorization.upcoming_deactivation` with resource `financialconnections.Authorization`

## 33.2.0-alpha.3 - 2026-07-08
This release changes the pinned API version to `2026-07-08.preview`.

* ⚠️ [#2243](https://github.com/stripe/stripe-java/pull/2243) Update generated code for private-preview
  * Add support for `activate_gift_card`, `cashout_gift_card`, `check_gift_card_balance`, and `reload_gift_card` methods on resource `terminal.Reader`
  * Add support for `aggregationPeriod` on `billing.AlertRecovered`
  * Add support for `administrativeAddress` and `principalPlaceOfBusiness` on `Account.company`
  * Add support for `addressCollectionPrecision` on `checkout.Session.automatic_tax`
  * Add support for `taxId` on `checkout.Session.collected_information`
  * ⚠️ Remove support for `taxIds` on `checkout.Session.collected_information`
  * Add support for `setupFutureUsage` on `PaymentIntent.payment_method_options.payco`, `PaymentIntent.payment_method_options.paypay`, `PaymentIntent.payment_method_options.samsung_pay`, `PaymentIntentConfirmParams.payment_method_options.paypay`, `PaymentIntentCreateParams.payment_method_options.paypay`, `PaymentIntentUpdateParams.payment_method_options.paypay`, `checkout.Session.payment_method_options.payco`, and `checkout.Session.payment_method_options.samsung_pay`
  * Add support for `network` on `Dispute.payment_method_details.card`
  * Add support for `requirePaymentMethodSupport` on `financialconnections.Session.filters`
  * Add support for `networkData` on `issuing.Authorization.request_history[]`
  * Add support for `acquiringInstitutionCountry`, `acquiringInstitutionId`, `retrievalReferenceNumber`, `routedNetwork`, and `traceId` on `issuing.Transaction.network_data`
  * Add support for new values `boku_promptpay`, `capchase_pay`, `check_scan`, `click_to_pay`, `demo_pay`, `duitnow`, `dummy_auth_push`, `dummy_passthrough_card`, `edenred`, `gcash`, `getbalance`, `knet`, `kr_market`, `kriya`, `momo`, `mondu`, `netbanking`, `ng_bank_transfer`, `ng_bank`, `ng_card`, `ng_market`, `ng_ussd`, `ng_wallet`, `octopus`, `paper_check`, `sequra`, `shop_pay`, `south_korea_market`, `test_pay`, `truemoney`, `us_cash_voucher`, `vipps`, and `wero` on enums `PaymentIntentConfirmParams.allowedPaymentMethodTypes`, `PaymentIntentCreateParams.allowedPaymentMethodTypes`, and `PaymentIntentUpdateParams.allowedPaymentMethodTypes`
  * Add support for `customFields`, `description`, and `footer` on `Quote.invoice_settings`, `QuotePreviewSubscriptionSchedule.default_settings.invoice_settings`, `QuotePreviewSubscriptionSchedule.phases[].invoice_settings`, `SubscriptionSchedule.default_settings.invoice_settings`, and `SubscriptionSchedule.phases[].invoice_settings`
  * Add support for `paypay` on `SetupAttempt.payment_method_details`
  * Add support for new values `mass_transit_parking_tax` and `parking_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
  * Add support for `massTransitParkingTax` and `parkingTax` on `tax.Registration.country_options.us`
  * Add support for `giftCardBrand` on `terminal.ReaderCollectPaymentMethodParams.collect_config` and `terminal.ReaderProcessPaymentIntentParams.process_config`
  * Add support for `activateGiftCard`, `cashoutGiftCard`, `checkGiftCardBalance`, `deactivateGiftCard`, and `reloadGiftCard` on `terminal.Reader.action`
  * Add support for `statusTransitions` on `v2.billing.Contract`
  * ⚠️ Remove support for `oneTimeFees` on `v2.billing.ContractCreateParams` and `v2.billing.Contract`
  * ⚠️ Remove support for `statusDetails` on `v2.billing.Contract`
  * Add support for `id` and `priority` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[]`
  * ⚠️ Remove support for `pricingOverride` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[]`
  * ⚠️ Remove support for `tieringMode` and `tiers` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[].overwrite_price`, `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].overwrite_price`, `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].overwrite_price`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.overwrite_price`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.overwrite_price`
  * Add support for `multiplyPricing` on `v2.billing.Contract.pricing_overrides.data[]`, `v2.billing.ContractCreateParams.pricing_overrides[]`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add`
  * ⚠️ Remove support for `multiplier` on `v2.billing.Contract.pricing_overrides.data[]`, `v2.billing.ContractCreateParams.pricing_overrides[]`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add`
  * ⚠️ Change type of `v2.billing.Contract.pricing_overrides.data[].type`, `v2.billing.ContractCreateParams.pricing_overrides[].type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.type` from `literal('multiplier')` to `literal('multiply_pricing')`
  * Add support for `relatedNetworkObject` on `v2.core.AccountListParams` and `v2.core.Account`
  * Add support for `networkBusinessProfileWallet` on `v2.moneymanagement.PayoutMethod`
  * Add support for `stripeNetworkTransfer` on `v2.moneymanagement.ReceivedCredit`
  * Add support for new value `network_business_profile_wallet` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
  * ⚠️ Remove support for value `one_time_fees` from enums `v2.billing.ContractActivateParams.include`, `v2.billing.ContractCancelParams.include`, `v2.billing.ContractCreateParams.include`, `v2.billing.ContractListParams.include`, `v2.billing.ContractRetrieveParams.include`, and `v2.billing.ContractUpdateParams.include`
  * ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_lines[].ends_at.type`, `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].ends_at.type`, `v2.billing.ContractCreateParams.pricing_overrides[].ends_at.type`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].ends_at.type` from `enum('contract_end'|'timestamp')` to `literal('timestamp')`
  * ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].starts_at.type`, `v2.billing.ContractCreateParams.pricing_lines[].starts_at.type`, `v2.billing.ContractCreateParams.pricing_overrides[].starts_at.type`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].starts_at.type` from `enum('contract_start'|'timestamp')` to `literal('timestamp')`
  * Change `v2.billing.ContractCreateParams.pricing_overrides[].priority` and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.priority` to be optional
  * ⚠️ Change type of `v2.billing.ContractUpdateParams.pricing_line_actions[].add.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add.ends_at.type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].update.ends_at.type` from `enum('billing_period_end'|'timestamp')` to `literal('timestamp')`
  * ⚠️ Change type of `v2.billing.ContractUpdateParams.pricing_line_actions[].add.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add.starts_at.type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].update.starts_at.type` from `enum('billing_period_start'|'timestamp')` to `literal('timestamp')`
  * Add support for event notifications `V2BillingContractActivatedEvent`, `V2BillingContractCanceledEvent`, `V2BillingContractCreatedEvent`, `V2BillingContractEndedEvent`, and `V2BillingContractUpdatedEvent` with related object `v2.billing.Contract`

## 33.2.0-alpha.2 - 2026-07-01
This release changes the pinned API version to `2026-07-01.preview`.

* ⚠️ [#2241](https://github.com/stripe/stripe-java/pull/2241) Update generated code for private-preview
  * Add support for new resources `crypto.CustomerConsumerWallet`, `crypto.CustomerPaymentToken`, `crypto.Customer`, `crypto.OnrampSession`, and `crypto.OnrampTransactionLimits`
  * Add support for `list` and `retrieve` methods on resource `crypto.Customer`
  * Add support for `checkout`, `create`, `list`, `quote`, and `retrieve` methods on resource `crypto.OnrampSession`
  * Add support for `retrieve` method on resource `crypto.OnrampTransactionLimits`
  * Add support for `electronicCommerceIndicator` on `Charge.payment_method_details.card`
  * Add support for `amountReceived` and `amountRequested` on `Charge.payment_method_details.crypto`, `PaymentAttemptRecord.payment_method_details.crypto`, and `PaymentRecord.payment_method_details.crypto`
  * Add support for `fingerprint` on `Charge.payment_method_details.gift_card`, `PaymentAttemptRecord.payment_method_details.gift_card`, and `PaymentRecord.payment_method_details.gift_card`
  * Add support for `addressCollectionPrecision` on `checkout.SessionCreateParams.automatic_tax`
  * Add support for `subscription` on `checkout.Session.items[]`
  * ⚠️  Remove support for `deactivation` on `GiftCardOperation`
  * Add support for `merchantAmountExchangeRate` on `issuing.Authorization` and `issuing.Transaction`
  * Add support for `deviceId` on `issuing.Authorization.token_details.network_data.device` and `issuing.Token.network_data.device`
  * Add support for `program` on `issuing.Card`
  * Add support for `paymentMethodDetails` on `PaymentAttemptRecordReportFailedParams` and `PaymentRecordReportPaymentAttemptFailedParams`
  * Add support for `reason` on `PaymentAttemptRecordReportRefundParams` and `PaymentRecordReportRefundParams`
  * Add support for `amountReconciliation` on `PaymentIntent.payment_method_options.crypto`, `PaymentIntentConfirmParams.payment_method_options.crypto`, `PaymentIntentCreateParams.payment_method_options.crypto`, and `PaymentIntentUpdateParams.payment_method_options.crypto`
  * Add support for `connectPermissions` and `permissions` on `v2.iam.ApiKeyCreateParams`, `v2.iam.ApiKeyUpdateParams`, and `v2.iam.ApiKey`
  * Add support for `credit` on `v2.moneymanagement.FinancialAccount`
  * Add support for `account`, `issuingAuthorization`, `issuingDispute`, and `issuingTransaction` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
  * Add support for new value `credit` on enum `v2.moneymanagement.FinancialAccountListParams.types`
  * Change type of `v2.moneymanagement.FinancialAccountCreateParams.type` from `literal('storage')` to `enum('credit'|'storage')`
  * Add support for `expiresAt` on `v2.iam.ApiKeyCreateParams`

## 33.2.0-alpha.1 - 2026-06-24
This release changes the pinned API version to `2026-06-24.preview`.

* ⚠️ [#2238](https://github.com/stripe/stripe-java/pull/2238) Update generated code for private-preview
  * Add support for new resources `v2.billing.ContractPricingLineQuantityChange`, `v2.core.health.AlertHistoryEntry`, `v2.core.health.Alert`, `v2.moneymanagement.FinancialAddressDebitSimulation`, and `v2.moneymanagement.PayoutIntent`
  * ⚠️ Remove support for resource `v2.billing.ContractLicensePricingQuantityChange`
  * Add support for `report_offer_acceptance` method on resource `issuing.CreditUnderwritingRecord`
  * Add support for `provisional_credit` test helper method on resource `issuing.Dispute`
  * Add support for `report_early_fraud_warning` method on resource `PaymentAttemptRecord`
  * Add support for `search` method on resource `PaymentRecord`
  * Add support for `debit` method on resource `v2.moneymanagement.FinancialAddressDebitSimulation`
  * Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `v2.moneymanagement.PayoutIntent`
  * Add support for `list` and `retrieve` methods on resource `v2.core.health.Alert`
  * Add support for `delete` method on resource `v2.billing.Contract`
  * ⚠️ Remove support for `performanceLocationDetails` on `tax.TransactionLineItem`
  * Add support for `financialAccountsTransactions`, `financialAccounts`, and `recipientsList` on `AccountSession.components` and `AccountSessionCreateParams.components`
  * Add support for `location` and `reader` on `Charge.payment_method_details.gift_card`, `GiftCardOperation`, `PaymentAttemptRecord.payment_method_details.gift_card`, and `PaymentRecord.payment_method_details.gift_card`
  * Add support for `subscription` on `checkout.SessionCreateParams.items[]`
  * Add support for `items` on `checkout.Session`
  * Add support for `brand` on `checkout.Session.current_attempt.payment_method_details.card`
  * Add support for `networkData` on `issuing.AuthorizationCaptureParams` and `issuing.TransactionCreateForceCaptureParams`
  * Add support for `enrichedMerchantData` on `issuing.Authorization`
  * Add support for `availableBalance` and `currentBalance` on `issuing.Authorization.balance_response`
  * ⚠️ Remove support for `amount` on `issuing.Authorization.balance_response`
  * Add support for `decisionDeadlineUpdatedAt` on `issuing.CreditUnderwritingRecord`
  * Add support for `acquirerReferenceNumber` on `issuing.Transaction.network_data`
  * Change `PaymentAttemptRecordReportRefundParams.outcome` and `PaymentRecordReportRefundParams.outcome` to be optional
  * Add support for `tip` on `PaymentIntentCaptureParams.amount_details`, `PaymentIntentConfirmParams.amount_details`, `PaymentIntentCreateParams.amount_details`, `PaymentIntentDecrementAuthorizationParams.amount_details`, `PaymentIntentIncrementAuthorizationParams.amount_details`, and `PaymentIntentUpdateParams.amount_details`
  * ⚠️ Remove support for values `billing.alert.recovered` and `payment_intent.expired` from enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for `billingCycleAnchor` on `v2.billing.ContractCreateParams` and `v2.billing.Contract`
  * ⚠️ Remove support for `contractLineDetails`, `contractValueDetails`, and `licenseQuantities` on `v2.billing.Contract`
  * Add support for `billSettingsDetails` on `v2.billing.Contract.billing_settings` and `v2.billing.ContractCreateParams.billing_settings`
  * Add support for `billingProfileDetails` and `collectionSettingsDetails` on `v2.billing.Contract.billing_settings`
  * ⚠️ Remove support for `contractBillingDetails` on `v2.billing.Contract.billing_settings` and `v2.billing.ContractCreateParams.billing_settings`
  * ⚠️ Change type of `v2.billing.Contract.oneTimeFees` from `array(an object)` to `an object`
  * ⚠️ Change type of `v2.billing.Contract.pricingLines` from `array(an object)` to `an object`
  * ⚠️ Change type of `v2.billing.Contract.pricingOverrides` from `array(an object)` to `an object`
  * Add support for `mode` on `v2.commerce.ProductCatalogImport`
  * Add support for `moneyManager` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountUpdateParams.configuration`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * ⚠️ Remove support for `storer` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountUpdateParams.configuration`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * Add support for `sunbitPayments` on `v2.core.Account.configuration.merchant.capabilities`, `v2.core.AccountCreateParams.configuration.merchant.capabilities`, and `v2.core.AccountUpdateParams.configuration.merchant.capabilities`
  * Add support for `ach`, `becs`, `eft`, `fedwire`, `fps`, `npp`, `rtp`, `sepaCredit`, `sepaInstant`, and `swift` on `v2.core.Account.configuration.recipient.capabilities.bank_accounts`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts`
  * Add support for `consumerMoneyManager` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * Add support for `cryptoMoneyManager` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * ⚠️ Remove support for `consumerStorer` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * ⚠️ Remove support for `cryptoStorer` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * ⚠️ Remove support for `maximumRps` on `v2.core.BatchJobCreateParams` and `v2.core.BatchJob`
  * Add support for `bic` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
  * ⚠️ Remove support for `swiftCode` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
  * Add support for `attachment` on `v2.moneymanagement.OutboundPayment.delivery_options.paper_check` and `v2.moneymanagement.OutboundPaymentCreateParams.delivery_options.paper_check`
  * Add support for `processing` on `v2.moneymanagement.OutboundPayment.status_details` and `v2.moneymanagement.OutboundTransfer.status_details`
  * Add support for `payoutMethodOptions` on `v2.moneymanagement.OutboundPayment.to`, `v2.moneymanagement.OutboundPaymentCreateParams.to`, `v2.moneymanagement.OutboundTransfer.to`, and `v2.moneymanagement.OutboundTransferCreateParams.to`
  * Add support for `accountHolderName` on `v2.moneymanagement.ReceivedCredit.bank_transfer.us_bank_account`
  * Add support for `returned` on `v2.moneymanagement.ReceivedDebit.status_details`
  * Add support for `returnedAt` on `v2.moneymanagement.ReceivedDebit.status_transitions`
  * Add support for `payoutIntent` on `v2.moneymanagement.OutboundPaymentCreateParams`
  * Add support for `statuses` on `v2.moneymanagement.FinancialAccountListParams`
  * ⚠️ Remove support for `status` on `v2.moneymanagement.FinancialAccountListParams`
  * Change `v2.core.BatchJobCreateParams.metadata` to be optional
  * Add support for new value `money_manager` on enums `EventsV2CoreAccountLinkReturnedEvent.configurations`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding.configurations`, and `v2.core.AccountLinkCreateParams.use_case.account_update.configurations`
  * ⚠️ Add support for new value `money_manager` on enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
  * ⚠️ Remove support for value `storer` from enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
  * ⚠️ Add support for new value `configuration.money_manager` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * ⚠️ Remove support for value `configuration.storer` from enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * Add support for `include` on `v2.billing.ContractListParams`
  * ⚠️ Remove support for `contractLines` on `v2.billing.ContractCreateParams`
  * ⚠️ Remove support for `licenseQuantityActions` on `v2.billing.ContractCreateParams` and `v2.billing.ContractUpdateParams`
  * ⚠️ Add support for `billingProfileDetails` and `collectionSettingsDetails` on `v2.billing.ContractCreateParams.billing_settings`
  * ⚠️ Add support for new value `billing_settings` on enums `v2.billing.ContractActivateParams.include`, `v2.billing.ContractCancelParams.include`, `v2.billing.ContractCreateParams.include`, `v2.billing.ContractRetrieveParams.include`, and `v2.billing.ContractUpdateParams.include`
  * ⚠️ Remove support for values `contract_line_details` and `license_quantities` from enums `v2.billing.ContractActivateParams.include`, `v2.billing.ContractCancelParams.include`, `v2.billing.ContractCreateParams.include`, `v2.billing.ContractRetrieveParams.include`, and `v2.billing.ContractUpdateParams.include`
  * ⚠️ Add support for `amount`, `billAt`, and `product` on `v2.billing.ContractCreateParams.one_time_fees[]`
  * Add support for `lookupKey` on `v2.billing.ContractCreateParams.one_time_fees[]`
  * ⚠️ Remove support for `billSchedule`, `billableItemType`, and `productDetails` on `v2.billing.ContractCreateParams.one_time_fees[]`
  * Add support for `pricingOverrides` and `quantityChanges` on `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details` and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details`
  * ⚠️ Remove support for `quantity` on `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details` and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details`
  * ⚠️ Remove support for `overwritePrice` on `v2.billing.ContractCreateParams.pricing_overrides[]`
  * Add support for `pricingLineIds` and `pricingLineLookupKeys` on `v2.billing.ContractCreateParams.pricing_overrides[].multiplier.criteria[]` and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.multiplier.criteria[]`
  * ⚠️ Remove support for `billableItemIds`, `billableItemLookupKeys`, `billableItemTypes`, `metadataConditions`, and `rateCardIds` on `v2.billing.ContractCreateParams.pricing_overrides[].multiplier.criteria[]` and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.multiplier.criteria[]`
  * ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_overrides[].type` and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.type` from `enum('multiplier'|'overwrite_price')` to `literal('multiplier')`
  * Change `v2.billing.ContractCreateParams.pricingOverrides` to be optional
  * Change `v2.billing.ContractCreateParams.pricing_overrides[].multiplier.criteria` to be optional
  * Add support for `pricing` on `v2.billing.ContractUpdateParams.pricing_line_actions[].update`
  * ⚠️ Remove support for `price` on `v2.billing.ContractUpdateParams.pricing_override_actions[].add.overwrite_price`
  * Add support for `cancelPricingLines` and `prorationBehavior` on `v2.billing.ContractCancelParams`
  * Add support for new value `sunbit_payments` on enum `EventsV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent.updatedCapability`
  * Add support for new values `bank_accounts.ach`, `bank_accounts.becs`, `bank_accounts.eft`, `bank_accounts.fedwire`, `bank_accounts.fps`, `bank_accounts.npp`, `bank_accounts.rtp`, `bank_accounts.sepa_credit`, `bank_accounts.sepa_instant`, and `bank_accounts.swift` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
  * Add support for event notifications `V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEvent` with related object `v2.core.Account`
  * Add support for event notifications `V2MoneyManagementDebitDisputeFailedEvent`, `V2MoneyManagementDebitDisputeSubmittedEvent`, and `V2MoneyManagementDebitDisputeSucceededEvent` with related object `v2.moneymanagement.DebitDispute`
  * Add support for event notification `V2MoneyManagementOutboundPaymentUnderReviewEvent` with related object `v2.moneymanagement.OutboundPayment`
  * Add support for event notification `V2MoneyManagementOutboundTransferUnderReviewEvent` with related object `v2.moneymanagement.OutboundTransfer`
  * ⚠️ Remove support for event notifications `V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationStorerUpdatedEvent` with related object `v2.core.Account`

## 33.1.0-alpha.2 - 2026-06-17
* ⚠️ [#2235](https://github.com/stripe/stripe-java/pull/2235) Update generated code for private-preview
  * Add support for `retrieve` method on resource `radar.CustomerEvaluation`
  * Add support for `disableStripeUserAuthentication` on `AccountSession.components.bills.features`
  * Add support for `tamara` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, and `sharedpayment.GrantedToken.payment_method_details`
  * Add support for `status` on `Charge.payment_method_details.card.account_funding`
  * ⚠️ Remove support for `processedTransactionType` on `Charge.payment_method_details.card.account_funding`
  * Add support for `items` on `checkout.SessionCreateParams`
  * ⚠️ Remove support for `brand` on `checkout.Session.current_attempt.payment_method_details.card`
  * Add support for new value `tamara` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * ⚠️ Remove support for `first6` on `ConfirmationToken.payment_method_preview.gift_card`, `PaymentMethod.gift_card`, and `sharedpayment.GrantedToken.payment_method_details.gift_card`
  * Add support for new value `tamara` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `fingerprint` on `GiftCard`
  * Add support for `blik` on `Mandate.payment_method_details`
  * Add support for `buyerId` on `Order.payment.settings.payment_method_options.wechat_pay`, `OrderCreateParams.payment.settings.payment_method_options.wechat_pay`, `OrderUpdateParams.payment.settings.payment_method_options.wechat_pay`, `PaymentIntent.payment_method_options.wechat_pay`, `PaymentIntentConfirmParams.payment_method_options.wechat_pay`, `PaymentIntentCreateParams.payment_method_options.wechat_pay`, and `PaymentIntentUpdateParams.payment_method_options.wechat_pay`
  * Add support for new value `mini_program` on enums `OrderCreateParams.payment.settings.payment_method_options.wechat_pay.client`, `OrderUpdateParams.payment.settings.payment_method_options.wechat_pay.client`, `PaymentIntentConfirmParams.payment_method_options.wechat_pay.client`, `PaymentIntentCreateParams.payment_method_options.wechat_pay.client`, and `PaymentIntentUpdateParams.payment_method_options.wechat_pay.client`
  * Add support for `paymentMethodDetails` on `PaymentAttemptRecordReportGuaranteedParams` and `PaymentRecordReportPaymentAttemptGuaranteedParams`
  * Add support for `failed` and `refundGroup` on `PaymentAttemptRecordReportRefundParams` and `PaymentRecordReportRefundParams`
  * Change type of `PaymentAttemptRecordReportRefundParams.outcome` and `PaymentRecordReportRefundParams.outcome` from `literal('refunded')` to `enum('failed'|'refunded')`
  * Add support for new value `tamara` on enums `PaymentIntentConfirmParams.allowedPaymentMethodTypes`, `PaymentIntentCreateParams.allowedPaymentMethodTypes`, and `PaymentIntentUpdateParams.allowedPaymentMethodTypes`
  * Add support for new value `tamara` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
  * Add support for `beneficiaryDetails` on `PaymentIntent.payment_details.money_services`, `PaymentIntentConfirmParams.payment_details.money_services`, `PaymentIntentCreateParams.payment_details.money_services`, and `PaymentIntentUpdateParams.payment_details.money_services`
  * ⚠️ Remove support for `beneficiaryAccount` and `beneficiaryDetails` on `PaymentIntent.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_details.money_services.account_funding`
  * ⚠️ Remove support for `senderAccount` on `PaymentIntentConfirmParams.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_details.money_services.account_funding`
  * Add support for `givenName` and `surname` on `PaymentIntent.payment_details.money_services.account_funding.sender_details`, `PaymentIntentConfirmParams.payment_details.money_services.account_funding.sender_details`, `PaymentIntentCreateParams.payment_details.money_services.account_funding.sender_details`, and `PaymentIntentUpdateParams.payment_details.money_services.account_funding.sender_details`
  * ⚠️ Remove support for `name` on `PaymentIntent.payment_details.money_services.account_funding.sender_details`, `PaymentIntentConfirmParams.payment_details.money_services.account_funding.sender_details`, `PaymentIntentCreateParams.payment_details.money_services.account_funding.sender_details`, and `PaymentIntentUpdateParams.payment_details.money_services.account_funding.sender_details`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.card.captureMethod`, `PaymentIntentCreateParams.payment_method_options.card.captureMethod`, and `PaymentIntentUpdateParams.payment_method_options.card.captureMethod` from `literal('manual')` to `enum('automatic_delayed'|'manual')`
  * ⚠️ Remove support for `wallet` on `PaymentIntentConfirmParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentUpdateParams.payment_method_options.card.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_method_options.card_present.payment_details.money_services.account_funding`
  * Add support for new value `automatic_delayed` on enums `PaymentIntentConfirmParams.payment_method_options.card_present.captureMethod`, `PaymentIntentCreateParams.payment_method_options.card_present.captureMethod`, and `PaymentIntentUpdateParams.payment_method_options.card_present.captureMethod`
  * Add support for `transactionVerificationOptions` on `PaymentIntent.payment_method_options.crypto`, `PaymentIntentConfirmParams.payment_method_options.crypto`, `PaymentIntentCreateParams.payment_method_options.crypto`, and `PaymentIntentUpdateParams.payment_method_options.crypto`
  * Add support for new values `ethereum` and `polygon` on enums `PaymentIntentConfirmParams.payment_method_options.crypto.deposit_options.networks`, `PaymentIntentCreateParams.payment_method_options.crypto.deposit_options.networks`, and `PaymentIntentUpdateParams.payment_method_options.crypto.deposit_options.networks`
  * Add support for new values `ethereum` and `polygon` on enum `PaymentIntentSimulateCryptoDepositParams.network`
  * Change type of `PaymentIntentSimulateCryptoDepositParams.tokenCurrency` from `literal('usdc')` to `enum('usdc'|'usdg'|'usdp')`
  * Add support for `forcedCapture` on `PaymentIntent.advanced_feature_details`
  * Add support for `wechatPayHandleAppRedirect` on `PaymentIntent.next_action` and `SetupIntent.next_action`
  * Add support for `ethereum` and `polygon` on `PaymentIntent.next_action.crypto_display_details.deposit_addresses`
  * ⚠️ Change type of `PaymentIntent.next_action.crypto_display_details.deposit_addresses.base.supported_tokens[].tokenCurrency`, `PaymentIntent.next_action.crypto_display_details.deposit_addresses.solana.supported_tokens[].tokenCurrency`, and `PaymentIntent.next_action.crypto_display_details.deposit_addresses.tempo.supported_tokens[].tokenCurrency` from `literal('usdc')` to `enum('usdc'|'usdg'|'usdp')`
  * Add support for `beneficiaryAccount` on `PaymentIntent.payment_details.money_services`
  * ⚠️ Change type of `PaymentIntent.payment_method_options.card.captureMethod` from `literal('manual')` to `enum('automatic_delayed'|'manual')`
  * Change type of `PaymentLocationUpdateParams.business_registration.siret` from `string` to `emptyable(string)`
  * Add support for `card` on `PaymentRecordReportPaymentAttemptParams.payment_method_details` and `PaymentRecordReportPaymentParams.payment_method_details`
  * Change type of `PaymentRecordReportPaymentAttemptParams.payment_method_details.type` and `PaymentRecordReportPaymentParams.payment_method_details.type` from `literal('custom')` to `enum('card'|'custom')`
  * Add support for `managedPayments` on `Product`
  * Add support for `paymentAttemptRecord` on `RefundCreateParams` and `RefundListParams`
  * Add support for `paymentRecord` on `RefundListParams`
  * Add support for `protections` on `v2.core.Account.configuration.card_creator.capabilities.commercial.celtic.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.celtic.spend_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.prepaid_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.spend_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.fifth_third.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.lead.prepaid_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe.prepaid_card`, `v2.core.Account.configuration.card_creator.capabilities.consumer.celtic.revolving_credit_card`, `v2.core.Account.configuration.card_creator.capabilities.consumer.cross_river_bank.prepaid_card`, `v2.core.Account.configuration.card_creator.capabilities.consumer.lead.debit_card`, `v2.core.Account.configuration.card_creator.capabilities.consumer.lead.prepaid_card`, `v2.core.Account.configuration.customer.capabilities.automatic_indirect_tax`, `v2.core.Account.configuration.merchant.capabilities.ach_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.acss_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.affirm_payments`, `v2.core.Account.configuration.merchant.capabilities.afterpay_clearpay_payments`, `v2.core.Account.configuration.merchant.capabilities.alma_payments`, `v2.core.Account.configuration.merchant.capabilities.amazon_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.au_becs_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.bacs_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.bancontact_payments`, `v2.core.Account.configuration.merchant.capabilities.blik_payments`, `v2.core.Account.configuration.merchant.capabilities.boleto_payments`, `v2.core.Account.configuration.merchant.capabilities.card_payments`, `v2.core.Account.configuration.merchant.capabilities.cartes_bancaires_payments`, `v2.core.Account.configuration.merchant.capabilities.cashapp_payments`, `v2.core.Account.configuration.merchant.capabilities.eps_payments`, `v2.core.Account.configuration.merchant.capabilities.fpx_payments`, `v2.core.Account.configuration.merchant.capabilities.gb_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.grabpay_payments`, `v2.core.Account.configuration.merchant.capabilities.ideal_payments`, `v2.core.Account.configuration.merchant.capabilities.jcb_payments`, `v2.core.Account.configuration.merchant.capabilities.jp_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.kakao_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.klarna_payments`, `v2.core.Account.configuration.merchant.capabilities.konbini_payments`, `v2.core.Account.configuration.merchant.capabilities.kr_card_payments`, `v2.core.Account.configuration.merchant.capabilities.link_payments`, `v2.core.Account.configuration.merchant.capabilities.mobilepay_payments`, `v2.core.Account.configuration.merchant.capabilities.multibanco_payments`, `v2.core.Account.configuration.merchant.capabilities.mx_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.naver_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.oxxo_payments`, `v2.core.Account.configuration.merchant.capabilities.p24_payments`, `v2.core.Account.configuration.merchant.capabilities.pay_by_bank_payments`, `v2.core.Account.configuration.merchant.capabilities.payco_payments`, `v2.core.Account.configuration.merchant.capabilities.paynow_payments`, `v2.core.Account.configuration.merchant.capabilities.promptpay_payments`, `v2.core.Account.configuration.merchant.capabilities.revolut_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.samsung_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.sepa_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.sepa_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.stripe_balance.payouts`, `v2.core.Account.configuration.merchant.capabilities.swish_payments`, `v2.core.Account.configuration.merchant.capabilities.twint_payments`, `v2.core.Account.configuration.merchant.capabilities.us_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.zip_payments`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts.instant`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts.local`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts.wire`, `v2.core.Account.configuration.recipient.capabilities.cards`, `v2.core.Account.configuration.recipient.capabilities.crypto_wallets`, `v2.core.Account.configuration.recipient.capabilities.paper_checks`, `v2.core.Account.configuration.recipient.capabilities.stripe_balance.payouts`, `v2.core.Account.configuration.recipient.capabilities.stripe_balance.stripe_transfers`, `v2.core.Account.configuration.storer.capabilities.consumer.holds_currencies.usd`, `v2.core.Account.configuration.storer.capabilities.financial_addresses.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.financial_addresses.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.eur`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.gbp`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.usd`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.usdc`, `v2.core.Account.configuration.storer.capabilities.inbound_transfers.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.cards`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.financial_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.paper_checks`, `v2.core.Account.configuration.storer.capabilities.outbound_transfers.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_transfers.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.outbound_transfers.financial_accounts`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.celtic.charge_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.celtic.spend_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.cross_river_bank.charge_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.cross_river_bank.prepaid_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.cross_river_bank.spend_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.fifth_third.charge_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.lead.prepaid_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.stripe.charge_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.stripe.prepaid_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.consumer.celtic.revolving_credit_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.consumer.cross_river_bank.prepaid_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.consumer.lead.debit_card`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.consumer.lead.prepaid_card`, `v2.core.AccountCreateParams.configuration.customer.capabilities.automatic_indirect_tax`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.ach_debit_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.acss_debit_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.affirm_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.afterpay_clearpay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.alma_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.amazon_pay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.au_becs_debit_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.bacs_debit_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.bancontact_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.blik_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.boleto_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.card_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.cartes_bancaires_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.cashapp_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.eps_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.fpx_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.gb_bank_transfer_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.grabpay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.ideal_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.jcb_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.jp_bank_transfer_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.kakao_pay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.klarna_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.konbini_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.kr_card_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.link_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.mobilepay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.multibanco_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.mx_bank_transfer_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.naver_pay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.oxxo_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.p24_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.pay_by_bank_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.payco_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.paynow_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.promptpay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.revolut_pay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.samsung_pay_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.sepa_bank_transfer_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.sepa_debit_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.swish_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.twint_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.us_bank_transfer_payments`, `v2.core.AccountCreateParams.configuration.merchant.capabilities.zip_payments`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts.instant`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts.local`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts.wire`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.cards`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.crypto_wallets`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.paper_checks`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.stripe_balance.stripe_transfers`, `v2.core.AccountCreateParams.configuration.storer.capabilities.consumer.holds_currencies.usd`, `v2.core.AccountCreateParams.configuration.storer.capabilities.financial_addresses.bank_accounts`, `v2.core.AccountCreateParams.configuration.storer.capabilities.financial_addresses.crypto_wallets`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies.eur`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies.gbp`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies.usd`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies.usdc`, `v2.core.AccountCreateParams.configuration.storer.capabilities.inbound_transfers.bank_accounts`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments.bank_accounts`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments.cards`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments.crypto_wallets`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments.financial_accounts`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments.paper_checks`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_transfers.bank_accounts`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_transfers.crypto_wallets`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_transfers.financial_accounts`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.celtic.charge_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.celtic.spend_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.cross_river_bank.charge_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.cross_river_bank.prepaid_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.cross_river_bank.spend_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.fifth_third.charge_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.lead.prepaid_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.stripe.charge_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.stripe.prepaid_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.consumer.celtic.revolving_credit_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.consumer.cross_river_bank.prepaid_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.consumer.lead.debit_card`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.consumer.lead.prepaid_card`, `v2.core.AccountUpdateParams.configuration.customer.capabilities.automatic_indirect_tax`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.ach_debit_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.acss_debit_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.affirm_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.afterpay_clearpay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.alma_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.amazon_pay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.au_becs_debit_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.bacs_debit_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.bancontact_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.blik_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.boleto_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.card_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.cartes_bancaires_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.cashapp_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.eps_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.fpx_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.gb_bank_transfer_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.grabpay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.ideal_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.jcb_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.jp_bank_transfer_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.kakao_pay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.klarna_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.konbini_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.kr_card_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.link_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.mobilepay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.multibanco_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.mx_bank_transfer_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.naver_pay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.oxxo_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.p24_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.pay_by_bank_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.payco_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.paynow_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.promptpay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.revolut_pay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.samsung_pay_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.sepa_bank_transfer_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.sepa_debit_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.swish_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.twint_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.us_bank_transfer_payments`, `v2.core.AccountUpdateParams.configuration.merchant.capabilities.zip_payments`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts.instant`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts.local`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts.wire`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.cards`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.crypto_wallets`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.paper_checks`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities.stripe_balance.stripe_transfers`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.consumer.holds_currencies.usd`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.financial_addresses.bank_accounts`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.financial_addresses.crypto_wallets`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies.eur`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies.gbp`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies.usd`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies.usdc`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.inbound_transfers.bank_accounts`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments.bank_accounts`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments.cards`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments.crypto_wallets`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments.financial_accounts`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments.paper_checks`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_transfers.bank_accounts`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_transfers.crypto_wallets`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_transfers.financial_accounts`

## 33.1.0-alpha.1 - 2026-06-10
This release changes the pinned API version to `2026-06-10.preview`.

* ⚠️ [#2233](https://github.com/stripe/stripe-java/pull/2233) Update generated code for private-preview
  * Add support for new resources `GiftCardOperation`, `GiftCard`, and `TaxFund`
  * Add support for `retrieve` method on resource `GiftCardOperation`
  * Add support for `activate`, `cashout`, `check_balance`, `create`, `reload`, `retrieve`, and `void_operation` methods on resource `GiftCard`
  * Add support for `list` and `retrieve` methods on resource `TaxFund`
  * Add support for `update_crypto_refund_address` method on resource `PaymentIntent`
  * Add support for `performanceLocationDetails` on `tax.CalculationCreateParams.line_items[]`, `tax.CalculationLineItem`, and `tax.TransactionLineItem`
  * ⚠️ Remove support for `moneyServices` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, and `PaymentIntentCaptureParams.payment_details`
  * Add support for `frMealVoucher` on `Charge.payment_method_details.card.benefits`
  * Add support for `multicapture` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
  * Add support for `pix` on `checkout.Session.current_attempt.payment_method_details`
  * Add support for `provisionalCredit` on `issuing.DisputeUpdateParams` and `issuing.Dispute`
  * Add support for `reason` on `PaymentAttemptRecordReportCanceledParams` and `PaymentRecordReportPaymentAttemptCanceledParams`
  * Add support for `fiservValuelink`, `givex`, and `svs` on `PaymentAttemptRecord.processor_details` and `PaymentRecord.processor_details`
  * ⚠️ Change type of `PaymentAttemptRecord.processor_details.type` and `PaymentRecord.processor_details.type` from `literal('custom')` to `enum('custom'|'fiserv_valuelink'|'givex'|'svs')`
  * Add support for `captureBy` and `captureDelay` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card`
  * ⚠️ Remove support for `liquidAsset` on `PaymentIntentConfirmParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentUpdateParams.payment_method_options.card.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_method_options.card_present.payment_details.money_services.account_funding`
  * Add support for `requestMulticapture` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
  * Add support for new value `transaction_verification` on enums `PaymentIntentConfirmParams.payment_method_options.crypto.mode`, `PaymentIntentCreateParams.payment_method_options.crypto.mode`, and `PaymentIntentUpdateParams.payment_method_options.crypto.mode`
  * Add support for `ignoreApplicationFee`, `ignoreTransferData`, and `requestPartialAuthorization` on `PaymentIntentConfirmParams.payment_method_options.gift_card`, `PaymentIntentCreateParams.payment_method_options.gift_card`, and `PaymentIntentUpdateParams.payment_method_options.gift_card`
  * Change `PaymentIntentConfirmParams.payment_details.benefit.fr_meal_voucher.siret`, `PaymentIntentCreateParams.payment_details.benefit.fr_meal_voucher.siret`, `PaymentIntentUpdateParams.payment_details.benefit.fr_meal_voucher.siret`, `SetupIntentConfirmParams.setup_details.benefit.fr_meal_voucher.siret`, `SetupIntentCreateParams.setup_details.benefit.fr_meal_voucher.siret`, and `SetupIntentUpdateParams.setup_details.benefit.fr_meal_voucher.siret` to be optional
  * Add support for `latestPaymentAttemptRecord` and `paymentRecord` on `PaymentIntent`
  * ⚠️ Remove support for `reauthorization` and `reauthorizeBefore` on `PaymentIntent.advanced_feature_details`
  * Add support for `refundAddress` on `PaymentIntent.next_action.crypto_display_details.deposit_addresses.base`, `PaymentIntent.next_action.crypto_display_details.deposit_addresses.solana`, and `PaymentIntent.next_action.crypto_display_details.deposit_addresses.tempo`
  * Add support for `location` on `PaymentIntent.payment_details` and `SetupIntent.setup_details`
  * Add support for `data` on `radar.AccountEvaluationCreateParams.login_initiated.client_device_metadata_details`, `radar.AccountEvaluationCreateParams.registration_initiated.client_device_metadata_details`, and `radar.CustomerEvaluationCreateParams.evaluation_context[].client_details`
  * Change `radar.AccountEvaluationCreateParams.login_initiated.client_device_metadata_details.radarSession`, `radar.AccountEvaluationCreateParams.registration_initiated.client_device_metadata_details.radarSession`, and `radar.CustomerEvaluationCreateParams.evaluation_context[].client_details.radarSession` to be optional
  * ⚠️ Change type of `v2.core.FeeBatch.adjustments.taxAdjustment` from `amount` to `an object`
  * ⚠️ Change type of `v2.core.FeeBatch.amount`, `v2.core.FeeBatch.collection_records[].amount`, `v2.core.FeeBatch.collection_records[].tax.amount`, `v2.core.FeeBatch.tax.amount`, `v2.core.FeeEntry.amount`, and `v2.core.FeeEntry.tax.amount` from `amount` to `an object`
  * Add support for `taxFund` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
  * Add support for new value `promotion` on enum `v2.commerce.ProductCatalogImportCreateParams.feedType`

## 32.3.0-alpha.2 - 2026-06-03
This release changes the pinned API version to `2026-06-03.preview`.

* ⚠️ [#2231](https://github.com/stripe/stripe-java/pull/2231) Update generated code for private-preview
  * Add support for new resources `delegatedcheckout.OrderEvent`, `delegatedcheckout.Order`, `v2.billing.ContractLicensePricingQuantityChange`, `v2.billing.Contract`, and `v2.signals.AccountSignal`
  * Add support for `retrieve` method on resource `delegatedcheckout.Order`
  * Add support for `list_orders` method on resource `delegatedcheckout.RequestedSession`
  * Add support for `list` and `retrieve` methods on resource `v2.signals.AccountSignal`
  * Add support for `activate`, `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `v2.billing.Contract`
  * Add support for `birthAddress` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `Person`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
  * Change type of `ChargeCaptureParams.payment_details.money_services.transactionType`, `ChargeUpdateParams.payment_details.money_services.transactionType`, `PaymentIntentCaptureParams.payment_details.money_services.transactionType`, `PaymentIntentConfirmParams.payment_details.money_services.transactionType`, `PaymentIntentCreateParams.payment_details.money_services.transactionType`, and `PaymentIntentUpdateParams.payment_details.money_services.transactionType` from `literal('account_funding')` to `enum('account_funding'|'debt_repayment')`
  * Add support for `provisioningDecision` and `tokenType` on `issuing.Authorization.token_details` and `issuing.Token`
  * Add support for `tokenDecisionRecommendation` on `issuing.Authorization.token_details.network_data.visa` and `issuing.Token.network_data.visa`
  * Add support for `language` on `issuing.Token.network_data.device`
  * Add support for `digitalAssetCategory` on `PaymentIntentConfirmParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentUpdateParams.payment_method_options.card.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_method_options.card_present.payment_details.money_services.account_funding`
  * Add support for `staticAddress` on `PaymentIntent.payment_method_options.crypto.deposit_options`, `PaymentIntentConfirmParams.payment_method_options.crypto.deposit_options`, `PaymentIntentCreateParams.payment_method_options.crypto.deposit_options`, and `PaymentIntentUpdateParams.payment_method_options.crypto.deposit_options`
  * Add support for `paymentReference` on `PaymentIntentCreateParams.payments_orchestration`
  * ⚠️ Remove support for `paymentDetails` on `PaymentIntentCreateParams.payments_orchestration`
  * ⚠️ Change type of `PaymentIntent.payment_details.money_services.transactionType` from `literal('account_funding')` to `enum('account_funding'|'debt_repayment')`
  * Add support for `endingBefore`, `limit`, and `startingAfter` on `PaymentLocationListParams`
  * ⚠️ Change `radar.IssuingAuthorizationEvaluationCreateParams.card_details.last4` to be required
  * Add support for `schema` on `v2.data.reporting.QueryRun.result.file` and `v2.reporting.ReportRun.result.file`
  * Add support for `include` on `v2.data.reporting.QueryRunRetrieveParams` and `v2.reporting.ReportRunRetrieveParams`
  * Add support for `requirementsCollector` on `v2.core.AccountCreateParams.defaults.responsibilities` and `v2.core.AccountUpdateParams.defaults.responsibilities`
  * Add support for event notification `V2SignalsAccountSignalMerchantDelinquencyReadyEvent` with related object `v2.signals.AccountSignal`
  * ⚠️ Renames v2.PaymentService to v2.PaymentsService to more closely match our API naming

## 32.3.0-alpha.1 - 2026-05-27
This release changes the pinned API version to `2026-05-27.preview`.

* ⚠️ [#2221](https://github.com/stripe/stripe-java/pull/2221) Update generated code for private-preview
  * Change type of `billing.AlertCreateParams.spend_threshold.groupBy` from `literal('pricing_plan_subscription')` to `enum('billing_cadence'|'pricing_plan_subscription')`
  * ⚠️ Change type of `billing.Alert.spend_threshold.groupBy` from `literal('pricing_plan_subscription')` to `enum('billing_cadence'|'pricing_plan_subscription')`
  * Add support for `wechatPay` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for `giftCard` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
  * Add support for `paymentDetails` on `PaymentIntentCreateParams.payments_orchestration`
  * Add support for `enabled` on `PaymentIntent.payment_details.benefit.fr_meal_voucher` and `SetupIntent.setup_details.benefit.fr_meal_voucher`
  * ⚠️ Remove support for `loginFailed`, `registrationFailed`, `registrationSuccess`, and `type` on `radar.CustomerEvaluationUpdateParams`
  * ⚠️ Remove support for `latestVersion` on `v2.billing.LicenseFee`, `v2.billing.PricingPlan`, and `v2.billing.RateCard`
  * ⚠️ Remove support for `serviceIntervalCount` and `serviceInterval` on `v2.billing.LicenseFee` and `v2.billing.RateCard`
  * Add support for `debitAgreement` on `v2.moneymanagement.ReceivedCredit.stripe_balance_payment`
  * Add support for new value `chaps` on enum `v2.FinancialAddressCreditSimulationCreditParams.network`
  * Add support for `canonicalPath` on `EventsV2CoreHealthTrafficVolumeDropFiringEvent.impact` and `EventsV2CoreHealthTrafficVolumeDropResolvedEvent.impact`
  * Add support for snapshot event `payment_intent.expired` with resource `PaymentIntent`
  * Add support for event notifications `V2CoreHealthElementsErrorFiringEvent`, `V2CoreHealthElementsErrorResolvedEvent`, `V2CoreHealthInvoiceCountDroppedFiringEvent`, and `V2CoreHealthInvoiceCountDroppedResolvedEvent`

## 32.2.0-alpha.6 - 2026-05-20
* ⚠️ [#2217](https://github.com/stripe/stripe-java/pull/2217) Update generated code for private-preview
  * Add support for new resource `PaymentLocationCapability`
  * Add support for `list`, `retrieve`, and `update` methods on resource `PaymentLocationCapability`
  * Add support for `close` and `simulate_network_lifecycle_dispute_response` test helper methods on resource `issuing.Dispute`
  * Change type of `delegatedcheckout.RequestedSessionUpdateParams.discounts.codes` from `array(string)` to `emptyable(array(string))`
  * ⚠️ Remove support for `creditedItems` on `InvoiceItem.proration_details`
  * Add support for `balanceResponse` on `issuing.Authorization`
  * Add support for `paymentEvaluations` on `PaymentAttemptRecordReportCanceledParams`, `PaymentAttemptRecordReportFailedParams`, `PaymentRecordReportPaymentAttemptCanceledParams`, `PaymentRecordReportPaymentAttemptFailedParams`, `PaymentRecordReportPaymentAttemptParams.failed`, and `PaymentRecordReportPaymentParams.failed`
  * Add support for `enabled` on `PaymentIntentConfirmParams.payment_details.benefit.fr_meal_voucher`, `PaymentIntentCreateParams.payment_details.benefit.fr_meal_voucher`, `PaymentIntentUpdateParams.payment_details.benefit.fr_meal_voucher`, `SetupIntentConfirmParams.setup_details.benefit.fr_meal_voucher`, `SetupIntentCreateParams.setup_details.benefit.fr_meal_voucher`, and `SetupIntentUpdateParams.setup_details.benefit.fr_meal_voucher`
  * Add support for `advancedFeatureDetails` and `allowedPaymentMethodTypes` on `PaymentIntent`
  * Change type of `PaymentLocationUpdateParams.address.city` from `string` to `emptyable(string)`
  * Change type of `PaymentLocationUpdateParams.address.line1` from `string` to `emptyable(string)`
  * Change type of `PaymentLocationUpdateParams.address.line2` from `string` to `emptyable(string)`
  * Change type of `PaymentLocationUpdateParams.address.postalCode` from `string` to `emptyable(string)`
  * Change type of `PaymentLocationUpdateParams.address.state` from `string` to `emptyable(string)`
  * Change `SubscriptionPauseParams.type` to be optional
  * ⚠️ Remove support for `paymentBehavior` on `SubscriptionResumeParams`
  * ⚠️ Remove support for `statusDetails` on `Subscription`

## 32.2.0-alpha.5 - 2026-05-13
* ⚠️ [#2216](https://github.com/stripe/stripe-java/pull/2216) Update generated code for private-preview
  * Add support for new resources `v2.core.FeeBatch`, `v2.core.FeeEntry`, `v2.moneymanagement.DebitDispute`, and `v2.moneymanagement.FinancialAccountStatement`
  * Add support for `simulate_network_lifecycle_pre_arbitration_response` and `simulate_network_lifecycle_pre_arbitration_submission` test helper methods on resource `issuing.Dispute`
  * Add support for `list` method on resource `PaymentLocation`
  * Add support for `list` and `retrieve` methods on resources `v2.core.FeeBatch`, `v2.core.FeeEntry`, and `v2.moneymanagement.FinancialAccountStatement`
  * Add support for `create`, `list`, and `retrieve` methods on resource `v2.moneymanagement.DebitDispute`
  * Add support for `discounts` on `delegatedcheckout.RequestedSessionCreateParams`, `delegatedcheckout.RequestedSessionUpdateParams`, and `delegatedcheckout.RequestedSession`
  * Add support for `amountSale` on `delegatedcheckout.RequestedSession.line_item_details[]` and `delegatedcheckout.RequestedSession.total_details`
  * Add support for `amountDiscount` and `breakdown` on `delegatedcheckout.RequestedSession.total_details`
  * ⚠️ Remove support for `checkDepositAddress` on `Invoice.payment_settings.payment_method_options.check_scan`, `InvoiceCreateParams.payment_settings.payment_method_options.check_scan`, `InvoiceUpdateParams.payment_settings.payment_method_options.check_scan`, `QuotePreviewInvoice.payment_settings.payment_method_options.check_scan`, `Subscription.payment_settings.payment_method_options.check_scan`, `SubscriptionCreateParams.payment_settings.payment_method_options.check_scan`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.check_scan`
  * Add support for `paymentEvaluations` on `PaymentAttemptRecordReportGuaranteedParams`, `PaymentRecordReportPaymentAttemptGuaranteedParams`, `PaymentRecordReportPaymentAttemptParams.guaranteed`, and `PaymentRecordReportPaymentParams.guaranteed`
  * Add support for `location` on `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, `PaymentIntentUpdateParams.payment_details`, `SetupIntentConfirmParams.setup_details`, `SetupIntentCreateParams.setup_details`, and `SetupIntentUpdateParams.setup_details`
  * Add support for `onboardingDataUpdateAcknowledged` on `PaymentLocationUpdateParams`
  * Change `PaymentLocationCreateParams.address.country` and `PaymentLocationUpdateParams.address.country` to be optional
  * Add support for `customer` on `radar.CustomerEvaluationUpdateParams`
  * Add support for `status` on `radar.CustomerEvaluationUpdateParams` and `radar.CustomerEvaluation`
  * Change `radar.CustomerEvaluationUpdateParams.type` to be optional
  * Add support for `paymentBehavior` on `SubscriptionResumeParams`
  * Add support for `disputeDetails` on `v2.moneymanagement.ReceivedDebit`
  * Add support for `debitDispute` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
  * Add support for `paymentAttemptRecord` on `EventsV2PaymentsOffSessionPaymentAttemptFailedEvent` and `EventsV2PaymentsOffSessionPaymentFailedEvent`
  * Add support for event notifications `V2MoneyManagementFinancialAccountStatementCreatedEvent` and `V2MoneyManagementFinancialAccountStatementRestatedEvent` with related object `v2.moneymanagement.FinancialAccountStatement`

## 32.2.0-alpha.4 - 2026-05-06
* [#2215](https://github.com/stripe/stripe-java/pull/2215) Add EventNotificationHandler (private preview)
* [#2214](https://github.com/stripe/stripe-java/pull/2214) Update generated code for private-preview
  * Add support for new resource `PaymentLocation`
  * Add support for `create`, `delete`, `retrieve`, and `update` methods on resource `PaymentLocation`
  * Add support for `protections` on `AccountCreateParams.capabilities.card_payments`, `AccountUpdateParams.capabilities.card_payments`, and `Capability`
  * Add support for `giftCard` on `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, and `sharedpayment.GrantedToken.payment_method_details`
  * Add support for new value `gift_card` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `gift_card` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `metadata` on `delegatedcheckout.RequestedSessionConfirmParams`
  * Add support for `creditedItems` on `InvoiceItem.proration_details`
  * Add support for `networkLifecycle` on `issuing.Dispute`
  * Add support for new value `gift_card` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
  * Add support for `statusDetails` on `Subscription`

## 32.2.0-alpha.3 - 2026-04-28
* [#2213](https://github.com/stripe/stripe-java/pull/2213) Update generated code for private-preview
  * Add support for `debitCard` on `v2.core.Account.configuration.card_creator.capabilities.consumer.lead`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.consumer.lead`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.consumer.lead`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.consumer.lead`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.consumer.lead`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.consumer.lead`
  * Add support for new value `consumer.lead.debit_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

## 32.2.0-alpha.2 - 2026-04-28
* ⚠️ [#2211](https://github.com/stripe/stripe-java/pull/2211) Update generated code for private-preview
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

## 32.2.0-alpha.1 - 2026-04-24
This release changes the pinned API version to `2026-04-22.preview`.

* ⚠️ [#2206](https://github.com/stripe/stripe-java/pull/2206) Update generated code for private-preview
  * Add support for new resources `v2.commerce.ProductCatalogImport`, `v2.core.ApprovalRequest`, `v2.extend.WorkflowRun`, `v2.extend.Workflow`, `v2.iam.ActivityLog`, `v2.network.BusinessProfile`, and `v2.orchestratedcommerce.Agreement`
  * ⚠️ Remove support for resources `v2.core.WorkflowRun` and `v2.core.Workflow`
  * Add support for `confirm`, `create`, `list`, `retrieve`, and `terminate` methods on resource `v2.orchestratedcommerce.Agreement`
  * Add support for `me` and `retrieve` methods on resource `v2.network.BusinessProfile`
  * Add support for `list` method on resource `v2.iam.ActivityLog`
  * Add support for `list` and `retrieve` methods on resource `v2.extend.WorkflowRun`
  * Add support for `invoke`, `list`, and `retrieve` methods on resource `v2.extend.Workflow`
  * Add support for `cancel`, `execute`, `list`, `retrieve`, and `submit` methods on resource `v2.core.ApprovalRequest`
  * Add support for `create` and `retrieve` methods on resource `v2.commerce.ProductCatalogImport`
  * ⚠️ Remove support for `list` and `retrieve` methods on resource `v2.core.WorkflowRun`
  * ⚠️ Remove support for `invoke`, `list`, and `retrieve` methods on resource `v2.core.Workflow`
  * Add support for `renew_onboarding_link` method on resource `v2.core.ClaimableSandbox`
  * ⚠️ Remove support for `customer` on `sharedpayment.IssuedToken`
  * Add support for `billManagement` and `sendMoney` on `AccountSession.components.bills.features`
  * Add support for `giftCard` on `Charge.payment_method_details`, `PaymentAttemptRecord.payment_method_details`, and `PaymentRecord.payment_method_details`
  * Add support for `customPaymentMethodTypes` on `checkout.SessionCreateParams` and `checkout.Session`
  * Add support for `paymentRecord` on `checkout.Session`
  * ⚠️ Remove support for `sharedPaymentGrantedToken` on `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntent`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `paymentMethod` on `ConfirmationToken.payment_method_preview.sepa_debit.generated_from`, `PaymentMethod.sepa_debit.generated_from`, and `sharedpayment.GrantedToken.payment_method_details.sepa_debit.generated_from`
  * ⚠️ Change type of `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.selected_fulfillment_option.type` and `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.selected_fulfillment_option_overrides[].type` from `string` to `enum('digital'|'shipping')`
  * Add support for `returnUrl` on `delegatedcheckout.RequestedSessionConfirmParams`
  * Add support for `buyerConsents` on `delegatedcheckout.RequestedSession`
  * Add support for `cryptoTransactions` on `issuing.Authorization`, `issuing.Dispute`, and `issuing.Transaction`
  * Add support for `paymentFacilitatorId` and `subMerchantId` on `issuing.Authorization.merchant_data` and `issuing.Transaction.merchant_data`
  * Add support for `identifiers` on `OrderCreateParams.line_items[].product_data`, `OrderUpdateParams.line_items[].product_data`, `ProductCreateParams`, `ProductUpdateParams`, and `Product`
  * Add support for `agentDetails` on `PaymentIntent`
  * Add support for `externalReference` on `PriceCreateParams` and `PriceUpdateParams`
  * Add support for `loginSucceeded` and `registrationSucceeded` on `radar.AccountEvaluation.events[]` and `radar.AccountEvaluationUpdateParams`
  * Add support for `printContent` on `terminal.Reader.action`
  * Add support for `appChannel` on `v2.core.ClaimableSandboxCreateParams` and `v2.core.ClaimableSandbox`
  * Add support for `onboardingLinkDetails` and `ownerDetails` on `v2.core.ClaimableSandbox`
  * ⚠️ Remove support for `claimUrl` on `v2.core.ClaimableSandbox`
  * ⚠️ Remove support for `ownerAccount` on `v2.core.ClaimableSandbox.sandbox_details`
  * Add support for `snapshotEvent` on `v2.core.Event`
  * Add support for `multiprocessorSettlement` on `v2.moneymanagement.FinancialAccount`
  * Add support for `caBankAccount` on `v2.moneymanagement.FinancialAddress.credentials` and `v2.moneymanagement.ReceivedCredit.bank_transfer`
  * Add support for `amountDetails` and `paymentDetails` on `v2.payments.OffSessionPaymentCaptureParams`, `v2.payments.OffSessionPaymentCreateParams`, and `v2.payments.OffSessionPayment`
  * Add support for `description` on `v2.payments.OffSessionPaymentCreateParams` and `v2.payments.OffSessionPayment`
  * Add support for new value `acss` on enum `v2.FinancialAddressCreditSimulationCreditParams.network`
  * Add support for `mcc` on `v2.payments.OffSessionPaymentCreateParams.payment_method_options.card`
  * Change `v2.payments.OffSessionPaymentCreateParams.payment_method_options.card.networkTransactionId` to be optional
  * Add support for new values `futsu` and `toza` on enums `v2.core.vault.GbBankAccountCreateParams.bankAccountType`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.bank_account.bankAccountType`, and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.bank_account.bankAccountType`
  * Add support for new value `tempo` on enum `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.crypto_wallet.network`
  * Add support for new value `credentials.ca_bank_account.account_number` on enums `v2.moneymanagement.FinancialAddressListParams.include` and `v2.moneymanagement.FinancialAddressRetrieveParams.include`
  * Add support for new value `ca_bank_account` on enum `v2.moneymanagement.FinancialAddressCreateParams.type`
  * Add support for new value `multiprocessor_settlement` on enum `v2.moneymanagement.FinancialAccountListParams.types`
  * Add support for `storage` on `v2.moneymanagement.FinancialAccountUpdateParams`
  * Add support for `fxQuote` on `v2.moneymanagement.CurrencyConversionCreateParams`
  * Change `v2.moneymanagement.CurrencyConversionCreateParams.financialAccount` to be optional
  * ⚠️ Add support for `onboardingLinkDetails` on `v2.core.ClaimableSandboxCreateParams`
  * Change type of `v2.core.BatchJobCreateParams.endpoint.httpMethod` from `literal('post')` to `enum('delete'|'post')`
  * Add support for new values `bm_crn`, `bo_tin`, `bt_tpn`, `co_nit`, `ec_ruc`, `eg_tin`, `gh_tin`, `gy_tin`, `hn_rtn`, `jm_trn`, `jo_crn`, `ke_pin`, `ky_crn`, `lk_tin`, `mo_tin`, `mv_tin`, `ng_tin`, `pa_ruc`, `ph_tin`, `py_ruc`, `sl_tin`, `sv_nit`, `uy_ruc`, `vg_cn`, and `za_tin` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Add support for new values `bm_pp`, `bo_ci`, `bt_cid`, `eg_tin`, `gh_pin`, `gy_tin`, `hn_rtn`, `jm_trn`, `jo_pin`, `ky_pp`, `lk_nic`, `mo_bir`, `mt_nic`, `mv_tin`, `pa_ruc`, `ph_tin`, `py_ruc`, `si_pin`, `sv_nit`, and `vg_pp` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountPersonCreateParams.id_numbers[].type`, `v2.core.AccountPersonTokenCreateParams.id_numbers[].type`, `v2.core.AccountPersonUpdateParams.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.individual.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`
  * Add support for new value `meter_event_value_too_many_digits` on enums `EventsV1BillingMeterErrorReportTriggeredEvent.reason.error_types[].code` and `EventsV1BillingMeterNoMeterFoundEvent.reason.error_types[].code`
  * Add support for `treasuryTransaction` on `EventsV2MoneyManagementTransactionCreatedEvent`
  * Add support for event notifications `V1AccountApplicationAuthorizedEvent`, `V1AccountApplicationDeauthorizedEvent`, `V1AccountExternalAccountCreatedEvent`, `V1AccountExternalAccountDeletedEvent`, `V1AccountExternalAccountUpdatedEvent`, `V1BillingPortalSessionCreatedEvent`, `V1EntitlementsActiveEntitlementSummaryUpdatedEvent`, `V2CoreHealthMeterEventSummariesDelayedFiringEvent`, and `V2CoreHealthMeterEventSummariesDelayedResolvedEvent`
  * Add support for event notification `V1AccountUpdatedEvent` with related object `Account`
  * Add support for event notifications `V1ApplicationFeeCreatedEvent` and `V1ApplicationFeeRefundedEvent` with related object `ApplicationFee`
  * Add support for event notification `V1ApplicationFeeRefundUpdatedEvent` with related object `FeeRefund`
  * Add support for event notification `V1BalanceAvailableEvent` with related object `Balance`
  * Add support for event notification `V1BillingAlertTriggeredEvent` with related object `billing.Alert`
  * Add support for event notifications `V1BillingPortalConfigurationCreatedEvent` and `V1BillingPortalConfigurationUpdatedEvent` with related object `billingportal.Configuration`
  * Add support for event notification `V1CapabilityUpdatedEvent` with related object `Capability`
  * Add support for event notification `V1CashBalanceFundsAvailableEvent` with related object `CashBalance`
  * Add support for event notifications `V1ChargeCapturedEvent`, `V1ChargeExpiredEvent`, `V1ChargeFailedEvent`, `V1ChargePendingEvent`, `V1ChargeRefundedEvent`, `V1ChargeSucceededEvent`, and `V1ChargeUpdatedEvent` with related object `Charge`
  * Add support for event notifications `V1ChargeDisputeClosedEvent`, `V1ChargeDisputeCreatedEvent`, `V1ChargeDisputeFundsReinstatedEvent`, `V1ChargeDisputeFundsWithdrawnEvent`, and `V1ChargeDisputeUpdatedEvent` with related object `Dispute`
  * Add support for event notifications `V1ChargeRefundUpdatedEvent`, `V1RefundCreatedEvent`, `V1RefundFailedEvent`, and `V1RefundUpdatedEvent` with related object `Refund`
  * Add support for event notifications `V1CheckoutSessionAsyncPaymentFailedEvent`, `V1CheckoutSessionAsyncPaymentSucceededEvent`, `V1CheckoutSessionCompletedEvent`, and `V1CheckoutSessionExpiredEvent` with related object `checkout.Session`
  * Add support for event notifications `V1ClimateOrderCanceledEvent`, `V1ClimateOrderCreatedEvent`, `V1ClimateOrderDelayedEvent`, `V1ClimateOrderDeliveredEvent`, and `V1ClimateOrderProductSubstitutedEvent` with related object `climate.Order`
  * Add support for event notifications `V1ClimateProductCreatedEvent` and `V1ClimateProductPricingUpdatedEvent` with related object `climate.Product`
  * Add support for event notifications `V1CouponCreatedEvent`, `V1CouponDeletedEvent`, and `V1CouponUpdatedEvent` with related object `Coupon`
  * Add support for event notifications `V1CreditNoteCreatedEvent`, `V1CreditNoteUpdatedEvent`, and `V1CreditNoteVoidedEvent` with related object `CreditNote`
  * Add support for event notifications `V1CustomerCreatedEvent`, `V1CustomerDeletedEvent`, and `V1CustomerUpdatedEvent` with related object `Customer`
  * Add support for event notifications `V1CustomerSubscriptionCreatedEvent`, `V1CustomerSubscriptionDeletedEvent`, `V1CustomerSubscriptionPausedEvent`, `V1CustomerSubscriptionPendingUpdateAppliedEvent`, `V1CustomerSubscriptionPendingUpdateExpiredEvent`, `V1CustomerSubscriptionResumedEvent`, `V1CustomerSubscriptionTrialWillEndEvent`, and `V1CustomerSubscriptionUpdatedEvent` with related object `Subscription`
  * Add support for event notifications `V1CustomerTaxIdCreatedEvent`, `V1CustomerTaxIdDeletedEvent`, and `V1CustomerTaxIdUpdatedEvent` with related object `TaxId`
  * Add support for event notification `V1CustomerCashBalanceTransactionCreatedEvent` with related object `CustomerCashBalanceTransaction`
  * Add support for event notification `V1FileCreatedEvent` with related object `File`
  * Add support for event notifications `V1FinancialConnectionsAccountCreatedEvent`, `V1FinancialConnectionsAccountDeactivatedEvent`, `V1FinancialConnectionsAccountDisconnectedEvent`, `V1FinancialConnectionsAccountReactivatedEvent`, `V1FinancialConnectionsAccountRefreshedBalanceEvent`, `V1FinancialConnectionsAccountRefreshedOwnershipEvent`, and `V1FinancialConnectionsAccountRefreshedTransactionsEvent` with related object `financialconnections.Account`
  * Add support for event notifications `V1IdentityVerificationSessionCanceledEvent`, `V1IdentityVerificationSessionCreatedEvent`, `V1IdentityVerificationSessionProcessingEvent`, `V1IdentityVerificationSessionRedactedEvent`, `V1IdentityVerificationSessionRequiresInputEvent`, and `V1IdentityVerificationSessionVerifiedEvent` with related object `identity.VerificationSession`
  * Add support for event notifications `V1InvoiceCreatedEvent`, `V1InvoiceDeletedEvent`, `V1InvoiceFinalizationFailedEvent`, `V1InvoiceFinalizedEvent`, `V1InvoiceMarkedUncollectibleEvent`, `V1InvoiceOverdueEvent`, `V1InvoiceOverpaidEvent`, `V1InvoicePaidEvent`, `V1InvoicePaymentActionRequiredEvent`, `V1InvoicePaymentFailedEvent`, `V1InvoicePaymentSucceededEvent`, `V1InvoiceSentEvent`, `V1InvoiceUpcomingEvent`, `V1InvoiceUpdatedEvent`, `V1InvoiceVoidedEvent`, and `V1InvoiceWillBeDueEvent` with related object `Invoice`
  * Add support for event notification `V1InvoicePaymentPaidEvent` with related object `InvoicePayment`
  * Add support for event notifications `V1InvoiceitemCreatedEvent` and `V1InvoiceitemDeletedEvent` with related object `InvoiceItem`
  * Add support for event notifications `V1IssuingAuthorizationCreatedEvent`, `V1IssuingAuthorizationRequestEvent`, and `V1IssuingAuthorizationUpdatedEvent` with related object `issuing.Authorization`
  * Add support for event notifications `V1IssuingCardCreatedEvent` and `V1IssuingCardUpdatedEvent` with related object `issuing.Card`
  * Add support for event notifications `V1IssuingCardholderCreatedEvent` and `V1IssuingCardholderUpdatedEvent` with related object `issuing.Cardholder`
  * Add support for event notifications `V1IssuingDisputeClosedEvent`, `V1IssuingDisputeCreatedEvent`, `V1IssuingDisputeFundsReinstatedEvent`, `V1IssuingDisputeFundsRescindedEvent`, `V1IssuingDisputeSubmittedEvent`, and `V1IssuingDisputeUpdatedEvent` with related object `issuing.Dispute`
  * Add support for event notifications `V1IssuingPersonalizationDesignActivatedEvent`, `V1IssuingPersonalizationDesignDeactivatedEvent`, `V1IssuingPersonalizationDesignRejectedEvent`, and `V1IssuingPersonalizationDesignUpdatedEvent` with related object `issuing.PersonalizationDesign`
  * Add support for event notifications `V1IssuingTokenCreatedEvent` and `V1IssuingTokenUpdatedEvent` with related object `issuing.Token`
  * Add support for event notifications `V1IssuingTransactionCreatedEvent`, `V1IssuingTransactionPurchaseDetailsReceiptUpdatedEvent`, and `V1IssuingTransactionUpdatedEvent` with related object `issuing.Transaction`
  * Add support for event notification `V1MandateUpdatedEvent` with related object `Mandate`
  * Add support for event notifications `V1PaymentIntentAmountCapturableUpdatedEvent`, `V1PaymentIntentCanceledEvent`, `V1PaymentIntentCreatedEvent`, `V1PaymentIntentPartiallyFundedEvent`, `V1PaymentIntentPaymentFailedEvent`, `V1PaymentIntentProcessingEvent`, `V1PaymentIntentRequiresActionEvent`, and `V1PaymentIntentSucceededEvent` with related object `PaymentIntent`
  * Add support for event notifications `V1PaymentLinkCreatedEvent` and `V1PaymentLinkUpdatedEvent` with related object `PaymentLink`
  * Add support for event notifications `V1PaymentMethodAttachedEvent`, `V1PaymentMethodAutomaticallyUpdatedEvent`, `V1PaymentMethodDetachedEvent`, and `V1PaymentMethodUpdatedEvent` with related object `PaymentMethod`
  * Add support for event notifications `V1PayoutCanceledEvent`, `V1PayoutCreatedEvent`, `V1PayoutFailedEvent`, `V1PayoutPaidEvent`, `V1PayoutReconciliationCompletedEvent`, and `V1PayoutUpdatedEvent` with related object `Payout`
  * Add support for event notifications `V1PersonCreatedEvent`, `V1PersonDeletedEvent`, and `V1PersonUpdatedEvent` with related object `Person`
  * Add support for event notifications `V1PlanCreatedEvent`, `V1PlanDeletedEvent`, and `V1PlanUpdatedEvent` with related object `Plan`
  * Add support for event notifications `V1PriceCreatedEvent`, `V1PriceDeletedEvent`, and `V1PriceUpdatedEvent` with related object `Price`
  * Add support for event notifications `V1ProductCreatedEvent`, `V1ProductDeletedEvent`, and `V1ProductUpdatedEvent` with related object `Product`
  * Add support for event notifications `V1PromotionCodeCreatedEvent` and `V1PromotionCodeUpdatedEvent` with related object `PromotionCode`
  * Add support for event notifications `V1QuoteAcceptedEvent`, `V1QuoteCanceledEvent`, `V1QuoteCreatedEvent`, and `V1QuoteFinalizedEvent` with related object `Quote`
  * Add support for event notifications `V1RadarEarlyFraudWarningCreatedEvent` and `V1RadarEarlyFraudWarningUpdatedEvent` with related object `radar.EarlyFraudWarning`
  * Add support for event notifications `V1ReviewClosedEvent` and `V1ReviewOpenedEvent` with related object `Review`
  * Add support for event notifications `V1SetupIntentCanceledEvent`, `V1SetupIntentCreatedEvent`, `V1SetupIntentRequiresActionEvent`, `V1SetupIntentSetupFailedEvent`, and `V1SetupIntentSucceededEvent` with related object `SetupIntent`
  * Add support for event notification `V1SigmaScheduledQueryRunCreatedEvent` with related object `sigma.ScheduledQueryRun`
  * Add support for event notifications `V1SourceCanceledEvent`, `V1SourceChargeableEvent`, `V1SourceFailedEvent`, and `V1SourceRefundAttributesRequiredEvent` with related object `Source`
  * Add support for event notifications `V1SubscriptionScheduleAbortedEvent`, `V1SubscriptionScheduleCanceledEvent`, `V1SubscriptionScheduleCompletedEvent`, `V1SubscriptionScheduleCreatedEvent`, `V1SubscriptionScheduleExpiringEvent`, `V1SubscriptionScheduleReleasedEvent`, and `V1SubscriptionScheduleUpdatedEvent` with related object `SubscriptionSchedule`
  * Add support for event notification `V1TaxSettingsUpdatedEvent` with related object `tax.Settings`
  * Add support for event notifications `V1TaxRateCreatedEvent` and `V1TaxRateUpdatedEvent` with related object `TaxRate`
  * Add support for event notifications `V1TerminalReaderActionFailedEvent`, `V1TerminalReaderActionSucceededEvent`, and `V1TerminalReaderActionUpdatedEvent` with related object `terminal.Reader`
  * Add support for event notifications `V1TestHelpersTestClockAdvancingEvent`, `V1TestHelpersTestClockCreatedEvent`, `V1TestHelpersTestClockDeletedEvent`, `V1TestHelpersTestClockInternalFailureEvent`, and `V1TestHelpersTestClockReadyEvent` with related object `testhelpers.TestClock`
  * Add support for event notifications `V1TopupCanceledEvent`, `V1TopupCreatedEvent`, `V1TopupFailedEvent`, `V1TopupReversedEvent`, and `V1TopupSucceededEvent` with related object `Topup`
  * Add support for event notifications `V1TransferCreatedEvent`, `V1TransferReversedEvent`, and `V1TransferUpdatedEvent` with related object `Transfer`
  * Add support for event notifications `V2CommerceProductCatalogImportsFailedEvent`, `V2CommerceProductCatalogImportsProcessingEvent`, `V2CommerceProductCatalogImportsSucceededEvent`, and `V2CommerceProductCatalogImportsSucceededWithErrorsEvent` with related object `v2.commerce.ProductCatalogImport`
  * Add support for event notifications `V2CoreApprovalRequestApprovedEvent`, `V2CoreApprovalRequestCanceledEvent`, `V2CoreApprovalRequestFailedEvent`, `V2CoreApprovalRequestRejectedEvent`, and `V2CoreApprovalRequestSucceededEvent` with related object `v2.core.ApprovalRequest`
  * Add support for event notification `V2CoreClaimableSandboxUpdatedEvent` with related object `v2.core.ClaimableSandbox`
  * Add support for event notifications `V2ExtendWorkflowRunFailedEvent`, `V2ExtendWorkflowRunStartedEvent`, and `V2ExtendWorkflowRunSucceededEvent` with related object `v2.extend.WorkflowRun`
  * Add support for event notifications `V2OrchestratedCommerceAgreementConfirmedEvent`, `V2OrchestratedCommerceAgreementCreatedEvent`, `V2OrchestratedCommerceAgreementPartiallyConfirmedEvent`, and `V2OrchestratedCommerceAgreementTerminatedEvent` with related object `v2.orchestratedcommerce.Agreement`
  * ⚠️ Remove support for event notification `V2CoreClaimableSandboxSandboxDetailsOwnerAccountUpdatedEvent` with related object `v2.core.ClaimableSandbox`
  * Add support for error type `FxQuoteExpiredException`

## 32.1.0-alpha.4 - 2026-04-15
* [#2204](https://github.com/stripe/stripe-java/pull/2204) Update generated code for private-preview
  * Add support for `latestVersion` on `v2.billing.LicenseFee`, `v2.billing.PricingPlan`, and `v2.billing.RateCard`
  * Add support for `serviceIntervalCount` and `serviceInterval` on `v2.billing.LicenseFee` and `v2.billing.RateCard`
* ⚠️ [#2202](https://github.com/stripe/stripe-java/pull/2202) Update generated code for private-preview
  * Add support for new resources `v2.core.WorkflowRun` and `v2.core.Workflow`
  * Add support for `report_authorized` method on resource `PaymentAttemptRecord`
  * Add support for `list` and `retrieve` methods on resource `v2.core.WorkflowRun`
  * Add support for `invoke`, `list`, and `retrieve` methods on resource `v2.core.Workflow`
  * Add support for `nextAction` and `status` on `sharedpayment.IssuedToken`
  * ⚠️ Remove support for `networkId` on `sharedpayment.IssuedToken.seller_details`
  * Add support for `bills` on `AccountSession.components`
  * Add support for `settlementCurrencies` on `BalanceSettings.payments` and `BalanceSettingsUpdateParams.payments`
  * Add support for `defaultSettlementCurrency` on `BalanceSettings.payments`
  * Add support for `accountFunding` on `Charge.payment_method_details.card`
  * Add support for `automaticSurcharge` on `PaymentLinkCreateParams`, `PaymentLink`, `checkout.SessionCreateParams`, and `checkout.Session`
  * Add support for `bizum` on `checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
  * Add support for `surchargeCost` on `checkout.Session`
  * Add support for `amountSurcharge` on `checkout.Session.total_details`
  * Add support for `sharedPaymentGrantedToken` on `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new value `email` on enums `identity.VerificationReportListParams.type`, `identity.VerificationSessionCreateParams.type`, and `identity.VerificationSessionUpdateParams.type`
  * Add support for `details` on `identity.VerificationReport.email`
  * Add support for `confirm` on `identity.VerificationSessionCreateParams` and `identity.VerificationSessionUpdateParams`
  * Add support for `subscription` on `InvoiceItem.parent.schedule_details`
  * ⚠️ Remove support for `sharedPaymentGrantedToken` on `PaymentIntentConfirmParams` and `PaymentIntentCreateParams`
  * Add support for `moneyServices` on `PaymentIntent.payment_details`
  * ⚠️ Remove support for `externalReference` on `Plan`

## 32.1.0-alpha.3 - 2026-04-08
This release changes the pinned API version to `2026-04-08.preview`.

* ⚠️ [#2199](https://github.com/stripe/stripe-java/pull/2199) Update generated code for private-preview
  * Add support for `paymentRecord` on `ApplicationFee.fee_source`
  * Add support for `fleetData` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntent.payment_details`, `PaymentIntentAmountDetailsLineItem.payment_method_options.card`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentCreateParams.payment_details`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.card`, `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.card`, and `PaymentIntentUpdateParams.payment_details`
  * Add support for `beneficiaryAccount`, `beneficiaryDetails`, `senderAccount`, and `senderDetails` on `ChargeCaptureParams.payment_details.money_services.account_funding`, `ChargeUpdateParams.payment_details.money_services.account_funding`, `PaymentIntentCaptureParams.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_details.money_services.account_funding`
  * Change type of `ChargeCaptureParams.payment_details.money_services.transactionType`, `ChargeUpdateParams.payment_details.money_services.transactionType`, `PaymentIntentCaptureParams.payment_details.money_services.transactionType`, `PaymentIntentConfirmParams.payment_details.money_services.transactionType`, `PaymentIntentCreateParams.payment_details.money_services.transactionType`, and `PaymentIntentUpdateParams.payment_details.money_services.transactionType` from `literal('account_funding')` to `emptyable(literal('account_funding'))`
  * Add support for `bizum` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for new value `bizum` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `quantityPrecision` on `PaymentIntentAmountDetailsLineItem`, `PaymentIntentCaptureParams.amount_details.line_items[]`, `PaymentIntentConfirmParams.amount_details.line_items[]`, `PaymentIntentCreateParams.amount_details.line_items[]`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[]`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[]`, and `PaymentIntentUpdateParams.amount_details.line_items[]`
  * Add support for `liquidAsset` and `wallet` on `PaymentIntentConfirmParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentUpdateParams.payment_method_options.card.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_method_options.card_present.payment_details.money_services.account_funding`
  * Add support for `sharedPaymentGrantedToken` on `PaymentMethod`
  * Add support for `data` on `radar.PaymentEvaluation.client_device_metadata_details` and `radar.PaymentEvaluationCreateParams.client_device_metadata_details`
  * Add support for `sunbit` on `sharedpayment.GrantedToken.payment_method_details`
  * ⚠️ Remove support for values `bm_crn`, `bo_tin`, `bt_tpn`, `co_nit`, `ec_ruc`, `eg_tin`, `gh_tin`, `gy_tin`, `hn_rtn`, `jm_trn`, `jo_crn`, `ke_pin`, `ky_crn`, `lk_tin`, `mo_tin`, `mv_tin`, `ng_tin`, `pa_ruc`, `ph_tin`, `py_ruc`, `sl_tin`, `sv_nit`, `uy_ruc`, `vg_cn`, and `za_tin` from enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * ⚠️ Remove support for values `bm_pp`, `bo_ci`, `bt_cid`, `eg_tin`, `gh_pin`, `gy_tin`, `hn_rtn`, `jm_trn`, `jo_pin`, `ky_pp`, `lk_nic`, `mo_bir`, `mt_nic`, `mv_tin`, `pa_ruc`, `ph_tin`, `py_ruc`, `si_pin`, `sv_nit`, and `vg_pp` from enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountPersonCreateParams.id_numbers[].type`, `v2.core.AccountPersonTokenCreateParams.id_numbers[].type`, `v2.core.AccountPersonUpdateParams.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.individual.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`
  * Add support for error type `CannotProceedException`

## 32.1.0-alpha.2 - 2026-04-01
This release changes the pinned API version to `2026-04-01.preview`.

* ⚠️ [#2197](https://github.com/stripe/stripe-java/pull/2197) Update generated code for private-preview
  * Add support for new resources `sharedpayment.IssuedToken` and `v2.data.reporting.QueryRun`
  * Add support for `create` and `retrieve` methods on resource `v2.data.reporting.QueryRun`
  * Add support for `pause` and `resume` methods on resource `v2.payments.OffSessionPayment`
  * Add support for `tenantKeys`, `tenantOperator`, and `tenantValues` on `billing.MeterEventSummaryListParams`
  * Add support for `moneyServices` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
  * Add support for `paymentMethodOptions` on `delegatedcheckout.RequestedSessionCreateParams`, `delegatedcheckout.RequestedSessionUpdateParams`, and `delegatedcheckout.RequestedSession`
  * ⚠️ Remove support for `paymentMethodData` on `delegatedcheckout.RequestedSessionConfirmParams`, `delegatedcheckout.RequestedSessionCreateParams`, and `delegatedcheckout.RequestedSessionUpdateParams`
  * Add support for `cardBrands` and `paymentMethodTypes` on `delegatedcheckout.RequestedSession.seller_details`
  * ⚠️ Change type of `delegatedcheckout.RequestedSession.sharedPaymentIssuedToken` from `string` to `expandable($SharedPayment.IssuedToken)`
  * Add support for `checkScan` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for new value `check_scan` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `processorDetails` on `PaymentAttemptRecordReportFailedParams`, `PaymentAttemptRecordReportGuaranteedParams`, `PaymentRecordReportPaymentAttemptFailedParams`, `PaymentRecordReportPaymentAttemptGuaranteedParams`, `PaymentRecordReportPaymentAttemptParams.failed`, `PaymentRecordReportPaymentAttemptParams.guaranteed`, `PaymentRecordReportPaymentParams.failed`, and `PaymentRecordReportPaymentParams.guaranteed`
  * Add support for `paymentDetails` on `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card`
  * ⚠️ Remove support for `billFrom` on `QuotePreviewSubscriptionSchedule.billing_schedules[]`, `Subscription.billing_schedules[]`, and `SubscriptionSchedule.billing_schedules[]`
  * Add support for `agentDetails`, `paymentMethodDetails`, and `riskDetails` on `sharedpayment.GrantedToken`
  * Add support for `paperChecks` on `v2.Account.configuration.recipient_data.features`, `v2.AccountCreateParams.configuration.recipient_data.features`, `v2.AccountUpdateParams.configuration.recipient_data.features`, `v2.core.Account.configuration.recipient.capabilities`, `v2.core.Account.configuration.storer.capabilities.outbound_payments`, `v2.core.AccountCreateParams.configuration.recipient.capabilities`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments`
  * ⚠️ Change type of `v2.billing.Cadence.settings_data.collection.payment_method_options.konbini`, `v2.billing.CollectionSetting.payment_method_options.konbini`, `v2.billing.CollectionSettingCreateParams.payment_method_options.konbini`, `v2.billing.CollectionSettingUpdateParams.payment_method_options.konbini`, and `v2.billing.CollectionSettingVersion.payment_method_options.konbini` from `map(string: dynamic)` to `an object`
  * ⚠️ Change type of `v2.billing.Cadence.settings_data.collection.payment_method_options.sepaDebit`, `v2.billing.CollectionSetting.payment_method_options.sepaDebit`, `v2.billing.CollectionSettingCreateParams.payment_method_options.sepaDebit`, `v2.billing.CollectionSettingUpdateParams.payment_method_options.sepaDebit`, and `v2.billing.CollectionSettingVersion.payment_method_options.sepaDebit` from `map(string: dynamic)` to `an object`
  * Add support for `id` on `v2.billing.CadenceSpendModifier.max_billing_period_spend.amount.custom_pricing_unit`, `v2.billing.IntentAction.apply.spend_modifier_rule.max_billing_period_spend.amount.custom_pricing_unit`, and `v2.billing.IntentCreateParams.actions[].apply.spend_modifier_rule.max_billing_period_spend.amount.custom_pricing_unit`
  * ⚠️ Change type of `v2.core.Event.reason.request.client.stripeAction` from `map(string: dynamic)` to `an object`
  * ⚠️ Change type of `v2.moneymanagement.InboundTransfer.transfer_history[].bankDebitProcessing` from `map(string: dynamic)` to `an object`
  * ⚠️ Change type of `v2.moneymanagement.InboundTransfer.transfer_history[].bankDebitQueued` from `map(string: dynamic)` to `an object`
  * ⚠️ Change type of `v2.moneymanagement.InboundTransfer.transfer_history[].bankDebitSucceeded` from `map(string: dynamic)` to `an object`
  * ⚠️ Remove support for `town` on `v2.moneymanagement.OutboundPayment.tracking_details.paper_check.mailing_address`
  * Add support for `applicationFeeAmountRequested` on `v2.payments.OffSessionPayment`
  * ⚠️ Remove support for `compartmentId` on `v2.payments.OffSessionPayment`
  * Add support for `retryUntil` on `v2.payments.OffSessionPayment.retry_details`
  * Add support for `applicationFeeAmount` on `v2.payments.OffSessionPaymentCaptureParams` and `v2.payments.OffSessionPaymentCreateParams`
  * Add support for new values `bm_crn`, `bo_tin`, `bt_tpn`, `co_nit`, `ec_ruc`, `eg_tin`, `gh_tin`, `gy_tin`, `hn_rtn`, `jm_trn`, `jo_crn`, `ke_pin`, `ky_crn`, `lk_tin`, `mo_tin`, `mv_tin`, `ng_tin`, `pa_ruc`, `ph_tin`, `py_ruc`, `sl_tin`, `sv_nit`, `uy_ruc`, `vg_cn`, and `za_tin` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Add support for new values `bm_pp`, `bo_ci`, `bt_cid`, `eg_tin`, `gh_pin`, `gy_tin`, `hn_rtn`, `jm_trn`, `jo_pin`, `ky_pp`, `lk_nic`, `mo_bir`, `mt_nic`, `mv_tin`, `pa_ruc`, `ph_tin`, `py_ruc`, `si_pin`, `sv_nit`, and `vg_pp` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountPersonCreateParams.id_numbers[].type`, `v2.core.AccountPersonTokenCreateParams.id_numbers[].type`, `v2.core.AccountPersonUpdateParams.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.individual.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`
  * Add support for new value `paper_checks` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
  * Add support for new value `outbound_payments.paper_checks` on enum `EventsV2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent.updatedCapability`
  * Add support for `alertId` on `EventsV2CoreHealthApiErrorResolvedEvent`, `EventsV2CoreHealthApiLatencyResolvedEvent`, `EventsV2CoreHealthAuthorizationRateDropResolvedEvent`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent`, `EventsV2CoreHealthPaymentMethodErrorResolvedEvent`, `EventsV2CoreHealthSepaDebitDelayedFiringEvent`, `EventsV2CoreHealthSepaDebitDelayedResolvedEvent`, `EventsV2CoreHealthTrafficVolumeDropResolvedEvent`, and `EventsV2CoreHealthWebhookLatencyResolvedEvent`
  * Add support for `apiKey` on `EventsV2IamApiKeyCreatedEvent`, `EventsV2IamApiKeyDefaultSecretRevealedEvent`, `EventsV2IamApiKeyExpiredEvent`, `EventsV2IamApiKeyPermissionsUpdatedEvent`, `EventsV2IamApiKeyRotatedEvent`, and `EventsV2IamApiKeyUpdatedEvent`
  * Add support for `stripeAccessGrant` on `EventsV2IamStripeAccessGrantApprovedEvent`, `EventsV2IamStripeAccessGrantCanceledEvent`, `EventsV2IamStripeAccessGrantDeniedEvent`, `EventsV2IamStripeAccessGrantRemovedEvent`, `EventsV2IamStripeAccessGrantRequestedEvent`, and `EventsV2IamStripeAccessGrantUpdatedEvent`
  * Add support for event notifications `V2DataReportingQueryRunCreatedEvent`, `V2DataReportingQueryRunFailedEvent`, `V2DataReportingQueryRunSucceededEvent`, and `V2DataReportingQueryRunUpdatedEvent` with related object `v2.data.reporting.QueryRun`
  * Add support for event notifications `V2PaymentsOffSessionPaymentPausedEvent` and `V2PaymentsOffSessionPaymentResumedEvent` with related object `v2.payments.OffSessionPayment`

## 32.1.0-alpha.1 - 2026-03-25
This release changes the pinned API version to `2026-03-25.preview`.

This release contains additional breaking changes. See the [GA changelog](https://github.com/stripe/stripe-java/blob/master/CHANGELOG.md#3200---2026-03-25) for more information.

* ⚠️ [#2185](https://github.com/stripe/stripe-java/pull/2185) Update generated code for private-preview
  * Add support for new resource `v2.core.AccountEvaluation`
  * ⚠️ Remove support for resources `v2.billing.LicenseFeeSubscription` and `v2.billing.PricingPlanSubscriptionComponents`
  * Add support for `create` method on resource `v2.core.AccountEvaluation`
  * ⚠️ Remove support for `retrieve` method on resources `v2.billing.LicenseFeeSubscription` and `v2.billing.PricingPlanSubscriptionComponents`
  * Add support for `modify_rates` method on resource `v2.billing.RateCard`
  * Add support for `remove_discounts` method on resource `v2.billing.PricingPlanSubscription`
  * Add support for `invoiceResources` on `v2.billing.Intent`
  * Add support for `amountDue` and `customerBalanceApplied` on `v2.billing.Intent.amount_details`
  * Add support for `expiresAt` on `v2.billing.Intent.status_transitions`
  * Add support for `discount` on `v2.billing.IntentAction.apply` and `v2.billing.IntentCreateParams.actions[].apply`
  * Add support for `timestamp` on `v2.billing.IntentAction.apply.effective_at` and `v2.billing.IntentCreateParams.actions[].apply.effective_at`
  * ⚠️ Change type of `v2.billing.IntentAction.deactivate.pricing_plan_subscription_details.overrides.partial_period_behaviors[].type`, `v2.billing.IntentAction.modify.pricing_plan_subscription_details.overrides.partial_period_behaviors[].type`, `v2.billing.IntentAction.subscribe.pricing_plan_subscription_details.overrides.partial_period_behaviors[].type`, `v2.billing.IntentCreateParams.actions[].deactivate.pricing_plan_subscription_details.overrides.partial_period_behaviors[].type`, `v2.billing.IntentCreateParams.actions[].modify.pricing_plan_subscription_details.overrides.partial_period_behaviors[].type`, and `v2.billing.IntentCreateParams.actions[].subscribe.pricing_plan_subscription_details.overrides.partial_period_behaviors[].type` from `literal('license_fee')` to `enum('license_fee'|'recurring_credit_grant')`
  * Add support for `serviceCycle` on `v2.billing.LicenseFee` and `v2.billing.RateCard`
  * ⚠️ Remove support for `latestVersion` on `v2.billing.LicenseFee`, `v2.billing.PricingPlan`, and `v2.billing.RateCard`
  * ⚠️ Remove support for `serviceIntervalCount` and `serviceInterval` on `v2.billing.LicenseFee` and `v2.billing.RateCard`
  * ⚠️ Change type of `v2.billing.LicenseFee.transform_quantity.divideBy`, `v2.billing.LicenseFeeCreateParams.transform_quantity.divideBy`, `v2.billing.LicenseFeeUpdateParams.transform_quantity.divideBy`, `v2.billing.LicenseFeeVersion.transform_quantity.divideBy`, `v2.billing.RateCardRate.transform_quantity.divideBy`, and `v2.billing.RateCardRateCreateParams.transform_quantity.divideBy` from `longInteger` to `int64_string`
  * Add support for `discountDetails` and `pricingPlanComponentDetails` on `v2.billing.PricingPlanSubscription`
  * Add support for `balanceByFundsType` on `v2.moneymanagement.FinancialAccount.payments`
  * Add support for `treasuryTransactionEntry` on `v2.moneymanagement.TransactionEntry`
  * Add support for `treasuryCreditReversal`, `treasuryDebitReversal`, `treasuryInboundTransfer`, `treasuryIssuingAuthorization`, `treasuryOutboundPayment`, `treasuryOutboundTransfer`, `treasuryReceivedCredit`, and `treasuryReceivedDebit` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
  * Add support for `treasuryTransaction` on `v2.moneymanagement.Transaction`
  * Add support for `metadata` on `v2.payments.SettlementAllocationIntentSplit`
  * ⚠️ Change type of `v2.reporting.ReportRun.result.file.size` from `longInteger` to `int64_string`
  * Add support for `statementDescriptor` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundTransferCreateParams`
  * Add support for `include` on `v2.billing.IntentCreateParams`, `v2.billing.IntentReserveParams`, `v2.billing.PricingPlanSubscriptionListParams`, `v2.billing.PricingPlanSubscriptionRetrieveParams`, `v2.moneymanagement.FinancialAccountListParams`, and `v2.moneymanagement.FinancialAccountRetrieveParams`
  * Add support for new values `current_billing_period_start` and `timestamp` on enum `v2.billing.IntentCreateParams.actions[].apply.effective_at.type`
  * Add support for new value `discount` on enum `v2.billing.IntentCreateParams.actions[].apply.type`
  * Add support for event notifications `V1AccountSignalsIncludingDelinquencyCreatedEvent`, `V2CoreAccountSignalsFraudulentWebsiteReadyEvent`, and `V2SignalsAccountSignalFraudulentMerchantReadyEvent`
* ⚠️ [#2196](https://github.com/stripe/stripe-java/pull/2196) Update generated code for private-preview
  * Add support for new resource `RiskSignals`
  * Add support for `financialAccountRewards` and `nestingDemo` on `AccountSession.components`
  * Add support for `upiPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `riskSignals` on `Account`
  * Add support for `fraudIntent` on `AccountSignals`
  * Add support for `riskReserved` on `Balance`
  * ⚠️ Remove support for `billableItems` on `billing.Alert.spend_threshold.filters`
  * Add support for `upi` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `Mandate.payment_method_details`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_options`, `checkout.Session.payment_method_options`, and `checkout.SessionCreateParams.payment_method_options`
  * ⚠️ Remove support for `sourceType` on `Charge.payment_method_details.stripe_balance`, `ConfirmationToken.payment_method_preview.stripe_balance`, `ConfirmationTokenCreateParams.payment_method_data.stripe_balance`, `PaymentAttemptRecord.payment_method_details.stripe_balance`, `PaymentIntentConfirmParams.payment_method_data.stripe_balance`, `PaymentIntentCreateParams.payment_method_data.stripe_balance`, `PaymentIntentUpdateParams.payment_method_data.stripe_balance`, `PaymentMethod.stripe_balance`, `PaymentMethodCreateParams.stripe_balance`, `PaymentRecord.payment_method_details.stripe_balance`, `SetupIntentConfirmParams.payment_method_data.stripe_balance`, `SetupIntentCreateParams.payment_method_data.stripe_balance`, and `SetupIntentUpdateParams.payment_method_data.stripe_balance`
  * Add support for `integrationIdentifier` on `checkout.SessionCreateParams` and `checkout.Session`
  * Add support for new value `application` on enums `InvoiceCreateParams.automatic_tax.liability.type`, `InvoiceCreateParams.issuer.type`, `InvoiceCreatePreviewParams.automatic_tax.liability.type`, `InvoiceCreatePreviewParams.issuer.type`, `InvoiceCreatePreviewParams.schedule_details.phases[].automatic_tax.liability.type`, `InvoiceCreatePreviewParams.schedule_details.phases[].invoice_settings.issuer.type`, `InvoiceUpdateParams.automatic_tax.liability.type`, `InvoiceUpdateParams.issuer.type`, `PaymentLinkCreateParams.automatic_tax.liability.type`, `PaymentLinkCreateParams.invoice_creation.invoice_data.issuer.type`, `PaymentLinkCreateParams.subscription_data.invoice_settings.issuer.type`, `PaymentLinkUpdateParams.automatic_tax.liability.type`, `PaymentLinkUpdateParams.invoice_creation.invoice_data.issuer.type`, `PaymentLinkUpdateParams.subscription_data.invoice_settings.issuer.type`, `QuoteCreateParams.automatic_tax.liability.type`, `QuoteCreateParams.invoice_settings.issuer.type`, `QuoteUpdateParams.automatic_tax.liability.type`, `QuoteUpdateParams.invoice_settings.issuer.type`, `SubscriptionCreateParams.automatic_tax.liability.type`, `SubscriptionCreateParams.invoice_settings.issuer.type`, `SubscriptionScheduleCreateParams.default_settings.automatic_tax.liability.type`, `SubscriptionScheduleCreateParams.default_settings.invoice_settings.issuer.type`, `SubscriptionScheduleCreateParams.phases[].automatic_tax.liability.type`, `SubscriptionScheduleCreateParams.phases[].invoice_settings.issuer.type`, `SubscriptionScheduleUpdateParams.default_settings.automatic_tax.liability.type`, `SubscriptionScheduleUpdateParams.default_settings.invoice_settings.issuer.type`, `SubscriptionScheduleUpdateParams.phases[].automatic_tax.liability.type`, `SubscriptionScheduleUpdateParams.phases[].invoice_settings.issuer.type`, `SubscriptionUpdateParams.automatic_tax.liability.type`, `SubscriptionUpdateParams.invoice_settings.issuer.type`, `checkout.SessionCreateParams.automatic_tax.liability.type`, `checkout.SessionCreateParams.invoice_creation.invoice_data.issuer.type`, `checkout.SessionCreateParams.subscription_data.invoice_settings.issuer.type`, `checkout.SessionUpdateParams.automatic_tax.liability.type`, `checkout.SessionUpdateParams.invoice_creation.invoice_data.issuer.type`, and `checkout.SessionUpdateParams.subscription_data.invoice_settings.issuer.type`
  * Add support for new value `upi` on enum `checkout.SessionCreateParams.excludedPaymentMethodTypes`
  * Change type of `InvoiceAddLinesParams.lines[].price_data.product_data.tax_details.taxCode`, `InvoiceLineItemUpdateParams.price_data.product_data.tax_details.taxCode`, `InvoiceUpdateLinesParams.lines[].price_data.product_data.tax_details.taxCode`, `PaymentLinkCreateParams.line_items[].price_data.product_data.tax_details.taxCode`, `PlanCreateParams.product[0].tax_details.taxCode`, `PriceCreateParams.product_data.tax_details.taxCode`, `ProductCreateParams.tax_details.taxCode`, `ProductUpdateParams.tax_details.taxCode`, `checkout.SessionCreateParams.line_items[].price_data.product_data.tax_details.taxCode`, and `checkout.SessionUpdateParams.line_items[].price_data.product_data.tax_details.taxCode` from `string` to `emptyable(string)`
  * Add support for `crypto` on `checkout.SessionCreateParams.payment_method_options`
  * Add support for new value `upi` on enum `checkout.SessionCreateParams.paymentMethodTypes`
  * Add support for `pendingInvoiceItemInterval` on `checkout.SessionCreateParams.subscription_data` and `checkout.SessionUpdateParams.subscription_data`
  * Add support for new values `elements`, `embedded_page`, `form`, and `hosted_page` on enum `checkout.SessionCreateParams.uiMode`
  * ⚠️ Remove support for values `custom`, `embedded`, and `hosted` from enum `checkout.SessionCreateParams.uiMode`
  * Change `InvoiceAddLinesParams.lines[].price_data.product_data.tax_details.taxCode`, `InvoiceLineItemUpdateParams.price_data.product_data.tax_details.taxCode`, `InvoiceUpdateLinesParams.lines[].price_data.product_data.tax_details.taxCode`, `PaymentLinkCreateParams.line_items[].price_data.product_data.tax_details.taxCode`, `PlanCreateParams.product[0].tax_details.taxCode`, `PriceCreateParams.product_data.tax_details.taxCode`, `ProductCreateParams.tax_details.taxCode`, `ProductUpdateParams.tax_details.taxCode`, `checkout.SessionCreateParams.line_items[].price_data.product_data.tax_details.taxCode`, and `checkout.SessionUpdateParams.line_items[].price_data.product_data.tax_details.taxCode` to be optional
  * Add support for `auBecsDebit`, `bacsDebit`, `boleto`, `link`, `sepaDebit`, and `usBankAccount` on `checkout.Session.current_attempt.payment_method_details`
  * Add support for new value `upi` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for `metadata` on `CreditNoteCreateParams.lines[]`, `CreditNoteLineItem`, `CreditNotePreviewLinesParams.lines[]`, and `CreditNotePreviewParams.lines[]`
  * Add support for new value `upi` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `selectedFulfillmentOptionOverrides` on `delegatedcheckout.RequestedSession.fulfillment_details`
  * Add support for `lineItemKeys` on `delegatedcheckout.RequestedSession.fulfillment_details.fulfillment_options[].digital.digital_options[]` and `delegatedcheckout.RequestedSession.fulfillment_details.fulfillment_options[].shipping.shipping_options[]`
  * Add support for `quantityDecimal` on `InvoiceAddLinesParams.lines[]`, `InvoiceCreatePreviewParams.invoice_items[]`, `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, `InvoiceItem`, `InvoiceLineItemUpdateParams`, `InvoiceLineItem`, and `InvoiceUpdateLinesParams.lines[]`
  * Add support for `expiresAfterSeconds` on `Invoice.payment_settings.payment_method_options.pix`, `InvoiceCreateParams.payment_settings.payment_method_options.pix`, `InvoiceUpdateParams.payment_settings.payment_method_options.pix`, `QuotePreviewInvoice.payment_settings.payment_method_options.pix`, `Subscription.payment_settings.payment_method_options.pix`, `SubscriptionCreateParams.payment_settings.payment_method_options.pix`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.pix`
  * ⚠️ Add support for `level` on `issuing.AuthorizationCreateParams.risk_assessment.card_testing_risk` and `issuing.AuthorizationCreateParams.risk_assessment.merchant_dispute_risk`
  * ⚠️ Remove support for `riskLevel` on `issuing.AuthorizationCreateParams.risk_assessment.card_testing_risk` and `issuing.AuthorizationCreateParams.risk_assessment.merchant_dispute_risk`
  * Add support for new values `da`, `pl`, and `sv` on enums `issuing.CardholderCreateParams.preferredLocales` and `issuing.CardholderUpdateParams.preferredLocales`
  * Add support for `lifecycleControls` on `issuing.CardCreateParams` and `issuing.Card`
  * Add support for `cryptogram`, `electronicCommerceIndicator`, `exemptionIndicatorApplied`, and `exemptionIndicator` on `PaymentAttemptRecord.payment_method_details.card.three_d_secure` and `PaymentRecord.payment_method_details.card.three_d_secure`
  * Add support for `surcharge` on `PaymentIntent.amount_details`, `PaymentIntentCaptureParams.amount_details`, `PaymentIntentConfirmParams.amount_details`, `PaymentIntentCreateParams.amount_details`, `PaymentIntentIncrementAuthorizationParams.amount_details`, and `PaymentIntentUpdateParams.amount_details`
  * Add support for new value `upi` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
  * Add support for `mandateOptions` on `PaymentIntent.payment_method_options.stripe_balance`, `PaymentIntentConfirmParams.payment_method_options.stripe_balance`, `PaymentIntentCreateParams.payment_method_options.stripe_balance`, and `PaymentIntentUpdateParams.payment_method_options.stripe_balance`
  * Add support for `amountDetails` and `paymentDetails` on `PaymentIntentDecrementAuthorizationParams`
  * Add support for `upiHandleRedirectOrDisplayQrCode` on `PaymentIntent.next_action` and `SetupIntent.next_action`
  * Add support for `managedPayments` on `PaymentLinkCreateParams` and `PaymentLink`
  * Add support for new value `upi` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
  * Add support for `recommendedAction` and `signals` on `radar.PaymentEvaluation`
  * ⚠️ Remove support for `insights` on `radar.PaymentEvaluation`
  * Add support for new value `crypto_fingerprint` on enum `radar.ValueListCreateParams.itemType`
  * Add support for `stripeBalance` on `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
  * Add support for `recurringInterval` on `sharedpayment.GrantedToken.usage_limits`
  * Add support for `presentmentDetails` on `Subscription`
  * Add support for new value `2026-03-25.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`
  * ⚠️ Remove support for `invoiceResources` on `v2.billing.Intent`
  * ⚠️ Remove support for `amountDue` and `customerBalanceApplied` on `v2.billing.Intent.amount_details`
  * Add support for `recurringCreditGrant` on `v2.billing.IntentAction.modify.pricing_plan_subscription_details.overrides.partial_period_behaviors[]`, `v2.billing.IntentAction.subscribe.pricing_plan_subscription_details.overrides.partial_period_behaviors[]`, `v2.billing.IntentCreateParams.actions[].modify.pricing_plan_subscription_details.overrides.partial_period_behaviors[]`, and `v2.billing.IntentCreateParams.actions[].subscribe.pricing_plan_subscription_details.overrides.partial_period_behaviors[]`
  * Add support for `consumerPrivacyDisclosures` and `consumerStorer` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * ⚠️ Remove support for `include` on `v2.billing.IntentCreateParams` and `v2.billing.IntentReserveParams`
* [#2195](https://github.com/stripe/stripe-java/pull/2195) Update generated code for private-preview
  * Release specs are identical.

## 31.5.0-alpha.4 - 2026-03-18
* ⚠️ [#2177](https://github.com/stripe/stripe-java/pull/2177) Update generated code for private-preview
  * Add support for new resources `orchestration.PaymentAttempt` and `radar.CustomerEvaluation`
  * Add support for `retrieve` method on resource `orchestration.PaymentAttempt`
  * Add support for `create` and `update` methods on resource `radar.CustomerEvaluation`
  * Add support for `approve` method on resource `checkout.Session`
  * Add support for `report_authenticated`, `report_canceled`, `report_failed`, `report_guaranteed`, `report_informational`, and `report_refund` methods on resource `PaymentAttemptRecord`
  * Add support for `createUsPaperCheckOnApplication` on `AccountSessionCreateParams.components.check_scanning.features`
  * Add support for `approvalMethod` on `checkout.SessionCreateParams` and `checkout.Session`
  * Add support for `currentAttempt` on `checkout.Session`
  * Add support for `selectedFulfillmentOptionOverrides` on `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details`
  * Add support for `pricingPlanSubscriptionDetails` on `InvoiceItem.parent` and `InvoiceLineItem.parent`
  * ⚠️ Remove support for `licenseFeeSubscriptionDetails` on `InvoiceItem.parent` and `InvoiceLineItem.parent`
  * ⚠️ Remove support for `pricingPlanSubscription` and `pricingPlanVersion` on `InvoiceItem.parent.rate_card_subscription_details` and `InvoiceLineItem.parent.rate_card_subscription_details`
  * Add support for `tokenDetails` on `issuing.Authorization`
  * Add support for `failureCode` on `PaymentRecordReportPaymentAttemptFailedParams`, `PaymentRecordReportPaymentAttemptParams.failed`, and `PaymentRecordReportPaymentParams.failed`
  * Change `PaymentRecordReportPaymentAttemptCanceledParams.canceledAt` to be optional
  * Change `PaymentRecordReportPaymentAttemptFailedParams.failedAt` to be optional
  * Change `PaymentRecordReportPaymentAttemptGuaranteedParams.guaranteedAt` to be optional
  * Change `PaymentRecordReportRefundParams.refunded` to be optional
  * ⚠️ Remove support for value `now` from enums `QuoteCreateParams.subscription_data.billing_schedules[].bill_from.type`, `QuoteCreateParams.subscription_data_overrides[].billing_schedules[].bill_from.type`, `QuoteUpdateParams.subscription_data.billing_schedules[].bill_from.type`, and `QuoteUpdateParams.subscription_data_overrides[].billing_schedules[].bill_from.type`
  * ⚠️ Change `radar.IssuingAuthorizationEvaluationCreateParams.card_details.binCountry` to be required
  * Add support for `recurringInterval` on `sharedpayment.GrantedTokenCreateParams.usage_limits`
  * Change `sharedpayment.GrantedTokenCreateParams.usage_limits.expiresAt` to be optional
  * Add support for `homeRuleTax` on `tax.Registration.country_options.us` and `tax.RegistrationCreateParams.country_options.us`
  * Add support for new value `home_rule_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
* [#2183](https://github.com/stripe/stripe-java/pull/2183) Update generated code for private-preview
  * Add support for `simulate_crypto_deposit` test helper method on resource `PaymentIntent`
  * Add support for `depositOptions` and `mode` on `PaymentIntent.payment_method_options.crypto`, `PaymentIntentConfirmParams.payment_method_options.crypto`, `PaymentIntentCreateParams.payment_method_options.crypto`, and `PaymentIntentUpdateParams.payment_method_options.crypto`
  * Add support for `cryptoDisplayDetails` on `PaymentIntent.next_action`

## 31.5.0-alpha.3 - 2026-03-11
* ⚠️ [#2171](https://github.com/stripe/stripe-java/pull/2171) Update generated code for private-preview
  * Add support for new resource `radar.IssuingAuthorizationEvaluation`
  * Add support for `create` method on resource `radar.IssuingAuthorizationEvaluation`
  * ⚠️ Rename `affiliateAttributions` to `affiliateAttribution` on `delegatedcheckout.RequestedSessionConfirmParams` and `delegatedcheckout.RequestedSessionCreateParams`
  * Add support for `amountToCounter` on `Dispute`
  * Add support for `frozenFields` on `InvoiceItem`
  * Add support for `consumer` on `v2.core.Account.configuration.card_creator.capabilities`, `v2.core.Account.identity.attestations.terms_of_service.card_creator`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator`
  * Add support for `fifthThird` on `v2.core.Account.configuration.card_creator.capabilities.commercial`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial`
  * Add support for `prepaidCard` on `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial.cross_river_bank`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.cross_river_bank`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial.cross_river_bank`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.cross_river_bank`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial.cross_river_bank`
  * Add support for `paymentMethodData` on `v2.payments.OffSessionPaymentCreateParams`
  * Change `v2.payments.OffSessionPaymentCreateParams.paymentMethod` to be optional
  * Add support for new value `next_billing_period_start` on enum `v2.billing.IntentCreateParams.actions[].apply.effective_at.type`
  * Add support for new values `commercial.cross_river_bank.prepaid_card`, `commercial.fifth_third.charge_card`, `consumer.celtic.revolving_credit_card`, `consumer.cross_river_bank.prepaid_card`, and `consumer.lead.prepaid_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

## 31.5.0-alpha.2 - 2026-03-04
This release changes the pinned API version to `2026-03-04.preview`.

* ⚠️ [#2167](https://github.com/stripe/stripe-java/pull/2167) Update generated code for private-preview
  * Add support for new resources `Profile` and `billing.AlertRecovered`
  * Add support for `reauthorize` method on resource `PaymentIntent`
  * Add support for `settings` on `QuoteLine.actions[].add_discount`, `QuoteLine.actions[].add_item.discounts[]`, `QuoteLine.actions[].set_discounts[]`, `QuoteLine.actions[].set_items[].discounts[]`, `QuotePreviewSubscriptionSchedule.phases[].discounts[]`, `QuotePreviewSubscriptionSchedule.phases[].items[].discounts[]`, `SubscriptionSchedule.phases[].discounts[]`, and `SubscriptionSchedule.phases[].items[].discounts[]`
  * Add support for `smartDisputes` on `Account.settings`, `AccountCreateParams.settings`, `AccountUpdateParams.settings`, `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
  * Add support for `emailCustomersOnSuccessfulPayment` on `Account.settings.payments`, `AccountCreateParams.settings.payments`, and `AccountUpdateParams.settings.payments`
  * Add support for `balanceUpdateDetails` on `billing.CreditBalanceSummary.balances[]`
  * Add support for `reauthorization` and `reauthorizeBefore` on `Charge.payment_method_details.card_present`, `Charge.payment_method_details.card`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
  * Add support for `location` and `reader` on `Charge.payment_method_details.card_present`, `Charge.payment_method_details.interac_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.interac_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, `PaymentRecord.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.interac_present`
  * Add support for `managedPayments` on `PaymentIntent`, `SetupIntent`, `Subscription`, `checkout.SessionCreateParams`, and `checkout.Session`
  * Add support for new value `lk_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
  * Add support for `digital` on `delegatedcheckout.RequestedSession.fulfillment_details.fulfillment_options[]`, `delegatedcheckout.RequestedSession.fulfillment_details.selected_fulfillment_option`, and `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.selected_fulfillment_option`
  * Change `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.selected_fulfillment_option.shipping` to be optional
  * Add support for `affiliateAttributions` on `delegatedcheckout.RequestedSessionConfirmParams`, `delegatedcheckout.RequestedSessionCreateParams`, and `delegatedcheckout.RequestedSession`
  * Add support for `fulfillmentType` on `delegatedcheckout.RequestedSession.line_item_details[]`
  * Add support for `marketplaceSellerDetails`, `networkProfile`, `privacyNoticeUrl`, `returnPolicyUrl`, `storePolicyUrl`, and `termsOfServiceUrl` on `delegatedcheckout.RequestedSession.seller_details`
  * Add support for `amountToCounter` on `DisputeUpdateParams`
  * Add support for new values `terminal_wifi_certificate` and `terminal_wifi_private_key` on enum `FileListParams.purpose`
  * Add support for new values `terminal_wifi_certificate` and `terminal_wifi_private_key` on enum `FileCreateParams.purpose`
  * Add support for new value `pay_by_bank` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `displayName` and `serviceUserNumber` on `Mandate.payment_method_details.bacs_debit`
  * Add support for `requestReauthorization` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card`
  * Add support for `transactionPurpose` on `PaymentIntent.payment_method_options.us_bank_account`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, and `PaymentIntentUpdateParams.payment_method_options.us_bank_account`
  * Add support for `optionalItems` on `PaymentLinkUpdateParams`
  * ⚠️ Remove support for `cardIssuerDecline` on `radar.PaymentEvaluation.insights`
  * Add support for `paymentBehavior` on `SubscriptionItemDeleteParams`
  * Add support for `billingCycleAnchor` on `Subscription.trial_settings.end_behavior`
  * Add support for `lk` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
  * Add support for `cellular` and `stripeS710` on `terminal.ConfigurationCreateParams`, `terminal.ConfigurationUpdateParams`, and `terminal.Configuration`
  * Add support for new values `simulated_stripe_s710` and `stripe_s710` on enum `terminal.ReaderListParams.deviceType`
  * Add support for new values `reserve.hold.created`, `reserve.hold.updated`, `reserve.plan.created`, `reserve.plan.disabled`, `reserve.plan.expired`, `reserve.plan.updated`, and `reserve.release.created` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for new value `2026-02-25.clover` on enum `WebhookEndpointCreateParams.apiVersion`
  * Add support for `recipientOnboarding` and `recipientUpdate` on `v2.core.AccountLink.use_case` and `v2.core.AccountLinkCreateParams.use_case`
  * Add support for `consumer` on `v2.core.Account.configuration.storer.capabilities`, `v2.core.AccountCreateParams.configuration.storer.capabilities`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities`
  * Add support for `fundsUsageType` on `v2.moneymanagement.FinancialAccount.storage` and `v2.moneymanagement.FinancialAccountCreateParams.storage`
  * Add support for `purpose` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundPayment`
  * Add support for `branchNumber` and `swiftCode` on `v2.moneymanagement.PayoutMethod.bank_account`
  * Add support for new values `recipient_onboarding` and `recipient_update` on enum `v2.core.AccountLinkCreateParams.use_case.type`
  * Add support for new value `consumer.holds_currencies.usd` on enum `EventsV2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent.updatedCapability`
  * Add support for snapshot event `billing.alert.recovered` with resource `billing.AlertRecovered`
  * Add support for snapshot events `reserve.hold.created` and `reserve.hold.updated` with resource `reserve.Hold`
  * Add support for snapshot events `reserve.plan.created`, `reserve.plan.disabled`, `reserve.plan.expired`, and `reserve.plan.updated` with resource `reserve.Plan`
  * Add support for snapshot event `reserve.release.created` with resource `reserve.Release`
  * Add support for event notification `V2BillingRateCardCustomPricingUnitOverageRateCreatedEvent` with related object `v2.billing.RateCardCustomPricingUnitOverageRate`
  * Add support for event notifications `V2IamStripeAccessGrantApprovedEvent`, `V2IamStripeAccessGrantCanceledEvent`, `V2IamStripeAccessGrantDeniedEvent`, `V2IamStripeAccessGrantRemovedEvent`, `V2IamStripeAccessGrantRequestedEvent`, and `V2IamStripeAccessGrantUpdatedEvent`

## 31.5.0-alpha.1 - 2026-02-25
This release uses the API version `2026-01-28.preview`.

* [#2157](https://github.com/stripe/stripe-java/pull/2157) Update generated code for private-preview
  * Add support for new resource `AccountSignals`
  * Add support for `retrieve` method on resource `AccountSignals`
  * Add support for `aggregationPeriod`, `groupBy`, and `triggeredAt` on `billing.AlertTriggered`
  * Add support for `externalAccountCollection` on `AccountLinkCreateParams.collection_options`
  * Add support for `fundingSource` on `ApplicationFee`
  * Change `delegatedcheckout.RequestedSessionConfirmParams.payment_method_data.billing_details.address.line1`, `delegatedcheckout.RequestedSessionCreateParams.fulfillment_details.address.line1`, `delegatedcheckout.RequestedSessionCreateParams.payment_method_data.billing_details.address.line1`, `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.address.line1`, and `delegatedcheckout.RequestedSessionUpdateParams.payment_method_data.billing_details.address.line1` to be optional
  * Add support for `hosted` and `uiMode` on `financialconnections.SessionCreateParams` and `financialconnections.Session`
  * Add support for `url` on `financialconnections.Session`
  * Add support for `billingCycleAnchor` on `SubscriptionCreateParams.trial_settings.end_behavior` and `SubscriptionUpdateParams.trial_settings.end_behavior`

## 31.4.0-alpha.4 - 2026-02-19
* ⚠️ [#2156](https://github.com/stripe/stripe-java/pull/2156) Update generated code for private-preview
  * Add support for new value `spend_threshold` on enums `billing.AlertCreateParams.alertType` and `billing.AlertListParams.alertType`
  * Add support for `spendThreshold` on `billing.AlertCreateParams` and `billing.Alert`
  * Add support for `invoiceItem`, `prorationDetails`, `proration`, and `subscription` on `InvoiceLineItem.parent.schedule_details`
  * Add support for `custom` on `PaymentMethodUpdateParams`
  * Add support for `paymentMethodReference` and `usage` on `PaymentMethod.custom`
  * Add support for `outstandingUsageThrough` and `unusedTimeFrom` on `SubscriptionPauseParams.bill_for`
  * ⚠️ Remove support for `outstandingUsage` and `unusedTime` on `SubscriptionPauseParams.bill_for`
  * ⚠️ Remove support for `paymentBehavior` on `SubscriptionResumeParams`

## 31.4.0-alpha.3 - 2026-02-11
* [#2154](https://github.com/stripe/stripe-java/pull/2154) Update generated code for private-preview
  * Add support for new resources `v2.billing.CadenceSpendModifier`, `v2.billing.OneTimeItem`, and `v2.billing.RateCardCustomPricingUnitOverageRate`
  * Add support for `create`, `delete`, `list`, and `retrieve` methods on resource `v2.billing.RateCardCustomPricingUnitOverageRate`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resource `v2.billing.OneTimeItem`
  * Add support for `retrieve` method on resource `v2.billing.CadenceSpendModifier`
  * Add support for `settlementType` on `ApplicationFee`
  * Add support for `rateCardCustomPricingUnitOverageRateDetails` on `InvoiceItem.pricing` and `InvoiceLineItem.pricing`
  * Add support for `defaultSettings` on `InvoiceCreatePreviewParams.schedule_details`
  * Change type of `QuoteUpdateParams.subscription_data_overrides[].billingSchedules` from `emptyable(array(billing_schedules_update_specs))` to `array(billing_schedules_update_specs)`
  * Add support for `paymentBehavior` on `SubscriptionResumeParams`
  * Add support for `effectiveAt` and `spendModifierRule` on `v2.billing.IntentAction.apply`, `v2.billing.IntentAction.remove`, `v2.billing.IntentCreateParams.actions[].apply`, and `v2.billing.IntentCreateParams.actions[].remove`
  * Change type of `v2.billing.IntentAction.apply.type`, `v2.billing.IntentAction.remove.type`, `v2.billing.IntentCreateParams.actions[].apply.type`, and `v2.billing.IntentCreateParams.actions[].remove.type` from `literal('invoice_discount_rule')` to `enum('invoice_discount_rule'|'spend_modifier_rule')`
  * Change `EventsV2CoreHealthFraudRateIncreasedEvent.impact.realized_fraud_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent.impact.approved_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent.impact.declined_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.impact.approved_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.impact.declined_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.impact.approved_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.impact.declined_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.impact.approved_amount.value`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.impact.declined_amount.value`, `v2.FinancialAddressCreditSimulationCreditParams.amount.value`, `v2.billing.ServiceActionCreateParams.credit_grant.amount.monetary.value`, `v2.billing.ServiceActionCreateParams.credit_grant_per_tenant.amount.monetary.value`, `v2.core.AccountCreateParams.identity.business_details.annual_revenue.amount.value`, `v2.core.AccountCreateParams.identity.business_details.monthly_estimated_revenue.amount.value`, `v2.core.AccountTokenCreateParams.identity.business_details.annual_revenue.amount.value`, `v2.core.AccountTokenCreateParams.identity.business_details.monthly_estimated_revenue.amount.value`, `v2.core.AccountUpdateParams.identity.business_details.annual_revenue.amount.value`, `v2.core.AccountUpdateParams.identity.business_details.monthly_estimated_revenue.amount.value`, `v2.moneymanagement.CurrencyConversionCreateParams.from.amount.value`, `v2.moneymanagement.CurrencyConversionCreateParams.to.amount.value`, `v2.moneymanagement.InboundTransferCreateParams.amount.value`, `v2.moneymanagement.OutboundPaymentCreateParams.amount.value`, `v2.moneymanagement.OutboundPaymentQuoteCreateParams.amount.value`, `v2.moneymanagement.OutboundTransferCreateParams.amount.value`, `v2.payments.OffSessionPaymentCreateParams.amount.value`, `v2.payments.SettlementAllocationIntentCreateParams.amount.value`, `v2.payments.SettlementAllocationIntentSplitCreateParams.amount.value`, and `v2.payments.SettlementAllocationIntentUpdateParams.amount.value` to be required
  * Change `EventsV2CoreHealthFraudRateIncreasedEvent.impact.realized_fraud_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent.impact.approved_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent.impact.declined_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.impact.approved_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.impact.declined_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.impact.approved_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.impact.declined_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.impact.approved_amount.currency`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.impact.declined_amount.currency`, `v2.FinancialAddressCreditSimulationCreditParams.amount.currency`, `v2.billing.ServiceActionCreateParams.credit_grant.amount.monetary.currency`, `v2.billing.ServiceActionCreateParams.credit_grant_per_tenant.amount.monetary.currency`, `v2.core.AccountCreateParams.identity.business_details.annual_revenue.amount.currency`, `v2.core.AccountCreateParams.identity.business_details.monthly_estimated_revenue.amount.currency`, `v2.core.AccountTokenCreateParams.identity.business_details.annual_revenue.amount.currency`, `v2.core.AccountTokenCreateParams.identity.business_details.monthly_estimated_revenue.amount.currency`, `v2.core.AccountUpdateParams.identity.business_details.annual_revenue.amount.currency`, `v2.core.AccountUpdateParams.identity.business_details.monthly_estimated_revenue.amount.currency`, `v2.moneymanagement.CurrencyConversionCreateParams.from.amount.currency`, `v2.moneymanagement.CurrencyConversionCreateParams.to.amount.currency`, `v2.moneymanagement.InboundTransferCreateParams.amount.currency`, `v2.moneymanagement.OutboundPaymentCreateParams.amount.currency`, `v2.moneymanagement.OutboundPaymentQuoteCreateParams.amount.currency`, `v2.moneymanagement.OutboundTransferCreateParams.amount.currency`, `v2.payments.OffSessionPaymentCreateParams.amount.currency`, `v2.payments.SettlementAllocationIntentCreateParams.amount.currency`, `v2.payments.SettlementAllocationIntentSplitCreateParams.amount.currency`, and `v2.payments.SettlementAllocationIntentUpdateParams.amount.currency` to be required

## 31.4.0-alpha.2 - 2026-02-04
* [#2151](https://github.com/stripe/stripe-java/pull/2151) Update generated code for private-preview
  * Add support for new resource `v2.core.ConnectionSession`
  * Add support for `create` and `retrieve` methods on resource `v2.core.ConnectionSession`
  * Add support for `list` method on resources `v2.payments.SettlementAllocationIntentSplit` and `v2.payments.SettlementAllocationIntent`
  * Add support for `agenticCommerceSettings` on `AccountSessionCreateParams.components`
  * Add support for `terminalHardwareOrders` and `terminalHardwareShop` on `AccountSession.components` and `AccountSessionCreateParams.components`
  * Add support for `networkCostPassthroughReport` on `AccountSession.components`
  * Add support for `cadenceData` on `v2.billing.IntentCreateParams` and `v2.billing.Intent`
  * Add support for `cancellationDetails` on `v2.billing.IntentAction.deactivate`, `v2.billing.IntentCreateParams.actions[].deactivate`, and `v2.billing.PricingPlanSubscription`
  * Add support for `contactPhone` on `v2.core.AccountCreateParams`, `v2.core.AccountTokenCreateParams`, `v2.core.AccountUpdateParams`, and `v2.core.Account`
  * Add support for `registrationDate` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, `v2.core.AccountTokenCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
  * Add support for `reference` on `v2.moneymanagement.Adjustment`
  * Add support for `accruedFees` on `v2.moneymanagement.FinancialAccount`
  * Add support for `startingBalance` on `v2.moneymanagement.FinancialAccount.payments`
  * Add support for `accountHolderAddress` and `accountHolderName` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
  * Add support for `fingerprint` on `v2.moneymanagement.PayoutMethod.card`
  * Add support for `cardSpend` on `v2.moneymanagement.ReceivedCredit` and `v2.moneymanagement.ReceivedDebit`
  * Add support for `applicationFeeRefund`, `applicationFee`, `charge`, `dispute`, `payout`, `refund`, `reserveHold`, `reserveRelease`, `topup`, `transferReversal`, and `transfer` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
  * Add support for new value `accrued_fees` on enum `v2.moneymanagement.FinancialAccountListParams.types`
  * Add support for new value `gb_vat` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Change `v2.billing.RateCardRateCreateParams.meteredItem` to be required

## 31.4.0-alpha.1 - 2026-01-28
This release changes the pinned API version to `2026-01-28.preview`.

* [#2148](https://github.com/stripe/stripe-java/pull/2148) Update generated code for private-preview
  * Add support for new resources `FrMealVouchersOnboarding`, `reserve.Hold`, `reserve.Plan`, and `reserve.Release`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resource `FrMealVouchersOnboarding`
  * Add support for `list` and `retrieve` methods on resources `reserve.Hold` and `reserve.Release`
  * Add support for `retrieve` method on resource `reserve.Plan`
  * Add support for `pause` method on resource `Subscription`
  * Add support for `servicePeriodDetails` on `Discount`
  * Add support for `agenticCommerceSettings` on `AccountSession.components`
  * Add support for new value `service_period` on enums `CouponCreateParams.duration`, `checkout.SessionCreateParams.discounts[].coupon_data.duration`, and `checkout.SessionUpdateParams.discounts[].coupon_data.duration`
  * Add support for `servicePeriod` on `CouponCreateParams` and `Coupon`
  * Change type of `InvoiceItem.pricing.price_details.price` and `InvoiceLineItem.pricing.price_details.price` from `string` to `expandable($Price)`
  * Add support for `settings` on `InvoiceCreatePreviewParams.discounts[]`, `InvoiceCreatePreviewParams.schedule_details.amendments[].discount_actions[].add`, `InvoiceCreatePreviewParams.schedule_details.amendments[].discount_actions[].set`, `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].add.discounts[]`, `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].set.discounts[]`, `InvoiceCreatePreviewParams.schedule_details.phases[].discounts[]`, `InvoiceCreatePreviewParams.schedule_details.phases[].items[].discounts[]`, `InvoiceCreatePreviewParams.subscription_details.items[].discounts[]`, `QuoteCreateParams.lines[].actions[].add_discount`, `QuoteCreateParams.lines[].actions[].add_item.discounts[]`, `QuoteCreateParams.lines[].actions[].set_discounts[]`, `QuoteCreateParams.lines[].actions[].set_items[].discounts[]`, `QuoteUpdateParams.lines[].actions[].add_discount`, `QuoteUpdateParams.lines[].actions[].add_item.discounts[]`, `QuoteUpdateParams.lines[].actions[].set_discounts[]`, `QuoteUpdateParams.lines[].actions[].set_items[].discounts[]`, `SubscriptionCreateParams.discounts[]`, `SubscriptionCreateParams.items[].discounts[]`, `SubscriptionItemCreateParams.discounts[]`, `SubscriptionItemUpdateParams.discounts[]`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].add`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].set`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].add.discounts[]`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].set.discounts[]`, `SubscriptionScheduleCreateParams.phases[].discounts[]`, `SubscriptionScheduleCreateParams.phases[].items[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].items[].discounts[]`, `SubscriptionUpdateParams.discounts[]`, and `SubscriptionUpdateParams.items[].discounts[]`
  * Add support for `subtotal` on `InvoiceLineItem`
  * Add support for `billingCadence` on `SubscriptionListParams`

## 31.3.0-alpha.1 - 2026-01-21
* [#2146](https://github.com/stripe/stripe-java/pull/2146) Update generated code for private-preview
  * Remove support for `pause` method on resource `Subscription`

## 31.2.0-alpha.3 - 2026-01-14
* [#2143](https://github.com/stripe/stripe-java/pull/2143) Update generated code for private-preview
  * Add support for `riskDetails` on `delegatedcheckout.RequestedSession`
  * Remove support for `description`, `images`, and `name` on `delegatedcheckout.RequestedSession.line_item_details[]`
  * Add support for `name` on `productcatalog.TrialOfferCreateParams` and `productcatalog.TrialOffer`
  * Add support for `loginFailed` and `registrationFailed` on `radar.AccountEvaluation.events[]` and `radar.AccountEvaluationUpdateParams`
  * Change type of `radar.AccountEvaluationUpdateParams.type` from `literal('registration_succeeded')` to `enum('login_failed'|'login_succeeded'|'registration_failed'|'registration_succeeded')`

## 31.2.0-alpha.2 - 2026-01-07
* [#2127](https://github.com/stripe/stripe-java/pull/2127) Update generated code for private-preview
  * Add support for new resource `tax.Location`
  * Add support for `create`, `list`, and `retrieve` methods on resource `tax.Location`
  * Add support for `pause` method on resource `Subscription`
  * Add support for `performanceLocation` on `InvoiceAddLinesParams.lines[].price_data.product_data.tax_details`, `InvoiceLineItemUpdateParams.price_data.product_data.tax_details`, `InvoiceUpdateLinesParams.lines[].price_data.product_data.tax_details`, `PaymentLinkCreateParams.line_items[].price_data.product_data.tax_details`, `ProductCreateParams.tax_details`, `ProductUpdateParams.tax_details`, `checkout.SessionCreateParams.line_items[].price_data.product_data.tax_details`, `checkout.SessionUpdateParams.line_items[].price_data.product_data.tax_details`, `tax.CalculationCreateParams.line_items[]`, and `tax.CalculationLineItem`
  * Change type of `delegatedcheckout.RequestedSessionUpdateParams.metadata` from `map(string: string)` to `emptyable(map(string: string))`
  * Change type of `delegatedcheckout.RequestedSessionUpdateParams.paymentMethodData` from `payment_method_data` to `emptyable(payment_method_data)`
  * Change type of `delegatedcheckout.RequestedSessionUpdateParams.sharedMetadata` from `map(string: string)` to `emptyable(map(string: string))`
  * Add support for `subscription` on `Invoice.parent.schedule_details` and `QuotePreviewInvoice.parent.schedule_details`
  * Change type of `PaymentIntentConfirmParams.payment_details.benefit.frMealVoucher`, `PaymentIntentCreateParams.payment_details.benefit.frMealVoucher`, `PaymentIntentUpdateParams.payment_details.benefit.frMealVoucher`, `SetupIntentConfirmParams.setup_details.benefit.frMealVoucher`, `SetupIntentCreateParams.setup_details.benefit.frMealVoucher`, and `SetupIntentUpdateParams.setup_details.benefit.frMealVoucher` from `payment_details_benefit_fr_meal_voucher` to `emptyable(payment_details_benefit_fr_meal_voucher)`
  * Add support for `taxDetails` on `PlanCreateParams.product[0]` and `PriceCreateParams.product_data`
  * Add support for `externalReference` on `Plan` and `Price`
  * Add support for new value `phase_start` on enums `QuoteCreateParams.subscription_data.phaseEffectiveAt`, `QuoteCreateParams.subscription_data_overrides[].phaseEffectiveAt`, `QuoteUpdateParams.subscription_data.phaseEffectiveAt`, and `QuoteUpdateParams.subscription_data_overrides[].phaseEffectiveAt`
  * Remove support for value `line_start` from enums `QuoteCreateParams.subscription_data.phaseEffectiveAt`, `QuoteCreateParams.subscription_data_overrides[].phaseEffectiveAt`, `QuoteUpdateParams.subscription_data.phaseEffectiveAt`, and `QuoteUpdateParams.subscription_data_overrides[].phaseEffectiveAt`
  * Add support for new values `admissions_tax`, `attendance_tax`, `entertainment_tax`, `gross_receipts_tax`, `hospitality_tax`, `luxury_tax`, `resort_tax`, and `tourism_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
  * Add support for `admissionsTax`, `attendanceTax`, `entertainmentTax`, `grossReceiptsTax`, `hospitalityTax`, `luxuryTax`, `resortTax`, and `tourismTax` on `tax.Registration.country_options.us`
  * Add support for `requirements` on `TaxCode`
* [#2135](https://github.com/stripe/stripe-java/pull/2135) Update generated code for private-preview
  * Add support for `trackingDetails` on `v2.moneymanagement.OutboundPayment`
  * Add support for `paperCheck` on `v2.moneymanagement.OutboundPayment.delivery_options` and `v2.moneymanagement.OutboundPaymentCreateParams.delivery_options`
  * Add support for event notification `V2CoreAccountIncludingFutureRequirementsUpdatedEvent` with related object `v2.core.Account`

## 31.2.0-alpha.1 - 2025-12-14
This release changes the pinned API version to `2025-12-15.preview`.

* [#2125](https://github.com/stripe/stripe-java/pull/2125) Update generated code for private-preview
  * Add support for new resources `sharedpayment.GrantedToken`, `v2.iam.ApiKey`, `v2.payments.SettlementAllocationIntentSplit`, `v2.payments.SettlementAllocationIntent`, and `v2.tax.ManualRule`
  * Add support for `retrieve` method on resource `sharedpayment.GrantedToken`
  * Add support for `create` and `update` test helper methods on resource `sharedpayment.GrantedToken`
  * Add support for `create`, `deactivate`, `list`, `retrieve`, and `update` methods on resource `v2.tax.ManualRule`
  * Add support for `cancel`, `create`, `retrieve`, `submit`, and `update` methods on resource `v2.payments.SettlementAllocationIntent`
  * Add support for `cancel`, `create`, and `retrieve` methods on resource `v2.payments.SettlementAllocationIntentSplit`
  * Add support for `create`, `expire`, `list`, `retrieve`, `rotate`, and `update` methods on resource `v2.iam.ApiKey`
  * Add support for `checkScanning` on `AccountSessionCreateParams.components`
  * Add support for `taxDetails` on `InvoiceAddLinesParams.lines[].price_data.product_data`, `InvoiceLineItemUpdateParams.price_data.product_data`, `InvoiceUpdateLinesParams.lines[].price_data.product_data`, `PaymentLinkCreateParams.line_items[].price_data.product_data`, `ProductCreateParams`, `ProductUpdateParams`, `checkout.SessionCreateParams.line_items[].price_data.product_data`, and `checkout.SessionUpdateParams.line_items[].price_data.product_data`
  * Add support for `paymentMethodData` on `delegatedcheckout.RequestedSessionConfirmParams`
  * Add support for `productDetails` on `delegatedcheckout.RequestedSession.line_item_details[]`
  * Add support for `wallets` on `issuing.CardListParams`
  * Add support for `primaryAccountIdentifier` on `issuing.Card.wallets.apple_pay` and `issuing.Card.wallets.google_pay`
  * Add support for `sharedPaymentGrantedToken` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, and `PaymentIntent`
  * Add support for `instant` on `v2.Account.configuration.recipient_data.features.bank_accounts`, `v2.AccountCreateParams.configuration.recipient_data.features.bank_accounts`, `v2.AccountUpdateParams.configuration.recipient_data.features.bank_accounts`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts`
  * Add support for `collectAt` on `v2.billing.IntentAction.deactivate`, `v2.billing.IntentAction.modify`, `v2.billing.IntentAction.subscribe`, `v2.billing.IntentCreateParams.actions[].deactivate`, `v2.billing.IntentCreateParams.actions[].modify`, and `v2.billing.IntentCreateParams.actions[].subscribe`
  * Remove support for `billingDetails` on `v2.billing.IntentAction.deactivate`, `v2.billing.IntentAction.modify`, `v2.billing.IntentAction.subscribe`, `v2.billing.IntentCreateParams.actions[].deactivate`, `v2.billing.IntentCreateParams.actions[].modify`, and `v2.billing.IntentCreateParams.actions[].subscribe`
  * Add support for `overrides` on `v2.billing.IntentAction.deactivate.pricing_plan_subscription_details`, `v2.billing.IntentAction.modify.pricing_plan_subscription_details`, `v2.billing.IntentAction.subscribe.pricing_plan_subscription_details`, `v2.billing.IntentCreateParams.actions[].deactivate.pricing_plan_subscription_details`, `v2.billing.IntentCreateParams.actions[].modify.pricing_plan_subscription_details`, and `v2.billing.IntentCreateParams.actions[].subscribe.pricing_plan_subscription_details`
  * Remove support for `requested` on `v2.core.Account.configuration.card_creator.capabilities.commercial.celtic.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.celtic.spend_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.spend_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.lead.prepaid_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe.prepaid_card`, `v2.core.Account.configuration.recipient.capabilities.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.financial_addresses.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.usdc`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.crypto_wallets`, and `v2.core.Account.configuration.storer.capabilities.outbound_transfers.crypto_wallets`
  * Add support for `alternativeReference` on `v2.core.vault.GbBankAccount`, `v2.core.vault.UsBankAccount`, and `v2.moneymanagement.PayoutMethod`
  * Add support for `managedBy` and `payments` on `v2.moneymanagement.FinancialAccount`
  * Add support for `speed` on `v2.moneymanagement.OutboundPayment.delivery_options`, `v2.moneymanagement.OutboundPaymentCreateParams.delivery_options`, `v2.moneymanagement.OutboundPaymentQuote.delivery_options`, and `v2.moneymanagement.OutboundPaymentQuoteCreateParams.delivery_options`
  * Add support for `types` on `v2.moneymanagement.FinancialAccountListParams`
  * Change type of `v2.core.AccountListParams.appliedConfigurations` from `string` to `enum`
  * Add support for new value `bank_accounts.instant` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
  * Add support for `topImpactedAccounts` on `EventsV2CoreHealthApiErrorFiringEvent.impact`, `EventsV2CoreHealthApiErrorResolvedEvent.impact`, `EventsV2CoreHealthApiLatencyFiringEvent.impact`, `EventsV2CoreHealthApiLatencyResolvedEvent.impact`, `EventsV2CoreHealthPaymentMethodErrorFiringEvent.impact`, and `EventsV2CoreHealthPaymentMethodErrorResolvedEvent.impact`
  * Add support for event notifications `V2CoreHealthSepaDebitDelayedFiringEvent`, `V2CoreHealthSepaDebitDelayedResolvedEvent`, and `V2PaymentsSettlementAllocationIntentNotFoundEvent`
  * Add support for event notifications `V2PaymentsSettlementAllocationIntentCanceledEvent`, `V2PaymentsSettlementAllocationIntentCreatedEvent`, `V2PaymentsSettlementAllocationIntentErroredEvent`, `V2PaymentsSettlementAllocationIntentFundsNotReceivedEvent`, `V2PaymentsSettlementAllocationIntentMatchedEvent`, `V2PaymentsSettlementAllocationIntentSettledEvent`, and `V2PaymentsSettlementAllocationIntentSubmittedEvent` with related object `v2.payments.SettlementAllocationIntent`
  * Add support for event notifications `V2PaymentsSettlementAllocationIntentSplitCanceledEvent`, `V2PaymentsSettlementAllocationIntentSplitCreatedEvent`, and `V2PaymentsSettlementAllocationIntentSplitSettledEvent` with related object `v2.payments.SettlementAllocationIntentSplit`

## 31.1.0-alpha.4 - 2025-12-04
* [#2123](https://github.com/stripe/stripe-java/pull/2123) Update generated code for private-preview
  * Add support for event notifications `V2IamApiKeyCreatedEvent`, `V2IamApiKeyDefaultSecretRevealedEvent`, `V2IamApiKeyExpiredEvent`, `V2IamApiKeyPermissionsUpdatedEvent`, `V2IamApiKeyRotatedEvent`, and `V2IamApiKeyUpdatedEvent`
* [#2122](https://github.com/stripe/stripe-java/pull/2122) Update generated code for private-preview
  * Add support for `checkScanning` on `AccountSession.components`
  * Add support for `client` on `v2.core.Event.reason.request`
  * Add support for `stripeBalancePayment` on `v2.moneymanagement.ReceivedCredit` and `v2.moneymanagement.ReceivedDebit`
  * Add support for `balanceTransfer` on `v2.moneymanagement.ReceivedDebit`
  * Add support for `include` on `v2.core.EventListParams` and `v2.core.EventRetrieveParams`

## 31.1.0-alpha.3 - 2025-11-24
* [#2119](https://github.com/stripe/stripe-java/pull/2119) Update generated code for private-preview
  * Add support for new resource `productcatalog.TrialOffer`
  * Add support for `create` method on resource `productcatalog.TrialOffer`
  * Remove support for `amountSubtotalAfterDiscount` on `delegatedcheckout.RequestedSession.line_item_details[]` and `delegatedcheckout.RequestedSession.total_details`
  * Remove support for `amountTotal`, `unitAmountAfterDiscount`, and `unitDiscount` on `delegatedcheckout.RequestedSession.line_item_details[]`
  * Add support for `amountCartDiscount` and `amountItemsDiscount` on `delegatedcheckout.RequestedSession.total_details`
  * Remove support for `amountDiscount` on `delegatedcheckout.RequestedSession.total_details`
  * Add support for `paymentsOrchestration` on `PaymentIntentCreateParams` and `PaymentIntent`

## 31.1.0-alpha.2 - 2025-11-20
* [#2118](https://github.com/stripe/stripe-java/pull/2118) Update generated code for private-preview
  * Add support for new resources `v2.core.AccountPersonToken`, `v2.core.AccountToken`, and `v2.moneymanagement.CurrencyConversion`
  * Add support for `create`, `list`, and `retrieve` methods on resource `v2.moneymanagement.CurrencyConversion`
  * Add support for `create` and `retrieve` methods on resources `v2.core.AccountPersonToken` and `v2.core.AccountToken`
  * Add support for `effectiveAt` on `InvoiceCreatePreviewParams.schedule_details.amendments[]`, `InvoiceCreatePreviewParams.schedule_details.phases[]`, `QuoteCreateParams.lines[]`, `QuoteLine`, `QuotePreviewSubscriptionSchedule.phases[]`, `QuoteUpdateParams.lines[]`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleAmendParams.amendments[]`, `SubscriptionScheduleCreateParams.phases[]`, and `SubscriptionScheduleUpdateParams.phases[]`
  * Add support for `trialOffer` on `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].add`, `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].set`, `InvoiceCreatePreviewParams.schedule_details.phases[].items[]`, `QuoteCreateParams.lines[].actions[].add_item`, `QuoteCreateParams.lines[].actions[].set_items[]`, `QuoteLine.actions[].add_item`, `QuoteLine.actions[].set_items[]`, `QuotePreviewSubscriptionSchedule.phases[].items[]`, `QuoteUpdateParams.lines[].actions[].add_item`, `QuoteUpdateParams.lines[].actions[].set_items[]`, `SubscriptionSchedule.phases[].items[]`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].add`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].set`, `SubscriptionScheduleCreateParams.phases[].items[]`, and `SubscriptionScheduleUpdateParams.phases[].items[]`
  * Add support for `amountDiscount`, `amountSubtotal`, `amountTotal`, `unitAmountAfterDiscount`, and `unitDiscount` on `delegatedcheckout.RequestedSession.line_item_details[]`
  * Add support for `amountSubtotalAfterDiscount` on `delegatedcheckout.RequestedSession.line_item_details[]` and `delegatedcheckout.RequestedSession.total_details`
  * Change type of `InvoiceCreatePreviewParams.schedule_details.billingSchedules` from `array(billing_schedules_update_params)` to `emptyable(array(billing_schedules_update_params))`
  * Remove support for values `amendment_end`, `line_ends_at`, `schedule_end`, and `upcoming_invoice` from enums `InvoiceCreatePreviewParams.subscription_details.billing_schedules[].bill_until.type`, `SubscriptionCreateParams.billing_schedules[].bill_until.type`, `SubscriptionScheduleCreateParams.billing_schedules[].bill_until.type`, `SubscriptionScheduleUpdateParams.billing_schedules[].bill_until.type`, and `SubscriptionUpdateParams.billing_schedules[].bill_until.type`
  * Add support for `currentTrial` on `InvoiceCreatePreviewParams.subscription_details.items[]`, `SubscriptionCreateParams.items[]`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionItem`, and `SubscriptionUpdateParams.items[]`
  * Change type of `QuoteCreateParams.subscription_data.billingSchedules` and `QuoteCreateParams.subscription_data_overrides[].billingSchedules` from `emptyable(array(billing_schedules_create_specs))` to `array(billing_schedules_create_specs)`
  * Add support for new value `line_start` on enums `QuoteCreateParams.subscription_data.phaseEffectiveAt`, `QuoteCreateParams.subscription_data_overrides[].phaseEffectiveAt`, `QuoteUpdateParams.subscription_data.phaseEffectiveAt`, and `QuoteUpdateParams.subscription_data_overrides[].phaseEffectiveAt`
  * Remove support for value `phase_start` from enums `QuoteCreateParams.subscription_data.phaseEffectiveAt`, `QuoteCreateParams.subscription_data_overrides[].phaseEffectiveAt`, `QuoteUpdateParams.subscription_data.phaseEffectiveAt`, and `QuoteUpdateParams.subscription_data_overrides[].phaseEffectiveAt`
  * Change type of `Quote.subscription_data.billingSchedules` and `Quote.subscription_data_overrides[].billingSchedules` from `nullable(array(SubscriptionsResourceBillingSchedules))` to `array(QuotesResourceSubscriptionDataBillingSchedules)`
  * Change type of `Quote.subscription_data.phaseEffectiveAt` and `Quote.subscription_data_overrides[].phaseEffectiveAt` from `nullable(enum('billing_period_start'|'phase_start'))` to `enum('billing_period_start'|'line_start')`
  * Change type of `QuotePreviewSubscriptionSchedule.billingSchedules` and `SubscriptionSchedule.billingSchedules` from `nullable(array(SubscriptionsResourceBillingSchedules))` to `array(SubscriptionsResourceBillingSchedules)`
  * Remove support for `amendmentStart`, `lineStartsAt`, and `relative` on `Subscription.billing_schedules[].bill_from`
  * Change type of `Subscription.billing_schedules[].bill_from.type` from `enum` to `literal('timestamp')`
  * Remove support for `amendmentEnd` and `lineEndsAt` on `Subscription.billing_schedules[].bill_until`
  * Change type of `v2.billing.ServiceAction.credit_grant.amount.monetary`, `v2.billing.ServiceAction.credit_grant_per_tenant.amount.monetary`, `v2.billing.ServiceActionCreateParams.credit_grant.amount.monetary`, and `v2.billing.ServiceActionCreateParams.credit_grant_per_tenant.amount.monetary` from `amount` to `an object`
  * Add support for `futureRequirements` on `v2.core.Account`
  * Add support for `konbiniPayments` and `scriptStatementDescriptor` on `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
  * Add support for `eur` on `v2.core.Account.configuration.storer.capabilities.holds_currencies`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies`
  * Add support for `requirementsCollector` on `v2.core.Account.defaults.responsibilities`
  * Remove support for `collector` on `v2.core.Account.requirements`
  * Remove support for `v1EventId` on `v2.core.Event`
  * Remove support for `amountDetails` and `captureMethod` on `v2.payments.OffSessionPaymentCreateParams` and `v2.payments.OffSessionPayment`
  * Change type of `v2.payments.OffSessionPayment.amountCapturable` from `amount` to `an object`
  * Change type of `v2.payments.OffSessionPayment.amountRequested` from `amount` to `an object`
  * Change type of `v2.payments.OffSessionPaymentCreateParams.amount` from `amount` to `an object`
  * Add support for new value `best_available` on enum `v2.payments.OffSessionPaymentCreateParams.retry_details.retryStrategy`
  * Remove support for values `heuristic`, `scheduled`, and `smart` from enum `v2.payments.OffSessionPaymentCreateParams.retry_details.retryStrategy`
  * Change `v2.payments.OffSessionPaymentCreateParams.retry_details.retryStrategy` to be optional
  * Remove support for `destination` on `v2.payments.OffSessionPaymentCaptureParams.transfer_data`
  * Change `v2.payments.OffSessionPaymentCaptureParams.amountToCapture` to be optional
  * Add support for `created` on `v2.core.EventListParams`
  * Remove support for `gt`, `gte`, `lt`, and `lte` on `v2.core.EventListParams`
  * Add support for `accountToken` on `v2.core.AccountCreateParams` and `v2.core.AccountUpdateParams`
  * Add support for new value `ar_cuit` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type` and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Add support for new value `ar_dni` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountPersonCreateParams.id_numbers[].type`, `v2.core.AccountPersonUpdateParams.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`
  * Add support for new value `future_requirements` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * Add support for `personToken` on `v2.core.AccountPersonCreateParams` and `v2.core.AccountPersonUpdateParams`
  * Add support for `impactedRequestsPercentage` on `EventsV2CoreHealthApiErrorFiringEvent.impact`, `EventsV2CoreHealthApiErrorResolvedEvent.impact`, `EventsV2CoreHealthApiLatencyFiringEvent.impact`, `EventsV2CoreHealthApiLatencyResolvedEvent.impact`, `EventsV2CoreHealthPaymentMethodErrorFiringEvent.impact`, and `EventsV2CoreHealthPaymentMethodErrorResolvedEvent.impact`
  * Add support for `context` and `relatedObject` on `EventsV2CoreHealthEventGenerationFailureResolvedEvent.impact`
  * Remove support for `account`, `livemode`, `missingDeliveryAttempts`, and `relatedObjectId` on `EventsV2CoreHealthEventGenerationFailureResolvedEvent.impact`
  * Change type of `EventsV2CoreHealthFraudRateIncreasedEvent.impact.realizedFraudAmount` from `amount` to `an object`
  * Change type of `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent.impact.approvedAmount`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.impact.approvedAmount`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.impact.approvedAmount`, and `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.impact.approvedAmount` from `amount` to `an object`
  * Change type of `EventsV2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent.impact.declinedAmount`, `EventsV2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent.impact.declinedAmount`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent.impact.declinedAmount`, and `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent.impact.declinedAmount` from `amount` to `an object`
  * Add support for thin events `V2PaymentsOffSessionPaymentAttemptFailedEvent` and `V2PaymentsOffSessionPaymentAttemptStartedEvent` with related object `v2.payments.OffSessionPayment`
  * Remove support for thin event `V1AccountUpdatedEvent` with related object `Account`
  * Remove support for thin events `V1ApplicationFeeCreatedEvent` and `V1ApplicationFeeRefundedEvent` with related object `ApplicationFee`
  * Remove support for thin events `V1BillingPortalConfigurationCreatedEvent` and `V1BillingPortalConfigurationUpdatedEvent` with related object `billingportal.Configuration`
  * Remove support for thin event `V1CapabilityUpdatedEvent` with related object `Capability`
  * Remove support for thin events `V1ChargeCapturedEvent`, `V1ChargeExpiredEvent`, `V1ChargeFailedEvent`, `V1ChargePendingEvent`, `V1ChargeRefundedEvent`, `V1ChargeSucceededEvent`, and `V1ChargeUpdatedEvent` with related object `Charge`
  * Remove support for thin events `V1ChargeDisputeClosedEvent`, `V1ChargeDisputeCreatedEvent`, `V1ChargeDisputeFundsReinstatedEvent`, `V1ChargeDisputeFundsWithdrawnEvent`, and `V1ChargeDisputeUpdatedEvent` with related object `Dispute`
  * Remove support for thin events `V1ChargeRefundUpdatedEvent`, `V1RefundCreatedEvent`, `V1RefundFailedEvent`, and `V1RefundUpdatedEvent` with related object `Refund`
  * Remove support for thin events `V1CheckoutSessionAsyncPaymentFailedEvent`, `V1CheckoutSessionAsyncPaymentSucceededEvent`, `V1CheckoutSessionCompletedEvent`, and `V1CheckoutSessionExpiredEvent` with related object `checkout.Session`
  * Remove support for thin events `V1ClimateOrderCanceledEvent`, `V1ClimateOrderCreatedEvent`, `V1ClimateOrderDelayedEvent`, `V1ClimateOrderDeliveredEvent`, and `V1ClimateOrderProductSubstitutedEvent` with related object `climate.Order`
  * Remove support for thin events `V1ClimateProductCreatedEvent` and `V1ClimateProductPricingUpdatedEvent` with related object `climate.Product`
  * Remove support for thin events `V1CouponCreatedEvent`, `V1CouponDeletedEvent`, and `V1CouponUpdatedEvent` with related object `Coupon`
  * Remove support for thin events `V1CreditNoteCreatedEvent`, `V1CreditNoteUpdatedEvent`, and `V1CreditNoteVoidedEvent` with related object `CreditNote`
  * Remove support for thin events `V1CustomerCreatedEvent`, `V1CustomerDeletedEvent`, and `V1CustomerUpdatedEvent` with related object `Customer`
  * Remove support for thin events `V1CustomerSubscriptionCreatedEvent`, `V1CustomerSubscriptionDeletedEvent`, `V1CustomerSubscriptionPausedEvent`, `V1CustomerSubscriptionPendingUpdateAppliedEvent`, `V1CustomerSubscriptionPendingUpdateExpiredEvent`, `V1CustomerSubscriptionResumedEvent`, `V1CustomerSubscriptionTrialWillEndEvent`, and `V1CustomerSubscriptionUpdatedEvent` with related object `Subscription`
  * Remove support for thin events `V1CustomerTaxIdCreatedEvent`, `V1CustomerTaxIdDeletedEvent`, and `V1CustomerTaxIdUpdatedEvent` with related object `TaxId`
  * Remove support for thin event `V1FileCreatedEvent` with related object `File`
  * Remove support for thin events `V1FinancialConnectionsAccountCreatedEvent`, `V1FinancialConnectionsAccountDeactivatedEvent`, `V1FinancialConnectionsAccountDisconnectedEvent`, `V1FinancialConnectionsAccountReactivatedEvent`, `V1FinancialConnectionsAccountRefreshedBalanceEvent`, `V1FinancialConnectionsAccountRefreshedOwnershipEvent`, and `V1FinancialConnectionsAccountRefreshedTransactionsEvent` with related object `financialconnections.Account`
  * Remove support for thin events `V1IdentityVerificationSessionCanceledEvent`, `V1IdentityVerificationSessionCreatedEvent`, `V1IdentityVerificationSessionProcessingEvent`, `V1IdentityVerificationSessionRedactedEvent`, `V1IdentityVerificationSessionRequiresInputEvent`, and `V1IdentityVerificationSessionVerifiedEvent` with related object `identity.VerificationSession`
  * Remove support for thin events `V1InvoiceCreatedEvent`, `V1InvoiceDeletedEvent`, `V1InvoiceFinalizationFailedEvent`, `V1InvoiceFinalizedEvent`, `V1InvoiceMarkedUncollectibleEvent`, `V1InvoiceOverdueEvent`, `V1InvoiceOverpaidEvent`, `V1InvoicePaidEvent`, `V1InvoicePaymentActionRequiredEvent`, `V1InvoicePaymentFailedEvent`, `V1InvoicePaymentSucceededEvent`, `V1InvoiceSentEvent`, `V1InvoiceUpcomingEvent`, `V1InvoiceUpdatedEvent`, `V1InvoiceVoidedEvent`, and `V1InvoiceWillBeDueEvent` with related object `Invoice`
  * Remove support for thin event `V1InvoicePaymentPaidEvent` with related object `InvoicePayment`
  * Remove support for thin events `V1InvoiceitemCreatedEvent` and `V1InvoiceitemDeletedEvent` with related object `InvoiceItem`
  * Remove support for thin events `V1IssuingAuthorizationCreatedEvent`, `V1IssuingAuthorizationRequestEvent`, and `V1IssuingAuthorizationUpdatedEvent` with related object `issuing.Authorization`
  * Remove support for thin events `V1IssuingCardCreatedEvent` and `V1IssuingCardUpdatedEvent` with related object `issuing.Card`
  * Remove support for thin events `V1IssuingCardholderCreatedEvent` and `V1IssuingCardholderUpdatedEvent` with related object `issuing.Cardholder`
  * Remove support for thin events `V1IssuingDisputeClosedEvent`, `V1IssuingDisputeCreatedEvent`, `V1IssuingDisputeFundsReinstatedEvent`, `V1IssuingDisputeFundsRescindedEvent`, `V1IssuingDisputeSubmittedEvent`, and `V1IssuingDisputeUpdatedEvent` with related object `issuing.Dispute`
  * Remove support for thin events `V1IssuingPersonalizationDesignActivatedEvent`, `V1IssuingPersonalizationDesignDeactivatedEvent`, `V1IssuingPersonalizationDesignRejectedEvent`, and `V1IssuingPersonalizationDesignUpdatedEvent` with related object `issuing.PersonalizationDesign`
  * Remove support for thin events `V1IssuingTokenCreatedEvent` and `V1IssuingTokenUpdatedEvent` with related object `issuing.Token`
  * Remove support for thin events `V1IssuingTransactionCreatedEvent`, `V1IssuingTransactionPurchaseDetailsReceiptUpdatedEvent`, and `V1IssuingTransactionUpdatedEvent` with related object `issuing.Transaction`
  * Remove support for thin event `V1MandateUpdatedEvent` with related object `Mandate`
  * Remove support for thin events `V1PaymentIntentAmountCapturableUpdatedEvent`, `V1PaymentIntentCanceledEvent`, `V1PaymentIntentCreatedEvent`, `V1PaymentIntentPartiallyFundedEvent`, `V1PaymentIntentPaymentFailedEvent`, `V1PaymentIntentProcessingEvent`, `V1PaymentIntentRequiresActionEvent`, and `V1PaymentIntentSucceededEvent` with related object `PaymentIntent`
  * Remove support for thin events `V1PaymentLinkCreatedEvent` and `V1PaymentLinkUpdatedEvent` with related object `PaymentLink`
  * Remove support for thin events `V1PaymentMethodAttachedEvent`, `V1PaymentMethodAutomaticallyUpdatedEvent`, `V1PaymentMethodDetachedEvent`, and `V1PaymentMethodUpdatedEvent` with related object `PaymentMethod`
  * Remove support for thin events `V1PayoutCanceledEvent`, `V1PayoutCreatedEvent`, `V1PayoutFailedEvent`, `V1PayoutPaidEvent`, `V1PayoutReconciliationCompletedEvent`, and `V1PayoutUpdatedEvent` with related object `Payout`
  * Remove support for thin events `V1PersonCreatedEvent`, `V1PersonDeletedEvent`, and `V1PersonUpdatedEvent` with related object `Person`
  * Remove support for thin events `V1PlanCreatedEvent`, `V1PlanDeletedEvent`, and `V1PlanUpdatedEvent` with related object `Plan`
  * Remove support for thin events `V1PriceCreatedEvent`, `V1PriceDeletedEvent`, and `V1PriceUpdatedEvent` with related object `Price`
  * Remove support for thin events `V1ProductCreatedEvent`, `V1ProductDeletedEvent`, and `V1ProductUpdatedEvent` with related object `Product`
  * Remove support for thin events `V1PromotionCodeCreatedEvent` and `V1PromotionCodeUpdatedEvent` with related object `PromotionCode`
  * Remove support for thin events `V1QuoteAcceptedEvent`, `V1QuoteCanceledEvent`, `V1QuoteCreatedEvent`, and `V1QuoteFinalizedEvent` with related object `Quote`
  * Remove support for thin events `V1RadarEarlyFraudWarningCreatedEvent` and `V1RadarEarlyFraudWarningUpdatedEvent` with related object `radar.EarlyFraudWarning`
  * Remove support for thin events `V1ReviewClosedEvent` and `V1ReviewOpenedEvent` with related object `Review`
  * Remove support for thin events `V1SetupIntentCanceledEvent`, `V1SetupIntentCreatedEvent`, `V1SetupIntentRequiresActionEvent`, `V1SetupIntentSetupFailedEvent`, and `V1SetupIntentSucceededEvent` with related object `SetupIntent`
  * Remove support for thin event `V1SigmaScheduledQueryRunCreatedEvent` with related object `sigma.ScheduledQueryRun`
  * Remove support for thin events `V1SourceCanceledEvent`, `V1SourceChargeableEvent`, `V1SourceFailedEvent`, and `V1SourceRefundAttributesRequiredEvent` with related object `Source`
  * Remove support for thin events `V1SubscriptionScheduleAbortedEvent`, `V1SubscriptionScheduleCanceledEvent`, `V1SubscriptionScheduleCompletedEvent`, `V1SubscriptionScheduleCreatedEvent`, `V1SubscriptionScheduleExpiringEvent`, `V1SubscriptionScheduleReleasedEvent`, and `V1SubscriptionScheduleUpdatedEvent` with related object `SubscriptionSchedule`
  * Remove support for thin events `V1TaxRateCreatedEvent` and `V1TaxRateUpdatedEvent` with related object `TaxRate`
  * Remove support for thin events `V1TerminalReaderActionFailedEvent`, `V1TerminalReaderActionSucceededEvent`, and `V1TerminalReaderActionUpdatedEvent` with related object `terminal.Reader`
  * Remove support for thin events `V1TestHelpersTestClockAdvancingEvent`, `V1TestHelpersTestClockCreatedEvent`, `V1TestHelpersTestClockDeletedEvent`, `V1TestHelpersTestClockInternalFailureEvent`, and `V1TestHelpersTestClockReadyEvent` with related object `testhelpers.TestClock`
  * Remove support for thin events `V1TopupCanceledEvent`, `V1TopupCreatedEvent`, `V1TopupFailedEvent`, `V1TopupReversedEvent`, and `V1TopupSucceededEvent` with related object `Topup`
  * Remove support for thin events `V1TransferCreatedEvent`, `V1TransferReversedEvent`, and `V1TransferUpdatedEvent` with related object `Transfer`

## 31.1.0-alpha.1 - 2025-11-18
This release changes the pinned API version to `2025-11-17.preview`.

* [#2112](https://github.com/stripe/stripe-java/pull/2112) Update generated code for private-preview
  * Add support for new resources `BalanceTransfer` and `radar.AccountEvaluation`
  * Add support for `create` method on resource `BalanceTransfer`
  * Add support for `create`, `retrieve`, and `update` methods on resource `radar.AccountEvaluation`
  * Add support for `specifiedCommercialTransactionsActUrl` on `Account.business_profile`, `AccountCreateParams.business_profile`, and `AccountUpdateParams.business_profile`
  * Add support for `paypayPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
  * Change type of `billing.analytics.MeterUsageRetrieveParams.meters[].dimensionFilters` from `string` to `array(string)`
  * Change type of `billing.analytics.MeterUsageRetrieveParams.meters[].tenantFilters` from `string` to `array(string)`
  * Add support for `paymentMethodConfiguration` on `billingportal.Configuration.features.payment_method_update`
  * Add support for `carRentalData`, `flightData`, and `lodgingData` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
  * Add support for `transactionId` on `Charge.payment_method_details.ideal`, `PaymentAttemptRecord.payment_method_details.ideal`, and `PaymentRecord.payment_method_details.ideal`
  * Add support for new value `finom` on enums `ConfirmationTokenCreateParams.payment_method_data.ideal.bank`, `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
  * Add support for `created` on `CustomerBalanceTransactionListParams` and `InvoicePaymentListParams`
  * Add support for `accountNumbers` on `financialconnections.Account`
  * Add support for `billingSchedulesActions` on `InvoiceCreatePreviewParams.schedule_details.amendments[]` and `SubscriptionScheduleAmendParams.amendments[]`
  * Add support for `fraudRisk` on `issuing.AuthorizationCreateParams.risk_assessment`
  * Add support for `latestFraudWarning` on `issuing.Card`
  * Add support for `supplementaryPurchaseData` on `OrderCreateParams.payment.settings.payment_method_options.klarna`, `OrderUpdateParams.payment.settings.payment_method_options.klarna`, `PaymentIntentConfirmParams.payment_method_options.klarna`, `PaymentIntentCreateParams.payment_method_options.klarna`, and `PaymentIntentUpdateParams.payment_method_options.klarna`
  * Add support for `captureMethod` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
  * Add support for `allowRedisplay` and `customerAccount` on `PaymentMethodListParams`
  * Add support for `mbWay` and `twint` on `Refund.destination_details`
  * Change type of `SubscriptionScheduleUpdateParams.billingSchedules` from `array(billing_schedules_update_params)` to `emptyable(array(billing_schedules_update_params))`
  * Add support for new values `capital.financing_offer.accepted_other_offer`, `financial_connections.account.account_numbers_updated`, and `financial_connections.account.upcoming_account_number_expiry` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for new value `2025-11-17.clover` on enum `WebhookEndpointCreateParams.apiVersion`
  * Add support for snapshot events `financial_connections.account.account_numbers_updated` and `financial_connections.account.upcoming_account_number_expiry` with resource `financialconnections.Account`

## 30.3.0-alpha.2 - 2025-11-13
This release changes the pinned API version to `2025-10-29.preview`.

* ⚠️ [#2107](https://github.com/stripe/stripe-java/pull/2107) Update generated code for private-preview
  * ⚠️ Remove support for resource `v2.tax.AutomaticRule`
  * ⚠️ Remove support for `create`, `deactivate`, `find`, `retrieve`, and `update` methods on resource `v2.tax.AutomaticRule`
  * Add support for `selfReportedIncome` and `selfReportedMonthlyHousingPayment` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `Person`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
  * Add support for new values `amendment_end`, `line_ends_at`, `schedule_end`, and `upcoming_invoice` on enums `InvoiceCreatePreviewParams.subscription_details.billing_schedules[].bill_until.type`, `SubscriptionCreateParams.billing_schedules[].bill_until.type`, and `SubscriptionUpdateParams.billing_schedules[].bill_until.type`
  * Add support for `billingSchedules` and `phaseEffectiveAt` on `Quote.subscription_data_overrides[]`, `Quote.subscription_data`, `QuoteCreateParams.subscription_data_overrides[]`, `QuoteCreateParams.subscription_data`, `QuoteUpdateParams.subscription_data_overrides[]`, and `QuoteUpdateParams.subscription_data`
  * Add support for `billFrom` on `Subscription.billing_schedules[]`
  * Add support for `amendmentEnd` and `lineEndsAt` on `Subscription.billing_schedules[].bill_until`
* [#2111](https://github.com/stripe/stripe-java/pull/2111) Update generated code for private-preview
  * Add support for new resource `issuing.Program`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resource `issuing.Program`
  * Add support for `schedule` on `Discount`
  * Add support for `applicableFees` on `delegatedcheckout.RequestedSession.total_details`
  * Add support for `scheduleDetails` on `Invoice.parent`, `InvoiceItem.parent`, `InvoiceLineItem.parent`, and `QuotePreviewInvoice.parent`
  * Add support for `billingSchedules` on `InvoiceCreatePreviewParams.schedule_details`, `QuotePreviewSubscriptionSchedule`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams`, and `SubscriptionSchedule`
  * Add support for `latestInvoice` on `QuotePreviewSubscriptionSchedule` and `SubscriptionSchedule`
  * Add support for `phaseEffectiveAt` on `QuotePreviewSubscriptionSchedule.default_settings`, `SubscriptionSchedule.default_settings`, `SubscriptionScheduleCreateParams.default_settings`, and `SubscriptionScheduleUpdateParams.default_settings`

## 30.3.0-alpha.1 - 2025-11-06
* [#2105](https://github.com/stripe/stripe-java/pull/2105) Update generated code for private-preview
  * Add support for new resources `TransitBalance`, `v2.reporting.ReportRun`, `v2.reporting.Report`
  * Add support for `create` and `retrieve` methods on resource `v2.reporting.ReportRun`
  * Add support for `retrieve` method on resource `v2.reporting.Report`
  * Add support for `create` and `refill` test helper methods on resource `capital.FinancingOffer`
  * Add support for `allocatedFunds` on `Charge`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, and `PaymentIntentUpdateParams`
  * Add support for thin events `V2ReportingReportRunCreatedEvent`, `V2ReportingReportRunFailedEvent`, `V2ReportingReportRunSucceededEvent`, and `V2ReportingReportRunUpdatedEvent` with related object `v2.reporting.ReportRun`

## 30.2.1-alpha.1 - 2025-11-05
* Updated publishing configuration.  No changes to SDK content.

## 30.2.0-alpha.2 - 2025-10-30
* [#2099](https://github.com/stripe/stripe-java/pull/2099) Update generated code for private-preview
  * Change `delegatedcheckout.RequestedSessionUpdateParams.line_item_details[].quantity` to be required
  * Add support for `paymentMethodPreview` on `delegatedcheckout.RequestedSession`
  * Add support for `orderId` on `delegatedcheckout.RequestedSession.order_details`
  * Add support for `lead` on `v2.core.Account.configuration.card_creator.capabilities.commercial`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial`
  * Add support for `globalAccountHolder` on `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial`
  * Add support for new value `commercial.lead.prepaid_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

## 30.2.0-alpha.1 - 2025-10-29
* [#2091](https://github.com/stripe/stripe-java/pull/2091) Update generated code for private-preview
  * Add support for `report_refund` method on resource `PaymentRecord`
  * Add support for `tenants` on `billing.analytics.MeterUsageRow`
  * Add support for `representativeDeclaration` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
  * Add support for `transfer` on `ApplicationFee.fee_source`
  * Add support for `transitBalancesTotal` on `Balance`
  * Add support for `tenantGroupByKeys` on `billing.analytics.MeterUsageRetrieveParams.meters[]`
  * Change `billing.CreditGrantCreateParams.category` to be optional
  * Add support for `paymentMethodConfiguration` on `billingportal.ConfigurationCreateParams.features.payment_method_update` and `billingportal.ConfigurationUpdateParams.features.payment_method_update`
  * Add support for `paymentPortalUrl` on `Charge.payment_method_details.rechnung`, `PaymentAttemptRecord.payment_method_details.rechnung`, and `PaymentRecord.payment_method_details.rechnung`
  * Add support for `twint` on `checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
  * Add support for `customerSheet`, `mobilePaymentElement`, and `taxIdElement` on `CustomerSession.components` and `CustomerSessionCreateParams.components`
  * Add support for new value `custom` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `provider` on `Customer.tax`
  * Remove support for `riskDetails` on `delegatedcheckout.RequestedSessionCreateParams`
  * Add support for `riskDetails` on `delegatedcheckout.RequestedSessionConfirmParams`
  * Add support for new value `platform_terms_of_service` on enum `FileListParams.purpose`
  * Add support for new value `platform_terms_of_service` on enum `FileCreateParams.purpose`
  * Add support for `startingAfter` on `PaymentAttemptRecordListParams`
  * Add support for `reference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.klarna`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.klarna`
  * Add support for `allocatedFunds` on `PaymentIntent`
  * Add support for `subscriptionReference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`
  * Add support for `nameCollection` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
  * Add support for `crypto` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, and `Refund.destination_details`
  * Add support for `mbWay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
  * Add support for `custom` on `PaymentMethodCreateParams` and `PaymentMethod`
  * Add support for `excludedPaymentMethodTypes` on `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntent`
  * Add support for `tw` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
  * Add support for `gip` on `terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
  * Add support for `lastSeenAt` on `terminal.Reader`
  * Add support for `applicationFeeAmount` on `TransferCreateParams` and `Transfer`
  * Add support for `applicationFee` on `Transfer`
  * Add support for new value `2025-10-29.clover` on enum `WebhookEndpointCreateParams.apiVersion`
  * Add support for `highRiskActivitiesDescription`, `highRiskActivities`, `moneyServicesDescription`, `operatesInProhibitedCountries`, `participatesInRegulatedActivity`, `purposeOfFundsDescription`, `purposeOfFunds`, `regulatedActivity`, `sourceOfFundsDescription`, and `sourceOfFunds` on `v2.core.Account.configuration.storer`, `v2.core.AccountCreateParams.configuration.storer`, and `v2.core.AccountUpdateParams.configuration.storer`
  * Add support for `cryptoWallets` on `v2.core.Account.configuration.storer.capabilities.financial_addresses`, `v2.core.Account.configuration.storer.capabilities.outbound_payments`, `v2.core.Account.configuration.storer.capabilities.outbound_transfers`, `v2.core.AccountCreateParams.configuration.storer.capabilities.financial_addresses`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_transfers`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.financial_addresses`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_transfers`
  * Add support for `usdc` on `v2.core.Account.configuration.storer.capabilities.holds_currencies`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies`
  * Add support for `cryptoStorer` on `v2.core.Account.identity.attestations.terms_of_service` and `v2.core.AccountCreateParams.identity.attestations.terms_of_service`
  * Add support for `complianceScreeningDescription` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
  * Add support for `externalAmount` on `v2.moneymanagement.ReceivedCredit` and `v2.moneymanagement.ReceivedDebit`

## 30.1.0-alpha.4 - 2025-10-23
* [#2088](https://github.com/stripe/stripe-java/pull/2088) Update generated code for private-preview
  * Add support for new resource `v2.billing.PricingPlanSubscriptionComponents`
  * Add support for `retrieve` method on resource `v2.billing.PricingPlanSubscriptionComponents`
  * Add support for `dimensionPayloadKeys` on `billing.MeterCreateParams` and `billing.Meter`
  * Add support for `dimensionFilters` and `dimensionGroupByKeys` on `billing.MeterEventSummaryListParams`
  * Add support for `dimensions` on `billing.MeterEventSummary`
  * Add support for `fulfillmentDetails` and `paymentMethodData` on `delegatedcheckout.RequestedSessionCreateParams` and `delegatedcheckout.RequestedSessionUpdateParams`
  * Add support for `lineItemDetails`, `metadata`, `paymentMethod`, and `sharedMetadata` on `delegatedcheckout.RequestedSessionCreateParams`, `delegatedcheckout.RequestedSessionUpdateParams`, and `delegatedcheckout.RequestedSession`
  * Add support for `currency`, `customer`, and `riskDetails` on `delegatedcheckout.RequestedSessionCreateParams`
  * Add support for `sellerDetails` and `setupFutureUsage` on `delegatedcheckout.RequestedSessionCreateParams` and `delegatedcheckout.RequestedSession`
  * Add support for `amountSubtotal`, `amountTotal`, `createdAt`, `expiresAt`, `orderDetails`, `sharedPaymentIssuedToken`, `status`, `totalDetails`, and `updatedAt` on `delegatedcheckout.RequestedSession`
  * Add support for `address`, `email`, `fulfillmentOptions`, `name`, `phone`, and `selectedFulfillmentOption` on `delegatedcheckout.RequestedSession.fulfillment_details`
  * Add support for new values `billie`, `crypto`, `kr_card`, `kriya`, `mb_way`, `mondu`, `ng_bank_transfer`, `ng_bank`, `ng_card`, `ng_market`, `ng_ussd`, `ng_wallet`, `payco`, `paypay`, `rechnung`, `samsung_pay`, `satispay`, `scalapay`, `sequra`, `sunbit`, `us_bank_account`, and `vipps` on enums `EventsV2CoreHealthAuthorizationRateDropFiringEvent.impact.paymentMethodType`, `EventsV2CoreHealthAuthorizationRateDropResolvedEvent.impact.paymentMethodType`, `EventsV2CoreHealthPaymentMethodErrorFiringEvent.impact.paymentMethodType`, and `EventsV2CoreHealthPaymentMethodErrorResolvedEvent.impact.paymentMethodType`

## 30.1.0-alpha.3 - 2025-10-17
* [#2087](https://github.com/stripe/stripe-java/pull/2087) Update generated code for private-preview
  * Add support for new resources `delegatedcheckout.RequestedSession` and `identity.BlocklistEntry`
  * Add support for `confirm`, `create`, `expire`, `retrieve`, and `update` methods on resource `delegatedcheckout.RequestedSession`
  * Add support for `create`, `disable`, `list`, and `retrieve` methods on resource `identity.BlocklistEntry`
  * Add support for `blockedByEntry` on `identity.VerificationReport.document`, `identity.VerificationReport.selfie`, and `identity.VerificationReportListParams`

## 30.1.0-alpha.2 - 2025-10-09
* [#2085](https://github.com/stripe/stripe-java/pull/2085) Update generated code for private-preview
  * Add support for new resource `PaymentMethodBalance`
  * Add support for `check_balance` method on resource `PaymentMethod`
  * Add support for `benefits` on `Card`, `Charge.payment_method_details.card`, `ConfirmationToken.payment_method_preview.card`, and `PaymentMethod.card`
  * Add support for `benefit` on `PaymentIntent.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
  * Add support for `setupDetails` on `SetupIntentConfirmParams`, `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntent`
  * Add support for `cardCreator` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountUpdateParams.configuration`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * Add support for new value `configuration.card_creator` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * Add support for new value `card_creator` on enum `v2.core.AccountCloseParams.appliedConfigurations`
  * Add support for thin events `V2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationCardCreatorUpdatedEvent` with related object `v2.core.Account`
  * Remove support for thin events `V1CustomerDiscountCreatedEvent`, `V1CustomerDiscountDeletedEvent`, and `V1CustomerDiscountUpdatedEvent` with related object `Discount`

## 30.1.0-alpha.1 - 2025-10-01
This release changes the pinned API version to `2025-09-30.preview`.

It is built on top of SDK version 30.0.0 and 30.1.0-beta.1 which contain breaking changes. Please review the changelog for these versions if upgrading from older SDK versions.

* [#2052](https://github.com/stripe/stripe-java/pull/2052) Update generated code for private-preview
  * Add support for new resource `v2.moneymanagement.RecipientVerification`
  * Add support for `acknowledge`, `create`, `recipient_verifications`, and `retrieve` methods on resource `v2.moneymanagement.RecipientVerification`
  * Add support for `update` method on resources `v2.billing.PricingPlanSubscription` and `v2.billing.ServiceAction`
  * Add support for `cryptoWallets` on `v2.Account.configuration.recipient_data.features`, `v2.AccountCreateParams.configuration.recipient_data.features`, `v2.AccountUpdateParams.configuration.recipient_data.features`, `v2.core.Account.configuration.recipient.capabilities`, `v2.core.AccountCreateParams.configuration.recipient.capabilities`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities`
  * Add support for `lookupKey` on `v2.billing.CadenceCreateParams`, `v2.billing.CadenceUpdateParams`, and `v2.billing.Cadence`
  * Add support for `settingsData` on `v2.billing.Cadence`
  * Add support for `v1EventId` on `v2.core.Event`
  * Add support for `recipientVerification` on `v2.moneymanagement.OutboundPaymentCreateParams`, `v2.moneymanagement.OutboundPayment`, `v2.moneymanagement.OutboundTransferCreateParams`, and `v2.moneymanagement.OutboundTransfer`
  * Add support for `cryptoWallet` on `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data` and `v2.moneymanagement.PayoutMethod`
  * Add support for `willActivateAt` and `willCancelAt` on `v2.billing.PricingPlanSubscription.servicing_status_transitions` and `v2.billing.RateCardSubscription.servicing_status_transitions`
  * Add support for `customPricingUnitDetails` on `v2.billing.RateCardRate.custom_pricing_unit_amount`, `v2.billing.ServiceAction.credit_grant.amount.custom_pricing_unit`, and `v2.billing.ServiceAction.credit_grant_per_tenant.amount.custom_pricing_unit`
  * Add support for `originType` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
  * Add support for new value `sepa_credit_transfer` on enum `v2.FinancialAddressCreditSimulationCreditParams.network`
  * Add support for new value `credentials.sepa_bank_account.iban` on enums `v2.moneymanagement.FinancialAddressListParams.include` and `v2.moneymanagement.FinancialAddressRetrieveParams.include`
  * Add support for `sepaBankAccount` on `v2.moneymanagement.FinancialAddressCreateParams`
  * Remove support for `price` on `v2.billing.RateCardRateCreateParams`
  * Add support for `lookupKeys` on `v2.billing.CadenceListParams`
  * Change type of `v2.billing.CadenceCancelParams.include`, `v2.billing.CadenceCreateParams.include`, `v2.billing.CadenceListParams.include`, `v2.billing.CadenceRetrieveParams.include`, and `v2.billing.CadenceUpdateParams.include` from `literal('invoice_discount_rules')` to `enum('invoice_discount_rules'|'settings_data')`
  * Remove support for `customer` and `type` on `v2.billing.CadenceCreateParams.payer`
  * Change `v2.billing.CadenceCreateParams.payer.billingProfile` to be required
  * Add support for new value `crypto_wallets` on enum `EventsAccountConfigurationRecipientDataFeatureStatusUpdatedEvent.featureName`
  * Add support for new value `crypto_wallets_v2` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
  * Remove support for `alertId` on `EventsV2CoreHealthApiErrorResolvedEvent`, `EventsV2CoreHealthApiLatencyResolvedEvent`, `EventsV2CoreHealthAuthorizationRateDropResolvedEvent`, `EventsV2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent`, `EventsV2CoreHealthPaymentMethodErrorResolvedEvent`, `EventsV2CoreHealthTrafficVolumeDropResolvedEvent`, and `EventsV2CoreHealthWebhookLatencyResolvedEvent`
  * Add support for thin event `V1AccountUpdatedEvent` with related object `v2.Account`
  * Add support for thin events `V1ApplicationFeeCreatedEvent`, `V1ApplicationFeeRefundedEvent`, `V1BillingPortalConfigurationCreatedEvent`, `V1BillingPortalConfigurationUpdatedEvent`, `V1CapabilityUpdatedEvent`, `V1ChargeCapturedEvent`, `V1ChargeDisputeClosedEvent`, `V1ChargeDisputeCreatedEvent`, `V1ChargeDisputeFundsReinstatedEvent`, `V1ChargeDisputeFundsWithdrawnEvent`, `V1ChargeDisputeUpdatedEvent`, `V1ChargeExpiredEvent`, `V1ChargeFailedEvent`, `V1ChargePendingEvent`, `V1ChargeRefundUpdatedEvent`, `V1ChargeRefundedEvent`, `V1ChargeSucceededEvent`, `V1ChargeUpdatedEvent`, `V1CheckoutSessionAsyncPaymentFailedEvent`, `V1CheckoutSessionAsyncPaymentSucceededEvent`, `V1CheckoutSessionCompletedEvent`, `V1CheckoutSessionExpiredEvent`, `V1ClimateOrderCanceledEvent`, `V1ClimateOrderCreatedEvent`, `V1ClimateOrderDelayedEvent`, `V1ClimateOrderDeliveredEvent`, `V1ClimateOrderProductSubstitutedEvent`, `V1ClimateProductCreatedEvent`, `V1ClimateProductPricingUpdatedEvent`, `V1CouponCreatedEvent`, `V1CouponDeletedEvent`, `V1CouponUpdatedEvent`, `V1CreditNoteCreatedEvent`, `V1CreditNoteUpdatedEvent`, `V1CreditNoteVoidedEvent`, `V1CustomerCreatedEvent`, `V1CustomerDeletedEvent`, `V1CustomerDiscountCreatedEvent`, `V1CustomerDiscountDeletedEvent`, `V1CustomerDiscountUpdatedEvent`, `V1CustomerSubscriptionCreatedEvent`, `V1CustomerSubscriptionDeletedEvent`, `V1CustomerSubscriptionPausedEvent`, `V1CustomerSubscriptionPendingUpdateAppliedEvent`, `V1CustomerSubscriptionPendingUpdateExpiredEvent`, `V1CustomerSubscriptionResumedEvent`, `V1CustomerSubscriptionTrialWillEndEvent`, `V1CustomerSubscriptionUpdatedEvent`, `V1CustomerTaxIdCreatedEvent`, `V1CustomerTaxIdDeletedEvent`, `V1CustomerTaxIdUpdatedEvent`, `V1CustomerUpdatedEvent`, `V1FileCreatedEvent`, `V1FinancialConnectionsAccountCreatedEvent`, `V1FinancialConnectionsAccountDeactivatedEvent`, `V1FinancialConnectionsAccountDisconnectedEvent`, `V1FinancialConnectionsAccountReactivatedEvent`, `V1FinancialConnectionsAccountRefreshedBalanceEvent`, `V1FinancialConnectionsAccountRefreshedOwnershipEvent`, `V1FinancialConnectionsAccountRefreshedTransactionsEvent`, `V1IdentityVerificationSessionCanceledEvent`, `V1IdentityVerificationSessionCreatedEvent`, `V1IdentityVerificationSessionProcessingEvent`, `V1IdentityVerificationSessionRedactedEvent`, `V1IdentityVerificationSessionRequiresInputEvent`, `V1IdentityVerificationSessionVerifiedEvent`, `V1InvoiceCreatedEvent`, `V1InvoiceDeletedEvent`, `V1InvoiceFinalizationFailedEvent`, `V1InvoiceFinalizedEvent`, `V1InvoiceMarkedUncollectibleEvent`, `V1InvoiceOverdueEvent`, `V1InvoiceOverpaidEvent`, `V1InvoicePaidEvent`, `V1InvoicePaymentActionRequiredEvent`, `V1InvoicePaymentFailedEvent`, `V1InvoicePaymentPaidEvent`, `V1InvoicePaymentSucceededEvent`, `V1InvoiceSentEvent`, `V1InvoiceUpcomingEvent`, `V1InvoiceUpdatedEvent`, `V1InvoiceVoidedEvent`, `V1InvoiceWillBeDueEvent`, `V1InvoiceitemCreatedEvent`, `V1InvoiceitemDeletedEvent`, `V1IssuingAuthorizationCreatedEvent`, `V1IssuingAuthorizationRequestEvent`, `V1IssuingAuthorizationUpdatedEvent`, `V1IssuingCardCreatedEvent`, `V1IssuingCardUpdatedEvent`, `V1IssuingCardholderCreatedEvent`, `V1IssuingCardholderUpdatedEvent`, `V1IssuingDisputeClosedEvent`, `V1IssuingDisputeCreatedEvent`, `V1IssuingDisputeFundsReinstatedEvent`, `V1IssuingDisputeFundsRescindedEvent`, `V1IssuingDisputeSubmittedEvent`, `V1IssuingDisputeUpdatedEvent`, `V1IssuingPersonalizationDesignActivatedEvent`, `V1IssuingPersonalizationDesignDeactivatedEvent`, `V1IssuingPersonalizationDesignRejectedEvent`, `V1IssuingPersonalizationDesignUpdatedEvent`, `V1IssuingTokenCreatedEvent`, `V1IssuingTokenUpdatedEvent`, `V1IssuingTransactionCreatedEvent`, `V1IssuingTransactionPurchaseDetailsReceiptUpdatedEvent`, `V1IssuingTransactionUpdatedEvent`, `V1MandateUpdatedEvent`, `V1PaymentIntentAmountCapturableUpdatedEvent`, `V1PaymentIntentCanceledEvent`, `V1PaymentIntentCreatedEvent`, `V1PaymentIntentPartiallyFundedEvent`, `V1PaymentIntentPaymentFailedEvent`, `V1PaymentIntentProcessingEvent`, `V1PaymentIntentRequiresActionEvent`, `V1PaymentIntentSucceededEvent`, `V1PaymentLinkCreatedEvent`, `V1PaymentLinkUpdatedEvent`, `V1PaymentMethodAttachedEvent`, `V1PaymentMethodAutomaticallyUpdatedEvent`, `V1PaymentMethodDetachedEvent`, `V1PaymentMethodUpdatedEvent`, `V1PayoutCanceledEvent`, `V1PayoutCreatedEvent`, `V1PayoutFailedEvent`, `V1PayoutPaidEvent`, `V1PayoutReconciliationCompletedEvent`, `V1PayoutUpdatedEvent`, `V1PersonCreatedEvent`, `V1PersonDeletedEvent`, `V1PersonUpdatedEvent`, `V1PlanCreatedEvent`, `V1PlanDeletedEvent`, `V1PlanUpdatedEvent`, `V1PriceCreatedEvent`, `V1PriceDeletedEvent`, `V1PriceUpdatedEvent`, `V1ProductCreatedEvent`, `V1ProductDeletedEvent`, `V1ProductUpdatedEvent`, `V1PromotionCodeCreatedEvent`, `V1PromotionCodeUpdatedEvent`, `V1QuoteAcceptedEvent`, `V1QuoteCanceledEvent`, `V1QuoteCreatedEvent`, `V1QuoteFinalizedEvent`, `V1RadarEarlyFraudWarningCreatedEvent`, `V1RadarEarlyFraudWarningUpdatedEvent`, `V1RefundCreatedEvent`, `V1RefundFailedEvent`, `V1RefundUpdatedEvent`, `V1ReviewClosedEvent`, `V1ReviewOpenedEvent`, `V1SetupIntentCanceledEvent`, `V1SetupIntentCreatedEvent`, `V1SetupIntentRequiresActionEvent`, `V1SetupIntentSetupFailedEvent`, `V1SetupIntentSucceededEvent`, `V1SigmaScheduledQueryRunCreatedEvent`, `V1SourceCanceledEvent`, `V1SourceChargeableEvent`, `V1SourceFailedEvent`, `V1SourceRefundAttributesRequiredEvent`, `V1SubscriptionScheduleAbortedEvent`, `V1SubscriptionScheduleCanceledEvent`, `V1SubscriptionScheduleCompletedEvent`, `V1SubscriptionScheduleCreatedEvent`, `V1SubscriptionScheduleExpiringEvent`, `V1SubscriptionScheduleReleasedEvent`, `V1SubscriptionScheduleUpdatedEvent`, `V1TaxRateCreatedEvent`, `V1TaxRateUpdatedEvent`, `V1TerminalReaderActionFailedEvent`, `V1TerminalReaderActionSucceededEvent`, `V1TerminalReaderActionUpdatedEvent`, `V1TestHelpersTestClockAdvancingEvent`, `V1TestHelpersTestClockCreatedEvent`, `V1TestHelpersTestClockDeletedEvent`, `V1TestHelpersTestClockInternalFailureEvent`, `V1TestHelpersTestClockReadyEvent`, `V1TopupCanceledEvent`, `V1TopupCreatedEvent`, `V1TopupFailedEvent`, `V1TopupReversedEvent`, `V1TopupSucceededEvent`, `V1TransferCreatedEvent`, `V1TransferReversedEvent`, `V1TransferUpdatedEvent`, `V2CoreHealthIssuingAuthorizationRequestErrorsFiringEvent`, and `V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEvent`
  * Add support for thin event `V2CoreClaimableSandboxCreatedEvent` with related object `v2.core.ClaimableSandbox`
  * Add support for thin events `V2MoneyManagementRecipientVerificationCreatedEvent` and `V2MoneyManagementRecipientVerificationUpdatedEvent` with related object `v2.moneymanagement.RecipientVerification`
  * Remove support for resources `v2.reporting.ReportRun` and `v2.reporting.Report`
  * Remove support for thin events `V2ReportingReportRunCreatedEvent`, `V2ReportingReportRunFailedEvent`, `V2ReportingReportRunSucceededEvent`, and `V2ReportingReportRunUpdatedEvent` with related object `v2.reporting.ReportRun`

## 29.6.0-alpha.2 - 2025-09-17
* [#2042](https://github.com/stripe/stripe-java/pull/2042) generate private-preview SDK w/ mid Sept changes
  * Add support for `retrieve` method on resource `V2.Core.ClaimableSandbox`
  * Add support for `month_of_year` on `V2.Billing.Cadence#create.billing_cycle.month` and `V2.Billing.Cadence.billing_cycle.month`
  * Add support for `claimed_at`, `expires_at`, `sandbox_details`, and `status` on `V2.Core.ClaimableSandbox`
  * Remove support for `api_keys` on `V2.Core.ClaimableSandbox`
  * Change type of `V2.Core.ClaimableSandbox.claim_url` from `string` to `nullable(string)`
  * Add support for new value `current_billing_period_end` on enums `V2.Billing.Intent#create.actions[].deactivate.effective_at.type` and `V2.Billing.IntentAction.deactivate.effective_at.type`
  * Add support for `will_activate_at` and `will_cancel_at` on `V2.Billing.PricingPlanSubscription.servicing_status_transitions` and `V2.Billing.RateCardSubscription.servicing_status_transitions`
  * Add support for `category` and `priority` on `V2.Billing.ServiceAction#create.credit_grant_per_tenant`, `V2.Billing.ServiceAction#create.credit_grant`, `V2.Billing.ServiceAction.credit_grant_per_tenant`, and `V2.Billing.ServiceAction.credit_grant`
  * Change `V2.Billing.LicenseFee#update.display_name` to be optional
  * Add support for `invoices` on `EventsV2BillingCadenceBilledEvent`
  * Add support for thin events `V2CoreClaimableSandboxClaimedEvent`, `V2CoreClaimableSandboxExpiredEvent`, `V2CoreClaimableSandboxExpiringEvent`, and `V2CoreClaimableSandboxSandboxDetailsOwnerAccountUpdatedEvent` with related object `V2.Core.ClaimableSandbox`
  * Remove support for thin event `V2BillingCadenceErroredEvent` with related object `V2.Billing.Cadence`

## 29.6.0-alpha.1 - 2025-08-28
* ⚠️ [#2033](https://github.com/stripe/stripe-java/pull/2033) Update generated code for private-preview
  * Add support for `attach_cadence` method on resource `Subscription`
  * Add support for `currency` and `externalCustomerId` on `billing.AlertTriggered`
  * Add support for `customPricingUnit` on `billing.AlertTriggered`, `billing.CreditBalanceSummary.balances[].available_balance`, `billing.CreditBalanceSummary.balances[].ledger_balance`, `billing.CreditBalanceTransaction.credit.amount`, `billing.CreditBalanceTransaction.debit.amount`, `billing.CreditGrant.amount`, and `billing.CreditGrantCreateParams.amount`
  * Add support for `customer` on `billing.AlertListParams`
  * Change type of `billing.Alert.alertType`, `billing.AlertCreateParams.alertType`, and `billing.AlertListParams.alertType` from `literal('usage_threshold')` to `enum('credit_balance_threshold'|'usage_threshold')`
  * Add support for `creditBalanceThreshold` on `billing.AlertCreateParams` and `billing.Alert`
  * Add support for `billableItems` on `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope`, `billing.CreditGrant.applicability_config.scope`, and `billing.CreditGrantCreateParams.applicability_config.scope`
  * Change type of `billing.CreditBalanceSummary.balances[].available_balance.type`, `billing.CreditBalanceSummary.balances[].ledger_balance.type`, `billing.CreditBalanceTransaction.credit.amount.type`, `billing.CreditBalanceTransaction.debit.amount.type`, `billing.CreditGrant.amount.type`, and `billing.CreditGrantCreateParams.amount.type` from `literal('monetary')` to `enum('custom_pricing_unit'|'monetary')`
  * Add support for `licenseFeeSubscriptionDetails` and `rateCardSubscriptionDetails` on `InvoiceItem.parent` and `InvoiceLineItem.parent`
  * Change type of `InvoiceItem.parent.type` from `literal('subscription_details')` to `enum('license_fee_subscription_details'|'rate_card_subscription_details'|'subscription_details')`
  * Add support for `licenseFeeDetails` and `rateCardRateDetails` on `InvoiceItem.pricing` and `InvoiceLineItem.pricing`
  * Change type of `InvoiceItem.pricing.type` and `InvoiceLineItem.pricing.type` from `literal('price_details')` to `enum('license_fee_details'|'price_details'|'rate_card_rate_details')`
  * Add support for `billingCadence` on `InvoiceCreatePreviewParams`, `SubscriptionCreateParams`, and `Subscription`
  * Add support for `billingCadenceDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`
  * Add support for new resources `v2.billing.BillSettingVersion`, `v2.billing.BillSetting`, `v2.billing.Cadence`, `v2.billing.CollectionSettingVersion`, `v2.billing.CollectionSetting`, `v2.billing.CustomPricingUnit`, `v2.billing.IntentAction`, `v2.billing.Intent`, `v2.billing.LicenseFeeSubscription`, `v2.billing.LicenseFeeVersion`, `v2.billing.LicenseFee`, `v2.billing.LicensedItem`, `v2.billing.MeteredItem`, `v2.billing.PricingPlanComponent`, `v2.billing.PricingPlanSubscription`, `v2.billing.PricingPlanVersion`, `v2.billing.PricingPlan`, `v2.billing.Profile`, `v2.billing.RateCardRate`, `v2.billing.RateCardSubscription`, `v2.billing.RateCardVersion`, `v2.billing.RateCard`, `v2.billing.ServiceAction`, `v2.core.ClaimableSandbox`, `v2.reporting.ReportRun`, `v2.reporting.Report`, and `v2.tax.AutomaticRule`
  * Add support for `create`, `deactivate`, `find`, `retrieve`, and `update` methods on resource `v2.tax.AutomaticRule`
  * Add support for `create` and `retrieve` methods on resources `v2.billing.ServiceAction` and `v2.reporting.ReportRun`
  * Add support for `retrieve` method on resources `v2.billing.LicenseFeeSubscription` and `v2.reporting.Report`
  * Add support for `create` method on resources `v2.core.ClaimableSandbox`
  * Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resources `v2.billing.Cadence` and `v2.billing.RateCardSubscription`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resources `v2.billing.BillSetting`, `v2.billing.CollectionSetting`, `v2.billing.CustomPricingUnit`, `v2.billing.LicenseFee`, `v2.billing.LicensedItem`, `v2.billing.MeteredItem`, `v2.billing.PricingPlan`, `v2.billing.Profile`, and `v2.billing.RateCard`
  * Add support for `list` and `retrieve` methods on resources `v2.billing.BillSettingVersion`, `v2.billing.CollectionSettingVersion`, `v2.billing.IntentAction`, `v2.billing.LicenseFeeVersion`, `v2.billing.PricingPlanSubscription`, `v2.billing.PricingPlanVersion`, and `v2.billing.RateCardVersion`
  * Add support for `create`, `delete`, `list`, and `retrieve` methods on resource `v2.billing.RateCardRate`
  * Add support for `create`, `delete`, `list`, `retrieve`, and `update` methods on resource `v2.billing.PricingPlanComponent`
  * Add support for `cancel`, `commit`, `create`, `list`, `release_reservation`, `reserve`, and `retrieve` methods on resource `v2.billing.Intent`
  * Add support for `changes` on `v2.Event`
  * Add support for thin events `V2BillingCadenceBilledEvent`, `V2BillingCadenceCanceledEvent`, `V2BillingCadenceCreatedEvent`, and `V2BillingCadenceErroredEvent` with related object `v2.billing.Cadence`
  * Add support for thin events `V2BillingLicenseFeeCreatedEvent` and `V2BillingLicenseFeeUpdatedEvent` with related object `v2.billing.LicenseFee`
  * Add support for thin event `V2BillingLicenseFeeVersionCreatedEvent` with related object `v2.billing.LicenseFeeVersion`
  * Add support for thin events `V2BillingLicensedItemCreatedEvent` and `V2BillingLicensedItemUpdatedEvent` with related object `v2.billing.LicensedItem`
  * Add support for thin events `V2BillingMeteredItemCreatedEvent` and `V2BillingMeteredItemUpdatedEvent` with related object `v2.billing.MeteredItem`
  * Add support for thin events `V2BillingPricingPlanCreatedEvent` and `V2BillingPricingPlanUpdatedEvent` with related object `v2.billing.PricingPlan`
  * Add support for thin events `V2BillingPricingPlanComponentCreatedEvent` and `V2BillingPricingPlanComponentUpdatedEvent` with related object `v2.billing.PricingPlanComponent`
  * Add support for thin events `V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEvent`, `V2BillingPricingPlanSubscriptionCollectionCurrentEvent`, `V2BillingPricingPlanSubscriptionCollectionPastDueEvent`, `V2BillingPricingPlanSubscriptionCollectionPausedEvent`, `V2BillingPricingPlanSubscriptionCollectionUnpaidEvent`, `V2BillingPricingPlanSubscriptionServicingActivatedEvent`, `V2BillingPricingPlanSubscriptionServicingCanceledEvent`, and `V2BillingPricingPlanSubscriptionServicingPausedEvent` with related object `v2.billing.PricingPlanSubscription`
  * Add support for thin event `V2BillingPricingPlanVersionCreatedEvent` with related object `v2.billing.PricingPlanVersion`
  * Add support for thin events `V2BillingRateCardCreatedEvent` and `V2BillingRateCardUpdatedEvent` with related object `v2.billing.RateCard`
  * Add support for thin event `V2BillingRateCardRateCreatedEvent` with related object `v2.billing.RateCardRate`
  * Add support for thin events `V2BillingRateCardSubscriptionActivatedEvent`, `V2BillingRateCardSubscriptionCanceledEvent`, `V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEvent`, `V2BillingRateCardSubscriptionCollectionCurrentEvent`, `V2BillingRateCardSubscriptionCollectionPastDueEvent`, `V2BillingRateCardSubscriptionCollectionPausedEvent`, `V2BillingRateCardSubscriptionCollectionUnpaidEvent`, `V2BillingRateCardSubscriptionServicingActivatedEvent`, `V2BillingRateCardSubscriptionServicingCanceledEvent`, and `V2BillingRateCardSubscriptionServicingPausedEvent` with related object `v2.billing.RateCardSubscription`
  * Add support for thin event `V2BillingRateCardVersionCreatedEvent` with related object `v2.billing.RateCardVersion`
  * Add support for thin events `V2CoreHealthApiErrorFiringEvent`, `V2CoreHealthApiErrorResolvedEvent`, `V2CoreHealthApiLatencyFiringEvent`, `V2CoreHealthApiLatencyResolvedEvent`, `V2CoreHealthAuthorizationRateDropFiringEvent`, `V2CoreHealthAuthorizationRateDropResolvedEvent`, `V2CoreHealthEventGenerationFailureResolvedEvent`, `V2CoreHealthFraudRateIncreasedEvent`, `V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEvent`, `V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEvent`, `V2CoreHealthPaymentMethodErrorFiringEvent`, `V2CoreHealthPaymentMethodErrorResolvedEvent`, `V2CoreHealthTrafficVolumeDropFiringEvent`, `V2CoreHealthTrafficVolumeDropResolvedEvent`, `V2CoreHealthWebhookLatencyFiringEvent`, and `V2CoreHealthWebhookLatencyResolvedEvent`
  * Add support for thin events `V2ReportingReportRunCreatedEvent`, `V2ReportingReportRunFailedEvent`, `V2ReportingReportRunSucceededEvent`, and `V2ReportingReportRunUpdatedEvent` with related object `v2.reporting.ReportRun`
  * Add support for error type `RateLimitException`
  * ⚠️ The base class of `RateLimitException` has been changed from `InvalidRequestException` to `ApiException`.  There is no change to the public interface for the `RateLimitException` class.

---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2264
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.4.0-alpha.1
---

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

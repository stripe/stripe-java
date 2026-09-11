---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2185
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.1.0-alpha.1
---

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

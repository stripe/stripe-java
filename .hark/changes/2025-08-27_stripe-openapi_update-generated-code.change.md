---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2033
is_breaking: true
is_stripe_api_change: true
released_in_version: 29.6.0-alpha.1
---

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

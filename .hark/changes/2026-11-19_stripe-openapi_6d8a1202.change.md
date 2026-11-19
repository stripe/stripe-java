---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2336
semver_level: major
is_stripe_api_change: true
released_in_version: 34.3.0-alpha.1
---

* Add support for new resources `v2.billing.GroupInvoice`, `v2.billing.GroupSpendModifier`, and `v2.billing.Group`
* ⚠️ Remove support for resources `v2.billing.CadenceSpendModifier` and `v2.billing.ContractPricingLineQuantityChange`
* Add support for `create` and `update` methods on resource `InvoiceRenderingTemplate`
* Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `v2.billing.Group`
* Add support for `retrieve` method on resource `v2.billing.GroupSpendModifier`
* Add support for `create` method on resource `v2.billing.GroupInvoice`
* ⚠️ Remove support for `retrieve` method on resource `v2.billing.CadenceSpendModifier`
* ⚠️ Remove support for `billingCadence` on `InvoiceCreatePreviewParams`, `InvoiceListParams`, `SubscriptionCreateParams`, `SubscriptionListParams`, `SubscriptionUpdateParams`, `Subscription`, `billing.Alert.spend_threshold.filters`, `billing.AlertCreateParams.spend_threshold.filters`, `billing.AlertTriggered.group_by`, `v2.billing.PricingPlanSubscriptionListParams`, `v2.billing.PricingPlanSubscription`, `v2.billing.RateCardSubscriptionCreateParams`, `v2.billing.RateCardSubscriptionListParams`, and `v2.billing.RateCardSubscription`
* Add support for `scheduledFee` on `v2.billing.ContractCreateParams.terms[]`, `v2.billing.ContractTerm`, `v2.billing.ContractUpdateParams.actions[].add_term`, and `v2.billing.ContractUpdateParams.actions[].update_term`
* ⚠️ Remove support for `adHocProduct` on `v2.billing.ContractCreateParams.terms[]`, `v2.billing.ContractTerm`, `v2.billing.ContractUpdateParams.actions[].add_term`, and `v2.billing.ContractUpdateParams.actions[].update_term`
* ⚠️ Add support for new value `billing_group` on enum `billing.AlertCreateParams.spend_threshold.groupBy`
* ⚠️ Remove support for value `billing_cadence` from enum `billing.AlertCreateParams.spend_threshold.groupBy`
* ⚠️ Remove support for `cadence` on `billing.AlertNotificationListParams`, `billing.AlertNotification`, `v2.billing.IntentCreateParams`, and `v2.billing.Intent`
* ⚠️ Remove support for `pricingToken` on `checkout.SessionCreateParams`
* Add support for `passThroughFeeCost` on `checkout.Session`
* Add support for `amountPassThroughFee` on `checkout.Session.total_details`
* Add support for `linkSharedData` on `identity.VerificationSessionCreateParams`
* Add support for `lineItemPolicy`, `renderingSettings`, and `summaryItemPolicies` on `InvoiceRenderingTemplate`
* Add support for `billingGroup` on `InvoiceCreatePreviewParams`, `InvoiceListParams`, `v2.billing.IntentCreateParams`, `v2.billing.Intent`, `v2.billing.PricingPlanSubscriptionListParams`, `v2.billing.PricingPlanSubscription`, `v2.billing.RateCardSubscriptionListParams`, and `v2.billing.RateCardSubscription`
* Add support for `appliedCreditMemos` on `Invoice` and `QuotePreviewInvoice`
* Add support for `billingGroupDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`
* ⚠️ Remove support for `billingCadenceDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`
* Add support for `tokenServiceProviderId` on `issuing.Authorization.token_details.network_data.visa` and `issuing.Token.network_data.visa`
* Add support for `amountType`, `amount`, `currency`, `description`, `endDate`, `intervalCount`, `interval`, `reference`, and `startDate` on `Mandate.payment_method_details.card.india`
* Add support for `threeDSecure` on `PaymentAttemptRecordReportFailedParams.payment_method_details.card` and `PaymentRecordReportPaymentAttemptFailedParams.payment_method_details.card`
* Add support for `providerSignatureData` and `providerSignature` on `PaymentIntent.payment_method_options.card_present.aade_data`, `PaymentIntentConfirmParams.payment_method_options.card_present.aade_data`, `PaymentIntentCreateParams.payment_method_options.card_present.aade_data`, and `PaymentIntentUpdateParams.payment_method_options.card_present.aade_data`
* ⚠️ Remove support for `markData` and `signedMark` on `PaymentIntent.payment_method_options.card_present.aade_data`, `PaymentIntentConfirmParams.payment_method_options.card_present.aade_data`, `PaymentIntentCreateParams.payment_method_options.card_present.aade_data`, and `PaymentIntentUpdateParams.payment_method_options.card_present.aade_data`
* Add support for `requestMulticapture` on `PaymentIntent.payment_method_options.vipps`, `PaymentIntentConfirmParams.payment_method_options.vipps`, `PaymentIntentCreateParams.payment_method_options.vipps`, and `PaymentIntentUpdateParams.payment_method_options.vipps`
* Add support for `isFreeTrialTransaction` on `PaymentIntentConfirmParams.radar_options` and `PaymentIntentCreateParams.radar_options`
* Add support for new value `tron` on enum `PaymentIntentUpdateCryptoRefundAddressParams.network`
* Add support for `radarOptions` on `PaymentIntent`
* Add support for `aeonPay`, `auPay`, `dbarai`, and `merpay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `requestedSignals` on `radar.PaymentEvaluationCreateParams` and `radar.PaymentEvaluation`
* Add support for `giftCard` on `Refund.destination_details`
* Add support for `daysAfterFulfillment` on `reserve.Plan.rolling_release`
* Add support for `rendering` on `SubscriptionScheduleCreateParams.default_settings.invoice_settings` and `SubscriptionScheduleUpdateParams.default_settings.invoice_settings`
* Add support for `debitBehavior` on `Subscription.payment_settings.payment_method_options.card`, `Subscription.payment_settings.payment_method_options.pix`, `Subscription.payment_settings.payment_method_options.upi`, `SubscriptionCreateParams.payment_settings.payment_method_options.card`, `SubscriptionCreateParams.payment_settings.payment_method_options.pix`, `SubscriptionCreateParams.payment_settings.payment_method_options.upi`, `SubscriptionUpdateParams.payment_settings.payment_method_options.card`, `SubscriptionUpdateParams.payment_settings.payment_method_options.pix`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.upi`
* Add support for `presentmentDetails` on `Subscription.pending_update`
* ⚠️ Remove support for `deviceHealthDetails` and `deviceHealth` on `terminal.Reader`
* Add support for `billingGroupData` on `v2.billing.IntentCreateParams` and `v2.billing.Intent`
* ⚠️ Remove support for `cadenceData` on `v2.billing.IntentCreateParams` and `v2.billing.Intent`
* Add support for `touchNGoPayments`, `truemoneyPayments`, `wechatPayMobileWebPayments`, `wechatPayPayments`, and `weroPayments` on `v2.core.Account.configuration.merchant.capabilities`, `v2.core.AccountCreateParams.configuration.merchant.capabilities`, and `v2.core.AccountUpdateParams.configuration.merchant.capabilities`
* Add support for `businessDemandDepositAccountFifthThirdStorage` on `v2.core.Account.configuration.money_manager.capabilities`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities`
* Add support for `tips` on `v2.core.Account.configuration.recipient.capabilities.bank_accounts`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts`
* Add support for `businessDemandDepositAccountFifthThird` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
* Add support for `channel` on `v2.core.ClaimableSandboxCreateParams` and `v2.core.ClaimableSandbox`
* ⚠️ Remove support for `appChannel` on `v2.core.ClaimableSandboxCreateParams` and `v2.core.ClaimableSandbox`
* Add support for `returnUrl` on `v2.core.ClaimableSandbox.onboarding_link_details`, `v2.core.ClaimableSandboxCreateParams.onboarding_link_details`, and `v2.core.ClaimableSandboxRenewOnboardingLinkParams.onboarding_link_details`
* ⚠️ Change type of `v2.core.ClaimableSandbox.sandbox_details.api_keys.mcp` from `string` to `an object`
* ⚠️ Change type of `v2.core.ClaimableSandbox.sandbox_details.api_keys.publishable` from `string` to `an object`
* ⚠️ Change type of `v2.core.ClaimableSandbox.sandbox_details.api_keys.secret` from `string` to `an object`
* Add support for `customPaymentMethodAdapterDegraded` on `v2.core.health.AlertHistoryEntry` and `v2.core.health.Alert`
* Add support for `fundsHoldingStructure` on `v2.moneymanagement.FinancialAccount.storage` and `v2.moneymanagement.FinancialAccountCreateParams.storage`
* Add support for `auBecsDebit` on `v2.moneymanagement.InboundTransfer.from.payment_method`
* Add support for `network` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
* Add support for new value `tips` on enums `v2.moneymanagement.OutboundPaymentCreateParams.to.payout_method_options.bank_account.preferredNetworks`, `v2.moneymanagement.OutboundPaymentQuoteCreateParams.to.payout_method_options.bank_account.preferredNetworks`, `v2.moneymanagement.OutboundTransferCreateParams.to.payout_method_options.bank_account.preferredNetworks`, `v2.moneymanagement.PayoutIntentCreateParams.to.payout_method_options.bank_account.preferredNetworks`, and `v2.moneymanagement.PayoutIntentUpdateParams.to.payout_method_options.bank_account.preferredNetworks`
* Add support for `settlementTiming` on `v2.moneymanagement.FundingIntentUpdateParams`
* Add support for new value `custom_payment_method_adapter_degraded` on enum `v2.core.health.AlertListParams.types`
* Add support for `include` on `v2.core.ClaimableSandboxRetrieveParams`
* Change `v2.core.ClaimableSandboxRenewOnboardingLinkParams.onboarding_link_details.refreshUrl` to be optional
* Add support for new value `account_dashboard` on enum `v2.core.AccountLinkCreateParams.use_case.type`
* ⚠️ Add support for `billingGroup` on `v2.billing.RateCardSubscriptionCreateParams`
* Add support for new value `group` on enum `v2.billing.IntentCreateParams.actions[].apply.invoice_discount_rule.appliesTo`
* ⚠️ Remove support for `oneTimeFees`, `pricingLines`, and `pricingOverrides` on `v2.billing.ContractCreateParams`
* Add support for new value `now` on enums `v2.billing.ContractCreateParams.terms[].pricing_override.ends_at.type`, `v2.billing.ContractCreateParams.terms[].recurring_price.ends_at.type`, `v2.billing.ContractUpdateParams.actions[].add_term.pricing_override.ends_at.type`, `v2.billing.ContractUpdateParams.actions[].add_term.recurring_price.ends_at.type`, `v2.billing.ContractUpdateParams.actions[].update_term.pricing_override.ends_at.type`, and `v2.billing.ContractUpdateParams.actions[].update_term.recurring_price.ends_at.type`
* Add support for new value `now` on enums `v2.billing.ContractCreateParams.terms[].pricing_override.starts_at.type`, `v2.billing.ContractCreateParams.terms[].recurring_price.starts_at.type`, `v2.billing.ContractUpdateParams.actions[].add_term.pricing_override.starts_at.type`, `v2.billing.ContractUpdateParams.actions[].add_term.recurring_price.starts_at.type`, `v2.billing.ContractUpdateParams.actions[].update_term.pricing_override.starts_at.type`, and `v2.billing.ContractUpdateParams.actions[].update_term.recurring_price.starts_at.type`
* ⚠️ Add support for new value `scheduled_fee` on enums `v2.billing.ContractCreateParams.terms[].type`, `v2.billing.ContractTermListContractTermsParams.type`, and `v2.billing.ContractUpdateParams.actions[].add_term.type`
* ⚠️ Remove support for value `ad_hoc_product` from enums `v2.billing.ContractCreateParams.terms[].type`, `v2.billing.ContractTermListContractTermsParams.type`, and `v2.billing.ContractUpdateParams.actions[].add_term.type`
* Add support for `contractNumber` on `v2.billing.ContractUpdateParams`
* ⚠️ Remove support for `oneTimeFeeActions`, `pricingLineActions`, and `pricingOverrideActions` on `v2.billing.ContractUpdateParams`
* ⚠️ Remove support for `cancelPricingLines` on `v2.billing.ContractCancelParams`
* Add support for new values `business_demand_deposit_account_fifth_third_storage.inbound.usd` and `business_demand_deposit_account_fifth_third_storage.outbound.usd` on enum `EventsV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for new value `bank_accounts.tips` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for `charge` on `EventsV2PaymentsOffSessionPaymentAttemptFailedEvent`, `EventsV2PaymentsOffSessionPaymentFailedEvent`, and `EventsV2PaymentsOffSessionPaymentSucceededEvent`
* Add support for `lastAttemptError` on `EventsV2PaymentsOffSessionPaymentAttemptFailedEvent` and `EventsV2PaymentsOffSessionPaymentFailedEvent`
* Add support for `paymentAttemptRecord` on `EventsV2PaymentsOffSessionPaymentSucceededEvent`
* Add support for event notifications `V2BillingContractTermPricingOverrideEndedEvent`, `V2BillingContractTermPricingOverrideStartedEvent`, `V2BillingContractTermRecurringPriceEndedEvent`, `V2BillingContractTermRecurringPriceStartedEvent`, `V2BillingContractTermScheduledFeeServicePeriodEndedEvent`, and `V2BillingContractTermScheduledFeeServicePeriodStartedEvent` with related object `v2.billing.ContractTerm`
* Add support for event notifications `V2CoreHealthCustomPaymentMethodAdapterDegradedFiringEvent` and `V2CoreHealthCustomPaymentMethodAdapterDegradedResolvedEvent`
* Add support for event notifications `V2SignalsPaymentRetryEvaluationCanceledEvent`, `V2SignalsPaymentRetryEvaluationCompletedEvent`, `V2SignalsPaymentRetryEvaluationCreatedEvent`, `V2SignalsPaymentRetryEvaluationExpiredEvent`, and `V2SignalsPaymentRetryEvaluationUpdatedEvent` with related object `v2.signals.PaymentRetryEvaluation`
* ⚠️ Remove support for event notifications `V2BillingCadenceBilledEvent`, `V2BillingCadenceCanceledEvent`, and `V2BillingCadenceCreatedEvent` with related object `v2.billing.Cadence`
* ⚠️ Add error type `RateLimitException` on `v2.core.ClaimableSandbox#create`

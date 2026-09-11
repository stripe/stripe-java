---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2118
is_stripe_api_change: true
released_in_version: 31.1.0-alpha.2
---

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

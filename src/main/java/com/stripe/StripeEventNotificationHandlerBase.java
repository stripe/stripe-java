package com.stripe;

// event-notification-class-imports: The beginning of the section generated from our OpenAPI spec
// - hack because we can't format java files whose imports aren't a single contiguous block
// - so _any_ imports in this file have to come from codegen
// - as do these comments, explaining the whole thing
import com.stripe.events.V1AccountApplicationAuthorizedEventNotification;
import com.stripe.events.V1AccountApplicationDeauthorizedEventNotification;
import com.stripe.events.V1AccountExternalAccountCreatedEventNotification;
import com.stripe.events.V1AccountExternalAccountDeletedEventNotification;
import com.stripe.events.V1AccountExternalAccountUpdatedEventNotification;
import com.stripe.events.V1AccountSignalsIncludingDelinquencyCreatedEventNotification;
import com.stripe.events.V1AccountUpdatedEventNotification;
import com.stripe.events.V1ApplicationFeeCreatedEventNotification;
import com.stripe.events.V1ApplicationFeeRefundUpdatedEventNotification;
import com.stripe.events.V1ApplicationFeeRefundedEventNotification;
import com.stripe.events.V1BalanceAvailableEventNotification;
import com.stripe.events.V1BalanceSettingsUpdatedEventNotification;
import com.stripe.events.V1BillingAlertTriggeredEventNotification;
import com.stripe.events.V1BillingCreditBalanceTransactionCreatedEventNotification;
import com.stripe.events.V1BillingCreditGrantCreatedEventNotification;
import com.stripe.events.V1BillingCreditGrantUpdatedEventNotification;
import com.stripe.events.V1BillingMeterCreatedEventNotification;
import com.stripe.events.V1BillingMeterDeactivatedEventNotification;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V1BillingMeterNoMeterFoundEventNotification;
import com.stripe.events.V1BillingMeterReactivatedEventNotification;
import com.stripe.events.V1BillingMeterUpdatedEventNotification;
import com.stripe.events.V1BillingPortalConfigurationCreatedEventNotification;
import com.stripe.events.V1BillingPortalConfigurationUpdatedEventNotification;
import com.stripe.events.V1BillingPortalSessionCreatedEventNotification;
import com.stripe.events.V1CapabilityUpdatedEventNotification;
import com.stripe.events.V1CashBalanceFundsAvailableEventNotification;
import com.stripe.events.V1ChargeCapturedEventNotification;
import com.stripe.events.V1ChargeDisputeClosedEventNotification;
import com.stripe.events.V1ChargeDisputeCreatedEventNotification;
import com.stripe.events.V1ChargeDisputeFundsReinstatedEventNotification;
import com.stripe.events.V1ChargeDisputeFundsWithdrawnEventNotification;
import com.stripe.events.V1ChargeDisputeUpdatedEventNotification;
import com.stripe.events.V1ChargeExpiredEventNotification;
import com.stripe.events.V1ChargeFailedEventNotification;
import com.stripe.events.V1ChargePendingEventNotification;
import com.stripe.events.V1ChargeRefundUpdatedEventNotification;
import com.stripe.events.V1ChargeRefundedEventNotification;
import com.stripe.events.V1ChargeSucceededEventNotification;
import com.stripe.events.V1ChargeUpdatedEventNotification;
import com.stripe.events.V1CheckoutSessionAsyncPaymentFailedEventNotification;
import com.stripe.events.V1CheckoutSessionAsyncPaymentSucceededEventNotification;
import com.stripe.events.V1CheckoutSessionCompletedEventNotification;
import com.stripe.events.V1CheckoutSessionExpiredEventNotification;
import com.stripe.events.V1ClimateOrderCanceledEventNotification;
import com.stripe.events.V1ClimateOrderCreatedEventNotification;
import com.stripe.events.V1ClimateOrderDelayedEventNotification;
import com.stripe.events.V1ClimateOrderDeliveredEventNotification;
import com.stripe.events.V1ClimateOrderProductSubstitutedEventNotification;
import com.stripe.events.V1ClimateProductCreatedEventNotification;
import com.stripe.events.V1ClimateProductPricingUpdatedEventNotification;
import com.stripe.events.V1CouponCreatedEventNotification;
import com.stripe.events.V1CouponDeletedEventNotification;
import com.stripe.events.V1CouponUpdatedEventNotification;
import com.stripe.events.V1CreditNoteCreatedEventNotification;
import com.stripe.events.V1CreditNoteUpdatedEventNotification;
import com.stripe.events.V1CreditNoteVoidedEventNotification;
import com.stripe.events.V1CustomerCashBalanceTransactionCreatedEventNotification;
import com.stripe.events.V1CustomerCreatedEventNotification;
import com.stripe.events.V1CustomerDeletedEventNotification;
import com.stripe.events.V1CustomerSubscriptionCreatedEventNotification;
import com.stripe.events.V1CustomerSubscriptionDeletedEventNotification;
import com.stripe.events.V1CustomerSubscriptionPausedEventNotification;
import com.stripe.events.V1CustomerSubscriptionPendingUpdateAppliedEventNotification;
import com.stripe.events.V1CustomerSubscriptionPendingUpdateExpiredEventNotification;
import com.stripe.events.V1CustomerSubscriptionResumedEventNotification;
import com.stripe.events.V1CustomerSubscriptionTrialWillEndEventNotification;
import com.stripe.events.V1CustomerSubscriptionUpdatedEventNotification;
import com.stripe.events.V1CustomerTaxIdCreatedEventNotification;
import com.stripe.events.V1CustomerTaxIdDeletedEventNotification;
import com.stripe.events.V1CustomerTaxIdUpdatedEventNotification;
import com.stripe.events.V1CustomerUpdatedEventNotification;
import com.stripe.events.V1EntitlementsActiveEntitlementSummaryUpdatedEventNotification;
import com.stripe.events.V1FileCreatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountAccountNumbersUpdatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountCreatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountDeactivatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountDisconnectedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountExpectedDeactivationDateUpdatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountReactivatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedBalanceEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedOwnershipEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedTransactionsEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountUpcomingAccountNumberExpiryEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountUpcomingDeactivationEventNotification;
import com.stripe.events.V1IdentityVerificationSessionCanceledEventNotification;
import com.stripe.events.V1IdentityVerificationSessionCreatedEventNotification;
import com.stripe.events.V1IdentityVerificationSessionProcessingEventNotification;
import com.stripe.events.V1IdentityVerificationSessionRedactedEventNotification;
import com.stripe.events.V1IdentityVerificationSessionRequiresInputEventNotification;
import com.stripe.events.V1IdentityVerificationSessionVerifiedEventNotification;
import com.stripe.events.V1InvoiceCreatedEventNotification;
import com.stripe.events.V1InvoiceDeletedEventNotification;
import com.stripe.events.V1InvoiceFinalizationFailedEventNotification;
import com.stripe.events.V1InvoiceFinalizedEventNotification;
import com.stripe.events.V1InvoiceMarkedUncollectibleEventNotification;
import com.stripe.events.V1InvoiceOverdueEventNotification;
import com.stripe.events.V1InvoiceOverpaidEventNotification;
import com.stripe.events.V1InvoicePaidEventNotification;
import com.stripe.events.V1InvoicePaymentActionRequiredEventNotification;
import com.stripe.events.V1InvoicePaymentAttemptRequiredEventNotification;
import com.stripe.events.V1InvoicePaymentFailedEventNotification;
import com.stripe.events.V1InvoicePaymentPaidEventNotification;
import com.stripe.events.V1InvoicePaymentSucceededEventNotification;
import com.stripe.events.V1InvoiceSentEventNotification;
import com.stripe.events.V1InvoiceUpcomingEventNotification;
import com.stripe.events.V1InvoiceUpdatedEventNotification;
import com.stripe.events.V1InvoiceVoidedEventNotification;
import com.stripe.events.V1InvoiceWillBeDueEventNotification;
import com.stripe.events.V1InvoiceitemCreatedEventNotification;
import com.stripe.events.V1InvoiceitemDeletedEventNotification;
import com.stripe.events.V1IssuingAuthorizationCreatedEventNotification;
import com.stripe.events.V1IssuingAuthorizationRequestEventNotification;
import com.stripe.events.V1IssuingAuthorizationUpdatedEventNotification;
import com.stripe.events.V1IssuingCardCreatedEventNotification;
import com.stripe.events.V1IssuingCardUpdatedEventNotification;
import com.stripe.events.V1IssuingCardholderCreatedEventNotification;
import com.stripe.events.V1IssuingCardholderUpdatedEventNotification;
import com.stripe.events.V1IssuingDisputeClosedEventNotification;
import com.stripe.events.V1IssuingDisputeCreatedEventNotification;
import com.stripe.events.V1IssuingDisputeFundsReinstatedEventNotification;
import com.stripe.events.V1IssuingDisputeFundsRescindedEventNotification;
import com.stripe.events.V1IssuingDisputeSubmittedEventNotification;
import com.stripe.events.V1IssuingDisputeUpdatedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignActivatedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignDeactivatedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignRejectedEventNotification;
import com.stripe.events.V1IssuingPersonalizationDesignUpdatedEventNotification;
import com.stripe.events.V1IssuingTokenCreatedEventNotification;
import com.stripe.events.V1IssuingTokenUpdatedEventNotification;
import com.stripe.events.V1IssuingTransactionCreatedEventNotification;
import com.stripe.events.V1IssuingTransactionPurchaseDetailsReceiptUpdatedEventNotification;
import com.stripe.events.V1IssuingTransactionUpdatedEventNotification;
import com.stripe.events.V1MandateUpdatedEventNotification;
import com.stripe.events.V1PaymentIntentAmountCapturableUpdatedEventNotification;
import com.stripe.events.V1PaymentIntentCanceledEventNotification;
import com.stripe.events.V1PaymentIntentCreatedEventNotification;
import com.stripe.events.V1PaymentIntentPartiallyFundedEventNotification;
import com.stripe.events.V1PaymentIntentPaymentFailedEventNotification;
import com.stripe.events.V1PaymentIntentProcessingEventNotification;
import com.stripe.events.V1PaymentIntentRequiresActionEventNotification;
import com.stripe.events.V1PaymentIntentSucceededEventNotification;
import com.stripe.events.V1PaymentLinkCreatedEventNotification;
import com.stripe.events.V1PaymentLinkUpdatedEventNotification;
import com.stripe.events.V1PaymentMethodAttachedEventNotification;
import com.stripe.events.V1PaymentMethodAutomaticallyUpdatedEventNotification;
import com.stripe.events.V1PaymentMethodDetachedEventNotification;
import com.stripe.events.V1PaymentMethodUpdatedEventNotification;
import com.stripe.events.V1PayoutCanceledEventNotification;
import com.stripe.events.V1PayoutCreatedEventNotification;
import com.stripe.events.V1PayoutFailedEventNotification;
import com.stripe.events.V1PayoutPaidEventNotification;
import com.stripe.events.V1PayoutReconciliationCompletedEventNotification;
import com.stripe.events.V1PayoutUpdatedEventNotification;
import com.stripe.events.V1PersonCreatedEventNotification;
import com.stripe.events.V1PersonDeletedEventNotification;
import com.stripe.events.V1PersonUpdatedEventNotification;
import com.stripe.events.V1PlanCreatedEventNotification;
import com.stripe.events.V1PlanDeletedEventNotification;
import com.stripe.events.V1PlanUpdatedEventNotification;
import com.stripe.events.V1PriceCreatedEventNotification;
import com.stripe.events.V1PriceDeletedEventNotification;
import com.stripe.events.V1PriceUpdatedEventNotification;
import com.stripe.events.V1ProductCreatedEventNotification;
import com.stripe.events.V1ProductDeletedEventNotification;
import com.stripe.events.V1ProductUpdatedEventNotification;
import com.stripe.events.V1PromotionCodeCreatedEventNotification;
import com.stripe.events.V1PromotionCodeUpdatedEventNotification;
import com.stripe.events.V1QuoteAcceptedEventNotification;
import com.stripe.events.V1QuoteCanceledEventNotification;
import com.stripe.events.V1QuoteCreatedEventNotification;
import com.stripe.events.V1QuoteFinalizedEventNotification;
import com.stripe.events.V1RadarEarlyFraudWarningCreatedEventNotification;
import com.stripe.events.V1RadarEarlyFraudWarningUpdatedEventNotification;
import com.stripe.events.V1RefundCreatedEventNotification;
import com.stripe.events.V1RefundFailedEventNotification;
import com.stripe.events.V1RefundUpdatedEventNotification;
import com.stripe.events.V1ReviewClosedEventNotification;
import com.stripe.events.V1ReviewOpenedEventNotification;
import com.stripe.events.V1SetupIntentCanceledEventNotification;
import com.stripe.events.V1SetupIntentCreatedEventNotification;
import com.stripe.events.V1SetupIntentRequiresActionEventNotification;
import com.stripe.events.V1SetupIntentSetupFailedEventNotification;
import com.stripe.events.V1SetupIntentSucceededEventNotification;
import com.stripe.events.V1SigmaScheduledQueryRunCreatedEventNotification;
import com.stripe.events.V1SourceCanceledEventNotification;
import com.stripe.events.V1SourceChargeableEventNotification;
import com.stripe.events.V1SourceFailedEventNotification;
import com.stripe.events.V1SourceRefundAttributesRequiredEventNotification;
import com.stripe.events.V1SubscriptionScheduleAbortedEventNotification;
import com.stripe.events.V1SubscriptionScheduleCanceledEventNotification;
import com.stripe.events.V1SubscriptionScheduleCompletedEventNotification;
import com.stripe.events.V1SubscriptionScheduleCreatedEventNotification;
import com.stripe.events.V1SubscriptionScheduleExpiringEventNotification;
import com.stripe.events.V1SubscriptionScheduleReleasedEventNotification;
import com.stripe.events.V1SubscriptionScheduleUpdatedEventNotification;
import com.stripe.events.V1TaxRateCreatedEventNotification;
import com.stripe.events.V1TaxRateUpdatedEventNotification;
import com.stripe.events.V1TaxSettingsUpdatedEventNotification;
import com.stripe.events.V1TerminalReaderActionFailedEventNotification;
import com.stripe.events.V1TerminalReaderActionSucceededEventNotification;
import com.stripe.events.V1TerminalReaderActionUpdatedEventNotification;
import com.stripe.events.V1TestHelpersTestClockAdvancingEventNotification;
import com.stripe.events.V1TestHelpersTestClockCreatedEventNotification;
import com.stripe.events.V1TestHelpersTestClockDeletedEventNotification;
import com.stripe.events.V1TestHelpersTestClockInternalFailureEventNotification;
import com.stripe.events.V1TestHelpersTestClockReadyEventNotification;
import com.stripe.events.V1TopupCanceledEventNotification;
import com.stripe.events.V1TopupCreatedEventNotification;
import com.stripe.events.V1TopupFailedEventNotification;
import com.stripe.events.V1TopupReversedEventNotification;
import com.stripe.events.V1TopupSucceededEventNotification;
import com.stripe.events.V1TransferCreatedEventNotification;
import com.stripe.events.V1TransferReversedEventNotification;
import com.stripe.events.V1TransferUpdatedEventNotification;
import com.stripe.events.V2BillingCadenceBilledEventNotification;
import com.stripe.events.V2BillingCadenceCanceledEventNotification;
import com.stripe.events.V2BillingCadenceCreatedEventNotification;
import com.stripe.events.V2BillingContractActivatedEventNotification;
import com.stripe.events.V2BillingContractCanceledEventNotification;
import com.stripe.events.V2BillingContractCreatedEventNotification;
import com.stripe.events.V2BillingContractEndedEventNotification;
import com.stripe.events.V2BillingContractUpdatedEventNotification;
import com.stripe.events.V2BillingLicenseFeeCreatedEventNotification;
import com.stripe.events.V2BillingLicenseFeeUpdatedEventNotification;
import com.stripe.events.V2BillingLicenseFeeVersionCreatedEventNotification;
import com.stripe.events.V2BillingLicensedItemCreatedEventNotification;
import com.stripe.events.V2BillingLicensedItemUpdatedEventNotification;
import com.stripe.events.V2BillingMeteredItemCreatedEventNotification;
import com.stripe.events.V2BillingMeteredItemUpdatedEventNotification;
import com.stripe.events.V2BillingPricingPlanComponentCreatedEventNotification;
import com.stripe.events.V2BillingPricingPlanComponentUpdatedEventNotification;
import com.stripe.events.V2BillingPricingPlanCreatedEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionCollectionCurrentEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionCollectionPastDueEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionCollectionPausedEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionCollectionUnpaidEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionServicingActivatedEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionServicingCanceledEventNotification;
import com.stripe.events.V2BillingPricingPlanSubscriptionServicingPausedEventNotification;
import com.stripe.events.V2BillingPricingPlanUpdatedEventNotification;
import com.stripe.events.V2BillingPricingPlanVersionCreatedEventNotification;
import com.stripe.events.V2BillingRateCardCreatedEventNotification;
import com.stripe.events.V2BillingRateCardCustomPricingUnitOverageRateCreatedEventNotification;
import com.stripe.events.V2BillingRateCardRateCreatedEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionActivatedEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionCanceledEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionCollectionCurrentEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionCollectionPastDueEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionCollectionPausedEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionCollectionUnpaidEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionServicingActivatedEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionServicingCanceledEventNotification;
import com.stripe.events.V2BillingRateCardSubscriptionServicingPausedEventNotification;
import com.stripe.events.V2BillingRateCardUpdatedEventNotification;
import com.stripe.events.V2BillingRateCardVersionCreatedEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsFailedEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsProcessingEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsSucceededEventNotification;
import com.stripe.events.V2CommerceProductCatalogImportsSucceededWithErrorsEventNotification;
import com.stripe.events.V2CoreAccountClosedEventNotification;
import com.stripe.events.V2CoreAccountCreatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCardCreatorUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingDefaultsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingIdentityUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingRequirementsUpdatedEventNotification;
import com.stripe.events.V2CoreAccountLinkReturnedEventNotification;
import com.stripe.events.V2CoreAccountPersonCreatedEventNotification;
import com.stripe.events.V2CoreAccountPersonDeletedEventNotification;
import com.stripe.events.V2CoreAccountPersonUpdatedEventNotification;
import com.stripe.events.V2CoreAccountSignalsFraudulentWebsiteReadyEventNotification;
import com.stripe.events.V2CoreAccountUpdatedEventNotification;
import com.stripe.events.V2CoreApprovalRequestApprovedEventNotification;
import com.stripe.events.V2CoreApprovalRequestCanceledEventNotification;
import com.stripe.events.V2CoreApprovalRequestCreatedEventNotification;
import com.stripe.events.V2CoreApprovalRequestExpiredEventNotification;
import com.stripe.events.V2CoreApprovalRequestFailedEventNotification;
import com.stripe.events.V2CoreApprovalRequestRejectedEventNotification;
import com.stripe.events.V2CoreApprovalRequestSucceededEventNotification;
import com.stripe.events.V2CoreBatchJobBatchFailedEventNotification;
import com.stripe.events.V2CoreBatchJobCanceledEventNotification;
import com.stripe.events.V2CoreBatchJobCompletedEventNotification;
import com.stripe.events.V2CoreBatchJobCreatedEventNotification;
import com.stripe.events.V2CoreBatchJobReadyForUploadEventNotification;
import com.stripe.events.V2CoreBatchJobTimeoutEventNotification;
import com.stripe.events.V2CoreBatchJobUpdatedEventNotification;
import com.stripe.events.V2CoreBatchJobUploadTimeoutEventNotification;
import com.stripe.events.V2CoreBatchJobValidatingEventNotification;
import com.stripe.events.V2CoreBatchJobValidationFailedEventNotification;
import com.stripe.events.V2CoreClaimableSandboxClaimedEventNotification;
import com.stripe.events.V2CoreClaimableSandboxCreatedEventNotification;
import com.stripe.events.V2CoreClaimableSandboxExpiredEventNotification;
import com.stripe.events.V2CoreClaimableSandboxExpiringEventNotification;
import com.stripe.events.V2CoreClaimableSandboxUpdatedEventNotification;
import com.stripe.events.V2CoreEventDestinationPingEventNotification;
import com.stripe.events.V2CoreHealthApiErrorFiringEventNotification;
import com.stripe.events.V2CoreHealthApiErrorResolvedEventNotification;
import com.stripe.events.V2CoreHealthApiLatencyFiringEventNotification;
import com.stripe.events.V2CoreHealthApiLatencyResolvedEventNotification;
import com.stripe.events.V2CoreHealthAuthorizationRateDropFiringEventNotification;
import com.stripe.events.V2CoreHealthAuthorizationRateDropResolvedEventNotification;
import com.stripe.events.V2CoreHealthElementsErrorFiringEventNotification;
import com.stripe.events.V2CoreHealthElementsErrorResolvedEventNotification;
import com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEventNotification;
import com.stripe.events.V2CoreHealthFraudRateIncreasedEventNotification;
import com.stripe.events.V2CoreHealthInvoiceCountDroppedFiringEventNotification;
import com.stripe.events.V2CoreHealthInvoiceCountDroppedResolvedEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestErrorsFiringEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEventNotification;
import com.stripe.events.V2CoreHealthMeterEventSummariesDelayedFiringEventNotification;
import com.stripe.events.V2CoreHealthMeterEventSummariesDelayedResolvedEventNotification;
import com.stripe.events.V2CoreHealthMetronomeNotificationLatencyFiringEventNotification;
import com.stripe.events.V2CoreHealthMetronomeNotificationLatencyResolvedEventNotification;
import com.stripe.events.V2CoreHealthPaymentMethodErrorFiringEventNotification;
import com.stripe.events.V2CoreHealthPaymentMethodErrorResolvedEventNotification;
import com.stripe.events.V2CoreHealthSepaDebitDelayedFiringEventNotification;
import com.stripe.events.V2CoreHealthSepaDebitDelayedResolvedEventNotification;
import com.stripe.events.V2CoreHealthTrafficVolumeDropFiringEventNotification;
import com.stripe.events.V2CoreHealthTrafficVolumeDropResolvedEventNotification;
import com.stripe.events.V2CoreHealthWebhookLatencyFiringEventNotification;
import com.stripe.events.V2CoreHealthWebhookLatencyResolvedEventNotification;
import com.stripe.events.V2DataReportingQueryRunCreatedEventNotification;
import com.stripe.events.V2DataReportingQueryRunFailedEventNotification;
import com.stripe.events.V2DataReportingQueryRunSucceededEventNotification;
import com.stripe.events.V2DataReportingQueryRunUpdatedEventNotification;
import com.stripe.events.V2ExtendExtensionRunFailedEventNotification;
import com.stripe.events.V2ExtendWorkflowRunFailedEventNotification;
import com.stripe.events.V2ExtendWorkflowRunStartedEventNotification;
import com.stripe.events.V2ExtendWorkflowRunSucceededEventNotification;
import com.stripe.events.V2IamApiKeyCreatedEventNotification;
import com.stripe.events.V2IamApiKeyDefaultSecretRevealedEventNotification;
import com.stripe.events.V2IamApiKeyExpiredEventNotification;
import com.stripe.events.V2IamApiKeyPermissionsUpdatedEventNotification;
import com.stripe.events.V2IamApiKeyRotatedEventNotification;
import com.stripe.events.V2IamApiKeyUpdatedEventNotification;
import com.stripe.events.V2IamStripeAccessGrantApprovedEventNotification;
import com.stripe.events.V2IamStripeAccessGrantCanceledEventNotification;
import com.stripe.events.V2IamStripeAccessGrantDeniedEventNotification;
import com.stripe.events.V2IamStripeAccessGrantRemovedEventNotification;
import com.stripe.events.V2IamStripeAccessGrantRequestedEventNotification;
import com.stripe.events.V2IamStripeAccessGrantUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementAdjustmentCreatedEventNotification;
import com.stripe.events.V2MoneyManagementDebitDisputeFailedEventNotification;
import com.stripe.events.V2MoneyManagementDebitDisputeSubmittedEventNotification;
import com.stripe.events.V2MoneyManagementDebitDisputeSucceededEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAccountCreatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAccountStatementCreatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAccountStatementRestatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAccountUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAddressActivatedEventNotification;
import com.stripe.events.V2MoneyManagementFinancialAddressFailedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferAvailableEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitFailedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitProcessingEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitQueuedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitReturnedEventNotification;
import com.stripe.events.V2MoneyManagementInboundTransferBankDebitSucceededEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentCanceledEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentCreatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentFailedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentPostedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentReturnedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentUnderReviewEventNotification;
import com.stripe.events.V2MoneyManagementOutboundPaymentUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCanceledEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCreatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferFailedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferPostedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferReturnedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferUnderReviewEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutIntentCanceledEventNotification;
import com.stripe.events.V2MoneyManagementPayoutIntentCreatedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutIntentPostedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutIntentProcessingEventNotification;
import com.stripe.events.V2MoneyManagementPayoutIntentRequiresActionEventNotification;
import com.stripe.events.V2MoneyManagementPayoutMethodCreatedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutMethodUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditAvailableEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditFailedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditReturnedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditSucceededEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitCanceledEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitCreatedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitFailedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitMandateCanceledEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitMandateCreatedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitMandateExpiredEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitMandatePendingCancellationEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitMandateUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitPendingEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitScheduledEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitSucceededEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementRecipientVerificationCreatedEventNotification;
import com.stripe.events.V2MoneyManagementRecipientVerificationUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementTransactionCreatedEventNotification;
import com.stripe.events.V2MoneyManagementTransactionUpdatedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementConfirmedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementCreatedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementPartiallyConfirmedEventNotification;
import com.stripe.events.V2OrchestratedCommerceAgreementTerminatedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentAttemptFailedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentAttemptStartedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentAuthorizationAttemptFailedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentAuthorizationAttemptStartedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentCanceledEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentCreatedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentFailedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentPausedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentRequiresCaptureEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentResumedEventNotification;
import com.stripe.events.V2PaymentsOffSessionPaymentSucceededEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentCanceledEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentCreatedEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentErroredEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentFundsNotReceivedEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentMatchedEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentNotFoundEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentSettledEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentSplitCanceledEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentSplitCreatedEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentSplitSettledEventNotification;
import com.stripe.events.V2PaymentsSettlementAllocationIntentSubmittedEventNotification;
import com.stripe.events.V2ReportingReportRunCreatedEventNotification;
import com.stripe.events.V2ReportingReportRunFailedEventNotification;
import com.stripe.events.V2ReportingReportRunSucceededEventNotification;
import com.stripe.events.V2ReportingReportRunUpdatedEventNotification;
import com.stripe.events.V2SignalsAccountEvaluationCompleteEventNotification;
import com.stripe.events.V2SignalsAccountSignalFraudulentMerchantReadyEventNotification;
import com.stripe.events.V2SignalsAccountSignalFraudulentWebsiteReadyEventNotification;
import com.stripe.events.V2SignalsAccountSignalMerchantDelinquencyReadyEventNotification;
import com.stripe.events.V2SignalsAccountSignalPaymentDelinquencyExposureReadyEventNotification;
import com.stripe.events.V2SignalsPaymentRetryEvaluationsRetryRecommendedEventNotification;
import com.stripe.model.v2.core.EventNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// event-notification-class-imports: The end of the section generated from our OpenAPI spec

/**
 * Shared registration and dispatch machinery for {@link StripeEventNotificationHandler} and {@link
 * StripeEventNotificationHandlerWithoutVerification}.
 *
 * <p>Package-private, because it's an implementation detail: the user-facing types live at the top
 * level of this package instead ({@link EventNotificationCallback}, {@link
 * EventNotificationFallbackCallback}, {@link UnhandledNotificationDetails}).
 *
 * <p>The self type {@code T} lets the generated {@code on*} methods return the concrete handler
 * type. Returning this class instead would break fluent chaining for callers outside {@code
 * com.stripe}, who cannot access members of a type they can't see.
 */
abstract class StripeEventNotificationHandlerBase<T extends StripeEventNotificationHandlerBase<T>> {
  // this is intentionally naiive to avoid the performance cost of interacting with `volatile`. We
  // expect that registrations are done synchronously at startup time and handling will happen
  // async, so thread-safe reads aren't important here.
  boolean hasHandledEvent = false;

  final StripeClient client;
  private final EventNotificationFallbackCallback fallbackCallback;
  private EventNotificationPreHandleCallback preHandleCallback;
  private final HashMap<String, EventNotificationCallback<? extends EventNotification>>
      registeredHandlers = new HashMap<>();

  StripeEventNotificationHandlerBase(
      StripeClient client, EventNotificationFallbackCallback fallbackCallback) {
    this.client = client;
    this.fallbackCallback = fallbackCallback;
  }

  /**
   * Callbacks are expected to be registered once on startup, so registering anything after handling
   * has begun indicates a bug.
   */
  private void assertCanRegister() {
    if (hasHandledEvent) {
      throw new IllegalStateException(
          "Cannot register new callbacks after an event has been handled. This is indicative of a bug.");
    }
  }

  private <E extends EventNotification> void register(
      String eventType, EventNotificationCallback<E> handler) {
    assertCanRegister();

    if (this.registeredHandlers.containsKey(eventType)) {
      throw new IllegalArgumentException(
          "Callback for event type \"" + eventType + "\" is already registered");
    }
    this.registeredHandlers.put(eventType, handler);
  }

  /**
   * Registers a function that will be run before any event-specific callbacks. A useful place to
   * store event-agnostic logic, such as logging or checking for <a
   * href="https://docs.stripe.com/webhooks#handle-duplicate-events">duplicate event deliveries</a>.
   *
   * <p>Returning {@code true} causes handling to continue as normal; returning {@code false}
   * returns from {@code handle()} immediately, so neither the registered callback nor the fallback
   * callback are called.
   *
   * @param callback the hook to run before handling continues
   * @return this handler, for chaining
   */
  public T preHandle(EventNotificationPreHandleCallback callback) {
    assertCanRegister();

    if (this.preHandleCallback != null) {
      throw new IllegalArgumentException("A preHandle callback is already registered");
    }
    this.preHandleCallback = callback;
    return self();
  }

  /** Lets the generated {@code on*} methods return the concrete handler type for chaining. */
  @SuppressWarnings("unchecked")
  final T self() {
    return (T) this;
  }

  @SuppressWarnings("unchecked")
  void dispatch(EventNotification eventNotification) {
    EventNotificationCallback<? extends EventNotification> handler =
        registeredHandlers.get(eventNotification.getType());

    // Create a new client with the event's context for thread-safe processing
    StripeClient eventClient = this.client.withStripeContext(eventNotification.context);

    if (this.preHandleCallback != null
        && !this.preHandleCallback.process(eventNotification, eventClient)) {
      return;
    }

    if (handler == null) {
      boolean isKnownEventType =
          !(eventNotification instanceof com.stripe.events.UnknownEventNotification);
      UnhandledNotificationDetails details = new UnhandledNotificationDetails(isKnownEventType);

      this.fallbackCallback.process(eventNotification, eventClient, details);
    } else {
      // this is technically unsafe but we control the registration API so should be ok
      ((EventNotificationCallback<EventNotification>) handler)
          .process(eventNotification, eventClient);
    }
  }

  // notification-handler-methods: The beginning of the section generated from our OpenAPI spec
  public T onV1AccountApplicationAuthorized(
      EventNotificationCallback<V1AccountApplicationAuthorizedEventNotification> callback) {
    this.register("v1.account.application.authorized", callback);
    return self();
  }

  public T onV1AccountApplicationDeauthorized(
      EventNotificationCallback<V1AccountApplicationDeauthorizedEventNotification> callback) {
    this.register("v1.account.application.deauthorized", callback);
    return self();
  }

  public T onV1AccountExternalAccountCreated(
      EventNotificationCallback<V1AccountExternalAccountCreatedEventNotification> callback) {
    this.register("v1.account.external_account.created", callback);
    return self();
  }

  public T onV1AccountExternalAccountDeleted(
      EventNotificationCallback<V1AccountExternalAccountDeletedEventNotification> callback) {
    this.register("v1.account.external_account.deleted", callback);
    return self();
  }

  public T onV1AccountExternalAccountUpdated(
      EventNotificationCallback<V1AccountExternalAccountUpdatedEventNotification> callback) {
    this.register("v1.account.external_account.updated", callback);
    return self();
  }

  public T onV1AccountUpdated(
      EventNotificationCallback<V1AccountUpdatedEventNotification> callback) {
    this.register("v1.account.updated", callback);
    return self();
  }

  public T onV1AccountSignalsIncludingDelinquencyCreated(
      EventNotificationCallback<V1AccountSignalsIncludingDelinquencyCreatedEventNotification>
          callback) {
    this.register("v1.account_signals[delinquency].created", callback);
    return self();
  }

  public T onV1ApplicationFeeCreated(
      EventNotificationCallback<V1ApplicationFeeCreatedEventNotification> callback) {
    this.register("v1.application_fee.created", callback);
    return self();
  }

  public T onV1ApplicationFeeRefundUpdated(
      EventNotificationCallback<V1ApplicationFeeRefundUpdatedEventNotification> callback) {
    this.register("v1.application_fee.refund.updated", callback);
    return self();
  }

  public T onV1ApplicationFeeRefunded(
      EventNotificationCallback<V1ApplicationFeeRefundedEventNotification> callback) {
    this.register("v1.application_fee.refunded", callback);
    return self();
  }

  public T onV1BalanceAvailable(
      EventNotificationCallback<V1BalanceAvailableEventNotification> callback) {
    this.register("v1.balance.available", callback);
    return self();
  }

  public T onV1BalanceSettingsUpdated(
      EventNotificationCallback<V1BalanceSettingsUpdatedEventNotification> callback) {
    this.register("v1.balance_settings.updated", callback);
    return self();
  }

  public T onV1BillingAlertTriggered(
      EventNotificationCallback<V1BillingAlertTriggeredEventNotification> callback) {
    this.register("v1.billing.alert.triggered", callback);
    return self();
  }

  public T onV1BillingCreditBalanceTransactionCreated(
      EventNotificationCallback<V1BillingCreditBalanceTransactionCreatedEventNotification>
          callback) {
    this.register("v1.billing.credit_balance_transaction.created", callback);
    return self();
  }

  public T onV1BillingCreditGrantCreated(
      EventNotificationCallback<V1BillingCreditGrantCreatedEventNotification> callback) {
    this.register("v1.billing.credit_grant.created", callback);
    return self();
  }

  public T onV1BillingCreditGrantUpdated(
      EventNotificationCallback<V1BillingCreditGrantUpdatedEventNotification> callback) {
    this.register("v1.billing.credit_grant.updated", callback);
    return self();
  }

  public T onV1BillingMeterCreated(
      EventNotificationCallback<V1BillingMeterCreatedEventNotification> callback) {
    this.register("v1.billing.meter.created", callback);
    return self();
  }

  public T onV1BillingMeterDeactivated(
      EventNotificationCallback<V1BillingMeterDeactivatedEventNotification> callback) {
    this.register("v1.billing.meter.deactivated", callback);
    return self();
  }

  public T onV1BillingMeterErrorReportTriggered(
      EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> callback) {
    this.register("v1.billing.meter.error_report_triggered", callback);
    return self();
  }

  public T onV1BillingMeterNoMeterFound(
      EventNotificationCallback<V1BillingMeterNoMeterFoundEventNotification> callback) {
    this.register("v1.billing.meter.no_meter_found", callback);
    return self();
  }

  public T onV1BillingMeterReactivated(
      EventNotificationCallback<V1BillingMeterReactivatedEventNotification> callback) {
    this.register("v1.billing.meter.reactivated", callback);
    return self();
  }

  public T onV1BillingMeterUpdated(
      EventNotificationCallback<V1BillingMeterUpdatedEventNotification> callback) {
    this.register("v1.billing.meter.updated", callback);
    return self();
  }

  public T onV1BillingPortalConfigurationCreated(
      EventNotificationCallback<V1BillingPortalConfigurationCreatedEventNotification> callback) {
    this.register("v1.billing_portal.configuration.created", callback);
    return self();
  }

  public T onV1BillingPortalConfigurationUpdated(
      EventNotificationCallback<V1BillingPortalConfigurationUpdatedEventNotification> callback) {
    this.register("v1.billing_portal.configuration.updated", callback);
    return self();
  }

  public T onV1BillingPortalSessionCreated(
      EventNotificationCallback<V1BillingPortalSessionCreatedEventNotification> callback) {
    this.register("v1.billing_portal.session.created", callback);
    return self();
  }

  public T onV1CapabilityUpdated(
      EventNotificationCallback<V1CapabilityUpdatedEventNotification> callback) {
    this.register("v1.capability.updated", callback);
    return self();
  }

  public T onV1CashBalanceFundsAvailable(
      EventNotificationCallback<V1CashBalanceFundsAvailableEventNotification> callback) {
    this.register("v1.cash_balance.funds_available", callback);
    return self();
  }

  public T onV1ChargeCaptured(
      EventNotificationCallback<V1ChargeCapturedEventNotification> callback) {
    this.register("v1.charge.captured", callback);
    return self();
  }

  public T onV1ChargeDisputeClosed(
      EventNotificationCallback<V1ChargeDisputeClosedEventNotification> callback) {
    this.register("v1.charge.dispute.closed", callback);
    return self();
  }

  public T onV1ChargeDisputeCreated(
      EventNotificationCallback<V1ChargeDisputeCreatedEventNotification> callback) {
    this.register("v1.charge.dispute.created", callback);
    return self();
  }

  public T onV1ChargeDisputeFundsReinstated(
      EventNotificationCallback<V1ChargeDisputeFundsReinstatedEventNotification> callback) {
    this.register("v1.charge.dispute.funds_reinstated", callback);
    return self();
  }

  public T onV1ChargeDisputeFundsWithdrawn(
      EventNotificationCallback<V1ChargeDisputeFundsWithdrawnEventNotification> callback) {
    this.register("v1.charge.dispute.funds_withdrawn", callback);
    return self();
  }

  public T onV1ChargeDisputeUpdated(
      EventNotificationCallback<V1ChargeDisputeUpdatedEventNotification> callback) {
    this.register("v1.charge.dispute.updated", callback);
    return self();
  }

  public T onV1ChargeExpired(EventNotificationCallback<V1ChargeExpiredEventNotification> callback) {
    this.register("v1.charge.expired", callback);
    return self();
  }

  public T onV1ChargeFailed(EventNotificationCallback<V1ChargeFailedEventNotification> callback) {
    this.register("v1.charge.failed", callback);
    return self();
  }

  public T onV1ChargePending(EventNotificationCallback<V1ChargePendingEventNotification> callback) {
    this.register("v1.charge.pending", callback);
    return self();
  }

  public T onV1ChargeRefundUpdated(
      EventNotificationCallback<V1ChargeRefundUpdatedEventNotification> callback) {
    this.register("v1.charge.refund.updated", callback);
    return self();
  }

  public T onV1ChargeRefunded(
      EventNotificationCallback<V1ChargeRefundedEventNotification> callback) {
    this.register("v1.charge.refunded", callback);
    return self();
  }

  public T onV1ChargeSucceeded(
      EventNotificationCallback<V1ChargeSucceededEventNotification> callback) {
    this.register("v1.charge.succeeded", callback);
    return self();
  }

  public T onV1ChargeUpdated(EventNotificationCallback<V1ChargeUpdatedEventNotification> callback) {
    this.register("v1.charge.updated", callback);
    return self();
  }

  public T onV1CheckoutSessionAsyncPaymentFailed(
      EventNotificationCallback<V1CheckoutSessionAsyncPaymentFailedEventNotification> callback) {
    this.register("v1.checkout.session.async_payment_failed", callback);
    return self();
  }

  public T onV1CheckoutSessionAsyncPaymentSucceeded(
      EventNotificationCallback<V1CheckoutSessionAsyncPaymentSucceededEventNotification> callback) {
    this.register("v1.checkout.session.async_payment_succeeded", callback);
    return self();
  }

  public T onV1CheckoutSessionCompleted(
      EventNotificationCallback<V1CheckoutSessionCompletedEventNotification> callback) {
    this.register("v1.checkout.session.completed", callback);
    return self();
  }

  public T onV1CheckoutSessionExpired(
      EventNotificationCallback<V1CheckoutSessionExpiredEventNotification> callback) {
    this.register("v1.checkout.session.expired", callback);
    return self();
  }

  public T onV1ClimateOrderCanceled(
      EventNotificationCallback<V1ClimateOrderCanceledEventNotification> callback) {
    this.register("v1.climate.order.canceled", callback);
    return self();
  }

  public T onV1ClimateOrderCreated(
      EventNotificationCallback<V1ClimateOrderCreatedEventNotification> callback) {
    this.register("v1.climate.order.created", callback);
    return self();
  }

  public T onV1ClimateOrderDelayed(
      EventNotificationCallback<V1ClimateOrderDelayedEventNotification> callback) {
    this.register("v1.climate.order.delayed", callback);
    return self();
  }

  public T onV1ClimateOrderDelivered(
      EventNotificationCallback<V1ClimateOrderDeliveredEventNotification> callback) {
    this.register("v1.climate.order.delivered", callback);
    return self();
  }

  public T onV1ClimateOrderProductSubstituted(
      EventNotificationCallback<V1ClimateOrderProductSubstitutedEventNotification> callback) {
    this.register("v1.climate.order.product_substituted", callback);
    return self();
  }

  public T onV1ClimateProductCreated(
      EventNotificationCallback<V1ClimateProductCreatedEventNotification> callback) {
    this.register("v1.climate.product.created", callback);
    return self();
  }

  public T onV1ClimateProductPricingUpdated(
      EventNotificationCallback<V1ClimateProductPricingUpdatedEventNotification> callback) {
    this.register("v1.climate.product.pricing_updated", callback);
    return self();
  }

  public T onV1CouponCreated(EventNotificationCallback<V1CouponCreatedEventNotification> callback) {
    this.register("v1.coupon.created", callback);
    return self();
  }

  public T onV1CouponDeleted(EventNotificationCallback<V1CouponDeletedEventNotification> callback) {
    this.register("v1.coupon.deleted", callback);
    return self();
  }

  public T onV1CouponUpdated(EventNotificationCallback<V1CouponUpdatedEventNotification> callback) {
    this.register("v1.coupon.updated", callback);
    return self();
  }

  public T onV1CreditNoteCreated(
      EventNotificationCallback<V1CreditNoteCreatedEventNotification> callback) {
    this.register("v1.credit_note.created", callback);
    return self();
  }

  public T onV1CreditNoteUpdated(
      EventNotificationCallback<V1CreditNoteUpdatedEventNotification> callback) {
    this.register("v1.credit_note.updated", callback);
    return self();
  }

  public T onV1CreditNoteVoided(
      EventNotificationCallback<V1CreditNoteVoidedEventNotification> callback) {
    this.register("v1.credit_note.voided", callback);
    return self();
  }

  public T onV1CustomerCreated(
      EventNotificationCallback<V1CustomerCreatedEventNotification> callback) {
    this.register("v1.customer.created", callback);
    return self();
  }

  public T onV1CustomerDeleted(
      EventNotificationCallback<V1CustomerDeletedEventNotification> callback) {
    this.register("v1.customer.deleted", callback);
    return self();
  }

  public T onV1CustomerSubscriptionCreated(
      EventNotificationCallback<V1CustomerSubscriptionCreatedEventNotification> callback) {
    this.register("v1.customer.subscription.created", callback);
    return self();
  }

  public T onV1CustomerSubscriptionDeleted(
      EventNotificationCallback<V1CustomerSubscriptionDeletedEventNotification> callback) {
    this.register("v1.customer.subscription.deleted", callback);
    return self();
  }

  public T onV1CustomerSubscriptionPaused(
      EventNotificationCallback<V1CustomerSubscriptionPausedEventNotification> callback) {
    this.register("v1.customer.subscription.paused", callback);
    return self();
  }

  public T onV1CustomerSubscriptionPendingUpdateApplied(
      EventNotificationCallback<V1CustomerSubscriptionPendingUpdateAppliedEventNotification>
          callback) {
    this.register("v1.customer.subscription.pending_update_applied", callback);
    return self();
  }

  public T onV1CustomerSubscriptionPendingUpdateExpired(
      EventNotificationCallback<V1CustomerSubscriptionPendingUpdateExpiredEventNotification>
          callback) {
    this.register("v1.customer.subscription.pending_update_expired", callback);
    return self();
  }

  public T onV1CustomerSubscriptionResumed(
      EventNotificationCallback<V1CustomerSubscriptionResumedEventNotification> callback) {
    this.register("v1.customer.subscription.resumed", callback);
    return self();
  }

  public T onV1CustomerSubscriptionTrialWillEnd(
      EventNotificationCallback<V1CustomerSubscriptionTrialWillEndEventNotification> callback) {
    this.register("v1.customer.subscription.trial_will_end", callback);
    return self();
  }

  public T onV1CustomerSubscriptionUpdated(
      EventNotificationCallback<V1CustomerSubscriptionUpdatedEventNotification> callback) {
    this.register("v1.customer.subscription.updated", callback);
    return self();
  }

  public T onV1CustomerTaxIdCreated(
      EventNotificationCallback<V1CustomerTaxIdCreatedEventNotification> callback) {
    this.register("v1.customer.tax_id.created", callback);
    return self();
  }

  public T onV1CustomerTaxIdDeleted(
      EventNotificationCallback<V1CustomerTaxIdDeletedEventNotification> callback) {
    this.register("v1.customer.tax_id.deleted", callback);
    return self();
  }

  public T onV1CustomerTaxIdUpdated(
      EventNotificationCallback<V1CustomerTaxIdUpdatedEventNotification> callback) {
    this.register("v1.customer.tax_id.updated", callback);
    return self();
  }

  public T onV1CustomerUpdated(
      EventNotificationCallback<V1CustomerUpdatedEventNotification> callback) {
    this.register("v1.customer.updated", callback);
    return self();
  }

  public T onV1CustomerCashBalanceTransactionCreated(
      EventNotificationCallback<V1CustomerCashBalanceTransactionCreatedEventNotification>
          callback) {
    this.register("v1.customer_cash_balance_transaction.created", callback);
    return self();
  }

  public T onV1EntitlementsActiveEntitlementSummaryUpdated(
      EventNotificationCallback<V1EntitlementsActiveEntitlementSummaryUpdatedEventNotification>
          callback) {
    this.register("v1.entitlements.active_entitlement_summary.updated", callback);
    return self();
  }

  public T onV1FileCreated(EventNotificationCallback<V1FileCreatedEventNotification> callback) {
    this.register("v1.file.created", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountAccountNumbersUpdated(
      EventNotificationCallback<V1FinancialConnectionsAccountAccountNumbersUpdatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.account_numbers_updated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountCreated(
      EventNotificationCallback<V1FinancialConnectionsAccountCreatedEventNotification> callback) {
    this.register("v1.financial_connections.account.created", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountDeactivated(
      EventNotificationCallback<V1FinancialConnectionsAccountDeactivatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.deactivated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountDisconnected(
      EventNotificationCallback<V1FinancialConnectionsAccountDisconnectedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.disconnected", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountExpectedDeactivationDateUpdated(
      EventNotificationCallback<
              V1FinancialConnectionsAccountExpectedDeactivationDateUpdatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.expected_deactivation_date_updated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountReactivated(
      EventNotificationCallback<V1FinancialConnectionsAccountReactivatedEventNotification>
          callback) {
    this.register("v1.financial_connections.account.reactivated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountRefreshedBalance(
      EventNotificationCallback<V1FinancialConnectionsAccountRefreshedBalanceEventNotification>
          callback) {
    this.register("v1.financial_connections.account.refreshed_balance", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountRefreshedOwnership(
      EventNotificationCallback<V1FinancialConnectionsAccountRefreshedOwnershipEventNotification>
          callback) {
    this.register("v1.financial_connections.account.refreshed_ownership", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountRefreshedTransactions(
      EventNotificationCallback<V1FinancialConnectionsAccountRefreshedTransactionsEventNotification>
          callback) {
    this.register("v1.financial_connections.account.refreshed_transactions", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdated(
      EventNotificationCallback<
              V1FinancialConnectionsAccountSupportedPaymentMethodTypesUpdatedEventNotification>
          callback) {
    this.register(
        "v1.financial_connections.account.supported_payment_method_types_updated", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountUpcomingAccountNumberExpiry(
      EventNotificationCallback<
              V1FinancialConnectionsAccountUpcomingAccountNumberExpiryEventNotification>
          callback) {
    this.register("v1.financial_connections.account.upcoming_account_number_expiry", callback);
    return self();
  }

  public T onV1FinancialConnectionsAccountUpcomingDeactivation(
      EventNotificationCallback<V1FinancialConnectionsAccountUpcomingDeactivationEventNotification>
          callback) {
    this.register("v1.financial_connections.account.upcoming_deactivation", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionCanceled(
      EventNotificationCallback<V1IdentityVerificationSessionCanceledEventNotification> callback) {
    this.register("v1.identity.verification_session.canceled", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionCreated(
      EventNotificationCallback<V1IdentityVerificationSessionCreatedEventNotification> callback) {
    this.register("v1.identity.verification_session.created", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionProcessing(
      EventNotificationCallback<V1IdentityVerificationSessionProcessingEventNotification>
          callback) {
    this.register("v1.identity.verification_session.processing", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionRedacted(
      EventNotificationCallback<V1IdentityVerificationSessionRedactedEventNotification> callback) {
    this.register("v1.identity.verification_session.redacted", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionRequiresInput(
      EventNotificationCallback<V1IdentityVerificationSessionRequiresInputEventNotification>
          callback) {
    this.register("v1.identity.verification_session.requires_input", callback);
    return self();
  }

  public T onV1IdentityVerificationSessionVerified(
      EventNotificationCallback<V1IdentityVerificationSessionVerifiedEventNotification> callback) {
    this.register("v1.identity.verification_session.verified", callback);
    return self();
  }

  public T onV1InvoiceCreated(
      EventNotificationCallback<V1InvoiceCreatedEventNotification> callback) {
    this.register("v1.invoice.created", callback);
    return self();
  }

  public T onV1InvoiceDeleted(
      EventNotificationCallback<V1InvoiceDeletedEventNotification> callback) {
    this.register("v1.invoice.deleted", callback);
    return self();
  }

  public T onV1InvoiceFinalizationFailed(
      EventNotificationCallback<V1InvoiceFinalizationFailedEventNotification> callback) {
    this.register("v1.invoice.finalization_failed", callback);
    return self();
  }

  public T onV1InvoiceFinalized(
      EventNotificationCallback<V1InvoiceFinalizedEventNotification> callback) {
    this.register("v1.invoice.finalized", callback);
    return self();
  }

  public T onV1InvoiceMarkedUncollectible(
      EventNotificationCallback<V1InvoiceMarkedUncollectibleEventNotification> callback) {
    this.register("v1.invoice.marked_uncollectible", callback);
    return self();
  }

  public T onV1InvoiceOverdue(
      EventNotificationCallback<V1InvoiceOverdueEventNotification> callback) {
    this.register("v1.invoice.overdue", callback);
    return self();
  }

  public T onV1InvoiceOverpaid(
      EventNotificationCallback<V1InvoiceOverpaidEventNotification> callback) {
    this.register("v1.invoice.overpaid", callback);
    return self();
  }

  public T onV1InvoicePaid(EventNotificationCallback<V1InvoicePaidEventNotification> callback) {
    this.register("v1.invoice.paid", callback);
    return self();
  }

  public T onV1InvoicePaymentActionRequired(
      EventNotificationCallback<V1InvoicePaymentActionRequiredEventNotification> callback) {
    this.register("v1.invoice.payment_action_required", callback);
    return self();
  }

  public T onV1InvoicePaymentAttemptRequired(
      EventNotificationCallback<V1InvoicePaymentAttemptRequiredEventNotification> callback) {
    this.register("v1.invoice.payment_attempt_required", callback);
    return self();
  }

  public T onV1InvoicePaymentFailed(
      EventNotificationCallback<V1InvoicePaymentFailedEventNotification> callback) {
    this.register("v1.invoice.payment_failed", callback);
    return self();
  }

  public T onV1InvoicePaymentSucceeded(
      EventNotificationCallback<V1InvoicePaymentSucceededEventNotification> callback) {
    this.register("v1.invoice.payment_succeeded", callback);
    return self();
  }

  public T onV1InvoiceSent(EventNotificationCallback<V1InvoiceSentEventNotification> callback) {
    this.register("v1.invoice.sent", callback);
    return self();
  }

  public T onV1InvoiceUpcoming(
      EventNotificationCallback<V1InvoiceUpcomingEventNotification> callback) {
    this.register("v1.invoice.upcoming", callback);
    return self();
  }

  public T onV1InvoiceUpdated(
      EventNotificationCallback<V1InvoiceUpdatedEventNotification> callback) {
    this.register("v1.invoice.updated", callback);
    return self();
  }

  public T onV1InvoiceVoided(EventNotificationCallback<V1InvoiceVoidedEventNotification> callback) {
    this.register("v1.invoice.voided", callback);
    return self();
  }

  public T onV1InvoiceWillBeDue(
      EventNotificationCallback<V1InvoiceWillBeDueEventNotification> callback) {
    this.register("v1.invoice.will_be_due", callback);
    return self();
  }

  public T onV1InvoicePaymentPaid(
      EventNotificationCallback<V1InvoicePaymentPaidEventNotification> callback) {
    this.register("v1.invoice_payment.paid", callback);
    return self();
  }

  public T onV1InvoiceitemCreated(
      EventNotificationCallback<V1InvoiceitemCreatedEventNotification> callback) {
    this.register("v1.invoiceitem.created", callback);
    return self();
  }

  public T onV1InvoiceitemDeleted(
      EventNotificationCallback<V1InvoiceitemDeletedEventNotification> callback) {
    this.register("v1.invoiceitem.deleted", callback);
    return self();
  }

  public T onV1IssuingAuthorizationCreated(
      EventNotificationCallback<V1IssuingAuthorizationCreatedEventNotification> callback) {
    this.register("v1.issuing_authorization.created", callback);
    return self();
  }

  public T onV1IssuingAuthorizationRequest(
      EventNotificationCallback<V1IssuingAuthorizationRequestEventNotification> callback) {
    this.register("v1.issuing_authorization.request", callback);
    return self();
  }

  public T onV1IssuingAuthorizationUpdated(
      EventNotificationCallback<V1IssuingAuthorizationUpdatedEventNotification> callback) {
    this.register("v1.issuing_authorization.updated", callback);
    return self();
  }

  public T onV1IssuingCardCreated(
      EventNotificationCallback<V1IssuingCardCreatedEventNotification> callback) {
    this.register("v1.issuing_card.created", callback);
    return self();
  }

  public T onV1IssuingCardUpdated(
      EventNotificationCallback<V1IssuingCardUpdatedEventNotification> callback) {
    this.register("v1.issuing_card.updated", callback);
    return self();
  }

  public T onV1IssuingCardholderCreated(
      EventNotificationCallback<V1IssuingCardholderCreatedEventNotification> callback) {
    this.register("v1.issuing_cardholder.created", callback);
    return self();
  }

  public T onV1IssuingCardholderUpdated(
      EventNotificationCallback<V1IssuingCardholderUpdatedEventNotification> callback) {
    this.register("v1.issuing_cardholder.updated", callback);
    return self();
  }

  public T onV1IssuingDisputeClosed(
      EventNotificationCallback<V1IssuingDisputeClosedEventNotification> callback) {
    this.register("v1.issuing_dispute.closed", callback);
    return self();
  }

  public T onV1IssuingDisputeCreated(
      EventNotificationCallback<V1IssuingDisputeCreatedEventNotification> callback) {
    this.register("v1.issuing_dispute.created", callback);
    return self();
  }

  public T onV1IssuingDisputeFundsReinstated(
      EventNotificationCallback<V1IssuingDisputeFundsReinstatedEventNotification> callback) {
    this.register("v1.issuing_dispute.funds_reinstated", callback);
    return self();
  }

  public T onV1IssuingDisputeFundsRescinded(
      EventNotificationCallback<V1IssuingDisputeFundsRescindedEventNotification> callback) {
    this.register("v1.issuing_dispute.funds_rescinded", callback);
    return self();
  }

  public T onV1IssuingDisputeSubmitted(
      EventNotificationCallback<V1IssuingDisputeSubmittedEventNotification> callback) {
    this.register("v1.issuing_dispute.submitted", callback);
    return self();
  }

  public T onV1IssuingDisputeUpdated(
      EventNotificationCallback<V1IssuingDisputeUpdatedEventNotification> callback) {
    this.register("v1.issuing_dispute.updated", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignActivated(
      EventNotificationCallback<V1IssuingPersonalizationDesignActivatedEventNotification>
          callback) {
    this.register("v1.issuing_personalization_design.activated", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignDeactivated(
      EventNotificationCallback<V1IssuingPersonalizationDesignDeactivatedEventNotification>
          callback) {
    this.register("v1.issuing_personalization_design.deactivated", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignRejected(
      EventNotificationCallback<V1IssuingPersonalizationDesignRejectedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.rejected", callback);
    return self();
  }

  public T onV1IssuingPersonalizationDesignUpdated(
      EventNotificationCallback<V1IssuingPersonalizationDesignUpdatedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.updated", callback);
    return self();
  }

  public T onV1IssuingTokenCreated(
      EventNotificationCallback<V1IssuingTokenCreatedEventNotification> callback) {
    this.register("v1.issuing_token.created", callback);
    return self();
  }

  public T onV1IssuingTokenUpdated(
      EventNotificationCallback<V1IssuingTokenUpdatedEventNotification> callback) {
    this.register("v1.issuing_token.updated", callback);
    return self();
  }

  public T onV1IssuingTransactionCreated(
      EventNotificationCallback<V1IssuingTransactionCreatedEventNotification> callback) {
    this.register("v1.issuing_transaction.created", callback);
    return self();
  }

  public T onV1IssuingTransactionPurchaseDetailsReceiptUpdated(
      EventNotificationCallback<V1IssuingTransactionPurchaseDetailsReceiptUpdatedEventNotification>
          callback) {
    this.register("v1.issuing_transaction.purchase_details_receipt_updated", callback);
    return self();
  }

  public T onV1IssuingTransactionUpdated(
      EventNotificationCallback<V1IssuingTransactionUpdatedEventNotification> callback) {
    this.register("v1.issuing_transaction.updated", callback);
    return self();
  }

  public T onV1MandateUpdated(
      EventNotificationCallback<V1MandateUpdatedEventNotification> callback) {
    this.register("v1.mandate.updated", callback);
    return self();
  }

  public T onV1PaymentIntentAmountCapturableUpdated(
      EventNotificationCallback<V1PaymentIntentAmountCapturableUpdatedEventNotification> callback) {
    this.register("v1.payment_intent.amount_capturable_updated", callback);
    return self();
  }

  public T onV1PaymentIntentCanceled(
      EventNotificationCallback<V1PaymentIntentCanceledEventNotification> callback) {
    this.register("v1.payment_intent.canceled", callback);
    return self();
  }

  public T onV1PaymentIntentCreated(
      EventNotificationCallback<V1PaymentIntentCreatedEventNotification> callback) {
    this.register("v1.payment_intent.created", callback);
    return self();
  }

  public T onV1PaymentIntentPartiallyFunded(
      EventNotificationCallback<V1PaymentIntentPartiallyFundedEventNotification> callback) {
    this.register("v1.payment_intent.partially_funded", callback);
    return self();
  }

  public T onV1PaymentIntentPaymentFailed(
      EventNotificationCallback<V1PaymentIntentPaymentFailedEventNotification> callback) {
    this.register("v1.payment_intent.payment_failed", callback);
    return self();
  }

  public T onV1PaymentIntentProcessing(
      EventNotificationCallback<V1PaymentIntentProcessingEventNotification> callback) {
    this.register("v1.payment_intent.processing", callback);
    return self();
  }

  public T onV1PaymentIntentRequiresAction(
      EventNotificationCallback<V1PaymentIntentRequiresActionEventNotification> callback) {
    this.register("v1.payment_intent.requires_action", callback);
    return self();
  }

  public T onV1PaymentIntentSucceeded(
      EventNotificationCallback<V1PaymentIntentSucceededEventNotification> callback) {
    this.register("v1.payment_intent.succeeded", callback);
    return self();
  }

  public T onV1PaymentLinkCreated(
      EventNotificationCallback<V1PaymentLinkCreatedEventNotification> callback) {
    this.register("v1.payment_link.created", callback);
    return self();
  }

  public T onV1PaymentLinkUpdated(
      EventNotificationCallback<V1PaymentLinkUpdatedEventNotification> callback) {
    this.register("v1.payment_link.updated", callback);
    return self();
  }

  public T onV1PaymentMethodAttached(
      EventNotificationCallback<V1PaymentMethodAttachedEventNotification> callback) {
    this.register("v1.payment_method.attached", callback);
    return self();
  }

  public T onV1PaymentMethodAutomaticallyUpdated(
      EventNotificationCallback<V1PaymentMethodAutomaticallyUpdatedEventNotification> callback) {
    this.register("v1.payment_method.automatically_updated", callback);
    return self();
  }

  public T onV1PaymentMethodDetached(
      EventNotificationCallback<V1PaymentMethodDetachedEventNotification> callback) {
    this.register("v1.payment_method.detached", callback);
    return self();
  }

  public T onV1PaymentMethodUpdated(
      EventNotificationCallback<V1PaymentMethodUpdatedEventNotification> callback) {
    this.register("v1.payment_method.updated", callback);
    return self();
  }

  public T onV1PayoutCanceled(
      EventNotificationCallback<V1PayoutCanceledEventNotification> callback) {
    this.register("v1.payout.canceled", callback);
    return self();
  }

  public T onV1PayoutCreated(EventNotificationCallback<V1PayoutCreatedEventNotification> callback) {
    this.register("v1.payout.created", callback);
    return self();
  }

  public T onV1PayoutFailed(EventNotificationCallback<V1PayoutFailedEventNotification> callback) {
    this.register("v1.payout.failed", callback);
    return self();
  }

  public T onV1PayoutPaid(EventNotificationCallback<V1PayoutPaidEventNotification> callback) {
    this.register("v1.payout.paid", callback);
    return self();
  }

  public T onV1PayoutReconciliationCompleted(
      EventNotificationCallback<V1PayoutReconciliationCompletedEventNotification> callback) {
    this.register("v1.payout.reconciliation_completed", callback);
    return self();
  }

  public T onV1PayoutUpdated(EventNotificationCallback<V1PayoutUpdatedEventNotification> callback) {
    this.register("v1.payout.updated", callback);
    return self();
  }

  public T onV1PersonCreated(EventNotificationCallback<V1PersonCreatedEventNotification> callback) {
    this.register("v1.person.created", callback);
    return self();
  }

  public T onV1PersonDeleted(EventNotificationCallback<V1PersonDeletedEventNotification> callback) {
    this.register("v1.person.deleted", callback);
    return self();
  }

  public T onV1PersonUpdated(EventNotificationCallback<V1PersonUpdatedEventNotification> callback) {
    this.register("v1.person.updated", callback);
    return self();
  }

  public T onV1PlanCreated(EventNotificationCallback<V1PlanCreatedEventNotification> callback) {
    this.register("v1.plan.created", callback);
    return self();
  }

  public T onV1PlanDeleted(EventNotificationCallback<V1PlanDeletedEventNotification> callback) {
    this.register("v1.plan.deleted", callback);
    return self();
  }

  public T onV1PlanUpdated(EventNotificationCallback<V1PlanUpdatedEventNotification> callback) {
    this.register("v1.plan.updated", callback);
    return self();
  }

  public T onV1PriceCreated(EventNotificationCallback<V1PriceCreatedEventNotification> callback) {
    this.register("v1.price.created", callback);
    return self();
  }

  public T onV1PriceDeleted(EventNotificationCallback<V1PriceDeletedEventNotification> callback) {
    this.register("v1.price.deleted", callback);
    return self();
  }

  public T onV1PriceUpdated(EventNotificationCallback<V1PriceUpdatedEventNotification> callback) {
    this.register("v1.price.updated", callback);
    return self();
  }

  public T onV1ProductCreated(
      EventNotificationCallback<V1ProductCreatedEventNotification> callback) {
    this.register("v1.product.created", callback);
    return self();
  }

  public T onV1ProductDeleted(
      EventNotificationCallback<V1ProductDeletedEventNotification> callback) {
    this.register("v1.product.deleted", callback);
    return self();
  }

  public T onV1ProductUpdated(
      EventNotificationCallback<V1ProductUpdatedEventNotification> callback) {
    this.register("v1.product.updated", callback);
    return self();
  }

  public T onV1PromotionCodeCreated(
      EventNotificationCallback<V1PromotionCodeCreatedEventNotification> callback) {
    this.register("v1.promotion_code.created", callback);
    return self();
  }

  public T onV1PromotionCodeUpdated(
      EventNotificationCallback<V1PromotionCodeUpdatedEventNotification> callback) {
    this.register("v1.promotion_code.updated", callback);
    return self();
  }

  public T onV1QuoteAccepted(EventNotificationCallback<V1QuoteAcceptedEventNotification> callback) {
    this.register("v1.quote.accepted", callback);
    return self();
  }

  public T onV1QuoteCanceled(EventNotificationCallback<V1QuoteCanceledEventNotification> callback) {
    this.register("v1.quote.canceled", callback);
    return self();
  }

  public T onV1QuoteCreated(EventNotificationCallback<V1QuoteCreatedEventNotification> callback) {
    this.register("v1.quote.created", callback);
    return self();
  }

  public T onV1QuoteFinalized(
      EventNotificationCallback<V1QuoteFinalizedEventNotification> callback) {
    this.register("v1.quote.finalized", callback);
    return self();
  }

  public T onV1RadarEarlyFraudWarningCreated(
      EventNotificationCallback<V1RadarEarlyFraudWarningCreatedEventNotification> callback) {
    this.register("v1.radar.early_fraud_warning.created", callback);
    return self();
  }

  public T onV1RadarEarlyFraudWarningUpdated(
      EventNotificationCallback<V1RadarEarlyFraudWarningUpdatedEventNotification> callback) {
    this.register("v1.radar.early_fraud_warning.updated", callback);
    return self();
  }

  public T onV1RefundCreated(EventNotificationCallback<V1RefundCreatedEventNotification> callback) {
    this.register("v1.refund.created", callback);
    return self();
  }

  public T onV1RefundFailed(EventNotificationCallback<V1RefundFailedEventNotification> callback) {
    this.register("v1.refund.failed", callback);
    return self();
  }

  public T onV1RefundUpdated(EventNotificationCallback<V1RefundUpdatedEventNotification> callback) {
    this.register("v1.refund.updated", callback);
    return self();
  }

  public T onV1ReviewClosed(EventNotificationCallback<V1ReviewClosedEventNotification> callback) {
    this.register("v1.review.closed", callback);
    return self();
  }

  public T onV1ReviewOpened(EventNotificationCallback<V1ReviewOpenedEventNotification> callback) {
    this.register("v1.review.opened", callback);
    return self();
  }

  public T onV1SetupIntentCanceled(
      EventNotificationCallback<V1SetupIntentCanceledEventNotification> callback) {
    this.register("v1.setup_intent.canceled", callback);
    return self();
  }

  public T onV1SetupIntentCreated(
      EventNotificationCallback<V1SetupIntentCreatedEventNotification> callback) {
    this.register("v1.setup_intent.created", callback);
    return self();
  }

  public T onV1SetupIntentRequiresAction(
      EventNotificationCallback<V1SetupIntentRequiresActionEventNotification> callback) {
    this.register("v1.setup_intent.requires_action", callback);
    return self();
  }

  public T onV1SetupIntentSetupFailed(
      EventNotificationCallback<V1SetupIntentSetupFailedEventNotification> callback) {
    this.register("v1.setup_intent.setup_failed", callback);
    return self();
  }

  public T onV1SetupIntentSucceeded(
      EventNotificationCallback<V1SetupIntentSucceededEventNotification> callback) {
    this.register("v1.setup_intent.succeeded", callback);
    return self();
  }

  public T onV1SigmaScheduledQueryRunCreated(
      EventNotificationCallback<V1SigmaScheduledQueryRunCreatedEventNotification> callback) {
    this.register("v1.sigma.scheduled_query_run.created", callback);
    return self();
  }

  public T onV1SourceCanceled(
      EventNotificationCallback<V1SourceCanceledEventNotification> callback) {
    this.register("v1.source.canceled", callback);
    return self();
  }

  public T onV1SourceChargeable(
      EventNotificationCallback<V1SourceChargeableEventNotification> callback) {
    this.register("v1.source.chargeable", callback);
    return self();
  }

  public T onV1SourceFailed(EventNotificationCallback<V1SourceFailedEventNotification> callback) {
    this.register("v1.source.failed", callback);
    return self();
  }

  public T onV1SourceRefundAttributesRequired(
      EventNotificationCallback<V1SourceRefundAttributesRequiredEventNotification> callback) {
    this.register("v1.source.refund_attributes_required", callback);
    return self();
  }

  public T onV1SubscriptionScheduleAborted(
      EventNotificationCallback<V1SubscriptionScheduleAbortedEventNotification> callback) {
    this.register("v1.subscription_schedule.aborted", callback);
    return self();
  }

  public T onV1SubscriptionScheduleCanceled(
      EventNotificationCallback<V1SubscriptionScheduleCanceledEventNotification> callback) {
    this.register("v1.subscription_schedule.canceled", callback);
    return self();
  }

  public T onV1SubscriptionScheduleCompleted(
      EventNotificationCallback<V1SubscriptionScheduleCompletedEventNotification> callback) {
    this.register("v1.subscription_schedule.completed", callback);
    return self();
  }

  public T onV1SubscriptionScheduleCreated(
      EventNotificationCallback<V1SubscriptionScheduleCreatedEventNotification> callback) {
    this.register("v1.subscription_schedule.created", callback);
    return self();
  }

  public T onV1SubscriptionScheduleExpiring(
      EventNotificationCallback<V1SubscriptionScheduleExpiringEventNotification> callback) {
    this.register("v1.subscription_schedule.expiring", callback);
    return self();
  }

  public T onV1SubscriptionScheduleReleased(
      EventNotificationCallback<V1SubscriptionScheduleReleasedEventNotification> callback) {
    this.register("v1.subscription_schedule.released", callback);
    return self();
  }

  public T onV1SubscriptionScheduleUpdated(
      EventNotificationCallback<V1SubscriptionScheduleUpdatedEventNotification> callback) {
    this.register("v1.subscription_schedule.updated", callback);
    return self();
  }

  public T onV1TaxSettingsUpdated(
      EventNotificationCallback<V1TaxSettingsUpdatedEventNotification> callback) {
    this.register("v1.tax.settings.updated", callback);
    return self();
  }

  public T onV1TaxRateCreated(
      EventNotificationCallback<V1TaxRateCreatedEventNotification> callback) {
    this.register("v1.tax_rate.created", callback);
    return self();
  }

  public T onV1TaxRateUpdated(
      EventNotificationCallback<V1TaxRateUpdatedEventNotification> callback) {
    this.register("v1.tax_rate.updated", callback);
    return self();
  }

  public T onV1TerminalReaderActionFailed(
      EventNotificationCallback<V1TerminalReaderActionFailedEventNotification> callback) {
    this.register("v1.terminal.reader.action_failed", callback);
    return self();
  }

  public T onV1TerminalReaderActionSucceeded(
      EventNotificationCallback<V1TerminalReaderActionSucceededEventNotification> callback) {
    this.register("v1.terminal.reader.action_succeeded", callback);
    return self();
  }

  public T onV1TerminalReaderActionUpdated(
      EventNotificationCallback<V1TerminalReaderActionUpdatedEventNotification> callback) {
    this.register("v1.terminal.reader.action_updated", callback);
    return self();
  }

  public T onV1TestHelpersTestClockAdvancing(
      EventNotificationCallback<V1TestHelpersTestClockAdvancingEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.advancing", callback);
    return self();
  }

  public T onV1TestHelpersTestClockCreated(
      EventNotificationCallback<V1TestHelpersTestClockCreatedEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.created", callback);
    return self();
  }

  public T onV1TestHelpersTestClockDeleted(
      EventNotificationCallback<V1TestHelpersTestClockDeletedEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.deleted", callback);
    return self();
  }

  public T onV1TestHelpersTestClockInternalFailure(
      EventNotificationCallback<V1TestHelpersTestClockInternalFailureEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.internal_failure", callback);
    return self();
  }

  public T onV1TestHelpersTestClockReady(
      EventNotificationCallback<V1TestHelpersTestClockReadyEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.ready", callback);
    return self();
  }

  public T onV1TopupCanceled(EventNotificationCallback<V1TopupCanceledEventNotification> callback) {
    this.register("v1.topup.canceled", callback);
    return self();
  }

  public T onV1TopupCreated(EventNotificationCallback<V1TopupCreatedEventNotification> callback) {
    this.register("v1.topup.created", callback);
    return self();
  }

  public T onV1TopupFailed(EventNotificationCallback<V1TopupFailedEventNotification> callback) {
    this.register("v1.topup.failed", callback);
    return self();
  }

  public T onV1TopupReversed(EventNotificationCallback<V1TopupReversedEventNotification> callback) {
    this.register("v1.topup.reversed", callback);
    return self();
  }

  public T onV1TopupSucceeded(
      EventNotificationCallback<V1TopupSucceededEventNotification> callback) {
    this.register("v1.topup.succeeded", callback);
    return self();
  }

  public T onV1TransferCreated(
      EventNotificationCallback<V1TransferCreatedEventNotification> callback) {
    this.register("v1.transfer.created", callback);
    return self();
  }

  public T onV1TransferReversed(
      EventNotificationCallback<V1TransferReversedEventNotification> callback) {
    this.register("v1.transfer.reversed", callback);
    return self();
  }

  public T onV1TransferUpdated(
      EventNotificationCallback<V1TransferUpdatedEventNotification> callback) {
    this.register("v1.transfer.updated", callback);
    return self();
  }

  public T onV2BillingCadenceBilled(
      EventNotificationCallback<V2BillingCadenceBilledEventNotification> callback) {
    this.register("v2.billing.cadence.billed", callback);
    return self();
  }

  public T onV2BillingCadenceCanceled(
      EventNotificationCallback<V2BillingCadenceCanceledEventNotification> callback) {
    this.register("v2.billing.cadence.canceled", callback);
    return self();
  }

  public T onV2BillingCadenceCreated(
      EventNotificationCallback<V2BillingCadenceCreatedEventNotification> callback) {
    this.register("v2.billing.cadence.created", callback);
    return self();
  }

  public T onV2BillingContractActivated(
      EventNotificationCallback<V2BillingContractActivatedEventNotification> callback) {
    this.register("v2.billing.contract.activated", callback);
    return self();
  }

  public T onV2BillingContractCanceled(
      EventNotificationCallback<V2BillingContractCanceledEventNotification> callback) {
    this.register("v2.billing.contract.canceled", callback);
    return self();
  }

  public T onV2BillingContractCreated(
      EventNotificationCallback<V2BillingContractCreatedEventNotification> callback) {
    this.register("v2.billing.contract.created", callback);
    return self();
  }

  public T onV2BillingContractEnded(
      EventNotificationCallback<V2BillingContractEndedEventNotification> callback) {
    this.register("v2.billing.contract.ended", callback);
    return self();
  }

  public T onV2BillingContractUpdated(
      EventNotificationCallback<V2BillingContractUpdatedEventNotification> callback) {
    this.register("v2.billing.contract.updated", callback);
    return self();
  }

  public T onV2BillingLicenseFeeCreated(
      EventNotificationCallback<V2BillingLicenseFeeCreatedEventNotification> callback) {
    this.register("v2.billing.license_fee.created", callback);
    return self();
  }

  public T onV2BillingLicenseFeeUpdated(
      EventNotificationCallback<V2BillingLicenseFeeUpdatedEventNotification> callback) {
    this.register("v2.billing.license_fee.updated", callback);
    return self();
  }

  public T onV2BillingLicenseFeeVersionCreated(
      EventNotificationCallback<V2BillingLicenseFeeVersionCreatedEventNotification> callback) {
    this.register("v2.billing.license_fee_version.created", callback);
    return self();
  }

  public T onV2BillingLicensedItemCreated(
      EventNotificationCallback<V2BillingLicensedItemCreatedEventNotification> callback) {
    this.register("v2.billing.licensed_item.created", callback);
    return self();
  }

  public T onV2BillingLicensedItemUpdated(
      EventNotificationCallback<V2BillingLicensedItemUpdatedEventNotification> callback) {
    this.register("v2.billing.licensed_item.updated", callback);
    return self();
  }

  public T onV2BillingMeteredItemCreated(
      EventNotificationCallback<V2BillingMeteredItemCreatedEventNotification> callback) {
    this.register("v2.billing.metered_item.created", callback);
    return self();
  }

  public T onV2BillingMeteredItemUpdated(
      EventNotificationCallback<V2BillingMeteredItemUpdatedEventNotification> callback) {
    this.register("v2.billing.metered_item.updated", callback);
    return self();
  }

  public T onV2BillingPricingPlanCreated(
      EventNotificationCallback<V2BillingPricingPlanCreatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan.created", callback);
    return self();
  }

  public T onV2BillingPricingPlanUpdated(
      EventNotificationCallback<V2BillingPricingPlanUpdatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan.updated", callback);
    return self();
  }

  public T onV2BillingPricingPlanComponentCreated(
      EventNotificationCallback<V2BillingPricingPlanComponentCreatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_component.created", callback);
    return self();
  }

  public T onV2BillingPricingPlanComponentUpdated(
      EventNotificationCallback<V2BillingPricingPlanComponentUpdatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_component.updated", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionCollectionAwaitingCustomerAction(
      EventNotificationCallback<
              V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEventNotification>
          callback) {
    this.register(
        "v2.billing.pricing_plan_subscription.collection_awaiting_customer_action", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionCollectionCurrent(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionCollectionCurrentEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_current", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionCollectionPastDue(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionCollectionPastDueEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_past_due", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionCollectionPaused(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionCollectionPausedEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_paused", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionCollectionUnpaid(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionCollectionUnpaidEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_unpaid", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionServicingActivated(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionServicingActivatedEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.servicing_activated", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionServicingCanceled(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionServicingCanceledEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.servicing_canceled", callback);
    return self();
  }

  public T onV2BillingPricingPlanSubscriptionServicingPaused(
      EventNotificationCallback<V2BillingPricingPlanSubscriptionServicingPausedEventNotification>
          callback) {
    this.register("v2.billing.pricing_plan_subscription.servicing_paused", callback);
    return self();
  }

  public T onV2BillingPricingPlanVersionCreated(
      EventNotificationCallback<V2BillingPricingPlanVersionCreatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_version.created", callback);
    return self();
  }

  public T onV2BillingRateCardCreated(
      EventNotificationCallback<V2BillingRateCardCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card.created", callback);
    return self();
  }

  public T onV2BillingRateCardUpdated(
      EventNotificationCallback<V2BillingRateCardUpdatedEventNotification> callback) {
    this.register("v2.billing.rate_card.updated", callback);
    return self();
  }

  public T onV2BillingRateCardCustomPricingUnitOverageRateCreated(
      EventNotificationCallback<
              V2BillingRateCardCustomPricingUnitOverageRateCreatedEventNotification>
          callback) {
    this.register("v2.billing.rate_card_custom_pricing_unit_overage_rate.created", callback);
    return self();
  }

  public T onV2BillingRateCardRateCreated(
      EventNotificationCallback<V2BillingRateCardRateCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card_rate.created", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionActivated(
      EventNotificationCallback<V2BillingRateCardSubscriptionActivatedEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.activated", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionCanceled(
      EventNotificationCallback<V2BillingRateCardSubscriptionCanceledEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.canceled", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionCollectionAwaitingCustomerAction(
      EventNotificationCallback<
              V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEventNotification>
          callback) {
    this.register(
        "v2.billing.rate_card_subscription.collection_awaiting_customer_action", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionCollectionCurrent(
      EventNotificationCallback<V2BillingRateCardSubscriptionCollectionCurrentEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.collection_current", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionCollectionPastDue(
      EventNotificationCallback<V2BillingRateCardSubscriptionCollectionPastDueEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.collection_past_due", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionCollectionPaused(
      EventNotificationCallback<V2BillingRateCardSubscriptionCollectionPausedEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.collection_paused", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionCollectionUnpaid(
      EventNotificationCallback<V2BillingRateCardSubscriptionCollectionUnpaidEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.collection_unpaid", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionServicingActivated(
      EventNotificationCallback<V2BillingRateCardSubscriptionServicingActivatedEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.servicing_activated", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionServicingCanceled(
      EventNotificationCallback<V2BillingRateCardSubscriptionServicingCanceledEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.servicing_canceled", callback);
    return self();
  }

  public T onV2BillingRateCardSubscriptionServicingPaused(
      EventNotificationCallback<V2BillingRateCardSubscriptionServicingPausedEventNotification>
          callback) {
    this.register("v2.billing.rate_card_subscription.servicing_paused", callback);
    return self();
  }

  public T onV2BillingRateCardVersionCreated(
      EventNotificationCallback<V2BillingRateCardVersionCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card_version.created", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsFailed(
      EventNotificationCallback<V2CommerceProductCatalogImportsFailedEventNotification> callback) {
    this.register("v2.commerce.product_catalog.imports.failed", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsProcessing(
      EventNotificationCallback<V2CommerceProductCatalogImportsProcessingEventNotification>
          callback) {
    this.register("v2.commerce.product_catalog.imports.processing", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsSucceeded(
      EventNotificationCallback<V2CommerceProductCatalogImportsSucceededEventNotification>
          callback) {
    this.register("v2.commerce.product_catalog.imports.succeeded", callback);
    return self();
  }

  public T onV2CommerceProductCatalogImportsSucceededWithErrors(
      EventNotificationCallback<V2CommerceProductCatalogImportsSucceededWithErrorsEventNotification>
          callback) {
    this.register("v2.commerce.product_catalog.imports.succeeded_with_errors", callback);
    return self();
  }

  public T onV2CoreAccountClosed(
      EventNotificationCallback<V2CoreAccountClosedEventNotification> callback) {
    this.register("v2.core.account.closed", callback);
    return self();
  }

  public T onV2CoreAccountCreated(
      EventNotificationCallback<V2CoreAccountCreatedEventNotification> callback) {
    this.register("v2.core.account.created", callback);
    return self();
  }

  public T onV2CoreAccountUpdated(
      EventNotificationCallback<V2CoreAccountUpdatedEventNotification> callback) {
    this.register("v2.core.account.updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register(
        "v2.core.account[configuration.card_creator].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationCardCreatorUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationCardCreatorUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.card_creator].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.customer].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationCustomerUpdated(
      EventNotificationCallback<V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.customer].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.merchant].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMerchantUpdated(
      EventNotificationCallback<V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.merchant].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register(
        "v2.core.account[configuration.money_manager].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationMoneyManagerUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.money_manager].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.recipient].capability_status_updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingConfigurationRecipientUpdated(
      EventNotificationCallback<
              V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[configuration.recipient].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingDefaultsUpdated(
      EventNotificationCallback<V2CoreAccountIncludingDefaultsUpdatedEventNotification> callback) {
    this.register("v2.core.account[defaults].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingFutureRequirementsUpdated(
      EventNotificationCallback<V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[future_requirements].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingIdentityUpdated(
      EventNotificationCallback<V2CoreAccountIncludingIdentityUpdatedEventNotification> callback) {
    this.register("v2.core.account[identity].updated", callback);
    return self();
  }

  public T onV2CoreAccountIncludingRequirementsUpdated(
      EventNotificationCallback<V2CoreAccountIncludingRequirementsUpdatedEventNotification>
          callback) {
    this.register("v2.core.account[requirements].updated", callback);
    return self();
  }

  public T onV2CoreAccountLinkReturned(
      EventNotificationCallback<V2CoreAccountLinkReturnedEventNotification> callback) {
    this.register("v2.core.account_link.returned", callback);
    return self();
  }

  public T onV2CoreAccountPersonCreated(
      EventNotificationCallback<V2CoreAccountPersonCreatedEventNotification> callback) {
    this.register("v2.core.account_person.created", callback);
    return self();
  }

  public T onV2CoreAccountPersonDeleted(
      EventNotificationCallback<V2CoreAccountPersonDeletedEventNotification> callback) {
    this.register("v2.core.account_person.deleted", callback);
    return self();
  }

  public T onV2CoreAccountPersonUpdated(
      EventNotificationCallback<V2CoreAccountPersonUpdatedEventNotification> callback) {
    this.register("v2.core.account_person.updated", callback);
    return self();
  }

  public T onV2CoreAccountSignalsFraudulentWebsiteReady(
      EventNotificationCallback<V2CoreAccountSignalsFraudulentWebsiteReadyEventNotification>
          callback) {
    this.register("v2.core.account_signals.fraudulent_website_ready", callback);
    return self();
  }

  public T onV2CoreApprovalRequestApproved(
      EventNotificationCallback<V2CoreApprovalRequestApprovedEventNotification> callback) {
    this.register("v2.core.approval_request.approved", callback);
    return self();
  }

  public T onV2CoreApprovalRequestCanceled(
      EventNotificationCallback<V2CoreApprovalRequestCanceledEventNotification> callback) {
    this.register("v2.core.approval_request.canceled", callback);
    return self();
  }

  public T onV2CoreApprovalRequestCreated(
      EventNotificationCallback<V2CoreApprovalRequestCreatedEventNotification> callback) {
    this.register("v2.core.approval_request.created", callback);
    return self();
  }

  public T onV2CoreApprovalRequestExpired(
      EventNotificationCallback<V2CoreApprovalRequestExpiredEventNotification> callback) {
    this.register("v2.core.approval_request.expired", callback);
    return self();
  }

  public T onV2CoreApprovalRequestFailed(
      EventNotificationCallback<V2CoreApprovalRequestFailedEventNotification> callback) {
    this.register("v2.core.approval_request.failed", callback);
    return self();
  }

  public T onV2CoreApprovalRequestRejected(
      EventNotificationCallback<V2CoreApprovalRequestRejectedEventNotification> callback) {
    this.register("v2.core.approval_request.rejected", callback);
    return self();
  }

  public T onV2CoreApprovalRequestSucceeded(
      EventNotificationCallback<V2CoreApprovalRequestSucceededEventNotification> callback) {
    this.register("v2.core.approval_request.succeeded", callback);
    return self();
  }

  public T onV2CoreBatchJobBatchFailed(
      EventNotificationCallback<V2CoreBatchJobBatchFailedEventNotification> callback) {
    this.register("v2.core.batch_job.batch_failed", callback);
    return self();
  }

  public T onV2CoreBatchJobCanceled(
      EventNotificationCallback<V2CoreBatchJobCanceledEventNotification> callback) {
    this.register("v2.core.batch_job.canceled", callback);
    return self();
  }

  public T onV2CoreBatchJobCompleted(
      EventNotificationCallback<V2CoreBatchJobCompletedEventNotification> callback) {
    this.register("v2.core.batch_job.completed", callback);
    return self();
  }

  public T onV2CoreBatchJobCreated(
      EventNotificationCallback<V2CoreBatchJobCreatedEventNotification> callback) {
    this.register("v2.core.batch_job.created", callback);
    return self();
  }

  public T onV2CoreBatchJobReadyForUpload(
      EventNotificationCallback<V2CoreBatchJobReadyForUploadEventNotification> callback) {
    this.register("v2.core.batch_job.ready_for_upload", callback);
    return self();
  }

  public T onV2CoreBatchJobTimeout(
      EventNotificationCallback<V2CoreBatchJobTimeoutEventNotification> callback) {
    this.register("v2.core.batch_job.timeout", callback);
    return self();
  }

  public T onV2CoreBatchJobUpdated(
      EventNotificationCallback<V2CoreBatchJobUpdatedEventNotification> callback) {
    this.register("v2.core.batch_job.updated", callback);
    return self();
  }

  public T onV2CoreBatchJobUploadTimeout(
      EventNotificationCallback<V2CoreBatchJobUploadTimeoutEventNotification> callback) {
    this.register("v2.core.batch_job.upload_timeout", callback);
    return self();
  }

  public T onV2CoreBatchJobValidating(
      EventNotificationCallback<V2CoreBatchJobValidatingEventNotification> callback) {
    this.register("v2.core.batch_job.validating", callback);
    return self();
  }

  public T onV2CoreBatchJobValidationFailed(
      EventNotificationCallback<V2CoreBatchJobValidationFailedEventNotification> callback) {
    this.register("v2.core.batch_job.validation_failed", callback);
    return self();
  }

  public T onV2CoreClaimableSandboxClaimed(
      EventNotificationCallback<V2CoreClaimableSandboxClaimedEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.claimed", callback);
    return self();
  }

  public T onV2CoreClaimableSandboxCreated(
      EventNotificationCallback<V2CoreClaimableSandboxCreatedEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.created", callback);
    return self();
  }

  public T onV2CoreClaimableSandboxExpired(
      EventNotificationCallback<V2CoreClaimableSandboxExpiredEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.expired", callback);
    return self();
  }

  public T onV2CoreClaimableSandboxExpiring(
      EventNotificationCallback<V2CoreClaimableSandboxExpiringEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.expiring", callback);
    return self();
  }

  public T onV2CoreClaimableSandboxUpdated(
      EventNotificationCallback<V2CoreClaimableSandboxUpdatedEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.updated", callback);
    return self();
  }

  public T onV2CoreEventDestinationPing(
      EventNotificationCallback<V2CoreEventDestinationPingEventNotification> callback) {
    this.register("v2.core.event_destination.ping", callback);
    return self();
  }

  public T onV2CoreHealthApiErrorFiring(
      EventNotificationCallback<V2CoreHealthApiErrorFiringEventNotification> callback) {
    this.register("v2.core.health.api_error.firing", callback);
    return self();
  }

  public T onV2CoreHealthApiErrorResolved(
      EventNotificationCallback<V2CoreHealthApiErrorResolvedEventNotification> callback) {
    this.register("v2.core.health.api_error.resolved", callback);
    return self();
  }

  public T onV2CoreHealthApiLatencyFiring(
      EventNotificationCallback<V2CoreHealthApiLatencyFiringEventNotification> callback) {
    this.register("v2.core.health.api_latency.firing", callback);
    return self();
  }

  public T onV2CoreHealthApiLatencyResolved(
      EventNotificationCallback<V2CoreHealthApiLatencyResolvedEventNotification> callback) {
    this.register("v2.core.health.api_latency.resolved", callback);
    return self();
  }

  public T onV2CoreHealthAuthorizationRateDropFiring(
      EventNotificationCallback<V2CoreHealthAuthorizationRateDropFiringEventNotification>
          callback) {
    this.register("v2.core.health.authorization_rate_drop.firing", callback);
    return self();
  }

  public T onV2CoreHealthAuthorizationRateDropResolved(
      EventNotificationCallback<V2CoreHealthAuthorizationRateDropResolvedEventNotification>
          callback) {
    this.register("v2.core.health.authorization_rate_drop.resolved", callback);
    return self();
  }

  public T onV2CoreHealthElementsErrorFiring(
      EventNotificationCallback<V2CoreHealthElementsErrorFiringEventNotification> callback) {
    this.register("v2.core.health.elements_error.firing", callback);
    return self();
  }

  public T onV2CoreHealthElementsErrorResolved(
      EventNotificationCallback<V2CoreHealthElementsErrorResolvedEventNotification> callback) {
    this.register("v2.core.health.elements_error.resolved", callback);
    return self();
  }

  public T onV2CoreHealthEventGenerationFailureResolved(
      EventNotificationCallback<V2CoreHealthEventGenerationFailureResolvedEventNotification>
          callback) {
    this.register("v2.core.health.event_generation_failure.resolved", callback);
    return self();
  }

  public T onV2CoreHealthFraudRateIncreased(
      EventNotificationCallback<V2CoreHealthFraudRateIncreasedEventNotification> callback) {
    this.register("v2.core.health.fraud_rate.increased", callback);
    return self();
  }

  public T onV2CoreHealthInvoiceCountDroppedFiring(
      EventNotificationCallback<V2CoreHealthInvoiceCountDroppedFiringEventNotification> callback) {
    this.register("v2.core.health.invoice_count_dropped.firing", callback);
    return self();
  }

  public T onV2CoreHealthInvoiceCountDroppedResolved(
      EventNotificationCallback<V2CoreHealthInvoiceCountDroppedResolvedEventNotification>
          callback) {
    this.register("v2.core.health.invoice_count_dropped.resolved", callback);
    return self();
  }

  public T onV2CoreHealthIssuingAuthorizationRequestErrorsFiring(
      EventNotificationCallback<
              V2CoreHealthIssuingAuthorizationRequestErrorsFiringEventNotification>
          callback) {
    this.register("v2.core.health.issuing_authorization_request_errors.firing", callback);
    return self();
  }

  public T onV2CoreHealthIssuingAuthorizationRequestErrorsResolved(
      EventNotificationCallback<
              V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEventNotification>
          callback) {
    this.register("v2.core.health.issuing_authorization_request_errors.resolved", callback);
    return self();
  }

  public T onV2CoreHealthIssuingAuthorizationRequestTimeoutFiring(
      EventNotificationCallback<
              V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEventNotification>
          callback) {
    this.register("v2.core.health.issuing_authorization_request_timeout.firing", callback);
    return self();
  }

  public T onV2CoreHealthIssuingAuthorizationRequestTimeoutResolved(
      EventNotificationCallback<
              V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEventNotification>
          callback) {
    this.register("v2.core.health.issuing_authorization_request_timeout.resolved", callback);
    return self();
  }

  public T onV2CoreHealthMeterEventSummariesDelayedFiring(
      EventNotificationCallback<V2CoreHealthMeterEventSummariesDelayedFiringEventNotification>
          callback) {
    this.register("v2.core.health.meter_event_summaries_delayed.firing", callback);
    return self();
  }

  public T onV2CoreHealthMeterEventSummariesDelayedResolved(
      EventNotificationCallback<V2CoreHealthMeterEventSummariesDelayedResolvedEventNotification>
          callback) {
    this.register("v2.core.health.meter_event_summaries_delayed.resolved", callback);
    return self();
  }

  public T onV2CoreHealthMetronomeNotificationLatencyFiring(
      EventNotificationCallback<V2CoreHealthMetronomeNotificationLatencyFiringEventNotification>
          callback) {
    this.register("v2.core.health.metronome_notification_latency.firing", callback);
    return self();
  }

  public T onV2CoreHealthMetronomeNotificationLatencyResolved(
      EventNotificationCallback<V2CoreHealthMetronomeNotificationLatencyResolvedEventNotification>
          callback) {
    this.register("v2.core.health.metronome_notification_latency.resolved", callback);
    return self();
  }

  public T onV2CoreHealthPaymentMethodErrorFiring(
      EventNotificationCallback<V2CoreHealthPaymentMethodErrorFiringEventNotification> callback) {
    this.register("v2.core.health.payment_method_error.firing", callback);
    return self();
  }

  public T onV2CoreHealthPaymentMethodErrorResolved(
      EventNotificationCallback<V2CoreHealthPaymentMethodErrorResolvedEventNotification> callback) {
    this.register("v2.core.health.payment_method_error.resolved", callback);
    return self();
  }

  public T onV2CoreHealthSepaDebitDelayedFiring(
      EventNotificationCallback<V2CoreHealthSepaDebitDelayedFiringEventNotification> callback) {
    this.register("v2.core.health.sepa_debit_delayed.firing", callback);
    return self();
  }

  public T onV2CoreHealthSepaDebitDelayedResolved(
      EventNotificationCallback<V2CoreHealthSepaDebitDelayedResolvedEventNotification> callback) {
    this.register("v2.core.health.sepa_debit_delayed.resolved", callback);
    return self();
  }

  public T onV2CoreHealthTrafficVolumeDropFiring(
      EventNotificationCallback<V2CoreHealthTrafficVolumeDropFiringEventNotification> callback) {
    this.register("v2.core.health.traffic_volume_drop.firing", callback);
    return self();
  }

  public T onV2CoreHealthTrafficVolumeDropResolved(
      EventNotificationCallback<V2CoreHealthTrafficVolumeDropResolvedEventNotification> callback) {
    this.register("v2.core.health.traffic_volume_drop.resolved", callback);
    return self();
  }

  public T onV2CoreHealthWebhookLatencyFiring(
      EventNotificationCallback<V2CoreHealthWebhookLatencyFiringEventNotification> callback) {
    this.register("v2.core.health.webhook_latency.firing", callback);
    return self();
  }

  public T onV2CoreHealthWebhookLatencyResolved(
      EventNotificationCallback<V2CoreHealthWebhookLatencyResolvedEventNotification> callback) {
    this.register("v2.core.health.webhook_latency.resolved", callback);
    return self();
  }

  public T onV2DataReportingQueryRunCreated(
      EventNotificationCallback<V2DataReportingQueryRunCreatedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.created", callback);
    return self();
  }

  public T onV2DataReportingQueryRunFailed(
      EventNotificationCallback<V2DataReportingQueryRunFailedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.failed", callback);
    return self();
  }

  public T onV2DataReportingQueryRunSucceeded(
      EventNotificationCallback<V2DataReportingQueryRunSucceededEventNotification> callback) {
    this.register("v2.data.reporting.query_run.succeeded", callback);
    return self();
  }

  public T onV2DataReportingQueryRunUpdated(
      EventNotificationCallback<V2DataReportingQueryRunUpdatedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.updated", callback);
    return self();
  }

  public T onV2ExtendExtensionRunFailed(
      EventNotificationCallback<V2ExtendExtensionRunFailedEventNotification> callback) {
    this.register("v2.extend.extension_run.failed", callback);
    return self();
  }

  public T onV2ExtendWorkflowRunFailed(
      EventNotificationCallback<V2ExtendWorkflowRunFailedEventNotification> callback) {
    this.register("v2.extend.workflow_run.failed", callback);
    return self();
  }

  public T onV2ExtendWorkflowRunStarted(
      EventNotificationCallback<V2ExtendWorkflowRunStartedEventNotification> callback) {
    this.register("v2.extend.workflow_run.started", callback);
    return self();
  }

  public T onV2ExtendWorkflowRunSucceeded(
      EventNotificationCallback<V2ExtendWorkflowRunSucceededEventNotification> callback) {
    this.register("v2.extend.workflow_run.succeeded", callback);
    return self();
  }

  public T onV2IamApiKeyCreated(
      EventNotificationCallback<V2IamApiKeyCreatedEventNotification> callback) {
    this.register("v2.iam.api_key.created", callback);
    return self();
  }

  public T onV2IamApiKeyDefaultSecretRevealed(
      EventNotificationCallback<V2IamApiKeyDefaultSecretRevealedEventNotification> callback) {
    this.register("v2.iam.api_key.default_secret_revealed", callback);
    return self();
  }

  public T onV2IamApiKeyExpired(
      EventNotificationCallback<V2IamApiKeyExpiredEventNotification> callback) {
    this.register("v2.iam.api_key.expired", callback);
    return self();
  }

  public T onV2IamApiKeyPermissionsUpdated(
      EventNotificationCallback<V2IamApiKeyPermissionsUpdatedEventNotification> callback) {
    this.register("v2.iam.api_key.permissions_updated", callback);
    return self();
  }

  public T onV2IamApiKeyRotated(
      EventNotificationCallback<V2IamApiKeyRotatedEventNotification> callback) {
    this.register("v2.iam.api_key.rotated", callback);
    return self();
  }

  public T onV2IamApiKeyUpdated(
      EventNotificationCallback<V2IamApiKeyUpdatedEventNotification> callback) {
    this.register("v2.iam.api_key.updated", callback);
    return self();
  }

  public T onV2IamStripeAccessGrantApproved(
      EventNotificationCallback<V2IamStripeAccessGrantApprovedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.approved", callback);
    return self();
  }

  public T onV2IamStripeAccessGrantCanceled(
      EventNotificationCallback<V2IamStripeAccessGrantCanceledEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.canceled", callback);
    return self();
  }

  public T onV2IamStripeAccessGrantDenied(
      EventNotificationCallback<V2IamStripeAccessGrantDeniedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.denied", callback);
    return self();
  }

  public T onV2IamStripeAccessGrantRemoved(
      EventNotificationCallback<V2IamStripeAccessGrantRemovedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.removed", callback);
    return self();
  }

  public T onV2IamStripeAccessGrantRequested(
      EventNotificationCallback<V2IamStripeAccessGrantRequestedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.requested", callback);
    return self();
  }

  public T onV2IamStripeAccessGrantUpdated(
      EventNotificationCallback<V2IamStripeAccessGrantUpdatedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.updated", callback);
    return self();
  }

  public T onV2MoneyManagementAdjustmentCreated(
      EventNotificationCallback<V2MoneyManagementAdjustmentCreatedEventNotification> callback) {
    this.register("v2.money_management.adjustment.created", callback);
    return self();
  }

  public T onV2MoneyManagementDebitDisputeFailed(
      EventNotificationCallback<V2MoneyManagementDebitDisputeFailedEventNotification> callback) {
    this.register("v2.money_management.debit_dispute.failed", callback);
    return self();
  }

  public T onV2MoneyManagementDebitDisputeSubmitted(
      EventNotificationCallback<V2MoneyManagementDebitDisputeSubmittedEventNotification> callback) {
    this.register("v2.money_management.debit_dispute.submitted", callback);
    return self();
  }

  public T onV2MoneyManagementDebitDisputeSucceeded(
      EventNotificationCallback<V2MoneyManagementDebitDisputeSucceededEventNotification> callback) {
    this.register("v2.money_management.debit_dispute.succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAccountCreated(
      EventNotificationCallback<V2MoneyManagementFinancialAccountCreatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_account.created", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAccountUpdated(
      EventNotificationCallback<V2MoneyManagementFinancialAccountUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_account.updated", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAccountStatementCreated(
      EventNotificationCallback<V2MoneyManagementFinancialAccountStatementCreatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_account_statement.created", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAccountStatementRestated(
      EventNotificationCallback<V2MoneyManagementFinancialAccountStatementRestatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_account_statement.restated", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAddressActivated(
      EventNotificationCallback<V2MoneyManagementFinancialAddressActivatedEventNotification>
          callback) {
    this.register("v2.money_management.financial_address.activated", callback);
    return self();
  }

  public T onV2MoneyManagementFinancialAddressFailed(
      EventNotificationCallback<V2MoneyManagementFinancialAddressFailedEventNotification>
          callback) {
    this.register("v2.money_management.financial_address.failed", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferAvailable(
      EventNotificationCallback<V2MoneyManagementInboundTransferAvailableEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.available", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitFailed(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitFailedEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_failed", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitProcessing(
      EventNotificationCallback<
              V2MoneyManagementInboundTransferBankDebitProcessingEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_processing", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitQueued(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitQueuedEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_queued", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitReturned(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitReturnedEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_returned", callback);
    return self();
  }

  public T onV2MoneyManagementInboundTransferBankDebitSucceeded(
      EventNotificationCallback<V2MoneyManagementInboundTransferBankDebitSucceededEventNotification>
          callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentCanceled(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentCanceledEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentCreated(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentCreatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.created", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentFailed(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentFailedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.failed", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentPosted(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentPostedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.posted", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentReturned(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentReturnedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.returned", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentUnderReview(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentUnderReviewEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.under_review", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundPaymentUpdated(
      EventNotificationCallback<V2MoneyManagementOutboundPaymentUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_payment.updated", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferCanceled(
      EventNotificationCallback<V2MoneyManagementOutboundTransferCanceledEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferCreated(
      EventNotificationCallback<V2MoneyManagementOutboundTransferCreatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.created", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferFailed(
      EventNotificationCallback<V2MoneyManagementOutboundTransferFailedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.failed", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferPosted(
      EventNotificationCallback<V2MoneyManagementOutboundTransferPostedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.posted", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferReturned(
      EventNotificationCallback<V2MoneyManagementOutboundTransferReturnedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.returned", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferUnderReview(
      EventNotificationCallback<V2MoneyManagementOutboundTransferUnderReviewEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.under_review", callback);
    return self();
  }

  public T onV2MoneyManagementOutboundTransferUpdated(
      EventNotificationCallback<V2MoneyManagementOutboundTransferUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.outbound_transfer.updated", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutIntentCanceled(
      EventNotificationCallback<V2MoneyManagementPayoutIntentCanceledEventNotification> callback) {
    this.register("v2.money_management.payout_intent.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutIntentCreated(
      EventNotificationCallback<V2MoneyManagementPayoutIntentCreatedEventNotification> callback) {
    this.register("v2.money_management.payout_intent.created", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutIntentPosted(
      EventNotificationCallback<V2MoneyManagementPayoutIntentPostedEventNotification> callback) {
    this.register("v2.money_management.payout_intent.posted", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutIntentProcessing(
      EventNotificationCallback<V2MoneyManagementPayoutIntentProcessingEventNotification>
          callback) {
    this.register("v2.money_management.payout_intent.processing", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutIntentRequiresAction(
      EventNotificationCallback<V2MoneyManagementPayoutIntentRequiresActionEventNotification>
          callback) {
    this.register("v2.money_management.payout_intent.requires_action", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutMethodCreated(
      EventNotificationCallback<V2MoneyManagementPayoutMethodCreatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.created", callback);
    return self();
  }

  public T onV2MoneyManagementPayoutMethodUpdated(
      EventNotificationCallback<V2MoneyManagementPayoutMethodUpdatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.updated", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditAvailable(
      EventNotificationCallback<V2MoneyManagementReceivedCreditAvailableEventNotification>
          callback) {
    this.register("v2.money_management.received_credit.available", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditFailed(
      EventNotificationCallback<V2MoneyManagementReceivedCreditFailedEventNotification> callback) {
    this.register("v2.money_management.received_credit.failed", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditReturned(
      EventNotificationCallback<V2MoneyManagementReceivedCreditReturnedEventNotification>
          callback) {
    this.register("v2.money_management.received_credit.returned", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedCreditSucceeded(
      EventNotificationCallback<V2MoneyManagementReceivedCreditSucceededEventNotification>
          callback) {
    this.register("v2.money_management.received_credit.succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitCanceled(
      EventNotificationCallback<V2MoneyManagementReceivedDebitCanceledEventNotification> callback) {
    this.register("v2.money_management.received_debit.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitCreated(
      EventNotificationCallback<V2MoneyManagementReceivedDebitCreatedEventNotification> callback) {
    this.register("v2.money_management.received_debit.created", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitFailed(
      EventNotificationCallback<V2MoneyManagementReceivedDebitFailedEventNotification> callback) {
    this.register("v2.money_management.received_debit.failed", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitPending(
      EventNotificationCallback<V2MoneyManagementReceivedDebitPendingEventNotification> callback) {
    this.register("v2.money_management.received_debit.pending", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitScheduled(
      EventNotificationCallback<V2MoneyManagementReceivedDebitScheduledEventNotification>
          callback) {
    this.register("v2.money_management.received_debit.scheduled", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitSucceeded(
      EventNotificationCallback<V2MoneyManagementReceivedDebitSucceededEventNotification>
          callback) {
    this.register("v2.money_management.received_debit.succeeded", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitUpdated(
      EventNotificationCallback<V2MoneyManagementReceivedDebitUpdatedEventNotification> callback) {
    this.register("v2.money_management.received_debit.updated", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitMandateCanceled(
      EventNotificationCallback<V2MoneyManagementReceivedDebitMandateCanceledEventNotification>
          callback) {
    this.register("v2.money_management.received_debit_mandate.canceled", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitMandateCreated(
      EventNotificationCallback<V2MoneyManagementReceivedDebitMandateCreatedEventNotification>
          callback) {
    this.register("v2.money_management.received_debit_mandate.created", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitMandateExpired(
      EventNotificationCallback<V2MoneyManagementReceivedDebitMandateExpiredEventNotification>
          callback) {
    this.register("v2.money_management.received_debit_mandate.expired", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitMandatePendingCancellation(
      EventNotificationCallback<
              V2MoneyManagementReceivedDebitMandatePendingCancellationEventNotification>
          callback) {
    this.register("v2.money_management.received_debit_mandate.pending_cancellation", callback);
    return self();
  }

  public T onV2MoneyManagementReceivedDebitMandateUpdated(
      EventNotificationCallback<V2MoneyManagementReceivedDebitMandateUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.received_debit_mandate.updated", callback);
    return self();
  }

  public T onV2MoneyManagementRecipientVerificationCreated(
      EventNotificationCallback<V2MoneyManagementRecipientVerificationCreatedEventNotification>
          callback) {
    this.register("v2.money_management.recipient_verification.created", callback);
    return self();
  }

  public T onV2MoneyManagementRecipientVerificationUpdated(
      EventNotificationCallback<V2MoneyManagementRecipientVerificationUpdatedEventNotification>
          callback) {
    this.register("v2.money_management.recipient_verification.updated", callback);
    return self();
  }

  public T onV2MoneyManagementTransactionCreated(
      EventNotificationCallback<V2MoneyManagementTransactionCreatedEventNotification> callback) {
    this.register("v2.money_management.transaction.created", callback);
    return self();
  }

  public T onV2MoneyManagementTransactionUpdated(
      EventNotificationCallback<V2MoneyManagementTransactionUpdatedEventNotification> callback) {
    this.register("v2.money_management.transaction.updated", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementConfirmed(
      EventNotificationCallback<V2OrchestratedCommerceAgreementConfirmedEventNotification>
          callback) {
    this.register("v2.orchestrated_commerce.agreement.confirmed", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementCreated(
      EventNotificationCallback<V2OrchestratedCommerceAgreementCreatedEventNotification> callback) {
    this.register("v2.orchestrated_commerce.agreement.created", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementPartiallyConfirmed(
      EventNotificationCallback<V2OrchestratedCommerceAgreementPartiallyConfirmedEventNotification>
          callback) {
    this.register("v2.orchestrated_commerce.agreement.partially_confirmed", callback);
    return self();
  }

  public T onV2OrchestratedCommerceAgreementTerminated(
      EventNotificationCallback<V2OrchestratedCommerceAgreementTerminatedEventNotification>
          callback) {
    this.register("v2.orchestrated_commerce.agreement.terminated", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentAttemptFailed(
      EventNotificationCallback<V2PaymentsOffSessionPaymentAttemptFailedEventNotification>
          callback) {
    this.register("v2.payments.off_session_payment.attempt_failed", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentAttemptStarted(
      EventNotificationCallback<V2PaymentsOffSessionPaymentAttemptStartedEventNotification>
          callback) {
    this.register("v2.payments.off_session_payment.attempt_started", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentAuthorizationAttemptFailed(
      EventNotificationCallback<
              V2PaymentsOffSessionPaymentAuthorizationAttemptFailedEventNotification>
          callback) {
    this.register("v2.payments.off_session_payment.authorization_attempt_failed", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentAuthorizationAttemptStarted(
      EventNotificationCallback<
              V2PaymentsOffSessionPaymentAuthorizationAttemptStartedEventNotification>
          callback) {
    this.register("v2.payments.off_session_payment.authorization_attempt_started", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentCanceled(
      EventNotificationCallback<V2PaymentsOffSessionPaymentCanceledEventNotification> callback) {
    this.register("v2.payments.off_session_payment.canceled", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentCreated(
      EventNotificationCallback<V2PaymentsOffSessionPaymentCreatedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.created", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentFailed(
      EventNotificationCallback<V2PaymentsOffSessionPaymentFailedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.failed", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentPaused(
      EventNotificationCallback<V2PaymentsOffSessionPaymentPausedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.paused", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentRequiresCapture(
      EventNotificationCallback<V2PaymentsOffSessionPaymentRequiresCaptureEventNotification>
          callback) {
    this.register("v2.payments.off_session_payment.requires_capture", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentResumed(
      EventNotificationCallback<V2PaymentsOffSessionPaymentResumedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.resumed", callback);
    return self();
  }

  public T onV2PaymentsOffSessionPaymentSucceeded(
      EventNotificationCallback<V2PaymentsOffSessionPaymentSucceededEventNotification> callback) {
    this.register("v2.payments.off_session_payment.succeeded", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentCanceled(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentCanceledEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.canceled", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentCreated(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentCreatedEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.created", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentErrored(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentErroredEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.errored", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentFundsNotReceived(
      EventNotificationCallback<
              V2PaymentsSettlementAllocationIntentFundsNotReceivedEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.funds_not_received", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentMatched(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentMatchedEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.matched", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentNotFound(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentNotFoundEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.not_found", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentSettled(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentSettledEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.settled", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentSubmitted(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentSubmittedEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent.submitted", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentSplitCanceled(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentSplitCanceledEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent_split.canceled", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentSplitCreated(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentSplitCreatedEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent_split.created", callback);
    return self();
  }

  public T onV2PaymentsSettlementAllocationIntentSplitSettled(
      EventNotificationCallback<V2PaymentsSettlementAllocationIntentSplitSettledEventNotification>
          callback) {
    this.register("v2.payments.settlement_allocation_intent_split.settled", callback);
    return self();
  }

  public T onV2ReportingReportRunCreated(
      EventNotificationCallback<V2ReportingReportRunCreatedEventNotification> callback) {
    this.register("v2.reporting.report_run.created", callback);
    return self();
  }

  public T onV2ReportingReportRunFailed(
      EventNotificationCallback<V2ReportingReportRunFailedEventNotification> callback) {
    this.register("v2.reporting.report_run.failed", callback);
    return self();
  }

  public T onV2ReportingReportRunSucceeded(
      EventNotificationCallback<V2ReportingReportRunSucceededEventNotification> callback) {
    this.register("v2.reporting.report_run.succeeded", callback);
    return self();
  }

  public T onV2ReportingReportRunUpdated(
      EventNotificationCallback<V2ReportingReportRunUpdatedEventNotification> callback) {
    this.register("v2.reporting.report_run.updated", callback);
    return self();
  }

  public T onV2SignalsAccountEvaluationComplete(
      EventNotificationCallback<V2SignalsAccountEvaluationCompleteEventNotification> callback) {
    this.register("v2.signals.account_evaluation.complete", callback);
    return self();
  }

  public T onV2SignalsAccountSignalFraudulentMerchantReady(
      EventNotificationCallback<V2SignalsAccountSignalFraudulentMerchantReadyEventNotification>
          callback) {
    this.register("v2.signals.account_signal.fraudulent_merchant_ready", callback);
    return self();
  }

  public T onV2SignalsAccountSignalFraudulentWebsiteReady(
      EventNotificationCallback<V2SignalsAccountSignalFraudulentWebsiteReadyEventNotification>
          callback) {
    this.register("v2.signals.account_signal.fraudulent_website_ready", callback);
    return self();
  }

  public T onV2SignalsAccountSignalMerchantDelinquencyReady(
      EventNotificationCallback<V2SignalsAccountSignalMerchantDelinquencyReadyEventNotification>
          callback) {
    this.register("v2.signals.account_signal.merchant_delinquency_ready", callback);
    return self();
  }

  public T onV2SignalsAccountSignalPaymentDelinquencyExposureReady(
      EventNotificationCallback<
              V2SignalsAccountSignalPaymentDelinquencyExposureReadyEventNotification>
          callback) {
    this.register("v2.signals.account_signal.payment_delinquency_exposure_ready", callback);
    return self();
  }

  public T onV2SignalsPaymentRetryEvaluationsRetryRecommended(
      EventNotificationCallback<V2SignalsPaymentRetryEvaluationsRetryRecommendedEventNotification>
          callback) {
    this.register("v2.signals.payment_retry_evaluations.retry_recommended", callback);
    return self();
  }
  // notification-handler-methods: The end of the section generated from our OpenAPI spec

  /**
   * Get a sorted list of all registered event types.
   *
   * @return A sorted list of event type strings
   */
  public List<String> getRegisteredEventTypes() {
    List<String> eventTypes = new ArrayList<>(this.registeredHandlers.keySet());
    Collections.sort(eventTypes);
    return eventTypes;
  }
}

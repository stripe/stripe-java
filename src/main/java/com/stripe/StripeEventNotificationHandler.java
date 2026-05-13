// File copied from our code generator; changes here will be overwritten.
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
import com.stripe.events.V1BillingAlertTriggeredEventNotification;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V1BillingMeterNoMeterFoundEventNotification;
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
import com.stripe.events.V1FinancialConnectionsAccountCreatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountDeactivatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountDisconnectedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountReactivatedEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedBalanceEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedOwnershipEventNotification;
import com.stripe.events.V1FinancialConnectionsAccountRefreshedTransactionsEventNotification;
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
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification;
import com.stripe.events.V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification;
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
import com.stripe.events.V2CoreHealthEventGenerationFailureResolvedEventNotification;
import com.stripe.events.V2CoreHealthFraudRateIncreasedEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestErrorsFiringEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEventNotification;
import com.stripe.events.V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEventNotification;
import com.stripe.events.V2CoreHealthMeterEventSummariesDelayedFiringEventNotification;
import com.stripe.events.V2CoreHealthMeterEventSummariesDelayedResolvedEventNotification;
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
import com.stripe.events.V2MoneyManagementOutboundPaymentUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCanceledEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferCreatedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferFailedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferPostedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferReturnedEventNotification;
import com.stripe.events.V2MoneyManagementOutboundTransferUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutMethodCreatedEventNotification;
import com.stripe.events.V2MoneyManagementPayoutMethodUpdatedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditAvailableEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditFailedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditReturnedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedCreditSucceededEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitCanceledEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitFailedEventNotification;
import com.stripe.events.V2MoneyManagementReceivedDebitPendingEventNotification;
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
import com.stripe.events.V2SignalsAccountSignalFraudulentMerchantReadyEventNotification;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// event-notification-class-imports: The end of the section generated from our OpenAPI spec

public class StripeEventNotificationHandler {
  /**
   * Functional interface for callback functions. It describes the signature of the functions you'll
   * register on the StripeEventRouter to process incoming event notifications.
   */
  @FunctionalInterface
  public interface Callback<T extends EventNotification> {
    // this is an internal-facing method name that dictates how we call the stored method
    void process(T event, StripeClient client);
  }

  /**
   * Functional interface for handling otherwise unhandled events. It's similar to {@link Callback},
   * but includes additional information about the unhandled event to help debug it.
   */
  @FunctionalInterface
  public interface FallbackCallback {
    // this is an internal-facing method name that dictates how we call the stored method
    void process(
        EventNotification event, StripeClient client, UnhandledNotificationDetails details);
  }

  /**
   * Information about an unhandled event notification to make it easier to respond (and potentially
   * update your integration).
   */
  public static class UnhandledNotificationDetails {
    private boolean isKnownEventType;

    private UnhandledNotificationDetails(boolean isKnownEventType) {
      this.isKnownEventType = isKnownEventType;
    }

    /**
     * If true, the unhandled event's type is known to the SDK (i.e., it was successfully
     * deserialized into a specific `EventNotification` subclass).
     */
    public boolean isKnownEventType() {
      return isKnownEventType;
    }
  }

  // this is intentionally naiive to avoid the performance cost of interacting with `volatile`. We
  // expect that registrations are done synchronously at startup time and handling will happen
  // async, so thread-safe reads aren't important here.
  private boolean hasHandledEvent = false;

  private final String webhookSecret;
  private final StripeClient client;
  private final FallbackCallback fallbackCallback;
  private final HashMap<String, Callback<? extends EventNotification>> registeredHandlers =
      new HashMap<>();

  public StripeEventNotificationHandler(
      String webhookSecret, StripeClient client, FallbackCallback fallbackCallback) {
    this.webhookSecret = webhookSecret;
    this.client = client;
    this.fallbackCallback = fallbackCallback;
  }

  private <T extends EventNotification> StripeEventNotificationHandler register(
      String eventType, Callback<T> handler) {
    if (hasHandledEvent) {
      throw new IllegalStateException("Cannot register handlers after handling an event");
    }

    if (this.registeredHandlers.containsKey(eventType)) {
      throw new IllegalArgumentException("Handler already registered for event type: " + eventType);
    }
    this.registeredHandlers.put(eventType, handler);
    return this;
  }

  /**
   * Handle an incoming webhook event notification.
   *
   * @param webhookBody the incoming webhook body
   * @param sigHeader the incoming webhook signature header
   * @throws SignatureVerificationException if the validation of the webhook signature fails
   * @throws IllegalArgumentException if no handler is registered for the event type
   */
  @SuppressWarnings("unchecked")
  public void handle(String webhookBody, String sigHeader) throws SignatureVerificationException {
    // setting this naiively isn't technically thread-safe, but we expect the all callbacks to be
    // registered syncronously on startup, so this should be fine
    hasHandledEvent = true;

    EventNotification eventNotification =
        this.client.parseEventNotification(webhookBody, sigHeader, this.webhookSecret);

    Callback<? extends EventNotification> handler =
        registeredHandlers.get(eventNotification.getType());

    // Create a new client with the event's context for thread-safe processing
    StripeClient eventClient = this.client.withStripeContext(eventNotification.context);

    if (handler == null) {
      boolean isKnownEventType =
          !(eventNotification instanceof com.stripe.events.UnknownEventNotification);
      UnhandledNotificationDetails details = new UnhandledNotificationDetails(isKnownEventType);

      this.fallbackCallback.process(eventNotification, eventClient, details);
    } else {
      // this is technically unsafe but we control the registration API so should be ok
      ((Callback<EventNotification>) handler).process(eventNotification, eventClient);
    }
  }

  // notification-handler-methods: The beginning of the section generated from our OpenAPI spec
  public StripeEventNotificationHandler onV1AccountApplicationAuthorized(
      Callback<V1AccountApplicationAuthorizedEventNotification> callback) {
    this.register("v1.account.application.authorized", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1AccountApplicationDeauthorized(
      Callback<V1AccountApplicationDeauthorizedEventNotification> callback) {
    this.register("v1.account.application.deauthorized", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1AccountExternalAccountCreated(
      Callback<V1AccountExternalAccountCreatedEventNotification> callback) {
    this.register("v1.account.external_account.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1AccountExternalAccountDeleted(
      Callback<V1AccountExternalAccountDeletedEventNotification> callback) {
    this.register("v1.account.external_account.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1AccountExternalAccountUpdated(
      Callback<V1AccountExternalAccountUpdatedEventNotification> callback) {
    this.register("v1.account.external_account.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1AccountUpdated(
      Callback<V1AccountUpdatedEventNotification> callback) {
    this.register("v1.account.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1AccountSignalsIncludingDelinquencyCreated(
      Callback<V1AccountSignalsIncludingDelinquencyCreatedEventNotification> callback) {
    this.register("v1.account_signals[delinquency].created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ApplicationFeeCreated(
      Callback<V1ApplicationFeeCreatedEventNotification> callback) {
    this.register("v1.application_fee.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ApplicationFeeRefundUpdated(
      Callback<V1ApplicationFeeRefundUpdatedEventNotification> callback) {
    this.register("v1.application_fee.refund.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ApplicationFeeRefunded(
      Callback<V1ApplicationFeeRefundedEventNotification> callback) {
    this.register("v1.application_fee.refunded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BalanceAvailable(
      Callback<V1BalanceAvailableEventNotification> callback) {
    this.register("v1.balance.available", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingAlertTriggered(
      Callback<V1BillingAlertTriggeredEventNotification> callback) {
    this.register("v1.billing.alert.triggered", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingMeterErrorReportTriggered(
      Callback<V1BillingMeterErrorReportTriggeredEventNotification> callback) {
    this.register("v1.billing.meter.error_report_triggered", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingMeterNoMeterFound(
      Callback<V1BillingMeterNoMeterFoundEventNotification> callback) {
    this.register("v1.billing.meter.no_meter_found", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingPortalConfigurationCreated(
      Callback<V1BillingPortalConfigurationCreatedEventNotification> callback) {
    this.register("v1.billing_portal.configuration.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingPortalConfigurationUpdated(
      Callback<V1BillingPortalConfigurationUpdatedEventNotification> callback) {
    this.register("v1.billing_portal.configuration.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1BillingPortalSessionCreated(
      Callback<V1BillingPortalSessionCreatedEventNotification> callback) {
    this.register("v1.billing_portal.session.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CapabilityUpdated(
      Callback<V1CapabilityUpdatedEventNotification> callback) {
    this.register("v1.capability.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CashBalanceFundsAvailable(
      Callback<V1CashBalanceFundsAvailableEventNotification> callback) {
    this.register("v1.cash_balance.funds_available", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeCaptured(
      Callback<V1ChargeCapturedEventNotification> callback) {
    this.register("v1.charge.captured", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeDisputeClosed(
      Callback<V1ChargeDisputeClosedEventNotification> callback) {
    this.register("v1.charge.dispute.closed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeDisputeCreated(
      Callback<V1ChargeDisputeCreatedEventNotification> callback) {
    this.register("v1.charge.dispute.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeDisputeFundsReinstated(
      Callback<V1ChargeDisputeFundsReinstatedEventNotification> callback) {
    this.register("v1.charge.dispute.funds_reinstated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeDisputeFundsWithdrawn(
      Callback<V1ChargeDisputeFundsWithdrawnEventNotification> callback) {
    this.register("v1.charge.dispute.funds_withdrawn", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeDisputeUpdated(
      Callback<V1ChargeDisputeUpdatedEventNotification> callback) {
    this.register("v1.charge.dispute.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeExpired(
      Callback<V1ChargeExpiredEventNotification> callback) {
    this.register("v1.charge.expired", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeFailed(
      Callback<V1ChargeFailedEventNotification> callback) {
    this.register("v1.charge.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargePending(
      Callback<V1ChargePendingEventNotification> callback) {
    this.register("v1.charge.pending", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeRefundUpdated(
      Callback<V1ChargeRefundUpdatedEventNotification> callback) {
    this.register("v1.charge.refund.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeRefunded(
      Callback<V1ChargeRefundedEventNotification> callback) {
    this.register("v1.charge.refunded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeSucceeded(
      Callback<V1ChargeSucceededEventNotification> callback) {
    this.register("v1.charge.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ChargeUpdated(
      Callback<V1ChargeUpdatedEventNotification> callback) {
    this.register("v1.charge.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CheckoutSessionAsyncPaymentFailed(
      Callback<V1CheckoutSessionAsyncPaymentFailedEventNotification> callback) {
    this.register("v1.checkout.session.async_payment_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CheckoutSessionAsyncPaymentSucceeded(
      Callback<V1CheckoutSessionAsyncPaymentSucceededEventNotification> callback) {
    this.register("v1.checkout.session.async_payment_succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CheckoutSessionCompleted(
      Callback<V1CheckoutSessionCompletedEventNotification> callback) {
    this.register("v1.checkout.session.completed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CheckoutSessionExpired(
      Callback<V1CheckoutSessionExpiredEventNotification> callback) {
    this.register("v1.checkout.session.expired", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateOrderCanceled(
      Callback<V1ClimateOrderCanceledEventNotification> callback) {
    this.register("v1.climate.order.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateOrderCreated(
      Callback<V1ClimateOrderCreatedEventNotification> callback) {
    this.register("v1.climate.order.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateOrderDelayed(
      Callback<V1ClimateOrderDelayedEventNotification> callback) {
    this.register("v1.climate.order.delayed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateOrderDelivered(
      Callback<V1ClimateOrderDeliveredEventNotification> callback) {
    this.register("v1.climate.order.delivered", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateOrderProductSubstituted(
      Callback<V1ClimateOrderProductSubstitutedEventNotification> callback) {
    this.register("v1.climate.order.product_substituted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateProductCreated(
      Callback<V1ClimateProductCreatedEventNotification> callback) {
    this.register("v1.climate.product.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ClimateProductPricingUpdated(
      Callback<V1ClimateProductPricingUpdatedEventNotification> callback) {
    this.register("v1.climate.product.pricing_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CouponCreated(
      Callback<V1CouponCreatedEventNotification> callback) {
    this.register("v1.coupon.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CouponDeleted(
      Callback<V1CouponDeletedEventNotification> callback) {
    this.register("v1.coupon.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CouponUpdated(
      Callback<V1CouponUpdatedEventNotification> callback) {
    this.register("v1.coupon.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CreditNoteCreated(
      Callback<V1CreditNoteCreatedEventNotification> callback) {
    this.register("v1.credit_note.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CreditNoteUpdated(
      Callback<V1CreditNoteUpdatedEventNotification> callback) {
    this.register("v1.credit_note.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CreditNoteVoided(
      Callback<V1CreditNoteVoidedEventNotification> callback) {
    this.register("v1.credit_note.voided", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerCreated(
      Callback<V1CustomerCreatedEventNotification> callback) {
    this.register("v1.customer.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerDeleted(
      Callback<V1CustomerDeletedEventNotification> callback) {
    this.register("v1.customer.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionCreated(
      Callback<V1CustomerSubscriptionCreatedEventNotification> callback) {
    this.register("v1.customer.subscription.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionDeleted(
      Callback<V1CustomerSubscriptionDeletedEventNotification> callback) {
    this.register("v1.customer.subscription.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionPaused(
      Callback<V1CustomerSubscriptionPausedEventNotification> callback) {
    this.register("v1.customer.subscription.paused", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionPendingUpdateApplied(
      Callback<V1CustomerSubscriptionPendingUpdateAppliedEventNotification> callback) {
    this.register("v1.customer.subscription.pending_update_applied", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionPendingUpdateExpired(
      Callback<V1CustomerSubscriptionPendingUpdateExpiredEventNotification> callback) {
    this.register("v1.customer.subscription.pending_update_expired", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionResumed(
      Callback<V1CustomerSubscriptionResumedEventNotification> callback) {
    this.register("v1.customer.subscription.resumed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionTrialWillEnd(
      Callback<V1CustomerSubscriptionTrialWillEndEventNotification> callback) {
    this.register("v1.customer.subscription.trial_will_end", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerSubscriptionUpdated(
      Callback<V1CustomerSubscriptionUpdatedEventNotification> callback) {
    this.register("v1.customer.subscription.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerTaxIdCreated(
      Callback<V1CustomerTaxIdCreatedEventNotification> callback) {
    this.register("v1.customer.tax_id.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerTaxIdDeleted(
      Callback<V1CustomerTaxIdDeletedEventNotification> callback) {
    this.register("v1.customer.tax_id.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerTaxIdUpdated(
      Callback<V1CustomerTaxIdUpdatedEventNotification> callback) {
    this.register("v1.customer.tax_id.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerUpdated(
      Callback<V1CustomerUpdatedEventNotification> callback) {
    this.register("v1.customer.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1CustomerCashBalanceTransactionCreated(
      Callback<V1CustomerCashBalanceTransactionCreatedEventNotification> callback) {
    this.register("v1.customer_cash_balance_transaction.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1EntitlementsActiveEntitlementSummaryUpdated(
      Callback<V1EntitlementsActiveEntitlementSummaryUpdatedEventNotification> callback) {
    this.register("v1.entitlements.active_entitlement_summary.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FileCreated(
      Callback<V1FileCreatedEventNotification> callback) {
    this.register("v1.file.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountCreated(
      Callback<V1FinancialConnectionsAccountCreatedEventNotification> callback) {
    this.register("v1.financial_connections.account.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountDeactivated(
      Callback<V1FinancialConnectionsAccountDeactivatedEventNotification> callback) {
    this.register("v1.financial_connections.account.deactivated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountDisconnected(
      Callback<V1FinancialConnectionsAccountDisconnectedEventNotification> callback) {
    this.register("v1.financial_connections.account.disconnected", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountReactivated(
      Callback<V1FinancialConnectionsAccountReactivatedEventNotification> callback) {
    this.register("v1.financial_connections.account.reactivated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountRefreshedBalance(
      Callback<V1FinancialConnectionsAccountRefreshedBalanceEventNotification> callback) {
    this.register("v1.financial_connections.account.refreshed_balance", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountRefreshedOwnership(
      Callback<V1FinancialConnectionsAccountRefreshedOwnershipEventNotification> callback) {
    this.register("v1.financial_connections.account.refreshed_ownership", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1FinancialConnectionsAccountRefreshedTransactions(
      Callback<V1FinancialConnectionsAccountRefreshedTransactionsEventNotification> callback) {
    this.register("v1.financial_connections.account.refreshed_transactions", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IdentityVerificationSessionCanceled(
      Callback<V1IdentityVerificationSessionCanceledEventNotification> callback) {
    this.register("v1.identity.verification_session.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IdentityVerificationSessionCreated(
      Callback<V1IdentityVerificationSessionCreatedEventNotification> callback) {
    this.register("v1.identity.verification_session.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IdentityVerificationSessionProcessing(
      Callback<V1IdentityVerificationSessionProcessingEventNotification> callback) {
    this.register("v1.identity.verification_session.processing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IdentityVerificationSessionRedacted(
      Callback<V1IdentityVerificationSessionRedactedEventNotification> callback) {
    this.register("v1.identity.verification_session.redacted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IdentityVerificationSessionRequiresInput(
      Callback<V1IdentityVerificationSessionRequiresInputEventNotification> callback) {
    this.register("v1.identity.verification_session.requires_input", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IdentityVerificationSessionVerified(
      Callback<V1IdentityVerificationSessionVerifiedEventNotification> callback) {
    this.register("v1.identity.verification_session.verified", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceCreated(
      Callback<V1InvoiceCreatedEventNotification> callback) {
    this.register("v1.invoice.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceDeleted(
      Callback<V1InvoiceDeletedEventNotification> callback) {
    this.register("v1.invoice.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceFinalizationFailed(
      Callback<V1InvoiceFinalizationFailedEventNotification> callback) {
    this.register("v1.invoice.finalization_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceFinalized(
      Callback<V1InvoiceFinalizedEventNotification> callback) {
    this.register("v1.invoice.finalized", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceMarkedUncollectible(
      Callback<V1InvoiceMarkedUncollectibleEventNotification> callback) {
    this.register("v1.invoice.marked_uncollectible", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceOverdue(
      Callback<V1InvoiceOverdueEventNotification> callback) {
    this.register("v1.invoice.overdue", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceOverpaid(
      Callback<V1InvoiceOverpaidEventNotification> callback) {
    this.register("v1.invoice.overpaid", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoicePaid(
      Callback<V1InvoicePaidEventNotification> callback) {
    this.register("v1.invoice.paid", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoicePaymentActionRequired(
      Callback<V1InvoicePaymentActionRequiredEventNotification> callback) {
    this.register("v1.invoice.payment_action_required", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoicePaymentFailed(
      Callback<V1InvoicePaymentFailedEventNotification> callback) {
    this.register("v1.invoice.payment_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoicePaymentSucceeded(
      Callback<V1InvoicePaymentSucceededEventNotification> callback) {
    this.register("v1.invoice.payment_succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceSent(
      Callback<V1InvoiceSentEventNotification> callback) {
    this.register("v1.invoice.sent", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceUpcoming(
      Callback<V1InvoiceUpcomingEventNotification> callback) {
    this.register("v1.invoice.upcoming", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceUpdated(
      Callback<V1InvoiceUpdatedEventNotification> callback) {
    this.register("v1.invoice.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceVoided(
      Callback<V1InvoiceVoidedEventNotification> callback) {
    this.register("v1.invoice.voided", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceWillBeDue(
      Callback<V1InvoiceWillBeDueEventNotification> callback) {
    this.register("v1.invoice.will_be_due", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoicePaymentPaid(
      Callback<V1InvoicePaymentPaidEventNotification> callback) {
    this.register("v1.invoice_payment.paid", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceitemCreated(
      Callback<V1InvoiceitemCreatedEventNotification> callback) {
    this.register("v1.invoiceitem.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1InvoiceitemDeleted(
      Callback<V1InvoiceitemDeletedEventNotification> callback) {
    this.register("v1.invoiceitem.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingAuthorizationCreated(
      Callback<V1IssuingAuthorizationCreatedEventNotification> callback) {
    this.register("v1.issuing_authorization.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingAuthorizationRequest(
      Callback<V1IssuingAuthorizationRequestEventNotification> callback) {
    this.register("v1.issuing_authorization.request", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingAuthorizationUpdated(
      Callback<V1IssuingAuthorizationUpdatedEventNotification> callback) {
    this.register("v1.issuing_authorization.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingCardCreated(
      Callback<V1IssuingCardCreatedEventNotification> callback) {
    this.register("v1.issuing_card.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingCardUpdated(
      Callback<V1IssuingCardUpdatedEventNotification> callback) {
    this.register("v1.issuing_card.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingCardholderCreated(
      Callback<V1IssuingCardholderCreatedEventNotification> callback) {
    this.register("v1.issuing_cardholder.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingCardholderUpdated(
      Callback<V1IssuingCardholderUpdatedEventNotification> callback) {
    this.register("v1.issuing_cardholder.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingDisputeClosed(
      Callback<V1IssuingDisputeClosedEventNotification> callback) {
    this.register("v1.issuing_dispute.closed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingDisputeCreated(
      Callback<V1IssuingDisputeCreatedEventNotification> callback) {
    this.register("v1.issuing_dispute.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingDisputeFundsReinstated(
      Callback<V1IssuingDisputeFundsReinstatedEventNotification> callback) {
    this.register("v1.issuing_dispute.funds_reinstated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingDisputeFundsRescinded(
      Callback<V1IssuingDisputeFundsRescindedEventNotification> callback) {
    this.register("v1.issuing_dispute.funds_rescinded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingDisputeSubmitted(
      Callback<V1IssuingDisputeSubmittedEventNotification> callback) {
    this.register("v1.issuing_dispute.submitted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingDisputeUpdated(
      Callback<V1IssuingDisputeUpdatedEventNotification> callback) {
    this.register("v1.issuing_dispute.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingPersonalizationDesignActivated(
      Callback<V1IssuingPersonalizationDesignActivatedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.activated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingPersonalizationDesignDeactivated(
      Callback<V1IssuingPersonalizationDesignDeactivatedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.deactivated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingPersonalizationDesignRejected(
      Callback<V1IssuingPersonalizationDesignRejectedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.rejected", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingPersonalizationDesignUpdated(
      Callback<V1IssuingPersonalizationDesignUpdatedEventNotification> callback) {
    this.register("v1.issuing_personalization_design.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingTokenCreated(
      Callback<V1IssuingTokenCreatedEventNotification> callback) {
    this.register("v1.issuing_token.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingTokenUpdated(
      Callback<V1IssuingTokenUpdatedEventNotification> callback) {
    this.register("v1.issuing_token.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingTransactionCreated(
      Callback<V1IssuingTransactionCreatedEventNotification> callback) {
    this.register("v1.issuing_transaction.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingTransactionPurchaseDetailsReceiptUpdated(
      Callback<V1IssuingTransactionPurchaseDetailsReceiptUpdatedEventNotification> callback) {
    this.register("v1.issuing_transaction.purchase_details_receipt_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1IssuingTransactionUpdated(
      Callback<V1IssuingTransactionUpdatedEventNotification> callback) {
    this.register("v1.issuing_transaction.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1MandateUpdated(
      Callback<V1MandateUpdatedEventNotification> callback) {
    this.register("v1.mandate.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentAmountCapturableUpdated(
      Callback<V1PaymentIntentAmountCapturableUpdatedEventNotification> callback) {
    this.register("v1.payment_intent.amount_capturable_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentCanceled(
      Callback<V1PaymentIntentCanceledEventNotification> callback) {
    this.register("v1.payment_intent.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentCreated(
      Callback<V1PaymentIntentCreatedEventNotification> callback) {
    this.register("v1.payment_intent.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentPartiallyFunded(
      Callback<V1PaymentIntentPartiallyFundedEventNotification> callback) {
    this.register("v1.payment_intent.partially_funded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentPaymentFailed(
      Callback<V1PaymentIntentPaymentFailedEventNotification> callback) {
    this.register("v1.payment_intent.payment_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentProcessing(
      Callback<V1PaymentIntentProcessingEventNotification> callback) {
    this.register("v1.payment_intent.processing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentRequiresAction(
      Callback<V1PaymentIntentRequiresActionEventNotification> callback) {
    this.register("v1.payment_intent.requires_action", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentIntentSucceeded(
      Callback<V1PaymentIntentSucceededEventNotification> callback) {
    this.register("v1.payment_intent.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentLinkCreated(
      Callback<V1PaymentLinkCreatedEventNotification> callback) {
    this.register("v1.payment_link.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentLinkUpdated(
      Callback<V1PaymentLinkUpdatedEventNotification> callback) {
    this.register("v1.payment_link.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentMethodAttached(
      Callback<V1PaymentMethodAttachedEventNotification> callback) {
    this.register("v1.payment_method.attached", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentMethodAutomaticallyUpdated(
      Callback<V1PaymentMethodAutomaticallyUpdatedEventNotification> callback) {
    this.register("v1.payment_method.automatically_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentMethodDetached(
      Callback<V1PaymentMethodDetachedEventNotification> callback) {
    this.register("v1.payment_method.detached", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PaymentMethodUpdated(
      Callback<V1PaymentMethodUpdatedEventNotification> callback) {
    this.register("v1.payment_method.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PayoutCanceled(
      Callback<V1PayoutCanceledEventNotification> callback) {
    this.register("v1.payout.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PayoutCreated(
      Callback<V1PayoutCreatedEventNotification> callback) {
    this.register("v1.payout.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PayoutFailed(
      Callback<V1PayoutFailedEventNotification> callback) {
    this.register("v1.payout.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PayoutPaid(
      Callback<V1PayoutPaidEventNotification> callback) {
    this.register("v1.payout.paid", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PayoutReconciliationCompleted(
      Callback<V1PayoutReconciliationCompletedEventNotification> callback) {
    this.register("v1.payout.reconciliation_completed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PayoutUpdated(
      Callback<V1PayoutUpdatedEventNotification> callback) {
    this.register("v1.payout.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PersonCreated(
      Callback<V1PersonCreatedEventNotification> callback) {
    this.register("v1.person.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PersonDeleted(
      Callback<V1PersonDeletedEventNotification> callback) {
    this.register("v1.person.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PersonUpdated(
      Callback<V1PersonUpdatedEventNotification> callback) {
    this.register("v1.person.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PlanCreated(
      Callback<V1PlanCreatedEventNotification> callback) {
    this.register("v1.plan.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PlanDeleted(
      Callback<V1PlanDeletedEventNotification> callback) {
    this.register("v1.plan.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PlanUpdated(
      Callback<V1PlanUpdatedEventNotification> callback) {
    this.register("v1.plan.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PriceCreated(
      Callback<V1PriceCreatedEventNotification> callback) {
    this.register("v1.price.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PriceDeleted(
      Callback<V1PriceDeletedEventNotification> callback) {
    this.register("v1.price.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PriceUpdated(
      Callback<V1PriceUpdatedEventNotification> callback) {
    this.register("v1.price.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ProductCreated(
      Callback<V1ProductCreatedEventNotification> callback) {
    this.register("v1.product.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ProductDeleted(
      Callback<V1ProductDeletedEventNotification> callback) {
    this.register("v1.product.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ProductUpdated(
      Callback<V1ProductUpdatedEventNotification> callback) {
    this.register("v1.product.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PromotionCodeCreated(
      Callback<V1PromotionCodeCreatedEventNotification> callback) {
    this.register("v1.promotion_code.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1PromotionCodeUpdated(
      Callback<V1PromotionCodeUpdatedEventNotification> callback) {
    this.register("v1.promotion_code.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1QuoteAccepted(
      Callback<V1QuoteAcceptedEventNotification> callback) {
    this.register("v1.quote.accepted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1QuoteCanceled(
      Callback<V1QuoteCanceledEventNotification> callback) {
    this.register("v1.quote.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1QuoteCreated(
      Callback<V1QuoteCreatedEventNotification> callback) {
    this.register("v1.quote.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1QuoteFinalized(
      Callback<V1QuoteFinalizedEventNotification> callback) {
    this.register("v1.quote.finalized", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1RadarEarlyFraudWarningCreated(
      Callback<V1RadarEarlyFraudWarningCreatedEventNotification> callback) {
    this.register("v1.radar.early_fraud_warning.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1RadarEarlyFraudWarningUpdated(
      Callback<V1RadarEarlyFraudWarningUpdatedEventNotification> callback) {
    this.register("v1.radar.early_fraud_warning.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1RefundCreated(
      Callback<V1RefundCreatedEventNotification> callback) {
    this.register("v1.refund.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1RefundFailed(
      Callback<V1RefundFailedEventNotification> callback) {
    this.register("v1.refund.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1RefundUpdated(
      Callback<V1RefundUpdatedEventNotification> callback) {
    this.register("v1.refund.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ReviewClosed(
      Callback<V1ReviewClosedEventNotification> callback) {
    this.register("v1.review.closed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1ReviewOpened(
      Callback<V1ReviewOpenedEventNotification> callback) {
    this.register("v1.review.opened", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SetupIntentCanceled(
      Callback<V1SetupIntentCanceledEventNotification> callback) {
    this.register("v1.setup_intent.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SetupIntentCreated(
      Callback<V1SetupIntentCreatedEventNotification> callback) {
    this.register("v1.setup_intent.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SetupIntentRequiresAction(
      Callback<V1SetupIntentRequiresActionEventNotification> callback) {
    this.register("v1.setup_intent.requires_action", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SetupIntentSetupFailed(
      Callback<V1SetupIntentSetupFailedEventNotification> callback) {
    this.register("v1.setup_intent.setup_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SetupIntentSucceeded(
      Callback<V1SetupIntentSucceededEventNotification> callback) {
    this.register("v1.setup_intent.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SigmaScheduledQueryRunCreated(
      Callback<V1SigmaScheduledQueryRunCreatedEventNotification> callback) {
    this.register("v1.sigma.scheduled_query_run.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SourceCanceled(
      Callback<V1SourceCanceledEventNotification> callback) {
    this.register("v1.source.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SourceChargeable(
      Callback<V1SourceChargeableEventNotification> callback) {
    this.register("v1.source.chargeable", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SourceFailed(
      Callback<V1SourceFailedEventNotification> callback) {
    this.register("v1.source.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SourceRefundAttributesRequired(
      Callback<V1SourceRefundAttributesRequiredEventNotification> callback) {
    this.register("v1.source.refund_attributes_required", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleAborted(
      Callback<V1SubscriptionScheduleAbortedEventNotification> callback) {
    this.register("v1.subscription_schedule.aborted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleCanceled(
      Callback<V1SubscriptionScheduleCanceledEventNotification> callback) {
    this.register("v1.subscription_schedule.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleCompleted(
      Callback<V1SubscriptionScheduleCompletedEventNotification> callback) {
    this.register("v1.subscription_schedule.completed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleCreated(
      Callback<V1SubscriptionScheduleCreatedEventNotification> callback) {
    this.register("v1.subscription_schedule.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleExpiring(
      Callback<V1SubscriptionScheduleExpiringEventNotification> callback) {
    this.register("v1.subscription_schedule.expiring", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleReleased(
      Callback<V1SubscriptionScheduleReleasedEventNotification> callback) {
    this.register("v1.subscription_schedule.released", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1SubscriptionScheduleUpdated(
      Callback<V1SubscriptionScheduleUpdatedEventNotification> callback) {
    this.register("v1.subscription_schedule.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TaxSettingsUpdated(
      Callback<V1TaxSettingsUpdatedEventNotification> callback) {
    this.register("v1.tax.settings.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TaxRateCreated(
      Callback<V1TaxRateCreatedEventNotification> callback) {
    this.register("v1.tax_rate.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TaxRateUpdated(
      Callback<V1TaxRateUpdatedEventNotification> callback) {
    this.register("v1.tax_rate.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TerminalReaderActionFailed(
      Callback<V1TerminalReaderActionFailedEventNotification> callback) {
    this.register("v1.terminal.reader.action_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TerminalReaderActionSucceeded(
      Callback<V1TerminalReaderActionSucceededEventNotification> callback) {
    this.register("v1.terminal.reader.action_succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TerminalReaderActionUpdated(
      Callback<V1TerminalReaderActionUpdatedEventNotification> callback) {
    this.register("v1.terminal.reader.action_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TestHelpersTestClockAdvancing(
      Callback<V1TestHelpersTestClockAdvancingEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.advancing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TestHelpersTestClockCreated(
      Callback<V1TestHelpersTestClockCreatedEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TestHelpersTestClockDeleted(
      Callback<V1TestHelpersTestClockDeletedEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TestHelpersTestClockInternalFailure(
      Callback<V1TestHelpersTestClockInternalFailureEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.internal_failure", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TestHelpersTestClockReady(
      Callback<V1TestHelpersTestClockReadyEventNotification> callback) {
    this.register("v1.test_helpers.test_clock.ready", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TopupCanceled(
      Callback<V1TopupCanceledEventNotification> callback) {
    this.register("v1.topup.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TopupCreated(
      Callback<V1TopupCreatedEventNotification> callback) {
    this.register("v1.topup.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TopupFailed(
      Callback<V1TopupFailedEventNotification> callback) {
    this.register("v1.topup.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TopupReversed(
      Callback<V1TopupReversedEventNotification> callback) {
    this.register("v1.topup.reversed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TopupSucceeded(
      Callback<V1TopupSucceededEventNotification> callback) {
    this.register("v1.topup.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TransferCreated(
      Callback<V1TransferCreatedEventNotification> callback) {
    this.register("v1.transfer.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TransferReversed(
      Callback<V1TransferReversedEventNotification> callback) {
    this.register("v1.transfer.reversed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV1TransferUpdated(
      Callback<V1TransferUpdatedEventNotification> callback) {
    this.register("v1.transfer.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingCadenceBilled(
      Callback<V2BillingCadenceBilledEventNotification> callback) {
    this.register("v2.billing.cadence.billed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingCadenceCanceled(
      Callback<V2BillingCadenceCanceledEventNotification> callback) {
    this.register("v2.billing.cadence.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingCadenceCreated(
      Callback<V2BillingCadenceCreatedEventNotification> callback) {
    this.register("v2.billing.cadence.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingLicenseFeeCreated(
      Callback<V2BillingLicenseFeeCreatedEventNotification> callback) {
    this.register("v2.billing.license_fee.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingLicenseFeeUpdated(
      Callback<V2BillingLicenseFeeUpdatedEventNotification> callback) {
    this.register("v2.billing.license_fee.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingLicenseFeeVersionCreated(
      Callback<V2BillingLicenseFeeVersionCreatedEventNotification> callback) {
    this.register("v2.billing.license_fee_version.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingLicensedItemCreated(
      Callback<V2BillingLicensedItemCreatedEventNotification> callback) {
    this.register("v2.billing.licensed_item.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingLicensedItemUpdated(
      Callback<V2BillingLicensedItemUpdatedEventNotification> callback) {
    this.register("v2.billing.licensed_item.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingMeteredItemCreated(
      Callback<V2BillingMeteredItemCreatedEventNotification> callback) {
    this.register("v2.billing.metered_item.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingMeteredItemUpdated(
      Callback<V2BillingMeteredItemUpdatedEventNotification> callback) {
    this.register("v2.billing.metered_item.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanCreated(
      Callback<V2BillingPricingPlanCreatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanUpdated(
      Callback<V2BillingPricingPlanUpdatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanComponentCreated(
      Callback<V2BillingPricingPlanComponentCreatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_component.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanComponentUpdated(
      Callback<V2BillingPricingPlanComponentUpdatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_component.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2BillingPricingPlanSubscriptionCollectionAwaitingCustomerAction(
          Callback<
                  V2BillingPricingPlanSubscriptionCollectionAwaitingCustomerActionEventNotification>
              callback) {
    this.register(
        "v2.billing.pricing_plan_subscription.collection_awaiting_customer_action", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionCollectionCurrent(
      Callback<V2BillingPricingPlanSubscriptionCollectionCurrentEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_current", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionCollectionPastDue(
      Callback<V2BillingPricingPlanSubscriptionCollectionPastDueEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_past_due", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionCollectionPaused(
      Callback<V2BillingPricingPlanSubscriptionCollectionPausedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_paused", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionCollectionUnpaid(
      Callback<V2BillingPricingPlanSubscriptionCollectionUnpaidEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.collection_unpaid", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionServicingActivated(
      Callback<V2BillingPricingPlanSubscriptionServicingActivatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.servicing_activated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionServicingCanceled(
      Callback<V2BillingPricingPlanSubscriptionServicingCanceledEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.servicing_canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanSubscriptionServicingPaused(
      Callback<V2BillingPricingPlanSubscriptionServicingPausedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_subscription.servicing_paused", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingPricingPlanVersionCreated(
      Callback<V2BillingPricingPlanVersionCreatedEventNotification> callback) {
    this.register("v2.billing.pricing_plan_version.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardCreated(
      Callback<V2BillingRateCardCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardUpdated(
      Callback<V2BillingRateCardUpdatedEventNotification> callback) {
    this.register("v2.billing.rate_card.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardCustomPricingUnitOverageRateCreated(
      Callback<V2BillingRateCardCustomPricingUnitOverageRateCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card_custom_pricing_unit_overage_rate.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardRateCreated(
      Callback<V2BillingRateCardRateCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card_rate.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionActivated(
      Callback<V2BillingRateCardSubscriptionActivatedEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.activated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionCanceled(
      Callback<V2BillingRateCardSubscriptionCanceledEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2BillingRateCardSubscriptionCollectionAwaitingCustomerAction(
          Callback<V2BillingRateCardSubscriptionCollectionAwaitingCustomerActionEventNotification>
              callback) {
    this.register(
        "v2.billing.rate_card_subscription.collection_awaiting_customer_action", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionCollectionCurrent(
      Callback<V2BillingRateCardSubscriptionCollectionCurrentEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.collection_current", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionCollectionPastDue(
      Callback<V2BillingRateCardSubscriptionCollectionPastDueEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.collection_past_due", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionCollectionPaused(
      Callback<V2BillingRateCardSubscriptionCollectionPausedEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.collection_paused", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionCollectionUnpaid(
      Callback<V2BillingRateCardSubscriptionCollectionUnpaidEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.collection_unpaid", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionServicingActivated(
      Callback<V2BillingRateCardSubscriptionServicingActivatedEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.servicing_activated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionServicingCanceled(
      Callback<V2BillingRateCardSubscriptionServicingCanceledEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.servicing_canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardSubscriptionServicingPaused(
      Callback<V2BillingRateCardSubscriptionServicingPausedEventNotification> callback) {
    this.register("v2.billing.rate_card_subscription.servicing_paused", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2BillingRateCardVersionCreated(
      Callback<V2BillingRateCardVersionCreatedEventNotification> callback) {
    this.register("v2.billing.rate_card_version.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CommerceProductCatalogImportsFailed(
      Callback<V2CommerceProductCatalogImportsFailedEventNotification> callback) {
    this.register("v2.commerce.product_catalog.imports.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CommerceProductCatalogImportsProcessing(
      Callback<V2CommerceProductCatalogImportsProcessingEventNotification> callback) {
    this.register("v2.commerce.product_catalog.imports.processing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CommerceProductCatalogImportsSucceeded(
      Callback<V2CommerceProductCatalogImportsSucceededEventNotification> callback) {
    this.register("v2.commerce.product_catalog.imports.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CommerceProductCatalogImportsSucceededWithErrors(
      Callback<V2CommerceProductCatalogImportsSucceededWithErrorsEventNotification> callback) {
    this.register("v2.commerce.product_catalog.imports.succeeded_with_errors", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountClosed(
      Callback<V2CoreAccountClosedEventNotification> callback) {
    this.register("v2.core.account.closed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountCreated(
      Callback<V2CoreAccountCreatedEventNotification> callback) {
    this.register("v2.core.account.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountUpdated(
      Callback<V2CoreAccountUpdatedEventNotification> callback) {
    this.register("v2.core.account.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register(
        "v2.core.account[configuration.card_creator].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationCardCreatorUpdated(
      Callback<V2CoreAccountIncludingConfigurationCardCreatorUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.card_creator].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.customer].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationCustomerUpdated(
      Callback<V2CoreAccountIncludingConfigurationCustomerUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.customer].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.merchant].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationMerchantUpdated(
      Callback<V2CoreAccountIncludingConfigurationMerchantUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.merchant].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.recipient].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationRecipientUpdated(
      Callback<V2CoreAccountIncludingConfigurationRecipientUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.recipient].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler
      onV2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdated(
          Callback<
                  V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEventNotification>
              callback) {
    this.register("v2.core.account[configuration.storer].capability_status_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingConfigurationStorerUpdated(
      Callback<V2CoreAccountIncludingConfigurationStorerUpdatedEventNotification> callback) {
    this.register("v2.core.account[configuration.storer].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingDefaultsUpdated(
      Callback<V2CoreAccountIncludingDefaultsUpdatedEventNotification> callback) {
    this.register("v2.core.account[defaults].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingFutureRequirementsUpdated(
      Callback<V2CoreAccountIncludingFutureRequirementsUpdatedEventNotification> callback) {
    this.register("v2.core.account[future_requirements].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingIdentityUpdated(
      Callback<V2CoreAccountIncludingIdentityUpdatedEventNotification> callback) {
    this.register("v2.core.account[identity].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountIncludingRequirementsUpdated(
      Callback<V2CoreAccountIncludingRequirementsUpdatedEventNotification> callback) {
    this.register("v2.core.account[requirements].updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountLinkReturned(
      Callback<V2CoreAccountLinkReturnedEventNotification> callback) {
    this.register("v2.core.account_link.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountPersonCreated(
      Callback<V2CoreAccountPersonCreatedEventNotification> callback) {
    this.register("v2.core.account_person.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountPersonDeleted(
      Callback<V2CoreAccountPersonDeletedEventNotification> callback) {
    this.register("v2.core.account_person.deleted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountPersonUpdated(
      Callback<V2CoreAccountPersonUpdatedEventNotification> callback) {
    this.register("v2.core.account_person.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreAccountSignalsFraudulentWebsiteReady(
      Callback<V2CoreAccountSignalsFraudulentWebsiteReadyEventNotification> callback) {
    this.register("v2.core.account_signals.fraudulent_website_ready", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestApproved(
      Callback<V2CoreApprovalRequestApprovedEventNotification> callback) {
    this.register("v2.core.approval_request.approved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestCanceled(
      Callback<V2CoreApprovalRequestCanceledEventNotification> callback) {
    this.register("v2.core.approval_request.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestCreated(
      Callback<V2CoreApprovalRequestCreatedEventNotification> callback) {
    this.register("v2.core.approval_request.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestExpired(
      Callback<V2CoreApprovalRequestExpiredEventNotification> callback) {
    this.register("v2.core.approval_request.expired", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestFailed(
      Callback<V2CoreApprovalRequestFailedEventNotification> callback) {
    this.register("v2.core.approval_request.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestRejected(
      Callback<V2CoreApprovalRequestRejectedEventNotification> callback) {
    this.register("v2.core.approval_request.rejected", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreApprovalRequestSucceeded(
      Callback<V2CoreApprovalRequestSucceededEventNotification> callback) {
    this.register("v2.core.approval_request.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobBatchFailed(
      Callback<V2CoreBatchJobBatchFailedEventNotification> callback) {
    this.register("v2.core.batch_job.batch_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobCanceled(
      Callback<V2CoreBatchJobCanceledEventNotification> callback) {
    this.register("v2.core.batch_job.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobCompleted(
      Callback<V2CoreBatchJobCompletedEventNotification> callback) {
    this.register("v2.core.batch_job.completed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobCreated(
      Callback<V2CoreBatchJobCreatedEventNotification> callback) {
    this.register("v2.core.batch_job.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobReadyForUpload(
      Callback<V2CoreBatchJobReadyForUploadEventNotification> callback) {
    this.register("v2.core.batch_job.ready_for_upload", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobTimeout(
      Callback<V2CoreBatchJobTimeoutEventNotification> callback) {
    this.register("v2.core.batch_job.timeout", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobUpdated(
      Callback<V2CoreBatchJobUpdatedEventNotification> callback) {
    this.register("v2.core.batch_job.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobUploadTimeout(
      Callback<V2CoreBatchJobUploadTimeoutEventNotification> callback) {
    this.register("v2.core.batch_job.upload_timeout", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobValidating(
      Callback<V2CoreBatchJobValidatingEventNotification> callback) {
    this.register("v2.core.batch_job.validating", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreBatchJobValidationFailed(
      Callback<V2CoreBatchJobValidationFailedEventNotification> callback) {
    this.register("v2.core.batch_job.validation_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreClaimableSandboxClaimed(
      Callback<V2CoreClaimableSandboxClaimedEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.claimed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreClaimableSandboxCreated(
      Callback<V2CoreClaimableSandboxCreatedEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreClaimableSandboxExpired(
      Callback<V2CoreClaimableSandboxExpiredEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.expired", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreClaimableSandboxExpiring(
      Callback<V2CoreClaimableSandboxExpiringEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.expiring", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreClaimableSandboxUpdated(
      Callback<V2CoreClaimableSandboxUpdatedEventNotification> callback) {
    this.register("v2.core.claimable_sandbox.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreEventDestinationPing(
      Callback<V2CoreEventDestinationPingEventNotification> callback) {
    this.register("v2.core.event_destination.ping", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthApiErrorFiring(
      Callback<V2CoreHealthApiErrorFiringEventNotification> callback) {
    this.register("v2.core.health.api_error.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthApiErrorResolved(
      Callback<V2CoreHealthApiErrorResolvedEventNotification> callback) {
    this.register("v2.core.health.api_error.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthApiLatencyFiring(
      Callback<V2CoreHealthApiLatencyFiringEventNotification> callback) {
    this.register("v2.core.health.api_latency.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthApiLatencyResolved(
      Callback<V2CoreHealthApiLatencyResolvedEventNotification> callback) {
    this.register("v2.core.health.api_latency.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthAuthorizationRateDropFiring(
      Callback<V2CoreHealthAuthorizationRateDropFiringEventNotification> callback) {
    this.register("v2.core.health.authorization_rate_drop.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthAuthorizationRateDropResolved(
      Callback<V2CoreHealthAuthorizationRateDropResolvedEventNotification> callback) {
    this.register("v2.core.health.authorization_rate_drop.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthEventGenerationFailureResolved(
      Callback<V2CoreHealthEventGenerationFailureResolvedEventNotification> callback) {
    this.register("v2.core.health.event_generation_failure.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthFraudRateIncreased(
      Callback<V2CoreHealthFraudRateIncreasedEventNotification> callback) {
    this.register("v2.core.health.fraud_rate.increased", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthIssuingAuthorizationRequestErrorsFiring(
      Callback<V2CoreHealthIssuingAuthorizationRequestErrorsFiringEventNotification> callback) {
    this.register("v2.core.health.issuing_authorization_request_errors.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthIssuingAuthorizationRequestErrorsResolved(
      Callback<V2CoreHealthIssuingAuthorizationRequestErrorsResolvedEventNotification> callback) {
    this.register("v2.core.health.issuing_authorization_request_errors.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthIssuingAuthorizationRequestTimeoutFiring(
      Callback<V2CoreHealthIssuingAuthorizationRequestTimeoutFiringEventNotification> callback) {
    this.register("v2.core.health.issuing_authorization_request_timeout.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthIssuingAuthorizationRequestTimeoutResolved(
      Callback<V2CoreHealthIssuingAuthorizationRequestTimeoutResolvedEventNotification> callback) {
    this.register("v2.core.health.issuing_authorization_request_timeout.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthMeterEventSummariesDelayedFiring(
      Callback<V2CoreHealthMeterEventSummariesDelayedFiringEventNotification> callback) {
    this.register("v2.core.health.meter_event_summaries_delayed.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthMeterEventSummariesDelayedResolved(
      Callback<V2CoreHealthMeterEventSummariesDelayedResolvedEventNotification> callback) {
    this.register("v2.core.health.meter_event_summaries_delayed.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthPaymentMethodErrorFiring(
      Callback<V2CoreHealthPaymentMethodErrorFiringEventNotification> callback) {
    this.register("v2.core.health.payment_method_error.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthPaymentMethodErrorResolved(
      Callback<V2CoreHealthPaymentMethodErrorResolvedEventNotification> callback) {
    this.register("v2.core.health.payment_method_error.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthSepaDebitDelayedFiring(
      Callback<V2CoreHealthSepaDebitDelayedFiringEventNotification> callback) {
    this.register("v2.core.health.sepa_debit_delayed.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthSepaDebitDelayedResolved(
      Callback<V2CoreHealthSepaDebitDelayedResolvedEventNotification> callback) {
    this.register("v2.core.health.sepa_debit_delayed.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthTrafficVolumeDropFiring(
      Callback<V2CoreHealthTrafficVolumeDropFiringEventNotification> callback) {
    this.register("v2.core.health.traffic_volume_drop.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthTrafficVolumeDropResolved(
      Callback<V2CoreHealthTrafficVolumeDropResolvedEventNotification> callback) {
    this.register("v2.core.health.traffic_volume_drop.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthWebhookLatencyFiring(
      Callback<V2CoreHealthWebhookLatencyFiringEventNotification> callback) {
    this.register("v2.core.health.webhook_latency.firing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2CoreHealthWebhookLatencyResolved(
      Callback<V2CoreHealthWebhookLatencyResolvedEventNotification> callback) {
    this.register("v2.core.health.webhook_latency.resolved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2DataReportingQueryRunCreated(
      Callback<V2DataReportingQueryRunCreatedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2DataReportingQueryRunFailed(
      Callback<V2DataReportingQueryRunFailedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2DataReportingQueryRunSucceeded(
      Callback<V2DataReportingQueryRunSucceededEventNotification> callback) {
    this.register("v2.data.reporting.query_run.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2DataReportingQueryRunUpdated(
      Callback<V2DataReportingQueryRunUpdatedEventNotification> callback) {
    this.register("v2.data.reporting.query_run.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ExtendExtensionRunFailed(
      Callback<V2ExtendExtensionRunFailedEventNotification> callback) {
    this.register("v2.extend.extension_run.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ExtendWorkflowRunFailed(
      Callback<V2ExtendWorkflowRunFailedEventNotification> callback) {
    this.register("v2.extend.workflow_run.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ExtendWorkflowRunStarted(
      Callback<V2ExtendWorkflowRunStartedEventNotification> callback) {
    this.register("v2.extend.workflow_run.started", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ExtendWorkflowRunSucceeded(
      Callback<V2ExtendWorkflowRunSucceededEventNotification> callback) {
    this.register("v2.extend.workflow_run.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamApiKeyCreated(
      Callback<V2IamApiKeyCreatedEventNotification> callback) {
    this.register("v2.iam.api_key.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamApiKeyDefaultSecretRevealed(
      Callback<V2IamApiKeyDefaultSecretRevealedEventNotification> callback) {
    this.register("v2.iam.api_key.default_secret_revealed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamApiKeyExpired(
      Callback<V2IamApiKeyExpiredEventNotification> callback) {
    this.register("v2.iam.api_key.expired", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamApiKeyPermissionsUpdated(
      Callback<V2IamApiKeyPermissionsUpdatedEventNotification> callback) {
    this.register("v2.iam.api_key.permissions_updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamApiKeyRotated(
      Callback<V2IamApiKeyRotatedEventNotification> callback) {
    this.register("v2.iam.api_key.rotated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamApiKeyUpdated(
      Callback<V2IamApiKeyUpdatedEventNotification> callback) {
    this.register("v2.iam.api_key.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamStripeAccessGrantApproved(
      Callback<V2IamStripeAccessGrantApprovedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.approved", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamStripeAccessGrantCanceled(
      Callback<V2IamStripeAccessGrantCanceledEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamStripeAccessGrantDenied(
      Callback<V2IamStripeAccessGrantDeniedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.denied", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamStripeAccessGrantRemoved(
      Callback<V2IamStripeAccessGrantRemovedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.removed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamStripeAccessGrantRequested(
      Callback<V2IamStripeAccessGrantRequestedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.requested", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2IamStripeAccessGrantUpdated(
      Callback<V2IamStripeAccessGrantUpdatedEventNotification> callback) {
    this.register("v2.iam.stripe_access_grant.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementAdjustmentCreated(
      Callback<V2MoneyManagementAdjustmentCreatedEventNotification> callback) {
    this.register("v2.money_management.adjustment.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAccountCreated(
      Callback<V2MoneyManagementFinancialAccountCreatedEventNotification> callback) {
    this.register("v2.money_management.financial_account.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAccountUpdated(
      Callback<V2MoneyManagementFinancialAccountUpdatedEventNotification> callback) {
    this.register("v2.money_management.financial_account.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAccountStatementCreated(
      Callback<V2MoneyManagementFinancialAccountStatementCreatedEventNotification> callback) {
    this.register("v2.money_management.financial_account_statement.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAccountStatementRestated(
      Callback<V2MoneyManagementFinancialAccountStatementRestatedEventNotification> callback) {
    this.register("v2.money_management.financial_account_statement.restated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAddressActivated(
      Callback<V2MoneyManagementFinancialAddressActivatedEventNotification> callback) {
    this.register("v2.money_management.financial_address.activated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementFinancialAddressFailed(
      Callback<V2MoneyManagementFinancialAddressFailedEventNotification> callback) {
    this.register("v2.money_management.financial_address.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferAvailable(
      Callback<V2MoneyManagementInboundTransferAvailableEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.available", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitFailed(
      Callback<V2MoneyManagementInboundTransferBankDebitFailedEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitProcessing(
      Callback<V2MoneyManagementInboundTransferBankDebitProcessingEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_processing", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitQueued(
      Callback<V2MoneyManagementInboundTransferBankDebitQueuedEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_queued", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitReturned(
      Callback<V2MoneyManagementInboundTransferBankDebitReturnedEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementInboundTransferBankDebitSucceeded(
      Callback<V2MoneyManagementInboundTransferBankDebitSucceededEventNotification> callback) {
    this.register("v2.money_management.inbound_transfer.bank_debit_succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentCanceled(
      Callback<V2MoneyManagementOutboundPaymentCanceledEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentCreated(
      Callback<V2MoneyManagementOutboundPaymentCreatedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentFailed(
      Callback<V2MoneyManagementOutboundPaymentFailedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentPosted(
      Callback<V2MoneyManagementOutboundPaymentPostedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.posted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentReturned(
      Callback<V2MoneyManagementOutboundPaymentReturnedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundPaymentUpdated(
      Callback<V2MoneyManagementOutboundPaymentUpdatedEventNotification> callback) {
    this.register("v2.money_management.outbound_payment.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferCanceled(
      Callback<V2MoneyManagementOutboundTransferCanceledEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferCreated(
      Callback<V2MoneyManagementOutboundTransferCreatedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferFailed(
      Callback<V2MoneyManagementOutboundTransferFailedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferPosted(
      Callback<V2MoneyManagementOutboundTransferPostedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.posted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferReturned(
      Callback<V2MoneyManagementOutboundTransferReturnedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementOutboundTransferUpdated(
      Callback<V2MoneyManagementOutboundTransferUpdatedEventNotification> callback) {
    this.register("v2.money_management.outbound_transfer.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementPayoutMethodCreated(
      Callback<V2MoneyManagementPayoutMethodCreatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementPayoutMethodUpdated(
      Callback<V2MoneyManagementPayoutMethodUpdatedEventNotification> callback) {
    this.register("v2.money_management.payout_method.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditAvailable(
      Callback<V2MoneyManagementReceivedCreditAvailableEventNotification> callback) {
    this.register("v2.money_management.received_credit.available", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditFailed(
      Callback<V2MoneyManagementReceivedCreditFailedEventNotification> callback) {
    this.register("v2.money_management.received_credit.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditReturned(
      Callback<V2MoneyManagementReceivedCreditReturnedEventNotification> callback) {
    this.register("v2.money_management.received_credit.returned", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedCreditSucceeded(
      Callback<V2MoneyManagementReceivedCreditSucceededEventNotification> callback) {
    this.register("v2.money_management.received_credit.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitCanceled(
      Callback<V2MoneyManagementReceivedDebitCanceledEventNotification> callback) {
    this.register("v2.money_management.received_debit.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitFailed(
      Callback<V2MoneyManagementReceivedDebitFailedEventNotification> callback) {
    this.register("v2.money_management.received_debit.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitPending(
      Callback<V2MoneyManagementReceivedDebitPendingEventNotification> callback) {
    this.register("v2.money_management.received_debit.pending", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitSucceeded(
      Callback<V2MoneyManagementReceivedDebitSucceededEventNotification> callback) {
    this.register("v2.money_management.received_debit.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementReceivedDebitUpdated(
      Callback<V2MoneyManagementReceivedDebitUpdatedEventNotification> callback) {
    this.register("v2.money_management.received_debit.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementRecipientVerificationCreated(
      Callback<V2MoneyManagementRecipientVerificationCreatedEventNotification> callback) {
    this.register("v2.money_management.recipient_verification.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementRecipientVerificationUpdated(
      Callback<V2MoneyManagementRecipientVerificationUpdatedEventNotification> callback) {
    this.register("v2.money_management.recipient_verification.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementTransactionCreated(
      Callback<V2MoneyManagementTransactionCreatedEventNotification> callback) {
    this.register("v2.money_management.transaction.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2MoneyManagementTransactionUpdated(
      Callback<V2MoneyManagementTransactionUpdatedEventNotification> callback) {
    this.register("v2.money_management.transaction.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2OrchestratedCommerceAgreementConfirmed(
      Callback<V2OrchestratedCommerceAgreementConfirmedEventNotification> callback) {
    this.register("v2.orchestrated_commerce.agreement.confirmed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2OrchestratedCommerceAgreementCreated(
      Callback<V2OrchestratedCommerceAgreementCreatedEventNotification> callback) {
    this.register("v2.orchestrated_commerce.agreement.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2OrchestratedCommerceAgreementPartiallyConfirmed(
      Callback<V2OrchestratedCommerceAgreementPartiallyConfirmedEventNotification> callback) {
    this.register("v2.orchestrated_commerce.agreement.partially_confirmed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2OrchestratedCommerceAgreementTerminated(
      Callback<V2OrchestratedCommerceAgreementTerminatedEventNotification> callback) {
    this.register("v2.orchestrated_commerce.agreement.terminated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentAttemptFailed(
      Callback<V2PaymentsOffSessionPaymentAttemptFailedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.attempt_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentAttemptStarted(
      Callback<V2PaymentsOffSessionPaymentAttemptStartedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.attempt_started", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentAuthorizationAttemptFailed(
      Callback<V2PaymentsOffSessionPaymentAuthorizationAttemptFailedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.authorization_attempt_failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentAuthorizationAttemptStarted(
      Callback<V2PaymentsOffSessionPaymentAuthorizationAttemptStartedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.authorization_attempt_started", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentCanceled(
      Callback<V2PaymentsOffSessionPaymentCanceledEventNotification> callback) {
    this.register("v2.payments.off_session_payment.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentCreated(
      Callback<V2PaymentsOffSessionPaymentCreatedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentFailed(
      Callback<V2PaymentsOffSessionPaymentFailedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentPaused(
      Callback<V2PaymentsOffSessionPaymentPausedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.paused", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentRequiresCapture(
      Callback<V2PaymentsOffSessionPaymentRequiresCaptureEventNotification> callback) {
    this.register("v2.payments.off_session_payment.requires_capture", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentResumed(
      Callback<V2PaymentsOffSessionPaymentResumedEventNotification> callback) {
    this.register("v2.payments.off_session_payment.resumed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsOffSessionPaymentSucceeded(
      Callback<V2PaymentsOffSessionPaymentSucceededEventNotification> callback) {
    this.register("v2.payments.off_session_payment.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentCanceled(
      Callback<V2PaymentsSettlementAllocationIntentCanceledEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentCreated(
      Callback<V2PaymentsSettlementAllocationIntentCreatedEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentErrored(
      Callback<V2PaymentsSettlementAllocationIntentErroredEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.errored", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentFundsNotReceived(
      Callback<V2PaymentsSettlementAllocationIntentFundsNotReceivedEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.funds_not_received", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentMatched(
      Callback<V2PaymentsSettlementAllocationIntentMatchedEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.matched", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentNotFound(
      Callback<V2PaymentsSettlementAllocationIntentNotFoundEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.not_found", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentSettled(
      Callback<V2PaymentsSettlementAllocationIntentSettledEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.settled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentSubmitted(
      Callback<V2PaymentsSettlementAllocationIntentSubmittedEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent.submitted", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentSplitCanceled(
      Callback<V2PaymentsSettlementAllocationIntentSplitCanceledEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent_split.canceled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentSplitCreated(
      Callback<V2PaymentsSettlementAllocationIntentSplitCreatedEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent_split.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2PaymentsSettlementAllocationIntentSplitSettled(
      Callback<V2PaymentsSettlementAllocationIntentSplitSettledEventNotification> callback) {
    this.register("v2.payments.settlement_allocation_intent_split.settled", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ReportingReportRunCreated(
      Callback<V2ReportingReportRunCreatedEventNotification> callback) {
    this.register("v2.reporting.report_run.created", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ReportingReportRunFailed(
      Callback<V2ReportingReportRunFailedEventNotification> callback) {
    this.register("v2.reporting.report_run.failed", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ReportingReportRunSucceeded(
      Callback<V2ReportingReportRunSucceededEventNotification> callback) {
    this.register("v2.reporting.report_run.succeeded", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2ReportingReportRunUpdated(
      Callback<V2ReportingReportRunUpdatedEventNotification> callback) {
    this.register("v2.reporting.report_run.updated", callback);
    return this;
  }

  public StripeEventNotificationHandler onV2SignalsAccountSignalFraudulentMerchantReady(
      Callback<V2SignalsAccountSignalFraudulentMerchantReadyEventNotification> callback) {
    this.register("v2.signals.account_signal.fraudulent_merchant_ready", callback);
    return this;
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

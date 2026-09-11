---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2238
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.2.0-alpha.1
---

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

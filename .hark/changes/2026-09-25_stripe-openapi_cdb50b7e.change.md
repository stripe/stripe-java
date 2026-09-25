---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2300
semver_level: major
is_stripe_api_change: true
---

* Add support for new resources `v2.moneymanagement.EarnedCreditSimulation`, `v2.moneymanagement.EarnedCredit`, `v2.moneymanagement.FinancialAddressCreditSimulation`, and `v2.moneymanagement.FinancialAddressGeneratedMicrodeposits`
* ⚠️ Remove support for resources `v2.FinancialAddressCreditSimulation` and `v2.FinancialAddressGeneratedMicrodeposits`
* Add support for `earned_credits` method on resource `v2.moneymanagement.EarnedCreditSimulation`
* Add support for `list` and `retrieve` methods on resource `v2.moneymanagement.EarnedCredit`
* ⚠️ Remove support for `credit` method on resource `v2.FinancialAddressCreditSimulation`
* ⚠️ Remove support for `generate_microdeposits` method on resource `v2.FinancialAddressGeneratedMicrodeposits`
* Add support for `credit` method on resource `v2.moneymanagement.FinancialAddressCreditSimulation`
* Add support for `generate_microdeposits` method on resource `v2.moneymanagement.FinancialAddressGeneratedMicrodeposits`
* Add support for `capitalFinancingManualPayment` on `AccountSessionCreateParams.components`
* ⚠️ Remove support for `authorizedContentSecurityPolicy`, `authorizedEndpoints`, `authorizedPermissions`, and `state` on `apps.Install`
* Add support for `enabledPaymentTypes` on `capital.FinancingSummary.details`
* Add support for `cardAccountUpdate` on `Charge.payment_method_details.card`
* Add support for `billingCycleAnchor` on `PaymentLink.subscription_data.trial_settings.end_behavior`, `PaymentLinkCreateParams.subscription_data.trial_settings.end_behavior`, `PaymentLinkUpdateParams.subscription_data.trial_settings.end_behavior`, `checkout.Session.items[].subscription.trial_settings.end_behavior`, `checkout.SessionCreateParams.items[].subscription.trial_settings.end_behavior`, and `checkout.SessionCreateParams.subscription_data.trial_settings.end_behavior`
* Add support for `paymentMethodPreselect` on `checkout.Session.saved_payment_method_options` and `checkout.SessionCreateParams.saved_payment_method_options`
* Add support for `es` on `CustomerTaxExemptionCreateParams` and `CustomerTaxExemption`
* Add support for `enablementDetails` on `Invoice.automatic_tax` and `QuotePreviewInvoice.automatic_tax`
* Add support for new value `rerouted` on enums `PaymentAttemptRecordReportCanceledParams.reason`, `PaymentRecordReportPaymentAttemptCanceledParams.reason`, `PaymentRecordReportPaymentAttemptParams.canceled.reason`, and `PaymentRecordReportPaymentParams.canceled.reason`
* Add support for `returnCode` on `PaymentAttemptRecord.payment_method_details.us_bank_account` and `PaymentRecord.payment_method_details.us_bank_account`
* Add support for `requestCardAccountUpdate` on `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`
* ⚠️ Remove support for `name` on `productcatalog.TrialOffer`
* Add support for `status` on `tax.FormListParams` and `tax.Form`
* Add support for `cardNotPresentTransactions`, `grossAmountOfTransactionsDecimal`, `monthlyVolumes`, `paymentTransactionsCount`, and `stateIncomeTaxWithheld` on `tax.Form.us_1099_k`
* Add support for `cashTips`, `currency`, and `federalIncomeTaxWithheld` on `tax.Form.us_1099_k`, `tax.Form.us_1099_misc`, and `tax.Form.us_1099_nec`
* Add support for `cropInsuranceProceeds`, `directSalesForResale`, `excessGoldenParachutePayments`, `fatcaFilingRequired`, `fishPurchasedForResale`, `fishingBoatProceeds`, `grossProceedsPaidToAnAttorney`, `medicalAndHealthCarePayments`, `nonqualifiedDeferredCompensation`, `otherIncome`, `rents`, `royalties`, `section409aDeferrals`, and `substitutePayments` on `tax.Form.us_1099_misc`
* Add support for `overtimeCompensation`, `stateIncome`, and `stateTaxWithheld` on `tax.Form.us_1099_misc` and `tax.Form.us_1099_nec`
* Add support for `directSalesIndicator`, `fatcaFilingRequirement`, and `nonemployeeCompensation` on `tax.Form.us_1099_nec`
* ⚠️ Remove support for `tamperState` on `terminal.ReaderListParams`
* ⚠️ Remove support for `configurations` on `v2.core.AccountLink.use_case.account_onboarding`, `v2.core.AccountLink.use_case.account_update`, `v2.core.AccountLink.use_case.recipient_onboarding`, `v2.core.AccountLink.use_case.recipient_update`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding`, `v2.core.AccountLinkCreateParams.use_case.account_update`, `v2.core.AccountLinkCreateParams.use_case.recipient_onboarding`, and `v2.core.AccountLinkCreateParams.use_case.recipient_update`
* Add support for `satispayPayments` and `sequraPayments` on `v2.core.Account.configuration.merchant.capabilities`, `v2.core.AccountCreateParams.configuration.merchant.capabilities`, and `v2.core.AccountUpdateParams.configuration.merchant.capabilities`
* Add support for `ousd` on `v2.core.Account.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.Account.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.inbound`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.outbound`
* Add support for `relatedObject` and `request` on `v2.iam.ActivityLog`
* Add support for `accountSecurity`, `authentication`, `scim`, `sso`, and `userProfile` on `v2.iam.ActivityLog.details`
* Add support for `depositInsuranceEligibility` on `v2.moneymanagement.FinancialAccount.storage` and `v2.moneymanagement.FinancialAccountCreateParams.storage`
* ⚠️ Remove support for `level` on `v2.moneymanagement.InboundTransfer.transfer_history[]`
* Add support for `networkFeeDetails` on `v2.moneymanagement.OutboundPaymentQuote.estimated_fees[]` and `v2.moneymanagement.PayoutIntent.estimated_fees[]`
* Add support for `archived` on `v2.moneymanagement.PayoutMethod`
* ⚠️ Remove support for `archived` on `v2.moneymanagement.PayoutMethod.bank_account`, `v2.moneymanagement.PayoutMethod.card`, and `v2.moneymanagement.PayoutMethod.crypto_wallet`
* Add support for `networkDetails` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
* Add support for `earnedCredit` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* ⚠️ Remove support for `retryUntil` on `v2.payments.OffSessionPayment.retry_details`
* ⚠️ Remove support for `cvc` on `v2.payments.OffSessionPaymentCreateParams.payment_method_data.card`
* ⚠️ Remove support for `createdGt`, `createdGte`, `createdLt`, and `createdLte` on `v2.moneymanagement.AdjustmentListParams`, `v2.moneymanagement.InboundTransferListParams`, `v2.moneymanagement.ReceivedCreditListParams`, `v2.moneymanagement.TransactionEntryListParams`, and `v2.moneymanagement.TransactionListParams`
* ⚠️ Change type of `v2.moneymanagement.AdjustmentListParams.created`, `v2.moneymanagement.InboundTransferListParams.created`, `v2.moneymanagement.ReceivedCreditListParams.created`, `v2.moneymanagement.TransactionEntryListParams.created`, and `v2.moneymanagement.TransactionListParams.created` from `DateTime` to `an object`
* Add support for new value `ineligible` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.payments`
* Add support for new value `ineligible` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.transfers`
* Add support for `fromResource` on `v2.moneymanagement.OutboundSetupIntentCreateParams`
* Add support for new value `storage.deposit_insurance_eligibility` on enums `v2.moneymanagement.FinancialAccountListParams.include` and `v2.moneymanagement.FinancialAccountRetrieveParams.include`
* Add support for new values `account_security`, `authentication`, `issuing`, `payout`, `scim`, `sso`, and `user_profile` on enum `v2.iam.ActivityLogListParams.actionGroups`
* Add support for new values `anomaly_detection_settings_updated`, `issuing_activated`, `issuing_balance_transfer_created`, `issuing_card_created`, `issuing_card_sensitive_details_viewed`, `issuing_card_updated`, `issuing_cardholder_created`, `issuing_cardholder_updated`, `issuing_dispute_created`, `issuing_dispute_submitted`, `issuing_dispute_updated`, `manual_payouts_disabled`, `manual_payouts_enabled`, `payout_destination_added`, `payout_destination_removed`, `payout_destination_updated`, `payout_schedule_edits_disabled`, `payout_schedule_edits_enabled`, `scim_group_deleted`, `scim_group_member_added`, `scim_group_member_removed`, `scim_group_roles_updated`, `scim_group_updated`, `sso_domain_verified`, `sso_settings_created`, `sso_settings_deleted`, `sso_settings_updated`, `two_step_authentication_mandate_disabled`, `two_step_authentication_mandate_enabled`, `user_auth_challenge_failed`, `user_email_changed`, `user_email_verified`, `user_express_phone_number_changed`, `user_google_account_connected`, `user_google_account_disconnected`, `user_passkey_added`, `user_passkey_removed`, `user_passkey_updated`, `user_passkey_upgraded`, `user_password_changed`, `user_password_initialized`, `user_password_reset_failed`, `user_password_reset_requested`, `user_password_reset_succeeded`, `user_two_step_authentication_backup_code_used`, `user_two_step_authentication_method_added`, `user_two_step_authentication_method_removed`, `user_two_step_authentication_method_reset`, `user_two_step_authentication_method_updated`, and `user_two_step_authentication_reset_requested` on enum `v2.iam.ActivityLogListParams.actions`
* Add support for `sepaDebitPayments` on `v2.core.AccountCreateParams.configuration.merchant` and `v2.core.AccountUpdateParams.configuration.merchant`
* ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].overwrite_price.unitAmount`, `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].overwrite_price.unitAmount`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.overwrite_price.unitAmount` from `string` to `decimal_string`
* ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_overrides[].multiply_pricing.factor` from `string` to `decimal_string`
* Add support for `billingSettings` on `v2.billing.ContractUpdateParams`
* Add support for new values `satispay_payments` and `sequra_payments` on enum `EventsV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for new values `business_storage.inbound.ousd` and `business_storage.outbound.ousd` on enum `EventsV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for `treasuryTransaction` on `EventsV2MoneyManagementTransactionUpdatedEvent`
* ⚠️ Remove support for `account`, `evaluatedAt`, `fraudulentMerchant`, and `type` on `EventsV2SignalsAccountSignalFraudulentMerchantReadyEvent`
* Add support for event notification `V2MoneyManagementEarnedCreditSucceededEvent` with related object `v2.moneymanagement.EarnedCredit`
* Add support for error types `InvalidVaultedCredentialException`, `VerificationAttemptFailedException`, `VerificationExpiredException`, and `VerificationNotInitiatedException`
* ⚠️ Remove support for error type `ControlledByDashboardException`

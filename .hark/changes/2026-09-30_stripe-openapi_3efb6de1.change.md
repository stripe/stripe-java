---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2279
semver_level: major
is_stripe_api_change: true
released_in_version: 34.1.0-beta.1
---

* Add support for new resources `radar.BillingEvaluation`, `v2.moneymanagement.FinancialAddressCreditSimulation`, and `v2.moneymanagement.FinancialAddressGeneratedMicrodeposits`
* ⚠️ Remove support for resources `v2.FinancialAddressCreditSimulation` and `v2.FinancialAddressGeneratedMicrodeposits`
* Add support for `create` method on resource `radar.BillingEvaluation`
* Add support for `list` method on resource `reserve.Plan`
* Add support for `credit` method on resource `v2.moneymanagement.FinancialAddressCreditSimulation`
* Add support for `generate_microdeposits` method on resource `v2.moneymanagement.FinancialAddressGeneratedMicrodeposits`
* ⚠️ Remove support for `credit` method on resource `v2.FinancialAddressCreditSimulation`
* ⚠️ Remove support for `generate_microdeposits` method on resource `v2.FinancialAddressGeneratedMicrodeposits`
* Add support for `afterExpiration` on `billingportal.SessionCreateParams` and `billingportal.Session`
* Add support for `setupCredentialUsage` on `Charge.payment_method_details.card`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, `SetupIntent.payment_method_options.card`, `SetupIntentConfirmParams.payment_method_options.card`, `SetupIntentCreateParams.payment_method_options.card`, and `SetupIntentUpdateParams.payment_method_options.card`
* Add support for `storedCredentialUsage` on `Charge.payment_method_details.card`, `PaymentAttemptRecord.payment_method_details.card`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, and `PaymentRecord.payment_method_details.card`
* Add support for `expiresAt` on `Subscription.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionCreateParams.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options.blik.mandate_options`, and `checkout.SessionCreateParams.payment_method_options.blik.mandate_options`
* ⚠️ Remove support for `expiresAfter` on `Subscription.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionCreateParams.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options.blik.mandate_options`, and `checkout.SessionCreateParams.payment_method_options.blik.mandate_options`
* ⚠️ Remove support for value `on_session` from enum `checkout.SessionCreateParams.payment_method_options.blik.setupFutureUsage`
* Add support for `paymentIntentData` on `checkout.SessionUpdateParams`
* Add support for `appeal` on `Dispute.evidence` and `DisputeUpdateParams.evidence`
* Add support for `livemode` on `FxQuote`
* ⚠️ Remove support for `captureMethod` on `PaymentIntentConfirmParams.payment_method_options.paypay`, `PaymentIntentCreateParams.payment_method_options.paypay`, and `PaymentIntentUpdateParams.payment_method_options.paypay`
* Add support for `active` on `productcatalog.TrialOfferCreateParams`, `productcatalog.TrialOfferListParams`, and `productcatalog.TrialOffer`
* Add support for `nickname` on `productcatalog.TrialOfferCreateParams` and `productcatalog.TrialOffer`
* ⚠️ Remove support for `name` on `productcatalog.TrialOfferCreateParams` and `productcatalog.TrialOffer`
* Add support for `statusDetails` on `QuotePreviewInvoice`
* Add support for `companyDetails` and `reference` on `QuotePreviewInvoice.payment_settings.payment_method_options.billie`
* Add support for `pauseSchedules` on `QuotePreviewSubscriptionSchedule`
* Add support for `destination` on `reserve.Hold`, `reserve.Plan`, and `reserve.Release`
* Add support for `manualRelease` on `reserve.Plan`
* Add support for new value `igic` on enum `tax.RegistrationCreateParams.country_options.es.type`
* ⚠️ Remove support for `configurations` on `v2.core.AccountLink.use_case.account_onboarding`, `v2.core.AccountLink.use_case.account_update`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding`, and `v2.core.AccountLinkCreateParams.use_case.account_update`
* Add support for `relatedObject` and `request` on `v2.iam.ActivityLog`
* Add support for `accountSecurity`, `authentication`, `scim`, `sso`, and `userProfile` on `v2.iam.ActivityLog.details`
* Add support for `depositInsuranceEligibility` on `v2.moneymanagement.FinancialAccount.storage` and `v2.moneymanagement.FinancialAccountCreateParams.storage`
* Add support for `bankAccount` on `v2.moneymanagement.FinancialAddressCreateParams` and `v2.moneymanagement.FinancialAddress`
* Add support for `type` on `v2.moneymanagement.FinancialAddress`
* ⚠️ Remove support for `credentials` and `currency` on `v2.moneymanagement.FinancialAddress`
* ⚠️ Remove support for `level` on `v2.moneymanagement.InboundTransfer.transfer_history[]`
* Add support for `networkFeeDetails` on `v2.moneymanagement.OutboundPaymentQuote.estimated_fees[]`
* Add support for `archived` on `v2.moneymanagement.PayoutMethod`
* ⚠️ Remove support for `archived` on `v2.moneymanagement.PayoutMethod.bank_account` and `v2.moneymanagement.PayoutMethod.card`
* Add support for `amountReceived` on `v2.moneymanagement.ReceivedCredit`
* Add support for `originatingBankAccount` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* ⚠️ Remove support for `originType` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Add support for `identity` on `v2.signals.AccountActivity.account_details.data`, `v2.signals.AccountActivityCreateParams.account_details.data`, `v2.signals.AccountEvaluation.account_details.data`, and `v2.signals.AccountEvaluationCreateParams.account_details.data`
* Add support for `fraudulentWebsite` on `v2.signals.AccountEvaluation.evaluated_signals` and `v2.signals.AccountSignal`
* Add support for `fraudulentMerchant` on `v2.signals.AccountSignal`
* Add support for new values `fraudulent_merchant` and `fraudulent_website` on enum `v2.signals.AccountSignalListParams.type`
* Add support for new value `fraudulent_website` on enum `v2.signals.AccountEvaluationCreateParams.requestedSignals`
* ⚠️ Remove support for `createdGt`, `createdGte`, `createdLt`, and `createdLte` on `v2.moneymanagement.AdjustmentListParams`, `v2.moneymanagement.InboundTransferListParams`, `v2.moneymanagement.ReceivedCreditListParams`, `v2.moneymanagement.TransactionEntryListParams`, and `v2.moneymanagement.TransactionListParams`
* ⚠️ Change type of `v2.moneymanagement.AdjustmentListParams.created`, `v2.moneymanagement.InboundTransferListParams.created`, `v2.moneymanagement.ReceivedCreditListParams.created`, `v2.moneymanagement.TransactionEntryListParams.created`, and `v2.moneymanagement.TransactionListParams.created` from `DateTime` to `an object`
* Add support for new value `ineligible` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.payments`
* Add support for new value `ineligible` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.transfers`
* ⚠️ Remove support for `include` on `v2.moneymanagement.FinancialAddressListParams` and `v2.moneymanagement.FinancialAddressRetrieveParams`
* Add support for `settlementCurrency` on `v2.moneymanagement.FinancialAddressCreateParams`
* ⚠️ Add support for new value `bank_account` on enum `v2.moneymanagement.FinancialAddressCreateParams.type`
* ⚠️ Remove support for values `gb_bank_account` and `us_bank_account` from enum `v2.moneymanagement.FinancialAddressCreateParams.type`
* Add support for `include` on `v2.moneymanagement.FinancialAccountListParams` and `v2.moneymanagement.FinancialAccountRetrieveParams`
* Add support for new values `account_security`, `authentication`, `issuing`, `payout`, `scim`, `sso`, and `user_profile` on enum `v2.iam.ActivityLogListParams.actionGroups`
* Add support for new values `anomaly_detection_settings_updated`, `issuing_activated`, `issuing_balance_transfer_created`, `issuing_card_created`, `issuing_card_sensitive_details_viewed`, `issuing_card_updated`, `issuing_cardholder_created`, `issuing_cardholder_updated`, `issuing_dispute_created`, `issuing_dispute_submitted`, `issuing_dispute_updated`, `manual_payouts_disabled`, `manual_payouts_enabled`, `payout_destination_added`, `payout_destination_removed`, `payout_destination_updated`, `payout_schedule_edits_disabled`, `payout_schedule_edits_enabled`, `scim_group_deleted`, `scim_group_member_added`, `scim_group_member_removed`, `scim_group_roles_updated`, `scim_group_updated`, `sso_domain_verified`, `sso_settings_created`, `sso_settings_deleted`, `sso_settings_updated`, `two_step_authentication_mandate_disabled`, `two_step_authentication_mandate_enabled`, `user_auth_challenge_failed`, `user_email_changed`, `user_email_verified`, `user_express_phone_number_changed`, `user_google_account_connected`, `user_google_account_disconnected`, `user_passkey_added`, `user_passkey_removed`, `user_passkey_updated`, `user_passkey_upgraded`, `user_password_changed`, `user_password_initialized`, `user_password_reset_failed`, `user_password_reset_requested`, `user_password_reset_succeeded`, `user_two_step_authentication_backup_code_used`, `user_two_step_authentication_method_added`, `user_two_step_authentication_method_removed`, `user_two_step_authentication_method_reset`, `user_two_step_authentication_method_updated`, and `user_two_step_authentication_reset_requested` on enum `v2.iam.ActivityLogListParams.actions`
* Add support for `treasuryTransaction` on `EventsV2MoneyManagementTransactionUpdatedEvent`
* Add support for event notifications `V2SignalsAccountSignalFraudulentMerchantReadyEvent` and `V2SignalsAccountSignalFraudulentWebsiteReadyEvent` with related object `v2.signals.AccountSignal`
* Add support for error types `InvalidVaultedCredentialException`, `VerificationAttemptFailedException`, `VerificationExpiredException`, and `VerificationNotInitiatedException`
* ⚠️ Remove support for error type `ControlledByDashboardException`

---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2300
semver_level: major
is_stripe_api_change: true
---

* Add support for new resources `v2.data.QueryRun`, `v2.data.ReportRun`, `v2.data.Report`, `v2.data.Schema`, `v2.moneymanagement.EarnedCreditSimulation`, `v2.moneymanagement.EarnedCredit`, and `v2.provisioning.ResourceAccessConfiguration`
* Add support for `earned_credits` method on resource `v2.moneymanagement.EarnedCreditSimulation`
* Add support for `list` and `retrieve` methods on resources `v2.data.Report`, `v2.data.Schema`, and `v2.moneymanagement.EarnedCredit`
* Add support for `create` and `retrieve` methods on resources `v2.data.QueryRun` and `v2.data.ReportRun`
* Add support for `reveal_access_configuration` method on resource `v2.provisioning.Resource`
* Add support for `refresh_regulatory_receipt` method on resource `v2.moneymanagement.Transaction`
* Add support for `capitalFinancingManualPayment` on `AccountSessionCreateParams.components`
* ⚠️ Remove support for `authorizedContentSecurityPolicy`, `authorizedEndpoints`, `authorizedPermissions`, and `state` on `apps.Install`
* Add support for `financingDocuments` on `capital.FinancingOffer`
* Add support for `enabledPaymentTypes` and `overdueAmount` on `capital.FinancingSummary.details`
* Add support for `cardAccountUpdate` on `Charge.payment_method_details.card`
* Add support for `onBehalfOf` on `checkout.SessionCreateParams`
* Add support for `billingCycleAnchor` on `PaymentLink.subscription_data.trial_settings.end_behavior`, `PaymentLinkCreateParams.subscription_data.trial_settings.end_behavior`, `PaymentLinkUpdateParams.subscription_data.trial_settings.end_behavior`, `checkout.Session.items[].subscription.trial_settings.end_behavior`, `checkout.SessionCreateParams.items[].subscription.trial_settings.end_behavior`, and `checkout.SessionCreateParams.subscription_data.trial_settings.end_behavior`
* Add support for `paymentMethodPreselect` on `checkout.Session.saved_payment_method_options` and `checkout.SessionCreateParams.saved_payment_method_options`
* Add support for `es` on `CustomerTaxExemptionCreateParams` and `CustomerTaxExemption`
* ⚠️ Remove support for `financialActivity` on `financialconnections.Transaction.classifications[]`
* Add support for `enablementDetails` on `Invoice.automatic_tax` and `QuotePreviewInvoice.automatic_tax`
* Add support for new value `squads` on enum `issuing.CardCreateParams.crypto_wallet.type`
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
* ⚠️ Remove support for `configurations` on `v2.core.AccountLink.use_case.recipient_onboarding`, `v2.core.AccountLink.use_case.recipient_update`, `v2.core.AccountLinkCreateParams.use_case.recipient_onboarding`, and `v2.core.AccountLinkCreateParams.use_case.recipient_update`
* Add support for `ousd` on `v2.core.Account.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.Account.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.inbound`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.outbound`
* Add support for `origin` on `v2.core.vault.NetworkToken`
* Add support for `bic` on `v2.moneymanagement.FinancialAddress.bank_account.aba`, `v2.moneymanagement.FinancialAddress.bank_account.cpa`, `v2.moneymanagement.FinancialAddress.bank_account.iban`, and `v2.moneymanagement.FinancialAddress.bank_account.sort_code`
* Add support for `iban` on `v2.moneymanagement.FinancialAddress.bank_account.sort_code`
* Add support for `statementDescriptor` on `v2.moneymanagement.InboundTransferCreateParams` and `v2.moneymanagement.InboundTransfer`
* Add support for `networkFeeDetails` on `v2.moneymanagement.PayoutIntent.estimated_fees[]`
* ⚠️ Remove support for `archived` on `v2.moneymanagement.PayoutMethod.crypto_wallet`
* Add support for `networkDetails` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
* Add support for `earnedCredit` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for `regulatoryReceipt` on `v2.moneymanagement.Transaction`
* ⚠️ Remove support for `retryUntil` on `v2.payments.OffSessionPayment.retry_details`
* ⚠️ Remove support for `cvc` on `v2.payments.OffSessionPaymentCreateParams.payment_method_data.card`
* Add support for `fromResource` on `v2.moneymanagement.OutboundSetupIntentCreateParams`
* Add support for new value `storage.deposit_insurance_eligibility` on enums `v2.moneymanagement.FinancialAccountListParams.include` and `v2.moneymanagement.FinancialAccountRetrieveParams.include`
* Add support for new values `account_security`, `authentication`, `issuing`, `payout`, `scim`, `sso`, and `user_profile` on enum `v2.iam.ActivityLogListParams.actionGroups`
* Change type of `v2.core.vault.NetworkTokenCreateFromCredentialParams.card.origin` and `v2.core.vault.NetworkTokenCreateParams.card.origin` from `literal('card_on_file')` to `enum('card_on_file'|'wallet')`
* Change type of `v2.core.vault.NetworkTokenCreateFromCredentialParams.type` and `v2.core.vault.NetworkTokenCreateParams.type` from `literal('card')` to `enum('card')`
* Change type of `v2.core.vault.NetworkTokenGenerateCryptogramParams.type` from `literal('token_cryptogram')` to `enum('token_cryptogram')`
* ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].overwrite_price.unitAmount`, `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].overwrite_price.unitAmount`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.overwrite_price.unitAmount` from `string` to `decimal_string`
* ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_overrides[].multiply_pricing.factor` from `string` to `decimal_string`
* Add support for `billingSettings` on `v2.billing.ContractUpdateParams`
* Add support for new values `business_storage.inbound.ousd` and `business_storage.outbound.ousd` on enum `EventsV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.updatedCapability`
* ⚠️ Remove support for `account`, `evaluatedAt`, `fraudulentMerchant`, and `type` on `EventsV2SignalsAccountSignalFraudulentMerchantReadyEvent`
* Add support for event notifications `V2DataQueryRunCreatedEvent`, `V2DataQueryRunFailedEvent`, `V2DataQueryRunSucceededEvent`, and `V2DataQueryRunUpdatedEvent` with related object `v2.data.QueryRun`
* Add support for event notifications `V2DataReportRunCreatedEvent`, `V2DataReportRunFailedEvent`, `V2DataReportRunSucceededEvent`, and `V2DataReportRunUpdatedEvent` with related object `v2.data.ReportRun`
* Add support for event notification `V2MoneyManagementEarnedCreditSucceededEvent` with related object `v2.moneymanagement.EarnedCredit`

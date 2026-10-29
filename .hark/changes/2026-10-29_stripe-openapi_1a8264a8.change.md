---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2310
semver_level: major
is_stripe_api_change: true
released_in_version: 34.2.0-beta.1
---

* Add support for new resources `PaymentPlan`, `v2.data.QueryRun`, `v2.data.ReportRun`, `v2.data.Report`, and `v2.data.Schema`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `PaymentPlan`
* Add support for `list` and `retrieve` methods on resources `v2.data.Report` and `v2.data.Schema`
* Add support for `create` and `retrieve` methods on resources `v2.data.QueryRun` and `v2.data.ReportRun`
* ⚠️ Remove support for `acknowledge_confirmation_of_payee` and `initiate_confirmation_of_payee` methods on resource `v2.core.vault.GbBankAccount`
* Add support for `settlementCurrencies` on `BalanceSettings.payments` and `BalanceSettingsUpdateParams.payments`
* Add support for `defaultSettlementCurrency` on `BalanceSettings.payments`
* Add support for `wero` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new value `mandiri` on enums `ConfirmationTokenCreateParams.payment_method_data.id_bank_transfer.bank`, `PaymentIntentConfirmParams.payment_method_data.id_bank_transfer.bank`, `PaymentIntentCreateParams.payment_method_data.id_bank_transfer.bank`, `PaymentIntentUpdateParams.payment_method_data.id_bank_transfer.bank`, `PaymentMethodCreateParams.id_bank_transfer.bank`, `SetupIntentConfirmParams.payment_method_data.id_bank_transfer.bank`, `SetupIntentCreateParams.payment_method_data.id_bank_transfer.bank`, and `SetupIntentUpdateParams.payment_method_data.id_bank_transfer.bank`
* Add support for new value `wero` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for `externalToken` on `ConfirmationTokenCreateParams.payment_method_data.us_bank_account`, `PaymentIntentConfirmParams.payment_method_data.us_bank_account`, `PaymentIntentCreateParams.payment_method_data.us_bank_account`, `PaymentIntentUpdateParams.payment_method_data.us_bank_account`, `PaymentMethodCreateParams.us_bank_account`, `SetupIntentConfirmParams.payment_method_data.us_bank_account`, `SetupIntentCreateParams.payment_method_data.us_bank_account`, `SetupIntentUpdateParams.payment_method_data.us_bank_account`, and `treasury.OutboundPaymentCreateParams.destination_payment_method_data.us_bank_account`
* Add support for new value `wero` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `paymentPlan` on `Invoice`
* Add support for new values `au_acn`, `au_wpn`, `bw_vat`, `ci_vat`, `cz_dic`, `fr_siren`, `fr_siret`, `fr_spi`, `gh_tin`, `is_kt`, `md_cf`, `mu_vat`, `mz_nuit`, `nz_bn`, `pt_nif`, `sm_coe`, `tt_bir`, and `tt_vat` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for new value `wero` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* ⚠️ Remove support for `defaultOutboundDestination` on `v2.core.Account.configuration.recipient` and `v2.core.AccountUpdateParams.configuration.recipient`
* Add support for `cryptoWallets` on `v2.core.Account.configuration.recipient.capabilities`, `v2.core.AccountCreateParams.configuration.recipient.capabilities`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities`
* Add support for `ach`, `fedwire`, `fps`, `rtp`, `sepa`, and `swift` on `v2.core.Account.configuration.recipient.capabilities.bank_accounts`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts`
* ⚠️ Remove support for `wire` on `v2.core.Account.configuration.recipient.capabilities.bank_accounts`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts`
* Add support for `proofOfBusinessPresence` on `v2.core.Account.identity.business_details.documents`, `v2.core.AccountCreateParams.identity.business_details.documents`, `v2.core.AccountTokenCreateParams.identity.business_details.documents`, and `v2.core.AccountUpdateParams.identity.business_details.documents`
* Add support for `partialOutputFile` on `v2.core.BatchJob.status_details.batch_failed`
* Add support for `fingerprint` on `v2.core.vault.GbBankAccount`, `v2.core.vault.UsBankAccount`, and `v2.moneymanagement.PayoutMethod.bank_account`
* Add support for `fedwireFingerprint` on `v2.core.vault.UsBankAccount`
* Add support for `address` on `v2.moneymanagement.FinancialAddress.bank_account.aba`
* ⚠️ Remove support for `accountHolderAddress` on `v2.moneymanagement.FinancialAddress.bank_account.aba`
* ⚠️ Remove support for `last4` on `v2.moneymanagement.FinancialAddress.bank_account.aba`, `v2.moneymanagement.FinancialAddress.bank_account.iban`, and `v2.moneymanagement.FinancialAddress.bank_account.sort_code`
* ⚠️ Remove support for `country` on `v2.moneymanagement.FinancialAddress.bank_account.iban`
* Add support for `taxAmount` on `v2.moneymanagement.OutboundPaymentQuote.estimated_fees[]`
* Add support for `payoutMethodOptions` on `v2.moneymanagement.OutboundPayment.to`, `v2.moneymanagement.OutboundPaymentCreateParams.to`, `v2.moneymanagement.OutboundPaymentQuote.to`, `v2.moneymanagement.OutboundPaymentQuoteCreateParams.to`, `v2.moneymanagement.OutboundTransfer.to`, and `v2.moneymanagement.OutboundTransferCreateParams.to`
* Add support for `payoutIntent` and `trackingDetails` on `v2.moneymanagement.OutboundPayment`
* Add support for `recipientVerification` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundPayment`
* Add support for `cryptoWallet` on `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data` and `v2.moneymanagement.PayoutMethod`
* Add support for `network` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* ⚠️ Remove support for `gbBankAccount`, `sepaBankAccount`, and `usBankAccount` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* ⚠️ Remove support for `network` on `v2.moneymanagement.ReceivedCredit.bank_transfer.originating_bank_account.aba`, `v2.moneymanagement.ReceivedCredit.bank_transfer.originating_bank_account.iban`, and `v2.moneymanagement.ReceivedCredit.bank_transfer.originating_bank_account.sort_code`
* Add support for `feeBatch` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* ⚠️ Remove support for `feeTransaction` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for `metadata` and `regulatoryReceipt` on `v2.moneymanagement.Transaction`
* Add support for `contactEmail` on `v2.signals.AccountActivity.account_details.data`, `v2.signals.AccountActivityCreateParams.account_details.data`, `v2.signals.AccountEvaluation.account_details.data`, and `v2.signals.AccountEvaluationCreateParams.account_details.data`
* Add support for new values `fedwire` and `sepa` on enum `v2.moneymanagement.FinancialAddressCreditSimulationCreditParams.network`
* Add support for `statementDescriptor` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundTransferCreateParams`
* ⚠️ Remove support for `createdGt`, `createdGte`, `createdLt`, and `createdLte` on `v2.moneymanagement.OutboundPaymentListParams`
* ⚠️ Change type of `v2.moneymanagement.OutboundPaymentListParams.created` from `DateTime` to `an object`
* ⚠️ Remove support for `settlementCurrency` on `v2.moneymanagement.FinancialAddressCreateParams`
* Add support for new value `eur` on enum `v2.moneymanagement.FinancialAddressCreateParams.bank_account.currency`
* ⚠️ Remove support for `depositInsuranceEligibility` on `v2.moneymanagement.FinancialAccountCreateParams.storage`
* ⚠️ Change type of `v2.core.vault.UsBankAccountListParams.verificationStatus` from `string` to `enum('awaiting_verification'|'unverified'|'verification_failed'|'verified')`
* ⚠️ Remove support for values `futsu` and `toza` from enum `v2.core.vault.GbBankAccountCreateParams.bankAccountType`
* Add support for new value `physical` on enums `v2.core.AccountCreateParams.identity.business_details.additional_addresses[].purpose`, `v2.core.AccountTokenCreateParams.identity.business_details.additional_addresses[].purpose`, and `v2.core.AccountUpdateParams.identity.business_details.additional_addresses[].purpose`
* Add support for snapshot events `payment_plan.created`, `payment_plan.installment_due`, `payment_plan.installment_paid`, `payment_plan.installment_will_be_due`, and `payment_plan.updated` with resource `PaymentPlan`
* Add support for event notifications `V2DataQueryRunCreatedEvent`, `V2DataQueryRunFailedEvent`, `V2DataQueryRunSucceededEvent`, and `V2DataQueryRunUpdatedEvent` with related object `v2.data.QueryRun`
* Add support for event notifications `V2DataReportRunCreatedEvent`, `V2DataReportRunFailedEvent`, `V2DataReportRunSucceededEvent`, and `V2DataReportRunUpdatedEvent` with related object `v2.data.ReportRun`

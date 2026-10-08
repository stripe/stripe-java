---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2311
semver_level: major
is_stripe_api_change: true
released_in_version: 34.1.0-alpha.2
---

* Add support for new resources `radar.Rule`, `v2.moneymanagement.FundingSession`, and `v2.moneymanagement.InboundTransferMandate`
* Add support for `cancel`, `create`, `list`, and `retrieve` methods on resource `v2.moneymanagement.InboundTransferMandate`
* Add support for `create` method on resource `v2.moneymanagement.FundingSession`
* Add support for `excludedPayoutDestinations` on `AccountUpdateParams.settings.capital`
* Add support for `weroPayments` on `Account.capabilities`
* ⚠️ Change type of `Charge.outcome.rule` from `RadarRule` to `$Radar.Rule`
* Add support for `location` and `reader` on `Charge.payment_method_details.swish`, `PaymentAttemptRecord.payment_method_details.swish`, and `PaymentRecord.payment_method_details.swish`
* Add support for `paymentSettings` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for `onBehalfOf` on `checkout.Session`
* Add support for `flexibleCredential` on `issuing.Authorization`
* Add support for `fuels` on `issuing.Transaction.purchase_details`
* Add support for `usBankAccount` on `PaymentAttemptRecordReportFailedParams.payment_method_details`, `PaymentRecordReportPaymentAttemptFailedParams.payment_method_details`, `PaymentRecordReportPaymentAttemptParams.payment_method_details`, `PaymentRecordReportPaymentParams.payment_method_details`, `radar.PaymentEvaluation.payment_details.money_movement_details`, and `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details`
* Change type of `PaymentAttemptRecordReportFailedParams.payment_method_details.type` and `PaymentRecordReportPaymentAttemptFailedParams.payment_method_details.type` from `literal('card')` to `enum('card'|'us_bank_account')`
* Add support for `fleet` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
* Add support for `subscriptionReference` on `PaymentIntent.payment_method_options.paypay`, `PaymentIntentConfirmParams.payment_method_options.paypay`, `PaymentIntentCreateParams.payment_method_options.paypay`, and `PaymentIntentUpdateParams.payment_method_options.paypay`
* Add support for new value `us_bank_account` on enums `PaymentRecordReportPaymentAttemptParams.payment_method_details.type` and `PaymentRecordReportPaymentParams.payment_method_details.type`
* Add support for `enablementDetails` on `QuotePreviewSubscriptionSchedule.default_settings.automatic_tax`, `QuotePreviewSubscriptionSchedule.phases[].automatic_tax`, `Subscription.automatic_tax`, `SubscriptionSchedule.default_settings.automatic_tax`, and `SubscriptionSchedule.phases[].automatic_tax`
* Change type of `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details.moneyMovementType` from `literal('card')` to `enum('card'|'us_bank_account')`
* Add support for `rules` on `radar.PaymentEvaluation`
* ⚠️ Change type of `radar.PaymentEvaluation.payment_details.money_movement_details.moneyMovementType` from `literal('card')` to `enum('card'|'us_bank_account')`
* Add support for `bankInitiatedReturn` on `radar.PaymentEvaluation.signals`
* Add support for new value `hour` on enums `sharedpayment.GrantedTokenCreateParams.usage_limits.recurring.interval` and `sharedpayment.IssuedTokenCreateParams.usage_limits.recurring.interval`
* Add support for new values `digital_excise_tax` and `utility_users_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
* Add support for `utilityUsersTax` on `tax.Registration.country_options.us`
* Add support for `enableCustomerCancellation` on `terminal.ReaderActivateGiftCardParams`, `terminal.ReaderCashoutGiftCardParams`, `terminal.ReaderCheckGiftCardBalanceParams`, and `terminal.ReaderReloadGiftCardParams`
* Add support for `vippsPayments` on `v2.core.Account.configuration.merchant.capabilities`, `v2.core.AccountCreateParams.configuration.merchant.capabilities`, and `v2.core.AccountUpdateParams.configuration.merchant.capabilities`
* Add support for `businessCustodialStorage` on `v2.core.Account.configuration.money_manager.capabilities`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities`
* Add support for `offramp` and `onramp` on `v2.core.Account.configuration.money_manager.capabilities.outbound_payments`, `v2.core.Account.configuration.money_manager.capabilities.outbound_transfers`, `v2.core.Account.configuration.money_manager.capabilities.received_credits`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.outbound_payments`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.outbound_transfers`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.received_credits`, `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.outbound_payments`, `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.outbound_transfers`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.received_credits`
* Add support for `pix` on `v2.core.Account.configuration.recipient.capabilities`, `v2.core.AccountCreateParams.configuration.recipient.capabilities`, `v2.core.AccountUpdateParams.configuration.recipient.capabilities`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data`, and `v2.moneymanagement.PayoutMethod`
* Add support for `account` on `v2.moneymanagement.FinancialAddressCreateParams`, `v2.moneymanagement.FinancialAddressListParams`, and `v2.moneymanagement.FinancialAddress`
* Add support for `supportedNetworkDetails` on `v2.moneymanagement.FinancialAddress.crypto_wallet`
* Add support for `networkDetails` on `v2.moneymanagement.InboundTransferCreateParams` and `v2.moneymanagement.InboundTransfer`
* Add support for `bacsDebit` on `v2.moneymanagement.InboundTransfer.from.payment_method`
* Add support for `bic` on `v2.moneymanagement.ReceivedCredit.bank_transfer.originating_bank_account.aba` and `v2.moneymanagement.ReceivedCredit.bank_transfer.originating_bank_account.sort_code`
* Add support for `originatingCryptoWallet`, `tokenCurrency`, and `transactionHash` on `v2.moneymanagement.ReceivedCredit.crypto_wallet_transfer`
* Add support for `invoices` on `v2.tax.IntegrationConfigurationUpdateParams` and `v2.tax.IntegrationConfiguration`
* ⚠️ Remove support for `account` on `v2.risk.InquiryListParams`
* Add support for new value `pix` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* Add support for new values `brl`, `cop`, and `ngn` on enum `v2.moneymanagement.FinancialAddressCreateParams.bank_account.currency`
* Add support for new value `bitcoin` on enum `v2.moneymanagement.FinancialAddressCreateParams.crypto_wallet.network`
* Add support for `customer` and `subscription` on `EventsV1InvoiceUpcomingEvent`
* Add support for new value `vipps_payments` on enum `EventsV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for new values `business_custodial_storage.inbound.ousd`, `business_custodial_storage.inbound.usdc`, `business_custodial_storage.outbound.ousd`, `business_custodial_storage.outbound.usdc`, `outbound_payments.offramp.bank_accounts.brl`, `outbound_payments.offramp.bank_accounts.cop`, `outbound_payments.offramp.bank_accounts.eur`, `outbound_payments.offramp.bank_accounts.gbp`, `outbound_payments.offramp.bank_accounts.mxn`, `outbound_payments.offramp.bank_accounts.usd`, `outbound_payments.onramp.crypto_wallets.brl`, `outbound_payments.onramp.crypto_wallets.cop`, `outbound_payments.onramp.crypto_wallets.eur`, `outbound_payments.onramp.crypto_wallets.gbp`, `outbound_payments.onramp.crypto_wallets.mxn`, `outbound_payments.onramp.crypto_wallets.usd`, `outbound_transfers.offramp.bank_accounts.brl`, `outbound_transfers.offramp.bank_accounts.cop`, `outbound_transfers.offramp.bank_accounts.eur`, `outbound_transfers.offramp.bank_accounts.gbp`, `outbound_transfers.offramp.bank_accounts.mxn`, `outbound_transfers.offramp.bank_accounts.usd`, `outbound_transfers.onramp.crypto_wallets.brl`, `outbound_transfers.onramp.crypto_wallets.cop`, `outbound_transfers.onramp.crypto_wallets.eur`, `outbound_transfers.onramp.crypto_wallets.gbp`, `outbound_transfers.onramp.crypto_wallets.mxn`, `outbound_transfers.onramp.crypto_wallets.usd`, `received_credits.offramp.bank_accounts.brl`, `received_credits.offramp.bank_accounts.cop`, `received_credits.offramp.bank_accounts.eur`, `received_credits.offramp.bank_accounts.gbp`, `received_credits.offramp.bank_accounts.mxn`, `received_credits.offramp.bank_accounts.usd`, `received_credits.onramp.crypto_wallets.brl`, `received_credits.onramp.crypto_wallets.cop`, `received_credits.onramp.crypto_wallets.eur`, `received_credits.onramp.crypto_wallets.gbp`, `received_credits.onramp.crypto_wallets.mxn`, and `received_credits.onramp.crypto_wallets.usd` on enum `EventsV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for new value `pix` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for event notifications `V2MoneyManagementInboundTransferMandateActivatedEvent`, `V2MoneyManagementInboundTransferMandateCreatedEvent`, `V2MoneyManagementInboundTransferMandateExpiredEvent`, `V2MoneyManagementInboundTransferMandateRefusedEvent`, and `V2MoneyManagementInboundTransferMandateRevokedEvent` with related object `v2.moneymanagement.InboundTransferMandate`

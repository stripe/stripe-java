---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2287
semver_level: major
is_stripe_api_change: true
released_in_version: 33.5.0-alpha.4
---

* Add support for new resources `apps.Install` and `v2.core.vault.NetworkToken`
* Add support for `create_from_credential`, `create`, `generate_cryptogram`, and `retrieve` methods on resource `v2.core.vault.NetworkToken`
* ⚠️ Remove support for `nestingDemo` on `AccountSession.components`
* Add support for `sharedPaymentGrantedToken` on `Charge.payment_method_details`
* ⚠️ Change type of `Charge.payment_method_details.card.mandate` from `string` to `expandable($Mandate)`
* Add support for `currentTrial` on `checkout.Session.items[].subscription.items[]` and `checkout.SessionCreateParams.items[].subscription.items[]`
* Add support for `verificationMethod` on `checkout.Session.payment_method_options.bacs_debit` and `checkout.SessionCreateParams.payment_method_options.bacs_debit`
* Add support for new value `sequra` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for new value `ripusd` on enums `crypto.OnrampSessionCreateParams.destinationCurrency` and `crypto.OnrampSessionListParams.destinationCurrency`
* Add support for new value `ripusd` on enum `crypto.OnrampSessionCreateParams.destinationCurrencies`
* Add support for new values `cad`, `cop`, and `php` on enum `crypto.OnrampSessionCreateParams.sourceCurrency`
* Add support for `appeal` on `Dispute.evidence`
* Add support for `bacsDebit` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for `pricingToken` on `InvoiceCreatePreviewParams`
* Add support for `expiresAt` on `Mandate.payment_method_details.blik`, `PaymentIntent.next_action.swish_handle_redirect_or_display_qr_code.qr_code`, and `Subscription.payment_settings.payment_method_options.blik.mandate_options`
* ⚠️ Remove support for `expiresAfter` on `Mandate.payment_method_details.blik` and `Subscription.payment_settings.payment_method_options.blik.mandate_options`
* Add support for `momo` on `PaymentAttemptRecord.payment_method_details` and `PaymentRecord.payment_method_details`
* Add support for `link` on `PaymentAttemptRecord.payment_method_details.card.wallet` and `PaymentRecord.payment_method_details.card.wallet`
* Add support for `fundingSourceGroup` on `PaymentAttemptRecord.payment_method_details.link` and `PaymentRecord.payment_method_details.link`
* Add support for `payoutMethodOptions` on `PayoutCreateParams`
* Add support for `earlyFraudWarning` and `fraudulentDispute` on `radar.PaymentEvaluation.signals`
* ⚠️ Remove support for `igic` on `tax.Registration.country_options.at`, `tax.Registration.country_options.be`, `tax.Registration.country_options.bg`, `tax.Registration.country_options.cy`, `tax.Registration.country_options.cz`, `tax.Registration.country_options.de`, `tax.Registration.country_options.dk`, `tax.Registration.country_options.ee`, `tax.Registration.country_options.fi`, `tax.Registration.country_options.fr`, `tax.Registration.country_options.gr`, `tax.Registration.country_options.hr`, `tax.Registration.country_options.hu`, `tax.Registration.country_options.ie`, `tax.Registration.country_options.it`, `tax.Registration.country_options.lt`, `tax.Registration.country_options.lu`, `tax.Registration.country_options.lv`, `tax.Registration.country_options.mt`, `tax.Registration.country_options.nl`, `tax.Registration.country_options.pl`, `tax.Registration.country_options.pt`, `tax.Registration.country_options.ro`, `tax.Registration.country_options.se`, `tax.Registration.country_options.si`, and `tax.Registration.country_options.sk`
* Add support for `metadata` on `v2.billing.Contract.one_time_fees.data[]`, `v2.billing.ContractCreateParams.one_time_fees[]`, `v2.billing.ContractUpdateParams.one_time_fee_actions[].add`, and `v2.billing.ContractUpdateParams.one_time_fee_actions[].update`
* Add support for `bankAccount` and `cryptoWallet` on `v2.moneymanagement.FinancialAddressCreateParams` and `v2.moneymanagement.FinancialAddress`
* Add support for `type` on `v2.moneymanagement.FinancialAddress` and `v2.moneymanagement.ReceivedCredit.crypto_wallet_transfer`
* ⚠️ Remove support for `credentials` and `currency` on `v2.moneymanagement.FinancialAddress`
* Add support for `amountReceived` on `v2.moneymanagement.ReceivedCredit`
* Add support for `originatingBankAccount` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* ⚠️ Remove support for `originType` on `v2.moneymanagement.ReceivedCredit.bank_transfer` and `v2.moneymanagement.ReceivedCredit.crypto_wallet_transfer`
* Add support for `latestPaymentAttemptRecordDetails` on `v2.payments.OffSessionPayment`
* Add support for `accountReviewed` on `v2.signals.AccountActivityCreateParams` and `v2.signals.AccountActivity`
* Add support for new value `account_reviewed` on enums `v2.signals.AccountActivityCreateParams.type` and `v2.signals.AccountEvaluationCreateParams.account_activity_details.data.type`
* Add support for `include` on `v2.payments.OffSessionPaymentCreateParams`
* ⚠️ Remove support for `include` on `v2.moneymanagement.FinancialAddressListParams` and `v2.moneymanagement.FinancialAddressRetrieveParams`
* ⚠️ Remove support for `cryptoProperties` and `sepaBankAccount` on `v2.moneymanagement.FinancialAddressCreateParams`
* ⚠️ Add support for new value `bank_account` on enum `v2.moneymanagement.FinancialAddressCreateParams.type`
* ⚠️ Remove support for values `ca_bank_account`, `gb_bank_account`, `mx_bank_account`, `sepa_bank_account`, and `us_bank_account` from enum `v2.moneymanagement.FinancialAddressCreateParams.type`
* Add support for error type `MerchantNotGatedException`

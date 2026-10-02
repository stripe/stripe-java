---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2311
semver_level: major
is_stripe_api_change: true
---

* Add support for new resources `radar.Rule` and `v2.moneymanagement.FundingSession`
* Add support for `create` method on resource `v2.moneymanagement.FundingSession`
* ⚠️ Change type of `Charge.outcome.rule` from `RadarRule` to `$Radar.Rule`
* Add support for `paymentSettings` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for `onBehalfOf` on `checkout.Session`
* Add support for `fuels` on `issuing.Transaction.purchase_details`
* Add support for `fleet` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
* Add support for `subscriptionReference` on `PaymentIntent.payment_method_options.paypay`, `PaymentIntentConfirmParams.payment_method_options.paypay`, `PaymentIntentCreateParams.payment_method_options.paypay`, and `PaymentIntentUpdateParams.payment_method_options.paypay`
* Add support for `usBankAccount` on `radar.PaymentEvaluation.payment_details.money_movement_details` and `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details`
* Change type of `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details.moneyMovementType` from `literal('card')` to `enum('card'|'us_bank_account')`
* Add support for `rules` on `radar.PaymentEvaluation`
* ⚠️ Change type of `radar.PaymentEvaluation.payment_details.money_movement_details.moneyMovementType` from `literal('card')` to `enum('card'|'us_bank_account')`
* Add support for `bankInitiatedReturn` on `radar.PaymentEvaluation.signals`
* Add support for `account` on `v2.moneymanagement.FinancialAddressCreateParams`, `v2.moneymanagement.FinancialAddressListParams`, and `v2.moneymanagement.FinancialAddress`
* Add support for `supportedNetworkDetails` on `v2.moneymanagement.FinancialAddress.crypto_wallet`
* Add support for `networkDetails` on `v2.moneymanagement.InboundTransferCreateParams` and `v2.moneymanagement.InboundTransfer`
* Add support for `originatingCryptoWallet`, `tokenCurrency`, and `transactionHash` on `v2.moneymanagement.ReceivedCredit.crypto_wallet_transfer`
* Add support for new values `brl` and `cop` on enum `v2.moneymanagement.FinancialAddressCreateParams.bank_account.currency`
* Add support for new value `bitcoin` on enum `v2.moneymanagement.FinancialAddressCreateParams.crypto_wallet.network`
* Add support for `customer` and `subscription` on `EventsV1InvoiceUpcomingEvent`

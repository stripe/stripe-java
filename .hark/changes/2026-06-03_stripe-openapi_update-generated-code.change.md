---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2231
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.3.0-alpha.2
---

* Add support for new resources `delegatedcheckout.OrderEvent`, `delegatedcheckout.Order`, `v2.billing.ContractLicensePricingQuantityChange`, `v2.billing.Contract`, and `v2.signals.AccountSignal`
* Add support for `retrieve` method on resource `delegatedcheckout.Order`
* Add support for `list_orders` method on resource `delegatedcheckout.RequestedSession`
* Add support for `list` and `retrieve` methods on resource `v2.signals.AccountSignal`
* Add support for `activate`, `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `v2.billing.Contract`
* Add support for `birthAddress` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `Person`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
* Change type of `ChargeCaptureParams.payment_details.money_services.transactionType`, `ChargeUpdateParams.payment_details.money_services.transactionType`, `PaymentIntentCaptureParams.payment_details.money_services.transactionType`, `PaymentIntentConfirmParams.payment_details.money_services.transactionType`, `PaymentIntentCreateParams.payment_details.money_services.transactionType`, and `PaymentIntentUpdateParams.payment_details.money_services.transactionType` from `literal('account_funding')` to `enum('account_funding'|'debt_repayment')`
* Add support for `provisioningDecision` and `tokenType` on `issuing.Authorization.token_details` and `issuing.Token`
* Add support for `tokenDecisionRecommendation` on `issuing.Authorization.token_details.network_data.visa` and `issuing.Token.network_data.visa`
* Add support for `language` on `issuing.Token.network_data.device`
* Add support for `digitalAssetCategory` on `PaymentIntentConfirmParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentUpdateParams.payment_method_options.card.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_method_options.card_present.payment_details.money_services.account_funding`
* Add support for `staticAddress` on `PaymentIntent.payment_method_options.crypto.deposit_options`, `PaymentIntentConfirmParams.payment_method_options.crypto.deposit_options`, `PaymentIntentCreateParams.payment_method_options.crypto.deposit_options`, and `PaymentIntentUpdateParams.payment_method_options.crypto.deposit_options`
* Add support for `paymentReference` on `PaymentIntentCreateParams.payments_orchestration`
* ⚠️ Remove support for `paymentDetails` on `PaymentIntentCreateParams.payments_orchestration`
* ⚠️ Change type of `PaymentIntent.payment_details.money_services.transactionType` from `literal('account_funding')` to `enum('account_funding'|'debt_repayment')`
* Add support for `endingBefore`, `limit`, and `startingAfter` on `PaymentLocationListParams`
* ⚠️ Change `radar.IssuingAuthorizationEvaluationCreateParams.card_details.last4` to be required
* Add support for `schema` on `v2.data.reporting.QueryRun.result.file` and `v2.reporting.ReportRun.result.file`
* Add support for `include` on `v2.data.reporting.QueryRunRetrieveParams` and `v2.reporting.ReportRunRetrieveParams`
* Add support for `requirementsCollector` on `v2.core.AccountCreateParams.defaults.responsibilities` and `v2.core.AccountUpdateParams.defaults.responsibilities`
* Add support for event notification `V2SignalsAccountSignalMerchantDelinquencyReadyEvent` with related object `v2.signals.AccountSignal`
* ⚠️ Renames v2.PaymentService to v2.PaymentsService to more closely match our API naming

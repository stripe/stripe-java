---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2241
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.2.0-alpha.2
---

* Add support for new resources `crypto.CustomerConsumerWallet`, `crypto.CustomerPaymentToken`, `crypto.Customer`, `crypto.OnrampSession`, and `crypto.OnrampTransactionLimits`
* Add support for `list` and `retrieve` methods on resource `crypto.Customer`
* Add support for `checkout`, `create`, `list`, `quote`, and `retrieve` methods on resource `crypto.OnrampSession`
* Add support for `retrieve` method on resource `crypto.OnrampTransactionLimits`
* Add support for `electronicCommerceIndicator` on `Charge.payment_method_details.card`
* Add support for `amountReceived` and `amountRequested` on `Charge.payment_method_details.crypto`, `PaymentAttemptRecord.payment_method_details.crypto`, and `PaymentRecord.payment_method_details.crypto`
* Add support for `fingerprint` on `Charge.payment_method_details.gift_card`, `PaymentAttemptRecord.payment_method_details.gift_card`, and `PaymentRecord.payment_method_details.gift_card`
* Add support for `addressCollectionPrecision` on `checkout.SessionCreateParams.automatic_tax`
* Add support for `subscription` on `checkout.Session.items[]`
* ⚠️  Remove support for `deactivation` on `GiftCardOperation`
* Add support for `merchantAmountExchangeRate` on `issuing.Authorization` and `issuing.Transaction`
* Add support for `deviceId` on `issuing.Authorization.token_details.network_data.device` and `issuing.Token.network_data.device`
* Add support for `program` on `issuing.Card`
* Add support for `paymentMethodDetails` on `PaymentAttemptRecordReportFailedParams` and `PaymentRecordReportPaymentAttemptFailedParams`
* Add support for `reason` on `PaymentAttemptRecordReportRefundParams` and `PaymentRecordReportRefundParams`
* Add support for `amountReconciliation` on `PaymentIntent.payment_method_options.crypto`, `PaymentIntentConfirmParams.payment_method_options.crypto`, `PaymentIntentCreateParams.payment_method_options.crypto`, and `PaymentIntentUpdateParams.payment_method_options.crypto`
* Add support for `connectPermissions` and `permissions` on `v2.iam.ApiKeyCreateParams`, `v2.iam.ApiKeyUpdateParams`, and `v2.iam.ApiKey`
* Add support for `credit` on `v2.moneymanagement.FinancialAccount`
* Add support for `account`, `issuingAuthorization`, `issuingDispute`, and `issuingTransaction` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for new value `credit` on enum `v2.moneymanagement.FinancialAccountListParams.types`
* Change type of `v2.moneymanagement.FinancialAccountCreateParams.type` from `literal('storage')` to `enum('credit'|'storage')`
* Add support for `expiresAt` on `v2.iam.ApiKeyCreateParams`

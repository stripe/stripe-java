---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2255
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.3.0-alpha.1
---

* Add support for new resources `v2.moneymanagement.ReceivedDebitMandate`, `v2.risk.Inquiry`, `v2.signals.AccountActivity`, and `v2.signals.AccountEvaluation`
* Add support for `create` and `retrieve` methods on resource `v2.signals.AccountEvaluation`
* Add support for `create`, `delete`, and `retrieve` methods on resource `v2.signals.AccountActivity`
* Add support for `list`, `retrieve`, and `update` methods on resource `v2.risk.Inquiry`
* Add support for `cancel`, `list`, and `retrieve` methods on resource `v2.moneymanagement.ReceivedDebitMandate`
* Add support for `rateCards` on `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope`, `billing.CreditGrant.applicability_config.scope`, and `billing.CreditGrantCreateParams.applicability_config.scope`
* ⚠️ Change type of `ConfirmationToken.payment_method_preview.gift_card.brand`, `GiftCard.brand`, `GiftCardCreateParams.brand`, `PaymentMethod.gift_card.brand`, `terminal.ReaderActivateGiftCardParams.brand`, `terminal.ReaderCashoutGiftCardParams.brand`, `terminal.ReaderCheckGiftCardBalanceParams.brand`, and `terminal.ReaderReloadGiftCardParams.brand` from `enum('fiserv_valuelink'|'givex'|'svs')` to `literal('svs')`
* Add support for new value `tempo` on enums `crypto.OnrampSessionCreateParams.destinationNetwork`, `crypto.OnrampSessionListParams.destinationNetwork`, and `crypto.OnrampTransactionLimitsRetrieveParams.destinationNetwork`
* Add support for new value `tempo` on enum `crypto.OnrampSessionCreateParams.destinationNetworks`
* Add support for `tempo` on `crypto.OnrampSession.transaction_details.wallet_addresses`
* Add support for `healthcare` on `issuing.Authorization`
* Add support for `productCode` on `issuing.CardCreateParams`, `issuing.CardUpdateParams`, and `issuing.Card`
* Add support for `productGraduationState` on `issuing.Card`
* Add support for `cvc` and `number` on `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details.card`
* Change `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details.card.first6` to be optional
* Change `radar.PaymentEvaluationCreateParams.payment_details.payment_method_details.card.last4` to be optional
* Add support for `card` on `radar.PaymentEvaluation.payment_details.payment_method_details`
* ⚠️ Change type of `terminal.ReaderCollectPaymentMethodParams.collect_config.giftCardBrand` and `terminal.ReaderProcessPaymentIntentParams.process_config.giftCardBrand` from `enum('fiserv_valuelink'|'givex'|'svs')` to `literal('svs')`
* Add support for `giftCard` on `terminal.ReaderPresentPaymentMethodParams`
* Add support for new value `gift_card` on enum `terminal.ReaderPresentPaymentMethodParams.type`
* Add support for `amountDue` and `customerBalanceApplied` on `v2.billing.Intent.amount_details`
* ⚠️ Change type of `v2.core.AccountEvaluation.evaluationsTriggered` from `literal('fraudulent_website')` to `enum('fraudulent_website'|'user_account_sharing'|'user_multi_accounting')`
* Add support for `grossSettlement` on `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
* ⚠️ Change type of `v2.moneymanagement.DebitDispute.bank_transfer.network` from `literal('ach')` to `enum('ach'|'bacs')`
* ⚠️ Remove support for `managedBy` on `v2.moneymanagement.FinancialAccount`
* Add support for `payoutIntent` on `v2.moneymanagement.OutboundPayment`
* Add support for `settlesAt` on `v2.moneymanagement.ReceivedDebit`
* Add support for `gbBankAccount` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
* ⚠️ Change type of `v2.moneymanagement.ReceivedDebit.bank_transfer.originType` from `literal('us_bank_account')` to `enum('gb_bank_account'|'us_bank_account')`
* ⚠️ Change type of `v2.moneymanagement.ReceivedDebit.bank_transfer.paymentMethodType` from `literal('us_bank_account')` to `enum('gb_bank_account'|'us_bank_account')`
* Add support for `targetDate` on `v2.payments.OffSessionPaymentCreateParams` and `v2.payments.OffSessionPayment`
* Add support for `accountEvaluation`, `fraudulentWebsite`, `paymentDelinquencyExposure`, `userAccountSharing`, and `userMultiAccounting` on `v2.signals.AccountSignal`
* Add support for new values `fraudulent_website`, `user_account_sharing`, and `user_multi_accounting` on enum `v2.signals.AccountSignalListParams.type`
* Change type of `v2.moneymanagement.FinancialAddressDebitSimulationDebitParams.network` from `literal('ach')` to `enum('ach'|'bacs')`
* Add support for `receivedDebitMandate` on `v2.moneymanagement.ReceivedDebitListParams`
* ⚠️ Remove support for `payoutIntent` on `v2.moneymanagement.OutboundPaymentCreateParams`
* Change type of `v2.core.AccountEvaluationCreateParams.signals` from `literal('fraudulent_website')` to `enum('fraudulent_website'|'user_account_sharing'|'user_multi_accounting')`
* ⚠️ Remove support for `id` on `EventsV2SignalsAccountSignalFraudulentMerchantReadyEvent`
* Add support for event notifications `V2MoneyManagementReceivedDebitCreatedEvent` and `V2MoneyManagementReceivedDebitScheduledEvent` with related object `v2.moneymanagement.ReceivedDebit`
* Add support for event notifications `V2MoneyManagementReceivedDebitMandateCanceledEvent`, `V2MoneyManagementReceivedDebitMandateCreatedEvent`, `V2MoneyManagementReceivedDebitMandateExpiredEvent`, `V2MoneyManagementReceivedDebitMandatePendingCancellationEvent`, and `V2MoneyManagementReceivedDebitMandateUpdatedEvent` with related object `v2.moneymanagement.ReceivedDebitMandate`
* Add support for event notification `V2SignalsAccountEvaluationCompleteEvent` with related object `v2.signals.AccountEvaluation`
* Add support for event notifications `V2SignalsAccountSignalFraudulentWebsiteReadyEvent` and `V2SignalsAccountSignalPaymentDelinquencyExposureReadyEvent` with related object `v2.signals.AccountSignal`

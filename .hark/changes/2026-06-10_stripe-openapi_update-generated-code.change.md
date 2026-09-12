---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2233
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.1.0-alpha.1
---

* Add support for new resources `GiftCardOperation`, `GiftCard`, and `TaxFund`
* Add support for `retrieve` method on resource `GiftCardOperation`
* Add support for `activate`, `cashout`, `check_balance`, `create`, `reload`, `retrieve`, and `void_operation` methods on resource `GiftCard`
* Add support for `list` and `retrieve` methods on resource `TaxFund`
* Add support for `update_crypto_refund_address` method on resource `PaymentIntent`
* Add support for `performanceLocationDetails` on `tax.CalculationCreateParams.line_items[]`, `tax.CalculationLineItem`, and `tax.TransactionLineItem`
* ⚠️ Remove support for `moneyServices` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, and `PaymentIntentCaptureParams.payment_details`
* Add support for `frMealVoucher` on `Charge.payment_method_details.card.benefits`
* Add support for `multicapture` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
* Add support for `pix` on `checkout.Session.current_attempt.payment_method_details`
* Add support for `provisionalCredit` on `issuing.DisputeUpdateParams` and `issuing.Dispute`
* Add support for `reason` on `PaymentAttemptRecordReportCanceledParams` and `PaymentRecordReportPaymentAttemptCanceledParams`
* Add support for `fiservValuelink`, `givex`, and `svs` on `PaymentAttemptRecord.processor_details` and `PaymentRecord.processor_details`
* ⚠️ Change type of `PaymentAttemptRecord.processor_details.type` and `PaymentRecord.processor_details.type` from `literal('custom')` to `enum('custom'|'fiserv_valuelink'|'givex'|'svs')`
* Add support for `captureBy` and `captureDelay` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card`
* ⚠️ Remove support for `liquidAsset` on `PaymentIntentConfirmParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentConfirmParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card.payment_details.money_services.account_funding`, `PaymentIntentCreateParams.payment_method_options.card_present.payment_details.money_services.account_funding`, `PaymentIntentUpdateParams.payment_method_options.card.payment_details.money_services.account_funding`, and `PaymentIntentUpdateParams.payment_method_options.card_present.payment_details.money_services.account_funding`
* Add support for `requestMulticapture` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
* Add support for new value `transaction_verification` on enums `PaymentIntentConfirmParams.payment_method_options.crypto.mode`, `PaymentIntentCreateParams.payment_method_options.crypto.mode`, and `PaymentIntentUpdateParams.payment_method_options.crypto.mode`
* Add support for `ignoreApplicationFee`, `ignoreTransferData`, and `requestPartialAuthorization` on `PaymentIntentConfirmParams.payment_method_options.gift_card`, `PaymentIntentCreateParams.payment_method_options.gift_card`, and `PaymentIntentUpdateParams.payment_method_options.gift_card`
* Change `PaymentIntentConfirmParams.payment_details.benefit.fr_meal_voucher.siret`, `PaymentIntentCreateParams.payment_details.benefit.fr_meal_voucher.siret`, `PaymentIntentUpdateParams.payment_details.benefit.fr_meal_voucher.siret`, `SetupIntentConfirmParams.setup_details.benefit.fr_meal_voucher.siret`, `SetupIntentCreateParams.setup_details.benefit.fr_meal_voucher.siret`, and `SetupIntentUpdateParams.setup_details.benefit.fr_meal_voucher.siret` to be optional
* Add support for `latestPaymentAttemptRecord` and `paymentRecord` on `PaymentIntent`
* ⚠️ Remove support for `reauthorization` and `reauthorizeBefore` on `PaymentIntent.advanced_feature_details`
* Add support for `refundAddress` on `PaymentIntent.next_action.crypto_display_details.deposit_addresses.base`, `PaymentIntent.next_action.crypto_display_details.deposit_addresses.solana`, and `PaymentIntent.next_action.crypto_display_details.deposit_addresses.tempo`
* Add support for `location` on `PaymentIntent.payment_details` and `SetupIntent.setup_details`
* Add support for `data` on `radar.AccountEvaluationCreateParams.login_initiated.client_device_metadata_details`, `radar.AccountEvaluationCreateParams.registration_initiated.client_device_metadata_details`, and `radar.CustomerEvaluationCreateParams.evaluation_context[].client_details`
* Change `radar.AccountEvaluationCreateParams.login_initiated.client_device_metadata_details.radarSession`, `radar.AccountEvaluationCreateParams.registration_initiated.client_device_metadata_details.radarSession`, and `radar.CustomerEvaluationCreateParams.evaluation_context[].client_details.radarSession` to be optional
* ⚠️ Change type of `v2.core.FeeBatch.adjustments.taxAdjustment` from `amount` to `an object`
* ⚠️ Change type of `v2.core.FeeBatch.amount`, `v2.core.FeeBatch.collection_records[].amount`, `v2.core.FeeBatch.collection_records[].tax.amount`, `v2.core.FeeBatch.tax.amount`, `v2.core.FeeEntry.amount`, and `v2.core.FeeEntry.tax.amount` from `amount` to `an object`
* Add support for `taxFund` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for new value `promotion` on enum `v2.commerce.ProductCatalogImportCreateParams.feedType`

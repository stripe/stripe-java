---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2332
semver_level: major
is_stripe_api_change: true
---

* Add support for new resource `v2.moneymanagement.SpendingMandate`
* Add support for `cancel`, `list`, and `retrieve` methods on resource `v2.moneymanagement.SpendingMandate`
* Add support for `cardholderMessage` on `Charge.payment_method_details.card_present.receipt`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present.receipt`, `PaymentAttemptRecord.payment_method_details.card_present.receipt`, `PaymentMethod.card.generated_from.payment_method_details.card_present.receipt`, and `PaymentRecord.payment_method_details.card_present.receipt`
* Add support for `pricingToken` on `checkout.SessionCreateParams`
* Add support for `marketingAttributions` on `CustomerUpdateParams`
* Add support for `fraudulentSelfie` on `identity.VerificationReport.signals`
* Add support for `tossPay` on `Mandate.payment_method_details`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, and `SetupAttempt.payment_method_details`
* Add support for `paymentEvaluations` on `PaymentAttemptRecordReportAuthenticatedParams`
* Add support for `threeDSecure` on `PaymentAttemptRecordReportAuthorizedParams.payment_method_details.card`, `PaymentAttemptRecordReportGuaranteedParams.payment_method_details.card`, `PaymentRecordReportPaymentAttemptGuaranteedParams.payment_method_details.card`, `PaymentRecordReportPaymentAttemptParams.payment_method_details.card`, and `PaymentRecordReportPaymentParams.payment_method_details.card`
* Add support for `wechatPayRedirectToMiniProgram` on `PaymentIntent.next_action`
* Add support for `customerPresence` and `paymentType` on `radar.PaymentEvaluation.payment_details.money_movement_details.sepa_debit` and `radar.PaymentEvaluationCreateParams.payment_details.money_movement_details.sepa_debit`
* Add support for `financialConnections` on `SetupIntent.payment_method_options.bacs_debit`, `SetupIntentConfirmParams.payment_method_options.bacs_debit`, `SetupIntentCreateParams.payment_method_options.bacs_debit`, and `SetupIntentUpdateParams.payment_method_options.bacs_debit`
* Add support for `referralFeeDetails` on `sharedpayment.GrantedToken`, `sharedpayment.IssuedTokenCreateParams`, and `sharedpayment.IssuedToken`
* Add support for new values `stripe_s700_devkit`, `stripe_s710_devkit`, `stripe_t600_devkit`, `verifone_ux700_devkit`, and `verifone_v660p_devkit` on enum `terminal.ReaderListParams.deviceType`
* Add support for `deviceHealthDetails` and `deviceHealth` on `terminal.Reader`
* Add support for `checkSend` on `v2.moneymanagement.OutboundPayment.to.payout_method_options`, `v2.moneymanagement.OutboundPayment.tracking_details`, `v2.moneymanagement.OutboundPaymentCreateParams.to.payout_method_options`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data`, `v2.moneymanagement.PayoutIntent.to.payout_method_options`, `v2.moneymanagement.PayoutIntentCreateParams.to.payout_method_options`, `v2.moneymanagement.PayoutIntentUpdateParams.to.payout_method_options`, and `v2.moneymanagement.PayoutMethod`
* Add support for `spendingMandate` on `v2.moneymanagement.ReceivedDebit.bank_transfer` and `v2.moneymanagement.ReceivedDebitListParams`
* Add support for new value `check_send` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* Add support for event notifications `V2MoneyManagementSpendingMandateCanceledEvent`, `V2MoneyManagementSpendingMandateCreatedEvent`, `V2MoneyManagementSpendingMandateExpiredEvent`, `V2MoneyManagementSpendingMandatePendingCancellationEvent`, and `V2MoneyManagementSpendingMandateUpdatedEvent` with related object `v2.moneymanagement.SpendingMandate`
* ⚠️ Add error type `MerchantNotGatedException` on `v2.core.vault.NetworkToken#create_from_credential`

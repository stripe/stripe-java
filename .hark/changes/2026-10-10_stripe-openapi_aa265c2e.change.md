---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2315
semver_level: major
is_stripe_api_change: true
---

* ⚠️ Remove support for `capture` method on resource `v2.payments.OffSessionPayment`
* ⚠️ Remove support for `acknowledge_confirmation_of_payee` and `initiate_confirmation_of_payee` methods on resource `v2.core.vault.GbBankAccount`
* Add support for `wechatPayMobileWebPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* ⚠️ Remove support for `wechatPayPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* Add support for `settlementReserved` on `Balance`
* Add support for `carecredit`, `getflex`, and `sezzle` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new value `auto` on enum `checkout.SessionCreateParams.paymentMethodCollection`
* Add support for `mandateOptions` on `checkout.SessionCreateParams.payment_method_options.card`
* Add support for new values `carecredit`, `getflex`, and `sezzle` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new values `carecredit`, `getflex`, and `sezzle` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for new values `carecredit`, `getflex`, and `sezzle` on enums `PaymentIntentConfirmParams.allowedPaymentMethodTypes`, `PaymentIntentCreateParams.allowedPaymentMethodTypes`, `PaymentIntentUpdateParams.allowedPaymentMethodTypes`, `SetupIntentConfirmParams.allowedPaymentMethodTypes`, `SetupIntentCreateParams.allowedPaymentMethodTypes`, and `SetupIntentUpdateParams.allowedPaymentMethodTypes`
* Add support for new values `carecredit`, `getflex`, and `sezzle` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* Add support for new values `simulated_stripe_t600` and `stripe_t600` on enum `terminal.ReaderListParams.deviceType`
* Add support for new values `three_d_secure.authentication.canceled`, `three_d_secure.authentication.challenge_started`, `three_d_secure.authentication.errored`, `three_d_secure.authentication.failed`, `three_d_secure.authentication.requires_challenge`, `three_d_secure.authentication.requires_submission`, and `three_d_secure.authentication.succeeded` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for `contactEmail` on `v2.core.AccountEvaluation.account_data`, `v2.core.AccountEvaluationCreateParams.account_data`, `v2.signals.AccountActivity.account_details.data`, `v2.signals.AccountActivityCreateParams.account_details.data`, `v2.signals.AccountEvaluation.account_details.data`, and `v2.signals.AccountEvaluationCreateParams.account_details.data`
* Add support for `breB`, `nip`, and `pix` on `v2.moneymanagement.FinancialAddress.bank_account` and `v2.moneymanagement.ReceivedCredit.bank_transfer.originating_bank_account`
* ⚠️ Remove support for `amountCapturable` on `v2.payments.OffSessionPayment`
* ⚠️ Remove support for `capture` on `v2.payments.OffSessionPaymentCreateParams` and `v2.payments.OffSessionPayment`
* Add support for new values `bre_b` and `pix` on enum `v2.moneymanagement.FinancialAddressCreditSimulationCreditParams.network`
* Add support for snapshot events `three_d_secure.authentication.canceled`, `three_d_secure.authentication.challenge_started`, `three_d_secure.authentication.errored`, `three_d_secure.authentication.failed`, `three_d_secure.authentication.requires_challenge`, `three_d_secure.authentication.requires_submission`, and `three_d_secure.authentication.succeeded` with resource `threedsecure.Authentication`
* ⚠️ Remove support for event notification `V2PaymentsOffSessionPaymentRequiresCaptureEvent` with related object `v2.payments.OffSessionPayment`

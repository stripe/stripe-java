---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2259
is_stripe_api_change: true
released_in_version: 33.3.0-alpha.2
---

* Add support for new resource `billing.FeedbackOptions`
* Add support for `sequraPayments` on `Account.capabilities`
* Add support for `feedbackOptions` on `billingportal.Configuration.features.subscription_cancel.cancellation_reason`
* Add support for `sequra` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentRecord.payment_method_details`, and `checkout.Session.payment_method_options`
* Add support for `retrievalReferenceNumber` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
* Add support for `pricingGroup` on `Charge.payment_method_details.link`
* Add support for `taxRates` on `checkout.Session.shipping_options[]`, `checkout.SessionCreateParams.shipping_options[]`, and `checkout.SessionUpdateParams.shipping_options[]`
* Add support for `fundingTypesBlocked` on `checkout.Session.payment_method_options.card.restrictions`
* Add support for new value `sequra` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new value `sequra` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `healthcare` on `issuing.AuthorizationCaptureParams.purchase_details`, `issuing.AuthorizationCreateParams`, `issuing.TransactionCreateForceCaptureParams.purchase_details`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details`
* Add support for `isAnomalous` on `PaymentAttemptRecordReportGuaranteedParams`
* Add support for new value `sequra` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* Add support for `aadeData` on `PaymentIntent.payment_method_options.card_present`
* Add support for `feedbackOption` on `Subscription.cancellation_details`
* Add support for `application` on `v2.payments.OffSessionPayment`
* Add support for `status` on `v2.moneymanagement.FinancialAccountStatementListParams`
* Change `v2.billing.ContractCreateParams.pricingLines` to be optional

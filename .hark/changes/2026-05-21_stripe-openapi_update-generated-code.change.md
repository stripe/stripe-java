---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2217
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.2.0-alpha.6
---

* Add support for new resource `PaymentLocationCapability`
* Add support for `list`, `retrieve`, and `update` methods on resource `PaymentLocationCapability`
* Add support for `close` and `simulate_network_lifecycle_dispute_response` test helper methods on resource `issuing.Dispute`
* Change type of `delegatedcheckout.RequestedSessionUpdateParams.discounts.codes` from `array(string)` to `emptyable(array(string))`
* ⚠️ Remove support for `creditedItems` on `InvoiceItem.proration_details`
* Add support for `balanceResponse` on `issuing.Authorization`
* Add support for `paymentEvaluations` on `PaymentAttemptRecordReportCanceledParams`, `PaymentAttemptRecordReportFailedParams`, `PaymentRecordReportPaymentAttemptCanceledParams`, `PaymentRecordReportPaymentAttemptFailedParams`, `PaymentRecordReportPaymentAttemptParams.failed`, and `PaymentRecordReportPaymentParams.failed`
* Add support for `enabled` on `PaymentIntentConfirmParams.payment_details.benefit.fr_meal_voucher`, `PaymentIntentCreateParams.payment_details.benefit.fr_meal_voucher`, `PaymentIntentUpdateParams.payment_details.benefit.fr_meal_voucher`, `SetupIntentConfirmParams.setup_details.benefit.fr_meal_voucher`, `SetupIntentCreateParams.setup_details.benefit.fr_meal_voucher`, and `SetupIntentUpdateParams.setup_details.benefit.fr_meal_voucher`
* Add support for `advancedFeatureDetails` and `allowedPaymentMethodTypes` on `PaymentIntent`
* Change type of `PaymentLocationUpdateParams.address.city` from `string` to `emptyable(string)`
* Change type of `PaymentLocationUpdateParams.address.line1` from `string` to `emptyable(string)`
* Change type of `PaymentLocationUpdateParams.address.line2` from `string` to `emptyable(string)`
* Change type of `PaymentLocationUpdateParams.address.postalCode` from `string` to `emptyable(string)`
* Change type of `PaymentLocationUpdateParams.address.state` from `string` to `emptyable(string)`
* Change `SubscriptionPauseParams.type` to be optional
* ⚠️ Remove support for `paymentBehavior` on `SubscriptionResumeParams`
* ⚠️ Remove support for `statusDetails` on `Subscription`

---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1782
is_stripe_api_change: true
released_in_version: 25.3.0
---

* Add support for `create_preview` method on resource `Invoice`
* Add support for `payment_method_data` on `checkout.SessionCreateParams`
* Add support for `saved_payment_method_options` on `Checkout.Session` and `checkout.SessionCreateParams`
* Add support for `mobilepay` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `mobilepay` on enum `checkout.SessionCreateParams.payment_method_types[]`
* Add support for `allow_redisplay` on `ConfirmationTokenCreateParams.payment_method_data`, `CustomerListPaymentMethodsParams`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `schedule_details` and `subscription_details` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
* Add support for new value `other` on enums `issuing.AuthorizationCaptureParams.purchase_details.fuel.unit`, `issuing.TransactionCreateForceCaptureParams.purchase_details.fuel.unit`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details.fuel.unit`

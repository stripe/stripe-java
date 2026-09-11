---
title: Update generated code.
pr_link: https://github.com/stripe/stripe-java/pull/2030
is_stripe_api_change: true
released_in_version: 29.5.0
---

* Add support for `balanceReport`, `payoutDetails`, and `payoutReconciliationReport` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `name` on `billingportal.ConfigurationCreateParams`, `billingportal.ConfigurationUpdateParams`, and `billingportal.Configuration`
* Add support for `installments` on `Charge.payment_method_details.alma`
* Add support for `transactionId` on `Charge.payment_method_details.alma`, `Charge.payment_method_details.amazon_pay`, `Charge.payment_method_details.billie`, `Charge.payment_method_details.kakao_pay`, `Charge.payment_method_details.kr_card`, `Charge.payment_method_details.naver_pay`, `Charge.payment_method_details.payco`, `Charge.payment_method_details.revolut_pay`, `Charge.payment_method_details.samsung_pay`, and `Charge.payment_method_details.satispay`
* Add support for `location` and `reader` on `Charge.payment_method_details.paynow`
* Add support for `amountIncludesIof` on `PaymentIntent.payment_method_options.pix`, `PaymentIntentConfirmParams.payment_method_options.pix`, `PaymentIntentCreateParams.payment_method_options.pix`, `PaymentIntentUpdateParams.payment_method_options.pix`, `checkout.Session.payment_method_options.pix`, and `checkout.SessionCreateParams.payment_method_options.pix`
* Add support for new value `terminal_android_apk` on enum `FileListParams.purpose`
* Add support for new value `terminal_android_apk` on enum `FileCreateParams.purpose`
* Add support for `metadata` and `period` on `InvoiceCreatePreviewParams.schedule_details.phases[].add_invoice_items[]`, `SubscriptionCreateParams.add_invoice_items[]`, `SubscriptionSchedule.phases[].add_invoice_items[]`, `SubscriptionScheduleCreateParams.phases[].add_invoice_items[]`, `SubscriptionScheduleUpdateParams.phases[].add_invoice_items[]`, and `SubscriptionUpdateParams.add_invoice_items[]`
* Add support for `expMonth` and `expYear` on `issuing.CardCreateParams`
* Add support for `excludedPaymentMethodTypes` on `PaymentIntentCreateParams` and `PaymentIntent`
* Add support for `payoutMethod` on `PayoutCreateParams` and `Payout`
* Add support for `mxn` on `terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for `card` on `terminal.ReaderPresentPaymentMethodParams`
* Add support for new value `card` on enum `terminal.ReaderPresentPaymentMethodParams.type`
* Add support for new value `2025-08-27.basil` on enum `WebhookEndpointCreateParams.apiVersion`

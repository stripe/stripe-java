---
title: Update generated code.
pr_link: https://github.com/stripe/stripe-java/pull/2000
is_stripe_api_change: true
released_in_version: 29.2.0
---

* Add support for `attach_payment` method on resource `Invoice`
* Add support for `collect_inputs` method on resource `terminal.Reader`
* Add support for `succeed_input_collection` and `timeout_input_collection` test helper methods on resource `terminal.Reader`
* Add support for `pixPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `disputesList` and `paymentDisputes` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `refundAndDisputePrefunding` on `Balance`
* Add support for `balanceType` on `BalanceTransaction`
* Change `billing.AlertCreateParams.usage_threshold.meter` to be required
* Add support for `location` and `reader` on `Charge.payment_method_details.affirm` and `Charge.payment_method_details.wechat_pay`
* Add support for `paymentMethodRemove` on `checkout.SessionCreateParams.saved_payment_method_options`
* Add support for `setupFutureUsage` on `checkout.Session.payment_method_options.naver_pay`
* Add support for `postPaymentAmount` and `prePaymentAmount` on `CreditNote`
* Add support for `sex`, `unparsedPlaceOfBirth`, and `unparsedSex` on `identity.VerificationReport.document` and `identity.VerificationSession.verified_outputs`
* Add support for `billingThresholds` on `InvoiceCreatePreviewParams.schedule_details.phases[].items[]`, `InvoiceCreatePreviewParams.schedule_details.phases[]`, `InvoiceCreatePreviewParams.subscription_details.items[]`, `SubscriptionCreateParams.items[]`, `SubscriptionCreateParams`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionItem`, `SubscriptionSchedule.default_settings`, `SubscriptionSchedule.phases[].items[]`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.default_settings`, `SubscriptionScheduleCreateParams.phases[].items[]`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.default_settings`, `SubscriptionScheduleUpdateParams.phases[].items[]`, `SubscriptionScheduleUpdateParams.phases[]`, `SubscriptionUpdateParams.items[]`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for `satispay` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
* Add support for `captureMethod` on `PaymentIntent.payment_method_options.billie`
* Add support for `kakaoPay`, `krCard`, `naverPay`, `payco`, and `samsungPay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `networkDeclineCode` on `Refund.destination_details.paypal`
* Add support for `metadata` on `tax.CalculationCreateParams.line_items[]` and `tax.CalculationLineItem`
* Add support for new value `simulated_stripe_s700` on enum `terminal.ReaderListParams.deviceType`
* Add support for `returnUrl` on `terminal.Reader.action.process_payment_intent.process_config` and `terminal.ReaderProcessPaymentIntentParams.process_config`
* Add support for `collectInputs` on `terminal.Reader.action`
* Add support for new value `invoice_payment.paid` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new value `2025-05-28.basil` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for snapshot event `invoice_payment.paid` with resource `InvoicePayment`

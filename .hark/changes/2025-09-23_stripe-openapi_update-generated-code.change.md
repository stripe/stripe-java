---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2047
is_stripe_api_change: true
released_in_version: 30.1.0-beta.1
---

* Add support for new resources `billing.analytics.MeterUsageRow` and `billing.analytics.MeterUsage`
* Remove support for resources `billing.MeterUsageRow` and `billing.MeterUsage`
* Add support for `retrieve` method on resource `billing.analytics.MeterUsage`
* Remove support for `retrieve` method on resource `billing.MeterUsage`
* Add support for `report_payment_attempt_informational` method on resource `PaymentRecord`
* Add support for `minimumBalanceByCurrency` on `BalanceSettings.payments.payouts` and `BalanceSettingsUpdateParams.payments.payouts`
* Remove support for values `saturday` and `sunday` from enum `BalanceSettingsUpdateParams.payments.payouts.schedule.weeklyPayoutDays`
* Change type of `BalanceSettingsUpdateParams.payments.settlement_timing.delayDaysOverride` from `longInteger` to `emptyable(longInteger)`
* Change `BalanceSettingsUpdateParams.payments` to be optional
* Add support for `delayDaysOverride` on `BalanceSettings.payments.settlement_timing`
* Add support for `automaticTax` and `invoiceCreation` on `checkout.SessionUpdateParams`
* Add support for `unitLabel` on `checkout.SessionUpdateParams.line_items[].price_data.product_data`
* Add support for `invoiceSettings` on `checkout.SessionUpdateParams.subscription_data`
* Add support for `intendedSubmissionMethod` on `DisputeUpdateParams` and `Dispute`
* Change type of `Dispute.smart_disputes.recommendedEvidence` from `string` to `array(string)`
* Add support for `pix` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for new value `pix` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `billingSchedules` on `InvoiceCreatePreviewParams.subscription_details`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for `paypay` on `PaymentAttemptRecord.payment_method_details` and `PaymentRecord.payment_method_details`
* Add support for `wallet` on `PaymentAttemptRecord.payment_method_details.card` and `PaymentRecord.payment_method_details.card`
* Add support for `flexible` on `QuotePreviewSubscriptionSchedule.billing_mode`
* Add support for `billedUntil` on `SubscriptionItem`

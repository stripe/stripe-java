---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2221
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.3.0-alpha.1
---

* Change type of `billing.AlertCreateParams.spend_threshold.groupBy` from `literal('pricing_plan_subscription')` to `enum('billing_cadence'|'pricing_plan_subscription')`
* ⚠️ Change type of `billing.Alert.spend_threshold.groupBy` from `literal('pricing_plan_subscription')` to `enum('billing_cadence'|'pricing_plan_subscription')`
* Add support for `wechatPay` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for `giftCard` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
* Add support for `paymentDetails` on `PaymentIntentCreateParams.payments_orchestration`
* Add support for `enabled` on `PaymentIntent.payment_details.benefit.fr_meal_voucher` and `SetupIntent.setup_details.benefit.fr_meal_voucher`
* ⚠️ Remove support for `loginFailed`, `registrationFailed`, `registrationSuccess`, and `type` on `radar.CustomerEvaluationUpdateParams`
* ⚠️ Remove support for `latestVersion` on `v2.billing.LicenseFee`, `v2.billing.PricingPlan`, and `v2.billing.RateCard`
* ⚠️ Remove support for `serviceIntervalCount` and `serviceInterval` on `v2.billing.LicenseFee` and `v2.billing.RateCard`
* Add support for `debitAgreement` on `v2.moneymanagement.ReceivedCredit.stripe_balance_payment`
* Add support for new value `chaps` on enum `v2.FinancialAddressCreditSimulationCreditParams.network`
* Add support for `canonicalPath` on `EventsV2CoreHealthTrafficVolumeDropFiringEvent.impact` and `EventsV2CoreHealthTrafficVolumeDropResolvedEvent.impact`
* Add support for snapshot event `payment_intent.expired` with resource `PaymentIntent`
* Add support for event notifications `V2CoreHealthElementsErrorFiringEvent`, `V2CoreHealthElementsErrorResolvedEvent`, `V2CoreHealthInvoiceCountDroppedFiringEvent`, and `V2CoreHealthInvoiceCountDroppedResolvedEvent`

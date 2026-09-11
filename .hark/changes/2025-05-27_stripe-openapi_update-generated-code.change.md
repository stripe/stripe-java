---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1995
is_stripe_api_change: true
released_in_version: 29.3.0-beta.1
---

### Breaking changes
* Remove support for deprecated previews
  * Remove support for resources `billing.MeterErrorReport`, `giftcards.Card`, `giftcards.Transaction`, and `privacy.RedactionJobRootObjects`
  * Remove support for `create`, `list`, `retrieve`, `update`, and `validate` methods on resource `giftcards.Card`
  * Remove support for `cancel`, `confirm`, `create`, `list`, `retrieve`, and `update` methods on resource `giftcards.Transaction`
  * Remove support for `provisioning` on `ProductCreateParams` and `Product`
  * Remove support for snapshot event `billing.meter_error_report.triggered` with resource `billing.MeterErrorReport`
* Remove support for values `credits_attributed_to_debits` and `legacy_prorations` from enums `InvoiceCreatePreviewParams.schedule_details.billingMode`, `InvoiceCreatePreviewParams.subscription_details.billingMode`, `QuoteCreateParams.subscription_data.billingMode`, `SubscriptionCreateParams.billingMode`, `SubscriptionScheduleCreateParams.billingMode`, and `checkout.SessionCreateParams.subscription_data.billingMode`
* Change type of `checkout.SessionUpdateParams.line_items[].quantity` from `emptyable(longInteger)` to `longInteger`
* Change type of `InvoiceCreatePreviewParams.subscription_details.cancelAt`, `SubscriptionCreateParams.cancelAt`, and `SubscriptionUpdateParams.cancelAt` from `DateTime` to `DateTime | enum('max_period_end'|'min_period_end')`
* Remove support for `credits` on `OrderCreateParams`, `OrderUpdateParams`, and `Order`
* Remove support for `amountRemaining` on `Order`
* Remove support for `amountCredit` on `Order.total_details`
* Remove support for `asyncWorkflows` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentDecrementAuthorizationParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
* Change type of `PaymentRecordReportPaymentAttemptCanceledParams.metadata`, `PaymentRecordReportPaymentAttemptFailedParams.metadata`, `PaymentRecordReportPaymentAttemptGuaranteedParams.metadata`, `PaymentRecordReportPaymentAttemptParams.metadata`, and `PaymentRecordReportPaymentParams.metadata` from `map(string: string)` to `emptyable(map(string: string))`
* Change type of `privacy.RedactionJob.objects` from `$Privacy.RedactionJobRootObjects` to `RedactionResourceRootObjects`
* Change type of `privacy.RedactionJobValidationError.erroringObject` from `map(string: string)` to `RedactionResourceErroringObject`
* Remove support for `status` on `tax.Association`

### Other changes
* Add support for `migrate` method on resource `Subscription`
* Add support for `distance`, `pickupLocationName`, `returnLocationName`, and `vehicleIdentificationNumber` on `ChargeCaptureParams.payment_details.car_rental`, `ChargeUpdateParams.payment_details.car_rental`, `PaymentIntent.payment_details.car_rental`, `PaymentIntentCaptureParams.payment_details.car_rental`, `PaymentIntentConfirmParams.payment_details.car_rental`, `PaymentIntentCreateParams.payment_details.car_rental`, and `PaymentIntentUpdateParams.payment_details.car_rental`
* Add support for `driverIdentificationNumber` and `driverTaxNumber` on `ChargeCaptureParams.payment_details.car_rental.drivers[]`, `ChargeUpdateParams.payment_details.car_rental.drivers[]`, `PaymentIntent.payment_details.car_rental.drivers[]`, `PaymentIntentCaptureParams.payment_details.car_rental.drivers[]`, `PaymentIntentConfirmParams.payment_details.car_rental.drivers[]`, `PaymentIntentCreateParams.payment_details.car_rental.drivers[]`, and `PaymentIntentUpdateParams.payment_details.car_rental.drivers[]`
* Add support for new values `classic` and `flexible` on enums `InvoiceCreatePreviewParams.schedule_details.billingMode`, `InvoiceCreatePreviewParams.subscription_details.billingMode`, `QuoteCreateParams.subscription_data.billingMode`, `SubscriptionCreateParams.billingMode`, `SubscriptionScheduleCreateParams.billingMode`, and `checkout.SessionCreateParams.subscription_data.billingMode`
* Add support for `institution` on `financialconnections.Account`
* Add support for `countries` on `financialconnections.Institution`
* Add support for `location` and `reader` on `PaymentAttemptRecord.payment_method_details.affirm`, `PaymentAttemptRecord.payment_method_details.wechat_pay`, `PaymentRecord.payment_method_details.affirm`, and `PaymentRecord.payment_method_details.wechat_pay`
* Add support for `hooks` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentDecrementAuthorizationParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
* Add support for `cardPresent` on `PaymentIntentAmountDetailsLineItem.payment_method_options`
* Add support for `livemode` on `privacy.RedactionJob`
* Add support for `billingThresholds` on `QuotePreviewSubscriptionSchedule.default_settings`, `QuotePreviewSubscriptionSchedule.phases[].items[]`, and `QuotePreviewSubscriptionSchedule.phases[]`
* Add support for `billingModeDetails` on `Subscription`
* Add support for `taxTransactionAttempts` on `tax.Association`
* Add support for `confirmConfig` on `terminal.Reader.action.confirm_payment_intent` and `terminal.ReaderConfirmPaymentIntentParams`

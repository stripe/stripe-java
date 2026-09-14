---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2112
is_stripe_api_change: true
released_in_version: 31.1.0-alpha.1
---

* Add support for new resources `BalanceTransfer` and `radar.AccountEvaluation`
* Add support for `create` method on resource `BalanceTransfer`
* Add support for `create`, `retrieve`, and `update` methods on resource `radar.AccountEvaluation`
* Add support for `specifiedCommercialTransactionsActUrl` on `Account.business_profile`, `AccountCreateParams.business_profile`, and `AccountUpdateParams.business_profile`
* Add support for `paypayPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* Change type of `billing.analytics.MeterUsageRetrieveParams.meters[].dimensionFilters` from `string` to `array(string)`
* Change type of `billing.analytics.MeterUsageRetrieveParams.meters[].tenantFilters` from `string` to `array(string)`
* Add support for `paymentMethodConfiguration` on `billingportal.Configuration.features.payment_method_update`
* Add support for `carRentalData`, `flightData`, and `lodgingData` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
* Add support for `transactionId` on `Charge.payment_method_details.ideal`, `PaymentAttemptRecord.payment_method_details.ideal`, and `PaymentRecord.payment_method_details.ideal`
* Add support for new value `finom` on enums `ConfirmationTokenCreateParams.payment_method_data.ideal.bank`, `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for `created` on `CustomerBalanceTransactionListParams` and `InvoicePaymentListParams`
* Add support for `accountNumbers` on `financialconnections.Account`
* Add support for `billingSchedulesActions` on `InvoiceCreatePreviewParams.schedule_details.amendments[]` and `SubscriptionScheduleAmendParams.amendments[]`
* Add support for `fraudRisk` on `issuing.AuthorizationCreateParams.risk_assessment`
* Add support for `latestFraudWarning` on `issuing.Card`
* Add support for `supplementaryPurchaseData` on `OrderCreateParams.payment.settings.payment_method_options.klarna`, `OrderUpdateParams.payment.settings.payment_method_options.klarna`, `PaymentIntentConfirmParams.payment_method_options.klarna`, `PaymentIntentCreateParams.payment_method_options.klarna`, and `PaymentIntentUpdateParams.payment_method_options.klarna`
* Add support for `captureMethod` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
* Add support for `allowRedisplay` and `customerAccount` on `PaymentMethodListParams`
* Add support for `mbWay` and `twint` on `Refund.destination_details`
* Change type of `SubscriptionScheduleUpdateParams.billingSchedules` from `array(billing_schedules_update_params)` to `emptyable(array(billing_schedules_update_params))`
* Add support for new values `capital.financing_offer.accepted_other_offer`, `financial_connections.account.account_numbers_updated`, and `financial_connections.account.upcoming_account_number_expiry` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new value `2025-11-17.clover` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for snapshot events `financial_connections.account.account_numbers_updated` and `financial_connections.account.upcoming_account_number_expiry` with resource `financialconnections.Account`

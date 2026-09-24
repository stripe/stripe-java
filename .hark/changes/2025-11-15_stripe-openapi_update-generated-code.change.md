---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2108
is_stripe_api_change: true
released_in_version: 31.0.0
---

* Add support for new resources `tax.Association` and `terminal.OnboardingLink`
* Add support for `find` method on resource `tax.Association`
* Add support for `create` method on resource `terminal.OnboardingLink`
* Add support for `paymentMethodConfiguration` on `billingportal.Configuration.features.payment_method_update`
* Add support for `transactionId` on `Charge.payment_method_details.ideal`, `PaymentAttemptRecord.payment_method_details.ideal`, and `PaymentRecord.payment_method_details.ideal`
* Add support for new value `finom` on enums `ConfirmationTokenCreateParams.payment_method_data.ideal.bank`, `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for `created` on `CustomerBalanceTransactionListParams` and `InvoicePaymentListParams`
* Add support for `accountNumbers` on `financialconnections.Account`
* Add support for `fraudRisk` on `issuing.AuthorizationCreateParams.risk_assessment`
* Add support for `latestFraudWarning` on `issuing.Card`
* Add support for `hooks` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
* Add support for `mbWay` and `twint` on `Refund.destination_details`
* Add support for new values `financial_connections.account.account_numbers_updated` and `financial_connections.account.upcoming_account_number_expiry` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for snapshot events `financial_connections.account.account_numbers_updated` and `financial_connections.account.upcoming_account_number_expiry` with resource `financialconnections.Account`

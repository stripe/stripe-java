---
title: Update generated code.
pr_url: https://github.com/stripe/stripe-java/pull/2013
is_stripe_api_change: true
released_in_version: 29.3.0
---

* Add support for `migrate` method on resource `Subscription`
* Add support for `collect_payment_method` and `confirm_payment_intent` methods on resource `terminal.Reader`
* Add support for `cryptoPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `proofOfAddress` on `AccountCreateParams.documents` and `AccountUpdateParams.documents`
* Add support for `monthlyPayoutDays` and `weeklyPayoutDays` on `Account.settings.payouts.schedule`, `AccountCreateParams.settings.payouts.schedule`, and `AccountUpdateParams.settings.payouts.schedule`
* Add support for `crypto` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Change type of `Charge.payment_method_details.card.installments.plan.type`, `ConfirmationToken.payment_method_options.card.installments.plan.type`, `ConfirmationTokenCreateParams.payment_method_options.card.installments.plan.type`, `InvoiceCreateParams.payment_settings.payment_method_options.card.installments.plan.type`, `InvoiceUpdateParams.payment_settings.payment_method_options.card.installments.plan.type`, `PaymentIntent.payment_method_options.card.installments.available_plans[].type`, `PaymentIntent.payment_method_options.card.installments.plan.type`, `PaymentIntentConfirmParams.payment_method_options.card.installments.plan.type`, `PaymentIntentCreateParams.payment_method_options.card.installments.plan.type`, and `PaymentIntentUpdateParams.payment_method_options.card.installments.plan.type` from `literal('fixed_count')` to `enum('bonus'|'fixed_count'|'revolving')`
* Add support for `subscriptions` on `PaymentIntentConfirmParams.payment_method_options.klarna`, `PaymentIntentCreateParams.payment_method_options.klarna`, `PaymentIntentUpdateParams.payment_method_options.klarna`, and `checkout.SessionCreateParams.payment_method_options.klarna`
* Add support for new value `crypto` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for `billingMode` on `InvoiceCreatePreviewParams.schedule_details`, `InvoiceCreatePreviewParams.subscription_details`, `Quote.subscription_data`, `QuoteCreateParams.subscription_data`, `SubscriptionCreateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionSchedule`, `Subscription`, and `checkout.SessionCreateParams.subscription_data`
* Add support for new value `buut` on enums `ConfirmationTokenCreateParams.payment_method_data.ideal.bank`, `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for new value `crypto` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new value `crypto` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Change type of `Dispute.enhancedEligibilityTypes` from `literal('visa_compelling_evidence_3')` to `enum('visa_compelling_evidence_3'|'visa_compliance')`
* Add support for `relatedPerson` on `identity.VerificationSessionCreateParams` and `identity.VerificationSession`
* Add support for `matching` on `identity.VerificationSession.options`
* Add support for new value `crypto` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `klarna` on `Mandate.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
* Add support for `onDemand` on `PaymentIntentConfirmParams.payment_method_options.klarna`, `PaymentIntentCreateParams.payment_method_options.klarna`, and `PaymentIntentUpdateParams.payment_method_options.klarna`
* Change type of `PaymentIntent.payment_method_options.klarna.setupFutureUsage`, `PaymentIntentConfirmParams.payment_method_options.klarna.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.klarna.setupFutureUsage`, and `PaymentIntentUpdateParams.payment_method_options.klarna.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session'|'on_session')`
* Add support for `ua` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Change type of `terminal.LocationUpdateParams.displayName` from `string` to `emptyable(string)`
* Add support for `collectPaymentMethod` and `confirmPaymentIntent` on `terminal.Reader.action`
* Add support for `status` on `treasury.FinancialAccountListParams`
* Add support for new value `terminal.reader.action_updated` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new value `2025-06-30.basil` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for snapshot event `terminal.reader.action_updated` with resource `terminal.Reader`

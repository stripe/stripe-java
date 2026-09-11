---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/2220
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.2.0
---

* Add support for new resource `v2.commerce.ProductCatalogImport`
* Add support for `create` and `retrieve` methods on resource `v2.commerce.ProductCatalogImport`
* Add support for `bizumPayments` and `scalapayPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `automaticTransferRulesByCurrency` on `BalanceSettings.payments.payouts` and `BalanceSettingsUpdateParams.payments.payouts`
* Add support for `startOfDay` on `BalanceSettings.payments.settlement_timing` and `BalanceSettingsUpdateParams.payments.settlement_timing`
* Add support for `description` on `ChargeCreateParams.transfer_data`, `PaymentIntent.transfer_data`, `PaymentIntentCreateParams.transfer_data`, and `PaymentIntentUpdateParams.transfer_data`
* Add support for `bizum` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_options`
* Add support for `scalapay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `Refund.destination_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, `checkout.Session.payment_method_options`, and `checkout.SessionCreateParams.payment_method_options`
* Add support for `mandate` on `Charge.payment_method_details.twint`, `PaymentAttemptRecord.payment_method_details.twint`, and `PaymentRecord.payment_method_details.twint`
* Add support for new values `bizum` and `scalapay` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, `SetupIntentUpdateParams.excludedPaymentMethodTypes`, and `checkout.SessionCreateParams.excludedPaymentMethodTypes`
* Change type of `PaymentIntentConfirmParams.payment_method_options.twint.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.twint.setupFutureUsage`, `PaymentIntentUpdateParams.payment_method_options.twint.setupFutureUsage`, and `checkout.SessionCreateParams.payment_method_options.twint.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for new values `bizum` and `scalapay` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* ⚠️ Change type of `PaymentIntent.payment_method_options.twint.setupFutureUsage` and `checkout.Session.payment_method_options.twint.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for new values `bizum` and `scalapay` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new values `bizum` and `scalapay` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `creditedItems` on `InvoiceItem.proration_details`
* Add support for new value `twint` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `discountable` on `InvoiceCreatePreviewParams.schedule_details.phases[].add_invoice_items[]`, `SubscriptionCreateParams.add_invoice_items[]`, `SubscriptionSchedule.phases[].add_invoice_items[]`, `SubscriptionScheduleCreateParams.phases[].add_invoice_items[]`, `SubscriptionScheduleUpdateParams.phases[].add_invoice_items[]`, and `SubscriptionUpdateParams.add_invoice_items[]`
* Add support for `billingSchedules` on `InvoiceCreatePreviewParams.subscription_details`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for new value `max_billed_until` on enums `InvoiceCreatePreviewParams.subscription_details.cancelAt`, `SubscriptionCreateParams.cancelAt`, and `SubscriptionUpdateParams.cancelAt`
* Add support for `amountPaidOffStripe` on `Invoice`
* Add support for `twint` on `Mandate.payment_method_details` and `SetupAttempt.payment_method_details`
* Add support for `metadata` on `PaymentIntent.transfer_data`, `PaymentIntentCreateParams.transfer_data`, `PaymentIntentUpdateParams.transfer_data`, and `Subscription.pending_update`
* Add support for `paymentData` on `PaymentIntent.transfer_data`, `PaymentIntentCreateParams.transfer_data`, and `PaymentIntentUpdateParams.transfer_data`
* Add support for `blikAuthorize` on `PaymentIntent.next_action` and `SetupIntent.next_action`
* Add support for `paymentMethodOptions` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
* Add support for new value `bizum` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for `active` on `PaymentMethodConfigurationListParams`
* Add support for `billedUntil` on `SubscriptionItem`
* Add support for `discount` and `discounts` on `Subscription.pending_update`
* Add support for `verifoneM425`, `verifoneP630`, `verifoneUx700`, and `verifoneV660p` on `terminal.ConfigurationCreateParams`, `terminal.ConfigurationUpdateParams`, and `terminal.Configuration`
* Add support for new values `simulated_verifone_m425`, `simulated_verifone_p630`, `simulated_verifone_ux700`, `simulated_verifone_v660p`, `verifone_m425`, `verifone_p630`, `verifone_ux700`, and `verifone_v660p` on enum `terminal.ReaderListParams.deviceType`
* Add support for `apiError` and `printContent` on `terminal.Reader.action`
* Add support for `customer` on `testhelpers.TestClockCreateParams`
* Add support for new value `2026-05-27.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `signer` on `v2.core.Account.identity.business_details.documents.proof_of_registration`, `v2.core.Account.identity.business_details.documents.proof_of_ultimate_beneficial_ownership`, `v2.core.AccountCreateParams.identity.business_details.documents.proof_of_registration`, `v2.core.AccountCreateParams.identity.business_details.documents.proof_of_ultimate_beneficial_ownership`, `v2.core.AccountTokenCreateParams.identity.business_details.documents.proof_of_registration`, `v2.core.AccountTokenCreateParams.identity.business_details.documents.proof_of_ultimate_beneficial_ownership`, `v2.core.AccountUpdateParams.identity.business_details.documents.proof_of_registration`, and `v2.core.AccountUpdateParams.identity.business_details.documents.proof_of_ultimate_beneficial_ownership`
* Add support for `azureEventGrid` on `v2.core.EventDestinationCreateParams` and `v2.core.EventDestination`
* Add support for new value `azure_event_grid` on enum `v2.core.EventDestinationCreateParams.type`
* Add support for new value `meter_event_value_too_many_digits` on enums `EventsV1BillingMeterErrorReportTriggeredEvent.reason.error_types[].code` and `EventsV1BillingMeterNoMeterFoundEvent.reason.error_types[].code`
* Add support for event notifications `V2CommerceProductCatalogImportsFailedEvent`, `V2CommerceProductCatalogImportsProcessingEvent`, `V2CommerceProductCatalogImportsSucceededEvent`, and `V2CommerceProductCatalogImportsSucceededWithErrorsEvent` with related object `v2.commerce.ProductCatalogImport`

---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/2086
is_stripe_api_change: true
released_in_version: 30.1.0
---

* Add support for new resources `PaymentAttemptRecord`, `PaymentIntentAmountDetailsLineItem`, and `PaymentRecord`
* Add support for `list` and `retrieve` methods on resource `PaymentAttemptRecord`
* Add support for `report_payment_attempt_canceled`, `report_payment_attempt_failed`, `report_payment_attempt_guaranteed`, `report_payment_attempt_informational`, `report_payment_attempt`, `report_payment`, `report_refund`, and `retrieve` methods on resource `PaymentRecord`
* Add support for `list` method on resource `PaymentIntentAmountDetailsLineItem`
* Add support for `representativeDeclaration` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Change `billing.CreditGrantCreateParams.category` to be optional
* Add support for `paymentMethodConfiguration` on `billingportal.ConfigurationCreateParams.features.payment_method_update` and `billingportal.ConfigurationUpdateParams.features.payment_method_update`
* Add support for new value `mb_way` on enum `checkout.SessionCreateParams.excludedPaymentMethodTypes`
* Add support for `twint` on `checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `mb_way` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for `paymentRecordRefund` and `type` on `CreditNote.refunds[]`, `CreditNoteCreateParams.refunds[]`, `CreditNotePreviewLinesParams.refunds[]`, and `CreditNotePreviewParams.refunds[]`
* Add support for `customerSheet` and `mobilePaymentElement` on `CustomerSession.components` and `CustomerSessionCreateParams.components`
* Add support for new value `custom` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `provider` on `Customer.tax`
* Add support for new value `platform_terms_of_service` on enum `FileListParams.purpose`
* Add support for new value `platform_terms_of_service` on enum `FileCreateParams.purpose`
* Add support for `paymentRecord` on `InvoiceAttachPaymentParams`, `InvoicePayment.payment`, and `InvoicePaymentListParams.payment`
* Change type of `InvoicePaymentListParams.payment.type` from `literal('payment_intent')` to `enum('payment_intent'|'payment_record')`
* Add support for new value `custom` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `amountDetails` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentIncrementAuthorizationParams`, and `PaymentIntentUpdateParams`
* Add support for `paymentDetails` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
* Add support for `discountAmount`, `lineItems`, `shipping`, and `tax` on `PaymentIntent.amount_details`
* Add support for `nameCollection` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
* Add support for new value `mb_way` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for `crypto` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, and `Refund.destination_details`
* Add support for `mbWay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `custom` on `PaymentMethodCreateParams` and `PaymentMethod`
* Add support for `excludedPaymentMethodTypes` on `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntent`
* Add support for `tw` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for `gip` on `terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for `lastSeenAt` on `terminal.Reader`
* Add support for new values `balance_settings.updated` and `invoice.payment_attempt_required` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new value `2025-10-29.clover` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `gt`, `gte`, `lt`, `lte`, and `types` on `v2.core.EventListParams`
* Change `v2.core.EventListParams.objectId` to be optional
* Add support for snapshot event `balance_settings.updated` with resource `BalanceSettings`
* Add support for snapshot event `invoice.payment_attempt_required` with resource `Invoice`

---
title: Support for APIs in the new API version 2025-03-31.basil
pr_link: https://github.com/stripe/stripe-java/pull/1950
is_stripe_api_change: true
released_in_version: 29.0.0
---

This release changes the pinned API version to `2025-03-31.basil`.

### ⚠️ Breaking changes  due to changes in the Stripe API

Please review details for the breaking changes and alternatives in the [Stripe API changelog](https://docs.stripe.com/changelog/basil) before upgrading.

* Remove support for resources `SubscriptionItemUsageRecordSummary` and `SubscriptionItemUsageRecord`
* Remove support for `create` method on resource `SubscriptionItemUsageRecord`
* Remove support for `list` method on resource `SubscriptionItemUsageRecordSummary`
* Remove support for `upcomingLines` and `upcoming` methods on resource `Invoice`
* Remove support for `invoice` on `Charge` and `PaymentIntent`
* Remove support for `shippingDetails` on `Checkout.Session`
* Remove support for `carrier`, `phone`, and `trackingNumber` on `Checkout.Session.collected_information.shipping_details`
* Remove support for `refund` on `CreditNoteCreateParams`, `CreditNotePreviewLinesListParams`, `CreditNotePreviewParams`, and `CreditNote`
* Remove support for `taxAmounts` on `CreditNoteLineItem`, `CreditNote`, and `InvoiceLineItem`
* Remove support for `amountExcludingTax` and `unitAmountExcludingTax` on `CreditNoteLineItem` and `InvoiceLineItem`
* Remove support for `coupon` on `CustomerCreateParams`, `CustomerUpdateParams`, `InvoiceCreatePreviewParams.schedule_details.phases[]`, `InvoiceCreatePreviewParams`, `SubscriptionCreateParams`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.phases[]`, and `SubscriptionUpdateParams`
* Remove support for `promotionCode` on `CustomerCreateParams`, `CustomerUpdateParams`, `SubscriptionCreateParams`, and `SubscriptionUpdateParams`
* Remove support for `price` on `InvoiceAddLinesParams.lines[]`, `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, `InvoiceItem`, `InvoiceLineItemUpdateParams`, `InvoiceLineItem`, and `InvoiceUpdateLinesParams.lines[]`
* Remove support for `billingThresholds` on `InvoiceCreatePreviewParams.schedule_details.phases[].items[]`, `InvoiceCreatePreviewParams.schedule_details.phases[]`, `InvoiceCreatePreviewParams.subscription_details.items[]`, `SubscriptionCreateParams.items[]`, `SubscriptionCreateParams`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionItem`, `SubscriptionSchedule.default_settings`, `SubscriptionSchedule.phases[].items[]`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.default_settings`, `SubscriptionScheduleCreateParams.phases[].items[]`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.default_settings`, `SubscriptionScheduleUpdateParams.phases[].items[]`, `SubscriptionScheduleUpdateParams.phases[]`, `SubscriptionUpdateParams.items[]`, `SubscriptionUpdateParams`, and `Subscription`
* Remove support for `applicationFeeAmount`, `charge`, `paidOutOfBand`, `paid`, `paymentIntent`, `quote`, `subscription`, `subscriptionDetails`, `subscriptionProrationDate`, `tax`, `totalTaxAmounts`, and `transferData` on `Invoice`
* Remove support for `discount` on `Invoice` and `Subscription`
* Remove support for `invoiceItem`, `prorationDetails`, `proration`, `taxRates`, and `type` on `InvoiceLineItem`
* Remove support for `plan` and `subscriptionItem` on `InvoiceItem` and `InvoiceLineItem`
* Remove support for `unitAmount` on `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, and `InvoiceItem`
* Remove support for `subscription` and `unitAmountDecimal` on `InvoiceItem`
* Remove support for `naverPay` on `PaymentMethodUpdateParams`
* Remove support for `aggregateUsage` on `PlanCreateParams`, `Plan`, `Price.recurring`, and `PriceCreateParams.recurring`
* Remove support for `currentPeriodEnd` and `currentPeriodStart` on `Subscription`
* Remove support for page on `V2.EventDestinationListParams` and `V2.EventListParams`

### Changes to the Stripe API

* Change `PaymentIntentConfirmParams.payment_method_options.wechat_pay.client`, `PaymentIntentCreateParams.payment_method_options.wechat_pay.client`, and `PaymentIntentUpdateParams.payment_method_options.wechat_pay.client` to be optional
* Change `politicalExposure` on `AccountPersonUpdateParams`, `AccountPersonCreateParams` from `string` to `PoliticalExposure` enum.

### Additions to the Stripe API

* Add support for new resource `InvoicePayment`
* Add support for `list` and `retrieve` methods on resource `InvoicePayment`
* Add support for `billiePayments`, `nzBankAccountBecsDebitPayments`, and `satispayPayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `hostedPaymentMethodSave` on `Account.settings.invoices` and `AccountUpdateParams.settings.invoices`
* Add support for `invoices` on `AccountCreateParams.settings`
* Add support for new value `last` on enum `billing.MeterCreateParams.default_aggregation.formula`
* Add support for `presentmentDetails` on `Charge`, `Checkout.Session`, `PaymentIntent`, and `Refund`
* Add support for `billie` and `satispay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `CustomerPaymentMethod`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `nzBankAccount` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `CustomerPaymentMethod`, `Mandate.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupAttempt.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `optionalItems` on `Checkout.Session`, `PaymentLinkCreateParams`, `PaymentLink`, and `checkout.SessionCreateParams`
* Add support for `permissions` on `Checkout.Session` and `checkout.SessionCreateParams`
* Add support for new values `billie` and `satispay` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for new value `custom` on enum `checkout.SessionCreateParams.uiMode`
* Add support for `shippingOptions` on `checkout.SessionUpdateParams`
* Add support for new values `billie`, `nz_bank_account`, and `satispay` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for `buyerId` on `ConfirmationToken.payment_method_preview.naver_pay`, `CustomerPaymentMethod.naver_pay`, and `PaymentMethod.naver_pay`
* Add support for `refunds` on `CreditNoteCreateParams`, `CreditNotePreviewLinesListParams`, `CreditNotePreviewParams`, and `CreditNote`
* Add support for `totalTaxes` on `CreditNote` and `Invoice`
* Add support for `taxes` on `CreditNoteLineItem` and `InvoiceLineItem`
* Add support for `taxabilityReason` on `InvoiceAddLinesParams.lines[].tax_amounts[]`, `InvoiceLineItemUpdateParams.tax_amounts[]`, and `InvoiceUpdateLinesParams.lines[].tax_amounts[]`
* Add support for `jurisdictionLevel` on `InvoiceAddLinesParams.lines[].tax_amounts[].tax_rate_data`, `InvoiceLineItemUpdateParams.tax_amounts[].tax_rate_data`, and `InvoiceUpdateLinesParams.lines[].tax_amounts[].tax_rate_data`
* Add support for `amountOverpaid`, `confirmationSecret`, and `payments` on `Invoice`
* Add support for `parent` on `InvoiceItem`, `InvoiceLineItem`, and `Invoice`
* Add support for new values `klarna` and `nz_bank_account` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `pricing` on `InvoiceAddLinesParams.lines[]`, `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, `InvoiceItem`, `InvoiceLineItemUpdateParams`, `InvoiceLineItem`, and `InvoiceUpdateLinesParams.lines[]`
* Add support for `taxabilityReason` on `InvoiceAddLinesParams.lines[].tax_amounts[]`, `InvoiceLineItemUpdateParams.tax_amounts[]`, and `InvoiceUpdateLinesParams.lines[].tax_amounts[]`
* Add support for `defaultValue` on `PaymentLink.custom_fields[].dropdown`, `PaymentLink.custom_fields[].numeric`, `PaymentLink.custom_fields[].text`, `PaymentLinkCreateParams.custom_fields[].dropdown`, `PaymentLinkCreateParams.custom_fields[].numeric`, `PaymentLinkCreateParams.custom_fields[].text`, `PaymentLinkUpdateParams.custom_fields[].dropdown`, `PaymentLinkUpdateParams.custom_fields[].numeric`, and `PaymentLinkUpdateParams.custom_fields[].text`
* Add support for new values `billie` and `satispay` on enums `PaymentLinkCreateParams.paymentMethodTypes` and `PaymentLinkUpdateParams.paymentMethodTypes`
* Add support for `nzBankTransfer` on `Refund.destination_details`
* Add support for `currentPeriodEnd` and `currentPeriodStart` on `SubscriptionItem`
* Add support for `wifi` on `Terminal.Configuration`, `terminal.ConfigurationCreateParams`, and `terminal.ConfigurationUpdateParams`
* Add support for new value `invoice.overpaid` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new values `2025-03-01.dashboard` and `2025-03-31.basil` on enum `WebhookEndpointCreateParams.apiVersion`

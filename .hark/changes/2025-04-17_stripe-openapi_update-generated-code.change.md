---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1985
is_stripe_api_change: true
released_in_version: 29.1.0-beta.3
---

* Add support for new resources `FxQuote` and `PaymentIntentAmountDetailsLineItem`
* Add support for new services `FxQuoteService` (accessed by `StripeClient.fxQuotes()`) and `PaymentIntentAmountDetailsLineItemService` (accessed by `StripeClient.paymentIntents()`)
* Remove support for service `InvoicePaymentService` (accessed by `StripeClient.invoices()`)
* Add support for `create`, `list`, and `retrieve` methods on resource `FxQuote`
* Remove support for `attach_payment_intent` method on resource `Invoice`
* Remove support for `list` and `retrieve` methods on resource `InvoicePaymentCollection`
* Add support for `list` method on resource `PaymentIntentAmountDetailsLineItem`
* Add support for `list` method on service `PaymentIntentService`
* Add support for `create`, `list`, and `retrieve` methods on service `FxQuoteService`
* Remove support for `list` and `retrieve` methods on service `InvoicePaymentService`
* Remove support for `attachPaymentIntent` method on service `InvoiceService`
* Add support for `registrationDate` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Add support for `usCfpbData` on `AccountCreateParams`, `AccountPersonCreateParams`, `AccountPersonUpdateParams`, `AccountUpdateParams`, `Person`, and `TokenCreateParams.person`
* Add support for `customerReference` and `orderReference` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntent.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
* Add support for `taxId` on `Charge.billing_details`, `ConfirmationToken.payment_method_preview.billing_details`, `ConfirmationTokenCreateParams.payment_method_data.billing_details`, `PaymentIntentConfirmParams.payment_method_data.billing_details`, `PaymentIntentCreateParams.payment_method_data.billing_details`, `PaymentIntentUpdateParams.payment_method_data.billing_details`, `PaymentMethod.billing_details`, `PaymentMethodCreateParams.billing_details`, `PaymentMethodUpdateParams.billing_details`, `SetupIntentConfirmParams.payment_method_data.billing_details`, `SetupIntentCreateParams.payment_method_data.billing_details`, `SetupIntentUpdateParams.payment_method_data.billing_details`, and `treasury.OutboundPaymentCreateParams.destination_payment_method_data.billing_details`
* Add support for `priceData` on `checkout.SessionUpdateParams.line_items[]`
* Change type of `checkout.SessionUpdateParams.line_items[].quantity` from `longInteger` to `emptyable(longInteger)`
* Add support for `script` on `CouponCreateParams` and `Coupon`
* Add support for `type` on `Coupon`
* Add support for new value `affirm` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `fxQuote` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `PaymentIntent`, `TransferCreateParams`, and `Transfer`
* Add support for `discountAmount`, `lineItems`, `shipping`, and `tax` on `PaymentIntent.amount_details`
* Add support for `pix` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `pendingReason` on `Refund`
* Add support for `aw`, `az`, `bd`, `bj`, `et`, `kg`, `la`, and `ph` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for new value `fx_quote.expired` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for snapshot event `fx_quote.expired` with resource `FxQuote`

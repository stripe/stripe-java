---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1774
is_stripe_api_change: true
released_in_version: 24.23.0
---

* Change type of `checkout.SessionCreateParams.payment_method_options.swish.reference` from `emptyable(string)` to `string`
* Add support for `subscription_item` on `Discount`
* Add support for `email` and `phone` on `Identity.VerificationReport`, `Identity.VerificationSession.options`, `Identity.VerificationSession.verified_outputs`, `identity.VerificationSessionCreateParams.options`, and `identity.VerificationSessionUpdateParams.options`
* Add support for `verification_flow` on `Identity.VerificationReport`, `Identity.VerificationSession`, and `identity.VerificationSessionCreateParams`
* Add support for `provided_details` on `Identity.VerificationSession`, `identity.VerificationSessionCreateParams`, and `identity.VerificationSessionUpdateParams`
* Change `identity.VerificationSessionCreateParams.type` to be optional
* Add support for `promotion_code` on `InvoiceCreateParams.discounts[]`, `InvoiceItemCreateParams.discounts[]`, `InvoiceItemUpdateParams.discounts[]`, `InvoiceUpdateParams.discounts[]`, `QuoteCreateParams.discounts[]`, and `QuoteUpdateParams.discounts[]`
* Add support for `discounts` on `InvoiceUpcomingLinesParams.subscription_items[]`, `InvoiceUpcomingParams.subscription_items[]`, `QuoteCreateParams.line_items[]`, `QuoteUpdateParams.line_items[]`, `SubscriptionCreateParams.add_invoice_items[]`, `SubscriptionCreateParams.items[]`, `SubscriptionCreateParams`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionItem`, `SubscriptionSchedule.phases[].add_invoice_items[]`, `SubscriptionSchedule.phases[].items[]`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.phases[].add_invoice_items[]`, `SubscriptionScheduleCreateParams.phases[].items[]`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.phases[].add_invoice_items[]`, `SubscriptionScheduleUpdateParams.phases[].items[]`, `SubscriptionScheduleUpdateParams.phases[]`, `SubscriptionUpdateParams.add_invoice_items[]`, `SubscriptionUpdateParams.items[]`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for `allowed_merchant_countries` and `blocked_merchant_countries` on `Issuing.Card.spending_controls`, `Issuing.Cardholder.spending_controls`, `issuing.CardCreateParams.spending_controls`, `issuing.CardUpdateParams.spending_controls`, `issuing.CardholderCreateParams.spending_controls`, and `issuing.CardholderUpdateParams.spending_controls`
* Add support for `zip` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `offline` on `SetupAttempt.payment_method_details.card_present`
* Add support for `card_present` on `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
* Add support for new value `mobile_phone_reader` on enum `terminal.ReaderListParams.device_type`

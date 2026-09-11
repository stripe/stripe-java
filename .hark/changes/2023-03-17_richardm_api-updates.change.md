---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1528
is_stripe_api_change: true
released_in_version: 22.14.0-beta.1
---

* Add support for `create_from_calculation` method on resource `Tax.Transaction`
* Add support for `paypal` on `Mandate.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
* Add support for new value `automatic_async` on enums `OrderCreateParams.payment.settings.payment_method_options.afterpay_clearpay.capture_method`, `OrderCreateParams.payment.settings.payment_method_options.card.capture_method`, `OrderUpdateParams.payment.settings.payment_method_options.afterpay_clearpay.capture_method`, and `OrderUpdateParams.payment.settings.payment_method_options.card.capture_method`
* Add support for `setup_future_usage` on `Order.payment.settings.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntent.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
* Remove support for `applies_to` on `QuotePreviewInvoiceLinesParams`
* Add support for `shipping_cost` on `Tax.Calculation`, `Tax.Transaction`, `TaxCalculationCreateParams`, and `TaxTransactionCreateReversalParams`
* Add support for `tax_breakdown` on `Tax.Calculation`
* Remove support for `tax_summary` on `Tax.Calculation`

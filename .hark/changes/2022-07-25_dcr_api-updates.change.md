---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1402
is_stripe_api_change: true
released_in_version: 20.135.0
---

* Add support for `installments` on `Checkout.Session.payment_method_options.card`, `checkout.SessionCreateParams.payment_method_options.card`, `Invoice.payment_settings.payment_method_options.card`, `InvoiceCreateParams.payment_settings.payment_method_options.card`, and `InvoiceUpdateParams.payment_settings.payment_method_options.card`
* Add support for `default_currency` and `invoice_credit_balance` on `Customer`
* Add support for `currency` on `InvoiceCreateParams`
* Add support for `default_mandate` on `Invoice.payment_settings`, `InvoiceCreateParams.payment_settings`, and `InvoiceUpdateParams.payment_settings`
* Add support for `mandate` on `InvoicePayParams`

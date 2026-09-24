---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1315
is_stripe_api_change: true
released_in_version: 20.102.0
---

* Add support for `konbini_payments` on `AccountUpdateParams.capabilities`, `AccountCreateParams.capabilities`, and `Account.capabilities`
* Add support for .payment_method_options.konbini and .payment_method_data.konbini on the PaymentIntent API.
* Add support for .payment_settings.payment_method_options.konbini on the Invoice API.
* Add support for .payment_method_options.konbini on the Subscription API
* Add support for .payment_method_options.konbini on the checkout.Session API
* Add support for `konbini_display_details` on `PaymentIntent.next_action`

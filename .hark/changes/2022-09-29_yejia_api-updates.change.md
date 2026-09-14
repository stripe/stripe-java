---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1448
is_stripe_api_change: true
released_in_version: 21.10.0
---

* Add support for `created` on `Checkout.Session`
* Add support for `setup_future_usage` on `PaymentIntent.payment_method_options.pix`, `PaymentIntentConfirmParams.payment_method_options.pix`, `PaymentIntentCreateParams.payment_method_options.pix`, and `PaymentIntentUpdateParams.payment_method_options.pix`
* Deprecate `SessionCreateParams.subscription_data.items` (use the `line_items` param instead). This will be removed in the next major version.

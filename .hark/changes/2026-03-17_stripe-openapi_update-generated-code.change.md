---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2183
is_stripe_api_change: true
released_in_version: 31.5.0-alpha.4
---

* Add support for `simulate_crypto_deposit` test helper method on resource `PaymentIntent`
* Add support for `depositOptions` and `mode` on `PaymentIntent.payment_method_options.crypto`, `PaymentIntentConfirmParams.payment_method_options.crypto`, `PaymentIntentCreateParams.payment_method_options.crypto`, and `PaymentIntentUpdateParams.payment_method_options.crypto`
* Add support for `cryptoDisplayDetails` on `PaymentIntent.next_action`

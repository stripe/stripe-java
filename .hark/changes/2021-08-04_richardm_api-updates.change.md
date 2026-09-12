---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1246
is_stripe_api_change: true
released_in_version: 20.68.0
---

* Change type of `PaymentIntentCreateParams.payment_method_options.sofort.preferred_language`, `PaymentIntentUpdateParams.payment_method_options.sofort.preferred_language`, and `PaymentIntentConfirmParams.payment_method_options.sofort.preferred_language` from `enum` to `emptyStringable(enum)`

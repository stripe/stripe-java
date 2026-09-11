---
title: Support for StripeAccount in StripeClient, and StripeContext on V1
pr_link: https://github.com/stripe/stripe-java/pull/1958
is_breaking: true
released_in_version: 29.0.0
---

* ⚠️ Adds `getStripeAccount` to `StripeResponseGetterOptions`.  If you have a class that extends `StripeResponseGetterOptions` you will need to implement this method.
* Adds `setStripeAccount` to StripeClientBuilder, so you can specify the Stripe-Account header at the client (instead of the individual request) level.

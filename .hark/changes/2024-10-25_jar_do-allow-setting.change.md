---
title: Do not allow setting Stripe.stripeVersion
pr_url: https://github.com/stripe/stripe-java/pull/1909
released_in_version: 28.1.0-beta.1
---

* `Stripe.stripeVersion` is no longer settable. If you were using this to set the beta headers, use the helper method `Stripe.addBetaVersion()` instead.

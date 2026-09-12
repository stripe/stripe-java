---
title: Fix type bounds on request
pr_url: https://github.com/stripe/stripe-java/pull/2037
is_breaking: true
released_in_version: 30.0.0
---

* ⚠️ Changes the signature of `LiveResponseGetter#request`, `ApiService#request`, and `StripeResponseGetter#request` to return `<T extends StripeObject>` instead of `<T extends StripeObjectInterface>`. This only affects advanced use cases where users are extending `StripeObjectInterface` with their own objects to deserialize Stripe responses. Those objects will now need to extend `StripeObject`.

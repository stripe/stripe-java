---
title: Add `StripeContext` object
pr_link: https://github.com/stripe/stripe-java/pull/2057
is_breaking: true
released_in_version: 30.0.0
---

- Add the `StripeContext` class. Previously, you could set the stripe context only as a string via `StripeClientBuilder .setStripeContext()`. The same method can now take an instance of the `StripeContext` class as well
- ⚠️ Change `EventNotification` (formerly known as `ThinEvent`)'s `context` property from `string` to `StripeContext`

---
title: Fix missing stripeContext in RequestOptions.toBuilderFullCopy()
pr_url: https://github.com/stripe/stripe-java/pull/2208
released_in_version: 32.1.0
---

- Fixes a bug where an existing `stripeContext` was being reset to `null` when calling `RequestOptions#toBuilderFullCopy()`

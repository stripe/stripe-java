---
title: Use HTTP status code in V2 errors
pr_link: https://github.com/stripe/stripe-java/pull/2131
is_breaking: true
released_in_version: 32.0.0
---

- `RateLimitException` now extends `StripeException` rather than `ApiException`
- Non-200 status codes from V2 endpoints will throw a `StripeException` (e.g. `RateLimitException`, `InvalidRequestException`, etc.) like in V1 instead of a generic `ApiException`

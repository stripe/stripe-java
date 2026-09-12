---
title: Adds v2 support to RateLimitException
pr_url: https://github.com/stripe/stripe-java/pull/2046
is_breaking: true
released_in_version: 30.0.0
---

* ⚠️ The base class of `RateLimitException` has been changed from `InvalidRequestException` to `ApiException`.  There is no change to the public interface for the `RateLimitException` class.

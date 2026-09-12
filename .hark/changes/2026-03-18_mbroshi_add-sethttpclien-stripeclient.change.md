---
title: Add setHttpClient to StripeClientBuilder; clean up apiKey/authenticator coupling
pr_url: https://github.com/stripe/stripe-java/pull/2182
is_breaking: true
released_in_version: 32.0.0
---

- ⚠️ Removed `RequestOptions.getApiKey()`, `RequestOptions.RequestOptionsBuilder.getApiKey()`, and `StripeClient.StripeClientBuilder.getApiKey()`. Use `getAuthenticator()` instead.
- Added `StripeClient.StripeClientBuilder.setHttpClient(HttpClient)` to allow injecting a custom HTTP client.

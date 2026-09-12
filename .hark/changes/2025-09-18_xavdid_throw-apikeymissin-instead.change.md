---
title: Throw `ApiKeyMissingException` instead of `IllegalArgumentException` for unset API keys
pr_url: https://github.com/stripe/stripe-java/pull/2041
is_breaking: true
released_in_version: 30.0.0
---

- ⚠️ throw `ApiKeyMissingException` instead of `IllegalArgumentException` when making a request before setting an API key initializing a client without an API key. Tweak the wording of that message to better indicate how to fix.

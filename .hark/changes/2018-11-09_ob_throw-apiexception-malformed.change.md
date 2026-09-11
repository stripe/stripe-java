---
title: Throw `ApiException` on malformed JSON responses
pr_link: https://github.com/stripe/stripe-java/pull/613
released_in_version: 7.6.0
---

- Previously, the library would throw `com.google.gson.JsonSyntaxException` in this case. We've chosen to release this as a minor update because we assume that most users are already catching Stripe exceptions.

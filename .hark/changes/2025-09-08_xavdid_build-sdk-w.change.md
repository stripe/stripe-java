---
title: Build SDK w/ V2 OpenAPI spec
pr_link: https://github.com/stripe/stripe-java/pull/2039
is_breaking: true
released_in_version: 30.0.0
---

- ⚠️ The delete methods for v2 APIs (the ones in the `StripeClient.v2` namespace) now return a `V2DeletedObject` which has the id of the object that has been deleted and a string representing the type of the object that has been deleted.
- ⚠️ Query params on v2 APIs (like `limit`) are now `Long` instead of `Integer` (to match v1 APIs)
- ⚠️ Deeply nested param hashes with no properties no longer have classes generated for them. Instead, they're typed as `Map<String, Object>`. Because there were no params, it's unlikely you were using these classes.

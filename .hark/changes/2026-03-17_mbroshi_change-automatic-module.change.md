---
title: Change Automatic-Module-Name to com.stripe
pr_url: https://github.com/stripe/stripe-java/pull/2181
is_breaking: true
released_in_version: 32.0.0
---

- Changes `Automatic-Module-Name` from `stripe.java` to `com.stripe`. Users with `requires stripe.java;` in their `module-info.java` will need to update to `requires com.stripe;`.

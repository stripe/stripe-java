---
title: Move `V2.Event` API resources to `V2.Core.Events`
pr_link: https://github.com/stripe/stripe-java/pull/2069
is_breaking: true
released_in_version: 30.0.0
---

- ⚠️ Move the below event related classes from `com.stripe.model.v2` to `com.stripe.model.v2.core`. This enables us to correctly match the API path to the namespace
     - `com.stripe.model.v2.Event` -> `com.stripe.model.v2.core.Event`
     - `com.stripe.model.v2.EventDestination` -> `com.stripe.model.v2.core.EventDestination`

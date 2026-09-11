---
title: Deprecate Java params based on OpenAPI spec
pr_link: https://github.com/stripe/stripe-java/pull/1787
released_in_version: 25.5.0
---

- Mark as deprecated the `persistent_token` property on `ConfirmationToken.Link.persistentToken`, `PaymentIntent.Link.persistentToken`, `PaymentMethod.Link.persistentToken`, `SetupIntent.Link.persistentToken`, `PaymentIntentConfirmParams.Link.persistentToken`, `PaymentIntentCreateParams.Link.persistentToken`, `PaymentIntentUpdateParams.Link.persistentToken`, `SetupIntentConfirmParams.Link.persistentToken`, `SetupIntentCreateParams.Link.persistentToken`, `SetupIntentUpdateParams.Link.persistentToken`. This is a legacy parameter that no longer has any function.

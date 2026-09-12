---
title: Added deprecated annotation to builder methods
pr_url: https://github.com/stripe/stripe-java/pull/1804
released_in_version: 25.8.0
---

* Deprecate Java builder params based on OpenAPI spec
  * Mark as deprecated the setters for persistent_token property on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `SetupIntentConfirmParams`, `SetupIntentCreateParams`, `SetupIntentUpdateParams`. This is a legacy parameter that no longer has any function.

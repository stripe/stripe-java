---
title: Codegen for openapi 4d4a107
pr_url: https://github.com/stripe/stripe-java/pull/850
released_in_version: 12.1.0
---

* Add support for `mandate` on `Charge`.
* Add support for `reference` on `SourceTransaction`.
* Add support for `person` on `TokenCreateParams`.
* Add support for new event types `payment_intent.canceled` and `setup_intent.canceled`
* Add support for `metadata` on `AuthorizationApproveParams` and `AuthorizationDeclineParams`
* Add `setMetadata` method on `AuthorizationUpdateParams`
* Rename `chidrens_and_infants_wear_stores` to `childrens_and_infants_wear_stores`. This is technically a breaking change, but we've chosen to release this as a minor version as the previous name was virtually unused.

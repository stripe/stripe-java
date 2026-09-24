---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/999
released_in_version: 10.11.0
---

* Add `off_session` to `SubscriptionItem` update
* Add `customer` when listing `CreditNote`
* Remove `challenge_only` enum value. This is technically a breaking change, but we've chosen to release this as a minor version in light of the fact that this value was virtually unused.

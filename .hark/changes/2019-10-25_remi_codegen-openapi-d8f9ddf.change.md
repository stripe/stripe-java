---
title: Codegen for openapi d8f9ddf
pr_link: https://github.com/stripe/stripe-java/pull/871
released_in_version: 14.3.0
---

* Remove `max_amount` from Issuing `Card`. This is technically a breaking change but only one integration was using this feature which changed a while ago

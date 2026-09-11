---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/820
released_in_version: 10.14.0
---

* Add support for unsetting `receipt_email` on `PaymentIntent`
* Remove support for `SubscriptionScheduleRevision`. This is technicall a breaking change, but we've chosen to release this as a minor version as this resource and its APIs were virtually unused.

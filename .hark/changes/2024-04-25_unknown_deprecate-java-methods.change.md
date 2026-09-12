---
title: Deprecate Java methods based on OpenAPI spec
released_in_version: 25.4.0
---

* Mark as deprecated the `approve` and `decline` methods on Authorization. Instead, [respond directly to the webhook request to approve an authorization](https://docs.stripe.com/issuing/controls/real-time-authorizations#authorization-handling).

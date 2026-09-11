---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2087
is_stripe_api_change: true
released_in_version: 30.1.0-alpha.3
---

* Add support for new resources `delegatedcheckout.RequestedSession` and `identity.BlocklistEntry`
* Add support for `confirm`, `create`, `expire`, `retrieve`, and `update` methods on resource `delegatedcheckout.RequestedSession`
* Add support for `create`, `disable`, `list`, and `retrieve` methods on resource `identity.BlocklistEntry`
* Add support for `blockedByEntry` on `identity.VerificationReport.document`, `identity.VerificationReport.selfie`, and `identity.VerificationReportListParams`

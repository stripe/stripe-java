---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2135
is_stripe_api_change: true
released_in_version: 31.2.0-alpha.2
---

* Add support for `trackingDetails` on `v2.moneymanagement.OutboundPayment`
* Add support for `paperCheck` on `v2.moneymanagement.OutboundPayment.delivery_options` and `v2.moneymanagement.OutboundPaymentCreateParams.delivery_options`
* Add support for event notification `V2CoreAccountIncludingFutureRequirementsUpdatedEvent` with related object `v2.core.Account`

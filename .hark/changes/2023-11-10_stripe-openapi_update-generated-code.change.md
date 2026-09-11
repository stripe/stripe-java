---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1681
is_stripe_api_change: true
released_in_version: 24.3.0-beta.1
---

* Add support for `metadata` on `QuoteCreateParams.phases[]`, `QuotePhase`, and `QuoteUpdateParams.phases[]`
* Add support for `last_reestimation_details` on `Quote.computed`
* Add support for new value `quote.reestimate_failed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1630
is_stripe_api_change: true
released_in_version: 23.0.0-beta.1
---

* Add support for new resources `QuotePreviewInvoice` and `QuotePreviewSchedule`
* Remove support for `applies_to` on `Invoice` and `SubscriptionSchedule`
* Add support for `cl`, `co`, `id`, `kr`, `mx`, `my`, `sa`, `th`, `tr`, and `vn` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Remove support for `hk` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for new value `quote.accept_failed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

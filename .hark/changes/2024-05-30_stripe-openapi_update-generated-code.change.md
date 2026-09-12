---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1815
is_stripe_api_change: true
released_in_version: 25.10.0
---

* Add support for `default_value` on `Checkout.Session.custom_fields[].dropdown`, `Checkout.Session.custom_fields[].numeric`, `Checkout.Session.custom_fields[].text`, `checkout.SessionCreateParams.custom_fields[].dropdown`, `checkout.SessionCreateParams.custom_fields[].numeric`, and `checkout.SessionCreateParams.custom_fields[].text`
* Add support for `generated_from` on `ConfirmationToken.payment_method_preview.card` and `PaymentMethod.card`
* Add support for new values `en-RO` and `ro-RO` on enums `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`
* Add support for new values `issuing_personalization_design.activated`, `issuing_personalization_design.deactivated`, `issuing_personalization_design.rejected`, and `issuing_personalization_design.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1298
is_stripe_api_change: true
released_in_version: 20.94.0
---

* Add support for new values `en-FR`, `es-US`, and `fr-FR` on enums `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`
* Add support for `boleto` on `SetupAttempt.payment_method_details`

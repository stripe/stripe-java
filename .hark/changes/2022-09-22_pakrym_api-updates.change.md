---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1445
is_breaking: true
is_stripe_api_change: true
released_in_version: 21.9.0
---

* Add support for `terms_of_service` on `Checkout.Session.consent_collection`, `Checkout.Session.consent`, `checkout.SessionCreateParams.consent_collection`, `PaymentLink.consent_collection`, and `PaymentLinkCreateParams.consent_collection`
* ⚠️ Remove support for `plan` on `checkout.SessionCreateParams.payment_method_options.card.installments`. The property was mistakenly released and never worked.
* Add support for `amount` on `issuing.DisputeCreateParams` and `issuing.DisputeUpdateParams`
* Add support for `statement_descriptor` on `PaymentIntentIncrementAuthorizationParams`
* Add `upcomingLines` method to `Invoice` resource.

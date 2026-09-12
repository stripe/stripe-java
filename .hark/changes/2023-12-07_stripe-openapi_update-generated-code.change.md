---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1700
is_stripe_api_change: true
released_in_version: 24.7.0
---

* Add support for `payment_details`, `payments`, and `payouts` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `features` on `AccountSession.components.account_onboarding` and `AccountSessionCreateParams.components.account_onboarding`
* Add support for `inactive_message` and `restrictions` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
* Add support for `transfer_group` on `PaymentLink.payment_intent_data`, `PaymentLinkCreateParams.payment_intent_data`, and `PaymentLinkUpdateParams.payment_intent_data`
* Add support for `trial_settings` on `PaymentLink.subscription_data`, `PaymentLinkCreateParams.subscription_data`, and `PaymentLinkUpdateParams.subscription_data`

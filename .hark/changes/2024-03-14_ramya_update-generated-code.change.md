---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1763
is_stripe_api_change: true
released_in_version: 24.20.0
---

* Add support for new resources `Issuing.PersonalizationDesign` and `Issuing.PhysicalBundle`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `PersonalizationDesign`
* Add support for `list` and `retrieve` methods on resource `PhysicalBundle`
* Add support for `personalization_design` on `Issuing.Card`, `issuing.CardCreateParams`, `issuing.CardListParams`, and `issuing.CardUpdateParams`
* Change type of `SubscriptionCreateParams.application_fee_percent` and `SubscriptionUpdateParams.application_fee_percent` from `number` to `emptyStringable(number)`
* Add support for `sepa_debit` on `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`

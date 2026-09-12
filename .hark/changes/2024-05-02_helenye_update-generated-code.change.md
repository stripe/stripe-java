---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1785
is_stripe_api_change: true
released_in_version: 25.5.0
---

* Add support for `paypal` on `Dispute.payment_method_details`
* Change type of `Dispute.payment_method_details.type` from `literal('card')` to `enum('card'|'paypal')`
* Change type of `entitlements.FeatureUpdateParams.metadata` from `map(string: string)` to `emptyable(map(string: string))`
* Add support for `payment_method_types` on `PaymentIntentConfirmParams`
* Add support for `ship_from_details` on `Tax.Calculation`, `Tax.Transaction`, and `tax.CalculationCreateParams`
* Add support for `bh`, `eg`, `ge`, `ke`, `kz`, `ng`, and `om` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`

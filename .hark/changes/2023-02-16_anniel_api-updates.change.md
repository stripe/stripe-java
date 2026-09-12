---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1514
is_stripe_api_change: true
released_in_version: 22.9.0
---

* Add support for `refund_payment` method on resource `Terminal.Reader`
* Add support for new value `name` on enums `billingportal.ConfigurationCreateParams.features.customer_update.allowed_updates[]` and `billingportal.ConfigurationUpdateParams.features.customer_update.allowed_updates[]`
* Add support for `custom_fields` on `Checkout.Session`, `checkout.SessionCreateParams`, `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
* Add support for `interac_present` on `terminal.ReaderPresentPaymentMethodParams`
* Change type of `terminal.ReaderPresentPaymentMethodParams.type` from `literal('card_present')` to `enum('card_present'|'interac_present')`
* Add support for `refund_payment` on `Terminal.Reader.action`

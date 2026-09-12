---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1710
is_stripe_api_change: true
released_in_version: 24.10.0-beta.1
---

* Add support for `capital_financing_promotion` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Change type of `PaymentLink.subscription_data.invoice_settings` from `nullable(PaymentLinksResourceSubscriptionDataInvoiceSettings)` to `PaymentLinksResourceSubscriptionDataInvoiceSettings`
* Add support for `ship_from_details` on `Tax.Calculation`, `Tax.Transaction`, and `tax.CalculationCreateParams`

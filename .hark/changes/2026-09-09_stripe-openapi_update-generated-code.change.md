---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2285
is_stripe_api_change: true
released_in_version: 33.5.0-alpha.3
---

* Add support for `customerTaxExemption` on `tax.Calculation.shipping_cost.tax_breakdown[]`, `tax.CalculationLineItem.tax_breakdown[]`, and `tax.Transaction.shipping_cost.tax_breakdown[]`
* Add support for `backdateStartDate` on `checkout.Session.items[].subscription` and `checkout.SessionCreateParams.items[].subscription`
* Add support for `signals` on `identity.VerificationReport`
* Add support for `networkResponseCode` on `issuing.Authorization.request_history[]`
* Add support for `unitCostPrecision` on `PaymentIntentAmountDetailsLineItem`, `PaymentIntentCaptureParams.amount_details.line_items[]`, `PaymentIntentConfirmParams.amount_details.line_items[]`, `PaymentIntentCreateParams.amount_details.line_items[]`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[]`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[]`, and `PaymentIntentUpdateParams.amount_details.line_items[]`
* Add support for `active` on `productcatalog.TrialOfferListParams`

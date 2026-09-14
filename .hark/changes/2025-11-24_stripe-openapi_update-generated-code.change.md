---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2119
is_stripe_api_change: true
released_in_version: 31.1.0-alpha.3
---

* Add support for new resource `productcatalog.TrialOffer`
* Add support for `create` method on resource `productcatalog.TrialOffer`
* Remove support for `amountSubtotalAfterDiscount` on `delegatedcheckout.RequestedSession.line_item_details[]` and `delegatedcheckout.RequestedSession.total_details`
* Remove support for `amountTotal`, `unitAmountAfterDiscount`, and `unitDiscount` on `delegatedcheckout.RequestedSession.line_item_details[]`
* Add support for `amountCartDiscount` and `amountItemsDiscount` on `delegatedcheckout.RequestedSession.total_details`
* Remove support for `amountDiscount` on `delegatedcheckout.RequestedSession.total_details`
* Add support for `paymentsOrchestration` on `PaymentIntentCreateParams` and `PaymentIntent`

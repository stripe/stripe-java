---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2060
is_stripe_api_change: true
released_in_version: 30.1.0-beta.1
---

* Add support for `attach_cadence` method on resource `Subscription`
* Add support for `billingCadence` on `InvoiceCreatePreviewParams`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for `billingCadenceDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`

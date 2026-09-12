---
title: Various API changes
pr_url: https://github.com/stripe/stripe-java/pull/866
is_stripe_api_change: true
released_in_version: 14.1.0
---

* Add support for `mx_rfc` on `TaxId`
* Add support for `pending_invoice_item_interval` on  `Subscription` creation and update
* Add support for `next_pending_invoice_item_invoice` on `Subscription
* Add support for `installments` which is a feature on `PaymentIntent` and `PaymentMethod` available on MX Stripe accounts. It's also added inside `payment_method_details[card]` on `Charge`
* Add support for `next_pending_invoice_item_invoice` as a new `Capability`

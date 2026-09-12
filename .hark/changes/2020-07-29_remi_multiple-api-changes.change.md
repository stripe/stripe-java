---
title: Multiple API changes
pr_url: https://github.com/stripe/stripe-java/pull/1070
is_stripe_api_change: true
released_in_version: 19.36.0
---

* Add support for `id`, `invoice` and `invoice_item` on `Discount`
* Add support for `discount_amounts` on `CreditNote`, `CreditNoteLineItem`, `InvoiceLineItem`
* Add support for `discounts` on `InvoiceItem`, `InvoiceLineItem` and `Invoice`
* Add support for `total_discount_amounts` on `Invoice`

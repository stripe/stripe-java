---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1318
is_stripe_api_change: true
released_in_version: 20.103.0
---

* Add support for new resource `TestHelpers.TestClock`
* Add support for `test_clock` on `CustomerCreateParams`, `Customer`, `Invoice`, `InvoiceItem`, `QuoteCreateParams`, `Quote`, `Subscription`, and `SubscriptionSchedule`
* Add support for `pending_invoice_items_behavior` on `InvoiceCreateParams`
* Change type of `ProductUpdateParams.url` from `string` to `emptyStringable(string)`
* Add support for `next_action` on `Refund`

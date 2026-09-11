---
title: Multiple API changes
pr_link: https://github.com/stripe/stripe-java/pull/1088
is_stripe_api_change: true
released_in_version: 20.0.0
---

* Pin to API version `2020-08-27`
* Removed `authenticated` and `succeeded` on `payment_method_details[card][three_d_secure]` on `Charge`
* Removed `tax_percent` and `prorate` across all Billing APIs
* Renamed `plans` to `items` on `SubscriptionSchedule`
* Removed `display_items` on Checkout `Session`
* Removed `save_payment_method` and `source` on `PaymentIntent` confirm, create and update. Those parameters still work in the API but are removed from the library
* Removed `payment_method_details[bitcoin]` on `Charge`
* Removed `unified_proration` on Billing API as this is a deprecated feature that never shipped publicly
* Removed `plan` and `quantity` from `Subscription`, use `items` instead
* Removed `requested_capabilities` on `Account` creation, use `capabilities` instead
* Removed `failure_url` and `success_url` from `AccountLink`, use `refresh_url` and `return_url` instead
* Removed `invoice.payment_succeeded` and `payment_method.card_automatically_updated` events
* `sources` and `tax_ids` on `Customer` are now includable sub-lists and not returned by default when retrieving a customer. You need to explicitly expand those properties to call `getTaxIds()` or `getSources()` now to create those sub-resources. Our API Reference has been updated to reflect this.

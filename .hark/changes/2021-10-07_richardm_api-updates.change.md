---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1268
is_stripe_api_change: true
released_in_version: 20.80.0
---

* Add support for `phone_number_collection` on `checkout.SessionCreateParams` and `Checkout.Session`
* Add support for `phone` on `Checkout.Session.customer_details`
* Change `PaymentMethodListParams.customer` to be optional
* Add support for new value `customer_id` on enum `radar.ValueListCreateParams.item_type`
* Add support for new value `bbpos_wisepos_e` on enum `terminal.ReaderListParams.device_type`

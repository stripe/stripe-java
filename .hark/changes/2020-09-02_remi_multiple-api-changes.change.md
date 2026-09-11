---
title: Multiple API changes
pr_link: https://github.com/stripe/stripe-java/pull/1092
is_stripe_api_change: true
released_in_version: 20.2.0
---

* Improve support for the Issuing `Dispute` APIs. Added the Submit API, missing parameters on creation, update and list and returned evidence details
* Add support for `dispute` on Issuing `Transaction`
* Add `available_payout_methods` on `BankAccount`
* Add `payment_status` on Checkout `Session`

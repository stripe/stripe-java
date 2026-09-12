---
title: "[codegen] Update API Resources"
pr_url: https://github.com/stripe/stripe-java/pull/862
released_in_version: 13.3.0
---

* `requirements` on Issuing `Cardholder`
* `payment_method_details[au_becs_debit][mandate]` on `Charge`
* new types of tax id for Customer `TaxId`.
* `payment_behavior` on `Subscription` creation can now take the value `pending_if_incomplete`.
* `payment_behavior` on `SubscriptionItem` creation and update is now supported.
* `subscription_data[trial_from_plan]` is now supported on Checkout `Session` creation.

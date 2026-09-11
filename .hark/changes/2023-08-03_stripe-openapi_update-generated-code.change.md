---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1620
is_stripe_api_change: true
released_in_version: 22.30.0
---

* Change many types from `string` to `emptyStringable(string)`
* Add support for `subscription_details` on `Invoice`
* Add support for `preferred_settlement_speed` on `PaymentIntent.payment_method_options.us_bank_account`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, and `PaymentIntentUpdateParams.payment_method_options.us_bank_account`
* Add support for new values `sepa_debit_fingerprint` and `us_bank_account_fingerprint` on enum `radar.ValueListCreateParams.item_type`

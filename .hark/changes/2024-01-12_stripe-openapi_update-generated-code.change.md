---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1715
is_stripe_api_change: true
released_in_version: 24.11.0
---

* Add support for new resource `CustomerSession`
* Add support for `create` method on resource `CustomerSession`
* Remove support for `expand` on `BankAccountDeleteParams` and `CardDeleteParams`
* Add support for `account_type`, `default_for_currency`, and `documents` on `BankAccountUpdateParams` and `CardUpdateParams`
* Remove support for `owner` on `BankAccountUpdateParams` and `CardUpdateParams`
* Change type of `BankAccountUpdateParams.account_holder_type` and `CardUpdateParams.account_holder_type` from `enum('company'|'individual')` to `emptyStringable(enum('company'|'individual'))`
* Add support for new values `eps` and `p24` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
* Remove support for value `obligation` from enum `reporting.ReportRunCreateParams.parameters.reporting_category`
* Add support for `billing_cycle_anchor_config` on `SubscriptionCreateParams` and `Subscription`

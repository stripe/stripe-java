---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1346
is_stripe_api_change: true
released_in_version: 20.117.0
---

* Add support for new resource `CashBalance`
* Change type of `BillingPortal.Configuration.application` from `$Application` to `deletable($Application)`
* Add support for `alipay` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for new value `eu_oss_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`
* Add support for `cash_balance` on `Customer`
* Add support for `application` on `Invoice`, `Quote`, `SubscriptionSchedule`, and `Subscription`

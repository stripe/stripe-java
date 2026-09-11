---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2107
is_breaking: true
is_stripe_api_change: true
released_in_version: 30.3.0-alpha.2
---

* ⚠️ Remove support for resource `v2.tax.AutomaticRule`
* ⚠️ Remove support for `create`, `deactivate`, `find`, `retrieve`, and `update` methods on resource `v2.tax.AutomaticRule`
* Add support for `selfReportedIncome` and `selfReportedMonthlyHousingPayment` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `Person`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
* Add support for new values `amendment_end`, `line_ends_at`, `schedule_end`, and `upcoming_invoice` on enums `InvoiceCreatePreviewParams.subscription_details.billing_schedules[].bill_until.type`, `SubscriptionCreateParams.billing_schedules[].bill_until.type`, and `SubscriptionUpdateParams.billing_schedules[].bill_until.type`
* Add support for `billingSchedules` and `phaseEffectiveAt` on `Quote.subscription_data_overrides[]`, `Quote.subscription_data`, `QuoteCreateParams.subscription_data_overrides[]`, `QuoteCreateParams.subscription_data`, `QuoteUpdateParams.subscription_data_overrides[]`, and `QuoteUpdateParams.subscription_data`
* Add support for `billFrom` on `Subscription.billing_schedules[]`
* Add support for `amendmentEnd` and `lineEndsAt` on `Subscription.billing_schedules[].bill_until`

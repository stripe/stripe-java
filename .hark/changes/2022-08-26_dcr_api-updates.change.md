---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1430
is_stripe_api_change: true
released_in_version: 21.4.0
---

* Add support for `login_page` on `BillingPortal.Configuration`, `billingportal.ConfigurationCreateParams`, and `billingportal.ConfigurationUpdateParams`
* Add support for `customs` and `phone_number` on `Issuing.Card.shipping` and `issuing.CardCreateParams.shipping`
* Add support for new value `deutsche_bank_ag` on enums `PaymentIntentConfirmParams.payment_method_data.eps.bank`, `PaymentIntentCreateParams.payment_method_data.eps.bank`, `PaymentIntentUpdateParams.payment_method_data.eps.bank`, `PaymentMethodCreateParams.eps.bank`, `SetupIntentConfirmParams.payment_method_data.eps.bank`, `SetupIntentCreateParams.payment_method_data.eps.bank`, and `SetupIntentUpdateParams.payment_method_data.eps.bank`
* Add support for `description` on `Quote.subscription_data`, `QuoteCreateParams.subscription_data`, `QuoteUpdateParams.subscription_data`, `SubscriptionSchedule.default_settings`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.default_settings`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.default_settings`, and `SubscriptionScheduleUpdateParams.phases[]`

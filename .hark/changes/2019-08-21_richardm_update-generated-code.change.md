---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/828
is_stripe_api_change: true
released_in_version: 11.2.0
---

* Add support for `schedule` on `Subscription`
* Add support for `defaultPaymentMethod`, `invoiceSettings`, `collectionMethod` and `billingThresholds` to `SubscriptionSchedule` and its update and create APIs
* Add support for `mode` and `setupIntent` on Checkout `Session` and its create API
* Add support for `schedule` and `subscriptionCancelAt` to the `Invoice` Upcoming API
* Add support for new event types `subscription_schedule.*`

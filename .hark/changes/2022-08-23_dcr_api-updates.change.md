---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1422
is_stripe_api_change: true
released_in_version: 21.3.0
---

* Add support for new resource `CustomerCashBalanceTransaction`
* Remove support for value `paypal` from enums `OrderCreateParams.payment.settings.payment_method_types[]` and `OrderUpdateParams.payment.settings.payment_method_types[]`
* Add support for `currency` on `PaymentLink`
* Add support for `network` on `SetupIntentConfirmParams.payment_method_options.card`, `SetupIntentCreateParams.payment_method_options.card`, `SetupIntentUpdateParams.payment_method_options.card`, `Subscription.payment_settings.payment_method_options.card`, `SubscriptionCreateParams.payment_settings.payment_method_options.card`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card`
* Change `treasury.OutboundTransferCreateParams.destination_payment_method` to be optional
* Add support for new value `customer_cash_balance_transaction.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* Change the return type of `Customer.fundCashBalance` test helper from `CustomerBalanceTransaction` to `CustomerCashBalanceTransaction`.
  * This would generally be considered a breaking change, but we've worked with all existing users to migrate and are comfortable releasing this as a minor as it is solely a test helper method. This was essentially broken prior to this change.

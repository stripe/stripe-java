---
title: API Updates for beta branch
pr_url: https://github.com/stripe/stripe-java/pull/1513
is_stripe_api_change: true
released_in_version: 22.9.0-beta.1
---

* Updated stable APIs to the latest version
* Add support for `account_number` on `PaymentMethod.us_bank_account`
* Add support for `inferred_balances_refresh`, `subscriptions`, and `transaction_refresh` on `FinancialConnections.Account`
* Add support for `list` method on resource `Transaction`
* Add support for `manual_entry` on `FinancialConnections.Session` and `FinancialConnectionsSessionCreateParams`
* Add support for `prefetch` on `.payment_method_options.us_bank_account.financial_connections` across many resources and methods
* Add support for `status_details` and `status` on `FinancialConnections.Session`
* Add support for new resource `FinancialConnections.Transaction`
* Add support for new values `customer.subscription.paused`, `customer.subscription.resumed`, `financial_connections.account.refreshed_inferred_balances`, `financial_connections.account.refreshed_ownership`, `financial_connections.account.refreshed_transactions`, and `financial_connections.session.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* Add support for new values `inferred_balances` and `transactions` on enum `FinancialConnectionsAccountRefreshParams.features[]`
* Change `CheckoutSessionCreateParams.payment_method_options.paypal.currency`, `IssuingCardholderCreateParams.individual.first_name`, `IssuingCardholderCreateParams.individual.last_name`, `IssuingCardholderUpdateParams.individual.first_name`, and `IssuingCardholderUpdateParams.individual.last_name` to be optional
* Remove support for `id` on `QuoteCreateParams.lines[].starts_at.line_ends_at`

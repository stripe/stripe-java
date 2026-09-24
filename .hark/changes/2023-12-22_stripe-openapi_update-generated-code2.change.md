---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1707
is_stripe_api_change: true
released_in_version: 24.9.0
---

* Add support for new resource `FinancialConnections.Transaction`
* Add support for `list` and `retrieve` methods on resource `Transaction`
* Add support for `subscribe` and `unsubscribe` methods on resource `FinancialConnections.Account`
* Add support for `features` on `AccountSessionCreateParams.components.payouts`
* Add support for `edit_payout_schedule`, `instant_payouts`, and `standard_payouts` on `AccountSession.components.payouts.features`
* Change type of `Checkout.Session.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `Invoice.payment_settings.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `InvoiceCreateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `InvoiceUpdateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `PaymentIntent.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `PaymentIntentCreateParams.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `SetupIntent.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `SetupIntentConfirmParams.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `SetupIntentCreateParams.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `SetupIntentUpdateParams.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `Subscription.payment_settings.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `SubscriptionCreateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.prefetch[]`, `SubscriptionUpdateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.prefetch[]`, and `checkout.SessionCreateParams.payment_method_options.us_bank_account.financial_connections.prefetch[]` from `literal('balances')` to `enum('balances'|'transactions')`
* Add support for new value `transactions` on enum `financialconnections.AccountRefreshParams.features[]`
* Add support for `subscriptions` and `transaction_refresh` on `FinancialConnections.Account`
* Add support for `next_refresh_available_at` on `FinancialConnections.Account.balance_refresh`
* Add support for new value `transactions` on enum `financialconnections.SessionCreateParams.prefetch[]`
* Add support for new value `unknown` on enum `issuing.AuthorizationCreateParams.verification_data.authentication_exemption.type`
* Add support for `collection_method` on `Mandate.payment_method_details.us_bank_account`
* Add support for new value `challenge` on enums `PaymentIntentConfirmParams.payment_method_options.card.request_three_d_secure`, `PaymentIntentCreateParams.payment_method_options.card.request_three_d_secure`, `PaymentIntentUpdateParams.payment_method_options.card.request_three_d_secure`, `SetupIntentConfirmParams.payment_method_options.card.request_three_d_secure`, `SetupIntentCreateParams.payment_method_options.card.request_three_d_secure`, and `SetupIntentUpdateParams.payment_method_options.card.request_three_d_secure`
* Add support for `mandate_options` on `PaymentIntent.payment_method_options.us_bank_account`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account`, `SetupIntent.payment_method_options.us_bank_account`, `SetupIntentConfirmParams.payment_method_options.us_bank_account`, `SetupIntentCreateParams.payment_method_options.us_bank_account`, and `SetupIntentUpdateParams.payment_method_options.us_bank_account`
* Add support for `revolut_pay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `destination_details` on `Refund`
* Add support for new value `financial_connections.account.refreshed_transactions` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

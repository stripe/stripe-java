---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1635
is_stripe_api_change: true
released_in_version: 23.2.0
---

* Add support for `retention` on `BillingPortal.Session.flow.subscription_cancel` and `billingportal.SessionCreateParams.flow_data.subscription_cancel`
* Add support for `prefetch` on `Checkout.Session.payment_method_options.us_bank_account.financial_connections`, `FinancialConnections.Session`, `Invoice.payment_settings.payment_method_options.us_bank_account.financial_connections`, `InvoiceCreateParams.payment_settings.payment_method_options.us_bank_account.financial_connections`, `InvoiceUpdateParams.payment_settings.payment_method_options.us_bank_account.financial_connections`, `PaymentIntent.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntent.payment_method_options.us_bank_account.financial_connections`, `SetupIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`, `Subscription.payment_settings.payment_method_options.us_bank_account.financial_connections`, `SubscriptionCreateParams.payment_settings.payment_method_options.us_bank_account.financial_connections`, `SubscriptionUpdateParams.payment_settings.payment_method_options.us_bank_account.financial_connections`, `checkout.SessionCreateParams.payment_method_options.us_bank_account.financial_connections`, and `financialconnections.SessionCreateParams`
* Add support for `payment_method_details` on `Dispute`
* Change type of `PaymentIntentCreateParams.mandate_data` and `SetupIntentCreateParams.mandate_data` from `secret_key_param` to `emptyStringable(secret_key_param)`
* Change type of `PaymentIntentConfirmParams.mandate_data` and `SetupIntentConfirmParams.mandate_data` from `secret_key_param | client_key_param` to `emptyStringable(secret_key_param | client_key_param)`
* Add support for `balance_transaction` on `CustomerCashBalanceTransaction.adjusted_for_overdraft`

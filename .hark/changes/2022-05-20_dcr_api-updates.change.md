---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1354
is_stripe_api_change: true
released_in_version: 20.121.0
---

* Add support for new resources `Treasury.CreditReversal`, `Treasury.DebitReversal`, `Treasury.FinancialAccountFeatures`, `Treasury.FinancialAccount`, `Treasury.FlowDetails`, `Treasury.InboundTransfer`, `Treasury.OutboundPayment`, `Treasury.OutboundTransfer`, `Treasury.ReceivedCredit`, `Treasury.ReceivedDebit`, `Treasury.TransactionEntry`, and `Treasury.Transaction`
* Add support for `retrieve_payment_method` method on resource `Customer`
* Add support for `list_owners` and `list` methods on resource `FinancialConnections.Account`
* Change `billingportal.ConfigurationCreateParams.features.customer_update.allowed_updates` to be optional
* Add support for `afterpay_clearpay`, `au_becs_debit`, `bacs_debit`, `eps`, `fpx`, `giropay`, `grabpay`, `klarna`, `paynow`, and `sepa_debit` on `Checkout.Session.payment_method_options`
* Add support for `treasury` on `Issuing.Authorization`, `Issuing.Dispute`, `Issuing.Transaction`, and `issuing.DisputeCreateParams`
* Add support for `financial_account` on `Issuing.Card` and `issuing.CardCreateParams`
* Add support for `client_secret` on `Order`
* Add support for `networks` on `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account`, `PaymentMethod.us_bank_account`, `SetupIntentConfirmParams.payment_method_options.us_bank_account`, `SetupIntentCreateParams.payment_method_options.us_bank_account`, and `SetupIntentUpdateParams.payment_method_options.us_bank_account`
* Add support for `attach_to_self` and `flow_directions` on `SetupIntent`
* Add support for `save_default_payment_method` on `Subscription.payment_settings`, `SubscriptionCreateParams.payment_settings`, and `SubscriptionUpdateParams.payment_settings`
* Add support for `czk` on `Terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for new values `treasury.credit_reversal.created`, `treasury.credit_reversal.posted`, `treasury.debit_reversal.completed`, `treasury.debit_reversal.created`, `treasury.debit_reversal.initial_credit_granted`, `treasury.financial_account.closed`, `treasury.financial_account.created`, `treasury.financial_account.features_status_updated`, `treasury.inbound_transfer.canceled`, `treasury.inbound_transfer.created`, `treasury.inbound_transfer.failed`, `treasury.inbound_transfer.succeeded`, `treasury.outbound_payment.canceled`, `treasury.outbound_payment.created`, `treasury.outbound_payment.expected_arrival_date_updated`, `treasury.outbound_payment.failed`, `treasury.outbound_payment.posted`, `treasury.outbound_payment.returned`, `treasury.outbound_transfer.canceled`, `treasury.outbound_transfer.created`, `treasury.outbound_transfer.expected_arrival_date_updated`, `treasury.outbound_transfer.failed`, `treasury.outbound_transfer.posted`, `treasury.outbound_transfer.returned`, `treasury.received_credit.created`, `treasury.received_credit.failed`, `treasury.received_credit.reversed`, `treasury.received_credit.succeeded`, and `treasury.received_debit.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

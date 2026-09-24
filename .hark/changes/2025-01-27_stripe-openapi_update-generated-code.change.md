---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1936
is_stripe_api_change: true
released_in_version: 28.3.0
---

* Add support for `close` method on resource `Treasury.FinancialAccount`
* Add support for `pay_by_bank_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `directorship_declaration` and `ownership_exemption_reason` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Add support for `proof_of_ultimate_beneficial_ownership` on `AccountCreateParams.documents` and `AccountUpdateParams.documents`
* Add support for `financial_account` on `AccountSession.components`, `AccountSessionCreateParams.components`, and `Treasury.OutboundTransfer.destination_payment_method_details`
* Add support for `financial_account_transactions`, `issuing_card`, and `issuing_cards_list` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `advice_code` on `Charge.outcome`, `Invoice.last_finalization_error`, `PaymentIntent.last_payment_error`, `SetupAttempt.setup_error`, `SetupIntent.last_setup_error`, and `StripeError`
* Add support for `pay_by_bank` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, and `checkout.SessionCreateParams.payment_method_options`
* Add support for `country` on `Charge.payment_method_details.paypal`, `ConfirmationToken.payment_method_preview.paypal`, and `PaymentMethod.paypal`
* Add support for new value `pay_by_bank` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, `PaymentMethodListParams.type`, and `checkout.SessionCreateParams.payment_method_types[]`
* Add support for new value `SD` on enums `PaymentLinkCreateParams.shipping_address_collection.allowed_countries[]`, `PaymentLinkUpdateParams.shipping_address_collection.allowed_countries[]`, and `checkout.SessionCreateParams.shipping_address_collection.allowed_countries[]`
* Add support for `discounts` on `Checkout.Session`
* Add support for new value `pay_by_bank` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new value `pay_by_bank` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
* Add support for `phone_number_collection` on `PaymentLinkUpdateParams`
* Add support for `jpy` on `Terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for `nickname` on `Treasury.FinancialAccount`, `treasury.FinancialAccountCreateParams`, and `treasury.FinancialAccountUpdateParams`
* Add support for `forwarding_settings` on `treasury.FinancialAccountUpdateParams`
* Add support for `is_default` on `Treasury.FinancialAccount`
* Add support for `destination_payment_method_data` on `treasury.OutboundTransferCreateParams`
* Change type of `Treasury.OutboundTransfer.destination_payment_method_details.type` from `literal('us_bank_account')` to `enum('financial_account'|'us_bank_account')`
* Add support for new value `outbound_transfer` on enum `treasury.ReceivedCreditListParams.linked_flows.source_flow_type`
* Add support for `outbound_transfer` on `Treasury.ReceivedCredit.linked_flows.source_flow_details`
* Add support for new value `2025-01-27.acacia` on enum `WebhookEndpointCreateParams.api_version`

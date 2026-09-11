---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1923
is_stripe_api_change: true
released_in_version: 28.1.0
---

* Add support for `respond` test helper method on resource `Issuing.Authorization`
* Add support for `authorizer` on `AccountPersonsParams.relationship` and `TokenCreateParams.person.relationship`
* Add support for `adaptive_pricing` on `Checkout.Session` and `checkout.SessionCreateParams`
* Add support for `mandate_options` on `Checkout.Session.payment_method_options.bacs_debit`, `Checkout.Session.payment_method_options.sepa_debit`, `checkout.SessionCreateParams.payment_method_options.bacs_debit`, and `checkout.SessionCreateParams.payment_method_options.sepa_debit`
* Add support for `request_extended_authorization`, `request_incremental_authorization`, `request_multicapture`, and `request_overcapture` on `Checkout.Session.payment_method_options.card` and `checkout.SessionCreateParams.payment_method_options.card`
* Add support for `capture_method` on `checkout.SessionCreateParams.payment_method_options.kakao_pay`, `checkout.SessionCreateParams.payment_method_options.kr_card`, `checkout.SessionCreateParams.payment_method_options.naver_pay`, `checkout.SessionCreateParams.payment_method_options.payco`, and `checkout.SessionCreateParams.payment_method_options.samsung_pay`
* Add support for new value `subscribe` on enums `PaymentLinkCreateParams.submit_type` and `checkout.SessionCreateParams.submit_type`
* Add support for new value `li_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for new value `financial_account_statement` on enum `FileListParams.purpose`
* Add support for `account_holder_address`, `account_holder_name`, `account_type`, and `bank_address` on `FundingInstructions.bank_transfer.financial_addresses[].aba`, `FundingInstructions.bank_transfer.financial_addresses[].swift`, `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].aba`, and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].swift`
* Add support for new value `service_tax` on enums `InvoiceAddLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `InvoiceUpdateLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `TaxRateCreateParams.tax_type`, and `TaxRateUpdateParams.tax_type`
* Add support for `merchant_amount` and `merchant_currency` on `issuing.AuthorizationCreateParams`
* Change `issuing.AuthorizationCreateParams.amount` to be optional
* Add support for `fraud_challenges` and `verified_by_fraud_challenge` on `Issuing.Authorization`
* Add support for new value `link` on enums `PaymentIntentConfirmParams.payment_method_options.card.network`, `PaymentIntentCreateParams.payment_method_options.card.network`, `PaymentIntentUpdateParams.payment_method_options.card.network`, `SetupIntentConfirmParams.payment_method_options.card.network`, `SetupIntentCreateParams.payment_method_options.card.network`, `SetupIntentUpdateParams.payment_method_options.card.network`, `SubscriptionCreateParams.payment_settings.payment_method_options.card.network`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card.network`
* Add support for `submit_type` on `PaymentLinkUpdateParams`
* Add support for `trace_id` on `Payout`
* Add support for `network_decline_code` on `Refund.destination_details.blik` and `Refund.destination_details.swish`
* Add support for new value `2024-11-20.acacia` on enum `WebhookEndpointCreateParams.api_version`

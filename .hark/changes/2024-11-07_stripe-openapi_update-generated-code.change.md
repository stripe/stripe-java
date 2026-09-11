---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1917
is_stripe_api_change: true
released_in_version: 28.1.0-beta.2
---

* Add support for new resources `Issuing.FraudLiabilityDebit`, `PaymentAttemptRecord`, and `PaymentRecord`
* Add support for `list` and `retrieve` methods on resources `FraudLiabilityDebit` and `PaymentAttemptRecord`
* Add support for `report_payment_attempt_canceled`, `report_payment_attempt_failed`, `report_payment_attempt_guaranteed`, `report_payment_attempt`, `report_payment`, and `retrieve` methods on resource `PaymentRecord`
* Remove support for `money_movement` on `AccountSessionCreateParams.components.financial_account.features`
* Add support for `card_management`, `card_spend_dispute_management`, `cardholder_management`, and `spend_control_management` on `AccountSessionCreateParams.components.issuing_card.features`
* Add support for `disable_stripe_user_authentication` on `AccountSessionCreateParams.components.issuing_cards_list.features`
* Add support for `adaptive_pricing` on `Checkout.Session` and `checkout.SessionCreateParams`
* Add support for `mandate_options` on `Checkout.Session.payment_method_options.bacs_debit`, `Checkout.Session.payment_method_options.sepa_debit`, `checkout.SessionCreateParams.payment_method_options.bacs_debit`, and `checkout.SessionCreateParams.payment_method_options.sepa_debit`
* Add support for `request_decremental_authorization`, `request_extended_authorization`, `request_incremental_authorization`, `request_multicapture`, and `request_overcapture` on `Checkout.Session.payment_method_options.card` and `checkout.SessionCreateParams.payment_method_options.card`
* Add support for `capture_method` on `checkout.SessionCreateParams.payment_method_options.kakao_pay`, `checkout.SessionCreateParams.payment_method_options.kr_card`, `checkout.SessionCreateParams.payment_method_options.naver_pay`, `checkout.SessionCreateParams.payment_method_options.payco`, and `checkout.SessionCreateParams.payment_method_options.samsung_pay`
* Add support for new value `li_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `account_holder_address`, `account_holder_name`, `account_type`, and `bank_address` on `FundingInstructions.bank_transfer.financial_addresses[].aba`, `FundingInstructions.bank_transfer.financial_addresses[].swift`, `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].aba`, and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].swift`
* Add support for new value `custom` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
* Add support for new value `service_tax` on enums `InvoiceAddLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `InvoiceUpdateLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `TaxRateCreateParams.tax_type`, and `TaxRateUpdateParams.tax_type`
* Add support for `payment_record_data` and `payment_record` on `InvoiceAttachPaymentParams`
* Remove support for `out_of_band_payment` on `InvoiceAttachPaymentParams`
* Add support for `amount_overpaid` on `Invoice`
* Add support for `merchant_amount` and `merchant_currency` on `issuing.AuthorizationCreateParams`
* Change `issuing.AuthorizationCreateParams.amount` to be optional
* Add support for new value `link` on enums `PaymentIntentConfirmParams.payment_method_options.card.network`, `PaymentIntentCreateParams.payment_method_options.card.network`, `PaymentIntentUpdateParams.payment_method_options.card.network`, `SetupIntentConfirmParams.payment_method_options.card.network`, `SetupIntentCreateParams.payment_method_options.card.network`, `SetupIntentUpdateParams.payment_method_options.card.network`, `SubscriptionCreateParams.payment_settings.payment_method_options.card.network`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card.network`
* Add support for `submit_type` on `PaymentLinkUpdateParams`
* Add support for new values `invoice.payment_attempt_required` and `issuing_fraud_liability_debit.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

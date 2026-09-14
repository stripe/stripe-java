---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1677
is_stripe_api_change: true
released_in_version: 24.1.0
---

* Add support for new resource `Tax.Registration`
* Add support for `revolut_pay` throughout the API.
* Add support for `aba` and `swift` on `FundingInstructions.bank_transfer.financial_addresses[]` and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[]`
* Add support for `url` on `Issuing.Authorization.merchant_data`, `Issuing.Transaction.merchant_data`, `issuing.AuthorizationCreateParams.merchant_data`, `issuing.TransactionCreateForceCaptureParams.merchant_data`, and `issuing.TransactionCreateUnlinkedRefundParams.merchant_data`
* Add support for `authentication_exemption` and `three_d_secure` on `Issuing.Authorization.verification_data` and `issuing.AuthorizationCreateParams.verification_data`
* Add support for `description` on `PaymentLink.payment_intent_data`, `PaymentLinkCreateParams.payment_intent_data`, and `PaymentLinkUpdateParams.payment_intent_data`
* Add support for new value `unreconciled_customer_funds` on enum `reporting.ReportRunCreateParams.parameters.reporting_category`

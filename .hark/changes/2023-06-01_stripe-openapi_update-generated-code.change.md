---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1569
is_stripe_api_change: true
released_in_version: 22.22.0
---

* Add support for `numeric` and `text` on `checkout.SessionCreateParams.custom_fields[]`, `PaymentLinkCreateParams.custom_fields[]`, and `PaymentLinkUpdateParams.custom_fields[]`
* Add support for new values `aba` and `swift` on enums `checkout.SessionCreateParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `PaymentIntentConfirmParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `PaymentIntentCreateParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, and `PaymentIntentUpdateParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`
* Add support for new value `us_bank_transfer` on enums `checkout.SessionCreateParams.payment_method_options.customer_balance.bank_transfer.type`, `CustomerCreateFundingInstructionsParams.bank_transfer.type`, `PaymentIntentConfirmParams.payment_method_options.customer_balance.bank_transfer.type`, `PaymentIntentCreateParams.payment_method_options.customer_balance.bank_transfer.type`, and `PaymentIntentUpdateParams.payment_method_options.customer_balance.bank_transfer.type`
* Add support for `maximum_length` and `minimum_length` on `Checkout.Session.custom_fields[].numeric` and `Checkout.Session.custom_fields[].text`
* Add support for `preferred_locales` on `Issuing.Cardholder`, `issuing.CardholderCreateParams`, and `issuing.CardholderUpdateParams`
* Add support for `description`, `iin`, and `issuer` on `PaymentMethod.card_present` and `PaymentMethod.interac_present`
* Add support for `payer_email` on `PaymentMethod.paypal`

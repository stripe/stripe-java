---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2214
is_stripe_api_change: true
released_in_version: 32.2.0-alpha.4
---

* Add support for new resource `PaymentLocation`
* Add support for `create`, `delete`, `retrieve`, and `update` methods on resource `PaymentLocation`
* Add support for `protections` on `AccountCreateParams.capabilities.card_payments`, `AccountUpdateParams.capabilities.card_payments`, and `Capability`
* Add support for `giftCard` on `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, and `sharedpayment.GrantedToken.payment_method_details`
* Add support for new value `gift_card` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new value `gift_card` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `metadata` on `delegatedcheckout.RequestedSessionConfirmParams`
* Add support for `creditedItems` on `InvoiceItem.proration_details`
* Add support for `networkLifecycle` on `issuing.Dispute`
* Add support for new value `gift_card` on enums `PaymentIntentConfirmParams.excludedPaymentMethodTypes`, `PaymentIntentCreateParams.excludedPaymentMethodTypes`, `PaymentIntentUpdateParams.excludedPaymentMethodTypes`, `SetupIntentCreateParams.excludedPaymentMethodTypes`, and `SetupIntentUpdateParams.excludedPaymentMethodTypes`
* Add support for `statusDetails` on `Subscription`

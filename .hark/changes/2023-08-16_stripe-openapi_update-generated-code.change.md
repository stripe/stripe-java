---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1632
is_breaking: true
is_stripe_api_change: true
released_in_version: 23.0.0
---

* ⚠️Remove support for values `custom_account_update` and `custom_account_verification` from enum `AccountLinkCreateParams.type`
  * These values are not fully operational. Please use `account_update` and `account_onboarding` instead (see [API reference](https://stripe.com/docs/api/account_links/create#create_account_link-type)).
* ⚠️Remove support for `available_on` on `BalanceTransactionListParams`
  * Use of this parameter is discouraged. You may use [`.putExtraParam`](https://github.com/stripe/stripe-java/#parameters) if sending the parameter is still required.
* ⚠️Remove support for `alternate_statement_descriptors`, `destination`, and `dispute` on `Charge`
  * Use of these fields is discouraged.
* ⚠️Remove support for `shipping_rates` on `checkout.SessionCreateParams`
  * Please use `shipping_options` instead.
* ⚠️Remove support for `coupon` and `trial_from_plan` on `checkout.SessionCreateParams.subscription_data`
  * Please [migrate to the Prices API](https://stripe.com/docs/billing/migration/migrating-prices), or use [`.putExtraParam`](https://github.com/stripe/stripe-java/#parameters) if sending the parameter is still required.
* ⚠️Remove support for value `card_present` from enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * This value was not fully operational.
* ⚠️Remove support for `blik` on `Mandate.payment_method_details`, `PaymentMethodUpdateParams`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
  * These fields were mistakenly released.
* ⚠️Remove support for `acss_debit`, `affirm`, `au_becs_debit`, `bacs_debit`, `cashapp`, `sepa_debit`, and `zip` on `PaymentMethodUpdateParams`
  * These fields are empty.
* ⚠️Remove support for `country` on `PaymentMethod.link`
  * This field was not fully operational.
* ⚠️Remove support for `recurring` on `PriceUpdateParams`
  * This property should be set on create only.
* ⚠️Remove support for `attributes`, `caption`, and `deactivate_on` on `ProductCreateParams`, `ProductUpdateParams`, and `Product`
  * These fields are not fully operational.
* Add support for new value `2023-08-16` on enum `WebhookEndpointCreateParams.api_version`

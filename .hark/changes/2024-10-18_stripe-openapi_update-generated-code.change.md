---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1897
is_stripe_api_change: true
released_in_version: 27.2.0-beta.3
---

* Add support for `alma_payments`, `gopay_payments`, `kakao_pay_payments`, `kr_card_payments`, `naver_pay_payments`, `payco_payments`, `qris_payments`, `samsung_pay_payments`, `shopeepay_payments`, `treasury_evolve`, `treasury_fifth_third`, and `treasury_goldman_sachs` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `schedule_at_period_end` on `BillingPortal.Configuration.features.subscription_update`, `billingportal.ConfigurationCreateParams.features.subscription_update`, and `billingportal.ConfigurationUpdateParams.features.subscription_update`
* Change `billingportal.ConfigurationCreateParams.business_profile` to be optional
* Add support for `alma` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `Refund.destination_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for `gopay`, `qris`, and `shopeepay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new values `alma`, `gopay`, `qris`, and `shopeepay` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, `PaymentMethodListParams.type`, and `checkout.SessionCreateParams.payment_method_types[]`
* Add support for new values `alma`, `gopay`, `qris`, and `shopeepay` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for new value `auto` on enum `CustomerUpdateParams.tax.validate_location`
* Add support for `metadata` on `forwarding.RequestCreateParams`
* Add support for new values `jp_credit_transfer`, `kakao_pay`, `kr_card`, `naver_pay`, and `payco` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
* Remove support for value `expired` from enum `issuing.AuthorizationListParams.status`
* Add support for new values `alma`, `gopay`, `qris`, and `shopeepay` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
* Add support for `amazon_pay` on `PaymentMethodDomain`
* Add support for `external_reference` on `Tax.Form.payee` and `tax.FormListParams.payee`
* Change type of `Tax.Form.payee.type` and `tax.FormListParams.payee.type` from `literal('account')` to `enum('account'|'external_reference')`
* Add support for new values `au_serr`, `ca_mrdp`, `eu_dac7`, `gb_mrdp`, and `nz_mrdp` on enum `tax.FormListParams.type`
* Add support for `au_serr`, `ca_mrdp`, `eu_dac7`, `gb_mrdp`, and `nz_mrdp` on `Tax.Form`
* Add support for `pln` on `Terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for `bank` on `Treasury.FinancialAccountFeatures.financial_addresses.aba`, `treasury.FinancialAccountCreateParams.features.financial_addresses.aba`, `treasury.FinancialAccountUpdateFeaturesParams.financial_addresses.aba`, and `treasury.FinancialAccountUpdateParams.features.financial_addresses.aba`

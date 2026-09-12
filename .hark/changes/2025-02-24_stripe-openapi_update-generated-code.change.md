---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1943
is_stripe_api_change: true
released_in_version: 28.4.0
---

* Add support for `prices` on `Billing.CreditGrant.applicability_config.scope`, `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope`, and `billing.CreditGrantCreateParams.applicability_config.scope`
* Change `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope.price_type` and `billing.CreditGrantCreateParams.applicability_config.scope.price_type` to be optional
* Add support for `priority` on `Billing.CreditGrant` and `billing.CreditGrantCreateParams`
* Add support for `target_date` on `Checkout.Session.payment_method_options.acss_debit`, `Checkout.Session.payment_method_options.au_becs_debit`, `Checkout.Session.payment_method_options.bacs_debit`, `Checkout.Session.payment_method_options.sepa_debit`, `Checkout.Session.payment_method_options.us_bank_account`, `PaymentIntent.payment_method_options.acss_debit`, `PaymentIntent.payment_method_options.au_becs_debit`, `PaymentIntent.payment_method_options.bacs_debit`, `PaymentIntent.payment_method_options.sepa_debit`, `PaymentIntent.payment_method_options.us_bank_account`, `PaymentIntentConfirmParams.payment_method_options.acss_debit`, `PaymentIntentConfirmParams.payment_method_options.au_becs_debit`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit`, `PaymentIntentConfirmParams.payment_method_options.sepa_debit`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.acss_debit`, `PaymentIntentCreateParams.payment_method_options.au_becs_debit`, `PaymentIntentCreateParams.payment_method_options.bacs_debit`, `PaymentIntentCreateParams.payment_method_options.sepa_debit`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, `PaymentIntentUpdateParams.payment_method_options.acss_debit`, `PaymentIntentUpdateParams.payment_method_options.au_becs_debit`, `PaymentIntentUpdateParams.payment_method_options.bacs_debit`, `PaymentIntentUpdateParams.payment_method_options.sepa_debit`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account`, `checkout.SessionCreateParams.payment_method_options.acss_debit`, `checkout.SessionCreateParams.payment_method_options.au_becs_debit`, `checkout.SessionCreateParams.payment_method_options.bacs_debit`, `checkout.SessionCreateParams.payment_method_options.sepa_debit`, and `checkout.SessionCreateParams.payment_method_options.us_bank_account`
* Add support for `restrictions` on `Checkout.Session.payment_method_options.card` and `checkout.SessionCreateParams.payment_method_options.card`
* Add support for `collected_information` on `Checkout.Session` and `checkout.SessionUpdateParams`
* Add support for `metadata` on `ProductCreateParams.default_price_data`
* Change type of `TokenCreateParams.person.political_exposure` from `string` to `enum('existing'|'none')`
* Add support for new value `2025-02-24.acacia` on enum `WebhookEndpointCreateParams.api_version`

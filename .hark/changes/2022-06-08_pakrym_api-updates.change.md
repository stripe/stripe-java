---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1369
is_stripe_api_change: true
released_in_version: 20.127.0
---

* Add support for `affirm`, `bancontact`, `card`, `ideal`, `p24`, and `sofort` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for `afterpay_clearpay`, `au_becs_debit`, `bacs_debit`, `eps`, `fpx`, `giropay`, `grabpay`, `klarna`, `paynow`, and `sepa_debit` on `checkout.SessionCreateParams.payment_method_options`
* Add support for `setup_future_usage` on `Checkout.Session.payment_method_options.acss_debit`, `Checkout.Session.payment_method_options.afterpay_clearpay`, `Checkout.Session.payment_method_options.alipay`, `Checkout.Session.payment_method_options.au_becs_debit`, `Checkout.Session.payment_method_options.bacs_debit`, `Checkout.Session.payment_method_options.boleto`, `Checkout.Session.payment_method_options.eps`, `Checkout.Session.payment_method_options.fpx`, `Checkout.Session.payment_method_options.giropay`, `Checkout.Session.payment_method_options.grabpay`, `Checkout.Session.payment_method_options.klarna`, `Checkout.Session.payment_method_options.konbini`, `Checkout.Session.payment_method_options.oxxo`, `Checkout.Session.payment_method_options.paynow`, `Checkout.Session.payment_method_options.sepa_debit`, `Checkout.Session.payment_method_options.us_bank_account`, `checkout.SessionCreateParams.payment_method_options.acss_debit`, `checkout.SessionCreateParams.payment_method_options.alipay`, `checkout.SessionCreateParams.payment_method_options.boleto`, `checkout.SessionCreateParams.payment_method_options.konbini`, `checkout.SessionCreateParams.payment_method_options.oxxo`, `checkout.SessionCreateParams.payment_method_options.us_bank_account`, and `checkout.SessionCreateParams.payment_method_options.wechat_pay`
* Add support for `attach_to_self` on `SetupAttempt`, `SetupIntentCreateParams`, `SetupIntentListParams`, and `SetupIntentUpdateParams`
* Add support for `flow_directions` on `SetupAttempt`, `SetupIntentCreateParams`, and `SetupIntentUpdateParams`

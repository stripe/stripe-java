---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1942
is_stripe_api_change: true
released_in_version: 28.4.0-beta.1
---

* Add support for `rejected_reason` on `Account.risk_controls`
* Add support for `product_tax_code_selector` on `AccountSessionCreateParams.components`
* Add support for `prices` on `Billing.CreditGrant.applicability_config.scope`, `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope`, and `billing.CreditGrantCreateParams.applicability_config.scope`
* Add support for `brand_product` on `Charge.payment_method_details.amazon_pay.funding.card` and `Charge.payment_method_details.revolut_pay.funding.card`
* Add support for `restrictions` on `Checkout.Session.payment_method_options.card` and `checkout.SessionCreateParams.payment_method_options.card`
* Change type of `TokenCreateParams.person.political_exposure` from `string` to `enum('existing'|'none')`

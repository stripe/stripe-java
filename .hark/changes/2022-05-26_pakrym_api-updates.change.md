---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1363
is_stripe_api_change: true
released_in_version: 20.124.0
---

* Add support for `affirm_payments` and `link_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
* Add support for `id_number_secondary` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
* Add support for new value `affirm` on enum `checkout.SessionCreateParams.payment_method_types[]`
* Add support for `hosted_instructions_url` on `PaymentIntent.next_action.display_bank_transfer_instructions`
* Add support for `id_number_secondary_provided` on `Person`
* Add support for `card_issuing` on `treasury.FinancialAccountCreateParams.features`, `treasury.FinancialAccountUpdateFeaturesParams`, and `treasury.FinancialAccountUpdateParams.features`

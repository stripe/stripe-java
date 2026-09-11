---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1451
is_stripe_api_change: true
released_in_version: 21.11.0
---

* Add support for new value `bank_of_china` on enums `PaymentIntentConfirmParams.payment_method_data.fpx.bank`, `PaymentIntentCreateParams.payment_method_data.fpx.bank`, `PaymentIntentUpdateParams.payment_method_data.fpx.bank`, `PaymentMethodCreateParams.fpx.bank`, `SetupIntentConfirmParams.payment_method_data.fpx.bank`, `SetupIntentCreateParams.payment_method_data.fpx.bank`, and `SetupIntentUpdateParams.payment_method_data.fpx.bank`
* Add support for new values `America/Nuuk`, `Europe/Kyiv`, and `Pacific/Kanton` on enum `reporting.ReportRunCreateParams.parameters.timezone`
* Add support for `klarna` on `SetupAttempt.payment_method_details`

---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1517
is_stripe_api_change: true
released_in_version: 22.10.0
---

* Add support for new value `yoursafe` on enums `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for new value `igst` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1563
is_stripe_api_change: true
released_in_version: 22.20.0
---

* Add support for `subscription_update_confirm` and `subscription_update` on `BillingPortal.Session.flow` and `billingportal.SessionCreateParams.flow_data`
* Add support for new values `subscription_update_confirm` and `subscription_update` on enum `billingportal.SessionCreateParams.flow_data.type`
* Add support for `link` on `Charge.payment_method_details.card.wallet` and `PaymentMethod.card.wallet`
* Add support for `buyer_id` and `cashtag` on `Charge.payment_method_details.cashapp` and `PaymentMethod.cashapp`
* Add support for new values `amusement_tax` and `communications_tax` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

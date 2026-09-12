---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1866
is_stripe_api_change: true
released_in_version: 26.12.0
---

* Add support for `payer_details` on `Charge.payment_method_details.klarna`
* Add support for `amazon_pay` on `Dispute.payment_method_details`
* Add support for `automatically_finalizes_at` on `Invoice`
* Add support for `state_sales_tax` on `Tax.Registration.country_options.us` and `tax.RegistrationCreateParams.country_options.us`

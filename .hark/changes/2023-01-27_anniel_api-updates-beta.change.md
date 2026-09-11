---
title: API Updates for beta branch
pr_link: https://github.com/stripe/stripe-java/pull/1511
is_stripe_api_change: true
released_in_version: 22.8.0-beta.1
---

* Updated stable APIs to the latest version
* Add support for `list_transactions` method on resource `Tax.Transaction`
* Add support for `billing_agreement_id` on `CheckoutSessionCreateParams.payment_method_options.paypal`
* Change type of `QuoteUpdateParams.subscription_data_overrides` from `array(create_specs)` to `emptyStringable(array(update_specs))`

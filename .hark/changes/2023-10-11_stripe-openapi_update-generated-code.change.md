---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1668
is_stripe_api_change: true
released_in_version: 23.9.0
---

* Add support for `redirect_on_completion`, `return_url`, and `ui_mode` on `Checkout.Session` and `checkout.SessionCreateParams`
* Change `checkout.SessionCreateParams.success_url` to be optional
* Add support for `client_secret` on `Checkout.Session`
* Add support for `postal_code` on `Issuing.Authorization.verification_data`
* Add support for `offline` on `Terminal.Configuration`, `terminal.ConfigurationCreateParams`, and `terminal.ConfigurationUpdateParams`

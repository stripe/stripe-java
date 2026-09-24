---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1302
is_stripe_api_change: true
released_in_version: 20.96.0
---

* Add support for `bacs_debit` and `eps` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
* Add support for `image_url_png` and `image_url_svg` on `PaymentIntent.next_action.wechat_pay_display_qr_code`

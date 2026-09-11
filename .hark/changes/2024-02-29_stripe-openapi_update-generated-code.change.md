---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1751
is_stripe_api_change: true
released_in_version: 24.19.0-beta.1
---

* Remove support for resource `Entitlements.Event`
* Remove support for `quantity` and `type` on `Entitlements.Feature` and `entitlements.FeatureCreateParams`
* Add support for `livemode` on `Issuing.PersonalizationDesign`
* Add support for `application_fee_amount`, `description`, `metadata`, and `transfer_data` on `PaymentIntentDecrementAuthorizationParams`
* Add support for `enable_customer_cancellation` on `Terminal.Reader.action.collect_payment_method.collect_config` and `terminal.ReaderCollectPaymentMethodParams.collect_config`

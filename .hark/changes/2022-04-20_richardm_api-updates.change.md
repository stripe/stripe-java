---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1339
is_stripe_api_change: true
released_in_version: 20.115.0
---

* Add support for new resources `FundingInstructions` and `Terminal.Configuration`
* Add support for `create_funding_instructions` method on resource `Customer`
* Add support for `customer_balance` on `Charge.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntent<Method>Params.payment_method_data`, `PaymentIntent<Method>Params.payment_method_options`, `PaymentMethodCreateParams`, and `PaymentMethod`
* Add support for `cash_balance` on `CustomerCreateParams` and `CustomerUpdateParams`
* Add support for new value `customer_balance` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodListParams.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, and `PaymentIntentUpdateParams.payment_method_data.type`
* Add support for `amount_details` on `PaymentIntent`
* Add support for `display_bank_transfer_instructions` on `PaymentIntent.next_action`
* Add support for new value `customer_balance` on enum `PaymentMethodCreateParams.type`
* Add support for `configuration_overrides` on `Terminal.Location`, `terminal.LocationCreateParams`, and `terminal.LocationUpdateParams`

---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1765
is_stripe_api_change: true
released_in_version: 24.21.0-beta.1
---

* Add support for new resources `Billing.MeterEventAdjustment`, `Billing.MeterEvent`, and `Billing.Meter`
* Add support for `create`, `deactivate`, `list`, `reactivate`, `retrieve`, and `update` methods on resource `Meter`
* Add support for `create` method on resources `MeterEventAdjustment` and `MeterEvent`
* Add support for `create` test helper method on resource `ConfirmationToken`
* Add support for `add_lines`, `remove_lines`, and `update_lines` methods on resource `Invoice`
* Add support for `multibanco` on `ConfirmationToken.payment_method_preview`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `Refund.destination_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new value `multibanco` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `second_line` on `Issuing.PhysicalBundle.features`
* Add support for new value `multibanco` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* Add support for `multibanco_display_details` on `PaymentIntent.next_action`
* Add support for `meter` on `PlanCreateParams`, `Plan`, `Price.recurring`, `PriceCreateParams.recurring`, and `PriceListParams.recurring`

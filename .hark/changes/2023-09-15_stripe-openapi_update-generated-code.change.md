---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1647
is_stripe_api_change: true
released_in_version: 23.5.0
---

* Add support for new resource `PaymentMethodConfiguration`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `PaymentMethodConfiguration`
* Add support for `capture`, `create`, `expire`, `increment`, and `reverse` test helper methods on resource `Issuing.Authorization`
* Add support for `create_force_capture`, `create_unlinked_refund`, and `refund` test helper methods on resource `Issuing.Transaction`
* Add support for `payment_method_configuration` on `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `checkout.SessionCreateParams`
* Add support for `payment_method_configuration_details` on `Checkout.Session`, `PaymentIntent`, and `SetupIntent`
* Add support for `nonce` on `EphemeralKeyCreateParams`
* Add support for `cashback_amount` on `Issuing.Authorization.amount_details`, `Issuing.Authorization.pending_request.amount_details`, `Issuing.Authorization.request_history[].amount_details`, and `Issuing.Transaction.amount_details`
* Add support for `serial_number` on `terminal.ReaderListParams`

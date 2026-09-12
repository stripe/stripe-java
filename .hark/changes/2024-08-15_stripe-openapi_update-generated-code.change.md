---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1847
is_stripe_api_change: true
released_in_version: 26.8.0
---

* Add support for `authorization_code` on `Charge.payment_method_details.card`
* Add support for `wallet` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentMethod.card_present`
* Add support for `mandate_options` on `PaymentIntent.payment_method_options.bacs_debit`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit`, `PaymentIntentCreateParams.payment_method_options.bacs_debit`, and `PaymentIntentUpdateParams.payment_method_options.bacs_debit`
* Add support for `bacs_debit` on `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
* Add support for `chips` on `Treasury.OutboundPayment.tracking_details.us_domestic_wire`, `Treasury.OutboundTransfer.tracking_details.us_domestic_wire`, `treasury.OutboundPaymentUpdateParams.tracking_details.us_domestic_wire`, and `treasury.OutboundTransferUpdateParams.tracking_details.us_domestic_wire`

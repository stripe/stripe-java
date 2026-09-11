---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1750
is_stripe_api_change: true
released_in_version: 24.18.0
---

* Add support for `number` on `InvoiceCreateParams` and `InvoiceUpdateParams`
* Add support for `enable_customer_cancellation` on `Terminal.Reader.action.process_payment_intent.process_config`, `Terminal.Reader.action.process_setup_intent.process_config`, `terminal.ReaderProcessPaymentIntentParams.process_config`, and `terminal.ReaderProcessSetupIntentParams.process_config`
* Add support for `refund_payment_config` on `Terminal.Reader.action.refund_payment` and `terminal.ReaderRefundPaymentParams`
* Add support for `payment_method` on `TokenCreateParams.bank_account`

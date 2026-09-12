---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1683
is_stripe_api_change: true
released_in_version: 24.3.0
---

* Add support for `bacs_debit_payments` on `AccountCreateParams.settings` and `AccountUpdateParams.settings`
* Add support for `service_user_number` on `Account.settings.bacs_debit_payments`
* Add support for `capture_before` on `Charge.payment_method_details.card`
* Add support for `paypal` on `Checkout.Session.payment_method_options`
* Add support for `tax_amounts` on `CreditNoteCreateParams.lines[]`, `CreditNotePreviewLinesParams.lines[]`, and `CreditNotePreviewParams.lines[]`
* Add support for `network_data` on `Issuing.Transaction`

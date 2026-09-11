---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1639
is_stripe_api_change: true
released_in_version: 23.4.0-beta.1
---

* Rename `Quote.list_preview_invoices` to `QuotePreviewInvoice.list` and `Quote.list_preview_subscription_schedules` to `QuotePreviewSchedule.list`
* Add support for `tax_forms` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* Add support for `components` on `AccountSessionCreateParams` and `AccountSession`

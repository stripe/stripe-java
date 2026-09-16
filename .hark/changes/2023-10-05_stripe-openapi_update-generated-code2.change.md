---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1661
is_stripe_api_change: true
released_in_version: 23.9.0-beta.1
---

* Add support for `mark_draft` and `mark_stale` methods on resource `Quote`
* Remove support for `draft_quote` and `mark_stale_quote` methods on resource `Quote`
* Add support for `liability` on `Checkout.Session.automatic_tax` and `checkout.SessionCreateParams.automatic_tax`
* Add support for `issuer` on `Checkout.Session.invoice_creation.invoice_data` and `checkout.SessionCreateParams.invoice_creation.invoice_data`
* Add support for `invoice_settings` on `checkout.SessionCreateParams.subscription_data`
* Add support for `personalization_design` on `issuing.CardListParams`
* Add support for `allow_backdated_lines` on `QuoteCreateParams`, `QuoteUpdateParams`, and `Quote`
* Rename `previewInvoiceLines` to `listPreviewInvoiceLines ` on resource `Quote`

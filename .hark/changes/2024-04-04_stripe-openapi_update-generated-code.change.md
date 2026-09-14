---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1775
is_stripe_api_change: true
released_in_version: 24.24.0-beta.1
---

* Add support for `update` method on resource `Entitlements.Feature`
* Add support for `risk_controls` on `AccountCreateParams`, `AccountUpdateParams`, and `Account`
* Add support for `promotion_code` on `InvoiceAddLinesParams.lines[].discounts[]`, `InvoiceUpdateLinesParams.lines[].discounts[]`, `QuoteCreateParams.line_items[].discounts[]`, `QuoteCreateParams.lines[].actions[].add_discount`, `QuoteCreateParams.phases[].line_items[].discounts[]`, `QuoteUpdateParams.line_items[].discounts[]`, `QuoteUpdateParams.lines[].actions[].add_discount`, and `QuoteUpdateParams.phases[].line_items[].discounts[]`

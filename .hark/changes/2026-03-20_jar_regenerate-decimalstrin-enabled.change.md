---
title: Regenerate with decimal_string enabled for v2 APIs
pr_link: https://github.com/stripe/stripe-java/pull/2187
is_breaking: true
released_in_version: 32.0.0
---

- V2 API decimal fields changed type from `String` to `BigDecimal`. Code that reads or writes these fields as `String` will need to use `BigDecimal` instead. Affected fields:
  - **V2.Core.Account** / **V2.Core.AccountPerson**: `percentOwnership`
  - **PaymentEvaluation.Signals.FraudulentPayment**: `score`
  - Params: `AccountCreateParams`, `PersonCreateParams`, `AccountTokenCreateParams`, `PersonTokenCreateParams` (all: `percentOwnership`)
  - Params: `InvoiceItemCreateParams`, `InvoiceAddLinesParams`, `InvoiceUpdateLinesParams`, `InvoiceCreatePreviewParams` (all: `quantityDecimal`)

---
title: Change types for capital FinancingSummary back to BigDecimal
pr_url: https://github.com/stripe/stripe-java/pull/1930
released_in_version: 28.2.0-beta.3
---

* The type for `Capital.FinancingSummary.Details.advancePaidOutAt`, `Capital.FinancingSummary.Details.repaymentsBeginAt`, `Capital.FinancingSummary.Details.CurrentRepaymentInterval.repaymentsBeginAt` have been changed to `BigDecimal` to reflect the API

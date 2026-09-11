---
title: API Updates for beta branch
pr_link: https://github.com/stripe/stripe-java/pull/1516
is_stripe_api_change: true
released_in_version: 22.10.0-beta.1
---

* Updated stable APIs to the latest version
* Add support for `currency_conversion` on `Checkout.Session`
* Add support for `limits` on `FinancialConnections.Session` and `FinancialConnectionsSessionCreateParams`
* Remove support for `enabled` on `FinancialConnectionsSessionCreateParams.manual_entry`
* Remove support for `reference` on `Tax.Calculation` and `TaxCalculationCreateParams`
* Add support for `reference` on `TaxTransactionCreateParams`

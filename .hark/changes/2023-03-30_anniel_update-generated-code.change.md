---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1536
is_stripe_api_change: true
released_in_version: 22.15.0
---

* Remove support for `create` method on resource `Tax.Transaction`
  * This is not a breaking change, as this method was deprecated before the Tax Transactions API was released in favor of the `createFromCalculation` method.
* Add support for `export_license_id` and `export_purpose_code` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Add support for `amount_tip` on `terminal.ReaderPresentPaymentMethodParams`

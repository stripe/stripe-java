---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1497
is_stripe_api_change: true
released_in_version: 22.4.0
---

* Add support for new value `merchant_default` on enums `CashBalanceUpdateParams.settings.reconciliation_mode`, `CustomerCreateParams.cash_balance.settings.reconciliation_mode`, and `CustomerUpdateParams.cash_balance.settings.reconciliation_mode`
* Add support for `using_merchant_default` on `CashBalance.settings`

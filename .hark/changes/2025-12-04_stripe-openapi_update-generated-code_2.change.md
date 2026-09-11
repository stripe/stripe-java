---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2122
is_stripe_api_change: true
released_in_version: 31.1.0-alpha.4
---

* Add support for `checkScanning` on `AccountSession.components`
* Add support for `client` on `v2.core.Event.reason.request`
* Add support for `stripeBalancePayment` on `v2.moneymanagement.ReceivedCredit` and `v2.moneymanagement.ReceivedDebit`
* Add support for `balanceTransfer` on `v2.moneymanagement.ReceivedDebit`
* Add support for `include` on `v2.core.EventListParams` and `v2.core.EventRetrieveParams`

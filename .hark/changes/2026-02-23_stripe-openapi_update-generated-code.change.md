---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2150
is_stripe_api_change: true
released_in_version: 31.5.0-beta.1
---

* Add support for `smartDisputes` on `Account.settings`, `AccountCreateParams.settings`, `AccountUpdateParams.settings`, `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
* Add support for `emailCustomersOnSuccessfulPayment` on `Account.settings.payments`, `AccountCreateParams.settings.payments`, and `AccountUpdateParams.settings.payments`
* Add support for `managedPayments` on `PaymentIntent`, `SetupIntent`, `Subscription`, `checkout.SessionCreateParams`, and `checkout.Session`
* Add support for new value `lk_vat` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for `purpose` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundPayment`
* Add support for `branchNumber` and `swiftCode` on `v2.moneymanagement.PayoutMethod.bank_account`

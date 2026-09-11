---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2081
is_stripe_api_change: true
released_in_version: 30.2.0-beta.1
---

* Add support for `update` method on resource `v2.moneymanagement.FinancialAccount`
* Add support for `confirm_microdeposits`, `list`, and `send_microdeposits` methods on resource `v2.core.vault.UsBankAccount`
* Add support for `list` method on resource `v2.core.vault.GbBankAccount`
* Add support for `paymentPortalUrl` on `Charge.payment_method_details.rechnung`, `PaymentAttemptRecord.payment_method_details.rechnung`, and `PaymentRecord.payment_method_details.rechnung`
* Add support for `taxIdElement` on `CustomerSession.components` and `CustomerSessionCreateParams.components`
* Add support for `startingAfter` on `PaymentAttemptRecordListParams`
* Add support for `reference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.klarna`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.klarna`
* Add support for `subscriptionReference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`
* Add support for `closed` on `v2.core.AccountListParams` and `v2.core.Account`
* Add support for `usd` on `v2.core.Account.configuration.storer.capabilities.holds_currencies`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies`
* Add support for `representativeDeclaration` on `v2.core.Account.identity.attestations`, `v2.core.AccountCreateParams.identity.attestations`, and `v2.core.AccountUpdateParams.identity.attestations`
* Add support for `verification` on `v2.core.vault.UsBankAccount`
* Add support for new value `payment_method` on enums `v2.core.AccountCreateParams.configuration.customer.automatic_indirect_tax.locationSource` and `v2.core.AccountUpdateParams.configuration.customer.automatic_indirect_tax.locationSource`
* Add support for new values `application_custom` and `application_express` on enums `v2.core.AccountCreateParams.defaults.responsibilities.feesCollector` and `v2.core.AccountUpdateParams.defaults.responsibilities.feesCollector`
* Add support for `v1Id` on `EventsV2MoneyManagementTransactionCreatedEvent`
* Remove support for thin event `V2BillingBillSettingUpdatedEvent` with related object `v2.billing.BillSetting`

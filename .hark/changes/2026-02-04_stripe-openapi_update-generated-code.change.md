---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2151
is_stripe_api_change: true
released_in_version: 31.4.0-alpha.2
---

* Add support for new resource `v2.core.ConnectionSession`
* Add support for `create` and `retrieve` methods on resource `v2.core.ConnectionSession`
* Add support for `list` method on resources `v2.payments.SettlementAllocationIntentSplit` and `v2.payments.SettlementAllocationIntent`
* Add support for `agenticCommerceSettings` on `AccountSessionCreateParams.components`
* Add support for `terminalHardwareOrders` and `terminalHardwareShop` on `AccountSession.components` and `AccountSessionCreateParams.components`
* Add support for `networkCostPassthroughReport` on `AccountSession.components`
* Add support for `cadenceData` on `v2.billing.IntentCreateParams` and `v2.billing.Intent`
* Add support for `cancellationDetails` on `v2.billing.IntentAction.deactivate`, `v2.billing.IntentCreateParams.actions[].deactivate`, and `v2.billing.PricingPlanSubscription`
* Add support for `contactPhone` on `v2.core.AccountCreateParams`, `v2.core.AccountTokenCreateParams`, `v2.core.AccountUpdateParams`, and `v2.core.Account`
* Add support for `registrationDate` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, `v2.core.AccountTokenCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
* Add support for `reference` on `v2.moneymanagement.Adjustment`
* Add support for `accruedFees` on `v2.moneymanagement.FinancialAccount`
* Add support for `startingBalance` on `v2.moneymanagement.FinancialAccount.payments`
* Add support for `accountHolderAddress` and `accountHolderName` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
* Add support for `fingerprint` on `v2.moneymanagement.PayoutMethod.card`
* Add support for `cardSpend` on `v2.moneymanagement.ReceivedCredit` and `v2.moneymanagement.ReceivedDebit`
* Add support for `applicationFeeRefund`, `applicationFee`, `charge`, `dispute`, `payout`, `refund`, `reserveHold`, `reserveRelease`, `topup`, `transferReversal`, and `transfer` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for new value `accrued_fees` on enum `v2.moneymanagement.FinancialAccountListParams.types`
* Add support for new value `gb_vat` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
* Change `v2.billing.RateCardRateCreateParams.meteredItem` to be required

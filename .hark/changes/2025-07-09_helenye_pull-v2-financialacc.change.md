---
title: Pull in V2 FinancialAccount changes for June release
pr_url: https://github.com/stripe/stripe-java/pull/2026
is_stripe_api_change: true
released_in_version: 29.4.0-beta.2
---

* Add support for `close` and `create` methods on resource `v2.moneymanagement.FinancialAccount`
* Add support for `storer` on `v2.core.Account.configuration`, `v2.core.AccountCreateParams.configuration`, and `v2.core.AccountUpdateParams.configuration`
* Add support for `statusDetails` on `v2.moneymanagement.FinancialAccount`
* Add support for `status` on `v2.moneymanagement.FinancialAccountListParams`
* Add support for new value `configuration.storer` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
* Add support for new value `storer` on enum `v2.core.AccountCloseParams.appliedConfigurations`
* Add support for thin events `V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationStorerUpdatedEvent` with related object `v2.core.Account`
* Add support for error types `AlreadyExistsException` and `NonZeroBalanceException`

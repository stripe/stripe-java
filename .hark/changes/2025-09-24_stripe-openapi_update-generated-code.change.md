---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2049
is_stripe_api_change: true
released_in_version: 30.1.0-beta.1
---

* Add support for new resources `v2.billing.BillSettingVersion`, `v2.billing.BillSetting`, `v2.billing.Cadence`, `v2.billing.CollectionSettingVersion`, `v2.billing.CollectionSetting`, and `v2.billing.Profile`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resources `v2.billing.BillSetting`, `v2.billing.CollectionSetting`, and `v2.billing.Profile`
* Add support for `list` and `retrieve` methods on resources `v2.billing.BillSettingVersion` and `v2.billing.CollectionSettingVersion`
* Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `v2.billing.Cadence`
* Add support for `profile` on `v2.core.Account.defaults`, `v2.core.AccountCreateParams.defaults`, and `v2.core.AccountUpdateParams.defaults`
* Add support for `iP` on `v2.core.Account.identity.attestations.directorship_declaration`, `v2.core.Account.identity.attestations.ownership_declaration`, `v2.core.Account.identity.attestations.terms_of_service.account`, `v2.core.Account.identity.attestations.terms_of_service.storer`, `v2.core.Account.identity.individual.additional_terms_of_service.account`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.account`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.storer`, `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.account`, `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.storer`, `v2.core.Person.additional_terms_of_service.account`, `v2.core.PersonCreateParams.additional_terms_of_service.account`, and `v2.core.PersonUpdateParams.additional_terms_of_service.account`
* Remove support for `ip` on `v2.core.Account.identity.attestations.directorship_declaration`, `v2.core.Account.identity.attestations.ownership_declaration`, `v2.core.Account.identity.attestations.terms_of_service.account`, `v2.core.Account.identity.attestations.terms_of_service.storer`, `v2.core.Account.identity.individual.additional_terms_of_service.account`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.account`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.storer`, `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.account`, `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.storer`, `v2.core.Person.additional_terms_of_service.account`, `v2.core.PersonCreateParams.additional_terms_of_service.account`, and `v2.core.PersonUpdateParams.additional_terms_of_service.account`
* Remove support for `doingBusinessAs`, `productDescription`, and `url` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
* Add support for `settlementCurrency` on `v2.moneymanagement.FinancialAddress`
* Add support for `sepaBankAccount` on `v2.moneymanagement.FinancialAddress.credentials` and `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Add support for `amountDetails` and `paymentsOrchestration` on `v2.payments.OffSessionPaymentCreateParams` and `v2.payments.OffSessionPayment`
* Add support for `retryPolicy` on `v2.payments.OffSessionPayment.retry_details` and `v2.payments.OffSessionPaymentCreateParams.retry_details`
* Change type of `v2.moneymanagement.OutboundPaymentQuote.fx_quote.lockDuration` from `literal('five_minutes')` to `enum('five_minutes'|'none')`
* Add support for `originType` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Remove support for `paymentMethodType` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Add support for `mandateData` and `paymentMethodOptions` on `v2.payments.OffSessionPaymentCreateParams`
* Add support for new values `heuristic` and `scheduled` on enum `v2.payments.OffSessionPaymentCreateParams.retry_details.retryStrategy`
* Add support for new value `crypto_wallet` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* Add support for `type` on `v2.moneymanagement.FinancialAddressCreateParams`
* Remove support for `currency` on `v2.moneymanagement.FinancialAddressCreateParams`
* Add support for new values `financial_addressses.crypto_wallets`, `holds_currencies.usdc`, `outbound_payments.crypto_wallets`, and `outbound_transfers.crypto_wallets` on enum `EventsV2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for thin event `V2BillingBillSettingUpdatedEvent` with related object `v2.billing.BillSetting`
* Add support for error type `RateLimitException`

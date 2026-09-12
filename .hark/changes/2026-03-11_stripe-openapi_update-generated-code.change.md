---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2171
is_breaking: true
is_stripe_api_change: true
released_in_version: 31.5.0-alpha.3
---

* Add support for new resource `radar.IssuingAuthorizationEvaluation`
* Add support for `create` method on resource `radar.IssuingAuthorizationEvaluation`
* ⚠️ Rename `affiliateAttributions` to `affiliateAttribution` on `delegatedcheckout.RequestedSessionConfirmParams` and `delegatedcheckout.RequestedSessionCreateParams`
* Add support for `amountToCounter` on `Dispute`
* Add support for `frozenFields` on `InvoiceItem`
* Add support for `consumer` on `v2.core.Account.configuration.card_creator.capabilities`, `v2.core.Account.identity.attestations.terms_of_service.card_creator`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator`
* Add support for `fifthThird` on `v2.core.Account.configuration.card_creator.capabilities.commercial`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial`
* Add support for `prepaidCard` on `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial.cross_river_bank`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial.cross_river_bank`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial.cross_river_bank`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial.cross_river_bank`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial.cross_river_bank`
* Add support for `paymentMethodData` on `v2.payments.OffSessionPaymentCreateParams`
* Change `v2.payments.OffSessionPaymentCreateParams.paymentMethod` to be optional
* Add support for new value `next_billing_period_start` on enum `v2.billing.IntentCreateParams.actions[].apply.effective_at.type`
* Add support for new values `commercial.cross_river_bank.prepaid_card`, `commercial.fifth_third.charge_card`, `consumer.celtic.revolving_credit_card`, `consumer.cross_river_bank.prepaid_card`, and `consumer.lead.prepaid_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

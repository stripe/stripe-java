---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2213
is_stripe_api_change: true
released_in_version: 32.2.0-alpha.3
---

* Add support for `debitCard` on `v2.core.Account.configuration.card_creator.capabilities.consumer.lead`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.consumer.lead`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.consumer.lead`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.consumer.lead`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.consumer.lead`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.consumer.lead`
* Add support for new value `consumer.lead.debit_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2099
is_stripe_api_change: true
released_in_version: 30.2.0-alpha.2
---

* Change `delegatedcheckout.RequestedSessionUpdateParams.line_item_details[].quantity` to be required
* Add support for `paymentMethodPreview` on `delegatedcheckout.RequestedSession`
* Add support for `orderId` on `delegatedcheckout.RequestedSession.order_details`
* Add support for `lead` on `v2.core.Account.configuration.card_creator.capabilities.commercial`, `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountCreateParams.configuration.card_creator.capabilities.commercial`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountUpdateParams.configuration.card_creator.capabilities.commercial`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial`
* Add support for `globalAccountHolder` on `v2.core.Account.identity.attestations.terms_of_service.card_creator.commercial`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service.card_creator.commercial`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service.card_creator.commercial`
* Add support for new value `commercial.lead.prepaid_card` on enum `EventsV2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent.updatedCapability`

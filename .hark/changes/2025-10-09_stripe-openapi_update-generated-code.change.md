---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2085
is_stripe_api_change: true
released_in_version: 30.1.0-alpha.2
---

* Add support for new resource `PaymentMethodBalance`
* Add support for `check_balance` method on resource `PaymentMethod`
* Add support for `benefits` on `Card`, `Charge.payment_method_details.card`, `ConfirmationToken.payment_method_preview.card`, and `PaymentMethod.card`
* Add support for `benefit` on `PaymentIntent.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
* Add support for `setupDetails` on `SetupIntentConfirmParams`, `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntent`
* Add support for `cardCreator` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountUpdateParams.configuration`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
* Add support for new value `configuration.card_creator` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
* Add support for new value `card_creator` on enum `v2.core.AccountCloseParams.appliedConfigurations`
* Add support for thin events `V2CoreAccountIncludingConfigurationCardCreatorCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationCardCreatorUpdatedEvent` with related object `v2.core.Account`
* Remove support for thin events `V1CustomerDiscountCreatedEvent`, `V1CustomerDiscountDeletedEvent`, and `V1CustomerDiscountUpdatedEvent` with related object `Discount`

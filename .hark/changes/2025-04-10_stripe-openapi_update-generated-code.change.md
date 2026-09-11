---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1980
is_stripe_api_change: true
released_in_version: 29.1.0-beta.2
---

### Breaking changes
* Remove support for values `bank_accounts.local_uk`, `bank_accounts.wire_uk`, `cards_uk`, and `crypto_wallets_v2` from enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`

### Additions
* Add support for new resources `Privacy.RedactionJobRootObjects`, `Privacy.RedactionJobValidationError`, and `Privacy.RedactionJob`
* Add support for `cancel`, `create`, `list`, `retrieve`, `run`, `update`, and `validate` methods on resource `RedactionJob`
* Add support for `list` and `retrieve` methods on resource `RedactionJobValidationError`
* Add support for `minorityOwnedBusinessDesignation` on `Account.business_profile`, `AccountCreateParams.business_profile`, and `AccountUpdateParams.business_profile`
* Add support for `exportTaxTransactions` and `paymentDisputes` on `AccountSessionCreateParams.components`
* Add support for `walletOptions` on `Checkout.Session` and `checkout.SessionCreateParams`
* Add support for `klarna` on `PaymentMethodDomain`
* Add support for `in` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for new values `privacy.redaction_job.canceled`, `privacy.redaction_job.created`, `privacy.redaction_job.ready`, `privacy.redaction_job.succeeded`, and `privacy.redaction_job.validation_error` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`

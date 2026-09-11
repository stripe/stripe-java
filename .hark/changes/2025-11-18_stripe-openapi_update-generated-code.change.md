---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2103
is_stripe_api_change: true
released_in_version: 31.1.0-beta.1
---

* Add support for new resources `v2.core.AccountPersonToken` and `v2.core.AccountToken`
* Remove support for resource `v2.payments.OffSessionPayment`
* Add support for `create` and `retrieve` methods on resources `v2.core.AccountPersonToken` and `v2.core.AccountToken`
* Remove support for `cancel`, `capture`, `create`, `list`, and `retrieve` methods on resource `v2.payments.OffSessionPayment`
* Add support for `specifiedCommercialTransactionsActUrl` on `Account.business_profile`, `AccountCreateParams.business_profile`, and `AccountUpdateParams.business_profile`
* Add support for `paypayPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* Change type of `billing.analytics.MeterUsageRetrieveParams.meters[].dimensionFilters` from `string` to `array(string)`
* Change type of `billing.analytics.MeterUsageRetrieveParams.meters[].tenantFilters` from `string` to `array(string)`
* Add support for `carRentalData`, `flightData`, and `lodgingData` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
* Add support for `supplementaryPurchaseData` on `OrderCreateParams.payment.settings.payment_method_options.klarna`, `OrderUpdateParams.payment.settings.payment_method_options.klarna`, `PaymentIntentConfirmParams.payment_method_options.klarna`, `PaymentIntentCreateParams.payment_method_options.klarna`, and `PaymentIntentUpdateParams.payment_method_options.klarna`
* Add support for `allowRedisplay` and `customerAccount` on `PaymentMethodListParams`
* Add support for `futureRequirements` on `v2.core.Account`
* Add support for `konbiniPayments` and `scriptStatementDescriptor` on `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
* Add support for `eur` on `v2.core.Account.configuration.storer.capabilities.holds_currencies`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies`
* Add support for `requirementsCollector` on `v2.core.Account.defaults.responsibilities`
* Remove support for `collector` on `v2.core.Account.requirements`
* Add support for `changes` on `v2.core.Event`
* Remove support for value `sepa_bank_account` from enum `v2.moneymanagement.FinancialAddressCreateParams.type`
* Add support for `accountToken` on `v2.core.AccountCreateParams` and `v2.core.AccountUpdateParams`
* Add support for new value `ar_cuit` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type` and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
* Add support for new value `ar_dni` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountPersonCreateParams.id_numbers[].type`, `v2.core.AccountPersonUpdateParams.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`
* Add support for new value `future_requirements` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
* Add support for `personToken` on `v2.core.AccountPersonCreateParams` and `v2.core.AccountPersonUpdateParams`
* Add support for `changes` on `v2.core.Event`
* Add support for thin event `V2CoreHealthEventGenerationFailureResolvedEvent`
* Remove support for thin events `V2PaymentsOffSessionPaymentAuthorizationAttemptFailedEvent`, `V2PaymentsOffSessionPaymentAuthorizationAttemptStartedEvent`, `V2PaymentsOffSessionPaymentCanceledEvent`, `V2PaymentsOffSessionPaymentCreatedEvent`, `V2PaymentsOffSessionPaymentFailedEvent`, `V2PaymentsOffSessionPaymentRequiresCaptureEvent`, and `V2PaymentsOffSessionPaymentSucceededEvent` with related object `v2.payments.OffSessionPayment`

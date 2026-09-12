---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2091
is_stripe_api_change: true
released_in_version: 30.2.0-alpha.1
---

* Add support for `report_refund` method on resource `PaymentRecord`
* Add support for `tenants` on `billing.analytics.MeterUsageRow`
* Add support for `representativeDeclaration` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Add support for `transfer` on `ApplicationFee.fee_source`
* Add support for `transitBalancesTotal` on `Balance`
* Add support for `tenantGroupByKeys` on `billing.analytics.MeterUsageRetrieveParams.meters[]`
* Change `billing.CreditGrantCreateParams.category` to be optional
* Add support for `paymentMethodConfiguration` on `billingportal.ConfigurationCreateParams.features.payment_method_update` and `billingportal.ConfigurationUpdateParams.features.payment_method_update`
* Add support for `paymentPortalUrl` on `Charge.payment_method_details.rechnung`, `PaymentAttemptRecord.payment_method_details.rechnung`, and `PaymentRecord.payment_method_details.rechnung`
* Add support for `twint` on `checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for `customerSheet`, `mobilePaymentElement`, and `taxIdElement` on `CustomerSession.components` and `CustomerSessionCreateParams.components`
* Add support for new value `custom` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `provider` on `Customer.tax`
* Remove support for `riskDetails` on `delegatedcheckout.RequestedSessionCreateParams`
* Add support for `riskDetails` on `delegatedcheckout.RequestedSessionConfirmParams`
* Add support for new value `platform_terms_of_service` on enum `FileListParams.purpose`
* Add support for new value `platform_terms_of_service` on enum `FileCreateParams.purpose`
* Add support for `startingAfter` on `PaymentAttemptRecordListParams`
* Add support for `reference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.klarna`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.klarna`
* Add support for `allocatedFunds` on `PaymentIntent`
* Add support for `subscriptionReference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`
* Add support for `nameCollection` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
* Add support for `crypto` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, and `Refund.destination_details`
* Add support for `mbWay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `custom` on `PaymentMethodCreateParams` and `PaymentMethod`
* Add support for `excludedPaymentMethodTypes` on `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntent`
* Add support for `tw` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for `gip` on `terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for `lastSeenAt` on `terminal.Reader`
* Add support for `applicationFeeAmount` on `TransferCreateParams` and `Transfer`
* Add support for `applicationFee` on `Transfer`
* Add support for new value `2025-10-29.clover` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `highRiskActivitiesDescription`, `highRiskActivities`, `moneyServicesDescription`, `operatesInProhibitedCountries`, `participatesInRegulatedActivity`, `purposeOfFundsDescription`, `purposeOfFunds`, `regulatedActivity`, `sourceOfFundsDescription`, and `sourceOfFunds` on `v2.core.Account.configuration.storer`, `v2.core.AccountCreateParams.configuration.storer`, and `v2.core.AccountUpdateParams.configuration.storer`
* Add support for `cryptoWallets` on `v2.core.Account.configuration.storer.capabilities.financial_addresses`, `v2.core.Account.configuration.storer.capabilities.outbound_payments`, `v2.core.Account.configuration.storer.capabilities.outbound_transfers`, `v2.core.AccountCreateParams.configuration.storer.capabilities.financial_addresses`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_payments`, `v2.core.AccountCreateParams.configuration.storer.capabilities.outbound_transfers`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.financial_addresses`, `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_payments`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.outbound_transfers`
* Add support for `usdc` on `v2.core.Account.configuration.storer.capabilities.holds_currencies`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies`
* Add support for `cryptoStorer` on `v2.core.Account.identity.attestations.terms_of_service` and `v2.core.AccountCreateParams.identity.attestations.terms_of_service`
* Add support for `complianceScreeningDescription` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
* Add support for `externalAmount` on `v2.moneymanagement.ReceivedCredit` and `v2.moneymanagement.ReceivedDebit`

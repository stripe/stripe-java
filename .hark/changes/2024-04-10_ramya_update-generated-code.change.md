---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1776
released_in_version: 25.0.0
---

* This release changes the pinned API version to `2024-04-10`. Please read the [API Changelog](https://docs.stripe.com/changelog/2024-04-10) and carefully review the API changes before upgrading.

* Add a new `TaxIdService` for operations on `/v1/tax_ids` endpoints.

### ⚠️ Breaking changes

* Rename `features` to `marketing_features` on `ProductCreateParams`, `ProductUpdateParams`, and `Product`
* Rename "child" services to be prefixed with the associated parent service to allow for the same resource to be exposed at top level (e.g., `/v1/tax_ids` via `client.taxIds()`) and as a child (e.g., `/v1/customers/{}/tax_ids` via `client.customers().taxIds()`).
  * Rename `CapabilityService` -> `AccountCapabilityService`
  * Rename `ExternalAccountService` -> `AccountExternalAccountService`
  * Rename `LoginLinkService` -> `AccountLoginLinkService`
  * Rename `PersonService` -> `AccountPersonService`
  * Rename `FeeRefundService` -> `ApplicationFeeRefundService`
  * Rename `CashBalanceService` -> `CustomerCashBalanceService`
  * Rename `PaymentSourceService` -> `CustomerPaymentSourceService`
  * Rename `UsageRecordService` -> `SubscriptionItemUsageRecordService`
  * Rename `UsageRecordSummaryService` -> `SubscriptionItemUsageRecordSummaryService`
  * Rename `TaxIdService` -> `CustomerTaxIdService`.
* Remove support for `verify` method on `BankAccountService`.
  *  Please use the `verify` method on `CustomerPaymentSourceService` instead
  ```java
  // BEFORE
  client.bankAccounts().verify("cus_...", "ba_...");

  // AFTER
  client.customers().paymentSources().verify("cus_...", "ba_...");
  ```
* Remove support for `list` and `create` methods on `treasury.FinancialAccountFeaturesService`. These methods were incorrectly named.
  * Please migrate `list` -> `retrieve` and `create` -> `update`.
* Update `setPageTypeToken` method on `StripeCollectionInterface` to be required and remove default implementation.
* Remove deprecated `setUsage` method on `BaseApiRequest`.
* Update `usage` on `BaseApiRequest` class to be `final`.
* Remove deprecated `maybeEnqueueMetrics` method on `RequestTelemetry`.

#### ⚠️ Removal of enum values, properties and events that are no longer part of the publicly documented Stripe API

* Remove `Configuration.SubscriptionPause` for Billing Portal as the feature to pause subscription on the portal has been deprecated.
* Remove the support for the below deprecated values in `BalanceTransaction.Type`
    * `obligation_inbound`
    * `obligation_payout`
    * `obligation_payout_failure`
    * `obligation_reversal_outbound`
* Remove the below deprecated events from `Event.Type`, `WebhookEndpointCreateOptions.EnabledEvent`, `WebhookEndpointUpdateOptions.EnabledEvent`
   * `invoiceitem.updated`
   * `order.created`
   * `recipient.created`
   * `recipient.deleted`
   * `recipient.updated`
   * `sku.created`
   * `sku.deleted`
   * `sku.updated`
* Remove support for `id_bank_transfer`, `multibanco`, `netbanking`, `pay_by_bank`, and `upi` on `PaymentMethodConfiguration` by removing the below classes
   * `PaymentMethodConfiguration.IdBankTransfer`
   * `PaymentMethodConfiguration.Multibanco`
   * `PaymentMethodConfiguration.Netbanking`
   * `PaymentMethodConfiguration.PayByBank`
   * `PaymentMethodConfiguration.Upi`
* Remove the support for `challenge_only` in `SetupIntent.PaymentMethodOptions.Card.RequestThreeDSecure`
* Remove the support for deprecated value `service_tax` in `TaxRate.TaxType`, `InvoiceLinetItemUpdateParams.TaxAmount.TaxRateData.TaxType`,pweb`TaxRateCreateParams.TaxType`, `TaxRateUpdateParams.TaxType`
* Remove the support for `various` in `Climate.Supplier.removalPathway`
* Remove the deprecated value `INCLUDE_AND_REQUIRE` on the enum `InvoiceCreateParams.PendingInvoiceItemsBehavior`
* Remove the property `RequestIncrementalAuthorization` on `PaymentIntentConfirmParams.PaymentMethodOptions.CardPresent`, `PaymentIntentCreateParams.PaymentMethodOptions.CardPresent` and `PaymentIntentUpdateParams.PaymentMethodOptions.CardPresent`. This was shipped by mistake.
* Remove the support for deprecated value `obligation` on `ReportRunCreateParams.ReportingCategory`
* Remove the legacy field `rendering_options` on `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`. Use `rendering` instead.

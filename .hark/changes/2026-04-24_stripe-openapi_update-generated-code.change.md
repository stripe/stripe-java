---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2210
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.2.0-beta.2
---

* Add support for new resources `v2.commerce.ProductCatalogImport`, `v2.data.reporting.QueryRun`, `v2.extend.WorkflowRun`, `v2.extend.Workflow`, `v2.iam.ActivityLog`, `v2.network.BusinessProfile`, and `v2.orchestratedcommerce.Agreement`
* Add support for `confirm`, `create`, `list`, `retrieve`, and `terminate` methods on resource `v2.orchestratedcommerce.Agreement`
* Add support for `me` and `retrieve` methods on resource `v2.network.BusinessProfile`
* Add support for `list` method on resource `v2.iam.ActivityLog`
* Add support for `list` and `retrieve` methods on resource `v2.extend.WorkflowRun`
* Add support for `invoke`, `list`, and `retrieve` methods on resource `v2.extend.Workflow`
* Add support for `create` and `retrieve` methods on resources `v2.commerce.ProductCatalogImport` and `v2.data.reporting.QueryRun`
* ⚠️ Change type of `v2.billing.Cadence.settings_data.collection.payment_method_options.konbini`, `v2.billing.CollectionSetting.payment_method_options.konbini`, `v2.billing.CollectionSettingCreateParams.payment_method_options.konbini`, `v2.billing.CollectionSettingUpdateParams.payment_method_options.konbini`, and `v2.billing.CollectionSettingVersion.payment_method_options.konbini` from `map(string: dynamic)` to `an object`
* ⚠️ Change type of `v2.billing.Cadence.settings_data.collection.payment_method_options.sepaDebit`, `v2.billing.CollectionSetting.payment_method_options.sepaDebit`, `v2.billing.CollectionSettingCreateParams.payment_method_options.sepaDebit`, `v2.billing.CollectionSettingUpdateParams.payment_method_options.sepaDebit`, and `v2.billing.CollectionSettingVersion.payment_method_options.sepaDebit` from `map(string: dynamic)` to `an object`
* ⚠️ Change type of `v2.moneymanagement.InboundTransfer.transfer_history[].bankDebitProcessing` from `map(string: dynamic)` to `an object`
* ⚠️ Change type of `v2.moneymanagement.InboundTransfer.transfer_history[].bankDebitQueued` from `map(string: dynamic)` to `an object`
* ⚠️ Change type of `v2.moneymanagement.InboundTransfer.transfer_history[].bankDebitSucceeded` from `map(string: dynamic)` to `an object`
* Add support for new values `futsu` and `toza` on enums `v2.core.vault.GbBankAccountCreateParams.bankAccountType`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.bank_account.bankAccountType`, and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.bank_account.bankAccountType`
* Change type of `v2.core.BatchJobCreateParams.endpoint.httpMethod` from `literal('post')` to `enum('delete'|'post')`
* Add support for new value `meter_event_value_too_many_digits` on enums `EventsV1BillingMeterErrorReportTriggeredEvent.reason.error_types[].code` and `EventsV1BillingMeterNoMeterFoundEvent.reason.error_types[].code`
* Add support for `treasuryTransaction` on `EventsV2MoneyManagementTransactionCreatedEvent`
* Add support for event notifications `V2CommerceProductCatalogImportsFailedEvent`, `V2CommerceProductCatalogImportsProcessingEvent`, `V2CommerceProductCatalogImportsSucceededEvent`, and `V2CommerceProductCatalogImportsSucceededWithErrorsEvent` with related object `v2.commerce.ProductCatalogImport`
* Add support for event notifications `V2DataReportingQueryRunCreatedEvent`, `V2DataReportingQueryRunFailedEvent`, `V2DataReportingQueryRunSucceededEvent`, and `V2DataReportingQueryRunUpdatedEvent` with related object `v2.data.reporting.QueryRun`
* Add support for event notifications `V2ExtendWorkflowRunFailedEvent`, `V2ExtendWorkflowRunStartedEvent`, and `V2ExtendWorkflowRunSucceededEvent` with related object `v2.extend.WorkflowRun`
* Add support for event notifications `V2OrchestratedCommerceAgreementConfirmedEvent`, `V2OrchestratedCommerceAgreementCreatedEvent`, `V2OrchestratedCommerceAgreementPartiallyConfirmedEvent`, and `V2OrchestratedCommerceAgreementTerminatedEvent` with related object `v2.orchestratedcommerce.Agreement`
* Add support for error type `CannotProceedException`

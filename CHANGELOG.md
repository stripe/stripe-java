<!--
THIS IS A GENERATED FILE. Any changes you make to it directly will be blown away.
Instead, edit a corresponding `.change.md` file and run `hark build`.
-->

# Changelog

> This changelog only covers the **public preview** releases. Each release builds on the most recent GA release; see those notes in [the GA changelog](https://github.com/stripe/stripe-java/blob/master/CHANGELOG.md).

## 33.5.0-beta.1 - 2026-08-26
This release changes the pinned API version to `2026-08-26.preview`.

* [#2267](https://github.com/stripe/stripe-java/pull/2267) Add non-verified methods to managed handlers
* ⚠️ [#2273](https://github.com/stripe/stripe-java/pull/2273) Update generated code for beta
  * Add support for new resources `v2.core.ApprovalRequest`, `v2.signals.AccountActivity`, `v2.signals.AccountEvaluation`, and `v2.signals.AccountSignal`
  * Add support for `list` and `retrieve` methods on resource `v2.signals.AccountSignal`
  * Add support for `create` and `retrieve` methods on resource `v2.signals.AccountEvaluation`
  * Add support for `create`, `delete`, and `retrieve` methods on resource `v2.signals.AccountActivity`
  * Add support for `cancel`, `list`, `retrieve`, and `update` methods on resource `v2.core.ApprovalRequest`
  * Add support for `disable` method on resource `v2.moneymanagement.PayoutMethod`
  * Add support for `disableStripeUserAuthentication` on `AccountSessionCreateParams.components.payment_method_settings.features`
  * ⚠️ Remove support for `paymentMethodTypes` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `SetupIntentCreateParams`, and `SetupIntentUpdateParams`
  * ⚠️ Change type of `productcatalog.TrialOffer.end_behavior.transition.price` and `productcatalog.TrialOffer.price` from `$Price` to `deletable($Price)`
  * Add support for `billie` on `QuotePreviewInvoice.payment_settings.payment_method_options`
  * Add support for `payoutMethods` on `v2.core.Account.defaults` and `v2.core.AccountUpdateParams.defaults`
  * Add support for `restricted` on `v2.core.vault.GbBankAccount` and `v2.core.vault.UsBankAccount`
  * Add support for `enabledDeliverySchemes` on `v2.moneymanagement.PayoutMethod.bank_account`
  * ⚠️ Remove support for `enabledDeliveryOptions` on `v2.moneymanagement.PayoutMethod.bank_account`
  * Add support for new value `disabled` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.payments`
  * Add support for new value `disabled` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.transfers`
  * Add support for event notifications `V2CoreApprovalRequestApprovedEvent`, `V2CoreApprovalRequestCanceledEvent`, `V2CoreApprovalRequestCreatedEvent`, `V2CoreApprovalRequestExpiredEvent`, `V2CoreApprovalRequestFailedEvent`, `V2CoreApprovalRequestRejectedEvent`, and `V2CoreApprovalRequestSucceededEvent` with related object `v2.core.ApprovalRequest`
  * Add support for event notification `V2SignalsAccountEvaluationCompleteEvent` with related object `v2.signals.AccountEvaluation`

## 33.3.0-beta.1 - 2026-07-29
This release changes the pinned API version to `2026-07-29.preview`.

* ⚠️ [#2242](https://github.com/stripe/stripe-java/pull/2242) Update generated code for beta
  * Add support for `list` and `retrieve` methods on resource `productcatalog.TrialOffer`
  * Add support for `taxItems` on `ChargeCaptureParams.payment_details.car_rental_data[].total.tax`, `ChargeCaptureParams.payment_details.flight_data[].total.tax`, `ChargeCaptureParams.payment_details.lodging_data[].total.tax`, `ChargeUpdateParams.payment_details.car_rental_data[].total.tax`, `ChargeUpdateParams.payment_details.flight_data[].total.tax`, `ChargeUpdateParams.payment_details.lodging_data[].total.tax`, `PaymentIntent.payment_details.car_rental_data[].total.tax`, `PaymentIntent.payment_details.flight_data[].total.tax`, `PaymentIntent.payment_details.lodging_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.flight_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.lodging_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.flight_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.lodging_data[].total.tax`, `PaymentIntentCreateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCreateParams.payment_details.flight_data[].total.tax`, `PaymentIntentCreateParams.payment_details.lodging_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.flight_data[].total.tax`, and `PaymentIntentUpdateParams.payment_details.lodging_data[].total.tax`
  * ⚠️ Remove support for `taxes` on `ChargeCaptureParams.payment_details.car_rental_data[].total.tax`, `ChargeCaptureParams.payment_details.flight_data[].total.tax`, `ChargeCaptureParams.payment_details.lodging_data[].total.tax`, `ChargeUpdateParams.payment_details.car_rental_data[].total.tax`, `ChargeUpdateParams.payment_details.flight_data[].total.tax`, `ChargeUpdateParams.payment_details.lodging_data[].total.tax`, `PaymentIntent.payment_details.car_rental_data[].total.tax`, `PaymentIntent.payment_details.flight_data[].total.tax`, `PaymentIntent.payment_details.lodging_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.flight_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.lodging_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.flight_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.lodging_data[].total.tax`, `PaymentIntentCreateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCreateParams.payment_details.flight_data[].total.tax`, `PaymentIntentCreateParams.payment_details.lodging_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.flight_data[].total.tax`, and `PaymentIntentUpdateParams.payment_details.lodging_data[].total.tax`
  * Add support for `taxId` on `checkout.Session.collected_information`
  * ⚠️ Remove support for `taxIds` on `checkout.Session.collected_information`
  * Add support for new value `disabled` on enum `financialconnections.SessionCreateParams.manual_entry.mode`
  * Add support for `mode` on `financialconnections.Session.manual_entry`
  * Add support for `name` on `issuing.CardholderUpdateParams`
  * Add support for new value `ic_nif` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `customFields`, `description`, and `footer` on `QuotePreviewSubscriptionSchedule.default_settings.invoice_settings` and `QuotePreviewSubscriptionSchedule.phases[].invoice_settings`
  * Add support for `trial` on `QuotePreviewSubscriptionSchedule.phases[]`
  * ⚠️ Remove support for `acssDebit`, `afterpayClearpay`, `alipay`, `alma`, `amazonPay`, `auBecsDebit`, `bacsDebit`, `bancontact`, `billie`, `bizum`, `blik`, `boleto`, `cardPresent`, `cashapp`, `crypto`, `customerBalance`, `eps`, `fpx`, `giropay`, `gopay`, `grabpay`, `idBankTransfer`, `ideal`, `interacPresent`, `kakaoPay`, `konbini`, `krCard`, `mbWay`, `mobilepay`, `multibanco`, `naverPay`, `nzBankAccount`, `oxxo`, `p24`, `payByBank`, `payco`, `paynow`, `paypal`, `paypay`, `payto`, `pix`, `promptpay`, `qris`, `rechnung`, `revolutPay`, `samsungPay`, `satispay`, `scalapay`, `sepaDebit`, `shopeepay`, `sofort`, `stripeBalance`, `sunbit`, `swish`, `twint`, `upi`, `usBankAccount`, `wechatPay`, and `zip` on `sharedpayment.GrantedToken.payment_method_details`
  * Add support for `useStripeSdk` on `sharedpayment.IssuedTokenCreateParams` and `sharedpayment.IssuedToken`
  * Add support for `redirectToUrl` on `sharedpayment.IssuedToken.next_action`
  * ⚠️ Change type of `sharedpayment.IssuedToken.next_action.type` from `literal('use_stripe_sdk')` to `enum('redirect_to_url'|'use_stripe_sdk')`
  * Add support for `livemode` on `tax.Location`
  * Add support for `source` on `v2.iam.ActivityLog.details.user_roles`
  * Add support for `payout` on `v2.moneymanagement.ReceivedCredit.balance_transfer`
  * ⚠️ Remove support for `payoutV1` on `v2.moneymanagement.ReceivedCredit.balance_transfer`

## 33.2.0-beta.1 - 2026-06-24
This release changes the pinned API version to `2026-06-24.preview`.

* ⚠️ [#2225](https://github.com/stripe/stripe-java/pull/2225) Update generated code for beta
  * Add support for `redaction` on `Card`, `Charge`, `Customer`, `PaymentIntent`, `PaymentMethod`, `SetupIntent`, `Source`, `Token`, `checkout.Session`, `issuing.Authorization`, `issuing.Card`, `issuing.Cardholder`, `issuing.Dispute`, and `issuing.Transaction`
  * Add support for `disclaimerVariant` on `capital.FinancingOffer` and `capital.FinancingSummary.details`
  * Add support for `active` on `financialconnections.Account.status_details` and `financialconnections.Authorization.status_details`
  * Change type of `financialconnections.SessionCreateParams.limits.accounts` from `longInteger` to `emptyable(longInteger)`
  * Add support for `pause` on `InvoiceCreatePreviewParams.subscription_details`
  * Add support for `releaseDetails` on `reserve.Hold`
  * Add support for `buyerId` on `sharedpayment.GrantedToken.payment_method_details.bizum` and `sharedpayment.GrantedToken.payment_method_details.blik`
  * Add support for `fingerprint` on `sharedpayment.GrantedToken.payment_method_details.pix`
  * ⚠️ Remove support for value `invoice_payment.detached` from enum `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for `moneyManager` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.configuration`
  * ⚠️ Remove support for `storer` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.configuration`
  * ⚠️ Remove support for `maximumRps` on `v2.core.BatchJobCreateParams` and `v2.core.BatchJob`
  * Add support for `bic` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
  * ⚠️ Remove support for `swiftCode` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
  * Add support for `processing` on `v2.moneymanagement.OutboundPayment.status_details` and `v2.moneymanagement.OutboundTransfer.status_details`
  * Add support for `accountHolderName` on `v2.moneymanagement.ReceivedCredit.bank_transfer.us_bank_account`
  * Add support for `statuses` on `v2.moneymanagement.FinancialAccountListParams`
  * ⚠️ Remove support for `status` on `v2.moneymanagement.FinancialAccountListParams`
  * Change `v2.core.BatchJobCreateParams.metadata` to be optional
  * Add support for new value `money_manager` on enums `EventsV2CoreAccountLinkReturnedEvent.configurations`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding.configurations`, and `v2.core.AccountLinkCreateParams.use_case.account_update.configurations`
  * ⚠️ Add support for new value `money_manager` on enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
  * ⚠️ Remove support for value `storer` from enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
  * ⚠️ Add support for new value `configuration.money_manager` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * ⚠️ Remove support for value `configuration.storer` from enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * Add support for event notifications `V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEvent` with related object `v2.core.Account`
  * Add support for event notification `V2MoneyManagementOutboundPaymentUnderReviewEvent` with related object `v2.moneymanagement.OutboundPayment`
  * Add support for event notification `V2MoneyManagementOutboundTransferUnderReviewEvent` with related object `v2.moneymanagement.OutboundTransfer`
  * ⚠️ Remove support for event notifications `V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationStorerUpdatedEvent` with related object `v2.core.Account`

## 32.3.0-beta.1 - 2026-05-27
This release changes the pinned API version to `2026-05-27.preview`.

* ⚠️ [#2212](https://github.com/stripe/stripe-java/pull/2212) Update generated code for beta
  * Add support for `pause` method on resource `Subscription`
  * Add support for `retrieve` method on resource `v2.iam.ActivityLog`
  * ⚠️ Change type of `productcatalog.TrialOffer.end_behavior.transition.price` from `string` to `expandable($Price)`
  * Add support for `amountPaidOffStripe` on `QuotePreviewInvoice`
  * Add support for `discountable` on `QuotePreviewSubscriptionSchedule.phases[].add_invoice_items[]`
  * Add support for `bizum` and `scalapay` on `sharedpayment.GrantedToken.payment_method_details`
  * Add support for `paymentBehavior` on `SubscriptionResumeParams`
  * Add support for `statusDetails` on `Subscription`
  * ⚠️ Change type of `v2.moneymanagement.ReceivedCredit.bank_transfer.gb_bank_account.network` from `literal('fps')` to `enum('chaps'|'fps')`
  * Add support for new value `chaps` on enum `v2.FinancialAddressCreditSimulationCreditParams.network`

## 32.2.0-beta.2 - 2026-04-24
* ⚠️ [#2210](https://github.com/stripe/stripe-java/pull/2210) Update generated code for beta
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

## 32.2.0-beta.1 - 2026-04-23
This release changes the pinned API version to `2026-04-22.preview`.

* ⚠️ [#2198](https://github.com/stripe/stripe-java/pull/2198) Update generated code for beta
  * Add support for new resources `sharedpayment.GrantedToken` and `sharedpayment.IssuedToken`
  * Add support for `retrieve` method on resource `sharedpayment.GrantedToken`
  * Add support for `create` and `revoke` test helper methods on resource `sharedpayment.GrantedToken`
  * Add support for `create`, `retrieve`, and `revoke` methods on resource `sharedpayment.IssuedToken`
  * Add support for `blik` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options`, and `checkout.SessionCreateParams.payment_method_options`
  * Add support for `sharedPaymentGrantedToken` on `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new values `fo_vat`, `gi_tin`, `it_cf`, and `py_ruc` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `validationErrors` on `privacy.RedactionJob`
  * Add support for `taxDetails` on `Product`
  * ⚠️ Change type of `QuotePreviewInvoice.total_taxes[].tax_rate_details.taxRate` from `string` to `expandable($TaxRate)`
  * Add support for `admissionsTax`, `attendanceTax`, `entertainmentTax`, `grossReceiptsTax`, `hospitalityTax`, `luxuryTax`, `resortTax`, and `tourismTax` on `tax.RegistrationCreateParams.country_options.us`
  * Add support for `purpose` on `treasury.OutboundPaymentCreateParams` and `treasury.OutboundPayment`

## 32.1.0-beta.1 - 2026-03-25
This release changes the pinned API version to `2026-03-25.preview`.

It is built on top of SDK version 32.0.0 which contains breaking changes. Please review the [changelog for 32.0.0](https://github.com/stripe/stripe-java/blob/master/CHANGELOG.md#3200---2026-03-25) if upgrading from older SDK versions.

* ⚠️ [#2164](https://github.com/stripe/stripe-java/pull/2164) Update generated code for beta
  * Add support for new resources `productcatalog.TrialOffer`, `tax.Location`, and `v2.core.BatchJob`
  * Add support for `create` method on resource `productcatalog.TrialOffer`
  * Add support for `create`, `list`, and `retrieve` methods on resource `tax.Location`
  * Add support for `cancel`, `create`, and `retrieve` methods on resource `v2.core.BatchJob`
  * Add support for `performanceLocation` on `tax.CalculationCreateParams.line_items[]` and `tax.CalculationLineItem`
  * Add support for `trialOffer` on `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].add`, `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].set`, `InvoiceCreatePreviewParams.schedule_details.phases[].items[]`, `QuoteCreateParams.lines[].actions[].add_item`, `QuoteCreateParams.lines[].actions[].set_items[]`, `QuoteLine.actions[].add_item`, `QuoteLine.actions[].set_items[]`, `QuotePreviewSubscriptionSchedule.phases[].items[]`, `QuoteUpdateParams.lines[].actions[].add_item`, `QuoteUpdateParams.lines[].actions[].set_items[]`, `SubscriptionSchedule.phases[].items[]`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].add`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].set`, `SubscriptionScheduleCreateParams.phases[].items[]`, and `SubscriptionScheduleUpdateParams.phases[].items[]`
  * Add support for `riskReserved` on `Balance`
  * ⚠️ Remove support for `sourceType` on `Charge.payment_method_details.stripe_balance`, `ConfirmationToken.payment_method_preview.stripe_balance`, `ConfirmationTokenCreateParams.payment_method_data.stripe_balance`, `PaymentAttemptRecord.payment_method_details.stripe_balance`, `PaymentIntentConfirmParams.payment_method_data.stripe_balance`, `PaymentIntentCreateParams.payment_method_data.stripe_balance`, `PaymentIntentUpdateParams.payment_method_data.stripe_balance`, `PaymentMethod.stripe_balance`, `PaymentMethodCreateParams.stripe_balance`, `PaymentRecord.payment_method_details.stripe_balance`, `SetupIntentConfirmParams.payment_method_data.stripe_balance`, `SetupIntentCreateParams.payment_method_data.stripe_balance`, and `SetupIntentUpdateParams.payment_method_data.stripe_balance`
  * Add support for `taxDetails` on `InvoiceAddLinesParams.lines[].price_data.product_data`, `InvoiceLineItemUpdateParams.price_data.product_data`, `InvoiceUpdateLinesParams.lines[].price_data.product_data`, `PaymentLinkCreateParams.line_items[].price_data.product_data`, `PlanCreateParams.product[0]`, `PriceCreateParams.product_data`, `ProductCreateParams`, `ProductUpdateParams`, `checkout.SessionCreateParams.line_items[].price_data.product_data`, and `checkout.SessionUpdateParams.line_items[].price_data.product_data`
  * Add support for `pendingInvoiceItemInterval` on `checkout.SessionUpdateParams.subscription_data`
  * Add support for `hosted` and `uiMode` on `financialconnections.SessionCreateParams` and `financialconnections.Session`
  * Add support for `url` on `financialconnections.Session`
  * Add support for `expiresAfterSeconds` on `Invoice.payment_settings.payment_method_options.pix`, `InvoiceCreateParams.payment_settings.payment_method_options.pix`, `InvoiceUpdateParams.payment_settings.payment_method_options.pix`, `QuotePreviewInvoice.payment_settings.payment_method_options.pix`, `Subscription.payment_settings.payment_method_options.pix`, `SubscriptionCreateParams.payment_settings.payment_method_options.pix`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.pix`
  * Add support for `currentTrial` on `InvoiceCreatePreviewParams.subscription_details.items[]`, `SubscriptionCreateParams.items[]`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionItem`, and `SubscriptionUpdateParams.items[]`
  * Add support for `surcharge` on `PaymentIntent.amount_details`, `PaymentIntentCaptureParams.amount_details`, `PaymentIntentConfirmParams.amount_details`, `PaymentIntentCreateParams.amount_details`, `PaymentIntentIncrementAuthorizationParams.amount_details`, and `PaymentIntentUpdateParams.amount_details`
  * Add support for `amountDetails` and `paymentDetails` on `PaymentIntentDecrementAuthorizationParams`
  * Add support for `mandateOptions` on `PaymentIntent.payment_method_options.stripe_balance`
  * Add support for `managedPayments` on `PaymentLinkCreateParams` and `PaymentLink`
  * Add support for `stripeBalance` on `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
  * Add support for `billingCycleAnchor` on `Subscription.trial_settings.end_behavior`, `SubscriptionCreateParams.trial_settings.end_behavior`, and `SubscriptionUpdateParams.trial_settings.end_behavior`
  * Add support for new values `admissions_tax`, `attendance_tax`, `entertainment_tax`, `gross_receipts_tax`, `hospitality_tax`, `luxury_tax`, `resort_tax`, and `tourism_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
  * Add support for `admissionsTax`, `attendanceTax`, `entertainmentTax`, `grossReceiptsTax`, `hospitalityTax`, `luxuryTax`, `resortTax`, and `tourismTax` on `tax.Registration.country_options.us`
  * Add support for `requirements` on `TaxCode`
  * ⚠️ Change type of `v2.billing.Cadence.settings_data.collection.payment_method_options.card.mandate_options.amount`, `v2.billing.CollectionSetting.payment_method_options.card.mandate_options.amount`, `v2.billing.CollectionSettingCreateParams.payment_method_options.card.mandate_options.amount`, `v2.billing.CollectionSettingUpdateParams.payment_method_options.card.mandate_options.amount`, and `v2.billing.CollectionSettingVersion.payment_method_options.card.mandate_options.amount` from `longInteger` to `int64_string`
  * Add support for `timezone` on `v2.core.Account.defaults`, `v2.core.AccountCreateParams.defaults`, and `v2.core.AccountUpdateParams.defaults`
  * Add support for `azureEventGrid` on `v2.core.EventDestinationCreateParams` and `v2.core.EventDestination`
  * Add support for `supportedCurrencies` on `v2.core.vault.GbBankAccount`, `v2.core.vault.UsBankAccount`, and `v2.moneymanagement.PayoutMethod.card`
  * Add support for `restricted` on `v2.moneymanagement.PayoutMethod`
  * Add support for `currencies` on `v2.moneymanagement.PayoutMethodsBankAccountSpec.countries.value.fields[]`
  * Add support for `counterparty` and `description` on `v2.moneymanagement.Transaction`
  * ⚠️ Add support for `currency` on `v2.core.vault.GbBankAccountCreateParams`, `v2.core.vault.UsBankAccountCreateParams`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.bank_account`, `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.card`, `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.bank_account`, and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.card`
  * Add support for `iban` on `v2.core.vault.GbBankAccountCreateParams`
  * Change `v2.core.vault.GbBankAccountCreateParams.accountNumber` to be optional
  * Change `v2.core.vault.GbBankAccountCreateParams.sortCode` to be optional
  * Add support for new value `azure_event_grid` on enum `v2.core.EventDestinationCreateParams.type`
  * Add support for new value `currency` on enum `InvalidPaymentMethodException.invalidParam`
  * Add support for event notifications `V2CoreBatchJobBatchFailedEvent`, `V2CoreBatchJobCanceledEvent`, `V2CoreBatchJobCompletedEvent`, `V2CoreBatchJobCreatedEvent`, `V2CoreBatchJobReadyForUploadEvent`, `V2CoreBatchJobTimeoutEvent`, `V2CoreBatchJobUpdatedEvent`, `V2CoreBatchJobUploadTimeoutEvent`, `V2CoreBatchJobValidatingEvent`, and `V2CoreBatchJobValidationFailedEvent` with related object `v2.core.BatchJob`
* [#2192](https://github.com/stripe/stripe-java/pull/2192) Update generated code for beta
  * Release specs are identical.
* [#2194](https://github.com/stripe/stripe-java/pull/2194) Update generated code for beta

## 31.5.0-beta.1 - 2026-02-25
This release changes the pinned API version to `2026-02-25.preview`.

* [#2150](https://github.com/stripe/stripe-java/pull/2150) Update generated code for beta
  * Add support for `smartDisputes` on `Account.settings`, `AccountCreateParams.settings`, `AccountUpdateParams.settings`, `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
  * Add support for `emailCustomersOnSuccessfulPayment` on `Account.settings.payments`, `AccountCreateParams.settings.payments`, and `AccountUpdateParams.settings.payments`
  * Add support for `managedPayments` on `PaymentIntent`, `SetupIntent`, `Subscription`, `checkout.SessionCreateParams`, and `checkout.Session`
  * Add support for new value `lk_vat` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `purpose` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundPayment`
  * Add support for `branchNumber` and `swiftCode` on `v2.moneymanagement.PayoutMethod.bank_account`

## 31.4.0-beta.1 - 2026-01-28
This release changes the pinned API version to `2026-01-28.preview`.

* [#2129](https://github.com/stripe/stripe-java/pull/2129) Add EventNotificationHandler example
* [#2145](https://github.com/stripe/stripe-java/pull/2145) Update generated code for beta
  * Add support for new resource `financialconnections.Authorization`
  * Add support for `retrieve` method on resource `financialconnections.Authorization`
  * Add support for `detach_payment` method on resource `Invoice`
  * Remove support for `cancel`, `list_line_items`, and `reopen` methods on resource `Order`
  * Remove support for `attach_cadence` method on resource `Subscription`
  * Add support for `additionalFiles` and `site` on `Account.settings.paypay_payments`, `AccountCreateParams.settings.paypay_payments`, and `AccountUpdateParams.settings.paypay_payments`
  * Remove support for `capital` on `Account.settings`
  * Add support for `authorization` and `statusDetails` on `financialconnections.Account`
  * Add support for `relinkOptions` on `financialconnections.SessionCreateParams` and `financialconnections.Session`
  * Change `financialconnections.SessionCreateParams.accountHolder` to be optional
  * Add support for `relinkResult` on `financialconnections.Session`
  * Remove support for `billingCadence` on `InvoiceCreatePreviewParams`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
  * Remove support for `billingCadenceDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`
  * Add support for new value `pl_nip` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `carRentalData`, `flightData`, and `lodgingData` on `PaymentIntent.payment_details`
  * Add support for new value `capital.financing_summary.line_of_credit_update` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for `alternativeReference` on `v2.core.vault.GbBankAccount`, `v2.core.vault.UsBankAccount`, and `v2.moneymanagement.PayoutMethod`
  * Add support for `accountHolderAddress` and `accountHolderName` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
  * Add support for `fingerprint` on `v2.moneymanagement.PayoutMethod.card`
  * Add support for snapshot event `invoice_payment.detached` with resource `InvoicePayment`

## 31.2.0-beta.1 - 2025-12-16
This release changes the pinned API version to `2025-12-15.preview`.

* [#2104](https://github.com/stripe/stripe-java/pull/2104) Add EventNotificationHandler
  * This is a new, simplified way to handle event notifications (AKA thin event webhooks). Learn more in the docs: https://docs.stripe.com/webhooks/event-notification-handlers
* [#2117](https://github.com/stripe/stripe-java/pull/2117) Update generated code for beta
  * Add support for new resources `reserve.Hold`, `reserve.Plan`, and `reserve.Release`
  * Add support for `list` and `retrieve` methods on resources `reserve.Hold` and `reserve.Release`
  * Add support for `retrieve` method on resource `reserve.Plan`
  * Change type of `v2.FinancialAddressGeneratedMicrodeposits.amounts` from `amount` to `an object`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.payto.mandate_options.amount`, `PaymentIntentCreateParams.payment_method_options.payto.mandate_options.amount`, `PaymentIntentUpdateParams.payment_method_options.payto.mandate_options.amount`, `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.amount`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.amount`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.amount`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.amount` from `longInteger` to `emptyable(longInteger)`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.payto.mandate_options.amountType`, `PaymentIntentCreateParams.payment_method_options.payto.mandate_options.amountType`, `PaymentIntentUpdateParams.payment_method_options.payto.mandate_options.amountType`, `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.amountType`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.amountType`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.amountType`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.amountType` from `enum('fixed'|'maximum')` to `emptyable(enum('fixed'|'maximum'))`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.payto.mandate_options.endDate`, `PaymentIntentCreateParams.payment_method_options.payto.mandate_options.endDate`, `PaymentIntentUpdateParams.payment_method_options.payto.mandate_options.endDate`, `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.endDate`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.endDate`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.endDate`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.endDate` from `string` to `emptyable(string)`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.payto.mandate_options.paymentSchedule`, `PaymentIntentCreateParams.payment_method_options.payto.mandate_options.paymentSchedule`, `PaymentIntentUpdateParams.payment_method_options.payto.mandate_options.paymentSchedule`, `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.paymentSchedule`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.paymentSchedule`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.paymentSchedule`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.paymentSchedule` from `enum` to `emptyable(enum)`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.payto.mandate_options.paymentsPerPeriod`, `PaymentIntentCreateParams.payment_method_options.payto.mandate_options.paymentsPerPeriod`, `PaymentIntentUpdateParams.payment_method_options.payto.mandate_options.paymentsPerPeriod`, `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.paymentsPerPeriod`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.paymentsPerPeriod`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.paymentsPerPeriod`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.paymentsPerPeriod` from `longInteger` to `emptyable(longInteger)`
  * Change type of `PaymentIntentConfirmParams.payment_method_options.payto.mandate_options.purpose`, `PaymentIntentCreateParams.payment_method_options.payto.mandate_options.purpose`, `PaymentIntentUpdateParams.payment_method_options.payto.mandate_options.purpose`, `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.purpose`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.purpose`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.purpose`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.purpose` from `enum` to `emptyable(enum)`
  * Change type of `SetupIntentConfirmParams.payment_method_options.payto.mandate_options.startDate`, `SetupIntentCreateParams.payment_method_options.payto.mandate_options.startDate`, `SetupIntentUpdateParams.payment_method_options.payto.mandate_options.startDate`, and `checkout.SessionCreateParams.payment_method_options.payto.mandate_options.startDate` from `string` to `emptyable(string)`
  * Add support for `asyncWorkflows` on `PaymentIntent`
  * Add support for `payto` on `QuotePreviewInvoice.payment_settings.payment_method_options`
  * Remove support for `requested` on `v2.core.Account.configuration.customer.capabilities.automatic_indirect_tax`, `v2.core.Account.configuration.merchant.capabilities.ach_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.acss_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.affirm_payments`, `v2.core.Account.configuration.merchant.capabilities.afterpay_clearpay_payments`, `v2.core.Account.configuration.merchant.capabilities.alma_payments`, `v2.core.Account.configuration.merchant.capabilities.amazon_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.au_becs_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.bacs_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.bancontact_payments`, `v2.core.Account.configuration.merchant.capabilities.blik_payments`, `v2.core.Account.configuration.merchant.capabilities.boleto_payments`, `v2.core.Account.configuration.merchant.capabilities.card_payments`, `v2.core.Account.configuration.merchant.capabilities.cartes_bancaires_payments`, `v2.core.Account.configuration.merchant.capabilities.cashapp_payments`, `v2.core.Account.configuration.merchant.capabilities.eps_payments`, `v2.core.Account.configuration.merchant.capabilities.fpx_payments`, `v2.core.Account.configuration.merchant.capabilities.gb_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.grabpay_payments`, `v2.core.Account.configuration.merchant.capabilities.ideal_payments`, `v2.core.Account.configuration.merchant.capabilities.jcb_payments`, `v2.core.Account.configuration.merchant.capabilities.jp_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.kakao_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.klarna_payments`, `v2.core.Account.configuration.merchant.capabilities.konbini_payments`, `v2.core.Account.configuration.merchant.capabilities.kr_card_payments`, `v2.core.Account.configuration.merchant.capabilities.link_payments`, `v2.core.Account.configuration.merchant.capabilities.mobilepay_payments`, `v2.core.Account.configuration.merchant.capabilities.multibanco_payments`, `v2.core.Account.configuration.merchant.capabilities.mx_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.naver_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.oxxo_payments`, `v2.core.Account.configuration.merchant.capabilities.p24_payments`, `v2.core.Account.configuration.merchant.capabilities.pay_by_bank_payments`, `v2.core.Account.configuration.merchant.capabilities.payco_payments`, `v2.core.Account.configuration.merchant.capabilities.paynow_payments`, `v2.core.Account.configuration.merchant.capabilities.promptpay_payments`, `v2.core.Account.configuration.merchant.capabilities.revolut_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.samsung_pay_payments`, `v2.core.Account.configuration.merchant.capabilities.sepa_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.sepa_debit_payments`, `v2.core.Account.configuration.merchant.capabilities.stripe_balance.payouts`, `v2.core.Account.configuration.merchant.capabilities.swish_payments`, `v2.core.Account.configuration.merchant.capabilities.twint_payments`, `v2.core.Account.configuration.merchant.capabilities.us_bank_transfer_payments`, `v2.core.Account.configuration.merchant.capabilities.zip_payments`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts.local`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts.wire`, `v2.core.Account.configuration.recipient.capabilities.cards`, `v2.core.Account.configuration.recipient.capabilities.stripe_balance.payouts`, `v2.core.Account.configuration.recipient.capabilities.stripe_balance.stripe_transfers`, `v2.core.Account.configuration.storer.capabilities.financial_addresses.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.eur`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.gbp`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.usd`, `v2.core.Account.configuration.storer.capabilities.inbound_transfers.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.bank_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.cards`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.financial_accounts`, `v2.core.Account.configuration.storer.capabilities.outbound_transfers.bank_accounts`, and `v2.core.Account.configuration.storer.capabilities.outbound_transfers.financial_accounts`
  * Change type of `v2.FinancialAddressCreditSimulationCreditParams.amount`, `v2.core.Account.identity.business_details.annual_revenue.amount`, `v2.core.Account.identity.business_details.monthly_estimated_revenue.amount`, `v2.core.AccountCreateParams.identity.business_details.annual_revenue.amount`, `v2.core.AccountCreateParams.identity.business_details.monthly_estimated_revenue.amount`, `v2.core.AccountTokenCreateParams.identity.business_details.annual_revenue.amount`, `v2.core.AccountTokenCreateParams.identity.business_details.monthly_estimated_revenue.amount`, `v2.core.AccountUpdateParams.identity.business_details.annual_revenue.amount`, `v2.core.AccountUpdateParams.identity.business_details.monthly_estimated_revenue.amount`, `v2.moneymanagement.Adjustment.amount`, `v2.moneymanagement.InboundTransfer.amount`, `v2.moneymanagement.InboundTransferCreateParams.amount`, `v2.moneymanagement.OutboundPayment.amount`, `v2.moneymanagement.OutboundPaymentCreateParams.amount`, `v2.moneymanagement.OutboundPaymentQuote.amount`, `v2.moneymanagement.OutboundPaymentQuote.estimated_fees[].amount`, `v2.moneymanagement.OutboundPaymentQuoteCreateParams.amount`, `v2.moneymanagement.OutboundTransfer.amount`, `v2.moneymanagement.OutboundTransferCreateParams.amount`, `v2.moneymanagement.ReceivedCredit.amount`, `v2.moneymanagement.ReceivedDebit.amount`, and `v2.moneymanagement.Transaction.amount` from `amount` to `an object`
  * Add support for `financialConnectionsAccount` on `v2.core.vault.UsBankAccount` and `v2.moneymanagement.PayoutMethod.bank_account`
  * Change type of `v2.moneymanagement.FinancialAccount.balance.available`, `v2.moneymanagement.Transaction.balance_impact.available`, and `v2.moneymanagement.TransactionEntry.balance_impact.available` from `amount` to `an object`
  * Change type of `v2.moneymanagement.FinancialAccount.balance.inboundPending`, `v2.moneymanagement.Transaction.balance_impact.inboundPending`, and `v2.moneymanagement.TransactionEntry.balance_impact.inboundPending` from `amount` to `an object`
  * Change type of `v2.moneymanagement.FinancialAccount.balance.outboundPending`, `v2.moneymanagement.Transaction.balance_impact.outboundPending`, and `v2.moneymanagement.TransactionEntry.balance_impact.outboundPending` from `amount` to `an object`
  * Change type of `v2.moneymanagement.InboundTransfer.from.debited`, `v2.moneymanagement.OutboundPayment.from.debited`, `v2.moneymanagement.OutboundPaymentQuote.from.debited`, and `v2.moneymanagement.OutboundTransfer.from.debited` from `amount` to `an object`
  * Change type of `v2.moneymanagement.InboundTransfer.to.credited`, `v2.moneymanagement.OutboundPayment.to.credited`, `v2.moneymanagement.OutboundPaymentQuote.to.credited`, and `v2.moneymanagement.OutboundTransfer.to.credited` from `amount` to `an object`
  * Add support for `transfer` on `v2.moneymanagement.ReceivedCredit.balance_transfer`
  * Add support for new values `at_stn`, `at_vat`, `be_vat`, `bg_vat`, `ca_gst_hst`, `cy_he`, `cy_vat`, `cz_vat`, `de_stn`, `dk_vat`, `ee_vat`, `es_vat`, `fi_vat`, `fr_rna`, `gr_afm`, `gr_vat`, `hr_mbs`, `hr_oib`, `hr_vat`, `hu_tin`, `hu_vat`, `ie_trn`, `ie_vat`, `lt_vat`, `lu_nif`, `lu_vat`, `lv_vat`, `mt_tin`, `mt_vat`, `my_itn`, `nl_rsin`, `nl_vat`, `nz_ird`, `pl_nip`, `pl_vat`, `ro_orc`, `ro_vat`, `se_vat`, `si_tin`, `si_vat`, `sk_dic`, and `sk_vat` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Remove support for value `hk_mbs` from enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Add support for new values `ar_cuil`, `at_stn`, `be_nrn`, `bg_ucn`, `bn_nric`, `ca_sin`, `ch_oasi`, `cl_rut`, `cn_pp`, `co_nuip`, `cr_ci`, `cy_tic`, `cz_rc`, `dk_cpr`, `do_cie`, `ec_ci`, `ee_ik`, `es_nif`, `fi_hetu`, `fr_nir`, `gb_nino`, `gr_afm`, `hr_oib`, `hu_ad`, `id_nik`, `ie_ppsn`, `is_kt`, `it_cf`, `jp_inc`, `ke_pin`, `li_peid`, `lt_ak`, `lu_nif`, `lv_pk`, `ng_nin`, `no_nin`, `nz_ird`, `pl_pesel`, `pt_nif`, `ro_cnp`, `se_pin`, `sk_dic`, `tr_tin`, `uy_dni`, and `za_id` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountPersonCreateParams.id_numbers[].type`, `v2.core.AccountPersonTokenCreateParams.id_numbers[].type`, `v2.core.AccountPersonUpdateParams.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.individual.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`
  * Change `v2.core.AccountTokenCreateParams.identity` to be optional
  * Change type of `v2.core.AccountListParams.appliedConfigurations` from `string` to `enum('customer'|'merchant'|'recipient'|'storer')`
  * Add support for event notification `V2MoneyManagementPayoutMethodCreatedEvent` with related object `v2.moneymanagement.PayoutMethod`
  * Add support for error type `ControlledByAlternateResourceException`
  * Remove support for error type `RateLimitException`

## 31.1.0-beta.1 - 2025-11-18
This release changes the pinned API version to `2025-11-17.preview`.

* [#2103](https://github.com/stripe/stripe-java/pull/2103) Update generated code for beta
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

## 30.2.0-beta.1 - 2025-10-29
This release changes the pinned API version to `2025-10-29.preview`.

* [#2080](https://github.com/stripe/stripe-java/pull/2080) Update generated code for beta
  * Add support for `lastSeenAt` on `terminal.Reader`
  * Add support for new value `2025-10-29.clover` on enum `WebhookEndpointCreateParams.apiVersion`
* [#2081](https://github.com/stripe/stripe-java/pull/2081) Update generated code for beta
  * Add support for `update` method on resource `v2.moneymanagement.FinancialAccount`
  * Add support for `confirm_microdeposits`, `list`, and `send_microdeposits` methods on resource `v2.core.vault.UsBankAccount`
  * Add support for `list` method on resource `v2.core.vault.GbBankAccount`
  * Add support for `paymentPortalUrl` on `Charge.payment_method_details.rechnung`, `PaymentAttemptRecord.payment_method_details.rechnung`, and `PaymentRecord.payment_method_details.rechnung`
  * Add support for `taxIdElement` on `CustomerSession.components` and `CustomerSessionCreateParams.components`
  * Add support for `startingAfter` on `PaymentAttemptRecordListParams`
  * Add support for `reference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`, `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.klarna`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.klarna`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.klarna`
  * Add support for `subscriptionReference` on `PaymentIntentAmountDetailsLineItem.payment_method_options.klarna`
  * Add support for `closed` on `v2.core.AccountListParams` and `v2.core.Account`
  * Add support for `usd` on `v2.core.Account.configuration.storer.capabilities.holds_currencies`, `v2.core.AccountCreateParams.configuration.storer.capabilities.holds_currencies`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities.holds_currencies`
  * Add support for `representativeDeclaration` on `v2.core.Account.identity.attestations`, `v2.core.AccountCreateParams.identity.attestations`, and `v2.core.AccountUpdateParams.identity.attestations`
  * Add support for `verification` on `v2.core.vault.UsBankAccount`
  * Add support for new value `payment_method` on enums `v2.core.AccountCreateParams.configuration.customer.automatic_indirect_tax.locationSource` and `v2.core.AccountUpdateParams.configuration.customer.automatic_indirect_tax.locationSource`
  * Add support for new values `application_custom` and `application_express` on enums `v2.core.AccountCreateParams.defaults.responsibilities.feesCollector` and `v2.core.AccountUpdateParams.defaults.responsibilities.feesCollector`
  * Add support for `v1Id` on `EventsV2MoneyManagementTransactionCreatedEvent`
  * Remove support for thin event `V2BillingBillSettingUpdatedEvent` with related object `v2.billing.BillSetting`
* [#2092](https://github.com/stripe/stripe-java/pull/2092) Update generated code for beta
  * Add support for `cryptoStorer` on `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`

## 30.1.0-beta.1 - 2025-09-30
This release changes the pinned API version to `2025-09-30.preview`.

It is built on top of SDK version 30.0.0 which contains breaking changes. Please review the [changelog for 30.0.0](https://github.com/stripe/stripe-java/blob/master/CHANGELOG.md#3000---2025-09-30) if upgrading from older SDK versions.

* [#2047](https://github.com/stripe/stripe-java/pull/2047) Update generated code for beta
  * Add support for new resources `billing.analytics.MeterUsageRow` and `billing.analytics.MeterUsage`
  * Remove support for resources `billing.MeterUsageRow` and `billing.MeterUsage`
  * Add support for `retrieve` method on resource `billing.analytics.MeterUsage`
  * Remove support for `retrieve` method on resource `billing.MeterUsage`
  * Add support for `report_payment_attempt_informational` method on resource `PaymentRecord`
  * Add support for `minimumBalanceByCurrency` on `BalanceSettings.payments.payouts` and `BalanceSettingsUpdateParams.payments.payouts`
  * Remove support for values `saturday` and `sunday` from enum `BalanceSettingsUpdateParams.payments.payouts.schedule.weeklyPayoutDays`
  * Change type of `BalanceSettingsUpdateParams.payments.settlement_timing.delayDaysOverride` from `longInteger` to `emptyable(longInteger)`
  * Change `BalanceSettingsUpdateParams.payments` to be optional
  * Add support for `delayDaysOverride` on `BalanceSettings.payments.settlement_timing`
  * Add support for `automaticTax` and `invoiceCreation` on `checkout.SessionUpdateParams`
  * Add support for `unitLabel` on `checkout.SessionUpdateParams.line_items[].price_data.product_data`
  * Add support for `invoiceSettings` on `checkout.SessionUpdateParams.subscription_data`
  * Add support for `intendedSubmissionMethod` on `DisputeUpdateParams` and `Dispute`
  * Change type of `Dispute.smart_disputes.recommendedEvidence` from `string` to `array(string)`
  * Add support for `pix` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for new value `pix` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `billingSchedules` on `InvoiceCreatePreviewParams.subscription_details`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
  * Add support for `paypay` on `PaymentAttemptRecord.payment_method_details` and `PaymentRecord.payment_method_details`
  * Add support for `wallet` on `PaymentAttemptRecord.payment_method_details.card` and `PaymentRecord.payment_method_details.card`
  * Add support for `flexible` on `QuotePreviewSubscriptionSchedule.billing_mode`
  * Add support for `billedUntil` on `SubscriptionItem`
* [#2049](https://github.com/stripe/stripe-java/pull/2049) Update generated code for beta
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
* [#2060](https://github.com/stripe/stripe-java/pull/2060) Update generated code for beta
  * Add support for `attach_cadence` method on resource `Subscription`
  * Add support for `billingCadence` on `InvoiceCreatePreviewParams`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
  * Add support for `billingCadenceDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`

## 29.6.0-beta.1 - 2025-08-27
This release changes the pinned API version to `2025-08-27.preview`.

* [#2029](https://github.com/stripe/stripe-java/pull/2029) Update generated code for beta
  * Add support for `list` and `retrieve` methods on resource `InvoicePayment`
  * Add support for `list` method on resource `Mandate`
  * Add support for `applied` on `v2.core.Account.configuration.customer`, `v2.core.Account.configuration.merchant`, `v2.core.Account.configuration.recipient`, `v2.core.Account.configuration.storer`, `v2.core.AccountUpdateParams.configuration.customer`, `v2.core.AccountUpdateParams.configuration.merchant`, `v2.core.AccountUpdateParams.configuration.recipient`, and `v2.core.AccountUpdateParams.configuration.storer`
  * Change type of `billing.AlertTriggered.value` from `longInteger` to `decimal_string`
  * Add support for `displayName` on `v2.moneymanagement.FinancialAccountCreateParams` and `v2.moneymanagement.FinancialAccount`
  * Add support for `currencyConversion` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
  * Add support for `payments` on `BalanceSettingsUpdateParams` and `BalanceSettings`
  * Remove support for `debitNegativeBalances`, `payouts`, and `settlementTiming` on `BalanceSettingsUpdateParams` and `BalanceSettings`
  * Add support for `mandate` on `Charge.payment_method_details.pix`, `PaymentAttemptRecord.payment_method_details.pix`, and `PaymentRecord.payment_method_details.pix`
  * Add support for `couponData` on `checkout.SessionCreateParams.discounts[]`
  * Add support for `mandateOptions` on `PaymentIntent.payment_method_options.pix`, `PaymentIntentConfirmParams.payment_method_options.pix`, `PaymentIntentCreateParams.payment_method_options.pix`, `PaymentIntentUpdateParams.payment_method_options.pix`, `checkout.Session.payment_method_options.pix`, and `checkout.SessionCreateParams.payment_method_options.pix`
  * Change type of `PaymentIntent.payment_method_options.pix.setupFutureUsage`, `PaymentIntentConfirmParams.payment_method_options.pix.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.pix.setupFutureUsage`, `PaymentIntentUpdateParams.payment_method_options.pix.setupFutureUsage`, `checkout.Session.payment_method_options.pix.setupFutureUsage`, and `checkout.SessionCreateParams.payment_method_options.pix.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
  * Add support for `amount` on `Mandate.multi_use`, `PaymentAttemptRecord`, and `PaymentRecord`
  * Add support for `currency` on `Mandate.multi_use`
  * Add support for `pix` on `Mandate.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
  * Add support for `limit` on `PaymentAttemptRecordListParams`
  * Add support for `amountAuthorized`, `amountRefunded`, and `application` on `PaymentAttemptRecord` and `PaymentRecord`
  * Add support for `processorDetails` on `PaymentAttemptRecord`, `PaymentRecordReportPaymentParams`, and `PaymentRecord`
  * Remove support for `paymentReference` on `PaymentAttemptRecord`, `PaymentRecordReportPaymentParams`, and `PaymentRecord`
  * Add support for `installments` on `PaymentAttemptRecord.payment_method_details.alma` and `PaymentRecord.payment_method_details.alma`
  * Add support for `transactionId` on `PaymentAttemptRecord.payment_method_details.alma`, `PaymentAttemptRecord.payment_method_details.amazon_pay`, `PaymentAttemptRecord.payment_method_details.billie`, `PaymentAttemptRecord.payment_method_details.kakao_pay`, `PaymentAttemptRecord.payment_method_details.kr_card`, `PaymentAttemptRecord.payment_method_details.naver_pay`, `PaymentAttemptRecord.payment_method_details.payco`, `PaymentAttemptRecord.payment_method_details.revolut_pay`, `PaymentAttemptRecord.payment_method_details.samsung_pay`, `PaymentAttemptRecord.payment_method_details.satispay`, `PaymentRecord.payment_method_details.alma`, `PaymentRecord.payment_method_details.amazon_pay`, `PaymentRecord.payment_method_details.billie`, `PaymentRecord.payment_method_details.kakao_pay`, `PaymentRecord.payment_method_details.kr_card`, `PaymentRecord.payment_method_details.naver_pay`, `PaymentRecord.payment_method_details.payco`, `PaymentRecord.payment_method_details.revolut_pay`, `PaymentRecord.payment_method_details.samsung_pay`, and `PaymentRecord.payment_method_details.satispay`
  * Add support for `location` and `reader` on `PaymentAttemptRecord.payment_method_details.paynow` and `PaymentRecord.payment_method_details.paynow`
  * Add support for `latestActiveMandate` on `PaymentMethod`
  * Add support for `metadata` and `period` on `QuotePreviewSubscriptionSchedule.phases[].add_invoice_items[]`
  * Add support for `pixDisplayQrCode` on `SetupIntent.next_action`
  * Add support for `readerSecurity` on `terminal.ConfigurationCreateParams`, `terminal.ConfigurationUpdateParams`, and `terminal.Configuration`
  * Add support for new values `ao_nif`, `az_tin`, `bd_etin`, `cr_cpj`, `cr_nite`, `do_rcn`, `gt_nit`, `kz_bin`, `mz_nuit`, `pe_ruc`, `pk_ntn`, `sa_crn`, and `sa_tin` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type` and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
  * Add support for new values `ao_nif`, `az_tin`, `bd_brc`, `bd_etin`, `bd_nid`, `cr_cpf`, `cr_dimex`, `cr_nite`, `do_rcn`, `gt_nit`, `kz_iin`, `mz_nuit`, `pe_dni`, `pk_cnic`, `pk_snic`, and `sa_tin` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`, `v2.core.PersonCreateParams.id_numbers[].type`, and `v2.core.PersonUpdateParams.id_numbers[].type`

## 29.5.0-beta.2 - 2025-08-08
* [#2031](https://github.com/stripe/stripe-java/pull/2031) Bring back invoice payments APIs that were missing in the public preview SDKs
  * Add support for new resource `InvoicePayment`
  * Add support for `list` and `retrieve` methods on resource `InvoicePayment`

## 29.5.0-beta.1 - 2025-07-30
This release changes the pinned API version to `2025-07-30.preview`.

* [#2025](https://github.com/stripe/stripe-java/pull/2025) Update generated code for beta
  * Add support for new resources `billing.MeterUsageRow`, `billing.MeterUsage`, and `terminal.OnboardingLink`
  * Add support for `retrieve` method on resource `billing.MeterUsage`
  * Add support for `create` method on resource `terminal.OnboardingLink`
  * Add support for `monthlyPayoutDays` and `weeklyPayoutDays` on `BalanceSettings.payouts.schedule` and `BalanceSettingsUpdateParams.payouts.schedule`
  * Remove support for `monthlyAnchor` and `weeklyAnchor` on `BalanceSettings.payouts.schedule` and `BalanceSettingsUpdateParams.payouts.schedule`
  * Add support for `delayDaysOverride` on `BalanceSettingsUpdateParams.settlement_timing`
  * Remove support for `delayDays` on `BalanceSettingsUpdateParams.settlement_timing`
  * Add support for `updateDiscounts` on `checkout.SessionCreateParams.permissions`
  * Add support for `discounts` and `subscriptionData` on `checkout.SessionUpdateParams`
  * Add support for `smartDisputes` on `Dispute`
  * Add support for `upi` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for new value `upi` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `transactionId` on `PaymentAttemptRecord.payment_method_details.cashapp` and `PaymentRecord.payment_method_details.cashapp`
  * Add support for `amountDetails` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentIncrementAuthorizationParams`, and `PaymentIntentUpdateParams`
  * Add support for `paymentDetails` on `PaymentIntentIncrementAuthorizationParams`
  * Add support for `storer` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
  * Add support for `collectionOptions` on `v2.core.AccountLink.use_case.account_onboarding`, `v2.core.AccountLink.use_case.account_update`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding`, and `v2.core.AccountLinkCreateParams.use_case.account_update`
  * Change type of `v2.core.AccountLink.use_case.account_onboarding.configurations`, `v2.core.AccountLink.use_case.account_update.configurations`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding.configurations`, and `v2.core.AccountLinkCreateParams.use_case.account_update.configurations` from `literal('recipient')` to `enum('customer'|'merchant'|'recipient'|'storer')`
  * Add support for `bankAccountType` on `v2.moneymanagement.PayoutMethod.bank_account`
  * Add support for thin event `V2CoreAccountLinkReturnedEvent`
  * Add support for thin event `V2MoneyManagementPayoutMethodUpdatedEvent` with related object `v2.moneymanagement.PayoutMethod`
  * Remove support for thin event `V2CoreAccountLinkCompletedEvent`
  * Remove support for thin event `V2OffSessionPaymentRequiresCaptureEvent` with related object `v2.payments.OffSessionPayment`

## 29.4.0-beta.2 - 2025-07-09
* [#2026](https://github.com/stripe/stripe-java/pull/2026) Pull in V2 FinancialAccount changes for June release
  * Add support for `close` and `create` methods on resource `v2.moneymanagement.FinancialAccount`
  * Add support for `storer` on `v2.core.Account.configuration`, `v2.core.AccountCreateParams.configuration`, and `v2.core.AccountUpdateParams.configuration`
  * Add support for `statusDetails` on `v2.moneymanagement.FinancialAccount`
  * Add support for `status` on `v2.moneymanagement.FinancialAccountListParams`
  * Add support for new value `configuration.storer` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
  * Add support for new value `storer` on enum `v2.core.AccountCloseParams.appliedConfigurations`
  * Add support for thin events `V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationStorerUpdatedEvent` with related object `v2.core.Account`
  * Add support for error types `AlreadyExistsException` and `NonZeroBalanceException`

## 29.4.0-beta.1 - 2025-07-01
This release changes the pinned API version to `2025-06-30.preview`.

* [#2009](https://github.com/stripe/stripe-java/pull/2009) Update generated code for beta
  * Change type of `InvoiceCreatePreviewParams.schedule_details.billingMode`, `InvoiceCreatePreviewParams.subscription_details.billingMode`, `Quote.subscription_data.billingMode`, `QuoteCreateParams.subscription_data.billingMode`, `SubscriptionCreateParams.billingMode`, `SubscriptionScheduleCreateParams.billingMode`, and `checkout.SessionCreateParams.subscription_data.billingMode` from `enum('classic'|'flexible')` to `billing_mode`
  * Add support for `submissionMethod` on `Dispute.evidence_details`
  * Add support for `onDemand` and `subscriptions` on `OrderCreateParams.payment.settings.payment_method_options.klarna` and `OrderUpdateParams.payment.settings.payment_method_options.klarna`
  * Change type of `Order.payment.settings.payment_method_options.klarna.setupFutureUsage`, `OrderCreateParams.payment.settings.payment_method_options.klarna.setupFutureUsage`, and `OrderUpdateParams.payment.settings.payment_method_options.klarna.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session'|'on_session')`
  * Add support for `crypto` on `PaymentAttemptRecord.payment_method_details` and `PaymentRecord.payment_method_details`
  * Change type of `PaymentIntent.payment_method_options.gopay.setupFutureUsage`, `PaymentIntentConfirmParams.payment_method_options.gopay.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.gopay.setupFutureUsage`, and `PaymentIntentUpdateParams.payment_method_options.gopay.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
  * Change type of `QuotePreviewSubscriptionSchedule.billingMode`, `Subscription.billingMode`, and `SubscriptionSchedule.billingMode` from `enum('classic'|'flexible')` to `SubscriptionsResourceBillingMode`
  * Change type of `SubscriptionMigrateParams.billingMode` from `literal('flexible')` to `billing_mode_migrate`
  * Remove support for `billingModeDetails` on `Subscription`
  * Add support for `proofOfAddress` on `v2.core.Account.identity.business_details.documents`, `v2.core.AccountCreateParams.identity.business_details.documents`, and `v2.core.AccountUpdateParams.identity.business_details.documents`
  * Add support for `metadata` on `v2.moneymanagement.FinancialAccount`
  * Remove support for `description` on `v2.moneymanagement.FinancialAccount`
  * Remove support for `attempts` on `v2.payments.OffSessionPayment`
  * Add support for `fromAccount`, `outboundPayment`, and `outboundTransfer` on `v2.moneymanagement.ReceivedCredit.balance_transfer`
  * Change type of `v2.moneymanagement.ReceivedCredit.balance_transfer.type` from `literal('payout_v1')` to `enum('outbound_payment'|'outbound_transfer'|'payout_v1')`
  * Change `v2.payments.OffSessionPaymentCreateParams.transfer_data.amount` to be optional
  * Add support for new value `xx` on enums `v2.core.AccountCreateParams.configuration.customer.shipping.address.country`, `v2.core.AccountCreateParams.configuration.merchant.support.address.country`, `v2.core.AccountCreateParams.identity.business_details.address.country`, `v2.core.AccountCreateParams.identity.business_details.script_addresses.kana.country`, `v2.core.AccountCreateParams.identity.business_details.script_addresses.kanji.country`, `v2.core.AccountCreateParams.identity.country`, `v2.core.AccountCreateParams.identity.individual.additional_addresses[].country`, `v2.core.AccountCreateParams.identity.individual.address.country`, `v2.core.AccountCreateParams.identity.individual.script_addresses.kana.country`, `v2.core.AccountCreateParams.identity.individual.script_addresses.kanji.country`, `v2.core.AccountUpdateParams.configuration.customer.shipping.address.country`, `v2.core.AccountUpdateParams.configuration.merchant.support.address.country`, `v2.core.AccountUpdateParams.identity.business_details.address.country`, `v2.core.AccountUpdateParams.identity.business_details.script_addresses.kana.country`, `v2.core.AccountUpdateParams.identity.business_details.script_addresses.kanji.country`, `v2.core.AccountUpdateParams.identity.country`, `v2.core.AccountUpdateParams.identity.individual.additional_addresses[].country`, `v2.core.AccountUpdateParams.identity.individual.address.country`, `v2.core.AccountUpdateParams.identity.individual.script_addresses.kana.country`, `v2.core.AccountUpdateParams.identity.individual.script_addresses.kanji.country`, `v2.core.PersonCreateParams.additional_addresses[].country`, `v2.core.PersonCreateParams.address.country`, `v2.core.PersonCreateParams.script_addresses.kana.country`, `v2.core.PersonCreateParams.script_addresses.kanji.country`, `v2.core.PersonUpdateParams.additional_addresses[].country`, `v2.core.PersonUpdateParams.address.country`, `v2.core.PersonUpdateParams.script_addresses.kana.country`, and `v2.core.PersonUpdateParams.script_addresses.kanji.country`
  * Add support for new value `xx` on enums `v2.core.AccountCreateParams.identity.individual.nationalities`, `v2.core.AccountUpdateParams.identity.individual.nationalities`, `v2.core.PersonCreateParams.nationalities`, and `v2.core.PersonUpdateParams.nationalities`

## 29.3.0-beta.3 - 2025-06-26
No changes in this release

## 29.3.0-beta.2 - 2025-06-26
* [#2006](https://github.com/stripe/stripe-java/pull/2006) Set OPENAPI_VERSION (beta)
* [#2021](https://github.com/stripe/stripe-java/pull/2021) Pull in OffSessionPayment changes for the May release
  * Remove support for attempts on V2.Payments.OffSessionPayment
  * Change V2.Payments.OffSessionPaymentCreateParams.transfer_data.amount to be optional

## 29.3.0-beta.1 - 2025-05-29
This release changes the pinned API version to `2025-05-28.preview`.

* [#1995](https://github.com/stripe/stripe-java/pull/1995) Update generated code for beta
  ### Breaking changes
  * Remove support for deprecated previews
    * Remove support for resources `billing.MeterErrorReport`, `giftcards.Card`, `giftcards.Transaction`, and `privacy.RedactionJobRootObjects`
    * Remove support for `create`, `list`, `retrieve`, `update`, and `validate` methods on resource `giftcards.Card`
    * Remove support for `cancel`, `confirm`, `create`, `list`, `retrieve`, and `update` methods on resource `giftcards.Transaction`
    * Remove support for `provisioning` on `ProductCreateParams` and `Product`
    * Remove support for snapshot event `billing.meter_error_report.triggered` with resource `billing.MeterErrorReport`
  * Remove support for values `credits_attributed_to_debits` and `legacy_prorations` from enums `InvoiceCreatePreviewParams.schedule_details.billingMode`, `InvoiceCreatePreviewParams.subscription_details.billingMode`, `QuoteCreateParams.subscription_data.billingMode`, `SubscriptionCreateParams.billingMode`, `SubscriptionScheduleCreateParams.billingMode`, and `checkout.SessionCreateParams.subscription_data.billingMode`
  * Change type of `checkout.SessionUpdateParams.line_items[].quantity` from `emptyable(longInteger)` to `longInteger`
  * Change type of `InvoiceCreatePreviewParams.subscription_details.cancelAt`, `SubscriptionCreateParams.cancelAt`, and `SubscriptionUpdateParams.cancelAt` from `DateTime` to `DateTime | enum('max_period_end'|'min_period_end')`
  * Remove support for `credits` on `OrderCreateParams`, `OrderUpdateParams`, and `Order`
  * Remove support for `amountRemaining` on `Order`
  * Remove support for `amountCredit` on `Order.total_details`
  * Remove support for `asyncWorkflows` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentDecrementAuthorizationParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
  * Change type of `PaymentRecordReportPaymentAttemptCanceledParams.metadata`, `PaymentRecordReportPaymentAttemptFailedParams.metadata`, `PaymentRecordReportPaymentAttemptGuaranteedParams.metadata`, `PaymentRecordReportPaymentAttemptParams.metadata`, and `PaymentRecordReportPaymentParams.metadata` from `map(string: string)` to `emptyable(map(string: string))`
  * Change type of `privacy.RedactionJob.objects` from `$Privacy.RedactionJobRootObjects` to `RedactionResourceRootObjects`
  * Change type of `privacy.RedactionJobValidationError.erroringObject` from `map(string: string)` to `RedactionResourceErroringObject`
  * Remove support for `status` on `tax.Association`

  ### Other changes
  * Add support for `migrate` method on resource `Subscription`
  * Add support for `distance`, `pickupLocationName`, `returnLocationName`, and `vehicleIdentificationNumber` on `ChargeCaptureParams.payment_details.car_rental`, `ChargeUpdateParams.payment_details.car_rental`, `PaymentIntent.payment_details.car_rental`, `PaymentIntentCaptureParams.payment_details.car_rental`, `PaymentIntentConfirmParams.payment_details.car_rental`, `PaymentIntentCreateParams.payment_details.car_rental`, and `PaymentIntentUpdateParams.payment_details.car_rental`
  * Add support for `driverIdentificationNumber` and `driverTaxNumber` on `ChargeCaptureParams.payment_details.car_rental.drivers[]`, `ChargeUpdateParams.payment_details.car_rental.drivers[]`, `PaymentIntent.payment_details.car_rental.drivers[]`, `PaymentIntentCaptureParams.payment_details.car_rental.drivers[]`, `PaymentIntentConfirmParams.payment_details.car_rental.drivers[]`, `PaymentIntentCreateParams.payment_details.car_rental.drivers[]`, and `PaymentIntentUpdateParams.payment_details.car_rental.drivers[]`
  * Add support for new values `classic` and `flexible` on enums `InvoiceCreatePreviewParams.schedule_details.billingMode`, `InvoiceCreatePreviewParams.subscription_details.billingMode`, `QuoteCreateParams.subscription_data.billingMode`, `SubscriptionCreateParams.billingMode`, `SubscriptionScheduleCreateParams.billingMode`, and `checkout.SessionCreateParams.subscription_data.billingMode`
  * Add support for `institution` on `financialconnections.Account`
  * Add support for `countries` on `financialconnections.Institution`
  * Add support for `location` and `reader` on `PaymentAttemptRecord.payment_method_details.affirm`, `PaymentAttemptRecord.payment_method_details.wechat_pay`, `PaymentRecord.payment_method_details.affirm`, and `PaymentRecord.payment_method_details.wechat_pay`
  * Add support for `hooks` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentDecrementAuthorizationParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
  * Add support for `cardPresent` on `PaymentIntentAmountDetailsLineItem.payment_method_options`
  * Add support for `livemode` on `privacy.RedactionJob`
  * Add support for `billingThresholds` on `QuotePreviewSubscriptionSchedule.default_settings`, `QuotePreviewSubscriptionSchedule.phases[].items[]`, and `QuotePreviewSubscriptionSchedule.phases[]`
  * Add support for `billingModeDetails` on `Subscription`
  * Add support for `taxTransactionAttempts` on `tax.Association`
  * Add support for `confirmConfig` on `terminal.Reader.action.confirm_payment_intent` and `terminal.ReaderConfirmPaymentIntentParams`

## 29.2.0-beta.1 - 2025-04-30
This release changes the pinned API version to `2025-04-30.preview`.

* [#1988](https://github.com/stripe/stripe-java/pull/1988) Update generated code for beta
  This release changes the pinned API version to `2025-04-30.preview`.

  * Add support for `billingMode` on `InvoiceCreatePreviewParams.schedule_details`, `InvoiceCreatePreviewParams.subscription_details`, `Quote.subscription_data`, `QuoteCreateParams.subscription_data`, `QuotePreviewSubscriptionSchedule`, `SubscriptionCreateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionSchedule`, `Subscription`, and `checkout.SessionCreateParams.subscription_data`
  * Add support for `accountNumber` on `ConfirmationToken.payment_method_preview.acss_debit` and `PaymentMethod.acss_debit`
  * Add support for new values `aw_tin`, `az_tin`, `bd_bin`, `bf_ifu`, `bj_ifu`, `cm_niu`, `cv_nif`, `et_tin`, `kg_tin`, and `la_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for new value `balance_settings.updated` on enums `WebhookEndpointUpdateParams.enabledEvents`

## 29.1.0-beta.3 - 2025-04-17
* [#1985](https://github.com/stripe/stripe-java/pull/1985) Update generated code for beta
  * Add support for new resources `FxQuote` and `PaymentIntentAmountDetailsLineItem`
  * Add support for new services `FxQuoteService` (accessed by `StripeClient.fxQuotes()`) and `PaymentIntentAmountDetailsLineItemService` (accessed by `StripeClient.paymentIntents()`)
  * Remove support for service `InvoicePaymentService` (accessed by `StripeClient.invoices()`)
  * Add support for `create`, `list`, and `retrieve` methods on resource `FxQuote`
  * Remove support for `attach_payment_intent` method on resource `Invoice`
  * Remove support for `list` and `retrieve` methods on resource `InvoicePaymentCollection`
  * Add support for `list` method on resource `PaymentIntentAmountDetailsLineItem`
  * Add support for `list` method on service `PaymentIntentService`
  * Add support for `create`, `list`, and `retrieve` methods on service `FxQuoteService`
  * Remove support for `list` and `retrieve` methods on service `InvoicePaymentService`
  * Remove support for `attachPaymentIntent` method on service `InvoiceService`
  * Add support for `registrationDate` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
  * Add support for `usCfpbData` on `AccountCreateParams`, `AccountPersonCreateParams`, `AccountPersonUpdateParams`, `AccountUpdateParams`, `Person`, and `TokenCreateParams.person`
  * Add support for `customerReference` and `orderReference` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntent.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
  * Add support for `taxId` on `Charge.billing_details`, `ConfirmationToken.payment_method_preview.billing_details`, `ConfirmationTokenCreateParams.payment_method_data.billing_details`, `PaymentIntentConfirmParams.payment_method_data.billing_details`, `PaymentIntentCreateParams.payment_method_data.billing_details`, `PaymentIntentUpdateParams.payment_method_data.billing_details`, `PaymentMethod.billing_details`, `PaymentMethodCreateParams.billing_details`, `PaymentMethodUpdateParams.billing_details`, `SetupIntentConfirmParams.payment_method_data.billing_details`, `SetupIntentCreateParams.payment_method_data.billing_details`, `SetupIntentUpdateParams.payment_method_data.billing_details`, and `treasury.OutboundPaymentCreateParams.destination_payment_method_data.billing_details`
  * Add support for `priceData` on `checkout.SessionUpdateParams.line_items[]`
  * Change type of `checkout.SessionUpdateParams.line_items[].quantity` from `longInteger` to `emptyable(longInteger)`
  * Add support for `script` on `CouponCreateParams` and `Coupon`
  * Add support for `type` on `Coupon`
  * Add support for new value `affirm` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
  * Add support for `fxQuote` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `PaymentIntent`, `TransferCreateParams`, and `Transfer`
  * Add support for `discountAmount`, `lineItems`, `shipping`, and `tax` on `PaymentIntent.amount_details`
  * Add support for `pix` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
  * Add support for `pendingReason` on `Refund`
  * Add support for `aw`, `az`, `bd`, `bj`, `et`, `kg`, `la`, and `ph` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
  * Add support for new value `fx_quote.expired` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
  * Add support for snapshot event `fx_quote.expired` with resource `FxQuote`

## 29.1.0-beta.2 - 2025-04-10
* [#1974](https://github.com/stripe/stripe-java/pull/1974) Handle external_account field
  - Changes `externalAccount` field in `ExternalAccountCreateParams` from a `String` to a union type.
* [#1980](https://github.com/stripe/stripe-java/pull/1980) Update generated code for beta
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

## 29.1.0-beta.1 - 2025-04-02
This release changes the pinned API version to `2025-03-31.preview`.

### Breaking Changes

  * Remove support for `amountOverpaid` on `InvoicePayment`
  * Remove support for `interchangeFees`, `netTotal`, `networkFees`, and `transactionVolume` on `Issuing.Settlement`
  * Remove support for `Value` on `Terminal.Reader.action.collect_inputs.inputs[].selection.choices[]`, `Terminal.Reader.action.collect_inputs.inputs[].selection`, and `terminal.ReaderCollectInputsParams.inputs[].selection.choices[]`
  * Remove support for value `variable` from enum `CouponCreateParams.duration`
  * Remove support for `applicationFeeAmount`, `discount`, `paidOutOfBand`, `paid`, `paymentIntent`, `quote`, `subscriptionDetails`, `subscriptionProrationDate`, `tax`, `totalTaxAmounts`, and `transferData` on `QuotePreviewInvoice`
  * Remove support for `billingThresholds` on `QuotePreviewSubscriptionSchedule.default_settings`, `QuotePreviewSubscriptionSchedule.phases[].items[]`, and `QuotePreviewSubscriptionSchedule.phases[]`
  * Remove support for `coupon` on `QuotePreviewSubscriptionSchedule.phases[]`
  * Change `OrderCreateParams.payment.settings.payment_method_options.wechat_pay.client` and `OrderUpdateParams.payment.settings.payment_method_options.wechat_pay.client` to be optional
  * Change type of `PaymentAttemptRecord.payment_method_details.type` and `PaymentRecord.payment_method_details.type` from `literal('custom')` to `string`
  * Change type of `PaymentAttemptRecord.payment_record` from `string` to `nullable(string)`
  * Change `PaymentAttemptRecord.PaymentMethodDetail.custom` and `PaymentRecord.PaymentMethodDetail.custom` to be optional

### Additions

  * Add support for `paymentMethodOptions` on `ConfirmationTokenCreateParams`
  * Add support for `installments` on `ConfirmationToken.payment_method_options.card`
  * Add support for `billie` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
  * Add support for `id` and `text` on `Terminal.Reader.action.collect_inputs.inputs[].selection.choices[]`, `Terminal.Reader.action.collect_inputs.inputs[].selection`, and `terminal.ReaderCollectInputsParams.inputs[].selection.choices[]`
  * Add support for new resources `BalanceSettings`
  * Add support for `retrieve` and `update` methods on resource `BalanceSettings`
  * Add support for `create`, `delete`, `list`, `retrieve`, and `update` methods on a new `ExternalAccountService` class to access cards and bank accounts made available in the new path `v1/external_accounts`. Access this via `StripeClient.externalAccounts`
  * Add support for `stripeBalancePayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `customerAccount` on `Billing.CreditBalanceSummary`, `Billing.CreditGrant`, `BillingPortal.Session`, `Checkout.Session`, `ConfirmationToken.payment_method_preview`, `CreditNoteListParams`, `CreditNote`, `CustomerBalanceTransaction`, `CustomerCashBalanceTransaction`, `CustomerCashBalance`, `CustomerPaymentMethod`, `CustomerSessionCreateParams`, `CustomerSession`, `CustomerTaxId.owner`, `CustomerTaxId`, `Customer`, `Discount`, `FinancialConnections.Account.account_holder`, `FinancialConnections.Session.account_holder`, `InvoiceCreateParams`, `InvoiceCreatePreviewParams`, `InvoiceItemCreateParams`, `InvoiceItemListParams`, `InvoiceItem`, `InvoiceListParams`, `Invoice`, `PaymentIntentCreateParams`, `PaymentIntentListParams`, `PaymentIntentUpdateParams`, `PaymentIntent`, `PaymentMethodAttachParams`, `PaymentMethod`, `PromotionCodeCreateParams`, `PromotionCodeListParams`, `PromotionCode`, `QuoteCreateParams`, `QuoteListParams`, `QuotePreviewInvoice`, `QuotePreviewSubscriptionSchedule`, `QuoteUpdateParams`, `Quote`, `SetupAttempt`, `SetupIntentCreateParams`, `SetupIntentListParams`, `SetupIntentUpdateParams`, `SetupIntent`, `SubscriptionCreateParams`, `SubscriptionListParams`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleListParams`, `SubscriptionSchedule`, `Subscription`, `TaxId.owner`, `TaxIdCreateParams.owner`, `TaxIdListParams.owner`, `TaxId`, `billing.CreditBalanceSummaryRetrieveParams`, `billing.CreditBalanceTransactionListParams`, `billing.CreditGrantCreateParams`, `billing.CreditGrantListParams`, `billingportal.SessionCreateParams`, `checkout.SessionCreateParams`, `checkout.SessionListParams`, `financialconnections.AccountListParams.account_holder`, and `financialconnections.SessionCreateParams.account_holder`
  * Add support for `stripeBalance` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `CustomerPaymentMethod`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `updateLineItems` and `updateShippingDetails` on `Checkout.Session.permissions` and `checkout.SessionCreateParams.permissions`
  * Add support for `provider` on `Checkout.Session.automatic_tax`, `Invoice.automatic_tax`, `Quote.automatic_tax`, and `QuotePreviewInvoice.automatic_tax`
  * Add support for `taxCalculationReference` on `CreditNoteLineItem`, `CreditNotePreviewLines`, `InvoiceLineItem`, `LineItem`, `PaymentLinkLineItem`, `QuoteComputedUpfrontLineItems`, `QuoteLineItem`, and `SessionLineItem`
  * Add support for `context` on `Event`
  * Add support for `relatedCustomerAccount` on `Identity.VerificationSession`, `identity.VerificationSessionCreateParams`, and `identity.VerificationSessionListParams`
  * Add support for `networkData` on `Issuing.DisputeSettlementDetail`
  * Add support for `interchangeFeesAmount`, `netTotalAmount`, `networkFeesAmount`, `otherFeesAmount`, `otherFeesCount`, and `transactionAmount` on `Issuing.Settlement`
  * Add support for `reportedBy` on `PaymentAttemptRecord`
  * Add support for `achCreditTransfer`, `achDebit`, `acssDebit`, `affirm`, `afterpayClearpay`, `alipay`, `alma`, `amazonPay`, `auBecsDebit`, `bacsDebit`, `bancontact`, `billie`, `blik`, `boleto`, `cardPresent`, `card`, `cashapp`, `customerBalance`, `eps`, `fpx`, `giropay`, `gopay`, `grabpay`, `idBankTransfer`, `ideal`, `interacPresent`, `kakaoPay`, `klarna`, `konbini`, `krCard`, `link`, `mbWay`, `mobilepay`, `multibanco`, `naverPay`, `nzBankAccount`, `oxxo`, `p24`, `payByBank`, `payco`, `paynow`, `paypal`, `payto`, `pix`, `promptpay`, `qris`, `rechnung`, `revolutPay`, `samsungPay`, `satispay`, `sepaCreditTransfer`, `sepaDebit`, `shopeepay`, `sofort`, `stripeAccount`, `swish`, `twint`, `usBankAccount`, `wechatPay`, `wechat`, and `zip` on `PaymentAttemptRecord.payment_method_details` and `PaymentRecord.payment_method_details`
  * Add support for `PayoutMethod` on `PayoutCreateParams` and `Payout`
  * Add support for `confirmationSecret`, `parent`, and `totalTaxes` on `QuotePreviewInvoice`
  * Add support for `Id` and `Text` on `TerminalReaderActionCollectInputsInputsSelectionChoices`, `TerminalReaderActionCollectInputsInputsSelection`, and `TerminalReaderInputsSelectionChoicesOptions`

  #### New APIs for Money CardManagement

  * Add support for new resources `V2.FinancialAddressCreditSimulation`, `V2.FinancialAddressGeneratedMicrodeposits`, `V2.MoneyManagement.Adjustment`, `V2.MoneyManagement.FinancialAccount`, `V2.MoneyManagement.FinancialAddress`, `V2.MoneyManagement.InboundTransfer`, `V2.MoneyManagement.OutboundPaymentQuote`, `V2.MoneyManagement.OutboundPayment`, `V2.MoneyManagement.OutboundSetupIntent`, `V2.MoneyManagement.OutboundTransfer`, `V2.MoneyManagement.PayoutMethod`, `V2.MoneyManagement.PayoutMethodsBankAccountSpec`, `V2.MoneyManagement.ReceivedCredit`, `V2.MoneyManagement.ReceivedDebit`, `V2.MoneyManagement.TransactionEntry`, and `V2.MoneyManagement.Transaction`
  * Add support for `create` method on resource `V2.MoneyManagement.OutboundPaymentQuote`
  * Add support for `list` and `retrieve` methods on resources `V2.MoneyManagement.Adjustment`, `V2.MoneyManagement.FinancialAccount`, `V2.MoneyManagement.ReceivedCredit`, `V2.MoneyManagement.ReceivedDebit`, `V2.MoneyManagement.TransactionEntry`, and `V2.MoneyManagement.Transaction`
  * Add support for `create`, `list`, and `retrieve` methods on resources `V2.MoneyManagement.FinancialAddress` and `V2.MoneyManagement.InboundTransfer`
  * Add support for `cancel`, `create`, `list`, and `retrieve` methods on resources `V2.MoneyManagement.OutboundPayment` and `V2.MoneyManagement.OutboundTransfer`
  * Add support for `archive`, `list`, `retrieve`, and `unarchive` methods on resource `V2.MoneyManagement.PayoutMethod`
  * Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `V2.MoneyManagement.OutboundSetupIntent`
  * Add support for `retrieve` method on resource `V2.MoneyManagement.PayoutMethodsBankAccountSpec`
  * Add support for new values `account_number`, `fedwire_routing_number`, and `routing_number` on enum `invalid_payment_method.invalidParam`
  * Add support for new thin event `V2MoneyManagementFinancialAccountCreatedEvent` with related object `V2.MoneyManagement.FinancialAccount`
  * Add support for new thin events `V2MoneyManagementFinancialAddressActivatedEvent` and `V2MoneyManagementFinancialAddressFailedEvent` with related object `V2.MoneyManagement.FinancialAddress`
  * Add support for new thin events `V2MoneyManagementInboundTransferAvailableEvent`, `V2MoneyManagementInboundTransferBankDebitFailedEvent`, `V2MoneyManagementInboundTransferBankDebitProcessingEvent`, `V2MoneyManagementInboundTransferBankDebitQueuedEvent`, `V2MoneyManagementInboundTransferBankDebitReturnedEvent`, and `V2MoneyManagementInboundTransferBankDebitSucceededEvent` with related object `V2.MoneyManagement.InboundTransfer`
  * Add support for new thin events `V2MoneyManagementOutboundPaymentCanceledEvent`, `V2MoneyManagementOutboundPaymentCreatedEvent`, `V2MoneyManagementOutboundPaymentFailedEvent`, `V2MoneyManagementOutboundPaymentPostedEvent`, and `V2MoneyManagementOutboundPaymentReturnedEvent` with related object `V2.MoneyManagement.OutboundPayment`
  * Add support for new thin events `V2MoneyManagementOutboundTransferCanceledEvent`, `V2MoneyManagementOutboundTransferCreatedEvent`, `V2MoneyManagementOutboundTransferFailedEvent`, `V2MoneyManagementOutboundTransferPostedEvent`, and `V2MoneyManagementOutboundTransferReturnedEvent` with related object `V2.MoneyManagement.OutboundTransfer`
  * Add support for new thin events `V2MoneyManagementReceivedCreditAvailableEvent`, `V2MoneyManagementReceivedCreditFailedEvent`, `V2MoneyManagementReceivedCreditReturnedEvent`, and `V2MoneyManagementReceivedCreditSucceededEvent` with related object `V2.MoneyManagement.ReceivedCredit`
  * Add support for new thin events `V2MoneyManagementReceivedDebitCanceledEvent`, `V2MoneyManagementReceivedDebitFailedEvent`, `V2MoneyManagementReceivedDebitPendingEvent`, `V2MoneyManagementReceivedDebitSucceededEvent`, and `V2MoneyManagementReceivedDebitUpdatedEvent` with related object `V2.MoneyManagement.ReceivedDebit`
  * Add support for new error types `AlreadyCanceledException`, `BlockedByStripeException`, `ControlledByDashboardException`, `FeatureNotEnabledException`, `FinancialAccountNotOpenException`, `InsufficientFundsException`, `InvalidPayoutMethodException`, `NotCancelableException`, and `RecipientNotNotifiableException`


  #### New APIs for Accounts v2 in private preview
  See [SaaS platform payments with subscription billing using Accounts v2](https://docs.stripe.com/connect/accounts-v2/saas-platform-payments-billing)

  * Add support for new resources `V2.Core.AccountLink`, `V2.Core.Account`, `V2.Core.Person`, `V2.Core.Vault.GbBankAccount`, `V2.Core.Vault.UsBankAccount`
  * Add support for `close`, `create`, `list`, `retrieve`, and `update` methods on resource `V2.Core.Account`
  * Add support for `create` method on resources `V2.Core.AccountLink` and `V2.MoneyManagement.OutboundPaymentQuote`
  * Add support for `acknowledge_confirmation_of_payee`, `archive`, `create`, `initiate_confirmation_of_payee`, and `retrieve` methods on resource `V2.Core.Vault.GbBankAccount`
  * Add support for `archive`, `create`, `retrieve`, and `update` methods on resource `V2.Core.Vault.UsBankAccount`
  * Add support for new thin events `V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEvent`, `V2CoreAccountIncludingConfigurationCustomerUpdatedEvent`, `V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent`, `V2CoreAccountIncludingConfigurationMerchantUpdatedEvent`, `V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent`, `V2CoreAccountIncludingConfigurationRecipientUpdatedEvent`, `V2CoreAccountIncludingIdentityUpdatedEvent`, and `V2CoreAccountIncludingRequirementsUpdatedEvent`
  * Add support for new thin event `V2CoreAccountLinkCompletedEvent` with related object `V2.Core.AccountLink`
  * Add support for new thin events `V2CoreAccountPersonCreatedEvent`, `V2CoreAccountPersonDeletedEvent`, and `V2CoreAccountPersonUpdatedEvent` with related object `V2.Core.Person`

### Changes

  * Change `PaymentRecordReportPaymentParams.paymentReference` to be optional
  * Change type of `PaymentAttemptRecord.payment_method_details.custom` and `PaymentRecord.payment_method_details.custom` from `nullable(PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails)` to `PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails`

* [#1966](https://github.com/stripe/stripe-java/pull/1966) , [#1965](https://github.com/stripe/stripe-java/pull/1965) Update generated code for beta

### Changes
* [#1959](https://github.com/stripe/stripe-java/pull/1959) Update AddBetaVersion behavior
  * `Stripe.AddBetaVersion` will use the highest version number used for a beta feature instead of throwing an `Exception` on a conflict as it had done previously.

## 28.5.0-beta.1 - 2025-03-18
This release changes the pinned API version to `2025-02-24.acacia`.

* [#1956](https://github.com/stripe/stripe-java/pull/1956) Beta SDK updates between Open API versions 1473 and 1505
  * Add support for `succeed_input_collection` and `timeout_input_collection` test helper methods on resource `Terminal.Reader`
  * Add support for `target_date` on `Order.payment.settings.payment_method_options.acss_debit`, `Order.payment.settings.payment_method_options.sepa_debit`, `OrderCreateParams.payment.settings.payment_method_options.acss_debit`, `OrderCreateParams.payment.settings.payment_method_options.sepa_debit`, `OrderUpdateParams.payment.settings.payment_method_options.acss_debit`, and `OrderUpdateParams.payment.settings.payment_method_options.sepa_debit`

## 28.4.0-beta.1 - 2025-02-07
* [#1942](https://github.com/stripe/stripe-java/pull/1942) Update generated code for beta
  * Add support for `rejected_reason` on `Account.risk_controls`
  * Add support for `product_tax_code_selector` on `AccountSessionCreateParams.components`
  * Add support for `prices` on `Billing.CreditGrant.applicability_config.scope`, `billing.CreditBalanceSummaryRetrieveParams.filter.applicability_scope`, and `billing.CreditGrantCreateParams.applicability_config.scope`
  * Add support for `brand_product` on `Charge.payment_method_details.amazon_pay.funding.card` and `Charge.payment_method_details.revolut_pay.funding.card`
  * Add support for `restrictions` on `Checkout.Session.payment_method_options.card` and `checkout.SessionCreateParams.payment_method_options.card`
  * Change type of `TokenCreateParams.person.political_exposure` from `string` to `enum('existing'|'none')`

## 28.3.0-beta.3 - 2025-01-23
* [#1939](https://github.com/stripe/stripe-java/pull/1939) Update generated code for beta
  * Remove support for `stripe_account` on `Terminal.Reader.action.collect_payment_method`, `Terminal.Reader.action.confirm_payment_intent`, `Terminal.Reader.action.process_payment_intent`, and `Terminal.Reader.action.refund_payment`

## 28.3.0-beta.2 - 2025-01-17
This release changes the pinned API version to `2025-01-27.acacia`.

* [#1935](https://github.com/stripe/stripe-java/pull/1935) Update generated code for beta
  * Add support for `pay_by_bank_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `directorship_declaration` on `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
  * Add support for `proof_of_ultimate_beneficial_ownership` on `AccountCreateParams.documents` and `AccountUpdateParams.documents`
  * Add support for `tax_threshold_monitoring` on `AccountSessionCreateParams.components`
  * Add support for `financial_account_transactions`, `financial_account`, `issuing_card`, and `issuing_cards_list` on `AccountSession.components`
  * Add support for new value `always_invoice` on enums `billingportal.ConfigurationCreateParams.features.subscription_cancel.proration_behavior` and `billingportal.ConfigurationUpdateParams.features.subscription_cancel.proration_behavior`
  * Add support for `pay_by_bank` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, and `checkout.SessionCreateParams.payment_method_options`
  * Add support for new value `pay_by_bank` on enum `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for new value `SD` on enums `PaymentLinkCreateParams.shipping_address_collection.allowed_countries[]`, `PaymentLinkUpdateParams.shipping_address_collection.allowed_countries[]`, and `checkout.SessionCreateParams.shipping_address_collection.allowed_countries[]`
  * Add support for `discounts` on `Checkout.Session`
  * Add support for new value `pay_by_bank` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `pay_by_bank` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for new value `pay_by_bank` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for `jpy` on `Terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
  * Add support for new value `2025-01-27.acacia` on enum `WebhookEndpointCreateParams.api_version`

## 28.3.0-beta.1 - 2025-01-09
* [#1932](https://github.com/stripe/stripe-java/pull/1932) Update generated code for beta
  * Add support for `close` method on resource `Treasury.FinancialAccount`
  * Add support for `ownership_exemption_reason` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
  * Add support for `directorship_declaration` on `Account.company`
  * Add support for `advice_code` on `Charge.outcome`, `Invoice.last_finalization_error`, `PaymentIntent.last_payment_error`, `SetupAttempt.setup_error`, `SetupIntent.last_setup_error`, and `StripeError`
  * Remove support for value `always_invoice` from enums `billingportal.ConfigurationCreateParams.features.subscription_cancel.proration_behavior` and `billingportal.ConfigurationUpdateParams.features.subscription_cancel.proration_behavior`
  * Add support for `brand_product` on `Card`, `Source.card_present`, `Source.card`, and `Source.three_d_secure`
  * Add support for `country` on `Charge.payment_method_details.paypal`, `ConfirmationToken.payment_method_preview.paypal`, and `PaymentMethod.paypal`
  * Add support for new value `al_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `phone_number_collection` on `PaymentLinkUpdateParams`
  * Add support for `nickname` on `Treasury.FinancialAccount`, `treasury.FinancialAccountCreateParams`, and `treasury.FinancialAccountUpdateParams`
  * Add support for `forwarding_settings` on `treasury.FinancialAccountUpdateParams`
  * Add support for `is_default` on `Treasury.FinancialAccount`
  * Add support for `destination_payment_method_data` on `treasury.OutboundTransferCreateParams`
  * Add support for `financial_account` on `Treasury.OutboundTransfer.destination_payment_method_details`
  * Change type of `Treasury.OutboundTransfer.destination_payment_method_details.type` from `literal('us_bank_account')` to `enum('financial_account'|'us_bank_account')`
  * Add support for new value `outbound_transfer` on enum `treasury.ReceivedCreditListParams.linked_flows.source_flow_type`
  * Add support for `outbound_transfer` on `Treasury.ReceivedCredit.linked_flows.source_flow_details`

## 28.2.0-beta.4 - 2024-12-12
This release changes the pinned API version to `2024-12-18.acacia`.

* [#1929](https://github.com/stripe/stripe-java/pull/1929) Update generated code for beta
  * Add support for `allow_redisplay` on `Card` and `Source`
  * Add support for new values `am_tin`, `ao_tin`, `ba_tin`, `bb_tin`, `bs_tin`, `cd_nif`, `gn_nif`, `kh_tin`, `me_pib`, `mk_vat`, `mr_nif`, `np_pan`, `sn_ninea`, `sr_fin`, `tj_tin`, `ug_tin`, `zm_tin`, and `zw_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Remove support for `amount_refunded` on `PaymentRecord`
  * Add support for `account` on `Terminal.Reader.action.collect_payment_method`, `Terminal.Reader.action.confirm_payment_intent`, `Terminal.Reader.action.process_payment_intent`, and `Terminal.Reader.action.refund_payment`

## 28.2.0-beta.3 - 2024-12-06
* [#1930](https://github.com/stripe/stripe-java/pull/1930) Change types for capital FinancingSummary back to BigDecimal
  * The type for `Capital.FinancingSummary.Details.advancePaidOutAt`, `Capital.FinancingSummary.Details.repaymentsBeginAt`, `Capital.FinancingSummary.Details.CurrentRepaymentInterval.repaymentsBeginAt` have been changed to `BigDecimal` to reflect the API

## 28.2.0-beta.2 - 2024-12-05
* [#1926](https://github.com/stripe/stripe-java/pull/1926) Update generated code for beta
  * Add support for `automatic_indirect_tax` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `reference_prefix` on `Checkout.Session.payment_method_options.bacs_debit.mandate_options`, `Checkout.Session.payment_method_options.sepa_debit.mandate_options`, `Order.payment.settings.payment_method_options.sepa_debit.mandate_options`, `OrderCreateParams.payment.settings.payment_method_options.sepa_debit.mandate_options`, `OrderUpdateParams.payment.settings.payment_method_options.sepa_debit.mandate_options`, `PaymentIntent.payment_method_options.bacs_debit.mandate_options`, `PaymentIntent.payment_method_options.sepa_debit.mandate_options`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit.mandate_options`, `PaymentIntentConfirmParams.payment_method_options.sepa_debit.mandate_options`, `PaymentIntentCreateParams.payment_method_options.bacs_debit.mandate_options`, `PaymentIntentCreateParams.payment_method_options.sepa_debit.mandate_options`, `PaymentIntentUpdateParams.payment_method_options.bacs_debit.mandate_options`, `PaymentIntentUpdateParams.payment_method_options.sepa_debit.mandate_options`, `SetupIntent.payment_method_options.bacs_debit.mandate_options`, `SetupIntent.payment_method_options.sepa_debit.mandate_options`, `SetupIntentConfirmParams.payment_method_options.bacs_debit.mandate_options`, `SetupIntentConfirmParams.payment_method_options.sepa_debit.mandate_options`, `SetupIntentCreateParams.payment_method_options.bacs_debit.mandate_options`, `SetupIntentCreateParams.payment_method_options.sepa_debit.mandate_options`, `SetupIntentUpdateParams.payment_method_options.bacs_debit.mandate_options`, `SetupIntentUpdateParams.payment_method_options.sepa_debit.mandate_options`, `checkout.SessionCreateParams.payment_method_options.bacs_debit.mandate_options`, and `checkout.SessionCreateParams.payment_method_options.sepa_debit.mandate_options`
  * Add support for `disabled_reason` on `Invoice.automatic_tax`, `Subscription.automatic_tax`, `SubscriptionSchedule.default_settings.automatic_tax`, and `SubscriptionSchedule.phases[].automatic_tax`
  * Add support for `trial_period_days` on `PaymentLinkUpdateParams.subscription_data`

## 28.2.0-beta.1 - 2024-11-21
* [#1924](https://github.com/stripe/stripe-java/pull/1924) Update generated code for beta
  * Add support for `network_advice_code` and `network_decline_code` on `Charge.outcome`, `Invoice.last_finalization_error`, `PaymentIntent.last_payment_error`, `SetupAttempt.setup_error`, `SetupIntent.last_setup_error`, and `StripeError`
  * Add support for `funding` on `Charge.payment_method_details.amazon_pay` and `Charge.payment_method_details.revolut_pay`
  * Add support for `amount_requested` and `partial_authorization` on `Charge.payment_method_details.card`
  * Add support for `metadata` on `LineItem` and `checkout.SessionCreateParams.line_items[]`
  * Add support for `line_items` on `Checkout.Session.permissions.update`, `checkout.SessionCreateParams.permissions.update`, and `checkout.SessionUpdateParams`
  * Add support for `adjustable_quantity` and `display` on `LineItem`
  * Add support for `request_partial_authorization` on `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`
  * Add support for `payment_method_options` on `PaymentIntentIncrementAuthorizationParams`
  * Add support for new value `invoice.overpaid` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 28.1.0-beta.3 - 2024-11-14
This release changes the pinned API version to `2024-11-20.acacia`.

* [#1922](https://github.com/stripe/stripe-java/pull/1922) Update generated code for beta
  * Add support for `account_holder_address` and `bank_address` on `FundingInstructions.bank_transfer.financial_addresses[].iban`, `FundingInstructions.bank_transfer.financial_addresses[].sort_code`, `FundingInstructions.bank_transfer.financial_addresses[].spei`, `FundingInstructions.bank_transfer.financial_addresses[].zengin`, `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].iban`, `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].sort_code`, `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].spei`, and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].zengin`
  * Add support for `account_holder_name` on `FundingInstructions.bank_transfer.financial_addresses[].spei` and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].spei`
  * Add support for new value `subscribe` on enum `PaymentLinkUpdateParams.submit_type`

## 28.1.0-beta.2 - 2024-11-07
* [#1917](https://github.com/stripe/stripe-java/pull/1917) Update generated code for beta
  * Add support for new resources `Issuing.FraudLiabilityDebit`, `PaymentAttemptRecord`, and `PaymentRecord`
  * Add support for `list` and `retrieve` methods on resources `FraudLiabilityDebit` and `PaymentAttemptRecord`
  * Add support for `report_payment_attempt_canceled`, `report_payment_attempt_failed`, `report_payment_attempt_guaranteed`, `report_payment_attempt`, `report_payment`, and `retrieve` methods on resource `PaymentRecord`
  * Remove support for `money_movement` on `AccountSessionCreateParams.components.financial_account.features`
  * Add support for `card_management`, `card_spend_dispute_management`, `cardholder_management`, and `spend_control_management` on `AccountSessionCreateParams.components.issuing_card.features`
  * Add support for `disable_stripe_user_authentication` on `AccountSessionCreateParams.components.issuing_cards_list.features`
  * Add support for `adaptive_pricing` on `Checkout.Session` and `checkout.SessionCreateParams`
  * Add support for `mandate_options` on `Checkout.Session.payment_method_options.bacs_debit`, `Checkout.Session.payment_method_options.sepa_debit`, `checkout.SessionCreateParams.payment_method_options.bacs_debit`, and `checkout.SessionCreateParams.payment_method_options.sepa_debit`
  * Add support for `request_decremental_authorization`, `request_extended_authorization`, `request_incremental_authorization`, `request_multicapture`, and `request_overcapture` on `Checkout.Session.payment_method_options.card` and `checkout.SessionCreateParams.payment_method_options.card`
  * Add support for `capture_method` on `checkout.SessionCreateParams.payment_method_options.kakao_pay`, `checkout.SessionCreateParams.payment_method_options.kr_card`, `checkout.SessionCreateParams.payment_method_options.naver_pay`, `checkout.SessionCreateParams.payment_method_options.payco`, and `checkout.SessionCreateParams.payment_method_options.samsung_pay`
  * Add support for new value `li_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
  * Add support for `account_holder_address`, `account_holder_name`, `account_type`, and `bank_address` on `FundingInstructions.bank_transfer.financial_addresses[].aba`, `FundingInstructions.bank_transfer.financial_addresses[].swift`, `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].aba`, and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].swift`
  * Add support for new value `custom` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Add support for new value `service_tax` on enums `InvoiceAddLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `InvoiceUpdateLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `TaxRateCreateParams.tax_type`, and `TaxRateUpdateParams.tax_type`
  * Add support for `payment_record_data` and `payment_record` on `InvoiceAttachPaymentParams`
  * Remove support for `out_of_band_payment` on `InvoiceAttachPaymentParams`
  * Add support for `amount_overpaid` on `Invoice`
  * Add support for `merchant_amount` and `merchant_currency` on `issuing.AuthorizationCreateParams`
  * Change `issuing.AuthorizationCreateParams.amount` to be optional
  * Add support for new value `link` on enums `PaymentIntentConfirmParams.payment_method_options.card.network`, `PaymentIntentCreateParams.payment_method_options.card.network`, `PaymentIntentUpdateParams.payment_method_options.card.network`, `SetupIntentConfirmParams.payment_method_options.card.network`, `SetupIntentCreateParams.payment_method_options.card.network`, `SetupIntentUpdateParams.payment_method_options.card.network`, `SubscriptionCreateParams.payment_settings.payment_method_options.card.network`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card.network`
  * Add support for `submit_type` on `PaymentLinkUpdateParams`
  * Add support for new values `invoice.payment_attempt_required` and `issuing_fraud_liability_debit.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 28.1.0-beta.1 - 2024-10-29
This release changes the pinned API version to `2024-10-28.acacia`.

* [#1909](https://github.com/stripe/stripe-java/pull/1909) Do not allow setting Stripe.stripeVersion
  * `Stripe.stripeVersion` is no longer settable. If you were using this to set the beta headers, use the helper method `Stripe.addBetaVersion()` instead.
* [#1914](https://github.com/stripe/stripe-java/pull/1914) Update generated code for beta
  * Add support for `trigger_action` method on resource `PaymentIntent`
  * Add support for `id_bank_transfer_payments_bca` and `id_bank_transfer_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `bank_bca_onboarding` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
  * Add support for `send_money` on `AccountSessionCreateParams.components.recipients.features`
  * Add support for `id_bank_transfer` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `Refund.destination_details`, `SetupAttempt.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentUpdateParams.payment_method_data`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for `gopay`, `qris`, and `shopeepay` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`

## 27.2.0-beta.3 - 2024-10-18
* [#1897](https://github.com/stripe/stripe-java/pull/1897) Update generated code for beta
  * Add support for `alma_payments`, `gopay_payments`, `kakao_pay_payments`, `kr_card_payments`, `naver_pay_payments`, `payco_payments`, `qris_payments`, `samsung_pay_payments`, `shopeepay_payments`, `treasury_evolve`, `treasury_fifth_third`, and `treasury_goldman_sachs` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `schedule_at_period_end` on `BillingPortal.Configuration.features.subscription_update`, `billingportal.ConfigurationCreateParams.features.subscription_update`, and `billingportal.ConfigurationUpdateParams.features.subscription_update`
  * Change `billingportal.ConfigurationCreateParams.business_profile` to be optional
  * Add support for `alma` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `Refund.destination_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `gopay`, `qris`, and `shopeepay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new values `alma`, `gopay`, `qris`, and `shopeepay` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, `PaymentMethodListParams.type`, and `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for new values `alma`, `gopay`, `qris`, and `shopeepay` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `auto` on enum `CustomerUpdateParams.tax.validate_location`
  * Add support for `metadata` on `forwarding.RequestCreateParams`
  * Add support for new values `jp_credit_transfer`, `kakao_pay`, `kr_card`, `naver_pay`, and `payco` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Remove support for value `expired` from enum `issuing.AuthorizationListParams.status`
  * Add support for new values `alma`, `gopay`, `qris`, and `shopeepay` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for `amazon_pay` on `PaymentMethodDomain`
  * Add support for `external_reference` on `Tax.Form.payee` and `tax.FormListParams.payee`
  * Change type of `Tax.Form.payee.type` and `tax.FormListParams.payee.type` from `literal('account')` to `enum('account'|'external_reference')`
  * Add support for new values `au_serr`, `ca_mrdp`, `eu_dac7`, `gb_mrdp`, and `nz_mrdp` on enum `tax.FormListParams.type`
  * Add support for `au_serr`, `ca_mrdp`, `eu_dac7`, `gb_mrdp`, and `nz_mrdp` on `Tax.Form`
  * Add support for `pln` on `Terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
  * Add support for `bank` on `Treasury.FinancialAccountFeatures.financial_addresses.aba`, `treasury.FinancialAccountCreateParams.features.financial_addresses.aba`, `treasury.FinancialAccountUpdateFeaturesParams.financial_addresses.aba`, and `treasury.FinancialAccountUpdateParams.features.financial_addresses.aba`

## 27.2.0-beta.2 - 2024-10-08
* [#1872](https://github.com/stripe/stripe-java/pull/1872) Update generated code for beta
  * Add support for `submit_card` test helper method on resource `Issuing.Card`
  * Add support for `groups` on `AccountCreateParams`, `AccountUpdateParams`, and `Account`
  * Add support for `disable_stripe_user_authentication` on `AccountSession.components.account_management.features`, `AccountSession.components.account_onboarding.features`, `AccountSession.components.balances.features`, `AccountSession.components.notification_banner.features`, `AccountSession.components.payouts.features`, `AccountSessionCreateParams.components.account_management.features`, `AccountSessionCreateParams.components.account_onboarding.features`, `AccountSessionCreateParams.components.balances.features`, `AccountSessionCreateParams.components.financial_account.features`, `AccountSessionCreateParams.components.notification_banner.features`, and `AccountSessionCreateParams.components.payouts.features`
  * Add support for `card_spend_dispute_management` and `spend_control_management` on `AccountSessionCreateParams.components.issuing_cards_list.features`
  * Add support for `kakao_pay` and `kr_card` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `Mandate.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupAttempt.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `naver_pay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `payco` and `samsung_pay` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new values `kakao_pay`, `kr_card`, `naver_pay`, `payco`, and `samsung_pay` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, `PaymentMethodListParams.type`, and `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for new values `kakao_pay`, `kr_card`, `naver_pay`, `payco`, and `samsung_pay` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new values `by_tin`, `ma_vat`, `md_vat`, `tz_vat`, `uz_tin`, and `uz_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
  * Add support for `metadata` on `Forwarding.Request`
  * Add support for new value `retail_delivery_fee` on enums `InvoiceAddLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `InvoiceUpdateLinesParams.lines[].tax_amounts[].tax_rate_data.tax_type`, `TaxRateCreateParams.tax_type`, and `TaxRateUpdateParams.tax_type`
  * Add support for new value `expired` on enum `issuing.AuthorizationListParams.status`
  * Add support for `line_items` on `Order.payment.settings.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntent.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
  * Add support for `flat_amount` and `rate_type` on `Tax.Calculation.tax_breakdown[].tax_rate_details` and `TaxRate`
  * Add support for `by`, `cr`, `ec`, `ma`, `md`, `rs`, `ru`, `tz`, and `uz` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
  * Add support for new value `state_retail_delivery_fee` on enum `tax.RegistrationCreateParams.country_options.us.type`
  * Add support for new value `refund.failed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 27.2.0-beta.1 - 2024-10-03
This release changes the pinned API version to `2024-09-30.acacia`.

* [#1888](https://github.com/stripe/stripe-java/pull/1888) Update generated code
  * Add support for `reporting_chart` on `AccountSessionCreateParams.components`
  * Remove support for `from_schedule` on `Quote.subscription_data`
  * Add support for `allow_redisplay` on `terminal.ReaderCollectPaymentMethodParams.collect_config`

## 26.13.0-beta.1 - 2024-09-18
* [#1870](https://github.com/stripe/stripe-java/pull/1870) Update generated code for beta
  * Remove support for resource `QuotePhase`
  * Remove support for `list_line_items` and `retrieve` methods on resource `QuotePhase`
  * Add support for `send_money` and `transfer_balance` on `AccountSessionCreateParams.components.financial_account.features`
  * Add support for new value `rechnung` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`

## 26.12.0-beta.1 - 2024-09-13
* [#1862](https://github.com/stripe/stripe-java/pull/1862) Update generated code for beta
  * Add support for new resources `Issuing.DisputeSettlementDetail` and `Issuing.Settlement`
  * Add support for `list` and `retrieve` methods on resource `DisputeSettlementDetail`
  * Remove support for `list` method on resource `QuotePhase`
  * Add support for new value `rechnung` on enum `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for `settlement` on `Issuing.Transaction` and `issuing.TransactionListParams`
  * Add support for new values `issuing_dispute_settlement_detail.created`, `issuing_dispute_settlement_detail.updated`, `issuing_settlement.created`, and `issuing_settlement.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 26.11.0-beta.1 - 2024-09-05
* [#1861](https://github.com/stripe/stripe-java/pull/1861) RawRequest will be on StripeClient only
  * Remove the deprecated method `Stripe.rawRequest()` and `Stripe.deserialize()` in favor of `StripeClient.rawRequest()` and `StripeClient.deserialize()`
* [#1853](https://github.com/stripe/stripe-java/pull/1853) Update generated code for beta
  * Add support for new resource `Terminal.ReaderCollectedData`
  * Add support for `retrieve` method on resource `ReaderCollectedData`
  * Add support for new value `mb_way` on enum `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for `business_name`, `email`, `phone`, and `tax_ids` on `Checkout.Session.collected_information`
  * Add support for `regulatory_reporting_file` on `Issuing.CreditUnderwritingRecord`, `issuing.CreditUnderwritingRecordCorrectParams`, `issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams`, and `issuing.CreditUnderwritingRecordReportDecisionParams`
  * Remove support for `rechnung` on `PaymentMethodUpdateParams`
* [#1859](https://github.com/stripe/stripe-java/pull/1859) Update generated code for beta
  * Add support for `recipients` on `AccountSessionCreateParams.components`
  * Add support for new value `mb_way` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for new value `billing.meter_error_report.triggered` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 26.9.0-beta.2 - 2024-08-22
* [#1851](https://github.com/stripe/stripe-java/pull/1851) Update generated code for beta
  * Add support for `mb_way_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `mb_way` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new value `mb_way` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `mb_way` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for new value `hr_oib` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Remove support for `phases` on `QuoteCreateParams` and `QuoteUpdateParams`
  * Remove support for `from_schedule` on `QuoteCreateParams.subscription_data`

## 26.9.0-beta.1 - 2024-08-15
* [#1848](https://github.com/stripe/stripe-java/pull/1848) Update generated code for beta
  * Add support for `capital_financing_application` and `capital_financing` on `AccountSessionCreateParams.components`
  * Add support for `permissions` on `Checkout.Session` and `checkout.SessionCreateParams`
  * Add support for `collected_information` on `Checkout.Session` and `checkout.SessionUpdateParams`
  * Add support for `shipping_options` on `checkout.SessionUpdateParams`

## 26.8.0-beta.1 - 2024-08-12
* ⚠️ [#1844](https://github.com/stripe/stripe-java/pull/1844) Update generated code for beta
  * Add support for `capital_financing_application` and `capital_financing` on `AccountSession.components`
  * Add support for `payto` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
  * Add support for new value `payto` on enum `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for new value `custom` on enum `checkout.SessionCreateParams.ui_mode`
  * ⚠️  Remove support for `risk_correlation_id` on `PaymentIntent.payment_method_options.rechnung`, `PaymentIntentConfirmParams.payment_method_options.rechnung`, `PaymentIntentCreateParams.payment_method_options.rechnung`, and `PaymentIntentUpdateParams.payment_method_options.rechnung`
  * Add support for new value `payto` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`

## 26.7.0-beta.1 - 2024-08-01
* [#1842](https://github.com/stripe/stripe-java/pull/1842) Update generated code for beta
  * Add support for `attach_payment` method on resource `Invoice`
  * Add support for `app_install` and `app_viewport` on `AccountSessionCreateParams.components`
  * Remove support for `partner_rejected_details` on `Dispute.evidence_details.enhanced_eligibility.visa_compelling_evidence_3`
  * Add support for `lines_invalid` on `Quote.status_details.stale.last_reason`
  * Add support for `last_price_migration_error` on `SubscriptionSchedule` and `Subscription`

## 26.6.0-beta.1 - 2024-07-25
* [#1834](https://github.com/stripe/stripe-java/pull/1834) Update generated code for beta
  ⚠️ `InvoicePayment.charge` and `InvoicePayment.paymentIntent` were removed in favor of `InvoicePayment.Payment`, which encapsulates both. The `Charge` and `PaymentIntent` fields are now found at `InvoicePayment.Payment.Charge` `InvoicePaymentPayment.paymentIntent`

  * Add support for new resources `Billing.AlertTriggered`, `Billing.Alert`, and `Tax.Association`
  * Add support for `activate`, `archive`, `create`, `deactivate`, `list`, and `retrieve` methods on resource `Alert`
  * Add support for `find` method on resource `Association`
  * Add support for `capital` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
  * Add support for `async_workflows` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentDecrementAuthorizationParams`, `PaymentIntentIncrementAuthorizationParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
  * Add support for `payto` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
  * Add support for `display_name` on `Treasury.FinancialAccount`, `treasury.FinancialAccountCreateParams`, and `treasury.FinancialAccountUpdateParams`

## 26.3.0-beta.1 - 2024-07-05
* ⚠️ [#1832](https://github.com/stripe/stripe-java/pull/1832) Update generated code for beta
  * ⚠️ Remove support for `payment_method_update` on `CustomerSession.components.payment_element.features` and `CustomerSessionCreateParams.components.payment_element.features`. Users are expected to completely migrate from using `payment_method_update`.
  * Add support for new resource `FinancialConnections.Institution`
  * Add support for `list` and `retrieve` methods on resource `Institution`
  * Add support for `institution` on `Checkout.Session.payment_method_options.us_bank_account.financial_connections.filters`, `FinancialConnections.Session.filters`, `Invoice.payment_settings.payment_method_options.us_bank_account.financial_connections.filters`, `InvoiceCreateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.filters`, `InvoiceUpdateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.filters`, `PaymentIntent.payment_method_options.us_bank_account.financial_connections.filters`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account.financial_connections.filters`, `PaymentIntentCreateParams.payment_method_options.us_bank_account.financial_connections.filters`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account.financial_connections.filters`, `SetupIntent.payment_method_options.us_bank_account.financial_connections.filters`, `SetupIntentConfirmParams.payment_method_options.us_bank_account.financial_connections.filters`, `SetupIntentCreateParams.payment_method_options.us_bank_account.financial_connections.filters`, `SetupIntentUpdateParams.payment_method_options.us_bank_account.financial_connections.filters`, `Subscription.payment_settings.payment_method_options.us_bank_account.financial_connections.filters`, `SubscriptionCreateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.filters`, `SubscriptionUpdateParams.payment_settings.payment_method_options.us_bank_account.financial_connections.filters`, and `financialconnections.SessionCreateParams.filters`
  * Add support for `payment_method_allow_redisplay_filters`, `payment_method_redisplay_limit`, `payment_method_redisplay`, and `payment_method_save_usage` on `CustomerSession.components.payment_element.features` and `CustomerSessionCreateParams.components.payment_element.features`
  * Add support for new value `balance` on enums `financialconnections.AccountSubscribeParams.features[]` and `financialconnections.AccountUnsubscribeParams.features[]`

## 26.2.0-beta.1 - 2024-06-27
This release changes the pinned API version to `2024-06-20`.

* [#1824](https://github.com/stripe/stripe-java/pull/1824) Update generated code for beta
  * Remove support for `payment_method_set_as_default` on `CustomerSession.components.payment_element.features` and `CustomerSessionCreateParams.components.payment_element.features`
  * Add support for new value `ch_uid` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`

## 25.13.0-beta.1 - 2024-06-13
* [#1819](https://github.com/stripe/stripe-java/pull/1819) Update generated code for beta
  * Add support for new value `de_stn` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`

## 25.12.0-beta.1 - 2024-06-06
* [#1816](https://github.com/stripe/stripe-java/pull/1816) Update generated code for beta
  * Add support for `twint` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`

## 25.11.0-beta.1 - 2024-05-30
* [#1814](https://github.com/stripe/stripe-java/pull/1814) Update generated code for beta
  * Add support for new values `en-RO` and `ro-RO` on enums `OrderCreateParams.payment.settings.payment_method_options.klarna.preferred_locale` and `OrderUpdateParams.payment.settings.payment_method_options.klarna.preferred_locale`

## 25.10.0-beta.1 - 2024-05-23
* [#1813](https://github.com/stripe/stripe-java/pull/1813) Update generated code for beta
  * Change `CreditNoteCreateParams.refunds[].refund`, `CreditNotePreviewLinesParams.refunds[].refund`, and `CreditNotePreviewParams.refunds[].refund` to be optional

## 25.9.0-beta.1 - 2024-05-16
* [#1802](https://github.com/stripe/stripe-java/pull/1802) Update generated code for beta

## 25.7.0-beta.1 - 2024-05-09
* [#1800](https://github.com/stripe/stripe-java/pull/1800) Update generated code for beta
  * Add support for `rechnung_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `rechnung` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `multibanco` on `Checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
  * Add support for new value `multibanco` on enum `checkout.SessionCreateParams.payment_method_types[]`
  * Add support for new value `rechnung` on enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `rechnung` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`

## 25.5.0-beta.1 - 2024-04-25
* [#1783](https://github.com/stripe/stripe-java/pull/1783) Update generated code for beta
  * Add support for `payment_method_settings` on `AccountSessionCreateParams.components`
  * Add support for `cancel_subscription_schedule` on `QuoteCreateParams.lines[]`, `QuoteLine`, and `QuoteUpdateParams.lines[]`

## 25.4.0-beta.1 - 2024-04-18
* [#1781](https://github.com/stripe/stripe-java/pull/1781) Update generated code for beta
  * Add support for `capital_overview`, `tax_registrations`, and `tax_settings` on `AccountSessionCreateParams.components`
  * Add support for `external_account_collection` on `AccountSessionCreateParams.components.financial_account.features`
  * Add support for `subscription_trial_from_plan` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`

## 25.2.0-beta.1 - 2024-04-11
This release changes the pinned API version to `2024-04-10`.

* [#1777](https://github.com/stripe/stripe-java/pull/1777) Update generated code for beta
  * Add support for `retrieve` method on resources `Entitlements.ActiveEntitlement` and `Entitlements.Feature`
  * Add support for `fees`, `losses`, `requirement_collection`, and `stripe_dashboard` on `AccountCreateParams.controller`
  * Add support for new values `bh_vat`, `kz_bin`, `ng_tin`, and `om_vat` on enums `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `hosted_voucher_url` on `PaymentIntent.next_action.multibanco_display_details`
  * Add support for `toggles` on `Terminal.Reader.action.collect_inputs.inputs[]` and `terminal.ReaderCollectInputsParams.inputs[]`
  * Add support for new values `email`, `numeric`, `phone`, and `text` on enum `terminal.ReaderCollectInputsParams.inputs[].type`
  * Add support for `email`, `numeric`, `phone`, and `text` on `Terminal.Reader.action.collect_inputs.inputs[]`

## 24.24.0-beta.1 - 2024-04-04
* [#1775](https://github.com/stripe/stripe-java/pull/1775) Update generated code for beta
  * Add support for `update` method on resource `Entitlements.Feature`
  * Add support for `risk_controls` on `AccountCreateParams`, `AccountUpdateParams`, and `Account`
  * Add support for `promotion_code` on `InvoiceAddLinesParams.lines[].discounts[]`, `InvoiceUpdateLinesParams.lines[].discounts[]`, `QuoteCreateParams.line_items[].discounts[]`, `QuoteCreateParams.lines[].actions[].add_discount`, `QuoteCreateParams.phases[].line_items[].discounts[]`, `QuoteUpdateParams.line_items[].discounts[]`, `QuoteUpdateParams.lines[].actions[].add_discount`, and `QuoteUpdateParams.phases[].line_items[].discounts[]`

## 24.23.0-beta.1 - 2024-03-28
* [#1771](https://github.com/stripe/stripe-java/pull/1771) Update generated code for beta
  * Add support for `financial_account_transactions`, `financial_account`, `issuing_card`, and `issuing_cards_list` on `AccountSessionCreateParams.components`
  * Remove support for `subscription_billing_cycle_anchor`, `subscription_cancel_at_period_end`, `subscription_cancel_at`, `subscription_cancel_now`, `subscription_default_tax_rates`, `subscription_items`, `subscription_prebilling`, `subscription_proration_behavior`, `subscription_proration_date`, `subscription_resume_at`, `subscription_start_date`, and `subscription_trial_end` on `InvoiceCreatePreviewParams`

## 24.22.0-beta.1 - 2024-03-21
* [#1766](https://github.com/stripe/stripe-java/pull/1766) Update generated code for beta
  * Add support for new resources `Entitlements.ActiveEntitlementSummary` and `Entitlements.ActiveEntitlement`
  * Add support for `list` method on resource `ActiveEntitlement`
  * Add support for `mobilepay` on `ConfirmationToken.payment_method_preview` and `ConfirmationTokenCreateParams.payment_method_data`
  * Add support for new value `mobilepay` on enum `ConfirmationTokenCreateParams.payment_method_data.type`
  * Add support for `use_stripe_sdk` on `ConfirmationToken`
  * Remove support for `payment_method` on `ConfirmationToken`
  * Add support for `metadata` on `Entitlements.Feature` and `entitlements.FeatureCreateParams`
  * Add support for `active` on `Entitlements.Feature`
  * Add support for new value `entitlements.active_entitlement_summary.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
  * Remove support for value `customer.entitlement_summary.updated` from enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 24.21.0-beta.1 - 2024-03-14
* [#1765](https://github.com/stripe/stripe-java/pull/1765) Update generated code for beta
  * Add support for new resources `Billing.MeterEventAdjustment`, `Billing.MeterEvent`, and `Billing.Meter`
  * Add support for `create`, `deactivate`, `list`, `reactivate`, `retrieve`, and `update` methods on resource `Meter`
  * Add support for `create` method on resources `MeterEventAdjustment` and `MeterEvent`
  * Add support for `create` test helper method on resource `ConfirmationToken`
  * Add support for `add_lines`, `remove_lines`, and `update_lines` methods on resource `Invoice`
  * Add support for `multibanco` on `ConfirmationToken.payment_method_preview`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, `PaymentMethodConfiguration`, `PaymentMethodCreateParams`, `PaymentMethod`, `Refund.destination_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new value `multibanco` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `second_line` on `Issuing.PhysicalBundle.features`
  * Add support for new value `multibanco` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for `multibanco_display_details` on `PaymentIntent.next_action`
  * Add support for `meter` on `PlanCreateParams`, `Plan`, `Price.recurring`, `PriceCreateParams.recurring`, and `PriceListParams.recurring`

## 24.20.0-beta.1 - 2024-03-07
* [#1757](https://github.com/stripe/stripe-java/pull/1757) Update generated code for beta
  * Add support for new value `billing_period_end` on enums `QuoteCreateParams.lines[].ends_at.type` and `QuoteUpdateParams.lines[].ends_at.type`

## 24.19.0-beta.1 - 2024-02-29
* [#1752](https://github.com/stripe/stripe-java/pull/1752) Add helper for setting beta versions
* [#1751](https://github.com/stripe/stripe-java/pull/1751) Update generated code for beta
  * Remove support for resource `Entitlements.Event`
  * Remove support for `quantity` and `type` on `Entitlements.Feature` and `entitlements.FeatureCreateParams`
  * Add support for `livemode` on `Issuing.PersonalizationDesign`
  * Add support for `application_fee_amount`, `description`, `metadata`, and `transfer_data` on `PaymentIntentDecrementAuthorizationParams`
  * Add support for `enable_customer_cancellation` on `Terminal.Reader.action.collect_payment_method.collect_config` and `terminal.ReaderCollectPaymentMethodParams.collect_config`

## 24.18.0-beta.1 - 2024-02-22
* [#1749](https://github.com/stripe/stripe-java/pull/1749) Update generated code for beta

## 24.17.0-beta.1 - 2024-02-16
* [#1746](https://github.com/stripe/stripe-java/pull/1746) Update generated code for beta
  * Add support for `payto` and `twint` payment methods across the API
  * Add support for `decrement_authorization` method on resource `PaymentIntent`
  * Add support for `decremental_authorization` on `Charge.payment_method_details.card`
  * Add support for `display_brand` on `ConfirmationToken.payment_method_preview.card`
  * Add support for new value `no_voec` on enums `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, and `OrderUpdateParams.tax_details.tax_ids[].type`
  * Add support for `request_decremental_authorization` on `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`

## 24.16.0-beta.1 - 2024-02-08
* [#1743](https://github.com/stripe/stripe-java/pull/1743) Update generated code for beta
  * Add support for `payment_method_options` on `ConfirmationToken`

## 24.15.0-beta.1 - 2024-02-01
* [#1731](https://github.com/stripe/stripe-java/pull/1731) Beta: report usage of raw_request
* [#1741](https://github.com/stripe/stripe-java/pull/1741) Update generated code for beta
  * Add support for new resources `Entitlements.Event` and `Entitlements.Feature`
  * Add support for `create` method on resource `Event`
  * Add support for `create` and `list` methods on resource `Feature`
  * Add support for `swish` on `ConfirmationToken.payment_method_preview`
  * Add support for `account_tax_ids` on `InvoiceCreatePreviewParams.schedule_details.phases[].invoice_settings`, `InvoiceUpcomingLinesParams.schedule_details.phases[].invoice_settings`, and `InvoiceUpcomingParams.schedule_details.phases[].invoice_settings`
  * Add support for `feature` on `Product.features[]`, `ProductCreateParams.features[]`, and `ProductUpdateParams.features[]`
  * Add support for new value `customer.entitlement_summary.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 24.14.0-beta.1 - 2024-01-25
* [#1735](https://github.com/stripe/stripe-java/pull/1735) Update generated code for beta
  * Add support for `create_preview` method on resource `Invoice`
  * Add support for `charged_off_at` on `Capital.FinancingOffer`
  * Add support for new values `disabled` and `enabled` on enums `CustomerSessionCreateParams.components.payment_element.features.payment_method_remove`, `CustomerSessionCreateParams.components.payment_element.features.payment_method_save`, `CustomerSessionCreateParams.components.payment_element.features.payment_method_set_as_default`, and `CustomerSessionCreateParams.components.payment_element.features.payment_method_update`
  * Remove support for values `auto` and `never` from enums `CustomerSessionCreateParams.components.payment_element.features.payment_method_remove`, `CustomerSessionCreateParams.components.payment_element.features.payment_method_save`, `CustomerSessionCreateParams.components.payment_element.features.payment_method_set_as_default`, and `CustomerSessionCreateParams.components.payment_element.features.payment_method_update`
  * Add support for `enhanced_evidence` on `Dispute.evidence` and `DisputeUpdateParams.evidence`
  * Add support for `enhanced_eligibility_types` on `Dispute`
  * Add support for `enhanced_eligibility` on `Dispute.evidence_details`
  * Add support for `promotion_code` on `InvoiceUpcomingLinesParams.schedule_details.amendments[].discount_actions[].add`, `InvoiceUpcomingLinesParams.schedule_details.amendments[].discount_actions[].remove`, `InvoiceUpcomingLinesParams.schedule_details.amendments[].discount_actions[].set`, `InvoiceUpcomingLinesParams.schedule_details.amendments[].item_actions[].add.discounts[]`, `InvoiceUpcomingLinesParams.schedule_details.amendments[].item_actions[].set.discounts[]`, `InvoiceUpcomingLinesParams.schedule_details.phases[].add_invoice_items[].discounts[]`, `InvoiceUpcomingLinesParams.schedule_details.phases[].discounts[]`, `InvoiceUpcomingLinesParams.schedule_details.phases[].items[].discounts[]`, `InvoiceUpcomingLinesParams.subscription_details.items[].discounts[]`, `InvoiceUpcomingLinesParams.subscription_items[].discounts[]`, `InvoiceUpcomingParams.schedule_details.amendments[].discount_actions[].add`, `InvoiceUpcomingParams.schedule_details.amendments[].discount_actions[].remove`, `InvoiceUpcomingParams.schedule_details.amendments[].discount_actions[].set`, `InvoiceUpcomingParams.schedule_details.amendments[].item_actions[].add.discounts[]`, `InvoiceUpcomingParams.schedule_details.amendments[].item_actions[].set.discounts[]`, `InvoiceUpcomingParams.schedule_details.phases[].add_invoice_items[].discounts[]`, `InvoiceUpcomingParams.schedule_details.phases[].discounts[]`, `InvoiceUpcomingParams.schedule_details.phases[].items[].discounts[]`, `InvoiceUpcomingParams.subscription_details.items[].discounts[]`, `InvoiceUpcomingParams.subscription_items[].discounts[]`, `QuoteCreateParams.lines[].actions[].add_item.discounts[]`, `QuoteCreateParams.lines[].actions[].remove_discount`, `QuoteCreateParams.lines[].actions[].set_discounts[]`, `QuoteCreateParams.lines[].actions[].set_items[].discounts[]`, `QuoteCreateParams.phases[].discounts[]`, `QuoteLine.actions[].add_discount`, `QuoteLine.actions[].add_item.discounts[]`, `QuoteLine.actions[].remove_discount`, `QuoteLine.actions[].set_discounts[]`, `QuoteLine.actions[].set_items[].discounts[]`, `QuoteUpdateParams.lines[].actions[].add_item.discounts[]`, `QuoteUpdateParams.lines[].actions[].remove_discount`, `QuoteUpdateParams.lines[].actions[].set_discounts[]`, `QuoteUpdateParams.lines[].actions[].set_items[].discounts[]`, `QuoteUpdateParams.phases[].discounts[]`, `SubscriptionCreateParams.add_invoice_items[].discounts[]`, `SubscriptionCreateParams.discounts[]`, `SubscriptionCreateParams.items[].discounts[]`, `SubscriptionItemCreateParams.discounts[]`, `SubscriptionItemUpdateParams.discounts[]`, `SubscriptionSchedule.phases[].add_invoice_items[].discounts[]`, `SubscriptionSchedule.phases[].discounts[]`, `SubscriptionSchedule.phases[].items[].discounts[]`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].add`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].remove`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].set`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].add.discounts[]`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].set.discounts[]`, `SubscriptionScheduleCreateParams.phases[].add_invoice_items[].discounts[]`, `SubscriptionScheduleCreateParams.phases[].discounts[]`, `SubscriptionScheduleCreateParams.phases[].items[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].add_invoice_items[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].items[].discounts[]`, `SubscriptionUpdateParams.add_invoice_items[].discounts[]`, `SubscriptionUpdateParams.discounts[]`, and `SubscriptionUpdateParams.items[].discounts[]`

## 24.13.0-beta.1 - 2024-01-18
* [#1727](https://github.com/stripe/stripe-java/pull/1727) Trim event API version when matching
* [#1728](https://github.com/stripe/stripe-java/pull/1728) Beta: Stripe.rawRequest -> StripeClient.rawRequest
* [#1734](https://github.com/stripe/stripe-java/pull/1734) Update generated code for beta
  Release specs are identical.

## 24.12.0-beta.1 - 2024-01-12
* ⚠️ [#1717](https://github.com/stripe/stripe-java/pull/1717) Beta: RawApiRequest
  * ⚠️ Changed input parameters of `StripeResponseGetter.rawRequest(...)` -- new usage is `StripeResponseGetter.rawRequest(new RawApiRequest(...))`
* [#1713](https://github.com/stripe/stripe-java/pull/1713) Update generated code for beta
* [#1714](https://github.com/stripe/stripe-java/pull/1714) Update generated code for beta
  * Add support for `amount` on `ChargeCaptureParams.payment_details.flight.segments[]`, `ChargeUpdateParams.payment_details.flight.segments[]`, `PaymentIntentCaptureParams.payment_details.flight.segments[]`, `PaymentIntentConfirmParams.payment_details.flight.segments[]`, `PaymentIntentCreateParams.payment_details.flight.segments[]`, and `PaymentIntentUpdateParams.payment_details.flight.segments[]`
  * Add support for `number_of_rooms` and `room_class` on `ChargeCaptureParams.payment_details.lodging`, `ChargeUpdateParams.payment_details.lodging`, `PaymentIntentCaptureParams.payment_details.lodging`, `PaymentIntentConfirmParams.payment_details.lodging`, `PaymentIntentCreateParams.payment_details.lodging`, and `PaymentIntentUpdateParams.payment_details.lodging`
  * Add support for `buy_button` on `CustomerSession.components` and `CustomerSessionCreateParams.components`
  * Add support for new values `high_risk_industry`, `insufficient_margin_ratio`, `insufficient_operating_profit`, `insufficient_reserves`, `insufficient_time_in_network`, `lacking_cash_account`, and `poor_payment_history_with_platform` on enums `issuing.CreditUnderwritingRecordCorrectParams.decision.application_rejected.reasons[]` and `issuing.CreditUnderwritingRecordReportDecisionParams.decision.application_rejected.reasons[]`
  * Add support for new values `high_risk_industry`, `insufficient_margin_ratio`, `insufficient_operating_profit`, `insufficient_reserves`, `insufficient_time_in_network`, and `lacking_cash_account` on enums `issuing.CreditUnderwritingRecordCorrectParams.decision.credit_limit_decreased.reasons[]`, `issuing.CreditUnderwritingRecordCorrectParams.decision.credit_line_closed.reasons[]`, `issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams.decision.credit_limit_decreased.reasons[]`, and `issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams.decision.credit_line_closed.reasons[]`

## 24.11.0-beta.1 - 2024-01-04
* [#1713](https://github.com/stripe/stripe-java/pull/1713) Update generated code for beta
  * Updated stable APIs to the latest version

## 24.10.0-beta.1 - 2023-12-22
* [#1710](https://github.com/stripe/stripe-java/pull/1710) Update generated code for beta
  * Add support for `capital_financing_promotion` on `AccountSession.components` and `AccountSessionCreateParams.components`
  * Change type of `PaymentLink.subscription_data.invoice_settings` from `nullable(PaymentLinksResourceSubscriptionDataInvoiceSettings)` to `PaymentLinksResourceSubscriptionDataInvoiceSettings`
  * Add support for `ship_from_details` on `Tax.Calculation`, `Tax.Transaction`, and `tax.CalculationCreateParams`

## 24.9.0-beta.1 - 2023-12-14
* [#1706](https://github.com/stripe/stripe-java/pull/1706) Update generated code for beta
  * Add support for `preview_mode` and `subscription_details` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
  * Remove support for `subscription_trial_from_plan` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
  * Add support for `billing_behavior`, `end_behavior`, and `proration_behavior` on `InvoiceUpcomingLinesParams.schedule_details` and `InvoiceUpcomingParams.schedule_details`

## 24.8.0-beta.1 - 2023-12-08
* [#1703](https://github.com/stripe/stripe-java/pull/1703) Update generated code for beta
  * Add support for `retrieve` method on resource `FinancialConnections.Transaction`
  * Remove support for `issuing_card` and `issuing_cards_list` on `AccountSessionCreateParams.components`
  * Add support for `payment_method_remove`, `payment_method_save`, and `payment_method_set_as_default` on `CustomerSession.components.payment_element.features` and `CustomerSessionCreateParams.components.payment_element.features`
  * Remove support for `payment_method_detach` and `payment_method_set_as_customer_default` on `CustomerSession.components.payment_element.features` and `CustomerSessionCreateParams.components.payment_element.features`

## 24.7.0-beta.1 - 2023-11-30
* [#1695](https://github.com/stripe/stripe-java/pull/1695) Update generated code for beta

## 24.6.0-beta.1 - 2023-11-21
* [#1691](https://github.com/stripe/stripe-java/pull/1691) Update generated code for beta
  * Rename `receipient` to `recipient` beneath `PaymentDetails` on `Charge` and `PaymentIntent` APIs.
  * Add support for `components` on `CustomerSessionCreateParams` and `CustomerSession`

## 24.4.0-beta.1 - 2023-11-16
* [#1682](https://github.com/stripe/stripe-java/pull/1682) Update generated code for beta
  * Add support for `issuing_card` and `issuing_cards_list` on `AccountSessionCreateParams.components`
  * Add support for `event_details` and `subscription` on `ChargeCaptureParams.payment_details`, `ChargeUpdateParams.payment_details`, `PaymentIntent.payment_details`, `PaymentIntentCaptureParams.payment_details`, `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, and `PaymentIntentUpdateParams.payment_details`
  * Add support for `affiliate` and `delivery` on `ChargeCaptureParams.payment_details.car_rental`, `ChargeCaptureParams.payment_details.flight`, `ChargeCaptureParams.payment_details.lodging`, `ChargeUpdateParams.payment_details.car_rental`, `ChargeUpdateParams.payment_details.flight`, `ChargeUpdateParams.payment_details.lodging`, `PaymentIntent.payment_details.car_rental`, `PaymentIntentCaptureParams.payment_details.car_rental`, `PaymentIntentCaptureParams.payment_details.flight`, `PaymentIntentCaptureParams.payment_details.lodging`, `PaymentIntentConfirmParams.payment_details.car_rental`, `PaymentIntentConfirmParams.payment_details.flight`, `PaymentIntentConfirmParams.payment_details.lodging`, `PaymentIntentCreateParams.payment_details.car_rental`, `PaymentIntentCreateParams.payment_details.flight`, `PaymentIntentCreateParams.payment_details.lodging`, `PaymentIntentUpdateParams.payment_details.car_rental`, `PaymentIntentUpdateParams.payment_details.flight`, and `PaymentIntentUpdateParams.payment_details.lodging`
  * Add support for `drivers` on `ChargeCaptureParams.payment_details.car_rental`, `ChargeUpdateParams.payment_details.car_rental`, `PaymentIntent.payment_details.car_rental`, `PaymentIntentCaptureParams.payment_details.car_rental`, `PaymentIntentConfirmParams.payment_details.car_rental`, `PaymentIntentCreateParams.payment_details.car_rental`, and `PaymentIntentUpdateParams.payment_details.car_rental`
  * Add support for `passengers` on `ChargeCaptureParams.payment_details.flight`, `ChargeCaptureParams.payment_details.lodging`, `ChargeUpdateParams.payment_details.flight`, `ChargeUpdateParams.payment_details.lodging`, `PaymentIntentCaptureParams.payment_details.flight`, `PaymentIntentCaptureParams.payment_details.lodging`, `PaymentIntentConfirmParams.payment_details.flight`, `PaymentIntentConfirmParams.payment_details.lodging`, `PaymentIntentCreateParams.payment_details.flight`, `PaymentIntentCreateParams.payment_details.lodging`, `PaymentIntentUpdateParams.payment_details.flight`, and `PaymentIntentUpdateParams.payment_details.lodging`
  * Add support for `created` on `CustomerSession`

## 24.3.0-beta.1 - 2023-11-10
* [#1681](https://github.com/stripe/stripe-java/pull/1681) Update generated code for beta
  * Add support for `metadata` on `QuoteCreateParams.phases[]`, `QuotePhase`, and `QuoteUpdateParams.phases[]`
  * Add support for `last_reestimation_details` on `Quote.computed`
  * Add support for new value `quote.reestimate_failed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 24.2.0-beta.1 - 2023-11-02
* [#1678](https://github.com/stripe/stripe-java/pull/1678) Update generated code for beta
  * Add support for `attach_payment_intent` method on resource `Invoice`
  * Add support for `revolut_pay` on `ConfirmationToken.payment_method_preview`
  * Add support for `refunds` on `CreditNoteCreateParams`, `CreditNotePreviewLinesParams`, `CreditNotePreviewParams`, and `CreditNote`
  * Add support for `post_payment_amount` and `pre_payment_amount` on `CreditNote`
  * Add support for `schedule_details` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
  * Add support for `amounts_due` on `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
  * Add support for `payments` on `Invoice`
  * Add support for `created` on `Issuing.PersonalizationDesign`
  * Add support for `ending_before`, `limit`, and `starting_after` on `tax.RegistrationListParams`
  * Change type of `tax.RegistrationCreateParams.active_from` to `DateTime | 'now'`
  * Add support for new value `invoice.payment.overpaid` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 24.1.0-beta.2 - 2023-10-26
* [#1675](https://github.com/stripe/stripe-java/pull/1675) Update generated code for beta
  * Add support for new resource `Margin`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resource `Margin`
  * Add support for `subsellers` on `Order.payment.settings.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntent.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, `PaymentIntentUpdateParams.payment_method_options.paypal`, `SetupIntent.payment_method_options.paypal`, `SetupIntentConfirmParams.payment_method_options.paypal`, `SetupIntentCreateParams.payment_method_options.paypal`, `SetupIntentUpdateParams.payment_method_options.paypal`, and `checkout.SessionCreateParams.payment_method_options.paypal`
  * Add support for `default_margins` on `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
  * Add support for `total_margin_amounts` on `Invoice`
  * Add support for `margins` on `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, and `InvoiceItem`
  * Add support for new values `applicant_is_not_beneficial_owner`, `current_account_tier_ineligible`, `customer_requested_account_closure`, `dispute_rate_too_high`, and `invalid_business_license` on enums `issuing.CreditUnderwritingRecordCorrectParams.decision.credit_limit_decreased.reasons[]`, `issuing.CreditUnderwritingRecordCorrectParams.decision.credit_line_closed.reasons[]`, `issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams.decision.credit_limit_decreased.reasons[]`, and `issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams.decision.credit_line_closed.reasons[]`
  * Add support for new values `applicant_is_not_beneficial_owner`, `current_account_tier_ineligible`, `customer_requested_account_closure`, `dispute_rate_too_high`, and `invalid_business_license` on enums `issuing.CreditUnderwritingRecordCorrectParams.decision.application_rejected.reasons[]` and `issuing.CreditUnderwritingRecordReportDecisionParams.decision.application_rejected.reasons[]`
  * Remove support for values `change_in_financial_state`, `change_in_utilization_of_credit_line`, `decrease_in_income_to_expense_ratio`, `decrease_in_social_media_performance`, `exceeds_acceptable_platform_exposure`, `has_recent_credit_limit_increase`, `insufficient_credit_utilization`, `insufficient_usage_as_qualified_expenses`, and `poor_payment_history_with_platform` from enums `issuing.CreditUnderwritingRecordCorrectParams.decision.application_rejected.reasons[]` and `issuing.CreditUnderwritingRecordReportDecisionParams.decision.application_rejected.reasons[]`
  * Add support for `is_default` on `Issuing.PersonalizationDesign.preferences`, `issuing.PersonalizationDesignCreateParams.preferences`, `issuing.PersonalizationDesignListParams.preferences`, and `issuing.PersonalizationDesignUpdateParams.preferences`
  * Add support for `is_platform_default` on `Issuing.PersonalizationDesign.preferences` and `issuing.PersonalizationDesignListParams.preferences`
  * Remove support for `account_default` on `Issuing.PersonalizationDesign.preferences`, `issuing.PersonalizationDesignCreateParams.preferences`, `issuing.PersonalizationDesignListParams.preferences`, and `issuing.PersonalizationDesignUpdateParams.preferences`
  * Remove support for `platform_default` on `Issuing.PersonalizationDesign.preferences` and `issuing.PersonalizationDesignListParams.preferences`
  * Add support for `liability` on `PaymentLink.automatic_tax`, `PaymentLinkCreateParams.automatic_tax`, and `PaymentLinkUpdateParams.automatic_tax`
  * Add support for `issuer` on `PaymentLink.invoice_creation.invoice_data`, `PaymentLinkCreateParams.invoice_creation.invoice_data`, and `PaymentLinkUpdateParams.invoice_creation.invoice_data`
  * Add support for `invoice_settings` on `PaymentLink.subscription_data`, `PaymentLinkCreateParams.subscription_data`, and `PaymentLinkUpdateParams.subscription_data`

## 24.1.0-beta.1 - 2023-10-17
This release changes the pinned API version to `2023-10-16`.

* [#1673](https://github.com/stripe/stripe-java/pull/1673) Update generated code for beta
  - Update pinned API version to `2023-10-16`

## 23.11.0-beta.1 - 2023-10-16
* [#1669](https://github.com/stripe/stripe-java/pull/1669) Update generated code for beta

## 23.10.0-beta.1 - 2023-10-11
* [#1667](https://github.com/stripe/stripe-java/pull/1667) Update generated code for beta
  * Add support for new resources `AccountNotice` and `Issuing.CreditUnderwritingRecord`
  * Add support for `list`, `retrieve`, and `update` methods on resource `AccountNotice`
  * Add support for `correct`, `create_from_application`, `create_from_proactive_review`, `list`, `report_decision`, and `retrieve` methods on resource `CreditUnderwritingRecord`
  * Add support for new values `local_amusement_tax` and `state_communications_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
  * Add support for new values `account_notice.created` and `account_notice.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 23.9.0-beta.1 - 2023-10-05
* [#1666](https://github.com/stripe/stripe-java/pull/1666) Update generated code for beta
  Release specs are identical.
* [#1661](https://github.com/stripe/stripe-java/pull/1661) Update generated code for beta
  * Add support for `mark_draft` and `mark_stale` methods on resource `Quote`
  * Remove support for `draft_quote` and `mark_stale_quote` methods on resource `Quote`
  * Add support for `liability` on `Checkout.Session.automatic_tax` and `checkout.SessionCreateParams.automatic_tax`
  * Add support for `issuer` on `Checkout.Session.invoice_creation.invoice_data` and `checkout.SessionCreateParams.invoice_creation.invoice_data`
  * Add support for `invoice_settings` on `checkout.SessionCreateParams.subscription_data`
  * Add support for `personalization_design` on `issuing.CardListParams`
  * Add support for `allow_backdated_lines` on `QuoteCreateParams`, `QuoteUpdateParams`, and `Quote`
  * Rename `previewInvoiceLines` to `listPreviewInvoiceLines ` on resource `Quote`

## 23.8.0-beta.1 - 2023-09-28
* [#1656](https://github.com/stripe/stripe-java/pull/1656) Update generated code for beta
  * Rename resources `Issuing.CardDesign` and `Issuing.CardBundle` to `Issuing.PersonalizationDesign` and `Issuing.PhysicalBundle`
  * Add support for new values `capital_financing_offer` and `capital_financing_reporting` on enum `AccountLinkCreateParams.type`
  * Add support for `features` on `AccountSession.components.payment_details`, `AccountSession.components.payments`, `AccountSession.components.payouts`, `AccountSessionCreateParams.components.account_onboarding`, `AccountSessionCreateParams.components.payment_details`, `AccountSessionCreateParams.components.payments`, and `AccountSessionCreateParams.components.payouts`
  * Add support for `reason` on `Event`

## 23.7.0-beta.1 - 2023-09-21
* [#1653](https://github.com/stripe/stripe-java/pull/1653) Update generated code for beta
  * Remove support for `customer` on `ConfirmationToken`
  * Add support for `issuer` on `InvoiceCreateParams`, `InvoiceUpcomingLinesParams`, `InvoiceUpcomingParams`, `InvoiceUpdateParams`, `Invoice`, `Quote.invoice_settings`, `QuoteCreateParams.invoice_settings`, `QuoteUpdateParams.invoice_settings`, `SubscriptionSchedule.default_settings.invoice_settings`, `SubscriptionSchedule.phases[].invoice_settings`, `SubscriptionScheduleCreateParams.default_settings.invoice_settings`, `SubscriptionScheduleCreateParams.phases[].invoice_settings`, `SubscriptionScheduleUpdateParams.default_settings.invoice_settings`, and `SubscriptionScheduleUpdateParams.phases[].invoice_settings`
  * Add support for `on_behalf_of` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
  * Add support for `liability` on `Invoice.automatic_tax`, `InvoiceCreateParams.automatic_tax`, `InvoiceUpcomingLinesParams.automatic_tax`, `InvoiceUpcomingParams.automatic_tax`, `InvoiceUpdateParams.automatic_tax`, `Quote.automatic_tax`, `QuoteCreateParams.automatic_tax`, `QuoteUpdateParams.automatic_tax`, `Subscription.automatic_tax`, `SubscriptionCreateParams.automatic_tax`, `SubscriptionSchedule.default_settings.automatic_tax`, `SubscriptionSchedule.phases[].automatic_tax`, `SubscriptionScheduleCreateParams.default_settings.automatic_tax`, `SubscriptionScheduleCreateParams.phases[].automatic_tax`, `SubscriptionScheduleUpdateParams.default_settings.automatic_tax`, `SubscriptionScheduleUpdateParams.phases[].automatic_tax`, and `SubscriptionUpdateParams.automatic_tax`
  * Change type of `issuing.CardDesignUpdateParams.carrier_text` from `carrier_text_param` to `emptyStringable(carrier_text_param)`
  * Add support for `invoice_settings` on `SubscriptionCreateParams` and `SubscriptionUpdateParams`

## 23.6.0-beta.1 - 2023-09-14
* [#1652](https://github.com/stripe/stripe-java/pull/1652) Update generated code for beta
  * Add support for new resource `ConfirmationToken`
  * Add support for `retrieve` method on resource `ConfirmationToken`
  * Add support for `create` method on resource `Issuing.CardDesign`
  * Add support for `reject_testmode` test helper method on resource `Issuing.CardDesign`
  * Add support for `features` on `Issuing.CardBundle`
  * Add support for `preferences` on `Issuing.CardDesign`, `issuing.CardDesignListParams`, and `issuing.CardDesignUpdateParams`
  * Remove support for `preference` on `Issuing.CardDesign`, `issuing.CardDesignListParams`, and `issuing.CardDesignUpdateParams`
  * Add support for `card_bundle` on `issuing.CardDesignUpdateParams`
  * Add support for `card_logo` and `carrier_text` on `Issuing.CardDesign` and `issuing.CardDesignUpdateParams`
  * Change type of `issuing.CardDesignUpdateParams.lookup_key` and `issuing.CardDesignUpdateParams.name` from `string` to `emptyStringable(string)`
  * Add support for `rejection_reasons` on `Issuing.CardDesign`
  * Add support for `confirmation_token` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `SetupIntentConfirmParams`, and `SetupIntentCreateParams`
  * Add support for new value `issuing_card_design.rejected` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 23.5.0-beta.1 - 2023-09-07
* [#1648](https://github.com/stripe/stripe-java/pull/1648) Update generated code for beta
  Release specs are identical.
* [#1644](https://github.com/stripe/stripe-java/pull/1644) Update generated code for beta
  * Remove support for `submit_card` test helper method on resource `Issuing.Card`
  * Add support for `card_design` on `issuing.CardUpdateParams`
  * Add support for new value `platform_default` on enum `issuing.CardDesignListParams.preference`

## 23.4.0-beta.1 - 2023-08-31
* [#1639](https://github.com/stripe/stripe-java/pull/1639) Update generated code for beta
  * Rename `Quote.list_preview_invoices` to `QuotePreviewInvoice.list` and `Quote.list_preview_subscription_schedules` to `QuotePreviewSchedule.list`
  * Add support for `tax_forms` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
  * Add support for `components` on `AccountSessionCreateParams` and `AccountSession`

## 23.0.0-beta.1 - 2023-08-24
This release changes the pinned API version to `2023-08-16`.

* [#1630](https://github.com/stripe/stripe-java/pull/1630) Update generated code for beta
  * Add support for new resources `QuotePreviewInvoice` and `QuotePreviewSchedule`
  * Remove support for `applies_to` on `Invoice` and `SubscriptionSchedule`
  * Add support for `cl`, `co`, `id`, `kr`, `mx`, `my`, `sa`, `th`, `tr`, and `vn` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
  * Remove support for `hk` on `Tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
  * Add support for new value `quote.accept_failed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.32.0-beta.1 - 2023-08-10
* [#1624](https://github.com/stripe/stripe-java/pull/1624) Update generated code for beta
  * Add support for `paypal` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
  * Add support for new value `quote.accept_failed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.31.0-beta.1 - 2023-08-03
* [#1621](https://github.com/stripe/stripe-java/pull/1621) Update generated code for beta
  * Add support for `submit_card` test helper method on resource `Issuing.Card`
  * Add support for `address_validation` on `Issuing.Card.shipping` and `issuing.CardCreateParams.shipping`
  * Add support for `shipping` on `issuing.CardUpdateParams`
  * Change type of `OrderCreateParams.line_items[].product_data.description`, `OrderCreateParams.line_items[].product_data.tax_code`, `OrderCreateParams.shipping_details.phone`, `OrderUpdateParams.description`, `OrderUpdateParams.line_items[].product_data.description`, `OrderUpdateParams.line_items[].product_data.tax_code`, `OrderUpdateParams.shipping_details.phone`, `PaymentMethodConfigurationListParams.application`, and `QuoteUpdateParams.subscription_data_overrides[].description` from `string` to `emptyStringable(string)`
  * Add support for `reason` on `QuoteMarkStaleQuoteParams`
  * Add support for `marked_stale` on `Quote.status_details.stale.last_reason`
  * Change `tax.FormListParams.payee.type` to be optional

## 22.30.0-beta.1 - 2023-07-27
* [#1617](https://github.com/stripe/stripe-java/pull/1617) Update generated code for beta
  * Updated stable APIs to the latest version

## 22.28.0-beta.1 - 2023-07-13
* [#1602](https://github.com/stripe/stripe-java/pull/1602) Update generated code for beta
* [#1605](https://github.com/stripe/stripe-java/pull/1605) Update generated code for beta
  * Add support for new resource `PaymentMethodConfiguration`
  * Add support for `create`, `list`, `retrieve`, and `update` methods on resource `PaymentMethodConfiguration`
  * Add support for `payment_method_configuration` on `PaymentIntentCreateParams` and `PaymentIntentUpdateParams`
  * Add support for `payment_method_configuration_details` on `PaymentIntent`

## 22.26.0-beta.1 - 2023-06-29
* [#1598](https://github.com/stripe/stripe-java/pull/1598) Update generated code for beta
  * Add support for `metadata` on `Invoice.subscription_details`
  * Add support for new values `ad_nrt`, `ar_cuit`, `bo_tin`, `cn_tin`, `co_nit`, `cr_tin`, `do_rcn`, `ec_ruc`, `pe_ruc`, `rs_pib`, `sv_nit`, `uy_ruc`, `ve_rif`, and `vn_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`

## 22.25.0-beta.1 - 2023-06-22
* [#1590](https://github.com/stripe/stripe-java/pull/1590) Update generated code for beta
  * Add support for new resource `CustomerSession`
  * Add support for `create` method on resource `CustomerSession`
  * Change type of `Tax.Registration.country_options.us.type` and `TaxRegistrationCreateParams.country_options.us.type` from `literal('state_sales_tax')` to `enum('local_lease_tax'|'state_sales_tax')`

## 22.24.0-beta.2 - 2023-06-15
* [#1580](https://github.com/stripe/stripe-java/pull/1580) Update generated code for beta
* [#1587](https://github.com/stripe/stripe-java/pull/1587) Update generated code for beta
  * Add support for `payment_details` on `ChargeCaptureParams`, `ChargeUpdateParams`, `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, and `PaymentIntent`
  * Add support for `statement_details` on `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`

## 22.24.0-beta.1 - 2023-06-08
* [#1576](https://github.com/stripe/stripe-java/pull/1576) Update generated code for beta
  * Updated stable APIs to the latest version

## 22.23.0-beta.1 - 2023-06-01
* [#1553](https://github.com/stripe/stripe-java/pull/1553) Introduce Stripe.rawRequest as a canonical way to request APIs without definitions
  * Please refer to the [Custom Requests README section](https://github.com/stripe/stripe-java/tree/beta#custom-requests) for usage instructions.
* [#1575](https://github.com/stripe/stripe-java/pull/1575) Update generated code for beta
  * Add support for `subscription_details` on `Invoice`
  * Add support for new values `aba` and `swift` on enums `OrderCreateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.requested_address_types[]` and `OrderUpdateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`
  * Add support for new value `us_bank_transfer` on enums `OrderCreateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.type` and `OrderUpdateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.type`
  * Add support for `set_pause_collection` on `QuoteCreateParams.lines[]`, `QuoteLine`, `QuoteUpdateParams.lines[]`, and `SubscriptionScheduleAmendParams.amendments[]`
  * Add support for new value `pause_collection_start` on enums `QuoteCreateParams.subscription_data.bill_on_acceptance.bill_from.type`, `QuoteCreateParams.subscription_data_overrides[].bill_on_acceptance.bill_from.type`, `QuoteUpdateParams.subscription_data.bill_on_acceptance.bill_from.type`, and `QuoteUpdateParams.subscription_data_overrides[].bill_on_acceptance.bill_from.type`
  * Add support for `pause_collection` on `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.phases[]`, and `SubscriptionScheduleUpdateParams.phases[]`
  * Add support for `local_amusement_tax` on `Tax.Registration.country_options.us` and `TaxRegistrationCreateParams.country_options.us`
  * Remove support for `locations` on `Tax.Settings` and `TaxSettingsUpdateParams`
  * Add support for new values `customer.subscription.collection_paused` and `customer.subscription.collection_resumed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.22.0-beta.1 - 2023-05-25
* [#1565](https://github.com/stripe/stripe-java/pull/1565) Update generated code for beta

## 22.21.0-beta.1 - 2023-05-19
* [#1562](https://github.com/stripe/stripe-java/pull/1562) Update generated code for beta
  * Add support for `subscribe` and `unsubscribe` methods on resource `FinancialConnections.Account`
  * Add support for `next_refresh_available_at` on `FinancialConnections.Account.balance_refresh`, `FinancialConnections.Account.inferred_balances_refresh`, `FinancialConnections.Account.ownership_refresh`, and `FinancialConnections.Account.transaction_refresh`
  * Add support for `status_details` and `status` on `Tax.Settings`
  * Add support for new value `tax.settings.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.20.0-beta.1 - 2023-05-11
* [#1561](https://github.com/stripe/stripe-java/pull/1561) Update generated code for beta
  * Add support for `payer_email`, `payer_name`, and `seller_protection` on `Charge.payment_method_details.paypal`
  * Add support for `capture_method`, `preferred_locale`, `reference_id`, and `setup_future_usage` on `CheckoutSessionCreateParams.payment_method_options.paypal`
  * Add support for `reference` on `CheckoutSessionCreateParams.payment_method_options.paypal`, `Order.payment.settings.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntent.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
  * Add support for `risk_correlation_id` on `CheckoutSessionCreateParams.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
  * Remove support for `billing_agreement_id` and `currency` on `CheckoutSessionCreateParams.payment_method_options.paypal`
  * Add support for `fingerprint`, `payer_id`, and `verified_email` on `Mandate.payment_method_details.paypal` and `PaymentMethod.paypal`
  * Add support for `taxability_reason` and `taxable_amount` on `Order.shipping_cost.taxes[]`, `Order.total_details.breakdown.taxes[]`, and `QuotePhase.total_details.breakdown.taxes[]`
  * Add support for `head_office` on `Tax.Settings` and `TaxSettingsUpdateParams`

## 22.19.0-beta.1 - 2023-05-04
* [#1554](https://github.com/stripe/stripe-java/pull/1554) Update generated code for beta
  * Updated stable APIs to the latest version

## 22.18.0-beta.1 - 2023-04-27
* [#1550](https://github.com/stripe/stripe-java/pull/1550) Update generated code for beta
  * Add support for `billing_cycle_anchor` and `proration_behavior` on `CheckoutSessionCreateParams.subscription_data`
  * Add support for `terminal_id` on `Issuing.Authorization.merchant_data` and `Issuing.Transaction.merchant_data`
  * Add support for `metadata` on `PaymentIntentCaptureParams`
  * Add support for `checks` on `SetupAttempt.payment_method_details.card`
  * Add support for `tax_breakdown` on `Tax.Calculation.shipping_cost` and `Tax.Transaction.shipping_cost`
  * Change type of `TaxRegistrationCreateParams.active_from`, `TaxRegistrationUpdateParams.active_from`, and `TaxRegistrationUpdateParams.expires_at` from `longInteger` to `longInteger | literal('now')`

## 22.17.0-beta.3 - 2023-04-20
* [#1548](https://github.com/stripe/stripe-java/pull/1548) Update generated code for beta
  * Add support for `zip` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
  * Add support for `country_options` on `Tax.Registration` and `TaxRegistrationCreateParams`
  * Remove support for `state` and `type` on `Tax.Registration` and `TaxRegistrationCreateParams`

## 22.17.0-beta.2 - 2023-04-13
* [#1545](https://github.com/stripe/stripe-java/pull/1545) Update generated code for beta
  * Add support for `collect_payment_method` and `confirm_payment_intent` methods on resource `Terminal.Reader`
  * Add support for `paypal_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `collect_payment_method` and `confirm_payment_intent` on `Terminal.Reader.action`
  * Add support for `stripe_account` on `Terminal.Reader.action.process_payment_intent` and `Terminal.Reader.action.refund_payment`
  * Add support for new value `terminal.reader.action_updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.17.0-beta.1 - 2023-04-06
* [#1539](https://github.com/stripe/stripe-java/pull/1539) Update generated code for beta
  * Add support for `treasury_transaction` on `CapitalFinancingTransactionListParams`
  * Add support for `transaction` on `Capital.FinancingTransaction.details`
  * Change `IssuingCardholderCreateParams.type` to be optional
  * Add support for `country` on `PaymentMethod.link`
  * Add support for `status_details` on `PaymentMethod.us_bank_account`

## 22.16.0-beta.1 - 2023-03-30
* [#1537](https://github.com/stripe/stripe-java/pull/1537) Update generated code
  * Add support for new value `ioss` on enum `TaxRegistrationCreateParams.type`
  * Change `TerminalReaderCollectInputsParams.inputs[].custom_text.description` to be optional

## 22.15.0-beta.1 - 2023-03-23
* [#1535](https://github.com/stripe/stripe-java/pull/1535) Update generated code for beta (new)
  * Add support for new resources `Tax.CalculationLineItem` and `Tax.TransactionLineItem`
  * Add support for `collect_inputs` method on resource `Terminal.Reader`
  * Add support for `financing_offer` on `Capital.FinancingSummary`
  * Add support for new value `link` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for `fx_rate` on `Checkout.Session.currency_conversion`
  * Add support for new value `link` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for `automatic_payment_methods` on `SetupIntentCreateParams` and `SetupIntent`
  * Remove support for `preview` on `TaxCalculationCreateParams`
  * Change type of `Tax.Calculation.line_items[]` from `$LineItem` to `$Tax.CalculationLineItem`
  * Change type of `Tax.Transaction.line_items[]` from `$LineItem` to `$Tax.TransactionLineItem`
  * Add support for `collect_inputs` on `Terminal.Reader.action`

## 22.14.0-beta.1 - 2023-03-16
* [#1528](https://github.com/stripe/stripe-java/pull/1528) API Updates
  * Add support for `create_from_calculation` method on resource `Tax.Transaction`
  * Add support for `paypal` on `Mandate.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
  * Add support for new value `automatic_async` on enums `OrderCreateParams.payment.settings.payment_method_options.afterpay_clearpay.capture_method`, `OrderCreateParams.payment.settings.payment_method_options.card.capture_method`, `OrderUpdateParams.payment.settings.payment_method_options.afterpay_clearpay.capture_method`, and `OrderUpdateParams.payment.settings.payment_method_options.card.capture_method`
  * Add support for `setup_future_usage` on `Order.payment.settings.payment_method_options.paypal`, `OrderCreateParams.payment.settings.payment_method_options.paypal`, `OrderUpdateParams.payment.settings.payment_method_options.paypal`, `PaymentIntent.payment_method_options.paypal`, `PaymentIntentConfirmParams.payment_method_options.paypal`, `PaymentIntentCreateParams.payment_method_options.paypal`, and `PaymentIntentUpdateParams.payment_method_options.paypal`
  * Remove support for `applies_to` on `QuotePreviewInvoiceLinesParams`
  * Add support for `shipping_cost` on `Tax.Calculation`, `Tax.Transaction`, `TaxCalculationCreateParams`, and `TaxTransactionCreateReversalParams`
  * Add support for `tax_breakdown` on `Tax.Calculation`
  * Remove support for `tax_summary` on `Tax.Calculation`

## 22.13.0-beta.1 - 2023-03-09
* [#1524](https://github.com/stripe/stripe-java/pull/1524) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Remove support for `list_transactions` method on resource `Tax.Transaction`
  * Add support for `amendment_start` and `timestamp` on `SubscriptionScheduleAmendParams.prebilling[].bill_from`
  * Change type of `SubscriptionScheduleAmendParams.prebilling[].bill_from.type` from `literal('now')` to `enum('amendment_start'|'now'|'timestamp')`
  * Add support for `tax_behavior` on `Tax.Settings.defaults` and `TaxSettingsUpdateParams.defaults`

## 22.12.0-beta.2 - 2023-03-03
* [#1522](https://github.com/stripe/stripe-java/pull/1522) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `update_behavior` on `Subscription.prebilling`, `SubscriptionCreateParams.prebilling`, `SubscriptionSchedule.prebilling`, `SubscriptionScheduleCreateParams.prebilling`, `SubscriptionScheduleUpdateParams.prebilling`, and `SubscriptionUpdateParams.prebilling`
  * Add support for `prebilling` on `SubscriptionScheduleAmendParams`
  * Add support for `taxability_override` on `Tax.Calculation.customer_details`, `Tax.Transaction.customer_details`, and `TaxCalculationCreateParams.customer_details`
  * Add support for `tax_summary` on `Tax.Calculation`
  * Remove support for `tax_breakdown` on `Tax.Calculation`

## 22.12.0-beta.1 - 2023-03-02
* [#1521](https://github.com/stripe/stripe-java/pull/1521) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for new resources `Issuing.CardBundle` and `Issuing.CardDesign`
  * Add support for `list` and `retrieve` methods on resource `CardBundle`
  * Add support for `list`, `retrieve`, and `update` methods on resource `CardDesign`
  * Remove support for `controller` on `AccountUpdateParams`
  * Add support for `card_design` on `Issuing.Card` and `IssuingCardCreateParams`
  * Add support for new values `issuing_card_design.activated`, `issuing_card_design.deactivated`, and `issuing_card_design.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.11.0-beta.1 - 2023-02-23
* [#1518](https://github.com/stripe/stripe-java/pull/1518) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `manual_entry` on `Checkout.Session.payment_method_options.us_bank_account.financial_connections`, `PaymentIntent.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntent.payment_method_options.us_bank_account.financial_connections`, `SetupIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, and `SetupIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`
  * Change `TaxTransactionCreateParams.reference` to be required
  * Add support for new values `capital.financing_offer.accepted`, `capital.financing_offer.canceled`, `capital.financing_offer.created`, `capital.financing_offer.expired`, `capital.financing_offer.fully_repaid`, `capital.financing_offer.paid_out`, `capital.financing_offer.rejected`, and `capital.financing_offer.replacement_created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.10.0-beta.1 - 2023-02-16
* [#1516](https://github.com/stripe/stripe-java/pull/1516) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `currency_conversion` on `Checkout.Session`
  * Add support for `limits` on `FinancialConnections.Session` and `FinancialConnectionsSessionCreateParams`
  * Remove support for `enabled` on `FinancialConnectionsSessionCreateParams.manual_entry`
  * Remove support for `reference` on `Tax.Calculation` and `TaxCalculationCreateParams`
  * Add support for `reference` on `TaxTransactionCreateParams`

## 22.9.0-beta.2 - 2023-02-15
* [#1515](https://github.com/stripe/stripe-java/pull/1515) Fix inferred balance beta

## 22.9.0-beta.1 - 2023-02-02
* [#1513](https://github.com/stripe/stripe-java/pull/1513) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `account_number` on `PaymentMethod.us_bank_account`
  * Add support for `inferred_balances_refresh`, `subscriptions`, and `transaction_refresh` on `FinancialConnections.Account`
  * Add support for `list` method on resource `Transaction`
  * Add support for `manual_entry` on `FinancialConnections.Session` and `FinancialConnectionsSessionCreateParams`
  * Add support for `prefetch` on `.payment_method_options.us_bank_account.financial_connections` across many resources and methods
  * Add support for `status_details` and `status` on `FinancialConnections.Session`
  * Add support for new resource `FinancialConnections.Transaction`
  * Add support for new values `customer.subscription.paused`, `customer.subscription.resumed`, `financial_connections.account.refreshed_inferred_balances`, `financial_connections.account.refreshed_ownership`, `financial_connections.account.refreshed_transactions`, and `financial_connections.session.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
  * Add support for new values `inferred_balances` and `transactions` on enum `FinancialConnectionsAccountRefreshParams.features[]`
  * Change `CheckoutSessionCreateParams.payment_method_options.paypal.currency`, `IssuingCardholderCreateParams.individual.first_name`, `IssuingCardholderCreateParams.individual.last_name`, `IssuingCardholderUpdateParams.individual.first_name`, and `IssuingCardholderUpdateParams.individual.last_name` to be optional
  * Remove support for `id` on `QuoteCreateParams.lines[].starts_at.line_ends_at`

## 22.8.0-beta.1 - 2023-01-26
* [#1511](https://github.com/stripe/stripe-java/pull/1511) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `list_transactions` method on resource `Tax.Transaction`
  * Add support for `billing_agreement_id` on `CheckoutSessionCreateParams.payment_method_options.paypal`
  * Change type of `QuoteUpdateParams.subscription_data_overrides` from `array(create_specs)` to `emptyStringable(array(update_specs))`

## 22.7.0-beta.2 - 2023-01-20
* [#1509](https://github.com/stripe/stripe-java/pull/1509) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Adds support for `set_schedule_end` on `Quote`.

## 22.7.0-beta.1 - 2023-01-19
* [#1508](https://github.com/stripe/stripe-java/pull/1508) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `Tax.Settings` resource.

## 22.6.0-beta.2 - 2023-01-12
* [#1506](https://github.com/stripe/stripe-java/pull/1506) API Updates for beta branch
  * Add support for new resource `Tax.Registration`
  * Add support for `create`, `list`, and `update` methods on resource `Registration`
  * Add support for `controller` on `AccountCreateParams` and `AccountUpdateParams`
  * Add support for `application` and `dashboard` on `Account.controller`
  * Remove support for `timestamp` on `QuoteLine.actions[].add_discount.discount_end`
  * Remove support for `index` on `QuoteLine.actions[].add_item.discounts[]`, `QuoteLine.actions[].remove_discount`, `QuoteLine.actions[].set_discounts[]`, `QuoteLine.actions[].set_items[].discounts[]`, `SubscriptionSchedule.phases[].add_invoice_items[].discounts[]`, `SubscriptionSchedule.phases[].discounts[]`, and `SubscriptionSchedule.phases[].items[].discounts[]`
  * Add support for new values `quote.accepting`, `quote.reestimated`, and `quote.stale` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

  * Updated stable APIs to the latest version

## 22.6.0-beta.1 - 2023-01-05
* [#1504](https://github.com/stripe/stripe-java/pull/1504) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `mark_stale_quote` method on resource `Quote`
  * Add support for `duration` and `line_ends_at` on `QuoteCreateParams.subscription_data.bill_on_acceptance.bill_until`, `QuoteCreateParams.subscription_data_overrides[].bill_on_acceptance.bill_until`, `QuoteUpdateParams.subscription_data.bill_on_acceptance.bill_until`, and `QuoteUpdateParams.subscription_data_overrides[].bill_on_acceptance.bill_until`
  * Remove support for `line_starts_at` on `QuoteCreateParams.subscription_data.bill_on_acceptance.bill_until`, `QuoteCreateParams.subscription_data_overrides[].bill_on_acceptance.bill_until`, `QuoteUpdateParams.subscription_data.bill_on_acceptance.bill_until`, and `QuoteUpdateParams.subscription_data_overrides[].bill_on_acceptance.bill_until`
  * Add support for `metadata` on `Terminal.Reader.action.refund_payment` and `TerminalReaderRefundPaymentParams`

## 22.5.0-beta.1 - 2022-12-22
* [#1498](https://github.com/stripe/stripe-java/pull/1498) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Move `TaxCalculation` and `TaxTransaction` to `Tax.Calculation` and `Tax.Transaction`.

## 22.4.0-beta.1 - 2022-12-15
* [#1493](https://github.com/stripe/stripe-java/pull/1493) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for new resources `QuoteLine`, `TaxCalculation`, and `TaxTransaction`
  * Add support for `create` and `list_line_items` methods on resource `TaxCalculation`
  * Add support for `create_reversal`, `create`, and `retrieve` methods on resource `TaxTransaction`

## 22.3.0-beta.1 - 2022-12-08
This release changes the pinned API version to `2022-11-15`.

* [#1488](https://github.com/stripe/stripe-java/pull/1488) API Updates for beta branch
  * Updated stable APIs to the latest version
* [#1485](https://github.com/stripe/stripe-java/pull/1485) API Updates for beta branch
  * Updated stable APIs to the latest version

## 21.16.0-beta.1 - 2022-11-10
* [#1475](https://github.com/stripe/stripe-java/pull/1475) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `DiscountEnd` on `Discount`.
  * Add support for `url` on `MerchantData`.

## 21.14.0-beta.2 - 2022-11-02
* [#1467](https://github.com/stripe/stripe-java/pull/1467) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `cashappPayments` and `zipPayments` on `Account`, `AccountCreateParams`, `AccountUpdateParams`.
  * Add support for `cashapp` and `zip` on `Charge`, `PaymentMethod`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`.
  * Add support for `trialSettings` on `SubscriptionSchedule`.

## 21.14.0-beta.1 - 2022-10-21
* [#1462](https://github.com/stripe/stripe-java/pull/1462) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for new value `revoked` on enum `CapitalFinancingOfferListParams.status`
  * Add support for `paypal` on `Charge.payment_method_details` and `Source`
  * Add support for `network_data` on `Issuing.Transaction`
  * Add support for `billing_cycle_anchor` on `SubscriptionScheduleAmendParams.amendments[]`
  * Add support for `tipping` on `Terminal.Reader.action.process_payment_intent.process_config` and `TerminalReaderProcessPaymentIntentParams.process_config`

## 21.13.0-beta.1 - 2022-10-14
* Add support for new value `upcoming_invoice` on enum `SubscriptionScheduleAmendParams.amendments[].amendment_end.type`
* Add support for new values `schedule_end` and `upcoming_invoice` on enum `SubscriptionScheduleAmendParams.amendments[].amendment_start.type`
* Add support for `schedule_settings` on `SubscriptionScheduleAmendParams`

## 21.12.0-beta.1 - 2022-10-07
* [#1452](https://github.com/stripe/stripe-java/pull/1452) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add `referenceId` to `Order`, `PaymentIntent, and corresponding params classes.

## 21.10.0-beta.1 - 2022-09-26
* [#1447](https://github.com/stripe/stripe-java/pull/1447) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add `FinancingOffer`, `FinancingSummary` and `FinancingTransaction` resources.

## 21.4.0-beta.1 - 2022-08-26
* [#1429](https://github.com/stripe/stripe-java/pull/1429) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for the beta [Gift Card API](https://stripe.com/docs/gift-cards).

## 21.3.0-beta.2 - 2022-08-23
* [#1424](https://github.com/stripe/stripe-java/pull/1424) Allow setting Stripe API Version on global configuration.
* [#1426](https://github.com/stripe/stripe-java/pull/1426) API Updates for beta branch
  - Updated stable APIs to the latest version
  - `Stripe-Version` beta headers are not pinned by-default and need to be manually specified, please refer to [beta SDKs README section](https://github.com/stripe/stripe-java/blob/master/README.md#beta-sdks)

## 21.3.0-beta.1 - 2022-08-11
* [#1417](https://github.com/stripe/stripe-java/pull/1417) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Add `refundPayment` method to Terminal resource

## 21.1.0-beta.1 - 2022-08-03
* [#1410](https://github.com/stripe/stripe-java/pull/1410) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Added the `Order` resource support

## 20.135.0-beta.1 - 2022-07-22
* [#1394](https://github.com/stripe/stripe-java/pull/1394) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Add `Price.MigrateTo` property
  - Add `SubscriptionSchedule.Amend` method.
  - Add `Discount.SubscriptionItem` property.
  - Add `Quote.SubscriptionData.BillingBehavior`, `BillingCycleAnchor`, `EndBehavior`, `FromSchedule`, `FromSubscription`, `Prebilling`, `ProrationBehavior` properties.
  - Add `Phases` parameter to `Quote.Create`
  - Add `Subscription.Discounts`, `Prebilling` properties.
* [#1398](https://github.com/stripe/stripe-java/pull/1398) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Add `QuotePhase` resource
* [#1400](https://github.com/stripe/stripe-java/pull/1400) API Updates for beta branch
  - Updated stable APIs to the latest version

## 20.133.0-beta.1 - 2022-07-07
* [#1389](https://github.com/stripe/stripe-java/pull/1389) API Updates for beta branch
  - Include `server_side_confirmation_beta=v1` beta
  - Add `secretKeyConfirmation` to `PaymentIntent`

## 20.129.0-beta.1 - 2022-06-17
* [#1374](https://github.com/stripe/stripe-java/pull/1374) API Updates for beta branch
  - Add support for NetworkDetails properties on resource ReceivedCredits/ReceivedDebits

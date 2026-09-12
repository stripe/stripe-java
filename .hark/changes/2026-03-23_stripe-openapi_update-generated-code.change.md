---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2164
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.1.0-beta.1
---

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

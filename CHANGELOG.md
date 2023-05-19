# Changelog

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

## 22.19.0 - 2023-05-11
* [#1559](https://github.com/stripe/stripe-java/pull/1559) Update generated code
  * Add support for `paypal` on `Charge.payment_method_details`, `CheckoutSessionCreateParams.payment_method_options`, `Mandate.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_options`
  * Add support for `network_token` on `Charge.payment_method_details.card`
  * Add support for new value `paypal` on enums `CheckoutSessionCreateParams.payment_method_types[]` and `PaymentMethodCreateParams.type`
  * Add support for `taxability_reason` and `taxable_amount` on `Checkout.Session.shipping_cost.taxes[]`, `Checkout.Session.total_details.breakdown.taxes[]`, `CreditNote.shipping_cost.taxes[]`, `CreditNote.tax_amounts[]`, `Invoice.shipping_cost.taxes[]`, `Invoice.total_tax_amounts[]`, `LineItem.taxes[]`, `Quote.computed.recurring.total_details.breakdown.taxes[]`, `Quote.computed.upfront.total_details.breakdown.taxes[]`, and `Quote.total_details.breakdown.taxes[]`
  * Add support for new value `paypal` on enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * Add support for new value `paypal` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Add support for new value `paypal` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `eftpos_au` on enums `PaymentIntentConfirmParams.payment_method_options.card.network`, `PaymentIntentCreateParams.payment_method_options.card.network`, `PaymentIntentUpdateParams.payment_method_options.card.network`, `SetupIntentConfirmParams.payment_method_options.card.network`, `SetupIntentCreateParams.payment_method_options.card.network`, `SetupIntentUpdateParams.payment_method_options.card.network`, `SubscriptionCreateParams.payment_settings.payment_method_options.card.network`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card.network`
  * Add support for new value `paypal` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for `brand`, `cardholder_name`, `country`, `exp_month`, `exp_year`, `fingerprint`, `funding`, `last4`, `networks`, and `read_method` on `PaymentMethod.card_present` and `PaymentMethod.interac_present`
  * Add support for `preferred_locales` on `PaymentMethod.interac_present`
  * Add support for `effective_percentage` on `TaxRate`
  * Add support for `gb_bank_transfer` and `jp_bank_transfer` on `CustomerCashBalanceTransactions.funded.bank_transfer`

## 22.19.0-beta.1 - 2023-05-04
* [#1554](https://github.com/stripe/stripe-java/pull/1554) Update generated code for beta
  * Updated stable APIs to the latest version

## 22.18.0 - 2023-05-04
* [#1555](https://github.com/stripe/stripe-java/pull/1555) Update generated code
  * Add support for `link` on `Checkout.Session.payment_method_options` and `CheckoutSessionCreateParams.payment_method_options`
  * Add support for `brand`, `country`, `description`, `exp_month`, `exp_year`, `fingerprint`, `funding`, `iin`, `issuer`, `last4`, `network`, and `wallet` on `SetupAttempt.payment_method_details.card`

## 22.18.0-beta.1 - 2023-04-27
* [#1550](https://github.com/stripe/stripe-java/pull/1550) Update generated code for beta
  * Add support for `billing_cycle_anchor` and `proration_behavior` on `CheckoutSessionCreateParams.subscription_data`
  * Add support for `terminal_id` on `Issuing.Authorization.merchant_data` and `Issuing.Transaction.merchant_data`
  * Add support for `metadata` on `PaymentIntentCaptureParams`
  * Add support for `checks` on `SetupAttempt.payment_method_details.card`
  * Add support for `tax_breakdown` on `Tax.Calculation.shipping_cost` and `Tax.Transaction.shipping_cost`
  * Change type of `TaxRegistrationCreateParams.active_from`, `TaxRegistrationUpdateParams.active_from`, and `TaxRegistrationUpdateParams.expires_at` from `longInteger` to `longInteger | literal('now')`

## 22.17.0 - 2023-04-27
* [#1551](https://github.com/stripe/stripe-java/pull/1551) Update generated code
  * Add support for `billing_cycle_anchor` and `proration_behavior` on `CheckoutSessionCreateParams.subscription_data`
  * Add support for `terminal_id` on `Issuing.Authorization.merchant_data` and `Issuing.Transaction.merchant_data`
  * Add support for `metadata` on `PaymentIntentCaptureParams`
  * Add support for `checks` on `SetupAttempt.payment_method_details.card`
  * Add support for `tax_breakdown` on `Tax.Calculation.shipping_cost` and `Tax.Transaction.shipping_cost`
* [#1547](https://github.com/stripe/stripe-java/pull/1547) Update generated code
* [#1544](https://github.com/stripe/stripe-java/pull/1544) Update generated code

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

## 22.16.0 - 2023-04-06
* [#1540](https://github.com/stripe/stripe-java/pull/1540) Update generated code
  * Add support for `country` on `PaymentMethod.link`
  * Add support for `status_details` on `PaymentMethod.us_bank_account`

## 22.16.0-beta.1 - 2023-03-30
* [#1537](https://github.com/stripe/stripe-java/pull/1537) Update generated code
  * Add support for new value `ioss` on enum `TaxRegistrationCreateParams.type`
  * Change `TerminalReaderCollectInputsParams.inputs[].custom_text.description` to be optional

## 22.15.0 - 2023-03-30
* [#1536](https://github.com/stripe/stripe-java/pull/1536) Update generated code
  * Remove support for `create` method on resource `Tax.Transaction`
    * This is not a breaking change, as this method was deprecated before the Tax Transactions API was released in favor of the `createFromCalculation` method.
  * Add support for `export_license_id` and `export_purpose_code` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
  * Add support for `amount_tip` on `TerminalReaderPresentPaymentMethodParams`
* [#1538](https://github.com/stripe/stripe-java/pull/1538) Add missing file purpose terminal_reader_splashscreen

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

## 22.14.0 - 2023-03-23
* [#1531](https://github.com/stripe/stripe-java/pull/1531) Update generated code
  * Add support for new resources `Tax.CalculationLineItem`, `Tax.Calculation`, `Tax.TransactionLineItem`, and `Tax.Transaction`
  * Add support for `create` and `list_line_items` methods on resource `Calculation`
  * Add support for `create_from_calculation`, `create_reversal`, `create`, `list_line_items`, and `retrieve` methods on resource `Transaction`
  * Add support for new value `link` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for `currency_conversion` on `Checkout.Session`
  * Add support for new value `link` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for `automatic_payment_methods` on `SetupIntentCreateParams` and `SetupIntent`

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

## 22.13.0 - 2023-03-16
* [#1529](https://github.com/stripe/stripe-java/pull/1529) API Updates
  * Add support for `cashapp_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `future_requirements` and `requirements` on `BankAccount`
  * Add support for `cashapp` as a new payment method type throughout the API.
  * Add support for `country` on `Charge.payment_method_details.link`
  * Add support for new value `automatic_async` on enums `CheckoutSessionCreateParams.payment_intent_data.capture_method`, `PaymentIntentConfirmParams.capture_method`, `PaymentIntentCreateParams.capture_method`, `PaymentIntentUpdateParams.capture_method`, and `PaymentLinkCreateParams.payment_intent_data.capture_method`
  * Add support for `preferred_locale` on `PaymentIntent.payment_method_options.affirm`, `PaymentIntentConfirmParams.payment_method_options.affirm`, `PaymentIntentCreateParams.payment_method_options.affirm`, and `PaymentIntentUpdateParams.payment_method_options.affirm`
  * Add support for `cashapp_handle_redirect_or_display_qr_code` on `PaymentIntent.next_action` and `SetupIntent.next_action`
  * Add support for new value `payout.reconciliation_completed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`


* [#1526](https://github.com/stripe/stripe-java/pull/1526) Update generated code (new)
  Release specs are identical.

## 22.13.0-beta.1 - 2023-03-09
* [#1524](https://github.com/stripe/stripe-java/pull/1524) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Remove support for `list_transactions` method on resource `Tax.Transaction`
  * Add support for `amendment_start` and `timestamp` on `SubscriptionScheduleAmendParams.prebilling[].bill_from`
  * Change type of `SubscriptionScheduleAmendParams.prebilling[].bill_from.type` from `literal('now')` to `enum('amendment_start'|'now'|'timestamp')`
  * Add support for `tax_behavior` on `Tax.Settings.defaults` and `TaxSettingsUpdateParams.defaults`

## 22.12.0 - 2023-03-09
* [#1523](https://github.com/stripe/stripe-java/pull/1523) API Updates
  * Add support for `card_issuing` on `IssuingCardholderCreateParams.individual` and `IssuingCardholderUpdateParams.individual`
  * Add support for `cancellation_details` on `SubscriptionCancelParams`, `SubscriptionUpdateParams`, and `Subscription`

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

## 22.11.0 - 2023-03-02
* [#1520](https://github.com/stripe/stripe-java/pull/1520) API Updates
  * Add support for new values `electric_vehicle_charging`, `emergency_services_gcas_visa_use_only`, `government_licensed_horse_dog_racing_us_region_only`, `government_licensed_online_casions_online_gambling_us_region_only`, `government_owned_lotteries_non_us_region`, `government_owned_lotteries_us_region_only`, and `marketplaces` on enums `IssuingCardCreateParams.spending_controls.allowed_categories[]`, `IssuingCardCreateParams.spending_controls.blocked_categories[]`, `IssuingCardCreateParams.spending_controls.spending_limits[].categories[]`, `IssuingCardUpdateParams.spending_controls.allowed_categories[]`, `IssuingCardUpdateParams.spending_controls.blocked_categories[]`, `IssuingCardUpdateParams.spending_controls.spending_limits[].categories[]`, `IssuingCardholderCreateParams.spending_controls.allowed_categories[]`, `IssuingCardholderCreateParams.spending_controls.blocked_categories[]`, `IssuingCardholderCreateParams.spending_controls.spending_limits[].categories[]`, `IssuingCardholderUpdateParams.spending_controls.allowed_categories[]`, `IssuingCardholderUpdateParams.spending_controls.blocked_categories[]`, and `IssuingCardholderUpdateParams.spending_controls.spending_limits[].categories[]`
  * Add support for `reconciliation_status` on `Payout`
  * Add support for new value `lease_tax` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

## 22.11.0-beta.1 - 2023-02-23
* [#1518](https://github.com/stripe/stripe-java/pull/1518) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `manual_entry` on `Checkout.Session.payment_method_options.us_bank_account.financial_connections`, `PaymentIntent.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntent.payment_method_options.us_bank_account.financial_connections`, `SetupIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, and `SetupIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`
  * Change `TaxTransactionCreateParams.reference` to be required
  * Add support for new values `capital.financing_offer.accepted`, `capital.financing_offer.canceled`, `capital.financing_offer.created`, `capital.financing_offer.expired`, `capital.financing_offer.fully_repaid`, `capital.financing_offer.paid_out`, `capital.financing_offer.rejected`, and `capital.financing_offer.replacement_created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.10.0 - 2023-02-23
* [#1517](https://github.com/stripe/stripe-java/pull/1517) API Updates
  * Add support for new value `yoursafe` on enums `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
  * Add support for new value `igst` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

## 22.10.0-beta.1 - 2023-02-16
* [#1516](https://github.com/stripe/stripe-java/pull/1516) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `currency_conversion` on `Checkout.Session`
  * Add support for `limits` on `FinancialConnections.Session` and `FinancialConnectionsSessionCreateParams`
  * Remove support for `enabled` on `FinancialConnectionsSessionCreateParams.manual_entry`
  * Remove support for `reference` on `Tax.Calculation` and `TaxCalculationCreateParams`
  * Add support for `reference` on `TaxTransactionCreateParams`

## 22.9.0 - 2023-02-16
* [#1514](https://github.com/stripe/stripe-java/pull/1514) API Updates
  * Add support for `refund_payment` method on resource `Terminal.Reader`
  * Add support for new value `name` on enums `BillingPortalConfigurationCreateParams.features.customer_update.allowed_updates[]` and `BillingPortalConfigurationUpdateParams.features.customer_update.allowed_updates[]`
  * Add support for `custom_fields` on `Checkout.Session`, `CheckoutSessionCreateParams`, `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
  * Add support for `interac_present` on `TerminalReaderPresentPaymentMethodParams`
  * Change type of `TerminalReaderPresentPaymentMethodParams.type` from `literal('card_present')` to `enum('card_present'|'interac_present')`
  * Add support for `refund_payment` on `Terminal.Reader.action`

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

## 22.8.0 - 2023-02-02
* [#1512](https://github.com/stripe/stripe-java/pull/1512) API Updates
  * Add support for `resume` method on resource `Subscription`
  * Add support for `payment_link` on `CheckoutSessionListParams`
  * Add support for `trial_settings` on `CheckoutSessionCreateParams.subscription_data`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
  * Add support for `shipping_cost` on `CreditNoteCreateParams`, `CreditNotePreviewLinesParams`, `CreditNotePreviewParams`, `CreditNote`, `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
  * Add support for `amount_shipping` on `CreditNote` and `Invoice`
  * Add support for `shipping_details` on `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
  * Add support for `subscription_resume_at` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
  * Change `IssuingCardholderCreateParams.individual.first_name`, `IssuingCardholderCreateParams.individual.last_name`, `IssuingCardholderUpdateParams.individual.first_name`, and `IssuingCardholderUpdateParams.individual.last_name` to be optional
  * Add support for `invoice_creation` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
  * Add support for new value `America/Ciudad_Juarez` on enum `ReportingReportRunCreateParams.parameters.timezone`
  * Add support for new value `paused` on enum `SubscriptionListParams.status`
  * Add support for new values `customer.subscription.paused` and `customer.subscription.resumed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 22.8.0-beta.1 - 2023-01-26
* [#1511](https://github.com/stripe/stripe-java/pull/1511) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `list_transactions` method on resource `Tax.Transaction`
  * Add support for `billing_agreement_id` on `CheckoutSessionCreateParams.payment_method_options.paypal`
  * Change type of `QuoteUpdateParams.subscription_data_overrides` from `array(create_specs)` to `emptyStringable(array(update_specs))`

## 22.7.0 - 2023-01-26
* [#1510](https://github.com/stripe/stripe-java/pull/1510) API Updates
  * Add support for new values `cs-CZ`, `el-GR`, `en-CZ`, and `en-GR` on enums `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`

## 22.7.0-beta.2 - 2023-01-20
* [#1509](https://github.com/stripe/stripe-java/pull/1509) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Adds support for `set_schedule_end` on `Quote`.

## 22.7.0-beta.1 - 2023-01-19
* [#1508](https://github.com/stripe/stripe-java/pull/1508) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `Tax.Settings` resource.

## 22.6.0 - 2023-01-19
* [#1507](https://github.com/stripe/stripe-java/pull/1507) API Updates
  * Add support for `verification_session` on `EphemeralKeyCreateParams`
  * Add support for new values `refund.created` and `refund.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

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

## 22.5.1 - 2023-01-12
* [#1505](https://github.com/stripe/stripe-java/pull/1505) Bump Gson to 2.10.1

## 22.5.0 - 2023-01-05
* [#1502](https://github.com/stripe/stripe-java/pull/1502) API Updates
  * Add support for `card_issuing` on `Issuing.Cardholder.individual`
* [#1501](https://github.com/stripe/stripe-java/pull/1501) Add fix for per-request ApiBase
* [#1476](https://github.com/stripe/stripe-java/pull/1476) Solution For "Regarding ability to override stripe api url per API re…
* [#1500](https://github.com/stripe/stripe-java/pull/1500) Deprecate ApiResource.classUrl, etc.
  * Mark `ApiResource.className`, `ApiResource.singleClassUrl`, `ApiResource.classUrl`, `ApiResource.instanceUrl`, and `ApiResource.subresourceUrl` as deprecated
* [#1499](https://github.com/stripe/stripe-java/pull/1499) Fix publish command

## 22.5.0-beta.1 - 2022-12-22
* [#1498](https://github.com/stripe/stripe-java/pull/1498) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Move `TaxCalculation` and `TaxTransaction` to `Tax.Calculation` and `Tax.Transaction`.

## 22.4.0 - 2022-12-22
* [#1497](https://github.com/stripe/stripe-java/pull/1497) API Updates
  * Add support for new value `merchant_default` on enums `CashBalanceUpdateParams.settings.reconciliation_mode`, `CustomerCreateParams.cash_balance.settings.reconciliation_mode`, and `CustomerUpdateParams.cash_balance.settings.reconciliation_mode`
  * Add support for `using_merchant_default` on `CashBalance.settings`
* [#1496](https://github.com/stripe/stripe-java/pull/1496) Replace ReflectionCheckingTypeAdapterFactory with a ReflectionAccessFilter
* [#1491](https://github.com/stripe/stripe-java/pull/1491) Don't delombok sources

## 22.4.0-beta.1 - 2022-12-15
* [#1493](https://github.com/stripe/stripe-java/pull/1493) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for new resources `QuoteLine`, `TaxCalculation`, and `TaxTransaction`
  * Add support for `create` and `list_line_items` methods on resource `TaxCalculation`
  * Add support for `create_reversal`, `create`, and `retrieve` methods on resource `TaxTransaction`

## 22.3.0 - 2022-12-08
* [#1487](https://github.com/stripe/stripe-java/pull/1487) API Updates
  * Change `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`.
  * Added parameterless overload of `Customer.listPaymentMethods`.

## 22.3.0-beta.1 - 2022-12-08
* [#1488](https://github.com/stripe/stripe-java/pull/1488) API Updates for beta branch
  * Updated stable APIs to the latest version
* [#1485](https://github.com/stripe/stripe-java/pull/1485) API Updates for beta branch
  * Updated stable APIs to the latest version

## 22.2.0 - 2022-12-06
* [#1484](https://github.com/stripe/stripe-java/pull/1484) API Updates
  * Add support for `flow_data` on `BillingPortalSessionCreateParams`
  * Add support for `flow` on `BillingPortal.Session`
* [#1483](https://github.com/stripe/stripe-java/pull/1483) API Updates
  * Add support for `india_international_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `invoice_creation` on `Checkout.Session` and `CheckoutSessionCreateParams`
  * Add support for `invoice` on `Checkout.Session`
  * Add support for `metadata` on `SubscriptionSchedule.phases[].items[]`, `SubscriptionScheduleCreateParams.phases[].items[]`, and `SubscriptionScheduleUpdateParams.phases[].items[]`

## 22.1.0 - 2022-11-17
* [#1480](https://github.com/stripe/stripe-java/pull/1480) API Updates
  * Add support for `hosted_instructions_url` on `PaymentIntent.next_action.wechat_pay_display_qr_code`
* [#1479](https://github.com/stripe/stripe-java/pull/1479) API Updates
  * Add support for `custom_text` on `Checkout.Session`, `CheckoutSessionCreateParams`, `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
  * Add support for `hosted_instructions_url` on `PaymentIntent.next_action.paynow_display_qr_code`

## 22.0.0 - 2022-11-16
* [#1471](https://github.com/stripe/stripe-java/pull/1471) Next major release changes

Breaking changes that arose during code generation of the library that we postponed for the next major version. For changes to the Stripe products, read more at https://stripe.com/docs/upgrades#2022-11-15.

"⚠️" symbol highlights breaking changes.

- ⚠️ Inline several "shared" classes for consistency (#1455)
- ⚠️ Removed `LineItem.Product` property that was released by mistake. (#1456)
- ⚠️ Removed `Charges` property on `PaymentIntent` and replace it with `LatestCharge` (#1473)
- ⚠️ Removed deprecated `Amount`, `Currency`, `Description`, `Images`, `Name` properties from `SessionCreateParams.LineItem` (#1473)
- ⚠️ Remove support for `tos_shown_and_accepted` on `CheckoutSessionCreateParams.payment_method_options.paynow` (#1473)
- ⚠️ Removed deprecated `Sku` resource (#1459)
- ⚠️ Removed deprecated `EphemeralKey.associatedObjects` field. ([#1470](https://github.com/stripe/stripe-java/pull/1470))
- ⚠️ Removed `RequestOptions.getStripeVersionOverride`, `RequestOptions.setStripeVersionOverride`,  and `RequestOptions.clearStripeVersionOverride` (#1464)

Use of `setStripeVersionOverride` is discouraged and can lead to unexpected errors during service calls because Java SDK class shapes are not guaranteed to match API responses on arbitrary versions.

If you were using these methods in conjunction with `EphemeralKey` resource prefer the `EphemeralKeyCreateParamsBuilder.setStripeVersion`.
```java
EphemeralKeyCreateParams params = EphemeralKeyCreateParams.builder()
  .setStripeVersion("XXXX-YY-ZZ")
  .build();
```

If you have a use case that requires per-request version overrides, please file an issue on [stripe-java](https://github.com/stripe/stripe-java/issues) repository to ensure we are aware and can add first-class support for it. In the meantime you can use `unsafeSetStripeVersionOverride` method as a workaround.
```java
RequestOptions.RequestOptionsBuilder builder = RequestOptions.builder();
builder.setApiKey(...)
            .setClientId(...);

RequestOptionsBuilder.unsafeSetStripeVersionOverride(builder, "2022-11-15");
```
* [#1474](https://github.com/stripe/stripe-java/pull/1474) API Updates
  * ⚠️ Remove support for `tos_shown_and_accepted` on `CheckoutSessionCreateParams.payment_method_options.paynow`. The property was mistakenly released and never worked.

## 21.16.0-beta.1 - 2022-11-10
* [#1475](https://github.com/stripe/stripe-java/pull/1475) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for `DiscountEnd` on `Discount`.
  * Add support for `url` on `MerchantData`.

## 21.15.0 - 2022-11-08
* [#1472](https://github.com/stripe/stripe-java/pull/1472) API Updates
  * Add support for new values `eg_tin`, `ph_tin`, and `tr_tin` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, and `TaxIdCreateParams.type`
  * Add support for `reason_message` on `Issuing.Authorization.request_history[]`

## 21.14.0 - 2022-11-03
* [#1466](https://github.com/stripe/stripe-java/pull/1466) API Updates
  * Add support for `on_behalf_of` on `CheckoutSessionCreateParams.subscription_data`, `SubscriptionCreateParams`, `SubscriptionSchedule.default_settings`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.default_settings`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.default_settings`, `SubscriptionScheduleUpdateParams.phases[]`, `SubscriptionUpdateParams`, and `Subscription`
  * Add support for `tax_behavior` and `tax_code` on `InvoiceItemCreateParams`, `InvoiceItemUpdateParams`, `InvoiceUpcomingLinesParams.invoice_items[]`, and `InvoiceUpcomingParams.invoice_items[]`

## 21.14.0-beta.2 - 2022-11-02
* [#1467](https://github.com/stripe/stripe-java/pull/1467) API Updates for beta branch
  * Updated beta APIs to the latest stable version
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

## 21.13.0 - 2022-10-20
* [#1461](https://github.com/stripe/stripe-java/pull/1461) API Updates
  * Add support for new values `jp_trn` and `ke_pin` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, and `TaxIdCreateParams.type`
  * Add support for `tipping` on `Terminal.Reader.action.process_payment_intent.process_config` and `TerminalReaderProcessPaymentIntentParams.process_config`

## 21.13.0-beta.1 - 2022-10-14
* Add support for `schedule_settings` on `SubscriptionScheduleAmendParams`
* Add support for new value `upcoming_invoice` on enum `SubscriptionScheduleAmendParams.amendments[].amendment_end.type`
* Add support for new values `schedule_end` and `upcoming_invoice` on enum `SubscriptionScheduleAmendParams.amendments[].amendment_start.type`

## 21.12.0 - 2022-10-14
* [#1457](https://github.com/stripe/stripe-java/pull/1457) Bugfix: Don't require global API Key when API Key is propagated from list request
* [#1458](https://github.com/stripe/stripe-java/pull/1458) API Updates
  * Add support for `request_log_url` on `StripeError`
  * Add support for `network_data` on `Issuing.Authorization`

## 21.12.0-beta.1 - 2022-10-07
* [#1452](https://github.com/stripe/stripe-java/pull/1452) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add `referenceId` to `Order`, `PaymentIntent, and corresponding params classes.

## 21.11.0 - 2022-10-06
* [#1451](https://github.com/stripe/stripe-java/pull/1451) API Updates
  * Add support for new value `bank_of_china` on enums `PaymentIntentConfirmParams.payment_method_data.fpx.bank`, `PaymentIntentCreateParams.payment_method_data.fpx.bank`, `PaymentIntentUpdateParams.payment_method_data.fpx.bank`, `PaymentMethodCreateParams.fpx.bank`, `SetupIntentConfirmParams.payment_method_data.fpx.bank`, `SetupIntentCreateParams.payment_method_data.fpx.bank`, and `SetupIntentUpdateParams.payment_method_data.fpx.bank`
  * Add support for new values `America/Nuuk`, `Europe/Kyiv`, and `Pacific/Kanton` on enum `ReportingReportRunCreateParams.parameters.timezone`
  * Add support for `klarna` on `SetupAttempt.payment_method_details`
* [#1450](https://github.com/stripe/stripe-java/pull/1450) Set JDK to 17 LTS

## 21.10.0 - 2022-09-29
* [#1448](https://github.com/stripe/stripe-java/pull/1448) API Updates
  * Add support for `created` on `Checkout.Session`
  * Add support for `setup_future_usage` on `PaymentIntent.payment_method_options.pix`, `PaymentIntentConfirmParams.payment_method_options.pix`, `PaymentIntentCreateParams.payment_method_options.pix`, and `PaymentIntentUpdateParams.payment_method_options.pix`
  * Deprecate `SessionCreateParams.subscription_data.items` (use the `line_items` param instead). This will be removed in the next major version.

## 21.10.0-beta.1 - 2022-09-26
* [#1447](https://github.com/stripe/stripe-java/pull/1447) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add `FinancingOffer`, `FinancingSummary` and `FinancingTransaction` resources.

## 21.9.0 - 2022-09-22
* [#1445](https://github.com/stripe/stripe-java/pull/1445) API Updates
  * Add support for `terms_of_service` on `Checkout.Session.consent_collection`, `Checkout.Session.consent`, `CheckoutSessionCreateParams.consent_collection`, `PaymentLink.consent_collection`, and `PaymentLinkCreateParams.consent_collection`
  * ⚠️ Remove support for `plan` on `CheckoutSessionCreateParams.payment_method_options.card.installments`. The property was mistakenly released and never worked.
  * Add support for `amount` on `IssuingDisputeCreateParams` and `IssuingDisputeUpdateParams`
  * Add support for `statement_descriptor` on `PaymentIntentIncrementAuthorizationParams`
  * Add `upcomingLines` method to `Invoice` resource.

## 21.8.0 - 2022-09-15
* [#1444](https://github.com/stripe/stripe-java/pull/1444) API Updates
  * Add support for `pix` on `Charge.payment_method_details`, `Checkout.Session.payment_method_options`, `CheckoutSessionCreateParams.payment_method_options`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new value `pix` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for new value `pix` on enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * Add support for `from_invoice` on `InvoiceCreateParams` and `Invoice`
  * Add support for `latest_revision` on `Invoice`
  * Add support for new value `pix` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for `pix_display_qr_code` on `PaymentIntent.next_action`
  * Add support for new value `pix` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for new value `pix` on enum `PaymentMethodCreateParams.type`
  * Add support for `created` on `Treasury.CreditReversal` and `Treasury.DebitReversal`

## 21.7.0 - 2022-09-09
* [#1435](https://github.com/stripe/stripe-java/pull/1435) API Updates
  * Add support for `require_signature` on `Issuing.Card.shipping` and `IssuingCardCreateParams.shipping`

## 21.6.0 - 2022-09-06
* [#1434](https://github.com/stripe/stripe-java/pull/1434) API Updates
  * Add support for new value `terminal_reader_splashscreen` on enum `FileListParams.purpose`
  * Fix `LineItem.Discount.discount` to reference the correct `Discount` class (`com.stripe.model.Discount`)

## 21.5.0 - 2022-08-31
* [#1433](https://github.com/stripe/stripe-java/pull/1433) API Updates
  * Add support for new values `de-CH`, `en-CH`, `en-PL`, `en-PT`, `fr-CH`, `it-CH`, `pl-PL`, and `pt-PT` on enums `OrderCreateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `OrderUpdateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`
  * Add support for `description` on `PaymentLink.subscription_data` and `PaymentLinkCreateParams.subscription_data`
* [#1432](https://github.com/stripe/stripe-java/pull/1432) Update README badge
* [#1431](https://github.com/stripe/stripe-java/pull/1431) Update coveralls to only run for one java version

## 21.4.0 - 2022-08-26
* [#1430](https://github.com/stripe/stripe-java/pull/1430) API Updates
  * Add support for `login_page` on `BillingPortal.Configuration`, `BillingPortalConfigurationCreateParams`, and `BillingPortalConfigurationUpdateParams`
  * Add support for `customs` and `phone_number` on `Issuing.Card.shipping` and `IssuingCardCreateParams.shipping`
  * Add support for new value `deutsche_bank_ag` on enums `PaymentIntentConfirmParams.payment_method_data.eps.bank`, `PaymentIntentCreateParams.payment_method_data.eps.bank`, `PaymentIntentUpdateParams.payment_method_data.eps.bank`, `PaymentMethodCreateParams.eps.bank`, `SetupIntentConfirmParams.payment_method_data.eps.bank`, `SetupIntentCreateParams.payment_method_data.eps.bank`, and `SetupIntentUpdateParams.payment_method_data.eps.bank`
  * Add support for `description` on `Quote.subscription_data`, `QuoteCreateParams.subscription_data`, `QuoteUpdateParams.subscription_data`, `SubscriptionSchedule.default_settings`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.default_settings`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.default_settings`, and `SubscriptionScheduleUpdateParams.phases[]`
* [#1428](https://github.com/stripe/stripe-java/pull/1428) Show test coverage in README
* [#1427](https://github.com/stripe/stripe-java/pull/1427) Update README.md to clarify that API version can only be change in beta

## 21.4.0-beta.1 - 2022-08-26
* [#1429](https://github.com/stripe/stripe-java/pull/1429) API Updates for beta branch
  * Updated stable APIs to the latest version
  * Add support for the beta [Gift Card API](https://stripe.com/docs/gift-cards).

## 21.3.0 - 2022-08-23
* [#1422](https://github.com/stripe/stripe-java/pull/1422) API Updates
  * Add support for new resource `CustomerCashBalanceTransaction`
  * Remove support for value `paypal` from enums `OrderCreateParams.payment.settings.payment_method_types[]` and `OrderUpdateParams.payment.settings.payment_method_types[]`
  * Add support for `currency` on `PaymentLink`
  * Add support for `network` on `SetupIntentConfirmParams.payment_method_options.card`, `SetupIntentCreateParams.payment_method_options.card`, `SetupIntentUpdateParams.payment_method_options.card`, `Subscription.payment_settings.payment_method_options.card`, `SubscriptionCreateParams.payment_settings.payment_method_options.card`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card`
  * Change `TreasuryOutboundTransferCreateParams.destination_payment_method` to be optional
  * Add support for new value `customer_cash_balance_transaction.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
  * Change the return type of `Customer.fundCashBalance` test helper from `CustomerBalanceTransaction` to `CustomerCashBalanceTransaction`.
    * This would generally be considered a breaking change, but we've worked with all existing users to migrate and are comfortable releasing this as a minor as it is solely a test helper method. This was essentially broken prior to this change.
* [#1425](https://github.com/stripe/stripe-java/pull/1425) Add beta readme.md section
* [#1423](https://github.com/stripe/stripe-java/pull/1423) chore: Remove unused variable from SearchPagingIteratorTest.
* [#1421](https://github.com/stripe/stripe-java/pull/1421) Add a support section to the readme
* [#1420](https://github.com/stripe/stripe-java/pull/1420) Fix outdated test comment
* [#1418](https://github.com/stripe/stripe-java/pull/1418) Fix latest JAR hyperlink and related tests
* [#1419](https://github.com/stripe/stripe-java/pull/1419) Fix makefile indentation and improve regex

## 21.3.0-beta.2 - 2022-08-23
* [#1426](https://github.com/stripe/stripe-java/pull/1426) API Updates for beta branch
  - Updated stable APIs to the latest version
  - `Stripe-Version` beta headers are not pinned by-default and need to be manually specified, please refer to [beta SDKs README section](https://github.com/stripe/stripe-java/blob/master/README.md#beta-sdks)
* [#1424](https://github.com/stripe/stripe-java/pull/1424) Allow setting Stripe API Version on global configuration.

## 21.3.0-beta.1 - 2022-08-11
* [#1417](https://github.com/stripe/stripe-java/pull/1417) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Add `refundPayment` method to Terminal resource

## 21.2.0 - 2022-08-11
* [#1416](https://github.com/stripe/stripe-java/pull/1416) API Updates
  * Add support for `payment_method_collection` on `Checkout.Session`, `CheckoutSessionCreateParams`, `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`

* [#1414](https://github.com/stripe/stripe-java/pull/1414) Stop publishing javadoc for beta Java SDKs

## 21.1.0 - 2022-08-09
* [#1413](https://github.com/stripe/stripe-java/pull/1413) API Updates
  * Add support for `process_config` on `Terminal.Reader.action.process_payment_intent`
* [#1412](https://github.com/stripe/stripe-java/pull/1412) API Updates
  * Add support for `expires_at` on `Apps.Secret` and `AppsSecretCreateParams`

## 21.1.0-beta.1 - 2022-08-03
* [#1410](https://github.com/stripe/stripe-java/pull/1410) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Added the `Order` resource support

## 21.0.0 - 2022-08-02

This release includes breaking changes resulting from:

* Moving to use the new API version "2022-08-01". To learn more about these changes to Stripe products, see https://stripe.com/docs/upgrades#2022-08-01
* Cleaning up the SDK to remove deprecated/unused APIs and rename classes/methods/properties to sync with product APIs. Read more detailed description at https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v21.

"⚠️" symbol highlights breaking changes.

* [#1409](https://github.com/stripe/stripe-java/pull/1409) API Updates
* [#1407](https://github.com/stripe/stripe-java/pull/1407) Next major release changes

## 20.136.0 - 2022-07-26
* [#1406](https://github.com/stripe/stripe-java/pull/1406) API Updates
  * Add support for `customer_balance` on `Checkout.Session.payment_method_options` and `CheckoutSessionCreateParams.payment_method_options`
  * Add support for new value `customer_balance` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for new values `en-CA` and `fr-CA` on enums `OrderCreateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `OrderUpdateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`
* [#1405](https://github.com/stripe/stripe-java/pull/1405) chore: Update gson version in README.

## 20.135.0 - 2022-07-25
* [#1402](https://github.com/stripe/stripe-java/pull/1402) API Updates
  * Add support for `installments` on `Checkout.Session.payment_method_options.card`, `CheckoutSessionCreateParams.payment_method_options.card`, `Invoice.payment_settings.payment_method_options.card`, `InvoiceCreateParams.payment_settings.payment_method_options.card`, and `InvoiceUpdateParams.payment_settings.payment_method_options.card`
  * Add support for `default_currency` and `invoice_credit_balance` on `Customer`
  * Add support for `currency` on `InvoiceCreateParams`
  * Add support for `default_mandate` on `Invoice.payment_settings`, `InvoiceCreateParams.payment_settings`, and `InvoiceUpdateParams.payment_settings`
  * Add support for `mandate` on `InvoicePayParams`

## 20.135.0-beta.1 - 2022-07-22
* [#1400](https://github.com/stripe/stripe-java/pull/1400) API Updates for beta branch
  - Updated stable APIs to the latest version
* [#1398](https://github.com/stripe/stripe-java/pull/1398) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Add `QuotePhase` resource
* [#1394](https://github.com/stripe/stripe-java/pull/1394) API Updates for beta branch
  - Updated stable APIs to the latest version
  - Add `Price.MigrateTo` property
  - Add `SubscriptionSchedule.Amend` method.
  - Add `Discount.SubscriptionItem` property.
  - Add `Quote.SubscriptionData.BillingBehavior`, `BillingCycleAnchor`, `EndBehavior`, `FromSchedule`, `FromSubscription`, `Prebilling`, `ProrationBehavior` properties.
  - Add `Phases` parameter to `Quote.Create`
  - Add `Subscription.Discounts`, `Prebilling` properties.

## 20.134.0 - 2022-07-18
* [#1391](https://github.com/stripe/stripe-java/pull/1391) API Updates
  * Add support for `blik_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `blik` on `Charge.payment_method_details`, `Mandate.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_options`
  * Change type of `Checkout.Session.consent_collection.promotions`, `CheckoutSessionCreateParams.consent_collection.promotions`, `PaymentLink.consent_collection.promotions`, and `PaymentLinkCreateParams.consent_collection.promotions` from `literal('auto')` to `enum('auto'|'none')`
  * Add support for new value `blik` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for new value `blik` on enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * Add support for new value `blik` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new value `blik` on enums `PaymentLinkCreateParams.payment_method_types[]` and `PaymentLinkUpdateParams.payment_method_types[]`
  * Add support for new value `blik` on enum `PaymentMethodCreateParams.type`

## 20.133.0 - 2022-07-12
* [#1390](https://github.com/stripe/stripe-java/pull/1390) API Updates
  * Add support for `customer_details` on `CheckoutSessionListParams`

## 20.133.0-beta.1 - 2022-07-07
* [#1389](https://github.com/stripe/stripe-java/pull/1389) API Updates for beta branch
  - Include `server_side_confirmation_beta=v1` beta
  - Add `secretKeyConfirmation` to `PaymentIntent`

## 20.132.0 - 2022-07-07
* [#1388](https://github.com/stripe/stripe-java/pull/1388) API Updates
  * Add support for `currency` on `CheckoutSessionCreateParams`, `InvoiceUpcomingLinesParams`, `InvoiceUpcomingParams`, `PaymentLinkCreateParams`, `SubscriptionCreateParams`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.phases[]`, and `Subscription`
  * Add support for `currency_options` on `CheckoutSessionCreateParams.shipping_options[].shipping_rate_data.fixed_amount`, `CouponCreateParams`, `CouponUpdateParams`, `Coupon`, `OrderCreateParams.shipping_cost.shipping_rate_data.fixed_amount`, `OrderUpdateParams.shipping_cost.shipping_rate_data.fixed_amount`, `PriceCreateParams`, `PriceUpdateParams`, `Price`, `ProductCreateParams.default_price_data`, `PromotionCode.restrictions`, `PromotionCodeCreateParams.restrictions`, `ShippingRate.fixed_amount`, and `ShippingRateCreateParams.fixed_amount`
  * Add support for `restrictions` on `PromotionCodeUpdateParams`
  * Add support for `fixed_amount` and `tax_behavior` on `ShippingRateUpdateParams`
* [#1387](https://github.com/stripe/stripe-java/pull/1387) API Updates
  * Add support for `customer` on `CheckoutSessionListParams` and `RefundCreateParams`
  * Add support for `currency` and `origin` on `RefundCreateParams`
  * Add support for new values `financial_connections.account.created`, `financial_connections.account.deactivated`, `financial_connections.account.disconnected`, `financial_connections.account.reactivated`, and `financial_connections.account.refreshed_balance` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* [#1386](https://github.com/stripe/stripe-java/pull/1386) Support serializing nested objects in map

## 20.131.0 - 2022-06-29
* [#1384](https://github.com/stripe/stripe-java/pull/1384) API Updates
  * Add support for `deliver_card`, `fail_card`, `return_card`, and `ship_card` test helper methods on resource `Issuing.Card`
  * Change type of `PaymentLink.payment_method_types[]`, `PaymentLinkCreateParams.payment_method_types[]`, and `PaymentLinkUpdateParams.payment_method_types[]` from `literal('card')` to `enum`
  * Add support for `hosted_regulatory_receipt_url` on `Treasury.ReceivedCredit` and `Treasury.ReceivedDebit`

## 20.130.0 - 2022-06-23
* [#1380](https://github.com/stripe/stripe-java/pull/1380) API Updates
  * Add support for `capture_method` on `PaymentIntentConfirmParams` and `PaymentIntentUpdateParams`
* [#1378](https://github.com/stripe/stripe-java/pull/1378) API Updates
  * Add support for `promptpay_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `promptpay` on `Charge.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for new value `promptpay` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for `subtotal_excluding_tax` on `CreditNote` and `Invoice`
  * Add support for `amount_excluding_tax` and `unit_amount_excluding_tax` on `CreditNoteLineItem` and `InvoiceLineItem`
  * Add support for new value `promptpay` on enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * Add support for `rendering_options` on `InvoiceCreateParams` and `InvoiceUpdateParams`
  * Add support for new value `promptpay` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Add support for `total_excluding_tax` on `Invoice`
  * Add support for `automatic_payment_methods` on `Order.payment.settings`
  * Add support for new value `promptpay` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for `promptpay_display_qr_code` on `PaymentIntent.next_action`
  * Add support for new value `promptpay` on enum `PaymentMethodCreateParams.type`
* [#1379](https://github.com/stripe/stripe-java/pull/1379) Use the generated API version
* [#1376](https://github.com/stripe/stripe-java/pull/1376) Document how to access unsupported parameters and properties

## 20.129.0 - 2022-06-17
* [#1375](https://github.com/stripe/stripe-java/pull/1375) API Updates
  * Add support for `fund_cash_balance` test helper method on resource `Customer`
  * Add support for `statement_descriptor_prefix_kana` and `statement_descriptor_prefix_kanji` on `Account.settings.card_payments`, `Account.settings.payments`, `AccountCreateParams.settings.card_payments`, and `AccountUpdateParams.settings.card_payments`
  * Add support for `statement_descriptor_suffix_kana` and `statement_descriptor_suffix_kanji` on `Checkout.Session.payment_method_options.card`, `CheckoutSessionCreateParams.payment_method_options.card`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, and `PaymentIntentUpdateParams.payment_method_options.card`
  * Add support for `total_excluding_tax` on `CreditNote`
  * Change type of `CustomerCreateParams.invoice_settings.rendering_options` and `CustomerUpdateParams.invoice_settings.rendering_options` from `rendering_options_param` to `emptyStringable(rendering_options_param)`
  * Add support for `rendering_options` on `Customer.invoice_settings` and `Invoice`
* [#1373](https://github.com/stripe/stripe-java/pull/1373) Trigger workflows on beta branches
* [#1372](https://github.com/stripe/stripe-java/pull/1372) Update readme example to use typed params.

## 20.129.0-beta.1 - 2022-06-17
* [#1374](https://github.com/stripe/stripe-java/pull/1374) API Updates for beta branch
  - Add support for NetworkDetails properties on resource ReceivedCredits/ReceivedDebits

## 20.128.0 - 2022-06-09
* [#1370](https://github.com/stripe/stripe-java/pull/1370) API Updates
  * Add support for `treasury` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
  * Add support for `rendering_options` on `CustomerCreateParams.invoice_settings` and `CustomerUpdateParams.invoice_settings`
  * Add support for `eu_bank_transfer` on `CustomerCreateFundingInstructionsParams.bank_transfer`, `Invoice.payment_settings.payment_method_options.customer_balance.bank_transfer`, `InvoiceCreateParams.payment_settings.payment_method_options.customer_balance.bank_transfer`, `InvoiceUpdateParams.payment_settings.payment_method_options.customer_balance.bank_transfer`, `Order.payment.settings.payment_method_options.customer_balance.bank_transfer`, `OrderCreateParams.payment.settings.payment_method_options.customer_balance.bank_transfer`, `OrderUpdateParams.payment.settings.payment_method_options.customer_balance.bank_transfer`, `PaymentIntent.payment_method_options.customer_balance.bank_transfer`, `PaymentIntentConfirmParams.payment_method_options.customer_balance.bank_transfer`, `PaymentIntentCreateParams.payment_method_options.customer_balance.bank_transfer`, `PaymentIntentUpdateParams.payment_method_options.customer_balance.bank_transfer`, `Subscription.payment_settings.payment_method_options.customer_balance.bank_transfer`, `SubscriptionCreateParams.payment_settings.payment_method_options.customer_balance.bank_transfer`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.customer_balance.bank_transfer`
  * Change type of `CustomerCreateFundingInstructionsParams.bank_transfer.requested_address_types[]` from `literal('zengin')` to `enum('iban'|'sort_code'|'spei'|'zengin')`
  * Change type of `CustomerCreateFundingInstructionsParams.bank_transfer.type`, `Order.payment.settings.payment_method_options.customer_balance.bank_transfer.type`, `OrderCreateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.type`, `OrderUpdateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.type`, `PaymentIntent.next_action.display_bank_transfer_instructions.type`, `PaymentIntent.payment_method_options.customer_balance.bank_transfer.type`, `PaymentIntentConfirmParams.payment_method_options.customer_balance.bank_transfer.type`, `PaymentIntentCreateParams.payment_method_options.customer_balance.bank_transfer.type`, and `PaymentIntentUpdateParams.payment_method_options.customer_balance.bank_transfer.type` from `literal('jp_bank_transfer')` to `enum('eu_bank_transfer'|'gb_bank_transfer'|'jp_bank_transfer'|'mx_bank_transfer')`
  * Add support for `iban`, `sort_code`, and `spei` on `FundingInstructions.bank_transfer.financial_addresses[]` and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[]`
  * Change type of `Order.payment.settings.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `OrderCreateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `OrderUpdateParams.payment.settings.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `PaymentIntent.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `PaymentIntentConfirmParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, `PaymentIntentCreateParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]`, and `PaymentIntentUpdateParams.payment_method_options.customer_balance.bank_transfer.requested_address_types[]` from `literal('zengin')` to `enum`
  * Add support for `custom_unit_amount` on `PriceCreateParams` and `Price`

## 20.127.0 - 2022-06-08
* [#1369](https://github.com/stripe/stripe-java/pull/1369) API Updates
  * Add support for `affirm`, `bancontact`, `card`, `ideal`, `p24`, and `sofort` on `Checkout.Session.payment_method_options` and `CheckoutSessionCreateParams.payment_method_options`
  * Add support for `afterpay_clearpay`, `au_becs_debit`, `bacs_debit`, `eps`, `fpx`, `giropay`, `grabpay`, `klarna`, `paynow`, and `sepa_debit` on `CheckoutSessionCreateParams.payment_method_options`
  * Add support for `setup_future_usage` on `Checkout.Session.payment_method_options.acss_debit`, `Checkout.Session.payment_method_options.afterpay_clearpay`, `Checkout.Session.payment_method_options.alipay`, `Checkout.Session.payment_method_options.au_becs_debit`, `Checkout.Session.payment_method_options.bacs_debit`, `Checkout.Session.payment_method_options.boleto`, `Checkout.Session.payment_method_options.eps`, `Checkout.Session.payment_method_options.fpx`, `Checkout.Session.payment_method_options.giropay`, `Checkout.Session.payment_method_options.grabpay`, `Checkout.Session.payment_method_options.klarna`, `Checkout.Session.payment_method_options.konbini`, `Checkout.Session.payment_method_options.oxxo`, `Checkout.Session.payment_method_options.paynow`, `Checkout.Session.payment_method_options.sepa_debit`, `Checkout.Session.payment_method_options.us_bank_account`, `CheckoutSessionCreateParams.payment_method_options.acss_debit`, `CheckoutSessionCreateParams.payment_method_options.alipay`, `CheckoutSessionCreateParams.payment_method_options.boleto`, `CheckoutSessionCreateParams.payment_method_options.konbini`, `CheckoutSessionCreateParams.payment_method_options.oxxo`, `CheckoutSessionCreateParams.payment_method_options.us_bank_account`, and `CheckoutSessionCreateParams.payment_method_options.wechat_pay`
  * Add support for `attach_to_self` on `SetupAttempt`, `SetupIntentCreateParams`, `SetupIntentListParams`, and `SetupIntentUpdateParams`
  * Add support for `flow_directions` on `SetupAttempt`, `SetupIntentCreateParams`, and `SetupIntentUpdateParams`

## 20.126.0 - 2022-06-02
* [#1367](https://github.com/stripe/stripe-java/pull/1367) API Updates
  * Add support for `create` test helper on `ReceivedCredit`.
  * Add support for `create` test helper on `ReceivedDebit`.
  * Deprecates the ability to directly create instances of inner `TestHelper` classes.

## 20.125.0 - 2022-06-01
* [#1366](https://github.com/stripe/stripe-java/pull/1366) API Updates
  * Add support for `radar_options` on `ChargeCreateParams`, `Charge`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethodCreateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `account_holder_name`, `account_number`, `account_type`, `bank_code`, `bank_name`, `branch_code`, and `branch_name` on `FundingInstructions.bank_transfer.financial_addresses[].zengin` and `PaymentIntent.next_action.display_bank_transfer_instructions.financial_addresses[].zengin`
  * Add support for new values `en-AU` and `en-NZ` on enums `OrderCreateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `OrderUpdateParams.payment.settings.payment_method_options.klarna.preferred_locale`, `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`
  * Change type of `Order.payment.settings.payment_method_options.customer_balance.bank_transfer.type` and `PaymentIntent.payment_method_options.customer_balance.bank_transfer.type` from `enum` to `literal('jp_bank_transfer')`
  * Add support for `network` on `SetupIntent.payment_method_options.card`
  * Add support for new value `simulated_wisepos_e` on enum `TerminalReaderListParams.device_type`

## 20.124.0 - 2022-05-26
* [#1363](https://github.com/stripe/stripe-java/pull/1363) API Updates
  * Add support for `affirm_payments` and `link_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `id_number_secondary` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
  * Add support for new value `affirm` on enum `CheckoutSessionCreateParams.payment_method_types[]`
  * Add support for `hosted_instructions_url` on `PaymentIntent.next_action.display_bank_transfer_instructions`
  * Add support for `id_number_secondary_provided` on `Person`
  * Add support for `card_issuing` on `TreasuryFinancialAccountCreateParams.features`, `TreasuryFinancialAccountUpdateFeaturesParams`, and `TreasuryFinancialAccountUpdateParams.features`

* [#1361](https://github.com/stripe/stripe-java/pull/1361) Fix version update script and the version in README.md
* [#1360](https://github.com/stripe/stripe-java/pull/1360) API Updates
  * Add support for `treasury` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`

## 20.123.0 - 2022-05-23
* [#1360](https://github.com/stripe/stripe-java/pull/1360) API Updates
  * Add support for `treasury` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`

## 20.122.0 - 2022-05-23
* [#1359](https://github.com/stripe/stripe-java/pull/1359) API Updates
  * Add support for new resource `Apps.Secret`
  * Add support for `affirm` on `Charge.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `link` on `Charge.payment_method_details`, `Mandate.payment_method_details`, `OrderCreateParams.payment.settings.payment_method_options`, `OrderUpdateParams.payment.settings.payment_method_options`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethodUpdateParams`, `PaymentMethod`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_data`, `SetupIntentCreateParams.payment_method_options`, `SetupIntentUpdateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_options`
  * Add support for new values `affirm` and `link` on enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * Add support for new value `link` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Add support for new values `affirm` and `link` on enums `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
  * Add support for new values `affirm` and `link` on enum `PaymentMethodCreateParams.type`
* [#1357](https://github.com/stripe/stripe-java/pull/1357) Revert master trigger
* [#1356](https://github.com/stripe/stripe-java/pull/1356) Temporary allow triggering docs push from master
* [#1355](https://github.com/stripe/stripe-java/pull/1355) Use github.actor as GRGIT_USER

## 20.121.0 - 2022-05-19
* [#1354](https://github.com/stripe/stripe-java/pull/1354) API Updates

  * Add support for new resources `Treasury.CreditReversal`, `Treasury.DebitReversal`, `Treasury.FinancialAccountFeatures`, `Treasury.FinancialAccount`, `Treasury.FlowDetails`, `Treasury.InboundTransfer`, `Treasury.OutboundPayment`, `Treasury.OutboundTransfer`, `Treasury.ReceivedCredit`, `Treasury.ReceivedDebit`, `Treasury.TransactionEntry`, and `Treasury.Transaction`
  * Add support for `retrieve_payment_method` method on resource `Customer`
  * Add support for `list_owners` and `list` methods on resource `FinancialConnections.Account`
  * Change `BillingPortalConfigurationCreateParams.features.customer_update.allowed_updates` to be optional
  * Add support for `afterpay_clearpay`, `au_becs_debit`, `bacs_debit`, `eps`, `fpx`, `giropay`, `grabpay`, `klarna`, `paynow`, and `sepa_debit` on `Checkout.Session.payment_method_options`
  * Add support for `treasury` on `Issuing.Authorization`, `Issuing.Dispute`, `Issuing.Transaction`, and `IssuingDisputeCreateParams`
  * Add support for `financial_account` on `Issuing.Card` and `IssuingCardCreateParams`
  * Add support for `client_secret` on `Order`
  * Add support for `networks` on `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account`, `PaymentMethod.us_bank_account`, `SetupIntentConfirmParams.payment_method_options.us_bank_account`, `SetupIntentCreateParams.payment_method_options.us_bank_account`, and `SetupIntentUpdateParams.payment_method_options.us_bank_account`
  * Add support for `attach_to_self` and `flow_directions` on `SetupIntent`
  * Add support for `save_default_payment_method` on `Subscription.payment_settings`, `SubscriptionCreateParams.payment_settings`, and `SubscriptionUpdateParams.payment_settings`
  * Add support for `czk` on `Terminal.Configuration.tipping`, `TerminalConfigurationCreateParams.tipping`, and `TerminalConfigurationUpdateParams.tipping`
  * Add support for new values `treasury.credit_reversal.created`, `treasury.credit_reversal.posted`, `treasury.debit_reversal.completed`, `treasury.debit_reversal.created`, `treasury.debit_reversal.initial_credit_granted`, `treasury.financial_account.closed`, `treasury.financial_account.created`, `treasury.financial_account.features_status_updated`, `treasury.inbound_transfer.canceled`, `treasury.inbound_transfer.created`, `treasury.inbound_transfer.failed`, `treasury.inbound_transfer.succeeded`, `treasury.outbound_payment.canceled`, `treasury.outbound_payment.created`, `treasury.outbound_payment.expected_arrival_date_updated`, `treasury.outbound_payment.failed`, `treasury.outbound_payment.posted`, `treasury.outbound_payment.returned`, `treasury.outbound_transfer.canceled`, `treasury.outbound_transfer.created`, `treasury.outbound_transfer.expected_arrival_date_updated`, `treasury.outbound_transfer.failed`, `treasury.outbound_transfer.posted`, `treasury.outbound_transfer.returned`, `treasury.received_credit.created`, `treasury.received_credit.failed`, `treasury.received_credit.reversed`, `treasury.received_credit.succeeded`, and `treasury.received_debit.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* [#1353](https://github.com/stripe/stripe-java/pull/1353) Update readme with new jar download URL
* [#1352](https://github.com/stripe/stripe-java/pull/1352) Finish automated Java releases
* [#1340](https://github.com/stripe/stripe-java/pull/1340) Publish Java package from Github actions

## 20.120.0 - 2022-05-11
* [#1351](https://github.com/stripe/stripe-java/pull/1351) API Updates
  * Add support for `description` on `CheckoutSessionCreateParams.subscription_data`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
  * Add support for `consent_collection`, `payment_intent_data`, `shipping_options`, `submit_type`, and `tax_id_collection` on `PaymentLinkCreateParams` and `PaymentLink`
  * Add support for `customer_creation` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
  * Add support for `metadata` on `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.phases[]`, and `SubscriptionScheduleUpdateParams.phases[]`
  * Add support for new value `billing_portal.session.created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* [#1350](https://github.com/stripe/stripe-java/pull/1350) API Updates
  * Add support for `amount_discount`, `amount_tax`, and `product` on `LineItem`

## 20.119.0 - 2022-05-05
* [#1349](https://github.com/stripe/stripe-java/pull/1349) API Updates
  * Add support for `default_price_data` on `ProductCreateParams`
  * Add support for `default_price` on `ProductUpdateParams` and `Product`
  * Add support for `instructions_email` on `RefundCreateParams` and `Refund`

## 20.118.0 - 2022-05-05
* [#1348](https://github.com/stripe/stripe-java/pull/1348) API Updates
  * Add support for new resources `FinancialConnections.AccountOwner`, `FinancialConnections.AccountOwnership`, `FinancialConnections.Account`, and `FinancialConnections.Session`
  * Add support for `financial_connections` on `Checkout.Session.payment_method_options.us_bank_account`, `CheckoutSessionCreateParams.payment_method_options.us_bank_account`, `Invoice.payment_settings.payment_method_options.us_bank_account`, `InvoiceCreateParams.payment_settings.payment_method_options.us_bank_account`, `InvoiceUpdateParams.payment_settings.payment_method_options.us_bank_account`, `PaymentIntent.payment_method_options.us_bank_account`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account`, `SetupIntent.payment_method_options.us_bank_account`, `SetupIntentConfirmParams.payment_method_options.us_bank_account`, `SetupIntentCreateParams.payment_method_options.us_bank_account`, `SetupIntentUpdateParams.payment_method_options.us_bank_account`, `Subscription.payment_settings.payment_method_options.us_bank_account`, `SubscriptionCreateParams.payment_settings.payment_method_options.us_bank_account`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.us_bank_account`
  * Add support for `financial_connections_account` on `PaymentIntentConfirmParams.payment_method_data.us_bank_account`, `PaymentIntentCreateParams.payment_method_data.us_bank_account`, `PaymentIntentUpdateParams.payment_method_data.us_bank_account`, `PaymentMethod.us_bank_account`, `PaymentMethodCreateParams.us_bank_account`, `SetupIntentConfirmParams.payment_method_data.us_bank_account`, `SetupIntentCreateParams.payment_method_data.us_bank_account`, and `SetupIntentUpdateParams.payment_method_data.us_bank_account`

* [#1347](https://github.com/stripe/stripe-java/pull/1347) API Updates
  * Add support for `registered_address` on `AccountCreateParams.individual`, `AccountUpdateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `Person`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`
  * Add support for `payment_method_data` on `SetupIntentConfirmParams`, `SetupIntentCreateParams`, and `SetupIntentUpdateParams`

## 20.117.0 - 2022-05-03
* [#1346](https://github.com/stripe/stripe-java/pull/1346) API Updates
  * Add support for new resource `CashBalance`
  * Change type of `BillingPortal.Configuration.application` from `$Application` to `deletable($Application)`
  * Add support for `alipay` on `Checkout.Session.payment_method_options` and `CheckoutSessionCreateParams.payment_method_options`
  * Add support for new value `eu_oss_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`
  * Add support for `cash_balance` on `Customer`
  * Add support for `application` on `Invoice`, `Quote`, `SubscriptionSchedule`, and `Subscription`

## 20.116.0 - 2022-04-21
* [#1345](https://github.com/stripe/stripe-java/pull/1345) API Updates
  * Add support for `expire` test helper method on resource `Refund`
  * Change type of `BillingPortal.Configuration.application` from `string` to `expandable($Application)`
  * Change `IssuingDisputeCreateParams.transaction` to be optional
* [#1342](https://github.com/stripe/stripe-java/pull/1342) Add null checks before streaming expandable IDs in setters.

## 20.115.0 - 2022-04-20
* [#1339](https://github.com/stripe/stripe-java/pull/1339) API Updates
  * Add support for new resources `FundingInstructions` and `Terminal.Configuration`
  * Add support for `create_funding_instructions` method on resource `Customer`
  * Add support for `customer_balance` on `Charge.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntent<Method>Params.payment_method_data`, `PaymentIntent<Method>Params.payment_method_options`, `PaymentMethodCreateParams`, and `PaymentMethod`
  * Add support for `cash_balance` on `CustomerCreateParams` and `CustomerUpdateParams`
  * Add support for new value `customer_balance` on enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodListParams.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, and `PaymentIntentUpdateParams.payment_method_data.type`
  * Add support for `amount_details` on `PaymentIntent`
  * Add support for `display_bank_transfer_instructions` on `PaymentIntent.next_action`
  * Add support for new value `customer_balance` on enum `PaymentMethodCreateParams.type`
  * Add support for `configuration_overrides` on `Terminal.Location`, `TerminalLocationCreateParams`, and `TerminalLocationUpdateParams`

## 20.114.0 - 2022-04-14
* [#1338](https://github.com/stripe/stripe-java/pull/1338) Add support for putExtraParam on EphemeralKeyCreateParams
* [#1336](https://github.com/stripe/stripe-java/pull/1336) API Updates
  * Add support for `increment_authorization` method on resource `PaymentIntent`
  * Add support for `incremental_authorization_supported` on `Charge.payment_method_details.card_present`
  * Add support for `request_incremental_authorization_support` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`

## 20.113.0 - 2022-04-08
* [#1335](https://github.com/stripe/stripe-java/pull/1335) API Updates
  * Add support for `apply_customer_balance` method on resource `PaymentIntent`
  * Add support for new value `cash_balance.funds_available` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 20.112.0 - 2022-04-01
* [#1333](https://github.com/stripe/stripe-java/pull/1333) API Updates
  * Add support for `bank_transfer_payments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `capture_before` on `Charge.payment_method_details.card_present`
  * Add support for `address` and `name` on `Checkout.Session.customer_details`
  * Add support for `customer_balance` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
  * Add support for new value `customer_balance` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Add support for `request_extended_authorization` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
  * Add support for new values `payment_intent.partially_funded`, `terminal.reader.action_failed`, and `terminal.reader.action_succeeded` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

* [#1331](https://github.com/stripe/stripe-java/pull/1331) Pin JDK version and always build using Java 18
  * This only impacts development and it's not a breaking change for users. We still support Java 1.8 and later.

## 20.111.0 - 2022-03-30
* [#1332](https://github.com/stripe/stripe-java/pull/1332) API Updates
  * Add support for `cancel_action`, `process_payment_intent`, `process_setup_intent`, and `set_reader_display` methods on resource `Terminal.Reader`
  * Add support for `action` on `Terminal.Reader`

## 20.110.0 - 2022-03-28
* [#1330](https://github.com/stripe/stripe-java/pull/1330) API Updates
  * Add support for Search API
    * Add support for `search` method on resources `Charge`, `Customer`, `Invoice`, `PaymentIntent`, `Price`, `Product`, and `Subscription`

## 20.109.0 - 2022-03-25
* [#1329](https://github.com/stripe/stripe-java/pull/1329) API Updates
  * Add support for PayNow and US Bank Accounts Debits payments
      * **Charge** ([API ref](https://stripe.com/docs/api/charges/object#charge_object-payment_method_details))
          * Add support for `paynow` and `us_bank_account` on `Charge.payment_method_details`
      * **Customer** ([API ref](https://stripe.com/docs/api/payment_methods/customer_list#list_customer_payment_methods-type))
          * Add support for new values `paynow` and `us_bank_account` on enum `CustomerListPaymentMethodsParams.type`
      * **Mandate** ([API ref](https://stripe.com/docs/api/mandates/object#mandate_object-payment_method_details))
          * Add support for `us_bank_account` on `Mandate.payment_method_details`
      * **Payment Intent** ([API ref](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-payment_method_options))
          * Add support for `paynow` and `us_bank_account` on `payment_method_options` on `PaymentIntent`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, and `PaymentIntentConfirmParams`
          * Add support for `paynow` and `us_bank_account` on `payment_method_data` on `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, and `PaymentIntentConfirmParams`
          * Add support for `paynow_display_qr_code` on `PaymentIntent.next_action`
          * Add support for new values `paynow` and `us_bank_account` on enums `payment_method_data.type` on `PaymentIntentCreateParams`, and `PaymentIntentUpdateParams`, and `PaymentIntentConfirmParams`
      * **Setup Intent** ([API ref](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-payment_method_options))
          * Add support for `us_bank_account` on `payment_method_options` on `SetupIntent`, `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntentConfirmParams`
      * **Setup Attempt** ([API ref](https://stripe.com/docs/api/setup_attempts/object#setup_attempt_object-payment_method_details))
          * Add support for `us_bank_account` on `SetupAttempt.payment_method_details`
      * **Payment Method** ([API ref](https://stripe.com/docs/api/payment_methods/object#payment_method_object-paynow))
          * Add support for `paynow` and `us_bank_account` on `PaymentMethod` and `PaymentMethodCreateParams`
          * Add support for `us_bank_account` on `PaymentMethodUpdateParams`
          * Add support for new values `paynow` and `us_bank_account` on enums `PaymentMethod.type`, `PaymentMethodCreateParams.type`. and `PaymentMethodListParams.type`
      * **Checkout Session** ([API ref](https://stripe.com/docs/api/checkout/sessions/create#create_checkout_session-payment_method_types))
          * Add support for `us_bank_account` on `payment_method_options` on `Checkout.Session` and `CheckoutSessionCreateParams`
          * Add support for new values `paynow` and `us_bank_account` on enum `CheckoutSessionCreateParams.payment_method_types[]`
      * **Invoice** ([API ref](https://stripe.com/docs/api/invoices/object#invoice_object-payment_settings-payment_method_types))
          * Add support for `us_bank_account` on `payment_settings.payment_method_options` on `Invoice`, `InvoiceCreateParams`, and `InvoiceUpdateParams`
          * Add support for new values `paynow` and `us_bank_account` on enums `payment_settings.payment_method_types[]` on `Invoice`, `InvoiceCreateParams`, and `InvoiceUpdateParams`
      * **Subscription** ([API ref](https://stripe.com/docs/api/subscriptions/object#subscription_object-payment_settings-payment_method_types))
          * Add support for `us_bank_account` on `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
          * Add support for new values `paynow` and `us_bank_account` on enums `payment_settings.payment_method_types[]` on `Subscription`, `SubscriptionCreateParams`, and `SubscriptionUpdateParams`
      * **Account capabilities** ([API ref](https://stripe.com/docs/api/accounts/object#account_object-capabilities))
          * Add support for `paynow_payments` on `capabilities` on `Account`, `AccountCreateParams`, and `AccountUpdateParams`
  * Add support for `failure_balance_transaction` on `Charge`
  * Add support for `capture_method` on `afterpay_clearpay`, `card`, and `klarna` on `payment_method_options` on
  `PaymentIntent`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, and `PaymentIntentConfirmParams` ([API ref](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-payment_method_options-afterpay_clearpay-capture_method))
  * Add additional support for verify microdeposits on Payment Intent and Setup Intent ([API ref](https://stripe.com/docs/api/payment_intents/verify_microdeposits))
      * Add support for `microdeposit_type` on `next_action.verify_with_microdeposits` on `PaymentIntent` and `SetupIntent`
      * Add support for `descriptor_code` on `PaymentIntentVerifyMicrodepositsParams` and `SetupIntentVerifyMicrodepositsParams`
  * Add support for `test_clock` on `SubscriptionListParams` ([API ref](https://stripe.com/docs/api/subscriptions/list#list_subscriptions-test_clock))

## 20.108.0 - 2022-03-23
* [#1328](https://github.com/stripe/stripe-java/pull/1328) API Updates
  * Add support for `cancel` method on resource `Refund`
  * Add support for new values `bg_uic`, `hu_tin`, and `si_tin` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`
  * Add support for `test_clock` on `QuoteListParams`
  * Add support for new values `test_helpers.test_clock.advancing`, `test_helpers.test_clock.created`, `test_helpers.test_clock.deleted`, `test_helpers.test_clock.internal_failure`, and `test_helpers.test_clock.ready` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 20.107.0 - 2022-03-18
* [#1327](https://github.com/stripe/stripe-java/pull/1327) API Updates
  * Add support for `status` on `Card`
* [#1322](https://github.com/stripe/stripe-java/pull/1322) Upgrade GSON dependency to 2.9.0
* [#1326](https://github.com/stripe/stripe-java/pull/1326) Update SearchResult pagination to match new API shape. This is a breaking change but the object shape is not exposed in the API currently and is therefore not being used.

## 20.106.0 - 2022-03-11
* [#1324](https://github.com/stripe/stripe-java/pull/1324) API Updates
  * Add support for `mandate` on `Charge.payment_method_details.card`
  * Add support for `mandate_options` on `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntent.payment_method_options.card`, `SetupIntentCreateParams.payment_method_options.card`, `SetupIntentUpdateParams.payment_method_options.card`, `SetupIntentConfirmParams.payment_method_options.card`, and `SetupIntent.payment_method_options.card`
  * Add support for `card_await_notification` on `PaymentIntent.next_action`
  * Add support for `customer_notification` on `PaymentIntent.processing.card`
  * Change `PaymentLinkCreateParams.line_items` to be required
* [#1321](https://github.com/stripe/stripe-java/pull/1321) Delete PaymentIntentTypeSpecificPaymentMethodOptionsClient.java

## 20.105.0 - 2022-03-09
* [#1323](https://github.com/stripe/stripe-java/pull/1323) API Updates
  * Add support for `test_clock` on `CustomerListParams`

## 20.104.0 - 2022-03-02
* [#1320](https://github.com/stripe/stripe-java/pull/1320) API Updates
  * Add support for new resources `CreditedItems` and `ProrationDetails`
  * Add support for `proration_details` on `InvoiceLineItem`

## 20.103.0 - 2022-03-01
* [#1319](https://github.com/stripe/stripe-java/pull/1319) API Updates
  * Add support for `deletes_after` on `TestHelpers.TestClock`
* [#1318](https://github.com/stripe/stripe-java/pull/1318) API Updates
  * Add support for new resource `TestHelpers.TestClock`
  * Add support for `test_clock` on `CustomerCreateParams`, `Customer`, `Invoice`, `InvoiceItem`, `QuoteCreateParams`, `Quote`, `Subscription`, and `SubscriptionSchedule`
  * Add support for `pending_invoice_items_behavior` on `InvoiceCreateParams`
  * Change type of `ProductUpdateParams.url` from `string` to `emptyStringable(string)`
  * Add support for `next_action` on `Refund`

## 20.102.0 - 2022-02-25
* [#1315](https://github.com/stripe/stripe-java/pull/1315) API Updates
  * Add support for `konbini_payments` on `AccountUpdateParams.capabilities`, `AccountCreateParams.capabilities`, and `Account.capabilities`
  * Add support for .payment_method_options.konbini and .payment_method_data.konbini on the PaymentIntent API.
  * Add support for .payment_settings.payment_method_options.konbini on the Invoice API.
  * Add support for .payment_method_options.konbini on the Subscription API
  * Add support for .payment_method_options.konbini on the CheckoutSession API
  * Add support for `konbini_display_details` on `PaymentIntent.next_action`

## 20.101.0 - 2022-02-23
* [#1313](https://github.com/stripe/stripe-java/pull/1313) API Updates
  * Add support for `setup_future_usage` on `PaymentIntentCreateParams.payment_method_options.acss_debit`, `PaymentIntentCreateParams.payment_method_options.afterpay_clearpay`, `PaymentIntentCreateParams.payment_method_options.alipay`, `PaymentIntentCreateParams.payment_method_options.au_becs_debit`, `PaymentIntentCreateParams.payment_method_options.bacs_debit`, `PaymentIntentCreateParams.payment_method_options.bancontact`, `PaymentIntentCreateParams.payment_method_options.boleto`, `PaymentIntentCreateParams.payment_method_options.eps`, `PaymentIntentCreateParams.payment_method_options.fpx`, `PaymentIntentCreateParams.payment_method_options.giropay`, `PaymentIntentCreateParams.payment_method_options.grabpay`, `PaymentIntentCreateParams.payment_method_options.ideal`, `PaymentIntentCreateParams.payment_method_options.klarna`, `PaymentIntentCreateParams.payment_method_options.oxxo`, `PaymentIntentCreateParams.payment_method_options.p24`, `PaymentIntentCreateParams.payment_method_options.sepa_debit`, `PaymentIntentCreateParams.payment_method_options.sofort`, `PaymentIntentCreateParams.payment_method_options.wechat_pay`, `PaymentIntentUpdateParams.payment_method_options.acss_debit`, `PaymentIntentUpdateParams.payment_method_options.afterpay_clearpay`, `PaymentIntentUpdateParams.payment_method_options.alipay`, `PaymentIntentUpdateParams.payment_method_options.au_becs_debit`, `PaymentIntentUpdateParams.payment_method_options.bacs_debit`, `PaymentIntentUpdateParams.payment_method_options.bancontact`, `PaymentIntentUpdateParams.payment_method_options.boleto`, `PaymentIntentUpdateParams.payment_method_options.eps`, `PaymentIntentUpdateParams.payment_method_options.fpx`, `PaymentIntentUpdateParams.payment_method_options.giropay`, `PaymentIntentUpdateParams.payment_method_options.grabpay`, `PaymentIntentUpdateParams.payment_method_options.ideal`, `PaymentIntentUpdateParams.payment_method_options.klarna`, `PaymentIntentUpdateParams.payment_method_options.oxxo`, `PaymentIntentUpdateParams.payment_method_options.p24`, `PaymentIntentUpdateParams.payment_method_options.sepa_debit`, `PaymentIntentUpdateParams.payment_method_options.sofort`, `PaymentIntentUpdateParams.payment_method_options.wechat_pay`, `PaymentIntentConfirmParams.payment_method_options.acss_debit`, `PaymentIntentConfirmParams.payment_method_options.afterpay_clearpay`, `PaymentIntentConfirmParams.payment_method_options.alipay`, `PaymentIntentConfirmParams.payment_method_options.au_becs_debit`, `PaymentIntentConfirmParams.payment_method_options.bacs_debit`, `PaymentIntentConfirmParams.payment_method_options.bancontact`, `PaymentIntentConfirmParams.payment_method_options.boleto`, `PaymentIntentConfirmParams.payment_method_options.eps`, `PaymentIntentConfirmParams.payment_method_options.fpx`, `PaymentIntentConfirmParams.payment_method_options.giropay`, `PaymentIntentConfirmParams.payment_method_options.grabpay`, `PaymentIntentConfirmParams.payment_method_options.ideal`, `PaymentIntentConfirmParams.payment_method_options.klarna`, `PaymentIntentConfirmParams.payment_method_options.oxxo`, `PaymentIntentConfirmParams.payment_method_options.p24`, `PaymentIntentConfirmParams.payment_method_options.sepa_debit`, `PaymentIntentConfirmParams.payment_method_options.sofort`, `PaymentIntentConfirmParams.payment_method_options.wechat_pay`, `PaymentIntent.payment_method_options.acss_debit`, `PaymentIntent.payment_method_options.afterpay_clearpay`, `PaymentIntent.payment_method_options.alipay`, `PaymentIntent.payment_method_options.au_becs_debit`, `PaymentIntent.payment_method_options.bacs_debit`, `PaymentIntent.payment_method_options.bancontact`, `PaymentIntent.payment_method_options.boleto`, `PaymentIntent.payment_method_options.eps`, `PaymentIntent.payment_method_options.fpx`, `PaymentIntent.payment_method_options.giropay`, `PaymentIntent.payment_method_options.grabpay`, `PaymentIntent.payment_method_options.ideal`, `PaymentIntent.payment_method_options.klarna`, `PaymentIntent.payment_method_options.oxxo`, `PaymentIntent.payment_method_options.p24`, `PaymentIntent.payment_method_options.sepa_debit`, `PaymentIntent.payment_method_options.sofort`, and `PaymentIntent.payment_method_options.wechat_pay`
  * Add support for new values `bbpos_wisepad3` and `stripe_m2` on enum `TerminalReaderListParams.device_type`
  * Add generated test for the endpoints introduced in #1312

## 20.100.0 - 2022-02-16
* [#1312](https://github.com/stripe/stripe-java/pull/1312) API Updates
  * Add support for `verify_microdeposits` method on resources `PaymentIntent` and `SetupIntent`
  * Add support for new value `grabpay` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]
  `
* [#1311](https://github.com/stripe/stripe-java/pull/1311) Pin grgit version to 4.1.1.
* [#1310](https://github.com/stripe/stripe-java/pull/1310) API Updates
  * Add support for `pin` on `IssuingCardUpdateParams`

## 20.99.0 - 2022-02-03
* [#1307](https://github.com/stripe/stripe-java/pull/1307) API Updates
  * Add support for new value `au_becs_debit` on enum `CheckoutSessionCreateParams.payment_method_types[]`

## 20.98.0 - 2022-01-25
* [#1306](https://github.com/stripe/stripe-java/pull/1306) API Updates
  * Add support for `phone_number_collection` on `PaymentLinkCreateParams` and `PaymentLink`
  * Add support for new values `payment_link.created` and `payment_link.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
  * Add support for new value `is_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`

## 20.97.0 - 2022-01-20
* [#1304](https://github.com/stripe/stripe-java/pull/1304) API Updates
  * Add support for new resource `PaymentLink`
  * Add support for `payment_link` on `Checkout.Session`

## 20.96.0 - 2022-01-19
* [#1302](https://github.com/stripe/stripe-java/pull/1302) API Updates
  * Add support for `bacs_debit` and `eps` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
  * Add support for `image_url_png` and `image_url_svg` on `PaymentIntent.next_action.wechat_pay_display_qr_code`

## 20.95.0 - 2022-01-12
* [#1301](https://github.com/stripe/stripe-java/pull/1301) API Updates
  * Add support for `customer_creation` on `CheckoutSessionCreateParams` and `Checkout.Session`
  * Add support for `fpx` and `grabpay` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
  * Add support for `PaidOutOfBand` on `Invoice`
* [#1300](https://github.com/stripe/stripe-java/pull/1300) API Updates
  * Add support for `mandate_options` on `SubscriptionCreateParams.payment_settings.payment_method_options.card`, `SubscriptionUpdateParams.payment_settings.payment_method_options.card`, and `Subscription.payment_settings.payment_method_options.card`

## 20.94.0 - 2021-12-22
* [#1299](https://github.com/stripe/stripe-java/pull/1299) API Updates
  * Add support for `au_becs_debit` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`

* [#1298](https://github.com/stripe/stripe-java/pull/1298) API Updates
  * Add support for new values `en-FR`, `es-US`, and `fr-FR` on enums `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`
  * Add support for `boleto` on `SetupAttempt.payment_method_details`

* [#1297](https://github.com/stripe/stripe-java/pull/1297) API Updates
  * Add support for `processing` on `PaymentIntent`

## 20.93.0 - 2021-12-15
* [#1296](https://github.com/stripe/stripe-java/pull/1296) API Updates
  * Add support for new resource `PaymentIntentTypeSpecificPaymentMethodOptionsClient`
  * Add support for `setup_future_usage` on `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, and `PaymentIntent.payment_method_options.card`

## 20.92.0 - 2021-12-09
* [#1295](https://github.com/stripe/stripe-java/pull/1295) API Updates
  * Add support for `metadata` on `BillingPortalConfigurationCreateParams`, `BillingPortalConfigurationUpdateParams`, and `BillingPortal.Configuration`

## 20.91.0 - 2021-12-09
* [#1294](https://github.com/stripe/stripe-java/pull/1294) API Updates
  * Add support for new values `ge_vat` and `ua_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`
  * Change type of `PaymentIntentCreateParams.payment_method_data.billing_details.email`, `PaymentIntentUpdateParams.payment_method_data.billing_details.email`, `PaymentIntentConfirmParams.payment_method_data.billing_details.email`, `PaymentMethodCreateParams.billing_details.email`, and `PaymentMethodUpdateParams.billing_details.email` from `string` to `emptyStringable(string)`
  * Add support for `giropay` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
  * Add support for new value `en-IE` on enums `PaymentIntentCreateParams.payment_method_options.klarna.preferred_locale`, `PaymentIntentUpdateParams.payment_method_options.klarna.preferred_locale`, and `PaymentIntentConfirmParams.payment_method_options.klarna.preferred_locale`
* [#1291](https://github.com/stripe/stripe-java/pull/1291) Test Java 16 and 17
* [#1292](https://github.com/stripe/stripe-java/pull/1292) Pass credentials to nexusStaging rule.
* [#1290](https://github.com/stripe/stripe-java/pull/1290) Update Javadoc task to not use module directories.

## 20.90.0 - 2021-11-19
* [#1289](https://github.com/stripe/stripe-java/pull/1289) API Updates
  * Add support for `wallets` on `Issuing.Card`
* [#1288](https://github.com/stripe/stripe-java/pull/1288) API Updates
  * Add support for `interac_present` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`
  * Add support for new value `jct` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

## 20.89.0 - 2021-11-17
* [#1286](https://github.com/stripe/stripe-java/pull/1286) API Updates
  * Add support for `automatic_payment_methods` on `PaymentIntentCreateParams` and `PaymentIntent`

## 20.88.0 - 2021-11-16
* [#1284](https://github.com/stripe/stripe-java/pull/1284) API Updates
  * Add support for new resource `ShippingRate`
  * Add support for `shipping_options` on `CheckoutSessionCreateParams` and `Checkout.Session`
  * Add support for `shipping_rate` on `Checkout.Session`

## 20.87.0 - 2021-11-11
* [#1281](https://github.com/stripe/stripe-java/pull/1281) API Updates
  * Add support for `expire` method on resource `Checkout.Session`
  * Add support for `status` on `Checkout.Session`

## 20.86.1 - 2021-11-04
* [#1279](https://github.com/stripe/stripe-java/pull/1279) API Updates
  * Remove support for `ownership_declaration_shown_and_signed` on `TokenCreateParams.account`. This API was unused.
  * Add support for `ownership_declaration_shown_and_signed` on `TokenCreateParams.account.company`

## 20.86.0 - 2021-11-01
* [#1278](https://github.com/stripe/stripe-java/pull/1278) API Updates
  * Add support for `ownership_declaration` on `AccountUpdateParams.company`, `AccountCreateParams.company`, `Account.company`, and `TokenCreateParams.account.company`
  * Add support for `proof_of_registration` on `AccountUpdateParams.documents` and `AccountCreateParams.documents`
  * Add support for `ownership_declaration_shown_and_signed` on `TokenCreateParams.account`

## 20.85.0 - 2021-10-20
* [#1275](https://github.com/stripe/stripe-java/pull/1275) Reorder fields
* [#1274](https://github.com/stripe/stripe-java/pull/1274) API Updates
  * Add support for `buyer_id` on `Charge.payment_method_details.alipay`

## 20.84.0 - 2021-10-15
* [#1273](https://github.com/stripe/stripe-java/pull/1273) API Updates
  * Change type of `UsageRecordCreateParams.timestamp` from `integer` to `literal('now') | integer`
  * Change `UsageRecordCreateParams.timestamp` to be optional

## 20.83.0 - 2021-10-14
* [#1272](https://github.com/stripe/stripe-java/pull/1272) API Updates
  * Add support for new value `klarna` on enum `CheckoutSessionCreateParams.payment_method_types[]`

## 20.82.0 - 2021-10-11
* [#1271](https://github.com/stripe/stripe-java/pull/1271) API Updates
  * Add support for `payment_method_category` and `preferred_locale` on `Charge.payment_method_details.klarna`
  * Add support for new value `klarna` on enums `CustomerListPaymentMethodsParams.type` and `PaymentMethodListParams.type`
  * Add support for `klarna` on `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntent.payment_method_options`, `PaymentMethodCreateParams`, and `PaymentMethod`
  * Add support for new value `klarna` on enums `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, and `PaymentIntentConfirmParams.payment_method_data.type`
  * Add support for new value `klarna` on enum `PaymentMethodCreateParams.type`

## 20.81.0 - 2021-10-11
* [#1269](https://github.com/stripe/stripe-java/pull/1269) API Updates
  * Add support for `list_payment_methods` method on resource `Customer`

## 20.80.0 - 2021-10-07
* [#1268](https://github.com/stripe/stripe-java/pull/1268) API Updates
  * Add support for `phone_number_collection` on `CheckoutSessionCreateParams` and `Checkout.Session`
  * Add support for `phone` on `Checkout.Session.customer_details`
  * Change `PaymentMethodListParams.customer` to be optional
  * Add support for new value `customer_id` on enum `RadarValueListCreateParams.item_type`
  * Add support for new value `bbpos_wisepos_e` on enum `TerminalReaderListParams.device_type`

## 20.79.0 - 2021-09-29
* [#1266](https://github.com/stripe/stripe-java/pull/1266) API Updates
  * Add support for `klarna_payments` on `AccountUpdateParams.capabilities`, `AccountCreateParams.capabilities`, and `Account.capabilities`

## 20.78.0 - 2021-09-24
* [#1265](https://github.com/stripe/stripe-java/pull/1265) API Updates
  * Add support for `amount_authorized` and `overcapture_supported` on `Charge.payment_method_details.card_present`

* [#1261](https://github.com/stripe/stripe-java/pull/1261) Upgrade Gradle
* [#1209](https://github.com/stripe/stripe-java/pull/1209) Fix typo in README.md

## 20.77.0 - 2021-09-16
* [#1264](https://github.com/stripe/stripe-java/pull/1264) API Updates
  * Add support for `full_name_aliases` on `AccountUpdateParams.individual`, `AccountCreateParams.individual`, `PersonCreateParams`, `PersonUpdateParams`, `Person`, `TokenCreateParams.account.individual`, and `TokenCreateParams.person`

## 20.76.0 - 2021-09-15
* [#1263](https://github.com/stripe/stripe-java/pull/1263) API Updates
  * Add support for `default_for` on `CheckoutSessionCreateParams.payment_method_options.acss_debit.mandate_options`, `Checkout.Session.payment_method_options.acss_debit.mandate_options`, `Mandate.payment_method_details.acss_debit`, `SetupIntentCreateParams.payment_method_options.acss_debit.mandate_options`, `SetupIntentUpdateParams.payment_method_options.acss_debit.mandate_options`, `SetupIntentConfirmParams.payment_method_options.acss_debit.mandate_options`, and `SetupIntent.payment_method_options.acss_debit.mandate_options`
  * Add support for `acss_debit` on `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `Invoice.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options`, and `Subscription.payment_settings.payment_method_options`
  * Add support for new value `acss_debit` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `SubscriptionCreateParams.payment_settings.payment_method_types[]`, and `SubscriptionUpdateParams.payment_settings.payment_method_types[]`
  * Add support for `livemode` on `Reporting.ReportType`

## 20.75.0 - 2021-09-09
* [#1259](https://github.com/stripe/stripe-java/pull/1259) Add missing constant for `account_requirement` as a `purpose` on File create and List APIs

## 20.74.0 - 2021-09-07
* [#1257](https://github.com/stripe/stripe-java/pull/1257) API Updates
  * Add support for new value `rst` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`
  * Add support for new value `checkout.session.expired` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

## 20.73.0 - 2021-09-03
* [#1255](https://github.com/stripe/stripe-java/pull/1255) API Updates
  * Add support for `future_requirements` on `Account`, `Capability`, and `Person`
  * Add support for `alternatives` on `Account.requirements`, `Capability.requirements`, and `Person.requirements`

## 20.72.0 - 2021-09-01
* [#1254](https://github.com/stripe/stripe-java/pull/1254) API Updates
  * Add support for `after_expiration`, `consent_collection`, and `expires_at` on `CheckoutSessionCreateParams` and `Checkout.Session`
  * Add support for `consent` and `recovered_from` on `Checkout.Session`
* [#1252](https://github.com/stripe/stripe-java/pull/1252) Add support for auto-paginatable `SearchResult` type

## 20.71.0 - 2021-08-27
* [#1250](https://github.com/stripe/stripe-java/pull/1250) API Updates
  * Add support for `cancellation_reason` on `BillingPortalConfigurationCreateParams.features.subscription_cancel`, `BillingPortalConfigurationUpdateParams.features.subscription_cancel`, and `BillingPortal.Configuration.features.subscription_cancel`

## 20.70.0 - 2021-08-19
* [#1249](https://github.com/stripe/stripe-java/pull/1249) API Updates
  * Add support for new value `fil` on enum `CheckoutSessionCreateParams.locale`
  * Add support for new value `au_arn` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`

## 20.69.0 - 2021-08-11
* [#1248](https://github.com/stripe/stripe-java/pull/1248) API Updates
  * Add support for `locale` on `BillingPortalSessionCreateParams` and `BillingPortal.Session`

## 20.68.0 - 2021-08-04
* [#1246](https://github.com/stripe/stripe-java/pull/1246) API Updates
  * Change type of `PaymentIntentCreateParams.payment_method_options.sofort.preferred_language`, `PaymentIntentUpdateParams.payment_method_options.sofort.preferred_language`, and `PaymentIntentConfirmParams.payment_method_options.sofort.preferred_language` from `enum` to `emptyStringable(enum)`

## 20.67.0 - 2021-07-28
* [#1242](https://github.com/stripe/stripe-java/pull/1242) API Updates
  * Add support for `account_type` on `BankAccount`, `ExternalAccountUpdateParams`, and `TokenCreateParams.bank_account`
* [#1241](https://github.com/stripe/stripe-java/pull/1241) API Updates
  * Add support for `category_code` on `Issuing.Authorization.merchant_data` and `Issuing.Transaction.merchant_data`

## 20.66.0 - 2021-07-22
* [#1239](https://github.com/stripe/stripe-java/pull/1239) API Updates
  * Add support for new values `hr`, `ko`, and `vi` on enum `CheckoutSessionCreateParams.locale`
  * Add support for `payment_settings` on `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`

## 20.65.0 - 2021-07-20
* [#1238](https://github.com/stripe/stripe-java/pull/1238) API Updates
  * Add support for `wallet` on `Issuing.Transaction`
  * Add support for `ideal` on `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, and `PaymentIntent.payment_method_options`

## 20.64.0 - 2021-07-14
* [#1237](https://github.com/stripe/stripe-java/pull/1237) API Updates
  * Add support for `quote.accepted`, `quote.canceled`, `quote.created`, and `quote.finalized` events.
* [#1236](https://github.com/stripe/stripe-java/pull/1236) API Updates
  * Add support for `list_computed_upfront_line_items` method on resource `Quote`

## 20.63.1 - 2021-07-09
* [#1233](https://github.com/stripe/stripe-java/pull/1233) Remove inappropriate list method from QuoteCollection

## 20.63.0 - 2021-07-09
* [#1231](https://github.com/stripe/stripe-java/pull/1231) API Updates
  * Add support for new resource `Quote`
  * Add support for `quote` on `Invoice`

## 20.62.0 - 2021-06-30
* [#1229](https://github.com/stripe/stripe-java/pull/1229) API Updates
  * Add support for new value `boleto` on enums `InvoiceCreateParams.payment_settings.payment_method_types[]`, and `InvoiceUpdateParams.payment_settings.payment_method_types[]`.

## 20.61.0 - 2021-06-30
* [#1228](https://github.com/stripe/stripe-java/pull/1228) API Updates
  * Add support for `wechat_pay` on `Charge.payment_method_details`, `CheckoutSessionCreateParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntent.payment_method_options`, `PaymentMethodCreateParams`, and `PaymentMethod`
  * Add support for new value `wechat_pay` on enums `CheckoutSessionCreateParams.payment_method_types[]` `InvoiceCreateParams.payment_settings.payment_method_types[]`, `InvoiceUpdateParams.payment_settings.payment_method_types[]`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`,`PaymentIntentConfirmParams.payment_method_data.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
  * Add support for `wechat_pay_display_qr_code`, `wechat_pay_redirect_to_android_app`, and `wechat_pay_redirect_to_ios_app` on `PaymentIntent.next_action`

## 20.60.0 - 2021-06-29
* [#1227](https://github.com/stripe/stripe-java/pull/1227) API Updates
  * Added support for `boleto_payments` on `Account.capabilities`
  * Added support for `boleto` and `oxxo` on `SessionCreateParams` and `Session`
* [#1207](https://github.com/stripe/stripe-java/pull/1207) Streaming requests

## 20.59.0 - 2021-06-25
* [#1225](https://github.com/stripe/stripe-java/pull/1225) API Updates
  * Added support for `boleto` on `PaymentMethodCreateParams`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `Charge.payment_method_details` and `PaymentMethod`
  * `PaymentMethodListParams.type`, `PaymentMethodCreateParams.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`  added new enum members: `boleto`
  * Added support for `boleto_display_details` on `PaymentIntent.next_action`
  * `TaxIdCreateParams.type`, `InvoiceLineItemListUpcomingParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, and `CustomerCreateParams.tax_id_data[].type`, added new enum members: `il_vat`.
* [#1218](https://github.com/stripe/stripe-java/pull/1218) Remove Travis CI

## 20.58.0 - 2021-06-18
* [#1222](https://github.com/stripe/stripe-java/pull/1222) API Updates
  * Add support for new TaxId types: `ca_pst_mb`, `ca_pst_bc`, `ca_gst_hst`, and `ca_pst_sk`.

## 20.57.0 - 2021-06-16
* [#1221](https://github.com/stripe/stripe-java/pull/1221) API Updates
  * Add support for `url` on Checkout `Session`

## 20.56.0 - 2021-06-07
* [#1219](https://github.com/stripe/stripe-java/pull/1219) API Updates
  * Added support for `TaxIdCollection` on `SessionCreateParams` and `Session.taxIdCollection`
  * Update `Location` to be expandable on `Reader`

## 20.55.0 - 2021-06-04
* [#1217](https://github.com/stripe/stripe-java/pull/1217) API Updates
  * Added support for `controller` on `Account`

## 20.54.0 - 2021-06-04
* [#1215](https://github.com/stripe/stripe-java/pull/1215) API Updates
  * Add support for new `TaxCode` API.
  * Add support for `tax_code` on `Product`, `ProductCreateParams`, `ProductUpdateParams`, `PriceCreateParams.product_data`, `PlanCreateParams.product`, and Checkout `SessionCreateParams.line_items[].price_data.product_data`.
  * Add support for `tax` to `Customer`, `CustomerCreateParams`, `CustomerUpdateParams`.
  * Add support for `default_settings[automatic_tax]` and `phases[].automatic_tax` on `SubscriptionSchedule`, `SubscriptionScheduleCreateParams`, and `SubscriptionScheduleUpdateParams`.
  * Add support for `automatic_tax` on `Subscription`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`; `Invoice`, `InvoiceCreateParams`, and `InvoiceUpcomingParams`; Checkout `Session` and Checkout `SessionCreateParams`.
  * Add support for `tax_behavior` to `Price`, `PriceCreateParams`, `PriceUpdateParams` and to the many Param objects that contain `price_data`:
      - `SubscriptionScheduleCreateParams` and `SubscriptionScheduleUpdateParams`, beneath `phases[].add_invoice_items[]` and `phases[].items[]`
      - `SubscriptionItemCreateParams` and `SubscriptionItemUpdateParams`, on the top-level
      - `SubscriptionCreateParams` create and `UpdateCreateParams`, beneath `items[]` and `add_invoice_items[]`
      - `InvoiceItemCreateParams` and `InvoiceItemUpdateParams`,  on the top-level
      - `InvoiceUpcomingParams` and `InvoiceUpcomingLinesParams` beneath `subscription_items[]` and `invoice_items[]`.
      - Checkout `SessionCreateParams`, beneath `line_items[]`.
  * Add support for `customer_update` to Checkout `SessionCreateParams`.
  * Add support for `customer_details` to `InvoiceUpcomingParams`.
  * Add support for `tax_type` to `TaxRate`, `TaxRateCreateParams`, and `TaxRateUpdateParams`.

## 20.53.0 - 2021-06-02
* [#1214](https://github.com/stripe/stripe-java/pull/1214) API Updates
  * Added support for `llc`, `free_zone_llc`, `free_zone_establishment` and `sole_establishment` to the `structure` enum on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company` and `TokenCreateParams.account.company`.

## 20.52.0 - 2021-05-26
* [#1212](https://github.com/stripe/stripe-java/pull/1212) API Updates
  * Added support for `documents` on `PersonUpdateParams`, `PersonCollectionCreateParams` and `TokenCreateParams.person`

## 20.51.0 - 2021-05-19
* [#1211](https://github.com/stripe/stripe-java/pull/1211), [#1205](https://github.com/stripe/stripe-java/pull/1205) API Updates
  * Add support for the `Identity.VerificationSession` and `Identity.VerificationReport` APIs.
* [#1206](https://github.com/stripe/stripe-java/pull/1206) API Updates
  * Add support for setting `AccountUpdateParams.business_profile.support_url` and `AccountCreateParams.support_url` to `EmptyParam`.

## 20.50.0 - 2021-05-06
* [#1204](https://github.com/stripe/stripe-java/pull/1204) API Updates
  * Add support for `reference` on `Charge.payment_method_details.afterpay_clearpay`
  * Add support for `afterpay_clearpay` on `PaymentIntent.payment_method_options`
* [#1203](https://github.com/stripe/stripe-java/pull/1203) Fix flaky test: no telemetry by default in test suite

## 20.49.0 - 2021-05-05
* [#1202](https://github.com/stripe/stripe-java/pull/1202) API Updates
  * Add support for `payment_intent` on `EarlyFraudWarning`

## 20.48.0 - 2021-05-05
* [#1201](https://github.com/stripe/stripe-java/pull/1201) API Updates
  * Add support for `card_present` on `PaymentIntent.payment_method_options`
  * Add support for `default_incomplete` as a `payment_behavior` on `SubscriptionItemCreateParams`, `SubscriptionUpdateParams`, and `SubscriptionCreateParams`.
  * Add support for `single_member_llc` as a `structure` on `AccountCreateParams.company` and `AccountUpdateParams.company`.

## 20.47.1 - 2021-04-22
* [#1197](https://github.com/stripe/stripe-java/pull/1197) Fix GSON error in JDK16 (#1190) by marking RequestOptions transient

## 20.47.0 - 2021-04-12
* [#1195](https://github.com/stripe/stripe-java/pull/1195) Add support for ACSS Debit
  * Add support for `acss_debit_payments` on `Account.capabilities`
  * Add support for `payment_method_options` on `Checkout.Session`
  * Add support for `acss_debit` on `SetupIntent.payment_method_options`, `SetupAttempt.payment_method_details`, `PaymentMethod`, `PaymentIntent.payment_method_options`,  `PaymentIntentUpdateParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `Mandate.payment_method_details` and `SetupIntent.payment_method_options`
  * Add support for `verify_with_microdeposits` on `PaymentIntent.next_action` and `SetupIntent.next_action`
  * Add support for `acss_debit` as member of the `type` enum on `PaymentMethod` and `PaymentIntent`, and inside `Checkout.SessionCreateParams.payment_method_types[]`.

## 20.46.0 - 2021-04-02
* [#1194](https://github.com/stripe/stripe-java/pull/1194) API Updates
  * Add support for `subscription_pause` on `BillingPortal.ConfigurationUpdateParams.features`, `BillingPortalCreateParams.features` and `BillingPortal.Configuration.features`

## 20.45.0 - 2021-03-31
* [#1193](https://github.com/stripe/stripe-java/pull/1193) API Updates
  * Add support for `transfer_data` on `Checkout.SessionCreateParams.subscription_data`

## 20.44.0 - 2021-03-26
* [#1192](https://github.com/stripe/stripe-java/pull/1192) API Updates
  * Add support for `card_issuing` on `AccountCreateParams.settings`, `AccountUpdateParams.settings` and `Account.settings`

## 20.43.0 - 2021-03-25
* [#1191](https://github.com/stripe/stripe-java/pull/1191) API Updates
  * Add support for new locale `th` on `SessionCreateParams`.

## 20.42.0 - 2021-03-22
* [#1189](https://github.com/stripe/stripe-java/pull/1189) API Updates
  * Add support for `shipping_rates` on `Checkout.SessionCreateParams`
  * Add support for `amount_shipping` on `Checkout.Session.total_details`

## 20.41.0 - 2021-02-22
* [#1187](https://github.com/stripe/stripe-java/pull/1187) API Updates
  * Add support for Billing Portal Configuration API

## 20.40.0 - 2021-02-17
* [#1186](https://github.com/stripe/stripe-java/pull/1186) API Updates
  * Add support for `on_behalf_of` to `Invoice`
  * Add support `revolut` as an enum member on `PaymentMethodCreateParams.Ideal.Bank`, `PaymentIntentConfirmParams.Ideal.Bank`, `PaymentIntentUpdateParams.Ideal.Bank`, and `PaymentIntentCreateParams.Ideal.Bank`

## 20.39.0 - 2021-02-16
* [#1185](https://github.com/stripe/stripe-java/pull/1185) API Updates
  * Add support for `afterpay_clearpay` on `PaymentMethod`, `PaymentIntent.payment_method_data`, and `Charge.payment_method_details`.
  * Add support for `afterpay_clearpay` as a payment method type on `PaymentMethod.type`, `PaymentIntent.PaymentMethodData.type`, and `Checkout.SessionCreateParams.payment_method_types`.
  * Add support for `adjustable_quantity` on `SessionCreateParams.LineItem`
  * Add support for `bacs_debit`, `au_becs_debit` and `sepa_debit` on `SetupAttempt.payment_method_details`

## 20.38.0 - 2021-02-10
* [#1180](https://github.com/stripe/stripe-java/pull/1180) Accept all InputStreams for FileCreateParams.setFile

## 20.37.0 - 2021-02-08
* [#1182](https://github.com/stripe/stripe-java/pull/1182) API Updates
  * Add support for `afterpay_clearpay_payments` on `Account.capabilities`
  * Add support for `payment_settings` on `Invoice`

## 20.36.0 - 2021-02-03
* [#1179](https://github.com/stripe/stripe-java/pull/1179)
  * Add support for `nationality` on `Person`, `PersonUpdateParams`, `PersonCreateParams` and `TokenCreateParams.person`
  * Add `gb_vat` to `TaxId.type` enum
* [#1173](https://github.com/stripe/stripe-java/pull/1173) Add link to YouTube from readme

## 20.35.0 - 2021-01-14
* [#1171](https://github.com/stripe/stripe-java/pull/1171) API Updates
  * Add support for `dynamic_tax_rates` on `SessionCreateParams.line_items[]`
  * Add support for `customer_details` on `Checkout.Session`
  * Add support for `type` on `TransactionListParams`
  * Add support for `country` and `state` on `TaxRateUpdateParams`, `TaxRateCreateParams` and `TaxRate`

## 20.34.0 - 2021-01-07
* [#1169](https://github.com/stripe/stripe-java/pull/1169) API Updates
  * Add support for `company_registration_verification`, `company_ministerial_decree`, `company_memorandum_of_association`, `company_license` and `company_tax_id_verification` on `AccountUpdateParams.documents` and `AccountCreateParams.documents`
* [#1167](https://github.com/stripe/stripe-java/pull/1167) Adding getUserMessage() to exceptions

## 20.33.0 - 2020-12-15
* [#1165](https://github.com/stripe/stripe-java/pull/1165) API Updates
  * Add support for card_present on SetupAttempt.payment_method_details
* [#1162](https://github.com/stripe/stripe-java/pull/1162) Pass mutated copy of params into oauth request

## 20.32.0 - 2020-12-10
* [#1163](https://github.com/stripe/stripe-java/pull/1163) [codegen] Multiple API changes
  * Add support for `bank` on `PaymentMethod`
  * Add support for `tos_shown_and_accepted` to `payment_method_options[p24]` on `PaymentMethod`.

## 20.31.0 - 2020-12-03
* [#1161](https://github.com/stripe/stripe-java/pull/1161) Add support for `documents` on `Account` create and update

## 20.30.0 - 2020-11-24
* [#1159](https://github.com/stripe/stripe-java/pull/1159) Multiple API changes
  * Add support for `account_tax_ids` on `Invoice`
  * Add support for `payment_method_options[sepa_debit]` on `PaymentIntent`
* [#1158](https://github.com/stripe/stripe-java/pull/1158) Better log the error causing the JSON parsing to fail on deserialization

## 20.29.0 - 2020-11-20
* [#1157](https://github.com/stripe/stripe-java/pull/1157) Add support for `capabilities[grabpay_payments]` on `Account`
* [#1156](https://github.com/stripe/stripe-java/pull/1156) Add support for `mandate_options` on `SetupIntent.payment_method_options.sepa_debit`

## 20.28.0 - 2020-11-18
* [#1154](https://github.com/stripe/stripe-java/pull/1154) Add support for `grabpay` on `PaymentMethod`.

## 20.27.0 - 2020-11-17
* [#1152](https://github.com/stripe/stripe-java/pull/1152) Multiple API changes
  * Add support for sepa_debit on SetupIntentCreateParams, SetupIntentUpdateParams, and SetupIntentConfirmParams.

## 20.26.0 - 2020-11-09
* [#1149](https://github.com/stripe/stripe-java/pull/1149) Add `invoice.finalization_error` as a `type` on `Event`
* [#1148](https://github.com/stripe/stripe-java/pull/1148) Multiple API changes
  * Add support for `last_finalization_error` on `Invoice`
  * Add support for deserializing Issuing `Dispute` as a `source` on `BalanceTransaction`
  * Add support for `payment_method_type` on `StripeError` used by other API resources

## 20.25.0 - 2020-11-04
* [#1147](https://github.com/stripe/stripe-java/pull/1147) Add support for `company[registration_number]` on `Account`

## 20.24.0 - 2020-10-27
* [#1144](https://github.com/stripe/stripe-java/pull/1144) Add  `payment_method_details[interac_present][preferred_locales]` on `Charge`

## 20.23.0 - 2020-10-26
* [#1143](https://github.com/stripe/stripe-java/pull/1143) Multiple API changes
  * Add support for `payment_method_options[card][cvc_token]` on `PaymentIntent`
  * Add support for `cvc_update[cvc]` on `Token` creation

## 20.22.0 - 2020-10-23
* [#1142](https://github.com/stripe/stripe-java/pull/1142) Add support for passing `p24[bank]` for P24 on `PaymentIntent` or `PaymentMethod`

## 20.21.0 - 2020-10-22
* [#1141](https://github.com/stripe/stripe-java/pull/1141) Support passing `tax_rates` when creating invoice items through `Subscription` or `SubscriptionSchedule`
* [#1134](https://github.com/stripe/stripe-java/pull/1134) Upgrade Gradle to 6.7
* [#1138](https://github.com/stripe/stripe-java/pull/1138) Bump ErrorProne to latest version
* [#1139](https://github.com/stripe/stripe-java/pull/1139) Upgrade Lombok plugin
* [#1137](https://github.com/stripe/stripe-java/pull/1137) Bump Spotless plugin version
* [#1135](https://github.com/stripe/stripe-java/pull/1135) Fix deprecation warning in test file

## 20.20.0 - 2020-10-20
* [#1133](https://github.com/stripe/stripe-java/pull/1133) Add support for `jp_rn` and `ru_kpp` as a `type` on `TaxId`

## 20.19.0 - 2020-10-14
* [#1130](https://github.com/stripe/stripe-java/pull/1130) Add support for `discounts` to SessionCreateParams

## 20.18.0 - 2020-10-14
* [#1129](https://github.com/stripe/stripe-java/pull/1129) Add support for the Payout Reverse API

## 20.16.0 - 2020-10-09
* [#1126](https://github.com/stripe/stripe-java/pull/1126) Add support for internal-only `description`, `iin`, and `issuer` for `card_present` and `interac_present` on `Charge.payment_method_details`.

## 20.15.0 - 2020-10-08
* Add support for `generated_sepa_debit` and `generated_sepa_debit_mandate` on `Charge.payment_method_details.ideal`, `Charge.payment_method_details.bancontact` and `Charge.payment_method_details.sofort`
* Add support for `generated_from` on `PaymentMethod.sepa_debit`
* Add support for `ideal`, `bancontact` and `sofort` on `SetupAttempt.payment_method_details`

## 20.14.0 - 2020-10-02
* [#1120](https://github.com/stripe/stripe-java/pull/1120) Add support for `TosAcceptance.ServiceAgreement` on `Account`
* [#1119](https://github.com/stripe/stripe-java/pull/1119) Add support for new payments capabilities on `Account`

## 20.13.0 - 2020-09-29
* [#1118](https://github.com/stripe/stripe-java/pull/1118) Add support for the `SetupAttempt` resource and List API

## 20.12.0 - 2020-09-29
* [#1117](https://github.com/stripe/stripe-java/pull/1117) Add support for `contribution` in `reporting_category` on `ReportRun`

## 20.11.0 - 2020-09-28
* [#1116](https://github.com/stripe/stripe-java/pull/1116) Add support for `oxxo_payments` capability on `Account`

## 20.10.0 - 2020-09-25
* [#1113](https://github.com/stripe/stripe-java/pull/1113) Add support for `oxxo` as a valid `type` on the List PaymentMethod API

## 20.9.0 - 2020-09-24
* [#1112](https://github.com/stripe/stripe-java/pull/1112) Add support for OXXO on `PaymentMethod` and `PaymentIntent`

## 20.8.0 - 2020-09-23
* [#1109](https://github.com/stripe/stripe-java/pull/1109) Multiple API changes
  * Add support for `issuing_dispute.closed` and `issuing_dispute.submitted` events
  * Add support for `instant_available` on `Balance`

## 20.7.0 - 2020-09-21
* [#1106](https://github.com/stripe/stripe-java/pull/1106) Multiple API changes
  * Add support for `amount_captured` on `Charge`
  * Add `checkout_session` on `Discount`

## 20.6.0 - 2020-09-13
* [#1102](https://github.com/stripe/stripe-java/pull/1102) Add support for `promotion_code.created` and `promotion_code.updated` on `Event`

## 20.5.0 - 2020-09-10
* [#1099](https://github.com/stripe/stripe-java/pull/1099) Add support for SEPA debit on Checkout

## 20.4.0 - 2020-09-09
* [#1098](https://github.com/stripe/stripe-java/pull/1098) Multiple API changes
  * Add support for `sofort` as a `type` on the List PaymentMethods API
  * Add back support for `invoice.payment_succeeded`

## 20.3.2 - 2020-09-09
* Increase `delayBetweenRetriesInMillis` deploy property from default of 2000 to 4000 to help mitigate close timeouts

## 20.3.1 - 2020-09-09
* [#1095](https://github.com/stripe/stripe-java/pull/1095) OAuth.deauthorize no longer mutates params

## 20.3.0 - 2020-09-08
* [#1096](https://github.com/stripe/stripe-java/pull/1096) Add support for Sofort on `PaymentMethod` and `PaymentIntent`

## 20.2.0 - 2020-09-02
* [#1092](https://github.com/stripe/stripe-java/pull/1092) Multiple API changes
  * Improve support for the Issuing `Dispute` APIs. Added the Submit API, missing parameters on creation, update and list and returned evidence details
  * Add support for `dispute` on Issuing `Transaction`
  * Add `available_payout_methods` on `BankAccount`
  * Add `payment_status` on Checkout `Session`

## 20.1.0 - 2020-08-31
* [#1089](https://github.com/stripe/stripe-java/pull/1089) Add support for `payment_method.automatically_updated` on `WebhookEndpoint`

## 20.0.0 - 2020-08-31
* [#1088](https://github.com/stripe/stripe-java/pull/1088) Multiple API changes
  * Pin to API version `2020-08-27`
  * Removed `authenticated` and `succeeded` on `payment_method_details[card][three_d_secure]` on `Charge`
  * Removed `tax_percent` and `prorate` across all Billing APIs
  * Renamed `plans` to `items` on `SubscriptionSchedule`
  * Removed `display_items` on Checkout `Session`
  * Removed `save_payment_method` and `source` on `PaymentIntent` confirm, create and update. Those parameters still work in the API but are removed from the library
  * Removed `payment_method_details[bitcoin]` on `Charge`
  * Removed `unified_proration` on Billing API as this is a deprecated feature that never shipped publicly
  * Removed `plan` and `quantity` from `Subscription`, use `items` instead
  * Removed `requested_capabilities` on `Account` creation, use `capabilities` instead
  * Removed `failure_url` and `success_url` from `AccountLink`, use `refresh_url` and `return_url` instead
  * Removed `invoice.payment_succeeded` and `payment_method.card_automatically_updated` events
  * `sources` and `tax_ids` on `Customer` are now includable sub-lists and not returned by default when retrieving a customer. You need to explicitly expand those properties to call `getTaxIds()` or `getSources()` now to create those sub-resources. Our API Reference has been updated to reflect this.
* [#1087](https://github.com/stripe/stripe-java/pull/1087) Fix retrieval of upcoming Invoice line items

## 19.45.0 - 2020-08-19
* [#1085](https://github.com/stripe/stripe-java/pull/1085) Add support for `expires_at` on `File`

## 19.44.0 - 2020-08-17
* [#1084](https://github.com/stripe/stripe-java/pull/1084) Add support for `amount_details` on Issuing `Authorization` and `Transaction`

## 19.43.0 - 2020-08-17
* [#1083](https://github.com/stripe/stripe-java/pull/1083) Multiple API changes
  * Add `alipay` on `type` for the List PaymentMethods API
  * Add `payment_intent.requires_action` as a new `type` on `Event`

## 19.42.0 - 2020-08-13
* [#1082](https://github.com/stripe/stripe-java/pull/1082) Add support for Alipay on Checkout `Session`

## 19.41.0 - 2020-08-13
* [#1081](https://github.com/stripe/stripe-java/pull/1081) Add `payment_method_details[acss_debit][bank_name]` on `Charge`

## 19.40.0 - 2020-08-07
* [#1078](https://github.com/stripe/stripe-java/pull/1078) Add support for Alipay on `PaymentMethod` and `PaymentIntent`

## 19.39.0 - 2020-08-05
* [#1077](https://github.com/stripe/stripe-java/pull/1077) Multiple API changes
  * Add support for the `PromotionCode` resource and APIs
  * Add support for `allow_promotion_codes` on Checkout `Session`
  * Add support for `applies_to[products]` on `Coupon`
  * Add support for `promotion_code` on `Customer` and `Subscription`
  * Add support for `promotion_code` on `Discount`

## 19.38.0 - 2020-08-04
* [#1076](https://github.com/stripe/stripe-java/pull/1076) Multiple API changes
  * Add `zh-HK` and `zh-TW` as `locale` on Checkout `Session`.
  * Add `payment_method_details[card_present][receipt][account_type]` on `Charge`

## 19.37.0 - 2020-07-31
* [#1065](https://github.com/stripe/stripe-java/pull/1065) Support setting "proxy" per-request
* [#1072](https://github.com/stripe/stripe-java/pull/1072) Socket timeout exceptions are now also subject to retries

## 19.36.0 - 2020-07-29
* [#1070](https://github.com/stripe/stripe-java/pull/1070) Multiple API changes
  * Add support for `id`, `invoice` and `invoice_item` on `Discount`
  * Add support for `discount_amounts` on `CreditNote`, `CreditNoteLineItem`, `InvoiceLineItem`
  * Add support for `discounts` on `InvoiceItem`, `InvoiceLineItem` and `Invoice`
  * Add support for `total_discount_amounts` on `Invoice`

## 19.35.0 - 2020-07-24
* [#1068](https://github.com/stripe/stripe-java/pull/1068) Add `capabilities[fpx_payments]` on `Account` create and update

## 19.34.0 - 2020-07-22
* [#1067](https://github.com/stripe/stripe-java/pull/1067) Add support for `cartes_bancaires_payments` as a `Capability`

## 19.33.0 - 2020-07-20
* [#1066](https://github.com/stripe/stripe-java/pull/1066) Add support for `capabilities` as a parameter on `Account` create and update

## 19.32.0 - 2020-07-17
* [#1062](https://github.com/stripe/stripe-java/pull/1062) Add support for `political_exposure` on `Person`

## 19.31.0 - 2020-07-16
* [#1061](https://github.com/stripe/stripe-java/pull/1061) Multiple API changes
  * Add `deleted` on `LineItem`
  * Add support for `account_onboarding` and `account_update` as `type` on `AccountLink`

## 19.30.0 - 2020-07-15
* [#1058](https://github.com/stripe/stripe-java/pull/1058) Add support for `en-GB`, `fr-CA` and `id` as `locale` on Checkout `Session`

## 19.29.0 - 2020-07-15
* [#1057](https://github.com/stripe/stripe-java/pull/1057) Add support for `amount_total`, `amount_subtotal`, `currency` and `total_details` on Checkout `Session`

## 19.28.0 - 2020-07-13
* [#1055](https://github.com/stripe/stripe-java/pull/1055) Multiple API changes
  * Adds `es-419` as a `locale` to Checkout `Session`
  * Adds `billing_cycle_anchor` to `default_settings` and `phases` for `SubscriptionSchedule`

## 19.27.0 - 2020-06-24
* [#1052](https://github.com/stripe/stripe-java/pull/1052) Add support for `invoice.paid` event

## 19.26.0 - 2020-06-23
* [#1049](https://github.com/stripe/stripe-java/pull/1049) Add support for `payment_method_data` on `PaymentIntent`

## 19.25.0 - 2020-06-23
* [#1048](https://github.com/stripe/stripe-java/pull/1048) Multiple API changes
  * Add `discounts` on `LineItem`
  * Add `document_provider_identity_document` as a `purpose` on `File`
  * Support nullable `metadata` on Issuing `Dispute`
  * Add `klarna[shipping_delay]` on `Source`

## 19.24.0 - 2020-06-18
* [#1047](https://github.com/stripe/stripe-java/pull/1047) Multiple API changes
  * Add support for `refresh_url` and `return_url` on `AccountLink`
  * Add support for `issuing_dispute.*` events

## 19.23.0 - 2020-06-11
* [#1044](https://github.com/stripe/stripe-java/pull/1044) Multiple API changes
  * Add `transaction` on Issuing `Dispute`
  * Add `payment_method_details[acss_debit][mandate]` on `Charge`

## 19.22.0 - 2020-06-10
* [#1043](https://github.com/stripe/stripe-java/pull/1043) Add support for Cartes Bancaires payments on `PaymentIntent` and `Pay…

## 19.21.0 - 2020-06-09
* [#1042](https://github.com/stripe/stripe-java/pull/1042) Add support for `id_npwp` and `my_frp` as `type` on `TaxId`

## 19.20.0 - 2020-06-03
* [#1041](https://github.com/stripe/stripe-java/pull/1041) Add support for `payment_intent_data[transfer_group]` on Checkout `Session`

## 19.19.0 - 2020-06-03
* [#1040](https://github.com/stripe/stripe-java/pull/1040) Add support for Bancontact, EPS, Giropay and P24 on Checkout `Session`

## 19.18.0 - 2020-06-03
* [#1039](https://github.com/stripe/stripe-java/pull/1039) Multiple API changes
  * Add `bacs_debit_payments` as a `Capability`
  * Add support for BACS Debit on Checkout `Session`
  * Add support for `checkout.session.async_payment_failed` and `checkout.session.async_payment_succeeded` as `type` on `Event`

## 19.17.0 - 2020-06-03
* [#1038](https://github.com/stripe/stripe-java/pull/1038) Multiple API changes
  * Add support for bg, cs, el, et, hu, lt, lv, mt, ro, ru, sk, sl and tr as new locale on Checkout `Session`
  * Add `settings[sepa_debit_payments][creditor_id]` on `Account`
  * Add support for Bancontact, EPS, Giropay and P24 on `PaymentMethod`, `PaymentIntent` and `SetupIntent`
  * Add support for `order_item[parent]` on `Source` for Klarna

## 19.16.0 - 2020-05-29
* [#1036](https://github.com/stripe/stripe-java/pull/1036) Add support for BACS Debit as a `PaymentMethod`

## 19.15.0 - 2020-05-28
* [#1035](https://github.com/stripe/stripe-java/pull/1035) Multiple API changes
  * Add `payment_method_details[card][three_d_secure][authentication_flow]` on `Charge`
  * Add `line_items[][price_data][product_data]` on Checkout `Session` creation

## 19.14.0 - 2020-05-22
* [#1034](https://github.com/stripe/stripe-java/pull/1034) Multiple API changes
  * Add support for `ae_trn`, `cl_tin` and `sa_vat` as `type` on `TaxId`
  * Add `result` and `result_reason` inside `payment_method_details[card][three_d_secure]` on `Charge`

## 19.13.0 - 2020-05-20
* [#1033](https://github.com/stripe/stripe-java/pull/1033) Multiple API changes
  * Add `anticipation_repayment` as a `type` on `BalanceTransaction`
  * Add `interac_present` as a `type` on `PaymentMethod`
  * Add `payment_method_details[interac_present]` on `Charge`
  * Add `transfer_data` on `SubscriptionSchedule`

## 19.12.0 - 2020-05-18
* [#1032](https://github.com/stripe/stripe-java/pull/1032) Multiple API changes
  * Add support for `issuing_dispute` as a `type` on `BalanceTransaction`
  * Add `balance_transactions` as an array of `BalanceTransaction` on Issuing `Dispute`
  * Add `fingerprint` and `transaction_id` in `payment_method_details[alipay]` on `Charge`
  * Add `transfer_data[amount]` on `Invoice`
  * Add `transfer_data[amount_percent]` on `Subscription`
  * Add `price.created`, `price.deleted` and `price.updated` on `Event`.

## 19.11.0 - 2020-05-13
* [#1030](https://github.com/stripe/stripe-java/pull/1030) Add support for `purchase_details` on Issuing `Transaction`

## 19.10.0 - 2020-05-11
* [#1028](https://github.com/stripe/stripe-java/pull/1028) Add support for the `LineItem` resource and APIs

## 19.9.0 - 2020-05-07
* [#1025](https://github.com/stripe/stripe-java/pull/1025) Multiple API changes
  * Remove parameters in `price_data[recurring]` across APIs as they were never supported
  * Move `payment_method_details[card][three_d_secure]` to a list of enum values on `Charge`
  * Add support for for `business_profile[support_address]` on `Account` create and update

## 19.8.0 - 2020-05-01
* [#1022](https://github.com/stripe/stripe-java/pull/1022) Add support for `issuing` on `Balance`

## 19.7.0 - 2020-04-29
* [#1020](https://github.com/stripe/stripe-java/pull/1020) Add support for `br_cpf` and `br_cnpj` as `type` on `TaxId`

## 19.6.0 - 2020-04-29
* [#1019](https://github.com/stripe/stripe-java/pull/1019) Add support for the `Price` resource and APIs

## 19.5.0 - 2020-04-24
* [#1016](https://github.com/stripe/stripe-java/pull/1016) Add support for `jcb_payments` as a `Capability`

## 19.4.0 - 2020-04-22
* [#1015](https://github.com/stripe/stripe-java/pull/1015) Add support for `coupon` for subscriptions on Checkout

## 19.3.0 - 2020-04-22
* [#1014](https://github.com/stripe/stripe-java/pull/1014) Add support for `billingportal` namespace and `Session` resource and APIs

## 19.2.0 - 2020-04-17
* [#1013](https://github.com/stripe/stripe-java/pull/1013) Multiple API changes
  * Add support for `cardholder_name` in `payment_method_details[card_present]` on `Charge`
  * Add new enum values for `company[structure]` on `Account`

## 19.1.0 - 2020-04-16
* [#1010](https://github.com/stripe/stripe-java/pull/1010) Multiple API changes
  * Add `institution_number` and `transit_number` in `payment_method_details[acss]` on `Charge`
  * Add `cvc` and `number` as properties that can be included when retrieving an Issuing `Card`

## 19.0.0 - 2020-04-15
* [#1009](https://github.com/stripe/stripe-java/pull/1009) Multiple breaking API changes while removing deprecated Issuing features:
  * Moved `SettingsBranding` on `Account` is now `Branding` inside the `Settings` on `Account`
  * Removed `percentage` filter from the List `TaxRate` API
  * Remove `country` and `routing_number` from `payment_method_details.acss_debit` on `Charge` as this is going to be reworked
  * Moved `transfer_data` on `Subscription` to its own class separate from the one on `Invoice`
  * Removing all deprecated features on Issuing:
    * Remove `renewal_interval` on `SubscriptionSchedule` which was deprecated
    * Remove `email` on `Token` as this was only supported for an internal product
    * Removed deprecated properties and parameters on Issuing `Authorization` that have been renamed or replaced:
      * `authorized_amount`, `authorized_currency`, `held_amount`, `held_currency`, `is_held_amount_controllable`, `pending_authorized_amount`, `pending_held_amount`, `wallet_provider`
      * Removed `url` inside `merchant_data`
      * Removed `address_zip_check`, `authentication` and `three_d_secure` inside `verification_data`
      * Removed `authorized_amount`, `authorized_currency`, `held_amount`, `held_currency`, `violated_authorization_controls` from `pending_request`
    * Removed deprecated properties and parameters on Issuing `Card`:
      * Removed `authorization_controls`, `name`, `pin` and `speed`
      * Renamed the inner class from `AuthorizationControls` to `SpendingControls`
      * Moved `SpendingLimit` as an inner class inside `SpendingControls`.
      * Moved `MerchantData` from being its own class to being an inner class inside `Authorization`
      * Removed the `details()` API method
    * Removed `CardDetails` API resource
    * Removed deprecated properties and parameters on Issuing `Cardholder`:
      * Removed `authorization_controls`, `is_default`
      * Removed `name` inside `billing`
      * Renamed the inner class from `AuthorizationControls` to `SpendingControls`
      * Moved `MerchantData` from being its own class to being an inner class inside `Authorization`
      * Moved `SpendingLimit` as an inner class inside `SpendingControls`
      * Removed the `details()` API method
    * Clean up the `Dispute` resource and APIs to remove most features as this is still in beta and not yet stable
    * Removed `issuing_dispute.*` and `issuing_settlement.*` events as those are not public yet
    * Removed deprecated properties and parameters on Issuing `Transaction`:
      * Removed `dispute`
      * Reference `merchant_data` from the inner class in `Authorization`
      * Removed enum values for `type` to only have `capture` and `refund`

## 18.16.0 - 2020-04-14
* [#1006](https://github.com/stripe/stripe-java/pull/1006) Add support for `settings[branding][secondary_color]` on `Account`

## 18.15.0 - 2020-04-13
* [#1003](https://github.com/stripe/stripe-java/pull/1003) Add support for `description` on `WebhookEndpoint`

## 18.14.0 - 2020-04-10
* [#1002](https://github.com/stripe/stripe-java/pull/1002) Multiple API changes
  * Make `payment_intent` expandable on `Charge`
  * Add support for `sg_gst` as a value for `type` on `TaxId` and related APIs
  * Add `cancellation_reason` and new enum values for `replacement_reason` on Issuing `Card`

## 18.13.1 - 2020-04-06
* [#971](https://github.com/stripe/stripe-java/pull/971) Improve connection reuse
* [#999](https://github.com/stripe/stripe-java/pull/999) Bump Gradle and other dependencies

## 18.13.0 - 2020-04-03
* [#998](https://github.com/stripe/stripe-java/pull/998) Add support for `calculatedStatementDescriptor` on `Charge`

## 18.12.0 - 2020-03-26
* [#994](https://github.com/stripe/stripe-java/pull/994) Add support for `spending_controls` on Issuing `Card` and `Cardholder`

## 18.11.0 - 2020-03-25
* [#993](https://github.com/stripe/stripe-java/pull/993) Multiple API changes
  * Add support for `pt-BR` as a `locale` on Checkout `Session`
  * Add support for `company` as a `type` on Issuing `Cardholder`

## 18.10.0 - 2020-03-24
* [#992](https://github.com/stripe/stripe-java/pull/992) Add support for `pause_collection` on `Subscription`

## 18.9.0 - 2020-03-23
* [#991](https://github.com/stripe/stripe-java/pull/991) Add support for capabilities for AU Becs Debit and Tax reporting

## 18.8.0 - 2020-03-20
* [#989](https://github.com/stripe/stripe-java/pull/989) Multiple API changes for Issuing:
  * Add `amount`, `currency`, `merchant_amount` and `merchant_currency` on `Authorization`
  * Add `amount`, `currency`, `merchant_amount` and `merchant_currency` inside `request_history` on `Authorization`
  * Add `pending_request` on `Authorization`
  * Add `amount` when approving an `Authorization`
  * Add `replaced_by` on `Card`.

## 18.7.0 - 2020-03-13
* [#986](https://github.com/stripe/stripe-java/pull/986) Multiple API changes for Issuing:
  * Rename `speed` to `service` on Issuing `Card`
  * Rename `wallet_provider` to `wallet` and `address_zip_check` to `address_postal_code_check` on Issuing `Authorization`
  * Mark `is_default` as deprecated on Issuing `Cardholder`

## 18.6.0 - 2020-03-12
* [#985](https://github.com/stripe/stripe-java/pull/985) Add support for `shipping` and `shipping_address_collection` on Checkout `Session`

## 18.5.0 - 2020-03-12
* [#984](https://github.com/stripe/stripe-java/pull/984) Add support for `ThreeDSecure` on Issuing `Authorization`

## 18.4.0 - 2020-03-05
* [#981](https://github.com/stripe/stripe-java/pull/981) Make metadata nullable in many methods

## 18.3.0 - 2020-03-04
* [#980](https://github.com/stripe/stripe-java/pull/980) Add support for `metadata` on `WebhookEndpoint`

## 18.2.0 - 2020-03-04
* [#979](https://github.com/stripe/stripe-java/pull/979) Multiple API changes
  * Add support for `account` as a parameter on `Token` to create Account tokens
  * Add support for `verification_data.expiry_check` on Issuing `Authorization`
  * Add support for `incorrect_cvc` and `incorrect_expiry` as a value for `request_history.reason` on Issuing `Authorization`

## 18.1.0 - 2020-03-04
* [#978](https://github.com/stripe/stripe-java/pull/978) Multiple API changes
  * Add support for `errors` in `requirements` on `Account`, `Capability` and `Person`
  * Add support for `payment_intent.processing` as a new `type` on `Event`.

## 18.0.0 - 2020-03-03
* [#977](https://github.com/stripe/stripe-java/pull/977) Multiple API changes:
  * Pin to API version `2020-03-02`
  * Remove `uob_regional` as a value on `bank` for FPX as this is deprecated and was never used
  * Add support for `next_invoice_sequence` on `Customer`
  * Add support for `proration_behavior` on `SubscriptionItem` delete

## 17.16.0 - 2020-02-28
* [#976](https://github.com/stripe/stripe-java/pull/976) Add `my_sst` as a valid value for `type` on `TaxId`

## 17.15.0 - 2020-02-27
* [#975](https://github.com/stripe/stripe-java/pull/975) Make `type` on `AccountLink` an enum

## 17.14.0 - 2020-02-24
* [#974](https://github.com/stripe/stripe-java/pull/974) Add new enum values in `reason` for Issuing `Dispute` creation

## 17.13.0 - 2020-02-24
* [#973](https://github.com/stripe/stripe-java/pull/973) Add support for listing Checkout `Session` and passing tax rate information

## 17.12.0 - 2020-02-21
* [#970](https://github.com/stripe/stripe-java/pull/970) Multiple API changes
  * Add support for `timezone` on `ReportRun`
  * Add support for `proration_behavior` on `SubscriptionSchedule`

## 17.11.0 - 2020-02-12
* [#968](https://github.com/stripe/stripe-java/pull/968) Add support for `payment_intent_data[transfer_data][amount]` on Checkout `Session`

## 17.10.0 - 2020-02-12
* [#967](https://github.com/stripe/stripe-java/pull/967) Multiple API changes
  * Add `fpx` as a valid `source_type` on `Balance`, `Payout` and `Transfer`
  * Add `fpx` support on Checkout `Session`
  * Fields inside `verification_data` on Issuing `Authorization` are now enums
  * Support updating `payment_method_options` on `PaymentIntent` and `SetupIntent`

## 17.9.1 - 2020-02-11
* [#964](https://github.com/stripe/stripe-java/pull/964) Convert Markdown to HTML in Javadoc
* [#965](https://github.com/stripe/stripe-java/pull/965) Add Gradle plugin for publishing JavaDoc to GitHub Pages

## 17.9.0 - 2020-02-10
* [#963](https://github.com/stripe/stripe-java/pull/963) Multiple API changes
  * Add support for new `type` values for `TaxId`.
  * Add support for `payment_intent_data[statement_descriptor_suffix]` on Checkout `Session`.

## 17.8.0 - 2020-02-04
* [#961](https://github.com/stripe/stripe-java/pull/961) Rename `sort_code` to `sender_sort_code` on `SourceTransaction` for BACS debit. (This is technically a breaking change.)

## 17.7.0 - 2020-02-03
* [#960](https://github.com/stripe/stripe-java/pull/960) Add support for `error_on_requires_action` on `PaymentIntent`
* [#957](https://github.com/stripe/stripe-java/pull/957) Add additional verification file purpose

## 17.6.0 - 2020-01-31
* [#959](https://github.com/stripe/stripe-java/pull/959) Add support for `company.structure` on `Account` and new types of `TaxId`

## 17.5.0 - 2020-01-30
* [#955](https://github.com/stripe/stripe-java/pull/955) Add support for FPX as a `PaymentMethod`

## 17.4.0 - 2020-01-28
* [#953](https://github.com/stripe/stripe-java/pull/953) Add new type for `TaxId` and `sender_account_name` on `SourceTransaction`
* [#949](https://github.com/stripe/stripe-java/pull/949) Move examples to Customer instead of Charge

## 17.3.0 - 2020-01-24
* [#948](https://github.com/stripe/stripe-java/pull/948) Add support for `shipping.speed` on Issuing `Card` and new `TaxID` types

## 17.2.0 - 2020-01-24
* [#947](https://github.com/stripe/stripe-java/pull/947) Changes for custom HTTP clients

## 17.1.1 - 2020-01-22
* [#944](https://github.com/stripe/stripe-java/pull/944) Improve docstrings for many properties and parameters

## 17.1.0 - 2020-01-17
* [#943](https://github.com/stripe/stripe-java/pull/943) Add support for `metadata` on Checkout `Session`
* [#940](https://github.com/stripe/stripe-java/pull/940) Add `StripeObjectInterface` interface

## 17.0.0 - 2020-01-15
* [#869](https://github.com/stripe/stripe-java/pull/869)
Major version release. Refer to our [migration guide for v17](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v17) for a list of new features and backwards incompatible changes to watch out for.

Pull requests included in this release (cf. [#869](https://github.com/stripe/stripe-java/pull/869)) (⚠️ = breaking changes):
* [#857](https://github.com/stripe/stripe-java/pull/857) Refactor form encoding
* [#870](https://github.com/stripe/stripe-java/pull/870) ⚠️ Refactor request telemetry
* [#872](https://github.com/stripe/stripe-java/pull/872) Move HTTP request methods into new `HttpClient` class
* [#878](https://github.com/stripe/stripe-java/pull/878) Add `StripeRequest` object
* [#879](https://github.com/stripe/stripe-java/pull/879) Add `HttpClient` abstract class
* [#880](https://github.com/stripe/stripe-java/pull/880) ⚠️ Stop disabling the DNS cache
* [#895](https://github.com/stripe/stripe-java/pull/895) Fix deprecation warnings
* [#896](https://github.com/stripe/stripe-java/pull/896) Add `HttpContent` class
* [#897](https://github.com/stripe/stripe-java/pull/897) Add `Stopwatch` class
* [#898](https://github.com/stripe/stripe-java/pull/898) Move all request properties in `StripeRequest`
* [#899](https://github.com/stripe/stripe-java/pull/899) ⚠️ Remove `ApiResource.RequestType`
* [#900](https://github.com/stripe/stripe-java/pull/900) Add support for automatic request retries
* [#902](https://github.com/stripe/stripe-java/pull/902) Minor fixes
* [#928](https://github.com/stripe/stripe-java/pull/928) `StringUtils` class & better API key validation
* [#927](https://github.com/stripe/stripe-java/pull/927) ⚠️ Remove support for custom `URLStreamHandler`
* [#931](https://github.com/stripe/stripe-java/pull/931) ⚠️ Refactor HTTP headers handling
* [#932](https://github.com/stripe/stripe-java/pull/932) ⚠️ Modernize `StripeResponse`
* [#934](https://github.com/stripe/stripe-java/pull/934) Add `maxNetworkRetries` as a global and per-request setting
* [#935](https://github.com/stripe/stripe-java/pull/935) ⚠️ Add `StreamUtils` class
* [#936](https://github.com/stripe/stripe-java/pull/936) ⚠️ Remove support for `count` and `total_count` in list objects
* [#938](https://github.com/stripe/stripe-java/pull/938) ⚠️ Remove deprecated properties and parameters
* [#939](https://github.com/stripe/stripe-java/pull/939) Update README

## 16.8.0 - 2020-01-15
* [#937](https://github.com/stripe/stripe-java/pull/937) Adding missing events for pending updates on `Subscription`

## 16.7.0 - 2020-01-15
* [#933](https://github.com/stripe/stripe-java/pull/933) Add support for `pending_update` on `Subscription`
* [#930](https://github.com/stripe/stripe-java/pull/930) Bump stripe-mock to 0.79.0

## 16.6.0 - 2020-01-14
* [#929](https://github.com/stripe/stripe-java/pull/929) Add support for `CreditNoteLineItem`

## 16.5.1 - 2020-01-09
* [#924](https://github.com/stripe/stripe-java/pull/924) Doc changes for core properties or parameters such as `metadata` or `livemode`

## 16.5.0 - 2020-01-07
* [#922](https://github.com/stripe/stripe-java/pull/922) Codegen for openapi c896d1f
  * Add support for custom properties on `Source.detach` method
  * Add support for property expansion in `Subscription.cancel` method.
  * Add support for `sg_uen` on `TaxId`

## 16.4.0 - 2019-12-20
* [#921](https://github.com/stripe/stripe-java/pull/921) Add `executives_provided` on `Account`

## 16.3.0 - 2019-12-20
* [#918](https://github.com/stripe/stripe-java/pull/918) Multiple API changes
  * Adds `livemode` and `metadata` to Terminal `Reader` and `Location`
  * Adds `ms` as a valid locale on Checkout `Session`

## 16.2.0 - 2019-12-09
* [#914](https://github.com/stripe/stripe-java/pull/914) Add support for AU BECS Debit on `PaymentMethod`
* [#906](https://github.com/stripe/stripe-java/pull/906) Add documentation for enum values

## 16.1.0 - 2019-12-04
* [#912](https://github.com/stripe/stripe-java/pull/912) Add support for `network` on `Charge` and `funding_method` on `SourceTransaction`

## 16.0.0 - 2019-12-03
* [#910](https://github.com/stripe/stripe-java/pull/910) Use global timeouts in RequestOptions
* [#911](https://github.com/stripe/stripe-java/pull/911) Multiple API changes
  * Pin to API version `2019-12-03`
  * Remove `tax_info` and `tax_info_verification` on `Customer`
  * Remove `cardholder` on Issuing `Card` update
  * Remove `invoice_customer_balance_settings` from `Subscription`

## 15.7.0 - 2019-11-26
* [#908](https://github.com/stripe/stripe-java/pull/908) Add support for Preview endpoint on CreditNote

## 15.6.0 - 2019-11-25
* [#907](https://github.com/stripe/stripe-java/pull/907) Add support for `out_of_band_amount` on `CreditNote` creation

## 15.5.0 - 2019-11-21
* [#905](https://github.com/stripe/stripe-java/pull/905) Add support for `payment_intent` filter when listing `Dispute`s.

## 15.4.0 - 2019-11-18
* [#904](https://github.com/stripe/stripe-java/pull/904) Add support for `violated_authorization_controls` on Issuing `Authorization`

## 15.3.1 - 2019-11-18
* [#903](https://github.com/stripe/stripe-java/pull/903) Serialize null values in all maps
* [#901](https://github.com/stripe/stripe-java/pull/901) Minor code quality fixes
* [#894](https://github.com/stripe/stripe-java/pull/894) Upgrade Gradle and other dependencies

## 15.3.0 - 2019-11-07
* [#890](https://github.com/stripe/stripe-java/pull/890) Multiple API changes
  * Add `company` and `individual` to Issuing `Cardholder`
  * Add `sepa_debit` to `PaymentMethodUpdateParams`
* [#891](https://github.com/stripe/stripe-java/pull/891) Replace Cobertura with JaCoCo

## 15.2.0 - 2019-11-06
* [#889](https://github.com/stripe/stripe-java/pull/889) Multiple API changes:
  * Add `disputed` on `Charge`.
  * Add `payment_intent` on ` Dispute` and `Refund`.
  * Add `payment_intent` when creating a `Refund`.
  * Add `payment_intent` filter when listing `Refund` and `Dispute`.

## 15.1.0 - 2019-11-06
* [#888](https://github.com/stripe/stripe-java/pull/888) Add support for SEPA and iDEAL on `PaymentMethod` and `Mandate`

## 15.0.0 - 2019-11-05
* [#886](https://github.com/stripe/stripe-java/pull/886) Move to the latest API version and add new changes
  * Move to API version `2019-11-05`
  * Add `default_settings` on `SubscritionSchedule`
  * Remove `billing_thresholds`, `collection_method`, `default_payment_method`, `default_source` and `invoice_settings` from `SubscriptionSchedule
  * Add `charge` filter when listing `Dispute`

## 14.5.0 - 2019-11-04
* [#881](https://github.com/stripe/stripe-java/pull/881) Add support for `use_stripe_sdk` on `PaymentIntent` creation and confirmation

## 14.4.1 - 2019-10-30
* [#877](https://github.com/stripe/stripe-java/pull/877) Fix docstring for a parameter to reflect the correct behaviour

## 14.4.0 - 2019-10-30
* [#876](https://github.com/stripe/stripe-java/pull/876) Add support for `invoice_customer_balance_settings` on `Invoice`
* [#873](https://github.com/stripe/stripe-java/pull/873) Suppress unchecked cast warnings in test

## 14.3.0 - 2019-10-25
* [#871](https://github.com/stripe/stripe-java/pull/871) Codegen for openapi d8f9ddf
  * Remove `max_amount` from Issuing `Card`. This is technically a breaking change but only one integration was using this feature which changed a while ago

## 14.2.0 - 2019-10-24
* [#868](https://github.com/stripe/stripe-java/pull/868)
  * Add support for typed parameters in `Event.retrieve` method
* [#867](https://github.com/stripe/stripe-java/pull/867) Contributor Convenant

## 14.1.0 - 2019-10-23
* [#866](https://github.com/stripe/stripe-java/pull/866) Various API changes
  * Add support for `mx_rfc` on `TaxId`
  * Add support for `pending_invoice_item_interval` on  `Subscription` creation and update
  * Add support for `next_pending_invoice_item_invoice` on `Subscription
  * Add support for `installments` which is a feature on `PaymentIntent` and `PaymentMethod` available on MX Stripe accounts. It's also added inside `payment_method_details[card]` on `Charge`
  * Add support for `next_pending_invoice_item_invoice` as a new `Capability`

## 14.0.1 - 2019-10-18
* [#864](https://github.com/stripe/stripe-java/pull/864)
  * Remove `renewal_behavior` on Subscription Schedule model class
  * Remove `renewal_interval` on Subscription Schedule parameter classes
  * The above are technically breaking changes and should have been released with 14.0.0.

## 14.0.0 - 2019-10-18
* [#863](https://github.com/stripe/stripe-java/pull/863) Upgrade to new API version [`2019-10-17`](https://stripe.com/docs/upgrades#2019-10-17)
  * Pin to API version `2019-10-17`
  * Remove `account_balance` from Customer model and parameter classes
  * Remove `billing` from Invoice, Subscription and Subscription Schedule model and parameter classes
  * Remove `start` from Subscription model
  * Remove `renewal_behavior` from Subscription Schedule parameter classes
  * **Note:** This release was missing some breaking changes. Please use 14.0.1 instead.

## 13.3.0 - 2019-10-17
* [#862](https://github.com/stripe/stripe-java/pull/862) [codegen] Update API Resources
  * `requirements` on Issuing `Cardholder`
  * `payment_method_details[au_becs_debit][mandate]` on `Charge`
  * new types of tax id for Customer `TaxId`.
  * `payment_behavior` on `Subscription` creation can now take the value `pending_if_incomplete`.
  * `payment_behavior` on `SubscriptionItem` creation and update is now supported.
  * `subscription_data[trial_from_plan]` is now supported on Checkout `Session` creation.
* [#858](https://github.com/stripe/stripe-java/pull/858) Stop propagating UnsupportedEncodingException

## 13.2.0 - 2019-10-16
* [#861](https://github.com/stripe/stripe-java/pull/861) Add getters to parameters classes

## 13.1.0 - 2019-10-09
* [#854](https://github.com/stripe/stripe-java/pull/854)
  * Add support for `description`, `iin` and `issuer` on `Source.Card`, `Source.CardPresent` and `Source.ThreeDSecure`
  * Add support for `deviceType` on `ReaderListParams`

## 13.0.0 - 2019-10-08
* [#853](https://github.com/stripe/stripe-java/pull/853) Upgrade to new API version [`2019-10-08`](https://stripe.com/docs/upgrades#2019-10-08)

## 12.2.0 - 2019-10-08
* [#852](https://github.com/stripe/stripe-java/pull/852) Setters for string properties in update params now all accept `EmptyParam`
* [#835](https://github.com/stripe/stripe-java/pull/835) Bump dependencies
* [#851](https://github.com/stripe/stripe-java/pull/851) Update `README.md`

## 12.1.0 - 2019-09-27
* [#850](https://github.com/stripe/stripe-java/pull/850) Codegen for openapi 4d4a107
  * Add support for `mandate` on `Charge`.
  * Add support for `reference` on `SourceTransaction`.
  * Add support for `person` on `TokenCreateParams`.
  * Add support for new event types `payment_intent.canceled` and `setup_intent.canceled`
  * Add support for `metadata` on `AuthorizationApproveParams` and `AuthorizationDeclineParams`
  * Add `setMetadata` method on `AuthorizationUpdateParams`
  * Rename `chidrens_and_infants_wear_stores` to `childrens_and_infants_wear_stores`. This is technically a breaking change, but we've chosen to release this as a minor version as the previous name was virtually unused.
* [#849](https://github.com/stripe/stripe-java/pull/849) Add add/addAll support for "emptyable" params
  * Add `addAttribute` and `addAllAttribute` methods to `ProductUpdateParams`
  * Add `addCustomField` and `addAllCustomField` methods to `CustomerCreateParams`, `CustomerUpdateParams`, `InvoiceCreateParams` and `InvoiceUpdateParams`
  * Add `addDefaultTaxRate` and `addAllDefaultTaxRate` methods to `InvoiceUpdateParams`, `SubscriptionCreateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams` and `SubscriptionUpdateParams`
  * Add `addImage` and `addAllImage` methods to `ProductUpdateParams`
  * Add `addItem` and `addAllItem` methods to `OrderReturnOrderParams`
  * Add `addSubscriptionDefaultTaxRate` and `addAllSubscriptionDefaultTaxRate` methods to `InvoiceUpcomingParams`
  * Add `addTaxRate` and `addAllTaxRate` methods to `InvoiceItemUpdateParams`, `InvoiceUpcomingParams`, `SubscriptionCreateParams`, `SubscriptionItemCreateParams`, `SubscriptionItemUpdateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams` and `SubscriptionUpdateParams`

## 12.0.0 - 2019-09-10
* [#844](https://github.com/stripe/stripe-java/pull/844) Update to API version 2019-09-09

## 11.8.0 - 2019-09-09
* [#842](https://github.com/stripe/stripe-java/pull/842)
  * Add support for `company[verification]` on `Account`
  * Add support for `verification[additional_document]` on `Person`

## 11.7.0 - 2019-09-05
* [#827](https://github.com/stripe/stripe-java/pull/827) Switch to new "prettier" codegen
* [#841](https://github.com/stripe/stripe-java/pull/841)
  * Just a trivial comment update

## 11.6.1 - 2019-09-03
* [#839](https://github.com/stripe/stripe-java/pull/839) Deprecate `total_count`

## 11.6.0 - 2019-09-03
* [#838](https://github.com/stripe/stripe-java/pull/838) Support `authentication` on Issuing `Authorization` and `url` on `MerchantData`

## 11.5.1 - 2019-08-30
* [#834](https://github.com/stripe/stripe-java/pull/834) Make `stripeError` transient on `StripeException`

## 11.5.0 - 2019-08-28
* [#833](https://github.com/stripe/stripe-java/pull/833) Add support for `endBehavior` on `SubscriptionSchedule`

## 11.4.0 - 2019-08-28
* [#830](https://github.com/stripe/stripe-java/pull/830) Add support for `pendingVerification` on `Account`, `Person` and `Capability`

## 11.3.0 - 2019-08-23
* [#829](https://github.com/stripe/stripe-java/pull/829)
  * Release support for decimal values on Billing resources such as `Plan` or `InvoiceItem`

## 11.2.0 - 2019-08-21
* [#828](https://github.com/stripe/stripe-java/pull/828)
  * Add support for `schedule` on `Subscription`
  * Add support for `defaultPaymentMethod`, `invoiceSettings`, `collectionMethod` and `billingThresholds` to `SubscriptionSchedule` and its update and create APIs
  * Add support for `mode` and `setupIntent` on Checkout `Session` and its create API
  * Add support for `schedule` and `subscriptionCancelAt` to the `Invoice` Upcoming API
  * Add support for new event types `subscription_schedule.*`

## 11.1.0 - 2019-08-15
* [#826](https://github.com/stripe/stripe-java/pull/826) Add support for `executive` on `Person` create, update and list

## 11.0.0 - 2019-08-14
* [#825](https://github.com/stripe/stripe-java/pull/825) Move to API version [`2019-08-14`](https://stripe.com/docs/upgrades#2019-08-14)
  * Rename `platform_payments` to `transfers` in `Account`
  * Introduce `executive` as a relationship on `Person`

## 10.15.0 - 2019-08-14
* [#824](https://github.com/stripe/stripe-java/pull/824)
  * Add support for `au_becs_debit` sources
  * Add support for `mandate` parameter in source creation and update requests
  * Add support for `amount` in source update requests
  * Add support for `pin` attribute on `issuing.card` objects
  * Add support for `digital_goods_applications` category for Issuing

## 10.14.0 - 2019-08-08
* [#820](https://github.com/stripe/stripe-java/pull/820)
  * Add support for unsetting `receipt_email` on `PaymentIntent`
  * Remove support for `SubscriptionScheduleRevision`. This is technicall a breaking change, but we've chosen to release this as a minor version as this resource and its APIs were virtually unused.

## 10.13.0 - 2019-08-08
* [#819](https://github.com/stripe/stripe-java/pull/819)
  * Add support for `payment_method_details[card][moto]` on `Charge`
  * Add support for `statement_descriptor_suffix` on `Charge` and `PaymentIntent`
  * Add support `subscription_data[application_fee_percent]` on Checkout `Session`
  * Rename `uk_credit_transfer` to `gbp_credit_transfer` on Source. This is technically a breaking change, but we've chosen to release this as a minor version as the previous name was virtually unused.

## 10.12.2 - 2019-08-07
* [#818](https://github.com/stripe/stripe-java/pull/818) Set default timeouts in `RequestOptionsBuilder`

## 10.12.1 - 2019-07-30
* [#812](https://github.com/stripe/stripe-java/pull/812) Fix potential `NullPointerException` when calling `getRawJsonObject()`

## 10.12.0 - 2019-07-22
* [#809](https://github.com/stripe/stripe-java/pull/809)
  * Add support for `statement_descriptor` on `PaymentIntent` capture
  * Add support for unsetting `setup_future_usage` on `PaymentIntent`

## 10.11.0 - 2019-07-19
* [#808](https://github.com/stripe/stripe-java/pull/999)
  * Add `off_session` to `SubscriptionItem` update
  * Add `customer` when listing `CreditNote`
  * Remove `challenge_only` enum value. This is technically a breaking change, but we've chosen to release this as a minor version in light of the fact that this value was virtually unused.

## 10.10.0 - 2019-07-17
* [#806](https://github.com/stripe/stripe-java/pull/806) Add support for `voided_at` on `CreditNote`

## 10.9.1 - 2019-07-16
* [#804](https://github.com/stripe/stripe-java/pull/804) Add support for unsetting metadata keys
* [#805](https://github.com/stripe/stripe-java/pull/805) Bump dependencies

## 10.9.0 - 2019-07-15
* [#802](https://github.com/stripe/stripe-java/pull/802) Add support for `payment_method_options` on `PaymentIntent` and `SetupIntent`

## 10.8.0 - 2019-07-15
* [#801](https://github.com/stripe/stripe-java/pull/801)
  * Add support for `pending_setup_intent` on Subscription
  * Add support for `off_session` on Subscription creation and update and Invoice pay

## 10.7.0 - 2019-07-15
* [#800](https://github.com/stripe/stripe-java/pull/800)
  * Add support for Sources of type `klarna`
  * Add support for `payment_behavior` on Subscription and SubscriptionItem to control their behaviour on creation or update.

## 10.6.0 - 2019-07-12
* [#799](https://github.com/stripe/stripe-java/pull/799) Add `getRawJsonObject()` accessor

## 10.5.0 - 2019-07-09
* [#798](https://github.com/stripe/stripe-java/pull/798)
  * Add support for `transfer_data[amount]` on PaymentIntent
  * Add support for passing `setup_future_usage` on PaymentIntent Update and Confirm APIs
  * Add support for `confirm` and `return_url` on SetupIntent creation
  * Add support for `setup_future_usage` on Checkout Session creation
  * Add support for `subscription_start_date` on the Upcoming Invoice API

## 10.4.0 - 2019-07-01
* [#796](https://github.com/stripe/stripe-java/pull/796)
  * Add support for the `SetupIntent` resource and APIs
  * Add support for `PlatformTaxFee` resource
  * Add `unified_proration` on `InvoiceItem` and `InvoiceLineItem`
  * Add `default_payment_method` and `default_source` to `SubscriptionSchedule`

## 10.3.0 - 2019-06-24
* [#792](https://github.com/stripe/stripe-java/pull/792) Enable request latency telemetry by default

## 10.2.0 - 2019-06-24
* [#794](https://github.com/stripe/stripe-java/pull/794)
  * Add `collection_method` to `Invoice`, `Subscription` and `SubscriptionSchedule`
  * Add `unified_propration` to `InvoiceLineItem`
  * Support unsetting `dob` on an `Account`
  * Removed `native_url` from WeChat `Source`. While technically breaking, this field has never been used

## 10.1.0 - 2019-06-18
* [#789](https://github.com/stripe/stripe-java/pull/789)
  * Add support for SEPA Credit Transfer sources
  * Add support for `CustomerBalanceTransaction` resource and APIs
  * Add `balance` property on `Customer`
  * Add `submitType` property on `checkout.Session`
  * Add `merchantAmount` and `merchantCurrency` properties on `issuing.Transaction`
  * Add `location` property on `terminal.ConnectionToken`

## 10.0.2 - 2019-05-29
* [#784](https://github.com/stripe/stripe-java/pull/784) Make headers access case insensitive

## 10.0.1 - 2019-05-28
* [#783](https://github.com/stripe/stripe-java/pull/783) Fix url-encoding for string id to throw exception on passing null

## 10.0.0 - 2019-05-24
* [#781](https://github.com/stripe/stripe-java/pull/781) Pin library to API version `2019-05-16`

## 9.13.0 - 2019-05-23
* [#780](https://github.com/stripe/stripe-java/pull/780)
  * Add support for new `radar.early_fraud_warning` resource and methods
  * Add new in_gst and no_vat tax ID types
  * Add `spending_limits_currency` attribute and parameter in Issuing resources

## 9.12.0 - 2019-05-14
* [#777](https://github.com/stripe/stripe-java/pull/777)
  * Add support for `Capability`
  * Add enum `off_session` for `PaymentIntentConfirmParams` and `PaymentIntentCreateParams`
  * Add enum `abandoned` for `PaymentIntentCancellationParams`.
  * Add support for `statementDescriptorKana` and `statementDescriptorKanji` in `Account.SettingsPayments`

## 9.11.0 - 2019-05-10
* [#776](https://github.com/stripe/stripe-java/pull/776)
  * Add support for `startDate` in `Subscription`
  * Removed one unsupported enum on `PaymentIntentCancelParams`

## 9.10.0 - 2019-05-06
* [#773](https://github.com/stripe/stripe-java/pull/773)
  * Add support for `extraParams` in all sub-classes of ApiRequestParams their nested classes
  * Add support for webhook event `payment_method.updated`
  * Add support for `payment_intent` filter when listing `Charge`
  * Add support for `legacy_payments` enum `RequestedCapability` in `AccountCreateParams` and `AccountUpdateParams`

## 9.9.0 - 2019-05-03
* [#768](https://github.com/stripe/stripe-java/pull/768)
  * Add support for `customer` filter when listing `PaymentIntent`
  * Add support for `replacement_for` and `replacement_reason` on Issuing `card` creation

## 9.8.0 - 2019-04-29
* [#766](https://github.com/stripe/stripe-java/pull/766) Add support for ACSS debit Sources

## 9.7.0 - 2019-04-24
* [#761](https://github.com/stripe/stripe-java/pull/761) Add support for `TaxRate` resource and APIs

## 9.6.0 - 2019-04-24
* [#756](https://github.com/stripe/stripe-java/pull/756) Fix form-encoding to support `Collection` in untyped params as array. Previously only `List` is form-encoded as array.
* [#755](https://github.com/stripe/stripe-java/pull/755) Add support for `CARD_ISSUING` enum in `RequestedCapability` for Account create/update params.

## 9.5.0 - 2019-04-22
* [#750](https://github.com/stripe/stripe-java/pull/750) Add support for the `TaxId` resource and APIs

## 9.4.0 - 2019-04-18
* [#748](https://github.com/stripe/stripe-java/pull/748)
  * Add support for `address`, `name`, `phone` and `preferredLocales` on `Customer`
  * Add support for the `CreditNote` resource and APIs
  * Add support for account and customer related fields on the `Invoice` resource

## 9.3.0 - 2019-04-16
* [#745](https://github.com/stripe/stripe-java/pull/745) Add support for the Checkout `Session` resource and APIs

## 9.2.0 - 2019-04-15
* [#744](https://github.com/stripe/stripe-java/pull/744)
  * Make `paymentIntent` on `Invoice` expandable instead of full-model
  * Add support for issuing `SpendingLimit` in `Card` and `CardHolder`
  * Add support for fields in `PaymentMethodDetails.Card.ThreeDSecure`

## 9.1.0 - 2019-04-11
* [#737](https://github.com/stripe/stripe-java/pull/737) Fix issue #736 on un-encoded ID in url path
* [#739](https://github.com/stripe/stripe-java/pull/739) Add support for `ConfirmationMethod` in `PaymentIntentCreateParams`, `AuthorizationControls` in cardholders mode/params
* [#735](https://github.com/stripe/stripe-java/pull/735) Fix encoding of nested parameters in multipart requests
* [#734](https://github.com/stripe/stripe-java/pull/734) Upgrade Gradle to 5.3.1

## 9.0.0 - 2019-04-09
* [#700](https://github.com/stripe/stripe-java/pull/700) Major version release. Refer to our [migration guide for v9](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v9) for a list of backward incompatible changes to watch out for.
Pull requests included in this release:
* [#698](https://github.com/stripe/stripe-java/pull/698) Drop support for Java 1.7
* [#723](https://github.com/stripe/stripe-java/pull/723) Use `Optional` for unsafe event data object deserialization
* [#705](https://github.com/stripe/stripe-java/pull/705) Add support for typed parameters, change deserialization of array in `Event#previousAttributes` from `Object[]` to `List<Object>`
* [#729](https://github.com/stripe/stripe-java/pull/729) Add missing Javadoc for non-autogenerated classes (`EphemeralKey`, `Event` and `File`)
* [#730](https://github.com/stripe/stripe-java/pull/730) Add support for typed parameters for non-autogenerated classes (`EphemeralKey`, `Event` and `File`)
* [#702](https://github.com/stripe/stripe-java/pull/702) Dev dependency version upgrades
* [#706](https://github.com/stripe/stripe-java/pull/706) Dev dependency version upgrades (Junit 5)
* [#728](https://github.com/stripe/stripe-java/pull/728) Dev dependency version upgrades
* [#713](https://github.com/stripe/stripe-java/pull/713) Use ErrorProne in builds

## 8.1.0 - 2019-03-25
* [#710](https://github.com/stripe/stripe-java/pull/710) Add support for `PaymentMethod.BillingDetails` on `Charge`.
* [#708](https://github.com/stripe/stripe-java/pull/708) Fix issues reported by `ErrorProne` Nothing major or user visible.

## 8.0.2 - 2019-03-20
* [#704](https://github.com/stripe/stripe-java/pull/704) Fix test compiler error by removing an accidental line

## 8.0.1 - 2019-03-20
* [#701](https://github.com/stripe/stripe-java/pull/701) Fix java doc on deprecated `EventData#getObject` and `Event#getDataObjectDeserializer`

## 8.0.0 - 2019-03-19
* [#662](https://github.com/stripe/stripe-java/pull/662) Major version release. Supports a pinned API version [2019-03-14](https://stripe.com/docs/upgrades#2019-03-14). Refer to our [migration guide for v8](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v8) for API upgrade guide and lists of backwards incompatible changes to watch out for.

## 7.63.1 - 2020-17-11
* Identical to 7.29.0

## 7.63.0 - 2020-17-11
* Published in error. Do not use. This is identical to 20.27.0.

## 7.29.0 - 2019-03-18
* [#695](https://github.com/stripe/stripe-java/pull/695) Add support for `payment_intent` on `Charge`.

## 7.28.0 - 2019-03-18
* [#688](https://github.com/stripe/stripe-python/pull/688) Add support for the `PaymentMethod` resource and APIs
* [#691](https://github.com/stripe/stripe-python/pull/691) Add support for deleting a Terminal `Location` and `Reader`

## 7.27.0 - 2019-03-13
* [#689](https://github.com/stripe/stripe-java/pull/689) Add support for `columns` on `ReportRun` and `default_columns` on `ReportType`.

## 7.26.0 - 2019-03-06
* [#686](https://github.com/stripe/stripe-java/pull/686) Add support for `cancel_at` on `Subscription`.

## 7.25.0 - 2019-02-28
* [#684](https://github.com/stripe/stripe-java/pull/684) Add support for `latest_invoice` on `Subscription`.
* [#685](https://github.com/stripe/stripe-java/pull/685) Add `api_version` to the `WebhookEndpoint` resource.

## 7.24.0 - 2019-02-22
* [#681](https://github.com/stripe/stripe-java/pull/681) Add support for `status_transitions` and marked `date` as deprecated on `Invoice`.

## 7.23.0 - 2019-02-19
* [#660](https://github.com/stripe/stripe-java/pull/660) Add support for API version `2019-02-19` and related changes to `Account` and `Person`.

## 7.22.0 - 2019-02-16
* [#678](https://github.com/stripe/stripe-java/pull/678) Add `StripeException.getStripeError()` and `OAuthException.getOauthError()` accessors

## 7.21.0 - 2019-02-12
* [#648](https://github.com/stripe/stripe-java/pull/648) Add support for `transfer_data[destination]` on `Invoice` and `Subscription`.

## 7.20.0 - 2019-02-12
* [#670](https://github.com/stripe/stripe-java/pull/670) Add support for API version `2019-02-11` with changes to Payment Intents
  * `PaymentIntentSourceAction`, `PaymentIntentSourceActionValueAuthorizeWithUrl` and `next_source_action` are now depreacated. Use `PaymentIntent.NextAction`, `PaymentIntent.NextActionRedirectToUrl` and `next_action` instead.
  * `allowed_source_types` is now depreacated. Use `payment_method_types` instead.
* [#673](https://github.com/stripe/stripe-java/pull/673) Add support for `SubscriptionSchedule` and `SubscriptionScheduleRevision`. Also add support for `invoice_settings` on `Customer`.
* [#675](https://github.com/stripe/stripe-java/pull/675) The `customer` property is now expandable on `Invoice`.
* [#677](https://github.com/stripe/stripe-java/pull/677) Add support for `transfer_data[amount]` on `Charge`.

## 7.19.0 - 2019-02-06
* [#661](https://github.com/stripe/stripe-java/pull/661) Add configurable telemetry to gather information on client-side request latency

## 7.18.1 - 2019-02-04
* [#657](https://github.com/stripe/stripe-java/pull/657) Better handling of namespaced resources
* [#665](https://github.com/stripe/stripe-java/pull/665) Configure Gradle signing plugin to use gpg-agent

## 7.18.0 - 2019-01-25
* [#649](https://github.com/stripe/stripe-java/pull/649) Add support for `destination_payment_refund` and `source_refund` on the `Reversal` resource.

## 7.17.0 - 2019-01-17
* [#656](https://github.com/stripe/stripe-java/pull/656) Added `receipt_url` property to `Charge`.

## 7.16.0 - 2019-01-17
* [#653](https://github.com/stripe/stripe-java/pull/653) Add support for `custom_fields` and `footer` on `Invoice`.
* [#655](https://github.com/stripe/stripe-java/pull/655) Add support for billing thresholds.

## 7.15.0 - 2019-01-14
* [#652](https://github.com/stripe/stripe-java/pull/652) Add support for expandable `transfer_data[destination]` on `Charge` and `PaymentIntent`.

## 7.14.0 - 2019-01-11
* [#632](https://github.com/stripe/stripe-java/pull/632) Add support for `transfer_data` and `application_fee_amount` on `Charge` and `transfer_data[destination] on `PaymentIntent`.
* [#647](https://github.com/stripe/stripe-java/pull/647) Add support for deserializing `IssuerFraudRecord` in events.

## 7.13.0 - 2019-01-09
* [#626](https://github.com/stripe/stripe-java/pull/626) Add support for the `AccountLink` APIs.

## 7.12.0 - 2019-01-08
* [#634](https://github.com/stripe/stripe-java/pull/634) Add support for `wallet_provider` on `Issuing.Authorization`.

## 7.11.0 - 2018-12-27
* [#629](https://github.com/stripe/stripe-java/pull/629) Add support for `actionable` and `has_liability_shift` on `IssuerFraudRecord`

## 7.10.0 - 2018-11-28
* [#621](https://github.com/stripe/stripe-java/pull/621) Add missing properties on the `Refund` resource.
* [#623](https://github.com/stripe/stripe-java/pull/623) Add support for the `Review` APIs.

## 7.9.0 - 2018-11-27
* [#614](https://github.com/stripe/stripe-java/pull/614) Add support for `ValueList` and `ValueListItem` for Radar

## 7.8.0 - 2018-11-19
* [#616](https://github.com/stripe/stripe-java/pull/616) Add missing properties to a few resources:
  * Add `default_source` to `Invoice` and `Subscription`
  * Add `livemode` to Subscription
  * Add `metadata` and `subscription` to `SubscriptionItem`

## 7.7.0 - 2018-11-14
* [#615](https://github.com/stripe/stripe-java/pull/615) Add `last_payment_error` to `PaymentIntent`.

## 7.6.0 - 2018-11-09
* [#613](https://github.com/stripe/stripe-java/pull/613) Throw `ApiException` on malformed JSON responses
    - Previously, the library would throw `com.google.gson.JsonSyntaxException` in this case. We've chosen to release this as a minor update because we assume that most users are already catching Stripe exceptions.

## 7.5.0 - 2018-11-08
* [#604](https://github.com/stripe/stripe-java/pull/604) Add new API endpoints for the `Invoice` resource.

## 7.4.0 - 2018-11-08
* [#609](https://github.com/stripe/stripe-java/pull/609) Support new shape of the `PaymentIntent` resource.

## 7.3.0 - 2018-11-07
* [#610](https://github.com/stripe/stripe-java/pull/610) Add `flatAmount` to `Plan.Tier`
* [#611](https://github.com/stripe/stripe-java/pull/611) Add `supportedTransferCountries` to `CountrySpec`
* [#611](https://github.com/stripe/stripe-java/pull/611) Add `supportAddress` to `Account`

## 7.2.0 - 2018-10-31
* [#603](https://github.com/stripe/stripe-java/pull/603) Add support for the `Person` resource
* [#606](https://github.com/stripe/stripe-java/pull/606) Add support for the `WebhookEndpoint` resource

## 7.1.0 - 2018-10-10
* [#602](https://github.com/stripe/stripe-java/pull/602) Adds support for `partnerId` in `setAppInfo()`

## 7.0.0 - 2018-09-24
Major version release. Refer to our [migration guide for v7](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v7) for a list of backwards incompatible changes to watch out for.

Pull requests included in this release:
* [#598](https://github.com/stripe/stripe-java/pull/598) Compatibility with latest API version
* [#593](https://github.com/stripe/stripe-java/pull/593) Replace `FileUpload` class with `File` class
* [#592](https://github.com/stripe/stripe-java/pull/592) Support for terminal endpoints

## 6.12.0 - 2018-09-06
* [#586](https://github.com/stripe/stripe-java/pull/586) Add `invoicePrefix` to `Customer`

## 6.11.0 - 2018-09-05
* [#584](https://github.com/stripe/stripe-java/pull/584) Add support for reporting resources

## 6.10.0 - 2018-09-05
* [#583](https://github.com/stripe/stripe-java/pull/583) Add `exchangeRate` to `BalanceTransaction`

## 6.9.0 - 2018-08-29
* [#580](https://github.com/stripe/stripe-java/pull/580) Add missing attributes to `Account` and `LegalEntity`
* [#581](https://github.com/stripe/stripe-java/pull/581) Add `Topup.cancel()` overload with no arguments

## 6.8.0 - 2018-08-28
* [#577](https://github.com/stripe/stripe-java/pull/577) Update `Customer` and `Plan` models for API version [2018-08-23](https://stripe.com/docs/upgrades#2018-08-23)
* [#579](https://github.com/stripe/stripe-java/pull/579) Add `authorizationCode` to `Charge`

## 6.7.0 - 2018-08-27
* [#575](https://github.com/stripe/stripe-java/pull/575) Remove support for `BitcoinReceiver` write-actions

## 6.6.0 - 2018-08-23
* [#576](https://github.com/stripe/stripe-java/pull/576) Add support for usage record summaries

## 6.5.0 - 2018-08-16
* [#574](https://github.com/stripe/stripe-java/pull/574) Add `unitLabel` to `Product`

## 6.4.0 - 2018-08-14
* [#572](https://github.com/stripe/stripe-java/pull/572) Serialize all arrays/lists with integer-indexed encoding

## 6.3.0 - 2018-08-03
* [#568](https://github.com/stripe/stripe-java/pull/568) Add cancel support for topups
* [#569](https://github.com/stripe/stripe-java/pull/569) Add support for file links

## 6.2.1 - 2018-08-02
* [#567](https://github.com/stripe/stripe-java/pull/567) Use delomboked sources when creating sources JAR

## 6.2.0 - 2018-08-01
* [#565](https://github.com/stripe/stripe-java/pull/565) Add a `retrieve()` method that accepts parameters (e.g. for expansion) to all resource classes
* [#566](https://github.com/stripe/stripe-java/pull/566) Add `object` attribute and accessors to `StripeCollection`

## 6.1.0 - 2018-07-30
* [#561](https://github.com/stripe/stripe-java/pull/561) Add `created` to `Account`

## 6.0.0 - 2018-07-30
Major version release. Refer to our [migration guide for v6](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v6) for a list of backwards incompatible changes to watch out for.

Pull requests included in this release:
* [#532](https://github.com/stripe/stripe-java/pull/532) Remove deprecated methods
* [#534](https://github.com/stripe/stripe-java/pull/534) Only capitalize the first letter of acronyms per Google's style rules
* [#535](https://github.com/stripe/stripe-java/pull/535) Change signatures to throw StripeException
* [#538](https://github.com/stripe/stripe-java/pull/538) Change all integer types to `Long` and all floating point types to `Double`
* [#540](https://github.com/stripe/stripe-java/pull/540) Add support for idempotency errors
* [#541](https://github.com/stripe/stripe-java/pull/541) Minor fixes
* [#547](https://github.com/stripe/stripe-java/pull/547) Move nested objects into inner static classes
* [#553](https://github.com/stripe/stripe-java/pull/553) Remove `Deleted*` models and add `deleted` attribute instead
* [#558](https://github.com/stripe/stripe-java/pull/558) Use `BigDecimal` for floating point values

## 5.53.0 - 2018-07-28
* [#560](https://github.com/stripe/stripe-java/pull/560) Add support for scheduled query runs (`com.stripe.model.sigma.ScheduledQueryRun`) for Sigma

## 5.52.0 - 2018-07-26
* [#556](https://github.com/stripe/stripe-java/pull/556) Add `riskScore` property to `ChargeOutcome`
* [#557](https://github.com/stripe/stripe-java/pull/557) Add support for StripeIssuing

## 5.51.0 - 2018-07-12
* [#551](https://github.com/stripe/stripe-java/pull/551) Add `autoAdvance` property to `Invoice`

## 5.50.0 - 2018-07-11
* [#552](https://github.com/stripe/stripe-java/pull/552) Rename `ApplicationFee` to `ApplicationFeeAmount` on `PaymentIntent`

## 5.49.0 - 2018-07-06
* [#548](https://github.com/stripe/stripe-java/pull/548) Add `subscriptionItem` property to `InvoiceItem` and `InvoiceLineItem`

## 5.48.0 - 2018-07-03
* [#544](https://github.com/stripe/stripe-java/pull/544) Add support for streams when uploading files

## 5.47.0 - 2018-07-02
* [#546](https://github.com/stripe/stripe-java/pull/546) Add `setClientId()` to `RequestOptionsBuilder`

## 5.46.0 - 2018-06-29
* [#543](https://github.com/stripe/stripe-java/pull/543) Add support for payment intents

## 5.45.0 - 2018-06-28
* [#542](https://github.com/stripe/stripe-java/pull/542) Fix `account.application.*` event data deserialization issue

## 5.44.0 - 2018-06-27
* [#539](https://github.com/stripe/stripe-java/pull/539) Add `customerReference` and `shippingFromZip` properties on `ChargeLevel3` model

## 5.43.0 - 2018-06-25
* [#537](https://github.com/stripe/stripe-java/pull/537) Add `level3` property on `Charge` model

## 5.42.0 - 2018-06-19
* [#529](https://github.com/stripe/stripe-java/pull/529) Annotate a lot of methods as deprecated and flagged for removal in the next major release

## 5.41.1 - 2018-06-17
* [#528](https://github.com/stripe/stripe-java/pull/528) Add `name` to `Coupon` model

## 5.41.0 - 2018-06-14
* [#522](https://github.com/stripe/stripe-java/pull/522) Add `amountPaid`, `amountRemaining` and `billingReason` to `Invoice` model

## 5.40.0 - 2018-06-13
* [#521](https://github.com/stripe/stripe-java/pull/521) Add `documentBack` property to `LegalEntity` model

## 5.39.0 - 2018-06-07
* [#515](https://github.com/stripe/stripe-java/pull/515) Add `hosted_invoice_url` and `invoice_pdf` properties to `Invoice` model

## 5.38.0 - 2018-06-06
* [#516](https://github.com/stripe/stripe-java/pull/516) Add `active` property to `Plan` model

## 5.37.0 - 2018-06-06
* [#513](https://github.com/stripe/stripe-java/pull/513) Add `on_behalf_of` property on `Charge` model
* [#512](https://github.com/stripe/stripe-java/pull/512) Fix `update()` methods for `FeeRefund` and `Reversal`
* [#302](https://github.com/stripe/stripe-java/pull/302) The library now uses Project Lombok. All API resource classes now have `equals` and `hashCode` methods.

## 5.36.0 - 2018-05-09
* [#505](https://github.com/stripe/stripe-java/pull/505) Add support for issuer fraud records

## 5.35.1 - 2018-04-06
* [#498](https://github.com/stripe/stripe-java/pull/498) Fix two bugs found by Error Prone

## 5.35.0 - 2018-04-05
* [#462](https://github.com/stripe/stripe-java/pull/462) Add support for flexible billing primitives

## 5.34.1 - 2018-03-23
* [#469](https://github.com/stripe/stripe-java/pull/469) Add support for expanding `product` attribute on `Plan` model

## 5.34.0 - 2018-03-22
* [#459](https://github.com/stripe/stripe-java/pull/459) Add support for passing parameters to `autoPagingIterable()`
* [#466](https://github.com/stripe/stripe-java/pull/466) Fix serialization of null expandable attributes

## 5.33.3 - 2018-03-21
* [#464](https://github.com/stripe/stripe-java/pull/464) Add OSGi headers to manifest file

## 5.33.2 - 2018-02-28
* [#458](https://github.com/stripe/stripe-java/pull/458) Remove deprecation markers from `sourceTransaction` accessors on `Transfer` model

## 5.33.1 - 2018-02-27
* [#457](https://github.com/stripe/stripe-java/pull/457) Add title, version and vendor in JAR manifest file

## 5.33.0 - 2018-02-23
* [#455](https://github.com/stripe/stripe-java/pull/455) Add support for `code` attribute on all Stripe exceptions

## 5.32.0 - 2018-02-21
* [#453](https://github.com/stripe/stripe-java/pull/453) Add support for topups

## 5.31.0 - 2018-02-13
* [#446](https://github.com/stripe/stripe-java/pull/446) Add support for deserializing `source_mandate_notification` objects

## 5.30.0 - 2018-02-13
* [#449](https://github.com/stripe/stripe-java/pull/449) Add `Stripe.setAppInfo()` for passing custom application information in headers

## 5.29.0 - 2018-02-08
* [#447](https://github.com/stripe/stripe-java/pull/447) Update `Plan`, `Product` and `Subscription` models for latest API version

## 5.28.0 - 2018-01-02
* [#439](https://github.com/stripe/stripe-java/pull/439) Upgrade GSON dependency to 2.8.2

## 5.27.0 - 2017-12-22
* [#438](https://github.com/stripe/stripe-java/pull/438) Add support for passing parameters to `SubscriptionItem.delete()`

## 5.26.0 - 2017-12-18
* [#436](https://github.com/stripe/stripe-java/pull/436) Fix bug where `options` were not being plumbed through in an account delete method
* [#436](https://github.com/stripe/stripe-java/pull/436) Add the proper set of overloads for account reject method

## 5.25.0 - 2017-12-06
* [#432](https://github.com/stripe/stripe-java/pull/432) Make charge on `Dispute` expandable

## 5.24.0 - 2017-11-28
* [#421](https://github.com/stripe/stripe-java/pull/421) Expose response objects
* [#427](https://github.com/stripe/stripe-java/pull/427) Add `automatic` property on `Payout` model

## 5.23.1 - 2017-11-09
* [#423](https://github.com/stripe/stripe-java/pull/423) Fix JSON encoding for expandable fields by adding customer encoder

## 5.23.0 - 2017-10-31
* [#419](https://github.com/stripe/stripe-java/pull/419) Support for exchange rate APIs

## 5.22.1 - 2017-10-27
* [#418](https://github.com/stripe/stripe-java/pull/418) Move build and release system from Maven to Gradle

## 5.22.0 - 2017-10-27
* [#417](https://github.com/stripe/stripe-java/pull/417) Support for listing source transactions

## 5.21.0 - 2017-10-09
* [#410](https://github.com/stripe/stripe-java/pull/410) Rename "verification" to "code verification" for sources (should have been unused up to this point)
* [#412](https://github.com/stripe/stripe-java/pull/412) Add support for detaching sources from customers
* Note that some minor versions (5.11 through 5.20) were accidentally skipped for this release. I'm leaving as is to minimize churn, but please don't be alarmed!

## 5.10.0 - 2017-10-04
* Add `failure_reason` field to the source redirect flow model

## 5.9.1 - 2017-10-03
* No longer clobber global value of DNS cache TTL if it has not been set

## 5.9.0 - 2017-09-25
* Support Java 9 (just involves upgrading a few Maven plugins)

## 5.8.0 - 2017-08-31
* Add support for all OAuth actions

## 5.7.1 - 2017-07-11
* Force UTF-8 encoding for webhook signature verification

## 5.7.0 - 2017-07-11
* Use standard library comparison for webhook signature verification

## 5.6.0 - 2017-06-27
* `pay` on invoice can now take parameters

## 5.5.0 - 2017-06-23
* Add support for alternate statement descriptors on charge

## 5.4.0 - 2017-06-19
* Add support for ephemeral keys

## 5.3.0 - 2017-06-14
* Add missing expandable fields on every model

## 5.2.0 - 2017-06-09
* Support for expandable sources in balance transactions

## 5.1.0 - 2017-06-07
* Add `account` field to the event model

## 5.0.0 - 2017-05-31
* Clarify tolerance parameter for webhook signatures is in seconds
* Support expanded request in `Event` model (now with idempotency key)

## 4.9.1 - 2017-05-30
* This release should have been 5.0.0, see notes for that

## 4.9.0 - 2017-05-25
* This release should have been 5.0.0, see notes for that

## 4.8.0 - 2017-05-25
* Add support for account login links

## 4.7.0 - 2017-05-02
* Add `three_d_secure` accessors to `Card` model

## 4.6.0 - 2017-04-28
* Support for checking webhook signatures

## 4.5.0 - 2017-04-28
* Make connect and read timeouts configurable (see README for details)

## 4.4.0 - 2017-04-24
* Add payout properties to `Account` model

## 4.3.0 - 2017-04-12
* Add support for `available_payout_methods` to `Card` model

## 4.2.0 - 2017-04-06
* Add support for payouts; see: https://stripe.com/docs/upgrades#2017-04-06

## 4.1.0 - 2017-04-04
* Make `rule` under `ChargeOutcome` expandable

## 4.0.0 - 2017-03-13
* Dispute on charge becomes expandable field (not expanded by default)
* Charge on order becomes expandable field (not expanded by default)
* Customer on order becomes expandable field (not expanded by default)
* Add missing fields on order: `amountReturned`, `returns`, and `upstreamId`
* Fix type of `OrderReturnCollection` (now actually an order return)

## 3.11.0 - 2017-02-22
* Add new parameters for invoices and subscriptions

## 3.10.2 - 2017-02-21
* Add missing API resources to object deserializer

## 3.10.1 - 2017-02-21
* This release was inadvertently empty. See 3.10.2 for changes.

## 3.10.0 - 2017-02-13
* Deprecated sourced transfers under balance transactions

## 3.9.0 - 2017-02-02
* Add variant of account `delete` that doesn't require parameters

## 3.8.0 - 2017-01-23
* Add `ChargeOutcomeRule` to `ChargeOutcome`

## 3.7.0 - 2017-01-06
* Add `getObject`/`setObject` to a number of models where it was missing
* Add `toJson` method to `StripeObject`

## 3.6.0 - 2017-01-03
* Add non-public `network_reason_code` to `Dispute` model

## 3.5.0 - 2016-12-08
* Add expandable Charge to Invoice

## 3.3.0 - 2016-11-22
* Add retrieve method for 3-D Secure resources

## 3.2.0 - 2016-10-18
* Add `risk_level` attribute to `ChargeOutcome` model

## 3.1.0 - 2016-10-18
* Support for 403 status codes (permission denied)

## 3.0.0 - 2016-10-17
* Change representations of money (e.g. "amounts" or "balances") from `Integer` to `Long`

## 2.10.2 - 2016-10-13
* Fix NullPointerException in SourceDeserializer for bitcoin receivers, and refactor tests.

## 2.10.1 - 2016-10-06
* Fix bug where the Transfer transactions method wasn't using requestCollection

## 2.10.0 - 2016-09-16
* Add support for Apple Pay domains

## 2.9.0 - 2016-09-07
* Add `description`, `iin`, and `issuer` attributes to `Card` model

## 2.8.0 - 2016-08-05
* Add `Source` model (prototype)

## 2.7.0 - 2016-07-12
* Add `ThreeDSecure` model for 3-D secure payments

## 2.6.1 - 2016-06-13
* Fix serialization of `businessURL` and `supportURL` in `Account` model

## 2.6.0 - 2016-05-25
* Add support for returning Relay orders

## 2.5.1 - 2016-05-23
* Give all collection classes access to auto-paginating helpers that work beyond first page

## 2.5.0 - 2016-05-04
* Add `retrieve`, `update`, `create`, `all`, and `delete` methods to the Subscription class

## 2.4.0 - 2016-04-21
* Add many missing fields to many models (see #285 for details)

## 2.3.0 - 2016-04-18
* Add source types to `Money` model under the `Balance` model

## 2.2.0 - 2016-04-12
* Add `Outcome` to the `Charge` model

## 2.1.0 - 2016-04-12
* Deprecate `getUser` and `setUser` on `ApplicationFee`
* Deprecate `getCard` and `setCard` on `Charge`
* Deprecate `getAccount` and `setAccount` on `Transfer`
* Deprecate `getOtherTransfers` and `setOtherTransfers` on `Transfer`
* Deprecate `getSummary` and `setSummary` on `Transfer`

## 2.0.0 - 2016-04-08
* Change `getBusinessUrl` to `getBusinessURL` in `Account` model
* Change `getSupportUrl` to `getSupportURL` in `Account` model
* Change `getUrl` to `getURL` in `Product` model
* Change `setUrl` to `setURL` in `Product` model
* Change `getUrl` to `getURL` in `StripeCollection` model
* Change `setUrl` to `setURL` in `StripeCollection` model
* Remove previously-deprecated `getUrl` in `StripeCollectionAPIResource` model
* Change `getUrl` to `getURL` in `StripeCollectionInterface`

## 1.48.0 - 2016-03-29
* Add accessors for `default_currency` to `CountrySpec` model

## 1.47.0 - 2016-03-21
* Allow request params and options to be overridden for `autoPagingIterable`

## 1.46.0 - 2016-03-15
* Expose creating bank accounts on customer
* Add `reject` action on account

## 1.45.0 - 2016-02-18
* Add `CountrySpec` model for looking up country payment information

## 1.44.0 - 2016-02-11
* Add `businessTaxIdProvided` to `LegalEntity`

## 1.43.0 - 2016-01-26
* Add support for deleting Relay SKUs and products

## 1.42.0 - 2016-01-21
* Add `details_code` to `LegalEntity`
* Add `disabled_reason` to `Verification`

## 1.41.1 - 2016-01-15
* Fix serialization bug in `LegalEntity`'s `ssnLast4Provided`

## 1.41.0 - 2016-01-13
* Add lots of missing fields to Account, Event, and Refund

## 1.40.1 - 2016-01-07
* Fix casting of newer objects to *typed* models

## 1.40.0 - 2015-12-03
* Add missing `ShippingDetails` to `Customer` model

## 1.39.0 - 2015-12-01
* Add a verification routine for external accounts

## 1.38.1 - 2015-11-30
* Fix bug when using lazy-paging collection across multiple pages

## 1.38.0 - 2015-10-27
* Add pagination through the use of calling `AutoPagingIterable()` for a page
* Fix bug where arrays were not being properly encoded when sent to the API
* Fix bug where setting a `List` to `null` wasn't encoding to an empty string (which is required to unset an array)

## 1.37.1 - 2015-10-07
* Bugfix `setTransfer` on `Reversal`

## 1.37.0 - 2015-09-14
* Products, SKUs, and Orders -- https://stripe.com/relay

## 1.36.0 - 2015-09-11
* Add support for new rate limiting responses.

## 1.35.0 - 2015-08-31
* Add `bankAccount` to `Token`

## 1.34.0 - 2015-08-17
* Added `retrieve`, `all`, `update`, `create` methods to `Refund`

## 1.33.0 - 2015-08-03
* Added `retrieve`, `all`, `update` and `close` methods to `Dispute`
* Added `delete` method to managed `Account`s

## 1.32.1 - 2015-07-24
* Added `account` to `ApplicationFee`.

## 1.32.0 - 2015-07-06
* Added `getRequestId` method to `StripeException`.

## 1.31.0 - 2015-06-01
* `ConcretePaymentSource` and the `PaymentSource` interface have been combined into one `ExternalAccount` class
* `PaymentSourceCollection` was renamed `ExternalAccountCollection`
* `Account` now supports `getExternalAccounts`, which allows both `BankAccount` and `Card` attachment.
* `BankAccount`s can now be deleted from `Customer`s (private beta feature) and `Account`s

## 1.30.0 - 2015-05-28
* Add decline_code, charge to CardException

## 1.29.0 - 2015-05-21
* Added tax percent field to subscriptions
* Added tax and tax percent fields to invoices

## 1.28.0 - 2015-05-08
* Added support for Alipay accounts
* Added default source when type is unknown
* Added support dynamicLast4 on Card for Apple Pay integrations

## 1.27.1 - 2015-03-30
* Charge objects now support status

## 1.27.0 - 2015-02-19
* Added support for transfer reversals
* Added support for account creation/updating/retrieval by ID
* Customer objects now support currency
* Added STRIPE-ACCOUNT header options in RequestOptions

## 1.26.0 - 2015-02-19
* Added Update and Delete for Bitcoin Receivers
* Support new API version (2015-02-18) by providing source type properties
  on Customer and Charge in addition to card type properties

## 1.25.1 - 2015-01-23
* Test of new stripe-java release process.

## 1.25.0 - 2015-01-21
* Support making bitcoin charges through BitcoinReceiver source object

## 1.24.1 - 2015-01-05
* Support for fraud reporting methods was added

## 1.24.0 - 2014-12-18
* The ability to post multipart/form-data was added
* Requests can now hit different base endpoints, by passing in `apiBase` when creating URLs
* Support for the file upload endpoints was added. Documentation is available at https://stripe.com/docs/api#file_uploads
* Support for fraud reporting (marking charges as safe or fraudulent) was added

## 1.23.0 - 2014-12-08
* Java 1.5 support dropped. We strongly suggest using newer versions of Java due to runtime, VM, language, and syntax improvements
* Dispute Evidence has been updated to reflect the new version of Dispute evidence format introduced as part of api version 2014-12-08. See https://stripe.com/docs/upgrades#2014-12-08 for details

## 1.22.0 - 2014-12-03
* Convention is to call methods with a RequestOptions object, instead of an API Key directly
* Support setting the stripe version on a per-request level, via the RequestOptions object
* Add shipping and address to the charge object

## 1.21.0 - 2014-11-14
* Created Charge.receiptEmail field
* Created Charge.receiptNumber field

## 1.20.0 - 2014-11-06
* Change chargeEnabled to chargesEnabled
* Change transferEnabled to transfersEnabled
* Add id, currency, status, fingerprint, and defaultForCurrency to BankAccount

## 1.19.1 - 2014-10-02
* Add back explict autoboxing for Google App Engine reflected HTTP method (fixes issue #106)

## 1.19.0 - 2014-09-30
* Add statementDescription field to transfer
* A few non-breaking general cleanups

## 1.18.0 - 2014-08-25
* Added isChargeRefundable and balanceTransactions to Dispute https://stripe.com/docs/upgrades#2014-08-20

## 1.17.0 - 2014-08-19
* Added metadata to Coupons

## 1.16.0 - 2014-07-26
* Application Fee refunds now a list instead of array

## 1.15.1 - 2014-06-25
* Added brand and funding to Card

## 1.15.0 - 2014-06-17
* Added metadata to Refund
* Added metadata to Dispute
* Fixed incorrect return types for certain collection resources

## 1.14.1 - 2014-06-04
* Added metadata to Subscription

## 1.14.0 - 2014-05-28
* Add support for canceling transfers

## 1.13.1 - 2014-05-23
* Fix bug with retrieving lines of upcoming invoice.

## 1.13.0 - 2014-05-21
* Support cards for recipients.

## 1.12.0 - 2014-04-09
* Test SSL certificate against blacklist

## 1.11.0 - 2014-04-07
* Upgrade customer, charge, and coupon collections to new pagination style
* Add missing fields to Account object

## 1.10.0 - 2014-03-28
* Support for newstyle pagination API (https://groups.google.com/a/lists.stripe.com/forum/#!topic/api-announce/29sLxmICA9E)

## 1.9.0 - 2014-03-17
* Support for dynamic statement descriptions
* Preserve original 'threaqd null ids through to requests' behavior

## 1.8.0 - 2014-03-12
* Upgrade Google GSON to 2.2.4
* URL-encode object ids (fixes #62)

## 1.7.2 - 2014-02-27
* Add 'valid' field to coupon

## 1.7.1 - 2014-01-31
* Fix Subscription cancel method call
* Miscellaneous field fixups
    * Discount on Subscription is an expanded Discount, not string
    * Add missing application_fee_percent field on Subscription
    * Add missing application_fee field on Invoice

## 1.7.0 - 2014-01-29
* Add support for multiple subscriptions per customer

## 1.6.5 - 2014-01-22
* Fixed url to refund application fees (fixes #60)
* DRY'd some of the application fee urls

## 1.6.4 - 2014-01-16
* Added metadata to InvoiceItem and InvoiceLineItem (fixes #59)

## 1.6.3 - 2014-01-13
* Support overriding base url (for testing) (user request)
* Add default currency to Account object (fixes #46)
* Add metadata to plan object (thanks, desirable-objects)
* Remove plan from Customer (fixes #42)
* Style improvements (see #30) (thanks, steve-nester-uk)

## 1.6.2 - 2014-01-08
* Fix return type of Coupon.getRedeemBy

## 1.6.1 - 2013-12-02
* Add ApplicationFee API resource

## 1.5.1 - 2013-10-17
* Added field transfer_enabled to Account API object (thanks, kurguzov)

## 1.5.0 - 2013-10-01
* Add support for metadata API

## 1.4.2 - 2013-09-18
* Add support for closing disputes

## 1.4.1 - 2013-09-04
* Fix return type of CustomerCardCollection.retrieve

## 1.4.0 - 2013-09-03
* Tweak card create to align it with docs

## 1.3.2 - 2013-08-30
* Add missing `retrieve` method to `BalanceTransaction`
* Add missing fields to `BalanceTransaction`
    * `id`
    * `fee`
    * `fee_details`
    * `description`
* Add `id` field to `Subscription`

## 1.3.1 - 2013-08-21
* Patch release with missing field, added tests

## 1.3.0 - 2013-08-19
* Add BalanceTransaction API resource
* Add Refund resource
* Resource updates
    * Remove `fee`, `feeDetails` from Transfer and Charge resources
    * Add `balanceTransaction` to Transfer, Charge, and Dispute resources
    * Add `refunds` to Charge resource

## 1.2.8 - 2013-08-12
* Add support for unsetting attributes by updating with a null value. Setting properties to a blank string is now an error.

## 1.2.7 - 2013-07-31
* Enable createCard() to use a token

## 1.2.6 - 2013-07-30
* Add 'createCard' to Customer
* Update card collections bindings
* Parse card objects when receiving customer.card.created events

## 1.2.5 - 2013-07-15
* Add support for new cards API.
    * You will probably need to upgrade the Stripe API version on your account to 2013-07-05 or explicitly specify an API version with com.stripe.Stripe.apiVersion when you switch to this release of the bindings. More information about the relevant changes can be found at https://stripe.com/docs/upgrades#2013-07-05 and http://bit.ly/13miHM8
* Add a StripeRawJsonObject type for deserializing webhook events we don't recognize
* Add a Money class for representing account balances in individual currencies

## 1.2.4 - 2013-06-21
* Add more Balance API resource, and add to deserializer.

## 1.2.3 - 2013-05-7
* Rename BankAccount property `valid` to `validated`

## 1.2.2 - 2013-04-25
* Add more objects to Deserializer

## 1.2.1 - 2013-04-20
* Fix TransferTransaction fee retrieval

## 1.2.0 - 2013-04-11
* Allow Transfers to be creatable
* Add new Recipient resource

## 1.1.18 - 2013-03-19
* Add support for charge capture.

## 1.1.17 - 2013-02-18
* Add ability to deserialize account-related events.
* Add user ID to Event object.

## 1.1.16 - 2013-02-15
* Fix off-by-one error in deserializing events (github issue #27).

## 1.1.15 - 2013-02-01
* List all checked exceptions throws by methods.
* Add support for plan interval count.

## 1.1.14 - 2013-01-15
* Add support for setting Stripe API version override.

## 1.1.13 - 2012-12-29
* Add address_city to card
* Upgrade Google GSON to 2.2.2

## 1.1.12 - 2012-12-24
* Add option to provide custom URL handler

## 1.1.11 - 2012-11-17
* Explict cast to javax.net.ssl.HttpsURLConnection to prevent issues with user imports

## 1.1.10 - 2012-11-15
* Add currency to Invoice resource
* Add amountOff and currency to Coupon resource

## 1.1.9 - 2012-11-08
* Add new Dispute resource
* Add support for updating charge disputes

## 1.1.8 - 2012-10-30
* Add support for creating invoices
* Add support for new Invoice.lines return format

## 1.1.7 - 2012-10-15
* Add quantity to Subscription

## 1.1.6 - 2012-10-15
* Add Fee API resource, add feeDetails to Charge API resource.

## 1.1.5 - 2012-09-26
* Pass query parameters to DELETE-based methods when using Google App Engine (github issue #17)

## 1.1.4 - 2012-08-31
* Add update and pay methods for Invoice resource

## 1.1.3 - 2012-08-15
* Add the Account API resource

## 1.1.2 - 2012-08-06
* Allow specification of API key at the API call level

## 1.1.1 - 2012-05-24
* Use String.length() == 0 instead of String.isEmpty() for compatibility with JDK 1.5 (needed for Android 2.2)

## 1.1.0 - 2012-05-16
* Change type of cvcCheck, addressZipCheck, and addressLine1Check attributes on com.stripe.model.Card; values of those fields will be "pass", "fail", "unchecked", or null (github issue #11)
* Remove code and percentOff attributes from com.stripe.model.Discount. Stripe never returned these values for Discount objects, so they would previously always be null
* Add missing fields to Charge, Coupon, Discount, Event, and Invoice models (github issue #12)
* Include parameters passed to any object's delete method in actual API requests (github issue #10)
* Add new deleteDiscount method to com.stripe.model.Customer
* Switch from using HTTP Basic auth to Bearer auth. (Note: Stripe will support Basic auth for the indefinite future, but recommends Bearer auth when possible going forward)
* Numerous test suite improvements


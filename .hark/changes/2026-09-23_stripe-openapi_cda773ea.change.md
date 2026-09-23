---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2295
semver_level: major
is_stripe_api_change: true
---

* Add support for new resources `financialconnections.Consent`, `v2.moneymanagement.FinancialAccountWalletExportCredentials`, `v2.moneymanagement.FinancialAccountWalletExport`, `v2.provisioning.Eligibility`, `v2.provisioning.PaymentMethodRequest`, `v2.provisioning.PaymentProfile`, `v2.provisioning.Project`, `v2.provisioning.ProviderConnectionRequest`, `v2.provisioning.ProviderConnection`, `v2.provisioning.ProviderServiceDetail`, `v2.provisioning.Provider`, and `v2.provisioning.Resource`
* ⚠️ Remove support for resource `radar.BillingEvaluation`
* Add support for `create` and `retrieve` methods on resource `financialconnections.Consent`
* ⚠️ Remove support for `create` method on resource `radar.BillingEvaluation`
* Add support for `create`, `link`, `remove`, `retrieve`, `rotate_credentials`, `submit_information`, `unlink`, and `update` methods on resource `v2.provisioning.Resource`
* Add support for `create`, `retrieve`, and `submit_information` methods on resource `v2.provisioning.ProviderConnectionRequest`
* Add support for `list` and `unlink` methods on resource `v2.provisioning.ProviderConnection`
* Add support for `create` method on resources `v2.provisioning.PaymentMethodRequest` and `v2.provisioning.Project`
* Add support for `retrieve` and `update_limit` methods on resource `v2.provisioning.PaymentProfile`
* Add support for `retrieve` method on resource `v2.provisioning.Eligibility`
* Add support for `export_credentials` and `retrieve` methods on resource `v2.moneymanagement.FinancialAccountWalletExport`
* Add support for `blikRecurringPayments` on `Account.capabilities`
* Add support for `capital` on `Account.settings`
* Add support for `payoutMethod` on `Balance.instant_available[].net_available[]`
* Add support for `destinationCurrency` on `BalanceSettings.payments.payouts.automatic_transfer_rules_by_currency.value[]` and `BalanceSettingsUpdateParams.payments.payouts.automatic_transfer_rules_by_currency.value[]`
* Add support for `totalDueAmount` on `capital.FinancingOffer.accepted_terms` and `capital.FinancingSummary.details`
* Add support for `incrementalIntervalTargetAmount` and `startsAt` on `capital.FinancingSummary.details.current_repayment_interval`
* Add support for `setupCredentialUsage` on `Charge.payment_method_details.card`, `PaymentIntent.payment_method_options.card`, and `SetupIntent.payment_method_options.card`
* Add support for `storedCredentialUsage` on `Charge.payment_method_details.card`, `PaymentAttemptRecord.payment_method_details.card`, `PaymentIntent.payment_method_options.card`, and `PaymentRecord.payment_method_details.card`
* Add support for `paymentMethodOptions` on `checkout.SessionApproveParams`
* Add support for `paymentReservation` on `checkout.Session`
* Add support for `custom` on `checkout.Session.current_attempt.payment_method_details`
* Add support for `paymentMethodPreselect` on `CustomerSession.components.payment_element.features` and `CustomerSessionCreateParams.components.payment_element.features`
* Add support for `bic`, `ibanLast4`, and `network` on `CustomerCashBalanceTransaction.funded.bank_transfer.gb_bank_transfer`
* Add support for `preCollectedConsent` on `financialconnections.Session`
* Add support for `financialActivity` on `financialconnections.Transaction.classifications[]`
* ⚠️ Remove support for `credit` on `financialconnections.Transaction.classifications[]`
* Add support for new value `touch_n_go` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `fuels` on `issuing.Authorization`
* ⚠️ Change type of `Mandate.payment_method_details.blik.type` from `enum('off_session'|'on_session')` to `literal('off_session')`
* Add support for new values `additive_dosage`, `additized_diesel_2`, `additized_diesel_3`, `air_filter`, `antifreeze`, `automotive_merchandise`, `batteries`, `biodiesel_b100`, `biodiesel_b10`, `biodiesel_b11`, `biodiesel_b15`, `biodiesel_b1`, `biodiesel_b20`, `biodiesel_b2`, `biodiesel_b5`, `biodiesel_b75`, `biodiesel_b99`, `blended_diesel_1_and_2`, `body_work`, `brake_fluid`, `brake_service`, `car_wash`, `def_at_pump`, `e85`, `engine_service`, `ethanol_e16_to_e84`, `exhaust_service`, `federal_tire_excise_tax`, `fuel_additive_treatment`, `fuel_system`, `heating_oil`, `hoses`, `hydrogen_h35`, `hydrogen_h70`, `inspection`, `kerosene_low_sulfur_non_taxable`, `kerosene_low_sulfur`, `kerosene_ultra_low_sulfur_non_taxable`, `kerosene_ultra_low_sulfur`, `labor`, `lamps`, `low_octane_unleaded`, `lube`, `marine_fuel_1`, `marine_fuel_2`, `marine_fuel_3`, `marine_fuel_4`, `marine_fuel_5`, `marine_other`, `mid_plus_2_10`, `mid_plus_2_e15`, `mid_plus_2_reformulated`, `mid_plus_2`, `mid_plus_e10`, `mid_plus_e15`, `mid_plus_reformulated`, `motor_oil`, `off_road_b100`, `off_road_b10`, `off_road_b11`, `off_road_b15`, `off_road_b1`, `off_road_b20`, `off_road_b2`, `off_road_b5`, `off_road_b75`, `off_road_b99`, `off_road_biodiesel`, `off_road_diesel_1`, `off_road_diesel_2`, `off_road_mid_plus_2`, `off_road_mid_plus`, `off_road_premium_diesel_1`, `off_road_premium_diesel_2`, `off_road_premium_super_2`, `off_road_premium_super`, `off_road_regular`, `off_road_renewable_diesel_b6_to_b20`, `off_road_renewable_diesel_r95`, `oil_change`, `oil_filter`, `other_lubricants`, `premium_diesel_2`, `premium_diesel_b20_plus`, `premium_diesel_under_b20`, `premium_super_2_10`, `premium_super_2_e15`, `premium_super_2_reformulated`, `premium_super_2`, `premium_super_e10`, `premium_super_e15`, `premium_super_reformulated`, `racing_fuel`, `recreational_fuel_90_octane`, `regular_diesel_2`, `regular_e10`, `regular_e15`, `regular_reformulated`, `renewable_diesel_b6_to_b20`, `renewable_diesel_r95`, `road_service`, `rv_dump_fee`, `scales`, `service_package`, `synthetic_oil`, `tire_related`, `tire_repair`, `tire_rotation`, `tires`, `toll_payments`, `towing`, `trailer_wash`, `transmission_service`, `truck_tank_cleaning`, `vehicle_glass`, `vehicle_prep`, `vehicle_rental`, `vehicle_work_order`, `washer_fluid`, `white_gas`, and `wipers` on enums `PaymentIntentCaptureParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentConfirmParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentCreateParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentDecrementAuthorizationParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, `PaymentIntentIncrementAuthorizationParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`, and `PaymentIntentUpdateParams.amount_details.line_items[].payment_method_options.card.fleet_data.productType`
* Add support for `mandateOptions` on `PaymentIntent.payment_method_options.blik`
* ⚠️ Change type of `PaymentIntent.payment_method_options.blik.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for `payoutMethodOptions` on `Payout`
* Add support for `blik` on `SetupAttempt.payment_method_details` and `SetupIntent.payment_method_options`
* Add support for `cancelAtPeriodEnd` on `Subscription.pending_update`
* Add support for `tamperState` on `terminal.ReaderListParams`
* Add support for `originPaymentMethodOptions` on `treasury.InboundTransferCreateParams`
* Add support for `ach` on `treasury.InboundTransfer.origin_payment_method_details.us_bank_account`
* Add support for new values `apps.install.created`, `apps.install.deleted`, and `apps.install.updated` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for `collectionStatusTransitions` and `collectionStatus` on `v2.billing.Contract`
* Add support for `developer` on `v2.core.Account.configuration`, `v2.core.AccountCreateParams.configuration`, and `v2.core.AccountUpdateParams.configuration`
* Add support for `skipExportableBalances` on `v2.moneymanagement.FinancialAccount.status_details.closed.forwarding_settings` and `v2.moneymanagement.FinancialAccountCloseParams.forwarding_settings`
* Add support for `crypto` on `v2.moneymanagement.FinancialAccount.storage`, `v2.moneymanagement.FinancialAccountCreateParams.storage`, and `v2.moneymanagement.FinancialAccountUpdateParams.storage`
* Add support for `addenda` on `v2.moneymanagement.OutboundPayment.to.payout_method_options.bank_account.preferred_network_options.ach`, `v2.moneymanagement.OutboundPaymentCreateParams.to.payout_method_options.bank_account.preferred_network_options.ach`, `v2.moneymanagement.OutboundPaymentQuote.to.payout_method_options.bank_account.preferred_network_options.ach`, `v2.moneymanagement.OutboundPaymentQuoteCreateParams.to.payout_method_options.bank_account.preferred_network_options.ach`, `v2.moneymanagement.PayoutIntent.to.payout_method_options.bank_account.preferred_network_options.ach`, `v2.moneymanagement.PayoutIntentCreateParams.to.payout_method_options.bank_account.preferred_network_options.ach`, and `v2.moneymanagement.PayoutIntentUpdateParams.to.payout_method_options.bank_account.preferred_network_options.ach`
* Add support for `preferredNetworkOptions` on `v2.moneymanagement.OutboundTransfer.to.payout_method_options.bank_account` and `v2.moneymanagement.OutboundTransferCreateParams.to.payout_method_options.bank_account`
* Add support for `applePay` on `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data` and `v2.moneymanagement.PayoutMethod`
* Add support for `networkDetails` on `v2.moneymanagement.ReceivedCredit.bank_transfer`
* Add support for new value `apple_pay` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* Change type of `v2.moneymanagement.FinancialAccountListParams.include` and `v2.moneymanagement.FinancialAccountRetrieveParams.include` from `literal('payments.balance_by_funds_type')` to `enum('payments.balance_by_funds_type'|'storage.crypto')`
* Add support for `forwardingSettings` on `v2.moneymanagement.FinancialAccountUpdateParams`
* Add support for new value `developer` on enums `EventsV2CoreAccountLinkReturnedEvent.configurations`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding.configurations`, and `v2.core.AccountLinkCreateParams.use_case.account_update.configurations`
* Add support for new value `developer` on enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
* Add support for new value `configuration.developer` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
* Add support for new value `never` on enums `v2.billing.ContractCreateParams.pricing_lines[].ends_at.type`, `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].ends_at.type`, `v2.billing.ContractCreateParams.pricing_overrides[].ends_at.type`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].ends_at.type`
* Change `v2.billing.ContractCreateParams.pricing_lines[].endsAt`, `v2.billing.ContractCreateParams.pricing_overrides[].endsAt`, `v2.billing.ContractUpdateParams.pricing_line_actions[].add.endsAt`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.endsAt`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.endsAt` to be optional
* Add support for new values `never` and `now` on enums `v2.billing.ContractUpdateParams.pricing_line_actions[].add.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add.ends_at.type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].update.ends_at.type`
* Add support for snapshot events `apps.install.created`, `apps.install.deleted`, and `apps.install.updated` with resource `apps.Install`
* Add support for event notifications `V2BillingContractCollectionBlockedEvent`, `V2BillingContractCollectionCurrentEvent`, `V2BillingContractCollectionPastDueEvent`, and `V2BillingContractCollectionUnpaidEvent` with related object `v2.billing.Contract`
* Add support for event notifications `V2CoreVaultNetworkTokenActivatedEvent`, `V2CoreVaultNetworkTokenAuthorizationRequirementsChangedEvent`, `V2CoreVaultNetworkTokenDeactivatedEvent`, `V2CoreVaultNetworkTokenDetailsUpdatedEvent`, and `V2CoreVaultNetworkTokenSuspendedEvent` with related object `v2.core.vault.NetworkToken`
* Add support for event notifications `V2MoneyManagementFinancialAccountWalletExportCompletedEvent`, `V2MoneyManagementFinancialAccountWalletExportPendingEvent`, and `V2MoneyManagementFinancialAccountWalletExportReadyEvent` with related object `v2.moneymanagement.FinancialAccount`
* Add support for error type `ServiceUnavailableException`

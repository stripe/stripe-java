---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2243
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.2.0-alpha.3
---

* Add support for `activate_gift_card`, `cashout_gift_card`, `check_gift_card_balance`, and `reload_gift_card` methods on resource `terminal.Reader`
* Add support for `aggregationPeriod` on `billing.AlertRecovered`
* Add support for `administrativeAddress` and `principalPlaceOfBusiness` on `Account.company`
* Add support for `addressCollectionPrecision` on `checkout.Session.automatic_tax`
* Add support for `taxId` on `checkout.Session.collected_information`
* ⚠️ Remove support for `taxIds` on `checkout.Session.collected_information`
* Add support for `setupFutureUsage` on `PaymentIntent.payment_method_options.payco`, `PaymentIntent.payment_method_options.paypay`, `PaymentIntent.payment_method_options.samsung_pay`, `PaymentIntentConfirmParams.payment_method_options.paypay`, `PaymentIntentCreateParams.payment_method_options.paypay`, `PaymentIntentUpdateParams.payment_method_options.paypay`, `checkout.Session.payment_method_options.payco`, and `checkout.Session.payment_method_options.samsung_pay`
* Add support for `network` on `Dispute.payment_method_details.card`
* Add support for `requirePaymentMethodSupport` on `financialconnections.Session.filters`
* Add support for `networkData` on `issuing.Authorization.request_history[]`
* Add support for `acquiringInstitutionCountry`, `acquiringInstitutionId`, `retrievalReferenceNumber`, `routedNetwork`, and `traceId` on `issuing.Transaction.network_data`
* Add support for new values `boku_promptpay`, `capchase_pay`, `check_scan`, `click_to_pay`, `demo_pay`, `duitnow`, `dummy_auth_push`, `dummy_passthrough_card`, `edenred`, `gcash`, `getbalance`, `knet`, `kr_market`, `kriya`, `momo`, `mondu`, `netbanking`, `ng_bank_transfer`, `ng_bank`, `ng_card`, `ng_market`, `ng_ussd`, `ng_wallet`, `octopus`, `paper_check`, `sequra`, `shop_pay`, `south_korea_market`, `test_pay`, `truemoney`, `us_cash_voucher`, `vipps`, and `wero` on enums `PaymentIntentConfirmParams.allowedPaymentMethodTypes`, `PaymentIntentCreateParams.allowedPaymentMethodTypes`, and `PaymentIntentUpdateParams.allowedPaymentMethodTypes`
* Add support for `customFields`, `description`, and `footer` on `Quote.invoice_settings`, `QuotePreviewSubscriptionSchedule.default_settings.invoice_settings`, `QuotePreviewSubscriptionSchedule.phases[].invoice_settings`, `SubscriptionSchedule.default_settings.invoice_settings`, and `SubscriptionSchedule.phases[].invoice_settings`
* Add support for `paypay` on `SetupAttempt.payment_method_details`
* Add support for new values `mass_transit_parking_tax` and `parking_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
* Add support for `massTransitParkingTax` and `parkingTax` on `tax.Registration.country_options.us`
* Add support for `giftCardBrand` on `terminal.ReaderCollectPaymentMethodParams.collect_config` and `terminal.ReaderProcessPaymentIntentParams.process_config`
* Add support for `activateGiftCard`, `cashoutGiftCard`, `checkGiftCardBalance`, `deactivateGiftCard`, and `reloadGiftCard` on `terminal.Reader.action`
* Add support for `statusTransitions` on `v2.billing.Contract`
* ⚠️ Remove support for `oneTimeFees` on `v2.billing.ContractCreateParams` and `v2.billing.Contract`
* ⚠️ Remove support for `statusDetails` on `v2.billing.Contract`
* Add support for `id` and `priority` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[]`
* ⚠️ Remove support for `pricingOverride` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[]`
* ⚠️ Remove support for `tieringMode` and `tiers` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[].overwrite_price`, `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].overwrite_price`, `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].overwrite_price`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.overwrite_price`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.overwrite_price`
* Add support for `multiplyPricing` on `v2.billing.Contract.pricing_overrides.data[]`, `v2.billing.ContractCreateParams.pricing_overrides[]`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add`
* ⚠️ Remove support for `multiplier` on `v2.billing.Contract.pricing_overrides.data[]`, `v2.billing.ContractCreateParams.pricing_overrides[]`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add`
* ⚠️ Change type of `v2.billing.Contract.pricing_overrides.data[].type`, `v2.billing.ContractCreateParams.pricing_overrides[].type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.type` from `literal('multiplier')` to `literal('multiply_pricing')`
* Add support for `relatedNetworkObject` on `v2.core.AccountListParams` and `v2.core.Account`
* Add support for `networkBusinessProfileWallet` on `v2.moneymanagement.PayoutMethod`
* Add support for `stripeNetworkTransfer` on `v2.moneymanagement.ReceivedCredit`
* Add support for new value `network_business_profile_wallet` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* ⚠️ Remove support for value `one_time_fees` from enums `v2.billing.ContractActivateParams.include`, `v2.billing.ContractCancelParams.include`, `v2.billing.ContractCreateParams.include`, `v2.billing.ContractListParams.include`, `v2.billing.ContractRetrieveParams.include`, and `v2.billing.ContractUpdateParams.include`
* ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_lines[].ends_at.type`, `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].ends_at.type`, `v2.billing.ContractCreateParams.pricing_overrides[].ends_at.type`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].ends_at.type` from `enum('contract_end'|'timestamp')` to `literal('timestamp')`
* ⚠️ Change type of `v2.billing.ContractCreateParams.pricing_lines[].pricing.price_details.pricing_overrides[].starts_at.type`, `v2.billing.ContractCreateParams.pricing_lines[].starts_at.type`, `v2.billing.ContractCreateParams.pricing_overrides[].starts_at.type`, and `v2.billing.ContractUpdateParams.pricing_line_actions[].add.pricing.price_details.pricing_overrides[].starts_at.type` from `enum('contract_start'|'timestamp')` to `literal('timestamp')`
* Change `v2.billing.ContractCreateParams.pricing_overrides[].priority` and `v2.billing.ContractUpdateParams.pricing_override_actions[].add.priority` to be optional
* ⚠️ Change type of `v2.billing.ContractUpdateParams.pricing_line_actions[].add.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.ends_at.type`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add.ends_at.type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].update.ends_at.type` from `enum('billing_period_end'|'timestamp')` to `literal('timestamp')`
* ⚠️ Change type of `v2.billing.ContractUpdateParams.pricing_line_actions[].add.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].add.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update.starts_at.type`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add.starts_at.type`, and `v2.billing.ContractUpdateParams.pricing_override_actions[].update.starts_at.type` from `enum('billing_period_start'|'timestamp')` to `literal('timestamp')`
* Add support for event notifications `V2BillingContractActivatedEvent`, `V2BillingContractCanceledEvent`, `V2BillingContractCreatedEvent`, `V2BillingContractEndedEvent`, and `V2BillingContractUpdatedEvent` with related object `v2.billing.Contract`

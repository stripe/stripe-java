---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2125
is_stripe_api_change: true
released_in_version: 31.2.0-alpha.1
---

* Add support for new resources `sharedpayment.GrantedToken`, `v2.iam.ApiKey`, `v2.payments.SettlementAllocationIntentSplit`, `v2.payments.SettlementAllocationIntent`, and `v2.tax.ManualRule`
* Add support for `retrieve` method on resource `sharedpayment.GrantedToken`
* Add support for `create` and `update` test helper methods on resource `sharedpayment.GrantedToken`
* Add support for `create`, `deactivate`, `list`, `retrieve`, and `update` methods on resource `v2.tax.ManualRule`
* Add support for `cancel`, `create`, `retrieve`, `submit`, and `update` methods on resource `v2.payments.SettlementAllocationIntent`
* Add support for `cancel`, `create`, and `retrieve` methods on resource `v2.payments.SettlementAllocationIntentSplit`
* Add support for `create`, `expire`, `list`, `retrieve`, `rotate`, and `update` methods on resource `v2.iam.ApiKey`
* Add support for `checkScanning` on `AccountSessionCreateParams.components`
* Add support for `taxDetails` on `InvoiceAddLinesParams.lines[].price_data.product_data`, `InvoiceLineItemUpdateParams.price_data.product_data`, `InvoiceUpdateLinesParams.lines[].price_data.product_data`, `PaymentLinkCreateParams.line_items[].price_data.product_data`, `ProductCreateParams`, `ProductUpdateParams`, `checkout.SessionCreateParams.line_items[].price_data.product_data`, and `checkout.SessionUpdateParams.line_items[].price_data.product_data`
* Add support for `paymentMethodData` on `delegatedcheckout.RequestedSessionConfirmParams`
* Add support for `productDetails` on `delegatedcheckout.RequestedSession.line_item_details[]`
* Add support for `wallets` on `issuing.CardListParams`
* Add support for `primaryAccountIdentifier` on `issuing.Card.wallets.apple_pay` and `issuing.Card.wallets.google_pay`
* Add support for `sharedPaymentGrantedToken` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, and `PaymentIntent`
* Add support for `instant` on `v2.Account.configuration.recipient_data.features.bank_accounts`, `v2.AccountCreateParams.configuration.recipient_data.features.bank_accounts`, `v2.AccountUpdateParams.configuration.recipient_data.features.bank_accounts`, `v2.core.Account.configuration.recipient.capabilities.bank_accounts`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.bank_accounts`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.bank_accounts`
* Add support for `collectAt` on `v2.billing.IntentAction.deactivate`, `v2.billing.IntentAction.modify`, `v2.billing.IntentAction.subscribe`, `v2.billing.IntentCreateParams.actions[].deactivate`, `v2.billing.IntentCreateParams.actions[].modify`, and `v2.billing.IntentCreateParams.actions[].subscribe`
* Remove support for `billingDetails` on `v2.billing.IntentAction.deactivate`, `v2.billing.IntentAction.modify`, `v2.billing.IntentAction.subscribe`, `v2.billing.IntentCreateParams.actions[].deactivate`, `v2.billing.IntentCreateParams.actions[].modify`, and `v2.billing.IntentCreateParams.actions[].subscribe`
* Add support for `overrides` on `v2.billing.IntentAction.deactivate.pricing_plan_subscription_details`, `v2.billing.IntentAction.modify.pricing_plan_subscription_details`, `v2.billing.IntentAction.subscribe.pricing_plan_subscription_details`, `v2.billing.IntentCreateParams.actions[].deactivate.pricing_plan_subscription_details`, `v2.billing.IntentCreateParams.actions[].modify.pricing_plan_subscription_details`, and `v2.billing.IntentCreateParams.actions[].subscribe.pricing_plan_subscription_details`
* Remove support for `requested` on `v2.core.Account.configuration.card_creator.capabilities.commercial.celtic.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.celtic.spend_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.cross_river_bank.spend_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.lead.prepaid_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe.charge_card`, `v2.core.Account.configuration.card_creator.capabilities.commercial.stripe.prepaid_card`, `v2.core.Account.configuration.recipient.capabilities.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.financial_addresses.crypto_wallets`, `v2.core.Account.configuration.storer.capabilities.holds_currencies.usdc`, `v2.core.Account.configuration.storer.capabilities.outbound_payments.crypto_wallets`, and `v2.core.Account.configuration.storer.capabilities.outbound_transfers.crypto_wallets`
* Add support for `alternativeReference` on `v2.core.vault.GbBankAccount`, `v2.core.vault.UsBankAccount`, and `v2.moneymanagement.PayoutMethod`
* Add support for `managedBy` and `payments` on `v2.moneymanagement.FinancialAccount`
* Add support for `speed` on `v2.moneymanagement.OutboundPayment.delivery_options`, `v2.moneymanagement.OutboundPaymentCreateParams.delivery_options`, `v2.moneymanagement.OutboundPaymentQuote.delivery_options`, and `v2.moneymanagement.OutboundPaymentQuoteCreateParams.delivery_options`
* Add support for `types` on `v2.moneymanagement.FinancialAccountListParams`
* Change type of `v2.core.AccountListParams.appliedConfigurations` from `string` to `enum`
* Add support for new value `bank_accounts.instant` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for `topImpactedAccounts` on `EventsV2CoreHealthApiErrorFiringEvent.impact`, `EventsV2CoreHealthApiErrorResolvedEvent.impact`, `EventsV2CoreHealthApiLatencyFiringEvent.impact`, `EventsV2CoreHealthApiLatencyResolvedEvent.impact`, `EventsV2CoreHealthPaymentMethodErrorFiringEvent.impact`, and `EventsV2CoreHealthPaymentMethodErrorResolvedEvent.impact`
* Add support for event notifications `V2CoreHealthSepaDebitDelayedFiringEvent`, `V2CoreHealthSepaDebitDelayedResolvedEvent`, and `V2PaymentsSettlementAllocationIntentNotFoundEvent`
* Add support for event notifications `V2PaymentsSettlementAllocationIntentCanceledEvent`, `V2PaymentsSettlementAllocationIntentCreatedEvent`, `V2PaymentsSettlementAllocationIntentErroredEvent`, `V2PaymentsSettlementAllocationIntentFundsNotReceivedEvent`, `V2PaymentsSettlementAllocationIntentMatchedEvent`, `V2PaymentsSettlementAllocationIntentSettledEvent`, and `V2PaymentsSettlementAllocationIntentSubmittedEvent` with related object `v2.payments.SettlementAllocationIntent`
* Add support for event notifications `V2PaymentsSettlementAllocationIntentSplitCanceledEvent`, `V2PaymentsSettlementAllocationIntentSplitCreatedEvent`, and `V2PaymentsSettlementAllocationIntentSplitSettledEvent` with related object `v2.payments.SettlementAllocationIntentSplit`

---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2167
is_breaking: true
is_stripe_api_change: true
released_in_version: 31.5.0-alpha.2
---

* Add support for new resources `Profile` and `billing.AlertRecovered`
* Add support for `reauthorize` method on resource `PaymentIntent`
* Add support for `settings` on `QuoteLine.actions[].add_discount`, `QuoteLine.actions[].add_item.discounts[]`, `QuoteLine.actions[].set_discounts[]`, `QuoteLine.actions[].set_items[].discounts[]`, `QuotePreviewSubscriptionSchedule.phases[].discounts[]`, `QuotePreviewSubscriptionSchedule.phases[].items[].discounts[]`, `SubscriptionSchedule.phases[].discounts[]`, and `SubscriptionSchedule.phases[].items[].discounts[]`
* Add support for `smartDisputes` on `Account.settings`, `AccountCreateParams.settings`, `AccountUpdateParams.settings`, `v2.core.Account.configuration.merchant`, `v2.core.AccountCreateParams.configuration.merchant`, and `v2.core.AccountUpdateParams.configuration.merchant`
* Add support for `emailCustomersOnSuccessfulPayment` on `Account.settings.payments`, `AccountCreateParams.settings.payments`, and `AccountUpdateParams.settings.payments`
* Add support for `balanceUpdateDetails` on `billing.CreditBalanceSummary.balances[]`
* Add support for `reauthorization` and `reauthorizeBefore` on `Charge.payment_method_details.card_present`, `Charge.payment_method_details.card`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.card_present`
* Add support for `location` and `reader` on `Charge.payment_method_details.card_present`, `Charge.payment_method_details.interac_present`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.card_present`, `PaymentAttemptRecord.payment_method_details.interac_present`, `PaymentMethod.card.generated_from.payment_method_details.card_present`, `PaymentRecord.payment_method_details.card_present`, and `PaymentRecord.payment_method_details.interac_present`
* Add support for `managedPayments` on `PaymentIntent`, `SetupIntent`, `Subscription`, `checkout.SessionCreateParams`, and `checkout.Session`
* Add support for new value `lk_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `digital` on `delegatedcheckout.RequestedSession.fulfillment_details.fulfillment_options[]`, `delegatedcheckout.RequestedSession.fulfillment_details.selected_fulfillment_option`, and `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.selected_fulfillment_option`
* Change `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.selected_fulfillment_option.shipping` to be optional
* Add support for `affiliateAttributions` on `delegatedcheckout.RequestedSessionConfirmParams`, `delegatedcheckout.RequestedSessionCreateParams`, and `delegatedcheckout.RequestedSession`
* Add support for `fulfillmentType` on `delegatedcheckout.RequestedSession.line_item_details[]`
* Add support for `marketplaceSellerDetails`, `networkProfile`, `privacyNoticeUrl`, `returnPolicyUrl`, `storePolicyUrl`, and `termsOfServiceUrl` on `delegatedcheckout.RequestedSession.seller_details`
* Add support for `amountToCounter` on `DisputeUpdateParams`
* Add support for new values `terminal_wifi_certificate` and `terminal_wifi_private_key` on enum `FileListParams.purpose`
* Add support for new values `terminal_wifi_certificate` and `terminal_wifi_private_key` on enum `FileCreateParams.purpose`
* Add support for new value `pay_by_bank` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `displayName` and `serviceUserNumber` on `Mandate.payment_method_details.bacs_debit`
* Add support for `requestReauthorization` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card`
* Add support for `transactionPurpose` on `PaymentIntent.payment_method_options.us_bank_account`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account`, `PaymentIntentCreateParams.payment_method_options.us_bank_account`, and `PaymentIntentUpdateParams.payment_method_options.us_bank_account`
* Add support for `optionalItems` on `PaymentLinkUpdateParams`
* ⚠️ Remove support for `cardIssuerDecline` on `radar.PaymentEvaluation.insights`
* Add support for `paymentBehavior` on `SubscriptionItemDeleteParams`
* Add support for `billingCycleAnchor` on `Subscription.trial_settings.end_behavior`
* Add support for `lk` on `tax.Registration.country_options` and `tax.RegistrationCreateParams.country_options`
* Add support for `cellular` and `stripeS710` on `terminal.ConfigurationCreateParams`, `terminal.ConfigurationUpdateParams`, and `terminal.Configuration`
* Add support for new values `simulated_stripe_s710` and `stripe_s710` on enum `terminal.ReaderListParams.deviceType`
* Add support for new values `reserve.hold.created`, `reserve.hold.updated`, `reserve.plan.created`, `reserve.plan.disabled`, `reserve.plan.expired`, `reserve.plan.updated`, and `reserve.release.created` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new value `2026-02-25.clover` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `recipientOnboarding` and `recipientUpdate` on `v2.core.AccountLink.use_case` and `v2.core.AccountLinkCreateParams.use_case`
* Add support for `consumer` on `v2.core.Account.configuration.storer.capabilities`, `v2.core.AccountCreateParams.configuration.storer.capabilities`, and `v2.core.AccountUpdateParams.configuration.storer.capabilities`
* Add support for `fundsUsageType` on `v2.moneymanagement.FinancialAccount.storage` and `v2.moneymanagement.FinancialAccountCreateParams.storage`
* Add support for `purpose` on `v2.moneymanagement.OutboundPaymentCreateParams` and `v2.moneymanagement.OutboundPayment`
* Add support for `branchNumber` and `swiftCode` on `v2.moneymanagement.PayoutMethod.bank_account`
* Add support for new values `recipient_onboarding` and `recipient_update` on enum `v2.core.AccountLinkCreateParams.use_case.type`
* Add support for new value `consumer.holds_currencies.usd` on enum `EventsV2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for snapshot event `billing.alert.recovered` with resource `billing.AlertRecovered`
* Add support for snapshot events `reserve.hold.created` and `reserve.hold.updated` with resource `reserve.Hold`
* Add support for snapshot events `reserve.plan.created`, `reserve.plan.disabled`, `reserve.plan.expired`, and `reserve.plan.updated` with resource `reserve.Plan`
* Add support for snapshot event `reserve.release.created` with resource `reserve.Release`
* Add support for event notification `V2BillingRateCardCustomPricingUnitOverageRateCreatedEvent` with related object `v2.billing.RateCardCustomPricingUnitOverageRate`
* Add support for event notifications `V2IamStripeAccessGrantApprovedEvent`, `V2IamStripeAccessGrantCanceledEvent`, `V2IamStripeAccessGrantDeniedEvent`, `V2IamStripeAccessGrantRemovedEvent`, `V2IamStripeAccessGrantRequestedEvent`, and `V2IamStripeAccessGrantUpdatedEvent`

---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2257
is_stripe_api_change: true
released_in_version: 33.2.0
---

* Add support for new resource `financialconnections.Authorization`
* Add support for `unreject` method on resource `Account`
* Add support for `list` method on resource `PaymentRecord`
* Add support for `smartDisputesManagement` on `AccountSession.components.disputes_list.features`, `AccountSession.components.payment_details.features`, `AccountSession.components.payment_disputes.features`, `AccountSession.components.payments.features`, `AccountSessionCreateParams.components.disputes_list.features`, `AccountSessionCreateParams.components.payment_details.features`, `AccountSessionCreateParams.components.payment_disputes.features`, and `AccountSessionCreateParams.components.payments.features`
* Add support for `administrativeAddress` and `principalPlaceOfBusiness` on `Account.company`, `AccountCreateParams.company`, `AccountUpdateParams.company`, and `TokenCreateParams.account.company`
* Add support for `sepaDebitPayments` on `AccountUpdateParams.settings`
* Remove support for `proofOfRegistration` on `AccountCreateParams.documents`.  This field was limited-use and is being deprecated.
* Add support for `payoutsAction` on `AccountRejectParams`
* Remove support for `dynamicTaxRates` on `checkout.SessionCreateParams.line_items[]`.  This field was limited-use and is being deprecated.
* Add support for `setupFutureUsage` on `PaymentIntent.payment_method_options.payco`, `PaymentIntent.payment_method_options.samsung_pay`, `PaymentIntentConfirmParams.payment_method_options.payco`, `PaymentIntentConfirmParams.payment_method_options.samsung_pay`, `PaymentIntentCreateParams.payment_method_options.payco`, `PaymentIntentCreateParams.payment_method_options.samsung_pay`, `PaymentIntentUpdateParams.payment_method_options.payco`, `PaymentIntentUpdateParams.payment_method_options.samsung_pay`, `PaymentLinkUpdateParams.payment_intent_data`, `checkout.Session.payment_method_options.payco`, `checkout.Session.payment_method_options.samsung_pay`, `checkout.SessionCreateParams.payment_method_options.payco`, and `checkout.SessionCreateParams.payment_method_options.samsung_pay`
* Add support for new values `bnp_paribas`, `citibank`, and `mbsb_bank` on enums `ConfirmationTokenCreateParams.payment_method_data.fpx.bank`, `PaymentIntentConfirmParams.payment_method_data.fpx.bank`, `PaymentIntentCreateParams.payment_method_data.fpx.bank`, `PaymentIntentUpdateParams.payment_method_data.fpx.bank`, `PaymentMethodCreateParams.fpx.bank`, `SetupIntentConfirmParams.payment_method_data.fpx.bank`, `SetupIntentCreateParams.payment_method_data.fpx.bank`, and `SetupIntentUpdateParams.payment_method_data.fpx.bank`
* Add support for new value `ic_nif` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `network` on `Dispute.payment_method_details.card`
* Add support for `limits` and `manualEntry` on `financialconnections.SessionCreateParams` and `financialconnections.Session`
* Add support for `requirePaymentMethodSupport` on `financialconnections.Session.filters` and `financialconnections.SessionCreateParams.filters`
* Add support for `bankAccountToken` on `financialconnections.Session`
* Add support for new values `alipay` and `mb_way` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for new values `mass_transit_parking_tax` and `parking_tax` on enums `InvoiceAddLinesParams.lines[].tax_amounts[].tax_rate_data.taxType`, `InvoiceLineItemUpdateParams.tax_amounts[].tax_rate_data.taxType`, `InvoiceUpdateLinesParams.lines[].tax_amounts[].tax_rate_data.taxType`, `TaxRateCreateParams.taxType`, and `TaxRateUpdateParams.taxType`
* Add support for `metadata` on `InvoiceCreatePreviewParams.subscription_details`
* Add support for `businessName` on `issuing.Card.shipping`, `issuing.CardCreateParams.shipping`, and `issuing.CardUpdateParams.shipping`
* Add support for `allowedPaymentMethodTypes` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `PaymentIntent`, `SetupIntentConfirmParams`, `SetupIntentCreateParams`, `SetupIntentUpdateParams`, and `SetupIntent`
* Add support for `referrer` on `PaymentIntentConfirmParams.radar_options` and `PaymentIntentCreateParams.radar_options`
* Add support for `consentCollection` and `shippingOptions` on `PaymentLinkUpdateParams`
* Add support for `customFields`, `description`, and `footer` on `Quote.invoice_settings`, `QuoteCreateParams.invoice_settings`, `QuoteUpdateParams.invoice_settings`, `SubscriptionSchedule.default_settings.invoice_settings`, `SubscriptionSchedule.phases[].invoice_settings`, `SubscriptionScheduleCreateParams.default_settings.invoice_settings`, `SubscriptionScheduleCreateParams.phases[].invoice_settings`, `SubscriptionScheduleUpdateParams.default_settings.invoice_settings`, and `SubscriptionScheduleUpdateParams.phases[].invoice_settings`
* Add support for `customerAccount` and `customer` on `Refund`
* Add support for `paymentMethod` on `Refund` and `Topup`
* Add support for `trial` on `SubscriptionSchedule.phases[]`
* Add support for `massTransitParkingTax` and `parkingTax` on `tax.Registration.country_options.us` and `tax.RegistrationCreateParams.country_options.us`
* Add support for new values `mass_transit_parking_tax` and `parking_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
* Add support for `initiatedBy` and `paymentMethodOptions` on `Topup`
* Add support for new values `financial_connections.account.expected_deactivation_date_updated`, `financial_connections.account.supported_payment_method_types_updated`, `financial_connections.account.upcoming_deactivation`, `financial_connections.authorization.expected_deactivation_date_updated`, and `financial_connections.authorization.upcoming_deactivation` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for new value `2026-07-29.dahlia` on enum `WebhookEndpointCreateParams.apiVersion`
* Add support for `additionalAddresses` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, `v2.core.AccountTokenCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
* Add support for snapshot events `financial_connections.account.expected_deactivation_date_updated`, `financial_connections.account.supported_payment_method_types_updated`, and `financial_connections.account.upcoming_deactivation` with resource `financialconnections.Account`
* Add support for snapshot events `financial_connections.authorization.expected_deactivation_date_updated` and `financial_connections.authorization.upcoming_deactivation` with resource `financialconnections.Authorization`

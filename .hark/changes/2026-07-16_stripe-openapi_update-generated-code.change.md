---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2247
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.2.0-alpha.4
---

* ⚠️ Remove support for resource `FrMealVouchersOnboarding`
* ⚠️ Remove support for `create`, `list`, `retrieve`, and `update` methods on resource `FrMealVouchersOnboarding`
* Add support for `create` method on resource `PaymentRecord`
* ⚠️ Remove support for `financialAccountsTransactions`, `financialAccounts`, and `recipientsList` on `AccountSessionCreateParams.components`
* Add support for `smartDisputesManagement` on `AccountSession.components.disputes_list.features`, `AccountSession.components.payment_details.features`, `AccountSession.components.payment_disputes.features`, and `AccountSession.components.payments.features`
* Add support for `mode` on `financialconnections.Session.manual_entry`
* Add support for new values `alipay` and `sequra` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `businessName` on `issuing.Card.shipping`
* Add support for `pauseSchedules` on `QuotePreviewSubscriptionSchedule`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams`, and `SubscriptionSchedule`
* Add support for `trial` on `QuotePreviewSubscriptionSchedule.phases[]` and `SubscriptionSchedule.phases[]`
* Add support for `paymentRecord` on `RefundCreateParams`
* Add support for `redirectToUrl` on `sharedpayment.IssuedToken.next_action`
* ⚠️ Change type of `sharedpayment.IssuedToken.next_action.type` from `literal('use_stripe_sdk')` to `enum('redirect_to_url'|'use_stripe_sdk')`
* Add support for new values `financial_connections.account.expected_deactivation_date_updated`, `financial_connections.account.supported_payment_method_types_updated`, `financial_connections.account.upcoming_deactivation`, `financial_connections.authorization.expected_deactivation_date_updated`, and `financial_connections.authorization.upcoming_deactivation` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for snapshot events `financial_connections.account.expected_deactivation_date_updated`, `financial_connections.account.supported_payment_method_types_updated`, and `financial_connections.account.upcoming_deactivation` with resource `financialconnections.Account`
* Add support for snapshot events `financial_connections.authorization.expected_deactivation_date_updated` and `financial_connections.authorization.upcoming_deactivation` with resource `financialconnections.Authorization`

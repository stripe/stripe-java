---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2266
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.4.0-alpha.2
---

* Add support for new resources `PaymentPlan` and `billing.FeedbackOption`
* ⚠️ Remove support for resource `billing.FeedbackOptions`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `PaymentPlan`
* Add support for `update` method on resource `v2.moneymanagement.Transaction`
* Add support for `wechatPayPayments` on `Account.settings`, `AccountCreateParams.settings`, and `AccountUpdateParams.settings`
* ⚠️ Change type of `billingportal.Configuration.features.subscription_cancel.cancellation_reason.feedbackOptions` from `$Billing.FeedbackOptions` to `$Billing.FeedbackOption`
* Add support for `subscriptionPause` on `billingportal.Session.flow`
* Add support for new value `usdt` on enums `crypto.OnrampSessionCreateParams.destinationCurrency` and `crypto.OnrampSessionListParams.destinationCurrency`
* Add support for new value `usdt` on enum `crypto.OnrampSessionCreateParams.destinationCurrencies`
* Add support for `activeEntitlements` on `CustomerSession.components`
* Add support for `sharedPaymentIssuedToken` on `delegatedcheckout.RequestedSessionConfirmParams`
* Add support for `managedPayments` on `InvoiceCreateParams`, `InvoiceItemCreateParams`, `InvoiceItem`, `Invoice`, and `QuotePreviewInvoice`
* Add support for `paymentPlan` on `Invoice`
* Add support for `estimatedFeeDetails` and `estimatedFee` on `issuing.Authorization.pending_request.hold_amount_details` and `issuing.Authorization.request_history[].hold_amount_details`
* ⚠️ Remove support for `cryptogram` on `PaymentAttemptRecord.payment_method_details.card.three_d_secure` and `PaymentRecord.payment_method_details.card.three_d_secure`
* ⚠️ Change type of `productcatalog.TrialOffer.end_behavior.transition.price` from `$Price` to `deletable($Price)`
* ⚠️ Change type of `Subscription.cancellation_details.feedbackOption` from `$Billing.FeedbackOptions` to `$Billing.FeedbackOption`
* Add support for `cancelAtPeriodEnd` on `Subscription.pending_update`
* Add support for `igic` on `tax.Registration.country_options.at`, `tax.Registration.country_options.be`, `tax.Registration.country_options.bg`, `tax.Registration.country_options.cy`, `tax.Registration.country_options.cz`, `tax.Registration.country_options.de`, `tax.Registration.country_options.dk`, `tax.Registration.country_options.ee`, `tax.Registration.country_options.es`, `tax.Registration.country_options.fi`, `tax.Registration.country_options.fr`, `tax.Registration.country_options.gr`, `tax.Registration.country_options.hr`, `tax.Registration.country_options.hu`, `tax.Registration.country_options.ie`, `tax.Registration.country_options.it`, `tax.Registration.country_options.lt`, `tax.Registration.country_options.lu`, `tax.Registration.country_options.lv`, `tax.Registration.country_options.mt`, `tax.Registration.country_options.nl`, `tax.Registration.country_options.pl`, `tax.Registration.country_options.pt`, `tax.Registration.country_options.ro`, `tax.Registration.country_options.se`, `tax.Registration.country_options.si`, and `tax.Registration.country_options.sk`
* Add support for `metadata` on `v2.billing.Contract.pricing_lines.data[].pricing.price_details.pricing_overrides.data[]`, `v2.billing.Contract.pricing_overrides.data[]`, `v2.billing.ContractCreateParams.pricing_overrides[]`, `v2.billing.ContractUpdateParams.pricing_line_actions[].update`, `v2.billing.ContractUpdateParams.pricing_override_actions[].add`, `v2.billing.ContractUpdateParams.pricing_override_actions[].update`, `v2.billing.ContractUpdateParams`, and `v2.moneymanagement.Transaction`
* Add support for `taxAmount` on `v2.moneymanagement.OutboundPaymentQuote.estimated_fees[]`
* Add support for `payoutMethodOptions` on `v2.moneymanagement.OutboundPaymentQuote.to` and `v2.moneymanagement.OutboundPaymentQuoteCreateParams.to`
* Change type of `v2.billing.ContractUpdateParams.pricing_line_actions[].update.pricing.price_details.pricing_override_actions[].update.metadata` from `string` to `emptyable(string)`
* Add support for snapshot events `payment_plan.created`, `payment_plan.installment_due`, `payment_plan.installment_paid`, `payment_plan.installment_will_be_due`, and `payment_plan.updated` with resource `PaymentPlan`

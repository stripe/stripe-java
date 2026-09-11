---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2202
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.1.0-alpha.4
---

* Add support for new resources `v2.core.WorkflowRun` and `v2.core.Workflow`
* Add support for `report_authorized` method on resource `PaymentAttemptRecord`
* Add support for `list` and `retrieve` methods on resource `v2.core.WorkflowRun`
* Add support for `invoke`, `list`, and `retrieve` methods on resource `v2.core.Workflow`
* Add support for `nextAction` and `status` on `sharedpayment.IssuedToken`
* ⚠️ Remove support for `networkId` on `sharedpayment.IssuedToken.seller_details`
* Add support for `bills` on `AccountSession.components`
* Add support for `settlementCurrencies` on `BalanceSettings.payments` and `BalanceSettingsUpdateParams.payments`
* Add support for `defaultSettlementCurrency` on `BalanceSettings.payments`
* Add support for `accountFunding` on `Charge.payment_method_details.card`
* Add support for `automaticSurcharge` on `PaymentLinkCreateParams`, `PaymentLink`, `checkout.SessionCreateParams`, and `checkout.Session`
* Add support for `bizum` on `checkout.Session.payment_method_options` and `checkout.SessionCreateParams.payment_method_options`
* Add support for `surchargeCost` on `checkout.Session`
* Add support for `amountSurcharge` on `checkout.Session.total_details`
* Add support for `sharedPaymentGrantedToken` on `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new value `email` on enums `identity.VerificationReportListParams.type`, `identity.VerificationSessionCreateParams.type`, and `identity.VerificationSessionUpdateParams.type`
* Add support for `details` on `identity.VerificationReport.email`
* Add support for `confirm` on `identity.VerificationSessionCreateParams` and `identity.VerificationSessionUpdateParams`
* Add support for `subscription` on `InvoiceItem.parent.schedule_details`
* ⚠️ Remove support for `sharedPaymentGrantedToken` on `PaymentIntentConfirmParams` and `PaymentIntentCreateParams`
* Add support for `moneyServices` on `PaymentIntent.payment_details`
* ⚠️ Remove support for `externalReference` on `Plan`

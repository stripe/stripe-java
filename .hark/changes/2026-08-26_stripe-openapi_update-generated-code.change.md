---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2272
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.5.0-alpha.1
---

* Add support for new resource `CustomerTaxExemption`
* Add support for `create`, `delete`, `list`, and `retrieve` methods on resource `CustomerTaxExemption`
* Add support for `details` on `Account.future_requirements.errors[]`, `Account.requirements.errors[]`, `BankAccount.future_requirements.errors[]`, `BankAccount.requirements.errors[]`, `Capability.future_requirements.errors[]`, `Capability.requirements.errors[]`, `Person.future_requirements.errors[]`, and `Person.requirements.errors[]`
* ⚠️ Remove support for `sequraPayments` on `Account.capabilities`
* Add support for `subscriptionPause` on `billingportal.SessionCreateParams.flow_data`
* ⚠️ Remove support for `sequra` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentRecord.payment_method_details`, and `checkout.Session.payment_method_options`
* Add support for `enablementDetails` on `checkout.Session.automatic_tax`
* ⚠️ Remove support for value `sequra` from enums `ConfirmationTokenCreateParams.payment_method_data.type`, `PaymentIntentConfirmParams.payment_method_data.type`, `PaymentIntentCreateParams.payment_method_data.type`, `PaymentIntentUpdateParams.payment_method_data.type`, `SetupIntentConfirmParams.payment_method_data.type`, `SetupIntentCreateParams.payment_method_data.type`, and `SetupIntentUpdateParams.payment_method_data.type`
* ⚠️ Remove support for value `sequra` from enums `CustomerListPaymentMethodsParams.type`, `PaymentMethodCreateParams.type`, and `PaymentMethodListParams.type`
* Add support for `credit` on `financialconnections.Transaction.classifications[]`
* Add support for `userConsent` on `identity.VerificationSessionCreateParams` and `identity.VerificationSessionUpdateParams`
* Add support for `companyDetails` on `Invoice.payment_settings.payment_method_options.billie`, `PaymentIntent.payment_method_options.billie`, `PaymentIntentConfirmParams.payment_method_options.billie`, `PaymentIntentCreateParams.payment_method_options.billie`, `PaymentIntentUpdateParams.payment_method_options.billie`, `QuotePreviewInvoice.payment_settings.payment_method_options.billie`, and `Subscription.payment_settings.payment_method_options.billie`
* Add support for `reference` on `Invoice.payment_settings.payment_method_options.billie`, `PaymentIntent.payment_method_options.billie`, `PaymentIntentConfirmParams.payment_method_options.billie`, `PaymentIntentCreateParams.payment_method_options.billie`, `PaymentIntentUpdateParams.payment_method_options.billie`, and `QuotePreviewInvoice.payment_settings.payment_method_options.billie`
* Add support for `posCondition` on `issuing.AuthorizationCreateParams` and `issuing.Authorization`
* Add support for `cryptoWallet` on `issuing.CardCreateParams`, `issuing.CardUpdateParams`, and `issuing.Card`
* Add support for `paymentEvaluations` and `paymentMethodDetails` on `PaymentAttemptRecordReportAuthorizedParams`
* Add support for `aadeData` on `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
* ⚠️ Remove support for `cancelAtPeriodEnd` on `Subscription.pending_update`
* Add support for `blikRecurringPayments` on `v2.core.Account.configuration.merchant.capabilities`, `v2.core.AccountCreateParams.configuration.merchant.capabilities`, and `v2.core.AccountUpdateParams.configuration.merchant.capabilities`
* Add support for `userAccess` on `v2.iam.ActivityLog.details`
* Add support for new value `user_access` on enum `v2.iam.ActivityLogListParams.actionGroups`
* Add support for new value `user_access_started` on enum `v2.iam.ActivityLogListParams.actions`
* Add support for new value `blik_recurring_payments` on enum `EventsV2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent.updatedCapability`

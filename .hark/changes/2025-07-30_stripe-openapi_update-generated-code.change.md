---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2025
is_stripe_api_change: true
released_in_version: 29.5.0-beta.1
---

* Add support for new resources `billing.MeterUsageRow`, `billing.MeterUsage`, and `terminal.OnboardingLink`
* Add support for `retrieve` method on resource `billing.MeterUsage`
* Add support for `create` method on resource `terminal.OnboardingLink`
* Add support for `monthlyPayoutDays` and `weeklyPayoutDays` on `BalanceSettings.payouts.schedule` and `BalanceSettingsUpdateParams.payouts.schedule`
* Remove support for `monthlyAnchor` and `weeklyAnchor` on `BalanceSettings.payouts.schedule` and `BalanceSettingsUpdateParams.payouts.schedule`
* Add support for `delayDaysOverride` on `BalanceSettingsUpdateParams.settlement_timing`
* Remove support for `delayDays` on `BalanceSettingsUpdateParams.settlement_timing`
* Add support for `updateDiscounts` on `checkout.SessionCreateParams.permissions`
* Add support for `discounts` and `subscriptionData` on `checkout.SessionUpdateParams`
* Add support for `smartDisputes` on `Dispute`
* Add support for `upi` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for new value `upi` on enums `InvoiceCreateParams.payment_settings.paymentMethodTypes`, `InvoiceUpdateParams.payment_settings.paymentMethodTypes`, `SubscriptionCreateParams.payment_settings.paymentMethodTypes`, and `SubscriptionUpdateParams.payment_settings.paymentMethodTypes`
* Add support for `transactionId` on `PaymentAttemptRecord.payment_method_details.cashapp` and `PaymentRecord.payment_method_details.cashapp`
* Add support for `amountDetails` on `PaymentIntentCaptureParams`, `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentIncrementAuthorizationParams`, and `PaymentIntentUpdateParams`
* Add support for `paymentDetails` on `PaymentIntentIncrementAuthorizationParams`
* Add support for `storer` on `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.identity.attestations.terms_of_service`
* Add support for `collectionOptions` on `v2.core.AccountLink.use_case.account_onboarding`, `v2.core.AccountLink.use_case.account_update`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding`, and `v2.core.AccountLinkCreateParams.use_case.account_update`
* Change type of `v2.core.AccountLink.use_case.account_onboarding.configurations`, `v2.core.AccountLink.use_case.account_update.configurations`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding.configurations`, and `v2.core.AccountLinkCreateParams.use_case.account_update.configurations` from `literal('recipient')` to `enum('customer'|'merchant'|'recipient'|'storer')`
* Add support for `bankAccountType` on `v2.moneymanagement.PayoutMethod.bank_account`
* Add support for thin event `V2CoreAccountLinkReturnedEvent`
* Add support for thin event `V2MoneyManagementPayoutMethodUpdatedEvent` with related object `v2.moneymanagement.PayoutMethod`
* Remove support for thin event `V2CoreAccountLinkCompletedEvent`
* Remove support for thin event `V2OffSessionPaymentRequiresCaptureEvent` with related object `v2.payments.OffSessionPayment`

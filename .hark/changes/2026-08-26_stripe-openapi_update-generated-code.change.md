---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2273
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.5.0-beta.1
---

* Add support for new resources `v2.core.ApprovalRequest`, `v2.signals.AccountActivity`, `v2.signals.AccountEvaluation`, and `v2.signals.AccountSignal`
* Add support for `list` and `retrieve` methods on resource `v2.signals.AccountSignal`
* Add support for `create` and `retrieve` methods on resource `v2.signals.AccountEvaluation`
* Add support for `create`, `delete`, and `retrieve` methods on resource `v2.signals.AccountActivity`
* Add support for `cancel`, `list`, `retrieve`, and `update` methods on resource `v2.core.ApprovalRequest`
* Add support for `disable` method on resource `v2.moneymanagement.PayoutMethod`
* Add support for `disableStripeUserAuthentication` on `AccountSessionCreateParams.components.payment_method_settings.features`
* ⚠️ Remove support for `paymentMethodTypes` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `PaymentIntentUpdateParams`, `SetupIntentCreateParams`, and `SetupIntentUpdateParams`
* ⚠️ Change type of `productcatalog.TrialOffer.end_behavior.transition.price` and `productcatalog.TrialOffer.price` from `$Price` to `deletable($Price)`
* Add support for `billie` on `QuotePreviewInvoice.payment_settings.payment_method_options`
* Add support for `payoutMethods` on `v2.core.Account.defaults` and `v2.core.AccountUpdateParams.defaults`
* Add support for `restricted` on `v2.core.vault.GbBankAccount` and `v2.core.vault.UsBankAccount`
* Add support for `enabledDeliverySchemes` on `v2.moneymanagement.PayoutMethod.bank_account`
* ⚠️ Remove support for `enabledDeliveryOptions` on `v2.moneymanagement.PayoutMethod.bank_account`
* Add support for new value `disabled` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.payments`
* Add support for new value `disabled` on enum `v2.moneymanagement.PayoutMethodListParams.usage_status.transfers`
* Add support for event notifications `V2CoreApprovalRequestApprovedEvent`, `V2CoreApprovalRequestCanceledEvent`, `V2CoreApprovalRequestCreatedEvent`, `V2CoreApprovalRequestExpiredEvent`, `V2CoreApprovalRequestFailedEvent`, `V2CoreApprovalRequestRejectedEvent`, and `V2CoreApprovalRequestSucceededEvent` with related object `v2.core.ApprovalRequest`
* Add support for event notification `V2SignalsAccountEvaluationCompleteEvent` with related object `v2.signals.AccountEvaluation`

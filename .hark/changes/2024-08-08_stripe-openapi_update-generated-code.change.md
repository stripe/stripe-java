---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1843
is_stripe_api_change: true
released_in_version: 26.7.0
---

* Add support for `activate`, `archive`, `create`, `deactivate`, `list`, and `retrieve` methods on resource `Billing.Alert`
* Add support for `retrieve` method on resource `Tax.Calculation`
* Add support for `type` on `Charge.payment_method_details.card_present.offline`, `ConfirmationToken.payment_method_preview.card.generated_from.payment_method_details.card_present.offline`, `PaymentMethod.card.generated_from.payment_method_details.card_present.offline`, and `SetupAttempt.payment_method_details.card_present.offline`
* Add support for `offline` on `ConfirmationToken.payment_method_preview.card_present` and `PaymentMethod.card_present`
* Add support for `related_customer` on `Identity.VerificationSession`, `identity.VerificationSessionCreateParams`, and `identity.VerificationSessionListParams`
* Change `InvoiceCreateParams.payment_settings.payment_method_options.card.installments.plan.count`, `InvoiceCreateParams.payment_settings.payment_method_options.card.installments.plan.interval`, `InvoiceUpdateParams.payment_settings.payment_method_options.card.installments.plan.count`, `InvoiceUpdateParams.payment_settings.payment_method_options.card.installments.plan.interval`, `PaymentIntentConfirmParams.payment_method_options.card.installments.plan.count`, `PaymentIntentConfirmParams.payment_method_options.card.installments.plan.interval`, `PaymentIntentCreateParams.payment_method_options.card.installments.plan.count`, `PaymentIntentCreateParams.payment_method_options.card.installments.plan.interval`, `PaymentIntentUpdateParams.payment_method_options.card.installments.plan.count`, and `PaymentIntentUpdateParams.payment_method_options.card.installments.plan.interval` to be optional
* Add support for new value `girocard` on enums `PaymentIntentConfirmParams.payment_method_options.card.network`, `PaymentIntentCreateParams.payment_method_options.card.network`, `PaymentIntentUpdateParams.payment_method_options.card.network`, `SetupIntentConfirmParams.payment_method_options.card.network`, `SetupIntentCreateParams.payment_method_options.card.network`, `SetupIntentUpdateParams.payment_method_options.card.network`, `SubscriptionCreateParams.payment_settings.payment_method_options.card.network`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.card.network`

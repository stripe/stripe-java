---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1723
is_stripe_api_change: true
released_in_version: 24.12.0
---

* Add support for `issuer` on `InvoiceCreateParams`, `InvoiceUpcomingLinesParams`, `InvoiceUpcomingParams`, `InvoiceUpdateParams`, and `Invoice`
* Add support for `liability` on `Invoice.automatic_tax`, `InvoiceCreateParams.automatic_tax`, `InvoiceUpcomingLinesParams.automatic_tax`, `InvoiceUpcomingParams.automatic_tax`, `InvoiceUpdateParams.automatic_tax`, `Subscription.automatic_tax`, `SubscriptionCreateParams.automatic_tax`, and `SubscriptionUpdateParams.automatic_tax`
* Add support for `on_behalf_of` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
* Add support for `pin` on `issuing.CardCreateParams`
* Add support for `revocation_reason` on `Mandate.payment_method_details.bacs_debit`
* Add support for new value `nn` on enums `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for `customer_balance` on `PaymentMethodConfigurationCreateParams`, `PaymentMethodConfigurationUpdateParams`, and `PaymentMethodConfiguration`
* Add support for `invoice_settings` on `SubscriptionCreateParams` and `SubscriptionUpdateParams`

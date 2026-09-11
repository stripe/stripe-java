---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/2147
is_stripe_api_change: true
released_in_version: 31.3.0
---

* Add support for new resource `radar.PaymentEvaluation`
* Add support for `create` method on resource `radar.PaymentEvaluation`
* Add support for `adjustableQuantity` on `LineItem`
* Add support for new value `adyen` on enums `ConfirmationTokenCreateParams.payment_method_data.ideal.bank`, `PaymentIntentConfirmParams.payment_method_data.ideal.bank`, `PaymentIntentCreateParams.payment_method_data.ideal.bank`, `PaymentIntentUpdateParams.payment_method_data.ideal.bank`, `PaymentMethodCreateParams.ideal.bank`, `SetupIntentConfirmParams.payment_method_data.ideal.bank`, `SetupIntentCreateParams.payment_method_data.ideal.bank`, and `SetupIntentUpdateParams.payment_method_data.ideal.bank`
* Add support for new value `pl_nip` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `enforceArithmeticValidation` on `PaymentIntentCaptureParams.amount_details`, `PaymentIntentConfirmParams.amount_details`, `PaymentIntentCreateParams.amount_details`, `PaymentIntentIncrementAuthorizationParams.amount_details`, and `PaymentIntentUpdateParams.amount_details`
* Add support for new values `2.3.0` and `2.3.1` on enums `PaymentIntentConfirmParams.payment_method_options.card.three_d_secure.version`, `PaymentIntentCreateParams.payment_method_options.card.three_d_secure.version`, `PaymentIntentUpdateParams.payment_method_options.card.three_d_secure.version`, `SetupIntentConfirmParams.payment_method_options.card.three_d_secure.version`, `SetupIntentCreateParams.payment_method_options.card.three_d_secure.version`, and `SetupIntentUpdateParams.payment_method_options.card.three_d_secure.version`
* Add support for `error` on `PaymentIntent.amount_details`
* Remove support for `bgn` on `terminal.Configuration.tipping`, `terminal.ConfigurationCreateParams.tipping`, and `terminal.ConfigurationUpdateParams.tipping`
* Add support for `topup` on `treasury.ReceivedDebit.linked_flows`
* Add support for `contactPhone` on `v2.core.AccountCreateParams`, `v2.core.AccountTokenCreateParams`, `v2.core.AccountUpdateParams`, and `v2.core.Account`
* Add support for `registrationDate` on `v2.core.Account.identity.business_details`, `v2.core.AccountCreateParams.identity.business_details`, `v2.core.AccountTokenCreateParams.identity.business_details`, and `v2.core.AccountUpdateParams.identity.business_details`
* Add support for new value `gb_vat` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type`, `v2.core.AccountTokenCreateParams.identity.business_details.id_numbers[].type`, and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`

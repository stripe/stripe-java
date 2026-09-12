---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2198
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.2.0-beta.1
---

* Add support for new resources `sharedpayment.GrantedToken` and `sharedpayment.IssuedToken`
* Add support for `retrieve` method on resource `sharedpayment.GrantedToken`
* Add support for `create` and `revoke` test helper methods on resource `sharedpayment.GrantedToken`
* Add support for `create`, `retrieve`, and `revoke` methods on resource `sharedpayment.IssuedToken`
* Add support for `blik` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options`, and `checkout.SessionCreateParams.payment_method_options`
* Add support for `sharedPaymentGrantedToken` on `ConfirmationTokenCreateParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentMethod`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
* Add support for new values `fo_vat`, `gi_tin`, `it_cf`, and `py_ruc` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for `validationErrors` on `privacy.RedactionJob`
* Add support for `taxDetails` on `Product`
* ⚠️ Change type of `QuotePreviewInvoice.total_taxes[].tax_rate_details.taxRate` from `string` to `expandable($TaxRate)`
* Add support for `admissionsTax`, `attendanceTax`, `entertainmentTax`, `grossReceiptsTax`, `hospitalityTax`, `luxuryTax`, `resortTax`, and `tourismTax` on `tax.RegistrationCreateParams.country_options.us`
* Add support for `purpose` on `treasury.OutboundPaymentCreateParams` and `treasury.OutboundPayment`

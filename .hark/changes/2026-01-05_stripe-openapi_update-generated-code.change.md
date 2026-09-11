---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2127
is_stripe_api_change: true
released_in_version: 31.2.0-alpha.2
---

* Add support for new resource `tax.Location`
* Add support for `create`, `list`, and `retrieve` methods on resource `tax.Location`
* Add support for `pause` method on resource `Subscription`
* Add support for `performanceLocation` on `InvoiceAddLinesParams.lines[].price_data.product_data.tax_details`, `InvoiceLineItemUpdateParams.price_data.product_data.tax_details`, `InvoiceUpdateLinesParams.lines[].price_data.product_data.tax_details`, `PaymentLinkCreateParams.line_items[].price_data.product_data.tax_details`, `ProductCreateParams.tax_details`, `ProductUpdateParams.tax_details`, `checkout.SessionCreateParams.line_items[].price_data.product_data.tax_details`, `checkout.SessionUpdateParams.line_items[].price_data.product_data.tax_details`, `tax.CalculationCreateParams.line_items[]`, and `tax.CalculationLineItem`
* Change type of `delegatedcheckout.RequestedSessionUpdateParams.metadata` from `map(string: string)` to `emptyable(map(string: string))`
* Change type of `delegatedcheckout.RequestedSessionUpdateParams.paymentMethodData` from `payment_method_data` to `emptyable(payment_method_data)`
* Change type of `delegatedcheckout.RequestedSessionUpdateParams.sharedMetadata` from `map(string: string)` to `emptyable(map(string: string))`
* Add support for `subscription` on `Invoice.parent.schedule_details` and `QuotePreviewInvoice.parent.schedule_details`
* Change type of `PaymentIntentConfirmParams.payment_details.benefit.frMealVoucher`, `PaymentIntentCreateParams.payment_details.benefit.frMealVoucher`, `PaymentIntentUpdateParams.payment_details.benefit.frMealVoucher`, `SetupIntentConfirmParams.setup_details.benefit.frMealVoucher`, `SetupIntentCreateParams.setup_details.benefit.frMealVoucher`, and `SetupIntentUpdateParams.setup_details.benefit.frMealVoucher` from `payment_details_benefit_fr_meal_voucher` to `emptyable(payment_details_benefit_fr_meal_voucher)`
* Add support for `taxDetails` on `PlanCreateParams.product[0]` and `PriceCreateParams.product_data`
* Add support for `externalReference` on `Plan` and `Price`
* Add support for new value `phase_start` on enums `QuoteCreateParams.subscription_data.phaseEffectiveAt`, `QuoteCreateParams.subscription_data_overrides[].phaseEffectiveAt`, `QuoteUpdateParams.subscription_data.phaseEffectiveAt`, and `QuoteUpdateParams.subscription_data_overrides[].phaseEffectiveAt`
* Remove support for value `line_start` from enums `QuoteCreateParams.subscription_data.phaseEffectiveAt`, `QuoteCreateParams.subscription_data_overrides[].phaseEffectiveAt`, `QuoteUpdateParams.subscription_data.phaseEffectiveAt`, and `QuoteUpdateParams.subscription_data_overrides[].phaseEffectiveAt`
* Add support for new values `admissions_tax`, `attendance_tax`, `entertainment_tax`, `gross_receipts_tax`, `hospitality_tax`, `luxury_tax`, `resort_tax`, and `tourism_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
* Add support for `admissionsTax`, `attendanceTax`, `entertainmentTax`, `grossReceiptsTax`, `hospitalityTax`, `luxuryTax`, `resortTax`, and `tourismTax` on `tax.Registration.country_options.us`
* Add support for `requirements` on `TaxCode`

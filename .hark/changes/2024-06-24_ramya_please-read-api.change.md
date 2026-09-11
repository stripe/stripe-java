---
title: Please read the [API Changelog](https://docs.stripe.com/changelog/2024-06-20) and carefully review the API changes before upgrading.
pr_link: https://github.com/stripe/stripe-java/pull/1825
released_in_version: 26.0.0
---

### ⚠️ Breaking changes

  * Remove the unused resource `PlatformTaxFee`
  * Rename `volume_decimal` to `quantity_decimal` on
     * `Issuing.Transaction.purchase_details.fuel`,
     * `issuing.AuthorizationCaptureParams.purchase_details.fuel`,
     *  `issuing.TransactionCreateForceCaptureParams.purchase_details.fuel`, and
     *  `issuing.TransactionCreateUnlinkedRefundParams.purchase_details.fuel`

### Additions

* Add support for `finalize_amount` test helper method on resource `Issuing.Authorization`
* Add support for new values `platform_disabled`, `paused.inactivity` and `other` on enums `Capability.Requirements.disabledReason` and `Capability.FutureRequirements.disabledReason`
* Add support for new value `ch_uid` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `fleet` on `Issuing.Authorization`, `Issuing.Transaction.purchase_details`, `issuing.AuthorizationCaptureParams.purchase_details`, `issuing.AuthorizationCreateParams`, `issuing.TransactionCreateForceCaptureParams.purchase_details`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details`
* Add support for `fuel` on `Issuing.Authorization` and `issuing.AuthorizationCreateParams`
* Add support for `industry_product_code` and `quantity_decimal` on `Issuing.Transaction.purchase_details.fuel`, `issuing.AuthorizationCaptureParams.purchase_details.fuel`, `issuing.TransactionCreateForceCaptureParams.purchase_details.fuel`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details.fuel`
* Add support for new values `charging_minute`, `imperial_gallon`, `kilogram`, `kilowatt_hour`, and `pound` on enums `issuing.AuthorizationCaptureParams.purchase_details.fuel.unit`, `issuing.TransactionCreateForceCaptureParams.purchase_details.fuel.unit`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details.fuel.unit`
* Add support for new value `2024-06-20` on enum `WebhookEndpointCreateParams.api_version`

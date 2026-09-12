---
title: Generate SDK for OpenAPI spec version 1230
pr_url: https://github.com/stripe/stripe-java/pull/1856
is_stripe_api_change: true
released_in_version: 26.9.0
---

* Change `AccountLinkCreateParams.collection_options.fields` to be optional
* Add support for new value `hr_oib` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceCreatePreviewParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for new value `issuing_regulatory_reporting` on enum `FileListParams.purpose`
* Add support for new value `issuing_regulatory_reporting` on enum `FileCreateParams.purpose`
* Add support for `status_details` on `TestHelpers.TestClock`

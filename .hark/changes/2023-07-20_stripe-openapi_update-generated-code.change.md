---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1611
is_stripe_api_change: true
released_in_version: 22.28.0
---

* Add support for new value `ro_tin` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `use_stripe_sdk` on `SetupIntentConfirmParams` and `SetupIntentCreateParams`
* Add support for new value `service_tax` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

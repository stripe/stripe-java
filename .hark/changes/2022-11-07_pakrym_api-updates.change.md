---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1472
is_stripe_api_change: true
released_in_version: 21.15.0
---

* Add support for new values `eg_tin`, `ph_tin`, and `tr_tin` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, and `TaxIdCreateParams.type`
* Add support for `reason_message` on `Issuing.Authorization.request_history[]`

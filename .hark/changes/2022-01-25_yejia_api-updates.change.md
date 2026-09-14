---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1306
is_stripe_api_change: true
released_in_version: 20.98.0
---

* Add support for `phone_number_collection` on `PaymentLinkCreateParams` and `PaymentLink`
* Add support for new values `payment_link.created` and `payment_link.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`
* Add support for new value `is_vat` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, and `TaxIdCreateParams.type`

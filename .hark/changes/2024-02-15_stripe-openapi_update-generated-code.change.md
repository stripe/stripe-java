---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1745
is_stripe_api_change: true
released_in_version: 24.16.0
---

* Add support for `networks` on `Card`, `PaymentMethodCreateParams.CardDetails`, `PaymentMethodUpdateParams.Card`, and `TokenCreateParams.Card`
* Add support for new value `no_voec` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `TaxIdCreateParams.type`, and `tax.CalculationCreateParams.customer_details.tax_ids[].type`
* Add support for `display_brand` on `PaymentMethod.card`
* Add support for new value `financial_connections.account.refreshed_ownership` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

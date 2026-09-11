---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1694
is_stripe_api_change: true
released_in_version: 24.6.0
---

* Add support for new resources `Climate.Order`, `Climate.Product`, and `Climate.Supplier`
* Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `Order`
* Add support for `list` and `retrieve` methods on resources `Product` and `Supplier`
* Add support for `created` on `checkout.SessionListParams`
* Add support for `validate_location` on `CustomerCreateParams.tax` and `CustomerUpdateParams.tax`
* Add support for new values `climate_order_purchase` and `climate_order_refund` on enum `reporting.ReportRunCreateParams.parameters.reporting_category`
* Add support for new values `climate.order.canceled`, `climate.order.created`, `climate.order.delayed`, `climate.order.delivered`, `climate.order.product_substituted`, `climate.product.created`, and `climate.product.pricing_updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

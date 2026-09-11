---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1512
is_stripe_api_change: true
released_in_version: 22.8.0
---

* Add support for `resume` method on resource `Subscription`
* Add support for `payment_link` on `checkout.SessionListParams`
* Add support for `trial_settings` on `checkout.SessionCreateParams.subscription_data`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
* Add support for `shipping_cost` on `CreditNoteCreateParams`, `CreditNotePreviewLinesParams`, `CreditNotePreviewParams`, `CreditNote`, `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
* Add support for `amount_shipping` on `CreditNote` and `Invoice`
* Add support for `shipping_details` on `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
* Add support for `subscription_resume_at` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
* Change `issuing.CardholderCreateParams.individual.first_name`, `issuing.CardholderCreateParams.individual.last_name`, `issuing.CardholderUpdateParams.individual.first_name`, and `issuing.CardholderUpdateParams.individual.last_name` to be optional
* Add support for `invoice_creation` on `PaymentLinkCreateParams`, `PaymentLinkUpdateParams`, and `PaymentLink`
* Add support for new value `America/Ciudad_Juarez` on enum `reporting.ReportRunCreateParams.parameters.timezone`
* Add support for new value `paused` on enum `SubscriptionListParams.status`
* Add support for new values `customer.subscription.paused` and `customer.subscription.resumed` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

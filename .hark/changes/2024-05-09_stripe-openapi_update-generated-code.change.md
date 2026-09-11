---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1797
is_stripe_api_change: true
released_in_version: 25.6.0
---

* Add support for `update` test helper method on resources `Treasury.OutboundPayment` and `Treasury.OutboundTransfer`
* Add support for `allow_redisplay` on `ConfirmationToken.payment_method_preview` and `PaymentMethod`
* Add support for `preview_mode` on `InvoiceCreatePreviewParams`, `InvoiceUpcomingLinesParams`, and `InvoiceUpcomingParams`
* Add support for `tracking_details` on `Treasury.OutboundPayment` and `Treasury.OutboundTransfer`
* Add support for new values `treasury.outbound_payment.tracking_details_updated` and `treasury.outbound_transfer.tracking_details_updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1988
is_stripe_api_change: true
released_in_version: 29.2.0-beta.1
---

This release changes the pinned API version to `2025-04-30.preview`.

* Add support for `billingMode` on `InvoiceCreatePreviewParams.schedule_details`, `InvoiceCreatePreviewParams.subscription_details`, `Quote.subscription_data`, `QuoteCreateParams.subscription_data`, `QuotePreviewSubscriptionSchedule`, `SubscriptionCreateParams`, `SubscriptionScheduleCreateParams`, `SubscriptionSchedule`, `Subscription`, and `checkout.SessionCreateParams.subscription_data`
* Add support for `accountNumber` on `ConfirmationToken.payment_method_preview.acss_debit` and `PaymentMethod.acss_debit`
* Add support for new values `aw_tin`, `az_tin`, `bd_bin`, `bf_ifu`, `bj_ifu`, `cm_niu`, `cv_nif`, `et_tin`, `kg_tin`, and `la_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for new value `balance_settings.updated` on enums `WebhookEndpointUpdateParams.enabledEvents`

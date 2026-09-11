---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2156
is_breaking: true
is_stripe_api_change: true
released_in_version: 31.4.0-alpha.4
---

* Add support for new value `spend_threshold` on enums `billing.AlertCreateParams.alertType` and `billing.AlertListParams.alertType`
* Add support for `spendThreshold` on `billing.AlertCreateParams` and `billing.Alert`
* Add support for `invoiceItem`, `prorationDetails`, `proration`, and `subscription` on `InvoiceLineItem.parent.schedule_details`
* Add support for `custom` on `PaymentMethodUpdateParams`
* Add support for `paymentMethodReference` and `usage` on `PaymentMethod.custom`
* Add support for `outstandingUsageThrough` and `unusedTimeFrom` on `SubscriptionPauseParams.bill_for`
* ⚠️ Remove support for `outstandingUsage` and `unusedTime` on `SubscriptionPauseParams.bill_for`
* ⚠️ Remove support for `paymentBehavior` on `SubscriptionResumeParams`

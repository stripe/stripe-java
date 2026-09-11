---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2111
is_stripe_api_change: true
released_in_version: 30.3.0-alpha.2
---

* Add support for new resource `issuing.Program`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `issuing.Program`
* Add support for `schedule` on `Discount`
* Add support for `applicableFees` on `delegatedcheckout.RequestedSession.total_details`
* Add support for `scheduleDetails` on `Invoice.parent`, `InvoiceItem.parent`, `InvoiceLineItem.parent`, and `QuotePreviewInvoice.parent`
* Add support for `billingSchedules` on `InvoiceCreatePreviewParams.schedule_details`, `QuotePreviewSubscriptionSchedule`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleUpdateParams`, and `SubscriptionSchedule`
* Add support for `latestInvoice` on `QuotePreviewSubscriptionSchedule` and `SubscriptionSchedule`
* Add support for `phaseEffectiveAt` on `QuotePreviewSubscriptionSchedule.default_settings`, `SubscriptionSchedule.default_settings`, `SubscriptionScheduleCreateParams.default_settings`, and `SubscriptionScheduleUpdateParams.default_settings`

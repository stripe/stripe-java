---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2148
is_stripe_api_change: true
released_in_version: 31.4.0-alpha.1
---

* Add support for new resources `FrMealVouchersOnboarding`, `reserve.Hold`, `reserve.Plan`, and `reserve.Release`
* Add support for `create`, `list`, `retrieve`, and `update` methods on resource `FrMealVouchersOnboarding`
* Add support for `list` and `retrieve` methods on resources `reserve.Hold` and `reserve.Release`
* Add support for `retrieve` method on resource `reserve.Plan`
* Add support for `pause` method on resource `Subscription`
* Add support for `servicePeriodDetails` on `Discount`
* Add support for `agenticCommerceSettings` on `AccountSession.components`
* Add support for new value `service_period` on enums `CouponCreateParams.duration`, `checkout.SessionCreateParams.discounts[].coupon_data.duration`, and `checkout.SessionUpdateParams.discounts[].coupon_data.duration`
* Add support for `servicePeriod` on `CouponCreateParams` and `Coupon`
* Change type of `InvoiceItem.pricing.price_details.price` and `InvoiceLineItem.pricing.price_details.price` from `string` to `expandable($Price)`
* Add support for `settings` on `InvoiceCreatePreviewParams.discounts[]`, `InvoiceCreatePreviewParams.schedule_details.amendments[].discount_actions[].add`, `InvoiceCreatePreviewParams.schedule_details.amendments[].discount_actions[].set`, `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].add.discounts[]`, `InvoiceCreatePreviewParams.schedule_details.amendments[].item_actions[].set.discounts[]`, `InvoiceCreatePreviewParams.schedule_details.phases[].discounts[]`, `InvoiceCreatePreviewParams.schedule_details.phases[].items[].discounts[]`, `InvoiceCreatePreviewParams.subscription_details.items[].discounts[]`, `QuoteCreateParams.lines[].actions[].add_discount`, `QuoteCreateParams.lines[].actions[].add_item.discounts[]`, `QuoteCreateParams.lines[].actions[].set_discounts[]`, `QuoteCreateParams.lines[].actions[].set_items[].discounts[]`, `QuoteUpdateParams.lines[].actions[].add_discount`, `QuoteUpdateParams.lines[].actions[].add_item.discounts[]`, `QuoteUpdateParams.lines[].actions[].set_discounts[]`, `QuoteUpdateParams.lines[].actions[].set_items[].discounts[]`, `SubscriptionCreateParams.discounts[]`, `SubscriptionCreateParams.items[].discounts[]`, `SubscriptionItemCreateParams.discounts[]`, `SubscriptionItemUpdateParams.discounts[]`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].add`, `SubscriptionScheduleAmendParams.amendments[].discount_actions[].set`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].add.discounts[]`, `SubscriptionScheduleAmendParams.amendments[].item_actions[].set.discounts[]`, `SubscriptionScheduleCreateParams.phases[].discounts[]`, `SubscriptionScheduleCreateParams.phases[].items[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].discounts[]`, `SubscriptionScheduleUpdateParams.phases[].items[].discounts[]`, `SubscriptionUpdateParams.discounts[]`, and `SubscriptionUpdateParams.items[].discounts[]`
* Add support for `subtotal` on `InvoiceLineItem`
* Add support for `billingCadence` on `SubscriptionListParams`

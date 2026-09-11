---
title: API Updates
pr_link: https://github.com/stripe/stripe-java/pull/1388
is_stripe_api_change: true
released_in_version: 20.132.0
---

* Add support for `currency` on `checkout.SessionCreateParams`, `InvoiceUpcomingLinesParams`, `InvoiceUpcomingParams`, `PaymentLinkCreateParams`, `SubscriptionCreateParams`, `SubscriptionSchedule.phases[]`, `SubscriptionScheduleCreateParams.phases[]`, `SubscriptionScheduleUpdateParams.phases[]`, and `Subscription`
* Add support for `currency_options` on `checkout.SessionCreateParams.shipping_options[].shipping_rate_data.fixed_amount`, `CouponCreateParams`, `CouponUpdateParams`, `Coupon`, `OrderCreateParams.shipping_cost.shipping_rate_data.fixed_amount`, `OrderUpdateParams.shipping_cost.shipping_rate_data.fixed_amount`, `PriceCreateParams`, `PriceUpdateParams`, `Price`, `ProductCreateParams.default_price_data`, `PromotionCode.restrictions`, `PromotionCodeCreateParams.restrictions`, `ShippingRate.fixed_amount`, and `ShippingRateCreateParams.fixed_amount`
* Add support for `restrictions` on `PromotionCodeUpdateParams`
* Add support for `fixed_amount` and `tax_behavior` on `ShippingRateUpdateParams`

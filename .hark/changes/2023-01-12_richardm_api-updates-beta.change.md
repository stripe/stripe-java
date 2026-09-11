---
title: API Updates for beta branch
pr_link: https://github.com/stripe/stripe-java/pull/1506
is_stripe_api_change: true
released_in_version: 22.6.0-beta.2
---

* Add support for new resource `Tax.Registration`
* Add support for `create`, `list`, and `update` methods on resource `Registration`
* Add support for `controller` on `AccountCreateParams` and `AccountUpdateParams`
* Add support for `application` and `dashboard` on `Account.controller`
* Remove support for `timestamp` on `QuoteLine.actions[].add_discount.discount_end`
* Remove support for `index` on `QuoteLine.actions[].add_item.discounts[]`, `QuoteLine.actions[].remove_discount`, `QuoteLine.actions[].set_discounts[]`, `QuoteLine.actions[].set_items[].discounts[]`, `SubscriptionSchedule.phases[].add_invoice_items[].discounts[]`, `SubscriptionSchedule.phases[].discounts[]`, and `SubscriptionSchedule.phases[].items[].discounts[]`
* Add support for new values `quote.accepting`, `quote.reestimated`, and `quote.stale` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

* Updated stable APIs to the latest version

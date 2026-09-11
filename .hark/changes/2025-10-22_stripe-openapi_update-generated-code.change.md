---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2088
is_stripe_api_change: true
released_in_version: 30.1.0-alpha.4
---

* Add support for new resource `v2.billing.PricingPlanSubscriptionComponents`
* Add support for `retrieve` method on resource `v2.billing.PricingPlanSubscriptionComponents`
* Add support for `dimensionPayloadKeys` on `billing.MeterCreateParams` and `billing.Meter`
* Add support for `dimensionFilters` and `dimensionGroupByKeys` on `billing.MeterEventSummaryListParams`
* Add support for `dimensions` on `billing.MeterEventSummary`
* Add support for `fulfillmentDetails` and `paymentMethodData` on `delegatedcheckout.RequestedSessionCreateParams` and `delegatedcheckout.RequestedSessionUpdateParams`
* Add support for `lineItemDetails`, `metadata`, `paymentMethod`, and `sharedMetadata` on `delegatedcheckout.RequestedSessionCreateParams`, `delegatedcheckout.RequestedSessionUpdateParams`, and `delegatedcheckout.RequestedSession`
* Add support for `currency`, `customer`, and `riskDetails` on `delegatedcheckout.RequestedSessionCreateParams`
* Add support for `sellerDetails` and `setupFutureUsage` on `delegatedcheckout.RequestedSessionCreateParams` and `delegatedcheckout.RequestedSession`
* Add support for `amountSubtotal`, `amountTotal`, `createdAt`, `expiresAt`, `orderDetails`, `sharedPaymentIssuedToken`, `status`, `totalDetails`, and `updatedAt` on `delegatedcheckout.RequestedSession`
* Add support for `address`, `email`, `fulfillmentOptions`, `name`, `phone`, and `selectedFulfillmentOption` on `delegatedcheckout.RequestedSession.fulfillment_details`
* Add support for new values `billie`, `crypto`, `kr_card`, `kriya`, `mb_way`, `mondu`, `ng_bank_transfer`, `ng_bank`, `ng_card`, `ng_market`, `ng_ussd`, `ng_wallet`, `payco`, `paypay`, `rechnung`, `samsung_pay`, `satispay`, `scalapay`, `sequra`, `sunbit`, `us_bank_account`, and `vipps` on enums `EventsV2CoreHealthAuthorizationRateDropFiringEvent.impact.paymentMethodType`, `EventsV2CoreHealthAuthorizationRateDropResolvedEvent.impact.paymentMethodType`, `EventsV2CoreHealthPaymentMethodErrorFiringEvent.impact.paymentMethodType`, and `EventsV2CoreHealthPaymentMethodErrorResolvedEvent.impact.paymentMethodType`

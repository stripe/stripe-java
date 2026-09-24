---
title: Support for APIs in the new API version 2024-09-30.acacia
pr_url: https://github.com/stripe/stripe-java/pull/1880
is_stripe_api_change: true
released_in_version: 27.0.0
---

This release changes the pinned API version to `2024-09-30.acacia`. Please read the [API Changelog](https://docs.stripe.com/changelog/acacia#2024-09-30.acacia) and carefully review the API changes before upgrading.

### ⚠️ Breaking changes due to changes in the API

* Rename `usage_threshold_config` to `usage_threshold` on `Billing.Alert` and `billing.AlertCreateParams`
* Remove support for `filter` on `Billing.Alert` and `billing.AlertCreateParams`. Use the filters on the `usage_threshold` instead
* Remove support for `customer_consent_collected` on `terminal.ReaderProcessSetupIntentParams`

### ⚠️ Other Breaking changes in the SDK

* Adjusted default values for HTTP requests. You can use the old defaults by setting them explicitly. New values are:
  - max retries: `0` -> `2`
* Add method `parseThinEvent()` on the `StripeClient` class to parse [thin events](https://docs.corp.stripe.com/event-destinations#events-overview).  Rename `constructEvent()` method on the same class to `parseSnapshotEvent()` to clearly distinguish between the two kinds of events.
* Breaking changes to public classes that are meant for internal use only and should not affect you
    * Renamed `setStripeResponseGetter` on `ApiResource` to `setGlobalResponseGetter
    * Added another parameter to FormEncoder.flattenParams()
    * Removed the deprecated constructor overload on `APIRequest`
    * Removed `GlobalStripeResponseGetterOptions.getAPiKey`  & `StripeResponseGetterOptions.getApiKey`. We now use a higher abstraction called `Authenticator` instead of passing around api keys
    * Changed return type of `RequestOptions.RequestOptionsBuilder.getConnectTimeout` from int to java.lang.Integer.
    * Removed the public constructor on `StripeRequest` in favor of a static `StripeRequest.create()`
    * The unused field `partnerId` on class `Stripe` is removed

### Additions

* Add support for `usage_threshold` on `Billing.Alert` and `billing.AlertCreateParams`
* Add support for `custom_unit_amount` on `ProductCreateParams.default_price_data`
* Add support for `allow_redisplay` on `terminal.ReaderProcessPaymentIntentParams.process_config` and `terminal.ReaderProcessSetupIntentParams`
* Add support for new value `2024-09-30.acacia` on enum `WebhookEndpointCreateParams.api_version`
* Add support for new Usage Billing APIs `Billing.MeterEvent`, `Billing.MeterEventAdjustments`, `Billing.MeterEventSession`, `Billing.MeterEventStream` and the new Events API `Core.Events` under the [v2 namespace ](https://docs.corp.stripe.com/api-v2-overview)
* Add methods [rawRequest()](https://github.com/stripe/stripe-java/tree/master?tab=readme-ov-file#custom-requests) on the `StripeClient` class that takes a HTTP method type, url and relevant parameters to make requests to the Stripe API that are not yet supported in the SDK.

### Changes
* Change `billingportal.ConfigurationCreateParams.features.subscription_update.default_allowed_updates` and `billingportal.ConfigurationCreateParams.features.subscription_update.products` to be optional

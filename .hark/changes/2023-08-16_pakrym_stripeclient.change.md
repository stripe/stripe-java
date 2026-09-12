---
title: StripeClient
pr_url: https://github.com/stripe/stripe-java/pull/1622
is_breaking: true
released_in_version: 23.0.0
---

* Introduces `StripeClient` and the service-based pattern, a new interface for calling the Stripe API with many benefits over the existing resource-based paradigm.
  * No global config: you can simultaneously use multiple clients with different configuration options (such as API keys)
  * No extra API calls. All API endpoints can be accessed with a single method call. You don't have to call `retrieve` before doing an `update`.
  * No static methods. Much easier mocking.
  * Visit the [migration guide](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v23) to learn more.
* **Removals**
  * ⚠️ `ApiResource.request()`, `requestStream()`, `requestCollection()`, `requestSearchResult()` methods removed.
  * ⚠️ `StripeResponseGetter.oauthRequest(...)` was removed. OAuth requests are now performed via `StripeResponseGetter.request` with `ApiMode.OAuth`.
  * ⚠️ Deprecated `ApiResource.className()`  `singleClassUrl()`, `classUrl()`, `instanceUrl()`, `subresourceUrl()` methods removed.
* **Type changes**
  * ⚠️ `StripeResponseGetter.request(...)`, `streamRequest(...)` signatures changed.
    * `BaseAddress` parameter added.
    * `url` renamed to `path` and is a relative to the base address
    * `apiMode` parameter added to control how request is sent and response is handled, `V1` and `OAuth` are supported values.
    * ⚠️ `RequestOptions.getReadTimeout()`, `getConnectTimeout()`, `getMaxNetworkRetries()` now return `Integer` instead of `int`.
* **Renames**
  * ⚠️ `addFullNameAliase` renamed to `addFullNameAlias` in `AccountCreateParams`, `AccountUpdateParams`, `PersonCollectionCreateParams`, `TokenCreateParams`, `PersonCollectionCreateParams`, `PersonUpdateParams`.
  * ⚠️ `addLookupKeys` renamed to `addLookupKey` in `PriceListParams`
* **Behavior Changes**
  * ⚠️ `RequestOptions.getDefault()` does not apply global configuration options from `Stripe` class, all fields are initialized to `null`.
  * ⚠️ `RequestOptionsBuilder` does not apply global configuration options from `Stripe` class, all fields are initialized to `null`.

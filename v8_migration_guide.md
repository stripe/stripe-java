# Migration guide for version 8

`stripe-java` version 8 brings some major changes compared to version 7. Many classes, methods,
and fields have been renamed for consistency. Additionally, `stripe-java` version 8 is now
"pinned" to the latest version of the Stripe API.

## Classes, methods, and fields renamed and removed

We enumerate backward-breaking changes, that are not previously marked with `@Deprecated` with 
their motivations and resolutions.
* [Breaking changes](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v8----breaking-changes)

## API version pinning

As Stripe's API changes, Stripe continues to support existing integrations using Stripe's 
[API versioning system](https://stripe.com/docs/upgrades). By default, your Stripe account will
be tied to the API version that was most recent at the time when you first signed up. However,
it's also possible to override the API version on a per-request basis by passing a `Stripe-Version`
HTTP header. Webhook events' data is normally formatted in the API version tied to your Stripe
account, but it's also possible to configure a webhook endpoint to receive a specific API version.

In `stripe-java` version 7 and earlier, the Java classes were mostly backwards-compatible with
older versions of the Stripe API. For example, if a field was called `amount` in an old API version
but renamed to `unitAmount` in newer API versions, the Java class would have both fields, but the
`amount` field would be declared as `@Deprecated`. This meant that `stripe-java` version 7 could be
used with either the old or new Stripe API version, depending on the Stripe API version tied to your
account.

However, as the Stripe API continues to evolve, this approach has led to a lot of deprecated fields
and classes accumulating in `stripe-java`. So `stripe-java` version 8 and onward will be "pinned"
to the latest version of the Stripe API. The only fields present in the Java classes will be the
fields for the latest Stripe API version; for example, the deprecated `amount` field has been removed.
The `stripe-java` version 8 client will automatically send a `Stripe-Version` HTTP header to ensure
that the server responds with the format that the client expects. `stripe-java` version 8.0.0 is
pinned to Stripe API version [2019-03-14](https://stripe.com/docs/upgrades#2019-03-14).

Because `stripe-java` version 8 overrides the `Stripe-Version` HTTP header, your request will be
processed using the 2019-03-14 API version, and so you must update your API parameters to use the
2019-03-14 version format. For example, prior to version 2019-03-14, invoice API methods accepted
a parameter `application_fee`; in version 2019-03-14, this parameter has been renamed to
`application_fee_amount`. If your code continues to pass `application_fee`, the server will return
a 400 error code.

In addition to parameters and fields being renamed, there are a number of more substantial changes
to the behavior of the Stripe API as you upgrade your API version. Please consult the
[API change log](https://stripe.com/docs/upgrades#api-changelog) for an exhaustive list of API
changes between your current version and 2019-03-14.

If you are using `stripe-java` to receive events, be aware that webhook event data is by 
default formatted using the Stripe API version tied to your Stripe account. However, `stripe-java`
version 8 can only deserialize events formatted using version 2019-03-14. To avoid problems, use
the [webhooks API](https://stripe.com/docs/api/webhook_endpoints/create) to create a webhook that
is tied to API version 2019-03-14.

For more detailed discussion of the upgrade process for `stripe-java` in particular, see
[pinned version upgrade guide](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v8----version-upgrade)
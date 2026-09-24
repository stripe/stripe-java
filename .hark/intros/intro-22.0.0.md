Breaking changes that arose during code generation of the library that we postponed for the next major version. For changes to the Stripe products, read more at https://docs.stripe.com/changelog/2022-11-15.

"⚠️" symbol highlights breaking changes.

Use of `setStripeVersionOverride` is discouraged and can lead to unexpected errors during service calls because Java SDK class shapes are not guaranteed to match API responses on arbitrary versions.

If you were using these methods in conjunction with `EphemeralKey` resource prefer the `EphemeralKeyCreateParamsBuilder.setStripeVersion`.
```java
EphemeralKeyCreateParams params = EphemeralKeyCreateParams.builder()
  .setStripeVersion("XXXX-YY-ZZ")
  .build();
```

If you have a use case that requires per-request version overrides, please file an issue on [stripe-java](https://github.com/stripe/stripe-java/issues) repository to ensure we are aware and can add first-class support for it. In the meantime you can use `unsafeSetStripeVersionOverride` method as a workaround.
```java
RequestOptions.RequestOptionsBuilder builder = RequestOptions.builder();
builder.setApiKey(...)
            .setClientId(...);

RequestOptionsBuilder.unsafeSetStripeVersionOverride(builder, "2022-11-15");
```

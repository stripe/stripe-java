# Stripe Java client library

[![Maven Central](https://img.shields.io/badge/maven--central-v30.1.0-alpha.1-blue)](https://mvnrepository.com/artifact/com.stripe/stripe-java)
[![JavaDoc](http://img.shields.io/badge/javadoc-reference-blue.svg)](https://stripe.dev/stripe-java)
[![Build Status](https://github.com/stripe/stripe-java/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/stripe/stripe-java/actions?query=branch%3Amaster)

The official [Stripe][stripe] Java client library.

## Installation

### Requirements

We support LTS versions of the JDK. Currently, that's Java versions:

- 8 (1.8)
- 11
- 17
- 21
- 25

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.stripe:stripe-java:30.1.0-alpha.1"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.stripe</groupId>
  <artifactId>stripe-java</artifactId>
  <version>30.1.0-alpha.1</version>
</dependency>
```

### Others

If you are not using Gradle or Maven, you will need to manually install the following JARs:

- [The Stripe JAR](https://search.maven.org/remotecontent?filepath=com/stripe/stripe-java/29.6.0-alpha.2/stripe-java-29.6.0-alpha.2.jar)
- [Google Gson][gson] from <https://repo1.maven.org/maven2/com/google/code/gson/gson/2.9.0/gson-2.9.0.jar>.

### [ProGuard][proguard]

If you're planning on using ProGuard, make sure that you exclude the Stripe
client library. You can do this by adding the following to your `proguard.cfg`
file:

```
-keep class com.stripe.** { *; }
```

## Documentation

Please see the [Java API docs][api-docs] for the most
up-to-date documentation.

You can also refer to the [online Javadoc][javadoc].

## Usage

StripeExample.java

```java
import java.util.HashMap;
import java.util.Map;

import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCreateParams;

public class StripeExample {

    public static void main(String[] args) {
        StripeClient client = new StripeClient("sk_test_...");
        CustomerCreateParams params =
            CustomerCreateParams
                .builder()
                .setDescription("Example description")
                .setEmail("test@example.com")
                .setPaymentMethod("pm_card_visa")  // obtained via Stripe.js
                .build();

        try {
            Customer customer = client.v1().customers().create(params);
            System.out.println(customer);
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }
}
```

See the project's [functional tests][functional-tests] for more examples.

### StripeClient vs legacy pattern

We introduced the `StripeClient` class in v23 of the Java SDK. The legacy pattern used prior to that version is still available to use but will be marked as deprecated soon. Review the [migration guide to use StripeClient](https://github.com/stripe/stripe-java/wiki/Migration-guide-for-v23#stripeclient) to move from the legacy pattern.

Once the legacy pattern is deprecated, new API endpoints will only be accessible in the StripeClient. While there are no current plans to remove the legacy pattern for existing API endpoints, this may change in the future.

### Per-request Configuration

All the request methods accept an optional `RequestOptions` object. This is
used if you want to set an [idempotency key][idempotency-keys], if you are
using [Stripe Connect][connect-auth], or if you want to pass the secret API
key on each method.

```java
RequestOptions requestOptions = RequestOptions.builder()
    .setApiKey("sk_test_...")
    .setIdempotencyKey("a1b2c3...")
    .setStripeAccount("acct_...")
    .build();

client.v1().customers().list(requestOptions);

client.v1().customers().retrieve("cus_123456789", requestOptions);
```

### Configuring automatic retries

The library can be configured to automatically retry requests that fail due to
an intermittent network problem or other knowingly non-deterministic errors.
This can be enabled globally:

```java
StripeClient client = StripeClient.builder()
        .setMaxNetworkRetries(2)
        .build();
```

Or on a finer grain level using `RequestOptions`:

```java
RequestOptions options = RequestOptions.builder()
    .setMaxNetworkRetries(2)
    .build();
client.v1().customers().create(params, options);
```

[Idempotency keys][idempotency-keys] are added to requests to guarantee that
retries are safe.

### Configuring Timeouts

Connect and read timeouts can be configured globally:

```java
StripeClient client = StripeClient.builder()
        .setConnectTimeout(30 * 1000); // in milliseconds
        .setReadTimeout(80 * 1000);
        .build();
```

Or on a finer grain level using `RequestOptions`:

```java
RequestOptions options = RequestOptions.builder()
    .setConnectTimeout(30 * 1000) // in milliseconds
    .setReadTimeout(80 * 1000)
    .build();
client.v1().customers().create(params, options);
```

Please take care to set conservative read timeouts. Some API requests can take
some time, and a short timeout increases the likelihood of a problem within our
servers.

### Configuring DNS Cache TTL

We cannot guarantee that the IP address of the Stripe API will be static.
Commonly, default JVM configurations can have their DNS cache TTL set to
forever. If Stripe's IP address changes, your application's requests to
Stripe will all fail until the JVM restarts. Therefore we recommend that
you modify the JVM's [networkaddress.cache.ttl
property](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/doc-files/net-properties.html)
to `60` seconds.

### How to use undocumented parameters and properties

stripe-java is a typed library and it supports all public properties or parameters.

Stripe sometimes has beta which introduces new properties or parameters that are not immediately public. The library does not support these properties or parameters until they are public but there is still an approach that allows you to use them.

#### Parameters

To pass undocumented parameters to Stripe using stripe-java you need to use the `putExtraParam()` method, as shown below:

```java
CustomerCreateParams params =
  CustomerCreateParams.builder()
    .setEmail("jenny.rosen@example.com")
    .putExtraParam("secret_feature_enabled", "true")
    .putExtraParam("secret_parameter[primary]", "primary value")
    .putExtraParam("secret_parameter[secondary]", "secondary value")
    .build();

client.v1().customers().create(params);
```

#### Properties

To retrieve undocumented properties from Stripe using Java you can use an option in the library to return the raw JSON object and return the property as a native type. An example of this is shown below:

```java
final Customer customer = client.v1().customers().retrieve("cus_1234");
Boolean featureEnabled =
  customer.getRawJsonObject()
    .getAsJsonPrimitive("secret_feature_enabled")
    .getAsBoolean();
String primaryValue =
  customer.getRawJsonObject()
    .getAsJsonObject("secret_parameter")
    .getAsJsonPrimitive("primary")
    .getAsString();
String secondaryValue =
  customer.getRawJsonObject()
    .getAsJsonObject("secret_parameter")
    .getAsJsonPrimitive("secondary")
    .getAsString();
```

### Writing a plugin

If you're writing a plugin that uses the library, we'd appreciate it if you
identified using `Stripe.setAppInfo()`:

```java
Stripe.setAppInfo("MyAwesomePlugin", "1.2.34", "https://myawesomeplugin.info");
```

This information is passed along when the library makes calls to the Stripe
API.

### Request latency telemetry

By default, the library sends request latency telemetry to Stripe. These
numbers help Stripe improve the overall latency of its API for all users.

You can disable this behavior if you prefer:

```java
Stripe.enableTelemetry = false;
```

### Public Preview SDKs

Stripe has features in the [public preview phase](https://docs.stripe.com/release-phases) that can be accessed via versions of this package that have the `-beta.X` suffix like `25.2.0-beta.2`.
We would love for you to try these as we incrementally release new features and improve them based on your feedback.

 To install, pick the latest version with the `beta` suffix by reviewing the [releases page](https://github.com/stripe/stripe-java/releases/) and then use it [installation steps above](#installation).

> **Note**
> There can be breaking changes between two versions of the public preview SDKs without a bump in the major version. Therefore we recommend pinning the package version to a specific version. This way you can install the same version each time without breaking changes unless you are intentionally looking for the latest public preview SDK.

Some preview features require a name and version to be set in the `Stripe-Version` header like `feature_beta=v3`. If your preview feature has this requirement, use the `Stripe.addBetaVersion` function (available only in the public preview SDKs):

```java
Stripe.addBetaVersion("feature_beta", "v3");
```
### Private Preview SDKs

Stripe has features in the [private preview phase](https://docs.stripe.com/release-phases) that can be accessed via versions of this package that have the `-alpha.X` suffix like `25.2.0-alpha.2`. These are invite-only features. Once invited, you can install the private preview SDKs by following the same instructions as for the [public preview SDKs](https://github.com/stripe/stripe-java?tab=readme-ov-file#public-preview-sdks) above and replacing the term `beta` with `alpha`.

### Custom requests

If you would like to send a request to an undocumented API (for example you are in a private beta), or if you prefer to bypass the method definitions in the library and specify your request details directly, you can use the `rawRequest` method on `StripeClient`.

```java
// (Optional) Create a RawRequestOptions object, allowing you to set per-request
// configuration options like additional headers.
Map<String, String> stripeVersionHeader = new HashMap<>();
stripeVersionHeader.put("Stripe-Version", "2024-09-30.acacia");
RawRequestOptions options = RawRequestOptions.builder()
        .setAdditionalHeaders(stripeVersionHeader)
        .build();

// Make the request using the StripeClient.rawRequest() method.
StripeClient client = new StripeClient("sk_test_...");
final StripeResponse response =
        client.rawRequest(
                ApiResource.RequestMethod.POST, "/v1/customers", "name=johndoe&email=johndoe@example.com", options);

// (Optional) response.body() is a string. You can call
// StripeClient.deserialize() to get a StripeObject
// Pass ApiMode.V2 if the endpoint you are targeting starts with "/v2", else pass ApiMode.V1
StripeObject object = client.deserialize(response.body(), ApiMode.V1);
// or cast it if a corresponding response class exists in the SDK
Customer customer = (Customer) client.deserialize(response.body(), ApiMode.V1);
```

## Support

New features and bug fixes are released on the latest major version of the Stripe Java client library. If you are on an older major version, we recommend that you upgrade to the latest in order to use the new features and bug fixes including those for security vulnerabilities. Older major versions of the package will continue to be available for use, but will not be receiving any updates.

## Development

[Contribution guidelines for this project](CONTRIBUTING.md)

JDK 17 is required to build the Stripe Java library. By default, tests use the same Java runtime as the build.
To use a custom version of Java runtime for tests set the `JAVA_TEST_HOME` environment variable to runtime's
home directory.

The test suite depends on [stripe-mock], so make sure to fetch and run it from a
background terminal ([stripe-mock's README][stripe-mock] also contains
instructions for installing via Homebrew and other methods):

```sh
go get -u github.com/stripe/stripe-mock
stripe-mock
```

We use [just](https://github.com/casey/just) for conveniently running development tasks. You can use them directly, or copy the commands out of the `justfile`. To our help docs, run `just`.

To run all checks (tests and code formatting):

```sh
./gradlew check
```

To run the tests:

```sh
just test
# or: ./gradlew test
```

You can run particular tests by passing `--tests Class#method`. Make sure you
use the fully qualified class name. For example:

```sh
just test-one com.stripe.model.AccountTest
just test-one com.stripe.functional.CustomerTest
just test-one com.stripe.functional.CustomerTest.testCustomerCreate
# or: ./gradlew test --tests com.stripe.model.AccountTest
# or: ./gradlew test --tests com.stripe.functional.CustomerTest
# or: ./gradlew test --tests com.stripe.functional.CustomerTest.testCustomerCreate
```

The library uses [Spotless][spotless] along with
[google-java-format][google-java-format] for code formatting. Code must be
formatted before PRs are submitted, otherwise CI will fail. Run the formatter
with:

```sh
just format
# or: ./gradlew spotlessApply
```

The library uses [Project Lombok][lombok]. While it is not a requirement, you
might want to install a [plugin][lombok-plugins] for your favorite IDE to
facilitate development.

[api-docs]: https://stripe.com/docs/api?lang=java
[connect-auth]: https://stripe.com/docs/connect/authentication#stripe-account-header
[functional-tests]: https://github.com/stripe/stripe-java/blob/master/src/test/java/com/stripe/functional/
[google-java-format]: https://github.com/google/google-java-format
[gson]: https://github.com/google/gson
[idempotency-keys]: https://stripe.com/docs/api/idempotent_requests?lang=java
[javadoc]: https://stripe.dev/stripe-java
[lombok]: https://projectlombok.org
[lombok-plugins]: https://projectlombok.org/setup/overview
[proguard]: https://www.guardsquare.com/en/products/proguard
[spotless]: https://github.com/diffplug/spotless
[stripe]: https://stripe.com
[stripe-mock]: https://github.com/stripe/stripe-mock

<!--
# vim: set tw=79:
-->

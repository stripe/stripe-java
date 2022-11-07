# Stripe Java client library

[![Maven Central](https://img.shields.io/badge/maven--central-v21.14.0-blue)](https://mvnrepository.com/artifact/com.stripe/stripe-java)
[![JavaDoc](http://img.shields.io/badge/javadoc-reference-blue.svg)](https://stripe.dev/stripe-java)
[![Build Status](https://github.com/stripe/stripe-java/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/stripe/stripe-java/actions?query=branch%3Amaster)
[![Coverage Status](https://coveralls.io/repos/github/stripe/stripe-java/badge.svg?branch=master)](https://coveralls.io/github/stripe/stripe-java?branch=master)

The official [Stripe][stripe] Java client library.

## Installation

### Requirements

- Java 1.8 or later

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.stripe:stripe-java:21.14.0"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.stripe</groupId>
  <artifactId>stripe-java</artifactId>
  <version>21.14.0</version>
</dependency>
```

### Others

You'll need to manually install the following JARs:

- [The Stripe JAR](https://search.maven.org/remotecontent?filepath=com/stripe/stripe-java/21.14.0/stripe-java-21.14.0.jar)
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

See [video demonstrations][youtube-playlist] covering how to use the library.

You can also refer to the [online Javadoc][javadoc].

## Usage

StripeExample.java

```java
import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCreateParams;

public class StripeExample {

    public static void main(String[] args) {
        Stripe.apiKey = "sk_test_...";

        CustomerCreateParams params =
            CustomerCreateParams
                .builder()
                .setDescription("Example description")
                .setEmail("test@example.com")
                .setPaymentMethod("pm_card_visa")  // obtained via Stripe.js
                .build();

        try {
            Customer customer = Customer.create(params);
            System.out.println(customer);
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }
}
```

See the project's [functional tests][functional-tests] for more examples.

### Per-request Configuration

All of the request methods accept an optional `RequestOptions` object. This is
used if you want to set an [idempotency key][idempotency-keys], if you are
using [Stripe Connect][connect-auth], or if you want to pass the secret API
key on each method.

```java
RequestOptions requestOptions = RequestOptions.builder()
    .setApiKey("sk_test_...")
    .setIdempotencyKey("a1b2c3...")
    .setStripeAccount("acct_...")
    .build();

Customer.list(null, requestOptions);

Customer.retrieve("cus_123456789", requestOptions);
```

### Configuring automatic retries

The library can be configured to automatically retry requests that fail due to
an intermittent network problem or other knowingly non-deterministic errors.
This can be enabled globally:

```java
Stripe.setMaxNetworkRetries(2);
```

Or on a finer grain level using `RequestOptions`:

```java
RequestOptions options = RequestOptions.builder()
    .setMaxNetworkRetries(2)
    .build();
Customer.create(params, options);
```

[Idempotency keys][idempotency-keys] are added to requests to guarantee that
retries are safe.

### Configuring Timeouts

Connect and read timeouts can be configured globally:

```java
Stripe.setConnectTimeout(30 * 1000); // in milliseconds
Stripe.setReadTimeout(80 * 1000);
```

Or on a finer grain level using `RequestOptions`:

```java
RequestOptions options = RequestOptions.builder()
    .setConnectTimeout(30 * 1000) // in milliseconds
    .setReadTimeout(80 * 1000)
    .build();
Customer.create(params, options);
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

Customer customer = customer.Create(params);
```

#### Properties

To retrieve undocumented properties from Stripe using Java you can use an option in the library to return the raw JSON object and return the property as a native type. An example of this is shown below:

```java
final Customer customer = Customer.retrieve("cus_1234");
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

### Beta SDKs

Stripe has features in the beta phase that can be accessed via the beta version of this package.
We would love for you to try these and share feedback with us before these features reach the stable phase.
To install a beta version of stripe-java follow steps [installation steps above](#installation) using the beta library version.

> **Note**
> There can be breaking changes between beta versions. Therefore we recommend pinning the package version to a specific version. This way you can install the same version each time without breaking changes unless you are intentionally looking for the latest beta version.

We highly recommend keeping an eye on when the beta feature you are interested in goes from beta to stable so that you can move from using a beta version of the SDK to the stable version.

If your beta feature requires a `Stripe-Version` header to be sent, use the `Stripe.stripeVersion` field to set it:

> **Note**
> The `stripeVersion` can only be set in beta versions of the library.

```java
Stripe.stripeVersion += "; feature_beta=v3";
```

## Support

New features and bug fixes are released on the latest major version of the Stripe Java client library. If you are on an older major version, we recommend that you upgrade to the latest in order to use the new features and bug fixes including those for security vulnerabilities. Older major versions of the package will continue to be available for use, but will not be receiving any updates.

## Development

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

To run all checks (tests and code formatting):

```sh
./gradlew check
```

To run the tests:

```sh
./gradlew test
```

You can run particular tests by passing `--tests Class#method`. Make sure you
use the fully qualified class name. For example:

```sh
./gradlew test --tests com.stripe.model.AccountTest
./gradlew test --tests com.stripe.functional.CustomerTest
./gradlew test --tests com.stripe.functional.CustomerTest.testCustomerCreate
```

The library uses [Spotless][spotless] along with
[google-java-format][google-java-format] for code formatting. Code must be
formatted before PRs are submitted, otherwise CI will fail. Run the formatter
with:

```sh
./gradlew spotlessApply
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
[youtube-playlist]: https://www.youtube.com/playlist?list=PLy1nL-pvL2M5TnSGVjEHTTMgdnnHi-KPg

<!--
# vim: set tw=79:
-->

# Stripe Java client library

[![Maven Central](https://img.shields.io/maven-central/v/com.stripe/stripe-java)](https://mvnrepository.com/artifact/com.stripe/stripe-java)
[![JavaDoc](http://img.shields.io/badge/javadoc-reference-blue.svg)](https://stripe.dev/stripe-java)
[![Build Status](https://github.com/stripe/stripe-java/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/stripe/stripe-java/actions?query=branch%3Amaster)

The official [Stripe][stripe] Java client library.

## Installation

### Requirements

- Java 1.8 or later

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.stripe:stripe-java:20.98.0"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.stripe</groupId>
  <artifactId>stripe-java</artifactId>
  <version>20.98.0</version>
</dependency>
```

### Others

You'll need to manually install the following JARs:

- The Stripe JAR from <https://github.com/stripe/stripe-java/releases/latest>
- [Google Gson][gson] from <https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.9/gson-2.8.9.jar>.

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

public class StripeExample {

    public static void main(String[] args) {
        Stripe.apiKey = "sk_test_...";

        Map<String, Object> customerMap = new HashMap<String, Object>();
        customerMap.put("description", "Example description");
        customerMap.put("email", "test@example.com");
        customerMap.put("payment_method", "pm_card_visa"); // obtained via Stripe.js

        try {
            Customer customer = Customer.create(customerMap);
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

## Development

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

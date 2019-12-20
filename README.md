# Stripe Java Bindings [![Build Status](https://travis-ci.org/stripe/stripe-java.svg?branch=master)](https://travis-ci.org/stripe/stripe-java)

You can sign up for a Stripe account at https://stripe.com.

## Requirements

Java 1.8 or later.

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.stripe</groupId>
  <artifactId>stripe-java</artifactId>
  <version>16.4.0</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "com.stripe:stripe-java:16.4.0"
```

### Others

You'll need to manually install the following JARs:

* The Stripe JAR from https://github.com/stripe/stripe-java/releases/latest
* [Google Gson](https://github.com/google/gson) from <https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar>.

### [ProGuard](https://www.guardsquare.com/en/products/proguard)

If you're planning on using ProGuard, make sure that you exclude the Stripe bindings. You can do this by adding the following to your `proguard.cfg` file:

```
-keep class com.stripe.** { *; }
```

## Documentation

Please see the [Java API docs](https://stripe.com/docs/api/java) for the most up-to-date documentation.

## Usage

StripeExample.java

```java
import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.net.RequestOptions;

public class StripeExample {

    public static void main(String[] args) {
        Stripe.apiKey = "sk_test_...";

        Map<String, Object> chargeMap = new HashMap<String, Object>();
        chargeMap.put("amount", 100);
        chargeMap.put("currency", "usd");
        chargeMap.put("source", "tok_1234"); // obtained via Stripe.js

        try {
            Charge charge = Charge.create(chargeMap);
            System.out.println(charge);
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }
}
```

See the project's [functional tests](https://github.com/stripe/stripe-java/blob/master/src/test/java/com/stripe/functional/) for more examples.

### Per-request Configuration

For apps that need to use multiple keys during the lifetime of a process, like
one that uses [Stripe Connect][connect], it's also possible to set a
per-request key and/or account:

```java
RequestOptions requestOptions = new RequestOptionsBuilder()
    .setApiKey("sk_test_...")
    .setStripeAccount("acct_...")
    .build();

Charge.list(null, requestOptions);

Charge.retrieve("ch_18atAXCdGbJFKhCuBAa4532Z", requestOptions);
```

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
Charge.create(params, options);
```

Please take care to set conservative read timeouts. Some API requests can take
some time, and a short timeout increases the likelihood of a problem within our
servers.

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

You must have Gradle installed. To run the tests:

```sh
./gradlew test
```

You can run particular tests by passing `--tests Class#method`. Make sure you use the fully qualified class name. For example:

```sh
./gradlew test --tests com.stripe.model.AccountTest
./gradlew test --tests com.stripe.functional.ChargeTest
./gradlew test --tests com.stripe.functional.ChargeTest.testChargeCreate
```

The library uses [Spotless][spotless] along with
[google-java-format][google-java-format] for code formatting. Code must be
formatted before PRs are submitted, otherwise CI will fail. Run the formatter
with:

```sh
./gradlew spotlessApply
```

The library uses [Project Lombok][lombok]. While it is not a requirement, you might want to install a [plugin][lombok-plugins] for your favorite IDE to facilitate development.

[connect]: https://stripe.com/connect
[google-java-format]: https://github.com/google/google-java-format
[lombok]: https://projectlombok.org
[lombok-plugins]: https://projectlombok.org/setup/overview
[spotless]: https://github.com/diffplug/spotless
[stripe-mock]: https://github.com/stripe/stripe-mock

<!--
# vim: set tw=79:
-->

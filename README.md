# Stripe Java Bindings [![Build Status](https://travis-ci.org/stripe/stripe-java.svg?branch=master)](https://travis-ci.org/stripe/stripe-java)

You can sign up for a Stripe account at https://stripe.com.

## Requirements

Java 1.7 or later.

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.stripe</groupId>
  <artifactId>stripe-java</artifactId>
  <version>5.21.1-beta-3</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.stripe:stripe-java:5.21.1-beta-3"
```

### Others

You'll need to manually install the following JARs:

* The Stripe JAR from https://github.com/stripe/stripe-java/releases/latest
* [Google Gson](https://github.com/google/gson) from <https://repo1.maven.org/maven2/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar>.

### [ProGuard](http://proguard.sourceforge.net/)

If you're planning on using ProGuard, make sure that you exclude the Stripe bindings. You can do this by adding the following to your `proguard.cfg` file:

    -keep class com.stripe.** { *; }

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
        RequestOptions requestOptions = (new RequestOptionsBuilder()).setApiKey("YOUR-SECRET-KEY").build();
        Map<String, Object> chargeMap = new HashMap<String, Object>();
        chargeMap.put("amount", 100);
        chargeMap.put("currency", "usd");
        chargeMap.put("source", "tok_1234"); // obtained via Stripe.js
        try {
            Charge charge = Charge.create(chargeMap, requestOptions);
            System.out.println(charge);
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }
}
```

See the project's [functional tests](https://github.com/stripe/stripe-java/blob/master/src/test/java/com/stripe/functional/) for more examples.

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

## Testing

You must have Gradle installed. To run the tests:

    ./gradlew test

You can run particular tests by passing `--tests Class#method`. Make sure you use the fully qualified class name. For example:

    ./gradlew test --tests com.stripe.model.AccountTest
    ./gradlew test --tests com.stripe.functional.ChargeTest
    ./gradlew test --tests com.stripe.functional.ChargeTest#testChargeCreate

<!--
# vim: set tw=79:
-->

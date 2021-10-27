# Stripe Java client library

This is a branch of [stripe-java](https://github.com/stripe/stripe-java) specialized for the use of the [Search API beta](https://stripe.com/docs/search-api).

It is experimental, and support for this package will end on 2022-03-31.

It is branched off of the 20.75.0 release of `stripe-java`, and acts as a complete replacement for the library.

We publish a separate [package](https://www.npmjs.com/package/stripe-search-beta) `stripe-search-java` to [![Maven Central](https://img.shields.io/maven-central/v/com.stripe/stripe-java)](https://mvnrepository.com/artifact/com.stripe/stripe-java-search-beta)

## Contents

This package adds support for the `search` method on the `Charge`, `Customer`,
`Invoice`, `PaymentIntent`, and `Subscription` resources.

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.stripe</groupId>
  <artifactId>stripe-java-search-beta</artifactId>
  <version>20.75.0</version>
</dependency>
```

### Others

You'll need to manually install the following JARs:

- The Stripe JAR from <https://repo1.maven.org/maven2/com/stripe/stripe-java-search-beta/20.75.0/stripe-java-search-beta-20.75.0.jar>
- [Google Gson][gson] from <https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.8/gson-2.8.8.jar>.

## Docs

For more information about the search api, see the [docs
page](https://stripe.com/docs/search-api). 

For information about how to use stripe-java, see the [README.md](https://github.com/stripe/stripe-java/blob/master/README.md) from the [master branch](https://github.com/stripe/stripe-java).

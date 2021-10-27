# Stripe Java client library

This is a branch of [stripe-java](https://github.com/stripe/stripe-java) specialized for the use of the [Search API beta](https://stripe.com/docs/search-api).

It is experimental, and support for this package will end on 2022-03-31.

It is branched off of the 20.75.0 release of `stripe-java`, and acts as a complete replacement for the library.

We publish a separate [package](https://www.npmjs.com/package/stripe-search-beta) `stripe-search-java` to [![Maven Central](https://img.shields.io/maven-central/v/com.stripe/stripe-java)](https://mvnrepository.com/artifact/com.stripe/stripe-java-search-beta)

## Contents

This package adds support for the `search` method on the `Charge`, `Customer`,
`Invoice`, `PaymentIntent`, and `Subscription` resources.

## Docs

For more information about the search api, see the [docs
page](https://stripe.com/docs/search-api). 

For information about how to use stripe-java, see the [README.md](https://github.com/stripe/stripe-java/blob/master/README.md) from the [master branch](https://github.com/stripe/stripe-java).

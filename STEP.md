# Overview
We are on the private forked version of the SDK. This is because Stripe doesn't support
Issuing Settlement and Card Design features in their public SDK.

# Build Locally
To build locally, run:

```
gradle build -x test
```

Skip tests because they don't work without a Stripe test server that we don't have access to.

# Publish to jitpack
We are hosting built library at JitPack.

1. Look at the latest sha for the `step` branch, take first 7 chars and convert it into
dependency as shown below:
```
compile("com.github.getstep:stripe-java:7aacbda")
```
1. The dependency fetch above will trigger a build on JitPack for the given sha.
1. Go to https://jitpack.io/#getstep/stripe-java to see all the available builds.

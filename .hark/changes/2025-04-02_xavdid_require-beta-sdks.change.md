---
title: require beta SDKs match event versions exactly when deserializing
pr_url: https://github.com/stripe/stripe-java/pull/1971
is_breaking: true
released_in_version: 29.1.0
---

- ⚠️ Public Preview SDKs now require an exact API version match when deserializing webhooks
    - To deserialize events from another API version, use `EventDataObjectDeserializer .deserializeUnsafe()` instead of `.deserialize()`.

---
title: add `tolerance` argument to `parseThinEvent`
pr_url: https://github.com/stripe/stripe-java/pull/1912
released_in_version: 27.1.2
---

- The default `tolerance` value is still what most users will want, but this fixes an oversight where it wasn't possible to set `tolerance` at all when parsing thin events

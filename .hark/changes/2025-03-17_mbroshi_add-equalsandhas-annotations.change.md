---
title: Add @EqualsAndHashCode annotations
pr_link: https://github.com/stripe/stripe-java/pull/1955
released_in_version: 29.0.0
---

- Adds `@EqualsAndHashCode(callSuper = false)` to all Params objects which is useful for unit test assertions and caching scenarios.

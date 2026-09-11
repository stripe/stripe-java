---
title: Update AddBetaVersion behavior
pr_link: https://github.com/stripe/stripe-java/pull/1959
section: Changes
released_in_version: 29.1.0-beta.1
---

* `Stripe.AddBetaVersion` will use the highest version number used for a beta feature instead of throwing an `Exception` on a conflict as it had done previously.

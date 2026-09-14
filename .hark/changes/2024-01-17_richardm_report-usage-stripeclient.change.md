---
title: Report usage of `stripe_client`
pr_url: https://github.com/stripe/stripe-java/pull/1721
released_in_version: 24.12.0
---

* Reports use of the new `StripeClient` in `X-Stripe-Client-Telemetry`. (You can disable telemetry via `Stripe.enableTelemetry = false;`, see the [README](https://github.com/stripe/stripe-java/blob/master/README.md#telemetry).)

## Details
* A different approach to #1698. This one sets `usage` on each callsite to `StripeResponseGetter.request` from `StripeClient`, rather than attempting to wrap `LiveStripeResponseGetter`.
* Modifies `RequestTelemetry` to accept usage and set it appropriately on `X-Stripe-Client-Telemetry`. Had to add a parameter to a public method, so I made a new overload and deprecated the old one. Had to disable a linter rule to do this.

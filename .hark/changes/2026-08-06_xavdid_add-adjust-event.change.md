---
title: add/adjust event parsing helpers
pr_link: https://github.com/stripe/stripe-java/pull/2256
released_in_version: 33.3.0
---

- Added methods that return their respective `Event`/`EventNotification` class instances without verifying authenticity. Use them when you've previously verified an event (e.g. you verified, put the event in a queue, and are now processing). Supports events from [AWS EventBridge](https://docs.stripe.com/event-destinations/eventbridge) and [Azure Event Grid](https://docs.stripe.com/event-destinations/eventgrid) natively.
  - `Webhook.constructEventWithoutVerification(payload)`
  - `StripeClient.constructEventWithoutVerification(payload)`
  - `StripeClient.parseEventNotificationWithoutVerification(payload)`
- Added `Webhook.Signature.generateSignatureHeader(payload, secret)`, which computes a full `Stripe-Signature` header for the given payload. Useful for unit tests!

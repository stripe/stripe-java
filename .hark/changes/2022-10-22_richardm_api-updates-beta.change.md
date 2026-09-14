---
title: API Updates for beta branch
pr_url: https://github.com/stripe/stripe-java/pull/1462
is_stripe_api_change: true
released_in_version: 21.14.0-beta.1
---

* Updated stable APIs to the latest version
* Add support for new value `revoked` on enum `CapitalFinancingOfferListParams.status`
* Add support for `paypal` on `Charge.payment_method_details` and `Source`
* Add support for `network_data` on `Issuing.Transaction`
* Add support for `billing_cycle_anchor` on `SubscriptionScheduleAmendParams.amendments[]`
* Add support for `tipping` on `Terminal.Reader.action.process_payment_intent.process_config` and `TerminalReaderProcessPaymentIntentParams.process_config`

---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2157
is_stripe_api_change: true
released_in_version: 31.5.0-alpha.1
---

* Add support for new resource `AccountSignals`
* Add support for `retrieve` method on resource `AccountSignals`
* Add support for `aggregationPeriod`, `groupBy`, and `triggeredAt` on `billing.AlertTriggered`
* Add support for `externalAccountCollection` on `AccountLinkCreateParams.collection_options`
* Add support for `fundingSource` on `ApplicationFee`
* Change `delegatedcheckout.RequestedSessionConfirmParams.payment_method_data.billing_details.address.line1`, `delegatedcheckout.RequestedSessionCreateParams.fulfillment_details.address.line1`, `delegatedcheckout.RequestedSessionCreateParams.payment_method_data.billing_details.address.line1`, `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details.address.line1`, and `delegatedcheckout.RequestedSessionUpdateParams.payment_method_data.billing_details.address.line1` to be optional
* Add support for `hosted` and `uiMode` on `financialconnections.SessionCreateParams` and `financialconnections.Session`
* Add support for `url` on `financialconnections.Session`
* Add support for `billingCycleAnchor` on `SubscriptionCreateParams.trial_settings.end_behavior` and `SubscriptionUpdateParams.trial_settings.end_behavior`

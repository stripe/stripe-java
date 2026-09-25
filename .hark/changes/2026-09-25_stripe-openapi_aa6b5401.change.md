---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2279
semver_level: major
is_stripe_api_change: true
---

* Add support for new resource `radar.BillingEvaluation`
* Add support for `create` method on resource `radar.BillingEvaluation`
* Add support for `list` method on resource `reserve.Plan`
* Add support for `afterExpiration` on `billingportal.SessionCreateParams` and `billingportal.Session`
* Add support for `setupCredentialUsage` on `Charge.payment_method_details.card`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, `SetupIntent.payment_method_options.card`, `SetupIntentConfirmParams.payment_method_options.card`, `SetupIntentCreateParams.payment_method_options.card`, and `SetupIntentUpdateParams.payment_method_options.card`
* Add support for `storedCredentialUsage` on `Charge.payment_method_details.card`, `PaymentAttemptRecord.payment_method_details.card`, `PaymentIntent.payment_method_options.card`, `PaymentIntentConfirmParams.payment_method_options.card`, `PaymentIntentCreateParams.payment_method_options.card`, `PaymentIntentUpdateParams.payment_method_options.card`, and `PaymentRecord.payment_method_details.card`
* Add support for `expiresAt` on `Subscription.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionCreateParams.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options.blik.mandate_options`, and `checkout.SessionCreateParams.payment_method_options.blik.mandate_options`
* ⚠️ Remove support for `expiresAfter` on `Subscription.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionCreateParams.payment_settings.payment_method_options.blik.mandate_options`, `SubscriptionUpdateParams.payment_settings.payment_method_options.blik.mandate_options`, and `checkout.SessionCreateParams.payment_method_options.blik.mandate_options`
* ⚠️ Remove support for value `on_session` from enum `checkout.SessionCreateParams.payment_method_options.blik.setupFutureUsage`
* Add support for `paymentIntentData` on `checkout.SessionUpdateParams`
* Add support for `appeal` on `Dispute.evidence` and `DisputeUpdateParams.evidence`
* Add support for `livemode` on `FxQuote`
* ⚠️ Remove support for `captureMethod` on `PaymentIntentConfirmParams.payment_method_options.paypay`, `PaymentIntentCreateParams.payment_method_options.paypay`, and `PaymentIntentUpdateParams.payment_method_options.paypay`
* Add support for `active` on `productcatalog.TrialOfferCreateParams`, `productcatalog.TrialOfferListParams`, and `productcatalog.TrialOffer`
* Add support for `nickname` on `productcatalog.TrialOfferCreateParams` and `productcatalog.TrialOffer`
* ⚠️ Remove support for `name` on `productcatalog.TrialOfferCreateParams` and `productcatalog.TrialOffer`
* Add support for `statusDetails` on `QuotePreviewInvoice`
* Add support for `companyDetails` and `reference` on `QuotePreviewInvoice.payment_settings.payment_method_options.billie`
* Add support for `pauseSchedules` on `QuotePreviewSubscriptionSchedule`
* Add support for `destination` on `reserve.Hold`, `reserve.Plan`, and `reserve.Release`
* Add support for `manualRelease` on `reserve.Plan`
* Add support for new value `igic` on enum `tax.RegistrationCreateParams.country_options.es.type`

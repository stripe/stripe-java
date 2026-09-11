---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2212
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.3.0-beta.1
---

* Add support for `pause` method on resource `Subscription`
* Add support for `retrieve` method on resource `v2.iam.ActivityLog`
* ⚠️ Change type of `productcatalog.TrialOffer.end_behavior.transition.price` from `string` to `expandable($Price)`
* Add support for `amountPaidOffStripe` on `QuotePreviewInvoice`
* Add support for `discountable` on `QuotePreviewSubscriptionSchedule.phases[].add_invoice_items[]`
* Add support for `bizum` and `scalapay` on `sharedpayment.GrantedToken.payment_method_details`
* Add support for `paymentBehavior` on `SubscriptionResumeParams`
* Add support for `statusDetails` on `Subscription`
* ⚠️ Change type of `v2.moneymanagement.ReceivedCredit.bank_transfer.gb_bank_account.network` from `literal('fps')` to `enum('chaps'|'fps')`
* Add support for new value `chaps` on enum `v2.FinancialAddressCreditSimulationCreditParams.network`

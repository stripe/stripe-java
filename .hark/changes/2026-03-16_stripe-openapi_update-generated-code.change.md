---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2177
is_breaking: true
is_stripe_api_change: true
released_in_version: 31.5.0-alpha.4
---

* Add support for new resources `orchestration.PaymentAttempt` and `radar.CustomerEvaluation`
* Add support for `retrieve` method on resource `orchestration.PaymentAttempt`
* Add support for `create` and `update` methods on resource `radar.CustomerEvaluation`
* Add support for `approve` method on resource `checkout.Session`
* Add support for `report_authenticated`, `report_canceled`, `report_failed`, `report_guaranteed`, `report_informational`, and `report_refund` methods on resource `PaymentAttemptRecord`
* Add support for `createUsPaperCheckOnApplication` on `AccountSessionCreateParams.components.check_scanning.features`
* Add support for `approvalMethod` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for `currentAttempt` on `checkout.Session`
* Add support for `selectedFulfillmentOptionOverrides` on `delegatedcheckout.RequestedSessionUpdateParams.fulfillment_details`
* Add support for `pricingPlanSubscriptionDetails` on `InvoiceItem.parent` and `InvoiceLineItem.parent`
* ⚠️ Remove support for `licenseFeeSubscriptionDetails` on `InvoiceItem.parent` and `InvoiceLineItem.parent`
* ⚠️ Remove support for `pricingPlanSubscription` and `pricingPlanVersion` on `InvoiceItem.parent.rate_card_subscription_details` and `InvoiceLineItem.parent.rate_card_subscription_details`
* Add support for `tokenDetails` on `issuing.Authorization`
* Add support for `failureCode` on `PaymentRecordReportPaymentAttemptFailedParams`, `PaymentRecordReportPaymentAttemptParams.failed`, and `PaymentRecordReportPaymentParams.failed`
* Change `PaymentRecordReportPaymentAttemptCanceledParams.canceledAt` to be optional
* Change `PaymentRecordReportPaymentAttemptFailedParams.failedAt` to be optional
* Change `PaymentRecordReportPaymentAttemptGuaranteedParams.guaranteedAt` to be optional
* Change `PaymentRecordReportRefundParams.refunded` to be optional
* ⚠️ Remove support for value `now` from enums `QuoteCreateParams.subscription_data.billing_schedules[].bill_from.type`, `QuoteCreateParams.subscription_data_overrides[].billing_schedules[].bill_from.type`, `QuoteUpdateParams.subscription_data.billing_schedules[].bill_from.type`, and `QuoteUpdateParams.subscription_data_overrides[].billing_schedules[].bill_from.type`
* ⚠️ Change `radar.IssuingAuthorizationEvaluationCreateParams.card_details.binCountry` to be required
* Add support for `recurringInterval` on `sharedpayment.GrantedTokenCreateParams.usage_limits`
* Change `sharedpayment.GrantedTokenCreateParams.usage_limits.expiresAt` to be optional
* Add support for `homeRuleTax` on `tax.Registration.country_options.us` and `tax.RegistrationCreateParams.country_options.us`
* Add support for new value `home_rule_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`

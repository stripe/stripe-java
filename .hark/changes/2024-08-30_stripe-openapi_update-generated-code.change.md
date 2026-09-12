---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1853
is_stripe_api_change: true
released_in_version: 26.11.0-beta.1
---

* Add support for new resource `Terminal.ReaderCollectedData`
* Add support for `retrieve` method on resource `ReaderCollectedData`
* Add support for new value `mb_way` on enum `checkout.SessionCreateParams.payment_method_types[]`
* Add support for `business_name`, `email`, `phone`, and `tax_ids` on `Checkout.Session.collected_information`
* Add support for `regulatory_reporting_file` on `Issuing.CreditUnderwritingRecord`, `issuing.CreditUnderwritingRecordCorrectParams`, `issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams`, and `issuing.CreditUnderwritingRecordReportDecisionParams`
* Remove support for `rechnung` on `PaymentMethodUpdateParams`

---
title: Update generated code for private-preview
pr_link: https://github.com/stripe/stripe-java/pull/2143
is_stripe_api_change: true
released_in_version: 31.2.0-alpha.3
---

* Add support for `riskDetails` on `delegatedcheckout.RequestedSession`
* Remove support for `description`, `images`, and `name` on `delegatedcheckout.RequestedSession.line_item_details[]`
* Add support for `name` on `productcatalog.TrialOfferCreateParams` and `productcatalog.TrialOffer`
* Add support for `loginFailed` and `registrationFailed` on `radar.AccountEvaluation.events[]` and `radar.AccountEvaluationUpdateParams`
* Change type of `radar.AccountEvaluationUpdateParams.type` from `literal('registration_succeeded')` to `enum('login_failed'|'login_succeeded'|'registration_failed'|'registration_succeeded')`

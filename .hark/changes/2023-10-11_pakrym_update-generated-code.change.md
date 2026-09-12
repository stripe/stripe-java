---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1667
is_stripe_api_change: true
released_in_version: 23.10.0-beta.1
---

* Add support for new resources `AccountNotice` and `Issuing.CreditUnderwritingRecord`
* Add support for `list`, `retrieve`, and `update` methods on resource `AccountNotice`
* Add support for `correct`, `create_from_application`, `create_from_proactive_review`, `list`, `report_decision`, and `retrieve` methods on resource `CreditUnderwritingRecord`
* Add support for new values `local_amusement_tax` and `state_communications_tax` on enum `tax.RegistrationCreateParams.country_options.us.type`
* Add support for new values `account_notice.created` and `account_notice.updated` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

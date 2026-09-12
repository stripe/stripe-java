---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1652
is_stripe_api_change: true
released_in_version: 23.6.0-beta.1
---

* Add support for new resource `ConfirmationToken`
* Add support for `retrieve` method on resource `ConfirmationToken`
* Add support for `create` method on resource `Issuing.CardDesign`
* Add support for `reject_testmode` test helper method on resource `Issuing.CardDesign`
* Add support for `features` on `Issuing.CardBundle`
* Add support for `preferences` on `Issuing.CardDesign`, `issuing.CardDesignListParams`, and `issuing.CardDesignUpdateParams`
* Remove support for `preference` on `Issuing.CardDesign`, `issuing.CardDesignListParams`, and `issuing.CardDesignUpdateParams`
* Add support for `card_bundle` on `issuing.CardDesignUpdateParams`
* Add support for `card_logo` and `carrier_text` on `Issuing.CardDesign` and `issuing.CardDesignUpdateParams`
* Change type of `issuing.CardDesignUpdateParams.lookup_key` and `issuing.CardDesignUpdateParams.name` from `string` to `emptyStringable(string)`
* Add support for `rejection_reasons` on `Issuing.CardDesign`
* Add support for `confirmation_token` on `PaymentIntentConfirmParams`, `PaymentIntentCreateParams`, `SetupIntentConfirmParams`, and `SetupIntentCreateParams`
* Add support for new value `issuing_card_design.rejected` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

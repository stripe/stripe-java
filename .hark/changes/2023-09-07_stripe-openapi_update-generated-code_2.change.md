---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1644
is_stripe_api_change: true
released_in_version: 23.5.0-beta.1
---

* Remove support for `submit_card` test helper method on resource `Issuing.Card`
* Add support for `card_design` on `issuing.CardUpdateParams`
* Add support for new value `platform_default` on enum `issuing.CardDesignListParams.preference`

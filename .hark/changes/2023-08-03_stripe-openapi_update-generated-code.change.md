---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1621
is_stripe_api_change: true
released_in_version: 22.31.0-beta.1
---

* Add support for `submit_card` test helper method on resource `Issuing.Card`
* Add support for `address_validation` on `Issuing.Card.shipping` and `issuing.CardCreateParams.shipping`
* Add support for `shipping` on `issuing.CardUpdateParams`
* Change type of `OrderCreateParams.line_items[].product_data.description`, `OrderCreateParams.line_items[].product_data.tax_code`, `OrderCreateParams.shipping_details.phone`, `OrderUpdateParams.description`, `OrderUpdateParams.line_items[].product_data.description`, `OrderUpdateParams.line_items[].product_data.tax_code`, `OrderUpdateParams.shipping_details.phone`, `PaymentMethodConfigurationListParams.application`, and `QuoteUpdateParams.subscription_data_overrides[].description` from `string` to `emptyStringable(string)`
* Add support for `reason` on `QuoteMarkStaleQuoteParams`
* Add support for `marked_stale` on `Quote.status_details.stale.last_reason`
* Change `tax.FormListParams.payee.type` to be optional

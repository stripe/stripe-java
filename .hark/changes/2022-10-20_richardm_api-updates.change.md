---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1461
is_stripe_api_change: true
released_in_version: 21.13.0
---

* Add support for new values `jp_trn` and `ke_pin` on enums `CustomerCreateParams.tax_id_data[].type`, `InvoiceUpcomingLinesParams.customer_details.tax_ids[].type`, `InvoiceUpcomingParams.customer_details.tax_ids[].type`, `OrderCreateParams.tax_details.tax_ids[].type`, `OrderUpdateParams.tax_details.tax_ids[].type`, and `TaxIdCreateParams.type`
* Add support for `tipping` on `Terminal.Reader.action.process_payment_intent.process_config` and `terminal.ReaderProcessPaymentIntentParams.process_config`

---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1748
is_stripe_api_change: true
released_in_version: 24.17.0
---

* Add support for `client_reference_id` on `Identity.VerificationReport`, `Identity.VerificationSession`, `identity.VerificationReportListParams`, `identity.VerificationSessionCreateParams`, and `identity.VerificationSessionListParams`
* Remove support for value `include_and_require` from enum `InvoiceCreateParams.pending_invoice_items_behavior`
* Remove support for value `service_tax` from enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`
* Add support for `created` on `treasury.OutboundPaymentListParams`
* Add `InvoiceLineItem.update` method.

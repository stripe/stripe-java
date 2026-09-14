---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/1678
is_stripe_api_change: true
released_in_version: 24.2.0-beta.1
---

* Add support for `attach_payment_intent` method on resource `Invoice`
* Add support for `revolut_pay` on `ConfirmationToken.payment_method_preview`
* Add support for `refunds` on `CreditNoteCreateParams`, `CreditNotePreviewLinesParams`, `CreditNotePreviewParams`, and `CreditNote`
* Add support for `post_payment_amount` and `pre_payment_amount` on `CreditNote`
* Add support for `schedule_details` on `InvoiceUpcomingLinesParams` and `InvoiceUpcomingParams`
* Add support for `amounts_due` on `InvoiceCreateParams`, `InvoiceUpdateParams`, and `Invoice`
* Add support for `payments` on `Invoice`
* Add support for `created` on `Issuing.PersonalizationDesign`
* Add support for `ending_before`, `limit`, and `starting_after` on `tax.RegistrationListParams`
* Change type of `tax.RegistrationCreateParams.active_from` to `DateTime | 'now'`
* Add support for new value `invoice.payment.overpaid` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

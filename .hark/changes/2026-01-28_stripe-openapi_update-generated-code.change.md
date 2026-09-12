---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2145
is_stripe_api_change: true
released_in_version: 31.4.0-beta.1
---

* Add support for new resource `financialconnections.Authorization`
* Add support for `retrieve` method on resource `financialconnections.Authorization`
* Add support for `detach_payment` method on resource `Invoice`
* Remove support for `cancel`, `list_line_items`, and `reopen` methods on resource `Order`
* Remove support for `attach_cadence` method on resource `Subscription`
* Add support for `additionalFiles` and `site` on `Account.settings.paypay_payments`, `AccountCreateParams.settings.paypay_payments`, and `AccountUpdateParams.settings.paypay_payments`
* Remove support for `capital` on `Account.settings`
* Add support for `authorization` and `statusDetails` on `financialconnections.Account`
* Add support for `relinkOptions` on `financialconnections.SessionCreateParams` and `financialconnections.Session`
* Change `financialconnections.SessionCreateParams.accountHolder` to be optional
* Add support for `relinkResult` on `financialconnections.Session`
* Remove support for `billingCadence` on `InvoiceCreatePreviewParams`, `SubscriptionCreateParams`, `SubscriptionUpdateParams`, and `Subscription`
* Remove support for `billingCadenceDetails` on `Invoice.parent` and `QuotePreviewInvoice.parent`
* Add support for new value `pl_nip` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for `carRentalData`, `flightData`, and `lodgingData` on `PaymentIntent.payment_details`
* Add support for new value `capital.financing_summary.line_of_credit_update` on enums `WebhookEndpointCreateParams.enabledEvents` and `WebhookEndpointUpdateParams.enabledEvents`
* Add support for `alternativeReference` on `v2.core.vault.GbBankAccount`, `v2.core.vault.UsBankAccount`, and `v2.moneymanagement.PayoutMethod`
* Add support for `accountHolderAddress` and `accountHolderName` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
* Add support for `fingerprint` on `v2.moneymanagement.PayoutMethod.card`
* Add support for snapshot event `invoice_payment.detached` with resource `InvoicePayment`

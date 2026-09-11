---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/2029
is_stripe_api_change: true
released_in_version: 29.6.0-beta.1
---

* Add support for `list` and `retrieve` methods on resource `InvoicePayment`
* Add support for `list` method on resource `Mandate`
* Add support for `applied` on `v2.core.Account.configuration.customer`, `v2.core.Account.configuration.merchant`, `v2.core.Account.configuration.recipient`, `v2.core.Account.configuration.storer`, `v2.core.AccountUpdateParams.configuration.customer`, `v2.core.AccountUpdateParams.configuration.merchant`, `v2.core.AccountUpdateParams.configuration.recipient`, and `v2.core.AccountUpdateParams.configuration.storer`
* Change type of `billing.AlertTriggered.value` from `longInteger` to `decimal_string`
* Add support for `displayName` on `v2.moneymanagement.FinancialAccountCreateParams` and `v2.moneymanagement.FinancialAccount`
* Add support for `currencyConversion` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for `payments` on `BalanceSettingsUpdateParams` and `BalanceSettings`
* Remove support for `debitNegativeBalances`, `payouts`, and `settlementTiming` on `BalanceSettingsUpdateParams` and `BalanceSettings`
* Add support for `mandate` on `Charge.payment_method_details.pix`, `PaymentAttemptRecord.payment_method_details.pix`, and `PaymentRecord.payment_method_details.pix`
* Add support for `couponData` on `checkout.SessionCreateParams.discounts[]`
* Add support for `mandateOptions` on `PaymentIntent.payment_method_options.pix`, `PaymentIntentConfirmParams.payment_method_options.pix`, `PaymentIntentCreateParams.payment_method_options.pix`, `PaymentIntentUpdateParams.payment_method_options.pix`, `checkout.Session.payment_method_options.pix`, and `checkout.SessionCreateParams.payment_method_options.pix`
* Change type of `PaymentIntent.payment_method_options.pix.setupFutureUsage`, `PaymentIntentConfirmParams.payment_method_options.pix.setupFutureUsage`, `PaymentIntentCreateParams.payment_method_options.pix.setupFutureUsage`, `PaymentIntentUpdateParams.payment_method_options.pix.setupFutureUsage`, `checkout.Session.payment_method_options.pix.setupFutureUsage`, and `checkout.SessionCreateParams.payment_method_options.pix.setupFutureUsage` from `literal('none')` to `enum('none'|'off_session')`
* Add support for `amount` on `Mandate.multi_use`, `PaymentAttemptRecord`, and `PaymentRecord`
* Add support for `currency` on `Mandate.multi_use`
* Add support for `pix` on `Mandate.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntent.payment_method_options`, `SetupIntentConfirmParams.payment_method_options`, `SetupIntentCreateParams.payment_method_options`, and `SetupIntentUpdateParams.payment_method_options`
* Add support for `limit` on `PaymentAttemptRecordListParams`
* Add support for `amountAuthorized`, `amountRefunded`, and `application` on `PaymentAttemptRecord` and `PaymentRecord`
* Add support for `processorDetails` on `PaymentAttemptRecord`, `PaymentRecordReportPaymentParams`, and `PaymentRecord`
* Remove support for `paymentReference` on `PaymentAttemptRecord`, `PaymentRecordReportPaymentParams`, and `PaymentRecord`
* Add support for `installments` on `PaymentAttemptRecord.payment_method_details.alma` and `PaymentRecord.payment_method_details.alma`
* Add support for `transactionId` on `PaymentAttemptRecord.payment_method_details.alma`, `PaymentAttemptRecord.payment_method_details.amazon_pay`, `PaymentAttemptRecord.payment_method_details.billie`, `PaymentAttemptRecord.payment_method_details.kakao_pay`, `PaymentAttemptRecord.payment_method_details.kr_card`, `PaymentAttemptRecord.payment_method_details.naver_pay`, `PaymentAttemptRecord.payment_method_details.payco`, `PaymentAttemptRecord.payment_method_details.revolut_pay`, `PaymentAttemptRecord.payment_method_details.samsung_pay`, `PaymentAttemptRecord.payment_method_details.satispay`, `PaymentRecord.payment_method_details.alma`, `PaymentRecord.payment_method_details.amazon_pay`, `PaymentRecord.payment_method_details.billie`, `PaymentRecord.payment_method_details.kakao_pay`, `PaymentRecord.payment_method_details.kr_card`, `PaymentRecord.payment_method_details.naver_pay`, `PaymentRecord.payment_method_details.payco`, `PaymentRecord.payment_method_details.revolut_pay`, `PaymentRecord.payment_method_details.samsung_pay`, and `PaymentRecord.payment_method_details.satispay`
* Add support for `location` and `reader` on `PaymentAttemptRecord.payment_method_details.paynow` and `PaymentRecord.payment_method_details.paynow`
* Add support for `latestActiveMandate` on `PaymentMethod`
* Add support for `metadata` and `period` on `QuotePreviewSubscriptionSchedule.phases[].add_invoice_items[]`
* Add support for `pixDisplayQrCode` on `SetupIntent.next_action`
* Add support for `readerSecurity` on `terminal.ConfigurationCreateParams`, `terminal.ConfigurationUpdateParams`, and `terminal.Configuration`
* Add support for new values `ao_nif`, `az_tin`, `bd_etin`, `cr_cpj`, `cr_nite`, `do_rcn`, `gt_nit`, `kz_bin`, `mz_nuit`, `pe_ruc`, `pk_ntn`, `sa_crn`, and `sa_tin` on enums `v2.core.AccountCreateParams.identity.business_details.id_numbers[].type` and `v2.core.AccountUpdateParams.identity.business_details.id_numbers[].type`
* Add support for new values `ao_nif`, `az_tin`, `bd_brc`, `bd_etin`, `bd_nid`, `cr_cpf`, `cr_dimex`, `cr_nite`, `do_rcn`, `gt_nit`, `kz_iin`, `mz_nuit`, `pe_dni`, `pk_cnic`, `pk_snic`, and `sa_tin` on enums `v2.core.AccountCreateParams.identity.individual.id_numbers[].type`, `v2.core.AccountUpdateParams.identity.individual.id_numbers[].type`, `v2.core.PersonCreateParams.id_numbers[].type`, and `v2.core.PersonUpdateParams.id_numbers[].type`

---
title: Update generated code for private-preview
pr_url: https://github.com/stripe/stripe-java/pull/2216
is_breaking: true
is_stripe_api_change: true
released_in_version: 32.2.0-alpha.5
---

* Add support for new resources `v2.core.FeeBatch`, `v2.core.FeeEntry`, `v2.moneymanagement.DebitDispute`, and `v2.moneymanagement.FinancialAccountStatement`
* Add support for `simulate_network_lifecycle_pre_arbitration_response` and `simulate_network_lifecycle_pre_arbitration_submission` test helper methods on resource `issuing.Dispute`
* Add support for `list` method on resource `PaymentLocation`
* Add support for `list` and `retrieve` methods on resources `v2.core.FeeBatch`, `v2.core.FeeEntry`, and `v2.moneymanagement.FinancialAccountStatement`
* Add support for `create`, `list`, and `retrieve` methods on resource `v2.moneymanagement.DebitDispute`
* Add support for `discounts` on `delegatedcheckout.RequestedSessionCreateParams`, `delegatedcheckout.RequestedSessionUpdateParams`, and `delegatedcheckout.RequestedSession`
* Add support for `amountSale` on `delegatedcheckout.RequestedSession.line_item_details[]` and `delegatedcheckout.RequestedSession.total_details`
* Add support for `amountDiscount` and `breakdown` on `delegatedcheckout.RequestedSession.total_details`
* ⚠️ Remove support for `checkDepositAddress` on `Invoice.payment_settings.payment_method_options.check_scan`, `InvoiceCreateParams.payment_settings.payment_method_options.check_scan`, `InvoiceUpdateParams.payment_settings.payment_method_options.check_scan`, `QuotePreviewInvoice.payment_settings.payment_method_options.check_scan`, `Subscription.payment_settings.payment_method_options.check_scan`, `SubscriptionCreateParams.payment_settings.payment_method_options.check_scan`, and `SubscriptionUpdateParams.payment_settings.payment_method_options.check_scan`
* Add support for `paymentEvaluations` on `PaymentAttemptRecordReportGuaranteedParams`, `PaymentRecordReportPaymentAttemptGuaranteedParams`, `PaymentRecordReportPaymentAttemptParams.guaranteed`, and `PaymentRecordReportPaymentParams.guaranteed`
* Add support for `location` on `PaymentIntentConfirmParams.payment_details`, `PaymentIntentCreateParams.payment_details`, `PaymentIntentUpdateParams.payment_details`, `SetupIntentConfirmParams.setup_details`, `SetupIntentCreateParams.setup_details`, and `SetupIntentUpdateParams.setup_details`
* Add support for `onboardingDataUpdateAcknowledged` on `PaymentLocationUpdateParams`
* Change `PaymentLocationCreateParams.address.country` and `PaymentLocationUpdateParams.address.country` to be optional
* Add support for `customer` on `radar.CustomerEvaluationUpdateParams`
* Add support for `status` on `radar.CustomerEvaluationUpdateParams` and `radar.CustomerEvaluation`
* Change `radar.CustomerEvaluationUpdateParams.type` to be optional
* Add support for `paymentBehavior` on `SubscriptionResumeParams`
* Add support for `disputeDetails` on `v2.moneymanagement.ReceivedDebit`
* Add support for `debitDispute` on `v2.moneymanagement.Transaction.flow` and `v2.moneymanagement.TransactionEntry.transaction_details.flow`
* Add support for `paymentAttemptRecord` on `EventsV2PaymentsOffSessionPaymentAttemptFailedEvent` and `EventsV2PaymentsOffSessionPaymentFailedEvent`
* Add support for event notifications `V2MoneyManagementFinancialAccountStatementCreatedEvent` and `V2MoneyManagementFinancialAccountStatementRestatedEvent` with related object `v2.moneymanagement.FinancialAccountStatement`

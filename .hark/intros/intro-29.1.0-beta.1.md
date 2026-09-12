### Breaking Changes

  * Remove support for `amountOverpaid` on `InvoicePayment`
  * Remove support for `interchangeFees`, `netTotal`, `networkFees`, and `transactionVolume` on `Issuing.Settlement`
  * Remove support for `Value` on `Terminal.Reader.action.collect_inputs.inputs[].selection.choices[]`, `Terminal.Reader.action.collect_inputs.inputs[].selection`, and `terminal.ReaderCollectInputsParams.inputs[].selection.choices[]`
  * Remove support for value `variable` from enum `CouponCreateParams.duration`
  * Remove support for `applicationFeeAmount`, `discount`, `paidOutOfBand`, `paid`, `paymentIntent`, `quote`, `subscriptionDetails`, `subscriptionProrationDate`, `tax`, `totalTaxAmounts`, and `transferData` on `QuotePreviewInvoice`
  * Remove support for `billingThresholds` on `QuotePreviewSubscriptionSchedule.default_settings`, `QuotePreviewSubscriptionSchedule.phases[].items[]`, and `QuotePreviewSubscriptionSchedule.phases[]`
  * Remove support for `coupon` on `QuotePreviewSubscriptionSchedule.phases[]`
  * Change `OrderCreateParams.payment.settings.payment_method_options.wechat_pay.client` and `OrderUpdateParams.payment.settings.payment_method_options.wechat_pay.client` to be optional
  * Change type of `PaymentAttemptRecord.payment_method_details.type` and `PaymentRecord.payment_method_details.type` from `literal('custom')` to `string`
  * Change type of `PaymentAttemptRecord.payment_record` from `string` to `nullable(string)`
  * Change `PaymentAttemptRecord.PaymentMethodDetail.custom` and `PaymentRecord.PaymentMethodDetail.custom` to be optional

### Additions

  * Add support for `paymentMethodOptions` on `ConfirmationTokenCreateParams`
  * Add support for `installments` on `ConfirmationToken.payment_method_options.card`
  * Add support for `billie` on `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_options`, and `PaymentIntentUpdateParams.payment_method_options`
  * Add support for `id` and `text` on `Terminal.Reader.action.collect_inputs.inputs[].selection.choices[]`, `Terminal.Reader.action.collect_inputs.inputs[].selection`, and `terminal.ReaderCollectInputsParams.inputs[].selection.choices[]`
  * Add support for new resources `BalanceSettings`
  * Add support for `retrieve` and `update` methods on resource `BalanceSettings`
  * Add support for `create`, `delete`, `list`, `retrieve`, and `update` methods on a new `ExternalAccountService` class to access cards and bank accounts made available in the new path `v1/external_accounts`. Access this via `StripeClient.externalAccounts`
  * Add support for `stripeBalancePayments` on `Account.capabilities`, `AccountCreateParams.capabilities`, and `AccountUpdateParams.capabilities`
  * Add support for `customerAccount` on `Billing.CreditBalanceSummary`, `Billing.CreditGrant`, `BillingPortal.Session`, `Checkout.Session`, `ConfirmationToken.payment_method_preview`, `CreditNoteListParams`, `CreditNote`, `CustomerBalanceTransaction`, `CustomerCashBalanceTransaction`, `CustomerCashBalance`, `CustomerPaymentMethod`, `CustomerSessionCreateParams`, `CustomerSession`, `CustomerTaxId.owner`, `CustomerTaxId`, `Customer`, `Discount`, `FinancialConnections.Account.account_holder`, `FinancialConnections.Session.account_holder`, `InvoiceCreateParams`, `InvoiceCreatePreviewParams`, `InvoiceItemCreateParams`, `InvoiceItemListParams`, `InvoiceItem`, `InvoiceListParams`, `Invoice`, `PaymentIntentCreateParams`, `PaymentIntentListParams`, `PaymentIntentUpdateParams`, `PaymentIntent`, `PaymentMethodAttachParams`, `PaymentMethod`, `PromotionCodeCreateParams`, `PromotionCodeListParams`, `PromotionCode`, `QuoteCreateParams`, `QuoteListParams`, `QuotePreviewInvoice`, `QuotePreviewSubscriptionSchedule`, `QuoteUpdateParams`, `Quote`, `SetupAttempt`, `SetupIntentCreateParams`, `SetupIntentListParams`, `SetupIntentUpdateParams`, `SetupIntent`, `SubscriptionCreateParams`, `SubscriptionListParams`, `SubscriptionScheduleCreateParams`, `SubscriptionScheduleListParams`, `SubscriptionSchedule`, `Subscription`, `TaxId.owner`, `TaxIdCreateParams.owner`, `TaxIdListParams.owner`, `TaxId`, `billing.CreditBalanceSummaryRetrieveParams`, `billing.CreditBalanceTransactionListParams`, `billing.CreditGrantCreateParams`, `billing.CreditGrantListParams`, `billingportal.SessionCreateParams`, `checkout.SessionCreateParams`, `checkout.SessionListParams`, `financialconnections.AccountListParams.account_holder`, and `financialconnections.SessionCreateParams.account_holder`
  * Add support for `stripeBalance` on `Charge.payment_method_details`, `ConfirmationToken.payment_method_preview`, `ConfirmationTokenCreateParams.payment_method_data`, `CustomerPaymentMethod`, `PaymentAttemptRecord.payment_method_details`, `PaymentIntent.payment_method_options`, `PaymentIntentConfirmParams.payment_method_data`, `PaymentIntentConfirmParams.payment_method_options`, `PaymentIntentCreateParams.payment_method_data`, `PaymentIntentCreateParams.payment_method_options`, `PaymentIntentUpdateParams.payment_method_data`, `PaymentIntentUpdateParams.payment_method_options`, `PaymentMethodCreateParams`, `PaymentMethod`, `PaymentRecord.payment_method_details`, `SetupAttempt.payment_method_details`, `SetupIntentConfirmParams.payment_method_data`, `SetupIntentCreateParams.payment_method_data`, and `SetupIntentUpdateParams.payment_method_data`
  * Add support for `updateLineItems` and `updateShippingDetails` on `Checkout.Session.permissions` and `checkout.SessionCreateParams.permissions`
  * Add support for `provider` on `Checkout.Session.automatic_tax`, `Invoice.automatic_tax`, `Quote.automatic_tax`, and `QuotePreviewInvoice.automatic_tax`
  * Add support for `taxCalculationReference` on `CreditNoteLineItem`, `CreditNotePreviewLines`, `InvoiceLineItem`, `LineItem`, `PaymentLinkLineItem`, `QuoteComputedUpfrontLineItems`, `QuoteLineItem`, and `SessionLineItem`
  * Add support for `context` on `Event`
  * Add support for `relatedCustomerAccount` on `Identity.VerificationSession`, `identity.VerificationSessionCreateParams`, and `identity.VerificationSessionListParams`
  * Add support for `networkData` on `Issuing.DisputeSettlementDetail`
  * Add support for `interchangeFeesAmount`, `netTotalAmount`, `networkFeesAmount`, `otherFeesAmount`, `otherFeesCount`, and `transactionAmount` on `Issuing.Settlement`
  * Add support for `reportedBy` on `PaymentAttemptRecord`
  * Add support for `achCreditTransfer`, `achDebit`, `acssDebit`, `affirm`, `afterpayClearpay`, `alipay`, `alma`, `amazonPay`, `auBecsDebit`, `bacsDebit`, `bancontact`, `billie`, `blik`, `boleto`, `cardPresent`, `card`, `cashapp`, `customerBalance`, `eps`, `fpx`, `giropay`, `gopay`, `grabpay`, `idBankTransfer`, `ideal`, `interacPresent`, `kakaoPay`, `klarna`, `konbini`, `krCard`, `link`, `mbWay`, `mobilepay`, `multibanco`, `naverPay`, `nzBankAccount`, `oxxo`, `p24`, `payByBank`, `payco`, `paynow`, `paypal`, `payto`, `pix`, `promptpay`, `qris`, `rechnung`, `revolutPay`, `samsungPay`, `satispay`, `sepaCreditTransfer`, `sepaDebit`, `shopeepay`, `sofort`, `stripeAccount`, `swish`, `twint`, `usBankAccount`, `wechatPay`, `wechat`, and `zip` on `PaymentAttemptRecord.payment_method_details` and `PaymentRecord.payment_method_details`
  * Add support for `PayoutMethod` on `PayoutCreateParams` and `Payout`
  * Add support for `confirmationSecret`, `parent`, and `totalTaxes` on `QuotePreviewInvoice`
  * Add support for `Id` and `Text` on `TerminalReaderActionCollectInputsInputsSelectionChoices`, `TerminalReaderActionCollectInputsInputsSelection`, and `TerminalReaderInputsSelectionChoicesOptions`

  #### New APIs for Money CardManagement

  * Add support for new resources `V2.FinancialAddressCreditSimulation`, `V2.FinancialAddressGeneratedMicrodeposits`, `V2.MoneyManagement.Adjustment`, `V2.MoneyManagement.FinancialAccount`, `V2.MoneyManagement.FinancialAddress`, `V2.MoneyManagement.InboundTransfer`, `V2.MoneyManagement.OutboundPaymentQuote`, `V2.MoneyManagement.OutboundPayment`, `V2.MoneyManagement.OutboundSetupIntent`, `V2.MoneyManagement.OutboundTransfer`, `V2.MoneyManagement.PayoutMethod`, `V2.MoneyManagement.PayoutMethodsBankAccountSpec`, `V2.MoneyManagement.ReceivedCredit`, `V2.MoneyManagement.ReceivedDebit`, `V2.MoneyManagement.TransactionEntry`, and `V2.MoneyManagement.Transaction`
  * Add support for `create` method on resource `V2.MoneyManagement.OutboundPaymentQuote`
  * Add support for `list` and `retrieve` methods on resources `V2.MoneyManagement.Adjustment`, `V2.MoneyManagement.FinancialAccount`, `V2.MoneyManagement.ReceivedCredit`, `V2.MoneyManagement.ReceivedDebit`, `V2.MoneyManagement.TransactionEntry`, and `V2.MoneyManagement.Transaction`
  * Add support for `create`, `list`, and `retrieve` methods on resources `V2.MoneyManagement.FinancialAddress` and `V2.MoneyManagement.InboundTransfer`
  * Add support for `cancel`, `create`, `list`, and `retrieve` methods on resources `V2.MoneyManagement.OutboundPayment` and `V2.MoneyManagement.OutboundTransfer`
  * Add support for `archive`, `list`, `retrieve`, and `unarchive` methods on resource `V2.MoneyManagement.PayoutMethod`
  * Add support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `V2.MoneyManagement.OutboundSetupIntent`
  * Add support for `retrieve` method on resource `V2.MoneyManagement.PayoutMethodsBankAccountSpec`
  * Add support for new values `account_number`, `fedwire_routing_number`, and `routing_number` on enum `invalid_payment_method.invalidParam`
  * Add support for new thin event `V2MoneyManagementFinancialAccountCreatedEvent` with related object `V2.MoneyManagement.FinancialAccount`
  * Add support for new thin events `V2MoneyManagementFinancialAddressActivatedEvent` and `V2MoneyManagementFinancialAddressFailedEvent` with related object `V2.MoneyManagement.FinancialAddress`
  * Add support for new thin events `V2MoneyManagementInboundTransferAvailableEvent`, `V2MoneyManagementInboundTransferBankDebitFailedEvent`, `V2MoneyManagementInboundTransferBankDebitProcessingEvent`, `V2MoneyManagementInboundTransferBankDebitQueuedEvent`, `V2MoneyManagementInboundTransferBankDebitReturnedEvent`, and `V2MoneyManagementInboundTransferBankDebitSucceededEvent` with related object `V2.MoneyManagement.InboundTransfer`
  * Add support for new thin events `V2MoneyManagementOutboundPaymentCanceledEvent`, `V2MoneyManagementOutboundPaymentCreatedEvent`, `V2MoneyManagementOutboundPaymentFailedEvent`, `V2MoneyManagementOutboundPaymentPostedEvent`, and `V2MoneyManagementOutboundPaymentReturnedEvent` with related object `V2.MoneyManagement.OutboundPayment`
  * Add support for new thin events `V2MoneyManagementOutboundTransferCanceledEvent`, `V2MoneyManagementOutboundTransferCreatedEvent`, `V2MoneyManagementOutboundTransferFailedEvent`, `V2MoneyManagementOutboundTransferPostedEvent`, and `V2MoneyManagementOutboundTransferReturnedEvent` with related object `V2.MoneyManagement.OutboundTransfer`
  * Add support for new thin events `V2MoneyManagementReceivedCreditAvailableEvent`, `V2MoneyManagementReceivedCreditFailedEvent`, `V2MoneyManagementReceivedCreditReturnedEvent`, and `V2MoneyManagementReceivedCreditSucceededEvent` with related object `V2.MoneyManagement.ReceivedCredit`
  * Add support for new thin events `V2MoneyManagementReceivedDebitCanceledEvent`, `V2MoneyManagementReceivedDebitFailedEvent`, `V2MoneyManagementReceivedDebitPendingEvent`, `V2MoneyManagementReceivedDebitSucceededEvent`, and `V2MoneyManagementReceivedDebitUpdatedEvent` with related object `V2.MoneyManagement.ReceivedDebit`
  * Add support for new error types `AlreadyCanceledException`, `BlockedByStripeException`, `ControlledByDashboardException`, `FeatureNotEnabledException`, `FinancialAccountNotOpenException`, `InsufficientFundsException`, `InvalidPayoutMethodException`, `NotCancelableException`, and `RecipientNotNotifiableException`


  #### New APIs for Accounts v2 in private preview
  See [SaaS platform payments with subscription billing using Accounts v2](https://docs.stripe.com/connect/accounts-v2/saas-platform-payments-billing)

  * Add support for new resources `V2.Core.AccountLink`, `V2.Core.Account`, `V2.Core.Person`, `V2.Core.Vault.GbBankAccount`, `V2.Core.Vault.UsBankAccount`
  * Add support for `close`, `create`, `list`, `retrieve`, and `update` methods on resource `V2.Core.Account`
  * Add support for `create` method on resources `V2.Core.AccountLink` and `V2.MoneyManagement.OutboundPaymentQuote`
  * Add support for `acknowledge_confirmation_of_payee`, `archive`, `create`, `initiate_confirmation_of_payee`, and `retrieve` methods on resource `V2.Core.Vault.GbBankAccount`
  * Add support for `archive`, `create`, `retrieve`, and `update` methods on resource `V2.Core.Vault.UsBankAccount`
  * Add support for new thin events `V2CoreAccountIncludingConfigurationCustomerCapabilityStatusUpdatedEvent`, `V2CoreAccountIncludingConfigurationCustomerUpdatedEvent`, `V2CoreAccountIncludingConfigurationMerchantCapabilityStatusUpdatedEvent`, `V2CoreAccountIncludingConfigurationMerchantUpdatedEvent`, `V2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent`, `V2CoreAccountIncludingConfigurationRecipientUpdatedEvent`, `V2CoreAccountIncludingIdentityUpdatedEvent`, and `V2CoreAccountIncludingRequirementsUpdatedEvent`
  * Add support for new thin event `V2CoreAccountLinkCompletedEvent` with related object `V2.Core.AccountLink`
  * Add support for new thin events `V2CoreAccountPersonCreatedEvent`, `V2CoreAccountPersonDeletedEvent`, and `V2CoreAccountPersonUpdatedEvent` with related object `V2.Core.Person`

### Changes

  * Change `PaymentRecordReportPaymentParams.paymentReference` to be optional
  * Change type of `PaymentAttemptRecord.payment_method_details.custom` and `PaymentRecord.payment_method_details.custom` from `nullable(PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails)` to `PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails`

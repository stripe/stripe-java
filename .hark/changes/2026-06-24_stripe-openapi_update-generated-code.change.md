---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2225
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.2.0-beta.1
---

* Add support for `redaction` on `Card`, `Charge`, `Customer`, `PaymentIntent`, `PaymentMethod`, `SetupIntent`, `Source`, `Token`, `checkout.Session`, `issuing.Authorization`, `issuing.Card`, `issuing.Cardholder`, `issuing.Dispute`, and `issuing.Transaction`
* Add support for `disclaimerVariant` on `capital.FinancingOffer` and `capital.FinancingSummary.details`
* Add support for `active` on `financialconnections.Account.status_details` and `financialconnections.Authorization.status_details`
* Change type of `financialconnections.SessionCreateParams.limits.accounts` from `longInteger` to `emptyable(longInteger)`
* Add support for `pause` on `InvoiceCreatePreviewParams.subscription_details`
* Add support for `releaseDetails` on `reserve.Hold`
* Add support for `buyerId` on `sharedpayment.GrantedToken.payment_method_details.bizum` and `sharedpayment.GrantedToken.payment_method_details.blik`
* Add support for `fingerprint` on `sharedpayment.GrantedToken.payment_method_details.pix`
* ⚠️ Remove support for value `invoice_payment.detached` from enum `WebhookEndpointUpdateParams.enabledEvents`
* Add support for `moneyManager` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.configuration`
* ⚠️ Remove support for `storer` on `v2.core.Account.configuration`, `v2.core.Account.identity.attestations.terms_of_service`, `v2.core.AccountCreateParams.configuration`, `v2.core.AccountCreateParams.identity.attestations.terms_of_service`, `v2.core.AccountTokenCreateParams.identity.attestations.terms_of_service`, and `v2.core.AccountUpdateParams.configuration`
* ⚠️ Remove support for `maximumRps` on `v2.core.BatchJobCreateParams` and `v2.core.BatchJob`
* Add support for `bic` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
* ⚠️ Remove support for `swiftCode` on `v2.moneymanagement.FinancialAddress.credentials.us_bank_account`
* Add support for `processing` on `v2.moneymanagement.OutboundPayment.status_details` and `v2.moneymanagement.OutboundTransfer.status_details`
* Add support for `accountHolderName` on `v2.moneymanagement.ReceivedCredit.bank_transfer.us_bank_account`
* Add support for `statuses` on `v2.moneymanagement.FinancialAccountListParams`
* ⚠️ Remove support for `status` on `v2.moneymanagement.FinancialAccountListParams`
* Change `v2.core.BatchJobCreateParams.metadata` to be optional
* Add support for new value `money_manager` on enums `EventsV2CoreAccountLinkReturnedEvent.configurations`, `v2.core.AccountLinkCreateParams.use_case.account_onboarding.configurations`, and `v2.core.AccountLinkCreateParams.use_case.account_update.configurations`
* ⚠️ Add support for new value `money_manager` on enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
* ⚠️ Remove support for value `storer` from enums `v2.core.AccountCloseParams.appliedConfigurations` and `v2.core.AccountListParams.appliedConfigurations`
* ⚠️ Add support for new value `configuration.money_manager` on enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
* ⚠️ Remove support for value `configuration.storer` from enums `v2.core.AccountCreateParams.include`, `v2.core.AccountRetrieveParams.include`, and `v2.core.AccountUpdateParams.include`
* Add support for event notifications `V2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationMoneyManagerUpdatedEvent` with related object `v2.core.Account`
* Add support for event notification `V2MoneyManagementOutboundPaymentUnderReviewEvent` with related object `v2.moneymanagement.OutboundPayment`
* Add support for event notification `V2MoneyManagementOutboundTransferUnderReviewEvent` with related object `v2.moneymanagement.OutboundTransfer`
* ⚠️ Remove support for event notifications `V2CoreAccountIncludingConfigurationStorerCapabilityStatusUpdatedEvent` and `V2CoreAccountIncludingConfigurationStorerUpdatedEvent` with related object `v2.core.Account`

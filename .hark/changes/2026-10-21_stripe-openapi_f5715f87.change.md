---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2317
semver_level: major
is_stripe_api_change: true
released_in_version: 34.1.0-alpha.4
---

* Add support for new resources `risk.Form` and `v2.data.SearchResultList`
* Add support for `retrieve` and `update` methods on resource `risk.Form`
* Add support for `search` method on resource `v2.data.SearchResultList`
* Add support for `businessProfileManagement` and `reportingChart` on `AccountSession.components`
* Add support for `subscriptionPause` on `billingportal.Configuration.features`
* Add support for `marketingAttributions` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for `metronomeCommit` on `checkout.Session.items[]` and `checkout.SessionCreateParams.items[]`
* Add support for `adjustableQuantity` on `checkout.SessionCreateParams.items[].subscription.items[]`
* Add support for new value `metronome_commit` on enum `checkout.SessionCreateParams.items[].type`
* Add support for `mandateOptions` on `checkout.Session.payment_method_options.card`
* ⚠️ Remove support for value `email` from enums `identity.VerificationReportListParams.type`, `identity.VerificationSessionCreateParams.type`, and `identity.VerificationSessionUpdateParams.type`
* ⚠️ Remove support for `details` on `identity.VerificationReport.email`
* Add support for `merchantAmountExchangeRate` on `issuing.AuthorizationCaptureParams`, `issuing.AuthorizationCreateParams`, and `issuing.TransactionCreateForceCaptureParams`
* Add support for `type` on `issuing.AuthorizationCreateParams` and `issuing.Authorization`
* Add support for `settlementDetails` on `issuing.AuthorizationCaptureParams` and `issuing.TransactionCreateForceCaptureParams`
* ⚠️ Remove support for `healthcare` on `issuing.AuthorizationCaptureParams.purchase_details`, `issuing.TransactionCreateForceCaptureParams.purchase_details`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details`
* Add support for `productEligibilityInquiry` on `issuing.Authorization`
* Add support for `accountTaxIds`, `customFields`, `description`, and `footer` on `PaymentLink.subscription_data.invoice_settings`
* Add support for `referenceStatus` and `reference` on `Refund.destination_details.afterpay_clearpay`, `Refund.destination_details.klarna`, and `Refund.destination_details.paypal`
* Add support for `bw`, `ci`, `gh`, and `mu` on `tax.Registration.country_options`
* Add support for `czk`, `nok`, `pln`, and `sek` on `v2.core.Account.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.Account.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.inbound`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.outbound`
* Add support for `stablecoinCustodial` on `v2.core.Account.configuration.recipient.capabilities.stripe_balance`, `v2.core.AccountCreateParams.configuration.recipient.capabilities.stripe_balance`, and `v2.core.AccountUpdateParams.configuration.recipient.capabilities.stripe_balance`
* Add support for `accountTakeoverConfirmation`, `accountTakeoverReport`, `credentialChange`, `mfaAddition`, and `mfaRemoval` on `v2.signals.AccountActivityCreateParams`, `v2.signals.AccountActivity`, and `v2.signals.AccountEvaluationCreateParams.account_activity_details.data`
* Add support for `accountTakeover` on `v2.signals.AccountEvaluation.evaluated_signals` and `v2.signals.AccountSignal`
* Add support for `customerRisk` on `v2.signals.AccountSignal`
* Add support for new values `account_takeover` and `customer_risk` on enum `v2.signals.AccountSignalListParams.type`
* Add support for new values `account_takeover_confirmation`, `account_takeover_mitigation`, `account_takeover_report`, `credential_change`, `mfa_addition`, and `mfa_removal` on enums `v2.signals.AccountActivityCreateParams.type` and `v2.signals.AccountEvaluationCreateParams.account_activity_details.data.type`
* Add support for new value `account_takeover` on enum `v2.signals.AccountEvaluationCreateParams.requestedSignals`
* Add support for new value `account_takeover` on enum `v2.core.AccountEvaluationCreateParams.signals`
* Add support for new values `business_storage.inbound.czk`, `business_storage.inbound.nok`, `business_storage.inbound.pln`, `business_storage.inbound.sek`, `business_storage.outbound.czk`, `business_storage.outbound.nok`, `business_storage.outbound.pln`, and `business_storage.outbound.sek` on enum `EventsV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for new value `stripe_balance.stablecoin_custodial` on enum `EventsV2CoreAccountIncludingConfigurationRecipientCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for event notification `V2SignalsAccountSignalCustomerRiskReadyEvent` with related object `v2.signals.AccountSignal`

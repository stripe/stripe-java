---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2317
semver_level: major
is_stripe_api_change: true
---

* Add support for new resource `risk.Form`
* Add support for `retrieve` and `update` methods on resource `risk.Form`
* Add support for `businessProfileManagement` on `AccountSession.components`
* Add support for `marketingAttributions` on `checkout.SessionCreateParams` and `checkout.Session`
* Add support for `mandateOptions` on `checkout.Session.payment_method_options.card`
* ⚠️ Remove support for value `email` from enums `identity.VerificationReportListParams.type`, `identity.VerificationSessionCreateParams.type`, and `identity.VerificationSessionUpdateParams.type`
* ⚠️ Remove support for `details` on `identity.VerificationReport.email`
* ⚠️ Remove support for `healthcare` on `issuing.AuthorizationCaptureParams.purchase_details`, `issuing.TransactionCreateForceCaptureParams.purchase_details`, and `issuing.TransactionCreateUnlinkedRefundParams.purchase_details`
* Add support for `accountTaxIds`, `customFields`, `description`, and `footer` on `PaymentLink.subscription_data.invoice_settings`
* Add support for `bw`, `ci`, `gh`, and `mu` on `tax.Registration.country_options`
* Add support for `czk`, `nok`, `pln`, and `sek` on `v2.core.Account.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.Account.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.inbound`, `v2.core.AccountCreateParams.configuration.money_manager.capabilities.business_storage.outbound`, `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.inbound`, and `v2.core.AccountUpdateParams.configuration.money_manager.capabilities.business_storage.outbound`
* Add support for `accountTakeoverConfirmation`, `accountTakeoverReport`, `credentialChange`, `mfaAddition`, and `mfaRemoval` on `v2.signals.AccountActivityCreateParams`, `v2.signals.AccountActivity`, and `v2.signals.AccountEvaluationCreateParams.account_activity_details.data`
* Add support for `accountTakeover` on `v2.signals.AccountEvaluation.evaluated_signals` and `v2.signals.AccountSignal`
* Add support for `customerRisk` on `v2.signals.AccountSignal`
* Add support for new values `account_takeover` and `customer_risk` on enum `v2.signals.AccountSignalListParams.type`
* Add support for new values `account_takeover_confirmation`, `account_takeover_mitigation`, `account_takeover_report`, `credential_change`, `mfa_addition`, and `mfa_removal` on enums `v2.signals.AccountActivityCreateParams.type` and `v2.signals.AccountEvaluationCreateParams.account_activity_details.data.type`
* Add support for new value `account_takeover` on enum `v2.signals.AccountEvaluationCreateParams.requestedSignals`
* Add support for new value `account_takeover` on enum `v2.core.AccountEvaluationCreateParams.signals`
* Add support for new values `business_storage.inbound.czk`, `business_storage.inbound.nok`, `business_storage.inbound.pln`, `business_storage.inbound.sek`, `business_storage.outbound.czk`, `business_storage.outbound.nok`, `business_storage.outbound.pln`, and `business_storage.outbound.sek` on enum `EventsV2CoreAccountIncludingConfigurationMoneyManagerCapabilityStatusUpdatedEvent.updatedCapability`
* Add support for event notification `V2SignalsAccountSignalCustomerRiskReadyEvent` with related object `v2.signals.AccountSignal`

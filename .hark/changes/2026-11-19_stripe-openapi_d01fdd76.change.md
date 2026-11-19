---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2326
semver_level: major
is_stripe_api_change: true
released_in_version: 34.3.0-beta.1
---

* ⚠️ Remove support for resource `v2.billing.Cadence`
* Add support for `create` and `refill` test helper methods on resource `capital.FinancingOffer`
* ⚠️ Remove support for `cancel`, `create`, `list`, `retrieve`, and `update` methods on resource `v2.billing.Cadence`
* Add support for `exportTaxTransactions`, `productTaxCodeSelector`, and `taxThresholdMonitoring` on `AccountSession.components`
* Add support for `custom` on `CouponCreateParams` and `Coupon`
* Add support for `type` on `CouponCreateParams` and `CustomerBalanceTransactionCreateParams`
* Add support for `appliedToInvoice` on `CustomerBalanceTransactionCreateParams`
* Add support for `customerBalance` on `Invoice` and `QuotePreviewInvoice`
* Add support for `connect`, `dataExport`, `eventDestination`, `radar`, and `userAccess` on `v2.iam.ActivityLog.details`
* Add support for `applePay` on `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data` and `v2.moneymanagement.PayoutMethod`
* Add support for `network` and `originatingBankAccount` on `v2.moneymanagement.ReceivedDebit.bank_transfer`
* Add support for `created` on `v2.moneymanagement.ReceivedDebitListParams`
* Add support for new value `apple_pay` on enums `v2.moneymanagement.OutboundSetupIntentCreateParams.payout_method_data.type` and `v2.moneymanagement.OutboundSetupIntentUpdateParams.payout_method_data.type`
* Add support for `logsFrom` on `v2.iam.ActivityLogListParams`
* Add support for new values `app`, `connect`, `data_export`, `event_destination`, `radar`, and `user_access` on enum `v2.iam.ActivityLogListParams.actionGroups`
* Add support for new values `app_installed`, `app_uninstalled`, `application_authorized`, `application_created`, `application_deauthorized`, `connect_express_branding_updated`, `connect_oauth_disabled`, `connect_oauth_enabled`, `connect_settings_updated`, `connect_site_link_updated`, `data_export_requested`, `event_destination_added`, `event_destination_removed`, `event_destination_updated`, `payout_schedule_updated`, `radar_adaptive_3ds_disabled`, `radar_dynamic_risk_thresholds_disabled`, `radar_early_fraud_warning_disabled`, `radar_for_setup_intents_disabled`, `radar_fraud_dispute_protection_disabled`, `radar_rule_added`, `radar_rule_disabled`, `radar_rule_enabled`, `radar_rule_removed`, `radar_rule_updated`, and `user_access_started` on enum `v2.iam.ActivityLogListParams.actions`
* Add support for `severity` on `EventsV2CoreHealthEventGenerationFailureResolvedEvent`

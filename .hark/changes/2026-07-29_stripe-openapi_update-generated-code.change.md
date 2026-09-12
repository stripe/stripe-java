---
title: Update generated code for beta
pr_url: https://github.com/stripe/stripe-java/pull/2242
is_breaking: true
is_stripe_api_change: true
released_in_version: 33.3.0-beta.1
---

* Add support for `list` and `retrieve` methods on resource `productcatalog.TrialOffer`
* Add support for `taxItems` on `ChargeCaptureParams.payment_details.car_rental_data[].total.tax`, `ChargeCaptureParams.payment_details.flight_data[].total.tax`, `ChargeCaptureParams.payment_details.lodging_data[].total.tax`, `ChargeUpdateParams.payment_details.car_rental_data[].total.tax`, `ChargeUpdateParams.payment_details.flight_data[].total.tax`, `ChargeUpdateParams.payment_details.lodging_data[].total.tax`, `PaymentIntent.payment_details.car_rental_data[].total.tax`, `PaymentIntent.payment_details.flight_data[].total.tax`, `PaymentIntent.payment_details.lodging_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.flight_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.lodging_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.flight_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.lodging_data[].total.tax`, `PaymentIntentCreateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCreateParams.payment_details.flight_data[].total.tax`, `PaymentIntentCreateParams.payment_details.lodging_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.flight_data[].total.tax`, and `PaymentIntentUpdateParams.payment_details.lodging_data[].total.tax`
* ⚠️ Remove support for `taxes` on `ChargeCaptureParams.payment_details.car_rental_data[].total.tax`, `ChargeCaptureParams.payment_details.flight_data[].total.tax`, `ChargeCaptureParams.payment_details.lodging_data[].total.tax`, `ChargeUpdateParams.payment_details.car_rental_data[].total.tax`, `ChargeUpdateParams.payment_details.flight_data[].total.tax`, `ChargeUpdateParams.payment_details.lodging_data[].total.tax`, `PaymentIntent.payment_details.car_rental_data[].total.tax`, `PaymentIntent.payment_details.flight_data[].total.tax`, `PaymentIntent.payment_details.lodging_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.flight_data[].total.tax`, `PaymentIntentCaptureParams.payment_details.lodging_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.flight_data[].total.tax`, `PaymentIntentConfirmParams.payment_details.lodging_data[].total.tax`, `PaymentIntentCreateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentCreateParams.payment_details.flight_data[].total.tax`, `PaymentIntentCreateParams.payment_details.lodging_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.car_rental_data[].total.tax`, `PaymentIntentUpdateParams.payment_details.flight_data[].total.tax`, and `PaymentIntentUpdateParams.payment_details.lodging_data[].total.tax`
* Add support for `taxId` on `checkout.Session.collected_information`
* ⚠️ Remove support for `taxIds` on `checkout.Session.collected_information`
* Add support for new value `disabled` on enum `financialconnections.SessionCreateParams.manual_entry.mode`
* Add support for `mode` on `financialconnections.Session.manual_entry`
* Add support for `name` on `issuing.CardholderUpdateParams`
* Add support for new value `ic_nif` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Add support for `customFields`, `description`, and `footer` on `QuotePreviewSubscriptionSchedule.default_settings.invoice_settings` and `QuotePreviewSubscriptionSchedule.phases[].invoice_settings`
* Add support for `trial` on `QuotePreviewSubscriptionSchedule.phases[]`
* ⚠️ Remove support for `acssDebit`, `afterpayClearpay`, `alipay`, `alma`, `amazonPay`, `auBecsDebit`, `bacsDebit`, `bancontact`, `billie`, `bizum`, `blik`, `boleto`, `cardPresent`, `cashapp`, `crypto`, `customerBalance`, `eps`, `fpx`, `giropay`, `gopay`, `grabpay`, `idBankTransfer`, `ideal`, `interacPresent`, `kakaoPay`, `konbini`, `krCard`, `mbWay`, `mobilepay`, `multibanco`, `naverPay`, `nzBankAccount`, `oxxo`, `p24`, `payByBank`, `payco`, `paynow`, `paypal`, `paypay`, `payto`, `pix`, `promptpay`, `qris`, `rechnung`, `revolutPay`, `samsungPay`, `satispay`, `scalapay`, `sepaDebit`, `shopeepay`, `sofort`, `stripeBalance`, `sunbit`, `swish`, `twint`, `upi`, `usBankAccount`, `wechatPay`, and `zip` on `sharedpayment.GrantedToken.payment_method_details`
* Add support for `useStripeSdk` on `sharedpayment.IssuedTokenCreateParams` and `sharedpayment.IssuedToken`
* Add support for `redirectToUrl` on `sharedpayment.IssuedToken.next_action`
* ⚠️ Change type of `sharedpayment.IssuedToken.next_action.type` from `literal('use_stripe_sdk')` to `enum('redirect_to_url'|'use_stripe_sdk')`
* Add support for `livemode` on `tax.Location`
* Add support for `source` on `v2.iam.ActivityLog.details.user_roles`
* Add support for `payout` on `v2.moneymanagement.ReceivedCredit.balance_transfer`
* ⚠️ Remove support for `payoutV1` on `v2.moneymanagement.ReceivedCredit.balance_transfer`

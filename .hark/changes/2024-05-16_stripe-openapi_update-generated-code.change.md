---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/1803
is_stripe_api_change: true
released_in_version: 25.8.0
---

* Add support for `fee_source` on `ApplicationFee`
* Add support for `net_available` on `Balance.instant_available[]`
* Add support for `preferred_locales` on `Charge.payment_method_details.card_present`, `ConfirmationToken.payment_method_preview.card_present`, and `PaymentMethod.card_present`
* Add support for `klarna` on `Dispute.payment_method_details`
* Add support for `archived` and `lookup_key` on `entitlements.FeatureListParams`
* Change `financialconnections.SessionCreateParams.filters.countries` to be optional
* Add support for `no_valid_authorization` on `Issuing.Dispute.evidence`, `issuing.DisputeCreateParams.evidence`, and `issuing.DisputeUpdateParams.evidence`
* Add support for new value `no_valid_authorization` on enums `issuing.DisputeCreateParams.evidence.reason` and `issuing.DisputeUpdateParams.evidence.reason`
* Add support for `loss_reason` on `Issuing.Dispute`
* Add support for `routing` on `PaymentIntent.payment_method_options.card_present`, `PaymentIntentConfirmParams.payment_method_options.card_present`, `PaymentIntentCreateParams.payment_method_options.card_present`, and `PaymentIntentUpdateParams.payment_method_options.card_present`
* Add support for `application_fee_amount` and `application_fee` on `Payout`
* Add support for `stripe_s700` on `Terminal.Configuration`, `terminal.ConfigurationCreateParams`, and `terminal.ConfigurationUpdateParams`

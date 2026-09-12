---
title: API Updates for beta branch
pr_url: https://github.com/stripe/stripe-java/pull/1518
is_stripe_api_change: true
released_in_version: 22.11.0-beta.1
---

* Updated stable APIs to the latest version
* Add support for `manual_entry` on `Checkout.Session.payment_method_options.us_bank_account.financial_connections`, `PaymentIntent.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, `PaymentIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntent.payment_method_options.us_bank_account.financial_connections`, `SetupIntentConfirmParams.payment_method_options.us_bank_account.financial_connections`, `SetupIntentCreateParams.payment_method_options.us_bank_account.financial_connections`, and `SetupIntentUpdateParams.payment_method_options.us_bank_account.financial_connections`
* Change `TaxTransactionCreateParams.reference` to be required
* Add support for new values `capital.financing_offer.accepted`, `capital.financing_offer.canceled`, `capital.financing_offer.created`, `capital.financing_offer.expired`, `capital.financing_offer.fully_repaid`, `capital.financing_offer.paid_out`, `capital.financing_offer.rejected`, and `capital.financing_offer.replacement_created` on enums `WebhookEndpointCreateParams.enabled_events[]` and `WebhookEndpointUpdateParams.enabled_events[]`

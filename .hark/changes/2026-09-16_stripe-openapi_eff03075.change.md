---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/2287
semver_level: major
is_stripe_api_change: true
---

* ⚠️ Remove support for `nestingDemo` on `AccountSession.components`
* Add support for `verificationMethod` on `checkout.Session.payment_method_options.bacs_debit` and `checkout.SessionCreateParams.payment_method_options.bacs_debit`
* Add support for new value `sequra` on enum `checkout.SessionCreateParams.paymentMethodTypes`
* Add support for new value `ripusd` on enums `crypto.OnrampSessionCreateParams.destinationCurrency` and `crypto.OnrampSessionListParams.destinationCurrency`
* Add support for new value `ripusd` on enum `crypto.OnrampSessionCreateParams.destinationCurrencies`
* Add support for new values `cad`, `cop`, and `php` on enum `crypto.OnrampSessionCreateParams.sourceCurrency`
* Add support for `appeal` on `Dispute.evidence`
* Add support for `bacsDebit` on `Invoice.payment_settings.payment_method_options`, `InvoiceCreateParams.payment_settings.payment_method_options`, `InvoiceUpdateParams.payment_settings.payment_method_options`, `QuotePreviewInvoice.payment_settings.payment_method_options`, `Subscription.payment_settings.payment_method_options`, `SubscriptionCreateParams.payment_settings.payment_method_options`, and `SubscriptionUpdateParams.payment_settings.payment_method_options`
* Add support for `pricingToken` on `InvoiceCreatePreviewParams`
* Add support for `fundingSourceGroup` on `PaymentAttemptRecord.payment_method_details.link` and `PaymentRecord.payment_method_details.link`
* Add support for `payoutMethodOptions` on `PayoutCreateParams`
* ⚠️ Remove support for `igic` on `tax.Registration.country_options.at`, `tax.Registration.country_options.be`, `tax.Registration.country_options.bg`, `tax.Registration.country_options.cy`, `tax.Registration.country_options.cz`, `tax.Registration.country_options.de`, `tax.Registration.country_options.dk`, `tax.Registration.country_options.ee`, `tax.Registration.country_options.fi`, `tax.Registration.country_options.fr`, `tax.Registration.country_options.gr`, `tax.Registration.country_options.hr`, `tax.Registration.country_options.hu`, `tax.Registration.country_options.ie`, `tax.Registration.country_options.it`, `tax.Registration.country_options.lt`, `tax.Registration.country_options.lu`, `tax.Registration.country_options.lv`, `tax.Registration.country_options.mt`, `tax.Registration.country_options.nl`, `tax.Registration.country_options.pl`, `tax.Registration.country_options.pt`, `tax.Registration.country_options.ro`, `tax.Registration.country_options.se`, `tax.Registration.country_options.si`, and `tax.Registration.country_options.sk`

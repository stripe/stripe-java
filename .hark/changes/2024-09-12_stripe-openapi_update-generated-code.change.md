---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1864
is_stripe_api_change: true
released_in_version: 26.11.0
---

* Add support for new resource `InvoiceRenderingTemplate`
* Add support for `archive`, `list`, `retrieve`, and `unarchive` methods on resource `InvoiceRenderingTemplate`
* Add support for `required` on `Checkout.Session.tax_id_collection`, `PaymentLink.tax_id_collection`, `PaymentLinkCreateParams.tax_id_collection`, `PaymentLinkUpdateParams.tax_id_collection`, and `checkout.SessionCreateParams.tax_id_collection`
* Add support for `template` on `Customer.invoice_settings.rendering_options`, `CustomerCreateParams.invoice_settings.rendering_options`, `CustomerUpdateParams.invoice_settings.rendering_options`, `Invoice.rendering`, `InvoiceCreateParams.rendering`, and `InvoiceUpdateParams.rendering`
* Add support for `template_version` on `Invoice.rendering`, `InvoiceCreateParams.rendering`, and `InvoiceUpdateParams.rendering`

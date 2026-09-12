---
title: Update generated code
pr_url: https://github.com/stripe/stripe-java/pull/819
released_in_version: 10.13.0
---

* Add support for `payment_method_details[card][moto]` on `Charge`
* Add support for `statement_descriptor_suffix` on `Charge` and `PaymentIntent`
* Add support `subscription_data[application_fee_percent]` on Checkout `Session`
* Rename `uk_credit_transfer` to `gbp_credit_transfer` on Source. This is technically a breaking change, but we've chosen to release this as a minor version as the previous name was virtually unused.

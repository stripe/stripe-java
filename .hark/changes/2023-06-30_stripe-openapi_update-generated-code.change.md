---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1598
is_stripe_api_change: true
released_in_version: 22.26.0-beta.1
---

* Add support for `metadata` on `Invoice.subscription_details`
* Add support for new values `ad_nrt`, `ar_cuit`, `bo_tin`, `cn_tin`, `co_nit`, `cr_tin`, `do_rcn`, `ec_ruc`, `pe_ruc`, `rs_pib`, `sv_nit`, `uy_ruc`, `ve_rif`, and `vn_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`

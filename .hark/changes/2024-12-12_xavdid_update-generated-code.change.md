---
title: Update generated code for beta
pr_link: https://github.com/stripe/stripe-java/pull/1929
is_stripe_api_change: true
released_in_version: 28.2.0-beta.4
---

* Add support for `allow_redisplay` on `Card` and `Source`
* Add support for new values `am_tin`, `ao_tin`, `ba_tin`, `bb_tin`, `bs_tin`, `cd_nif`, `gn_nif`, `kh_tin`, `me_pib`, `mk_vat`, `mr_nif`, `np_pan`, `sn_ninea`, `sr_fin`, `tj_tin`, `ug_tin`, `zm_tin`, and `zw_tin` on enums `OrderCreateParams.tax_details.tax_ids[].type` and `OrderUpdateParams.tax_details.tax_ids[].type`
* Remove support for `amount_refunded` on `PaymentRecord`
* Add support for `account` on `Terminal.Reader.action.collect_payment_method`, `Terminal.Reader.action.confirm_payment_intent`, `Terminal.Reader.action.process_payment_intent`, and `Terminal.Reader.action.refund_payment`

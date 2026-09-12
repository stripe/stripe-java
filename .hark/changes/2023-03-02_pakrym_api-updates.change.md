---
title: API Updates
pr_url: https://github.com/stripe/stripe-java/pull/1520
is_stripe_api_change: true
released_in_version: 22.11.0
---

* Add support for new values `electric_vehicle_charging`, `emergency_services_gcas_visa_use_only`, `government_licensed_horse_dog_racing_us_region_only`, `government_licensed_online_casions_online_gambling_us_region_only`, `government_owned_lotteries_non_us_region`, `government_owned_lotteries_us_region_only`, and `marketplaces` on enums `issuing.CardCreateParams.spending_controls.allowed_categories[]`, `issuing.CardCreateParams.spending_controls.blocked_categories[]`, `issuing.CardCreateParams.spending_controls.spending_limits[].categories[]`, `issuing.CardUpdateParams.spending_controls.allowed_categories[]`, `issuing.CardUpdateParams.spending_controls.blocked_categories[]`, `issuing.CardUpdateParams.spending_controls.spending_limits[].categories[]`, `issuing.CardholderCreateParams.spending_controls.allowed_categories[]`, `issuing.CardholderCreateParams.spending_controls.blocked_categories[]`, `issuing.CardholderCreateParams.spending_controls.spending_limits[].categories[]`, `issuing.CardholderUpdateParams.spending_controls.allowed_categories[]`, `issuing.CardholderUpdateParams.spending_controls.blocked_categories[]`, and `issuing.CardholderUpdateParams.spending_controls.spending_limits[].categories[]`
* Add support for `reconciliation_status` on `Payout`
* Add support for new value `lease_tax` on enums `TaxRateCreateParams.tax_type` and `TaxRateUpdateParams.tax_type`

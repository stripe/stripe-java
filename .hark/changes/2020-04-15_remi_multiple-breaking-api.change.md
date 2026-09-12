---
title: "Multiple breaking API changes while removing deprecated Issuing features:"
pr_url: https://github.com/stripe/stripe-java/pull/1009
released_in_version: 19.0.0
---

* Moved `SettingsBranding` on `Account` is now `Branding` inside the `Settings` on `Account`
* Removed `percentage` filter from the List `TaxRate` API
* Remove `country` and `routing_number` from `payment_method_details.acss_debit` on `Charge` as this is going to be reworked
* Moved `transfer_data` on `Subscription` to its own class separate from the one on `Invoice`
* Removing all deprecated features on Issuing:
  * Remove `renewal_interval` on `SubscriptionSchedule` which was deprecated
  * Remove `email` on `Token` as this was only supported for an internal product
  * Removed deprecated properties and parameters on Issuing `Authorization` that have been renamed or replaced:
    * `authorized_amount`, `authorized_currency`, `held_amount`, `held_currency`, `is_held_amount_controllable`, `pending_authorized_amount`, `pending_held_amount`, `wallet_provider`
    * Removed `url` inside `merchant_data`
    * Removed `address_zip_check`, `authentication` and `three_d_secure` inside `verification_data`
    * Removed `authorized_amount`, `authorized_currency`, `held_amount`, `held_currency`, `violated_authorization_controls` from `pending_request`
  * Removed deprecated properties and parameters on Issuing `Card`:
    * Removed `authorization_controls`, `name`, `pin` and `speed`
    * Renamed the inner class from `AuthorizationControls` to `SpendingControls`
    * Moved `SpendingLimit` as an inner class inside `SpendingControls`.
    * Moved `MerchantData` from being its own class to being an inner class inside `Authorization`
    * Removed the `details()` API method
  * Removed `CardDetails` API resource
  * Removed deprecated properties and parameters on Issuing `Cardholder`:
    * Removed `authorization_controls`, `is_default`
    * Removed `name` inside `billing`
    * Renamed the inner class from `AuthorizationControls` to `SpendingControls`
    * Moved `MerchantData` from being its own class to being an inner class inside `Authorization`
    * Moved `SpendingLimit` as an inner class inside `SpendingControls`
    * Removed the `details()` API method
  * Clean up the `Dispute` resource and APIs to remove most features as this is still in beta and not yet stable
  * Removed `issuing_dispute.*` and `issuing_settlement.*` events as those are not public yet
  * Removed deprecated properties and parameters on Issuing `Transaction`:
    * Removed `dispute`
    * Reference `merchant_data` from the inner class in `Authorization`
    * Removed enum values for `type` to only have `capture` and `refund`

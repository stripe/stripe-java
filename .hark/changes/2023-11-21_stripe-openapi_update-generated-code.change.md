---
title: Update generated code
pr_link: https://github.com/stripe/stripe-java/pull/1690
is_stripe_api_change: true
released_in_version: 24.4.0
---

* Add support for `offline` on `Charge.payment_method_details.card_present`
* Add support for `system_trace_audit_number` on `Issuing.Authorization.network_data`
* Add support for `transaction_id` on `Issuing.Authorization.network_data` and `Issuing.Transaction.network_data`
* Add support for `network_risk_score` on `Issuing.Authorization.pending_request` and `Issuing.Authorization.request_history[]`
* Add support for `requested_at` on `Issuing.Authorization.request_history[]`
* Add support for `authorization_code` on `Issuing.Transaction.network_data`

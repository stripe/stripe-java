---
title: Prefix request ID to the error message as `[req_xxx]` if a request ID exists
---

`StripeException.getMessage()` now starts with `[req_xxx]` instead of ending with `; request-id: req_xxx`.

---
title: "All requests that involve passing the apiKey directly to the method are now deprecated in favor of using RequestOptions instead. Use RequestOptions as follows:"
section: Deprecation
released_in_version: 1.22.0
---

RequestOptions.builder().setApiKey(apiKey).build()

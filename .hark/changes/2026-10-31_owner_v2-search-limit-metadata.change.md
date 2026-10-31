---
title: Keep custom search limits in the request body and use dedicated v2 search helpers
semver_level: patch
---

Handwritten v2 search services should call `ApiService.requestV2Search` to send `limit` in the initial URL query. Ordinary `ApiRequest` construction no longer infers search behavior from the path.

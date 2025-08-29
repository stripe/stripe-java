package com.stripe.net;

public enum ApiMode {
  V1,
  V2;

  public static ApiMode getMode(String url) {
    if (url.startsWith("/v2")) {
      return ApiMode.V2;
    }

    // some urls, like `/oauth`, don't start with `/v1`. So just assume anything without `/v2` is
    // v1.
    return ApiMode.V1;
  }
}

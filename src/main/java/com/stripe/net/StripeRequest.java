package com.stripe.net;

import java.util.Map;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
public class StripeRequest {
  ApiResource.RequestType type;

  ApiResource.RequestMethod method;

  String url;

  Map<String, Object> params;

  RequestOptions options;

  public StripeRequest(
      ApiResource.RequestType type,
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      RequestOptions options) {
    this.type = type;
    this.method = method;
    this.url = url;
    this.params = params;
    this.options = (options != null) ? options : RequestOptions.getDefault();
  }
}

package com.stripe.net;

import java.util.Map;
import lombok.Getter;

@Getter
public class ApiRequest extends BaseApiRequest {
  private Map<String, Object> params;

  public ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode) {
    super(baseAddress, method, path, options, apiMode);
    this.params = params;
  }
}

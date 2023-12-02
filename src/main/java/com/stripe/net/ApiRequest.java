package com.stripe.net;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ApiRequest {
  private BaseAddress baseAddress;
  private ApiResource.RequestMethod method;
  private String path;
  private Map<String, Object> params;
  private RequestOptions options;
  private ApiMode apiMode;

  @Setter private List<String> usage;

  public ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode) {
    this.baseAddress = baseAddress;
    this.method = method;
    this.path = path;
    this.params = params;
    this.options = options;
    this.apiMode = apiMode;
  }
}

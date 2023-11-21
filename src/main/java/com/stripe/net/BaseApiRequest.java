package com.stripe.net;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
class BaseApiRequest {
  private BaseAddress baseAddress;
  private ApiResource.RequestMethod method;
  private String path;
  private RequestOptions options;
  private ApiMode apiMode;

  @Setter private List<String> usage;

  /** Internal method. Adds a record of a tracked behavior identified by "used" to the request. */
  public void addUsage(String used) {
    this.usage.add(used);
  }

  public BaseApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      RequestOptions options,
      ApiMode apiMode) {
    this.baseAddress = baseAddress;
    this.method = method;
    this.path = path;
    this.options = options;
    this.apiMode = apiMode;
  }
}

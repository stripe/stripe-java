package com.stripe.net;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ApiRequest extends BaseApiRequest {
  private Map<String, Object> params;

  private ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      RequestOptions options,
      ApiMode apiMode,
      List<String> usage,
      Map<String, Object> params) {
    super(baseAddress, method, path, options, apiMode, usage);
    this.params = params;
  }

  public ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode) {
    this(baseAddress, method, path, options, apiMode, null, params);
  }

  public ApiRequest withAddedUsage(String usage) {
    List<String> newUsage = new ArrayList<>();
    if (this.getUsage() != null) {
      newUsage.addAll(this.getUsage());
    }
    newUsage.add(usage);
    return new ApiRequest(
        this.getBaseAddress(),
        this.getMethod(),
        this.getPath(),
        this.getOptions(),
        this.getApiMode(),
        newUsage,
        this.getParams());
  }
}

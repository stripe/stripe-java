package com.stripe.net;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ApiRequest extends BaseApiRequest {
  private Map<String, Object> params;
  private final ApiMode apiMode;

  private ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      RequestOptions options,
      List<String> usage,
      Map<String, Object> params) {
    super(baseAddress, method, path, options, usage);
    this.params = params;
    this.apiMode = ApiMode.V1;
  }

  /**
   * [Deprecated] This constructor that takes apiMode is here for backwards compatibility and
   * will be removed by Sept 30, 2024.
   */
  public ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode) {
    this(baseAddress, method, path, options, null, params);
  }

  public ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options) {
    this(baseAddress, method, path, options, null, params);
  }

  public ApiRequest addUsage(String usage) {
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
        newUsage,
        this.getParams());
  }
}

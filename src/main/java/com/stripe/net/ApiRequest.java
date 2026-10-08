package com.stripe.net;

import java.util.ArrayList;
import java.util.HashMap;
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
    this.apiMode = ApiMode.getMode(path);
  }

  public ApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options) {
    this(
        baseAddress,
        method,
        v2SearchPath(method, path, params),
        options,
        null,
        v2SearchParams(method, path, params));
  }

  private static boolean isV2Search(ApiResource.RequestMethod method, String path) {
    return method == ApiResource.RequestMethod.POST
        && path.split("\\?", 2)[0].startsWith("/v2/")
        && path.split("\\?", 2)[0].endsWith("/search");
  }

  private static String v2SearchPath(
      ApiResource.RequestMethod method, String path, Map<String, Object> params) {
    if (!isV2Search(method, path) || params == null || !params.containsKey("limit")) {
      return path;
    }
    String separator = path.contains("?") ? "&" : "?";
    return path + separator + "limit=" + String.valueOf(params.get("limit"));
  }

  private static Map<String, Object> v2SearchParams(
      ApiResource.RequestMethod method, String path, Map<String, Object> params) {
    if (!isV2Search(method, path) || params == null || !params.containsKey("limit")) {
      return params;
    }
    Map<String, Object> bodyParams = new HashMap<>(params);
    bodyParams.remove("limit");
    return bodyParams;
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

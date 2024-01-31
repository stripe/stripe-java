package com.stripe.net;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class RawApiRequest extends BaseApiRequest {
  @Getter(onMethod_ = {@Override})
  private RawRequestOptions options;

  @Getter private String rawContent;

  private RawApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      RawRequestOptions options,
      ApiMode apiMode,
      List<String> usage,
      String rawContent) {
    super(baseAddress, method, path, options, apiMode, usage);
    this.rawContent = rawContent;
    this.options = options;
  }

  public RawApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      String rawContent,
      RawRequestOptions options,
      ApiMode apiMode) {
    this(baseAddress, method, path, options, apiMode, null, rawContent);
  }

  public RawApiRequest addUsage(String usage) {
    List<String> newUsage = new ArrayList<>();
    if (this.getUsage() != null) {
      newUsage.addAll(this.getUsage());
    }
    newUsage.add(usage);
    return new RawApiRequest(
        this.getBaseAddress(),
        this.getMethod(),
        this.getPath(),
        this.getOptions(),
        this.getApiMode(),
        newUsage,
        this.getRawContent());
  }
}

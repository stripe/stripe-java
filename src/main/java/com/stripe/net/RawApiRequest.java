package com.stripe.net;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class RawApiRequest extends BaseApiRequest {
  @Getter(onMethod_ = {@Override})
  private RawRequestOptions options;

  @Getter private String rawContent;

  @Getter private final ApiMode apiMode;

  private RawApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      RawRequestOptions options,
      List<String> usage,
      String rawContent) {
    super(baseAddress, method, path, options, usage);
    this.rawContent = rawContent;
    this.options = options;
    this.apiMode = ApiMode.getMode(path);
  }

  public RawApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      String rawContent,
      RawRequestOptions options) {
    this(baseAddress, method, path, options, null, rawContent);
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
        newUsage,
        this.getRawContent());
  }
}

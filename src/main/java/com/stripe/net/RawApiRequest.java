package com.stripe.net;

import lombok.Getter;

public class RawApiRequest extends BaseApiRequest {

  @Getter(onMethod_ = {@Override})
  private RawRequestOptions options;

  @Getter private String rawContent;

  public RawApiRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      String rawContent,
      RawRequestOptions options,
      ApiMode apiMode) {
    super(baseAddress, method, path, options, apiMode, null);
    this.rawContent = rawContent;
    this.options = options;
  }
}

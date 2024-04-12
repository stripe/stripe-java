package com.stripe.net;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
class BaseApiRequest {
  private final BaseAddress baseAddress;
  private final ApiResource.RequestMethod method;
  private final String path;
  private final RequestOptions options;
  private final ApiMode apiMode;

  private final List<String> usage;
}

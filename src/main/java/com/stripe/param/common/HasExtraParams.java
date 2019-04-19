package com.stripe.param.common;

import java.util.Map;

public interface HasExtraParams {

  default void putExtraParam(String key, String value) {
    getExtraParam().put(key, value);
  }

  Map<String, String> getExtraParam();
}

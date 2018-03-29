package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeHeaders {

  Map<String, List<String>> headers;

  public StripeHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }

  /**
   * Returns the first header value for a given key
   * @param name The name of the header key
   * @return the first value for the given key
   */
  public String get(String name) {
    List<String> valuesList = values(name);
    String value = null;
    if (valuesList != null && valuesList.size() > 0) {
      value = valuesList.get(0);
    }
    return value;
  }

  public List<String> values(String name) {
    return headers == null ? null : headers.get(name);
  }

}

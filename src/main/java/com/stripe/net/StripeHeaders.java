package com.stripe.net;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StripeHeaders {

  Map<String, List<String>> headers = new HashMap<String, List<String>>();

  /** Constructs a collection of headers from the given map. */
  public StripeHeaders(Map<String, List<String>> headers) {
    // Downcase all header names so that we can easily and efficiently perform
    // case-insensitive lookups.
    //
    // This is a general convenience feature, but is particularly important for
    // HTTP/2 where header names are downcased and looking up something like
    // `Request-Id` would not otherwise work.
    for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
      String key = entry.getKey() != null ? entry.getKey().toLowerCase() : null;
      if (this.headers.containsKey(key)) {
        throw new IllegalArgumentException(
            String.format(
                "Header map contained key `%s` multiple times with varying casing",
                entry.getKey()));
      }

      this.headers.put(key, entry.getValue());
    }
  }

  /**
   * Returns the first header value for a given key.
   *
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
    return headers == null ? null : headers.get(name.toLowerCase());
  }
}

package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObjectInterface;
import com.stripe.net.ApiResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

/** A page of API v2 search results. */
public class StripeSearchResult<T extends StripeObjectInterface> extends StripeCollection<T> {
  @Getter
  @SerializedName("total_count")
  Long totalCount;

  @Getter private transient Map<String, Object> requestParams = new HashMap<>();

  public void setRequestParams(Map<String, Object> requestParams) {
    this.requestParams = copyMap(requestParams);
  }

  @Override
  protected ApiResource.RequestMethod paginationMethod() {
    return ApiResource.RequestMethod.POST;
  }

  @Override
  protected HashMap<String, Object> paginationParams() {
    return new HashMap<>(this.requestParams);
  }

  private static Map<String, Object> copyMap(Map<String, Object> source) {
    Map<String, Object> copy = new HashMap<>();
    for (Map.Entry<String, Object> entry : source.entrySet()) {
      copy.put(entry.getKey(), copyValue(entry.getValue()));
    }
    return copy;
  }

  private static Object copyValue(Object value) {
    if (value instanceof Map<?, ?>) {
      Map<String, Object> copy = new HashMap<>();
      for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
        copy.put(String.valueOf(entry.getKey()), copyValue(entry.getValue()));
      }
      return copy;
    }
    if (value instanceof List<?>) {
      List<Object> copy = new ArrayList<>();
      for (Object item : (List<?>) value) {
        copy.add(copyValue(item));
      }
      return copy;
    }
    return value;
  }
}

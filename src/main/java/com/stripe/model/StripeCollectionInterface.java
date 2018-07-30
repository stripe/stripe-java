package com.stripe.model;

import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public interface StripeCollectionInterface<T> {
  List<T> getData();

  Boolean getHasMore();

  Long getTotalCount();

  String getUrl();

  /**
   * Get request options that were used to fetch the collection. This is
   * useful for purposes of pagination.
   */
  RequestOptions getRequestOptions();

  /**
   * Get request parameters that were used to fetch the collection. This is
   * useful for purposes of pagination.
   */
  Map<String, Object> getRequestParams();

  /**
   * Set request options that were used to fetch the collection. This is
   * required for purposes of pagination.
   */
  void setRequestOptions(RequestOptions requestOptions);

  /**
   * Set request parameters that were used to fetch the collection. This is
   * required for purposes of pagination.
   */
  void setRequestParams(Map<String, Object> requestParams);
}

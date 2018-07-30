package com.stripe.model;

import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

/**
 * Provides a representation of a single page worth of data from the Stripe
 * API.
 *
 * <p>The following code will have the effect of iterating through a single page
 * worth of invoice data retrieve from the API:
 *
 * <p><pre>
 * {@code
 * foreach (Invoice invoice : Invoice.list(...).getData()) {
 *   System.out.println("Current invoice = " + invoice.toString());
 * }
 * }
 * </pre>
 *
 * <p>The class also provides a helper for iterating over collections that may be
 * longer than a single page:
 *
 * <p><pre>
 * {@code
 * foreach (Invoice invoice : Invoice.list(...).autoPagingIterable()) {
 *   System.out.println("Current invoice = " + invoice.toString());
 * }
 * }
 * </pre>
 */
public abstract class StripeCollection<T extends HasId> extends StripeObject
    implements StripeCollectionInterface<T> {
  List<T> data;
  Long totalCount;
  Boolean hasMore;
  private RequestOptions requestOptions;
  private Map<String, Object> requestParams;
  String url;

  /**
   * 3/2014: Legacy (from before newstyle pagination API).
   */
  Long count;

  @Override
  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

  @Override
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  @Override
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * 3/2014: Legacy (from before newstyle pagination API).
   */
  public Long getCount() {
    return count;
  }

  /**
   * 3/2014: Legacy (from before newstyle pagination API).
   */
  public void setCount(Long count) {
    this.count = count;
  }

  public Iterable<T> autoPagingIterable() {
    return new PagingIterable<T>(this);
  }

  public Iterable<T> autoPagingIterable(Map<String, Object> params) {
    this.setRequestParams(params);
    return new PagingIterable<T>(this);
  }

  /**
   * Constructs an iterable that can be used to iterate across all objects
   * across all pages. As page boundaries are encountered, the next page will
   * be fetched automatically for continued iteration.
   *
   * @param params request parameters (will override the parameters from the initial list request)
   * @param options request options (will override the options from the initial list request)
   */
  public Iterable<T> autoPagingIterable(Map<String, Object> params, RequestOptions options) {
    this.setRequestOptions(options);
    this.setRequestParams(params);
    return new PagingIterable<T>(this);
  }

  @Override
  public RequestOptions getRequestOptions() {
    return this.requestOptions;
  }

  @Override
  public Map<String, Object> getRequestParams() {
    return this.requestParams;
  }

  @Override
  public void setRequestOptions(RequestOptions requestOptions) {
    this.requestOptions = requestOptions;
  }

  @Override
  public void setRequestParams(Map<String, Object> requestParams) {
    this.requestParams = requestParams;
  }
}

package com.stripe.model;

import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Provides a representation of a single page worth of data from the Stripe API.
 *
 * <p>The following code will have the effect of iterating through a single page worth of invoice
 * data retrieve from the API:
 *
 * <p>
 *
 * <pre>{@code
 * foreach (Invoice invoice : Invoice.list(...).getData()) {
 *   System.out.println("Current invoice = " + invoice.toString());
 * }
 * }</pre>
 *
 * <p>The class also provides a helper for iterating over collections that may be longer than a
 * single page:
 *
 * <p>
 *
 * <pre>{@code
 * foreach (Invoice invoice : Invoice.list(...).autoPagingIterable()) {
 *   System.out.println("Current invoice = " + invoice.toString());
 * }
 * }</pre>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public abstract class StripeCollection<T extends HasId> extends StripeObject
    implements StripeCollectionInterface<T> {
  String object;

  @Getter(onMethod_ = {@Override})
  List<T> data;

  @Getter(onMethod_ = {@Override})
  Boolean hasMore;

  @Getter(onMethod_ = {@Override})
  String url;

  @Getter(onMethod_ = {@Override})
  @Setter(onMethod = @__({@Override}))
  private transient RequestOptions requestOptions;

  @Getter(onMethod_ = {@Override})
  @Setter(onMethod = @__({@Override}))
  private Map<String, Object> requestParams;

  public Iterable<T> autoPagingIterable() {
    return new PagingIterable<>(this);
  }

  public Iterable<T> autoPagingIterable(Map<String, Object> params) {
    this.setRequestParams(params);
    return new PagingIterable<>(this);
  }

  /**
   * Constructs an iterable that can be used to iterate across all objects across all pages. As page
   * boundaries are encountered, the next page will be fetched automatically for continued
   * iteration.
   *
   * @param params request parameters (will override the parameters from the initial list request)
   * @param options request options (will override the options from the initial list request)
   */
  public Iterable<T> autoPagingIterable(Map<String, Object> params, RequestOptions options) {
    this.setRequestOptions(options);
    this.setRequestParams(params);
    return new PagingIterable<>(this);
  }
}

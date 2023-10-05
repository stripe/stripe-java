package com.stripe.model;

import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Provides a representation of a single page worth of data from a Stripe API search method. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeSearchResult<T> extends StripeObject
    implements StripeSearchResultInterface<T>, StripeActiveObject {
  private transient StripeResponseGetter responseGetter;
  String object;

  @Getter(onMethod_ = {@Override})
  List<T> data;

  /**
   * Get the total count of search records in the result. The value is present when `total_count` is
   * added to the `expand` search parameter.
   */
  @Getter(onMethod_ = {@Override})
  Long totalCount;

  @Getter(onMethod_ = {@Override})
  Boolean hasMore;

  @Getter(onMethod_ = {@Override})
  String url;

  @Getter(onMethod_ = {@Override})
  String nextPage;

  @Getter(onMethod_ = {@Override})
  @Setter(onMethod = @__({@Override}))
  private transient RequestOptions requestOptions;

  @Getter(onMethod_ = {@Override})
  @Setter(onMethod = @__({@Override}))
  private Map<String, Object> requestParams;

  @Setter(onMethod = @__({@Override}))
  @Getter(onMethod = @__({@Override}))
  private transient Type pageTypeToken;

  public Iterable<T> autoPagingIterable() {
    this.responseGetter.validateRequestOptions(this.requestOptions);
    return new SearchPagingIterable<>(this, responseGetter, pageTypeToken);
  }

  public Iterable<T> autoPagingIterable(Map<String, Object> params) {
    this.responseGetter.validateRequestOptions(this.requestOptions);
    this.setRequestParams(params);
    return new SearchPagingIterable<>(this, responseGetter, pageTypeToken);
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
    this.responseGetter.validateRequestOptions(options);
    this.setRequestOptions(options);
    this.setRequestParams(params);
    return new SearchPagingIterable<>(this, responseGetter, pageTypeToken);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;

    if (this.data != null) {
      for (T item : data) {
        trySetResponseGetter(item, responseGetter);
      }
    }
  }
}

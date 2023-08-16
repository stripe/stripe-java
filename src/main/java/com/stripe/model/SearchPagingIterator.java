package com.stripe.model;

import com.stripe.net.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class SearchPagingIterator<T> extends ApiResource implements Iterator<T> {
  private final String url;

  @SuppressWarnings("rawtypes")
  private final Class<? extends StripeSearchResultInterface> collectionType;

  private StripeSearchResultInterface<T> currentSearchResult;
  private Iterator<T> currentDataIterator;

  private String nextPage;

  SearchPagingIterator(
      final StripeSearchResultInterface<T> stripeSearchResult,
      StripeResponseGetter responseGetter) {
    this.url = stripeSearchResult.getUrl();
    this.nextPage = stripeSearchResult.getNextPage();

    this.collectionType = stripeSearchResult.getClass();

    this.currentSearchResult = stripeSearchResult;
    this.currentDataIterator = stripeSearchResult.getData().iterator();
    setResponseGetter(responseGetter);
  }

  @Override
  public boolean hasNext() {
    return currentDataIterator.hasNext() || currentSearchResult.getHasMore();
  }

  @Override
  public T next() {
    // if we've run out of data on the current page, try to fetch another
    // one
    if (!currentDataIterator.hasNext() && currentSearchResult.getHasMore()) {
      try {
        Map<String, Object> params = new HashMap<>();

        // copy all the parameters from the initial request
        Map<String, Object> initialParams = currentSearchResult.getRequestParams();
        if (initialParams != null) {
          params.putAll(initialParams);
        }

        // then put our new page start in
        params.put("page", this.nextPage);

        this.currentSearchResult = search(params, currentSearchResult.getRequestOptions());
        this.nextPage = this.currentSearchResult.getNextPage();

        this.currentDataIterator = currentSearchResult.getData().iterator();
      } catch (final Exception e) {
        throw new RuntimeException("Unable to lazy-load stripe objects", e);
      }
    }

    if (currentDataIterator.hasNext()) {
      final T next = currentDataIterator.next();
      return next;
    }

    throw new NoSuchElementException();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  @SuppressWarnings("unchecked")
  private StripeSearchResultInterface<T> search(
      final Map<String, Object> params, final RequestOptions options) throws Exception {
    return getResponseGetter()
        .request(
            BaseAddress.API, RequestMethod.GET, url, params, collectionType, options, ApiMode.V1);
  }
}

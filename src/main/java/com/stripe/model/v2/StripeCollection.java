package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeActiveObject;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeObjectInterface;
import com.stripe.net.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

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
@EqualsAndHashCode(callSuper = false)
public class StripeCollection<T extends StripeObjectInterface> extends StripeObject
    implements StripeActiveObject {
  private transient StripeResponseGetter responseGetter;

  private transient ApiRequest lastApiRequest;
  private transient Type lastRequestTypeToken;

  public void setLastRequest(ApiRequest apiRequest, Type typeToken) {
    this.lastApiRequest = apiRequest;
    this.lastRequestTypeToken = typeToken;
  }

  @Getter
  @SerializedName("data")
  List<T> data;

  @Getter
  @SerializedName("next_page")
  String nextPage;

  @Getter
  @SerializedName("previous_page")
  String previousPage;

  private static class Page<T> {
    List<T> data;
    String nextPage;

    Page(List<T> data, String nextPage) {
      this.data = data;
      this.nextPage = nextPage;
    }
  }

  private class PagingIterable implements Iterable<T> {
    Map<String, Object> params;
    RequestOptions options;

    public PagingIterable() {
      this.params = StripeCollection.this.lastApiRequest.getParams();
      this.options = StripeCollection.this.lastApiRequest.getOptions();
    }

    public PagingIterable(Map<String, Object> params) {
      this.params = params;
      this.options = StripeCollection.this.lastApiRequest.getOptions();
    }

    public PagingIterable(Map<String, Object> params, RequestOptions options) {
      this.params = params;
      this.options = options;
    }

    private Page<T> getPage(String nextPage) throws StripeException {
      // Strip query params
      final Map<String, Object> params = new HashMap<>();
      if (this.params != null) {
        params.putAll(this.params);
      }
      params.put("page", nextPage);
      StripeCollection<T> response =
          StripeCollection.this.responseGetter.request(
              new ApiRequest(
                  StripeCollection.this.lastApiRequest.getBaseAddress(),
                  StripeCollection.this.lastApiRequest.getMethod(),
                  StripeCollection.this.lastApiRequest.getPath(),
                  params,
                  this.options),
              StripeCollection.this.lastRequestTypeToken);
      return new Page<T>(response.getData(), response.getNextPage());
    }

    @Override
    public Iterator<T> iterator() {
      return new PagingIterator(StripeCollection.this.data, StripeCollection.this.nextPage);
    }

    private class PagingIterator implements Iterator<T> {
      Iterator<T> currentDataIterator;
      String nextPage;

      public PagingIterator(List<T> currentPage, String nextPage) {
        this.currentDataIterator = currentPage.iterator();
        this.nextPage = nextPage;
      }

      @Override
      public T next() {
        if (!currentDataIterator.hasNext() && this.nextPage != null) {
          try {
            Page<T> p = PagingIterable.this.getPage(this.nextPage);
            this.currentDataIterator = p.data.iterator();
            this.nextPage = p.nextPage;
          } catch (final Exception e) {
            throw new RuntimeException("Unable to paginate", e);
          }
        }
        return this.currentDataIterator.next();
      }

      @Override
      public boolean hasNext() {
        return this.currentDataIterator.hasNext() || this.nextPage != null;
      }
    }
  }

  public Iterable<T> autoPagingIterable() {
    return new PagingIterable();
  }

  public Iterable<T> autoPagingIterable(Map<String, Object> params) {
    return new PagingIterable(params);
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
    return new PagingIterable(params, options);
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

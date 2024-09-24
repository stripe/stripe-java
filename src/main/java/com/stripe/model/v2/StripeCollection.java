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
@EqualsAndHashCode(callSuper = false)
public class StripeCollection<T extends StripeObjectInterface> extends StripeObject
    implements StripeActiveObject {
  private transient StripeResponseGetter responseGetter;

  @Setter private transient Type pageTypeToken;

  @Getter
  @SerializedName("data")
  List<T> data;

  @Getter
  @SerializedName("next_page_url")
  String nextPageUrl;

  @Getter
  @SerializedName("previous_page_url")
  String previousPageUrl;

  @Getter @Setter private transient RequestOptions requestOptions;

  private static class Page<T> {
    List<T> data;
    String nextPageUrl;

    Page(List<T> data, String nextPageUrl) {
      this.data = data;
      this.nextPageUrl = nextPageUrl;
    }
  }

  /**
   * An Iterable implementation that starts from the StripeCollection data and will fetch next pages
   * automatically.
   */
  private class PagingIterable implements Iterable<T> {
    RequestOptions options;

    public PagingIterable() {
      this.options = StripeCollection.this.getRequestOptions();
    }

    public PagingIterable(RequestOptions options) {
      this.options = options;
    }

    private Page<T> getPage(String nextPageUrl) throws StripeException {
      if (nextPageUrl == null) {
        throw new IllegalArgumentException("nextPageUrl cannot be null");
      }

      StripeCollection<T> response =
          StripeCollection.this.responseGetter.request(
              new ApiRequest(
                  BaseAddress.API,
                  ApiResource.RequestMethod.GET,
                  nextPageUrl,
                  new HashMap<>(),
                  this.options),
              StripeCollection.this.pageTypeToken);
      return new Page<T>(response.getData(), response.getNextPageUrl());
    }

    @Override
    public Iterator<T> iterator() {
      return new PagingIterator(
          StripeCollection.this.getData(), StripeCollection.this.getNextPageUrl());
    }

    private class PagingIterator implements Iterator<T> {
      Iterator<T> currentDataIterator;
      String nextPageUrl;

      public PagingIterator(List<T> currentPage, String nextPageUrl) {
        this.currentDataIterator = currentPage.iterator();
        this.nextPageUrl = nextPageUrl;
      }

      @Override
      public T next() {
        if (!currentDataIterator.hasNext() && this.nextPageUrl != null) {
          try {
            Page<T> p = PagingIterable.this.getPage(this.nextPageUrl);
            this.currentDataIterator = p.data.iterator();
            this.nextPageUrl = p.nextPageUrl;
          } catch (final Exception e) {
            throw new RuntimeException("Unable to paginate", e);
          }
        }
        return this.currentDataIterator.next();
      }

      @Override
      public boolean hasNext() {
        return this.currentDataIterator.hasNext() || this.nextPageUrl != null;
      }
    }
  }

  /**
   * Constructs an iterable that can be used to iterate across all objects across all pages. As page
   * boundaries are encountered, the next page will be fetched automatically for continued
   * iteration.
   *
   * <p>This utilizes the options from the initial list request.
   */
  public Iterable<T> autoPagingIterable() {
    return new PagingIterable();
  }

  /**
   * Constructs an iterable that can be used to iterate across all objects across all pages. As page
   * boundaries are encountered, the next page will be fetched automatically for continued
   * iteration.
   *
   * @param options request options (will override the options from the initial list request)
   */
  public Iterable<T> autoPagingIterable(RequestOptions options) {
    return new PagingIterable(options);
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

// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.Reader;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ReaderPresentPaymentMethodParams;
import com.stripe.param.terminal.ReaderSucceedInputCollectionParams;
import com.stripe.param.terminal.ReaderTimeoutInputCollectionParams;

public final class ReaderService extends ApiService {
  public ReaderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(String reader, ReaderPresentPaymentMethodParams params)
      throws StripeException {
    return presentPaymentMethod(reader, params, (RequestOptions) null);
  }
  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(String reader, RequestOptions options) throws StripeException {
    return presentPaymentMethod(reader, (ReaderPresentPaymentMethodParams) null, options);
  }
  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(String reader) throws StripeException {
    return presentPaymentMethod(
        reader, (ReaderPresentPaymentMethodParams) null, (RequestOptions) null);
  }
  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(
      String reader, ReaderPresentPaymentMethodParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/terminal/readers/%s/present_payment_method",
            ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /** Use this endpoint to trigger a successful input collection on a simulated reader. */
  public Reader succeedInputCollection(String reader, ReaderSucceedInputCollectionParams params)
      throws StripeException {
    return succeedInputCollection(reader, params, (RequestOptions) null);
  }
  /** Use this endpoint to trigger a successful input collection on a simulated reader. */
  public Reader succeedInputCollection(String reader, RequestOptions options)
      throws StripeException {
    return succeedInputCollection(reader, (ReaderSucceedInputCollectionParams) null, options);
  }
  /** Use this endpoint to trigger a successful input collection on a simulated reader. */
  public Reader succeedInputCollection(String reader) throws StripeException {
    return succeedInputCollection(
        reader, (ReaderSucceedInputCollectionParams) null, (RequestOptions) null);
  }
  /** Use this endpoint to trigger a successful input collection on a simulated reader. */
  public Reader succeedInputCollection(
      String reader, ReaderSucceedInputCollectionParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/terminal/readers/%s/succeed_input_collection",
            ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Use this endpoint to complete an input collection with a timeout error on a simulated reader.
   */
  public Reader timeoutInputCollection(String reader, ReaderTimeoutInputCollectionParams params)
      throws StripeException {
    return timeoutInputCollection(reader, params, (RequestOptions) null);
  }
  /**
   * Use this endpoint to complete an input collection with a timeout error on a simulated reader.
   */
  public Reader timeoutInputCollection(String reader, RequestOptions options)
      throws StripeException {
    return timeoutInputCollection(reader, (ReaderTimeoutInputCollectionParams) null, options);
  }
  /**
   * Use this endpoint to complete an input collection with a timeout error on a simulated reader.
   */
  public Reader timeoutInputCollection(String reader) throws StripeException {
    return timeoutInputCollection(
        reader, (ReaderTimeoutInputCollectionParams) null, (RequestOptions) null);
  }
  /**
   * Use this endpoint to complete an input collection with a timeout error on a simulated reader.
   */
  public Reader timeoutInputCollection(
      String reader, ReaderTimeoutInputCollectionParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/terminal/readers/%s/timeout_input_collection",
            ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
}

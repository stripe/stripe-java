// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.terminal.Reader;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ReaderCancelActionParams;
import com.stripe.param.terminal.ReaderCreateParams;
import com.stripe.param.terminal.ReaderListParams;
import com.stripe.param.terminal.ReaderProcessPaymentIntentParams;
import com.stripe.param.terminal.ReaderProcessSetupIntentParams;
import com.stripe.param.terminal.ReaderRefundPaymentParams;
import com.stripe.param.terminal.ReaderRetrieveParams;
import com.stripe.param.terminal.ReaderSetReaderDisplayParams;
import com.stripe.param.terminal.ReaderUpdateParams;

public final class ReaderService extends ApiService {
  public ReaderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes a {@code Reader} object. */
  public Reader delete(String reader) throws StripeException {
    return delete(reader, (RequestOptions) null);
  }
  /** Deletes a {@code Reader} object. */
  public Reader delete(String reader, RequestOptions options) throws StripeException {
    String path = String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String reader, ReaderRetrieveParams params) throws StripeException {
    return retrieve(reader, params, (RequestOptions) null);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String reader, RequestOptions options) throws StripeException {
    return retrieve(reader, (ReaderRetrieveParams) null, options);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String reader) throws StripeException {
    return retrieve(reader, (ReaderRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String reader, ReaderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String reader, ReaderUpdateParams params) throws StripeException {
    return update(reader, params, (RequestOptions) null);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String reader, RequestOptions options) throws StripeException {
    return update(reader, (ReaderUpdateParams) null, options);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String reader) throws StripeException {
    return update(reader, (ReaderUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String reader, ReaderUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list(ReaderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list(RequestOptions options) throws StripeException {
    return list((ReaderListParams) null, options);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list() throws StripeException {
    return list((ReaderListParams) null, (RequestOptions) null);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list(ReaderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/readers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Reader>>() {}.getType());
  }
  /** Creates a new {@code Reader} object. */
  public Reader create(ReaderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code Reader} object. */
  public Reader create(ReaderCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/terminal/readers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Cancels the current reader action. */
  public Reader cancelAction(String reader, ReaderCancelActionParams params)
      throws StripeException {
    return cancelAction(reader, params, (RequestOptions) null);
  }
  /** Cancels the current reader action. */
  public Reader cancelAction(String reader, RequestOptions options) throws StripeException {
    return cancelAction(reader, (ReaderCancelActionParams) null, options);
  }
  /** Cancels the current reader action. */
  public Reader cancelAction(String reader) throws StripeException {
    return cancelAction(reader, (ReaderCancelActionParams) null, (RequestOptions) null);
  }
  /** Cancels the current reader action. */
  public Reader cancelAction(String reader, ReaderCancelActionParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/cancel_action", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(String reader, ReaderProcessPaymentIntentParams params)
      throws StripeException {
    return processPaymentIntent(reader, params, (RequestOptions) null);
  }
  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(
      String reader, ReaderProcessPaymentIntentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/process_payment_intent", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Initiates a setup intent flow on a Reader. */
  public Reader processSetupIntent(String reader, ReaderProcessSetupIntentParams params)
      throws StripeException {
    return processSetupIntent(reader, params, (RequestOptions) null);
  }
  /** Initiates a setup intent flow on a Reader. */
  public Reader processSetupIntent(
      String reader, ReaderProcessSetupIntentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/process_setup_intent", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Initiates a refund on a Reader. */
  public Reader refundPayment(String reader, ReaderRefundPaymentParams params)
      throws StripeException {
    return refundPayment(reader, params, (RequestOptions) null);
  }
  /** Initiates a refund on a Reader. */
  public Reader refundPayment(String reader, RequestOptions options) throws StripeException {
    return refundPayment(reader, (ReaderRefundPaymentParams) null, options);
  }
  /** Initiates a refund on a Reader. */
  public Reader refundPayment(String reader) throws StripeException {
    return refundPayment(reader, (ReaderRefundPaymentParams) null, (RequestOptions) null);
  }
  /** Initiates a refund on a Reader. */
  public Reader refundPayment(
      String reader, ReaderRefundPaymentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/refund_payment", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
  /** Sets reader display to show cart details. */
  public Reader setReaderDisplay(String reader, ReaderSetReaderDisplayParams params)
      throws StripeException {
    return setReaderDisplay(reader, params, (RequestOptions) null);
  }
  /** Sets reader display to show cart details. */
  public Reader setReaderDisplay(
      String reader, ReaderSetReaderDisplayParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/set_reader_display", ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request.addUsage("stripe_client");
    return getResponseGetter().request(request, Reader.class);
  }
}

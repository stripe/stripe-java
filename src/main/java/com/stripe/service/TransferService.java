// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.Transfer;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TransferCreateParams;
import com.stripe.param.TransferListParams;
import com.stripe.param.TransferRetrieveParams;
import com.stripe.param.TransferUpdateParams;

public final class TransferService extends ApiService {
  public TransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * To send funds from your Stripe account to a connected account, you create a new transfer
   * object. Your <a href="https://stripe.com/docs/api#balance">Stripe balance</a> must be able to
   * cover the transfer amount, or you’ll receive an “Insufficient Funds” error.
   */
  public Transfer create(TransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * To send funds from your Stripe account to a connected account, you create a new transfer
   * object. Your <a href="https://stripe.com/docs/api#balance">Stripe balance</a> must be able to
   * cover the transfer amount, or you’ll receive an “Insufficient Funds” error.
   */
  public Transfer create(TransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Transfer.class);
  }
  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public StripeCollection<Transfer> list(TransferListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public StripeCollection<Transfer> list(RequestOptions options) throws StripeException {
    return list((TransferListParams) null, options);
  }
  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public StripeCollection<Transfer> list() throws StripeException {
    return list((TransferListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public StripeCollection<Transfer> list(TransferListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Transfer>>() {}.getType());
  }
  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public Transfer retrieve(String transfer, TransferRetrieveParams params) throws StripeException {
    return retrieve(transfer, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public Transfer retrieve(String transfer, RequestOptions options) throws StripeException {
    return retrieve(transfer, (TransferRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public Transfer retrieve(String transfer) throws StripeException {
    return retrieve(transfer, (TransferRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public Transfer retrieve(String transfer, TransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/transfers/%s", ApiResource.urlEncodeId(transfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Transfer.class);
  }
  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  public Transfer update(String transfer, TransferUpdateParams params) throws StripeException {
    return update(transfer, params, (RequestOptions) null);
  }
  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  public Transfer update(String transfer, RequestOptions options) throws StripeException {
    return update(transfer, (TransferUpdateParams) null, options);
  }
  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  public Transfer update(String transfer) throws StripeException {
    return update(transfer, (TransferUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  public Transfer update(String transfer, TransferUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/transfers/%s", ApiResource.urlEncodeId(transfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Transfer.class);
  }

  public com.stripe.service.TransferReversalService reversals() {
    return new com.stripe.service.TransferReversalService(this.getResponseGetter());
  }
}

// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.TransferReversal;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TransferReversalCreateParams;
import com.stripe.param.TransferReversalListParams;
import com.stripe.param.TransferReversalRetrieveParams;
import com.stripe.param.TransferReversalUpdateParams;

public final class TransferReversalService extends ApiService {
  public TransferReversalService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public StripeCollection<TransferReversal> list(String id, TransferReversalListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public StripeCollection<TransferReversal> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (TransferReversalListParams) null, options);
  }
  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public StripeCollection<TransferReversal> list(String id) throws StripeException {
    return list(id, (TransferReversalListParams) null, (RequestOptions) null);
  }
  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public StripeCollection<TransferReversal> list(
      String id, TransferReversalListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/transfers/%s/reversals", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<TransferReversal>>() {}.getType());
  }
  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(String id, TransferReversalCreateParams params)
      throws StripeException {
    return create(id, params, (RequestOptions) null);
  }
  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(String id, RequestOptions options) throws StripeException {
    return create(id, (TransferReversalCreateParams) null, options);
  }
  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(String id) throws StripeException {
    return create(id, (TransferReversalCreateParams) null, (RequestOptions) null);
  }
  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(
      String id, TransferReversalCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/transfers/%s/reversals", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, TransferReversal.class);
  }
  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(
      String transfer, String id, TransferReversalRetrieveParams params) throws StripeException {
    return retrieve(transfer, id, params, (RequestOptions) null);
  }
  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(String transfer, String id, RequestOptions options)
      throws StripeException {
    return retrieve(transfer, id, (TransferReversalRetrieveParams) null, options);
  }
  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(String transfer, String id) throws StripeException {
    return retrieve(transfer, id, (TransferReversalRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(
      String transfer, String id, TransferReversalRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/transfers/%s/reversals/%s",
            ApiResource.urlEncodeId(transfer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, TransferReversal.class);
  }
  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  public TransferReversal update(String transfer, String id, TransferReversalUpdateParams params)
      throws StripeException {
    return update(transfer, id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  public TransferReversal update(String transfer, String id, RequestOptions options)
      throws StripeException {
    return update(transfer, id, (TransferReversalUpdateParams) null, options);
  }
  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  public TransferReversal update(String transfer, String id) throws StripeException {
    return update(transfer, id, (TransferReversalUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  public TransferReversal update(
      String transfer, String id, TransferReversalUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/transfers/%s/reversals/%s",
            ApiResource.urlEncodeId(transfer), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, TransferReversal.class);
  }
}

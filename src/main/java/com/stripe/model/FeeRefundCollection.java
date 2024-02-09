// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.FeeRefundCollectionCreateParams;
import com.stripe.param.FeeRefundCollectionListParams;
import com.stripe.param.FeeRefundCollectionRetrieveParams;
import java.util.Map;

public class FeeRefundCollection extends StripeCollection<FeeRefund> {
  /**
   * Refunds an application fee that has previously been collected but not yet refunded. Funds will
   * be refunded to the Stripe account from which the fee was originally collected.
   *
   * <p>You can optionally refund only part of an application fee. You can do so multiple times,
   * until the entire fee has been refunded.
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again. This method will raise
   * an error when called on an already-refunded application fee, or when trying to refund more
   * money than is left on an application fee.
   */
  public FeeRefund create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Refunds an application fee that has previously been collected but not yet refunded. Funds will
   * be refunded to the Stripe account from which the fee was originally collected.
   *
   * <p>You can optionally refund only part of an application fee. You can do so multiple times,
   * until the entire fee has been refunded.
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again. This method will raise
   * an error when called on an already-refunded application fee, or when trying to refund more
   * money than is left on an application fee.
   */
  public FeeRefund create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, FeeRefund.class);
  }

  /**
   * Refunds an application fee that has previously been collected but not yet refunded. Funds will
   * be refunded to the Stripe account from which the fee was originally collected.
   *
   * <p>You can optionally refund only part of an application fee. You can do so multiple times,
   * until the entire fee has been refunded.
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again. This method will raise
   * an error when called on an already-refunded application fee, or when trying to refund more
   * money than is left on an application fee.
   */
  public FeeRefund create(FeeRefundCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Refunds an application fee that has previously been collected but not yet refunded. Funds will
   * be refunded to the Stripe account from which the fee was originally collected.
   *
   * <p>You can optionally refund only part of an application fee. You can do so multiple times,
   * until the entire fee has been refunded.
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again. This method will raise
   * an error when called on an already-refunded application fee, or when trying to refund more
   * money than is left on an application fee.
   */
  public FeeRefund create(FeeRefundCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FeeRefund.class);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, FeeRefundCollection.class);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection list(FeeRefundCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific application fee. Note that the 10
   * most recent refunds are always available by default on the application fee object. If you need
   * more than those 10, you can use this API method and the {@code limit} and {@code
   * starting_after} parameters to page through additional refunds.
   */
  public FeeRefundCollection list(FeeRefundCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FeeRefundCollection.class);
  }

  /**
   * By default, you can see the 10 most recent refunds stored directly on the application fee
   * object, but you can also retrieve details about a specific refund stored on the application
   * fee.
   */
  public FeeRefund retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * By default, you can see the 10 most recent refunds stored directly on the application fee
   * object, but you can also retrieve details about a specific refund stored on the application
   * fee.
   */
  public FeeRefund retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * By default, you can see the 10 most recent refunds stored directly on the application fee
   * object, but you can also retrieve details about a specific refund stored on the application
   * fee.
   */
  public FeeRefund retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, FeeRefund.class);
  }

  /**
   * By default, you can see the 10 most recent refunds stored directly on the application fee
   * object, but you can also retrieve details about a specific refund stored on the application
   * fee.
   */
  public FeeRefund retrieve(
      String id, FeeRefundCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FeeRefund.class);
  }
}

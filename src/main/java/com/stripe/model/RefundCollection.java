// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.RefundCollectionListParams;
import com.stripe.param.RefundCollectionRetrieveParams;
import java.util.Map;

public class RefundCollection extends StripeCollection<Refund> {
  /**
   * You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent
   * refunds are always available by default on the charge object. If you need more than those 10,
   * you can use this API method and the {@code limit} and {@code starting_after} parameters to page
   * through additional refunds.
   */
  public RefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent
   * refunds are always available by default on the charge object. If you need more than those 10,
   * you can use this API method and the {@code limit} and {@code starting_after} parameters to page
   * through additional refunds.
   */
  public RefundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, RefundCollection.class);
  }

  /**
   * You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent
   * refunds are always available by default on the charge object. If you need more than those 10,
   * you can use this API method and the {@code limit} and {@code starting_after} parameters to page
   * through additional refunds.
   */
  public RefundCollection list(RefundCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent
   * refunds are always available by default on the charge object. If you need more than those 10,
   * you can use this API method and the {@code limit} and {@code starting_after} parameters to page
   * through additional refunds.
   */
  public RefundCollection list(RefundCollectionListParams params, RequestOptions options)
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
    return getResponseGetter().request(request, RefundCollection.class);
  }

  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Refund.class);
  }

  /** Retrieves the details of an existing refund. */
  public Refund retrieve(String id, RefundCollectionRetrieveParams params, RequestOptions options)
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
    return getResponseGetter().request(request, Refund.class);
  }
}

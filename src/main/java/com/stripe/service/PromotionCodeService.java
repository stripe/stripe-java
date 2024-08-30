// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PromotionCode;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PromotionCodeCreateParams;
import com.stripe.param.PromotionCodeListParams;
import com.stripe.param.PromotionCodeRetrieveParams;
import com.stripe.param.PromotionCodeUpdateParams;

public final class PromotionCodeService extends ApiService {
  public PromotionCodeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of your promotion codes. */
  public StripeCollection<PromotionCode> list(PromotionCodeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your promotion codes. */
  public StripeCollection<PromotionCode> list(RequestOptions options) throws StripeException {
    return list((PromotionCodeListParams) null, options);
  }
  /** Returns a list of your promotion codes. */
  public StripeCollection<PromotionCode> list() throws StripeException {
    return list((PromotionCodeListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your promotion codes. */
  public StripeCollection<PromotionCode> list(
      PromotionCodeListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/promotion_codes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PromotionCode>>() {}.getType());
  }
  /**
   * A promotion code points to a coupon. You can optionally restrict the code to a specific
   * customer, redemption limit, and expiration date.
   */
  public PromotionCode create(PromotionCodeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * A promotion code points to a coupon. You can optionally restrict the code to a specific
   * customer, redemption limit, and expiration date.
   */
  public PromotionCode create(PromotionCodeCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/promotion_codes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PromotionCode.class);
  }
  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public PromotionCode retrieve(String promotionCode, PromotionCodeRetrieveParams params)
      throws StripeException {
    return retrieve(promotionCode, params, (RequestOptions) null);
  }
  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public PromotionCode retrieve(String promotionCode, RequestOptions options)
      throws StripeException {
    return retrieve(promotionCode, (PromotionCodeRetrieveParams) null, options);
  }
  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public PromotionCode retrieve(String promotionCode) throws StripeException {
    return retrieve(promotionCode, (PromotionCodeRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the
   * customer-facing {@code code} use <a
   * href="https://stripe.com/docs/api/promotion_codes/list">list</a> with the desired {@code code}.
   */
  public PromotionCode retrieve(
      String promotionCode, PromotionCodeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(promotionCode));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PromotionCode.class);
  }
  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  public PromotionCode update(String promotionCode, PromotionCodeUpdateParams params)
      throws StripeException {
    return update(promotionCode, params, (RequestOptions) null);
  }
  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  public PromotionCode update(String promotionCode, RequestOptions options) throws StripeException {
    return update(promotionCode, (PromotionCodeUpdateParams) null, options);
  }
  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  public PromotionCode update(String promotionCode) throws StripeException {
    return update(promotionCode, (PromotionCodeUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified promotion code by setting the values of the parameters passed. Most
   * fields are, by design, not editable.
   */
  public PromotionCode update(
      String promotionCode, PromotionCodeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/promotion_codes/%s", ApiResource.urlEncodeId(promotionCode));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PromotionCode.class);
  }
}

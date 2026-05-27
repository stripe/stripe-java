// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Coupon;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CouponCreateParams;
import com.stripe.param.CouponListParams;
import com.stripe.param.CouponRetrieveParams;
import com.stripe.param.CouponUpdateParams;

public final class CouponService extends ApiService {
  public CouponService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers can’t redeem the
   * coupon. You can also delete coupons via the API.
   */
  public Coupon delete(String coupon) throws StripeException {
    return delete(coupon, (RequestOptions) null);
  }
  /**
   * You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. However, deleting a coupon does not affect any
   * customers who have already applied the coupon; it means that new customers can’t redeem the
   * coupon. You can also delete coupons via the API.
   */
  public Coupon delete(String coupon, RequestOptions options) throws StripeException {
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Coupon.class);
  }
  /** Retrieves the coupon with the given ID. */
  public Coupon retrieve(String coupon, CouponRetrieveParams params) throws StripeException {
    return retrieve(coupon, params, (RequestOptions) null);
  }
  /** Retrieves the coupon with the given ID. */
  public Coupon retrieve(String coupon, RequestOptions options) throws StripeException {
    return retrieve(coupon, (CouponRetrieveParams) null, options);
  }
  /** Retrieves the coupon with the given ID. */
  public Coupon retrieve(String coupon) throws StripeException {
    return retrieve(coupon, (CouponRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the coupon with the given ID. */
  public Coupon retrieve(String coupon, CouponRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Coupon.class);
  }
  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  public Coupon update(String coupon, CouponUpdateParams params) throws StripeException {
    return update(coupon, params, (RequestOptions) null);
  }
  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  public Coupon update(String coupon, RequestOptions options) throws StripeException {
    return update(coupon, (CouponUpdateParams) null, options);
  }
  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  public Coupon update(String coupon) throws StripeException {
    return update(coupon, (CouponUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by
   * design, not editable.
   */
  public Coupon update(String coupon, CouponUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/coupons/%s", ApiResource.urlEncodeId(coupon));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Coupon.class);
  }
  /** Returns a list of your coupons. */
  public StripeCollection<Coupon> list(CouponListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your coupons. */
  public StripeCollection<Coupon> list(RequestOptions options) throws StripeException {
    return list((CouponListParams) null, options);
  }
  /** Returns a list of your coupons. */
  public StripeCollection<Coupon> list() throws StripeException {
    return list((CouponListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your coupons. */
  public StripeCollection<Coupon> list(CouponListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/coupons";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Coupon>>() {}.getType());
  }
  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public Coupon create(CouponCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public Coupon create(RequestOptions options) throws StripeException {
    return create((CouponCreateParams) null, options);
  }
  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public Coupon create() throws StripeException {
    return create((CouponCreateParams) null, (RequestOptions) null);
  }
  /**
   * You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon
   * management</a> page of the Stripe dashboard. Coupon creation is also accessible via the API if
   * you need to create coupons on the fly.
   *
   * <p>A coupon has either a {@code percent_off} or an {@code amount_off} and {@code currency}. If
   * you set an {@code amount_off}, that amount will be subtracted from any invoice’s subtotal. For
   * example, an invoice with a subtotal of 100 will have a final total of 0 if a coupon with an
   * {@code amount_off} of 200 is applied to it and an invoice with a subtotal of 300 will have a
   * final total of 100 if a coupon with an {@code amount_off} of 200 is applied to it.
   */
  public Coupon create(CouponCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/coupons";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Coupon.class);
  }
  /** Serializes a Coupon delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String coupon) throws StripeException {
    return serializeBatchDelete(coupon, (RequestOptions) null);
  }
  /** Serializes a Coupon delete request into a batch job JSONL line. */
  public String serializeBatchDelete(String coupon, RequestOptions options) throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("coupon", coupon);
    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("path_params", pathParams);
    requestBody.put("params", null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
  /** Serializes a Coupon update request into a batch job JSONL line. */
  public String serializeBatchUpdate(String coupon, CouponUpdateParams params)
      throws StripeException {
    return serializeBatchUpdate(coupon, params, (RequestOptions) null);
  }
  /** Serializes a Coupon update request into a batch job JSONL line. */
  public String serializeBatchUpdate(
      String coupon, CouponUpdateParams params, RequestOptions options) throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, String> pathParams = new java.util.LinkedHashMap<String, String>();
    pathParams.put("coupon", coupon);
    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("path_params", pathParams);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
  /** Serializes a Coupon create request into a batch job JSONL line. */
  public String serializeBatchCreate(CouponCreateParams params) throws StripeException {
    return serializeBatchCreate(params, (RequestOptions) null);
  }
  /** Serializes a Coupon create request into a batch job JSONL line. */
  public String serializeBatchCreate(CouponCreateParams params, RequestOptions options)
      throws StripeException {
    String requestId = java.util.UUID.randomUUID().toString();
    String stripeVersion = Stripe.API_VERSION;
    String stripeContext = (options != null) ? options.getStripeContext() : null;

    java.util.Map<String, Object> requestBody = new java.util.LinkedHashMap<>();
    requestBody.put("id", requestId);
    requestBody.put("params", (params != null) ? params.toMap() : null);
    requestBody.put("stripe_version", stripeVersion);
    if (stripeContext != null) {
      requestBody.put("context", stripeContext);
    }
    return ApiResource.GSON.toJson(requestBody);
  }
}

// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Review;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ReviewApproveParams;
import com.stripe.param.ReviewListParams;
import com.stripe.param.ReviewRetrieveParams;

public final class ReviewService extends ApiService {
  public ReviewService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of {@code Review} objects that have {@code open} set to {@code true}. The
   * objects are sorted in descending order by creation date, with the most recently created object
   * appearing first.
   */
  public StripeCollection<Review> list(ReviewListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of {@code Review} objects that have {@code open} set to {@code true}. The
   * objects are sorted in descending order by creation date, with the most recently created object
   * appearing first.
   */
  public StripeCollection<Review> list(RequestOptions options) throws StripeException {
    return list((ReviewListParams) null, options);
  }
  /**
   * Returns a list of {@code Review} objects that have {@code open} set to {@code true}. The
   * objects are sorted in descending order by creation date, with the most recently created object
   * appearing first.
   */
  public StripeCollection<Review> list() throws StripeException {
    return list((ReviewListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of {@code Review} objects that have {@code open} set to {@code true}. The
   * objects are sorted in descending order by creation date, with the most recently created object
   * appearing first.
   */
  public StripeCollection<Review> list(ReviewListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reviews";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Review>>() {}.getType());
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String id, ReviewRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ReviewRetrieveParams) null, options);
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String id) throws StripeException {
    return retrieve(id, (ReviewRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String id, ReviewRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reviews/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Review.class);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String id, ReviewApproveParams params) throws StripeException {
    return approve(id, params, (RequestOptions) null);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String id, RequestOptions options) throws StripeException {
    return approve(id, (ReviewApproveParams) null, options);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String id) throws StripeException {
    return approve(id, (ReviewApproveParams) null, (RequestOptions) null);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String id, ReviewApproveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reviews/%s/approve", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Review.class);
  }
}

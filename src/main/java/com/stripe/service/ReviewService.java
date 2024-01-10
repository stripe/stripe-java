// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Review;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
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
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Review>>() {}.getType());
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String review, ReviewRetrieveParams params) throws StripeException {
    return retrieve(review, params, (RequestOptions) null);
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String review, RequestOptions options) throws StripeException {
    return retrieve(review, (ReviewRetrieveParams) null, options);
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String review) throws StripeException {
    return retrieve(review, (ReviewRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code Review} object. */
  public Review retrieve(String review, ReviewRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reviews/%s", ApiResource.urlEncodeId(review));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Review.class);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String review, ReviewApproveParams params) throws StripeException {
    return approve(review, params, (RequestOptions) null);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String review, RequestOptions options) throws StripeException {
    return approve(review, (ReviewApproveParams) null, options);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String review) throws StripeException {
    return approve(review, (ReviewApproveParams) null, (RequestOptions) null);
  }
  /** Approves a {@code Review} object, closing it and removing it from the list of reviews. */
  public Review approve(String review, ReviewApproveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reviews/%s/approve", ApiResource.urlEncodeId(review));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Review.class);
  }
}

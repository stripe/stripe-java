// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Review;
import com.stripe.model.ReviewCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.ReviewApproveParams;
import com.stripe.param.ReviewListParams;
import com.stripe.param.ReviewRetrieveParams;

public class ReviewService extends ApiService {
  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(String review, ReviewApproveParams params) throws StripeException {
    return approve(review, params, (RequestOptions) null);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(String review, ReviewApproveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/reviews/%s/approve", review);
    return request(ApiResource.RequestMethod.POST, url, params, Review.class, options);
  }

  /**
   * Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true
   * </code>. The objects are sorted in descending order by creation date, with the most recently
   * created object appearing first.
   */
  public ReviewCollection list(ReviewListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true
   * </code>. The objects are sorted in descending order by creation date, with the most recently
   * created object appearing first.
   */
  public ReviewCollection list(ReviewListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/reviews");
    return requestCollection(url, params, ReviewCollection.class, options);
  }

  /** Retrieves a <code>Review</code> object. */
  public Review retrieve(String review, ReviewRetrieveParams params) throws StripeException {
    return retrieve(review, params, (RequestOptions) null);
  }

  /** Retrieves a <code>Review</code> object. */
  public Review retrieve(String review, ReviewRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/reviews/%s", review);
    return request(ApiResource.RequestMethod.GET, url, params, Review.class, options);
  }
}

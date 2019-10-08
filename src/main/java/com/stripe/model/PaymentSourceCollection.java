package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PaymentSourceCollectionCreateParams;
import com.stripe.param.PaymentSourceCollectionListParams;
import com.stripe.param.PaymentSourceCollectionRetrieveParams;
import java.util.Map;

public class PaymentSourceCollection extends StripeCollection<PaymentSource> {
  /** List sources for a specified customer. */
  public PaymentSourceCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, PaymentSourceCollection.class, options);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection list(PaymentSourceCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List sources for a specified customer. */
  public PaymentSourceCollection list(
      PaymentSourceCollectionListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, PaymentSourceCollection.class, options);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentSource.class, options);
  }

  /** Retrieve a specified source for a given customer. */
  public PaymentSource retrieve(
      String id, PaymentSourceCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentSource.class, options);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="/docs/api#update_customer">update the customer</a> to have a new <code>default_source
   * </code>.
   */
  public PaymentSource create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="/docs/api#update_customer">update the customer</a> to have a new <code>default_source
   * </code>.
   */
  public PaymentSource create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentSource.class, options);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="/docs/api#update_customer">update the customer</a> to have a new <code>default_source
   * </code>.
   */
  public PaymentSource create(PaymentSourceCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * When you create a new credit card, you must specify a customer or recipient on which to create
   * it.
   *
   * <p>If the card’s owner has no default card, then the new card will become the default. However,
   * if the owner already has a default, then it will not change. To change the default, you should
   * <a href="/docs/api#update_customer">update the customer</a> to have a new <code>default_source
   * </code>.
   */
  public PaymentSource create(PaymentSourceCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentSource.class, options);
  }
}

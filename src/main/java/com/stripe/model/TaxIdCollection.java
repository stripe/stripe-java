package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TaxIdCollectionCreateParams;
import com.stripe.param.TaxIdCollectionListParams;
import com.stripe.param.TaxIdCollectionRetrieveParams;
import java.util.Map;

public class TaxIdCollection extends StripeCollection<TaxId> {
  /**
   * <p>Creates a new <code>TaxID</code> object for a customer.</p>
   */
  public TaxId create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new <code>TaxID</code> object for a customer.</p>
   */
  public TaxId create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, TaxId.class, options);
  }

  /**
   * <p>Creates a new <code>TaxID</code> object for a customer.</p>
   */
  public TaxId create(TaxIdCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new <code>TaxID</code> object for a customer.</p>
   */
  public TaxId create(
      TaxIdCollectionCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, TaxId.class, options);
  }

  /**
   * <p>Retrieves the <code>TaxID</code> object with the given identifier.</p>
   */
  public TaxId retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves the <code>TaxID</code> object with the given identifier.</p>
   */
  public TaxId retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves the <code>TaxID</code> object with the given identifier.</p>
   */
  public TaxId retrieve(
      String id,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, TaxId.class, options);
  }

  /**
   * <p>Retrieves the <code>TaxID</code> object with the given identifier.</p>
   */
  public TaxId retrieve(
      String id,
      TaxIdCollectionRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, TaxId.class, options);
  }

  /**
   * <p>Returns a list of tax IDs for a customer.</p>
   */
  public TaxIdCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of tax IDs for a customer.</p>
   */
  public TaxIdCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, TaxIdCollection.class, options);
  }

  /**
   * <p>Returns a list of tax IDs for a customer.</p>
   */
  public TaxIdCollection list(TaxIdCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of tax IDs for a customer.</p>
   */
  public TaxIdCollection list(
      TaxIdCollectionListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, TaxIdCollection.class, options);
  }
}
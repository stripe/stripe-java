// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ExternalAccountCollectionCreateParams;
import com.stripe.param.ExternalAccountCollectionListParams;
import com.stripe.param.ExternalAccountCollectionRetrieveParams;
import java.util.Map;

public class ExternalAccountCollection extends StripeCollection<ExternalAccount> {
  /**
   * <p>List external accounts for an account.</p>
   */
  public ExternalAccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>List external accounts for an account.</p>
   */
  public ExternalAccountCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, ExternalAccountCollection.class, options);
  }

  /**
   * <p>List external accounts for an account.</p>
   */
  public ExternalAccountCollection list(
      ExternalAccountCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>List external accounts for an account.</p>
   */
  public ExternalAccountCollection list(
      ExternalAccountCollectionListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, ExternalAccountCollection.class, options);
  }

  /**
   * <p>Retrieve a specified external account for a given account.</p>
   */
  public ExternalAccount retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieve a specified external account for a given account.</p>
   */
  public ExternalAccount retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieve a specified external account for a given account.</p>
   */
  public ExternalAccount retrieve(
      String id,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      ExternalAccount.class,
      options
    );
  }

  /**
   * <p>Retrieve a specified external account for a given account.</p>
   */
  public ExternalAccount retrieve(
      String id,
      ExternalAccountCollectionRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      ExternalAccount.class,
      options
    );
  }

  /**
   * <p>Create an external account for a given account.</p>
   */
  public ExternalAccount create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Create an external account for a given account.</p>
   */
  public ExternalAccount create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ExternalAccount.class,
      options
    );
  }

  /**
   * <p>Create an external account for a given account.</p>
   */
  public ExternalAccount create(
      ExternalAccountCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Create an external account for a given account.</p>
   */
  public ExternalAccount create(
      ExternalAccountCollectionCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ExternalAccount.class,
      options
    );
  }
}
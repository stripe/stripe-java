// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CapabilityCollectionListParams;
import com.stripe.param.CapabilityCollectionRetrieveParams;
import java.util.Map;

public class CapabilityCollection extends StripeCollection<Capability> {
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            params,
            CapabilityCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection list(CapabilityCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection list(CapabilityCollectionListParams params, RequestOptions options)
      throws StripeException {
    String url = this.getUrl();
    ApiResource.checkNullTypedParams(url, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            CapabilityCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            params,
            Capability.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(
      String id, CapabilityCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(url, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            url,
            ApiRequestParams.paramsToMap(params),
            Capability.class,
            options,
            ApiMode.V1);
  }
}

// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.TaxId;
import com.stripe.model.TaxIdCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.TaxIdCreateParams;
import com.stripe.param.TaxIdDeleteParams;
import com.stripe.param.TaxIdListParams;
import com.stripe.param.TaxIdRetrieveParams;

public class TaxIdService extends ApiService {
  /** Creates a new <code>TaxID</code> object for a customer. */
  public TaxId create(String customer, TaxIdCreateParams params) throws StripeException {
    return create(customer, params, (RequestOptions) null);
  }

  /** Creates a new <code>TaxID</code> object for a customer. */
  public TaxId create(String customer, TaxIdCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/tax_ids", customer);
    return request(ApiResource.RequestMethod.POST, url, params, TaxId.class, options);
  }

  /** Deletes an existing <code>TaxID</code> object. */
  public TaxId delete(String customer, String id, TaxIdDeleteParams params) throws StripeException {
    return delete(customer, id, params, (RequestOptions) null);
  }

  /** Deletes an existing <code>TaxID</code> object. */
  public TaxId delete(String customer, String id, TaxIdDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/tax_ids/%s", customer, id);
    return request(ApiResource.RequestMethod.DELETE, url, params, TaxId.class, options);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(String customer, TaxIdListParams params) throws StripeException {
    return list(customer, params, (RequestOptions) null);
  }

  /** Returns a list of tax IDs for a customer. */
  public TaxIdCollection list(String customer, TaxIdListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/tax_ids", customer);
    return requestCollection(url, params, TaxIdCollection.class, options);
  }

  /** Retrieves the <code>TaxID</code> object with the given identifier. */
  public TaxId retrieve(String customer, String id, TaxIdRetrieveParams params)
      throws StripeException {
    return retrieve(customer, id, params, (RequestOptions) null);
  }

  /** Retrieves the <code>TaxID</code> object with the given identifier. */
  public TaxId retrieve(
      String customer, String id, TaxIdRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/tax_ids/%s", customer, id);
    return request(ApiResource.RequestMethod.GET, url, params, TaxId.class, options);
  }
}

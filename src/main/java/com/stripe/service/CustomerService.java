package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.PaymentSourceCollection;
import com.stripe.model.PaymentSource;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import com.stripe.param.PaymentSourceCollectionListParams;
import com.stripe.param.SourceRetrieveParams;
import com.stripe.util.StringUtils;
import java.lang.reflect.Type;

public class CustomerService extends Service<Customer> {
  public CustomerService(StripeClient client) {
    super(client);
  }

  /** Returns a list of Line Items */
  public PaymentSourceCollection listSources(String parentId, PaymentSourceCollectionListParams params)
      throws StripeException {
    return listSources(parentId, params, (RequestOptions) null);
  }

  /** Returns a list of Line Items */
  public PaymentSourceCollection listSources(String parentId, PaymentSourceCollectionListParams params,
      RequestOptions options) throws StripeException {
    return this.request(PaymentSourceCollection.class, ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", StringUtils.urlEncode(parentId)), params, options);
  }

  public PaymentSource retrieveSource(String parentId, String id) throws StripeException {
    return this.retrieveSource(parentId, id, null, null);
  }

  public PaymentSource retrieveSource(String parentId, String id, SourceRetrieveParams params) throws StripeException {
    return this.retrieveSource(parentId, id, params, null);
  }

  public PaymentSource retrieveSource(String parentId, String id, SourceRetrieveParams params, RequestOptions options)
      throws StripeException {
    return this.request(PaymentSource.class, ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", StringUtils.urlEncode(parentId), StringUtils.urlEncode(id)),
        params, options);
  }
}

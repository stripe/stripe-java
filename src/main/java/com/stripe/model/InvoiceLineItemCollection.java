package com.stripe.model;

import java.util.List;
import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.Stripe;

public class InvoiceLineItemCollection extends APIResource {
  List<InvoiceLineItem> data;
  Integer count;
  String url;
  
  public List<InvoiceLineItem> getData() {
    return data;
  }

  public String getURL() {
    return url;
  }

  public Integer getCount() {
    return count;
  }

  public InvoiceLineItemCollection all(Map<String, Object> params) throws StripeException {
    return all(params, null);
  }

  public InvoiceLineItemCollection all(Map<String, Object> params, String apiKey) throws StripeException {
    String url = String.format("%s%s", Stripe.API_BASE, this.getURL());
    return request(RequestMethod.GET, url, params, InvoiceLineItemCollection.class, apiKey);
  }
}
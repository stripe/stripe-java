package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class PersonCollection extends StripeCollection<Person> {
  // <editor-fold desc="create">
  public Person create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  public Person create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.POST, String.format("%s%s",
        Stripe.getApiBase(), this.getUrl()), params, Person.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  public PersonCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  public PersonCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, PersonCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  public Person retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  public Person retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  public Person retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return ApiResource.request(ApiResource.RequestMethod.GET, String.format("%s%s/%s",
        Stripe.getApiBase(), this.getUrl(), id), params, Person.class, options);
  }
  // </editor-fold>
}

// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.PersonCollectionCreateParams;
import com.stripe.param.PersonCollectionListParams;
import com.stripe.param.PersonCollectionRetrieveParams;
import java.util.Map;

public class PersonCollection extends StripeCollection<Person> {
  /** Creates a new person. */
  public Person create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Person.class);
  }

  /** Creates a new person. */
  public Person create(PersonCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person create(PersonCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Person.class);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, PersonCollection.class);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(PersonCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(PersonCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PersonCollection.class);
  }

  /** Retrieves an existing person. */
  public Person retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an existing person. */
  public Person retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves an existing person. */
  public Person retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, Person.class);
  }

  /** Retrieves an existing person. */
  public Person retrieve(String id, PersonCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Person.class);
  }
}

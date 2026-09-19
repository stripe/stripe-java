// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Person;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountPersonCreateParams;
import com.stripe.param.AccountPersonListParams;
import com.stripe.param.AccountPersonRetrieveParams;
import com.stripe.param.AccountPersonUpdateParams;

public final class AccountPersonService extends ApiService {
  public AccountPersonService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the {@code
   * representative}. If your integration is using the {@code executive} parameter, you cannot
   * delete the only verified {@code executive} on file.
   */
  public Person delete(String accountId, String id) throws StripeException {
    return delete(accountId, id, (RequestOptions) null);
  }
  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the {@code
   * representative}. If your integration is using the {@code executive} parameter, you cannot
   * delete the only verified {@code executive} on file.
   */
  public Person delete(String accountId, String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Person.class);
  }
  /** Retrieves an existing person. */
  public Person retrieve(String accountId, String id, AccountPersonRetrieveParams params)
      throws StripeException {
    return retrieve(accountId, id, params, (RequestOptions) null);
  }
  /** Retrieves an existing person. */
  public Person retrieve(String accountId, String id, RequestOptions options)
      throws StripeException {
    return retrieve(accountId, id, (AccountPersonRetrieveParams) null, options);
  }
  /** Retrieves an existing person. */
  public Person retrieve(String accountId, String id) throws StripeException {
    return retrieve(accountId, id, (AccountPersonRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing person. */
  public Person retrieve(
      String accountId, String id, AccountPersonRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Person.class);
  }
  /** Updates an existing person. */
  public Person update(String accountId, String id, AccountPersonUpdateParams params)
      throws StripeException {
    return update(accountId, id, params, (RequestOptions) null);
  }
  /** Updates an existing person. */
  public Person update(String accountId, String id, RequestOptions options) throws StripeException {
    return update(accountId, id, (AccountPersonUpdateParams) null, options);
  }
  /** Updates an existing person. */
  public Person update(String accountId, String id) throws StripeException {
    return update(accountId, id, (AccountPersonUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing person. */
  public Person update(
      String accountId, String id, AccountPersonUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Person.class);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(String id, AccountPersonListParams params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(String id, RequestOptions options) throws StripeException {
    return list(id, (AccountPersonListParams) null, options);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(String id) throws StripeException {
    return list(id, (AccountPersonListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(
      String id, AccountPersonListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Person>>() {}.getType());
  }
  /** Creates a new person. */
  public Person create(String id, AccountPersonCreateParams params) throws StripeException {
    return create(id, params, (RequestOptions) null);
  }
  /** Creates a new person. */
  public Person create(String id, RequestOptions options) throws StripeException {
    return create(id, (AccountPersonCreateParams) null, options);
  }
  /** Creates a new person. */
  public Person create(String id) throws StripeException {
    return create(id, (AccountPersonCreateParams) null, (RequestOptions) null);
  }
  /** Creates a new person. */
  public Person create(String id, AccountPersonCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Person.class);
  }
}

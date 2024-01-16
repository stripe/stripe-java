// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Person;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PersonCreateParams;
import com.stripe.param.PersonListParams;
import com.stripe.param.PersonRetrieveParams;
import com.stripe.param.PersonUpdateParams;

public final class PersonService extends ApiService {
  public PersonService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the {@code
   * account_opener}. If your integration is using the {@code executive} parameter, you cannot
   * delete the only verified {@code executive} on file.
   */
  public Person delete(String account, String person) throws StripeException {
    return delete(account, person, (RequestOptions) null);
  }
  /**
   * Deletes an existing person’s relationship to the account’s legal entity. Any person with a
   * relationship for an account can be deleted through the API, except if the person is the {@code
   * account_opener}. If your integration is using the {@code executive} parameter, you cannot
   * delete the only verified {@code executive} on file.
   */
  public Person delete(String account, String person, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(person));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, Person.class);
  }
  /** Retrieves an existing person. */
  public Person retrieve(String account, String person, PersonRetrieveParams params)
      throws StripeException {
    return retrieve(account, person, params, (RequestOptions) null);
  }
  /** Retrieves an existing person. */
  public Person retrieve(String account, String person, RequestOptions options)
      throws StripeException {
    return retrieve(account, person, (PersonRetrieveParams) null, options);
  }
  /** Retrieves an existing person. */
  public Person retrieve(String account, String person) throws StripeException {
    return retrieve(account, person, (PersonRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an existing person. */
  public Person retrieve(
      String account, String person, PersonRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(person));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, Person.class);
  }
  /** Updates an existing person. */
  public Person update(String account, String person, PersonUpdateParams params)
      throws StripeException {
    return update(account, person, params, (RequestOptions) null);
  }
  /** Updates an existing person. */
  public Person update(String account, String person, RequestOptions options)
      throws StripeException {
    return update(account, person, (PersonUpdateParams) null, options);
  }
  /** Updates an existing person. */
  public Person update(String account, String person) throws StripeException {
    return update(account, person, (PersonUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing person. */
  public Person update(
      String account, String person, PersonUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(account), ApiResource.urlEncodeId(person));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, Person.class);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(String account, PersonListParams params)
      throws StripeException {
    return list(account, params, (RequestOptions) null);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(String account, RequestOptions options)
      throws StripeException {
    return list(account, (PersonListParams) null, options);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(String account) throws StripeException {
    return list(account, (PersonListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public StripeCollection<Person> list(
      String account, PersonListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<Person>>() {}.getType());
  }
  /** Creates a new person. */
  public Person create(String account, PersonCreateParams params) throws StripeException {
    return create(account, params, (RequestOptions) null);
  }
  /** Creates a new person. */
  public Person create(String account, RequestOptions options) throws StripeException {
    return create(account, (PersonCreateParams) null, options);
  }
  /** Creates a new person. */
  public Person create(String account) throws StripeException {
    return create(account, (PersonCreateParams) null, (RequestOptions) null);
  }
  /** Creates a new person. */
  public Person create(String account, PersonCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/accounts/%s/persons", ApiResource.urlEncodeId(account));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, Person.class);
  }
}

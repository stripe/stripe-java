// File generated from our OpenAPI spec
package com.stripe.service.v2.core.accounts;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.DeletedObject;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.AccountPerson;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.accounts.PersonCreateParams;
import com.stripe.param.v2.core.accounts.PersonListParams;
import com.stripe.param.v2.core.accounts.PersonUpdateParams;

public final class PersonService extends ApiService {
  public PersonService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a paginated list of Persons associated with an Account. */
  public StripeCollection<AccountPerson> list(String accountId, PersonListParams params)
      throws StripeException {
    return list(accountId, params, (RequestOptions) null);
  }
  /** Returns a paginated list of Persons associated with an Account. */
  public StripeCollection<AccountPerson> list(String accountId, RequestOptions options)
      throws StripeException {
    return list(accountId, (PersonListParams) null, options);
  }
  /** Returns a paginated list of Persons associated with an Account. */
  public StripeCollection<AccountPerson> list(String accountId) throws StripeException {
    return list(accountId, (PersonListParams) null, (RequestOptions) null);
  }
  /** Returns a paginated list of Persons associated with an Account. */
  public StripeCollection<AccountPerson> list(
      String accountId, PersonListParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/accounts/%s/persons", ApiResource.urlEncodeId(accountId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<AccountPerson>>() {}.getType());
  }
  /**
   * Create a Person. Adds an individual to an Account's identity. You can set relationship
   * attributes and identity information at creation.
   */
  public AccountPerson create(String accountId, PersonCreateParams params) throws StripeException {
    return create(accountId, params, (RequestOptions) null);
  }
  /**
   * Create a Person. Adds an individual to an Account's identity. You can set relationship
   * attributes and identity information at creation.
   */
  public AccountPerson create(String accountId, RequestOptions options) throws StripeException {
    return create(accountId, (PersonCreateParams) null, options);
  }
  /**
   * Create a Person. Adds an individual to an Account's identity. You can set relationship
   * attributes and identity information at creation.
   */
  public AccountPerson create(String accountId) throws StripeException {
    return create(accountId, (PersonCreateParams) null, (RequestOptions) null);
  }
  /**
   * Create a Person. Adds an individual to an Account's identity. You can set relationship
   * attributes and identity information at creation.
   */
  public AccountPerson create(String accountId, PersonCreateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/core/accounts/%s/persons", ApiResource.urlEncodeId(accountId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountPerson.class);
  }
  /** Delete a Person associated with an Account. */
  public DeletedObject delete(String accountId, String id) throws StripeException {
    return delete(accountId, id, (RequestOptions) null);
  }
  /** Delete a Person associated with an Account. */
  public DeletedObject delete(String accountId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/core/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, DeletedObject.class);
  }
  /** Retrieves a Person associated with an Account. */
  public AccountPerson retrieve(String accountId, String id) throws StripeException {
    return retrieve(accountId, id, (RequestOptions) null);
  }
  /** Retrieves a Person associated with an Account. */
  public AccountPerson retrieve(String accountId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/core/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AccountPerson.class);
  }
  /** Updates a Person associated with an Account. */
  public AccountPerson update(String accountId, String id, PersonUpdateParams params)
      throws StripeException {
    return update(accountId, id, params, (RequestOptions) null);
  }
  /** Updates a Person associated with an Account. */
  public AccountPerson update(String accountId, String id, RequestOptions options)
      throws StripeException {
    return update(accountId, id, (PersonUpdateParams) null, options);
  }
  /** Updates a Person associated with an Account. */
  public AccountPerson update(String accountId, String id) throws StripeException {
    return update(accountId, id, (PersonUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a Person associated with an Account. */
  public AccountPerson update(
      String accountId, String id, PersonUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/core/accounts/%s/persons/%s",
            ApiResource.urlEncodeId(accountId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountPerson.class);
  }
}

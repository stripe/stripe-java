// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.AccountCollectionCreateParams;
import com.stripe.param.AccountCollectionListParams;
import com.stripe.param.AccountCollectionRetrieveParams;
import java.util.Map;

public class AccountCollection extends StripeCollection<Account> {
  /** Create an external account for a given account. */
  public ExternalAccount create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccount create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** Create an external account for a given account. */
  public ExternalAccount create(AccountCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccount create(AccountCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** Creates a new person. */
  public Person create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Person.class);
  }

  /** Creates a new person. */
  public Person create(AccountCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person create(AccountCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Person.class);
  }

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
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, CapabilityCollection.class);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection list(AccountCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection list(AccountCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, CapabilityCollection.class);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccountCollection.class);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(AccountCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection list(AccountCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccountCollection.class);
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
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, PersonCollection.class);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(AccountCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(AccountCollectionListParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PersonCollection.class);
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
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieve(
      String id, AccountCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieve(
      String id, AccountCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
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
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Person.class);
  }

  /** Retrieves an existing person. */
  public Person retrieve(String id, AccountCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Person.class);
  }
}

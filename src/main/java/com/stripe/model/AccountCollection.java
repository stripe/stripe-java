// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.AccountCollectionCapabilitiesParams;
import com.stripe.param.AccountCollectionCreateExternalAccountParams;
import com.stripe.param.AccountCollectionCreatePersonParams;
import com.stripe.param.AccountCollectionExternalAccountsParams;
import com.stripe.param.AccountCollectionPeopleParams;
import com.stripe.param.AccountCollectionRetrieveCapabilityParams;
import com.stripe.param.AccountCollectionRetrieveExternalAccountParams;
import com.stripe.param.AccountCollectionRetrievePersonParams;
import java.util.Map;

public class AccountCollection extends StripeCollection<Account> {
  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(Map<String, Object> params) throws StripeException {
    return capabilities(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(Map<String, Object> params, RequestOptions options)
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
  public CapabilityCollection capabilities(AccountCollectionCapabilitiesParams params)
      throws StripeException {
    return capabilities(params, (RequestOptions) null);
  }

  /**
   * Returns a list of capabilities associated with the account. The capabilities are returned
   * sorted by creation date, with the most recent capability appearing first.
   */
  public CapabilityCollection capabilities(
      AccountCollectionCapabilitiesParams params, RequestOptions options) throws StripeException {
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

  /** Create an external account for a given account. */
  public ExternalAccount createExternalAccount(Map<String, Object> params) throws StripeException {
    return createExternalAccount(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccount createExternalAccount(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** Create an external account for a given account. */
  public ExternalAccount createExternalAccount(AccountCollectionCreateExternalAccountParams params)
      throws StripeException {
    return createExternalAccount(params, (RequestOptions) null);
  }

  /** Create an external account for a given account. */
  public ExternalAccount createExternalAccount(
      AccountCollectionCreateExternalAccountParams params, RequestOptions options)
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
  public Person createPerson(Map<String, Object> params) throws StripeException {
    return createPerson(params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person createPerson(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Person.class);
  }

  /** Creates a new person. */
  public Person createPerson(AccountCollectionCreatePersonParams params) throws StripeException {
    return createPerson(params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person createPerson(AccountCollectionCreatePersonParams params, RequestOptions options)
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

  /** List external accounts for an account. */
  public ExternalAccountCollection externalAccounts(Map<String, Object> params)
      throws StripeException {
    return externalAccounts(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection externalAccounts(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccountCollection.class);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection externalAccounts(AccountCollectionExternalAccountsParams params)
      throws StripeException {
    return externalAccounts(params, (RequestOptions) null);
  }

  /** List external accounts for an account. */
  public ExternalAccountCollection externalAccounts(
      AccountCollectionExternalAccountsParams params, RequestOptions options)
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
  public PersonCollection people(Map<String, Object> params) throws StripeException {
    return people(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection people(Map<String, Object> params, RequestOptions options)
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
  public PersonCollection people(AccountCollectionPeopleParams params) throws StripeException {
    return people(params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection people(AccountCollectionPeopleParams params, RequestOptions options)
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
  public Capability retrieveCapability(String id) throws StripeException {
    return retrieveCapability(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieveCapability(String id, RequestOptions options) throws StripeException {
    return retrieveCapability(id, (Map<String, Object>) null, options);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieveCapability(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }

  /** Retrieves information about the specified Account Capability. */
  public Capability retrieveCapability(
      String id, AccountCollectionRetrieveCapabilityParams params, RequestOptions options)
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
  public ExternalAccount retrieveExternalAccount(String id) throws StripeException {
    return retrieveExternalAccount(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieveExternalAccount(String id, RequestOptions options)
      throws StripeException {
    return retrieveExternalAccount(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieveExternalAccount(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, ExternalAccount.class);
  }

  /** Retrieve a specified external account for a given account. */
  public ExternalAccount retrieveExternalAccount(
      String id, AccountCollectionRetrieveExternalAccountParams params, RequestOptions options)
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
  public Person retrievePerson(String id) throws StripeException {
    return retrievePerson(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an existing person. */
  public Person retrievePerson(String id, RequestOptions options) throws StripeException {
    return retrievePerson(id, (Map<String, Object>) null, options);
  }

  /** Retrieves an existing person. */
  public Person retrievePerson(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Person.class);
  }

  /** Retrieves an existing person. */
  public Person retrievePerson(
      String id, AccountCollectionRetrievePersonParams params, RequestOptions options)
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

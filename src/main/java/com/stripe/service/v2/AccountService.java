// File generated from our OpenAPI spec
package com.stripe.service.v2;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.Account;
import com.stripe.model.v2.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.AccountCreateParams;
import com.stripe.param.v2.AccountListParams;
import com.stripe.param.v2.AccountRetrieveParams;
import com.stripe.param.v2.AccountUpdateParams;

public final class AccountService extends ApiService {
  public AccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Accounts. Note that the {@code include} parameter cannot be passed in on list
   * requests.
   */
  public StripeCollection<Account> list(AccountListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Accounts. Note that the {@code include} parameter cannot be passed in on list
   * requests.
   */
  public StripeCollection<Account> list(RequestOptions options) throws StripeException {
    return list((AccountListParams) null, options);
  }
  /**
   * Returns a list of Accounts. Note that the {@code include} parameter cannot be passed in on list
   * requests.
   */
  public StripeCollection<Account> list() throws StripeException {
    return list((AccountListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Accounts. Note that the {@code include} parameter cannot be passed in on list
   * requests.
   */
  public StripeCollection<Account> list(AccountListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Account>>() {}.getType());
  }
  /**
   * Creates an Account. You can optionally provide information about the associated Legal Entity,
   * such as name and business type. The Account can also be configured as a recipient of
   * OutboundPayments by requesting Features on the recipient configuration.
   */
  public Account create(AccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an Account. You can optionally provide information about the associated Legal Entity,
   * such as name and business type. The Account can also be configured as a recipient of
   * OutboundPayments by requesting Features on the recipient configuration.
   */
  public Account create(RequestOptions options) throws StripeException {
    return create((AccountCreateParams) null, options);
  }
  /**
   * Creates an Account. You can optionally provide information about the associated Legal Entity,
   * such as name and business type. The Account can also be configured as a recipient of
   * OutboundPayments by requesting Features on the recipient configuration.
   */
  public Account create() throws StripeException {
    return create((AccountCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates an Account. You can optionally provide information about the associated Legal Entity,
   * such as name and business type. The Account can also be configured as a recipient of
   * OutboundPayments by requesting Features on the recipient configuration.
   */
  public Account create(AccountCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id, AccountRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (AccountRetrieveParams) null, options);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id) throws StripeException {
    return retrieve(id, (AccountRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an Account. */
  public Account retrieve(String id, AccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /**
   * Updates the details of an Account. You can also optionally provide or update the details of the
   * associated Legal Entity and recipient configuration.
   */
  public Account update(String id, AccountUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the details of an Account. You can also optionally provide or update the details of the
   * associated Legal Entity and recipient configuration.
   */
  public Account update(String id, RequestOptions options) throws StripeException {
    return update(id, (AccountUpdateParams) null, options);
  }
  /**
   * Updates the details of an Account. You can also optionally provide or update the details of the
   * associated Legal Entity and recipient configuration.
   */
  public Account update(String id) throws StripeException {
    return update(id, (AccountUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the details of an Account. You can also optionally provide or update the details of the
   * associated Legal Entity and recipient configuration.
   */
  public Account update(String id, AccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Account.class);
  }
  /** Closes and removes access to the Account and its associated resources. */
  public Account close(String id) throws StripeException {
    return close(id, (RequestOptions) null);
  }
  /** Closes and removes access to the Account and its associated resources. */
  public Account close(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/accounts/%s/close", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Account.class);
  }
}

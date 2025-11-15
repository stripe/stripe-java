// File generated from our OpenAPI spec
package com.stripe.service.v2.core.vault;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.BlockedByStripeException;
import com.stripe.exception.ControlledByDashboardException;
import com.stripe.exception.InvalidPaymentMethodException;
import com.stripe.exception.QuotaExceededException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.core.vault.UsBankAccount;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.vault.UsBankAccountConfirmMicrodepositsParams;
import com.stripe.param.v2.core.vault.UsBankAccountCreateParams;
import com.stripe.param.v2.core.vault.UsBankAccountListParams;
import com.stripe.param.v2.core.vault.UsBankAccountUpdateParams;

public final class UsBankAccountService extends ApiService {
  public UsBankAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List USBankAccount objects. Optionally filter by verification status. */
  public StripeCollection<UsBankAccount> list(UsBankAccountListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List USBankAccount objects. Optionally filter by verification status. */
  public StripeCollection<UsBankAccount> list(RequestOptions options) throws StripeException {
    return list((UsBankAccountListParams) null, options);
  }
  /** List USBankAccount objects. Optionally filter by verification status. */
  public StripeCollection<UsBankAccount> list() throws StripeException {
    return list((UsBankAccountListParams) null, (RequestOptions) null);
  }
  /** List USBankAccount objects. Optionally filter by verification status. */
  public StripeCollection<UsBankAccount> list(
      UsBankAccountListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/core/vault/us_bank_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<UsBankAccount>>() {}.getType());
  }
  /** Create a USBankAccount object. */
  public UsBankAccount create(UsBankAccountCreateParams params)
      throws StripeException, BlockedByStripeException, InvalidPaymentMethodException,
          QuotaExceededException {
    return create(params, (RequestOptions) null);
  }
  /** Create a USBankAccount object. */
  public UsBankAccount create(UsBankAccountCreateParams params, RequestOptions options)
      throws StripeException, BlockedByStripeException, InvalidPaymentMethodException,
          QuotaExceededException {
    String path = "/v2/core/vault/us_bank_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, UsBankAccount.class);
  }
  /** Retrieve a USBankAccount object. */
  public UsBankAccount retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a USBankAccount object. */
  public UsBankAccount retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/vault/us_bank_accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, UsBankAccount.class);
  }
  /**
   * Update a USBankAccount object. This is limited to supplying a previously empty routing_number
   * field.
   */
  public UsBankAccount update(String id, UsBankAccountUpdateParams params)
      throws StripeException, BlockedByStripeException, InvalidPaymentMethodException,
          QuotaExceededException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Update a USBankAccount object. This is limited to supplying a previously empty routing_number
   * field.
   */
  public UsBankAccount update(String id, RequestOptions options)
      throws StripeException, BlockedByStripeException, InvalidPaymentMethodException,
          QuotaExceededException {
    return update(id, (UsBankAccountUpdateParams) null, options);
  }
  /**
   * Update a USBankAccount object. This is limited to supplying a previously empty routing_number
   * field.
   */
  public UsBankAccount update(String id)
      throws StripeException, BlockedByStripeException, InvalidPaymentMethodException,
          QuotaExceededException {
    return update(id, (UsBankAccountUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Update a USBankAccount object. This is limited to supplying a previously empty routing_number
   * field.
   */
  public UsBankAccount update(String id, UsBankAccountUpdateParams params, RequestOptions options)
      throws StripeException, BlockedByStripeException, InvalidPaymentMethodException,
          QuotaExceededException {
    String path = String.format("/v2/core/vault/us_bank_accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, UsBankAccount.class);
  }
  /**
   * Archive a USBankAccount object. USBankAccount objects will not be automatically archived by
   * Stripe. Archived USBankAccount objects cannot be used as outbound destinations and will not
   * appear in the outbound destination list.
   */
  public UsBankAccount archive(String id) throws StripeException, ControlledByDashboardException {
    return archive(id, (RequestOptions) null);
  }
  /**
   * Archive a USBankAccount object. USBankAccount objects will not be automatically archived by
   * Stripe. Archived USBankAccount objects cannot be used as outbound destinations and will not
   * appear in the outbound destination list.
   */
  public UsBankAccount archive(String id, RequestOptions options)
      throws StripeException, ControlledByDashboardException {
    String path =
        String.format("/v2/core/vault/us_bank_accounts/%s/archive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, UsBankAccount.class);
  }
  /**
   * Confirm microdeposits amounts or descriptor code that you have received from the Send
   * Microdeposits request. Once you correctly confirm this, this US Bank Account will be verified
   * and eligible to transfer funds with.
   */
  public UsBankAccount confirmMicrodeposits(
      String id, UsBankAccountConfirmMicrodepositsParams params) throws StripeException {
    return confirmMicrodeposits(id, params, (RequestOptions) null);
  }
  /**
   * Confirm microdeposits amounts or descriptor code that you have received from the Send
   * Microdeposits request. Once you correctly confirm this, this US Bank Account will be verified
   * and eligible to transfer funds with.
   */
  public UsBankAccount confirmMicrodeposits(String id, RequestOptions options)
      throws StripeException {
    return confirmMicrodeposits(id, (UsBankAccountConfirmMicrodepositsParams) null, options);
  }
  /**
   * Confirm microdeposits amounts or descriptor code that you have received from the Send
   * Microdeposits request. Once you correctly confirm this, this US Bank Account will be verified
   * and eligible to transfer funds with.
   */
  public UsBankAccount confirmMicrodeposits(String id) throws StripeException {
    return confirmMicrodeposits(
        id, (UsBankAccountConfirmMicrodepositsParams) null, (RequestOptions) null);
  }
  /**
   * Confirm microdeposits amounts or descriptor code that you have received from the Send
   * Microdeposits request. Once you correctly confirm this, this US Bank Account will be verified
   * and eligible to transfer funds with.
   */
  public UsBankAccount confirmMicrodeposits(
      String id, UsBankAccountConfirmMicrodepositsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/core/vault/us_bank_accounts/%s/confirm_microdeposits",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, UsBankAccount.class);
  }
  /**
   * Send microdeposits in order to verify your US Bank Account so it is eligible to transfer funds.
   * This will start the verification process and you must Confirm Microdeposits to successfully
   * verify your US Bank Account.
   */
  public UsBankAccount sendMicrodeposits(String id) throws StripeException {
    return sendMicrodeposits(id, (RequestOptions) null);
  }
  /**
   * Send microdeposits in order to verify your US Bank Account so it is eligible to transfer funds.
   * This will start the verification process and you must Confirm Microdeposits to successfully
   * verify your US Bank Account.
   */
  public UsBankAccount sendMicrodeposits(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/core/vault/us_bank_accounts/%s/send_microdeposits", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, UsBankAccount.class);
  }
}

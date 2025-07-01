// File generated from our OpenAPI spec
package com.stripe.service.v2.core.vault;

import com.stripe.exception.BlockedByStripeException;
import com.stripe.exception.ControlledByDashboardException;
import com.stripe.exception.InvalidPaymentMethodException;
import com.stripe.exception.QuotaExceededException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.vault.UsBankAccount;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.vault.UsBankAccountCreateParams;
import com.stripe.param.v2.core.vault.UsBankAccountUpdateParams;

public final class UsBankAccountService extends ApiService {
  public UsBankAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
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
}

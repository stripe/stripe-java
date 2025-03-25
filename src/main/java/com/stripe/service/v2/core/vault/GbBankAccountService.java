// File generated from our OpenAPI spec
package com.stripe.service.v2.core.vault;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.vault.GbBankAccount;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.core.vault.GbBankAccountCreateParams;
import com.stripe.param.v2.core.vault.GbBankAccountInitiateConfirmationOfPayeeParams;

public final class GbBankAccountService extends ApiService {
  public GbBankAccountService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Confirm that you have received the result of the Confirmation of Payee request, and that you
   * are okay with proceeding to pay out to this bank account despite the account not matching,
   * partially matching, or the service being unavailable. Once you confirm this, you will be able
   * to send OutboundPayments, but this may lead to funds being sent to the wrong account, which we
   * might not be able to recover.
   */
  public GbBankAccount acknowledgeConfirmationOfPayee(String id) throws StripeException {
    return acknowledgeConfirmationOfPayee(id, (RequestOptions) null);
  }
  /**
   * Confirm that you have received the result of the Confirmation of Payee request, and that you
   * are okay with proceeding to pay out to this bank account despite the account not matching,
   * partially matching, or the service being unavailable. Once you confirm this, you will be able
   * to send OutboundPayments, but this may lead to funds being sent to the wrong account, which we
   * might not be able to recover.
   */
  public GbBankAccount acknowledgeConfirmationOfPayee(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/core/vault/gb_bank_accounts/%s/acknowledge_confirmation_of_payee",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, GbBankAccount.class);
  }
  /**
   * Archive a GbBankAccount object. Archived GbBankAccount objects cannot be used as outbound
   * destinations and will not appear in the outbound destination list.
   */
  public GbBankAccount archive(String id) throws StripeException {
    return archive(id, (RequestOptions) null);
  }
  /**
   * Archive a GbBankAccount object. Archived GbBankAccount objects cannot be used as outbound
   * destinations and will not appear in the outbound destination list.
   */
  public GbBankAccount archive(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/core/vault/gb_bank_accounts/%s/archive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, GbBankAccount.class);
  }
  /** Create a GB bank account. */
  public GbBankAccount create(GbBankAccountCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a GB bank account. */
  public GbBankAccount create(GbBankAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/core/vault/gb_bank_accounts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GbBankAccount.class);
  }
  /**
   * Initiate Confirmation of Payee (CoP) in order to verify that the owner of a UK bank account
   * matches who you expect. This must be done on all UK bank accounts before sending domestic
   * OutboundPayments. If the result is a partial match or a non match, explicit acknowledgement
   * using AcknowledgeConfirmationOfPayee is required before sending funds.
   */
  public GbBankAccount initiateConfirmationOfPayee(
      String id, GbBankAccountInitiateConfirmationOfPayeeParams params) throws StripeException {
    return initiateConfirmationOfPayee(id, params, (RequestOptions) null);
  }
  /**
   * Initiate Confirmation of Payee (CoP) in order to verify that the owner of a UK bank account
   * matches who you expect. This must be done on all UK bank accounts before sending domestic
   * OutboundPayments. If the result is a partial match or a non match, explicit acknowledgement
   * using AcknowledgeConfirmationOfPayee is required before sending funds.
   */
  public GbBankAccount initiateConfirmationOfPayee(String id, RequestOptions options)
      throws StripeException {
    return initiateConfirmationOfPayee(
        id, (GbBankAccountInitiateConfirmationOfPayeeParams) null, options);
  }
  /**
   * Initiate Confirmation of Payee (CoP) in order to verify that the owner of a UK bank account
   * matches who you expect. This must be done on all UK bank accounts before sending domestic
   * OutboundPayments. If the result is a partial match or a non match, explicit acknowledgement
   * using AcknowledgeConfirmationOfPayee is required before sending funds.
   */
  public GbBankAccount initiateConfirmationOfPayee(String id) throws StripeException {
    return initiateConfirmationOfPayee(
        id, (GbBankAccountInitiateConfirmationOfPayeeParams) null, (RequestOptions) null);
  }
  /**
   * Initiate Confirmation of Payee (CoP) in order to verify that the owner of a UK bank account
   * matches who you expect. This must be done on all UK bank accounts before sending domestic
   * OutboundPayments. If the result is a partial match or a non match, explicit acknowledgement
   * using AcknowledgeConfirmationOfPayee is required before sending funds.
   */
  public GbBankAccount initiateConfirmationOfPayee(
      String id, GbBankAccountInitiateConfirmationOfPayeeParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/core/vault/gb_bank_accounts/%s/initiate_confirmation_of_payee",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GbBankAccount.class);
  }
  /** Retrieve a GB bank account. */
  public GbBankAccount retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a GB bank account. */
  public GbBankAccount retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/core/vault/gb_bank_accounts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, GbBankAccount.class);
  }
}

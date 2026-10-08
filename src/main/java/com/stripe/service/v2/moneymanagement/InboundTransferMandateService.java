// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.AlreadyExistsException;
import com.stripe.exception.ServiceUnavailableException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.InboundTransferMandate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.InboundTransferMandateCreateParams;
import com.stripe.param.v2.moneymanagement.InboundTransferMandateListParams;

public final class InboundTransferMandateService extends ApiService {
  public InboundTransferMandateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve a list of InboundTransferMandates for the authenticated compartment. */
  public StripeCollection<InboundTransferMandate> list(InboundTransferMandateListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieve a list of InboundTransferMandates for the authenticated compartment. */
  public StripeCollection<InboundTransferMandate> list(RequestOptions options)
      throws StripeException {
    return list((InboundTransferMandateListParams) null, options);
  }
  /** Retrieve a list of InboundTransferMandates for the authenticated compartment. */
  public StripeCollection<InboundTransferMandate> list() throws StripeException {
    return list((InboundTransferMandateListParams) null, (RequestOptions) null);
  }
  /** Retrieve a list of InboundTransferMandates for the authenticated compartment. */
  public StripeCollection<InboundTransferMandate> list(
      InboundTransferMandateListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/inbound_transfer_mandates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<InboundTransferMandate>>() {}.getType());
  }
  /**
   * Create an InboundTransferMandate for a v2 credential. If a pending or active mandate already
   * exists for the same user and credential, that mandate is returned instead of creating a new
   * one.
   */
  public InboundTransferMandate create(InboundTransferMandateCreateParams params)
      throws StripeException, AlreadyExistsException, ServiceUnavailableException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Create an InboundTransferMandate for a v2 credential. If a pending or active mandate already
   * exists for the same user and credential, that mandate is returned instead of creating a new
   * one.
   */
  public InboundTransferMandate create(
      InboundTransferMandateCreateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException, ServiceUnavailableException {
    String path = "/v2/money_management/inbound_transfer_mandates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InboundTransferMandate.class);
  }
  /** Retrieve an InboundTransferMandate by ID. */
  public InboundTransferMandate retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve an InboundTransferMandate by ID. */
  public InboundTransferMandate retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/inbound_transfer_mandates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, InboundTransferMandate.class);
  }
  /** Cancel a pending or active InboundTransferMandate. */
  public InboundTransferMandate cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel a pending or active InboundTransferMandate. */
  public InboundTransferMandate cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/inbound_transfer_mandates/%s/cancel",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, InboundTransferMandate.class);
  }
}

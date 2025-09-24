// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.RecipientVerification;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.RecipientVerificationCreateParams;

public final class RecipientVerificationService extends ApiService {
  public RecipientVerificationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates a RecipientVerification to verify the recipient you intend to send funds to. */
  public RecipientVerification create(RecipientVerificationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a RecipientVerification to verify the recipient you intend to send funds to. */
  public RecipientVerification create(
      RecipientVerificationCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/recipient_verifications";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RecipientVerification.class);
  }
  /**
   * Retrieves the details of an existing RecipientVerification by passing the unique
   * RecipientVerification ID.
   */
  public RecipientVerification retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing RecipientVerification by passing the unique
   * RecipientVerification ID.
   */
  public RecipientVerification retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/recipient_verifications/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RecipientVerification.class);
  }
  /**
   * Acknowledges an existing RecipientVerification. Only RecipientVerification awaiting
   * acknowledgement can be acknowledged.
   */
  public RecipientVerification acknowledge(String id) throws StripeException {
    return acknowledge(id, (RequestOptions) null);
  }
  /**
   * Acknowledges an existing RecipientVerification. Only RecipientVerification awaiting
   * acknowledgement can be acknowledged.
   */
  public RecipientVerification acknowledge(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/recipient_verifications/%s/acknowledge",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RecipientVerification.class);
  }
}

// File generated from our OpenAPI spec
package com.stripe.service.v2.testhelpers;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.RecipientVerification;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.testhelpers.MoneyManagementRecipientVerificationsParams;

public final class MoneyManagementService extends ApiService {
  public MoneyManagementService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a RecipientVerification with a specified match result for testing purposes in a Sandbox
   * environment.
   */
  public RecipientVerification recipientVerifications(
      MoneyManagementRecipientVerificationsParams params) throws StripeException {
    return recipientVerifications(params, (RequestOptions) null);
  }
  /**
   * Creates a RecipientVerification with a specified match result for testing purposes in a Sandbox
   * environment.
   */
  public RecipientVerification recipientVerifications(
      MoneyManagementRecipientVerificationsParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/test_helpers/money_management/recipient_verifications";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RecipientVerification.class);
  }
}

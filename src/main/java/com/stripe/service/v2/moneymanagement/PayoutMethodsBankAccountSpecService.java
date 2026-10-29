// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.PayoutMethodsBankAccountSpec;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.PayoutMethodsBankAccountSpecRetrieveParams;

public final class PayoutMethodsBankAccountSpecService extends ApiService {
  public PayoutMethodsBankAccountSpecService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Fetch the specifications for a set of countries to know which credential fields are required,
   * the validations for each fields, and how to translate these country-specific fields to the
   * generic fields in the PayoutMethodBankAccount type.
   */
  public PayoutMethodsBankAccountSpec retrieve(PayoutMethodsBankAccountSpecRetrieveParams params)
      throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /**
   * Fetch the specifications for a set of countries to know which credential fields are required,
   * the validations for each fields, and how to translate these country-specific fields to the
   * generic fields in the PayoutMethodBankAccount type.
   */
  public PayoutMethodsBankAccountSpec retrieve(RequestOptions options) throws StripeException {
    return retrieve((PayoutMethodsBankAccountSpecRetrieveParams) null, options);
  }
  /**
   * Fetch the specifications for a set of countries to know which credential fields are required,
   * the validations for each fields, and how to translate these country-specific fields to the
   * generic fields in the PayoutMethodBankAccount type.
   */
  public PayoutMethodsBankAccountSpec retrieve() throws StripeException {
    return retrieve((PayoutMethodsBankAccountSpecRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Fetch the specifications for a set of countries to know which credential fields are required,
   * the validations for each fields, and how to translate these country-specific fields to the
   * generic fields in the PayoutMethodBankAccount type.
   */
  public PayoutMethodsBankAccountSpec retrieve(
      PayoutMethodsBankAccountSpecRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/payout_methods_bank_account_spec";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PayoutMethodsBankAccountSpec.class);
  }
}

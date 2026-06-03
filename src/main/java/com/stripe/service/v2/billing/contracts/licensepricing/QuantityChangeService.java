// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.contracts.licensepricing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.ContractLicensePricingQuantityChange;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.contracts.licensepricing.QuantityChangeListQuantityChangesParams;

public final class QuantityChangeService extends ApiService {
  public QuantityChangeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List license quantity changes for a contract given a license pricing ID. */
  public StripeCollection<ContractLicensePricingQuantityChange> listQuantityChanges(
      String contractId, String licensePricingId, QuantityChangeListQuantityChangesParams params)
      throws StripeException {
    return listQuantityChanges(contractId, licensePricingId, params, (RequestOptions) null);
  }
  /** List license quantity changes for a contract given a license pricing ID. */
  public StripeCollection<ContractLicensePricingQuantityChange> listQuantityChanges(
      String contractId, String licensePricingId, RequestOptions options) throws StripeException {
    return listQuantityChanges(
        contractId, licensePricingId, (QuantityChangeListQuantityChangesParams) null, options);
  }
  /** List license quantity changes for a contract given a license pricing ID. */
  public StripeCollection<ContractLicensePricingQuantityChange> listQuantityChanges(
      String contractId, String licensePricingId) throws StripeException {
    return listQuantityChanges(
        contractId,
        licensePricingId,
        (QuantityChangeListQuantityChangesParams) null,
        (RequestOptions) null);
  }
  /** List license quantity changes for a contract given a license pricing ID. */
  public StripeCollection<ContractLicensePricingQuantityChange> listQuantityChanges(
      String contractId,
      String licensePricingId,
      QuantityChangeListQuantityChangesParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/contracts/%s/license_pricing/%s/quantity_changes",
            ApiResource.urlEncodeId(contractId), ApiResource.urlEncodeId(licensePricingId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request,
        new TypeToken<StripeCollection<ContractLicensePricingQuantityChange>>() {}.getType());
  }
}

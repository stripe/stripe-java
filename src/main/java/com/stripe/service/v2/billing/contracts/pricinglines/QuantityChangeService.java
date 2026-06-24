// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.contracts.pricinglines;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.ContractPricingLineQuantityChange;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.contracts.pricinglines.QuantityChangeListContractPricingLineQuantityChangesParams;

public final class QuantityChangeService extends ApiService {
  public QuantityChangeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List quantity changes for a pricing line on a contract. */
  public StripeCollection<ContractPricingLineQuantityChange> listContractPricingLineQuantityChanges(
      String contractId,
      String pricingLineId,
      QuantityChangeListContractPricingLineQuantityChangesParams params)
      throws StripeException {
    return listContractPricingLineQuantityChanges(
        contractId, pricingLineId, params, (RequestOptions) null);
  }
  /** List quantity changes for a pricing line on a contract. */
  public StripeCollection<ContractPricingLineQuantityChange> listContractPricingLineQuantityChanges(
      String contractId, String pricingLineId, RequestOptions options) throws StripeException {
    return listContractPricingLineQuantityChanges(
        contractId,
        pricingLineId,
        (QuantityChangeListContractPricingLineQuantityChangesParams) null,
        options);
  }
  /** List quantity changes for a pricing line on a contract. */
  public StripeCollection<ContractPricingLineQuantityChange> listContractPricingLineQuantityChanges(
      String contractId, String pricingLineId) throws StripeException {
    return listContractPricingLineQuantityChanges(
        contractId,
        pricingLineId,
        (QuantityChangeListContractPricingLineQuantityChangesParams) null,
        (RequestOptions) null);
  }
  /** List quantity changes for a pricing line on a contract. */
  public StripeCollection<ContractPricingLineQuantityChange> listContractPricingLineQuantityChanges(
      String contractId,
      String pricingLineId,
      QuantityChangeListContractPricingLineQuantityChangesParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/contracts/%s/pricing_lines/%s/quantity_changes",
            ApiResource.urlEncodeId(contractId), ApiResource.urlEncodeId(pricingLineId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ContractPricingLineQuantityChange>>() {}.getType());
  }
}

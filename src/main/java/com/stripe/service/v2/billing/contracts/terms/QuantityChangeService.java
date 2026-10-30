// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.contracts.terms;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.ContractTermQuantityChange;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.contracts.terms.QuantityChangeListContractTermQuantityChangesParams;

public final class QuantityChangeService extends ApiService {
  public QuantityChangeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List quantity changes for a licensed recurring-price term. */
  public StripeCollection<ContractTermQuantityChange> listContractTermQuantityChanges(
      String contractId, String term, QuantityChangeListContractTermQuantityChangesParams params)
      throws StripeException {
    return listContractTermQuantityChanges(contractId, term, params, (RequestOptions) null);
  }
  /** List quantity changes for a licensed recurring-price term. */
  public StripeCollection<ContractTermQuantityChange> listContractTermQuantityChanges(
      String contractId, String term, RequestOptions options) throws StripeException {
    return listContractTermQuantityChanges(
        contractId, term, (QuantityChangeListContractTermQuantityChangesParams) null, options);
  }
  /** List quantity changes for a licensed recurring-price term. */
  public StripeCollection<ContractTermQuantityChange> listContractTermQuantityChanges(
      String contractId, String term) throws StripeException {
    return listContractTermQuantityChanges(
        contractId,
        term,
        (QuantityChangeListContractTermQuantityChangesParams) null,
        (RequestOptions) null);
  }
  /** List quantity changes for a licensed recurring-price term. */
  public StripeCollection<ContractTermQuantityChange> listContractTermQuantityChanges(
      String contractId,
      String term,
      QuantityChangeListContractTermQuantityChangesParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/contracts/%s/terms/%s/quantity_changes",
            ApiResource.urlEncodeId(contractId), ApiResource.urlEncodeId(term));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ContractTermQuantityChange>>() {}.getType());
  }
}

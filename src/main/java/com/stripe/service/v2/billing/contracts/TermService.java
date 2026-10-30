// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.contracts;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.ContractTerm;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.contracts.TermListContractTermsParams;

public final class TermService extends ApiService {
  public TermService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List the terms on a contract, optionally filtered by type. */
  public StripeCollection<ContractTerm> listContractTerms(
      String contractId, TermListContractTermsParams params) throws StripeException {
    return listContractTerms(contractId, params, (RequestOptions) null);
  }
  /** List the terms on a contract, optionally filtered by type. */
  public StripeCollection<ContractTerm> listContractTerms(String contractId, RequestOptions options)
      throws StripeException {
    return listContractTerms(contractId, (TermListContractTermsParams) null, options);
  }
  /** List the terms on a contract, optionally filtered by type. */
  public StripeCollection<ContractTerm> listContractTerms(String contractId)
      throws StripeException {
    return listContractTerms(contractId, (TermListContractTermsParams) null, (RequestOptions) null);
  }
  /** List the terms on a contract, optionally filtered by type. */
  public StripeCollection<ContractTerm> listContractTerms(
      String contractId, TermListContractTermsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/billing/contracts/%s/terms", ApiResource.urlEncodeId(contractId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ContractTerm>>() {}.getType());
  }
  /** Retrieve a term on a contract. */
  public ContractTerm retrieveContractTerm(String contractId, String id) throws StripeException {
    return retrieveContractTerm(contractId, id, (RequestOptions) null);
  }
  /** Retrieve a term on a contract. */
  public ContractTerm retrieveContractTerm(String contractId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/contracts/%s/terms/%s",
            ApiResource.urlEncodeId(contractId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ContractTerm.class);
  }

  public com.stripe.service.v2.billing.contracts.terms.QuantityChangeService quantityChanges() {
    return new com.stripe.service.v2.billing.contracts.terms.QuantityChangeService(
        this.getResponseGetter());
  }
}

// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.FraudLiabilityDebit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.FraudLiabilityDebitListParams;
import com.stripe.param.issuing.FraudLiabilityDebitRetrieveParams;

public final class FraudLiabilityDebitService extends ApiService {
  public FraudLiabilityDebitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<FraudLiabilityDebit> list(FraudLiabilityDebitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<FraudLiabilityDebit> list(RequestOptions options) throws StripeException {
    return list((FraudLiabilityDebitListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<FraudLiabilityDebit> list() throws StripeException {
    return list((FraudLiabilityDebitListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<FraudLiabilityDebit> list(
      FraudLiabilityDebitListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/fraud_liability_debits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<FraudLiabilityDebit>>() {}.getType());
  }
  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public FraudLiabilityDebit retrieve(String id, FraudLiabilityDebitRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public FraudLiabilityDebit retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FraudLiabilityDebitRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public FraudLiabilityDebit retrieve(String id) throws StripeException {
    return retrieve(id, (FraudLiabilityDebitRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public FraudLiabilityDebit retrieve(
      String id, FraudLiabilityDebitRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/fraud_liability_debits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FraudLiabilityDebit.class);
  }
}

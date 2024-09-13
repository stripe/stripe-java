// File generated from our OpenAPI spec
package com.stripe.service.issuing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.DisputeSettlementDetail;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.DisputeSettlementDetailListParams;
import com.stripe.param.issuing.DisputeSettlementDetailRetrieveParams;

public final class DisputeSettlementDetailService extends ApiService {
  public DisputeSettlementDetailService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<DisputeSettlementDetail> list(DisputeSettlementDetailListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<DisputeSettlementDetail> list(RequestOptions options)
      throws StripeException {
    return list((DisputeSettlementDetailListParams) null, options);
  }
  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<DisputeSettlementDetail> list() throws StripeException {
    return list((DisputeSettlementDetailListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public StripeCollection<DisputeSettlementDetail> list(
      DisputeSettlementDetailListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/dispute_settlement_details";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<DisputeSettlementDetail>>() {}.getType());
  }
  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public DisputeSettlementDetail retrieve(
      String disputeSettlementDetail, DisputeSettlementDetailRetrieveParams params)
      throws StripeException {
    return retrieve(disputeSettlementDetail, params, (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public DisputeSettlementDetail retrieve(String disputeSettlementDetail, RequestOptions options)
      throws StripeException {
    return retrieve(disputeSettlementDetail, (DisputeSettlementDetailRetrieveParams) null, options);
  }
  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public DisputeSettlementDetail retrieve(String disputeSettlementDetail) throws StripeException {
    return retrieve(
        disputeSettlementDetail,
        (DisputeSettlementDetailRetrieveParams) null,
        (RequestOptions) null);
  }
  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public DisputeSettlementDetail retrieve(
      String disputeSettlementDetail,
      DisputeSettlementDetailRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/dispute_settlement_details/%s",
            ApiResource.urlEncodeId(disputeSettlementDetail));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, DisputeSettlementDetail.class);
  }
}

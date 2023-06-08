// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.AcceptedFinancingRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** This is an object representing financing that has been accepted by a merchant. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AcceptedFinancing extends ApiResource implements HasId {
  @SerializedName("accepted_advance_amount")
  Long acceptedAdvanceAmount;

  @SerializedName("accepted_at")
  Long acceptedAt;

  @SerializedName("accepted_premium_amount")
  Long acceptedPremiumAmount;

  @SerializedName("accepted_withhold_rate")
  BigDecimal acceptedWithholdRate;

  @SerializedName("currency")
  String currency;

  @SerializedName("financing_type")
  String financingType;

  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("is_refill")
  Boolean isRefill;

  @SerializedName("merchant")
  String merchant;

  @SerializedName("object")
  String object;

  @SerializedName("state")
  String state;

  /** Returns the Accepted Financing offers for a merchant. */
  public static AcceptedFinancingCollection retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Returns the Accepted Financing offers for a merchant. */
  public static AcceptedFinancingCollection retrieve(RequestOptions options)
      throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Returns the Accepted Financing offers for a merchant. */
  public static AcceptedFinancingCollection retrieve(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/capital/financing/accepted");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, AcceptedFinancingCollection.class, options);
  }

  /** Returns the Accepted Financing offers for a merchant. */
  public static AcceptedFinancingCollection retrieve(
      AcceptedFinancingRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/capital/financing/accepted");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, AcceptedFinancingCollection.class, options);
  }
}

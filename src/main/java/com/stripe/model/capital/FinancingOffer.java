// File generated from our OpenAPI spec
package com.stripe.model.capital;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingOfferListParams;
import com.stripe.param.capital.FinancingOfferMarkDeliveredParams;
import com.stripe.param.capital.FinancingOfferRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This is an object representing an offer of financing from Stripe Capital to a Connect subaccount.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancingOffer extends ApiResource implements HasId {
  /**
   * This is an object representing the terms of an offer of financing from Stripe Capital to a
   * Connected account. This resource represents the terms accepted by the Connected account, which
   * may differ from those offered.
   */
  @SerializedName("accepted_terms")
  AcceptedTerms acceptedTerms;

  /** The ID of the merchant associated with this financing object. */
  @SerializedName("account")
  String account;

  /**
   * The time at which this financing offer was charged off, if applicable. Given in seconds since
   * unix epoch.
   */
  @SerializedName("charged_off_at")
  Long chargedOffAt;

  /** Time at which the offer was created. Given in seconds since unix epoch. */
  @SerializedName("created")
  Long created;

  /** Time at which the offer expires. Given in seconds since unix epoch. */
  @SerializedName("expires_after")
  BigDecimal expiresAfter;

  /**
   * The type of financing being offered.
   *
   * <p>One of {@code cash_advance}, or {@code flex_loan}.
   */
  @SerializedName("financing_type")
  String financingType;

  /** A unique identifier for the financing object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The object type: financing_offer.
   *
   * <p>Equal to {@code capital.financing_offer}.
   */
  @SerializedName("object")
  String object;

  /**
   * This is an object representing the terms of an offer of financing from Stripe Capital to a
   * Connected account. This resource represents both the terms offered to the Connected account.
   */
  @SerializedName("offered_terms")
  OfferedTerms offeredTerms;

  /**
   * Financing product identifier.
   *
   * <p>One of {@code refill}, or {@code standard}.
   */
  @SerializedName("product_type")
  String productType;

  /** The ID of the financing offer that replaced this offer. */
  @SerializedName("replacement")
  String replacement;

  /** The ID of the financing offer that this offer is a replacement for. */
  @SerializedName("replacement_for")
  String replacementFor;

  /**
   * The current status of the offer.
   *
   * <p>One of {@code accepted}, {@code canceled}, {@code completed}, {@code delivered}, {@code
   * expired}, {@code fully_repaid}, {@code paid_out}, {@code rejected}, {@code replaced}, or {@code
   * undelivered}.
   */
  @SerializedName("status")
  String status;

  /**
   * See <a
   * href="https://stripe.com/docs/api/capital/connect_financing_object#financing_offer_object-financing_type">financing_type</a>.
   *
   * <p>One of {@code cash_advance}, {@code fixed_term_loan}, or {@code flex_loan}.
   */
  @SerializedName("type")
  String type;

  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public static FinancingOfferCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public static FinancingOfferCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/capital/financing_offers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FinancingOfferCollection.class);
  }

  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public static FinancingOfferCollection list(FinancingOfferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public static FinancingOfferCollection list(
      FinancingOfferListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_offers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FinancingOfferCollection.class);
  }

  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered() throws StripeException {
    return markDelivered((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(RequestOptions options) throws StripeException {
    return markDelivered((Map<String, Object>) null, options);
  }

  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(Map<String, Object> params) throws StripeException {
    return markDelivered(params, (RequestOptions) null);
  }

  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/capital/financing_offers/%s/mark_delivered",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, FinancingOffer.class);
  }

  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(FinancingOfferMarkDeliveredParams params)
      throws StripeException {
    return markDelivered(params, (RequestOptions) null);
  }

  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(
      FinancingOfferMarkDeliveredParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/capital/financing_offers/%s/mark_delivered",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, FinancingOffer.class);
  }

  /** Get the details of the financing offer. */
  public static FinancingOffer retrieve(String financingOffer) throws StripeException {
    return retrieve(financingOffer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Get the details of the financing offer. */
  public static FinancingOffer retrieve(String financingOffer, RequestOptions options)
      throws StripeException {
    return retrieve(financingOffer, (Map<String, Object>) null, options);
  }

  /** Get the details of the financing offer. */
  public static FinancingOffer retrieve(
      String financingOffer, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/capital/financing_offers/%s", ApiResource.urlEncodeId(financingOffer));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FinancingOffer.class);
  }

  /** Get the details of the financing offer. */
  public static FinancingOffer retrieve(
      String financingOffer, FinancingOfferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/capital/financing_offers/%s", ApiResource.urlEncodeId(financingOffer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FinancingOffer.class);
  }

  /**
   * This is an object representing the terms of an offer of financing from Stripe Capital to a
   * Connected account. This resource represents the terms accepted by the Connected account, which
   * may differ from those offered.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AcceptedTerms extends StripeObject {
    /**
     * Amount of financing offered, in minor units. For example, 1,000 USD is represented as 100000.
     */
    @SerializedName("advance_amount")
    Long advanceAmount;

    /** Currency that the financing offer is transacted in. For example, {@code usd}. */
    @SerializedName("currency")
    String currency;

    /** Fixed fee amount, in minor units. For example, 100 USD is represented as 10000. */
    @SerializedName("fee_amount")
    Long feeAmount;

    /**
     * Populated when the {@code product_type} of the {@code financingoffer} is {@code refill}.
     * Represents the discount amount on remaining premium for the existing loan at payout time.
     */
    @SerializedName("previous_financing_fee_discount_amount")
    Long previousFinancingFeeDiscountAmount;

    /** Per-transaction rate at which Stripe withholds funds to repay the financing. */
    @SerializedName("withhold_rate")
    BigDecimal withholdRate;
  }

  /**
   * This is an object representing the terms of an offer of financing from Stripe Capital to a
   * Connected account. This resource represents both the terms offered to the Connected account.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OfferedTerms extends StripeObject {
    /**
     * Amount of financing offered, in minor units. For example, 1,000 USD is represented as 100000.
     */
    @SerializedName("advance_amount")
    Long advanceAmount;

    /**
     * Describes the type of user the offer is being extended to.
     *
     * <p>One of {@code newly_eligible_user}, {@code previously_eligible_user}, or {@code
     * repeat_user}.
     */
    @SerializedName("campaign_type")
    String campaignType;

    /** Currency that the financing offer is transacted in. For example, {@code usd}. */
    @SerializedName("currency")
    String currency;

    /** Fixed fee amount, in minor units. For example, 100 USD is represented as 10000. */
    @SerializedName("fee_amount")
    Long feeAmount;

    /**
     * Populated when the {@code product_type} of the {@code financingoffer} is {@code refill}.
     * Represents the discount rate percentage on remaining fee on the existing loan. When the
     * {@code financing_offer} is paid out, the {@code previous_financing_fee_discount_amount} will
     * be computed as the multiple of this rate and the remaining fee.
     */
    @SerializedName("previous_financing_fee_discount_rate")
    BigDecimal previousFinancingFeeDiscountRate;

    /** Per-transaction rate at which Stripe withholds funds to repay the financing. */
    @SerializedName("withhold_rate")
    BigDecimal withholdRate;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(acceptedTerms, responseGetter);
    trySetResponseGetter(offeredTerms, responseGetter);
  }
}

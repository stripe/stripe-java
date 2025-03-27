// File generated from our OpenAPI spec
package com.stripe.model.issuing;

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
import com.stripe.param.issuing.DisputeSettlementDetailListParams;
import com.stripe.param.issuing.DisputeSettlementDetailRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a record from the card network of a money movement or change in state for an Issuing
 * dispute. These records are included in the settlement reports that we receive from networks and
 * expose to users as Settlement objects.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DisputeSettlementDetail extends ApiResource implements HasId {
  /**
   * Disputed amount in the card’s currency and in the smallest currency unit. Usually the amount of
   * the transaction, but can differ (usually because of currency fluctuation).
   */
  @SerializedName("amount")
  Long amount;

  /** The card used to make the original transaction. */
  @SerializedName("card")
  String card;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The currency the original transaction was made in. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the linked dispute. */
  @SerializedName("dispute")
  String dispute;

  /**
   * The type of event corresponding to this dispute settlement detail, representing the stage in
   * the dispute network lifecycle.
   *
   * <p>One of {@code filing}, {@code loss}, {@code representment}, or {@code win}.
   */
  @SerializedName("event_type")
  String eventType;

  /** Unique identifier for the object. */
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
   * The card network for this dispute settlement detail. One of [&quot;visa&quot;,
   * &quot;mastercard&quot;, &quot;maestro&quot;]
   */
  @SerializedName("network")
  String network;

  /** Details about the transaction, such as processing dates, set by the card network. */
  @SerializedName("network_data")
  NetworkData networkData;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.dispute_settlement_detail}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the linked card network settlement. */
  @SerializedName("settlement")
  String settlement;

  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static DisputeSettlementDetailCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static DisputeSettlementDetailCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/dispute_settlement_details";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, DisputeSettlementDetailCollection.class);
  }

  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static DisputeSettlementDetailCollection list(DisputeSettlementDetailListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code DisputeSettlementDetail} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static DisputeSettlementDetailCollection list(
      DisputeSettlementDetailListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/dispute_settlement_details";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DisputeSettlementDetailCollection.class);
  }

  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public static DisputeSettlementDetail retrieve(String disputeSettlementDetail)
      throws StripeException {
    return retrieve(disputeSettlementDetail, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public static DisputeSettlementDetail retrieve(
      String disputeSettlementDetail, RequestOptions options) throws StripeException {
    return retrieve(disputeSettlementDetail, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public static DisputeSettlementDetail retrieve(
      String disputeSettlementDetail, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/dispute_settlement_details/%s",
            ApiResource.urlEncodeId(disputeSettlementDetail));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, DisputeSettlementDetail.class);
  }

  /** Retrieves an Issuing {@code DisputeSettlementDetail} object. */
  public static DisputeSettlementDetail retrieve(
      String disputeSettlementDetail,
      DisputeSettlementDetailRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/dispute_settlement_details/%s",
            ApiResource.urlEncodeId(disputeSettlementDetail));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DisputeSettlementDetail.class);
  }

  /**
   * For more details about NetworkData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkData extends StripeObject {
    /**
     * The date the transaction was processed by the card network. This can be different from the
     * date the seller recorded the transaction depending on when the acquirer submits the
     * transaction to the network.
     */
    @SerializedName("processing_date")
    String processingDate;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(networkData, responseGetter);
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.reserve;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Dispute;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Refund;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.reserve.ReleaseListParams;
import com.stripe.param.reserve.ReleaseRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** ReserveReleases represent the release of funds from a ReserveHold. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Release extends ApiResource implements HasId {
  /**
   * Amount released. A positive integer representing how much is released in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount")
  Long amount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Indicates which party created this ReserveRelease.
   *
   * <p>One of {@code application}, or {@code stripe}.
   */
  @SerializedName("created_by")
  String createdBy;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code reserve.release}.
   */
  @SerializedName("object")
  String object;

  /**
   * The reason for the ReserveRelease, indicating why the funds were released.
   *
   * <p>One of {@code bulk_hold_expiry}, {@code hold_released_early}, {@code hold_reversed}, or
   * {@code plan_disabled}.
   */
  @SerializedName("reason")
  String reason;

  /** The release timestamp of the funds. */
  @SerializedName("released_at")
  Long releasedAt;

  /** The ReserveHold this ReserveRelease is associated with. */
  @SerializedName("reserve_hold")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Hold> reserveHold;

  /**
   * The ReservePlan ID this ReserveRelease is associated with. This field is only populated if a
   * ReserveRelease is created by a ReservePlan disable operation, or from a scheduled ReservedHold
   * expiry.
   */
  @SerializedName("reserve_plan")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Plan> reservePlan;

  @SerializedName("source_transaction")
  SourceTransaction sourceTransaction;

  /** Get ID of expandable {@code reserveHold} object. */
  public String getReserveHold() {
    return (this.reserveHold != null) ? this.reserveHold.getId() : null;
  }

  public void setReserveHold(String id) {
    this.reserveHold = ApiResource.setExpandableFieldId(id, this.reserveHold);
  }

  /** Get expanded {@code reserveHold}. */
  public Hold getReserveHoldObject() {
    return (this.reserveHold != null) ? this.reserveHold.getExpanded() : null;
  }

  public void setReserveHoldObject(Hold expandableObject) {
    this.reserveHold = new ExpandableField<Hold>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code reservePlan} object. */
  public String getReservePlan() {
    return (this.reservePlan != null) ? this.reservePlan.getId() : null;
  }

  public void setReservePlan(String id) {
    this.reservePlan = ApiResource.setExpandableFieldId(id, this.reservePlan);
  }

  /** Get expanded {@code reservePlan}. */
  public Plan getReservePlanObject() {
    return (this.reservePlan != null) ? this.reservePlan.getExpanded() : null;
  }

  public void setReservePlanObject(Plan expandableObject) {
    this.reservePlan = new ExpandableField<Plan>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public static ReleaseCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public static ReleaseCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reserve/releases";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ReleaseCollection.class);
  }

  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public static ReleaseCollection list(ReleaseListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of ReserveReleases previously created. The ReserveReleases are returned in
   * sorted order, with the most recent ReserveReleases appearing first.
   */
  public static ReleaseCollection list(ReleaseListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/reserve/releases";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ReleaseCollection.class);
  }

  /** Retrieve a ReserveRelease. */
  public static Release retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a ReserveRelease. */
  public static Release retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a ReserveRelease. */
  public static Release retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/releases/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Release.class);
  }

  /** Retrieve a ReserveRelease. */
  public static Release retrieve(String id, ReleaseRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/reserve/releases/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Release.class);
  }

  /**
   * For more details about SourceTransaction, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SourceTransaction extends StripeObject {
    /** The ID of the dispute. */
    @SerializedName("dispute")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Dispute> dispute;

    /** The ID of the refund. */
    @SerializedName("refund")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Refund> refund;

    /**
     * The type of source transaction.
     *
     * <p>One of {@code dispute}, or {@code refund}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code dispute} object. */
    public String getDispute() {
      return (this.dispute != null) ? this.dispute.getId() : null;
    }

    public void setDispute(String id) {
      this.dispute = ApiResource.setExpandableFieldId(id, this.dispute);
    }

    /** Get expanded {@code dispute}. */
    public Dispute getDisputeObject() {
      return (this.dispute != null) ? this.dispute.getExpanded() : null;
    }

    public void setDisputeObject(Dispute expandableObject) {
      this.dispute = new ExpandableField<Dispute>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code refund} object. */
    public String getRefund() {
      return (this.refund != null) ? this.refund.getId() : null;
    }

    public void setRefund(String id) {
      this.refund = ApiResource.setExpandableFieldId(id, this.refund);
    }

    /** Get expanded {@code refund}. */
    public Refund getRefundObject() {
      return (this.refund != null) ? this.refund.getExpanded() : null;
    }

    public void setRefundObject(Refund expandableObject) {
      this.refund = new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(reserveHold, responseGetter);
    trySetResponseGetter(reservePlan, responseGetter);
    trySetResponseGetter(sourceTransaction, responseGetter);
  }
}

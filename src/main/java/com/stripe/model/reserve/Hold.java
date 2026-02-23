// File generated from our OpenAPI spec
package com.stripe.model.reserve;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.Charge;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** ReserveHolds are used to place a temporary ReserveHold on a merchant's funds. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Hold extends StripeObject implements HasId {
  /**
   * Amount reserved. A positive integer representing how much is reserved in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount")
  Long amount;

  /** Amount in cents that can be released from this ReserveHold. */
  @SerializedName("amount_releasable")
  Long amountReleasable;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Indicates which party created this ReserveHold.
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
   * Whether there are any funds available to release on this ReserveHold. Note that if the
   * ReserveHold is in the process of being released, this could be false, even though the funds
   * haven't been fully released yet.
   */
  @SerializedName("is_releasable")
  Boolean isReleasable;

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
   * <p>Equal to {@code reserve.hold}.
   */
  @SerializedName("object")
  String object;

  /**
   * The reason for the ReserveHold.
   *
   * <p>One of {@code charge}, or {@code standalone}.
   */
  @SerializedName("reason")
  String reason;

  @SerializedName("release_schedule")
  ReleaseSchedule releaseSchedule;

  /** The ReservePlan which produced this ReserveHold (i.e., resplan_123). */
  @SerializedName("reserve_plan")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Plan> reservePlan;

  /** The Charge which funded this ReserveHold (e.g., ch_123). */
  @SerializedName("source_charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> sourceCharge;

  /**
   * Which source balance type this ReserveHold reserves funds from. One of {@code bank_account},
   * {@code card}, or {@code fpx}.
   */
  @SerializedName("source_type")
  String sourceType;

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

  /** Get ID of expandable {@code sourceCharge} object. */
  public String getSourceCharge() {
    return (this.sourceCharge != null) ? this.sourceCharge.getId() : null;
  }

  public void setSourceCharge(String id) {
    this.sourceCharge = ApiResource.setExpandableFieldId(id, this.sourceCharge);
  }

  /** Get expanded {@code sourceCharge}. */
  public Charge getSourceChargeObject() {
    return (this.sourceCharge != null) ? this.sourceCharge.getExpanded() : null;
  }

  public void setSourceChargeObject(Charge expandableObject) {
    this.sourceCharge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /**
   * For more details about ReleaseSchedule, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReleaseSchedule extends StripeObject {
    /** The time after which the ReserveHold is requested to be released. */
    @SerializedName("release_after")
    Long releaseAfter;

    /**
     * The time at which the ReserveHold is scheduled to be released, automatically set to midnight
     * UTC of the day after {@code release_after}.
     */
    @SerializedName("scheduled_release")
    Long scheduledRelease;
  }
}

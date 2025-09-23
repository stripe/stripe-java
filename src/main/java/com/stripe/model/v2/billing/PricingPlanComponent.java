// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PricingPlanComponent extends StripeObject implements HasId {
  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Details if this component is a License Fee. */
  @SerializedName("license_fee")
  LicenseFee licenseFee;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** An internal key you can use to search for a particular PricingPlanComponent. */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.pricing_plan_component}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the Pricing Plan this component belongs to. */
  @SerializedName("pricing_plan")
  String pricingPlan;

  /** The ID of the Pricing Plan Version this component belongs to. */
  @SerializedName("pricing_plan_version")
  String pricingPlanVersion;

  /** Details if this component is a Rate Card. */
  @SerializedName("rate_card")
  RateCard rateCard;

  /** Details if this component is a Service Action. */
  @SerializedName("service_action")
  ServiceAction serviceAction;

  /**
   * The type of the PricingPlanComponent.
   *
   * <p>One of {@code license_fee}, {@code rate_card}, or {@code service_action}.
   */
  @SerializedName("type")
  String type;

  /** Details if this component is a License Fee. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LicenseFee extends StripeObject implements HasId {
    /** The ID of the License Fee. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** The version of the LicenseFee. Defaults to 'latest', if not specified. */
    @SerializedName("version")
    String version;
  }

  /** Details if this component is a Rate Card. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RateCard extends StripeObject implements HasId {
    /** The ID of the Rate Card. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** The version of the RateCard. Defaults to 'latest', if not specified. */
    @SerializedName("version")
    String version;
  }

  /** Details if this component is a Service Action. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ServiceAction extends StripeObject implements HasId {
    /** The ID of the service action. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;
  }
}

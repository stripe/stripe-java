// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A set of component subscriptions for a Pricing Plan Subscription. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PricingPlanSubscriptionComponents extends StripeObject {
  /** The component subscriptions of the Pricing Plan Subscription. */
  @SerializedName("components")
  List<PricingPlanSubscriptionComponents.Component> components;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.pricing_plan_subscription_components}.
   */
  @SerializedName("object")
  String object;

  /**
   * For more details about Component, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Component extends StripeObject {
    /** The ID of the License Fee Subscription. */
    @SerializedName("license_fee_subscription")
    String licenseFeeSubscription;

    /** The Pricing Plan Component associated with this component subscription. */
    @SerializedName("pricing_plan_component")
    String pricingPlanComponent;

    /** The ID of the Rate Card Subscription. */
    @SerializedName("rate_card_subscription")
    String rateCardSubscription;

    /**
     * The type of subscription.
     *
     * <p>One of {@code license_fee_subscription}, or {@code rate_card_subscription}.
     */
    @SerializedName("type")
    String type;
  }
}

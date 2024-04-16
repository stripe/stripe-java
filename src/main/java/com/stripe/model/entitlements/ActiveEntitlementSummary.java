// File generated from our OpenAPI spec
package com.stripe.model.entitlements;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A summary of a customer's active entitlements. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ActiveEntitlementSummary extends StripeObject {
  /** The customer that is entitled to this feature. */
  @SerializedName("customer")
  String customer;

  /** The list of entitlements this customer has. */
  @SerializedName("entitlements")
  ActiveEntitlementCollection entitlements;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code entitlements.active_entitlement_summary}.
   */
  @SerializedName("object")
  String object;
}

// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Whether a project is eligible to provision resources with a provider, and any outstanding KYC
 * requirements that must be satisfied first.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Eligibility extends StripeObject {
  /** Whether the project is eligible to provision resources with the provider. */
  @SerializedName("is_eligible")
  Boolean isEligible;

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
   * <p>Equal to {@code v2.provisioning.eligibility}.
   */
  @SerializedName("object")
  String object;

  /** Outstanding requirements that must be satisfied before the project is eligible, if any. */
  @SerializedName("requirements")
  List<String> requirements;
}

// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RiskSignals extends StripeObject {
  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code risk_signals}.
   */
  @SerializedName("object")
  String object;

  /**
   * Represents the status of risk signal session metadata collection. When false, the account has
   * payouts and payments disabled.
   */
  @SerializedName("session_metadata")
  Boolean sessionMetadata;
}

// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AlertTriggered extends StripeObject {
  /**
   * A billing alert is a resource that notifies you when a certain usage threshold on a meter is
   * crossed. For example, you might create a billing alert to notify you when a certain user made
   * 100 API requests.
   */
  @SerializedName("alert")
  Alert alert;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** ID of customer for which the alert triggered. */
  @SerializedName("customer")
  String customer;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.alert_triggered}.
   */
  @SerializedName("object")
  String object;

  /** The value triggering the alert. */
  @SerializedName("value")
  Long value;
}

// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AlertRecovered extends StripeObject {
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

  /** Currency for the threshold value. */
  @SerializedName("currency")
  String currency;

  /** Custom pricing unit for the threshold value. */
  @SerializedName("custom_pricing_unit")
  String customPricingUnit;

  /** ID of customer for which the alert recovered. */
  @SerializedName("customer")
  String customer;

  /** External customer ID for the customer for which the alert recovered. */
  @SerializedName("external_customer_id")
  String externalCustomerId;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.alert_recovered}.
   */
  @SerializedName("object")
  String object;

  /** The value at which the alert recovered. */
  @SerializedName("value")
  BigDecimal value;
}

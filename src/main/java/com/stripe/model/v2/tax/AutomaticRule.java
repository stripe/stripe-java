// File generated from our OpenAPI spec
package com.stripe.model.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AutomaticRule extends StripeObject implements HasId {
  /** The ID of the BillableItem. */
  @SerializedName("billable_item")
  String billableItem;

  /** The time at which the AutomaticRule object was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the AutomaticRule object. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.tax.automatic_rule}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the AutomaticRule object.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /** A TaxCode object that will be used for automatic tax calculations. */
  @SerializedName("tax_code")
  String taxCode;
}

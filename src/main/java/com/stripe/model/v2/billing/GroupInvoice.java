// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Billing Group Invoice references an empty invoice created with the billing group's settings.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GroupInvoice extends StripeObject implements HasId {
  /** Timestamp of when the BillingGroupInvoice object was created. */
  @SerializedName("created")
  Instant created;

  /** The ID of the BillingGroupInvoice object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the created Invoice object. */
  @SerializedName("invoice_id")
  String invoiceId;

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
   * <p>Equal to {@code v2.billing.group_invoice}.
   */
  @SerializedName("object")
  String object;
}

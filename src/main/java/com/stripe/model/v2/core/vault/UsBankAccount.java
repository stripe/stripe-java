// File generated from our OpenAPI spec
package com.stripe.model.v2.core.vault;

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
public class UsBankAccount extends StripeObject implements HasId {
  /** Whether this UsBankAccount object was archived. */
  @SerializedName("archived")
  Boolean archived;

  /**
   * Closed Enum. The type of bank account (checking or savings).
   *
   * <p>One of {@code checking}, or {@code savings}.
   */
  @SerializedName("bank_account_type")
  String bankAccountType;

  /**
   * The name of the bank this bank account belongs to. This field is populated automatically by
   * Stripe based on the routing number.
   */
  @SerializedName("bank_name")
  String bankName;

  /** Creation time of the object. */
  @SerializedName("created")
  Instant created;

  /** The fedwire routing number of the bank account. */
  @SerializedName("fedwire_routing_number")
  String fedwireRoutingNumber;

  /** The ID of the UsBankAccount object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last 4 digits of the account number. */
  @SerializedName("last4")
  String last4;

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
   * <p>Equal to {@code v2.core.vault.us_bank_account}.
   */
  @SerializedName("object")
  String object;

  /** The ACH routing number of the bank account. */
  @SerializedName("routing_number")
  String routingNumber;
}

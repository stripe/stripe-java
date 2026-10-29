// File generated from our OpenAPI spec
package com.stripe.model.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Use the GBBankAccounts API to create and manage GB bank account objects. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GbBankAccount extends StripeObject implements HasId {
  /**
   * Whether this bank account object was archived. Bank account objects can be archived through the
   * /archive API, and they will not be automatically archived by Stripe. Archived bank account
   * objects cannot be used as outbound destinations and will not appear in the outbound destination
   * list.
   */
  @SerializedName("archived")
  Boolean archived;

  /**
   * Closed Enum. The type of the bank account (checking or savings).
   *
   * <p>One of {@code checking}, or {@code savings}.
   */
  @SerializedName("bank_account_type")
  String bankAccountType;

  /** The name of the bank. */
  @SerializedName("bank_name")
  String bankName;

  /** Creation time. */
  @SerializedName("created")
  Instant created;

  /** The ID of the GBBankAccount object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last 4 digits of the account number or IBAN. */
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
   * <p>Equal to {@code v2.core.vault.gb_bank_account}.
   */
  @SerializedName("object")
  String object;

  /**
   * Whether the GB Bank Account is currently unusable for money movement, despite potentially being
   * correctly set up. Please reach out to Stripe Support for more information.
   */
  @SerializedName("restricted")
  Boolean restricted;

  /** The Sort Code of the bank account. */
  @SerializedName("sort_code")
  String sortCode;

  /** The list of currencies supported by this bank account. */
  @SerializedName("supported_currencies")
  List<String> supportedCurrencies;
}

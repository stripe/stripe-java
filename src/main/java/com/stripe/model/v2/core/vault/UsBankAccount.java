// File generated from our OpenAPI spec
package com.stripe.model.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Use the USBankAccounts API to create and manage US bank accounts objects that you can use to
 * receive funds. Note that these are not interchangeable with v1 Tokens.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class UsBankAccount extends StripeObject implements HasId {
  /** The alternative reference for this payout method, if it's a projected payout method. */
  @SerializedName("alternative_reference")
  AlternativeReference alternativeReference;

  /** Whether this USBankAccount object was archived. */
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

  /** The ID of the Financial Connections Account used to create the bank account. */
  @SerializedName("financial_connections_account")
  String financialConnectionsAccount;

  /** The ID of the USBankAccount object. */
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

  /** The bank account verification details. */
  @SerializedName("verification")
  Verification verification;

  /** The alternative reference for this payout method, if it's a projected payout method. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AlternativeReference extends StripeObject implements HasId {
    /** The ID of the alternative resource being referenced. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The type of the alternative reference (e.g., external_account for V1 external accounts).
     *
     * <p>One of {@code external_account}, or {@code payment_method}.
     */
    @SerializedName("type")
    String type;
  }

  /** The bank account verification details. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Verification extends StripeObject {
    /** The microdeposit verification details if the status is awaiting verification. */
    @SerializedName("microdeposit_verification_details")
    MicrodepositVerificationDetails microdepositVerificationDetails;

    /**
     * The bank account verification status.
     *
     * <p>One of {@code awaiting_verification}, {@code unverified}, {@code verification_failed}, or
     * {@code verified}.
     */
    @SerializedName("status")
    String status;

    /** The microdeposit verification details if the status is awaiting verification. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MicrodepositVerificationDetails extends StripeObject {
      /** Time when microdeposits will expire and have to be re-sent. */
      @SerializedName("expires")
      Instant expires;

      /**
       * Microdeposit type can be amounts or descriptor_type.
       *
       * <p>One of {@code amounts}, or {@code descriptor_code}.
       */
      @SerializedName("microdeposit_type")
      String microdepositType;

      /** Time when microdeposits were sent. */
      @SerializedName("sent")
      Instant sent;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
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

  /**
   * Information around the status of Confirmation of Payee matching done on this bank account.
   * Confirmation of Payee is a name matching service that must be done before making
   * OutboundPayments in the UK.
   */
  @SerializedName("confirmation_of_payee")
  ConfirmationOfPayee confirmationOfPayee;

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

  /** The Sort Code of the bank account. */
  @SerializedName("sort_code")
  String sortCode;

  /**
   * Information around the status of Confirmation of Payee matching done on this bank account.
   * Confirmation of Payee is a name matching service that must be done before making
   * OutboundPayments in the UK.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ConfirmationOfPayee extends StripeObject {
    /**
     * The result of the Confirmation of Payee check, once the check has been initiated. Closed
     * enum.
     */
    @SerializedName("result")
    Result result;

    /**
     * The current state of Confirmation of Payee on this bank account. Closed enum.
     *
     * <p>One of {@code awaiting_acknowledgement}, {@code confirmed}, or {@code uninitiated}.
     */
    @SerializedName("status")
    String status;

    /**
     * The result of the Confirmation of Payee check, once the check has been initiated. Closed
     * enum.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Result extends StripeObject {
      /** When the CoP result was created. */
      @SerializedName("created")
      Instant created;

      /**
       * Whether or not the information of the bank account matches what you have provided. Closed
       * enum.
       *
       * <p>One of {@code match}, {@code mismatch}, {@code partial_match}, or {@code unavailable}.
       */
      @SerializedName("match_result")
      String matchResult;

      /**
       * The fields that CoP service matched against. Only has value if MATCH or PARTIAL_MATCH,
       * empty otherwise.
       */
      @SerializedName("matched")
      Matched matched;

      /** Human-readable message describing the match result. */
      @SerializedName("message")
      String message;

      /** The fields that are matched against what the network has on file. */
      @SerializedName("provided")
      Provided provided;

      /**
       * The fields that CoP service matched against. Only has value if MATCH or PARTIAL_MATCH,
       * empty otherwise.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Matched extends StripeObject {
        /**
         * The business type given by the bank for this account, in case of a MATCH or
         * PARTIAL_MATCH. Closed enum.
         *
         * <p>One of {@code business}, or {@code personal}.
         */
        @SerializedName("business_type")
        String businessType;

        /** The name given by the bank for this account, in case of a MATCH or PARTIAL_MATCH. */
        @SerializedName("name")
        String name;
      }

      /** The fields that are matched against what the network has on file. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Provided extends StripeObject {
        /**
         * The provided or Legal Entity business type to match against the CoP service. Closed enum.
         *
         * <p>One of {@code business}, or {@code personal}.
         */
        @SerializedName("business_type")
        String businessType;

        /** The provided or Legal Entity name to match against the CoP service. */
        @SerializedName("name")
        String name;
      }
    }
  }
}

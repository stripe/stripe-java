// File generated from our OpenAPI spec
package com.stripe.model.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** SettlementAllocationIntent resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SettlementAllocationIntent extends StripeObject implements HasId {
  /** The amount and currency of the SettlementAllocationIntent. */
  @SerializedName("amount")
  Amount amount;

  /** Timestamp at which Settlement Intent was created . */
  @SerializedName("created")
  Instant created;

  /** Expected date when we expect to receive the funds. */
  @SerializedName("expected_settlement_date")
  Instant expectedSettlementDate;

  /** Financial Account Id where the funds are expected. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the SettlementAllocationIntent. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** List of ReceivedCredits that matched with the SettlementAllocationIntent. */
  @SerializedName("linked_credits")
  List<String> linkedCredits;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Metadata associated with the SettlementAllocationIntent. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.payments.settlement_allocation_intent}.
   */
  @SerializedName("object")
  String object;

  /** Reference for the settlement intent . The reference used by PSP to send funds to Stripe . */
  @SerializedName("reference")
  String reference;

  /**
   * Settlement Intent status.
   *
   * <p>One of {@code canceled}, {@code errored}, {@code matched}, {@code pending}, {@code settled},
   * or {@code submitted}.
   */
  @SerializedName("status")
  String status;

  /**
   * This hash contains detailed information that elaborates on the specific status of the
   * SettlementAllocationIntent. e.g the reason behind the error failure if the status is marked as
   * {@code errored}.
   */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** The amount and currency of the SettlementAllocationIntent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;
  }

  /**
   * This hash contains detailed information that elaborates on the specific status of the
   * SettlementAllocationIntent. e.g the reason behind the error failure if the status is marked as
   * {@code errored}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /**
     * Hash that provides additional information regarding the reason behind a {@code errored}
     * SettlementAllocationIntent status. It is only present when the SettlementAllocationIntent
     * status is {@code errored}.
     */
    @SerializedName("errored")
    Errored errored;

    /**
     * Hash that provides additional information regarding the reason behind a {@code errored}
     * SettlementAllocationIntent status. It is only present when the SettlementAllocationIntent
     * status is {@code errored}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errored extends StripeObject {
      /** Stripe doc link to debug the issue. */
      @SerializedName("doc_url")
      String docUrl;

      /** User Message detailing the reason code and possible resolution . */
      @SerializedName("message")
      String message;

      /**
       * Open Enum. The {@code errored} status reason.
       *
       * <p>Equal to {@code amount_mismatch}.
       */
      @SerializedName("reason_code")
      String reasonCode;
    }
  }
}

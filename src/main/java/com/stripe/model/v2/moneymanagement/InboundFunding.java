// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An InboundFunding represents an other-to-me pull movement into a FinancialAccount. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InboundFunding extends StripeObject implements HasId {
  /** The amount of the InboundFunding. */
  @SerializedName("amount")
  Amount amount;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** An arbitrary string attached to the InboundFunding. */
  @SerializedName("description")
  String description;

  /** The source of the funds. */
  @SerializedName("from")
  From from;

  /** The check lifecycle history. */
  @SerializedName("history")
  List<InboundFunding.History> history;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether the InboundFunding exists in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.inbound_funding}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current status of the InboundFunding.
   *
   * <p>One of {@code failed}, {@code processing}, {@code queued}, {@code returned}, or {@code
   * succeeded}.
   */
  @SerializedName("status")
  String status;

  /** The destination for the funds. */
  @SerializedName("to")
  To to;

  /** The source of the funds. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** The amount debited from the source. */
    @SerializedName("debited")
    Amount debited;

    /** The payment method that funds the InboundFunding. */
    @SerializedName("payment_method")
    PaymentMethod paymentMethod;

    /** The payment method that funds the InboundFunding. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethod extends StripeObject {
      /** The type of this object. */
      @SerializedName("type")
      String type;

      /** The ID of the paper check. */
      @SerializedName("us_paper_check")
      String usPaperCheck;
    }
  }

  /**
   * For more details about History, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class History extends StripeObject implements HasId {
    /** Details of the transition to failed. */
    @SerializedName("check_failed")
    CheckFailed checkFailed;

    /** Details of the transition to processing. */
    @SerializedName("check_processing")
    CheckProcessing checkProcessing;

    /** Details of the transition to queued. */
    @SerializedName("check_queued")
    CheckQueued checkQueued;

    /** Details of the transition to returned. */
    @SerializedName("check_returned")
    CheckReturned checkReturned;

    /** Details of the transition to succeeded. */
    @SerializedName("check_succeeded")
    CheckSucceeded checkSucceeded;

    /** Time at which the object was created. */
    @SerializedName("created")
    Instant created;

    /** Time at which the history entry took effect. */
    @SerializedName("effective_at")
    Instant effectiveAt;

    /** Unique identifier for the object. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The type of this object.
     *
     * <p>One of {@code check_failed}, {@code check_processing}, {@code check_queued}, {@code
     * check_returned}, or {@code check_succeeded}.
     */
    @SerializedName("type")
    String type;

    /** Details of the transition to failed. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckFailed extends StripeObject {
      /** The raw banking-partner failure code, when available. */
      @SerializedName("failure_code")
      String failureCode;

      /** The reason the check failed. */
      @SerializedName("failure_reason")
      String failureReason;
    }

    /** Details of the transition to processing. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckProcessing extends StripeObject {}

    /** Details of the transition to queued. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckQueued extends StripeObject {}

    /** Details of the transition to returned. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckReturned extends StripeObject {
      /** The raw banking-partner return code, when available. */
      @SerializedName("return_code")
      String returnCode;

      /** The reason the check was returned. */
      @SerializedName("return_reason")
      String returnReason;

      /** The ID of the reversal Transaction. */
      @SerializedName("reversal_transaction")
      String reversalTransaction;
    }

    /** Details of the transition to succeeded. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CheckSucceeded extends StripeObject {}
  }

  /** The destination for the funds. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** The amount credited to the destination. */
    @SerializedName("credited")
    Amount credited;

    /** The ID of the destination FinancialAccount. */
    @SerializedName("financial_account")
    String financialAccount;
  }
}

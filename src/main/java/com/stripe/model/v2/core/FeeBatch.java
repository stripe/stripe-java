// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A FeeBatch represents a settlement grouping of fees. It bridges the fee domain with actual money
 * movement, tracking what was settled and how.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FeeBatch extends StripeObject implements HasId {
  /** Adjustments applied to this batch. */
  @SerializedName("adjustments")
  Adjustments adjustments;

  /** The total fee amount billed in this batch. */
  @SerializedName("amount")
  Amount amount;

  /** The entity that collected this batch. */
  @SerializedName("collected_by")
  CollectedBy collectedBy;

  /** The money movement records associated with collecting this batch. */
  @SerializedName("collection_records")
  List<FeeBatch.CollectionRecord> collectionRecords;

  /** Timestamp of when this batch was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the FeeBatch. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode, or {@code false} if in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.fee_batch}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current state of this batch.
   *
   * <p>One of {@code billed}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for each status transition. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The tax amount included in this batch. */
  @SerializedName("tax")
  Tax tax;

  /** Adjustments applied to this batch. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Adjustments extends StripeObject {
    /** The amount of tax adjusted for this batch. */
    @SerializedName("tax_adjustment")
    TaxAdjustment taxAdjustment;

    /** The amount of tax adjusted for this batch. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxAdjustment extends StripeObject {
      /**
       * A lowercase alpha3 currency code like &quot;usd&quot; For the taxonomy label choice, see
       * SECURE_FRAMEWORKS-2849.
       */
      @SerializedName("currency")
      String currency;

      /**
       * In major units like &quot;1.23&quot; for 1.23 USD For the taxonomy label choice, see
       * SECURE_FRAMEWORKS-2849.
       */
      @SerializedName("value")
      String value;
    }
  }

  /** The total fee amount billed in this batch. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
    /**
     * A lowercase alpha3 currency code like &quot;usd&quot; For the taxonomy label choice, see
     * SECURE_FRAMEWORKS-2849.
     */
    @SerializedName("currency")
    String currency;

    /**
     * In major units like &quot;1.23&quot; for 1.23 USD For the taxonomy label choice, see
     * SECURE_FRAMEWORKS-2849.
     */
    @SerializedName("value")
    String value;
  }

  /** The entity that collected this batch. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CollectedBy extends StripeObject {
    /**
     * The type of entity that collected this batch.
     *
     * <p>One of {@code application}, {@code network}, or {@code stripe}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about CollectionRecord, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CollectionRecord extends StripeObject {
    /** The fee amount collected via this record. */
    @SerializedName("amount")
    Amount amount;

    /** The ID of the associated v1 balance transaction. */
    @SerializedName("balance_transaction")
    String balanceTransaction;

    /** The ID of the associated credit transaction. */
    @SerializedName("credit_transaction")
    String creditTransaction;

    /** The ID of the associated v2 money management transaction. */
    @SerializedName("money_management_transaction")
    String moneyManagementTransaction;

    /** The ID of the associated accounts-receivable invoice. */
    @SerializedName("payable_invoice")
    String payableInvoice;

    /** The tax amount collected via this record. */
    @SerializedName("tax")
    Tax tax;

    /**
     * The type of money movement object.
     *
     * <p>One of {@code balance_transaction}, {@code credit_transaction}, {@code
     * money_management_transaction}, or {@code payable_invoice}.
     */
    @SerializedName("type")
    String type;

    /** The fee amount collected via this record. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * A lowercase alpha3 currency code like &quot;usd&quot; For the taxonomy label choice, see
       * SECURE_FRAMEWORKS-2849.
       */
      @SerializedName("currency")
      String currency;

      /**
       * In major units like &quot;1.23&quot; for 1.23 USD For the taxonomy label choice, see
       * SECURE_FRAMEWORKS-2849.
       */
      @SerializedName("value")
      String value;
    }

    /** The tax amount collected via this record. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax extends StripeObject {
      /** The tax amount collected via this record. */
      @SerializedName("amount")
      Amount amount;

      /** The tax amount collected via this record. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Amount extends StripeObject {
        /**
         * A lowercase alpha3 currency code like &quot;usd&quot; For the taxonomy label choice, see
         * SECURE_FRAMEWORKS-2849.
         */
        @SerializedName("currency")
        String currency;

        /**
         * In major units like &quot;1.23&quot; for 1.23 USD For the taxonomy label choice, see
         * SECURE_FRAMEWORKS-2849.
         */
        @SerializedName("value")
        String value;
      }
    }
  }

  /** Timestamps for each status transition. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp of when the batch transitioned to BILLED, if applicable. */
    @SerializedName("billed_at")
    Instant billedAt;
  }

  /** The tax amount included in this batch. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tax extends StripeObject {
    /** The tax amount included in this batch. */
    @SerializedName("amount")
    Amount amount;

    /** The tax amount included in this batch. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * A lowercase alpha3 currency code like &quot;usd&quot; For the taxonomy label choice, see
       * SECURE_FRAMEWORKS-2849.
       */
      @SerializedName("currency")
      String currency;

      /**
       * In major units like &quot;1.23&quot; for 1.23 USD For the taxonomy label choice, see
       * SECURE_FRAMEWORKS-2849.
       */
      @SerializedName("value")
      String value;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.v2.risk;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A risk Form represents a request from Stripe for information about a connected account. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Form extends StripeObject implements HasId {
  /** Data for appeal inquiries. Only present when type is appeal. */
  @SerializedName("appeal")
  Appeal appeal;

  /**
   * Data for authorization_documents inquiries. Only present when type is authorization_documents.
   */
  @SerializedName("authorization_documents")
  AuthorizationDocuments authorizationDocuments;

  /** Time at which the Form was closed. */
  @SerializedName("closed_at")
  Instant closedAt;

  /** Time at which the Form was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the Form. */
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
   * <p>Equal to {@code v2.risk.form}.
   */
  @SerializedName("object")
  String object;

  /** Time at which the Form was opened. */
  @SerializedName("opened_at")
  Instant openedAt;

  /** Data for product_removal inquiries. Only present when type is product_removal. */
  @SerializedName("product_removal")
  ProductRemoval productRemoval;

  /** Data for self_funding_context inquiries. Only present when type is self_funding_context. */
  @SerializedName("self_funding_context")
  SelfFundingContext selfFundingContext;

  /**
   * The current status of the Form.
   *
   * <p>One of {@code closed}, or {@code open}.
   */
  @SerializedName("status")
  String status;

  /**
   * What this Form was raised about, as a typed object. Only present when the Form is scoped to a
   * specific object. Absent when the Form covers the account as a whole.
   */
  @SerializedName("subject")
  Subject subject;

  /** Data for transaction_context inquiries. Only present when type is transaction_context. */
  @SerializedName("transaction_context")
  TransactionContext transactionContext;

  /**
   * The type of Form.
   *
   * <p>One of {@code appeal}, {@code authorization_documents}, {@code product_removal}, {@code
   * self_funding_context}, or {@code transaction_context}.
   */
  @SerializedName("type")
  String type;

  /** Data for appeal inquiries. Only present when type is appeal. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Appeal extends StripeObject {
    /** A text explanation for the appeal. */
    @SerializedName("explanation")
    String explanation;
  }

  /**
   * Data for authorization_documents inquiries. Only present when type is authorization_documents.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationDocuments extends StripeObject {
    /** IDs of uploaded files to attach as authorization documents. */
    @SerializedName("files")
    List<String> files;
  }

  /** Data for product_removal inquiries. Only present when type is product_removal. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProductRemoval extends StripeObject {
    /** The timestamp when the prohibited items were removed. */
    @SerializedName("items_removed_at")
    Instant itemsRemovedAt;
  }

  /** Data for self_funding_context inquiries. Only present when type is self_funding_context. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SelfFundingContext extends StripeObject {
    /** The connected account's source of wealth. */
    @SerializedName("source_of_wealth")
    SourceOfWealth sourceOfWealth;

    /** The connected account's source of wealth. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfWealth extends StripeObject {
      /** A text explanation of the connected account's source of wealth. */
      @SerializedName("description")
      String description;

      /** IDs of uploaded files evidencing the source of wealth. */
      @SerializedName("files")
      List<String> files;
    }
  }

  /**
   * What this Form was raised about, as a typed object. Only present when the Form is scoped to a
   * specific object. Absent when the Form covers the account as a whole.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Subject extends StripeObject {
    /**
     * ID of the transaction this Form is about. Present only for transaction_context Forms. Absent
     * for other Form types.
     */
    @SerializedName("transaction")
    String transaction;

    /** IDs of the transactions this inquiry is about. */
    @SerializedName("transactions")
    List<String> transactions;
  }

  /** Data for transaction_context inquiries. Only present when type is transaction_context. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionContext extends StripeObject {
    /** The purpose of the transaction. */
    @SerializedName("purpose")
    String purpose;

    /** The connected account's relationship to the sender. Optional. */
    @SerializedName("sender_relationship")
    String senderRelationship;

    /** Where the funds for the transaction came from. */
    @SerializedName("source_of_funds")
    SourceOfFunds sourceOfFunds;

    /** How the funds from the transaction will be used. */
    @SerializedName("use_of_funds")
    String useOfFunds;

    /** Where the funds for the transaction came from. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfFunds extends StripeObject {
      /** A text explanation of where the funds for the transaction came from. */
      @SerializedName("description")
      String description;

      /** IDs of uploaded files evidencing the source of funds. */
      @SerializedName("files")
      List<String> files;
    }
  }
}

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

/** A risk inquiry represents a request from Stripe for information about a connected account. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Inquiry extends StripeObject implements HasId {
  /** Data for appeal inquiries. Only present when type is appeal. */
  @SerializedName("appeal")
  Appeal appeal;

  /**
   * Data for authorization_documents inquiries. Only present when type is authorization_documents.
   */
  @SerializedName("authorization_documents")
  AuthorizationDocuments authorizationDocuments;

  /** Time at which the inquiry was closed. */
  @SerializedName("closed_at")
  Instant closedAt;

  /** Time at which the inquiry was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the inquiry. */
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
   * <p>Equal to {@code v2.risk.inquiry}.
   */
  @SerializedName("object")
  String object;

  /** Time at which the inquiry was opened. */
  @SerializedName("opened_at")
  Instant openedAt;

  /** Data for product_removal inquiries. Only present when type is product_removal. */
  @SerializedName("product_removal")
  ProductRemoval productRemoval;

  /**
   * The current status of the inquiry.
   *
   * <p>One of {@code closed}, or {@code open}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of inquiry.
   *
   * <p>One of {@code appeal}, {@code authorization_documents}, or {@code product_removal}.
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
}

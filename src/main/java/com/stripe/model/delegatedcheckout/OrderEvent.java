// File generated from our OpenAPI spec
package com.stripe.model.delegatedcheckout;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An order event represents a change to a delegated checkout order. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OrderEvent extends StripeObject implements HasId {
  /** The adjustment details for this order event. */
  @SerializedName("adjustment")
  Adjustment adjustment;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The fulfillment details for this order event. */
  @SerializedName("fulfillment")
  Fulfillment fulfillment;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code delegated_checkout.order_event}.
   */
  @SerializedName("object")
  String object;

  /** Time at which this event occurred. Measured in seconds since the Unix epoch. */
  @SerializedName("occurred_at")
  Long occurredAt;

  /** The delegated checkout order associated with this order event. */
  @SerializedName("order")
  String order;

  /** The requested session associated with this order event. */
  @SerializedName("requested_session")
  String requestedSession;

  /**
   * The type of order event.
   *
   * <p>One of {@code adjustment}, or {@code fulfillment}.
   */
  @SerializedName("type")
  String type;

  /**
   * For more details about Adjustment, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Adjustment extends StripeObject {
    /** The amount associated with the adjustment. */
    @SerializedName("amount")
    Long amount;

    /** The currency associated with the adjustment amount. */
    @SerializedName("currency")
    String currency;

    /** The description of the adjustment. */
    @SerializedName("description")
    String description;

    /** The line items associated with the adjustment. */
    @SerializedName("line_items")
    List<OrderEvent.Adjustment.LineItem> lineItems;

    /**
     * The status of the adjustment.
     *
     * <p>One of {@code completed}, {@code failed}, or {@code pending}.
     */
    @SerializedName("status")
    String status;

    /**
     * The type of adjustment.
     *
     * <p>One of {@code cancellation}, {@code credit}, {@code dispute}, {@code
     * original_payment_refund}, {@code return}, or {@code store_credit_refund}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about LineItem, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem extends StripeObject {
      /** The line item key. */
      @SerializedName("key")
      String key;

      /** The quantity associated with the order event. */
      @SerializedName("quantity")
      Long quantity;
    }
  }

  /**
   * For more details about Fulfillment, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fulfillment extends StripeObject {
    /** The carrier for the fulfillment. */
    @SerializedName("carrier")
    String carrier;

    /** Time at which the fulfillment was delivered. Measured in seconds since the Unix epoch. */
    @SerializedName("delivered_at")
    Long deliveredAt;

    /** The line items associated with the fulfillment. */
    @SerializedName("line_items")
    List<OrderEvent.Fulfillment.LineItem> lineItems;

    /** Time at which the fulfillment shipped. Measured in seconds since the Unix epoch. */
    @SerializedName("shipped_at")
    Long shippedAt;

    /**
     * The status of the fulfillment.
     *
     * <p>One of {@code confirmed}, {@code delivered}, {@code fulfilled}, {@code pending}, {@code
     * returned}, or {@code shipped}.
     */
    @SerializedName("status")
    String status;

    /** The tracking number for the fulfillment. */
    @SerializedName("tracking_number")
    String trackingNumber;

    /** The tracking URL for the fulfillment. */
    @SerializedName("tracking_url")
    String trackingUrl;

    /**
     * For more details about LineItem, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem extends StripeObject {
      /** The line item key. */
      @SerializedName("key")
      String key;

      /** The quantity associated with the order event. */
      @SerializedName("quantity")
      Long quantity;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeteredItem extends StripeObject implements HasId {
  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /**
   * Description that customers will see in the invoice line item. Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  String displayName;

  /** The ID of the MeteredItem. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Optional array of Meter dimensions to group event dimension keys for invoice line items. */
  @SerializedName("invoice_presentation_dimensions")
  List<String> invoicePresentationDimensions;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * An internal key you can use to search for a particular billable item. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** ID of the Meter that measures usage for this MeteredItem. */
  @SerializedName("meter")
  String meter;

  /** Optional array of Meter segments to filter event dimension keys for billing. */
  @SerializedName("meter_segment_conditions")
  List<MeteredItem.MeterSegmentCondition> meterSegmentConditions;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.metered_item}.
   */
  @SerializedName("object")
  String object;

  /** Stripe Tax details. */
  @SerializedName("tax_details")
  TaxDetails taxDetails;

  /**
   * The unit to use when displaying prices for this billable item in places like Checkout. For
   * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
   * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
   * events&quot;. Maximum length of 100 characters.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /**
   * For more details about MeterSegmentCondition, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MeterSegmentCondition extends StripeObject {
    /** A Meter dimension. */
    @SerializedName("dimension")
    String dimension;

    /** To count usage towards this MeteredItem, the dimension must have this value. */
    @SerializedName("value")
    String value;
  }

  /**
   * For more details about TaxDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxDetails extends StripeObject {
    /** Product tax code (PTC). */
    @SerializedName("tax_code")
    String taxCode;
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A one-time item represents a product that can be charged as a one-time line item, used for
 * overage charges when custom pricing unit credits are exhausted.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OneTimeItem extends StripeObject implements HasId {
  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /**
   * Description that customers will see in the invoice line item. Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  String displayName;

  /** Unique identifier for the object. */
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
   * An internal key you can use to search for a particular one-time item. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.one_time_item}.
   */
  @SerializedName("object")
  String object;

  /** Stripe Tax details. */
  @SerializedName("tax_details")
  TaxDetails taxDetails;

  /**
   * The unit to use when displaying prices for this one-time item. For example, set this field to
   * &quot;credit&quot; for the display to show &quot;(price) per credit&quot;. Maximum length of
   * 100 characters.
   */
  @SerializedName("unit_label")
  String unitLabel;

  /** Stripe Tax details. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxDetails extends StripeObject {
    /** Product tax code (PTC). */
    @SerializedName("tax_code")
    String taxCode;
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Rule extends StripeObject implements HasId {
  /** The action taken on the payment. */
  @SerializedName("action")
  String action;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.rule}.
   */
  @SerializedName("object")
  String object;

  /** The predicate to evaluate the payment against. */
  @SerializedName("predicate")
  String predicate;
}

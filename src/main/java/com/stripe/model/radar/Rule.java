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

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The predicate to evaluate the payment against. */
  @SerializedName("predicate")
  String predicate;
}

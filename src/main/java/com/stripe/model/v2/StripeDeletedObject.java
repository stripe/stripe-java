package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeDeletedObject extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** String representing the object’s type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;
}

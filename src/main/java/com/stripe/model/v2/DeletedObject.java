// File generated from our OpenAPI spec
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
public class DeletedObject extends StripeObject implements HasId {
  /** The ID of the object that's being deleted. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the type of the object that has been deleted. Objects of the same type
   * share the same value of the object field.
   */
  @SerializedName("object")
  String object;
}

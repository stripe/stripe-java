package com.stripe.model.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * A reference to a Stripe object. Holds the object's id and type.
 */
@Getter
@EqualsAndHashCode(callSuper = false)
public class Ref extends StripeObject {
  /** The type of the referenced object (e.g. {@code "v2.core.account"}). */
  @SerializedName("type")
  String type;

  /** The unique identifier of the referenced object. */
  @SerializedName("id")
  String id;
}

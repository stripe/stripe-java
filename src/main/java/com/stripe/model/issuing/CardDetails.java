package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CardDetails extends StripeObject {
  @SerializedName("card")
  Card card;

  /** The CVC number for the card. */
  @SerializedName("cvc")
  String cvc;

  /** The expiration month of the card. */
  @SerializedName("exp_month")
  Long expMonth;

  /** The expiration year of the card. */
  @SerializedName("exp_year")
  Long expYear;

  /** The card number. */
  @SerializedName("number")
  String number;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `issuing.card_details`.
   */
  @SerializedName("object")
  String object;
}

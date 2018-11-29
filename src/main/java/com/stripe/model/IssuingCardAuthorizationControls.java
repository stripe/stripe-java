package com.stripe.model;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuingCardAuthorizationControls extends StripeObject {
  /**
   * Array of strings containing
   * [categories](/docs/api#issuing_authorization_object-merchant_data-category) of authorizations
   * permitted on this card.
   */
  List<String> allowedCategories;

  /**
   * Array of strings containing
   * [categories](/docs/api#issuing_authorization_object-merchant_data-category) of authorizations
   * to always decline on this card.
   */
  List<String> blockedCategories;

  /**
   * The currency of the card. See
   * [max_amount](/docs/api#issuing_card_object-authorization_controls-max_amount)
   */
  String currency;

  /**
   * Maximum amount allowed per authorization on this card, in the currency of the card.
   * Authorization amounts in a different currency will be converted to the card's currency when
   * evaluating this control.
   */
  Long maxAmount;

  /**
   * Maximum count of approved authorizations on this card. Counts all authorizations retroactively.
   */
  Long maxApprovals;
}

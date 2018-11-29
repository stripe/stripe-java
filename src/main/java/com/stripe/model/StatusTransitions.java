package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StatusTransitions extends StripeObject {
  Long canceled;

  Long fulfiled;

  Long paid;

  Long returned;
}

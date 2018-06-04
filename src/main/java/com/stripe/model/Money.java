package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Money extends StripeObject {
  Long amount;
  String currency;
  SourceTypes sourceTypes;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SourceTypes extends StripeObject {
    Long alipayAccount;
    Long bankAccount;
    Long bitcoinReceiver;
    Long card;
  }
}

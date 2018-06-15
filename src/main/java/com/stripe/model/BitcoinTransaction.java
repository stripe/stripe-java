package com.stripe.model;

import com.stripe.net.APIResource;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BitcoinTransaction extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  Long amount;
  Long bitcoinAmount;
  Long created;
  String currency;
  String customer;
  String receiver;
}

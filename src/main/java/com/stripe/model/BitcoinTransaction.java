// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BitcoinTransaction extends StripeObject implements HasId {
  /** The amount of `currency` that the transaction was converted to in real-time. */
  Long amount;

  /** The amount of bitcoin contained in the transaction. */
  Long bitcoinAmount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which this
   * transaction was converted.
   */
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The receiver to which this transaction was sent. */
  String receiver;
}

// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BitcoinTransaction extends StripeObject implements HasId {
  /** The amount of {@code currency} that the transaction was converted to in real-time. */
  @SerializedName("amount")
  Long amount;

  /** The amount of bitcoin contained in the transaction. */
  @SerializedName("bitcoin_amount")
  Long bitcoinAmount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> to
   * which this transaction was converted.
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code bitcoin_transaction}.
   */
  @SerializedName("object")
  String object;

  /** The receiver to which this transaction was sent. */
  @SerializedName("receiver")
  String receiver;
}

package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceMandateNotification extends StripeObject implements HasId {
  SourceTypeAchCreditTransfer achCreditTransfer;

  SourceTypeAchDebit achDebit;

  SourceTypeAlipay alipay;

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is `debit_initiated`.
   */
  Long amount;

  SourceTypeBancontact bancontact;

  SourceTypeCard card;

  SourceTypeCardPresent cardPresent;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  SourceTypeEps eps;

  SourceTypeGiropay giropay;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  SourceTypeIdeal ideal;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  SourceTypeMultibanco multibanco;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  SourceTypeP24 p24;

  SourceTypePaperCheck paperCheck;

  /**
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or
   * `debit_initiated`.
   */
  String reason;

  SourceTypeSepaCreditTransfer sepaCreditTransfer;

  SourceTypeSepaDebit sepaDebit;

  SourceTypeSofort sofort;

  Source source;

  /** The status of the mandate notification. Valid statuses are `pending` or `submitted`. */
  String status;

  SourceTypeThreeDSecure threeDSecure;

  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as `three_d_secure`.
   */
  String type;
}

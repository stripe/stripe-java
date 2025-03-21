// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * When a non-stripe BIN is used, any use of an <a href="https://stripe.com/docs/issuing">issued
 * card</a> must be settled directly with the card network. The net amount owed is represented by an
 * Issuing {@code Settlement} object.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Settlement extends StripeObject implements HasId {
  /** The Bank Identification Number reflecting this settlement record. */
  @SerializedName("bin")
  String bin;

  /** The date that the transactions are cleared and posted to user's accounts. */
  @SerializedName("clearing_date")
  Long clearingDate;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The total interchange received as reimbursement for the transactions. */
  @SerializedName("interchange_fees_amount")
  Long interchangeFeesAmount;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The total net amount required to settle with the network. */
  @SerializedName("net_total_amount")
  Long netTotalAmount;

  /** The card network for this settlement report. One of [&quot;visa&quot;, &quot;maestro&quot;] */
  @SerializedName("network")
  String network;

  /** The total amount of fees owed to the network. */
  @SerializedName("network_fees_amount")
  Long networkFeesAmount;

  /** The Settlement Identification Number assigned by the network. */
  @SerializedName("network_settlement_identifier")
  String networkSettlementIdentifier;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.settlement}.
   */
  @SerializedName("object")
  String object;

  /** The total amount of any additional fees assessed by the card network. */
  @SerializedName("other_fees_amount")
  Long otherFeesAmount;

  /** The total number of additional fees assessed by the card network. */
  @SerializedName("other_fees_count")
  Long otherFeesCount;

  /** One of {@code international} or {@code uk_national_net}. */
  @SerializedName("settlement_service")
  String settlementService;

  /**
   * The current processing status of this settlement.
   *
   * <p>One of {@code complete}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /** The total transaction amount reflected in this settlement. */
  @SerializedName("transaction_amount")
  Long transactionAmount;

  /** The total number of transactions reflected in this settlement. */
  @SerializedName("transaction_count")
  Long transactionCount;
}

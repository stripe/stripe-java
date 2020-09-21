// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTransaction extends StripeObject implements HasId {
  @SerializedName("ach_credit_transfer")
  AchCreditTransferData achCreditTransfer;

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount your customer has pushed to
   * the receiver.
   */
  @SerializedName("amount")
  Long amount;

  @SerializedName("chf_credit_transfer")
  ChfCreditTransferData chfCreditTransfer;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  @SerializedName("gbp_credit_transfer")
  GbpCreditTransferData gbpCreditTransfer;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code source_transaction}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("paper_check")
  PaperCheckData paperCheck;

  @SerializedName("sepa_credit_transfer")
  SepaCreditTransferData sepaCreditTransfer;

  /** The ID of the source this transaction is attached to. */
  @SerializedName("source")
  String source;

  /**
   * The status of the transaction, one of {@code succeeded}, {@code pending}, or {@code failed}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of source this transaction is attached to.
   *
   * <p>One of {@code ach_credit_transfer}, {@code ach_debit}, {@code alipay}, {@code bancontact},
   * {@code card}, {@code card_present}, {@code eps}, {@code giropay}, {@code ideal}, {@code
   * klarna}, {@code multibanco}, {@code p24}, {@code sepa_debit}, {@code sofort}, {@code
   * three_d_secure}, or {@code wechat}.
   */
  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AchCreditTransferData extends StripeObject {
    /** Customer data associated with the transfer. */
    @SerializedName("customer_data")
    String customerData;

    /** Bank account fingerprint associated with the transfer. */
    @SerializedName("fingerprint")
    String fingerprint;

    /** Last 4 digits of the account number associated with the transfer. */
    @SerializedName("last4")
    String last4;

    /** Routing number associated with the transfer. */
    @SerializedName("routing_number")
    String routingNumber;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ChfCreditTransferData extends StripeObject {
    /** Reference associated with the transfer. */
    @SerializedName("reference")
    String reference;

    /** Sender's country address. */
    @SerializedName("sender_address_country")
    String senderAddressCountry;

    /** Sender's line 1 address. */
    @SerializedName("sender_address_line1")
    String senderAddressLine1;

    /** Sender's bank account IBAN. */
    @SerializedName("sender_iban")
    String senderIban;

    /** Sender's name. */
    @SerializedName("sender_name")
    String senderName;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GbpCreditTransferData extends StripeObject {
    /**
     * Bank account fingerprint associated with the Stripe owned bank account receiving the
     * transfer.
     */
    @SerializedName("fingerprint")
    String fingerprint;

    /**
     * The credit transfer rails the sender used to push this transfer. The possible rails are:
     * Faster Payments, BACS, CHAPS, and wire transfers. Currently only Faster Payments is
     * supported.
     */
    @SerializedName("funding_method")
    String fundingMethod;

    /** Last 4 digits of sender account number associated with the transfer. */
    @SerializedName("last4")
    String last4;

    /** Sender entered arbitrary information about the transfer. */
    @SerializedName("reference")
    String reference;

    /** Sender account number associated with the transfer. */
    @SerializedName("sender_account_number")
    String senderAccountNumber;

    /** Sender name associated with the transfer. */
    @SerializedName("sender_name")
    String senderName;

    /** Sender sort code associated with the transfer. */
    @SerializedName("sender_sort_code")
    String senderSortCode;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaperCheckData extends StripeObject {
    /**
     * Time at which the deposited funds will be available for use. Measured in seconds since the
     * Unix epoch.
     */
    @SerializedName("available_at")
    String availableAt;

    /** Comma-separated list of invoice IDs associated with the paper check. */
    @SerializedName("invoices")
    String invoices;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaCreditTransferData extends StripeObject {
    /** Reference associated with the transfer. */
    @SerializedName("reference")
    String reference;

    /** Sender's bank account IBAN. */
    @SerializedName("sender_iban")
    String senderIban;

    /** Sender's name. */
    @SerializedName("sender_name")
    String senderName;
  }
}

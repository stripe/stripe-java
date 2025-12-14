// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Use the PayoutMethods API to list and interact with PayoutMethod objects. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PayoutMethod extends StripeObject implements HasId {
  /** The alternative reference for this payout method, if it's a projected payout method. */
  @SerializedName("alternative_reference")
  AlternativeReference alternativeReference;

  /** A set of available payout speeds for this payout method. */
  @SerializedName("available_payout_speeds")
  List<String> availablePayoutSpeeds;

  /** The PayoutMethodBankAccount object details. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  /** The PayoutMethodCard object details. */
  @SerializedName("card")
  Card card;

  /** Created timestamp. */
  @SerializedName("created")
  Instant created;

  /** The PayoutMethodCryptoWallet object details. */
  @SerializedName("crypto_wallet")
  CryptoWallet cryptoWallet;

  /** ID of the PayoutMethod object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the underlying active OutboundSetupIntent object, if any. */
  @SerializedName("latest_outbound_setup_intent")
  String latestOutboundSetupIntent;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.payout_method}.
   */
  @SerializedName("object")
  String object;

  /**
   * Closed Enum. The type of payout method.
   *
   * <p>One of {@code bank_account}, {@code card}, or {@code crypto_wallet}.
   */
  @SerializedName("type")
  String type;

  /**
   * Indicates whether the payout method has met the necessary requirements for outbound money
   * movement.
   */
  @SerializedName("usage_status")
  UsageStatus usageStatus;

  /** The alternative reference for this payout method, if it's a projected payout method. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AlternativeReference extends StripeObject implements HasId {
    /** The ID of the alternative resource being referenced. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The type of the alternative reference (e.g., external_account for V1 external accounts).
     *
     * <p>One of {@code external_account}, or {@code payment_method}.
     */
    @SerializedName("type")
    String type;
  }

  /** The PayoutMethodBankAccount object details. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BankAccount extends StripeObject {
    /**
     * Whether this PayoutMethodBankAccount object was archived. PayoutMethodBankAccount objects can
     * be archived through the /archive API, and they will not be automatically archived by Stripe.
     * Archived PayoutMethodBankAccount objects cannot be used as payout methods and will not appear
     * in the payout method list.
     */
    @SerializedName("archived")
    Boolean archived;

    /**
     * The type of bank account (checking or savings).
     *
     * <p>One of {@code checking}, or {@code savings}.
     */
    @SerializedName("bank_account_type")
    String bankAccountType;

    /**
     * The name of the bank this bank account is in. This field is populated automatically by
     * Stripe.
     */
    @SerializedName("bank_name")
    String bankName;

    /** The country code of the bank account. */
    @SerializedName("country")
    String country;

    /** List of enabled flows for this bank account (wire or local). */
    @SerializedName("enabled_delivery_options")
    List<String> enabledDeliveryOptions;

    /** The ID of the Financial Connections Account used to create the bank account. */
    @SerializedName("financial_connections_account")
    String financialConnectionsAccount;

    /** The last 4 digits of the account number. */
    @SerializedName("last4")
    String last4;

    /** The routing number of the bank account, if present. */
    @SerializedName("routing_number")
    String routingNumber;

    /** The list of currencies supported by this bank account. */
    @SerializedName("supported_currencies")
    List<String> supportedCurrencies;
  }

  /** The PayoutMethodCard object details. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    /**
     * Whether the PayoutMethodCard object was archived. PayoutMethodCard objects can be archived
     * through the /archive API, and they will not be automatically archived by Stripe. Archived
     * PayoutMethodCard objects cannot be used as payout methods and will not appear in the payout
     * method list.
     */
    @SerializedName("archived")
    Boolean archived;

    /** The month the card expires. */
    @SerializedName("exp_month")
    String expMonth;

    /** The year the card expires. */
    @SerializedName("exp_year")
    String expYear;

    /** The last 4 digits of the card number. */
    @SerializedName("last4")
    String last4;
  }

  /** The PayoutMethodCryptoWallet object details. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoWallet extends StripeObject {
    /** Destination wallet address. */
    @SerializedName("address")
    String address;

    /**
     * Whether the crypto wallet was archived. Crypto wallets can be archived through the /archive
     * API, and they will not be automatically archived by Stripe. Archived crypto wallets cannot be
     * used as payout method and will not appear in the payout method list.
     */
    @SerializedName("archived")
    Boolean archived;

    /** Optional field, required if network supports memos (only &quot;stellar&quot; currently). */
    @SerializedName("memo")
    String memo;

    /**
     * Which rail is being used to make an outbound money movement to this wallet.
     *
     * <p>One of {@code arbitrum}, {@code avalanche_c_chain}, {@code base}, {@code ethereum}, {@code
     * optimism}, {@code polygon}, {@code solana}, or {@code stellar}.
     */
    @SerializedName("network")
    String network;
  }

  /**
   * Indicates whether the payout method has met the necessary requirements for outbound money
   * movement.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageStatus extends StripeObject {
    /**
     * Payments status - used when sending OutboundPayments (sending funds to recipients).
     *
     * <p>One of {@code eligible}, {@code invalid}, or {@code requires_action}.
     */
    @SerializedName("payments")
    String payments;

    /**
     * Transfers status - used when making an OutboundTransfer (sending funds to yourself).
     *
     * <p>One of {@code eligible}, {@code invalid}, or {@code requires_action}.
     */
    @SerializedName("transfers")
    String transfers;
  }
}

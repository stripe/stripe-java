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

/** A FundingSession is a hosted funding surface for a customer to fund a FinancialAccount. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FundingSession extends StripeObject implements HasId {
  /** The ID of the Account that owns the FinancialAccount. */
  @SerializedName("account")
  String account;

  /** The creation timestamp of the FundingSession. */
  @SerializedName("created")
  Instant created;

  /** The ID of the FinancialAccount this FundingSession funds. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Per-type options used when creating the FinancialAddress. */
  @SerializedName("financial_address_options")
  FinancialAddressOptions financialAddressOptions;

  /** Open Enum. The types of FinancialAddress that can be funded in this session. */
  @SerializedName("financial_address_types")
  List<String> financialAddressTypes;

  /** The ID of the FundingSession. ID prefix: {@code fndsess}. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.funding_session}.
   */
  @SerializedName("object")
  String object;

  /** The URL the customer is redirected to after completing (or abandoning) the funding session. */
  @SerializedName("return_url")
  String returnUrl;

  /** The short-lived hosted funding URL the customer visits to fund the FinancialAccount. */
  @SerializedName("url")
  String url;

  /** Per-type options used when creating the FinancialAddress. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FinancialAddressOptions extends StripeObject {
    /**
     * Options for a crypto wallet FinancialAddress. Required if {@code crypto_wallet} is requested.
     */
    @SerializedName("crypto_wallet")
    CryptoWallet cryptoWallet;

    /**
     * Options for a crypto wallet FinancialAddress. Required if {@code crypto_wallet} is requested.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CryptoWallet extends StripeObject {
      /**
       * Open Enum. The currency the crypto wallet FinancialAddress settles into the
       * FinancialAccount. Required.
       */
      @SerializedName("settlement_currency")
      String settlementCurrency;
    }
  }
}

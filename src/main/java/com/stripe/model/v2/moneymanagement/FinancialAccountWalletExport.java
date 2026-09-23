// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The singleton wallet export for a FinancialAccount. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountWalletExport extends StripeObject {
  /**
   * End of the fixed one-hour credentials retrieval window. Null until the first successful
   * credential export; remains readable after expiry.
   */
  @SerializedName("credentials_available_until")
  Instant credentialsAvailableUntil;

  /** FinancialAccount whose wallet is being exported. */
  @SerializedName("financial_account")
  String financialAccount;

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
   * <p>Equal to {@code v2.money_management.financial_account_wallet_export}.
   */
  @SerializedName("object")
  String object;

  /**
   * Current wallet export status. The lifecycle is pending, ready, then complete.
   *
   * <p>One of {@code complete}, {@code pending}, or {@code ready}.
   */
  @SerializedName("status")
  String status;

  /**
   * Public wallet metadata. Null while pending or ready, and retained after the credential window
   * expires.
   */
  @SerializedName("wallets")
  List<FinancialAccountWalletExport.Wallet> wallets;

  /**
   * For more details about Wallet, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Wallet extends StripeObject {
    /** Public address of the exported wallet. */
    @SerializedName("address")
    String address;

    /** Network on which each stablecoin currency is stored. Keys are lowercase currency codes. */
    @SerializedName("currency_networks")
    Map<String, String> currencyNetworks;

    /**
     * Network family for the wallet address.
     *
     * <p>Equal to {@code ethereum}.
     */
    @SerializedName("network_type")
    String networkType;
  }
}

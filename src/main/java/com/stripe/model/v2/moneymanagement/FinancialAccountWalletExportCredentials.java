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

/** Credentials exported from a FinancialAccount wallet export. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountWalletExportCredentials extends StripeObject {
  /** End of the fixed one-hour credentials retrieval window. */
  @SerializedName("credentials_available_until")
  Instant credentialsAvailableUntil;

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
   * <p>Equal to {@code v2.money_management.financial_account_wallet_export_credentials}.
   */
  @SerializedName("object")
  String object;

  /** Exported wallets and credentials encrypted to the supplied recipient public key. */
  @SerializedName("wallets")
  List<FinancialAccountWalletExportCredentials.Wallet> wallets;

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

    /** Credentials encrypted to the supplied recipient public key. */
    @SerializedName("credentials_encrypted")
    CredentialsEncrypted credentialsEncrypted;

    /** Tempo network configured for each stablecoin currency. Keys are lowercase currency codes. */
    @SerializedName("currency_networks")
    Map<String, String> currencyNetworks;

    /**
     * Network family for the wallet address.
     *
     * <p>Equal to {@code ethereum}.
     */
    @SerializedName("network_type")
    String networkType;

    /** Credentials encrypted to the supplied recipient public key. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CredentialsEncrypted extends StripeObject {
      /** Base64url-encoded encrypted wallet credentials. Stripe does not persist this response. */
      @SerializedName("ciphertext")
      String ciphertext;

      /** Base64url-encoded HPKE encapsulated key. */
      @SerializedName("encapsulated_key")
      String encapsulatedKey;

      /**
       * Encryption scheme used for these credentials.
       *
       * <p>Equal to {@code hpke}.
       */
      @SerializedName("type")
      String type;
    }
  }
}

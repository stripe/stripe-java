// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentSimulateCryptoDepositParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The buyer's wallet address from which the crypto deposit is
   * originating.
   */
  @SerializedName("buyer_wallet")
  String buyerWallet;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The blockchain network of the simulated crypto deposit. */
  @SerializedName("network")
  Network network;

  /** <strong>Required.</strong> The token currency of the simulated crypto deposit. */
  @SerializedName("token_currency")
  TokenCurrency tokenCurrency;

  /**
   * <strong>Required.</strong> A testmode transaction hash that determines the outcome of the
   * simulated deposit.
   */
  @SerializedName("transaction_hash")
  String transactionHash;

  private PaymentIntentSimulateCryptoDepositParams(
      String buyerWallet,
      List<String> expand,
      Map<String, Object> extraParams,
      Network network,
      TokenCurrency tokenCurrency,
      String transactionHash) {
    this.buyerWallet = buyerWallet;
    this.expand = expand;
    this.extraParams = extraParams;
    this.network = network;
    this.tokenCurrency = tokenCurrency;
    this.transactionHash = transactionHash;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String buyerWallet;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Network network;

    private TokenCurrency tokenCurrency;

    private String transactionHash;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentSimulateCryptoDepositParams build() {
      return new PaymentIntentSimulateCryptoDepositParams(
          this.buyerWallet,
          this.expand,
          this.extraParams,
          this.network,
          this.tokenCurrency,
          this.transactionHash);
    }

    /**
     * <strong>Required.</strong> The buyer's wallet address from which the crypto deposit is
     * originating.
     */
    public Builder setBuyerWallet(String buyerWallet) {
      this.buyerWallet = buyerWallet;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentSimulateCryptoDepositParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentSimulateCryptoDepositParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentSimulateCryptoDepositParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentIntentSimulateCryptoDepositParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The blockchain network of the simulated crypto deposit. */
    public Builder setNetwork(PaymentIntentSimulateCryptoDepositParams.Network network) {
      this.network = network;
      return this;
    }

    /** <strong>Required.</strong> The token currency of the simulated crypto deposit. */
    public Builder setTokenCurrency(
        PaymentIntentSimulateCryptoDepositParams.TokenCurrency tokenCurrency) {
      this.tokenCurrency = tokenCurrency;
      return this;
    }

    /**
     * <strong>Required.</strong> A testmode transaction hash that determines the outcome of the
     * simulated deposit.
     */
    public Builder setTransactionHash(String transactionHash) {
      this.transactionHash = transactionHash;
      return this;
    }
  }

  public enum Network implements ApiRequestParams.EnumParam {
    @SerializedName("base")
    BASE("base"),

    @SerializedName("ethereum")
    ETHEREUM("ethereum"),

    @SerializedName("polygon")
    POLYGON("polygon"),

    @SerializedName("solana")
    SOLANA("solana"),

    @SerializedName("tempo")
    TEMPO("tempo");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Network(String value) {
      this.value = value;
    }
  }

  public enum TokenCurrency implements ApiRequestParams.EnumParam {
    @SerializedName("usdc")
    USDC("usdc"),

    @SerializedName("usdg")
    USDG("usdg"),

    @SerializedName("usdp")
    USDP("usdp");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TokenCurrency(String value) {
      this.value = value;
    }
  }
}

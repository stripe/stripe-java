// File generated from our OpenAPI spec
package com.stripe.param.crypto;

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
public class OnrampTransactionLimitsRetrieveParams extends ApiRequestParams {
  /**
   * The IP address of the customer requesting transaction limits. We support IPv4 and IPv6
   * addresses.
   */
  @SerializedName("customer_ip_address")
  String customerIpAddress;

  /** The destination blockchain network to use for limit calculations. */
  @SerializedName("destination_network")
  DestinationNetwork destinationNetwork;

  /** The destination tag for the wallet address, if applicable for the network. */
  @SerializedName("destination_tag")
  String destinationTag;

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

  /** The wallet address to use for destination-specific limit calculations. */
  @SerializedName("wallet_address")
  String walletAddress;

  private OnrampTransactionLimitsRetrieveParams(
      String customerIpAddress,
      DestinationNetwork destinationNetwork,
      String destinationTag,
      List<String> expand,
      Map<String, Object> extraParams,
      String walletAddress) {
    this.customerIpAddress = customerIpAddress;
    this.destinationNetwork = destinationNetwork;
    this.destinationTag = destinationTag;
    this.expand = expand;
    this.extraParams = extraParams;
    this.walletAddress = walletAddress;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customerIpAddress;

    private DestinationNetwork destinationNetwork;

    private String destinationTag;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String walletAddress;

    /** Finalize and obtain parameter instance from this builder. */
    public OnrampTransactionLimitsRetrieveParams build() {
      return new OnrampTransactionLimitsRetrieveParams(
          this.customerIpAddress,
          this.destinationNetwork,
          this.destinationTag,
          this.expand,
          this.extraParams,
          this.walletAddress);
    }

    /**
     * The IP address of the customer requesting transaction limits. We support IPv4 and IPv6
     * addresses.
     */
    public Builder setCustomerIpAddress(String customerIpAddress) {
      this.customerIpAddress = customerIpAddress;
      return this;
    }

    /** The destination blockchain network to use for limit calculations. */
    public Builder setDestinationNetwork(
        OnrampTransactionLimitsRetrieveParams.DestinationNetwork destinationNetwork) {
      this.destinationNetwork = destinationNetwork;
      return this;
    }

    /** The destination tag for the wallet address, if applicable for the network. */
    public Builder setDestinationTag(String destinationTag) {
      this.destinationTag = destinationTag;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OnrampTransactionLimitsRetrieveParams#expand} for the field documentation.
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
     * OnrampTransactionLimitsRetrieveParams#expand} for the field documentation.
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
     * OnrampTransactionLimitsRetrieveParams#extraParams} for the field documentation.
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
     * See {@link OnrampTransactionLimitsRetrieveParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The wallet address to use for destination-specific limit calculations. */
    public Builder setWalletAddress(String walletAddress) {
      this.walletAddress = walletAddress;
      return this;
    }
  }

  public enum DestinationNetwork implements ApiRequestParams.EnumParam {
    @SerializedName("avalanche")
    AVALANCHE("avalanche"),

    @SerializedName("base")
    BASE("base"),

    @SerializedName("bitcoin")
    BITCOIN("bitcoin"),

    @SerializedName("ethereum")
    ETHEREUM("ethereum"),

    @SerializedName("optimism")
    OPTIMISM("optimism"),

    @SerializedName("polygon")
    POLYGON("polygon"),

    @SerializedName("solana")
    SOLANA("solana"),

    @SerializedName("stellar")
    STELLAR("stellar"),

    @SerializedName("sui")
    SUI("sui"),

    @SerializedName("tempo")
    TEMPO("tempo"),

    @SerializedName("worldchain")
    WORLDCHAIN("worldchain");

    @Getter(onMethod_ = {@Override})
    private final String value;

    DestinationNetwork(String value) {
      this.value = value;
    }
  }
}

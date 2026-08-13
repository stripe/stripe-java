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
public class OnrampSessionListParams extends ApiRequestParams {
  /** Only return onramp sessions that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /** The destination cryptocurrency to filter by. */
  @SerializedName("destination_currency")
  DestinationCurrency destinationCurrency;

  /** The destination blockchain network to filter by. */
  @SerializedName("destination_network")
  DestinationNetwork destinationNetwork;

  /** An object ID cursor for use in pagination. */
  @SerializedName("ending_before")
  String endingBefore;

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

  /** A limit ranging from 1 to 100 (defaults to 10). */
  @SerializedName("limit")
  Long limit;

  /** An object ID cursor for use in pagination. */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * The status of the Onramp Session. One of = {@code {initialized, rejected, requires_payment,
   * fulfillment_processing, fulfillment_complete}}
   */
  @SerializedName("status")
  Status status;

  private OnrampSessionListParams(
      Object created,
      DestinationCurrency destinationCurrency,
      DestinationNetwork destinationNetwork,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String startingAfter,
      Status status) {
    this.created = created;
    this.destinationCurrency = destinationCurrency;
    this.destinationNetwork = destinationNetwork;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object created;

    private DestinationCurrency destinationCurrency;

    private DestinationNetwork destinationNetwork;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public OnrampSessionListParams build() {
      return new OnrampSessionListParams(
          this.created,
          this.destinationCurrency,
          this.destinationNetwork,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.startingAfter,
          this.status);
    }

    /** Only return onramp sessions that were created during the given date interval. */
    public Builder setCreated(OnrampSessionListParams.Created created) {
      this.created = created;
      return this;
    }

    /** Only return onramp sessions that were created during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** The destination cryptocurrency to filter by. */
    public Builder setDestinationCurrency(
        OnrampSessionListParams.DestinationCurrency destinationCurrency) {
      this.destinationCurrency = destinationCurrency;
      return this;
    }

    /** The destination blockchain network to filter by. */
    public Builder setDestinationNetwork(
        OnrampSessionListParams.DestinationNetwork destinationNetwork) {
      this.destinationNetwork = destinationNetwork;
      return this;
    }

    /** An object ID cursor for use in pagination. */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OnrampSessionListParams#expand} for the field documentation.
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
     * OnrampSessionListParams#expand} for the field documentation.
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
     * OnrampSessionListParams#extraParams} for the field documentation.
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
     * See {@link OnrampSessionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** A limit ranging from 1 to 100 (defaults to 10). */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** An object ID cursor for use in pagination. */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * The status of the Onramp Session. One of = {@code {initialized, rejected, requires_payment,
     * fulfillment_processing, fulfillment_complete}}
     */
    public Builder setStatus(OnrampSessionListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private Created(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public OnrampSessionListParams.Created build() {
        return new OnrampSessionListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OnrampSessionListParams.Created#extraParams} for the field documentation.
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
       * See {@link OnrampSessionListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum DestinationCurrency implements ApiRequestParams.EnumParam {
    @SerializedName("avax")
    AVAX("avax"),

    @SerializedName("btc")
    BTC("btc"),

    @SerializedName("eth")
    ETH("eth"),

    @SerializedName("matic")
    MATIC("matic"),

    @SerializedName("sol")
    SOL("sol"),

    @SerializedName("usdc")
    USDC("usdc"),

    @SerializedName("wld")
    WLD("wld"),

    @SerializedName("xlm")
    XLM("xlm");

    @Getter(onMethod_ = {@Override})
    private final String value;

    DestinationCurrency(String value) {
      this.value = value;
    }
  }

  public enum DestinationNetwork implements ApiRequestParams.EnumParam {
    @SerializedName("avalanche")
    AVALANCHE("avalanche"),

    @SerializedName("base")
    BASE("base"),

    @SerializedName("bitcoin")
    BITCOIN("bitcoin"),

    @SerializedName("celo")
    CELO("celo"),

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

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("fulfillment_complete")
    FULFILLMENT_COMPLETE("fulfillment_complete"),

    @SerializedName("fulfillment_processing")
    FULFILLMENT_PROCESSING("fulfillment_processing"),

    @SerializedName("initialized")
    INITIALIZED("initialized"),

    @SerializedName("rejected")
    REJECTED("rejected"),

    @SerializedName("requires_payment")
    REQUIRES_PAYMENT("requires_payment");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}

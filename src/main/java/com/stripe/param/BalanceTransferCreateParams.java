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
public class BalanceTransferCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> A positive integer representing how much to transfer in the smallest
   * currency unit.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  Currency currency;

  /** <strong>Required.</strong> The balance to which funds are transferred. */
  @SerializedName("destination_balance")
  DestinationBalance destinationBalance;

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

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> The balance from which funds are transferred, including details
   * specific to the balance you choose.
   */
  @SerializedName("source_balance")
  SourceBalance sourceBalance;

  private BalanceTransferCreateParams(
      Long amount,
      Currency currency,
      DestinationBalance destinationBalance,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      SourceBalance sourceBalance) {
    this.amount = amount;
    this.currency = currency;
    this.destinationBalance = destinationBalance;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.sourceBalance = sourceBalance;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Currency currency;

    private DestinationBalance destinationBalance;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private SourceBalance sourceBalance;

    /** Finalize and obtain parameter instance from this builder. */
    public BalanceTransferCreateParams build() {
      return new BalanceTransferCreateParams(
          this.amount,
          this.currency,
          this.destinationBalance,
          this.expand,
          this.extraParams,
          this.metadata,
          this.sourceBalance);
    }

    /**
     * <strong>Required.</strong> A positive integer representing how much to transfer in the
     * smallest currency unit.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrency(BalanceTransferCreateParams.Currency currency) {
      this.currency = currency;
      return this;
    }

    /** <strong>Required.</strong> The balance to which funds are transferred. */
    public Builder setDestinationBalance(
        BalanceTransferCreateParams.DestinationBalance destinationBalance) {
      this.destinationBalance = destinationBalance;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BalanceTransferCreateParams#expand} for the field documentation.
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
     * BalanceTransferCreateParams#expand} for the field documentation.
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
     * BalanceTransferCreateParams#extraParams} for the field documentation.
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
     * See {@link BalanceTransferCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * BalanceTransferCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link BalanceTransferCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The balance from which funds are transferred, including details
     * specific to the balance you choose.
     */
    public Builder setSourceBalance(BalanceTransferCreateParams.SourceBalance sourceBalance) {
      this.sourceBalance = sourceBalance;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class DestinationBalance {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Destination balance type to push funds into for the Balance
     * Transfer.
     */
    @SerializedName("type")
    Type type;

    private DestinationBalance(Map<String, Object> extraParams, Type type) {
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public BalanceTransferCreateParams.DestinationBalance build() {
        return new BalanceTransferCreateParams.DestinationBalance(this.extraParams, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceTransferCreateParams.DestinationBalance#extraParams} for the field documentation.
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
       * See {@link BalanceTransferCreateParams.DestinationBalance#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Destination balance type to push funds into for the Balance
       * Transfer.
       */
      public Builder setType(BalanceTransferCreateParams.DestinationBalance.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("issuing")
      ISSUING("issuing"),

      @SerializedName("payments")
      PAYMENTS("payments");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SourceBalance {
    @SerializedName("allocated_funds")
    AllocatedFunds allocatedFunds;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Source balance type to pull funds from for the Balance Transfer.
     */
    @SerializedName("type")
    Type type;

    private SourceBalance(
        AllocatedFunds allocatedFunds, Map<String, Object> extraParams, Type type) {
      this.allocatedFunds = allocatedFunds;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AllocatedFunds allocatedFunds;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public BalanceTransferCreateParams.SourceBalance build() {
        return new BalanceTransferCreateParams.SourceBalance(
            this.allocatedFunds, this.extraParams, this.type);
      }

      public Builder setAllocatedFunds(
          BalanceTransferCreateParams.SourceBalance.AllocatedFunds allocatedFunds) {
        this.allocatedFunds = allocatedFunds;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceTransferCreateParams.SourceBalance#extraParams} for the field documentation.
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
       * See {@link BalanceTransferCreateParams.SourceBalance#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Source balance type to pull funds from for the Balance Transfer.
       */
      public Builder setType(BalanceTransferCreateParams.SourceBalance.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AllocatedFunds {
      /**
       * <strong>Required.</strong> The charge ID that the funds are originally sourced from.
       * Required if {@code type} is {@code charge}.
       */
      @SerializedName("charge")
      String charge;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The type of object that the funds are originally sourced from.
       * One of {@code charge}.
       */
      @SerializedName("type")
      Type type;

      private AllocatedFunds(String charge, Map<String, Object> extraParams, Type type) {
        this.charge = charge;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String charge;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public BalanceTransferCreateParams.SourceBalance.AllocatedFunds build() {
          return new BalanceTransferCreateParams.SourceBalance.AllocatedFunds(
              this.charge, this.extraParams, this.type);
        }

        /**
         * <strong>Required.</strong> The charge ID that the funds are originally sourced from.
         * Required if {@code type} is {@code charge}.
         */
        public Builder setCharge(String charge) {
          this.charge = charge;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BalanceTransferCreateParams.SourceBalance.AllocatedFunds#extraParams} for
         * the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BalanceTransferCreateParams.SourceBalance.AllocatedFunds#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The type of object that the funds are originally sourced from.
         * One of {@code charge}.
         */
        public Builder setType(BalanceTransferCreateParams.SourceBalance.AllocatedFunds.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("charge")
        CHARGE("charge");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("allocated_funds")
      ALLOCATED_FUNDS("allocated_funds"),

      @SerializedName("issuing")
      ISSUING("issuing"),

      @SerializedName("payments")
      PAYMENTS("payments");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Currency implements ApiRequestParams.EnumParam {
    @SerializedName("eur")
    EUR("eur"),

    @SerializedName("gbp")
    GBP("gbp"),

    @SerializedName("usd")
    USD("usd");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Currency(String value) {
      this.value = value;
    }
  }
}

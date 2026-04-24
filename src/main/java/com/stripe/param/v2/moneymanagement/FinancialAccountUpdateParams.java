// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountUpdateParams extends ApiRequestParams {
  /**
   * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
   * in the Stripe Dashboard and embedded components.
   */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Metadata associated with the FinancialAccount. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** Parameters for updating storage-specific fields on the FinancialAccount. */
  @SerializedName("storage")
  Storage storage;

  private FinancialAccountUpdateParams(
      Object displayName,
      Map<String, Object> extraParams,
      Map<String, Object> metadata,
      Storage storage) {
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.storage = storage;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object displayName;

    private Map<String, Object> extraParams;

    private Map<String, Object> metadata;

    private Storage storage;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancialAccountUpdateParams build() {
      return new FinancialAccountUpdateParams(
          this.displayName, this.extraParams, this.metadata, this.storage);
    }

    /**
     * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
     * in the Stripe Dashboard and embedded components.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
     * in the Stripe Dashboard and embedded components.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link FinancialAccountUpdateParams#extraParams} for the field documentation.
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
     * FinancialAccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * FinancialAccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * FinancialAccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Parameters for updating storage-specific fields on the FinancialAccount. */
    public Builder setStorage(FinancialAccountUpdateParams.Storage storage) {
      this.storage = storage;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Storage {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The currencies that this storage FinancialAccount can hold a balance in. Three-letter ISO
     * currency code, in lowercase. Adding currencies requires the corresponding holds_currencies
     * storer capabilities to be enabled. Removing currencies is not supported as of March 2026.
     */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;

    private Storage(Map<String, Object> extraParams, List<String> holdsCurrencies) {
      this.extraParams = extraParams;
      this.holdsCurrencies = holdsCurrencies;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<String> holdsCurrencies;

      /** Finalize and obtain parameter instance from this builder. */
      public FinancialAccountUpdateParams.Storage build() {
        return new FinancialAccountUpdateParams.Storage(this.extraParams, this.holdsCurrencies);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FinancialAccountUpdateParams.Storage#extraParams} for the field documentation.
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
       * See {@link FinancialAccountUpdateParams.Storage#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `holdsCurrencies` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * FinancialAccountUpdateParams.Storage#holdsCurrencies} for the field documentation.
       */
      public Builder addHoldsCurrency(String element) {
        if (this.holdsCurrencies == null) {
          this.holdsCurrencies = new ArrayList<>();
        }
        this.holdsCurrencies.add(element);
        return this;
      }

      /**
       * Add all elements to `holdsCurrencies` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link FinancialAccountUpdateParams.Storage#holdsCurrencies} for the field documentation.
       */
      public Builder addAllHoldsCurrency(List<String> elements) {
        if (this.holdsCurrencies == null) {
          this.holdsCurrencies = new ArrayList<>();
        }
        this.holdsCurrencies.addAll(elements);
        return this;
      }
    }
  }
}

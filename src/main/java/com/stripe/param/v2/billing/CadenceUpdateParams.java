// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

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
public class CadenceUpdateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional resource to include in the response. */
  @SerializedName("include")
  List<CadenceUpdateParams.Include> include;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** The payer determines the entity financially responsible for the bill. */
  @SerializedName("payer")
  Payer payer;

  /** The settings associated with the cadence. */
  @SerializedName("settings")
  Settings settings;

  private CadenceUpdateParams(
      Map<String, Object> extraParams,
      List<CadenceUpdateParams.Include> include,
      Map<String, Object> metadata,
      Payer payer,
      Settings settings) {
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.payer = payer;
    this.settings = settings;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<CadenceUpdateParams.Include> include;

    private Map<String, Object> metadata;

    private Payer payer;

    private Settings settings;

    /** Finalize and obtain parameter instance from this builder. */
    public CadenceUpdateParams build() {
      return new CadenceUpdateParams(
          this.extraParams, this.include, this.metadata, this.payer, this.settings);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CadenceUpdateParams#extraParams} for the field documentation.
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
     * See {@link CadenceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CadenceUpdateParams#include} for the field documentation.
     */
    public Builder addInclude(CadenceUpdateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CadenceUpdateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<CadenceUpdateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CadenceUpdateParams#metadata} for the field documentation.
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
     * CadenceUpdateParams#metadata} for the field documentation.
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
     * CadenceUpdateParams#metadata} for the field documentation.
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

    /** The payer determines the entity financially responsible for the bill. */
    public Builder setPayer(CadenceUpdateParams.Payer payer) {
      this.payer = payer;
      return this;
    }

    /** The settings associated with the cadence. */
    public Builder setSettings(CadenceUpdateParams.Settings settings) {
      this.settings = settings;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payer {
    /** The ID of the Billing Profile object which determines how a bill will be paid. */
    @SerializedName("billing_profile")
    Object billingProfile;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Payer(Object billingProfile, Map<String, Object> extraParams) {
      this.billingProfile = billingProfile;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object billingProfile;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CadenceUpdateParams.Payer build() {
        return new CadenceUpdateParams.Payer(this.billingProfile, this.extraParams);
      }

      /** The ID of the Billing Profile object which determines how a bill will be paid. */
      public Builder setBillingProfile(String billingProfile) {
        this.billingProfile = billingProfile;
        return this;
      }

      /** The ID of the Billing Profile object which determines how a bill will be paid. */
      public Builder setBillingProfile(EmptyParam billingProfile) {
        this.billingProfile = billingProfile;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CadenceUpdateParams.Payer#extraParams} for the field documentation.
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
       * See {@link CadenceUpdateParams.Payer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings {
    /**
     * Settings that configure bills generation, which includes calculating totals, tax, and
     * presenting invoices. If null is provided, the current bill settings will be removed from the
     * billing cadence.
     */
    @SerializedName("bill")
    Bill bill;

    /**
     * Settings that configure and manage the behavior of collecting payments. If null is provided,
     * the current collection settings will be removed from the billing cadence.
     */
    @SerializedName("collection")
    Collection collection;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Settings(Bill bill, Collection collection, Map<String, Object> extraParams) {
      this.bill = bill;
      this.collection = collection;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Bill bill;

      private Collection collection;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CadenceUpdateParams.Settings build() {
        return new CadenceUpdateParams.Settings(this.bill, this.collection, this.extraParams);
      }

      /**
       * Settings that configure bills generation, which includes calculating totals, tax, and
       * presenting invoices. If null is provided, the current bill settings will be removed from
       * the billing cadence.
       */
      public Builder setBill(CadenceUpdateParams.Settings.Bill bill) {
        this.bill = bill;
        return this;
      }

      /**
       * Settings that configure and manage the behavior of collecting payments. If null is
       * provided, the current collection settings will be removed from the billing cadence.
       */
      public Builder setCollection(CadenceUpdateParams.Settings.Collection collection) {
        this.collection = collection;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CadenceUpdateParams.Settings#extraParams} for the field documentation.
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
       * See {@link CadenceUpdateParams.Settings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Bill {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the referenced settings object. */
      @SerializedName("id")
      Object id;

      /**
       * An optional field to specify the version of Settings to use. If not provided, this will
       * always default to the {@code live_version} specified on the setting, any time the settings
       * are used. Using a specific version here will prevent the settings from updating, and is
       * discouraged for cadences. To clear a pinned version, set the version to null.
       */
      @SerializedName("version")
      Object version;

      private Bill(Map<String, Object> extraParams, Object id, Object version) {
        this.extraParams = extraParams;
        this.id = id;
        this.version = version;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object id;

        private Object version;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceUpdateParams.Settings.Bill build() {
          return new CadenceUpdateParams.Settings.Bill(this.extraParams, this.id, this.version);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceUpdateParams.Settings.Bill#extraParams} for the field
         * documentation.
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
         * map. See {@link CadenceUpdateParams.Settings.Bill#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the referenced settings object. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The ID of the referenced settings object. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }

        /**
         * An optional field to specify the version of Settings to use. If not provided, this will
         * always default to the {@code live_version} specified on the setting, any time the
         * settings are used. Using a specific version here will prevent the settings from updating,
         * and is discouraged for cadences. To clear a pinned version, set the version to null.
         */
        public Builder setVersion(String version) {
          this.version = version;
          return this;
        }

        /**
         * An optional field to specify the version of Settings to use. If not provided, this will
         * always default to the {@code live_version} specified on the setting, any time the
         * settings are used. Using a specific version here will prevent the settings from updating,
         * and is discouraged for cadences. To clear a pinned version, set the version to null.
         */
        public Builder setVersion(EmptyParam version) {
          this.version = version;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Collection {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the referenced settings object. */
      @SerializedName("id")
      Object id;

      /**
       * An optional field to specify the version of Settings to use. If not provided, this will
       * always default to the {@code live_version} specified on the setting, any time the settings
       * are used. Using a specific version here will prevent the settings from updating, and is
       * discouraged for cadences. To clear a pinned version, set the version to null.
       */
      @SerializedName("version")
      Object version;

      private Collection(Map<String, Object> extraParams, Object id, Object version) {
        this.extraParams = extraParams;
        this.id = id;
        this.version = version;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object id;

        private Object version;

        /** Finalize and obtain parameter instance from this builder. */
        public CadenceUpdateParams.Settings.Collection build() {
          return new CadenceUpdateParams.Settings.Collection(
              this.extraParams, this.id, this.version);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CadenceUpdateParams.Settings.Collection#extraParams} for the field
         * documentation.
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
         * map. See {@link CadenceUpdateParams.Settings.Collection#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the referenced settings object. */
        public Builder setId(String id) {
          this.id = id;
          return this;
        }

        /** <strong>Required.</strong> The ID of the referenced settings object. */
        public Builder setId(EmptyParam id) {
          this.id = id;
          return this;
        }

        /**
         * An optional field to specify the version of Settings to use. If not provided, this will
         * always default to the {@code live_version} specified on the setting, any time the
         * settings are used. Using a specific version here will prevent the settings from updating,
         * and is discouraged for cadences. To clear a pinned version, set the version to null.
         */
        public Builder setVersion(String version) {
          this.version = version;
          return this;
        }

        /**
         * An optional field to specify the version of Settings to use. If not provided, this will
         * always default to the {@code live_version} specified on the setting, any time the
         * settings are used. Using a specific version here will prevent the settings from updating,
         * and is discouraged for cadences. To clear a pinned version, set the version to null.
         */
        public Builder setVersion(EmptyParam version) {
          this.version = version;
          return this;
        }
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("invoice_discount_rules")
    INVOICE_DISCOUNT_RULES("invoice_discount_rules");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}

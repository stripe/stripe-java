// File generated from our OpenAPI spec
package com.stripe.param.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ManualRuleCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Location where the rule applies. */
  @SerializedName("location")
  Location location;

  /** Products associated with the rule. */
  @SerializedName("products")
  List<ManualRuleCreateParams.Product> products;

  /** <strong>Required.</strong> Tax rates to be applied. */
  @SerializedName("scheduled_tax_rates")
  List<ManualRuleCreateParams.ScheduledTaxRate> scheduledTaxRates;

  private ManualRuleCreateParams(
      Map<String, Object> extraParams,
      Location location,
      List<ManualRuleCreateParams.Product> products,
      List<ManualRuleCreateParams.ScheduledTaxRate> scheduledTaxRates) {
    this.extraParams = extraParams;
    this.location = location;
    this.products = products;
    this.scheduledTaxRates = scheduledTaxRates;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Location location;

    private List<ManualRuleCreateParams.Product> products;

    private List<ManualRuleCreateParams.ScheduledTaxRate> scheduledTaxRates;

    /** Finalize and obtain parameter instance from this builder. */
    public ManualRuleCreateParams build() {
      return new ManualRuleCreateParams(
          this.extraParams, this.location, this.products, this.scheduledTaxRates);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ManualRuleCreateParams#extraParams} for the field documentation.
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
     * See {@link ManualRuleCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Location where the rule applies. */
    public Builder setLocation(ManualRuleCreateParams.Location location) {
      this.location = location;
      return this;
    }

    /**
     * Add an element to `products` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ManualRuleCreateParams#products} for the field documentation.
     */
    public Builder addProduct(ManualRuleCreateParams.Product element) {
      if (this.products == null) {
        this.products = new ArrayList<>();
      }
      this.products.add(element);
      return this;
    }

    /**
     * Add all elements to `products` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ManualRuleCreateParams#products} for the field documentation.
     */
    public Builder addAllProduct(List<ManualRuleCreateParams.Product> elements) {
      if (this.products == null) {
        this.products = new ArrayList<>();
      }
      this.products.addAll(elements);
      return this;
    }

    /**
     * Add an element to `scheduledTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ManualRuleCreateParams#scheduledTaxRates} for the field documentation.
     */
    public Builder addScheduledTaxRate(ManualRuleCreateParams.ScheduledTaxRate element) {
      if (this.scheduledTaxRates == null) {
        this.scheduledTaxRates = new ArrayList<>();
      }
      this.scheduledTaxRates.add(element);
      return this;
    }

    /**
     * Add all elements to `scheduledTaxRates` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ManualRuleCreateParams#scheduledTaxRates} for the field documentation.
     */
    public Builder addAllScheduledTaxRate(List<ManualRuleCreateParams.ScheduledTaxRate> elements) {
      if (this.scheduledTaxRates == null) {
        this.scheduledTaxRates = new ArrayList<>();
      }
      this.scheduledTaxRates.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Location {
    /** <strong>Required.</strong> Country ISO-3166. */
    @SerializedName("country")
    String country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** State ISO-3166. */
    @SerializedName("state")
    String state;

    private Location(String country, Map<String, Object> extraParams, String state) {
      this.country = country;
      this.extraParams = extraParams;
      this.state = state;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String country;

      private Map<String, Object> extraParams;

      private String state;

      /** Finalize and obtain parameter instance from this builder. */
      public ManualRuleCreateParams.Location build() {
        return new ManualRuleCreateParams.Location(this.country, this.extraParams, this.state);
      }

      /** <strong>Required.</strong> Country ISO-3166. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ManualRuleCreateParams.Location#extraParams} for the field documentation.
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
       * See {@link ManualRuleCreateParams.Location#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** State ISO-3166. */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Product {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The licensed item identifier. */
    @SerializedName("licensed_item")
    String licensedItem;

    /** The metered item identifier. */
    @SerializedName("metered_item")
    String meteredItem;

    /** The tax code for the product. */
    @SerializedName("tax_code")
    String taxCode;

    /** <strong>Required.</strong> The type of the product. */
    @SerializedName("type")
    Type type;

    private Product(
        Map<String, Object> extraParams,
        String licensedItem,
        String meteredItem,
        String taxCode,
        Type type) {
      this.extraParams = extraParams;
      this.licensedItem = licensedItem;
      this.meteredItem = meteredItem;
      this.taxCode = taxCode;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String licensedItem;

      private String meteredItem;

      private String taxCode;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ManualRuleCreateParams.Product build() {
        return new ManualRuleCreateParams.Product(
            this.extraParams, this.licensedItem, this.meteredItem, this.taxCode, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ManualRuleCreateParams.Product#extraParams} for the field documentation.
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
       * See {@link ManualRuleCreateParams.Product#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The licensed item identifier. */
      public Builder setLicensedItem(String licensedItem) {
        this.licensedItem = licensedItem;
        return this;
      }

      /** The metered item identifier. */
      public Builder setMeteredItem(String meteredItem) {
        this.meteredItem = meteredItem;
        return this;
      }

      /** The tax code for the product. */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }

      /** <strong>Required.</strong> The type of the product. */
      public Builder setType(ManualRuleCreateParams.Product.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("licensed_item")
      LICENSED_ITEM("licensed_item"),

      @SerializedName("metered_item")
      METERED_ITEM("metered_item"),

      @SerializedName("tax_code")
      TAX_CODE("tax_code");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ScheduledTaxRate {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The tax rates to be applied. */
    @SerializedName("rates")
    List<ManualRuleCreateParams.ScheduledTaxRate.Rate> rates;

    /** The start time for the tax rate. */
    @SerializedName("starts_at")
    Instant startsAt;

    private ScheduledTaxRate(
        Map<String, Object> extraParams,
        List<ManualRuleCreateParams.ScheduledTaxRate.Rate> rates,
        Instant startsAt) {
      this.extraParams = extraParams;
      this.rates = rates;
      this.startsAt = startsAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<ManualRuleCreateParams.ScheduledTaxRate.Rate> rates;

      private Instant startsAt;

      /** Finalize and obtain parameter instance from this builder. */
      public ManualRuleCreateParams.ScheduledTaxRate build() {
        return new ManualRuleCreateParams.ScheduledTaxRate(
            this.extraParams, this.rates, this.startsAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ManualRuleCreateParams.ScheduledTaxRate#extraParams} for the field documentation.
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
       * See {@link ManualRuleCreateParams.ScheduledTaxRate#extraParams} for the field
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
       * Add an element to `rates` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * ManualRuleCreateParams.ScheduledTaxRate#rates} for the field documentation.
       */
      public Builder addRate(ManualRuleCreateParams.ScheduledTaxRate.Rate element) {
        if (this.rates == null) {
          this.rates = new ArrayList<>();
        }
        this.rates.add(element);
        return this;
      }

      /**
       * Add all elements to `rates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ManualRuleCreateParams.ScheduledTaxRate#rates} for the field documentation.
       */
      public Builder addAllRate(List<ManualRuleCreateParams.ScheduledTaxRate.Rate> elements) {
        if (this.rates == null) {
          this.rates = new ArrayList<>();
        }
        this.rates.addAll(elements);
        return this;
      }

      /** The start time for the tax rate. */
      public Builder setStartsAt(Instant startsAt) {
        this.startsAt = startsAt;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Rate {
      /** Country of the tax rate. */
      @SerializedName("country")
      String country;

      /** Description of the tax rate. */
      @SerializedName("description")
      String description;

      /**
       * <strong>Required.</strong> Display name of the tax rate as it will be shown on the invoice.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Jurisdiction of the tax rate should apply as it will be shown on the invoice. */
      @SerializedName("jurisdiction")
      String jurisdiction;

      /**
       * <strong>Required.</strong> Percentage of the tax rate. Must be positive and maximum of 4
       * decimal points.
       */
      @SerializedName("percentage")
      String percentage;

      /** State of the tax rate. */
      @SerializedName("state")
      String state;

      private Rate(
          String country,
          String description,
          String displayName,
          Map<String, Object> extraParams,
          String jurisdiction,
          String percentage,
          String state) {
        this.country = country;
        this.description = description;
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.jurisdiction = jurisdiction;
        this.percentage = percentage;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String country;

        private String description;

        private String displayName;

        private Map<String, Object> extraParams;

        private String jurisdiction;

        private String percentage;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public ManualRuleCreateParams.ScheduledTaxRate.Rate build() {
          return new ManualRuleCreateParams.ScheduledTaxRate.Rate(
              this.country,
              this.description,
              this.displayName,
              this.extraParams,
              this.jurisdiction,
              this.percentage,
              this.state);
        }

        /** Country of the tax rate. */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /** Description of the tax rate. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * <strong>Required.</strong> Display name of the tax rate as it will be shown on the
         * invoice.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ManualRuleCreateParams.ScheduledTaxRate.Rate#extraParams} for the field
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
         * map. See {@link ManualRuleCreateParams.ScheduledTaxRate.Rate#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Jurisdiction of the tax rate should apply as it will be shown on the invoice. */
        public Builder setJurisdiction(String jurisdiction) {
          this.jurisdiction = jurisdiction;
          return this;
        }

        /**
         * <strong>Required.</strong> Percentage of the tax rate. Must be positive and maximum of 4
         * decimal points.
         */
        public Builder setPercentage(String percentage) {
          this.percentage = percentage;
          return this;
        }

        /** State of the tax rate. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }
}

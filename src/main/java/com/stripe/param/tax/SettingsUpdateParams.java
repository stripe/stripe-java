// File generated from our OpenAPI spec
package com.stripe.param.tax;

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
public class SettingsUpdateParams extends ApiRequestParams {
  /** Default configuration to be used on Stripe Tax calculations. */
  @SerializedName("defaults")
  Defaults defaults;

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

  /** The place where your business is located. */
  @SerializedName("head_office")
  HeadOffice headOffice;

  private SettingsUpdateParams(
      Defaults defaults,
      List<String> expand,
      Map<String, Object> extraParams,
      HeadOffice headOffice) {
    this.defaults = defaults;
    this.expand = expand;
    this.extraParams = extraParams;
    this.headOffice = headOffice;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Defaults defaults;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private HeadOffice headOffice;

    /** Finalize and obtain parameter instance from this builder. */
    public SettingsUpdateParams build() {
      return new SettingsUpdateParams(
          this.defaults, this.expand, this.extraParams, this.headOffice);
    }

    /** Default configuration to be used on Stripe Tax calculations. */
    public Builder setDefaults(SettingsUpdateParams.Defaults defaults) {
      this.defaults = defaults;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SettingsUpdateParams#expand} for the field documentation.
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
     * SettingsUpdateParams#expand} for the field documentation.
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
     * SettingsUpdateParams#extraParams} for the field documentation.
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
     * See {@link SettingsUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The place where your business is located. */
    public Builder setHeadOffice(SettingsUpdateParams.HeadOffice headOffice) {
      this.headOffice = headOffice;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Defaults {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Specifies the default <a
     * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#tax-behavior">tax
     * behavior</a> to be used when the item's price has unspecified tax behavior. One of inclusive,
     * exclusive, or inferred_by_currency. Once specified, it cannot be changed back to null.
     */
    @SerializedName("tax_behavior")
    TaxBehavior taxBehavior;

    /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
    @SerializedName("tax_code")
    Object taxCode;

    private Defaults(Map<String, Object> extraParams, TaxBehavior taxBehavior, Object taxCode) {
      this.extraParams = extraParams;
      this.taxBehavior = taxBehavior;
      this.taxCode = taxCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private TaxBehavior taxBehavior;

      private Object taxCode;

      /** Finalize and obtain parameter instance from this builder. */
      public SettingsUpdateParams.Defaults build() {
        return new SettingsUpdateParams.Defaults(this.extraParams, this.taxBehavior, this.taxCode);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SettingsUpdateParams.Defaults#extraParams} for the field documentation.
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
       * See {@link SettingsUpdateParams.Defaults#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Specifies the default <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#tax-behavior">tax
       * behavior</a> to be used when the item's price has unspecified tax behavior. One of
       * inclusive, exclusive, or inferred_by_currency. Once specified, it cannot be changed back to
       * null.
       */
      public Builder setTaxBehavior(SettingsUpdateParams.Defaults.TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
      }

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }

      /** A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. */
      public Builder setTaxCode(EmptyParam taxCode) {
        this.taxCode = taxCode;
        return this;
      }
    }

    public enum TaxBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("exclusive")
      EXCLUSIVE("exclusive"),

      @SerializedName("inclusive")
      INCLUSIVE("inclusive"),

      @SerializedName("inferred_by_currency")
      INFERRED_BY_CURRENCY("inferred_by_currency");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class HeadOffice {
    /** <strong>Required.</strong> The location of the business for tax purposes. */
    @SerializedName("address")
    Address address;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private HeadOffice(Address address, Map<String, Object> extraParams) {
      this.address = address;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SettingsUpdateParams.HeadOffice build() {
        return new SettingsUpdateParams.HeadOffice(this.address, this.extraParams);
      }

      /** <strong>Required.</strong> The location of the business for tax purposes. */
      public Builder setAddress(SettingsUpdateParams.HeadOffice.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SettingsUpdateParams.HeadOffice#extraParams} for the field documentation.
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
       * See {@link SettingsUpdateParams.HeadOffice#extraParams} for the field documentation.
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
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      Object line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
       */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public SettingsUpdateParams.HeadOffice.Address build() {
          return new SettingsUpdateParams.HeadOffice.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SettingsUpdateParams.HeadOffice.Address#extraParams} for the field
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
         * map. See {@link SettingsUpdateParams.HeadOffice.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1, such as the street, PO Box, or company name. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1, such as the street, PO Box, or company name. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /**
         * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
         * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
         */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }
}

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
public class CustomerTaxExemptionCreateParams extends ApiRequestParams {
  /** Canada-specific exemption details. Required when country is CA; must be absent otherwise. */
  @SerializedName("ca")
  Ca ca;

  /** <strong>Required.</strong> Two-letter ISO country code for the exemption location. */
  @SerializedName("country")
  String country;

  /**
   * <strong>Required.</strong> ISO 8601 date (YYYY-MM-DD) when the exemption becomes effective.
   * Must be no more than one year after today's UTC date (inclusive).
   */
  @SerializedName("effective_date")
  String effectiveDate;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** ISO 8601 date (YYYY-MM-DD) when the exemption expires. */
  @SerializedName("expiration_date")
  String expirationDate;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** US-specific exemption details. Required when country is US; must be absent otherwise. */
  @SerializedName("us")
  Us us;

  private CustomerTaxExemptionCreateParams(
      Ca ca,
      String country,
      String effectiveDate,
      List<String> expand,
      String expirationDate,
      Map<String, Object> extraParams,
      Us us) {
    this.ca = ca;
    this.country = country;
    this.effectiveDate = effectiveDate;
    this.expand = expand;
    this.expirationDate = expirationDate;
    this.extraParams = extraParams;
    this.us = us;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Ca ca;

    private String country;

    private String effectiveDate;

    private List<String> expand;

    private String expirationDate;

    private Map<String, Object> extraParams;

    private Us us;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerTaxExemptionCreateParams build() {
      return new CustomerTaxExemptionCreateParams(
          this.ca,
          this.country,
          this.effectiveDate,
          this.expand,
          this.expirationDate,
          this.extraParams,
          this.us);
    }

    /** Canada-specific exemption details. Required when country is CA; must be absent otherwise. */
    public Builder setCa(CustomerTaxExemptionCreateParams.Ca ca) {
      this.ca = ca;
      return this;
    }

    /** <strong>Required.</strong> Two-letter ISO country code for the exemption location. */
    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    /**
     * <strong>Required.</strong> ISO 8601 date (YYYY-MM-DD) when the exemption becomes effective.
     * Must be no more than one year after today's UTC date (inclusive).
     */
    public Builder setEffectiveDate(String effectiveDate) {
      this.effectiveDate = effectiveDate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerTaxExemptionCreateParams#expand} for the field documentation.
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
     * CustomerTaxExemptionCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** ISO 8601 date (YYYY-MM-DD) when the exemption expires. */
    public Builder setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerTaxExemptionCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomerTaxExemptionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** US-specific exemption details. Required when country is US; must be absent otherwise. */
    public Builder setUs(CustomerTaxExemptionCreateParams.Us us) {
      this.us = us;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Ca {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Two-letter Canadian province code (ISO 3166-2). Required when tax_type is pst, qst, or rst.
     */
    @SerializedName("state")
    String state;

    /** <strong>Required.</strong> The type of Canadian tax (gst_hst, PST, QST, RST). */
    @SerializedName("tax_type")
    TaxType taxType;

    private Ca(Map<String, Object> extraParams, String state, TaxType taxType) {
      this.extraParams = extraParams;
      this.state = state;
      this.taxType = taxType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String state;

      private TaxType taxType;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerTaxExemptionCreateParams.Ca build() {
        return new CustomerTaxExemptionCreateParams.Ca(this.extraParams, this.state, this.taxType);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerTaxExemptionCreateParams.Ca#extraParams} for the field documentation.
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
       * See {@link CustomerTaxExemptionCreateParams.Ca#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Two-letter Canadian province code (ISO 3166-2). Required when tax_type is pst, qst, or rst.
       */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }

      /** <strong>Required.</strong> The type of Canadian tax (gst_hst, PST, QST, RST). */
      public Builder setTaxType(CustomerTaxExemptionCreateParams.Ca.TaxType taxType) {
        this.taxType = taxType;
        return this;
      }
    }

    public enum TaxType implements ApiRequestParams.EnumParam {
      @SerializedName("gst_hst")
      GST_HST("gst_hst"),

      @SerializedName("pst")
      PST("pst"),

      @SerializedName("qst")
      QST("qst"),

      @SerializedName("rst")
      RST("rst");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TaxType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Us {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Two-letter US state code (ISO 3166-2). */
    @SerializedName("state")
    String state;

    private Us(Map<String, Object> extraParams, String state) {
      this.extraParams = extraParams;
      this.state = state;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String state;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerTaxExemptionCreateParams.Us build() {
        return new CustomerTaxExemptionCreateParams.Us(this.extraParams, this.state);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerTaxExemptionCreateParams.Us#extraParams} for the field documentation.
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
       * See {@link CustomerTaxExemptionCreateParams.Us#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Two-letter US state code (ISO 3166-2). */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }
    }
  }
}

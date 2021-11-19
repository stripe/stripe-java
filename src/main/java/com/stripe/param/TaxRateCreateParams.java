// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TaxRateCreateParams extends ApiRequestParams {
  /**
   * Flag determining whether the tax rate is active or inactive (archived). Inactive tax rates
   * cannot be used with new applications or Checkout Sessions, but will still work for
   * subscriptions and invoices that already have it set.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
   * alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  /**
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible
   * to your customers.
   */
  @SerializedName("description")
  String description;

  /** The display name of the tax rate, which will be shown to users. */
  @SerializedName("display_name")
  String displayName;

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

  /** This specifies if the tax rate is inclusive or exclusive. */
  @SerializedName("inclusive")
  Boolean inclusive;

  /**
   * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It
   * also appears on your customer’s invoice.
   */
  @SerializedName("jurisdiction")
  String jurisdiction;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** This represents the tax rate percent out of 100. */
  @SerializedName("percentage")
  BigDecimal percentage;

  /**
   * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>, without
   * country prefix. For example, &quot;NY&quot; for New York, United States.
   */
  @SerializedName("state")
  String state;

  /** The high-level tax type, such as {@code vat} or {@code sales_tax}. */
  @SerializedName("tax_type")
  TaxType taxType;

  private TaxRateCreateParams(
      Boolean active,
      String country,
      String description,
      String displayName,
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean inclusive,
      String jurisdiction,
      Map<String, String> metadata,
      BigDecimal percentage,
      String state,
      TaxType taxType) {
    this.active = active;
    this.country = country;
    this.description = description;
    this.displayName = displayName;
    this.expand = expand;
    this.extraParams = extraParams;
    this.inclusive = inclusive;
    this.jurisdiction = jurisdiction;
    this.metadata = metadata;
    this.percentage = percentage;
    this.state = state;
    this.taxType = taxType;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private String country;

    private String description;

    private String displayName;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean inclusive;

    private String jurisdiction;

    private Map<String, String> metadata;

    private BigDecimal percentage;

    private String state;

    private TaxType taxType;

    /** Finalize and obtain parameter instance from this builder. */
    public TaxRateCreateParams build() {
      return new TaxRateCreateParams(
          this.active,
          this.country,
          this.description,
          this.displayName,
          this.expand,
          this.extraParams,
          this.inclusive,
          this.jurisdiction,
          this.metadata,
          this.percentage,
          this.state,
          this.taxType);
    }

    /**
     * Flag determining whether the tax rate is active or inactive (archived). Inactive tax rates
     * cannot be used with new applications or Checkout Sessions, but will still work for
     * subscriptions and invoices that already have it set.
     */
    public Builder setActive(Boolean active) {
      this.active = active;
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
     * An arbitrary string attached to the tax rate for your internal use only. It will not be
     * visible to your customers.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** The display name of the tax rate, which will be shown to users. */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TaxRateCreateParams#expand} for the field documentation.
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
     * TaxRateCreateParams#expand} for the field documentation.
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
     * TaxRateCreateParams#extraParams} for the field documentation.
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
     * See {@link TaxRateCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** This specifies if the tax rate is inclusive or exclusive. */
    public Builder setInclusive(Boolean inclusive) {
      this.inclusive = inclusive;
      return this;
    }

    /**
     * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes.
     * It also appears on your customer’s invoice.
     */
    public Builder setJurisdiction(String jurisdiction) {
      this.jurisdiction = jurisdiction;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * TaxRateCreateParams#metadata} for the field documentation.
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
     * See {@link TaxRateCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** This represents the tax rate percent out of 100. */
    public Builder setPercentage(BigDecimal percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     * <a href="https://en.wikipedia.org/wiki/ISO_3166-2:US">ISO 3166-2 subdivision code</a>,
     * without country prefix. For example, &quot;NY&quot; for New York, United States.
     */
    public Builder setState(String state) {
      this.state = state;
      return this;
    }

    /** The high-level tax type, such as {@code vat} or {@code sales_tax}. */
    public Builder setTaxType(TaxType taxType) {
      this.taxType = taxType;
      return this;
    }
  }

  public enum TaxType implements ApiRequestParams.EnumParam {
    @SerializedName("gst")
    GST("gst"),

    @SerializedName("hst")
    HST("hst"),

    @SerializedName("jct")
    JCT("jct"),

    @SerializedName("pst")
    PST("pst"),

    @SerializedName("qst")
    QST("qst"),

    @SerializedName("rst")
    RST("rst"),

    @SerializedName("sales_tax")
    SALES_TAX("sales_tax"),

    @SerializedName("vat")
    VAT("vat");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TaxType(String value) {
      this.value = value;
    }
  }
}

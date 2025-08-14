// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class LicensedItemCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Description that customers will see in the invoice line item.
   * Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  String displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * An internal key you can use to search for a particular billable item. Must be unique among
   * billable items. Maximum length of 200 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Stripe Tax details. */
  @SerializedName("tax_details")
  TaxDetails taxDetails;

  /**
   * The unit to use when displaying prices for this billable item in places like Checkout. For
   * example, set this field to &quot;seat&quot; for Checkout to display &quot;(price) per
   * seat&quot;, or &quot;environment&quot; to display &quot;(price) per environment&quot;. Maximum
   * length of 100 characters.
   */
  @SerializedName("unit_label")
  String unitLabel;

  private LicensedItemCreateParams(
      String displayName,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata,
      TaxDetails taxDetails,
      String unitLabel) {
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.taxDetails = taxDetails;
    this.unitLabel = unitLabel;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String displayName;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    private TaxDetails taxDetails;

    private String unitLabel;

    /** Finalize and obtain parameter instance from this builder. */
    public LicensedItemCreateParams build() {
      return new LicensedItemCreateParams(
          this.displayName,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.taxDetails,
          this.unitLabel);
    }

    /**
     * <strong>Required.</strong> Description that customers will see in the invoice line item.
     * Maximum length of 250 characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * LicensedItemCreateParams#extraParams} for the field documentation.
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
     * See {@link LicensedItemCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An internal key you can use to search for a particular billable item. Must be unique among
     * billable items. Maximum length of 200 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * LicensedItemCreateParams#metadata} for the field documentation.
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
     * See {@link LicensedItemCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Stripe Tax details. */
    public Builder setTaxDetails(LicensedItemCreateParams.TaxDetails taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }

    /**
     * The unit to use when displaying prices for this billable item in places like Checkout. For
     * example, set this field to &quot;seat&quot; for Checkout to display &quot;(price) per
     * seat&quot;, or &quot;environment&quot; to display &quot;(price) per environment&quot;.
     * Maximum length of 100 characters.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Product tax code (PTC). */
    @SerializedName("tax_code")
    String taxCode;

    private TaxDetails(Map<String, Object> extraParams, String taxCode) {
      this.extraParams = extraParams;
      this.taxCode = taxCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String taxCode;

      /** Finalize and obtain parameter instance from this builder. */
      public LicensedItemCreateParams.TaxDetails build() {
        return new LicensedItemCreateParams.TaxDetails(this.extraParams, this.taxCode);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LicensedItemCreateParams.TaxDetails#extraParams} for the field documentation.
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
       * See {@link LicensedItemCreateParams.TaxDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Product tax code (PTC). */
      public Builder setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
      }
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class MeteredItemUpdateParams extends ApiRequestParams {
  /**
   * Description that customers will see in the invoice line item. Maximum length of 250 characters.
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

  /**
   * An internal key you can use to search for a particular billable item. Maximum length of 200
   * characters. To remove the lookup_key from the object, set it to null in the request.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** Stripe Tax details. */
  @SerializedName("tax_details")
  TaxDetails taxDetails;

  /**
   * The unit to use when displaying prices for this billable item in places like Checkout. For
   * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
   * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
   * events&quot;. Maximum length of 100 characters. To remove the unit_label from the object, set
   * it to null in the request.
   */
  @SerializedName("unit_label")
  Object unitLabel;

  private MeteredItemUpdateParams(
      Object displayName,
      Map<String, Object> extraParams,
      Object lookupKey,
      Map<String, Object> metadata,
      TaxDetails taxDetails,
      Object unitLabel) {
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
    private Object displayName;

    private Map<String, Object> extraParams;

    private Object lookupKey;

    private Map<String, Object> metadata;

    private TaxDetails taxDetails;

    private Object unitLabel;

    /** Finalize and obtain parameter instance from this builder. */
    public MeteredItemUpdateParams build() {
      return new MeteredItemUpdateParams(
          this.displayName,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.taxDetails,
          this.unitLabel);
    }

    /**
     * Description that customers will see in the invoice line item. Maximum length of 250
     * characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Description that customers will see in the invoice line item. Maximum length of 250
     * characters.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * MeteredItemUpdateParams#extraParams} for the field documentation.
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
     * See {@link MeteredItemUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An internal key you can use to search for a particular billable item. Maximum length of 200
     * characters. To remove the lookup_key from the object, set it to null in the request.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * An internal key you can use to search for a particular billable item. Maximum length of 200
     * characters. To remove the lookup_key from the object, set it to null in the request.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * MeteredItemUpdateParams#metadata} for the field documentation.
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
     * MeteredItemUpdateParams#metadata} for the field documentation.
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
     * MeteredItemUpdateParams#metadata} for the field documentation.
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

    /** Stripe Tax details. */
    public Builder setTaxDetails(MeteredItemUpdateParams.TaxDetails taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }

    /**
     * The unit to use when displaying prices for this billable item in places like Checkout. For
     * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
     * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
     * events&quot;. Maximum length of 100 characters. To remove the unit_label from the object, set
     * it to null in the request.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }

    /**
     * The unit to use when displaying prices for this billable item in places like Checkout. For
     * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
     * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
     * events&quot;. Maximum length of 100 characters. To remove the unit_label from the object, set
     * it to null in the request.
     */
    public Builder setUnitLabel(EmptyParam unitLabel) {
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
    Object taxCode;

    private TaxDetails(Map<String, Object> extraParams, Object taxCode) {
      this.extraParams = extraParams;
      this.taxCode = taxCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object taxCode;

      /** Finalize and obtain parameter instance from this builder. */
      public MeteredItemUpdateParams.TaxDetails build() {
        return new MeteredItemUpdateParams.TaxDetails(this.extraParams, this.taxCode);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeteredItemUpdateParams.TaxDetails#extraParams} for the field documentation.
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
       * See {@link MeteredItemUpdateParams.TaxDetails#extraParams} for the field documentation.
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

      /** <strong>Required.</strong> Product tax code (PTC). */
      public Builder setTaxCode(EmptyParam taxCode) {
        this.taxCode = taxCode;
        return this;
      }
    }
  }
}

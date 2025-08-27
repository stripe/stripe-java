// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

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
public class MeteredItemCreateParams extends ApiRequestParams {
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

  /** Optional array of Meter dimensions to group event dimension keys for invoice line items. */
  @SerializedName("invoice_presentation_dimensions")
  List<String> invoicePresentationDimensions;

  /**
   * An internal key you can use to search for a particular billable item. Must be unique among
   * billable items. Maximum length of 200 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> ID of the Meter that measures usage for this Metered Item. */
  @SerializedName("meter")
  String meter;

  /** Optional array of Meter segments to filter event dimension keys for billing. */
  @SerializedName("meter_segment_conditions")
  List<MeteredItemCreateParams.MeterSegmentCondition> meterSegmentConditions;

  /** Stripe Tax details. */
  @SerializedName("tax_details")
  TaxDetails taxDetails;

  /**
   * The unit to use when displaying prices for this billable item in places like Checkout. For
   * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
   * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
   * events&quot;. Maximum length of 100 characters.
   */
  @SerializedName("unit_label")
  String unitLabel;

  private MeteredItemCreateParams(
      String displayName,
      Map<String, Object> extraParams,
      List<String> invoicePresentationDimensions,
      String lookupKey,
      Map<String, String> metadata,
      String meter,
      List<MeteredItemCreateParams.MeterSegmentCondition> meterSegmentConditions,
      TaxDetails taxDetails,
      String unitLabel) {
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.invoicePresentationDimensions = invoicePresentationDimensions;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.meter = meter;
    this.meterSegmentConditions = meterSegmentConditions;
    this.taxDetails = taxDetails;
    this.unitLabel = unitLabel;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String displayName;

    private Map<String, Object> extraParams;

    private List<String> invoicePresentationDimensions;

    private String lookupKey;

    private Map<String, String> metadata;

    private String meter;

    private List<MeteredItemCreateParams.MeterSegmentCondition> meterSegmentConditions;

    private TaxDetails taxDetails;

    private String unitLabel;

    /** Finalize and obtain parameter instance from this builder. */
    public MeteredItemCreateParams build() {
      return new MeteredItemCreateParams(
          this.displayName,
          this.extraParams,
          this.invoicePresentationDimensions,
          this.lookupKey,
          this.metadata,
          this.meter,
          this.meterSegmentConditions,
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
     * MeteredItemCreateParams#extraParams} for the field documentation.
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
     * See {@link MeteredItemCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `invoicePresentationDimensions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link MeteredItemCreateParams#invoicePresentationDimensions} for the field documentation.
     */
    public Builder addInvoicePresentationDimension(String element) {
      if (this.invoicePresentationDimensions == null) {
        this.invoicePresentationDimensions = new ArrayList<>();
      }
      this.invoicePresentationDimensions.add(element);
      return this;
    }

    /**
     * Add all elements to `invoicePresentationDimensions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link MeteredItemCreateParams#invoicePresentationDimensions} for the field documentation.
     */
    public Builder addAllInvoicePresentationDimension(List<String> elements) {
      if (this.invoicePresentationDimensions == null) {
        this.invoicePresentationDimensions = new ArrayList<>();
      }
      this.invoicePresentationDimensions.addAll(elements);
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
     * MeteredItemCreateParams#metadata} for the field documentation.
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
     * See {@link MeteredItemCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> ID of the Meter that measures usage for this Metered Item. */
    public Builder setMeter(String meter) {
      this.meter = meter;
      return this;
    }

    /**
     * Add an element to `meterSegmentConditions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link MeteredItemCreateParams#meterSegmentConditions} for the field documentation.
     */
    public Builder addMeterSegmentCondition(MeteredItemCreateParams.MeterSegmentCondition element) {
      if (this.meterSegmentConditions == null) {
        this.meterSegmentConditions = new ArrayList<>();
      }
      this.meterSegmentConditions.add(element);
      return this;
    }

    /**
     * Add all elements to `meterSegmentConditions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link MeteredItemCreateParams#meterSegmentConditions} for the field documentation.
     */
    public Builder addAllMeterSegmentCondition(
        List<MeteredItemCreateParams.MeterSegmentCondition> elements) {
      if (this.meterSegmentConditions == null) {
        this.meterSegmentConditions = new ArrayList<>();
      }
      this.meterSegmentConditions.addAll(elements);
      return this;
    }

    /** Stripe Tax details. */
    public Builder setTaxDetails(MeteredItemCreateParams.TaxDetails taxDetails) {
      this.taxDetails = taxDetails;
      return this;
    }

    /**
     * The unit to use when displaying prices for this billable item in places like Checkout. For
     * example, set this field to &quot;CPU-hour&quot; for Checkout to display &quot;(price) per
     * CPU-hour&quot;, or &quot;1 million events&quot; to display &quot;(price) per 1 million
     * events&quot;. Maximum length of 100 characters.
     */
    public Builder setUnitLabel(String unitLabel) {
      this.unitLabel = unitLabel;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MeterSegmentCondition {
    /** <strong>Required.</strong> A Meter dimension. */
    @SerializedName("dimension")
    String dimension;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> To count usage towards this metered item, the dimension must have
     * this value.
     */
    @SerializedName("value")
    String value;

    private MeterSegmentCondition(String dimension, Map<String, Object> extraParams, String value) {
      this.dimension = dimension;
      this.extraParams = extraParams;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String dimension;

      private Map<String, Object> extraParams;

      private String value;

      /** Finalize and obtain parameter instance from this builder. */
      public MeteredItemCreateParams.MeterSegmentCondition build() {
        return new MeteredItemCreateParams.MeterSegmentCondition(
            this.dimension, this.extraParams, this.value);
      }

      /** <strong>Required.</strong> A Meter dimension. */
      public Builder setDimension(String dimension) {
        this.dimension = dimension;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeteredItemCreateParams.MeterSegmentCondition#extraParams} for the field documentation.
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
       * See {@link MeteredItemCreateParams.MeterSegmentCondition#extraParams} for the field
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
       * <strong>Required.</strong> To count usage towards this metered item, the dimension must
       * have this value.
       */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
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
      public MeteredItemCreateParams.TaxDetails build() {
        return new MeteredItemCreateParams.TaxDetails(this.extraParams, this.taxCode);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * MeteredItemCreateParams.TaxDetails#extraParams} for the field documentation.
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
       * See {@link MeteredItemCreateParams.TaxDetails#extraParams} for the field documentation.
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

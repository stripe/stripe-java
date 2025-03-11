// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InvoiceRemoveLinesParams extends ApiRequestParams {
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
  @SerializedName("invoice_metadata")
  Object invoiceMetadata;

  /** <strong>Required.</strong> The line items to remove. */
  @SerializedName("lines")
  List<InvoiceRemoveLinesParams.Line> lines;

  private InvoiceRemoveLinesParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Object invoiceMetadata,
      List<InvoiceRemoveLinesParams.Line> lines) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceMetadata = invoiceMetadata;
    this.lines = lines;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object invoiceMetadata;

    private List<InvoiceRemoveLinesParams.Line> lines;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceRemoveLinesParams build() {
      return new InvoiceRemoveLinesParams(
          this.expand, this.extraParams, this.invoiceMetadata, this.lines);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceRemoveLinesParams#expand} for the field documentation.
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
     * InvoiceRemoveLinesParams#expand} for the field documentation.
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
     * InvoiceRemoveLinesParams#extraParams} for the field documentation.
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
     * See {@link InvoiceRemoveLinesParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `invoiceMetadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceRemoveLinesParams#invoiceMetadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putInvoiceMetadata(String key, String value) {
      if (this.invoiceMetadata == null || this.invoiceMetadata instanceof EmptyParam) {
        this.invoiceMetadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.invoiceMetadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `invoiceMetadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceRemoveLinesParams#invoiceMetadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllInvoiceMetadata(Map<String, String> map) {
      if (this.invoiceMetadata == null || this.invoiceMetadata instanceof EmptyParam) {
        this.invoiceMetadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.invoiceMetadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setInvoiceMetadata(EmptyParam invoiceMetadata) {
      this.invoiceMetadata = invoiceMetadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setInvoiceMetadata(Map<String, String> invoiceMetadata) {
      this.invoiceMetadata = invoiceMetadata;
      return this;
    }

    /**
     * Add an element to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceRemoveLinesParams#lines} for the field documentation.
     */
    public Builder addLine(InvoiceRemoveLinesParams.Line element) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.add(element);
      return this;
    }

    /**
     * Add all elements to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceRemoveLinesParams#lines} for the field documentation.
     */
    public Builder addAllLine(List<InvoiceRemoveLinesParams.Line> elements) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.addAll(elements);
      return this;
    }
  }

  @Getter
  public static class Line {
    /**
     * <strong>Required.</strong> Either {@code delete} or {@code unassign}. Deleted line items are
     * permanently deleted. Unassigned line items can be reassigned to an invoice.
     */
    @SerializedName("behavior")
    Behavior behavior;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> ID of an existing line item to remove from this invoice. */
    @SerializedName("id")
    String id;

    private Line(Behavior behavior, Map<String, Object> extraParams, String id) {
      this.behavior = behavior;
      this.extraParams = extraParams;
      this.id = id;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Behavior behavior;

      private Map<String, Object> extraParams;

      private String id;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceRemoveLinesParams.Line build() {
        return new InvoiceRemoveLinesParams.Line(this.behavior, this.extraParams, this.id);
      }

      /**
       * <strong>Required.</strong> Either {@code delete} or {@code unassign}. Deleted line items
       * are permanently deleted. Unassigned line items can be reassigned to an invoice.
       */
      public Builder setBehavior(InvoiceRemoveLinesParams.Line.Behavior behavior) {
        this.behavior = behavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRemoveLinesParams.Line#extraParams} for the field documentation.
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
       * See {@link InvoiceRemoveLinesParams.Line#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> ID of an existing line item to remove from this invoice. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }
    }

    public enum Behavior implements ApiRequestParams.EnumParam {
      @SerializedName("delete")
      DELETE("delete"),

      @SerializedName("unassign")
      UNASSIGN("unassign");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Behavior(String value) {
        this.value = value;
      }
    }
  }
}

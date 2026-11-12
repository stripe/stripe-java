// File generated from our OpenAPI spec
package com.stripe.param;

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
public class InvoiceRenderingTemplateUpdateParams extends ApiRequestParams {
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

  /** Controls how individual line items are displayed on the invoice, visible to customers. */
  @SerializedName("line_item_policy")
  Object lineItemPolicy;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Nickname for the template that is hidden from customers. */
  @SerializedName("nickname")
  Object nickname;

  /**
   * Controls the grouping of line items into summary items which are displayed on the invoice,
   * visible to customers. The policies are applied in order - only ungrouped line items from the
   * previous policy are considered by the following policies.
   */
  @SerializedName("summary_item_policies")
  Object summaryItemPolicies;

  private InvoiceRenderingTemplateUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Object lineItemPolicy,
      Object metadata,
      Object nickname,
      Object summaryItemPolicies) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.lineItemPolicy = lineItemPolicy;
    this.metadata = metadata;
    this.nickname = nickname;
    this.summaryItemPolicies = summaryItemPolicies;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object lineItemPolicy;

    private Object metadata;

    private Object nickname;

    private Object summaryItemPolicies;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceRenderingTemplateUpdateParams build() {
      return new InvoiceRenderingTemplateUpdateParams(
          this.expand,
          this.extraParams,
          this.lineItemPolicy,
          this.metadata,
          this.nickname,
          this.summaryItemPolicies);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceRenderingTemplateUpdateParams#expand} for the field documentation.
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
     * InvoiceRenderingTemplateUpdateParams#expand} for the field documentation.
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
     * InvoiceRenderingTemplateUpdateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceRenderingTemplateUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Controls how individual line items are displayed on the invoice, visible to customers. */
    public Builder setLineItemPolicy(
        InvoiceRenderingTemplateUpdateParams.LineItemPolicy lineItemPolicy) {
      this.lineItemPolicy = lineItemPolicy;
      return this;
    }

    /** Controls how individual line items are displayed on the invoice, visible to customers. */
    public Builder setLineItemPolicy(EmptyParam lineItemPolicy) {
      this.lineItemPolicy = lineItemPolicy;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceRenderingTemplateUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceRenderingTemplateUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** Nickname for the template that is hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /** Nickname for the template that is hidden from customers. */
    public Builder setNickname(EmptyParam nickname) {
      this.nickname = nickname;
      return this;
    }

    /**
     * Add an element to `summaryItemPolicies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceRenderingTemplateUpdateParams#summaryItemPolicies} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addSummaryItemPolicy(
        InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy element) {
      if (this.summaryItemPolicies == null || this.summaryItemPolicies instanceof EmptyParam) {
        this.summaryItemPolicies =
            new ArrayList<InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy>();
      }
      ((List<InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy>) this.summaryItemPolicies)
          .add(element);
      return this;
    }

    /**
     * Add all elements to `summaryItemPolicies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceRenderingTemplateUpdateParams#summaryItemPolicies} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllSummaryItemPolicy(
        List<InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy> elements) {
      if (this.summaryItemPolicies == null || this.summaryItemPolicies instanceof EmptyParam) {
        this.summaryItemPolicies =
            new ArrayList<InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy>();
      }
      ((List<InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy>) this.summaryItemPolicies)
          .addAll(elements);
      return this;
    }

    /**
     * Controls the grouping of line items into summary items which are displayed on the invoice,
     * visible to customers. The policies are applied in order - only ungrouped line items from the
     * previous policy are considered by the following policies.
     */
    public Builder setSummaryItemPolicies(EmptyParam summaryItemPolicies) {
      this.summaryItemPolicies = summaryItemPolicies;
      return this;
    }

    /**
     * Controls the grouping of line items into summary items which are displayed on the invoice,
     * visible to customers. The policies are applied in order - only ungrouped line items from the
     * previous policy are considered by the following policies.
     */
    public Builder setSummaryItemPolicies(
        List<InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy> summaryItemPolicies) {
      this.summaryItemPolicies = summaryItemPolicies;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LineItemPolicy {
    /**
     * A CEL expression that takes a line item and returns a boolean indicating whether to display
     * it on the invoice.
     */
    @SerializedName("display")
    Object display;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private LineItemPolicy(Object display, Map<String, Object> extraParams) {
      this.display = display;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object display;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceRenderingTemplateUpdateParams.LineItemPolicy build() {
        return new InvoiceRenderingTemplateUpdateParams.LineItemPolicy(
            this.display, this.extraParams);
      }

      /**
       * A CEL expression that takes a line item and returns a boolean indicating whether to display
       * it on the invoice.
       */
      public Builder setDisplay(String display) {
        this.display = display;
        return this;
      }

      /**
       * A CEL expression that takes a line item and returns a boolean indicating whether to display
       * it on the invoice.
       */
      public Builder setDisplay(EmptyParam display) {
        this.display = display;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRenderingTemplateUpdateParams.LineItemPolicy#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceRenderingTemplateUpdateParams.LineItemPolicy#extraParams} for the field
       * documentation.
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
  public static class SummaryItemPolicy {
    /**
     * Controls how each summary group is rendered on the invoice. {@code all} displays the summary
     * line item, its constituent line items, and a group subtotal. {@code none} displays only the
     * summary line item. Defaults to {@code all}.
     */
    @SerializedName("display_items")
    DisplayItems displayItems;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A CEL expression that takes a line item and returns a boolean indicating whether to include
     * it in this grouping policy. If omitted, includes all ungrouped line items.
     */
    @SerializedName("filter")
    Object filter;

    /**
     * A CEL expression that takes a line item and returns a string. Line items with the same result
     * are grouped into a summary item, using that result as its group title.
     */
    @SerializedName("group_by")
    Object groupBy;

    private SummaryItemPolicy(
        DisplayItems displayItems, Map<String, Object> extraParams, Object filter, Object groupBy) {
      this.displayItems = displayItems;
      this.extraParams = extraParams;
      this.filter = filter;
      this.groupBy = groupBy;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayItems displayItems;

      private Map<String, Object> extraParams;

      private Object filter;

      private Object groupBy;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy build() {
        return new InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy(
            this.displayItems, this.extraParams, this.filter, this.groupBy);
      }

      /**
       * Controls how each summary group is rendered on the invoice. {@code all} displays the
       * summary line item, its constituent line items, and a group subtotal. {@code none} displays
       * only the summary line item. Defaults to {@code all}.
       */
      public Builder setDisplayItems(
          InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy.DisplayItems displayItems) {
        this.displayItems = displayItems;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link InvoiceRenderingTemplateUpdateParams.SummaryItemPolicy#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A CEL expression that takes a line item and returns a boolean indicating whether to include
       * it in this grouping policy. If omitted, includes all ungrouped line items.
       */
      public Builder setFilter(String filter) {
        this.filter = filter;
        return this;
      }

      /**
       * A CEL expression that takes a line item and returns a boolean indicating whether to include
       * it in this grouping policy. If omitted, includes all ungrouped line items.
       */
      public Builder setFilter(EmptyParam filter) {
        this.filter = filter;
        return this;
      }

      /**
       * A CEL expression that takes a line item and returns a string. Line items with the same
       * result are grouped into a summary item, using that result as its group title.
       */
      public Builder setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
      }

      /**
       * A CEL expression that takes a line item and returns a string. Line items with the same
       * result are grouped into a summary item, using that result as its group title.
       */
      public Builder setGroupBy(EmptyParam groupBy) {
        this.groupBy = groupBy;
        return this;
      }
    }

    public enum DisplayItems implements ApiRequestParams.EnumParam {
      @SerializedName("all")
      ALL("all"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      DisplayItems(String value) {
        this.value = value;
      }
    }
  }
}

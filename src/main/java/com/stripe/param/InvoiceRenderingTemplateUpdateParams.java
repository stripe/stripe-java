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

  /** Rendering settings for invoices using this template. */
  @SerializedName("rendering_settings")
  RenderingSettings renderingSettings;

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
      RenderingSettings renderingSettings,
      Object summaryItemPolicies) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.lineItemPolicy = lineItemPolicy;
    this.metadata = metadata;
    this.nickname = nickname;
    this.renderingSettings = renderingSettings;
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

    private RenderingSettings renderingSettings;

    private Object summaryItemPolicies;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceRenderingTemplateUpdateParams build() {
      return new InvoiceRenderingTemplateUpdateParams(
          this.expand,
          this.extraParams,
          this.lineItemPolicy,
          this.metadata,
          this.nickname,
          this.renderingSettings,
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

    /** Rendering settings for invoices using this template. */
    public Builder setRenderingSettings(
        InvoiceRenderingTemplateUpdateParams.RenderingSettings renderingSettings) {
      this.renderingSettings = renderingSettings;
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
  public static class RenderingSettings {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Rendering settings for the invoice PDF. */
    @SerializedName("invoice_pdf")
    InvoicePdf invoicePdf;

    private RenderingSettings(Map<String, Object> extraParams, InvoicePdf invoicePdf) {
      this.extraParams = extraParams;
      this.invoicePdf = invoicePdf;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private InvoicePdf invoicePdf;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceRenderingTemplateUpdateParams.RenderingSettings build() {
        return new InvoiceRenderingTemplateUpdateParams.RenderingSettings(
            this.extraParams, this.invoicePdf);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRenderingTemplateUpdateParams.RenderingSettings#extraParams} for the field
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
       * See {@link InvoiceRenderingTemplateUpdateParams.RenderingSettings#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Rendering settings for the invoice PDF. */
      public Builder setInvoicePdf(
          InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf invoicePdf) {
        this.invoicePdf = invoicePdf;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoicePdf {
      /**
       * The complete replacement order of at most 20 invoice PDF blocks. Keys retain saved
       * configuration when its hash is omitted. Omitted custom blocks are removed; include every
       * default type exactly once. Omit blocks to preserve settings, or supply an empty string to
       * reset to defaults.
       */
      @SerializedName("blocks")
      Object blocks;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InvoicePdf(Object blocks, Map<String, Object> extraParams) {
        this.blocks = blocks;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object blocks;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf build() {
          return new InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf(
              this.blocks, this.extraParams);
        }

        /**
         * Add an element to `blocks` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf#blocks} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addBlock(
            InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block element) {
          if (this.blocks == null || this.blocks instanceof EmptyParam) {
            this.blocks =
                new ArrayList<
                    InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block>();
          }
          ((List<InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block>)
                  this.blocks)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `blocks` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf#blocks} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllBlock(
            List<InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block>
                elements) {
          if (this.blocks == null || this.blocks instanceof EmptyParam) {
            this.blocks =
                new ArrayList<
                    InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block>();
          }
          ((List<InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block>)
                  this.blocks)
              .addAll(elements);
          return this;
        }

        /**
         * The complete replacement order of at most 20 invoice PDF blocks. Keys retain saved
         * configuration when its hash is omitted. Omitted custom blocks are removed; include every
         * default type exactly once. Omit blocks to preserve settings, or supply an empty string to
         * reset to defaults.
         */
        public Builder setBlocks(EmptyParam blocks) {
          this.blocks = blocks;
          return this;
        }

        /**
         * The complete replacement order of at most 20 invoice PDF blocks. Keys retain saved
         * configuration when its hash is omitted. Omitted custom blocks are removed; include every
         * default type exactly once. Omit blocks to preserve settings, or supply an empty string to
         * reset to defaults.
         */
        public Builder setBlocks(
            List<InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block> blocks) {
          this.blocks = blocks;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf#extraParams} for the
         * field documentation.
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
         * map. See {@link
         * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf#extraParams} for the
         * field documentation.
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
      public static class Block {
        /**
         * Configuration for a repeatable literal text block. Omit this hash on a keyed update to
         * retain saved text; supply it to replace the text.
         */
        @SerializedName("custom_plain_text")
        CustomPlainText customPlainText;

        /** Configuration for a custom CEL text block. */
        @SerializedName("custom_plain_text_cel")
        CustomPlainTextCel customPlainTextCel;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A unique key within this template's blocks. Generated when omitted. */
        @SerializedName("key")
        Object key;

        /**
         * The type of content block. Required when updating a block without a key matching an
         * existing block in the current template version. For a matching key, omit type to retain
         * the existing type; if supplied, it must match.
         */
        @SerializedName("type")
        Type type;

        private Block(
            CustomPlainText customPlainText,
            CustomPlainTextCel customPlainTextCel,
            Map<String, Object> extraParams,
            Object key,
            Type type) {
          this.customPlainText = customPlainText;
          this.customPlainTextCel = customPlainTextCel;
          this.extraParams = extraParams;
          this.key = key;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private CustomPlainText customPlainText;

          private CustomPlainTextCel customPlainTextCel;

          private Map<String, Object> extraParams;

          private Object key;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block build() {
            return new InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block(
                this.customPlainText,
                this.customPlainTextCel,
                this.extraParams,
                this.key,
                this.type);
          }

          /**
           * Configuration for a repeatable literal text block. Omit this hash on a keyed update to
           * retain saved text; supply it to replace the text.
           */
          public Builder setCustomPlainText(
              InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block
                      .CustomPlainText
                  customPlainText) {
            this.customPlainText = customPlainText;
            return this;
          }

          /** Configuration for a custom CEL text block. */
          public Builder setCustomPlainTextCel(
              InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block
                      .CustomPlainTextCel
                  customPlainTextCel) {
            this.customPlainTextCel = customPlainTextCel;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block#extraParams}
           * for the field documentation.
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
           * map. See {@link
           * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A unique key within this template's blocks. Generated when omitted. */
          public Builder setKey(String key) {
            this.key = key;
            return this;
          }

          /** A unique key within this template's blocks. Generated when omitted. */
          public Builder setKey(EmptyParam key) {
            this.key = key;
            return this;
          }

          /**
           * The type of content block. Required when updating a block without a key matching an
           * existing block in the current template version. For a matching key, omit type to retain
           * the existing type; if supplied, it must match.
           */
          public Builder setType(
              InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CustomPlainText {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Literal text to render, preserving whitespace and newlines.
           * Required, at most 10,000 characters; an empty string renders no text.
           */
          @SerializedName("plain_text")
          Object plainText;

          private CustomPlainText(Map<String, Object> extraParams, Object plainText) {
            this.extraParams = extraParams;
            this.plainText = plainText;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object plainText;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block
                    .CustomPlainText
                build() {
              return new InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block
                  .CustomPlainText(this.extraParams, this.plainText);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block.CustomPlainText#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block.CustomPlainText#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Literal text to render, preserving whitespace and
             * newlines. Required, at most 10,000 characters; an empty string renders no text.
             */
            public Builder setPlainText(String plainText) {
              this.plainText = plainText;
              return this;
            }

            /**
             * <strong>Required.</strong> Literal text to render, preserving whitespace and
             * newlines. Required, at most 10,000 characters; an empty string renders no text.
             */
            public Builder setPlainText(EmptyParam plainText) {
              this.plainText = plainText;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CustomPlainTextCel {
          /**
           * <strong>Required.</strong> A CEL expression that returns text using the invoice
           * context.
           */
          @SerializedName("cel_expression")
          Object celExpression;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private CustomPlainTextCel(Object celExpression, Map<String, Object> extraParams) {
            this.celExpression = celExpression;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object celExpression;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block
                    .CustomPlainTextCel
                build() {
              return new InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block
                  .CustomPlainTextCel(this.celExpression, this.extraParams);
            }

            /**
             * <strong>Required.</strong> A CEL expression that returns text using the invoice
             * context.
             */
            public Builder setCelExpression(String celExpression) {
              this.celExpression = celExpression;
              return this;
            }

            /**
             * <strong>Required.</strong> A CEL expression that returns text using the invoice
             * context.
             */
            public Builder setCelExpression(EmptyParam celExpression) {
              this.celExpression = celExpression;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block.CustomPlainTextCel#extraParams}
             * for the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceRenderingTemplateUpdateParams.RenderingSettings.InvoicePdf.Block.CustomPlainTextCel#extraParams}
             * for the field documentation.
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

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("custom_plain_text")
          CUSTOM_PLAIN_TEXT("custom_plain_text"),

          @SerializedName("custom_plain_text_cel")
          CUSTOM_PLAIN_TEXT_CEL("custom_plain_text_cel"),

          @SerializedName("footer_content")
          FOOTER_CONTENT("footer_content"),

          @SerializedName("invoice_details")
          INVOICE_DETAILS("invoice_details"),

          @SerializedName("line_items")
          LINE_ITEMS("line_items"),

          @SerializedName("parties")
          PARTIES("parties"),

          @SerializedName("payment_remittance_instructions")
          PAYMENT_REMITTANCE_INSTRUCTIONS("payment_remittance_instructions"),

          @SerializedName("status_and_memo")
          STATUS_AND_MEMO("status_and_memo"),

          @SerializedName("tax_footnotes")
          TAX_FOOTNOTES("tax_footnotes"),

          @SerializedName("title_and_logo")
          TITLE_AND_LOGO("title_and_logo");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
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

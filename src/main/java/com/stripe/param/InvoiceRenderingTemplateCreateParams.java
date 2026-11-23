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
public class InvoiceRenderingTemplateCreateParams extends ApiRequestParams {
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
  LineItemPolicy lineItemPolicy;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Nickname for the template that is hidden from customers. */
  @SerializedName("nickname")
  String nickname;

  /** Rendering settings for invoices using this template. */
  @SerializedName("rendering_settings")
  RenderingSettings renderingSettings;

  /**
   * Controls the grouping of line items into summary items which are displayed on the invoice,
   * visible to customers. The policies are applied in order - only ungrouped line items from the
   * previous policy are considered by the following policies.
   */
  @SerializedName("summary_item_policies")
  List<InvoiceRenderingTemplateCreateParams.SummaryItemPolicy> summaryItemPolicies;

  private InvoiceRenderingTemplateCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      LineItemPolicy lineItemPolicy,
      Map<String, String> metadata,
      String nickname,
      RenderingSettings renderingSettings,
      List<InvoiceRenderingTemplateCreateParams.SummaryItemPolicy> summaryItemPolicies) {
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

    private LineItemPolicy lineItemPolicy;

    private Map<String, String> metadata;

    private String nickname;

    private RenderingSettings renderingSettings;

    private List<InvoiceRenderingTemplateCreateParams.SummaryItemPolicy> summaryItemPolicies;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceRenderingTemplateCreateParams build() {
      return new InvoiceRenderingTemplateCreateParams(
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
     * InvoiceRenderingTemplateCreateParams#expand} for the field documentation.
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
     * InvoiceRenderingTemplateCreateParams#expand} for the field documentation.
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
     * InvoiceRenderingTemplateCreateParams#extraParams} for the field documentation.
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
     * See {@link InvoiceRenderingTemplateCreateParams#extraParams} for the field documentation.
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
        InvoiceRenderingTemplateCreateParams.LineItemPolicy lineItemPolicy) {
      this.lineItemPolicy = lineItemPolicy;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceRenderingTemplateCreateParams#metadata} for the field documentation.
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
     * See {@link InvoiceRenderingTemplateCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Nickname for the template that is hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /** Rendering settings for invoices using this template. */
    public Builder setRenderingSettings(
        InvoiceRenderingTemplateCreateParams.RenderingSettings renderingSettings) {
      this.renderingSettings = renderingSettings;
      return this;
    }

    /**
     * Add an element to `summaryItemPolicies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceRenderingTemplateCreateParams#summaryItemPolicies} for the field documentation.
     */
    public Builder addSummaryItemPolicy(
        InvoiceRenderingTemplateCreateParams.SummaryItemPolicy element) {
      if (this.summaryItemPolicies == null) {
        this.summaryItemPolicies = new ArrayList<>();
      }
      this.summaryItemPolicies.add(element);
      return this;
    }

    /**
     * Add all elements to `summaryItemPolicies` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link InvoiceRenderingTemplateCreateParams#summaryItemPolicies} for the field documentation.
     */
    public Builder addAllSummaryItemPolicy(
        List<InvoiceRenderingTemplateCreateParams.SummaryItemPolicy> elements) {
      if (this.summaryItemPolicies == null) {
        this.summaryItemPolicies = new ArrayList<>();
      }
      this.summaryItemPolicies.addAll(elements);
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
    String display;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private LineItemPolicy(String display, Map<String, Object> extraParams) {
      this.display = display;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String display;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceRenderingTemplateCreateParams.LineItemPolicy build() {
        return new InvoiceRenderingTemplateCreateParams.LineItemPolicy(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRenderingTemplateCreateParams.LineItemPolicy#extraParams} for the field
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
       * See {@link InvoiceRenderingTemplateCreateParams.LineItemPolicy#extraParams} for the field
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
      public InvoiceRenderingTemplateCreateParams.RenderingSettings build() {
        return new InvoiceRenderingTemplateCreateParams.RenderingSettings(
            this.extraParams, this.invoicePdf);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRenderingTemplateCreateParams.RenderingSettings#extraParams} for the field
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
       * See {@link InvoiceRenderingTemplateCreateParams.RenderingSettings#extraParams} for the
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
          InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf invoicePdf) {
        this.invoicePdf = invoicePdf;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoicePdf {
      /**
       * Ordered invoice PDF blocks, at most 20. Include every default type exactly once; custom
       * text blocks may repeat.
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
        public InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf build() {
          return new InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf(
              this.blocks, this.extraParams);
        }

        /**
         * Add an element to `blocks` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf#blocks} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addBlock(
            InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block element) {
          if (this.blocks == null || this.blocks instanceof EmptyParam) {
            this.blocks =
                new ArrayList<
                    InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block>();
          }
          ((List<InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block>)
                  this.blocks)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `blocks` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf#blocks} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllBlock(
            List<InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block>
                elements) {
          if (this.blocks == null || this.blocks instanceof EmptyParam) {
            this.blocks =
                new ArrayList<
                    InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block>();
          }
          ((List<InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block>)
                  this.blocks)
              .addAll(elements);
          return this;
        }

        /**
         * Ordered invoice PDF blocks, at most 20. Include every default type exactly once; custom
         * text blocks may repeat.
         */
        public Builder setBlocks(EmptyParam blocks) {
          this.blocks = blocks;
          return this;
        }

        /**
         * Ordered invoice PDF blocks, at most 20. Include every default type exactly once; custom
         * text blocks may repeat.
         */
        public Builder setBlocks(
            List<InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block> blocks) {
          this.blocks = blocks;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf#extraParams} for the
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
         * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf#extraParams} for the
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
        String key;

        /** <strong>Required.</strong> The type of content block. */
        @SerializedName("type")
        Type type;

        private Block(
            CustomPlainText customPlainText,
            CustomPlainTextCel customPlainTextCel,
            Map<String, Object> extraParams,
            String key,
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

          private String key;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block build() {
            return new InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block(
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
              InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block
                      .CustomPlainText
                  customPlainText) {
            this.customPlainText = customPlainText;
            return this;
          }

          /** Configuration for a custom CEL text block. */
          public Builder setCustomPlainTextCel(
              InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block
                      .CustomPlainTextCel
                  customPlainTextCel) {
            this.customPlainTextCel = customPlainTextCel;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block#extraParams}
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
           * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block#extraParams}
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

          /** <strong>Required.</strong> The type of content block. */
          public Builder setType(
              InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block.Type type) {
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
          String plainText;

          private CustomPlainText(Map<String, Object> extraParams, String plainText) {
            this.extraParams = extraParams;
            this.plainText = plainText;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String plainText;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block
                    .CustomPlainText
                build() {
              return new InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block
                  .CustomPlainText(this.extraParams, this.plainText);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block.CustomPlainText#extraParams}
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
             * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block.CustomPlainText#extraParams}
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
          String celExpression;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private CustomPlainTextCel(String celExpression, Map<String, Object> extraParams) {
            this.celExpression = celExpression;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String celExpression;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block
                    .CustomPlainTextCel
                build() {
              return new InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block
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
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block.CustomPlainTextCel#extraParams}
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
             * InvoiceRenderingTemplateCreateParams.RenderingSettings.InvoicePdf.Block.CustomPlainTextCel#extraParams}
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
    String filter;

    /**
     * A CEL expression that takes a line item and returns a string. Line items with the same result
     * are grouped into a summary item, using that result as its group title.
     */
    @SerializedName("group_by")
    String groupBy;

    private SummaryItemPolicy(
        DisplayItems displayItems, Map<String, Object> extraParams, String filter, String groupBy) {
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

      private String filter;

      private String groupBy;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceRenderingTemplateCreateParams.SummaryItemPolicy build() {
        return new InvoiceRenderingTemplateCreateParams.SummaryItemPolicy(
            this.displayItems, this.extraParams, this.filter, this.groupBy);
      }

      /**
       * Controls how each summary group is rendered on the invoice. {@code all} displays the
       * summary line item, its constituent line items, and a group subtotal. {@code none} displays
       * only the summary line item. Defaults to {@code all}.
       */
      public Builder setDisplayItems(
          InvoiceRenderingTemplateCreateParams.SummaryItemPolicy.DisplayItems displayItems) {
        this.displayItems = displayItems;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceRenderingTemplateCreateParams.SummaryItemPolicy#extraParams} for the field
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
       * See {@link InvoiceRenderingTemplateCreateParams.SummaryItemPolicy#extraParams} for the
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
       * A CEL expression that takes a line item and returns a string. Line items with the same
       * result are grouped into a summary item, using that result as its group title.
       */
      public Builder setGroupBy(String groupBy) {
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

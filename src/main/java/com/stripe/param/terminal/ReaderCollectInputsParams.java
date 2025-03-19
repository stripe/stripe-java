// File generated from our OpenAPI spec
package com.stripe.param.terminal;

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
public class ReaderCollectInputsParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> List of inputs to be collected using the Reader */
  @SerializedName("inputs")
  List<ReaderCollectInputsParams.Input> inputs;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private ReaderCollectInputsParams(
      List<String> expand,
      Map<String, Object> extraParams,
      List<ReaderCollectInputsParams.Input> inputs,
      Map<String, String> metadata) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.inputs = inputs;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<ReaderCollectInputsParams.Input> inputs;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderCollectInputsParams build() {
      return new ReaderCollectInputsParams(
          this.expand, this.extraParams, this.inputs, this.metadata);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderCollectInputsParams#expand} for the field documentation.
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
     * ReaderCollectInputsParams#expand} for the field documentation.
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
     * ReaderCollectInputsParams#extraParams} for the field documentation.
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
     * See {@link ReaderCollectInputsParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `inputs` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderCollectInputsParams#inputs} for the field documentation.
     */
    public Builder addInput(ReaderCollectInputsParams.Input element) {
      if (this.inputs == null) {
        this.inputs = new ArrayList<>();
      }
      this.inputs.add(element);
      return this;
    }

    /**
     * Add all elements to `inputs` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderCollectInputsParams#inputs} for the field documentation.
     */
    public Builder addAllInput(List<ReaderCollectInputsParams.Input> elements) {
      if (this.inputs == null) {
        this.inputs = new ArrayList<>();
      }
      this.inputs.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReaderCollectInputsParams#metadata} for the field documentation.
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
     * See {@link ReaderCollectInputsParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Input {
    /**
     * <strong>Required.</strong> Customize the text which will be displayed while collecting this
     * input
     */
    @SerializedName("custom_text")
    CustomText customText;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Indicate that this input is required, disabling the skip button. */
    @SerializedName("required")
    Boolean required;

    /** Options for the {@code selection} input. */
    @SerializedName("selection")
    Selection selection;

    /** List of toggles to be displayed and customization for the toggles. */
    @SerializedName("toggles")
    List<ReaderCollectInputsParams.Input.Toggle> toggles;

    /** <strong>Required.</strong> The type of input to collect */
    @SerializedName("type")
    Type type;

    private Input(
        CustomText customText,
        Map<String, Object> extraParams,
        Boolean required,
        Selection selection,
        List<ReaderCollectInputsParams.Input.Toggle> toggles,
        Type type) {
      this.customText = customText;
      this.extraParams = extraParams;
      this.required = required;
      this.selection = selection;
      this.toggles = toggles;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CustomText customText;

      private Map<String, Object> extraParams;

      private Boolean required;

      private Selection selection;

      private List<ReaderCollectInputsParams.Input.Toggle> toggles;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ReaderCollectInputsParams.Input build() {
        return new ReaderCollectInputsParams.Input(
            this.customText,
            this.extraParams,
            this.required,
            this.selection,
            this.toggles,
            this.type);
      }

      /**
       * <strong>Required.</strong> Customize the text which will be displayed while collecting this
       * input
       */
      public Builder setCustomText(ReaderCollectInputsParams.Input.CustomText customText) {
        this.customText = customText;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReaderCollectInputsParams.Input#extraParams} for the field documentation.
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
       * See {@link ReaderCollectInputsParams.Input#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Indicate that this input is required, disabling the skip button. */
      public Builder setRequired(Boolean required) {
        this.required = required;
        return this;
      }

      /** Options for the {@code selection} input. */
      public Builder setSelection(ReaderCollectInputsParams.Input.Selection selection) {
        this.selection = selection;
        return this;
      }

      /**
       * Add an element to `toggles` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReaderCollectInputsParams.Input#toggles} for the field documentation.
       */
      public Builder addToggle(ReaderCollectInputsParams.Input.Toggle element) {
        if (this.toggles == null) {
          this.toggles = new ArrayList<>();
        }
        this.toggles.add(element);
        return this;
      }

      /**
       * Add all elements to `toggles` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReaderCollectInputsParams.Input#toggles} for the field documentation.
       */
      public Builder addAllToggle(List<ReaderCollectInputsParams.Input.Toggle> elements) {
        if (this.toggles == null) {
          this.toggles = new ArrayList<>();
        }
        this.toggles.addAll(elements);
        return this;
      }

      /** <strong>Required.</strong> The type of input to collect */
      public Builder setType(ReaderCollectInputsParams.Input.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomText {
      /** The description which will be displayed when collecting this input. */
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The skip button text. */
      @SerializedName("skip_button")
      String skipButton;

      /** The submit button text. */
      @SerializedName("submit_button")
      String submitButton;

      /** <strong>Required.</strong> The title which will be displayed when collecting this input */
      @SerializedName("title")
      String title;

      private CustomText(
          String description,
          Map<String, Object> extraParams,
          String skipButton,
          String submitButton,
          String title) {
        this.description = description;
        this.extraParams = extraParams;
        this.skipButton = skipButton;
        this.submitButton = submitButton;
        this.title = title;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String description;

        private Map<String, Object> extraParams;

        private String skipButton;

        private String submitButton;

        private String title;

        /** Finalize and obtain parameter instance from this builder. */
        public ReaderCollectInputsParams.Input.CustomText build() {
          return new ReaderCollectInputsParams.Input.CustomText(
              this.description, this.extraParams, this.skipButton, this.submitButton, this.title);
        }

        /** The description which will be displayed when collecting this input. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderCollectInputsParams.Input.CustomText#extraParams} for the field
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
         * map. See {@link ReaderCollectInputsParams.Input.CustomText#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The skip button text. */
        public Builder setSkipButton(String skipButton) {
          this.skipButton = skipButton;
          return this;
        }

        /** The submit button text. */
        public Builder setSubmitButton(String submitButton) {
          this.submitButton = submitButton;
          return this;
        }

        /**
         * <strong>Required.</strong> The title which will be displayed when collecting this input
         */
        public Builder setTitle(String title) {
          this.title = title;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Selection {
      /** <strong>Required.</strong> List of choices for the {@code selection} input */
      @SerializedName("choices")
      List<ReaderCollectInputsParams.Input.Selection.Choice> choices;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Selection(
          List<ReaderCollectInputsParams.Input.Selection.Choice> choices,
          Map<String, Object> extraParams) {
        this.choices = choices;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<ReaderCollectInputsParams.Input.Selection.Choice> choices;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ReaderCollectInputsParams.Input.Selection build() {
          return new ReaderCollectInputsParams.Input.Selection(this.choices, this.extraParams);
        }

        /**
         * Add an element to `choices` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ReaderCollectInputsParams.Input.Selection#choices} for the field documentation.
         */
        public Builder addChoice(ReaderCollectInputsParams.Input.Selection.Choice element) {
          if (this.choices == null) {
            this.choices = new ArrayList<>();
          }
          this.choices.add(element);
          return this;
        }

        /**
         * Add all elements to `choices` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ReaderCollectInputsParams.Input.Selection#choices} for the field documentation.
         */
        public Builder addAllChoice(
            List<ReaderCollectInputsParams.Input.Selection.Choice> elements) {
          if (this.choices == null) {
            this.choices = new ArrayList<>();
          }
          this.choices.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderCollectInputsParams.Input.Selection#extraParams} for the field
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
         * map. See {@link ReaderCollectInputsParams.Input.Selection#extraParams} for the field
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Choice {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The style of the button which will be shown for this choice. */
        @SerializedName("style")
        Style style;

        /** <strong>Required.</strong> The text which will be shown on the button for this choice */
        @SerializedName("value")
        String value;

        private Choice(Map<String, Object> extraParams, Style style, String value) {
          this.extraParams = extraParams;
          this.style = style;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Style style;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public ReaderCollectInputsParams.Input.Selection.Choice build() {
            return new ReaderCollectInputsParams.Input.Selection.Choice(
                this.extraParams, this.style, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ReaderCollectInputsParams.Input.Selection.Choice#extraParams} for the
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
           * map. See {@link ReaderCollectInputsParams.Input.Selection.Choice#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The style of the button which will be shown for this choice. */
          public Builder setStyle(ReaderCollectInputsParams.Input.Selection.Choice.Style style) {
            this.style = style;
            return this;
          }

          /**
           * <strong>Required.</strong> The text which will be shown on the button for this choice
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }

        public enum Style implements ApiRequestParams.EnumParam {
          @SerializedName("primary")
          PRIMARY("primary"),

          @SerializedName("secondary")
          SECONDARY("secondary");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Style(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Toggle {
      /** The default value of the toggle. */
      @SerializedName("default_value")
      DefaultValue defaultValue;

      /** The description which will be displayed for the toggle. */
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The title which will be displayed for the toggle. */
      @SerializedName("title")
      String title;

      private Toggle(
          DefaultValue defaultValue,
          String description,
          Map<String, Object> extraParams,
          String title) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.extraParams = extraParams;
        this.title = title;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DefaultValue defaultValue;

        private String description;

        private Map<String, Object> extraParams;

        private String title;

        /** Finalize and obtain parameter instance from this builder. */
        public ReaderCollectInputsParams.Input.Toggle build() {
          return new ReaderCollectInputsParams.Input.Toggle(
              this.defaultValue, this.description, this.extraParams, this.title);
        }

        /** The default value of the toggle. */
        public Builder setDefaultValue(
            ReaderCollectInputsParams.Input.Toggle.DefaultValue defaultValue) {
          this.defaultValue = defaultValue;
          return this;
        }

        /** The description which will be displayed for the toggle. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReaderCollectInputsParams.Input.Toggle#extraParams} for the field
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
         * map. See {@link ReaderCollectInputsParams.Input.Toggle#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The title which will be displayed for the toggle. */
        public Builder setTitle(String title) {
          this.title = title;
          return this;
        }
      }

      public enum DefaultValue implements ApiRequestParams.EnumParam {
        @SerializedName("disabled")
        DISABLED("disabled"),

        @SerializedName("enabled")
        ENABLED("enabled");

        @Getter(onMethod_ = {@Override})
        private final String value;

        DefaultValue(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("email")
      EMAIL("email"),

      @SerializedName("numeric")
      NUMERIC("numeric"),

      @SerializedName("phone")
      PHONE("phone"),

      @SerializedName("selection")
      SELECTION("selection"),

      @SerializedName("signature")
      SIGNATURE("signature"),

      @SerializedName("text")
      TEXT("text");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}

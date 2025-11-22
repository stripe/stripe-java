// File generated from our OpenAPI spec
package com.stripe.param.productcatalog;

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
public class TrialOfferCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Duration of one service period of the trial. */
  @SerializedName("duration")
  Duration duration;

  /** <strong>Required.</strong> Define behavior that occurs at the end of the trial. */
  @SerializedName("end_behavior")
  EndBehavior endBehavior;

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
   * <strong>Required.</strong> Price configuration during the trial period (amount, billing scheme,
   * etc).
   */
  @SerializedName("price")
  String price;

  private TrialOfferCreateParams(
      Duration duration,
      EndBehavior endBehavior,
      List<String> expand,
      Map<String, Object> extraParams,
      String price) {
    this.duration = duration;
    this.endBehavior = endBehavior;
    this.expand = expand;
    this.extraParams = extraParams;
    this.price = price;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Duration duration;

    private EndBehavior endBehavior;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String price;

    /** Finalize and obtain parameter instance from this builder. */
    public TrialOfferCreateParams build() {
      return new TrialOfferCreateParams(
          this.duration, this.endBehavior, this.expand, this.extraParams, this.price);
    }

    /** <strong>Required.</strong> Duration of one service period of the trial. */
    public Builder setDuration(TrialOfferCreateParams.Duration duration) {
      this.duration = duration;
      return this;
    }

    /** <strong>Required.</strong> Define behavior that occurs at the end of the trial. */
    public Builder setEndBehavior(TrialOfferCreateParams.EndBehavior endBehavior) {
      this.endBehavior = endBehavior;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TrialOfferCreateParams#expand} for the field documentation.
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
     * TrialOfferCreateParams#expand} for the field documentation.
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
     * TrialOfferCreateParams#extraParams} for the field documentation.
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
     * See {@link TrialOfferCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Price configuration during the trial period (amount, billing
     * scheme, etc).
     */
    public Builder setPrice(String price) {
      this.price = price;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Duration {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The relative duration of the trial period computed as the number of recurring price
     * intervals.
     */
    @SerializedName("relative")
    Relative relative;

    /** <strong>Required.</strong> Specifies how the trial offer duration is determined. */
    @SerializedName("type")
    Type type;

    private Duration(Map<String, Object> extraParams, Relative relative, Type type) {
      this.extraParams = extraParams;
      this.relative = relative;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Relative relative;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public TrialOfferCreateParams.Duration build() {
        return new TrialOfferCreateParams.Duration(this.extraParams, this.relative, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TrialOfferCreateParams.Duration#extraParams} for the field documentation.
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
       * See {@link TrialOfferCreateParams.Duration#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The relative duration of the trial period computed as the number of recurring price
       * intervals.
       */
      public Builder setRelative(TrialOfferCreateParams.Duration.Relative relative) {
        this.relative = relative;
        return this;
      }

      /** <strong>Required.</strong> Specifies how the trial offer duration is determined. */
      public Builder setType(TrialOfferCreateParams.Duration.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Relative {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The number of recurring price's interval to apply for the trial
       * period.
       */
      @SerializedName("iterations")
      Long iterations;

      private Relative(Map<String, Object> extraParams, Long iterations) {
        this.extraParams = extraParams;
        this.iterations = iterations;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long iterations;

        /** Finalize and obtain parameter instance from this builder. */
        public TrialOfferCreateParams.Duration.Relative build() {
          return new TrialOfferCreateParams.Duration.Relative(this.extraParams, this.iterations);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TrialOfferCreateParams.Duration.Relative#extraParams} for the field
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
         * map. See {@link TrialOfferCreateParams.Duration.Relative#extraParams} for the field
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
         * <strong>Required.</strong> The number of recurring price's interval to apply for the
         * trial period.
         */
        public Builder setIterations(Long iterations) {
          this.iterations = iterations;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("relative")
      RELATIVE("relative"),

      @SerializedName("timestamp")
      TIMESTAMP("timestamp");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class EndBehavior {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The transition to apply when the trial offer ends. */
    @SerializedName("transition")
    Transition transition;

    private EndBehavior(Map<String, Object> extraParams, Transition transition) {
      this.extraParams = extraParams;
      this.transition = transition;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Transition transition;

      /** Finalize and obtain parameter instance from this builder. */
      public TrialOfferCreateParams.EndBehavior build() {
        return new TrialOfferCreateParams.EndBehavior(this.extraParams, this.transition);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TrialOfferCreateParams.EndBehavior#extraParams} for the field documentation.
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
       * See {@link TrialOfferCreateParams.EndBehavior#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The transition to apply when the trial offer ends. */
      public Builder setTransition(TrialOfferCreateParams.EndBehavior.Transition transition) {
        this.transition = transition;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Transition {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The price to transition the recurring item to when the trial
       * offer ends.
       */
      @SerializedName("price")
      String price;

      private Transition(Map<String, Object> extraParams, String price) {
        this.extraParams = extraParams;
        this.price = price;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String price;

        /** Finalize and obtain parameter instance from this builder. */
        public TrialOfferCreateParams.EndBehavior.Transition build() {
          return new TrialOfferCreateParams.EndBehavior.Transition(this.extraParams, this.price);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link TrialOfferCreateParams.EndBehavior.Transition#extraParams} for the field
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
         * map. See {@link TrialOfferCreateParams.EndBehavior.Transition#extraParams} for the field
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
         * <strong>Required.</strong> The price to transition the recurring item to when the trial
         * offer ends.
         */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }
      }
    }
  }
}

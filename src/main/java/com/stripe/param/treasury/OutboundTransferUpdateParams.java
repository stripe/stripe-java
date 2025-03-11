// File generated from our OpenAPI spec
package com.stripe.param.treasury;

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
public class OutboundTransferUpdateParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> Details about network-specific tracking information. */
  @SerializedName("tracking_details")
  TrackingDetails trackingDetails;

  private OutboundTransferUpdateParams(
      List<String> expand, Map<String, Object> extraParams, TrackingDetails trackingDetails) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.trackingDetails = trackingDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private TrackingDetails trackingDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundTransferUpdateParams build() {
      return new OutboundTransferUpdateParams(this.expand, this.extraParams, this.trackingDetails);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OutboundTransferUpdateParams#expand} for the field documentation.
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
     * OutboundTransferUpdateParams#expand} for the field documentation.
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
     * OutboundTransferUpdateParams#extraParams} for the field documentation.
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
     * See {@link OutboundTransferUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Details about network-specific tracking information. */
    public Builder setTrackingDetails(
        OutboundTransferUpdateParams.TrackingDetails trackingDetails) {
      this.trackingDetails = trackingDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TrackingDetails {
    /** ACH network tracking details. */
    @SerializedName("ach")
    Ach ach;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The US bank account network used to send funds. */
    @SerializedName("type")
    Type type;

    /** US domestic wire network tracking details. */
    @SerializedName("us_domestic_wire")
    UsDomesticWire usDomesticWire;

    private TrackingDetails(
        Ach ach, Map<String, Object> extraParams, Type type, UsDomesticWire usDomesticWire) {
      this.ach = ach;
      this.extraParams = extraParams;
      this.type = type;
      this.usDomesticWire = usDomesticWire;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Ach ach;

      private Map<String, Object> extraParams;

      private Type type;

      private UsDomesticWire usDomesticWire;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundTransferUpdateParams.TrackingDetails build() {
        return new OutboundTransferUpdateParams.TrackingDetails(
            this.ach, this.extraParams, this.type, this.usDomesticWire);
      }

      /** ACH network tracking details. */
      public Builder setAch(OutboundTransferUpdateParams.TrackingDetails.Ach ach) {
        this.ach = ach;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundTransferUpdateParams.TrackingDetails#extraParams} for the field documentation.
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
       * See {@link OutboundTransferUpdateParams.TrackingDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The US bank account network used to send funds. */
      public Builder setType(OutboundTransferUpdateParams.TrackingDetails.Type type) {
        this.type = type;
        return this;
      }

      /** US domestic wire network tracking details. */
      public Builder setUsDomesticWire(
          OutboundTransferUpdateParams.TrackingDetails.UsDomesticWire usDomesticWire) {
        this.usDomesticWire = usDomesticWire;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> ACH trace ID for funds sent over the {@code ach} network. */
      @SerializedName("trace_id")
      Object traceId;

      private Ach(Map<String, Object> extraParams, Object traceId) {
        this.extraParams = extraParams;
        this.traceId = traceId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object traceId;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundTransferUpdateParams.TrackingDetails.Ach build() {
          return new OutboundTransferUpdateParams.TrackingDetails.Ach(
              this.extraParams, this.traceId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OutboundTransferUpdateParams.TrackingDetails.Ach#extraParams} for the
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
         * map. See {@link OutboundTransferUpdateParams.TrackingDetails.Ach#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> ACH trace ID for funds sent over the {@code ach} network. */
        public Builder setTraceId(String traceId) {
          this.traceId = traceId;
          return this;
        }

        /** <strong>Required.</strong> ACH trace ID for funds sent over the {@code ach} network. */
        public Builder setTraceId(EmptyParam traceId) {
          this.traceId = traceId;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsDomesticWire {
      /**
       * CHIPS System Sequence Number (SSN) for funds sent over the {@code us_domestic_wire}
       * network.
       */
      @SerializedName("chips")
      Object chips;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** IMAD for funds sent over the {@code us_domestic_wire} network. */
      @SerializedName("imad")
      Object imad;

      /** OMAD for funds sent over the {@code us_domestic_wire} network. */
      @SerializedName("omad")
      Object omad;

      private UsDomesticWire(
          Object chips, Map<String, Object> extraParams, Object imad, Object omad) {
        this.chips = chips;
        this.extraParams = extraParams;
        this.imad = imad;
        this.omad = omad;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object chips;

        private Map<String, Object> extraParams;

        private Object imad;

        private Object omad;

        /** Finalize and obtain parameter instance from this builder. */
        public OutboundTransferUpdateParams.TrackingDetails.UsDomesticWire build() {
          return new OutboundTransferUpdateParams.TrackingDetails.UsDomesticWire(
              this.chips, this.extraParams, this.imad, this.omad);
        }

        /**
         * CHIPS System Sequence Number (SSN) for funds sent over the {@code us_domestic_wire}
         * network.
         */
        public Builder setChips(String chips) {
          this.chips = chips;
          return this;
        }

        /**
         * CHIPS System Sequence Number (SSN) for funds sent over the {@code us_domestic_wire}
         * network.
         */
        public Builder setChips(EmptyParam chips) {
          this.chips = chips;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link OutboundTransferUpdateParams.TrackingDetails.UsDomesticWire#extraParams}
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
         * map. See {@link OutboundTransferUpdateParams.TrackingDetails.UsDomesticWire#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** IMAD for funds sent over the {@code us_domestic_wire} network. */
        public Builder setImad(String imad) {
          this.imad = imad;
          return this;
        }

        /** IMAD for funds sent over the {@code us_domestic_wire} network. */
        public Builder setImad(EmptyParam imad) {
          this.imad = imad;
          return this;
        }

        /** OMAD for funds sent over the {@code us_domestic_wire} network. */
        public Builder setOmad(String omad) {
          this.omad = omad;
          return this;
        }

        /** OMAD for funds sent over the {@code us_domestic_wire} network. */
        public Builder setOmad(EmptyParam omad) {
          this.omad = omad;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("ach")
      ACH("ach"),

      @SerializedName("us_domestic_wire")
      US_DOMESTIC_WIRE("us_domestic_wire");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}

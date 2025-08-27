// File generated from our OpenAPI spec
package com.stripe.param.v2.billing.pricingplans;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ComponentCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Details if this component is a License Fee. */
  @SerializedName("license_fee")
  LicenseFee licenseFee;

  /** An identifier that can be used to find this component. */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Details if this component is a Rate Card. */
  @SerializedName("rate_card")
  RateCard rateCard;

  /** Details if this component is a Service Action. */
  @SerializedName("service_action")
  ServiceAction serviceAction;

  /** <strong>Required.</strong> The type of the PricingPlanComponent. */
  @SerializedName("type")
  Type type;

  private ComponentCreateParams(
      Map<String, Object> extraParams,
      LicenseFee licenseFee,
      String lookupKey,
      Map<String, String> metadata,
      RateCard rateCard,
      ServiceAction serviceAction,
      Type type) {
    this.extraParams = extraParams;
    this.licenseFee = licenseFee;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.rateCard = rateCard;
    this.serviceAction = serviceAction;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private LicenseFee licenseFee;

    private String lookupKey;

    private Map<String, String> metadata;

    private RateCard rateCard;

    private ServiceAction serviceAction;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ComponentCreateParams build() {
      return new ComponentCreateParams(
          this.extraParams,
          this.licenseFee,
          this.lookupKey,
          this.metadata,
          this.rateCard,
          this.serviceAction,
          this.type);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ComponentCreateParams#extraParams} for the field documentation.
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
     * See {@link ComponentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Details if this component is a License Fee. */
    public Builder setLicenseFee(ComponentCreateParams.LicenseFee licenseFee) {
      this.licenseFee = licenseFee;
      return this;
    }

    /** An identifier that can be used to find this component. */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ComponentCreateParams#metadata} for the field documentation.
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
     * See {@link ComponentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Details if this component is a Rate Card. */
    public Builder setRateCard(ComponentCreateParams.RateCard rateCard) {
      this.rateCard = rateCard;
      return this;
    }

    /** Details if this component is a Service Action. */
    public Builder setServiceAction(ComponentCreateParams.ServiceAction serviceAction) {
      this.serviceAction = serviceAction;
      return this;
    }

    /** <strong>Required.</strong> The type of the PricingPlanComponent. */
    public Builder setType(ComponentCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LicenseFee {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID of the License Fee. */
    @SerializedName("id")
    String id;

    /** The version of the LicenseFee. Defaults to 'latest', if not specified. */
    @SerializedName("version")
    String version;

    private LicenseFee(Map<String, Object> extraParams, String id, String version) {
      this.extraParams = extraParams;
      this.id = id;
      this.version = version;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      private String version;

      /** Finalize and obtain parameter instance from this builder. */
      public ComponentCreateParams.LicenseFee build() {
        return new ComponentCreateParams.LicenseFee(this.extraParams, this.id, this.version);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ComponentCreateParams.LicenseFee#extraParams} for the field documentation.
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
       * See {@link ComponentCreateParams.LicenseFee#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of the License Fee. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The version of the LicenseFee. Defaults to 'latest', if not specified. */
      public Builder setVersion(String version) {
        this.version = version;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RateCard {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID of the Rate Card. */
    @SerializedName("id")
    String id;

    /** The version of the RateCard. Defaults to 'latest', if not specified. */
    @SerializedName("version")
    String version;

    private RateCard(Map<String, Object> extraParams, String id, String version) {
      this.extraParams = extraParams;
      this.id = id;
      this.version = version;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      private String version;

      /** Finalize and obtain parameter instance from this builder. */
      public ComponentCreateParams.RateCard build() {
        return new ComponentCreateParams.RateCard(this.extraParams, this.id, this.version);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ComponentCreateParams.RateCard#extraParams} for the field documentation.
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
       * See {@link ComponentCreateParams.RateCard#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of the Rate Card. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The version of the RateCard. Defaults to 'latest', if not specified. */
      public Builder setVersion(String version) {
        this.version = version;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ServiceAction {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID of the service action. */
    @SerializedName("id")
    String id;

    private ServiceAction(Map<String, Object> extraParams, String id) {
      this.extraParams = extraParams;
      this.id = id;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      /** Finalize and obtain parameter instance from this builder. */
      public ComponentCreateParams.ServiceAction build() {
        return new ComponentCreateParams.ServiceAction(this.extraParams, this.id);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ComponentCreateParams.ServiceAction#extraParams} for the field documentation.
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
       * See {@link ComponentCreateParams.ServiceAction#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of the service action. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("license_fee")
    LICENSE_FEE("license_fee"),

    @SerializedName("rate_card")
    RATE_CARD("rate_card"),

    @SerializedName("service_action")
    SERVICE_ACTION("service_action");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}

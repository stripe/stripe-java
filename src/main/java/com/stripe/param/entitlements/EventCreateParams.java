// File generated from our OpenAPI spec
package com.stripe.param.entitlements;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class EventCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The customer that is being granted or revoked entitlement to/from a
   * feature.
   */
  @SerializedName("customer")
  String customer;

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
   * <strong>Required.</strong> The feature that the customer is being granted/revoked entitlement
   * to/from.
   */
  @SerializedName("feature")
  String feature;

  /** Contains information about type=grant entitlement event. */
  @SerializedName("grant")
  Grant grant;

  /**
   * Contains information about entitlement events relating to features with type=quantity. Required
   * when the feature has type=quantity.
   */
  @SerializedName("quantity")
  Quantity quantity;

  /** <strong>Required.</strong> Whether the event is a grant or revocation of the feature. */
  @SerializedName("type")
  Type type;

  private EventCreateParams(
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String feature,
      Grant grant,
      Quantity quantity,
      Type type) {
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.feature = feature;
    this.grant = grant;
    this.quantity = quantity;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String feature;

    private Grant grant;

    private Quantity quantity;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public EventCreateParams build() {
      return new EventCreateParams(
          this.customer,
          this.expand,
          this.extraParams,
          this.feature,
          this.grant,
          this.quantity,
          this.type);
    }

    /**
     * <strong>Required.</strong> The customer that is being granted or revoked entitlement to/from
     * a feature.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventCreateParams#expand} for the field documentation.
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
     * EventCreateParams#expand} for the field documentation.
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
     * EventCreateParams#extraParams} for the field documentation.
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
     * See {@link EventCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The feature that the customer is being granted/revoked entitlement
     * to/from.
     */
    public Builder setFeature(String feature) {
      this.feature = feature;
      return this;
    }

    /** Contains information about type=grant entitlement event. */
    public Builder setGrant(EventCreateParams.Grant grant) {
      this.grant = grant;
      return this;
    }

    /**
     * Contains information about entitlement events relating to features with type=quantity.
     * Required when the feature has type=quantity.
     */
    public Builder setQuantity(EventCreateParams.Quantity quantity) {
      this.quantity = quantity;
      return this;
    }

    /** <strong>Required.</strong> Whether the event is a grant or revocation of the feature. */
    public Builder setType(EventCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class Grant {
    /**
     * <strong>Required.</strong> When manually creating a grant entitlement event, you can make it
     * a temporary grant by setting it to expire.
     */
    @SerializedName("expires_at")
    Long expiresAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Grant(Long expiresAt, Map<String, Object> extraParams) {
      this.expiresAt = expiresAt;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long expiresAt;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public EventCreateParams.Grant build() {
        return new EventCreateParams.Grant(this.expiresAt, this.extraParams);
      }

      /**
       * <strong>Required.</strong> When manually creating a grant entitlement event, you can make
       * it a temporary grant by setting it to expire.
       */
      public Builder setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EventCreateParams.Grant#extraParams} for the field documentation.
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
       * See {@link EventCreateParams.Grant#extraParams} for the field documentation.
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
  public static class Quantity {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When granting or revoking an entitlement to a type=quantity
     * feature, you must specify the number of units you're granting/revoking. When the entitlement
     * event type=grant, this number increments the total quantity available to the customer, and
     * when type=revoke it decrements the total quantity available to the customer.
     */
    @SerializedName("units")
    Long units;

    private Quantity(Map<String, Object> extraParams, Long units) {
      this.extraParams = extraParams;
      this.units = units;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long units;

      /** Finalize and obtain parameter instance from this builder. */
      public EventCreateParams.Quantity build() {
        return new EventCreateParams.Quantity(this.extraParams, this.units);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EventCreateParams.Quantity#extraParams} for the field documentation.
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
       * See {@link EventCreateParams.Quantity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> When granting or revoking an entitlement to a type=quantity
       * feature, you must specify the number of units you're granting/revoking. When the
       * entitlement event type=grant, this number increments the total quantity available to the
       * customer, and when type=revoke it decrements the total quantity available to the customer.
       */
      public Builder setUnits(Long units) {
        this.units = units;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("grant")
    GRANT("grant"),

    @SerializedName("revoke")
    REVOKE("revoke");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ActionServiceUpdateParams extends ApiRequestParams {
  /**
   * Details for the credit grant. Can only be set if the service action's {@code type} is {@code
   * credit_grant}.
   */
  @SerializedName("credit_grant")
  CreditGrant creditGrant;

  /**
   * Details for the credit grant per tenant. Can only be set if the service action's {@code type}
   * is {@code credit_grant_per_tenant}.
   */
  @SerializedName("credit_grant_per_tenant")
  CreditGrantPerTenant creditGrantPerTenant;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * An internal key you can use to search for this service action. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  private ActionServiceUpdateParams(
      CreditGrant creditGrant,
      CreditGrantPerTenant creditGrantPerTenant,
      Map<String, Object> extraParams,
      Object lookupKey) {
    this.creditGrant = creditGrant;
    this.creditGrantPerTenant = creditGrantPerTenant;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CreditGrant creditGrant;

    private CreditGrantPerTenant creditGrantPerTenant;

    private Map<String, Object> extraParams;

    private Object lookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public ActionServiceUpdateParams build() {
      return new ActionServiceUpdateParams(
          this.creditGrant, this.creditGrantPerTenant, this.extraParams, this.lookupKey);
    }

    /**
     * Details for the credit grant. Can only be set if the service action's {@code type} is {@code
     * credit_grant}.
     */
    public Builder setCreditGrant(ActionServiceUpdateParams.CreditGrant creditGrant) {
      this.creditGrant = creditGrant;
      return this;
    }

    /**
     * Details for the credit grant per tenant. Can only be set if the service action's {@code type}
     * is {@code credit_grant_per_tenant}.
     */
    public Builder setCreditGrantPerTenant(
        ActionServiceUpdateParams.CreditGrantPerTenant creditGrantPerTenant) {
      this.creditGrantPerTenant = creditGrantPerTenant;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ActionServiceUpdateParams#extraParams} for the field documentation.
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
     * See {@link ActionServiceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An internal key you can use to search for this service action. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * An internal key you can use to search for this service action. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrant {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A descriptive name shown in dashboard. */
    @SerializedName("name")
    Object name;

    private CreditGrant(Map<String, Object> extraParams, Object name) {
      this.extraParams = extraParams;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object name;

      /** Finalize and obtain parameter instance from this builder. */
      public ActionServiceUpdateParams.CreditGrant build() {
        return new ActionServiceUpdateParams.CreditGrant(this.extraParams, this.name);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ActionServiceUpdateParams.CreditGrant#extraParams} for the field documentation.
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
       * See {@link ActionServiceUpdateParams.CreditGrant#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A descriptive name shown in dashboard. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** A descriptive name shown in dashboard. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrantPerTenant {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A descriptive name shown in dashboard. */
    @SerializedName("name")
    Object name;

    private CreditGrantPerTenant(Map<String, Object> extraParams, Object name) {
      this.extraParams = extraParams;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object name;

      /** Finalize and obtain parameter instance from this builder. */
      public ActionServiceUpdateParams.CreditGrantPerTenant build() {
        return new ActionServiceUpdateParams.CreditGrantPerTenant(this.extraParams, this.name);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ActionServiceUpdateParams.CreditGrantPerTenant#extraParams} for the field documentation.
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
       * See {@link ActionServiceUpdateParams.CreditGrantPerTenant#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A descriptive name shown in dashboard. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** A descriptive name shown in dashboard. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }
    }
  }
}

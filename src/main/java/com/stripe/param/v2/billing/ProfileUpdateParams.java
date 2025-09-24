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
public class ProfileUpdateParams extends ApiRequestParams {
  /** The ID of the payment method object. */
  @SerializedName("default_payment_method")
  Object defaultPaymentMethod;

  /**
   * A customer-facing name for the billing profile. Maximum length of 250 characters. To remove the
   * display_name from the object, set it to null in the request.
   */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * An internal key you can use to search for a particular billing profile. It must be unique among
   * billing profiles for a given customer. Maximum length of 200 characters. To remove the
   * lookup_key from the object, set it to null in the request.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  private ProfileUpdateParams(
      Object defaultPaymentMethod,
      Object displayName,
      Map<String, Object> extraParams,
      Object lookupKey,
      Map<String, Object> metadata) {
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object defaultPaymentMethod;

    private Object displayName;

    private Map<String, Object> extraParams;

    private Object lookupKey;

    private Map<String, Object> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ProfileUpdateParams build() {
      return new ProfileUpdateParams(
          this.defaultPaymentMethod,
          this.displayName,
          this.extraParams,
          this.lookupKey,
          this.metadata);
    }

    /** The ID of the payment method object. */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /** The ID of the payment method object. */
    public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * A customer-facing name for the billing profile. Maximum length of 250 characters. To remove
     * the display_name from the object, set it to null in the request.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A customer-facing name for the billing profile. Maximum length of 250 characters. To remove
     * the display_name from the object, set it to null in the request.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProfileUpdateParams#extraParams} for the field documentation.
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
     * See {@link ProfileUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An internal key you can use to search for a particular billing profile. It must be unique
     * among billing profiles for a given customer. Maximum length of 200 characters. To remove the
     * lookup_key from the object, set it to null in the request.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * An internal key you can use to search for a particular billing profile. It must be unique
     * among billing profiles for a given customer. Maximum length of 200 characters. To remove the
     * lookup_key from the object, set it to null in the request.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProfileUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProfileUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * ProfileUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }
}

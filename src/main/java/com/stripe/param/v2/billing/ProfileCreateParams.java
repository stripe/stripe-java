// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ProfileCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the customer object. */
  @SerializedName("customer")
  String customer;

  /** The ID of the payment method object. */
  @SerializedName("default_payment_method")
  String defaultPaymentMethod;

  /** A customer-facing name for the billing profile. Maximum length of 250 characters. */
  @SerializedName("display_name")
  String displayName;

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
   * billing profiles for a given customer. Maximum length of 200 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private ProfileCreateParams(
      String customer,
      String defaultPaymentMethod,
      String displayName,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata) {
    this.customer = customer;
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
    private String customer;

    private String defaultPaymentMethod;

    private String displayName;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ProfileCreateParams build() {
      return new ProfileCreateParams(
          this.customer,
          this.defaultPaymentMethod,
          this.displayName,
          this.extraParams,
          this.lookupKey,
          this.metadata);
    }

    /** <strong>Required.</strong> The ID of the customer object. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The ID of the payment method object. */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /** A customer-facing name for the billing profile. Maximum length of 250 characters. */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProfileCreateParams#extraParams} for the field documentation.
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
     * See {@link ProfileCreateParams#extraParams} for the field documentation.
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
     * among billing profiles for a given customer. Maximum length of 200 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProfileCreateParams#metadata} for the field documentation.
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
     * See {@link ProfileCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }
}

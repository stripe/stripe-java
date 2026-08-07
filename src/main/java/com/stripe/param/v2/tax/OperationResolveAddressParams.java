// File generated from our OpenAPI spec
package com.stripe.param.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OperationResolveAddressParams extends ApiRequestParams {
  /** <strong>Required.</strong> The address to resolve. */
  @SerializedName("address")
  Address address;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private OperationResolveAddressParams(Address address, Map<String, Object> extraParams) {
    this.address = address;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Address address;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public OperationResolveAddressParams build() {
      return new OperationResolveAddressParams(this.address, this.extraParams);
    }

    /** <strong>Required.</strong> The address to resolve. */
    public Builder setAddress(OperationResolveAddressParams.Address address) {
      this.address = address;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OperationResolveAddressParams#extraParams} for the field documentation.
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
     * See {@link OperationResolveAddressParams#extraParams} for the field documentation.
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
  public static class Address {
    /** The city. */
    @SerializedName("city")
    String city;

    /** <strong>Required.</strong> The two-letter country code. */
    @SerializedName("country")
    String country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The first line of the street address. */
    @SerializedName("line1")
    String line1;

    /** The postal code. */
    @SerializedName("postal_code")
    String postalCode;

    /** The state or province. */
    @SerializedName("state")
    String state;

    private Address(
        String city,
        String country,
        Map<String, Object> extraParams,
        String line1,
        String postalCode,
        String state) {
      this.city = city;
      this.country = country;
      this.extraParams = extraParams;
      this.line1 = line1;
      this.postalCode = postalCode;
      this.state = state;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String city;

      private String country;

      private Map<String, Object> extraParams;

      private String line1;

      private String postalCode;

      private String state;

      /** Finalize and obtain parameter instance from this builder. */
      public OperationResolveAddressParams.Address build() {
        return new OperationResolveAddressParams.Address(
            this.city, this.country, this.extraParams, this.line1, this.postalCode, this.state);
      }

      /** The city. */
      public Builder setCity(String city) {
        this.city = city;
        return this;
      }

      /** <strong>Required.</strong> The two-letter country code. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OperationResolveAddressParams.Address#extraParams} for the field documentation.
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
       * See {@link OperationResolveAddressParams.Address#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The first line of the street address. */
      public Builder setLine1(String line1) {
        this.line1 = line1;
        return this;
      }

      /** The postal code. */
      public Builder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      /** The state or province. */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }
    }
  }
}

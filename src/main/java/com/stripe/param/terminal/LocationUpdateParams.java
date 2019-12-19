package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class LocationUpdateParams extends ApiRequestParams {
  /** The full address of the location. */
  @SerializedName("address")
  Address address;

  /** A name for the location. */
  @SerializedName("display_name")
  Object displayName;

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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * To [group
   * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
   * on your platform account by connected account, set this parameter to the connected account ID.
   */
  @SerializedName("operator_account")
  Object operatorAccount;

  private LocationUpdateParams(
      Address address,
      Object displayName,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Object operatorAccount) {
    this.address = address;
    this.displayName = displayName;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.operatorAccount = operatorAccount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Address address;

    private Object displayName;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Object operatorAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public LocationUpdateParams build() {
      return new LocationUpdateParams(
          this.address,
          this.displayName,
          this.expand,
          this.extraParams,
          this.metadata,
          this.operatorAccount);
    }

    /** The full address of the location. */
    public Builder setAddress(Address address) {
      this.address = address;
      return this;
    }

    /** A name for the location. */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /** A name for the location. */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LocationUpdateParams#expand} for the field documentation.
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
     * LocationUpdateParams#expand} for the field documentation.
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
     * LocationUpdateParams#extraParams} for the field documentation.
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
     * See {@link LocationUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * LocationUpdateParams#metadata} for the field documentation.
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
     * See {@link LocationUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * To [group
     * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
     * on your platform account by connected account, set this parameter to the connected account
     * ID.
     */
    public Builder setOperatorAccount(String operatorAccount) {
      this.operatorAccount = operatorAccount;
      return this;
    }

    /**
     * To [group
     * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
     * on your platform account by connected account, set this parameter to the connected account
     * ID.
     */
    public Builder setOperatorAccount(EmptyParam operatorAccount) {
      this.operatorAccount = operatorAccount;
      return this;
    }
  }

  @Getter
  public static class Address {
    @SerializedName("city")
    Object city;

    @SerializedName("country")
    Object country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("line1")
    Object line1;

    @SerializedName("line2")
    Object line2;

    @SerializedName("postal_code")
    Object postalCode;

    @SerializedName("state")
    Object state;

    private Address(
        Object city,
        Object country,
        Map<String, Object> extraParams,
        Object line1,
        Object line2,
        Object postalCode,
        Object state) {
      this.city = city;
      this.country = country;
      this.extraParams = extraParams;
      this.line1 = line1;
      this.line2 = line2;
      this.postalCode = postalCode;
      this.state = state;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object city;

      private Object country;

      private Map<String, Object> extraParams;

      private Object line1;

      private Object line2;

      private Object postalCode;

      private Object state;

      /** Finalize and obtain parameter instance from this builder. */
      public Address build() {
        return new Address(
            this.city,
            this.country,
            this.extraParams,
            this.line1,
            this.line2,
            this.postalCode,
            this.state);
      }

      public Builder setCity(String city) {
        this.city = city;
        return this;
      }

      public Builder setCity(EmptyParam city) {
        this.city = city;
        return this;
      }

      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      public Builder setCountry(EmptyParam country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LocationUpdateParams.Address#extraParams} for the field documentation.
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
       * See {@link LocationUpdateParams.Address#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setLine1(String line1) {
        this.line1 = line1;
        return this;
      }

      public Builder setLine1(EmptyParam line1) {
        this.line1 = line1;
        return this;
      }

      public Builder setLine2(String line2) {
        this.line2 = line2;
        return this;
      }

      public Builder setLine2(EmptyParam line2) {
        this.line2 = line2;
        return this;
      }

      public Builder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      public Builder setPostalCode(EmptyParam postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      public Builder setState(String state) {
        this.state = state;
        return this;
      }

      public Builder setState(EmptyParam state) {
        this.state = state;
        return this;
      }
    }
  }
}

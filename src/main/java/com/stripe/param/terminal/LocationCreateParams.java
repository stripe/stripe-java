package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationCreateParams extends ApiRequestParams {

  /** The full address of the location. */
  @SerializedName("address")
  LocationCreateParams.Address address;

  /** A name for the location. */
  @SerializedName("display_name")
  String displayName;

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
   * To [group
   * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
   * on your platform account by connected account, set this parameter to the connected account ID.
   */
  @SerializedName("operator_account")
  String operatorAccount;

  private LocationCreateParams(
      LocationCreateParams.Address address,
      String displayName,
      List<String> expand,
      Map<String, Object> extraParams,
      String operatorAccount) {

    this.address = address;
    this.displayName = displayName;
    this.expand = expand;
    this.extraParams = extraParams;
    this.operatorAccount = operatorAccount;
  }

  public static LocationCreateParams.Builder builder() {
    return new LocationCreateParams.Builder();
  }

  public static class Builder {
    private LocationCreateParams.Address address;
    private String displayName;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private String operatorAccount;

    public LocationCreateParams build() {
      return new LocationCreateParams(
          this.address, this.displayName, this.expand, this.extraParams, this.operatorAccount);
    }

    /** The full address of the location. */
    public LocationCreateParams.Builder setAddress(LocationCreateParams.Address address) {

      this.address = address;
      return this;
    }

    /** A name for the location. */
    public LocationCreateParams.Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LocationCreateParams#expand} for the field documentation.
     */
    public LocationCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LocationCreateParams#expand} for the field documentation.
     */
    public LocationCreateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * LocationCreateParams#extraParams} for the field documentation.
     */
    public LocationCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link LocationCreateParams#extraParams} for the field documentation.
     */
    public LocationCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * To [group
     * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
     * on your platform account by connected account, set this parameter to the connected account
     * ID.
     */
    public LocationCreateParams.Builder setOperatorAccount(String operatorAccount) {

      this.operatorAccount = operatorAccount;
      return this;
    }
  }

  public static class Address {
    @SerializedName("city")
    String city;

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

    @SerializedName("line1")
    String line1;

    @SerializedName("line2")
    String line2;

    @SerializedName("postal_code")
    String postalCode;

    @SerializedName("state")
    String state;

    private Address(
        String city,
        String country,
        Map<String, Object> extraParams,
        String line1,
        String line2,
        String postalCode,
        String state) {

      this.city = city;
      this.country = country;
      this.extraParams = extraParams;
      this.line1 = line1;
      this.line2 = line2;
      this.postalCode = postalCode;
      this.state = state;
    }

    public static LocationCreateParams.Address.Builder builder() {
      return new LocationCreateParams.Address.Builder();
    }

    public static class Builder {
      private String city;
      private String country;
      private Map<String, Object> extraParams;
      private String line1;
      private String line2;
      private String postalCode;
      private String state;

      public LocationCreateParams.Address build() {
        return new LocationCreateParams.Address(
            this.city,
            this.country,
            this.extraParams,
            this.line1,
            this.line2,
            this.postalCode,
            this.state);
      }

      public LocationCreateParams.Address.Builder setCity(String city) {
        this.city = city;
        return this;
      }

      public LocationCreateParams.Address.Builder setCountry(String country) {

        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LocationCreateParams.Address#extraParams} for the field documentation.
       */
      public LocationCreateParams.Address.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link LocationCreateParams.Address#extraParams} for the field documentation.
       */
      public LocationCreateParams.Address.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public LocationCreateParams.Address.Builder setLine1(String line1) {
        this.line1 = line1;
        return this;
      }

      public LocationCreateParams.Address.Builder setLine2(String line2) {
        this.line2 = line2;
        return this;
      }

      public LocationCreateParams.Address.Builder setPostalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
      }

      public LocationCreateParams.Address.Builder setState(String state) {
        this.state = state;
        return this;
      }
    }
  }
}

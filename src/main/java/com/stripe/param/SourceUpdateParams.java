package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourceUpdateParams extends ApiRequestParams {

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
   * A set of key-value pairs that you can attach to a source object. It can be useful for storing
   * additional information about the source in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Information about the owner of the payment instrument that may be used or required by
   * particular source types.
   */
  @SerializedName("owner")
  SourceUpdateParams.Owner owner;

  private SourceUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      SourceUpdateParams.Owner owner) {

    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.owner = owner;
  }

  public static SourceUpdateParams.Builder builder() {
    return new SourceUpdateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;
    private SourceUpdateParams.Owner owner;

    public SourceUpdateParams build() {
      return new SourceUpdateParams(this.expand, this.extraParams, this.metadata, this.owner);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SourceUpdateParams#expand} for the field documentation.
     */
    public SourceUpdateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SourceUpdateParams#expand} for the field documentation.
     */
    public SourceUpdateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SourceUpdateParams#extraParams} for the field documentation.
     */
    public SourceUpdateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SourceUpdateParams#extraParams} for the field documentation.
     */
    public SourceUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SourceUpdateParams#metadata} for the field documentation.
     */
    public SourceUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SourceUpdateParams#metadata} for the field documentation.
     */
    public SourceUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    public SourceUpdateParams.Builder setOwner(SourceUpdateParams.Owner owner) {

      this.owner = owner;
      return this;
    }
  }

  public static class Owner {

    /** Owner's address. */
    @SerializedName("address")
    SourceUpdateParams.Owner.Address address;

    /** Owner's email address. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Owner's full name. */
    @SerializedName("name")
    String name;

    /** Owner's phone number. */
    @SerializedName("phone")
    String phone;

    private Owner(
        SourceUpdateParams.Owner.Address address,
        String email,
        Map<String, Object> extraParams,
        String name,
        String phone) {

      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static SourceUpdateParams.Owner.Builder builder() {
      return new SourceUpdateParams.Owner.Builder();
    }

    public static class Builder {
      private SourceUpdateParams.Owner.Address address;
      private String email;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;

      public SourceUpdateParams.Owner build() {
        return new SourceUpdateParams.Owner(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Owner's address. */
      public SourceUpdateParams.Owner.Builder setAddress(SourceUpdateParams.Owner.Address address) {

        this.address = address;
        return this;
      }

      /** Owner's email address. */
      public SourceUpdateParams.Owner.Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceUpdateParams.Owner#extraParams} for the field documentation.
       */
      public SourceUpdateParams.Owner.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SourceUpdateParams.Owner#extraParams} for the field documentation.
       */
      public SourceUpdateParams.Owner.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Owner's full name. */
      public SourceUpdateParams.Owner.Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Owner's phone number. */
      public SourceUpdateParams.Owner.Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
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

      public static SourceUpdateParams.Owner.Address.Builder builder() {
        return new SourceUpdateParams.Owner.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public SourceUpdateParams.Owner.Address build() {
          return new SourceUpdateParams.Owner.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public SourceUpdateParams.Owner.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public SourceUpdateParams.Owner.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceUpdateParams.Owner.Address#extraParams} for the field
         * documentation.
         */
        public SourceUpdateParams.Owner.Address.Builder putExtraParam(String key, Object value) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceUpdateParams.Owner.Address#extraParams} for the field
         * documentation.
         */
        public SourceUpdateParams.Owner.Address.Builder putAllExtraParam(Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public SourceUpdateParams.Owner.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public SourceUpdateParams.Owner.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public SourceUpdateParams.Owner.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public SourceUpdateParams.Owner.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }
}

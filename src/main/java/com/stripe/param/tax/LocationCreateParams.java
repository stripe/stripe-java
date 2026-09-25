// File generated from our OpenAPI spec
package com.stripe.param.tax;

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
public class LocationCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The physical address of the tax location. */
  @SerializedName("address")
  Address address;

  /**
   * Details to identify the tax location by its venue, types of events held, or available services,
   * such as &quot;A spacious auditorium suitable for large concerts and events.&quot;.
   */
  @SerializedName("description")
  String description;

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
   * <strong>Required.</strong> The type of tax location. The only supported value is
   * &quot;performance&quot;.
   */
  @SerializedName("type")
  Type type;

  private LocationCreateParams(
      Address address,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Type type) {
    this.address = address;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Address address;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public LocationCreateParams build() {
      return new LocationCreateParams(
          this.address, this.description, this.expand, this.extraParams, this.type);
    }

    /** <strong>Required.</strong> The physical address of the tax location. */
    public Builder setAddress(LocationCreateParams.Address address) {
      this.address = address;
      return this;
    }

    /**
     * Details to identify the tax location by its venue, types of events held, or available
     * services, such as &quot;A spacious auditorium suitable for large concerts and events.&quot;.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * LocationCreateParams#expand} for the field documentation.
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
     * LocationCreateParams#expand} for the field documentation.
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
     * LocationCreateParams#extraParams} for the field documentation.
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
     * See {@link LocationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The type of tax location. The only supported value is
     * &quot;performance&quot;.
     */
    public Builder setType(LocationCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Address {
    /** City, district, suburb, town, or village. */
    @SerializedName("city")
    Object city;

    /**
     * <strong>Required.</strong> Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
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

    /** Address line 1, such as the street, PO Box, or company name. */
    @SerializedName("line1")
    Object line1;

    /** Address line 2, such as the apartment, suite, unit, or building. */
    @SerializedName("line2")
    Object line2;

    /** ZIP or postal code. */
    @SerializedName("postal_code")
    Object postalCode;

    /**
     * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
     * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
     */
    @SerializedName("state")
    Object state;

    private Address(
        Object city,
        String country,
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

      private String country;

      private Map<String, Object> extraParams;

      private Object line1;

      private Object line2;

      private Object postalCode;

      private Object state;

      /** Finalize and obtain parameter instance from this builder. */
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

      /** City, district, suburb, town, or village. */
      public Builder setCity(String city) {
        this.city = city;
        return this;
      }

      /** City, district, suburb, town, or village. */
      public Builder setCity(EmptyParam city) {
        this.city = city;
        return this;
      }

      /**
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * LocationCreateParams.Address#extraParams} for the field documentation.
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
       * See {@link LocationCreateParams.Address#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Address line 1, such as the street, PO Box, or company name. */
      public Builder setLine1(String line1) {
        this.line1 = line1;
        return this;
      }

      /** Address line 1, such as the street, PO Box, or company name. */
      public Builder setLine1(EmptyParam line1) {
        this.line1 = line1;
        return this;
      }

      /** Address line 2, such as the apartment, suite, unit, or building. */
      public Builder setLine2(String line2) {
        this.line2 = line2;
        return this;
      }

      /** Address line 2, such as the apartment, suite, unit, or building. */
      public Builder setLine2(EmptyParam line2) {
        this.line2 = line2;
        return this;
      }

      /** ZIP or postal code. */
      public Builder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      /** ZIP or postal code. */
      public Builder setPostalCode(EmptyParam postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
       */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix, such as &quot;NY&quot; or &quot;TX&quot;.
       */
      public Builder setState(EmptyParam state) {
        this.state = state;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("performance")
    PERFORMANCE("performance");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}

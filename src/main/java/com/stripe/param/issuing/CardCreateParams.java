package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class CardCreateParams extends ApiRequestParams {
  /**
   * The [Cardholder](https://stripe.com/docs/api#issuing_cardholder_object) object with which the
   * card will be associated.
   */
  @SerializedName("cardholder")
  String cardholder;

  /** The currency for the card. This currently must be `usd`. */
  @SerializedName("currency")
  String currency;

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

  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The card this is meant to be a replacement for (if any). */
  @SerializedName("replacement_for")
  String replacementFor;

  /**
   * If `replacement_for` is specified, this should indicate why that card is being replaced. One of
   * `damage`, `expiration`, `loss`, or `theft`.
   */
  @SerializedName("replacement_reason")
  ReplacementReason replacementReason;

  /** The address where the card will be shipped. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * Specifies whether to permit authorizations on this card. Possible values are `active` or
   * `inactive`.
   */
  @SerializedName("status")
  Status status;

  /** The type of card to issue. Possible values are `physical` or `virtual`. */
  @SerializedName("type")
  Type type;

  private CardCreateParams(
      String cardholder,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String replacementFor,
      ReplacementReason replacementReason,
      Shipping shipping,
      Status status,
      Type type) {
    this.cardholder = cardholder;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.replacementFor = replacementFor;
    this.replacementReason = replacementReason;
    this.shipping = shipping;
    this.status = status;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String cardholder;

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String replacementFor;

    private ReplacementReason replacementReason;

    private Shipping shipping;

    private Status status;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CardCreateParams build() {
      return new CardCreateParams(
          this.cardholder,
          this.currency,
          this.expand,
          this.extraParams,
          this.metadata,
          this.replacementFor,
          this.replacementReason,
          this.shipping,
          this.status,
          this.type);
    }

    /**
     * The [Cardholder](https://stripe.com/docs/api#issuing_cardholder_object) object with which the
     * card will be associated.
     */
    public Builder setCardholder(String cardholder) {
      this.cardholder = cardholder;
      return this;
    }

    /** The currency for the card. This currently must be `usd`. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardCreateParams#expand} for the field documentation.
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
     * CardCreateParams#expand} for the field documentation.
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
     * CardCreateParams#extraParams} for the field documentation.
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
     * See {@link CardCreateParams#extraParams} for the field documentation.
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
     * CardCreateParams#metadata} for the field documentation.
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
     * See {@link CardCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The card this is meant to be a replacement for (if any). */
    public Builder setReplacementFor(String replacementFor) {
      this.replacementFor = replacementFor;
      return this;
    }

    /**
     * If `replacement_for` is specified, this should indicate why that card is being replaced. One
     * of `damage`, `expiration`, `loss`, or `theft`.
     */
    public Builder setReplacementReason(ReplacementReason replacementReason) {
      this.replacementReason = replacementReason;
      return this;
    }

    /** The address where the card will be shipped. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * Specifies whether to permit authorizations on this card. Possible values are `active` or
     * `inactive`.
     */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }

    /** The type of card to issue. Possible values are `physical` or `virtual`. */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  public static class Shipping {
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

    @SerializedName("name")
    String name;

    /**
     * One of `bulk` or `individual`. Bulk shipments will be grouped and mailed together, while
     * individual ones will not.
     */
    @SerializedName("type")
    EnumParam type;

    private Shipping(
        Address address, Map<String, Object> extraParams, String name, EnumParam type) {
      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private String name;

      private EnumParam type;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(this.address, this.extraParams, this.name, this.type);
      }

      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardCreateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link CardCreateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * One of `bulk` or `individual`. Bulk shipments will be grouped and mailed together, while
       * individual ones will not.
       */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }

      /**
       * One of `bulk` or `individual`. Bulk shipments will be grouped and mailed together, while
       * individual ones will not.
       */
      public Builder setType(EmptyParam type) {
        this.type = type;
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

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

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

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
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

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("bulk")
      BULK("bulk"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum ReplacementReason implements ApiRequestParams.EnumParam {
    @SerializedName("damage")
    DAMAGE("damage"),

    @SerializedName("expiration")
    EXPIRATION("expiration"),

    @SerializedName("loss")
    LOSS("loss"),

    @SerializedName("theft")
    THEFT("theft");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ReplacementReason(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("physical")
    PHYSICAL("physical"),

    @SerializedName("virtual")
    VIRTUAL("virtual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}

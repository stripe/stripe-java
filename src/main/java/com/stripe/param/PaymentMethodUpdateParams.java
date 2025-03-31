// File generated from our OpenAPI spec
package com.stripe.param;

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
public class PaymentMethodUpdateParams extends ApiRequestParams {
  /**
   * This field indicates whether this payment method can be shown again to its customer in a
   * checkout flow. Stripe products such as Checkout and Elements use this field to determine
   * whether a payment method can be shown as a saved payment method in a checkout flow. The field
   * defaults to {@code unspecified}.
   */
  @SerializedName("allow_redisplay")
  AllowRedisplay allowRedisplay;

  /**
   * Billing information associated with the PaymentMethod that may be used or required by
   * particular types of payment methods.
   */
  @SerializedName("billing_details")
  BillingDetails billingDetails;

  /** If this is a {@code card} PaymentMethod, this hash contains the user's card details. */
  @SerializedName("card")
  Card card;

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
   * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
   * method.
   */
  @SerializedName("link")
  Link link;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * If this is a {@code pay_by_bank} PaymentMethod, this hash contains details about the PayByBank
   * payment method.
   */
  @SerializedName("pay_by_bank")
  PayByBank payByBank;

  /**
   * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the US
   * bank account payment method.
   */
  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  private PaymentMethodUpdateParams(
      AllowRedisplay allowRedisplay,
      BillingDetails billingDetails,
      Card card,
      List<String> expand,
      Map<String, Object> extraParams,
      Link link,
      Object metadata,
      PayByBank payByBank,
      UsBankAccount usBankAccount) {
    this.allowRedisplay = allowRedisplay;
    this.billingDetails = billingDetails;
    this.card = card;
    this.expand = expand;
    this.extraParams = extraParams;
    this.link = link;
    this.metadata = metadata;
    this.payByBank = payByBank;
    this.usBankAccount = usBankAccount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AllowRedisplay allowRedisplay;

    private BillingDetails billingDetails;

    private Card card;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Link link;

    private Object metadata;

    private PayByBank payByBank;

    private UsBankAccount usBankAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodUpdateParams build() {
      return new PaymentMethodUpdateParams(
          this.allowRedisplay,
          this.billingDetails,
          this.card,
          this.expand,
          this.extraParams,
          this.link,
          this.metadata,
          this.payByBank,
          this.usBankAccount);
    }

    /**
     * This field indicates whether this payment method can be shown again to its customer in a
     * checkout flow. Stripe products such as Checkout and Elements use this field to determine
     * whether a payment method can be shown as a saved payment method in a checkout flow. The field
     * defaults to {@code unspecified}.
     */
    public Builder setAllowRedisplay(PaymentMethodUpdateParams.AllowRedisplay allowRedisplay) {
      this.allowRedisplay = allowRedisplay;
      return this;
    }

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    public Builder setBillingDetails(PaymentMethodUpdateParams.BillingDetails billingDetails) {
      this.billingDetails = billingDetails;
      return this;
    }

    /** If this is a {@code card} PaymentMethod, this hash contains the user's card details. */
    public Builder setCard(PaymentMethodUpdateParams.Card card) {
      this.card = card;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodUpdateParams#expand} for the field documentation.
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
     * PaymentMethodUpdateParams#expand} for the field documentation.
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
     * PaymentMethodUpdateParams#extraParams} for the field documentation.
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
     * See {@link PaymentMethodUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
     * method.
     */
    public Builder setLink(PaymentMethodUpdateParams.Link link) {
      this.link = link;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * If this is a {@code pay_by_bank} PaymentMethod, this hash contains details about the
     * PayByBank payment method.
     */
    public Builder setPayByBank(PaymentMethodUpdateParams.PayByBank payByBank) {
      this.payByBank = payByBank;
      return this;
    }

    /**
     * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the US
     * bank account payment method.
     */
    public Builder setUsBankAccount(PaymentMethodUpdateParams.UsBankAccount usBankAccount) {
      this.usBankAccount = usBankAccount;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingDetails {
    /** Billing address. */
    @SerializedName("address")
    Object address;

    /** Email address. */
    @SerializedName("email")
    Object email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Full name. */
    @SerializedName("name")
    Object name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    Object phone;

    private BillingDetails(
        Object address, Object email, Map<String, Object> extraParams, Object name, Object phone) {
      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object address;

      private Object email;

      private Map<String, Object> extraParams;

      private Object name;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodUpdateParams.BillingDetails build() {
        return new PaymentMethodUpdateParams.BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Billing address. */
      public Builder setAddress(PaymentMethodUpdateParams.BillingDetails.Address address) {
        this.address = address;
        return this;
      }

      /** Billing address. */
      public Builder setAddress(EmptyParam address) {
        this.address = address;
        return this;
      }

      /** Email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /** Email address. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.BillingDetails#extraParams} for the field documentation.
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
       * See {@link PaymentMethodUpdateParams.BillingDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Full name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Full name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** Billing phone number (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Billing phone number (including extension). */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
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
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
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
        public PaymentMethodUpdateParams.BillingDetails.Address build() {
          return new PaymentMethodUpdateParams.BillingDetails.Address(
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodUpdateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
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
         * map. See {@link PaymentMethodUpdateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
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

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Card {
    /** Two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /** Four-digit number representing the card's expiration year. */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Contains information about card networks used to process the payment. */
    @SerializedName("networks")
    Networks networks;

    private Card(Long expMonth, Long expYear, Map<String, Object> extraParams, Networks networks) {
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.networks = networks;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long expMonth;

      private Long expYear;

      private Map<String, Object> extraParams;

      private Networks networks;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodUpdateParams.Card build() {
        return new PaymentMethodUpdateParams.Card(
            this.expMonth, this.expYear, this.extraParams, this.networks);
      }

      /** Two-digit number representing the card's expiration month. */
      public Builder setExpMonth(Long expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      /** Four-digit number representing the card's expiration year. */
      public Builder setExpYear(Long expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.Card#extraParams} for the field documentation.
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
       * See {@link PaymentMethodUpdateParams.Card#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Contains information about card networks used to process the payment. */
      public Builder setNetworks(PaymentMethodUpdateParams.Card.Networks networks) {
        this.networks = networks;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Networks {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The customer's preferred card network for co-branded cards. Supports {@code
       * cartes_bancaires}, {@code mastercard}, or {@code visa}. Selection of a network that does
       * not apply to the card will be stored as {@code invalid_preference} on the card.
       */
      @SerializedName("preferred")
      ApiRequestParams.EnumParam preferred;

      private Networks(Map<String, Object> extraParams, ApiRequestParams.EnumParam preferred) {
        this.extraParams = extraParams;
        this.preferred = preferred;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam preferred;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodUpdateParams.Card.Networks build() {
          return new PaymentMethodUpdateParams.Card.Networks(this.extraParams, this.preferred);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodUpdateParams.Card.Networks#extraParams} for the field
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
         * map. See {@link PaymentMethodUpdateParams.Card.Networks#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The customer's preferred card network for co-branded cards. Supports {@code
         * cartes_bancaires}, {@code mastercard}, or {@code visa}. Selection of a network that does
         * not apply to the card will be stored as {@code invalid_preference} on the card.
         */
        public Builder setPreferred(PaymentMethodUpdateParams.Card.Networks.Preferred preferred) {
          this.preferred = preferred;
          return this;
        }

        /**
         * The customer's preferred card network for co-branded cards. Supports {@code
         * cartes_bancaires}, {@code mastercard}, or {@code visa}. Selection of a network that does
         * not apply to the card will be stored as {@code invalid_preference} on the card.
         */
        public Builder setPreferred(EmptyParam preferred) {
          this.preferred = preferred;
          return this;
        }
      }

      public enum Preferred implements ApiRequestParams.EnumParam {
        @SerializedName("cartes_bancaires")
        CARTES_BANCAIRES("cartes_bancaires"),

        @SerializedName("mastercard")
        MASTERCARD("mastercard"),

        @SerializedName("visa")
        VISA("visa");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preferred(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Link {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Link(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodUpdateParams.Link build() {
        return new PaymentMethodUpdateParams.Link(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.Link#extraParams} for the field documentation.
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
       * See {@link PaymentMethodUpdateParams.Link#extraParams} for the field documentation.
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
  @EqualsAndHashCode(callSuper = false)
  public static class PayByBank {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PayByBank(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodUpdateParams.PayByBank build() {
        return new PaymentMethodUpdateParams.PayByBank(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.PayByBank#extraParams} for the field documentation.
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
       * See {@link PaymentMethodUpdateParams.PayByBank#extraParams} for the field documentation.
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
  @EqualsAndHashCode(callSuper = false)
  public static class UsBankAccount {
    /** Bank account holder type. */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** Bank account type. */
    @SerializedName("account_type")
    AccountType accountType;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private UsBankAccount(
        AccountHolderType accountHolderType,
        AccountType accountType,
        Map<String, Object> extraParams) {
      this.accountHolderType = accountHolderType;
      this.accountType = accountType;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountHolderType accountHolderType;

      private AccountType accountType;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodUpdateParams.UsBankAccount build() {
        return new PaymentMethodUpdateParams.UsBankAccount(
            this.accountHolderType, this.accountType, this.extraParams);
      }

      /** Bank account holder type. */
      public Builder setAccountHolderType(
          PaymentMethodUpdateParams.UsBankAccount.AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** Bank account type. */
      public Builder setAccountType(
          PaymentMethodUpdateParams.UsBankAccount.AccountType accountType) {
        this.accountType = accountType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.UsBankAccount#extraParams} for the field documentation.
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
       * See {@link PaymentMethodUpdateParams.UsBankAccount#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum AccountHolderType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountHolderType(String value) {
        this.value = value;
      }
    }

    public enum AccountType implements ApiRequestParams.EnumParam {
      @SerializedName("checking")
      CHECKING("checking"),

      @SerializedName("savings")
      SAVINGS("savings");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountType(String value) {
        this.value = value;
      }
    }
  }

  public enum AllowRedisplay implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("limited")
    LIMITED("limited"),

    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AllowRedisplay(String value) {
      this.value = value;
    }
  }
}

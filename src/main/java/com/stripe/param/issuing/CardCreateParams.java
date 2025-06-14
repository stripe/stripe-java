// File generated from our OpenAPI spec
package com.stripe.param.issuing;

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
public class CardCreateParams extends ApiRequestParams {
  /**
   * The <a href="https://stripe.com/docs/api#issuing_cardholder_object">Cardholder</a> object with
   * which the card will be associated.
   */
  @SerializedName("cardholder")
  String cardholder;

  /** <strong>Required.</strong> The currency for the card. */
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

  /**
   * The new financial account ID the card will be associated with. This field allows a card to be
   * reassigned to a different financial account.
   */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The personalization design object belonging to this card. */
  @SerializedName("personalization_design")
  String personalizationDesign;

  /** The desired PIN for this card. */
  @SerializedName("pin")
  Pin pin;

  /** The card this is meant to be a replacement for (if any). */
  @SerializedName("replacement_for")
  String replacementFor;

  /**
   * If {@code replacement_for} is specified, this should indicate why that card is being replaced.
   */
  @SerializedName("replacement_reason")
  ReplacementReason replacementReason;

  /** The second line to print on the card. Max length: 24 characters. */
  @SerializedName("second_line")
  Object secondLine;

  /** The address where the card will be shipped. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * Rules that control spending for this card. Refer to our <a
   * href="https://stripe.com/docs/issuing/controls/spending-controls">documentation</a> for more
   * details.
   */
  @SerializedName("spending_controls")
  SpendingControls spendingControls;

  /**
   * Whether authorizations can be approved on this card. May be blocked from activating cards
   * depending on past-due Cardholder requirements. Defaults to {@code inactive}.
   */
  @SerializedName("status")
  Status status;

  /**
   * <strong>Required.</strong> The type of card to issue. Possible values are {@code physical} or
   * {@code virtual}.
   */
  @SerializedName("type")
  Type type;

  private CardCreateParams(
      String cardholder,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      Map<String, String> metadata,
      String personalizationDesign,
      Pin pin,
      String replacementFor,
      ReplacementReason replacementReason,
      Object secondLine,
      Shipping shipping,
      SpendingControls spendingControls,
      Status status,
      Type type) {
    this.cardholder = cardholder;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.metadata = metadata;
    this.personalizationDesign = personalizationDesign;
    this.pin = pin;
    this.replacementFor = replacementFor;
    this.replacementReason = replacementReason;
    this.secondLine = secondLine;
    this.shipping = shipping;
    this.spendingControls = spendingControls;
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

    private String financialAccount;

    private Map<String, String> metadata;

    private String personalizationDesign;

    private Pin pin;

    private String replacementFor;

    private ReplacementReason replacementReason;

    private Object secondLine;

    private Shipping shipping;

    private SpendingControls spendingControls;

    private Status status;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CardCreateParams build() {
      return new CardCreateParams(
          this.cardholder,
          this.currency,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.metadata,
          this.personalizationDesign,
          this.pin,
          this.replacementFor,
          this.replacementReason,
          this.secondLine,
          this.shipping,
          this.spendingControls,
          this.status,
          this.type);
    }

    /**
     * The <a href="https://stripe.com/docs/api#issuing_cardholder_object">Cardholder</a> object
     * with which the card will be associated.
     */
    public Builder setCardholder(String cardholder) {
      this.cardholder = cardholder;
      return this;
    }

    /** <strong>Required.</strong> The currency for the card. */
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
     * The new financial account ID the card will be associated with. This field allows a card to be
     * reassigned to a different financial account.
     */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
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

    /** The personalization design object belonging to this card. */
    public Builder setPersonalizationDesign(String personalizationDesign) {
      this.personalizationDesign = personalizationDesign;
      return this;
    }

    /** The desired PIN for this card. */
    public Builder setPin(CardCreateParams.Pin pin) {
      this.pin = pin;
      return this;
    }

    /** The card this is meant to be a replacement for (if any). */
    public Builder setReplacementFor(String replacementFor) {
      this.replacementFor = replacementFor;
      return this;
    }

    /**
     * If {@code replacement_for} is specified, this should indicate why that card is being
     * replaced.
     */
    public Builder setReplacementReason(CardCreateParams.ReplacementReason replacementReason) {
      this.replacementReason = replacementReason;
      return this;
    }

    /** The second line to print on the card. Max length: 24 characters. */
    public Builder setSecondLine(String secondLine) {
      this.secondLine = secondLine;
      return this;
    }

    /** The second line to print on the card. Max length: 24 characters. */
    public Builder setSecondLine(EmptyParam secondLine) {
      this.secondLine = secondLine;
      return this;
    }

    /** The address where the card will be shipped. */
    public Builder setShipping(CardCreateParams.Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * Rules that control spending for this card. Refer to our <a
     * href="https://stripe.com/docs/issuing/controls/spending-controls">documentation</a> for more
     * details.
     */
    public Builder setSpendingControls(CardCreateParams.SpendingControls spendingControls) {
      this.spendingControls = spendingControls;
      return this;
    }

    /**
     * Whether authorizations can be approved on this card. May be blocked from activating cards
     * depending on past-due Cardholder requirements. Defaults to {@code inactive}.
     */
    public Builder setStatus(CardCreateParams.Status status) {
      this.status = status;
      return this;
    }

    /**
     * <strong>Required.</strong> The type of card to issue. Possible values are {@code physical} or
     * {@code virtual}.
     */
    public Builder setType(CardCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Pin {
    /** The card's desired new PIN, encrypted under Stripe's public key. */
    @SerializedName("encrypted_number")
    String encryptedNumber;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Pin(String encryptedNumber, Map<String, Object> extraParams) {
      this.encryptedNumber = encryptedNumber;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String encryptedNumber;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CardCreateParams.Pin build() {
        return new CardCreateParams.Pin(this.encryptedNumber, this.extraParams);
      }

      /** The card's desired new PIN, encrypted under Stripe's public key. */
      public Builder setEncryptedNumber(String encryptedNumber) {
        this.encryptedNumber = encryptedNumber;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardCreateParams.Pin#extraParams} for the field documentation.
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
       * See {@link CardCreateParams.Pin#extraParams} for the field documentation.
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
  public static class Shipping {
    /** <strong>Required.</strong> The address that the card is shipped to. */
    @SerializedName("address")
    Address address;

    /** Address validation settings. */
    @SerializedName("address_validation")
    AddressValidation addressValidation;

    /** Customs information for the shipment. */
    @SerializedName("customs")
    Customs customs;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The name printed on the shipping label when shipping the card. */
    @SerializedName("name")
    String name;

    /** Phone number of the recipient of the shipment. */
    @SerializedName("phone_number")
    String phoneNumber;

    /** Whether a signature is required for card delivery. */
    @SerializedName("require_signature")
    Boolean requireSignature;

    /** Shipment service. */
    @SerializedName("service")
    Service service;

    /** Packaging options. */
    @SerializedName("type")
    Type type;

    private Shipping(
        Address address,
        AddressValidation addressValidation,
        Customs customs,
        Map<String, Object> extraParams,
        String name,
        String phoneNumber,
        Boolean requireSignature,
        Service service,
        Type type) {
      this.address = address;
      this.addressValidation = addressValidation;
      this.customs = customs;
      this.extraParams = extraParams;
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.requireSignature = requireSignature;
      this.service = service;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private AddressValidation addressValidation;

      private Customs customs;

      private Map<String, Object> extraParams;

      private String name;

      private String phoneNumber;

      private Boolean requireSignature;

      private Service service;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CardCreateParams.Shipping build() {
        return new CardCreateParams.Shipping(
            this.address,
            this.addressValidation,
            this.customs,
            this.extraParams,
            this.name,
            this.phoneNumber,
            this.requireSignature,
            this.service,
            this.type);
      }

      /** <strong>Required.</strong> The address that the card is shipped to. */
      public Builder setAddress(CardCreateParams.Shipping.Address address) {
        this.address = address;
        return this;
      }

      /** Address validation settings. */
      public Builder setAddressValidation(
          CardCreateParams.Shipping.AddressValidation addressValidation) {
        this.addressValidation = addressValidation;
        return this;
      }

      /** Customs information for the shipment. */
      public Builder setCustoms(CardCreateParams.Shipping.Customs customs) {
        this.customs = customs;
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

      /**
       * <strong>Required.</strong> The name printed on the shipping label when shipping the card.
       */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Phone number of the recipient of the shipment. */
      public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
      }

      /** Whether a signature is required for card delivery. */
      public Builder setRequireSignature(Boolean requireSignature) {
        this.requireSignature = requireSignature;
        return this;
      }

      /** Shipment service. */
      public Builder setService(CardCreateParams.Shipping.Service service) {
        this.service = service;
        return this;
      }

      /** Packaging options. */
      public Builder setType(CardCreateParams.Shipping.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** <strong>Required.</strong> City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * <strong>Required.</strong> Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
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

      /** <strong>Required.</strong> Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** <strong>Required.</strong> ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
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
        public CardCreateParams.Shipping.Address build() {
          return new CardCreateParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** <strong>Required.</strong> City, district, suburb, town, or village. */
        public Builder setCity(String city) {
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

        /** <strong>Required.</strong> Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** <strong>Required.</strong> ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressValidation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The address validation capabilities to use. */
      @SerializedName("mode")
      Mode mode;

      private AddressValidation(Map<String, Object> extraParams, Mode mode) {
        this.extraParams = extraParams;
        this.mode = mode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Mode mode;

        /** Finalize and obtain parameter instance from this builder. */
        public CardCreateParams.Shipping.AddressValidation build() {
          return new CardCreateParams.Shipping.AddressValidation(this.extraParams, this.mode);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardCreateParams.Shipping.AddressValidation#extraParams} for the field
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
         * map. See {@link CardCreateParams.Shipping.AddressValidation#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The address validation capabilities to use. */
        public Builder setMode(CardCreateParams.Shipping.AddressValidation.Mode mode) {
          this.mode = mode;
          return this;
        }
      }

      public enum Mode implements ApiRequestParams.EnumParam {
        @SerializedName("disabled")
        DISABLED("disabled"),

        @SerializedName("normalization_only")
        NORMALIZATION_ONLY("normalization_only"),

        @SerializedName("validation_and_normalization")
        VALIDATION_AND_NORMALIZATION("validation_and_normalization");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Mode(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Customs {
      /**
       * The Economic Operators Registration and Identification (EORI) number to use for Customs.
       * Required for bulk shipments to Europe.
       */
      @SerializedName("eori_number")
      String eoriNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Customs(String eoriNumber, Map<String, Object> extraParams) {
        this.eoriNumber = eoriNumber;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String eoriNumber;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public CardCreateParams.Shipping.Customs build() {
          return new CardCreateParams.Shipping.Customs(this.eoriNumber, this.extraParams);
        }

        /**
         * The Economic Operators Registration and Identification (EORI) number to use for Customs.
         * Required for bulk shipments to Europe.
         */
        public Builder setEoriNumber(String eoriNumber) {
          this.eoriNumber = eoriNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardCreateParams.Shipping.Customs#extraParams} for the field
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
         * map. See {@link CardCreateParams.Shipping.Customs#extraParams} for the field
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
    }

    public enum Service implements ApiRequestParams.EnumParam {
      @SerializedName("express")
      EXPRESS("express"),

      @SerializedName("priority")
      PRIORITY("priority"),

      @SerializedName("standard")
      STANDARD("standard");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Service(String value) {
        this.value = value;
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingControls {
    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to allow. All other categories will be blocked. Cannot be set with {@code
     * blocked_categories}.
     */
    @SerializedName("allowed_categories")
    List<CardCreateParams.SpendingControls.AllowedCategory> allowedCategories;

    /**
     * Array of strings containing representing countries from which authorizations will be allowed.
     * Authorizations from merchants in all other countries will be declined. Country codes should
     * be ISO 3166 alpha-2 country codes (e.g. {@code US}). Cannot be set with {@code
     * blocked_merchant_countries}. Provide an empty value to unset this control.
     */
    @SerializedName("allowed_merchant_countries")
    List<String> allowedMerchantCountries;

    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to decline. All other categories will be allowed. Cannot be set with {@code
     * allowed_categories}.
     */
    @SerializedName("blocked_categories")
    List<CardCreateParams.SpendingControls.BlockedCategory> blockedCategories;

    /**
     * Array of strings containing representing countries from which authorizations will be
     * declined. Country codes should be ISO 3166 alpha-2 country codes (e.g. {@code US}). Cannot be
     * set with {@code allowed_merchant_countries}. Provide an empty value to unset this control.
     */
    @SerializedName("blocked_merchant_countries")
    List<String> blockedMerchantCountries;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Limit spending with amount-based rules that apply across any cards this card replaced (i.e.,
     * its {@code replacement_for} card and <em>that</em> card's {@code replacement_for} card, up
     * the chain).
     */
    @SerializedName("spending_limits")
    List<CardCreateParams.SpendingControls.SpendingLimit> spendingLimits;

    private SpendingControls(
        List<CardCreateParams.SpendingControls.AllowedCategory> allowedCategories,
        List<String> allowedMerchantCountries,
        List<CardCreateParams.SpendingControls.BlockedCategory> blockedCategories,
        List<String> blockedMerchantCountries,
        Map<String, Object> extraParams,
        List<CardCreateParams.SpendingControls.SpendingLimit> spendingLimits) {
      this.allowedCategories = allowedCategories;
      this.allowedMerchantCountries = allowedMerchantCountries;
      this.blockedCategories = blockedCategories;
      this.blockedMerchantCountries = blockedMerchantCountries;
      this.extraParams = extraParams;
      this.spendingLimits = spendingLimits;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<CardCreateParams.SpendingControls.AllowedCategory> allowedCategories;

      private List<String> allowedMerchantCountries;

      private List<CardCreateParams.SpendingControls.BlockedCategory> blockedCategories;

      private List<String> blockedMerchantCountries;

      private Map<String, Object> extraParams;

      private List<CardCreateParams.SpendingControls.SpendingLimit> spendingLimits;

      /** Finalize and obtain parameter instance from this builder. */
      public CardCreateParams.SpendingControls build() {
        return new CardCreateParams.SpendingControls(
            this.allowedCategories,
            this.allowedMerchantCountries,
            this.blockedCategories,
            this.blockedMerchantCountries,
            this.extraParams,
            this.spendingLimits);
      }

      /**
       * Add an element to `allowedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#allowedCategories} for the field documentation.
       */
      public Builder addAllowedCategory(CardCreateParams.SpendingControls.AllowedCategory element) {
        if (this.allowedCategories == null) {
          this.allowedCategories = new ArrayList<>();
        }
        this.allowedCategories.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#allowedCategories} for the field documentation.
       */
      public Builder addAllAllowedCategory(
          List<CardCreateParams.SpendingControls.AllowedCategory> elements) {
        if (this.allowedCategories == null) {
          this.allowedCategories = new ArrayList<>();
        }
        this.allowedCategories.addAll(elements);
        return this;
      }

      /**
       * Add an element to `allowedMerchantCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#allowedMerchantCountries} for the field
       * documentation.
       */
      public Builder addAllowedMerchantCountry(String element) {
        if (this.allowedMerchantCountries == null) {
          this.allowedMerchantCountries = new ArrayList<>();
        }
        this.allowedMerchantCountries.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedMerchantCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#allowedMerchantCountries} for the field
       * documentation.
       */
      public Builder addAllAllowedMerchantCountry(List<String> elements) {
        if (this.allowedMerchantCountries == null) {
          this.allowedMerchantCountries = new ArrayList<>();
        }
        this.allowedMerchantCountries.addAll(elements);
        return this;
      }

      /**
       * Add an element to `blockedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#blockedCategories} for the field documentation.
       */
      public Builder addBlockedCategory(CardCreateParams.SpendingControls.BlockedCategory element) {
        if (this.blockedCategories == null) {
          this.blockedCategories = new ArrayList<>();
        }
        this.blockedCategories.add(element);
        return this;
      }

      /**
       * Add all elements to `blockedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#blockedCategories} for the field documentation.
       */
      public Builder addAllBlockedCategory(
          List<CardCreateParams.SpendingControls.BlockedCategory> elements) {
        if (this.blockedCategories == null) {
          this.blockedCategories = new ArrayList<>();
        }
        this.blockedCategories.addAll(elements);
        return this;
      }

      /**
       * Add an element to `blockedMerchantCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#blockedMerchantCountries} for the field
       * documentation.
       */
      public Builder addBlockedMerchantCountry(String element) {
        if (this.blockedMerchantCountries == null) {
          this.blockedMerchantCountries = new ArrayList<>();
        }
        this.blockedMerchantCountries.add(element);
        return this;
      }

      /**
       * Add all elements to `blockedMerchantCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardCreateParams.SpendingControls#blockedMerchantCountries} for the field
       * documentation.
       */
      public Builder addAllBlockedMerchantCountry(List<String> elements) {
        if (this.blockedMerchantCountries == null) {
          this.blockedMerchantCountries = new ArrayList<>();
        }
        this.blockedMerchantCountries.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardCreateParams.SpendingControls#extraParams} for the field documentation.
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
       * See {@link CardCreateParams.SpendingControls#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `spendingLimits` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CardCreateParams.SpendingControls#spendingLimits} for the field documentation.
       */
      public Builder addSpendingLimit(CardCreateParams.SpendingControls.SpendingLimit element) {
        if (this.spendingLimits == null) {
          this.spendingLimits = new ArrayList<>();
        }
        this.spendingLimits.add(element);
        return this;
      }

      /**
       * Add all elements to `spendingLimits` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CardCreateParams.SpendingControls#spendingLimits} for the field documentation.
       */
      public Builder addAllSpendingLimit(
          List<CardCreateParams.SpendingControls.SpendingLimit> elements) {
        if (this.spendingLimits == null) {
          this.spendingLimits = new ArrayList<>();
        }
        this.spendingLimits.addAll(elements);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class SpendingLimit {
      /** <strong>Required.</strong> Maximum amount allowed to spend per interval. */
      @SerializedName("amount")
      Long amount;

      /**
       * Array of strings containing <a
       * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
       * this limit applies to. Omitting this field will apply the limit to all categories.
       */
      @SerializedName("categories")
      List<CardCreateParams.SpendingControls.SpendingLimit.Category> categories;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Interval (or event) to which the amount applies. */
      @SerializedName("interval")
      Interval interval;

      private SpendingLimit(
          Long amount,
          List<CardCreateParams.SpendingControls.SpendingLimit.Category> categories,
          Map<String, Object> extraParams,
          Interval interval) {
        this.amount = amount;
        this.categories = categories;
        this.extraParams = extraParams;
        this.interval = interval;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private List<CardCreateParams.SpendingControls.SpendingLimit.Category> categories;

        private Map<String, Object> extraParams;

        private Interval interval;

        /** Finalize and obtain parameter instance from this builder. */
        public CardCreateParams.SpendingControls.SpendingLimit build() {
          return new CardCreateParams.SpendingControls.SpendingLimit(
              this.amount, this.categories, this.extraParams, this.interval);
        }

        /** <strong>Required.</strong> Maximum amount allowed to spend per interval. */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * Add an element to `categories` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * CardCreateParams.SpendingControls.SpendingLimit#categories} for the field documentation.
         */
        public Builder addCategory(
            CardCreateParams.SpendingControls.SpendingLimit.Category element) {
          if (this.categories == null) {
            this.categories = new ArrayList<>();
          }
          this.categories.add(element);
          return this;
        }

        /**
         * Add all elements to `categories` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * CardCreateParams.SpendingControls.SpendingLimit#categories} for the field documentation.
         */
        public Builder addAllCategory(
            List<CardCreateParams.SpendingControls.SpendingLimit.Category> elements) {
          if (this.categories == null) {
            this.categories = new ArrayList<>();
          }
          this.categories.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardCreateParams.SpendingControls.SpendingLimit#extraParams} for the
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
         * map. See {@link CardCreateParams.SpendingControls.SpendingLimit#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Interval (or event) to which the amount applies. */
        public Builder setInterval(
            CardCreateParams.SpendingControls.SpendingLimit.Interval interval) {
          this.interval = interval;
          return this;
        }
      }

      public enum Category implements ApiRequestParams.EnumParam {
        @SerializedName("ac_refrigeration_repair")
        AC_REFRIGERATION_REPAIR("ac_refrigeration_repair"),

        @SerializedName("accounting_bookkeeping_services")
        ACCOUNTING_BOOKKEEPING_SERVICES("accounting_bookkeeping_services"),

        @SerializedName("advertising_services")
        ADVERTISING_SERVICES("advertising_services"),

        @SerializedName("agricultural_cooperative")
        AGRICULTURAL_COOPERATIVE("agricultural_cooperative"),

        @SerializedName("airlines_air_carriers")
        AIRLINES_AIR_CARRIERS("airlines_air_carriers"),

        @SerializedName("airports_flying_fields")
        AIRPORTS_FLYING_FIELDS("airports_flying_fields"),

        @SerializedName("ambulance_services")
        AMBULANCE_SERVICES("ambulance_services"),

        @SerializedName("amusement_parks_carnivals")
        AMUSEMENT_PARKS_CARNIVALS("amusement_parks_carnivals"),

        @SerializedName("antique_reproductions")
        ANTIQUE_REPRODUCTIONS("antique_reproductions"),

        @SerializedName("antique_shops")
        ANTIQUE_SHOPS("antique_shops"),

        @SerializedName("aquariums")
        AQUARIUMS("aquariums"),

        @SerializedName("architectural_surveying_services")
        ARCHITECTURAL_SURVEYING_SERVICES("architectural_surveying_services"),

        @SerializedName("art_dealers_and_galleries")
        ART_DEALERS_AND_GALLERIES("art_dealers_and_galleries"),

        @SerializedName("artists_supply_and_craft_shops")
        ARTISTS_SUPPLY_AND_CRAFT_SHOPS("artists_supply_and_craft_shops"),

        @SerializedName("auto_and_home_supply_stores")
        AUTO_AND_HOME_SUPPLY_STORES("auto_and_home_supply_stores"),

        @SerializedName("auto_body_repair_shops")
        AUTO_BODY_REPAIR_SHOPS("auto_body_repair_shops"),

        @SerializedName("auto_paint_shops")
        AUTO_PAINT_SHOPS("auto_paint_shops"),

        @SerializedName("auto_service_shops")
        AUTO_SERVICE_SHOPS("auto_service_shops"),

        @SerializedName("automated_cash_disburse")
        AUTOMATED_CASH_DISBURSE("automated_cash_disburse"),

        @SerializedName("automated_fuel_dispensers")
        AUTOMATED_FUEL_DISPENSERS("automated_fuel_dispensers"),

        @SerializedName("automobile_associations")
        AUTOMOBILE_ASSOCIATIONS("automobile_associations"),

        @SerializedName("automotive_parts_and_accessories_stores")
        AUTOMOTIVE_PARTS_AND_ACCESSORIES_STORES("automotive_parts_and_accessories_stores"),

        @SerializedName("automotive_tire_stores")
        AUTOMOTIVE_TIRE_STORES("automotive_tire_stores"),

        @SerializedName("bail_and_bond_payments")
        BAIL_AND_BOND_PAYMENTS("bail_and_bond_payments"),

        @SerializedName("bakeries")
        BAKERIES("bakeries"),

        @SerializedName("bands_orchestras")
        BANDS_ORCHESTRAS("bands_orchestras"),

        @SerializedName("barber_and_beauty_shops")
        BARBER_AND_BEAUTY_SHOPS("barber_and_beauty_shops"),

        @SerializedName("betting_casino_gambling")
        BETTING_CASINO_GAMBLING("betting_casino_gambling"),

        @SerializedName("bicycle_shops")
        BICYCLE_SHOPS("bicycle_shops"),

        @SerializedName("billiard_pool_establishments")
        BILLIARD_POOL_ESTABLISHMENTS("billiard_pool_establishments"),

        @SerializedName("boat_dealers")
        BOAT_DEALERS("boat_dealers"),

        @SerializedName("boat_rentals_and_leases")
        BOAT_RENTALS_AND_LEASES("boat_rentals_and_leases"),

        @SerializedName("book_stores")
        BOOK_STORES("book_stores"),

        @SerializedName("books_periodicals_and_newspapers")
        BOOKS_PERIODICALS_AND_NEWSPAPERS("books_periodicals_and_newspapers"),

        @SerializedName("bowling_alleys")
        BOWLING_ALLEYS("bowling_alleys"),

        @SerializedName("bus_lines")
        BUS_LINES("bus_lines"),

        @SerializedName("business_secretarial_schools")
        BUSINESS_SECRETARIAL_SCHOOLS("business_secretarial_schools"),

        @SerializedName("buying_shopping_services")
        BUYING_SHOPPING_SERVICES("buying_shopping_services"),

        @SerializedName("cable_satellite_and_other_pay_television_and_radio")
        CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO(
            "cable_satellite_and_other_pay_television_and_radio"),

        @SerializedName("camera_and_photographic_supply_stores")
        CAMERA_AND_PHOTOGRAPHIC_SUPPLY_STORES("camera_and_photographic_supply_stores"),

        @SerializedName("candy_nut_and_confectionery_stores")
        CANDY_NUT_AND_CONFECTIONERY_STORES("candy_nut_and_confectionery_stores"),

        @SerializedName("car_and_truck_dealers_new_used")
        CAR_AND_TRUCK_DEALERS_NEW_USED("car_and_truck_dealers_new_used"),

        @SerializedName("car_and_truck_dealers_used_only")
        CAR_AND_TRUCK_DEALERS_USED_ONLY("car_and_truck_dealers_used_only"),

        @SerializedName("car_rental_agencies")
        CAR_RENTAL_AGENCIES("car_rental_agencies"),

        @SerializedName("car_washes")
        CAR_WASHES("car_washes"),

        @SerializedName("carpentry_services")
        CARPENTRY_SERVICES("carpentry_services"),

        @SerializedName("carpet_upholstery_cleaning")
        CARPET_UPHOLSTERY_CLEANING("carpet_upholstery_cleaning"),

        @SerializedName("caterers")
        CATERERS("caterers"),

        @SerializedName("charitable_and_social_service_organizations_fundraising")
        CHARITABLE_AND_SOCIAL_SERVICE_ORGANIZATIONS_FUNDRAISING(
            "charitable_and_social_service_organizations_fundraising"),

        @SerializedName("chemicals_and_allied_products")
        CHEMICALS_AND_ALLIED_PRODUCTS("chemicals_and_allied_products"),

        @SerializedName("child_care_services")
        CHILD_CARE_SERVICES("child_care_services"),

        @SerializedName("childrens_and_infants_wear_stores")
        CHILDRENS_AND_INFANTS_WEAR_STORES("childrens_and_infants_wear_stores"),

        @SerializedName("chiropodists_podiatrists")
        CHIROPODISTS_PODIATRISTS("chiropodists_podiatrists"),

        @SerializedName("chiropractors")
        CHIROPRACTORS("chiropractors"),

        @SerializedName("cigar_stores_and_stands")
        CIGAR_STORES_AND_STANDS("cigar_stores_and_stands"),

        @SerializedName("civic_social_fraternal_associations")
        CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS("civic_social_fraternal_associations"),

        @SerializedName("cleaning_and_maintenance")
        CLEANING_AND_MAINTENANCE("cleaning_and_maintenance"),

        @SerializedName("clothing_rental")
        CLOTHING_RENTAL("clothing_rental"),

        @SerializedName("colleges_universities")
        COLLEGES_UNIVERSITIES("colleges_universities"),

        @SerializedName("commercial_equipment")
        COMMERCIAL_EQUIPMENT("commercial_equipment"),

        @SerializedName("commercial_footwear")
        COMMERCIAL_FOOTWEAR("commercial_footwear"),

        @SerializedName("commercial_photography_art_and_graphics")
        COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS("commercial_photography_art_and_graphics"),

        @SerializedName("commuter_transport_and_ferries")
        COMMUTER_TRANSPORT_AND_FERRIES("commuter_transport_and_ferries"),

        @SerializedName("computer_network_services")
        COMPUTER_NETWORK_SERVICES("computer_network_services"),

        @SerializedName("computer_programming")
        COMPUTER_PROGRAMMING("computer_programming"),

        @SerializedName("computer_repair")
        COMPUTER_REPAIR("computer_repair"),

        @SerializedName("computer_software_stores")
        COMPUTER_SOFTWARE_STORES("computer_software_stores"),

        @SerializedName("computers_peripherals_and_software")
        COMPUTERS_PERIPHERALS_AND_SOFTWARE("computers_peripherals_and_software"),

        @SerializedName("concrete_work_services")
        CONCRETE_WORK_SERVICES("concrete_work_services"),

        @SerializedName("construction_materials")
        CONSTRUCTION_MATERIALS("construction_materials"),

        @SerializedName("consulting_public_relations")
        CONSULTING_PUBLIC_RELATIONS("consulting_public_relations"),

        @SerializedName("correspondence_schools")
        CORRESPONDENCE_SCHOOLS("correspondence_schools"),

        @SerializedName("cosmetic_stores")
        COSMETIC_STORES("cosmetic_stores"),

        @SerializedName("counseling_services")
        COUNSELING_SERVICES("counseling_services"),

        @SerializedName("country_clubs")
        COUNTRY_CLUBS("country_clubs"),

        @SerializedName("courier_services")
        COURIER_SERVICES("courier_services"),

        @SerializedName("court_costs")
        COURT_COSTS("court_costs"),

        @SerializedName("credit_reporting_agencies")
        CREDIT_REPORTING_AGENCIES("credit_reporting_agencies"),

        @SerializedName("cruise_lines")
        CRUISE_LINES("cruise_lines"),

        @SerializedName("dairy_products_stores")
        DAIRY_PRODUCTS_STORES("dairy_products_stores"),

        @SerializedName("dance_hall_studios_schools")
        DANCE_HALL_STUDIOS_SCHOOLS("dance_hall_studios_schools"),

        @SerializedName("dating_escort_services")
        DATING_ESCORT_SERVICES("dating_escort_services"),

        @SerializedName("dentists_orthodontists")
        DENTISTS_ORTHODONTISTS("dentists_orthodontists"),

        @SerializedName("department_stores")
        DEPARTMENT_STORES("department_stores"),

        @SerializedName("detective_agencies")
        DETECTIVE_AGENCIES("detective_agencies"),

        @SerializedName("digital_goods_applications")
        DIGITAL_GOODS_APPLICATIONS("digital_goods_applications"),

        @SerializedName("digital_goods_games")
        DIGITAL_GOODS_GAMES("digital_goods_games"),

        @SerializedName("digital_goods_large_volume")
        DIGITAL_GOODS_LARGE_VOLUME("digital_goods_large_volume"),

        @SerializedName("digital_goods_media")
        DIGITAL_GOODS_MEDIA("digital_goods_media"),

        @SerializedName("direct_marketing_catalog_merchant")
        DIRECT_MARKETING_CATALOG_MERCHANT("direct_marketing_catalog_merchant"),

        @SerializedName("direct_marketing_combination_catalog_and_retail_merchant")
        DIRECT_MARKETING_COMBINATION_CATALOG_AND_RETAIL_MERCHANT(
            "direct_marketing_combination_catalog_and_retail_merchant"),

        @SerializedName("direct_marketing_inbound_telemarketing")
        DIRECT_MARKETING_INBOUND_TELEMARKETING("direct_marketing_inbound_telemarketing"),

        @SerializedName("direct_marketing_insurance_services")
        DIRECT_MARKETING_INSURANCE_SERVICES("direct_marketing_insurance_services"),

        @SerializedName("direct_marketing_other")
        DIRECT_MARKETING_OTHER("direct_marketing_other"),

        @SerializedName("direct_marketing_outbound_telemarketing")
        DIRECT_MARKETING_OUTBOUND_TELEMARKETING("direct_marketing_outbound_telemarketing"),

        @SerializedName("direct_marketing_subscription")
        DIRECT_MARKETING_SUBSCRIPTION("direct_marketing_subscription"),

        @SerializedName("direct_marketing_travel")
        DIRECT_MARKETING_TRAVEL("direct_marketing_travel"),

        @SerializedName("discount_stores")
        DISCOUNT_STORES("discount_stores"),

        @SerializedName("doctors")
        DOCTORS("doctors"),

        @SerializedName("door_to_door_sales")
        DOOR_TO_DOOR_SALES("door_to_door_sales"),

        @SerializedName("drapery_window_covering_and_upholstery_stores")
        DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY_STORES(
            "drapery_window_covering_and_upholstery_stores"),

        @SerializedName("drinking_places")
        DRINKING_PLACES("drinking_places"),

        @SerializedName("drug_stores_and_pharmacies")
        DRUG_STORES_AND_PHARMACIES("drug_stores_and_pharmacies"),

        @SerializedName("drugs_drug_proprietaries_and_druggist_sundries")
        DRUGS_DRUG_PROPRIETARIES_AND_DRUGGIST_SUNDRIES(
            "drugs_drug_proprietaries_and_druggist_sundries"),

        @SerializedName("dry_cleaners")
        DRY_CLEANERS("dry_cleaners"),

        @SerializedName("durable_goods")
        DURABLE_GOODS("durable_goods"),

        @SerializedName("duty_free_stores")
        DUTY_FREE_STORES("duty_free_stores"),

        @SerializedName("eating_places_restaurants")
        EATING_PLACES_RESTAURANTS("eating_places_restaurants"),

        @SerializedName("educational_services")
        EDUCATIONAL_SERVICES("educational_services"),

        @SerializedName("electric_razor_stores")
        ELECTRIC_RAZOR_STORES("electric_razor_stores"),

        @SerializedName("electric_vehicle_charging")
        ELECTRIC_VEHICLE_CHARGING("electric_vehicle_charging"),

        @SerializedName("electrical_parts_and_equipment")
        ELECTRICAL_PARTS_AND_EQUIPMENT("electrical_parts_and_equipment"),

        @SerializedName("electrical_services")
        ELECTRICAL_SERVICES("electrical_services"),

        @SerializedName("electronics_repair_shops")
        ELECTRONICS_REPAIR_SHOPS("electronics_repair_shops"),

        @SerializedName("electronics_stores")
        ELECTRONICS_STORES("electronics_stores"),

        @SerializedName("elementary_secondary_schools")
        ELEMENTARY_SECONDARY_SCHOOLS("elementary_secondary_schools"),

        @SerializedName("emergency_services_gcas_visa_use_only")
        EMERGENCY_SERVICES_GCAS_VISA_USE_ONLY("emergency_services_gcas_visa_use_only"),

        @SerializedName("employment_temp_agencies")
        EMPLOYMENT_TEMP_AGENCIES("employment_temp_agencies"),

        @SerializedName("equipment_rental")
        EQUIPMENT_RENTAL("equipment_rental"),

        @SerializedName("exterminating_services")
        EXTERMINATING_SERVICES("exterminating_services"),

        @SerializedName("family_clothing_stores")
        FAMILY_CLOTHING_STORES("family_clothing_stores"),

        @SerializedName("fast_food_restaurants")
        FAST_FOOD_RESTAURANTS("fast_food_restaurants"),

        @SerializedName("financial_institutions")
        FINANCIAL_INSTITUTIONS("financial_institutions"),

        @SerializedName("fines_government_administrative_entities")
        FINES_GOVERNMENT_ADMINISTRATIVE_ENTITIES("fines_government_administrative_entities"),

        @SerializedName("fireplace_fireplace_screens_and_accessories_stores")
        FIREPLACE_FIREPLACE_SCREENS_AND_ACCESSORIES_STORES(
            "fireplace_fireplace_screens_and_accessories_stores"),

        @SerializedName("floor_covering_stores")
        FLOOR_COVERING_STORES("floor_covering_stores"),

        @SerializedName("florists")
        FLORISTS("florists"),

        @SerializedName("florists_supplies_nursery_stock_and_flowers")
        FLORISTS_SUPPLIES_NURSERY_STOCK_AND_FLOWERS("florists_supplies_nursery_stock_and_flowers"),

        @SerializedName("freezer_and_locker_meat_provisioners")
        FREEZER_AND_LOCKER_MEAT_PROVISIONERS("freezer_and_locker_meat_provisioners"),

        @SerializedName("fuel_dealers_non_automotive")
        FUEL_DEALERS_NON_AUTOMOTIVE("fuel_dealers_non_automotive"),

        @SerializedName("funeral_services_crematories")
        FUNERAL_SERVICES_CREMATORIES("funeral_services_crematories"),

        @SerializedName("furniture_home_furnishings_and_equipment_stores_except_appliances")
        FURNITURE_HOME_FURNISHINGS_AND_EQUIPMENT_STORES_EXCEPT_APPLIANCES(
            "furniture_home_furnishings_and_equipment_stores_except_appliances"),

        @SerializedName("furniture_repair_refinishing")
        FURNITURE_REPAIR_REFINISHING("furniture_repair_refinishing"),

        @SerializedName("furriers_and_fur_shops")
        FURRIERS_AND_FUR_SHOPS("furriers_and_fur_shops"),

        @SerializedName("general_services")
        GENERAL_SERVICES("general_services"),

        @SerializedName("gift_card_novelty_and_souvenir_shops")
        GIFT_CARD_NOVELTY_AND_SOUVENIR_SHOPS("gift_card_novelty_and_souvenir_shops"),

        @SerializedName("glass_paint_and_wallpaper_stores")
        GLASS_PAINT_AND_WALLPAPER_STORES("glass_paint_and_wallpaper_stores"),

        @SerializedName("glassware_crystal_stores")
        GLASSWARE_CRYSTAL_STORES("glassware_crystal_stores"),

        @SerializedName("golf_courses_public")
        GOLF_COURSES_PUBLIC("golf_courses_public"),

        @SerializedName("government_licensed_horse_dog_racing_us_region_only")
        GOVERNMENT_LICENSED_HORSE_DOG_RACING_US_REGION_ONLY(
            "government_licensed_horse_dog_racing_us_region_only"),

        @SerializedName("government_licensed_online_casions_online_gambling_us_region_only")
        GOVERNMENT_LICENSED_ONLINE_CASIONS_ONLINE_GAMBLING_US_REGION_ONLY(
            "government_licensed_online_casions_online_gambling_us_region_only"),

        @SerializedName("government_owned_lotteries_non_us_region")
        GOVERNMENT_OWNED_LOTTERIES_NON_US_REGION("government_owned_lotteries_non_us_region"),

        @SerializedName("government_owned_lotteries_us_region_only")
        GOVERNMENT_OWNED_LOTTERIES_US_REGION_ONLY("government_owned_lotteries_us_region_only"),

        @SerializedName("government_services")
        GOVERNMENT_SERVICES("government_services"),

        @SerializedName("grocery_stores_supermarkets")
        GROCERY_STORES_SUPERMARKETS("grocery_stores_supermarkets"),

        @SerializedName("hardware_equipment_and_supplies")
        HARDWARE_EQUIPMENT_AND_SUPPLIES("hardware_equipment_and_supplies"),

        @SerializedName("hardware_stores")
        HARDWARE_STORES("hardware_stores"),

        @SerializedName("health_and_beauty_spas")
        HEALTH_AND_BEAUTY_SPAS("health_and_beauty_spas"),

        @SerializedName("hearing_aids_sales_and_supplies")
        HEARING_AIDS_SALES_AND_SUPPLIES("hearing_aids_sales_and_supplies"),

        @SerializedName("heating_plumbing_a_c")
        HEATING_PLUMBING_A_C("heating_plumbing_a_c"),

        @SerializedName("hobby_toy_and_game_shops")
        HOBBY_TOY_AND_GAME_SHOPS("hobby_toy_and_game_shops"),

        @SerializedName("home_supply_warehouse_stores")
        HOME_SUPPLY_WAREHOUSE_STORES("home_supply_warehouse_stores"),

        @SerializedName("hospitals")
        HOSPITALS("hospitals"),

        @SerializedName("hotels_motels_and_resorts")
        HOTELS_MOTELS_AND_RESORTS("hotels_motels_and_resorts"),

        @SerializedName("household_appliance_stores")
        HOUSEHOLD_APPLIANCE_STORES("household_appliance_stores"),

        @SerializedName("industrial_supplies")
        INDUSTRIAL_SUPPLIES("industrial_supplies"),

        @SerializedName("information_retrieval_services")
        INFORMATION_RETRIEVAL_SERVICES("information_retrieval_services"),

        @SerializedName("insurance_default")
        INSURANCE_DEFAULT("insurance_default"),

        @SerializedName("insurance_underwriting_premiums")
        INSURANCE_UNDERWRITING_PREMIUMS("insurance_underwriting_premiums"),

        @SerializedName("intra_company_purchases")
        INTRA_COMPANY_PURCHASES("intra_company_purchases"),

        @SerializedName("jewelry_stores_watches_clocks_and_silverware_stores")
        JEWELRY_STORES_WATCHES_CLOCKS_AND_SILVERWARE_STORES(
            "jewelry_stores_watches_clocks_and_silverware_stores"),

        @SerializedName("landscaping_services")
        LANDSCAPING_SERVICES("landscaping_services"),

        @SerializedName("laundries")
        LAUNDRIES("laundries"),

        @SerializedName("laundry_cleaning_services")
        LAUNDRY_CLEANING_SERVICES("laundry_cleaning_services"),

        @SerializedName("legal_services_attorneys")
        LEGAL_SERVICES_ATTORNEYS("legal_services_attorneys"),

        @SerializedName("luggage_and_leather_goods_stores")
        LUGGAGE_AND_LEATHER_GOODS_STORES("luggage_and_leather_goods_stores"),

        @SerializedName("lumber_building_materials_stores")
        LUMBER_BUILDING_MATERIALS_STORES("lumber_building_materials_stores"),

        @SerializedName("manual_cash_disburse")
        MANUAL_CASH_DISBURSE("manual_cash_disburse"),

        @SerializedName("marinas_service_and_supplies")
        MARINAS_SERVICE_AND_SUPPLIES("marinas_service_and_supplies"),

        @SerializedName("marketplaces")
        MARKETPLACES("marketplaces"),

        @SerializedName("masonry_stonework_and_plaster")
        MASONRY_STONEWORK_AND_PLASTER("masonry_stonework_and_plaster"),

        @SerializedName("massage_parlors")
        MASSAGE_PARLORS("massage_parlors"),

        @SerializedName("medical_and_dental_labs")
        MEDICAL_AND_DENTAL_LABS("medical_and_dental_labs"),

        @SerializedName("medical_dental_ophthalmic_and_hospital_equipment_and_supplies")
        MEDICAL_DENTAL_OPHTHALMIC_AND_HOSPITAL_EQUIPMENT_AND_SUPPLIES(
            "medical_dental_ophthalmic_and_hospital_equipment_and_supplies"),

        @SerializedName("medical_services")
        MEDICAL_SERVICES("medical_services"),

        @SerializedName("membership_organizations")
        MEMBERSHIP_ORGANIZATIONS("membership_organizations"),

        @SerializedName("mens_and_boys_clothing_and_accessories_stores")
        MENS_AND_BOYS_CLOTHING_AND_ACCESSORIES_STORES(
            "mens_and_boys_clothing_and_accessories_stores"),

        @SerializedName("mens_womens_clothing_stores")
        MENS_WOMENS_CLOTHING_STORES("mens_womens_clothing_stores"),

        @SerializedName("metal_service_centers")
        METAL_SERVICE_CENTERS("metal_service_centers"),

        @SerializedName("miscellaneous")
        MISCELLANEOUS("miscellaneous"),

        @SerializedName("miscellaneous_apparel_and_accessory_shops")
        MISCELLANEOUS_APPAREL_AND_ACCESSORY_SHOPS("miscellaneous_apparel_and_accessory_shops"),

        @SerializedName("miscellaneous_auto_dealers")
        MISCELLANEOUS_AUTO_DEALERS("miscellaneous_auto_dealers"),

        @SerializedName("miscellaneous_business_services")
        MISCELLANEOUS_BUSINESS_SERVICES("miscellaneous_business_services"),

        @SerializedName("miscellaneous_food_stores")
        MISCELLANEOUS_FOOD_STORES("miscellaneous_food_stores"),

        @SerializedName("miscellaneous_general_merchandise")
        MISCELLANEOUS_GENERAL_MERCHANDISE("miscellaneous_general_merchandise"),

        @SerializedName("miscellaneous_general_services")
        MISCELLANEOUS_GENERAL_SERVICES("miscellaneous_general_services"),

        @SerializedName("miscellaneous_home_furnishing_specialty_stores")
        MISCELLANEOUS_HOME_FURNISHING_SPECIALTY_STORES(
            "miscellaneous_home_furnishing_specialty_stores"),

        @SerializedName("miscellaneous_publishing_and_printing")
        MISCELLANEOUS_PUBLISHING_AND_PRINTING("miscellaneous_publishing_and_printing"),

        @SerializedName("miscellaneous_recreation_services")
        MISCELLANEOUS_RECREATION_SERVICES("miscellaneous_recreation_services"),

        @SerializedName("miscellaneous_repair_shops")
        MISCELLANEOUS_REPAIR_SHOPS("miscellaneous_repair_shops"),

        @SerializedName("miscellaneous_specialty_retail")
        MISCELLANEOUS_SPECIALTY_RETAIL("miscellaneous_specialty_retail"),

        @SerializedName("mobile_home_dealers")
        MOBILE_HOME_DEALERS("mobile_home_dealers"),

        @SerializedName("motion_picture_theaters")
        MOTION_PICTURE_THEATERS("motion_picture_theaters"),

        @SerializedName("motor_freight_carriers_and_trucking")
        MOTOR_FREIGHT_CARRIERS_AND_TRUCKING("motor_freight_carriers_and_trucking"),

        @SerializedName("motor_homes_dealers")
        MOTOR_HOMES_DEALERS("motor_homes_dealers"),

        @SerializedName("motor_vehicle_supplies_and_new_parts")
        MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS("motor_vehicle_supplies_and_new_parts"),

        @SerializedName("motorcycle_shops_and_dealers")
        MOTORCYCLE_SHOPS_AND_DEALERS("motorcycle_shops_and_dealers"),

        @SerializedName("motorcycle_shops_dealers")
        MOTORCYCLE_SHOPS_DEALERS("motorcycle_shops_dealers"),

        @SerializedName("music_stores_musical_instruments_pianos_and_sheet_music")
        MUSIC_STORES_MUSICAL_INSTRUMENTS_PIANOS_AND_SHEET_MUSIC(
            "music_stores_musical_instruments_pianos_and_sheet_music"),

        @SerializedName("news_dealers_and_newsstands")
        NEWS_DEALERS_AND_NEWSSTANDS("news_dealers_and_newsstands"),

        @SerializedName("non_fi_money_orders")
        NON_FI_MONEY_ORDERS("non_fi_money_orders"),

        @SerializedName("non_fi_stored_value_card_purchase_load")
        NON_FI_STORED_VALUE_CARD_PURCHASE_LOAD("non_fi_stored_value_card_purchase_load"),

        @SerializedName("nondurable_goods")
        NONDURABLE_GOODS("nondurable_goods"),

        @SerializedName("nurseries_lawn_and_garden_supply_stores")
        NURSERIES_LAWN_AND_GARDEN_SUPPLY_STORES("nurseries_lawn_and_garden_supply_stores"),

        @SerializedName("nursing_personal_care")
        NURSING_PERSONAL_CARE("nursing_personal_care"),

        @SerializedName("office_and_commercial_furniture")
        OFFICE_AND_COMMERCIAL_FURNITURE("office_and_commercial_furniture"),

        @SerializedName("opticians_eyeglasses")
        OPTICIANS_EYEGLASSES("opticians_eyeglasses"),

        @SerializedName("optometrists_ophthalmologist")
        OPTOMETRISTS_OPHTHALMOLOGIST("optometrists_ophthalmologist"),

        @SerializedName("orthopedic_goods_prosthetic_devices")
        ORTHOPEDIC_GOODS_PROSTHETIC_DEVICES("orthopedic_goods_prosthetic_devices"),

        @SerializedName("osteopaths")
        OSTEOPATHS("osteopaths"),

        @SerializedName("package_stores_beer_wine_and_liquor")
        PACKAGE_STORES_BEER_WINE_AND_LIQUOR("package_stores_beer_wine_and_liquor"),

        @SerializedName("paints_varnishes_and_supplies")
        PAINTS_VARNISHES_AND_SUPPLIES("paints_varnishes_and_supplies"),

        @SerializedName("parking_lots_garages")
        PARKING_LOTS_GARAGES("parking_lots_garages"),

        @SerializedName("passenger_railways")
        PASSENGER_RAILWAYS("passenger_railways"),

        @SerializedName("pawn_shops")
        PAWN_SHOPS("pawn_shops"),

        @SerializedName("pet_shops_pet_food_and_supplies")
        PET_SHOPS_PET_FOOD_AND_SUPPLIES("pet_shops_pet_food_and_supplies"),

        @SerializedName("petroleum_and_petroleum_products")
        PETROLEUM_AND_PETROLEUM_PRODUCTS("petroleum_and_petroleum_products"),

        @SerializedName("photo_developing")
        PHOTO_DEVELOPING("photo_developing"),

        @SerializedName("photographic_photocopy_microfilm_equipment_and_supplies")
        PHOTOGRAPHIC_PHOTOCOPY_MICROFILM_EQUIPMENT_AND_SUPPLIES(
            "photographic_photocopy_microfilm_equipment_and_supplies"),

        @SerializedName("photographic_studios")
        PHOTOGRAPHIC_STUDIOS("photographic_studios"),

        @SerializedName("picture_video_production")
        PICTURE_VIDEO_PRODUCTION("picture_video_production"),

        @SerializedName("piece_goods_notions_and_other_dry_goods")
        PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS("piece_goods_notions_and_other_dry_goods"),

        @SerializedName("plumbing_heating_equipment_and_supplies")
        PLUMBING_HEATING_EQUIPMENT_AND_SUPPLIES("plumbing_heating_equipment_and_supplies"),

        @SerializedName("political_organizations")
        POLITICAL_ORGANIZATIONS("political_organizations"),

        @SerializedName("postal_services_government_only")
        POSTAL_SERVICES_GOVERNMENT_ONLY("postal_services_government_only"),

        @SerializedName("precious_stones_and_metals_watches_and_jewelry")
        PRECIOUS_STONES_AND_METALS_WATCHES_AND_JEWELRY(
            "precious_stones_and_metals_watches_and_jewelry"),

        @SerializedName("professional_services")
        PROFESSIONAL_SERVICES("professional_services"),

        @SerializedName("public_warehousing_and_storage")
        PUBLIC_WAREHOUSING_AND_STORAGE("public_warehousing_and_storage"),

        @SerializedName("quick_copy_repro_and_blueprint")
        QUICK_COPY_REPRO_AND_BLUEPRINT("quick_copy_repro_and_blueprint"),

        @SerializedName("railroads")
        RAILROADS("railroads"),

        @SerializedName("real_estate_agents_and_managers_rentals")
        REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS("real_estate_agents_and_managers_rentals"),

        @SerializedName("record_stores")
        RECORD_STORES("record_stores"),

        @SerializedName("recreational_vehicle_rentals")
        RECREATIONAL_VEHICLE_RENTALS("recreational_vehicle_rentals"),

        @SerializedName("religious_goods_stores")
        RELIGIOUS_GOODS_STORES("religious_goods_stores"),

        @SerializedName("religious_organizations")
        RELIGIOUS_ORGANIZATIONS("religious_organizations"),

        @SerializedName("roofing_siding_sheet_metal")
        ROOFING_SIDING_SHEET_METAL("roofing_siding_sheet_metal"),

        @SerializedName("secretarial_support_services")
        SECRETARIAL_SUPPORT_SERVICES("secretarial_support_services"),

        @SerializedName("security_brokers_dealers")
        SECURITY_BROKERS_DEALERS("security_brokers_dealers"),

        @SerializedName("service_stations")
        SERVICE_STATIONS("service_stations"),

        @SerializedName("sewing_needlework_fabric_and_piece_goods_stores")
        SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES(
            "sewing_needlework_fabric_and_piece_goods_stores"),

        @SerializedName("shoe_repair_hat_cleaning")
        SHOE_REPAIR_HAT_CLEANING("shoe_repair_hat_cleaning"),

        @SerializedName("shoe_stores")
        SHOE_STORES("shoe_stores"),

        @SerializedName("small_appliance_repair")
        SMALL_APPLIANCE_REPAIR("small_appliance_repair"),

        @SerializedName("snowmobile_dealers")
        SNOWMOBILE_DEALERS("snowmobile_dealers"),

        @SerializedName("special_trade_services")
        SPECIAL_TRADE_SERVICES("special_trade_services"),

        @SerializedName("specialty_cleaning")
        SPECIALTY_CLEANING("specialty_cleaning"),

        @SerializedName("sporting_goods_stores")
        SPORTING_GOODS_STORES("sporting_goods_stores"),

        @SerializedName("sporting_recreation_camps")
        SPORTING_RECREATION_CAMPS("sporting_recreation_camps"),

        @SerializedName("sports_and_riding_apparel_stores")
        SPORTS_AND_RIDING_APPAREL_STORES("sports_and_riding_apparel_stores"),

        @SerializedName("sports_clubs_fields")
        SPORTS_CLUBS_FIELDS("sports_clubs_fields"),

        @SerializedName("stamp_and_coin_stores")
        STAMP_AND_COIN_STORES("stamp_and_coin_stores"),

        @SerializedName("stationary_office_supplies_printing_and_writing_paper")
        STATIONARY_OFFICE_SUPPLIES_PRINTING_AND_WRITING_PAPER(
            "stationary_office_supplies_printing_and_writing_paper"),

        @SerializedName("stationery_stores_office_and_school_supply_stores")
        STATIONERY_STORES_OFFICE_AND_SCHOOL_SUPPLY_STORES(
            "stationery_stores_office_and_school_supply_stores"),

        @SerializedName("swimming_pools_sales")
        SWIMMING_POOLS_SALES("swimming_pools_sales"),

        @SerializedName("t_ui_travel_germany")
        T_UI_TRAVEL_GERMANY("t_ui_travel_germany"),

        @SerializedName("tailors_alterations")
        TAILORS_ALTERATIONS("tailors_alterations"),

        @SerializedName("tax_payments_government_agencies")
        TAX_PAYMENTS_GOVERNMENT_AGENCIES("tax_payments_government_agencies"),

        @SerializedName("tax_preparation_services")
        TAX_PREPARATION_SERVICES("tax_preparation_services"),

        @SerializedName("taxicabs_limousines")
        TAXICABS_LIMOUSINES("taxicabs_limousines"),

        @SerializedName("telecommunication_equipment_and_telephone_sales")
        TELECOMMUNICATION_EQUIPMENT_AND_TELEPHONE_SALES(
            "telecommunication_equipment_and_telephone_sales"),

        @SerializedName("telecommunication_services")
        TELECOMMUNICATION_SERVICES("telecommunication_services"),

        @SerializedName("telegraph_services")
        TELEGRAPH_SERVICES("telegraph_services"),

        @SerializedName("tent_and_awning_shops")
        TENT_AND_AWNING_SHOPS("tent_and_awning_shops"),

        @SerializedName("testing_laboratories")
        TESTING_LABORATORIES("testing_laboratories"),

        @SerializedName("theatrical_ticket_agencies")
        THEATRICAL_TICKET_AGENCIES("theatrical_ticket_agencies"),

        @SerializedName("timeshares")
        TIMESHARES("timeshares"),

        @SerializedName("tire_retreading_and_repair")
        TIRE_RETREADING_AND_REPAIR("tire_retreading_and_repair"),

        @SerializedName("tolls_bridge_fees")
        TOLLS_BRIDGE_FEES("tolls_bridge_fees"),

        @SerializedName("tourist_attractions_and_exhibits")
        TOURIST_ATTRACTIONS_AND_EXHIBITS("tourist_attractions_and_exhibits"),

        @SerializedName("towing_services")
        TOWING_SERVICES("towing_services"),

        @SerializedName("trailer_parks_campgrounds")
        TRAILER_PARKS_CAMPGROUNDS("trailer_parks_campgrounds"),

        @SerializedName("transportation_services")
        TRANSPORTATION_SERVICES("transportation_services"),

        @SerializedName("travel_agencies_tour_operators")
        TRAVEL_AGENCIES_TOUR_OPERATORS("travel_agencies_tour_operators"),

        @SerializedName("truck_stop_iteration")
        TRUCK_STOP_ITERATION("truck_stop_iteration"),

        @SerializedName("truck_utility_trailer_rentals")
        TRUCK_UTILITY_TRAILER_RENTALS("truck_utility_trailer_rentals"),

        @SerializedName("typesetting_plate_making_and_related_services")
        TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES(
            "typesetting_plate_making_and_related_services"),

        @SerializedName("typewriter_stores")
        TYPEWRITER_STORES("typewriter_stores"),

        @SerializedName("u_s_federal_government_agencies_or_departments")
        U_S_FEDERAL_GOVERNMENT_AGENCIES_OR_DEPARTMENTS(
            "u_s_federal_government_agencies_or_departments"),

        @SerializedName("uniforms_commercial_clothing")
        UNIFORMS_COMMERCIAL_CLOTHING("uniforms_commercial_clothing"),

        @SerializedName("used_merchandise_and_secondhand_stores")
        USED_MERCHANDISE_AND_SECONDHAND_STORES("used_merchandise_and_secondhand_stores"),

        @SerializedName("utilities")
        UTILITIES("utilities"),

        @SerializedName("variety_stores")
        VARIETY_STORES("variety_stores"),

        @SerializedName("veterinary_services")
        VETERINARY_SERVICES("veterinary_services"),

        @SerializedName("video_amusement_game_supplies")
        VIDEO_AMUSEMENT_GAME_SUPPLIES("video_amusement_game_supplies"),

        @SerializedName("video_game_arcades")
        VIDEO_GAME_ARCADES("video_game_arcades"),

        @SerializedName("video_tape_rental_stores")
        VIDEO_TAPE_RENTAL_STORES("video_tape_rental_stores"),

        @SerializedName("vocational_trade_schools")
        VOCATIONAL_TRADE_SCHOOLS("vocational_trade_schools"),

        @SerializedName("watch_jewelry_repair")
        WATCH_JEWELRY_REPAIR("watch_jewelry_repair"),

        @SerializedName("welding_repair")
        WELDING_REPAIR("welding_repair"),

        @SerializedName("wholesale_clubs")
        WHOLESALE_CLUBS("wholesale_clubs"),

        @SerializedName("wig_and_toupee_stores")
        WIG_AND_TOUPEE_STORES("wig_and_toupee_stores"),

        @SerializedName("wires_money_orders")
        WIRES_MONEY_ORDERS("wires_money_orders"),

        @SerializedName("womens_accessory_and_specialty_shops")
        WOMENS_ACCESSORY_AND_SPECIALTY_SHOPS("womens_accessory_and_specialty_shops"),

        @SerializedName("womens_ready_to_wear_stores")
        WOMENS_READY_TO_WEAR_STORES("womens_ready_to_wear_stores"),

        @SerializedName("wrecking_and_salvage_yards")
        WRECKING_AND_SALVAGE_YARDS("wrecking_and_salvage_yards");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Category(String value) {
          this.value = value;
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("all_time")
        ALL_TIME("all_time"),

        @SerializedName("daily")
        DAILY("daily"),

        @SerializedName("monthly")
        MONTHLY("monthly"),

        @SerializedName("per_authorization")
        PER_AUTHORIZATION("per_authorization"),

        @SerializedName("weekly")
        WEEKLY("weekly"),

        @SerializedName("yearly")
        YEARLY("yearly");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }
    }

    public enum AllowedCategory implements ApiRequestParams.EnumParam {
      @SerializedName("ac_refrigeration_repair")
      AC_REFRIGERATION_REPAIR("ac_refrigeration_repair"),

      @SerializedName("accounting_bookkeeping_services")
      ACCOUNTING_BOOKKEEPING_SERVICES("accounting_bookkeeping_services"),

      @SerializedName("advertising_services")
      ADVERTISING_SERVICES("advertising_services"),

      @SerializedName("agricultural_cooperative")
      AGRICULTURAL_COOPERATIVE("agricultural_cooperative"),

      @SerializedName("airlines_air_carriers")
      AIRLINES_AIR_CARRIERS("airlines_air_carriers"),

      @SerializedName("airports_flying_fields")
      AIRPORTS_FLYING_FIELDS("airports_flying_fields"),

      @SerializedName("ambulance_services")
      AMBULANCE_SERVICES("ambulance_services"),

      @SerializedName("amusement_parks_carnivals")
      AMUSEMENT_PARKS_CARNIVALS("amusement_parks_carnivals"),

      @SerializedName("antique_reproductions")
      ANTIQUE_REPRODUCTIONS("antique_reproductions"),

      @SerializedName("antique_shops")
      ANTIQUE_SHOPS("antique_shops"),

      @SerializedName("aquariums")
      AQUARIUMS("aquariums"),

      @SerializedName("architectural_surveying_services")
      ARCHITECTURAL_SURVEYING_SERVICES("architectural_surveying_services"),

      @SerializedName("art_dealers_and_galleries")
      ART_DEALERS_AND_GALLERIES("art_dealers_and_galleries"),

      @SerializedName("artists_supply_and_craft_shops")
      ARTISTS_SUPPLY_AND_CRAFT_SHOPS("artists_supply_and_craft_shops"),

      @SerializedName("auto_and_home_supply_stores")
      AUTO_AND_HOME_SUPPLY_STORES("auto_and_home_supply_stores"),

      @SerializedName("auto_body_repair_shops")
      AUTO_BODY_REPAIR_SHOPS("auto_body_repair_shops"),

      @SerializedName("auto_paint_shops")
      AUTO_PAINT_SHOPS("auto_paint_shops"),

      @SerializedName("auto_service_shops")
      AUTO_SERVICE_SHOPS("auto_service_shops"),

      @SerializedName("automated_cash_disburse")
      AUTOMATED_CASH_DISBURSE("automated_cash_disburse"),

      @SerializedName("automated_fuel_dispensers")
      AUTOMATED_FUEL_DISPENSERS("automated_fuel_dispensers"),

      @SerializedName("automobile_associations")
      AUTOMOBILE_ASSOCIATIONS("automobile_associations"),

      @SerializedName("automotive_parts_and_accessories_stores")
      AUTOMOTIVE_PARTS_AND_ACCESSORIES_STORES("automotive_parts_and_accessories_stores"),

      @SerializedName("automotive_tire_stores")
      AUTOMOTIVE_TIRE_STORES("automotive_tire_stores"),

      @SerializedName("bail_and_bond_payments")
      BAIL_AND_BOND_PAYMENTS("bail_and_bond_payments"),

      @SerializedName("bakeries")
      BAKERIES("bakeries"),

      @SerializedName("bands_orchestras")
      BANDS_ORCHESTRAS("bands_orchestras"),

      @SerializedName("barber_and_beauty_shops")
      BARBER_AND_BEAUTY_SHOPS("barber_and_beauty_shops"),

      @SerializedName("betting_casino_gambling")
      BETTING_CASINO_GAMBLING("betting_casino_gambling"),

      @SerializedName("bicycle_shops")
      BICYCLE_SHOPS("bicycle_shops"),

      @SerializedName("billiard_pool_establishments")
      BILLIARD_POOL_ESTABLISHMENTS("billiard_pool_establishments"),

      @SerializedName("boat_dealers")
      BOAT_DEALERS("boat_dealers"),

      @SerializedName("boat_rentals_and_leases")
      BOAT_RENTALS_AND_LEASES("boat_rentals_and_leases"),

      @SerializedName("book_stores")
      BOOK_STORES("book_stores"),

      @SerializedName("books_periodicals_and_newspapers")
      BOOKS_PERIODICALS_AND_NEWSPAPERS("books_periodicals_and_newspapers"),

      @SerializedName("bowling_alleys")
      BOWLING_ALLEYS("bowling_alleys"),

      @SerializedName("bus_lines")
      BUS_LINES("bus_lines"),

      @SerializedName("business_secretarial_schools")
      BUSINESS_SECRETARIAL_SCHOOLS("business_secretarial_schools"),

      @SerializedName("buying_shopping_services")
      BUYING_SHOPPING_SERVICES("buying_shopping_services"),

      @SerializedName("cable_satellite_and_other_pay_television_and_radio")
      CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO(
          "cable_satellite_and_other_pay_television_and_radio"),

      @SerializedName("camera_and_photographic_supply_stores")
      CAMERA_AND_PHOTOGRAPHIC_SUPPLY_STORES("camera_and_photographic_supply_stores"),

      @SerializedName("candy_nut_and_confectionery_stores")
      CANDY_NUT_AND_CONFECTIONERY_STORES("candy_nut_and_confectionery_stores"),

      @SerializedName("car_and_truck_dealers_new_used")
      CAR_AND_TRUCK_DEALERS_NEW_USED("car_and_truck_dealers_new_used"),

      @SerializedName("car_and_truck_dealers_used_only")
      CAR_AND_TRUCK_DEALERS_USED_ONLY("car_and_truck_dealers_used_only"),

      @SerializedName("car_rental_agencies")
      CAR_RENTAL_AGENCIES("car_rental_agencies"),

      @SerializedName("car_washes")
      CAR_WASHES("car_washes"),

      @SerializedName("carpentry_services")
      CARPENTRY_SERVICES("carpentry_services"),

      @SerializedName("carpet_upholstery_cleaning")
      CARPET_UPHOLSTERY_CLEANING("carpet_upholstery_cleaning"),

      @SerializedName("caterers")
      CATERERS("caterers"),

      @SerializedName("charitable_and_social_service_organizations_fundraising")
      CHARITABLE_AND_SOCIAL_SERVICE_ORGANIZATIONS_FUNDRAISING(
          "charitable_and_social_service_organizations_fundraising"),

      @SerializedName("chemicals_and_allied_products")
      CHEMICALS_AND_ALLIED_PRODUCTS("chemicals_and_allied_products"),

      @SerializedName("child_care_services")
      CHILD_CARE_SERVICES("child_care_services"),

      @SerializedName("childrens_and_infants_wear_stores")
      CHILDRENS_AND_INFANTS_WEAR_STORES("childrens_and_infants_wear_stores"),

      @SerializedName("chiropodists_podiatrists")
      CHIROPODISTS_PODIATRISTS("chiropodists_podiatrists"),

      @SerializedName("chiropractors")
      CHIROPRACTORS("chiropractors"),

      @SerializedName("cigar_stores_and_stands")
      CIGAR_STORES_AND_STANDS("cigar_stores_and_stands"),

      @SerializedName("civic_social_fraternal_associations")
      CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS("civic_social_fraternal_associations"),

      @SerializedName("cleaning_and_maintenance")
      CLEANING_AND_MAINTENANCE("cleaning_and_maintenance"),

      @SerializedName("clothing_rental")
      CLOTHING_RENTAL("clothing_rental"),

      @SerializedName("colleges_universities")
      COLLEGES_UNIVERSITIES("colleges_universities"),

      @SerializedName("commercial_equipment")
      COMMERCIAL_EQUIPMENT("commercial_equipment"),

      @SerializedName("commercial_footwear")
      COMMERCIAL_FOOTWEAR("commercial_footwear"),

      @SerializedName("commercial_photography_art_and_graphics")
      COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS("commercial_photography_art_and_graphics"),

      @SerializedName("commuter_transport_and_ferries")
      COMMUTER_TRANSPORT_AND_FERRIES("commuter_transport_and_ferries"),

      @SerializedName("computer_network_services")
      COMPUTER_NETWORK_SERVICES("computer_network_services"),

      @SerializedName("computer_programming")
      COMPUTER_PROGRAMMING("computer_programming"),

      @SerializedName("computer_repair")
      COMPUTER_REPAIR("computer_repair"),

      @SerializedName("computer_software_stores")
      COMPUTER_SOFTWARE_STORES("computer_software_stores"),

      @SerializedName("computers_peripherals_and_software")
      COMPUTERS_PERIPHERALS_AND_SOFTWARE("computers_peripherals_and_software"),

      @SerializedName("concrete_work_services")
      CONCRETE_WORK_SERVICES("concrete_work_services"),

      @SerializedName("construction_materials")
      CONSTRUCTION_MATERIALS("construction_materials"),

      @SerializedName("consulting_public_relations")
      CONSULTING_PUBLIC_RELATIONS("consulting_public_relations"),

      @SerializedName("correspondence_schools")
      CORRESPONDENCE_SCHOOLS("correspondence_schools"),

      @SerializedName("cosmetic_stores")
      COSMETIC_STORES("cosmetic_stores"),

      @SerializedName("counseling_services")
      COUNSELING_SERVICES("counseling_services"),

      @SerializedName("country_clubs")
      COUNTRY_CLUBS("country_clubs"),

      @SerializedName("courier_services")
      COURIER_SERVICES("courier_services"),

      @SerializedName("court_costs")
      COURT_COSTS("court_costs"),

      @SerializedName("credit_reporting_agencies")
      CREDIT_REPORTING_AGENCIES("credit_reporting_agencies"),

      @SerializedName("cruise_lines")
      CRUISE_LINES("cruise_lines"),

      @SerializedName("dairy_products_stores")
      DAIRY_PRODUCTS_STORES("dairy_products_stores"),

      @SerializedName("dance_hall_studios_schools")
      DANCE_HALL_STUDIOS_SCHOOLS("dance_hall_studios_schools"),

      @SerializedName("dating_escort_services")
      DATING_ESCORT_SERVICES("dating_escort_services"),

      @SerializedName("dentists_orthodontists")
      DENTISTS_ORTHODONTISTS("dentists_orthodontists"),

      @SerializedName("department_stores")
      DEPARTMENT_STORES("department_stores"),

      @SerializedName("detective_agencies")
      DETECTIVE_AGENCIES("detective_agencies"),

      @SerializedName("digital_goods_applications")
      DIGITAL_GOODS_APPLICATIONS("digital_goods_applications"),

      @SerializedName("digital_goods_games")
      DIGITAL_GOODS_GAMES("digital_goods_games"),

      @SerializedName("digital_goods_large_volume")
      DIGITAL_GOODS_LARGE_VOLUME("digital_goods_large_volume"),

      @SerializedName("digital_goods_media")
      DIGITAL_GOODS_MEDIA("digital_goods_media"),

      @SerializedName("direct_marketing_catalog_merchant")
      DIRECT_MARKETING_CATALOG_MERCHANT("direct_marketing_catalog_merchant"),

      @SerializedName("direct_marketing_combination_catalog_and_retail_merchant")
      DIRECT_MARKETING_COMBINATION_CATALOG_AND_RETAIL_MERCHANT(
          "direct_marketing_combination_catalog_and_retail_merchant"),

      @SerializedName("direct_marketing_inbound_telemarketing")
      DIRECT_MARKETING_INBOUND_TELEMARKETING("direct_marketing_inbound_telemarketing"),

      @SerializedName("direct_marketing_insurance_services")
      DIRECT_MARKETING_INSURANCE_SERVICES("direct_marketing_insurance_services"),

      @SerializedName("direct_marketing_other")
      DIRECT_MARKETING_OTHER("direct_marketing_other"),

      @SerializedName("direct_marketing_outbound_telemarketing")
      DIRECT_MARKETING_OUTBOUND_TELEMARKETING("direct_marketing_outbound_telemarketing"),

      @SerializedName("direct_marketing_subscription")
      DIRECT_MARKETING_SUBSCRIPTION("direct_marketing_subscription"),

      @SerializedName("direct_marketing_travel")
      DIRECT_MARKETING_TRAVEL("direct_marketing_travel"),

      @SerializedName("discount_stores")
      DISCOUNT_STORES("discount_stores"),

      @SerializedName("doctors")
      DOCTORS("doctors"),

      @SerializedName("door_to_door_sales")
      DOOR_TO_DOOR_SALES("door_to_door_sales"),

      @SerializedName("drapery_window_covering_and_upholstery_stores")
      DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY_STORES(
          "drapery_window_covering_and_upholstery_stores"),

      @SerializedName("drinking_places")
      DRINKING_PLACES("drinking_places"),

      @SerializedName("drug_stores_and_pharmacies")
      DRUG_STORES_AND_PHARMACIES("drug_stores_and_pharmacies"),

      @SerializedName("drugs_drug_proprietaries_and_druggist_sundries")
      DRUGS_DRUG_PROPRIETARIES_AND_DRUGGIST_SUNDRIES(
          "drugs_drug_proprietaries_and_druggist_sundries"),

      @SerializedName("dry_cleaners")
      DRY_CLEANERS("dry_cleaners"),

      @SerializedName("durable_goods")
      DURABLE_GOODS("durable_goods"),

      @SerializedName("duty_free_stores")
      DUTY_FREE_STORES("duty_free_stores"),

      @SerializedName("eating_places_restaurants")
      EATING_PLACES_RESTAURANTS("eating_places_restaurants"),

      @SerializedName("educational_services")
      EDUCATIONAL_SERVICES("educational_services"),

      @SerializedName("electric_razor_stores")
      ELECTRIC_RAZOR_STORES("electric_razor_stores"),

      @SerializedName("electric_vehicle_charging")
      ELECTRIC_VEHICLE_CHARGING("electric_vehicle_charging"),

      @SerializedName("electrical_parts_and_equipment")
      ELECTRICAL_PARTS_AND_EQUIPMENT("electrical_parts_and_equipment"),

      @SerializedName("electrical_services")
      ELECTRICAL_SERVICES("electrical_services"),

      @SerializedName("electronics_repair_shops")
      ELECTRONICS_REPAIR_SHOPS("electronics_repair_shops"),

      @SerializedName("electronics_stores")
      ELECTRONICS_STORES("electronics_stores"),

      @SerializedName("elementary_secondary_schools")
      ELEMENTARY_SECONDARY_SCHOOLS("elementary_secondary_schools"),

      @SerializedName("emergency_services_gcas_visa_use_only")
      EMERGENCY_SERVICES_GCAS_VISA_USE_ONLY("emergency_services_gcas_visa_use_only"),

      @SerializedName("employment_temp_agencies")
      EMPLOYMENT_TEMP_AGENCIES("employment_temp_agencies"),

      @SerializedName("equipment_rental")
      EQUIPMENT_RENTAL("equipment_rental"),

      @SerializedName("exterminating_services")
      EXTERMINATING_SERVICES("exterminating_services"),

      @SerializedName("family_clothing_stores")
      FAMILY_CLOTHING_STORES("family_clothing_stores"),

      @SerializedName("fast_food_restaurants")
      FAST_FOOD_RESTAURANTS("fast_food_restaurants"),

      @SerializedName("financial_institutions")
      FINANCIAL_INSTITUTIONS("financial_institutions"),

      @SerializedName("fines_government_administrative_entities")
      FINES_GOVERNMENT_ADMINISTRATIVE_ENTITIES("fines_government_administrative_entities"),

      @SerializedName("fireplace_fireplace_screens_and_accessories_stores")
      FIREPLACE_FIREPLACE_SCREENS_AND_ACCESSORIES_STORES(
          "fireplace_fireplace_screens_and_accessories_stores"),

      @SerializedName("floor_covering_stores")
      FLOOR_COVERING_STORES("floor_covering_stores"),

      @SerializedName("florists")
      FLORISTS("florists"),

      @SerializedName("florists_supplies_nursery_stock_and_flowers")
      FLORISTS_SUPPLIES_NURSERY_STOCK_AND_FLOWERS("florists_supplies_nursery_stock_and_flowers"),

      @SerializedName("freezer_and_locker_meat_provisioners")
      FREEZER_AND_LOCKER_MEAT_PROVISIONERS("freezer_and_locker_meat_provisioners"),

      @SerializedName("fuel_dealers_non_automotive")
      FUEL_DEALERS_NON_AUTOMOTIVE("fuel_dealers_non_automotive"),

      @SerializedName("funeral_services_crematories")
      FUNERAL_SERVICES_CREMATORIES("funeral_services_crematories"),

      @SerializedName("furniture_home_furnishings_and_equipment_stores_except_appliances")
      FURNITURE_HOME_FURNISHINGS_AND_EQUIPMENT_STORES_EXCEPT_APPLIANCES(
          "furniture_home_furnishings_and_equipment_stores_except_appliances"),

      @SerializedName("furniture_repair_refinishing")
      FURNITURE_REPAIR_REFINISHING("furniture_repair_refinishing"),

      @SerializedName("furriers_and_fur_shops")
      FURRIERS_AND_FUR_SHOPS("furriers_and_fur_shops"),

      @SerializedName("general_services")
      GENERAL_SERVICES("general_services"),

      @SerializedName("gift_card_novelty_and_souvenir_shops")
      GIFT_CARD_NOVELTY_AND_SOUVENIR_SHOPS("gift_card_novelty_and_souvenir_shops"),

      @SerializedName("glass_paint_and_wallpaper_stores")
      GLASS_PAINT_AND_WALLPAPER_STORES("glass_paint_and_wallpaper_stores"),

      @SerializedName("glassware_crystal_stores")
      GLASSWARE_CRYSTAL_STORES("glassware_crystal_stores"),

      @SerializedName("golf_courses_public")
      GOLF_COURSES_PUBLIC("golf_courses_public"),

      @SerializedName("government_licensed_horse_dog_racing_us_region_only")
      GOVERNMENT_LICENSED_HORSE_DOG_RACING_US_REGION_ONLY(
          "government_licensed_horse_dog_racing_us_region_only"),

      @SerializedName("government_licensed_online_casions_online_gambling_us_region_only")
      GOVERNMENT_LICENSED_ONLINE_CASIONS_ONLINE_GAMBLING_US_REGION_ONLY(
          "government_licensed_online_casions_online_gambling_us_region_only"),

      @SerializedName("government_owned_lotteries_non_us_region")
      GOVERNMENT_OWNED_LOTTERIES_NON_US_REGION("government_owned_lotteries_non_us_region"),

      @SerializedName("government_owned_lotteries_us_region_only")
      GOVERNMENT_OWNED_LOTTERIES_US_REGION_ONLY("government_owned_lotteries_us_region_only"),

      @SerializedName("government_services")
      GOVERNMENT_SERVICES("government_services"),

      @SerializedName("grocery_stores_supermarkets")
      GROCERY_STORES_SUPERMARKETS("grocery_stores_supermarkets"),

      @SerializedName("hardware_equipment_and_supplies")
      HARDWARE_EQUIPMENT_AND_SUPPLIES("hardware_equipment_and_supplies"),

      @SerializedName("hardware_stores")
      HARDWARE_STORES("hardware_stores"),

      @SerializedName("health_and_beauty_spas")
      HEALTH_AND_BEAUTY_SPAS("health_and_beauty_spas"),

      @SerializedName("hearing_aids_sales_and_supplies")
      HEARING_AIDS_SALES_AND_SUPPLIES("hearing_aids_sales_and_supplies"),

      @SerializedName("heating_plumbing_a_c")
      HEATING_PLUMBING_A_C("heating_plumbing_a_c"),

      @SerializedName("hobby_toy_and_game_shops")
      HOBBY_TOY_AND_GAME_SHOPS("hobby_toy_and_game_shops"),

      @SerializedName("home_supply_warehouse_stores")
      HOME_SUPPLY_WAREHOUSE_STORES("home_supply_warehouse_stores"),

      @SerializedName("hospitals")
      HOSPITALS("hospitals"),

      @SerializedName("hotels_motels_and_resorts")
      HOTELS_MOTELS_AND_RESORTS("hotels_motels_and_resorts"),

      @SerializedName("household_appliance_stores")
      HOUSEHOLD_APPLIANCE_STORES("household_appliance_stores"),

      @SerializedName("industrial_supplies")
      INDUSTRIAL_SUPPLIES("industrial_supplies"),

      @SerializedName("information_retrieval_services")
      INFORMATION_RETRIEVAL_SERVICES("information_retrieval_services"),

      @SerializedName("insurance_default")
      INSURANCE_DEFAULT("insurance_default"),

      @SerializedName("insurance_underwriting_premiums")
      INSURANCE_UNDERWRITING_PREMIUMS("insurance_underwriting_premiums"),

      @SerializedName("intra_company_purchases")
      INTRA_COMPANY_PURCHASES("intra_company_purchases"),

      @SerializedName("jewelry_stores_watches_clocks_and_silverware_stores")
      JEWELRY_STORES_WATCHES_CLOCKS_AND_SILVERWARE_STORES(
          "jewelry_stores_watches_clocks_and_silverware_stores"),

      @SerializedName("landscaping_services")
      LANDSCAPING_SERVICES("landscaping_services"),

      @SerializedName("laundries")
      LAUNDRIES("laundries"),

      @SerializedName("laundry_cleaning_services")
      LAUNDRY_CLEANING_SERVICES("laundry_cleaning_services"),

      @SerializedName("legal_services_attorneys")
      LEGAL_SERVICES_ATTORNEYS("legal_services_attorneys"),

      @SerializedName("luggage_and_leather_goods_stores")
      LUGGAGE_AND_LEATHER_GOODS_STORES("luggage_and_leather_goods_stores"),

      @SerializedName("lumber_building_materials_stores")
      LUMBER_BUILDING_MATERIALS_STORES("lumber_building_materials_stores"),

      @SerializedName("manual_cash_disburse")
      MANUAL_CASH_DISBURSE("manual_cash_disburse"),

      @SerializedName("marinas_service_and_supplies")
      MARINAS_SERVICE_AND_SUPPLIES("marinas_service_and_supplies"),

      @SerializedName("marketplaces")
      MARKETPLACES("marketplaces"),

      @SerializedName("masonry_stonework_and_plaster")
      MASONRY_STONEWORK_AND_PLASTER("masonry_stonework_and_plaster"),

      @SerializedName("massage_parlors")
      MASSAGE_PARLORS("massage_parlors"),

      @SerializedName("medical_and_dental_labs")
      MEDICAL_AND_DENTAL_LABS("medical_and_dental_labs"),

      @SerializedName("medical_dental_ophthalmic_and_hospital_equipment_and_supplies")
      MEDICAL_DENTAL_OPHTHALMIC_AND_HOSPITAL_EQUIPMENT_AND_SUPPLIES(
          "medical_dental_ophthalmic_and_hospital_equipment_and_supplies"),

      @SerializedName("medical_services")
      MEDICAL_SERVICES("medical_services"),

      @SerializedName("membership_organizations")
      MEMBERSHIP_ORGANIZATIONS("membership_organizations"),

      @SerializedName("mens_and_boys_clothing_and_accessories_stores")
      MENS_AND_BOYS_CLOTHING_AND_ACCESSORIES_STORES(
          "mens_and_boys_clothing_and_accessories_stores"),

      @SerializedName("mens_womens_clothing_stores")
      MENS_WOMENS_CLOTHING_STORES("mens_womens_clothing_stores"),

      @SerializedName("metal_service_centers")
      METAL_SERVICE_CENTERS("metal_service_centers"),

      @SerializedName("miscellaneous")
      MISCELLANEOUS("miscellaneous"),

      @SerializedName("miscellaneous_apparel_and_accessory_shops")
      MISCELLANEOUS_APPAREL_AND_ACCESSORY_SHOPS("miscellaneous_apparel_and_accessory_shops"),

      @SerializedName("miscellaneous_auto_dealers")
      MISCELLANEOUS_AUTO_DEALERS("miscellaneous_auto_dealers"),

      @SerializedName("miscellaneous_business_services")
      MISCELLANEOUS_BUSINESS_SERVICES("miscellaneous_business_services"),

      @SerializedName("miscellaneous_food_stores")
      MISCELLANEOUS_FOOD_STORES("miscellaneous_food_stores"),

      @SerializedName("miscellaneous_general_merchandise")
      MISCELLANEOUS_GENERAL_MERCHANDISE("miscellaneous_general_merchandise"),

      @SerializedName("miscellaneous_general_services")
      MISCELLANEOUS_GENERAL_SERVICES("miscellaneous_general_services"),

      @SerializedName("miscellaneous_home_furnishing_specialty_stores")
      MISCELLANEOUS_HOME_FURNISHING_SPECIALTY_STORES(
          "miscellaneous_home_furnishing_specialty_stores"),

      @SerializedName("miscellaneous_publishing_and_printing")
      MISCELLANEOUS_PUBLISHING_AND_PRINTING("miscellaneous_publishing_and_printing"),

      @SerializedName("miscellaneous_recreation_services")
      MISCELLANEOUS_RECREATION_SERVICES("miscellaneous_recreation_services"),

      @SerializedName("miscellaneous_repair_shops")
      MISCELLANEOUS_REPAIR_SHOPS("miscellaneous_repair_shops"),

      @SerializedName("miscellaneous_specialty_retail")
      MISCELLANEOUS_SPECIALTY_RETAIL("miscellaneous_specialty_retail"),

      @SerializedName("mobile_home_dealers")
      MOBILE_HOME_DEALERS("mobile_home_dealers"),

      @SerializedName("motion_picture_theaters")
      MOTION_PICTURE_THEATERS("motion_picture_theaters"),

      @SerializedName("motor_freight_carriers_and_trucking")
      MOTOR_FREIGHT_CARRIERS_AND_TRUCKING("motor_freight_carriers_and_trucking"),

      @SerializedName("motor_homes_dealers")
      MOTOR_HOMES_DEALERS("motor_homes_dealers"),

      @SerializedName("motor_vehicle_supplies_and_new_parts")
      MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS("motor_vehicle_supplies_and_new_parts"),

      @SerializedName("motorcycle_shops_and_dealers")
      MOTORCYCLE_SHOPS_AND_DEALERS("motorcycle_shops_and_dealers"),

      @SerializedName("motorcycle_shops_dealers")
      MOTORCYCLE_SHOPS_DEALERS("motorcycle_shops_dealers"),

      @SerializedName("music_stores_musical_instruments_pianos_and_sheet_music")
      MUSIC_STORES_MUSICAL_INSTRUMENTS_PIANOS_AND_SHEET_MUSIC(
          "music_stores_musical_instruments_pianos_and_sheet_music"),

      @SerializedName("news_dealers_and_newsstands")
      NEWS_DEALERS_AND_NEWSSTANDS("news_dealers_and_newsstands"),

      @SerializedName("non_fi_money_orders")
      NON_FI_MONEY_ORDERS("non_fi_money_orders"),

      @SerializedName("non_fi_stored_value_card_purchase_load")
      NON_FI_STORED_VALUE_CARD_PURCHASE_LOAD("non_fi_stored_value_card_purchase_load"),

      @SerializedName("nondurable_goods")
      NONDURABLE_GOODS("nondurable_goods"),

      @SerializedName("nurseries_lawn_and_garden_supply_stores")
      NURSERIES_LAWN_AND_GARDEN_SUPPLY_STORES("nurseries_lawn_and_garden_supply_stores"),

      @SerializedName("nursing_personal_care")
      NURSING_PERSONAL_CARE("nursing_personal_care"),

      @SerializedName("office_and_commercial_furniture")
      OFFICE_AND_COMMERCIAL_FURNITURE("office_and_commercial_furniture"),

      @SerializedName("opticians_eyeglasses")
      OPTICIANS_EYEGLASSES("opticians_eyeglasses"),

      @SerializedName("optometrists_ophthalmologist")
      OPTOMETRISTS_OPHTHALMOLOGIST("optometrists_ophthalmologist"),

      @SerializedName("orthopedic_goods_prosthetic_devices")
      ORTHOPEDIC_GOODS_PROSTHETIC_DEVICES("orthopedic_goods_prosthetic_devices"),

      @SerializedName("osteopaths")
      OSTEOPATHS("osteopaths"),

      @SerializedName("package_stores_beer_wine_and_liquor")
      PACKAGE_STORES_BEER_WINE_AND_LIQUOR("package_stores_beer_wine_and_liquor"),

      @SerializedName("paints_varnishes_and_supplies")
      PAINTS_VARNISHES_AND_SUPPLIES("paints_varnishes_and_supplies"),

      @SerializedName("parking_lots_garages")
      PARKING_LOTS_GARAGES("parking_lots_garages"),

      @SerializedName("passenger_railways")
      PASSENGER_RAILWAYS("passenger_railways"),

      @SerializedName("pawn_shops")
      PAWN_SHOPS("pawn_shops"),

      @SerializedName("pet_shops_pet_food_and_supplies")
      PET_SHOPS_PET_FOOD_AND_SUPPLIES("pet_shops_pet_food_and_supplies"),

      @SerializedName("petroleum_and_petroleum_products")
      PETROLEUM_AND_PETROLEUM_PRODUCTS("petroleum_and_petroleum_products"),

      @SerializedName("photo_developing")
      PHOTO_DEVELOPING("photo_developing"),

      @SerializedName("photographic_photocopy_microfilm_equipment_and_supplies")
      PHOTOGRAPHIC_PHOTOCOPY_MICROFILM_EQUIPMENT_AND_SUPPLIES(
          "photographic_photocopy_microfilm_equipment_and_supplies"),

      @SerializedName("photographic_studios")
      PHOTOGRAPHIC_STUDIOS("photographic_studios"),

      @SerializedName("picture_video_production")
      PICTURE_VIDEO_PRODUCTION("picture_video_production"),

      @SerializedName("piece_goods_notions_and_other_dry_goods")
      PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS("piece_goods_notions_and_other_dry_goods"),

      @SerializedName("plumbing_heating_equipment_and_supplies")
      PLUMBING_HEATING_EQUIPMENT_AND_SUPPLIES("plumbing_heating_equipment_and_supplies"),

      @SerializedName("political_organizations")
      POLITICAL_ORGANIZATIONS("political_organizations"),

      @SerializedName("postal_services_government_only")
      POSTAL_SERVICES_GOVERNMENT_ONLY("postal_services_government_only"),

      @SerializedName("precious_stones_and_metals_watches_and_jewelry")
      PRECIOUS_STONES_AND_METALS_WATCHES_AND_JEWELRY(
          "precious_stones_and_metals_watches_and_jewelry"),

      @SerializedName("professional_services")
      PROFESSIONAL_SERVICES("professional_services"),

      @SerializedName("public_warehousing_and_storage")
      PUBLIC_WAREHOUSING_AND_STORAGE("public_warehousing_and_storage"),

      @SerializedName("quick_copy_repro_and_blueprint")
      QUICK_COPY_REPRO_AND_BLUEPRINT("quick_copy_repro_and_blueprint"),

      @SerializedName("railroads")
      RAILROADS("railroads"),

      @SerializedName("real_estate_agents_and_managers_rentals")
      REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS("real_estate_agents_and_managers_rentals"),

      @SerializedName("record_stores")
      RECORD_STORES("record_stores"),

      @SerializedName("recreational_vehicle_rentals")
      RECREATIONAL_VEHICLE_RENTALS("recreational_vehicle_rentals"),

      @SerializedName("religious_goods_stores")
      RELIGIOUS_GOODS_STORES("religious_goods_stores"),

      @SerializedName("religious_organizations")
      RELIGIOUS_ORGANIZATIONS("religious_organizations"),

      @SerializedName("roofing_siding_sheet_metal")
      ROOFING_SIDING_SHEET_METAL("roofing_siding_sheet_metal"),

      @SerializedName("secretarial_support_services")
      SECRETARIAL_SUPPORT_SERVICES("secretarial_support_services"),

      @SerializedName("security_brokers_dealers")
      SECURITY_BROKERS_DEALERS("security_brokers_dealers"),

      @SerializedName("service_stations")
      SERVICE_STATIONS("service_stations"),

      @SerializedName("sewing_needlework_fabric_and_piece_goods_stores")
      SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES(
          "sewing_needlework_fabric_and_piece_goods_stores"),

      @SerializedName("shoe_repair_hat_cleaning")
      SHOE_REPAIR_HAT_CLEANING("shoe_repair_hat_cleaning"),

      @SerializedName("shoe_stores")
      SHOE_STORES("shoe_stores"),

      @SerializedName("small_appliance_repair")
      SMALL_APPLIANCE_REPAIR("small_appliance_repair"),

      @SerializedName("snowmobile_dealers")
      SNOWMOBILE_DEALERS("snowmobile_dealers"),

      @SerializedName("special_trade_services")
      SPECIAL_TRADE_SERVICES("special_trade_services"),

      @SerializedName("specialty_cleaning")
      SPECIALTY_CLEANING("specialty_cleaning"),

      @SerializedName("sporting_goods_stores")
      SPORTING_GOODS_STORES("sporting_goods_stores"),

      @SerializedName("sporting_recreation_camps")
      SPORTING_RECREATION_CAMPS("sporting_recreation_camps"),

      @SerializedName("sports_and_riding_apparel_stores")
      SPORTS_AND_RIDING_APPAREL_STORES("sports_and_riding_apparel_stores"),

      @SerializedName("sports_clubs_fields")
      SPORTS_CLUBS_FIELDS("sports_clubs_fields"),

      @SerializedName("stamp_and_coin_stores")
      STAMP_AND_COIN_STORES("stamp_and_coin_stores"),

      @SerializedName("stationary_office_supplies_printing_and_writing_paper")
      STATIONARY_OFFICE_SUPPLIES_PRINTING_AND_WRITING_PAPER(
          "stationary_office_supplies_printing_and_writing_paper"),

      @SerializedName("stationery_stores_office_and_school_supply_stores")
      STATIONERY_STORES_OFFICE_AND_SCHOOL_SUPPLY_STORES(
          "stationery_stores_office_and_school_supply_stores"),

      @SerializedName("swimming_pools_sales")
      SWIMMING_POOLS_SALES("swimming_pools_sales"),

      @SerializedName("t_ui_travel_germany")
      T_UI_TRAVEL_GERMANY("t_ui_travel_germany"),

      @SerializedName("tailors_alterations")
      TAILORS_ALTERATIONS("tailors_alterations"),

      @SerializedName("tax_payments_government_agencies")
      TAX_PAYMENTS_GOVERNMENT_AGENCIES("tax_payments_government_agencies"),

      @SerializedName("tax_preparation_services")
      TAX_PREPARATION_SERVICES("tax_preparation_services"),

      @SerializedName("taxicabs_limousines")
      TAXICABS_LIMOUSINES("taxicabs_limousines"),

      @SerializedName("telecommunication_equipment_and_telephone_sales")
      TELECOMMUNICATION_EQUIPMENT_AND_TELEPHONE_SALES(
          "telecommunication_equipment_and_telephone_sales"),

      @SerializedName("telecommunication_services")
      TELECOMMUNICATION_SERVICES("telecommunication_services"),

      @SerializedName("telegraph_services")
      TELEGRAPH_SERVICES("telegraph_services"),

      @SerializedName("tent_and_awning_shops")
      TENT_AND_AWNING_SHOPS("tent_and_awning_shops"),

      @SerializedName("testing_laboratories")
      TESTING_LABORATORIES("testing_laboratories"),

      @SerializedName("theatrical_ticket_agencies")
      THEATRICAL_TICKET_AGENCIES("theatrical_ticket_agencies"),

      @SerializedName("timeshares")
      TIMESHARES("timeshares"),

      @SerializedName("tire_retreading_and_repair")
      TIRE_RETREADING_AND_REPAIR("tire_retreading_and_repair"),

      @SerializedName("tolls_bridge_fees")
      TOLLS_BRIDGE_FEES("tolls_bridge_fees"),

      @SerializedName("tourist_attractions_and_exhibits")
      TOURIST_ATTRACTIONS_AND_EXHIBITS("tourist_attractions_and_exhibits"),

      @SerializedName("towing_services")
      TOWING_SERVICES("towing_services"),

      @SerializedName("trailer_parks_campgrounds")
      TRAILER_PARKS_CAMPGROUNDS("trailer_parks_campgrounds"),

      @SerializedName("transportation_services")
      TRANSPORTATION_SERVICES("transportation_services"),

      @SerializedName("travel_agencies_tour_operators")
      TRAVEL_AGENCIES_TOUR_OPERATORS("travel_agencies_tour_operators"),

      @SerializedName("truck_stop_iteration")
      TRUCK_STOP_ITERATION("truck_stop_iteration"),

      @SerializedName("truck_utility_trailer_rentals")
      TRUCK_UTILITY_TRAILER_RENTALS("truck_utility_trailer_rentals"),

      @SerializedName("typesetting_plate_making_and_related_services")
      TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES(
          "typesetting_plate_making_and_related_services"),

      @SerializedName("typewriter_stores")
      TYPEWRITER_STORES("typewriter_stores"),

      @SerializedName("u_s_federal_government_agencies_or_departments")
      U_S_FEDERAL_GOVERNMENT_AGENCIES_OR_DEPARTMENTS(
          "u_s_federal_government_agencies_or_departments"),

      @SerializedName("uniforms_commercial_clothing")
      UNIFORMS_COMMERCIAL_CLOTHING("uniforms_commercial_clothing"),

      @SerializedName("used_merchandise_and_secondhand_stores")
      USED_MERCHANDISE_AND_SECONDHAND_STORES("used_merchandise_and_secondhand_stores"),

      @SerializedName("utilities")
      UTILITIES("utilities"),

      @SerializedName("variety_stores")
      VARIETY_STORES("variety_stores"),

      @SerializedName("veterinary_services")
      VETERINARY_SERVICES("veterinary_services"),

      @SerializedName("video_amusement_game_supplies")
      VIDEO_AMUSEMENT_GAME_SUPPLIES("video_amusement_game_supplies"),

      @SerializedName("video_game_arcades")
      VIDEO_GAME_ARCADES("video_game_arcades"),

      @SerializedName("video_tape_rental_stores")
      VIDEO_TAPE_RENTAL_STORES("video_tape_rental_stores"),

      @SerializedName("vocational_trade_schools")
      VOCATIONAL_TRADE_SCHOOLS("vocational_trade_schools"),

      @SerializedName("watch_jewelry_repair")
      WATCH_JEWELRY_REPAIR("watch_jewelry_repair"),

      @SerializedName("welding_repair")
      WELDING_REPAIR("welding_repair"),

      @SerializedName("wholesale_clubs")
      WHOLESALE_CLUBS("wholesale_clubs"),

      @SerializedName("wig_and_toupee_stores")
      WIG_AND_TOUPEE_STORES("wig_and_toupee_stores"),

      @SerializedName("wires_money_orders")
      WIRES_MONEY_ORDERS("wires_money_orders"),

      @SerializedName("womens_accessory_and_specialty_shops")
      WOMENS_ACCESSORY_AND_SPECIALTY_SHOPS("womens_accessory_and_specialty_shops"),

      @SerializedName("womens_ready_to_wear_stores")
      WOMENS_READY_TO_WEAR_STORES("womens_ready_to_wear_stores"),

      @SerializedName("wrecking_and_salvage_yards")
      WRECKING_AND_SALVAGE_YARDS("wrecking_and_salvage_yards");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AllowedCategory(String value) {
        this.value = value;
      }
    }

    public enum BlockedCategory implements ApiRequestParams.EnumParam {
      @SerializedName("ac_refrigeration_repair")
      AC_REFRIGERATION_REPAIR("ac_refrigeration_repair"),

      @SerializedName("accounting_bookkeeping_services")
      ACCOUNTING_BOOKKEEPING_SERVICES("accounting_bookkeeping_services"),

      @SerializedName("advertising_services")
      ADVERTISING_SERVICES("advertising_services"),

      @SerializedName("agricultural_cooperative")
      AGRICULTURAL_COOPERATIVE("agricultural_cooperative"),

      @SerializedName("airlines_air_carriers")
      AIRLINES_AIR_CARRIERS("airlines_air_carriers"),

      @SerializedName("airports_flying_fields")
      AIRPORTS_FLYING_FIELDS("airports_flying_fields"),

      @SerializedName("ambulance_services")
      AMBULANCE_SERVICES("ambulance_services"),

      @SerializedName("amusement_parks_carnivals")
      AMUSEMENT_PARKS_CARNIVALS("amusement_parks_carnivals"),

      @SerializedName("antique_reproductions")
      ANTIQUE_REPRODUCTIONS("antique_reproductions"),

      @SerializedName("antique_shops")
      ANTIQUE_SHOPS("antique_shops"),

      @SerializedName("aquariums")
      AQUARIUMS("aquariums"),

      @SerializedName("architectural_surveying_services")
      ARCHITECTURAL_SURVEYING_SERVICES("architectural_surveying_services"),

      @SerializedName("art_dealers_and_galleries")
      ART_DEALERS_AND_GALLERIES("art_dealers_and_galleries"),

      @SerializedName("artists_supply_and_craft_shops")
      ARTISTS_SUPPLY_AND_CRAFT_SHOPS("artists_supply_and_craft_shops"),

      @SerializedName("auto_and_home_supply_stores")
      AUTO_AND_HOME_SUPPLY_STORES("auto_and_home_supply_stores"),

      @SerializedName("auto_body_repair_shops")
      AUTO_BODY_REPAIR_SHOPS("auto_body_repair_shops"),

      @SerializedName("auto_paint_shops")
      AUTO_PAINT_SHOPS("auto_paint_shops"),

      @SerializedName("auto_service_shops")
      AUTO_SERVICE_SHOPS("auto_service_shops"),

      @SerializedName("automated_cash_disburse")
      AUTOMATED_CASH_DISBURSE("automated_cash_disburse"),

      @SerializedName("automated_fuel_dispensers")
      AUTOMATED_FUEL_DISPENSERS("automated_fuel_dispensers"),

      @SerializedName("automobile_associations")
      AUTOMOBILE_ASSOCIATIONS("automobile_associations"),

      @SerializedName("automotive_parts_and_accessories_stores")
      AUTOMOTIVE_PARTS_AND_ACCESSORIES_STORES("automotive_parts_and_accessories_stores"),

      @SerializedName("automotive_tire_stores")
      AUTOMOTIVE_TIRE_STORES("automotive_tire_stores"),

      @SerializedName("bail_and_bond_payments")
      BAIL_AND_BOND_PAYMENTS("bail_and_bond_payments"),

      @SerializedName("bakeries")
      BAKERIES("bakeries"),

      @SerializedName("bands_orchestras")
      BANDS_ORCHESTRAS("bands_orchestras"),

      @SerializedName("barber_and_beauty_shops")
      BARBER_AND_BEAUTY_SHOPS("barber_and_beauty_shops"),

      @SerializedName("betting_casino_gambling")
      BETTING_CASINO_GAMBLING("betting_casino_gambling"),

      @SerializedName("bicycle_shops")
      BICYCLE_SHOPS("bicycle_shops"),

      @SerializedName("billiard_pool_establishments")
      BILLIARD_POOL_ESTABLISHMENTS("billiard_pool_establishments"),

      @SerializedName("boat_dealers")
      BOAT_DEALERS("boat_dealers"),

      @SerializedName("boat_rentals_and_leases")
      BOAT_RENTALS_AND_LEASES("boat_rentals_and_leases"),

      @SerializedName("book_stores")
      BOOK_STORES("book_stores"),

      @SerializedName("books_periodicals_and_newspapers")
      BOOKS_PERIODICALS_AND_NEWSPAPERS("books_periodicals_and_newspapers"),

      @SerializedName("bowling_alleys")
      BOWLING_ALLEYS("bowling_alleys"),

      @SerializedName("bus_lines")
      BUS_LINES("bus_lines"),

      @SerializedName("business_secretarial_schools")
      BUSINESS_SECRETARIAL_SCHOOLS("business_secretarial_schools"),

      @SerializedName("buying_shopping_services")
      BUYING_SHOPPING_SERVICES("buying_shopping_services"),

      @SerializedName("cable_satellite_and_other_pay_television_and_radio")
      CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO(
          "cable_satellite_and_other_pay_television_and_radio"),

      @SerializedName("camera_and_photographic_supply_stores")
      CAMERA_AND_PHOTOGRAPHIC_SUPPLY_STORES("camera_and_photographic_supply_stores"),

      @SerializedName("candy_nut_and_confectionery_stores")
      CANDY_NUT_AND_CONFECTIONERY_STORES("candy_nut_and_confectionery_stores"),

      @SerializedName("car_and_truck_dealers_new_used")
      CAR_AND_TRUCK_DEALERS_NEW_USED("car_and_truck_dealers_new_used"),

      @SerializedName("car_and_truck_dealers_used_only")
      CAR_AND_TRUCK_DEALERS_USED_ONLY("car_and_truck_dealers_used_only"),

      @SerializedName("car_rental_agencies")
      CAR_RENTAL_AGENCIES("car_rental_agencies"),

      @SerializedName("car_washes")
      CAR_WASHES("car_washes"),

      @SerializedName("carpentry_services")
      CARPENTRY_SERVICES("carpentry_services"),

      @SerializedName("carpet_upholstery_cleaning")
      CARPET_UPHOLSTERY_CLEANING("carpet_upholstery_cleaning"),

      @SerializedName("caterers")
      CATERERS("caterers"),

      @SerializedName("charitable_and_social_service_organizations_fundraising")
      CHARITABLE_AND_SOCIAL_SERVICE_ORGANIZATIONS_FUNDRAISING(
          "charitable_and_social_service_organizations_fundraising"),

      @SerializedName("chemicals_and_allied_products")
      CHEMICALS_AND_ALLIED_PRODUCTS("chemicals_and_allied_products"),

      @SerializedName("child_care_services")
      CHILD_CARE_SERVICES("child_care_services"),

      @SerializedName("childrens_and_infants_wear_stores")
      CHILDRENS_AND_INFANTS_WEAR_STORES("childrens_and_infants_wear_stores"),

      @SerializedName("chiropodists_podiatrists")
      CHIROPODISTS_PODIATRISTS("chiropodists_podiatrists"),

      @SerializedName("chiropractors")
      CHIROPRACTORS("chiropractors"),

      @SerializedName("cigar_stores_and_stands")
      CIGAR_STORES_AND_STANDS("cigar_stores_and_stands"),

      @SerializedName("civic_social_fraternal_associations")
      CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS("civic_social_fraternal_associations"),

      @SerializedName("cleaning_and_maintenance")
      CLEANING_AND_MAINTENANCE("cleaning_and_maintenance"),

      @SerializedName("clothing_rental")
      CLOTHING_RENTAL("clothing_rental"),

      @SerializedName("colleges_universities")
      COLLEGES_UNIVERSITIES("colleges_universities"),

      @SerializedName("commercial_equipment")
      COMMERCIAL_EQUIPMENT("commercial_equipment"),

      @SerializedName("commercial_footwear")
      COMMERCIAL_FOOTWEAR("commercial_footwear"),

      @SerializedName("commercial_photography_art_and_graphics")
      COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS("commercial_photography_art_and_graphics"),

      @SerializedName("commuter_transport_and_ferries")
      COMMUTER_TRANSPORT_AND_FERRIES("commuter_transport_and_ferries"),

      @SerializedName("computer_network_services")
      COMPUTER_NETWORK_SERVICES("computer_network_services"),

      @SerializedName("computer_programming")
      COMPUTER_PROGRAMMING("computer_programming"),

      @SerializedName("computer_repair")
      COMPUTER_REPAIR("computer_repair"),

      @SerializedName("computer_software_stores")
      COMPUTER_SOFTWARE_STORES("computer_software_stores"),

      @SerializedName("computers_peripherals_and_software")
      COMPUTERS_PERIPHERALS_AND_SOFTWARE("computers_peripherals_and_software"),

      @SerializedName("concrete_work_services")
      CONCRETE_WORK_SERVICES("concrete_work_services"),

      @SerializedName("construction_materials")
      CONSTRUCTION_MATERIALS("construction_materials"),

      @SerializedName("consulting_public_relations")
      CONSULTING_PUBLIC_RELATIONS("consulting_public_relations"),

      @SerializedName("correspondence_schools")
      CORRESPONDENCE_SCHOOLS("correspondence_schools"),

      @SerializedName("cosmetic_stores")
      COSMETIC_STORES("cosmetic_stores"),

      @SerializedName("counseling_services")
      COUNSELING_SERVICES("counseling_services"),

      @SerializedName("country_clubs")
      COUNTRY_CLUBS("country_clubs"),

      @SerializedName("courier_services")
      COURIER_SERVICES("courier_services"),

      @SerializedName("court_costs")
      COURT_COSTS("court_costs"),

      @SerializedName("credit_reporting_agencies")
      CREDIT_REPORTING_AGENCIES("credit_reporting_agencies"),

      @SerializedName("cruise_lines")
      CRUISE_LINES("cruise_lines"),

      @SerializedName("dairy_products_stores")
      DAIRY_PRODUCTS_STORES("dairy_products_stores"),

      @SerializedName("dance_hall_studios_schools")
      DANCE_HALL_STUDIOS_SCHOOLS("dance_hall_studios_schools"),

      @SerializedName("dating_escort_services")
      DATING_ESCORT_SERVICES("dating_escort_services"),

      @SerializedName("dentists_orthodontists")
      DENTISTS_ORTHODONTISTS("dentists_orthodontists"),

      @SerializedName("department_stores")
      DEPARTMENT_STORES("department_stores"),

      @SerializedName("detective_agencies")
      DETECTIVE_AGENCIES("detective_agencies"),

      @SerializedName("digital_goods_applications")
      DIGITAL_GOODS_APPLICATIONS("digital_goods_applications"),

      @SerializedName("digital_goods_games")
      DIGITAL_GOODS_GAMES("digital_goods_games"),

      @SerializedName("digital_goods_large_volume")
      DIGITAL_GOODS_LARGE_VOLUME("digital_goods_large_volume"),

      @SerializedName("digital_goods_media")
      DIGITAL_GOODS_MEDIA("digital_goods_media"),

      @SerializedName("direct_marketing_catalog_merchant")
      DIRECT_MARKETING_CATALOG_MERCHANT("direct_marketing_catalog_merchant"),

      @SerializedName("direct_marketing_combination_catalog_and_retail_merchant")
      DIRECT_MARKETING_COMBINATION_CATALOG_AND_RETAIL_MERCHANT(
          "direct_marketing_combination_catalog_and_retail_merchant"),

      @SerializedName("direct_marketing_inbound_telemarketing")
      DIRECT_MARKETING_INBOUND_TELEMARKETING("direct_marketing_inbound_telemarketing"),

      @SerializedName("direct_marketing_insurance_services")
      DIRECT_MARKETING_INSURANCE_SERVICES("direct_marketing_insurance_services"),

      @SerializedName("direct_marketing_other")
      DIRECT_MARKETING_OTHER("direct_marketing_other"),

      @SerializedName("direct_marketing_outbound_telemarketing")
      DIRECT_MARKETING_OUTBOUND_TELEMARKETING("direct_marketing_outbound_telemarketing"),

      @SerializedName("direct_marketing_subscription")
      DIRECT_MARKETING_SUBSCRIPTION("direct_marketing_subscription"),

      @SerializedName("direct_marketing_travel")
      DIRECT_MARKETING_TRAVEL("direct_marketing_travel"),

      @SerializedName("discount_stores")
      DISCOUNT_STORES("discount_stores"),

      @SerializedName("doctors")
      DOCTORS("doctors"),

      @SerializedName("door_to_door_sales")
      DOOR_TO_DOOR_SALES("door_to_door_sales"),

      @SerializedName("drapery_window_covering_and_upholstery_stores")
      DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY_STORES(
          "drapery_window_covering_and_upholstery_stores"),

      @SerializedName("drinking_places")
      DRINKING_PLACES("drinking_places"),

      @SerializedName("drug_stores_and_pharmacies")
      DRUG_STORES_AND_PHARMACIES("drug_stores_and_pharmacies"),

      @SerializedName("drugs_drug_proprietaries_and_druggist_sundries")
      DRUGS_DRUG_PROPRIETARIES_AND_DRUGGIST_SUNDRIES(
          "drugs_drug_proprietaries_and_druggist_sundries"),

      @SerializedName("dry_cleaners")
      DRY_CLEANERS("dry_cleaners"),

      @SerializedName("durable_goods")
      DURABLE_GOODS("durable_goods"),

      @SerializedName("duty_free_stores")
      DUTY_FREE_STORES("duty_free_stores"),

      @SerializedName("eating_places_restaurants")
      EATING_PLACES_RESTAURANTS("eating_places_restaurants"),

      @SerializedName("educational_services")
      EDUCATIONAL_SERVICES("educational_services"),

      @SerializedName("electric_razor_stores")
      ELECTRIC_RAZOR_STORES("electric_razor_stores"),

      @SerializedName("electric_vehicle_charging")
      ELECTRIC_VEHICLE_CHARGING("electric_vehicle_charging"),

      @SerializedName("electrical_parts_and_equipment")
      ELECTRICAL_PARTS_AND_EQUIPMENT("electrical_parts_and_equipment"),

      @SerializedName("electrical_services")
      ELECTRICAL_SERVICES("electrical_services"),

      @SerializedName("electronics_repair_shops")
      ELECTRONICS_REPAIR_SHOPS("electronics_repair_shops"),

      @SerializedName("electronics_stores")
      ELECTRONICS_STORES("electronics_stores"),

      @SerializedName("elementary_secondary_schools")
      ELEMENTARY_SECONDARY_SCHOOLS("elementary_secondary_schools"),

      @SerializedName("emergency_services_gcas_visa_use_only")
      EMERGENCY_SERVICES_GCAS_VISA_USE_ONLY("emergency_services_gcas_visa_use_only"),

      @SerializedName("employment_temp_agencies")
      EMPLOYMENT_TEMP_AGENCIES("employment_temp_agencies"),

      @SerializedName("equipment_rental")
      EQUIPMENT_RENTAL("equipment_rental"),

      @SerializedName("exterminating_services")
      EXTERMINATING_SERVICES("exterminating_services"),

      @SerializedName("family_clothing_stores")
      FAMILY_CLOTHING_STORES("family_clothing_stores"),

      @SerializedName("fast_food_restaurants")
      FAST_FOOD_RESTAURANTS("fast_food_restaurants"),

      @SerializedName("financial_institutions")
      FINANCIAL_INSTITUTIONS("financial_institutions"),

      @SerializedName("fines_government_administrative_entities")
      FINES_GOVERNMENT_ADMINISTRATIVE_ENTITIES("fines_government_administrative_entities"),

      @SerializedName("fireplace_fireplace_screens_and_accessories_stores")
      FIREPLACE_FIREPLACE_SCREENS_AND_ACCESSORIES_STORES(
          "fireplace_fireplace_screens_and_accessories_stores"),

      @SerializedName("floor_covering_stores")
      FLOOR_COVERING_STORES("floor_covering_stores"),

      @SerializedName("florists")
      FLORISTS("florists"),

      @SerializedName("florists_supplies_nursery_stock_and_flowers")
      FLORISTS_SUPPLIES_NURSERY_STOCK_AND_FLOWERS("florists_supplies_nursery_stock_and_flowers"),

      @SerializedName("freezer_and_locker_meat_provisioners")
      FREEZER_AND_LOCKER_MEAT_PROVISIONERS("freezer_and_locker_meat_provisioners"),

      @SerializedName("fuel_dealers_non_automotive")
      FUEL_DEALERS_NON_AUTOMOTIVE("fuel_dealers_non_automotive"),

      @SerializedName("funeral_services_crematories")
      FUNERAL_SERVICES_CREMATORIES("funeral_services_crematories"),

      @SerializedName("furniture_home_furnishings_and_equipment_stores_except_appliances")
      FURNITURE_HOME_FURNISHINGS_AND_EQUIPMENT_STORES_EXCEPT_APPLIANCES(
          "furniture_home_furnishings_and_equipment_stores_except_appliances"),

      @SerializedName("furniture_repair_refinishing")
      FURNITURE_REPAIR_REFINISHING("furniture_repair_refinishing"),

      @SerializedName("furriers_and_fur_shops")
      FURRIERS_AND_FUR_SHOPS("furriers_and_fur_shops"),

      @SerializedName("general_services")
      GENERAL_SERVICES("general_services"),

      @SerializedName("gift_card_novelty_and_souvenir_shops")
      GIFT_CARD_NOVELTY_AND_SOUVENIR_SHOPS("gift_card_novelty_and_souvenir_shops"),

      @SerializedName("glass_paint_and_wallpaper_stores")
      GLASS_PAINT_AND_WALLPAPER_STORES("glass_paint_and_wallpaper_stores"),

      @SerializedName("glassware_crystal_stores")
      GLASSWARE_CRYSTAL_STORES("glassware_crystal_stores"),

      @SerializedName("golf_courses_public")
      GOLF_COURSES_PUBLIC("golf_courses_public"),

      @SerializedName("government_licensed_horse_dog_racing_us_region_only")
      GOVERNMENT_LICENSED_HORSE_DOG_RACING_US_REGION_ONLY(
          "government_licensed_horse_dog_racing_us_region_only"),

      @SerializedName("government_licensed_online_casions_online_gambling_us_region_only")
      GOVERNMENT_LICENSED_ONLINE_CASIONS_ONLINE_GAMBLING_US_REGION_ONLY(
          "government_licensed_online_casions_online_gambling_us_region_only"),

      @SerializedName("government_owned_lotteries_non_us_region")
      GOVERNMENT_OWNED_LOTTERIES_NON_US_REGION("government_owned_lotteries_non_us_region"),

      @SerializedName("government_owned_lotteries_us_region_only")
      GOVERNMENT_OWNED_LOTTERIES_US_REGION_ONLY("government_owned_lotteries_us_region_only"),

      @SerializedName("government_services")
      GOVERNMENT_SERVICES("government_services"),

      @SerializedName("grocery_stores_supermarkets")
      GROCERY_STORES_SUPERMARKETS("grocery_stores_supermarkets"),

      @SerializedName("hardware_equipment_and_supplies")
      HARDWARE_EQUIPMENT_AND_SUPPLIES("hardware_equipment_and_supplies"),

      @SerializedName("hardware_stores")
      HARDWARE_STORES("hardware_stores"),

      @SerializedName("health_and_beauty_spas")
      HEALTH_AND_BEAUTY_SPAS("health_and_beauty_spas"),

      @SerializedName("hearing_aids_sales_and_supplies")
      HEARING_AIDS_SALES_AND_SUPPLIES("hearing_aids_sales_and_supplies"),

      @SerializedName("heating_plumbing_a_c")
      HEATING_PLUMBING_A_C("heating_plumbing_a_c"),

      @SerializedName("hobby_toy_and_game_shops")
      HOBBY_TOY_AND_GAME_SHOPS("hobby_toy_and_game_shops"),

      @SerializedName("home_supply_warehouse_stores")
      HOME_SUPPLY_WAREHOUSE_STORES("home_supply_warehouse_stores"),

      @SerializedName("hospitals")
      HOSPITALS("hospitals"),

      @SerializedName("hotels_motels_and_resorts")
      HOTELS_MOTELS_AND_RESORTS("hotels_motels_and_resorts"),

      @SerializedName("household_appliance_stores")
      HOUSEHOLD_APPLIANCE_STORES("household_appliance_stores"),

      @SerializedName("industrial_supplies")
      INDUSTRIAL_SUPPLIES("industrial_supplies"),

      @SerializedName("information_retrieval_services")
      INFORMATION_RETRIEVAL_SERVICES("information_retrieval_services"),

      @SerializedName("insurance_default")
      INSURANCE_DEFAULT("insurance_default"),

      @SerializedName("insurance_underwriting_premiums")
      INSURANCE_UNDERWRITING_PREMIUMS("insurance_underwriting_premiums"),

      @SerializedName("intra_company_purchases")
      INTRA_COMPANY_PURCHASES("intra_company_purchases"),

      @SerializedName("jewelry_stores_watches_clocks_and_silverware_stores")
      JEWELRY_STORES_WATCHES_CLOCKS_AND_SILVERWARE_STORES(
          "jewelry_stores_watches_clocks_and_silverware_stores"),

      @SerializedName("landscaping_services")
      LANDSCAPING_SERVICES("landscaping_services"),

      @SerializedName("laundries")
      LAUNDRIES("laundries"),

      @SerializedName("laundry_cleaning_services")
      LAUNDRY_CLEANING_SERVICES("laundry_cleaning_services"),

      @SerializedName("legal_services_attorneys")
      LEGAL_SERVICES_ATTORNEYS("legal_services_attorneys"),

      @SerializedName("luggage_and_leather_goods_stores")
      LUGGAGE_AND_LEATHER_GOODS_STORES("luggage_and_leather_goods_stores"),

      @SerializedName("lumber_building_materials_stores")
      LUMBER_BUILDING_MATERIALS_STORES("lumber_building_materials_stores"),

      @SerializedName("manual_cash_disburse")
      MANUAL_CASH_DISBURSE("manual_cash_disburse"),

      @SerializedName("marinas_service_and_supplies")
      MARINAS_SERVICE_AND_SUPPLIES("marinas_service_and_supplies"),

      @SerializedName("marketplaces")
      MARKETPLACES("marketplaces"),

      @SerializedName("masonry_stonework_and_plaster")
      MASONRY_STONEWORK_AND_PLASTER("masonry_stonework_and_plaster"),

      @SerializedName("massage_parlors")
      MASSAGE_PARLORS("massage_parlors"),

      @SerializedName("medical_and_dental_labs")
      MEDICAL_AND_DENTAL_LABS("medical_and_dental_labs"),

      @SerializedName("medical_dental_ophthalmic_and_hospital_equipment_and_supplies")
      MEDICAL_DENTAL_OPHTHALMIC_AND_HOSPITAL_EQUIPMENT_AND_SUPPLIES(
          "medical_dental_ophthalmic_and_hospital_equipment_and_supplies"),

      @SerializedName("medical_services")
      MEDICAL_SERVICES("medical_services"),

      @SerializedName("membership_organizations")
      MEMBERSHIP_ORGANIZATIONS("membership_organizations"),

      @SerializedName("mens_and_boys_clothing_and_accessories_stores")
      MENS_AND_BOYS_CLOTHING_AND_ACCESSORIES_STORES(
          "mens_and_boys_clothing_and_accessories_stores"),

      @SerializedName("mens_womens_clothing_stores")
      MENS_WOMENS_CLOTHING_STORES("mens_womens_clothing_stores"),

      @SerializedName("metal_service_centers")
      METAL_SERVICE_CENTERS("metal_service_centers"),

      @SerializedName("miscellaneous")
      MISCELLANEOUS("miscellaneous"),

      @SerializedName("miscellaneous_apparel_and_accessory_shops")
      MISCELLANEOUS_APPAREL_AND_ACCESSORY_SHOPS("miscellaneous_apparel_and_accessory_shops"),

      @SerializedName("miscellaneous_auto_dealers")
      MISCELLANEOUS_AUTO_DEALERS("miscellaneous_auto_dealers"),

      @SerializedName("miscellaneous_business_services")
      MISCELLANEOUS_BUSINESS_SERVICES("miscellaneous_business_services"),

      @SerializedName("miscellaneous_food_stores")
      MISCELLANEOUS_FOOD_STORES("miscellaneous_food_stores"),

      @SerializedName("miscellaneous_general_merchandise")
      MISCELLANEOUS_GENERAL_MERCHANDISE("miscellaneous_general_merchandise"),

      @SerializedName("miscellaneous_general_services")
      MISCELLANEOUS_GENERAL_SERVICES("miscellaneous_general_services"),

      @SerializedName("miscellaneous_home_furnishing_specialty_stores")
      MISCELLANEOUS_HOME_FURNISHING_SPECIALTY_STORES(
          "miscellaneous_home_furnishing_specialty_stores"),

      @SerializedName("miscellaneous_publishing_and_printing")
      MISCELLANEOUS_PUBLISHING_AND_PRINTING("miscellaneous_publishing_and_printing"),

      @SerializedName("miscellaneous_recreation_services")
      MISCELLANEOUS_RECREATION_SERVICES("miscellaneous_recreation_services"),

      @SerializedName("miscellaneous_repair_shops")
      MISCELLANEOUS_REPAIR_SHOPS("miscellaneous_repair_shops"),

      @SerializedName("miscellaneous_specialty_retail")
      MISCELLANEOUS_SPECIALTY_RETAIL("miscellaneous_specialty_retail"),

      @SerializedName("mobile_home_dealers")
      MOBILE_HOME_DEALERS("mobile_home_dealers"),

      @SerializedName("motion_picture_theaters")
      MOTION_PICTURE_THEATERS("motion_picture_theaters"),

      @SerializedName("motor_freight_carriers_and_trucking")
      MOTOR_FREIGHT_CARRIERS_AND_TRUCKING("motor_freight_carriers_and_trucking"),

      @SerializedName("motor_homes_dealers")
      MOTOR_HOMES_DEALERS("motor_homes_dealers"),

      @SerializedName("motor_vehicle_supplies_and_new_parts")
      MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS("motor_vehicle_supplies_and_new_parts"),

      @SerializedName("motorcycle_shops_and_dealers")
      MOTORCYCLE_SHOPS_AND_DEALERS("motorcycle_shops_and_dealers"),

      @SerializedName("motorcycle_shops_dealers")
      MOTORCYCLE_SHOPS_DEALERS("motorcycle_shops_dealers"),

      @SerializedName("music_stores_musical_instruments_pianos_and_sheet_music")
      MUSIC_STORES_MUSICAL_INSTRUMENTS_PIANOS_AND_SHEET_MUSIC(
          "music_stores_musical_instruments_pianos_and_sheet_music"),

      @SerializedName("news_dealers_and_newsstands")
      NEWS_DEALERS_AND_NEWSSTANDS("news_dealers_and_newsstands"),

      @SerializedName("non_fi_money_orders")
      NON_FI_MONEY_ORDERS("non_fi_money_orders"),

      @SerializedName("non_fi_stored_value_card_purchase_load")
      NON_FI_STORED_VALUE_CARD_PURCHASE_LOAD("non_fi_stored_value_card_purchase_load"),

      @SerializedName("nondurable_goods")
      NONDURABLE_GOODS("nondurable_goods"),

      @SerializedName("nurseries_lawn_and_garden_supply_stores")
      NURSERIES_LAWN_AND_GARDEN_SUPPLY_STORES("nurseries_lawn_and_garden_supply_stores"),

      @SerializedName("nursing_personal_care")
      NURSING_PERSONAL_CARE("nursing_personal_care"),

      @SerializedName("office_and_commercial_furniture")
      OFFICE_AND_COMMERCIAL_FURNITURE("office_and_commercial_furniture"),

      @SerializedName("opticians_eyeglasses")
      OPTICIANS_EYEGLASSES("opticians_eyeglasses"),

      @SerializedName("optometrists_ophthalmologist")
      OPTOMETRISTS_OPHTHALMOLOGIST("optometrists_ophthalmologist"),

      @SerializedName("orthopedic_goods_prosthetic_devices")
      ORTHOPEDIC_GOODS_PROSTHETIC_DEVICES("orthopedic_goods_prosthetic_devices"),

      @SerializedName("osteopaths")
      OSTEOPATHS("osteopaths"),

      @SerializedName("package_stores_beer_wine_and_liquor")
      PACKAGE_STORES_BEER_WINE_AND_LIQUOR("package_stores_beer_wine_and_liquor"),

      @SerializedName("paints_varnishes_and_supplies")
      PAINTS_VARNISHES_AND_SUPPLIES("paints_varnishes_and_supplies"),

      @SerializedName("parking_lots_garages")
      PARKING_LOTS_GARAGES("parking_lots_garages"),

      @SerializedName("passenger_railways")
      PASSENGER_RAILWAYS("passenger_railways"),

      @SerializedName("pawn_shops")
      PAWN_SHOPS("pawn_shops"),

      @SerializedName("pet_shops_pet_food_and_supplies")
      PET_SHOPS_PET_FOOD_AND_SUPPLIES("pet_shops_pet_food_and_supplies"),

      @SerializedName("petroleum_and_petroleum_products")
      PETROLEUM_AND_PETROLEUM_PRODUCTS("petroleum_and_petroleum_products"),

      @SerializedName("photo_developing")
      PHOTO_DEVELOPING("photo_developing"),

      @SerializedName("photographic_photocopy_microfilm_equipment_and_supplies")
      PHOTOGRAPHIC_PHOTOCOPY_MICROFILM_EQUIPMENT_AND_SUPPLIES(
          "photographic_photocopy_microfilm_equipment_and_supplies"),

      @SerializedName("photographic_studios")
      PHOTOGRAPHIC_STUDIOS("photographic_studios"),

      @SerializedName("picture_video_production")
      PICTURE_VIDEO_PRODUCTION("picture_video_production"),

      @SerializedName("piece_goods_notions_and_other_dry_goods")
      PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS("piece_goods_notions_and_other_dry_goods"),

      @SerializedName("plumbing_heating_equipment_and_supplies")
      PLUMBING_HEATING_EQUIPMENT_AND_SUPPLIES("plumbing_heating_equipment_and_supplies"),

      @SerializedName("political_organizations")
      POLITICAL_ORGANIZATIONS("political_organizations"),

      @SerializedName("postal_services_government_only")
      POSTAL_SERVICES_GOVERNMENT_ONLY("postal_services_government_only"),

      @SerializedName("precious_stones_and_metals_watches_and_jewelry")
      PRECIOUS_STONES_AND_METALS_WATCHES_AND_JEWELRY(
          "precious_stones_and_metals_watches_and_jewelry"),

      @SerializedName("professional_services")
      PROFESSIONAL_SERVICES("professional_services"),

      @SerializedName("public_warehousing_and_storage")
      PUBLIC_WAREHOUSING_AND_STORAGE("public_warehousing_and_storage"),

      @SerializedName("quick_copy_repro_and_blueprint")
      QUICK_COPY_REPRO_AND_BLUEPRINT("quick_copy_repro_and_blueprint"),

      @SerializedName("railroads")
      RAILROADS("railroads"),

      @SerializedName("real_estate_agents_and_managers_rentals")
      REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS("real_estate_agents_and_managers_rentals"),

      @SerializedName("record_stores")
      RECORD_STORES("record_stores"),

      @SerializedName("recreational_vehicle_rentals")
      RECREATIONAL_VEHICLE_RENTALS("recreational_vehicle_rentals"),

      @SerializedName("religious_goods_stores")
      RELIGIOUS_GOODS_STORES("religious_goods_stores"),

      @SerializedName("religious_organizations")
      RELIGIOUS_ORGANIZATIONS("religious_organizations"),

      @SerializedName("roofing_siding_sheet_metal")
      ROOFING_SIDING_SHEET_METAL("roofing_siding_sheet_metal"),

      @SerializedName("secretarial_support_services")
      SECRETARIAL_SUPPORT_SERVICES("secretarial_support_services"),

      @SerializedName("security_brokers_dealers")
      SECURITY_BROKERS_DEALERS("security_brokers_dealers"),

      @SerializedName("service_stations")
      SERVICE_STATIONS("service_stations"),

      @SerializedName("sewing_needlework_fabric_and_piece_goods_stores")
      SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES(
          "sewing_needlework_fabric_and_piece_goods_stores"),

      @SerializedName("shoe_repair_hat_cleaning")
      SHOE_REPAIR_HAT_CLEANING("shoe_repair_hat_cleaning"),

      @SerializedName("shoe_stores")
      SHOE_STORES("shoe_stores"),

      @SerializedName("small_appliance_repair")
      SMALL_APPLIANCE_REPAIR("small_appliance_repair"),

      @SerializedName("snowmobile_dealers")
      SNOWMOBILE_DEALERS("snowmobile_dealers"),

      @SerializedName("special_trade_services")
      SPECIAL_TRADE_SERVICES("special_trade_services"),

      @SerializedName("specialty_cleaning")
      SPECIALTY_CLEANING("specialty_cleaning"),

      @SerializedName("sporting_goods_stores")
      SPORTING_GOODS_STORES("sporting_goods_stores"),

      @SerializedName("sporting_recreation_camps")
      SPORTING_RECREATION_CAMPS("sporting_recreation_camps"),

      @SerializedName("sports_and_riding_apparel_stores")
      SPORTS_AND_RIDING_APPAREL_STORES("sports_and_riding_apparel_stores"),

      @SerializedName("sports_clubs_fields")
      SPORTS_CLUBS_FIELDS("sports_clubs_fields"),

      @SerializedName("stamp_and_coin_stores")
      STAMP_AND_COIN_STORES("stamp_and_coin_stores"),

      @SerializedName("stationary_office_supplies_printing_and_writing_paper")
      STATIONARY_OFFICE_SUPPLIES_PRINTING_AND_WRITING_PAPER(
          "stationary_office_supplies_printing_and_writing_paper"),

      @SerializedName("stationery_stores_office_and_school_supply_stores")
      STATIONERY_STORES_OFFICE_AND_SCHOOL_SUPPLY_STORES(
          "stationery_stores_office_and_school_supply_stores"),

      @SerializedName("swimming_pools_sales")
      SWIMMING_POOLS_SALES("swimming_pools_sales"),

      @SerializedName("t_ui_travel_germany")
      T_UI_TRAVEL_GERMANY("t_ui_travel_germany"),

      @SerializedName("tailors_alterations")
      TAILORS_ALTERATIONS("tailors_alterations"),

      @SerializedName("tax_payments_government_agencies")
      TAX_PAYMENTS_GOVERNMENT_AGENCIES("tax_payments_government_agencies"),

      @SerializedName("tax_preparation_services")
      TAX_PREPARATION_SERVICES("tax_preparation_services"),

      @SerializedName("taxicabs_limousines")
      TAXICABS_LIMOUSINES("taxicabs_limousines"),

      @SerializedName("telecommunication_equipment_and_telephone_sales")
      TELECOMMUNICATION_EQUIPMENT_AND_TELEPHONE_SALES(
          "telecommunication_equipment_and_telephone_sales"),

      @SerializedName("telecommunication_services")
      TELECOMMUNICATION_SERVICES("telecommunication_services"),

      @SerializedName("telegraph_services")
      TELEGRAPH_SERVICES("telegraph_services"),

      @SerializedName("tent_and_awning_shops")
      TENT_AND_AWNING_SHOPS("tent_and_awning_shops"),

      @SerializedName("testing_laboratories")
      TESTING_LABORATORIES("testing_laboratories"),

      @SerializedName("theatrical_ticket_agencies")
      THEATRICAL_TICKET_AGENCIES("theatrical_ticket_agencies"),

      @SerializedName("timeshares")
      TIMESHARES("timeshares"),

      @SerializedName("tire_retreading_and_repair")
      TIRE_RETREADING_AND_REPAIR("tire_retreading_and_repair"),

      @SerializedName("tolls_bridge_fees")
      TOLLS_BRIDGE_FEES("tolls_bridge_fees"),

      @SerializedName("tourist_attractions_and_exhibits")
      TOURIST_ATTRACTIONS_AND_EXHIBITS("tourist_attractions_and_exhibits"),

      @SerializedName("towing_services")
      TOWING_SERVICES("towing_services"),

      @SerializedName("trailer_parks_campgrounds")
      TRAILER_PARKS_CAMPGROUNDS("trailer_parks_campgrounds"),

      @SerializedName("transportation_services")
      TRANSPORTATION_SERVICES("transportation_services"),

      @SerializedName("travel_agencies_tour_operators")
      TRAVEL_AGENCIES_TOUR_OPERATORS("travel_agencies_tour_operators"),

      @SerializedName("truck_stop_iteration")
      TRUCK_STOP_ITERATION("truck_stop_iteration"),

      @SerializedName("truck_utility_trailer_rentals")
      TRUCK_UTILITY_TRAILER_RENTALS("truck_utility_trailer_rentals"),

      @SerializedName("typesetting_plate_making_and_related_services")
      TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES(
          "typesetting_plate_making_and_related_services"),

      @SerializedName("typewriter_stores")
      TYPEWRITER_STORES("typewriter_stores"),

      @SerializedName("u_s_federal_government_agencies_or_departments")
      U_S_FEDERAL_GOVERNMENT_AGENCIES_OR_DEPARTMENTS(
          "u_s_federal_government_agencies_or_departments"),

      @SerializedName("uniforms_commercial_clothing")
      UNIFORMS_COMMERCIAL_CLOTHING("uniforms_commercial_clothing"),

      @SerializedName("used_merchandise_and_secondhand_stores")
      USED_MERCHANDISE_AND_SECONDHAND_STORES("used_merchandise_and_secondhand_stores"),

      @SerializedName("utilities")
      UTILITIES("utilities"),

      @SerializedName("variety_stores")
      VARIETY_STORES("variety_stores"),

      @SerializedName("veterinary_services")
      VETERINARY_SERVICES("veterinary_services"),

      @SerializedName("video_amusement_game_supplies")
      VIDEO_AMUSEMENT_GAME_SUPPLIES("video_amusement_game_supplies"),

      @SerializedName("video_game_arcades")
      VIDEO_GAME_ARCADES("video_game_arcades"),

      @SerializedName("video_tape_rental_stores")
      VIDEO_TAPE_RENTAL_STORES("video_tape_rental_stores"),

      @SerializedName("vocational_trade_schools")
      VOCATIONAL_TRADE_SCHOOLS("vocational_trade_schools"),

      @SerializedName("watch_jewelry_repair")
      WATCH_JEWELRY_REPAIR("watch_jewelry_repair"),

      @SerializedName("welding_repair")
      WELDING_REPAIR("welding_repair"),

      @SerializedName("wholesale_clubs")
      WHOLESALE_CLUBS("wholesale_clubs"),

      @SerializedName("wig_and_toupee_stores")
      WIG_AND_TOUPEE_STORES("wig_and_toupee_stores"),

      @SerializedName("wires_money_orders")
      WIRES_MONEY_ORDERS("wires_money_orders"),

      @SerializedName("womens_accessory_and_specialty_shops")
      WOMENS_ACCESSORY_AND_SPECIALTY_SHOPS("womens_accessory_and_specialty_shops"),

      @SerializedName("womens_ready_to_wear_stores")
      WOMENS_READY_TO_WEAR_STORES("womens_ready_to_wear_stores"),

      @SerializedName("wrecking_and_salvage_yards")
      WRECKING_AND_SALVAGE_YARDS("wrecking_and_salvage_yards");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BlockedCategory(String value) {
        this.value = value;
      }
    }
  }

  public enum ReplacementReason implements ApiRequestParams.EnumParam {
    @SerializedName("damaged")
    DAMAGED("damaged"),

    @SerializedName("expired")
    EXPIRED("expired"),

    @SerializedName("lost")
    LOST("lost"),

    @SerializedName("stolen")
    STOLEN("stolen");

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

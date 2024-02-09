// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CustomerUpdatePaymentSourceParams extends ApiRequestParams {
  /** The name of the person or business that owns the bank account. */
  @SerializedName("account_holder_name")
  Object accountHolderName;

  /**
   * The type of entity that holds the account. This can be either {@code individual} or {@code
   * company}.
   */
  @SerializedName("account_holder_type")
  AccountHolderType accountHolderType;

  /** City/District/Suburb/Town/Village. */
  @SerializedName("address_city")
  Object addressCity;

  /** Billing address country, if provided when creating card. */
  @SerializedName("address_country")
  Object addressCountry;

  /** Address line 1 (Street address/PO Box/Company name). */
  @SerializedName("address_line1")
  Object addressLine1;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  @SerializedName("address_line2")
  Object addressLine2;

  /** State/County/Province/Region. */
  @SerializedName("address_state")
  Object addressState;

  /** ZIP or postal code. */
  @SerializedName("address_zip")
  Object addressZip;

  /** Two digit number representing the card’s expiration month. */
  @SerializedName("exp_month")
  Object expMonth;

  /** Four digit number representing the card’s expiration year. */
  @SerializedName("exp_year")
  Object expYear;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Cardholder name. */
  @SerializedName("name")
  Object name;

  @SerializedName("owner")
  Owner owner;

  private CustomerUpdatePaymentSourceParams(
      Object accountHolderName,
      AccountHolderType accountHolderType,
      Object addressCity,
      Object addressCountry,
      Object addressLine1,
      Object addressLine2,
      Object addressState,
      Object addressZip,
      Object expMonth,
      Object expYear,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Object name,
      Owner owner) {
    this.accountHolderName = accountHolderName;
    this.accountHolderType = accountHolderType;
    this.addressCity = addressCity;
    this.addressCountry = addressCountry;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.addressState = addressState;
    this.addressZip = addressZip;
    this.expMonth = expMonth;
    this.expYear = expYear;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.name = name;
    this.owner = owner;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountHolderName;

    private AccountHolderType accountHolderType;

    private Object addressCity;

    private Object addressCountry;

    private Object addressLine1;

    private Object addressLine2;

    private Object addressState;

    private Object addressZip;

    private Object expMonth;

    private Object expYear;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Object name;

    private Owner owner;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerUpdatePaymentSourceParams build() {
      return new CustomerUpdatePaymentSourceParams(
          this.accountHolderName,
          this.accountHolderType,
          this.addressCity,
          this.addressCountry,
          this.addressLine1,
          this.addressLine2,
          this.addressState,
          this.addressZip,
          this.expMonth,
          this.expYear,
          this.expand,
          this.extraParams,
          this.metadata,
          this.name,
          this.owner);
    }

    /** The name of the person or business that owns the bank account. */
    public Builder setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
      return this;
    }

    /** The name of the person or business that owns the bank account. */
    public Builder setAccountHolderName(EmptyParam accountHolderName) {
      this.accountHolderName = accountHolderName;
      return this;
    }

    /**
     * The type of entity that holds the account. This can be either {@code individual} or {@code
     * company}.
     */
    public Builder setAccountHolderType(
        CustomerUpdatePaymentSourceParams.AccountHolderType accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /** City/District/Suburb/Town/Village. */
    public Builder setAddressCity(String addressCity) {
      this.addressCity = addressCity;
      return this;
    }

    /** City/District/Suburb/Town/Village. */
    public Builder setAddressCity(EmptyParam addressCity) {
      this.addressCity = addressCity;
      return this;
    }

    /** Billing address country, if provided when creating card. */
    public Builder setAddressCountry(String addressCountry) {
      this.addressCountry = addressCountry;
      return this;
    }

    /** Billing address country, if provided when creating card. */
    public Builder setAddressCountry(EmptyParam addressCountry) {
      this.addressCountry = addressCountry;
      return this;
    }

    /** Address line 1 (Street address/PO Box/Company name). */
    public Builder setAddressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    /** Address line 1 (Street address/PO Box/Company name). */
    public Builder setAddressLine1(EmptyParam addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    /** Address line 2 (Apartment/Suite/Unit/Building). */
    public Builder setAddressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /** Address line 2 (Apartment/Suite/Unit/Building). */
    public Builder setAddressLine2(EmptyParam addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /** State/County/Province/Region. */
    public Builder setAddressState(String addressState) {
      this.addressState = addressState;
      return this;
    }

    /** State/County/Province/Region. */
    public Builder setAddressState(EmptyParam addressState) {
      this.addressState = addressState;
      return this;
    }

    /** ZIP or postal code. */
    public Builder setAddressZip(String addressZip) {
      this.addressZip = addressZip;
      return this;
    }

    /** ZIP or postal code. */
    public Builder setAddressZip(EmptyParam addressZip) {
      this.addressZip = addressZip;
      return this;
    }

    /** Two digit number representing the card’s expiration month. */
    public Builder setExpMonth(String expMonth) {
      this.expMonth = expMonth;
      return this;
    }

    /** Two digit number representing the card’s expiration month. */
    public Builder setExpMonth(EmptyParam expMonth) {
      this.expMonth = expMonth;
      return this;
    }

    /** Four digit number representing the card’s expiration year. */
    public Builder setExpYear(String expYear) {
      this.expYear = expYear;
      return this;
    }

    /** Four digit number representing the card’s expiration year. */
    public Builder setExpYear(EmptyParam expYear) {
      this.expYear = expYear;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerUpdatePaymentSourceParams#expand} for the field documentation.
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
     * CustomerUpdatePaymentSourceParams#expand} for the field documentation.
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
     * CustomerUpdatePaymentSourceParams#extraParams} for the field documentation.
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
     * See {@link CustomerUpdatePaymentSourceParams#extraParams} for the field documentation.
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
     * CustomerUpdatePaymentSourceParams#metadata} for the field documentation.
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
     * See {@link CustomerUpdatePaymentSourceParams#metadata} for the field documentation.
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

    /** Cardholder name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Cardholder name. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    public Builder setOwner(CustomerUpdatePaymentSourceParams.Owner owner) {
      this.owner = owner;
      return this;
    }
  }

  @Getter
  public static class Owner {
    /** Owner's address. */
    @SerializedName("address")
    Address address;

    /** Owner's email address. */
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

    /** Owner's full name. */
    @SerializedName("name")
    Object name;

    /** Owner's phone number. */
    @SerializedName("phone")
    Object phone;

    private Owner(
        Address address, Object email, Map<String, Object> extraParams, Object name, Object phone) {
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
      private Address address;

      private Object email;

      private Map<String, Object> extraParams;

      private Object name;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerUpdatePaymentSourceParams.Owner build() {
        return new CustomerUpdatePaymentSourceParams.Owner(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Owner's address. */
      public Builder setAddress(CustomerUpdatePaymentSourceParams.Owner.Address address) {
        this.address = address;
        return this;
      }

      /** Owner's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /** Owner's email address. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerUpdatePaymentSourceParams.Owner#extraParams} for the field documentation.
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
       * See {@link CustomerUpdatePaymentSourceParams.Owner#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Owner's full name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Owner's full name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** Owner's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Owner's phone number. */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
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
        public CustomerUpdatePaymentSourceParams.Owner.Address build() {
          return new CustomerUpdatePaymentSourceParams.Owner.Address(
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
         * map. See {@link CustomerUpdatePaymentSourceParams.Owner.Address#extraParams} for the
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
         * map. See {@link CustomerUpdatePaymentSourceParams.Owner.Address#extraParams} for the
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
}

// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CardholderUpdateParams extends ApiRequestParams {
  /** The cardholder's billing address. */
  @SerializedName("billing")
  Billing billing;

  /** Additional information about a {@code company} cardholder. */
  @SerializedName("company")
  Company company;

  /** The cardholder's email address. */
  @SerializedName("email")
  Object email;

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

  /** Additional information about an {@code individual} cardholder. */
  @SerializedName("individual")
  Individual individual;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The cardholder's phone number. This is required for all cardholders who will be creating EU
   * cards. See the <a href="https://stripe.com/docs/issuing/3d-secure">3D Secure documentation</a>
   * for more details.
   */
  @SerializedName("phone_number")
  Object phoneNumber;

  /**
   * Rules that control spending across this cardholder's cards. Refer to our <a
   * href="https://stripe.com/docs/issuing/controls/spending-controls">documentation</a> for more
   * details.
   */
  @SerializedName("spending_controls")
  SpendingControls spendingControls;

  /** Specifies whether to permit authorizations on this cardholder's cards. */
  @SerializedName("status")
  Status status;

  private CardholderUpdateParams(
      Billing billing,
      Company company,
      Object email,
      List<String> expand,
      Map<String, Object> extraParams,
      Individual individual,
      Map<String, String> metadata,
      Object phoneNumber,
      SpendingControls spendingControls,
      Status status) {
    this.billing = billing;
    this.company = company;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.individual = individual;
    this.metadata = metadata;
    this.phoneNumber = phoneNumber;
    this.spendingControls = spendingControls;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Billing billing;

    private Company company;

    private Object email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Individual individual;

    private Map<String, String> metadata;

    private Object phoneNumber;

    private SpendingControls spendingControls;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public CardholderUpdateParams build() {
      return new CardholderUpdateParams(
          this.billing,
          this.company,
          this.email,
          this.expand,
          this.extraParams,
          this.individual,
          this.metadata,
          this.phoneNumber,
          this.spendingControls,
          this.status);
    }

    /** The cardholder's billing address. */
    public Builder setBilling(Billing billing) {
      this.billing = billing;
      return this;
    }

    /** Additional information about a {@code company} cardholder. */
    public Builder setCompany(Company company) {
      this.company = company;
      return this;
    }

    /** The cardholder's email address. */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /** The cardholder's email address. */
    public Builder setEmail(EmptyParam email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardholderUpdateParams#expand} for the field documentation.
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
     * CardholderUpdateParams#expand} for the field documentation.
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
     * CardholderUpdateParams#extraParams} for the field documentation.
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
     * See {@link CardholderUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Additional information about an {@code individual} cardholder. */
    public Builder setIndividual(Individual individual) {
      this.individual = individual;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CardholderUpdateParams#metadata} for the field documentation.
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
     * See {@link CardholderUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The cardholder's phone number. This is required for all cardholders who will be creating EU
     * cards. See the <a href="https://stripe.com/docs/issuing/3d-secure">3D Secure
     * documentation</a> for more details.
     */
    public Builder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * The cardholder's phone number. This is required for all cardholders who will be creating EU
     * cards. See the <a href="https://stripe.com/docs/issuing/3d-secure">3D Secure
     * documentation</a> for more details.
     */
    public Builder setPhoneNumber(EmptyParam phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * Rules that control spending across this cardholder's cards. Refer to our <a
     * href="https://stripe.com/docs/issuing/controls/spending-controls">documentation</a> for more
     * details.
     */
    public Builder setSpendingControls(SpendingControls spendingControls) {
      this.spendingControls = spendingControls;
      return this;
    }

    /** Specifies whether to permit authorizations on this cardholder's cards. */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  public static class Billing {
    /** The cardholder’s billing address. */
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

    private Billing(Address address, Map<String, Object> extraParams) {
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
      public Billing build() {
        return new Billing(this.address, this.extraParams);
      }

      /** The cardholder’s billing address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardholderUpdateParams.Billing#extraParams} for the field documentation.
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
       * See {@link CardholderUpdateParams.Billing#extraParams} for the field documentation.
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
         * map. See {@link CardholderUpdateParams.Billing.Address#extraParams} for the field
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
         * map. See {@link CardholderUpdateParams.Billing.Address#extraParams} for the field
         * documentation.
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
  public static class Company {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The entity's business ID number. */
    @SerializedName("tax_id")
    Object taxId;

    private Company(Map<String, Object> extraParams, Object taxId) {
      this.extraParams = extraParams;
      this.taxId = taxId;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object taxId;

      /** Finalize and obtain parameter instance from this builder. */
      public Company build() {
        return new Company(this.extraParams, this.taxId);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardholderUpdateParams.Company#extraParams} for the field documentation.
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
       * See {@link CardholderUpdateParams.Company#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The entity's business ID number. */
      public Builder setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
      }

      /** The entity's business ID number. */
      public Builder setTaxId(EmptyParam taxId) {
        this.taxId = taxId;
        return this;
      }
    }
  }

  @Getter
  public static class Individual {
    /** The date of birth of this cardholder. */
    @SerializedName("dob")
    Dob dob;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The first name of this cardholder. */
    @SerializedName("first_name")
    Object firstName;

    /** The last name of this cardholder. */
    @SerializedName("last_name")
    Object lastName;

    /** Government-issued ID document for this cardholder. */
    @SerializedName("verification")
    Verification verification;

    private Individual(
        Dob dob,
        Map<String, Object> extraParams,
        Object firstName,
        Object lastName,
        Verification verification) {
      this.dob = dob;
      this.extraParams = extraParams;
      this.firstName = firstName;
      this.lastName = lastName;
      this.verification = verification;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Dob dob;

      private Map<String, Object> extraParams;

      private Object firstName;

      private Object lastName;

      private Verification verification;

      /** Finalize and obtain parameter instance from this builder. */
      public Individual build() {
        return new Individual(
            this.dob, this.extraParams, this.firstName, this.lastName, this.verification);
      }

      /** The date of birth of this cardholder. */
      public Builder setDob(Dob dob) {
        this.dob = dob;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardholderUpdateParams.Individual#extraParams} for the field documentation.
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
       * See {@link CardholderUpdateParams.Individual#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The first name of this cardholder. */
      public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
      }

      /** The first name of this cardholder. */
      public Builder setFirstName(EmptyParam firstName) {
        this.firstName = firstName;
        return this;
      }

      /** The last name of this cardholder. */
      public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
      }

      /** The last name of this cardholder. */
      public Builder setLastName(EmptyParam lastName) {
        this.lastName = lastName;
        return this;
      }

      /** Government-issued ID document for this cardholder. */
      public Builder setVerification(Verification verification) {
        this.verification = verification;
        return this;
      }
    }

    @Getter
    public static class Dob {
      /** The day of birth, between 1 and 31. */
      @SerializedName("day")
      Long day;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The month of birth, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year of birth. */
      @SerializedName("year")
      Long year;

      private Dob(Long day, Map<String, Object> extraParams, Long month, Long year) {
        this.day = day;
        this.extraParams = extraParams;
        this.month = month;
        this.year = year;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long day;

        private Map<String, Object> extraParams;

        private Long month;

        private Long year;

        /** Finalize and obtain parameter instance from this builder. */
        public Dob build() {
          return new Dob(this.day, this.extraParams, this.month, this.year);
        }

        /** The day of birth, between 1 and 31. */
        public Builder setDay(Long day) {
          this.day = day;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardholderUpdateParams.Individual.Dob#extraParams} for the field
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
         * map. See {@link CardholderUpdateParams.Individual.Dob#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The month of birth, between 1 and 12. */
        public Builder setMonth(Long month) {
          this.month = month;
          return this;
        }

        /** The four-digit year of birth. */
        public Builder setYear(Long year) {
          this.year = year;
          return this;
        }
      }
    }

    @Getter
    public static class Verification {
      /** An identifying document, either a passport or local ID card. */
      @SerializedName("document")
      Document document;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Verification(Document document, Map<String, Object> extraParams) {
        this.document = document;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Document document;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public Verification build() {
          return new Verification(this.document, this.extraParams);
        }

        /** An identifying document, either a passport or local ID card. */
        public Builder setDocument(Document document) {
          this.document = document;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardholderUpdateParams.Individual.Verification#extraParams} for the field
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
         * map. See {@link CardholderUpdateParams.Individual.Verification#extraParams} for the field
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

      @Getter
      public static class Document {
        /**
         * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}.
         */
        @SerializedName("back")
        Object back;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
         * upload</a> with a {@code purpose} value of {@code identity_document}.
         */
        @SerializedName("front")
        Object front;

        private Document(Object back, Map<String, Object> extraParams, Object front) {
          this.back = back;
          this.extraParams = extraParams;
          this.front = front;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object back;

          private Map<String, Object> extraParams;

          private Object front;

          /** Finalize and obtain parameter instance from this builder. */
          public Document build() {
            return new Document(this.back, this.extraParams, this.front);
          }

          /**
           * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}.
           */
          public Builder setBack(String back) {
            this.back = back;
            return this;
          }

          /**
           * The back of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}.
           */
          public Builder setBack(EmptyParam back) {
            this.back = back;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link CardholderUpdateParams.Individual.Verification.Document#extraParams}
           * for the field documentation.
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
           * map. See {@link CardholderUpdateParams.Individual.Verification.Document#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}.
           */
          public Builder setFront(String front) {
            this.front = front;
            return this;
          }

          /**
           * The front of an ID returned by a <a href="https://stripe.com/docs/api#create_file">file
           * upload</a> with a {@code purpose} value of {@code identity_document}.
           */
          public Builder setFront(EmptyParam front) {
            this.front = front;
            return this;
          }
        }
      }
    }
  }

  @Getter
  public static class SpendingControls {
    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to allow. All other categories will be blocked. Cannot be set with {@code
     * blocked_categories}.
     */
    @SerializedName("allowed_categories")
    List<AllowedCategory> allowedCategories;

    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to decline. All other categories will be allowed. Cannot be set with {@code
     * allowed_categories}.
     */
    @SerializedName("blocked_categories")
    List<BlockedCategory> blockedCategories;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Limit spending with amount-based rules that apply across this cardholder's cards. */
    @SerializedName("spending_limits")
    List<SpendingLimit> spendingLimits;

    /**
     * Currency of amounts within {@code spending_limits}. Defaults to your merchant country's
     * currency.
     */
    @SerializedName("spending_limits_currency")
    Object spendingLimitsCurrency;

    private SpendingControls(
        List<AllowedCategory> allowedCategories,
        List<BlockedCategory> blockedCategories,
        Map<String, Object> extraParams,
        List<SpendingLimit> spendingLimits,
        Object spendingLimitsCurrency) {
      this.allowedCategories = allowedCategories;
      this.blockedCategories = blockedCategories;
      this.extraParams = extraParams;
      this.spendingLimits = spendingLimits;
      this.spendingLimitsCurrency = spendingLimitsCurrency;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<AllowedCategory> allowedCategories;

      private List<BlockedCategory> blockedCategories;

      private Map<String, Object> extraParams;

      private List<SpendingLimit> spendingLimits;

      private Object spendingLimitsCurrency;

      /** Finalize and obtain parameter instance from this builder. */
      public SpendingControls build() {
        return new SpendingControls(
            this.allowedCategories,
            this.blockedCategories,
            this.extraParams,
            this.spendingLimits,
            this.spendingLimitsCurrency);
      }

      /**
       * Add an element to `allowedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardholderUpdateParams.SpendingControls#allowedCategories} for the field
       * documentation.
       */
      public Builder addAllowedCategory(AllowedCategory element) {
        if (this.allowedCategories == null) {
          this.allowedCategories = new ArrayList<>();
        }
        this.allowedCategories.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardholderUpdateParams.SpendingControls#allowedCategories} for the field
       * documentation.
       */
      public Builder addAllAllowedCategory(List<AllowedCategory> elements) {
        if (this.allowedCategories == null) {
          this.allowedCategories = new ArrayList<>();
        }
        this.allowedCategories.addAll(elements);
        return this;
      }

      /**
       * Add an element to `blockedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardholderUpdateParams.SpendingControls#blockedCategories} for the field
       * documentation.
       */
      public Builder addBlockedCategory(BlockedCategory element) {
        if (this.blockedCategories == null) {
          this.blockedCategories = new ArrayList<>();
        }
        this.blockedCategories.add(element);
        return this;
      }

      /**
       * Add all elements to `blockedCategories` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link CardholderUpdateParams.SpendingControls#blockedCategories} for the field
       * documentation.
       */
      public Builder addAllBlockedCategory(List<BlockedCategory> elements) {
        if (this.blockedCategories == null) {
          this.blockedCategories = new ArrayList<>();
        }
        this.blockedCategories.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardholderUpdateParams.SpendingControls#extraParams} for the field documentation.
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
       * See {@link CardholderUpdateParams.SpendingControls#extraParams} for the field
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
       * Add an element to `spendingLimits` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CardholderUpdateParams.SpendingControls#spendingLimits} for the field documentation.
       */
      public Builder addSpendingLimit(SpendingLimit element) {
        if (this.spendingLimits == null) {
          this.spendingLimits = new ArrayList<>();
        }
        this.spendingLimits.add(element);
        return this;
      }

      /**
       * Add all elements to `spendingLimits` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CardholderUpdateParams.SpendingControls#spendingLimits} for the field documentation.
       */
      public Builder addAllSpendingLimit(List<SpendingLimit> elements) {
        if (this.spendingLimits == null) {
          this.spendingLimits = new ArrayList<>();
        }
        this.spendingLimits.addAll(elements);
        return this;
      }

      /**
       * Currency of amounts within {@code spending_limits}. Defaults to your merchant country's
       * currency.
       */
      public Builder setSpendingLimitsCurrency(String spendingLimitsCurrency) {
        this.spendingLimitsCurrency = spendingLimitsCurrency;
        return this;
      }

      /**
       * Currency of amounts within {@code spending_limits}. Defaults to your merchant country's
       * currency.
       */
      public Builder setSpendingLimitsCurrency(EmptyParam spendingLimitsCurrency) {
        this.spendingLimitsCurrency = spendingLimitsCurrency;
        return this;
      }
    }

    @Getter
    public static class SpendingLimit {
      /** Maximum amount allowed to spend per interval. */
      @SerializedName("amount")
      Long amount;

      /**
       * Array of strings containing <a
       * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
       * this limit applies to. Omitting this field will apply the limit to all categories.
       */
      @SerializedName("categories")
      List<Category> categories;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Interval (or event) to which the amount applies. */
      @SerializedName("interval")
      Interval interval;

      private SpendingLimit(
          Long amount,
          List<Category> categories,
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

        private List<Category> categories;

        private Map<String, Object> extraParams;

        private Interval interval;

        /** Finalize and obtain parameter instance from this builder. */
        public SpendingLimit build() {
          return new SpendingLimit(this.amount, this.categories, this.extraParams, this.interval);
        }

        /** Maximum amount allowed to spend per interval. */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * Add an element to `categories` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * CardholderUpdateParams.SpendingControls.SpendingLimit#categories} for the field
         * documentation.
         */
        public Builder addCategory(Category element) {
          if (this.categories == null) {
            this.categories = new ArrayList<>();
          }
          this.categories.add(element);
          return this;
        }

        /**
         * Add all elements to `categories` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * CardholderUpdateParams.SpendingControls.SpendingLimit#categories} for the field
         * documentation.
         */
        public Builder addAllCategory(List<Category> elements) {
          if (this.categories == null) {
            this.categories = new ArrayList<>();
          }
          this.categories.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CardholderUpdateParams.SpendingControls.SpendingLimit#extraParams} for
         * the field documentation.
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
         * map. See {@link CardholderUpdateParams.SpendingControls.SpendingLimit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Interval (or event) to which the amount applies. */
        public Builder setInterval(Interval interval) {
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
}

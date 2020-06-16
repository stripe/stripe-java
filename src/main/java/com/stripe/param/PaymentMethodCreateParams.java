package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentMethodCreateParams extends ApiRequestParams {
  /**
   * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the bank
   * account.
   */
  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  /**
   * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs Direct
   * Debit bank account.
   */
  @SerializedName("bacs_debit")
  BacsDebit bacsDebit;

  /**
   * If this is a {@code bancontact} PaymentMethod, this hash contains details about the Bancontact
   * payment method.
   */
  @SerializedName("bancontact")
  Bancontact bancontact;

  /**
   * Billing information associated with the PaymentMethod that may be used or required by
   * particular types of payment methods.
   */
  @SerializedName("billing_details")
  BillingDetails billingDetails;

  /**
   * If this is a {@code card} PaymentMethod, this hash contains the user's card details. For
   * backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
   * Amex Express Checkout, or legacy Checkout) into the card hash with format {@code card: {token:
   * "tok_visa"}}. When creating with a card number, you must meet the requirements for <a
   * href="https://stripe.com/docs/security#validating-pci-compliance">PCI compliance</a>. We
   * strongly recommend using Stripe.js instead of interacting with this API directly.
   */
  @SerializedName("card")
  Object card;

  /** The {@code Customer} to whom the original PaymentMethod is attached. */
  @SerializedName("customer")
  String customer;

  /**
   * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
   * method.
   */
  @SerializedName("eps")
  Eps eps;

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
   * If this is an {@code fpx} PaymentMethod, this hash contains details about the FPX payment
   * method.
   */
  @SerializedName("fpx")
  Fpx fpx;

  /**
   * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
   * payment method.
   */
  @SerializedName("giropay")
  Giropay giropay;

  /**
   * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL payment
   * method.
   */
  @SerializedName("ideal")
  Ideal ideal;

  /**
   * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
   * Interac Present payment method.
   */
  @SerializedName("interac_present")
  InteracPresent interacPresent;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
   * method.
   */
  @SerializedName("p24")
  P24 p24;

  /** The PaymentMethod to share. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA debit
   * bank account.
   */
  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name
   * matching this value. It contains additional information specific to the PaymentMethod type.
   * Required unless {@code payment_method} is specified (see the <a
   * href="https://stripe.com/docs/payments/payment-methods/connect#cloning-payment-methods">Cloning
   * PaymentMethods</a> guide)
   */
  @SerializedName("type")
  Type type;

  private PaymentMethodCreateParams(
      AuBecsDebit auBecsDebit,
      BacsDebit bacsDebit,
      Bancontact bancontact,
      BillingDetails billingDetails,
      Object card,
      String customer,
      Eps eps,
      List<String> expand,
      Map<String, Object> extraParams,
      Fpx fpx,
      Giropay giropay,
      Ideal ideal,
      InteracPresent interacPresent,
      Map<String, String> metadata,
      P24 p24,
      String paymentMethod,
      SepaDebit sepaDebit,
      Type type) {
    this.auBecsDebit = auBecsDebit;
    this.bacsDebit = bacsDebit;
    this.bancontact = bancontact;
    this.billingDetails = billingDetails;
    this.card = card;
    this.customer = customer;
    this.eps = eps;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fpx = fpx;
    this.giropay = giropay;
    this.ideal = ideal;
    this.interacPresent = interacPresent;
    this.metadata = metadata;
    this.p24 = p24;
    this.paymentMethod = paymentMethod;
    this.sepaDebit = sepaDebit;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AuBecsDebit auBecsDebit;

    private BacsDebit bacsDebit;

    private Bancontact bancontact;

    private BillingDetails billingDetails;

    private Object card;

    private String customer;

    private Eps eps;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Fpx fpx;

    private Giropay giropay;

    private Ideal ideal;

    private InteracPresent interacPresent;

    private Map<String, String> metadata;

    private P24 p24;

    private String paymentMethod;

    private SepaDebit sepaDebit;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodCreateParams build() {
      return new PaymentMethodCreateParams(
          this.auBecsDebit,
          this.bacsDebit,
          this.bancontact,
          this.billingDetails,
          this.card,
          this.customer,
          this.eps,
          this.expand,
          this.extraParams,
          this.fpx,
          this.giropay,
          this.ideal,
          this.interacPresent,
          this.metadata,
          this.p24,
          this.paymentMethod,
          this.sepaDebit,
          this.type);
    }

    /**
     * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the bank
     * account.
     */
    public Builder setAuBecsDebit(AuBecsDebit auBecsDebit) {
      this.auBecsDebit = auBecsDebit;
      return this;
    }

    /**
     * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
     * Direct Debit bank account.
     */
    public Builder setBacsDebit(BacsDebit bacsDebit) {
      this.bacsDebit = bacsDebit;
      return this;
    }

    /**
     * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
     * Bancontact payment method.
     */
    public Builder setBancontact(Bancontact bancontact) {
      this.bancontact = bancontact;
      return this;
    }

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    public Builder setBillingDetails(BillingDetails billingDetails) {
      this.billingDetails = billingDetails;
      return this;
    }

    /**
     * If this is a {@code card} PaymentMethod, this hash contains the user's card details. For
     * backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
     * Amex Express Checkout, or legacy Checkout) into the card hash with format {@code card:
     * {token: "tok_visa"}}. When creating with a card number, you must meet the requirements for <a
     * href="https://stripe.com/docs/security#validating-pci-compliance">PCI compliance</a>. We
     * strongly recommend using Stripe.js instead of interacting with this API directly.
     */
    public Builder setCard(CardDetails card) {
      this.card = card;
      return this;
    }

    /**
     * If this is a {@code card} PaymentMethod, this hash contains the user's card details. For
     * backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
     * Amex Express Checkout, or legacy Checkout) into the card hash with format {@code card:
     * {token: "tok_visa"}}. When creating with a card number, you must meet the requirements for <a
     * href="https://stripe.com/docs/security#validating-pci-compliance">PCI compliance</a>. We
     * strongly recommend using Stripe.js instead of interacting with this API directly.
     */
    public Builder setCard(Token card) {
      this.card = card;
      return this;
    }

    /** The {@code Customer} to whom the original PaymentMethod is attached. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
     * method.
     */
    public Builder setEps(Eps eps) {
      this.eps = eps;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
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
     * PaymentMethodCreateParams#expand} for the field documentation.
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
     * PaymentMethodCreateParams#extraParams} for the field documentation.
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
     * See {@link PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * If this is an {@code fpx} PaymentMethod, this hash contains details about the FPX payment
     * method.
     */
    public Builder setFpx(Fpx fpx) {
      this.fpx = fpx;
      return this;
    }

    /**
     * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
     * payment method.
     */
    public Builder setGiropay(Giropay giropay) {
      this.giropay = giropay;
      return this;
    }

    /**
     * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL payment
     * method.
     */
    public Builder setIdeal(Ideal ideal) {
      this.ideal = ideal;
      return this;
    }

    /**
     * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
     * Interac Present payment method.
     */
    public Builder setInteracPresent(InteracPresent interacPresent) {
      this.interacPresent = interacPresent;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#metadata} for the field documentation.
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
     * See {@link PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
     * method.
     */
    public Builder setP24(P24 p24) {
      this.p24 = p24;
      return this;
    }

    /** The PaymentMethod to share. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
     * debit bank account.
     */
    public Builder setSepaDebit(SepaDebit sepaDebit) {
      this.sepaDebit = sepaDebit;
      return this;
    }

    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the PaymentMethod
     * type. Required unless {@code payment_method} is specified (see the <a
     * href="https://stripe.com/docs/payments/payment-methods/connect#cloning-payment-methods">Cloning
     * PaymentMethods</a> guide)
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class AuBecsDebit {
    /** The account number for the bank account. */
    @SerializedName("account_number")
    String accountNumber;

    /** Bank-State-Branch number of the bank account. */
    @SerializedName("bsb_number")
    String bsbNumber;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AuBecsDebit(String accountNumber, String bsbNumber, Map<String, Object> extraParams) {
      this.accountNumber = accountNumber;
      this.bsbNumber = bsbNumber;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountNumber;

      private String bsbNumber;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AuBecsDebit build() {
        return new AuBecsDebit(this.accountNumber, this.bsbNumber, this.extraParams);
      }

      /** The account number for the bank account. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /** Bank-State-Branch number of the bank account. */
      public Builder setBsbNumber(String bsbNumber) {
        this.bsbNumber = bsbNumber;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.AuBecsDebit#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.AuBecsDebit#extraParams} for the field documentation.
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
  public static class BacsDebit {
    /** Account number of the bank account that the funds will be debited from. */
    @SerializedName("account_number")
    String accountNumber;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
    @SerializedName("sort_code")
    String sortCode;

    private BacsDebit(String accountNumber, Map<String, Object> extraParams, String sortCode) {
      this.accountNumber = accountNumber;
      this.extraParams = extraParams;
      this.sortCode = sortCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountNumber;

      private Map<String, Object> extraParams;

      private String sortCode;

      /** Finalize and obtain parameter instance from this builder. */
      public BacsDebit build() {
        return new BacsDebit(this.accountNumber, this.extraParams, this.sortCode);
      }

      /** Account number of the bank account that the funds will be debited from. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.BacsDebit#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.BacsDebit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
      public Builder setSortCode(String sortCode) {
        this.sortCode = sortCode;
        return this;
      }
    }
  }

  @Getter
  public static class Bancontact {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Bancontact(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Bancontact build() {
        return new Bancontact(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Bancontact#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.Bancontact#extraParams} for the field documentation.
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
  public static class BillingDetails {
    /** Billing address. */
    @SerializedName("address")
    Address address;

    /** Email address. */
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

    /** Full name. */
    @SerializedName("name")
    String name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    String phone;

    private BillingDetails(
        Address address, String email, Map<String, Object> extraParams, String name, String phone) {
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

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public BillingDetails build() {
        return new BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Billing address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** Email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.BillingDetails#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.BillingDetails#extraParams} for the field
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

      /** Billing phone number (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
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

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
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

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
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
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
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

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
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
  }

  @Getter
  public static class CardDetails {
    /** The card's CVC. It is highly recommended to always include this value. */
    @SerializedName("cvc")
    String cvc;

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

    /** The card number, as a string without any separators. */
    @SerializedName("number")
    String number;

    private CardDetails(
        String cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, String number) {
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String cvc;

      private Long expMonth;

      private Long expYear;

      private Map<String, Object> extraParams;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public CardDetails build() {
        return new CardDetails(
            this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
      }

      /** The card's CVC. It is highly recommended to always include this value. */
      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
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
       * PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The card number, as a string without any separators. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  @Getter
  public static class Token {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("token")
    String token;

    private Token(Map<String, Object> extraParams, String token) {
      this.extraParams = extraParams;
      this.token = token;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String token;

      /** Finalize and obtain parameter instance from this builder. */
      public Token build() {
        return new Token(this.extraParams, this.token);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Token#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setToken(String token) {
        this.token = token;
        return this;
      }
    }
  }

  @Getter
  public static class Eps {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Eps(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Eps build() {
        return new Eps(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Eps#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.Eps#extraParams} for the field documentation.
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
  public static class Fpx {
    /** Account holder type for FPX transaction. */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** The customer's bank. */
    @SerializedName("bank")
    Bank bank;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Fpx(AccountHolderType accountHolderType, Bank bank, Map<String, Object> extraParams) {
      this.accountHolderType = accountHolderType;
      this.bank = bank;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountHolderType accountHolderType;

      private Bank bank;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Fpx build() {
        return new Fpx(this.accountHolderType, this.bank, this.extraParams);
      }

      /** Account holder type for FPX transaction. */
      public Builder setAccountHolderType(AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** The customer's bank. */
      public Builder setBank(Bank bank) {
        this.bank = bank;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Fpx#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.Fpx#extraParams} for the field documentation.
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

    public enum Bank implements ApiRequestParams.EnumParam {
      @SerializedName("affin_bank")
      AFFIN_BANK("affin_bank"),

      @SerializedName("alliance_bank")
      ALLIANCE_BANK("alliance_bank"),

      @SerializedName("ambank")
      AMBANK("ambank"),

      @SerializedName("bank_islam")
      BANK_ISLAM("bank_islam"),

      @SerializedName("bank_muamalat")
      BANK_MUAMALAT("bank_muamalat"),

      @SerializedName("bank_rakyat")
      BANK_RAKYAT("bank_rakyat"),

      @SerializedName("bsn")
      BSN("bsn"),

      @SerializedName("cimb")
      CIMB("cimb"),

      @SerializedName("deutsche_bank")
      DEUTSCHE_BANK("deutsche_bank"),

      @SerializedName("hong_leong_bank")
      HONG_LEONG_BANK("hong_leong_bank"),

      @SerializedName("hsbc")
      HSBC("hsbc"),

      @SerializedName("kfh")
      KFH("kfh"),

      @SerializedName("maybank2e")
      MAYBANK2E("maybank2e"),

      @SerializedName("maybank2u")
      MAYBANK2U("maybank2u"),

      @SerializedName("ocbc")
      OCBC("ocbc"),

      @SerializedName("pb_enterprise")
      PB_ENTERPRISE("pb_enterprise"),

      @SerializedName("public_bank")
      PUBLIC_BANK("public_bank"),

      @SerializedName("rhb")
      RHB("rhb"),

      @SerializedName("standard_chartered")
      STANDARD_CHARTERED("standard_chartered"),

      @SerializedName("uob")
      UOB("uob");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Bank(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Giropay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Giropay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Giropay build() {
        return new Giropay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Giropay#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.Giropay#extraParams} for the field documentation.
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
  public static class Ideal {
    /** The customer's bank. */
    @SerializedName("bank")
    Bank bank;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Ideal(Bank bank, Map<String, Object> extraParams) {
      this.bank = bank;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Bank bank;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Ideal build() {
        return new Ideal(this.bank, this.extraParams);
      }

      /** The customer's bank. */
      public Builder setBank(Bank bank) {
        this.bank = bank;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Ideal#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.Ideal#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum Bank implements ApiRequestParams.EnumParam {
      @SerializedName("abn_amro")
      ABN_AMRO("abn_amro"),

      @SerializedName("asn_bank")
      ASN_BANK("asn_bank"),

      @SerializedName("bunq")
      BUNQ("bunq"),

      @SerializedName("handelsbanken")
      HANDELSBANKEN("handelsbanken"),

      @SerializedName("ing")
      ING("ing"),

      @SerializedName("knab")
      KNAB("knab"),

      @SerializedName("moneyou")
      MONEYOU("moneyou"),

      @SerializedName("rabobank")
      RABOBANK("rabobank"),

      @SerializedName("regiobank")
      REGIOBANK("regiobank"),

      @SerializedName("sns_bank")
      SNS_BANK("sns_bank"),

      @SerializedName("triodos_bank")
      TRIODOS_BANK("triodos_bank"),

      @SerializedName("van_lanschot")
      VAN_LANSCHOT("van_lanschot");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Bank(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class InteracPresent {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private InteracPresent(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public InteracPresent build() {
        return new InteracPresent(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.InteracPresent#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.InteracPresent#extraParams} for the field
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

  @Getter
  public static class P24 {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private P24(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public P24 build() {
        return new P24(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.P24#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.P24#extraParams} for the field documentation.
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
  public static class SepaDebit {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** IBAN of the bank account. */
    @SerializedName("iban")
    String iban;

    private SepaDebit(Map<String, Object> extraParams, String iban) {
      this.extraParams = extraParams;
      this.iban = iban;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String iban;

      /** Finalize and obtain parameter instance from this builder. */
      public SepaDebit build() {
        return new SepaDebit(this.extraParams, this.iban);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.SepaDebit#extraParams} for the field documentation.
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
       * See {@link PaymentMethodCreateParams.SepaDebit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** IBAN of the bank account. */
      public Builder setIban(String iban) {
        this.iban = iban;
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("au_becs_debit")
    AU_BECS_DEBIT("au_becs_debit"),

    @SerializedName("bacs_debit")
    BACS_DEBIT("bacs_debit"),

    @SerializedName("bancontact")
    BANCONTACT("bancontact"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("card_present")
    CARD_PRESENT("card_present"),

    @SerializedName("eps")
    EPS("eps"),

    @SerializedName("fpx")
    FPX("fpx"),

    @SerializedName("giropay")
    GIROPAY("giropay"),

    @SerializedName("ideal")
    IDEAL("ideal"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}

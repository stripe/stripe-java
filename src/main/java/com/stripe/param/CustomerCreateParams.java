package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CustomerCreateParams extends ApiRequestParams {
  /** The customer's address. */
  @SerializedName("address")
  Object address;

  /**
   * An integer amount in %s that represents the customer's current balance, which affect the
   * customer's future invoices. A negative amount represents a credit that decreases the amount due
   * on an invoice; a positive amount increases the amount due on an invoice.
   */
  @SerializedName("balance")
  Long balance;

  @SerializedName("coupon")
  String coupon;

  /**
   * An arbitrary string that you can attach to a customer object. It is displayed alongside the
   * customer in the dashboard.
   */
  @SerializedName("description")
  String description;

  /**
   * Customer's email address. It's displayed alongside the customer in your dashboard and can be
   * useful for searching and tracking. This may be up to *512 characters*.
   */
  @SerializedName("email")
  String email;

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
   * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase
   * letters or numbers.
   */
  @SerializedName("invoice_prefix")
  String invoicePrefix;

  /** Default invoice settings for this customer. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /**
   * A set of key-value pairs that you can attach to a customer object. It can be useful for storing
   * additional information about the customer in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The customer's full name or business name. */
  @SerializedName("name")
  String name;

  @SerializedName("payment_method")
  String paymentMethod;

  /** The customer's phone number. */
  @SerializedName("phone")
  String phone;

  /** Customer's preferred languages, ordered by preference. */
  @SerializedName("preferred_locales")
  List<String> preferredLocales;

  /** The customer's shipping information. Appears on invoices emailed to this customer. */
  @SerializedName("shipping")
  Object shipping;

  @SerializedName("source")
  String source;

  /** The customer's tax exemption. One of `none`, `exempt`, or `reverse`. */
  @SerializedName("tax_exempt")
  EnumParam taxExempt;

  /** The customer's tax IDs. */
  @SerializedName("tax_id_data")
  List<TaxIdData> taxIdData;

  private CustomerCreateParams(
      Object address,
      Long balance,
      String coupon,
      String description,
      String email,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoicePrefix,
      InvoiceSettings invoiceSettings,
      Map<String, String> metadata,
      String name,
      String paymentMethod,
      String phone,
      List<String> preferredLocales,
      Object shipping,
      String source,
      EnumParam taxExempt,
      List<TaxIdData> taxIdData) {
    this.address = address;
    this.balance = balance;
    this.coupon = coupon;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoicePrefix = invoicePrefix;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.name = name;
    this.paymentMethod = paymentMethod;
    this.phone = phone;
    this.preferredLocales = preferredLocales;
    this.shipping = shipping;
    this.source = source;
    this.taxExempt = taxExempt;
    this.taxIdData = taxIdData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object address;

    private Long balance;

    private String coupon;

    private String description;

    private String email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoicePrefix;

    private InvoiceSettings invoiceSettings;

    private Map<String, String> metadata;

    private String name;

    private String paymentMethod;

    private String phone;

    private List<String> preferredLocales;

    private Object shipping;

    private String source;

    private EnumParam taxExempt;

    private List<TaxIdData> taxIdData;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerCreateParams build() {
      return new CustomerCreateParams(
          this.address,
          this.balance,
          this.coupon,
          this.description,
          this.email,
          this.expand,
          this.extraParams,
          this.invoicePrefix,
          this.invoiceSettings,
          this.metadata,
          this.name,
          this.paymentMethod,
          this.phone,
          this.preferredLocales,
          this.shipping,
          this.source,
          this.taxExempt,
          this.taxIdData);
    }

    /** The customer's address. */
    public Builder setAddress(Address address) {
      this.address = address;
      return this;
    }

    /** The customer's address. */
    public Builder setAddress(EmptyParam address) {
      this.address = address;
      return this;
    }

    /**
     * An integer amount in %s that represents the customer's current balance, which affect the
     * customer's future invoices. A negative amount represents a credit that decreases the amount
     * due on an invoice; a positive amount increases the amount due on an invoice.
     */
    public Builder setBalance(Long balance) {
      this.balance = balance;
      return this;
    }

    public Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * An arbitrary string that you can attach to a customer object. It is displayed alongside the
     * customer in the dashboard.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be
     * useful for searching and tracking. This may be up to *512 characters*.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#expand} for the field documentation.
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
     * CustomerCreateParams#expand} for the field documentation.
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
     * CustomerCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomerCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase
     * letters or numbers.
     */
    public Builder setInvoicePrefix(String invoicePrefix) {
      this.invoicePrefix = invoicePrefix;
      return this;
    }

    /** Default invoice settings for this customer. */
    public Builder setInvoiceSettings(InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerCreateParams#metadata} for the field documentation.
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
     * See {@link CustomerCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The customer's full name or business name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** The customer's phone number. */
    public Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Add an element to `preferredLocales` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#preferredLocales} for the field documentation.
     */
    public Builder addPreferredLocale(String element) {
      if (this.preferredLocales == null) {
        this.preferredLocales = new ArrayList<>();
      }
      this.preferredLocales.add(element);
      return this;
    }

    /**
     * Add all elements to `preferredLocales` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#preferredLocales} for the field documentation.
     */
    public Builder addAllPreferredLocale(List<String> elements) {
      if (this.preferredLocales == null) {
        this.preferredLocales = new ArrayList<>();
      }
      this.preferredLocales.addAll(elements);
      return this;
    }

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    public Builder setShipping(EmptyParam shipping) {
      this.shipping = shipping;
      return this;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /** The customer's tax exemption. One of `none`, `exempt`, or `reverse`. */
    public Builder setTaxExempt(TaxExempt taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /** The customer's tax exemption. One of `none`, `exempt`, or `reverse`. */
    public Builder setTaxExempt(EmptyParam taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * Add an element to `taxIdData` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#taxIdData} for the field documentation.
     */
    public Builder addTaxIdData(TaxIdData element) {
      if (this.taxIdData == null) {
        this.taxIdData = new ArrayList<>();
      }
      this.taxIdData.add(element);
      return this;
    }

    /**
     * Add all elements to `taxIdData` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#taxIdData} for the field documentation.
     */
    public Builder addAllTaxIdData(List<TaxIdData> elements) {
      if (this.taxIdData == null) {
        this.taxIdData = new ArrayList<>();
      }
      this.taxIdData.addAll(elements);
      return this;
    }
  }

  @Getter
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.Address#extraParams} for the field documentation.
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
       * See {@link CustomerCreateParams.Address#extraParams} for the field documentation.
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

  @Getter
  public static class InvoiceSettings {
    /**
     * Default custom fields to be displayed on invoices for this customer. When updating, pass an
     * empty string to remove previously-defined fields.
     */
    @SerializedName("custom_fields")
    Object customFields;

    /**
     * ID of a payment method that's attached to the customer, to be used as the customer's default
     * payment method for subscriptions and invoices.
     */
    @SerializedName("default_payment_method")
    String defaultPaymentMethod;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Default footer to be displayed on invoices for this customer. */
    @SerializedName("footer")
    String footer;

    private InvoiceSettings(
        Object customFields,
        String defaultPaymentMethod,
        Map<String, Object> extraParams,
        String footer) {
      this.customFields = customFields;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.extraParams = extraParams;
      this.footer = footer;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object customFields;

      private String defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private String footer;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceSettings build() {
        return new InvoiceSettings(
            this.customFields, this.defaultPaymentMethod, this.extraParams, this.footer);
      }

      /**
       * Add an element to `customFields` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CustomerCreateParams.InvoiceSettings#customFields} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addCustomField(CustomField element) {
        if (this.customFields == null || this.customFields instanceof EmptyParam) {
          this.customFields = new ArrayList<CustomerCreateParams.InvoiceSettings.CustomField>();
        }
        ((List<CustomerCreateParams.InvoiceSettings.CustomField>) this.customFields).add(element);
        return this;
      }

      /**
       * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CustomerCreateParams.InvoiceSettings#customFields} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllCustomField(List<CustomField> elements) {
        if (this.customFields == null || this.customFields instanceof EmptyParam) {
          this.customFields = new ArrayList<CustomerCreateParams.InvoiceSettings.CustomField>();
        }
        ((List<CustomerCreateParams.InvoiceSettings.CustomField>) this.customFields)
            .addAll(elements);
        return this;
      }

      /**
       * Default custom fields to be displayed on invoices for this customer. When updating, pass an
       * empty string to remove previously-defined fields.
       */
      public Builder setCustomFields(EmptyParam customFields) {
        this.customFields = customFields;
        return this;
      }

      /**
       * Default custom fields to be displayed on invoices for this customer. When updating, pass an
       * empty string to remove previously-defined fields.
       */
      public Builder setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
        return this;
      }

      /**
       * ID of a payment method that's attached to the customer, to be used as the customer's
       * default payment method for subscriptions and invoices.
       */
      public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.InvoiceSettings#extraParams} for the field documentation.
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
       * See {@link CustomerCreateParams.InvoiceSettings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Default footer to be displayed on invoices for this customer. */
      public Builder setFooter(String footer) {
        this.footer = footer;
        return this;
      }
    }

    @Getter
    public static class CustomField {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The name of the custom field. This may be up to 30 characters. */
      @SerializedName("name")
      String name;

      /** The value of the custom field. This may be up to 30 characters. */
      @SerializedName("value")
      String value;

      private CustomField(Map<String, Object> extraParams, String name, String value) {
        this.extraParams = extraParams;
        this.name = name;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String name;

        private String value;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomField build() {
          return new CustomField(this.extraParams, this.name, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerCreateParams.InvoiceSettings.CustomField#extraParams} for the
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
         * map. See {@link CustomerCreateParams.InvoiceSettings.CustomField#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The name of the custom field. This may be up to 30 characters. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** The value of the custom field. This may be up to 30 characters. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }
      }
    }
  }

  @Getter
  public static class Shipping {
    /** Customer shipping address. */
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

    /** Customer name. */
    @SerializedName("name")
    String name;

    /** Customer phone (including extension). */
    @SerializedName("phone")
    String phone;

    private Shipping(Address address, Map<String, Object> extraParams, String name, String phone) {
      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(this.address, this.extraParams, this.name, this.phone);
      }

      /** Customer shipping address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link CustomerCreateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Customer name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Customer phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
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
         * map. See {@link CustomerCreateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link CustomerCreateParams.Shipping.Address#extraParams} for the field
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
  }

  @Getter
  public static class TaxIdData {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Type of the tax ID, one of `au_abn`, `ch_vat`, `eu_vat`, `in_gst`, `mx_rfc`, `no_vat`,
     * `nz_gst`, or `za_vat`.
     */
    @SerializedName("type")
    Type type;

    /** Value of the tax ID. */
    @SerializedName("value")
    String value;

    private TaxIdData(Map<String, Object> extraParams, Type type, String value) {
      this.extraParams = extraParams;
      this.type = type;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Type type;

      private String value;

      /** Finalize and obtain parameter instance from this builder. */
      public TaxIdData build() {
        return new TaxIdData(this.extraParams, this.type, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.TaxIdData#extraParams} for the field documentation.
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
       * See {@link CustomerCreateParams.TaxIdData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Type of the tax ID, one of `au_abn`, `ch_vat`, `eu_vat`, `in_gst`, `mx_rfc`, `no_vat`,
       * `nz_gst`, or `za_vat`.
       */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }

      /** Value of the tax ID. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("au_abn")
      AU_ABN("au_abn"),

      @SerializedName("ch_vat")
      CH_VAT("ch_vat"),

      @SerializedName("eu_vat")
      EU_VAT("eu_vat"),

      @SerializedName("in_gst")
      IN_GST("in_gst"),

      @SerializedName("mx_rfc")
      MX_RFC("mx_rfc"),

      @SerializedName("no_vat")
      NO_VAT("no_vat"),

      @SerializedName("nz_gst")
      NZ_GST("nz_gst"),

      @SerializedName("za_vat")
      ZA_VAT("za_vat");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum TaxExempt implements ApiRequestParams.EnumParam {
    @SerializedName("exempt")
    EXEMPT("exempt"),

    @SerializedName("none")
    NONE("none"),

    @SerializedName("reverse")
    REVERSE("reverse");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TaxExempt(String value) {
      this.value = value;
    }
  }
}

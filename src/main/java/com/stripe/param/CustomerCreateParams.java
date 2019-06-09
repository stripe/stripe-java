package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class CustomerCreateParams extends ApiRequestParams {

  /** This field has been renamed to `balance` and will be removed in a future API version. */
  @SerializedName("account_balance")
  Long accountBalance;

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
  CustomerCreateParams.InvoiceSettings invoiceSettings;

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
  ApiRequestParams.EnumParam taxExempt;

  /** The customer's tax IDs. */
  @SerializedName("tax_id_data")
  List<CustomerCreateParams.TaxIdData> taxIdData;

  /**
   * The customer's tax information. Appears on invoices emailed to this customer. This parameter
   * has been deprecated and will be removed in a future API version, for further information view
   * the [migration
   * guide](https://stripe.com/docs/billing/migration/taxes#moving-from-taxinfo-to-customer-tax-ids).
   */
  @SerializedName("tax_info")
  CustomerCreateParams.TaxInfo taxInfo;

  private CustomerCreateParams(
      Long accountBalance,
      Object address,
      Long balance,
      String coupon,
      String description,
      String email,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoicePrefix,
      CustomerCreateParams.InvoiceSettings invoiceSettings,
      Map<String, String> metadata,
      String name,
      String paymentMethod,
      String phone,
      List<String> preferredLocales,
      Object shipping,
      String source,
      ApiRequestParams.EnumParam taxExempt,
      List<CustomerCreateParams.TaxIdData> taxIdData,
      CustomerCreateParams.TaxInfo taxInfo) {

    this.accountBalance = accountBalance;
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
    this.taxInfo = taxInfo;
  }

  public static CustomerCreateParams.Builder builder() {
    return new CustomerCreateParams.Builder();
  }

  public static class Builder {
    private Long accountBalance;
    private Object address;
    private Long balance;
    private String coupon;
    private String description;
    private String email;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private String invoicePrefix;
    private CustomerCreateParams.InvoiceSettings invoiceSettings;
    private Map<String, String> metadata;
    private String name;
    private String paymentMethod;
    private String phone;
    private List<String> preferredLocales;
    private Object shipping;
    private String source;
    private ApiRequestParams.EnumParam taxExempt;
    private List<CustomerCreateParams.TaxIdData> taxIdData;
    private CustomerCreateParams.TaxInfo taxInfo;

    public CustomerCreateParams build() {
      return new CustomerCreateParams(
          this.accountBalance,
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
          this.taxIdData,
          this.taxInfo);
    }

    /** This field has been renamed to `balance` and will be removed in a future API version. */
    public CustomerCreateParams.Builder setAccountBalance(Long accountBalance) {

      this.accountBalance = accountBalance;
      return this;
    }

    /** The customer's address. */
    public CustomerCreateParams.Builder setAddress(CustomerCreateParams.Address address) {

      this.address = address;
      return this;
    }

    /** The customer's address. */
    public CustomerCreateParams.Builder setAddress(EmptyParam address) {
      this.address = address;
      return this;
    }

    /**
     * An integer amount in %s that represents the customer's current balance, which affect the
     * customer's future invoices. A negative amount represents a credit that decreases the amount
     * due on an invoice; a positive amount increases the amount due on an invoice.
     */
    public CustomerCreateParams.Builder setBalance(Long balance) {
      this.balance = balance;
      return this;
    }

    public CustomerCreateParams.Builder setCoupon(String coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * An arbitrary string that you can attach to a customer object. It is displayed alongside the
     * customer in the dashboard.
     */
    public CustomerCreateParams.Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be
     * useful for searching and tracking. This may be up to *512 characters*.
     */
    public CustomerCreateParams.Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#expand} for the field documentation.
     */
    public CustomerCreateParams.Builder addExpand(String element) {
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
    public CustomerCreateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerCreateParams#extraParams} for the field documentation.
     */
    public CustomerCreateParams.Builder putExtraParam(String key, Object value) {

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
    public CustomerCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

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
    public CustomerCreateParams.Builder setInvoicePrefix(String invoicePrefix) {

      this.invoicePrefix = invoicePrefix;
      return this;
    }

    /** Default invoice settings for this customer. */
    public CustomerCreateParams.Builder setInvoiceSettings(
        CustomerCreateParams.InvoiceSettings invoiceSettings) {

      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerCreateParams#metadata} for the field documentation.
     */
    public CustomerCreateParams.Builder putMetadata(String key, String value) {

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
    public CustomerCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The customer's full name or business name. */
    public CustomerCreateParams.Builder setName(String name) {
      this.name = name;
      return this;
    }

    public CustomerCreateParams.Builder setPaymentMethod(String paymentMethod) {

      this.paymentMethod = paymentMethod;
      return this;
    }

    /** The customer's phone number. */
    public CustomerCreateParams.Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Add an element to `preferredLocales` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#preferredLocales} for the field documentation.
     */
    public CustomerCreateParams.Builder addPreferredLocale(String element) {
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
    public CustomerCreateParams.Builder addAllPreferredLocale(List<String> list) {

      if (this.preferredLocales == null) {
        this.preferredLocales = new ArrayList<>();
      }
      this.preferredLocales.addAll(list);
      return this;
    }

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    public CustomerCreateParams.Builder setShipping(CustomerCreateParams.Shipping shipping) {

      this.shipping = shipping;
      return this;
    }

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    public CustomerCreateParams.Builder setShipping(EmptyParam shipping) {
      this.shipping = shipping;
      return this;
    }

    public CustomerCreateParams.Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /** The customer's tax exemption. One of `none`, `exempt`, or `reverse`. */
    public CustomerCreateParams.Builder setTaxExempt(EmptyParam taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /** The customer's tax exemption. One of `none`, `exempt`, or `reverse`. */
    public CustomerCreateParams.Builder setTaxExempt(CustomerCreateParams.TaxExempt taxExempt) {

      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * Add an element to `taxIdData` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#taxIdData} for the field documentation.
     */
    public CustomerCreateParams.Builder addTaxIdData(CustomerCreateParams.TaxIdData element) {

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
    public CustomerCreateParams.Builder addAllTaxIdData(List<CustomerCreateParams.TaxIdData> list) {

      if (this.taxIdData == null) {
        this.taxIdData = new ArrayList<>();
      }
      this.taxIdData.addAll(list);
      return this;
    }

    /**
     * The customer's tax information. Appears on invoices emailed to this customer. This parameter
     * has been deprecated and will be removed in a future API version, for further information view
     * the [migration
     * guide](https://stripe.com/docs/billing/migration/taxes#moving-from-taxinfo-to-customer-tax-ids).
     */
    public CustomerCreateParams.Builder setTaxInfo(CustomerCreateParams.TaxInfo taxInfo) {

      this.taxInfo = taxInfo;
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

    public static CustomerCreateParams.Address.Builder builder() {
      return new CustomerCreateParams.Address.Builder();
    }

    public static class Builder {
      private String city;
      private String country;
      private Map<String, Object> extraParams;
      private String line1;
      private String line2;
      private String postalCode;
      private String state;

      public CustomerCreateParams.Address build() {
        return new CustomerCreateParams.Address(
            this.city,
            this.country,
            this.extraParams,
            this.line1,
            this.line2,
            this.postalCode,
            this.state);
      }

      public CustomerCreateParams.Address.Builder setCity(String city) {
        this.city = city;
        return this;
      }

      public CustomerCreateParams.Address.Builder setCountry(String country) {

        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.Address#extraParams} for the field documentation.
       */
      public CustomerCreateParams.Address.Builder putExtraParam(String key, Object value) {

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
      public CustomerCreateParams.Address.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public CustomerCreateParams.Address.Builder setLine1(String line1) {
        this.line1 = line1;
        return this;
      }

      public CustomerCreateParams.Address.Builder setLine2(String line2) {
        this.line2 = line2;
        return this;
      }

      public CustomerCreateParams.Address.Builder setPostalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
      }

      public CustomerCreateParams.Address.Builder setState(String state) {
        this.state = state;
        return this;
      }
    }
  }

  public static class InvoiceSettings {

    /** Default custom fields to be displayed on invoices for this customer. */
    @SerializedName("custom_fields")
    Object customFields;

    /** ID of the default payment method used for subscriptions and invoices for the customer. */
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

    public static CustomerCreateParams.InvoiceSettings.Builder builder() {
      return new CustomerCreateParams.InvoiceSettings.Builder();
    }

    public static class Builder {
      private Object customFields;
      private String defaultPaymentMethod;
      private Map<String, Object> extraParams;
      private String footer;

      public CustomerCreateParams.InvoiceSettings build() {
        return new CustomerCreateParams.InvoiceSettings(
            this.customFields, this.defaultPaymentMethod, this.extraParams, this.footer);
      }

      /** Default custom fields to be displayed on invoices for this customer. */
      public CustomerCreateParams.InvoiceSettings.Builder setCustomFields(
          List<CustomerCreateParams.InvoiceSettings.CustomField> customFields) {

        this.customFields = customFields;
        return this;
      }

      /** Default custom fields to be displayed on invoices for this customer. */
      public CustomerCreateParams.InvoiceSettings.Builder setCustomFields(EmptyParam customFields) {

        this.customFields = customFields;
        return this;
      }

      /** ID of the default payment method used for subscriptions and invoices for the customer. */
      public CustomerCreateParams.InvoiceSettings.Builder setDefaultPaymentMethod(
          String defaultPaymentMethod) {

        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.InvoiceSettings#extraParams} for the field documentation.
       */
      public CustomerCreateParams.InvoiceSettings.Builder putExtraParam(String key, Object value) {

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
      public CustomerCreateParams.InvoiceSettings.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Default footer to be displayed on invoices for this customer. */
      public CustomerCreateParams.InvoiceSettings.Builder setFooter(String footer) {

        this.footer = footer;
        return this;
      }
    }

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

      public static CustomerCreateParams.InvoiceSettings.CustomField.Builder builder() {

        return new CustomerCreateParams.InvoiceSettings.CustomField.Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;
        private String name;
        private String value;

        public CustomerCreateParams.InvoiceSettings.CustomField build() {

          return new CustomerCreateParams.InvoiceSettings.CustomField(
              this.extraParams, this.name, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerCreateParams.InvoiceSettings.CustomField#extraParams} for the
         * field documentation.
         */
        public CustomerCreateParams.InvoiceSettings.CustomField.Builder putExtraParam(
            String key, Object value) {

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
        public CustomerCreateParams.InvoiceSettings.CustomField.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The name of the custom field. This may be up to 30 characters. */
        public CustomerCreateParams.InvoiceSettings.CustomField.Builder setName(String name) {

          this.name = name;
          return this;
        }

        /** The value of the custom field. This may be up to 30 characters. */
        public CustomerCreateParams.InvoiceSettings.CustomField.Builder setValue(String value) {

          this.value = value;
          return this;
        }
      }
    }
  }

  public static class Shipping {

    /** Customer shipping address. */
    @SerializedName("address")
    CustomerCreateParams.Shipping.Address address;

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

    private Shipping(
        CustomerCreateParams.Shipping.Address address,
        Map<String, Object> extraParams,
        String name,
        String phone) {

      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static CustomerCreateParams.Shipping.Builder builder() {
      return new CustomerCreateParams.Shipping.Builder();
    }

    public static class Builder {
      private CustomerCreateParams.Shipping.Address address;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;

      public CustomerCreateParams.Shipping build() {
        return new CustomerCreateParams.Shipping(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** Customer shipping address. */
      public CustomerCreateParams.Shipping.Builder setAddress(
          CustomerCreateParams.Shipping.Address address) {

        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.Shipping#extraParams} for the field documentation.
       */
      public CustomerCreateParams.Shipping.Builder putExtraParam(String key, Object value) {

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
      public CustomerCreateParams.Shipping.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Customer name. */
      public CustomerCreateParams.Shipping.Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Customer phone (including extension). */
      public CustomerCreateParams.Shipping.Builder setPhone(String phone) {

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

      public static CustomerCreateParams.Shipping.Address.Builder builder() {

        return new CustomerCreateParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public CustomerCreateParams.Shipping.Address build() {
          return new CustomerCreateParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public CustomerCreateParams.Shipping.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public CustomerCreateParams.Shipping.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public CustomerCreateParams.Shipping.Address.Builder putExtraParam(
            String key, Object value) {

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
        public CustomerCreateParams.Shipping.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public CustomerCreateParams.Shipping.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public CustomerCreateParams.Shipping.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public CustomerCreateParams.Shipping.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public CustomerCreateParams.Shipping.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }

  public static class TaxIdData {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Type of the tax ID, one of `au_abn`, `eu_vat`, `in_gst`, `no_vat`, or `nz_gst`. */
    @SerializedName("type")
    CustomerCreateParams.TaxIdData.Type type;

    /** Value of the tax ID. */
    @SerializedName("value")
    String value;

    private TaxIdData(
        Map<String, Object> extraParams, CustomerCreateParams.TaxIdData.Type type, String value) {

      this.extraParams = extraParams;
      this.type = type;
      this.value = value;
    }

    public static CustomerCreateParams.TaxIdData.Builder builder() {
      return new CustomerCreateParams.TaxIdData.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private CustomerCreateParams.TaxIdData.Type type;
      private String value;

      public CustomerCreateParams.TaxIdData build() {
        return new CustomerCreateParams.TaxIdData(this.extraParams, this.type, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.TaxIdData#extraParams} for the field documentation.
       */
      public CustomerCreateParams.TaxIdData.Builder putExtraParam(String key, Object value) {

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
      public CustomerCreateParams.TaxIdData.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Type of the tax ID, one of `au_abn`, `eu_vat`, `in_gst`, `no_vat`, or `nz_gst`. */
      public CustomerCreateParams.TaxIdData.Builder setType(
          CustomerCreateParams.TaxIdData.Type type) {

        this.type = type;
        return this;
      }

      /** Value of the tax ID. */
      public CustomerCreateParams.TaxIdData.Builder setValue(String value) {

        this.value = value;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("au_abn")
      AU_ABN("au_abn"),
      @SerializedName("eu_vat")
      EU_VAT("eu_vat"),
      @SerializedName("in_gst")
      IN_GST("in_gst"),
      @SerializedName("no_vat")
      NO_VAT("no_vat"),
      @SerializedName("nz_gst")
      NZ_GST("nz_gst");

      @Getter(onMethod_ = {@Override})
      private final String value;

      private Type(String value) {
        this.value = value;
      }
    }
  }

  public static class TaxInfo {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The customer's tax ID number. */
    @SerializedName("tax_id")
    String taxId;

    /** The type of ID number. The only possible value is `vat` */
    @SerializedName("type")
    CustomerCreateParams.TaxInfo.Type type;

    private TaxInfo(
        Map<String, Object> extraParams, String taxId, CustomerCreateParams.TaxInfo.Type type) {

      this.extraParams = extraParams;
      this.taxId = taxId;
      this.type = type;
    }

    public static CustomerCreateParams.TaxInfo.Builder builder() {
      return new CustomerCreateParams.TaxInfo.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private String taxId;
      private CustomerCreateParams.TaxInfo.Type type;

      public CustomerCreateParams.TaxInfo build() {
        return new CustomerCreateParams.TaxInfo(this.extraParams, this.taxId, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.TaxInfo#extraParams} for the field documentation.
       */
      public CustomerCreateParams.TaxInfo.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CustomerCreateParams.TaxInfo#extraParams} for the field documentation.
       */
      public CustomerCreateParams.TaxInfo.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The customer's tax ID number. */
      public CustomerCreateParams.TaxInfo.Builder setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
      }

      /** The type of ID number. The only possible value is `vat` */
      public CustomerCreateParams.TaxInfo.Builder setType(CustomerCreateParams.TaxInfo.Type type) {

        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("vat")
      VAT("vat");

      @Getter(onMethod_ = {@Override})
      private final String value;

      private Type(String value) {
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

    private TaxExempt(String value) {
      this.value = value;
    }
  }
}

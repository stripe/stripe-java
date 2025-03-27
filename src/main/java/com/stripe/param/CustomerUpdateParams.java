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
public class CustomerUpdateParams extends ApiRequestParams {
  /** The customer's address. */
  @SerializedName("address")
  Object address;

  /**
   * An integer amount in cents (or local equivalent) that represents the customer's current
   * balance, which affect the customer's future invoices. A negative amount represents a credit
   * that decreases the amount due on an invoice; a positive amount increases the amount due on an
   * invoice.
   */
  @SerializedName("balance")
  Long balance;

  /** Balance information and default balance settings for this customer. */
  @SerializedName("cash_balance")
  CashBalance cashBalance;

  /**
   * If you are using payment methods created via the PaymentMethods API, see the <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">invoice_settings.default_payment_method</a>
   * parameter.
   *
   * <p>Provide the ID of a payment source already attached to this customer to make it this
   * customer's default payment source.
   *
   * <p>If you want to add a new payment source and make it the default, see the <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-source">source</a> property.
   */
  @SerializedName("default_source")
  Object defaultSource;

  /**
   * An arbitrary string that you can attach to a customer object. It is displayed alongside the
   * customer in the dashboard.
   */
  @SerializedName("description")
  Object description;

  /**
   * Customer's email address. It's displayed alongside the customer in your dashboard and can be
   * useful for searching and tracking. This may be up to <em>512 characters</em>.
   */
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

  /**
   * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase
   * letters or numbers.
   */
  @SerializedName("invoice_prefix")
  Object invoicePrefix;

  /** Default invoice settings for this customer. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The customer's full name or business name. */
  @SerializedName("name")
  Object name;

  /** The sequence to be used on the customer's next invoice. Defaults to 1. */
  @SerializedName("next_invoice_sequence")
  Long nextInvoiceSequence;

  /** The customer's phone number. */
  @SerializedName("phone")
  Object phone;

  /** Customer's preferred languages, ordered by preference. */
  @SerializedName("preferred_locales")
  List<String> preferredLocales;

  /** The customer's shipping information. Appears on invoices emailed to this customer. */
  @SerializedName("shipping")
  Object shipping;

  @SerializedName("source")
  Object source;

  /** Tax details about the customer. */
  @SerializedName("tax")
  Tax tax;

  /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
  @SerializedName("tax_exempt")
  ApiRequestParams.EnumParam taxExempt;

  @SerializedName("validate")
  Boolean validate;

  private CustomerUpdateParams(
      Object address,
      Long balance,
      CashBalance cashBalance,
      Object defaultSource,
      Object description,
      Object email,
      List<String> expand,
      Map<String, Object> extraParams,
      Object invoicePrefix,
      InvoiceSettings invoiceSettings,
      Object metadata,
      Object name,
      Long nextInvoiceSequence,
      Object phone,
      List<String> preferredLocales,
      Object shipping,
      Object source,
      Tax tax,
      ApiRequestParams.EnumParam taxExempt,
      Boolean validate) {
    this.address = address;
    this.balance = balance;
    this.cashBalance = cashBalance;
    this.defaultSource = defaultSource;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoicePrefix = invoicePrefix;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.name = name;
    this.nextInvoiceSequence = nextInvoiceSequence;
    this.phone = phone;
    this.preferredLocales = preferredLocales;
    this.shipping = shipping;
    this.source = source;
    this.tax = tax;
    this.taxExempt = taxExempt;
    this.validate = validate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object address;

    private Long balance;

    private CashBalance cashBalance;

    private Object defaultSource;

    private Object description;

    private Object email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object invoicePrefix;

    private InvoiceSettings invoiceSettings;

    private Object metadata;

    private Object name;

    private Long nextInvoiceSequence;

    private Object phone;

    private List<String> preferredLocales;

    private Object shipping;

    private Object source;

    private Tax tax;

    private ApiRequestParams.EnumParam taxExempt;

    private Boolean validate;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerUpdateParams build() {
      return new CustomerUpdateParams(
          this.address,
          this.balance,
          this.cashBalance,
          this.defaultSource,
          this.description,
          this.email,
          this.expand,
          this.extraParams,
          this.invoicePrefix,
          this.invoiceSettings,
          this.metadata,
          this.name,
          this.nextInvoiceSequence,
          this.phone,
          this.preferredLocales,
          this.shipping,
          this.source,
          this.tax,
          this.taxExempt,
          this.validate);
    }

    /** The customer's address. */
    public Builder setAddress(CustomerUpdateParams.Address address) {
      this.address = address;
      return this;
    }

    /** The customer's address. */
    public Builder setAddress(EmptyParam address) {
      this.address = address;
      return this;
    }

    /**
     * An integer amount in cents (or local equivalent) that represents the customer's current
     * balance, which affect the customer's future invoices. A negative amount represents a credit
     * that decreases the amount due on an invoice; a positive amount increases the amount due on an
     * invoice.
     */
    public Builder setBalance(Long balance) {
      this.balance = balance;
      return this;
    }

    /** Balance information and default balance settings for this customer. */
    public Builder setCashBalance(CustomerUpdateParams.CashBalance cashBalance) {
      this.cashBalance = cashBalance;
      return this;
    }

    /**
     * If you are using payment methods created via the PaymentMethods API, see the <a
     * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">invoice_settings.default_payment_method</a>
     * parameter.
     *
     * <p>Provide the ID of a payment source already attached to this customer to make it this
     * customer's default payment source.
     *
     * <p>If you want to add a new payment source and make it the default, see the <a
     * href="https://stripe.com/docs/api/customers/update#update_customer-source">source</a>
     * property.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * If you are using payment methods created via the PaymentMethods API, see the <a
     * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">invoice_settings.default_payment_method</a>
     * parameter.
     *
     * <p>Provide the ID of a payment source already attached to this customer to make it this
     * customer's default payment source.
     *
     * <p>If you want to add a new payment source and make it the default, see the <a
     * href="https://stripe.com/docs/api/customers/update#update_customer-source">source</a>
     * property.
     */
    public Builder setDefaultSource(EmptyParam defaultSource) {
      this.defaultSource = defaultSource;
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
     * An arbitrary string that you can attach to a customer object. It is displayed alongside the
     * customer in the dashboard.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be
     * useful for searching and tracking. This may be up to <em>512 characters</em>.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be
     * useful for searching and tracking. This may be up to <em>512 characters</em>.
     */
    public Builder setEmail(EmptyParam email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerUpdateParams#expand} for the field documentation.
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
     * CustomerUpdateParams#expand} for the field documentation.
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
     * CustomerUpdateParams#extraParams} for the field documentation.
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
     * See {@link CustomerUpdateParams#extraParams} for the field documentation.
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

    /**
     * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase
     * letters or numbers.
     */
    public Builder setInvoicePrefix(EmptyParam invoicePrefix) {
      this.invoicePrefix = invoicePrefix;
      return this;
    }

    /** Default invoice settings for this customer. */
    public Builder setInvoiceSettings(CustomerUpdateParams.InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerUpdateParams#metadata} for the field documentation.
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
     * See {@link CustomerUpdateParams#metadata} for the field documentation.
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

    /** The customer's full name or business name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** The customer's full name or business name. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /** The sequence to be used on the customer's next invoice. Defaults to 1. */
    public Builder setNextInvoiceSequence(Long nextInvoiceSequence) {
      this.nextInvoiceSequence = nextInvoiceSequence;
      return this;
    }

    /** The customer's phone number. */
    public Builder setPhone(String phone) {
      this.phone = phone;
      return this;
    }

    /** The customer's phone number. */
    public Builder setPhone(EmptyParam phone) {
      this.phone = phone;
      return this;
    }

    /**
     * Add an element to `preferredLocales` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * CustomerUpdateParams#preferredLocales} for the field documentation.
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
     * CustomerUpdateParams#preferredLocales} for the field documentation.
     */
    public Builder addAllPreferredLocale(List<String> elements) {
      if (this.preferredLocales == null) {
        this.preferredLocales = new ArrayList<>();
      }
      this.preferredLocales.addAll(elements);
      return this;
    }

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    public Builder setShipping(CustomerUpdateParams.Shipping shipping) {
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

    public Builder setSource(EmptyParam source) {
      this.source = source;
      return this;
    }

    /** Tax details about the customer. */
    public Builder setTax(CustomerUpdateParams.Tax tax) {
      this.tax = tax;
      return this;
    }

    /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
    public Builder setTaxExempt(CustomerUpdateParams.TaxExempt taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
    public Builder setTaxExempt(EmptyParam taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    public Builder setValidate(Boolean validate) {
      this.validate = validate;
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
     * A freeform text field for the country. However, in order to activate some tax features, the
     * format should be a two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    Object country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public CustomerUpdateParams.Address build() {
        return new CustomerUpdateParams.Address(
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
       * A freeform text field for the country. However, in order to activate some tax features, the
       * format should be a two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * A freeform text field for the country. However, in order to activate some tax features, the
       * format should be a two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(EmptyParam country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerUpdateParams.Address#extraParams} for the field documentation.
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
       * See {@link CustomerUpdateParams.Address#extraParams} for the field documentation.
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CashBalance {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Settings controlling the behavior of the customer's cash balance, such as reconciliation of
     * funds received.
     */
    @SerializedName("settings")
    Settings settings;

    private CashBalance(Map<String, Object> extraParams, Settings settings) {
      this.extraParams = extraParams;
      this.settings = settings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Settings settings;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerUpdateParams.CashBalance build() {
        return new CustomerUpdateParams.CashBalance(this.extraParams, this.settings);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerUpdateParams.CashBalance#extraParams} for the field documentation.
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
       * See {@link CustomerUpdateParams.CashBalance#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Settings controlling the behavior of the customer's cash balance, such as reconciliation of
       * funds received.
       */
      public Builder setSettings(CustomerUpdateParams.CashBalance.Settings settings) {
        this.settings = settings;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Settings {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Controls how funds transferred by the customer are applied to payment intents and invoices.
       * Valid options are {@code automatic}, {@code manual}, or {@code merchant_default}. For more
       * information about these reconciliation modes, see <a
       * href="https://stripe.com/docs/payments/customer-balance/reconciliation">Reconciliation</a>.
       */
      @SerializedName("reconciliation_mode")
      ReconciliationMode reconciliationMode;

      private Settings(Map<String, Object> extraParams, ReconciliationMode reconciliationMode) {
        this.extraParams = extraParams;
        this.reconciliationMode = reconciliationMode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ReconciliationMode reconciliationMode;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerUpdateParams.CashBalance.Settings build() {
          return new CustomerUpdateParams.CashBalance.Settings(
              this.extraParams, this.reconciliationMode);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerUpdateParams.CashBalance.Settings#extraParams} for the field
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
         * map. See {@link CustomerUpdateParams.CashBalance.Settings#extraParams} for the field
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
         * Controls how funds transferred by the customer are applied to payment intents and
         * invoices. Valid options are {@code automatic}, {@code manual}, or {@code
         * merchant_default}. For more information about these reconciliation modes, see <a
         * href="https://stripe.com/docs/payments/customer-balance/reconciliation">Reconciliation</a>.
         */
        public Builder setReconciliationMode(
            CustomerUpdateParams.CashBalance.Settings.ReconciliationMode reconciliationMode) {
          this.reconciliationMode = reconciliationMode;
          return this;
        }
      }

      public enum ReconciliationMode implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("manual")
        MANUAL("manual"),

        @SerializedName("merchant_default")
        MERCHANT_DEFAULT("merchant_default");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ReconciliationMode(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceSettings {
    /**
     * The list of up to 4 default custom fields to be displayed on invoices for this customer. When
     * updating, pass an empty string to remove previously-defined fields.
     */
    @SerializedName("custom_fields")
    Object customFields;

    /**
     * ID of a payment method that's attached to the customer, to be used as the customer's default
     * payment method for subscriptions and invoices.
     */
    @SerializedName("default_payment_method")
    Object defaultPaymentMethod;

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
    Object footer;

    /** Default options for invoice PDF rendering for this customer. */
    @SerializedName("rendering_options")
    Object renderingOptions;

    private InvoiceSettings(
        Object customFields,
        Object defaultPaymentMethod,
        Map<String, Object> extraParams,
        Object footer,
        Object renderingOptions) {
      this.customFields = customFields;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.extraParams = extraParams;
      this.footer = footer;
      this.renderingOptions = renderingOptions;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object customFields;

      private Object defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private Object footer;

      private Object renderingOptions;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerUpdateParams.InvoiceSettings build() {
        return new CustomerUpdateParams.InvoiceSettings(
            this.customFields,
            this.defaultPaymentMethod,
            this.extraParams,
            this.footer,
            this.renderingOptions);
      }

      /**
       * Add an element to `customFields` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CustomerUpdateParams.InvoiceSettings#customFields} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addCustomField(CustomerUpdateParams.InvoiceSettings.CustomField element) {
        if (this.customFields == null || this.customFields instanceof EmptyParam) {
          this.customFields = new ArrayList<CustomerUpdateParams.InvoiceSettings.CustomField>();
        }
        ((List<CustomerUpdateParams.InvoiceSettings.CustomField>) this.customFields).add(element);
        return this;
      }

      /**
       * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CustomerUpdateParams.InvoiceSettings#customFields} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllCustomField(
          List<CustomerUpdateParams.InvoiceSettings.CustomField> elements) {
        if (this.customFields == null || this.customFields instanceof EmptyParam) {
          this.customFields = new ArrayList<CustomerUpdateParams.InvoiceSettings.CustomField>();
        }
        ((List<CustomerUpdateParams.InvoiceSettings.CustomField>) this.customFields)
            .addAll(elements);
        return this;
      }

      /**
       * The list of up to 4 default custom fields to be displayed on invoices for this customer.
       * When updating, pass an empty string to remove previously-defined fields.
       */
      public Builder setCustomFields(EmptyParam customFields) {
        this.customFields = customFields;
        return this;
      }

      /**
       * The list of up to 4 default custom fields to be displayed on invoices for this customer.
       * When updating, pass an empty string to remove previously-defined fields.
       */
      public Builder setCustomFields(
          List<CustomerUpdateParams.InvoiceSettings.CustomField> customFields) {
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
       * ID of a payment method that's attached to the customer, to be used as the customer's
       * default payment method for subscriptions and invoices.
       */
      public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerUpdateParams.InvoiceSettings#extraParams} for the field documentation.
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
       * See {@link CustomerUpdateParams.InvoiceSettings#extraParams} for the field documentation.
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

      /** Default footer to be displayed on invoices for this customer. */
      public Builder setFooter(EmptyParam footer) {
        this.footer = footer;
        return this;
      }

      /** Default options for invoice PDF rendering for this customer. */
      public Builder setRenderingOptions(
          CustomerUpdateParams.InvoiceSettings.RenderingOptions renderingOptions) {
        this.renderingOptions = renderingOptions;
        return this;
      }

      /** Default options for invoice PDF rendering for this customer. */
      public Builder setRenderingOptions(EmptyParam renderingOptions) {
        this.renderingOptions = renderingOptions;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomField {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The name of the custom field. This may be up to 40 characters.
       */
      @SerializedName("name")
      Object name;

      /**
       * <strong>Required.</strong> The value of the custom field. This may be up to 140 characters.
       */
      @SerializedName("value")
      Object value;

      private CustomField(Map<String, Object> extraParams, Object name, Object value) {
        this.extraParams = extraParams;
        this.name = name;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object name;

        private Object value;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerUpdateParams.InvoiceSettings.CustomField build() {
          return new CustomerUpdateParams.InvoiceSettings.CustomField(
              this.extraParams, this.name, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerUpdateParams.InvoiceSettings.CustomField#extraParams} for the
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
         * map. See {@link CustomerUpdateParams.InvoiceSettings.CustomField#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the custom field. This may be up to 40 characters.
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the custom field. This may be up to 40 characters.
         */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /**
         * <strong>Required.</strong> The value of the custom field. This may be up to 140
         * characters.
         */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }

        /**
         * <strong>Required.</strong> The value of the custom field. This may be up to 140
         * characters.
         */
        public Builder setValue(EmptyParam value) {
          this.value = value;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RenderingOptions {
      /**
       * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
       * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
       * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code
       * exclude_tax} will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
       */
      @SerializedName("amount_tax_display")
      ApiRequestParams.EnumParam amountTaxDisplay;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** ID of the invoice rendering template to use for future invoices. */
      @SerializedName("template")
      Object template;

      private RenderingOptions(
          ApiRequestParams.EnumParam amountTaxDisplay,
          Map<String, Object> extraParams,
          Object template) {
        this.amountTaxDisplay = amountTaxDisplay;
        this.extraParams = extraParams;
        this.template = template;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam amountTaxDisplay;

        private Map<String, Object> extraParams;

        private Object template;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerUpdateParams.InvoiceSettings.RenderingOptions build() {
          return new CustomerUpdateParams.InvoiceSettings.RenderingOptions(
              this.amountTaxDisplay, this.extraParams, this.template);
        }

        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
         * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in invoice
         * PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive alike)
         * from invoice PDF amounts.
         */
        public Builder setAmountTaxDisplay(
            CustomerUpdateParams.InvoiceSettings.RenderingOptions.AmountTaxDisplay
                amountTaxDisplay) {
          this.amountTaxDisplay = amountTaxDisplay;
          return this;
        }

        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
         * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in invoice
         * PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive alike)
         * from invoice PDF amounts.
         */
        public Builder setAmountTaxDisplay(EmptyParam amountTaxDisplay) {
          this.amountTaxDisplay = amountTaxDisplay;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerUpdateParams.InvoiceSettings.RenderingOptions#extraParams} for
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
         * map. See {@link CustomerUpdateParams.InvoiceSettings.RenderingOptions#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** ID of the invoice rendering template to use for future invoices. */
        public Builder setTemplate(String template) {
          this.template = template;
          return this;
        }

        /** ID of the invoice rendering template to use for future invoices. */
        public Builder setTemplate(EmptyParam template) {
          this.template = template;
          return this;
        }
      }

      public enum AmountTaxDisplay implements ApiRequestParams.EnumParam {
        @SerializedName("exclude_tax")
        EXCLUDE_TAX("exclude_tax"),

        @SerializedName("include_inclusive_tax")
        INCLUDE_INCLUSIVE_TAX("include_inclusive_tax");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AmountTaxDisplay(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Shipping {
    /** <strong>Required.</strong> Customer shipping address. */
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

    /** <strong>Required.</strong> Customer name. */
    @SerializedName("name")
    Object name;

    /** Customer phone (including extension). */
    @SerializedName("phone")
    Object phone;

    private Shipping(Address address, Map<String, Object> extraParams, Object name, Object phone) {
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

      private Object name;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerUpdateParams.Shipping build() {
        return new CustomerUpdateParams.Shipping(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> Customer shipping address. */
      public Builder setAddress(CustomerUpdateParams.Shipping.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerUpdateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link CustomerUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Customer name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** <strong>Required.</strong> Customer name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** Customer phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Customer phone (including extension). */
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
       * A freeform text field for the country. However, in order to activate some tax features, the
       * format should be a two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
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
        public CustomerUpdateParams.Shipping.Address build() {
          return new CustomerUpdateParams.Shipping.Address(
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
         * A freeform text field for the country. However, in order to activate some tax features,
         * the format should be a two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * A freeform text field for the country. However, in order to activate some tax features,
         * the format should be a two-letter country code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerUpdateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link CustomerUpdateParams.Shipping.Address#extraParams} for the field
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
  @EqualsAndHashCode(callSuper = false)
  public static class Tax {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A recent IP address of the customer used for tax reporting and tax location inference. Stripe
     * recommends updating the IP address when a new PaymentMethod is attached or the address field
     * on the customer is updated. We recommend against updating this field more frequently since it
     * could result in unexpected tax location/reporting outcomes.
     */
    @SerializedName("ip_address")
    Object ipAddress;

    /**
     * A flag that indicates when Stripe should validate the customer tax location. Defaults to
     * {@code auto}.
     */
    @SerializedName("validate_location")
    ValidateLocation validateLocation;

    private Tax(
        Map<String, Object> extraParams, Object ipAddress, ValidateLocation validateLocation) {
      this.extraParams = extraParams;
      this.ipAddress = ipAddress;
      this.validateLocation = validateLocation;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object ipAddress;

      private ValidateLocation validateLocation;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerUpdateParams.Tax build() {
        return new CustomerUpdateParams.Tax(
            this.extraParams, this.ipAddress, this.validateLocation);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerUpdateParams.Tax#extraParams} for the field documentation.
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
       * See {@link CustomerUpdateParams.Tax#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A recent IP address of the customer used for tax reporting and tax location inference.
       * Stripe recommends updating the IP address when a new PaymentMethod is attached or the
       * address field on the customer is updated. We recommend against updating this field more
       * frequently since it could result in unexpected tax location/reporting outcomes.
       */
      public Builder setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
      }

      /**
       * A recent IP address of the customer used for tax reporting and tax location inference.
       * Stripe recommends updating the IP address when a new PaymentMethod is attached or the
       * address field on the customer is updated. We recommend against updating this field more
       * frequently since it could result in unexpected tax location/reporting outcomes.
       */
      public Builder setIpAddress(EmptyParam ipAddress) {
        this.ipAddress = ipAddress;
        return this;
      }

      /**
       * A flag that indicates when Stripe should validate the customer tax location. Defaults to
       * {@code auto}.
       */
      public Builder setValidateLocation(
          CustomerUpdateParams.Tax.ValidateLocation validateLocation) {
        this.validateLocation = validateLocation;
        return this;
      }
    }

    public enum ValidateLocation implements ApiRequestParams.EnumParam {
      @SerializedName("auto")
      AUTO("auto"),

      @SerializedName("deferred")
      DEFERRED("deferred"),

      @SerializedName("immediately")
      IMMEDIATELY("immediately");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ValidateLocation(String value) {
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

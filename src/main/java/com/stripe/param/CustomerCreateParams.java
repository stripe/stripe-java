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
public class CustomerCreateParams extends ApiRequestParams {
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
   * useful for searching and tracking. This may be up to <em>512 characters</em>.
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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The customer's full name or business name. */
  @SerializedName("name")
  String name;

  /** The sequence to be used on the customer's next invoice. Defaults to 1. */
  @SerializedName("next_invoice_sequence")
  Long nextInvoiceSequence;

  @SerializedName("payment_method")
  String paymentMethod;

  /** The customer's phone number. */
  @SerializedName("phone")
  String phone;

  /** Customer's preferred languages, ordered by preference. */
  @SerializedName("preferred_locales")
  List<String> preferredLocales;

  /**
   * The API ID of a promotion code to apply to the customer. The customer will have a discount
   * applied on all recurring payments. Charges you create through the API will not have the
   * discount.
   */
  @SerializedName("promotion_code")
  String promotionCode;

  /** The customer's shipping information. Appears on invoices emailed to this customer. */
  @SerializedName("shipping")
  Object shipping;

  @SerializedName("source")
  String source;

  /** Tax details about the customer. */
  @SerializedName("tax")
  Tax tax;

  /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
  @SerializedName("tax_exempt")
  ApiRequestParams.EnumParam taxExempt;

  /** The customer's tax IDs. */
  @SerializedName("tax_id_data")
  List<CustomerCreateParams.TaxIdData> taxIdData;

  /** ID of the test clock to attach to the customer. */
  @SerializedName("test_clock")
  String testClock;

  @SerializedName("validate")
  Boolean validate;

  private CustomerCreateParams(
      Object address,
      Long balance,
      CashBalance cashBalance,
      String coupon,
      String description,
      String email,
      List<String> expand,
      Map<String, Object> extraParams,
      String invoicePrefix,
      InvoiceSettings invoiceSettings,
      Object metadata,
      String name,
      Long nextInvoiceSequence,
      String paymentMethod,
      String phone,
      List<String> preferredLocales,
      String promotionCode,
      Object shipping,
      String source,
      Tax tax,
      ApiRequestParams.EnumParam taxExempt,
      List<CustomerCreateParams.TaxIdData> taxIdData,
      String testClock,
      Boolean validate) {
    this.address = address;
    this.balance = balance;
    this.cashBalance = cashBalance;
    this.coupon = coupon;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoicePrefix = invoicePrefix;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.name = name;
    this.nextInvoiceSequence = nextInvoiceSequence;
    this.paymentMethod = paymentMethod;
    this.phone = phone;
    this.preferredLocales = preferredLocales;
    this.promotionCode = promotionCode;
    this.shipping = shipping;
    this.source = source;
    this.tax = tax;
    this.taxExempt = taxExempt;
    this.taxIdData = taxIdData;
    this.testClock = testClock;
    this.validate = validate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object address;

    private Long balance;

    private CashBalance cashBalance;

    private String coupon;

    private String description;

    private String email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String invoicePrefix;

    private InvoiceSettings invoiceSettings;

    private Object metadata;

    private String name;

    private Long nextInvoiceSequence;

    private String paymentMethod;

    private String phone;

    private List<String> preferredLocales;

    private String promotionCode;

    private Object shipping;

    private String source;

    private Tax tax;

    private ApiRequestParams.EnumParam taxExempt;

    private List<CustomerCreateParams.TaxIdData> taxIdData;

    private String testClock;

    private Boolean validate;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerCreateParams build() {
      return new CustomerCreateParams(
          this.address,
          this.balance,
          this.cashBalance,
          this.coupon,
          this.description,
          this.email,
          this.expand,
          this.extraParams,
          this.invoicePrefix,
          this.invoiceSettings,
          this.metadata,
          this.name,
          this.nextInvoiceSequence,
          this.paymentMethod,
          this.phone,
          this.preferredLocales,
          this.promotionCode,
          this.shipping,
          this.source,
          this.tax,
          this.taxExempt,
          this.taxIdData,
          this.testClock,
          this.validate);
    }

    /** The customer's address. */
    public Builder setAddress(CustomerCreateParams.Address address) {
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
    public Builder setCashBalance(CustomerCreateParams.CashBalance cashBalance) {
      this.cashBalance = cashBalance;
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
     * useful for searching and tracking. This may be up to <em>512 characters</em>.
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
    // This should actually be fine
    public Builder setInvoicePrefix(Object invoicePrefix) {
      this.invoicePrefix = (String) invoicePrefix;
      return this;
    }

    // Deleting this is not fine

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerCreateParams#metadata} for the field documentation.
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
     * See {@link CustomerCreateParams#metadata} for the field documentation.
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

    /** The sequence to be used on the customer's next invoice. Defaults to 1. */
    public Builder setNextInvoiceSequence(Long nextInvoiceSequence) {
      this.nextInvoiceSequence = nextInvoiceSequence;
      return this;
    }

    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder setPaymentMethod(String paymentMethod, String itsFineToAddAnOverload) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** The customer's phone number. */
    public Builder setPhone(String phone, String ignoreMeThisWillBreakEverything) {
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

    /**
     * The API ID of a promotion code to apply to the customer. The customer will have a discount
     * applied on all recurring payments. Charges you create through the API will not have the
     * discount.
     */
    public Builder setPromotionCode(String promotionCode) {
      this.promotionCode = promotionCode;
      return this;
    }

    /** The customer's shipping information. Appears on invoices emailed to this customer. */
    public Builder setShipping(CustomerCreateParams.Shipping shipping) {
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

    /** Tax details about the customer. */
    public Builder setTax(CustomerCreateParams.Tax tax) {
      this.tax = tax;
      return this;
    }

    /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
    public Builder setTaxExempt(CustomerCreateParams.TaxExempt taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /** The customer's tax exemption. One of {@code none}, {@code exempt}, or {@code reverse}. */
    public Builder setTaxExempt(EmptyParam taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * Add an element to `taxIdData` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CustomerCreateParams#taxIdData} for the field documentation.
     */
    public Builder addTaxIdData(CustomerCreateParams.TaxIdData element) {
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
    public Builder addAllTaxIdData(List<CustomerCreateParams.TaxIdData> elements) {
      if (this.taxIdData == null) {
        this.taxIdData = new ArrayList<>();
      }
      this.taxIdData.addAll(elements);
      return this;
    }

    /** ID of the test clock to attach to the customer. */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }

    public Builder setValidate(Boolean validate) {
      this.validate = validate;
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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

  @Getter
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
      public CustomerCreateParams.CashBalance build() {
        return new CustomerCreateParams.CashBalance(this.extraParams, this.settings);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.CashBalance#extraParams} for the field documentation.
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
       * See {@link CustomerCreateParams.CashBalance#extraParams} for the field documentation.
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
      public Builder setSettings(CustomerCreateParams.CashBalance.Settings settings) {
        this.settings = settings;
        return this;
      }
    }

    @Getter
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
        public CustomerCreateParams.CashBalance.Settings build() {
          return new CustomerCreateParams.CashBalance.Settings(
              this.extraParams, this.reconciliationMode);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerCreateParams.CashBalance.Settings#extraParams} for the field
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
         * map. See {@link CustomerCreateParams.CashBalance.Settings#extraParams} for the field
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
            CustomerCreateParams.CashBalance.Settings.ReconciliationMode reconciliationMode) {
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

    /** Default options for invoice PDF rendering for this customer. */
    @SerializedName("rendering_options")
    Object renderingOptions;

    private InvoiceSettings(
        Object customFields,
        String defaultPaymentMethod,
        Map<String, Object> extraParams,
        String footer,
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

      private String defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private String footer;

      private Object renderingOptions;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerCreateParams.InvoiceSettings build() {
        return new CustomerCreateParams.InvoiceSettings(
            this.customFields,
            this.defaultPaymentMethod,
            this.extraParams,
            this.footer,
            this.renderingOptions);
      }

      /**
       * Add an element to `customFields` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CustomerCreateParams.InvoiceSettings#customFields} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addCustomField(CustomerCreateParams.InvoiceSettings.CustomField element) {
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
      public Builder addAllCustomField(
          List<CustomerCreateParams.InvoiceSettings.CustomField> elements) {
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
      public Builder setCustomFields(
          List<CustomerCreateParams.InvoiceSettings.CustomField> customFields) {
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

      /** Default options for invoice PDF rendering for this customer. */
      public Builder setRenderingOptions(
          CustomerCreateParams.InvoiceSettings.RenderingOptions renderingOptions) {
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
       * <strong>Required.</strong> The name of the custom field. This may be up to 30 characters.
       */
      @SerializedName("name")
      String name;

      /**
       * <strong>Required.</strong> The value of the custom field. This may be up to 30 characters.
       */
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

        /**
         * <strong>Required.</strong> The name of the custom field. This may be up to 30 characters.
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /**
         * <strong>Required.</strong> The value of the custom field. This may be up to 30
         * characters.
         */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }
      }
    }

    @Getter
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

      private RenderingOptions(
          ApiRequestParams.EnumParam amountTaxDisplay, Map<String, Object> extraParams) {
        this.amountTaxDisplay = amountTaxDisplay;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam amountTaxDisplay;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerCreateParams.InvoiceSettings.RenderingOptions build() {
          return new CustomerCreateParams.InvoiceSettings.RenderingOptions(
              this.amountTaxDisplay, this.extraParams);
        }

        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
         * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in invoice
         * PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive alike)
         * from invoice PDF amounts.
         */
        public Builder setAmountTaxDisplay(
            CustomerCreateParams.InvoiceSettings.RenderingOptions.AmountTaxDisplay
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
         * map. See {@link CustomerCreateParams.InvoiceSettings.RenderingOptions#extraParams} for
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
         * map. See {@link CustomerCreateParams.InvoiceSettings.RenderingOptions#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
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
      public CustomerCreateParams.Shipping build() {
        return new CustomerCreateParams.Shipping(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> Customer shipping address. */
      public Builder setAddress(CustomerCreateParams.Shipping.Address address) {
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

      /** <strong>Required.</strong> Customer name. */
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
     * {@code deferred}.
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
      public CustomerCreateParams.Tax build() {
        return new CustomerCreateParams.Tax(
            this.extraParams, this.ipAddress, this.validateLocation);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerCreateParams.Tax#extraParams} for the field documentation.
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
       * See {@link CustomerCreateParams.Tax#extraParams} for the field documentation.
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
       * {@code deferred}.
       */
      public Builder setValidateLocation(
          CustomerCreateParams.Tax.ValidateLocation validateLocation) {
        this.validateLocation = validateLocation;
        return this;
      }
    }

    public enum ValidateLocation implements ApiRequestParams.EnumParam {
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
     * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn}, {@code
     * ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bo_tin}, {@code br_cnpj},
     * {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb},
     * {@code ca_pst_sk}, {@code ca_qst}, {@code ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code
     * co_nit}, {@code cr_tin}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif},
     * {@code eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code hk_br}, {@code
     * hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code jp_cn},
     * {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code li_uid}, {@code
     * mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code no_vat}, {@code nz_gst},
     * {@code pe_ruc}, {@code ph_tin}, {@code ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code
     * ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code sg_uen}, {@code si_tin}, {@code sv_nit},
     * {@code th_vat}, {@code tr_tin}, {@code tw_vat}, {@code ua_vat}, {@code us_ein}, {@code
     * uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code za_vat}
     */
    @SerializedName("type")
    Type type;

    /** <strong>Required.</strong> Value of the tax ID. */
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
      public CustomerCreateParams.TaxIdData build() {
        return new CustomerCreateParams.TaxIdData(this.extraParams, this.type, this.value);
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
       * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn},
       * {@code ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bo_tin}, {@code
       * br_cnpj}, {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code
       * ca_pst_mb}, {@code ca_pst_sk}, {@code ca_qst}, {@code ch_vat}, {@code cl_tin}, {@code
       * cn_tin}, {@code co_nit}, {@code cr_tin}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin},
       * {@code es_cif}, {@code eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code
       * hk_br}, {@code hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat},
       * {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code
       * li_uid}, {@code mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code no_vat},
       * {@code nz_gst}, {@code pe_ruc}, {@code ph_tin}, {@code ro_tin}, {@code rs_pib}, {@code
       * ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code sg_uen}, {@code si_tin},
       * {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code tw_vat}, {@code ua_vat}, {@code
       * us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code za_vat}
       */
      public Builder setType(CustomerCreateParams.TaxIdData.Type type) {
        this.type = type;
        return this;
      }

      /** <strong>Required.</strong> Value of the tax ID. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("ad_nrt")
      AD_NRT("ad_nrt"),

      @SerializedName("ae_trn")
      AE_TRN("ae_trn"),

      @SerializedName("ar_cuit")
      AR_CUIT("ar_cuit"),

      @SerializedName("au_abn")
      AU_ABN("au_abn"),

      @SerializedName("au_arn")
      AU_ARN("au_arn"),

      @SerializedName("bg_uic")
      BG_UIC("bg_uic"),

      @SerializedName("bo_tin")
      BO_TIN("bo_tin"),

      @SerializedName("br_cnpj")
      BR_CNPJ("br_cnpj"),

      @SerializedName("br_cpf")
      BR_CPF("br_cpf"),

      @SerializedName("ca_bn")
      CA_BN("ca_bn"),

      @SerializedName("ca_gst_hst")
      CA_GST_HST("ca_gst_hst"),

      @SerializedName("ca_pst_bc")
      CA_PST_BC("ca_pst_bc"),

      @SerializedName("ca_pst_mb")
      CA_PST_MB("ca_pst_mb"),

      @SerializedName("ca_pst_sk")
      CA_PST_SK("ca_pst_sk"),

      @SerializedName("ca_qst")
      CA_QST("ca_qst"),

      @SerializedName("ch_vat")
      CH_VAT("ch_vat"),

      @SerializedName("cl_tin")
      CL_TIN("cl_tin"),

      @SerializedName("cn_tin")
      CN_TIN("cn_tin"),

      @SerializedName("co_nit")
      CO_NIT("co_nit"),

      @SerializedName("cr_tin")
      CR_TIN("cr_tin"),

      @SerializedName("do_rcn")
      DO_RCN("do_rcn"),

      @SerializedName("ec_ruc")
      EC_RUC("ec_ruc"),

      @SerializedName("eg_tin")
      EG_TIN("eg_tin"),

      @SerializedName("es_cif")
      ES_CIF("es_cif"),

      @SerializedName("eu_oss_vat")
      EU_OSS_VAT("eu_oss_vat"),

      @SerializedName("eu_vat")
      EU_VAT("eu_vat"),

      @SerializedName("gb_vat")
      GB_VAT("gb_vat"),

      @SerializedName("ge_vat")
      GE_VAT("ge_vat"),

      @SerializedName("hk_br")
      HK_BR("hk_br"),

      @SerializedName("hu_tin")
      HU_TIN("hu_tin"),

      @SerializedName("id_npwp")
      ID_NPWP("id_npwp"),

      @SerializedName("il_vat")
      IL_VAT("il_vat"),

      @SerializedName("in_gst")
      IN_GST("in_gst"),

      @SerializedName("is_vat")
      IS_VAT("is_vat"),

      @SerializedName("jp_cn")
      JP_CN("jp_cn"),

      @SerializedName("jp_rn")
      JP_RN("jp_rn"),

      @SerializedName("jp_trn")
      JP_TRN("jp_trn"),

      @SerializedName("ke_pin")
      KE_PIN("ke_pin"),

      @SerializedName("kr_brn")
      KR_BRN("kr_brn"),

      @SerializedName("li_uid")
      LI_UID("li_uid"),

      @SerializedName("mx_rfc")
      MX_RFC("mx_rfc"),

      @SerializedName("my_frp")
      MY_FRP("my_frp"),

      @SerializedName("my_itn")
      MY_ITN("my_itn"),

      @SerializedName("my_sst")
      MY_SST("my_sst"),

      @SerializedName("no_vat")
      NO_VAT("no_vat"),

      @SerializedName("nz_gst")
      NZ_GST("nz_gst"),

      @SerializedName("pe_ruc")
      PE_RUC("pe_ruc"),

      @SerializedName("ph_tin")
      PH_TIN("ph_tin"),

      @SerializedName("ro_tin")
      RO_TIN("ro_tin"),

      @SerializedName("rs_pib")
      RS_PIB("rs_pib"),

      @SerializedName("ru_inn")
      RU_INN("ru_inn"),

      @SerializedName("ru_kpp")
      RU_KPP("ru_kpp"),

      @SerializedName("sa_vat")
      SA_VAT("sa_vat"),

      @SerializedName("sg_gst")
      SG_GST("sg_gst"),

      @SerializedName("sg_uen")
      SG_UEN("sg_uen"),

      @SerializedName("si_tin")
      SI_TIN("si_tin"),

      @SerializedName("sv_nit")
      SV_NIT("sv_nit"),

      @SerializedName("th_vat")
      TH_VAT("th_vat"),

      @SerializedName("tr_tin")
      TR_TIN("tr_tin"),

      @SerializedName("tw_vat")
      TW_VAT("tw_vat"),

      @SerializedName("ua_vat")
      UA_VAT("ua_vat"),

      @SerializedName("us_ein")
      US_EIN("us_ein"),

      @SerializedName("uy_ruc")
      UY_RUC("uy_ruc"),

      @SerializedName("ve_rif")
      VE_RIF("ve_rif"),

      @SerializedName("vn_tin")
      VN_TIN("vn_tin"),

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

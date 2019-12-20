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
public class CustomerUpdateParams extends ApiRequestParams {
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
  Object coupon;

  /**
   * If you are using payment methods created via the PaymentMethods API, see the
   * [invoice_settings.default_payment_method](https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method)
   * parameter.
   *
   * <p>Provide the ID of a payment source already attached to this customer to make it this
   * customer's default payment source.
   *
   * <p>If you want to add a new payment source and make it the default, see the
   * [source](https://stripe.com/docs/api/customers/update#update_customer-source) property.
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
   * useful for searching and tracking. This may be up to *512 characters*.
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
   * A set of key-value pairs that you can attach to a customer object. It can be useful for storing
   * additional information about the customer in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The customer's full name or business name. */
  @SerializedName("name")
  Object name;

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

  /** The customer's tax exemption. One of `none`, `exempt`, or `reverse`. */
  @SerializedName("tax_exempt")
  EnumParam taxExempt;

  /**
   * Unix timestamp representing the end of the trial period the customer will get before being
   * charged for the first time. This will always overwrite any trials that might apply via a
   * subscribed plan. If set, trial_end will override the default trial period of the plan the
   * customer is being subscribed to. The special value `now` can be provided to end the customer's
   * trial immediately. Can be at most two years from `billing_cycle_anchor`.
   */
  @SerializedName("trial_end")
  Object trialEnd;

  private CustomerUpdateParams(
      Object address,
      Long balance,
      Object coupon,
      Object defaultSource,
      Object description,
      Object email,
      List<String> expand,
      Map<String, Object> extraParams,
      Object invoicePrefix,
      InvoiceSettings invoiceSettings,
      Map<String, String> metadata,
      Object name,
      Object phone,
      List<String> preferredLocales,
      Object shipping,
      Object source,
      EnumParam taxExempt,
      Object trialEnd) {
    this.address = address;
    this.balance = balance;
    this.coupon = coupon;
    this.defaultSource = defaultSource;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoicePrefix = invoicePrefix;
    this.invoiceSettings = invoiceSettings;
    this.metadata = metadata;
    this.name = name;
    this.phone = phone;
    this.preferredLocales = preferredLocales;
    this.shipping = shipping;
    this.source = source;
    this.taxExempt = taxExempt;
    this.trialEnd = trialEnd;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object address;

    private Long balance;

    private Object coupon;

    private Object defaultSource;

    private Object description;

    private Object email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object invoicePrefix;

    private InvoiceSettings invoiceSettings;

    private Map<String, String> metadata;

    private Object name;

    private Object phone;

    private List<String> preferredLocales;

    private Object shipping;

    private Object source;

    private EnumParam taxExempt;

    private Object trialEnd;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerUpdateParams build() {
      return new CustomerUpdateParams(
          this.address,
          this.balance,
          this.coupon,
          this.defaultSource,
          this.description,
          this.email,
          this.expand,
          this.extraParams,
          this.invoicePrefix,
          this.invoiceSettings,
          this.metadata,
          this.name,
          this.phone,
          this.preferredLocales,
          this.shipping,
          this.source,
          this.taxExempt,
          this.trialEnd);
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

    public Builder setCoupon(EmptyParam coupon) {
      this.coupon = coupon;
      return this;
    }

    /**
     * If you are using payment methods created via the PaymentMethods API, see the
     * [invoice_settings.default_payment_method](https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method)
     * parameter.
     *
     * <p>Provide the ID of a payment source already attached to this customer to make it this
     * customer's default payment source.
     *
     * <p>If you want to add a new payment source and make it the default, see the
     * [source](https://stripe.com/docs/api/customers/update#update_customer-source) property.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * If you are using payment methods created via the PaymentMethods API, see the
     * [invoice_settings.default_payment_method](https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method)
     * parameter.
     *
     * <p>Provide the ID of a payment source already attached to this customer to make it this
     * customer's default payment source.
     *
     * <p>If you want to add a new payment source and make it the default, see the
     * [source](https://stripe.com/docs/api/customers/update#update_customer-source) property.
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
     * useful for searching and tracking. This may be up to *512 characters*.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be
     * useful for searching and tracking. This may be up to *512 characters*.
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
    public Builder setInvoiceSettings(InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CustomerUpdateParams#metadata} for the field documentation.
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
     * See {@link CustomerUpdateParams#metadata} for the field documentation.
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

    /** The customer's full name or business name. */
    public Builder setName(EmptyParam name) {
      this.name = name;
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

    public Builder setSource(EmptyParam source) {
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
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. This will always overwrite any trials that might apply via a
     * subscribed plan. If set, trial_end will override the default trial period of the plan the
     * customer is being subscribed to. The special value `now` can be provided to end the
     * customer's trial immediately. Can be at most two years from `billing_cycle_anchor`.
     */
    public Builder setTrialEnd(TrialEnd trialEnd) {
      this.trialEnd = trialEnd;
      return this;
    }

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being
     * charged for the first time. This will always overwrite any trials that might apply via a
     * subscribed plan. If set, trial_end will override the default trial period of the plan the
     * customer is being subscribed to. The special value `now` can be provided to end the
     * customer's trial immediately. Can be at most two years from `billing_cycle_anchor`.
     */
    public Builder setTrialEnd(Long trialEnd) {
      this.trialEnd = trialEnd;
      return this;
    }
  }

  @Getter
  public static class Address {
    @SerializedName("city")
    Object city;

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

    @SerializedName("line1")
    Object line1;

    @SerializedName("line2")
    Object line2;

    @SerializedName("postal_code")
    Object postalCode;

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

      public Builder setCity(String city) {
        this.city = city;
        return this;
      }

      public Builder setCity(EmptyParam city) {
        this.city = city;
        return this;
      }

      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

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

      public Builder setLine1(String line1) {
        this.line1 = line1;
        return this;
      }

      public Builder setLine1(EmptyParam line1) {
        this.line1 = line1;
        return this;
      }

      public Builder setLine2(String line2) {
        this.line2 = line2;
        return this;
      }

      public Builder setLine2(EmptyParam line2) {
        this.line2 = line2;
        return this;
      }

      public Builder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      public Builder setPostalCode(EmptyParam postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      public Builder setState(String state) {
        this.state = state;
        return this;
      }

      public Builder setState(EmptyParam state) {
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

    private InvoiceSettings(
        Object customFields,
        Object defaultPaymentMethod,
        Map<String, Object> extraParams,
        Object footer) {
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

      private Object defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private Object footer;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceSettings build() {
        return new InvoiceSettings(
            this.customFields, this.defaultPaymentMethod, this.extraParams, this.footer);
      }

      /**
       * Add an element to `customFields` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * CustomerUpdateParams.InvoiceSettings#customFields} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addCustomField(CustomField element) {
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
      public Builder addAllCustomField(List<CustomField> elements) {
        if (this.customFields == null || this.customFields instanceof EmptyParam) {
          this.customFields = new ArrayList<CustomerUpdateParams.InvoiceSettings.CustomField>();
        }
        ((List<CustomerUpdateParams.InvoiceSettings.CustomField>) this.customFields)
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
      Object name;

      /** The value of the custom field. This may be up to 30 characters. */
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
        public CustomField build() {
          return new CustomField(this.extraParams, this.name, this.value);
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

        /** The name of the custom field. This may be up to 30 characters. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** The name of the custom field. This may be up to 30 characters. */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /** The value of the custom field. This may be up to 30 characters. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }

        /** The value of the custom field. This may be up to 30 characters. */
        public Builder setValue(EmptyParam value) {
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

      /** Customer name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Customer name. */
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
    public static class Address {
      @SerializedName("city")
      Object city;

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

      @SerializedName("line1")
      Object line1;

      @SerializedName("line2")
      Object line2;

      @SerializedName("postal_code")
      Object postalCode;

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

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

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

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
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

  public enum TrialEnd implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TrialEnd(String value) {
      this.value = value;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountUpdateParams extends ApiRequestParams {
  /**
   * An Account Configuration which allows the Account to take on a key persona across Stripe
   * products.
   */
  @SerializedName("configuration")
  Configuration configuration;

  /**
   * The default contact email address for the Account. Required when configuring the account as a
   * merchant or recipient.
   */
  @SerializedName("contact_email")
  Object contactEmail;

  /**
   * A value indicating the Stripe dashboard this Account has access to. This will depend on which
   * configurations are enabled for this account.
   */
  @SerializedName("dashboard")
  Dashboard dashboard;

  /** Default values to be used on Account Configurations. */
  @SerializedName("defaults")
  Defaults defaults;

  /**
   * A descriptive name for the Account. This name will be surfaced in the Stripe Dashboard and on
   * any invoices sent to the Account.
   */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Information about the company, individual, and business represented by the Account. */
  @SerializedName("identity")
  Identity identity;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<AccountUpdateParams.Include> include;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  private AccountUpdateParams(
      Configuration configuration,
      Object contactEmail,
      Dashboard dashboard,
      Defaults defaults,
      Object displayName,
      Map<String, Object> extraParams,
      Identity identity,
      List<AccountUpdateParams.Include> include,
      Map<String, Object> metadata) {
    this.configuration = configuration;
    this.contactEmail = contactEmail;
    this.dashboard = dashboard;
    this.defaults = defaults;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.identity = identity;
    this.include = include;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Configuration configuration;

    private Object contactEmail;

    private Dashboard dashboard;

    private Defaults defaults;

    private Object displayName;

    private Map<String, Object> extraParams;

    private Identity identity;

    private List<AccountUpdateParams.Include> include;

    private Map<String, Object> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountUpdateParams build() {
      return new AccountUpdateParams(
          this.configuration,
          this.contactEmail,
          this.dashboard,
          this.defaults,
          this.displayName,
          this.extraParams,
          this.identity,
          this.include,
          this.metadata);
    }

    /**
     * An Account Configuration which allows the Account to take on a key persona across Stripe
     * products.
     */
    public Builder setConfiguration(AccountUpdateParams.Configuration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * The default contact email address for the Account. Required when configuring the account as a
     * merchant or recipient.
     */
    public Builder setContactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    /**
     * The default contact email address for the Account. Required when configuring the account as a
     * merchant or recipient.
     */
    public Builder setContactEmail(EmptyParam contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    /**
     * A value indicating the Stripe dashboard this Account has access to. This will depend on which
     * configurations are enabled for this account.
     */
    public Builder setDashboard(AccountUpdateParams.Dashboard dashboard) {
      this.dashboard = dashboard;
      return this;
    }

    /** Default values to be used on Account Configurations. */
    public Builder setDefaults(AccountUpdateParams.Defaults defaults) {
      this.defaults = defaults;
      return this;
    }

    /**
     * A descriptive name for the Account. This name will be surfaced in the Stripe Dashboard and on
     * any invoices sent to the Account.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A descriptive name for the Account. This name will be surfaced in the Stripe Dashboard and on
     * any invoices sent to the Account.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#extraParams} for the field documentation.
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
     * See {@link AccountUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information about the company, individual, and business represented by the Account. */
    public Builder setIdentity(AccountUpdateParams.Identity identity) {
      this.identity = identity;
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateParams#include} for the field documentation.
     */
    public Builder addInclude(AccountUpdateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountUpdateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<AccountUpdateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * AccountUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Configuration {
    /** The Customer Configuration allows the Account to be charged. */
    @SerializedName("customer")
    Customer customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The Merchant configuration allows the Account to act as a connected account and collect
     * payments facilitated by a Connect platform. You can add this configuration to your connected
     * accounts only if you’ve completed onboarding as a Connect platform.
     */
    @SerializedName("merchant")
    Merchant merchant;

    /** The Recipient Configuration allows the Account to receive funds. */
    @SerializedName("recipient")
    Recipient recipient;

    private Configuration(
        Customer customer,
        Map<String, Object> extraParams,
        Merchant merchant,
        Recipient recipient) {
      this.customer = customer;
      this.extraParams = extraParams;
      this.merchant = merchant;
      this.recipient = recipient;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Customer customer;

      private Map<String, Object> extraParams;

      private Merchant merchant;

      private Recipient recipient;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Configuration build() {
        return new AccountUpdateParams.Configuration(
            this.customer, this.extraParams, this.merchant, this.recipient);
      }

      /** The Customer Configuration allows the Account to be charged. */
      public Builder setCustomer(AccountUpdateParams.Configuration.Customer customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Configuration#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Configuration#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The Merchant configuration allows the Account to act as a connected account and collect
       * payments facilitated by a Connect platform. You can add this configuration to your
       * connected accounts only if you’ve completed onboarding as a Connect platform.
       */
      public Builder setMerchant(AccountUpdateParams.Configuration.Merchant merchant) {
        this.merchant = merchant;
        return this;
      }

      /** The Recipient Configuration allows the Account to receive funds. */
      public Builder setRecipient(AccountUpdateParams.Configuration.Recipient recipient) {
        this.recipient = recipient;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Customer {
      /**
       * Automatic indirect tax settings to be used when automatic tax calculation is enabled on the
       * customer's invoices, subscriptions, checkout sessions, or payment links. Surfaces if
       * automatic tax calculation is possible given the current customer location information.
       */
      @SerializedName("automatic_indirect_tax")
      AutomaticIndirectTax automaticIndirectTax;

      /**
       * Billing settings - default settings used for this customer in Billing flows such as
       * Invoices and Subscriptions.
       */
      @SerializedName("billing")
      Billing billing;

      /** Capabilities that have been requested on the Customer Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The customer's shipping information. Appears on invoices emailed to this customer. */
      @SerializedName("shipping")
      Shipping shipping;

      /**
       * ID of the test clock to attach to the customer. Can only be set on testmode Accounts, and
       * when the Customer Configuration is first set on an Account.
       */
      @SerializedName("test_clock")
      Object testClock;

      private Customer(
          AutomaticIndirectTax automaticIndirectTax,
          Billing billing,
          Capabilities capabilities,
          Map<String, Object> extraParams,
          Shipping shipping,
          Object testClock) {
        this.automaticIndirectTax = automaticIndirectTax;
        this.billing = billing;
        this.capabilities = capabilities;
        this.extraParams = extraParams;
        this.shipping = shipping;
        this.testClock = testClock;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AutomaticIndirectTax automaticIndirectTax;

        private Billing billing;

        private Capabilities capabilities;

        private Map<String, Object> extraParams;

        private Shipping shipping;

        private Object testClock;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Configuration.Customer build() {
          return new AccountUpdateParams.Configuration.Customer(
              this.automaticIndirectTax,
              this.billing,
              this.capabilities,
              this.extraParams,
              this.shipping,
              this.testClock);
        }

        /**
         * Automatic indirect tax settings to be used when automatic tax calculation is enabled on
         * the customer's invoices, subscriptions, checkout sessions, or payment links. Surfaces if
         * automatic tax calculation is possible given the current customer location information.
         */
        public Builder setAutomaticIndirectTax(
            AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax automaticIndirectTax) {
          this.automaticIndirectTax = automaticIndirectTax;
          return this;
        }

        /**
         * Billing settings - default settings used for this customer in Billing flows such as
         * Invoices and Subscriptions.
         */
        public Builder setBilling(AccountUpdateParams.Configuration.Customer.Billing billing) {
          this.billing = billing;
          return this;
        }

        /** Capabilities that have been requested on the Customer Configuration. */
        public Builder setCapabilities(
            AccountUpdateParams.Configuration.Customer.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Configuration.Customer#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Configuration.Customer#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The customer's shipping information. Appears on invoices emailed to this customer. */
        public Builder setShipping(AccountUpdateParams.Configuration.Customer.Shipping shipping) {
          this.shipping = shipping;
          return this;
        }

        /**
         * ID of the test clock to attach to the customer. Can only be set on testmode Accounts, and
         * when the Customer Configuration is first set on an Account.
         */
        public Builder setTestClock(String testClock) {
          this.testClock = testClock;
          return this;
        }

        /**
         * ID of the test clock to attach to the customer. Can only be set on testmode Accounts, and
         * when the Customer Configuration is first set on an Account.
         */
        public Builder setTestClock(EmptyParam testClock) {
          this.testClock = testClock;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AutomaticIndirectTax {
        /**
         * Describes the customer's tax exemption status, which is {@code none}, {@code exempt}, or
         * {@code reverse}. When set to reverse, invoice and receipt PDFs include the following
         * text: “Reverse charge”.
         */
        @SerializedName("exempt")
        Exempt exempt;

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
         * A recent IP address of the customer used for tax reporting and tax location inference.
         */
        @SerializedName("ip_address")
        Object ipAddress;

        /**
         * The data source used by Stripe Tax to identify the customer's location - defaults to
         * 'identity_address'. Will only be used for automatic tax calculation on the customer's
         * Invoices and Subscriptions.
         */
        @SerializedName("location_source")
        LocationSource locationSource;

        private AutomaticIndirectTax(
            Exempt exempt,
            Map<String, Object> extraParams,
            Object ipAddress,
            LocationSource locationSource) {
          this.exempt = exempt;
          this.extraParams = extraParams;
          this.ipAddress = ipAddress;
          this.locationSource = locationSource;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Exempt exempt;

          private Map<String, Object> extraParams;

          private Object ipAddress;

          private LocationSource locationSource;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax build() {
            return new AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax(
                this.exempt, this.extraParams, this.ipAddress, this.locationSource);
          }

          /**
           * Describes the customer's tax exemption status, which is {@code none}, {@code exempt},
           * or {@code reverse}. When set to reverse, invoice and receipt PDFs include the following
           * text: “Reverse charge”.
           */
          public Builder setExempt(
              AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax.Exempt exempt) {
            this.exempt = exempt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax#extraParams} for the
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
           * map. See {@link
           * AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax#extraParams} for the
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
           * A recent IP address of the customer used for tax reporting and tax location inference.
           */
          public Builder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /**
           * A recent IP address of the customer used for tax reporting and tax location inference.
           */
          public Builder setIpAddress(EmptyParam ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /**
           * The data source used by Stripe Tax to identify the customer's location - defaults to
           * 'identity_address'. Will only be used for automatic tax calculation on the customer's
           * Invoices and Subscriptions.
           */
          public Builder setLocationSource(
              AccountUpdateParams.Configuration.Customer.AutomaticIndirectTax.LocationSource
                  locationSource) {
            this.locationSource = locationSource;
            return this;
          }
        }

        public enum Exempt implements ApiRequestParams.EnumParam {
          @SerializedName("exempt")
          EXEMPT("exempt"),

          @SerializedName("none")
          NONE("none"),

          @SerializedName("reverse")
          REVERSE("reverse");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Exempt(String value) {
            this.value = value;
          }
        }

        public enum LocationSource implements ApiRequestParams.EnumParam {
          @SerializedName("identity_address")
          IDENTITY_ADDRESS("identity_address"),

          @SerializedName("ip_address")
          IP_ADDRESS("ip_address"),

          @SerializedName("shipping_address")
          SHIPPING_ADDRESS("shipping_address");

          @Getter(onMethod_ = {@Override})
          private final String value;

          LocationSource(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Billing {
        /**
         * ID of a payment method that’s attached to the customer, to be used as the customer’s
         * default payment method for invoices and subscriptions.
         */
        @SerializedName("default_payment_method")
        Object defaultPaymentMethod;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Default settings used on invoices for this customer. */
        @SerializedName("invoice")
        Invoice invoice;

        private Billing(
            Object defaultPaymentMethod, Map<String, Object> extraParams, Invoice invoice) {
          this.defaultPaymentMethod = defaultPaymentMethod;
          this.extraParams = extraParams;
          this.invoice = invoice;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object defaultPaymentMethod;

          private Map<String, Object> extraParams;

          private Invoice invoice;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Customer.Billing build() {
            return new AccountUpdateParams.Configuration.Customer.Billing(
                this.defaultPaymentMethod, this.extraParams, this.invoice);
          }

          /**
           * ID of a payment method that’s attached to the customer, to be used as the customer’s
           * default payment method for invoices and subscriptions.
           */
          public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
            this.defaultPaymentMethod = defaultPaymentMethod;
            return this;
          }

          /**
           * ID of a payment method that’s attached to the customer, to be used as the customer’s
           * default payment method for invoices and subscriptions.
           */
          public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
            this.defaultPaymentMethod = defaultPaymentMethod;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Customer.Billing#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Configuration.Customer.Billing#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Default settings used on invoices for this customer. */
          public Builder setInvoice(
              AccountUpdateParams.Configuration.Customer.Billing.Invoice invoice) {
            this.invoice = invoice;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Invoice {
          /**
           * The list of up to 4 default custom fields to be displayed on invoices for this
           * customer.
           */
          @SerializedName("custom_fields")
          List<AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField> customFields;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Default footer to be displayed on invoices for this customer. */
          @SerializedName("footer")
          Object footer;

          /** The sequence to be used on the customer's next invoice. Defaults to 1. */
          @SerializedName("next_sequence")
          Integer nextSequence;

          /**
           * The prefix for the customer used to generate unique invoice numbers. Must be 3–12
           * uppercase letters or numbers.
           */
          @SerializedName("prefix")
          Object prefix;

          /** Default options for invoice PDF rendering for this customer. */
          @SerializedName("rendering")
          Rendering rendering;

          private Invoice(
              List<AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField>
                  customFields,
              Map<String, Object> extraParams,
              Object footer,
              Integer nextSequence,
              Object prefix,
              Rendering rendering) {
            this.customFields = customFields;
            this.extraParams = extraParams;
            this.footer = footer;
            this.nextSequence = nextSequence;
            this.prefix = prefix;
            this.rendering = rendering;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField>
                customFields;

            private Map<String, Object> extraParams;

            private Object footer;

            private Integer nextSequence;

            private Object prefix;

            private Rendering rendering;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Customer.Billing.Invoice build() {
              return new AccountUpdateParams.Configuration.Customer.Billing.Invoice(
                  this.customFields,
                  this.extraParams,
                  this.footer,
                  this.nextSequence,
                  this.prefix,
                  this.rendering);
            }

            /**
             * Add an element to `customFields` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * AccountUpdateParams.Configuration.Customer.Billing.Invoice#customFields} for the
             * field documentation.
             */
            public Builder addCustomField(
                AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField element) {
              if (this.customFields == null) {
                this.customFields = new ArrayList<>();
              }
              this.customFields.add(element);
              return this;
            }

            /**
             * Add all elements to `customFields` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * AccountUpdateParams.Configuration.Customer.Billing.Invoice#customFields} for the
             * field documentation.
             */
            public Builder addAllCustomField(
                List<AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField>
                    elements) {
              if (this.customFields == null) {
                this.customFields = new ArrayList<>();
              }
              this.customFields.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Customer.Billing.Invoice#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Customer.Billing.Invoice#extraParams} for the field
             * documentation.
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

            /** The sequence to be used on the customer's next invoice. Defaults to 1. */
            public Builder setNextSequence(Integer nextSequence) {
              this.nextSequence = nextSequence;
              return this;
            }

            /**
             * The prefix for the customer used to generate unique invoice numbers. Must be 3–12
             * uppercase letters or numbers.
             */
            public Builder setPrefix(String prefix) {
              this.prefix = prefix;
              return this;
            }

            /**
             * The prefix for the customer used to generate unique invoice numbers. Must be 3–12
             * uppercase letters or numbers.
             */
            public Builder setPrefix(EmptyParam prefix) {
              this.prefix = prefix;
              return this;
            }

            /** Default options for invoice PDF rendering for this customer. */
            public Builder setRendering(
                AccountUpdateParams.Configuration.Customer.Billing.Invoice.Rendering rendering) {
              this.rendering = rendering;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class CustomField {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * <strong>Required.</strong> The name of the custom field. This may be up to 40
             * characters.
             */
            @SerializedName("name")
            Object name;

            /**
             * <strong>Required.</strong> The value of the custom field. This may be up to 140
             * characters. When updating, pass an empty string to remove previously-defined values.
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
              public AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField
                  build() {
                return new AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField(
                    this.extraParams, this.name, this.value);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Customer.Billing.Invoice.CustomField#extraParams}
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
               * <strong>Required.</strong> The name of the custom field. This may be up to 40
               * characters.
               */
              public Builder setName(String name) {
                this.name = name;
                return this;
              }

              /**
               * <strong>Required.</strong> The name of the custom field. This may be up to 40
               * characters.
               */
              public Builder setName(EmptyParam name) {
                this.name = name;
                return this;
              }

              /**
               * <strong>Required.</strong> The value of the custom field. This may be up to 140
               * characters. When updating, pass an empty string to remove previously-defined
               * values.
               */
              public Builder setValue(String value) {
                this.value = value;
                return this;
              }

              /**
               * <strong>Required.</strong> The value of the custom field. This may be up to 140
               * characters. When updating, pass an empty string to remove previously-defined
               * values.
               */
              public Builder setValue(EmptyParam value) {
                this.value = value;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Rendering {
            /**
             * How line-item prices and amounts will be displayed with respect to tax on invoice
             * PDFs. One of exclude_tax or include_inclusive_tax. include_inclusive_tax will include
             * inclusive tax (and exclude exclusive tax) in invoice PDF amounts. exclude_tax will
             * exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
             */
            @SerializedName("amount_tax_display")
            AmountTaxDisplay amountTaxDisplay;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** ID of the invoice rendering template to use for future invoices. */
            @SerializedName("template")
            Object template;

            private Rendering(
                AmountTaxDisplay amountTaxDisplay,
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
              private AmountTaxDisplay amountTaxDisplay;

              private Map<String, Object> extraParams;

              private Object template;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountUpdateParams.Configuration.Customer.Billing.Invoice.Rendering build() {
                return new AccountUpdateParams.Configuration.Customer.Billing.Invoice.Rendering(
                    this.amountTaxDisplay, this.extraParams, this.template);
              }

              /**
               * How line-item prices and amounts will be displayed with respect to tax on invoice
               * PDFs. One of exclude_tax or include_inclusive_tax. include_inclusive_tax will
               * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts.
               * exclude_tax will exclude all tax (inclusive and exclusive alike) from invoice PDF
               * amounts.
               */
              public Builder setAmountTaxDisplay(
                  AccountUpdateParams.Configuration.Customer.Billing.Invoice.Rendering
                          .AmountTaxDisplay
                      amountTaxDisplay) {
                this.amountTaxDisplay = amountTaxDisplay;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Customer.Billing.Invoice.Rendering#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Customer.Billing.Invoice.Rendering#extraParams}
               * for the field documentation.
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities {
        /**
         * Generates requirements for enabling automatic indirect tax calculation on this customer's
         * invoices or subscriptions. Recommended to request this capability if planning to enable
         * automatic tax calculation on this customer's invoices or subscriptions. Uses the {@code
         * location_source} field.
         */
        @SerializedName("automatic_indirect_tax")
        AutomaticIndirectTax automaticIndirectTax;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Capabilities(
            AutomaticIndirectTax automaticIndirectTax, Map<String, Object> extraParams) {
          this.automaticIndirectTax = automaticIndirectTax;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AutomaticIndirectTax automaticIndirectTax;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Customer.Capabilities build() {
            return new AccountUpdateParams.Configuration.Customer.Capabilities(
                this.automaticIndirectTax, this.extraParams);
          }

          /**
           * Generates requirements for enabling automatic indirect tax calculation on this
           * customer's invoices or subscriptions. Recommended to request this capability if
           * planning to enable automatic tax calculation on this customer's invoices or
           * subscriptions. Uses the {@code location_source} field.
           */
          public Builder setAutomaticIndirectTax(
              AccountUpdateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax
                  automaticIndirectTax) {
            this.automaticIndirectTax = automaticIndirectTax;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Customer.Capabilities#extraParams}
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
           * map. See {@link AccountUpdateParams.Configuration.Customer.Capabilities#extraParams}
           * for the field documentation.
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
        @EqualsAndHashCode(callSuper = false)
        public static class AutomaticIndirectTax {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AutomaticIndirectTax(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax
                build() {
              return new AccountUpdateParams.Configuration.Customer.Capabilities
                  .AutomaticIndirectTax(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Customer.Capabilities.AutomaticIndirectTax#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Shipping {
        /** Customer shipping address. */
        @SerializedName("address")
        Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Customer name. */
        @SerializedName("name")
        Object name;

        /** Customer phone (including extension). */
        @SerializedName("phone")
        Object phone;

        private Shipping(
            Address address, Map<String, Object> extraParams, Object name, Object phone) {
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
          public AccountUpdateParams.Configuration.Customer.Shipping build() {
            return new AccountUpdateParams.Configuration.Customer.Shipping(
                this.address, this.extraParams, this.name, this.phone);
          }

          /** Customer shipping address. */
          public Builder setAddress(
              AccountUpdateParams.Configuration.Customer.Shipping.Address address) {
            this.address = address;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Customer.Shipping#extraParams} for
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
           * map. See {@link AccountUpdateParams.Configuration.Customer.Shipping#extraParams} for
           * the field documentation.
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
          Country country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
              Country country,
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

            private Country country;

            private Map<String, Object> extraParams;

            private Object line1;

            private Object line2;

            private Object postalCode;

            private Object state;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Customer.Shipping.Address build() {
              return new AccountUpdateParams.Configuration.Customer.Shipping.Address(
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(
                AccountUpdateParams.Configuration.Customer.Shipping.Address.Country country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Customer.Shipping.Address#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Customer.Shipping.Address#extraParams} for the
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

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("ad")
            AD("ad"),

            @SerializedName("ae")
            AE("ae"),

            @SerializedName("af")
            AF("af"),

            @SerializedName("ag")
            AG("ag"),

            @SerializedName("ai")
            AI("ai"),

            @SerializedName("al")
            AL("al"),

            @SerializedName("am")
            AM("am"),

            @SerializedName("ao")
            AO("ao"),

            @SerializedName("aq")
            AQ("aq"),

            @SerializedName("ar")
            AR("ar"),

            @SerializedName("as")
            AS("as"),

            @SerializedName("at")
            AT("at"),

            @SerializedName("au")
            AU("au"),

            @SerializedName("aw")
            AW("aw"),

            @SerializedName("ax")
            AX("ax"),

            @SerializedName("az")
            AZ("az"),

            @SerializedName("ba")
            BA("ba"),

            @SerializedName("bb")
            BB("bb"),

            @SerializedName("bd")
            BD("bd"),

            @SerializedName("be")
            BE("be"),

            @SerializedName("bf")
            BF("bf"),

            @SerializedName("bg")
            BG("bg"),

            @SerializedName("bh")
            BH("bh"),

            @SerializedName("bi")
            BI("bi"),

            @SerializedName("bj")
            BJ("bj"),

            @SerializedName("bl")
            BL("bl"),

            @SerializedName("bm")
            BM("bm"),

            @SerializedName("bn")
            BN("bn"),

            @SerializedName("bo")
            BO("bo"),

            @SerializedName("bq")
            BQ("bq"),

            @SerializedName("br")
            BR("br"),

            @SerializedName("bs")
            BS("bs"),

            @SerializedName("bt")
            BT("bt"),

            @SerializedName("bv")
            BV("bv"),

            @SerializedName("bw")
            BW("bw"),

            @SerializedName("by")
            BY("by"),

            @SerializedName("bz")
            BZ("bz"),

            @SerializedName("ca")
            CA("ca"),

            @SerializedName("cc")
            CC("cc"),

            @SerializedName("cd")
            CD("cd"),

            @SerializedName("cf")
            CF("cf"),

            @SerializedName("cg")
            CG("cg"),

            @SerializedName("ch")
            CH("ch"),

            @SerializedName("ci")
            CI("ci"),

            @SerializedName("ck")
            CK("ck"),

            @SerializedName("cl")
            CL("cl"),

            @SerializedName("cm")
            CM("cm"),

            @SerializedName("cn")
            CN("cn"),

            @SerializedName("co")
            CO("co"),

            @SerializedName("cr")
            CR("cr"),

            @SerializedName("cu")
            CU("cu"),

            @SerializedName("cv")
            CV("cv"),

            @SerializedName("cw")
            CW("cw"),

            @SerializedName("cx")
            CX("cx"),

            @SerializedName("cy")
            CY("cy"),

            @SerializedName("cz")
            CZ("cz"),

            @SerializedName("de")
            DE("de"),

            @SerializedName("dj")
            DJ("dj"),

            @SerializedName("dk")
            DK("dk"),

            @SerializedName("dm")
            DM("dm"),

            @SerializedName("do")
            DO("do"),

            @SerializedName("dz")
            DZ("dz"),

            @SerializedName("ec")
            EC("ec"),

            @SerializedName("ee")
            EE("ee"),

            @SerializedName("eg")
            EG("eg"),

            @SerializedName("eh")
            EH("eh"),

            @SerializedName("er")
            ER("er"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("et")
            ET("et"),

            @SerializedName("fi")
            FI("fi"),

            @SerializedName("fj")
            FJ("fj"),

            @SerializedName("fk")
            FK("fk"),

            @SerializedName("fm")
            FM("fm"),

            @SerializedName("fo")
            FO("fo"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("ga")
            GA("ga"),

            @SerializedName("gb")
            GB("gb"),

            @SerializedName("gd")
            GD("gd"),

            @SerializedName("ge")
            GE("ge"),

            @SerializedName("gf")
            GF("gf"),

            @SerializedName("gg")
            GG("gg"),

            @SerializedName("gh")
            GH("gh"),

            @SerializedName("gi")
            GI("gi"),

            @SerializedName("gl")
            GL("gl"),

            @SerializedName("gm")
            GM("gm"),

            @SerializedName("gn")
            GN("gn"),

            @SerializedName("gp")
            GP("gp"),

            @SerializedName("gq")
            GQ("gq"),

            @SerializedName("gr")
            GR("gr"),

            @SerializedName("gs")
            GS("gs"),

            @SerializedName("gt")
            GT("gt"),

            @SerializedName("gu")
            GU("gu"),

            @SerializedName("gw")
            GW("gw"),

            @SerializedName("gy")
            GY("gy"),

            @SerializedName("hk")
            HK("hk"),

            @SerializedName("hm")
            HM("hm"),

            @SerializedName("hn")
            HN("hn"),

            @SerializedName("hr")
            HR("hr"),

            @SerializedName("ht")
            HT("ht"),

            @SerializedName("hu")
            HU("hu"),

            @SerializedName("id")
            ID("id"),

            @SerializedName("ie")
            IE("ie"),

            @SerializedName("il")
            IL("il"),

            @SerializedName("im")
            IM("im"),

            @SerializedName("in")
            IN("in"),

            @SerializedName("io")
            IO("io"),

            @SerializedName("iq")
            IQ("iq"),

            @SerializedName("ir")
            IR("ir"),

            @SerializedName("is")
            IS("is"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("je")
            JE("je"),

            @SerializedName("jm")
            JM("jm"),

            @SerializedName("jo")
            JO("jo"),

            @SerializedName("jp")
            JP("jp"),

            @SerializedName("ke")
            KE("ke"),

            @SerializedName("kg")
            KG("kg"),

            @SerializedName("kh")
            KH("kh"),

            @SerializedName("ki")
            KI("ki"),

            @SerializedName("km")
            KM("km"),

            @SerializedName("kn")
            KN("kn"),

            @SerializedName("kp")
            KP("kp"),

            @SerializedName("kr")
            KR("kr"),

            @SerializedName("kw")
            KW("kw"),

            @SerializedName("ky")
            KY("ky"),

            @SerializedName("kz")
            KZ("kz"),

            @SerializedName("la")
            LA("la"),

            @SerializedName("lb")
            LB("lb"),

            @SerializedName("lc")
            LC("lc"),

            @SerializedName("li")
            LI("li"),

            @SerializedName("lk")
            LK("lk"),

            @SerializedName("lr")
            LR("lr"),

            @SerializedName("ls")
            LS("ls"),

            @SerializedName("lt")
            LT("lt"),

            @SerializedName("lu")
            LU("lu"),

            @SerializedName("lv")
            LV("lv"),

            @SerializedName("ly")
            LY("ly"),

            @SerializedName("ma")
            MA("ma"),

            @SerializedName("mc")
            MC("mc"),

            @SerializedName("md")
            MD("md"),

            @SerializedName("me")
            ME("me"),

            @SerializedName("mf")
            MF("mf"),

            @SerializedName("mg")
            MG("mg"),

            @SerializedName("mh")
            MH("mh"),

            @SerializedName("mk")
            MK("mk"),

            @SerializedName("ml")
            ML("ml"),

            @SerializedName("mm")
            MM("mm"),

            @SerializedName("mn")
            MN("mn"),

            @SerializedName("mo")
            MO("mo"),

            @SerializedName("mp")
            MP("mp"),

            @SerializedName("mq")
            MQ("mq"),

            @SerializedName("mr")
            MR("mr"),

            @SerializedName("ms")
            MS("ms"),

            @SerializedName("mt")
            MT("mt"),

            @SerializedName("mu")
            MU("mu"),

            @SerializedName("mv")
            MV("mv"),

            @SerializedName("mw")
            MW("mw"),

            @SerializedName("mx")
            MX("mx"),

            @SerializedName("my")
            MY("my"),

            @SerializedName("mz")
            MZ("mz"),

            @SerializedName("na")
            NA("na"),

            @SerializedName("nc")
            NC("nc"),

            @SerializedName("ne")
            NE("ne"),

            @SerializedName("nf")
            NF("nf"),

            @SerializedName("ng")
            NG("ng"),

            @SerializedName("ni")
            NI("ni"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("no")
            NO("no"),

            @SerializedName("np")
            NP("np"),

            @SerializedName("nr")
            NR("nr"),

            @SerializedName("nu")
            NU("nu"),

            @SerializedName("nz")
            NZ("nz"),

            @SerializedName("om")
            OM("om"),

            @SerializedName("pa")
            PA("pa"),

            @SerializedName("pe")
            PE("pe"),

            @SerializedName("pf")
            PF("pf"),

            @SerializedName("pg")
            PG("pg"),

            @SerializedName("ph")
            PH("ph"),

            @SerializedName("pk")
            PK("pk"),

            @SerializedName("pl")
            PL("pl"),

            @SerializedName("pm")
            PM("pm"),

            @SerializedName("pn")
            PN("pn"),

            @SerializedName("pr")
            PR("pr"),

            @SerializedName("ps")
            PS("ps"),

            @SerializedName("pt")
            PT("pt"),

            @SerializedName("pw")
            PW("pw"),

            @SerializedName("py")
            PY("py"),

            @SerializedName("qa")
            QA("qa"),

            @SerializedName("qz")
            QZ("qz"),

            @SerializedName("re")
            RE("re"),

            @SerializedName("ro")
            RO("ro"),

            @SerializedName("rs")
            RS("rs"),

            @SerializedName("ru")
            RU("ru"),

            @SerializedName("rw")
            RW("rw"),

            @SerializedName("sa")
            SA("sa"),

            @SerializedName("sb")
            SB("sb"),

            @SerializedName("sc")
            SC("sc"),

            @SerializedName("sd")
            SD("sd"),

            @SerializedName("se")
            SE("se"),

            @SerializedName("sg")
            SG("sg"),

            @SerializedName("sh")
            SH("sh"),

            @SerializedName("si")
            SI("si"),

            @SerializedName("sj")
            SJ("sj"),

            @SerializedName("sk")
            SK("sk"),

            @SerializedName("sl")
            SL("sl"),

            @SerializedName("sm")
            SM("sm"),

            @SerializedName("sn")
            SN("sn"),

            @SerializedName("so")
            SO("so"),

            @SerializedName("sr")
            SR("sr"),

            @SerializedName("ss")
            SS("ss"),

            @SerializedName("st")
            ST("st"),

            @SerializedName("sv")
            SV("sv"),

            @SerializedName("sx")
            SX("sx"),

            @SerializedName("sy")
            SY("sy"),

            @SerializedName("sz")
            SZ("sz"),

            @SerializedName("tc")
            TC("tc"),

            @SerializedName("td")
            TD("td"),

            @SerializedName("tf")
            TF("tf"),

            @SerializedName("tg")
            TG("tg"),

            @SerializedName("th")
            TH("th"),

            @SerializedName("tj")
            TJ("tj"),

            @SerializedName("tk")
            TK("tk"),

            @SerializedName("tl")
            TL("tl"),

            @SerializedName("tm")
            TM("tm"),

            @SerializedName("tn")
            TN("tn"),

            @SerializedName("to")
            TO("to"),

            @SerializedName("tr")
            TR("tr"),

            @SerializedName("tt")
            TT("tt"),

            @SerializedName("tv")
            TV("tv"),

            @SerializedName("tw")
            TW("tw"),

            @SerializedName("tz")
            TZ("tz"),

            @SerializedName("ua")
            UA("ua"),

            @SerializedName("ug")
            UG("ug"),

            @SerializedName("um")
            UM("um"),

            @SerializedName("us")
            US("us"),

            @SerializedName("uy")
            UY("uy"),

            @SerializedName("uz")
            UZ("uz"),

            @SerializedName("va")
            VA("va"),

            @SerializedName("vc")
            VC("vc"),

            @SerializedName("ve")
            VE("ve"),

            @SerializedName("vg")
            VG("vg"),

            @SerializedName("vi")
            VI("vi"),

            @SerializedName("vn")
            VN("vn"),

            @SerializedName("vu")
            VU("vu"),

            @SerializedName("wf")
            WF("wf"),

            @SerializedName("ws")
            WS("ws"),

            @SerializedName("ye")
            YE("ye"),

            @SerializedName("yt")
            YT("yt"),

            @SerializedName("za")
            ZA("za"),

            @SerializedName("zm")
            ZM("zm"),

            @SerializedName("zw")
            ZW("zw");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Merchant {
      /** Settings used for Bacs debit payments. */
      @SerializedName("bacs_debit_payments")
      BacsDebitPayments bacsDebitPayments;

      /**
       * Settings used to apply the merchant's branding to email receipts, invoices, Checkout, and
       * other products.
       */
      @SerializedName("branding")
      Branding branding;

      /** Capabilities to request on the Merchant Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /** Card payments settings. */
      @SerializedName("card_payments")
      CardPayments cardPayments;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The merchant category code for the merchant. MCCs are used to classify businesses based on
       * the goods or services they provide.
       */
      @SerializedName("mcc")
      Object mcc;

      /** Statement descriptor. */
      @SerializedName("statement_descriptor")
      StatementDescriptor statementDescriptor;

      /** Publicly available contact information for sending support issues to. */
      @SerializedName("support")
      Support support;

      private Merchant(
          BacsDebitPayments bacsDebitPayments,
          Branding branding,
          Capabilities capabilities,
          CardPayments cardPayments,
          Map<String, Object> extraParams,
          Object mcc,
          StatementDescriptor statementDescriptor,
          Support support) {
        this.bacsDebitPayments = bacsDebitPayments;
        this.branding = branding;
        this.capabilities = capabilities;
        this.cardPayments = cardPayments;
        this.extraParams = extraParams;
        this.mcc = mcc;
        this.statementDescriptor = statementDescriptor;
        this.support = support;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BacsDebitPayments bacsDebitPayments;

        private Branding branding;

        private Capabilities capabilities;

        private CardPayments cardPayments;

        private Map<String, Object> extraParams;

        private Object mcc;

        private StatementDescriptor statementDescriptor;

        private Support support;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Configuration.Merchant build() {
          return new AccountUpdateParams.Configuration.Merchant(
              this.bacsDebitPayments,
              this.branding,
              this.capabilities,
              this.cardPayments,
              this.extraParams,
              this.mcc,
              this.statementDescriptor,
              this.support);
        }

        /** Settings used for Bacs debit payments. */
        public Builder setBacsDebitPayments(
            AccountUpdateParams.Configuration.Merchant.BacsDebitPayments bacsDebitPayments) {
          this.bacsDebitPayments = bacsDebitPayments;
          return this;
        }

        /**
         * Settings used to apply the merchant's branding to email receipts, invoices, Checkout, and
         * other products.
         */
        public Builder setBranding(AccountUpdateParams.Configuration.Merchant.Branding branding) {
          this.branding = branding;
          return this;
        }

        /** Capabilities to request on the Merchant Configuration. */
        public Builder setCapabilities(
            AccountUpdateParams.Configuration.Merchant.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /** Card payments settings. */
        public Builder setCardPayments(
            AccountUpdateParams.Configuration.Merchant.CardPayments cardPayments) {
          this.cardPayments = cardPayments;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Configuration.Merchant#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Configuration.Merchant#extraParams} for the field
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
         * The merchant category code for the merchant. MCCs are used to classify businesses based
         * on the goods or services they provide.
         */
        public Builder setMcc(String mcc) {
          this.mcc = mcc;
          return this;
        }

        /**
         * The merchant category code for the merchant. MCCs are used to classify businesses based
         * on the goods or services they provide.
         */
        public Builder setMcc(EmptyParam mcc) {
          this.mcc = mcc;
          return this;
        }

        /** Statement descriptor. */
        public Builder setStatementDescriptor(
            AccountUpdateParams.Configuration.Merchant.StatementDescriptor statementDescriptor) {
          this.statementDescriptor = statementDescriptor;
          return this;
        }

        /** Publicly available contact information for sending support issues to. */
        public Builder setSupport(AccountUpdateParams.Configuration.Merchant.Support support) {
          this.support = support;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BacsDebitPayments {
        /** Display name for Bacs debit payments. */
        @SerializedName("display_name")
        Object displayName;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private BacsDebitPayments(Object displayName, Map<String, Object> extraParams) {
          this.displayName = displayName;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object displayName;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Merchant.BacsDebitPayments build() {
            return new AccountUpdateParams.Configuration.Merchant.BacsDebitPayments(
                this.displayName, this.extraParams);
          }

          /** Display name for Bacs debit payments. */
          public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
          }

          /** Display name for Bacs debit payments. */
          public Builder setDisplayName(EmptyParam displayName) {
            this.displayName = displayName;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Configuration.Merchant.BacsDebitPayments#extraParams} for the field
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
           * map. See {@link
           * AccountUpdateParams.Configuration.Merchant.BacsDebitPayments#extraParams} for the field
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
      @EqualsAndHashCode(callSuper = false)
      public static class Branding {
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
         * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>:
         * An icon for the merchant. Must be square and at least 128px x 128px.
         */
        @SerializedName("icon")
        Object icon;

        /**
         * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>:
         * A logo for the merchant that will be used in Checkout instead of the icon and without the
         * merchant's name next to it if provided. Must be at least 128px x 128px.
         */
        @SerializedName("logo")
        Object logo;

        /** A CSS hex color value representing the primary branding color for the merchant. */
        @SerializedName("primary_color")
        Object primaryColor;

        /** A CSS hex color value representing the secondary branding color for the merchant. */
        @SerializedName("secondary_color")
        Object secondaryColor;

        private Branding(
            Map<String, Object> extraParams,
            Object icon,
            Object logo,
            Object primaryColor,
            Object secondaryColor) {
          this.extraParams = extraParams;
          this.icon = icon;
          this.logo = logo;
          this.primaryColor = primaryColor;
          this.secondaryColor = secondaryColor;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object icon;

          private Object logo;

          private Object primaryColor;

          private Object secondaryColor;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Merchant.Branding build() {
            return new AccountUpdateParams.Configuration.Merchant.Branding(
                this.extraParams, this.icon, this.logo, this.primaryColor, this.secondaryColor);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Merchant.Branding#extraParams} for
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
           * map. See {@link AccountUpdateParams.Configuration.Merchant.Branding#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file
           * upload</a>: An icon for the merchant. Must be square and at least 128px x 128px.
           */
          public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
          }

          /**
           * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file
           * upload</a>: An icon for the merchant. Must be square and at least 128px x 128px.
           */
          public Builder setIcon(EmptyParam icon) {
            this.icon = icon;
            return this;
          }

          /**
           * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file
           * upload</a>: A logo for the merchant that will be used in Checkout instead of the icon
           * and without the merchant's name next to it if provided. Must be at least 128px x 128px.
           */
          public Builder setLogo(String logo) {
            this.logo = logo;
            return this;
          }

          /**
           * ID of a <a href="https://docs.stripe.com/api/persons/update#create_file">file
           * upload</a>: A logo for the merchant that will be used in Checkout instead of the icon
           * and without the merchant's name next to it if provided. Must be at least 128px x 128px.
           */
          public Builder setLogo(EmptyParam logo) {
            this.logo = logo;
            return this;
          }

          /** A CSS hex color value representing the primary branding color for the merchant. */
          public Builder setPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
            return this;
          }

          /** A CSS hex color value representing the primary branding color for the merchant. */
          public Builder setPrimaryColor(EmptyParam primaryColor) {
            this.primaryColor = primaryColor;
            return this;
          }

          /** A CSS hex color value representing the secondary branding color for the merchant. */
          public Builder setSecondaryColor(String secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
          }

          /** A CSS hex color value representing the secondary branding color for the merchant. */
          public Builder setSecondaryColor(EmptyParam secondaryColor) {
            this.secondaryColor = secondaryColor;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities {
        /** Allow the merchant to process ACH debit payments. */
        @SerializedName("ach_debit_payments")
        AchDebitPayments achDebitPayments;

        /** Allow the merchant to process ACSS debit payments. */
        @SerializedName("acss_debit_payments")
        AcssDebitPayments acssDebitPayments;

        /** Allow the merchant to process Affirm payments. */
        @SerializedName("affirm_payments")
        AffirmPayments affirmPayments;

        /** Allow the merchant to process Afterpay/Clearpay payments. */
        @SerializedName("afterpay_clearpay_payments")
        AfterpayClearpayPayments afterpayClearpayPayments;

        /** Allow the merchant to process Alma payments. */
        @SerializedName("alma_payments")
        AlmaPayments almaPayments;

        /** Allow the merchant to process Amazon Pay payments. */
        @SerializedName("amazon_pay_payments")
        AmazonPayPayments amazonPayPayments;

        /** Allow the merchant to process Australian BECS Direct Debit payments. */
        @SerializedName("au_becs_debit_payments")
        AuBecsDebitPayments auBecsDebitPayments;

        /** Allow the merchant to process BACS Direct Debit payments. */
        @SerializedName("bacs_debit_payments")
        BacsDebitPayments bacsDebitPayments;

        /** Allow the merchant to process Bancontact payments. */
        @SerializedName("bancontact_payments")
        BancontactPayments bancontactPayments;

        /** Allow the merchant to process BLIK payments. */
        @SerializedName("blik_payments")
        BlikPayments blikPayments;

        /** Allow the merchant to process Boleto payments. */
        @SerializedName("boleto_payments")
        BoletoPayments boletoPayments;

        /** Allow the merchant to collect card payments. */
        @SerializedName("card_payments")
        CardPayments cardPayments;

        /** Allow the merchant to process Cartes Bancaires payments. */
        @SerializedName("cartes_bancaires_payments")
        CartesBancairesPayments cartesBancairesPayments;

        /** Allow the merchant to process Cash App payments. */
        @SerializedName("cashapp_payments")
        CashappPayments cashappPayments;

        /** Allow the merchant to process EPS payments. */
        @SerializedName("eps_payments")
        EpsPayments epsPayments;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Allow the merchant to process FPX payments. */
        @SerializedName("fpx_payments")
        FpxPayments fpxPayments;

        /** Allow the merchant to process UK bank transfer payments. */
        @SerializedName("gb_bank_transfer_payments")
        GbBankTransferPayments gbBankTransferPayments;

        /** Allow the merchant to process GrabPay payments. */
        @SerializedName("grabpay_payments")
        GrabpayPayments grabpayPayments;

        /** Allow the merchant to process iDEAL payments. */
        @SerializedName("ideal_payments")
        IdealPayments idealPayments;

        /** Allow the merchant to process JCB card payments. */
        @SerializedName("jcb_payments")
        JcbPayments jcbPayments;

        /** Allow the merchant to process Japanese bank transfer payments. */
        @SerializedName("jp_bank_transfer_payments")
        JpBankTransferPayments jpBankTransferPayments;

        /** Allow the merchant to process Kakao Pay payments. */
        @SerializedName("kakao_pay_payments")
        KakaoPayPayments kakaoPayPayments;

        /** Allow the merchant to process Klarna payments. */
        @SerializedName("klarna_payments")
        KlarnaPayments klarnaPayments;

        /** Allow the merchant to process Konbini convenience store payments. */
        @SerializedName("konbini_payments")
        KonbiniPayments konbiniPayments;

        /** Allow the merchant to process Korean card payments. */
        @SerializedName("kr_card_payments")
        KrCardPayments krCardPayments;

        /** Allow the merchant to process Link payments. */
        @SerializedName("link_payments")
        LinkPayments linkPayments;

        /** Allow the merchant to process MobilePay payments. */
        @SerializedName("mobilepay_payments")
        MobilepayPayments mobilepayPayments;

        /** Allow the merchant to process Multibanco payments. */
        @SerializedName("multibanco_payments")
        MultibancoPayments multibancoPayments;

        /** Allow the merchant to process Mexican bank transfer payments. */
        @SerializedName("mx_bank_transfer_payments")
        MxBankTransferPayments mxBankTransferPayments;

        /** Allow the merchant to process Naver Pay payments. */
        @SerializedName("naver_pay_payments")
        NaverPayPayments naverPayPayments;

        /** Allow the merchant to process OXXO payments. */
        @SerializedName("oxxo_payments")
        OxxoPayments oxxoPayments;

        /** Allow the merchant to process Przelewy24 (P24) payments. */
        @SerializedName("p24_payments")
        P24Payments p24Payments;

        /** Allow the merchant to process Pay by Bank payments. */
        @SerializedName("pay_by_bank_payments")
        PayByBankPayments payByBankPayments;

        /** Allow the merchant to process PAYCO payments. */
        @SerializedName("payco_payments")
        PaycoPayments paycoPayments;

        /** Allow the merchant to process PayNow payments. */
        @SerializedName("paynow_payments")
        PaynowPayments paynowPayments;

        /** Allow the merchant to process PromptPay payments. */
        @SerializedName("promptpay_payments")
        PromptpayPayments promptpayPayments;

        /** Allow the merchant to process Revolut Pay payments. */
        @SerializedName("revolut_pay_payments")
        RevolutPayPayments revolutPayPayments;

        /** Allow the merchant to process Samsung Pay payments. */
        @SerializedName("samsung_pay_payments")
        SamsungPayPayments samsungPayPayments;

        /** Allow the merchant to process SEPA bank transfer payments. */
        @SerializedName("sepa_bank_transfer_payments")
        SepaBankTransferPayments sepaBankTransferPayments;

        /** Allow the merchant to process SEPA Direct Debit payments. */
        @SerializedName("sepa_debit_payments")
        SepaDebitPayments sepaDebitPayments;

        /** Allow the merchant to process Swish payments. */
        @SerializedName("swish_payments")
        SwishPayments swishPayments;

        /** Allow the merchant to process TWINT payments. */
        @SerializedName("twint_payments")
        TwintPayments twintPayments;

        /** Allow the merchant to process US bank transfer payments. */
        @SerializedName("us_bank_transfer_payments")
        UsBankTransferPayments usBankTransferPayments;

        /** Allow the merchant to process Zip payments. */
        @SerializedName("zip_payments")
        ZipPayments zipPayments;

        private Capabilities(
            AchDebitPayments achDebitPayments,
            AcssDebitPayments acssDebitPayments,
            AffirmPayments affirmPayments,
            AfterpayClearpayPayments afterpayClearpayPayments,
            AlmaPayments almaPayments,
            AmazonPayPayments amazonPayPayments,
            AuBecsDebitPayments auBecsDebitPayments,
            BacsDebitPayments bacsDebitPayments,
            BancontactPayments bancontactPayments,
            BlikPayments blikPayments,
            BoletoPayments boletoPayments,
            CardPayments cardPayments,
            CartesBancairesPayments cartesBancairesPayments,
            CashappPayments cashappPayments,
            EpsPayments epsPayments,
            Map<String, Object> extraParams,
            FpxPayments fpxPayments,
            GbBankTransferPayments gbBankTransferPayments,
            GrabpayPayments grabpayPayments,
            IdealPayments idealPayments,
            JcbPayments jcbPayments,
            JpBankTransferPayments jpBankTransferPayments,
            KakaoPayPayments kakaoPayPayments,
            KlarnaPayments klarnaPayments,
            KonbiniPayments konbiniPayments,
            KrCardPayments krCardPayments,
            LinkPayments linkPayments,
            MobilepayPayments mobilepayPayments,
            MultibancoPayments multibancoPayments,
            MxBankTransferPayments mxBankTransferPayments,
            NaverPayPayments naverPayPayments,
            OxxoPayments oxxoPayments,
            P24Payments p24Payments,
            PayByBankPayments payByBankPayments,
            PaycoPayments paycoPayments,
            PaynowPayments paynowPayments,
            PromptpayPayments promptpayPayments,
            RevolutPayPayments revolutPayPayments,
            SamsungPayPayments samsungPayPayments,
            SepaBankTransferPayments sepaBankTransferPayments,
            SepaDebitPayments sepaDebitPayments,
            SwishPayments swishPayments,
            TwintPayments twintPayments,
            UsBankTransferPayments usBankTransferPayments,
            ZipPayments zipPayments) {
          this.achDebitPayments = achDebitPayments;
          this.acssDebitPayments = acssDebitPayments;
          this.affirmPayments = affirmPayments;
          this.afterpayClearpayPayments = afterpayClearpayPayments;
          this.almaPayments = almaPayments;
          this.amazonPayPayments = amazonPayPayments;
          this.auBecsDebitPayments = auBecsDebitPayments;
          this.bacsDebitPayments = bacsDebitPayments;
          this.bancontactPayments = bancontactPayments;
          this.blikPayments = blikPayments;
          this.boletoPayments = boletoPayments;
          this.cardPayments = cardPayments;
          this.cartesBancairesPayments = cartesBancairesPayments;
          this.cashappPayments = cashappPayments;
          this.epsPayments = epsPayments;
          this.extraParams = extraParams;
          this.fpxPayments = fpxPayments;
          this.gbBankTransferPayments = gbBankTransferPayments;
          this.grabpayPayments = grabpayPayments;
          this.idealPayments = idealPayments;
          this.jcbPayments = jcbPayments;
          this.jpBankTransferPayments = jpBankTransferPayments;
          this.kakaoPayPayments = kakaoPayPayments;
          this.klarnaPayments = klarnaPayments;
          this.konbiniPayments = konbiniPayments;
          this.krCardPayments = krCardPayments;
          this.linkPayments = linkPayments;
          this.mobilepayPayments = mobilepayPayments;
          this.multibancoPayments = multibancoPayments;
          this.mxBankTransferPayments = mxBankTransferPayments;
          this.naverPayPayments = naverPayPayments;
          this.oxxoPayments = oxxoPayments;
          this.p24Payments = p24Payments;
          this.payByBankPayments = payByBankPayments;
          this.paycoPayments = paycoPayments;
          this.paynowPayments = paynowPayments;
          this.promptpayPayments = promptpayPayments;
          this.revolutPayPayments = revolutPayPayments;
          this.samsungPayPayments = samsungPayPayments;
          this.sepaBankTransferPayments = sepaBankTransferPayments;
          this.sepaDebitPayments = sepaDebitPayments;
          this.swishPayments = swishPayments;
          this.twintPayments = twintPayments;
          this.usBankTransferPayments = usBankTransferPayments;
          this.zipPayments = zipPayments;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AchDebitPayments achDebitPayments;

          private AcssDebitPayments acssDebitPayments;

          private AffirmPayments affirmPayments;

          private AfterpayClearpayPayments afterpayClearpayPayments;

          private AlmaPayments almaPayments;

          private AmazonPayPayments amazonPayPayments;

          private AuBecsDebitPayments auBecsDebitPayments;

          private BacsDebitPayments bacsDebitPayments;

          private BancontactPayments bancontactPayments;

          private BlikPayments blikPayments;

          private BoletoPayments boletoPayments;

          private CardPayments cardPayments;

          private CartesBancairesPayments cartesBancairesPayments;

          private CashappPayments cashappPayments;

          private EpsPayments epsPayments;

          private Map<String, Object> extraParams;

          private FpxPayments fpxPayments;

          private GbBankTransferPayments gbBankTransferPayments;

          private GrabpayPayments grabpayPayments;

          private IdealPayments idealPayments;

          private JcbPayments jcbPayments;

          private JpBankTransferPayments jpBankTransferPayments;

          private KakaoPayPayments kakaoPayPayments;

          private KlarnaPayments klarnaPayments;

          private KonbiniPayments konbiniPayments;

          private KrCardPayments krCardPayments;

          private LinkPayments linkPayments;

          private MobilepayPayments mobilepayPayments;

          private MultibancoPayments multibancoPayments;

          private MxBankTransferPayments mxBankTransferPayments;

          private NaverPayPayments naverPayPayments;

          private OxxoPayments oxxoPayments;

          private P24Payments p24Payments;

          private PayByBankPayments payByBankPayments;

          private PaycoPayments paycoPayments;

          private PaynowPayments paynowPayments;

          private PromptpayPayments promptpayPayments;

          private RevolutPayPayments revolutPayPayments;

          private SamsungPayPayments samsungPayPayments;

          private SepaBankTransferPayments sepaBankTransferPayments;

          private SepaDebitPayments sepaDebitPayments;

          private SwishPayments swishPayments;

          private TwintPayments twintPayments;

          private UsBankTransferPayments usBankTransferPayments;

          private ZipPayments zipPayments;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Merchant.Capabilities build() {
            return new AccountUpdateParams.Configuration.Merchant.Capabilities(
                this.achDebitPayments,
                this.acssDebitPayments,
                this.affirmPayments,
                this.afterpayClearpayPayments,
                this.almaPayments,
                this.amazonPayPayments,
                this.auBecsDebitPayments,
                this.bacsDebitPayments,
                this.bancontactPayments,
                this.blikPayments,
                this.boletoPayments,
                this.cardPayments,
                this.cartesBancairesPayments,
                this.cashappPayments,
                this.epsPayments,
                this.extraParams,
                this.fpxPayments,
                this.gbBankTransferPayments,
                this.grabpayPayments,
                this.idealPayments,
                this.jcbPayments,
                this.jpBankTransferPayments,
                this.kakaoPayPayments,
                this.klarnaPayments,
                this.konbiniPayments,
                this.krCardPayments,
                this.linkPayments,
                this.mobilepayPayments,
                this.multibancoPayments,
                this.mxBankTransferPayments,
                this.naverPayPayments,
                this.oxxoPayments,
                this.p24Payments,
                this.payByBankPayments,
                this.paycoPayments,
                this.paynowPayments,
                this.promptpayPayments,
                this.revolutPayPayments,
                this.samsungPayPayments,
                this.sepaBankTransferPayments,
                this.sepaDebitPayments,
                this.swishPayments,
                this.twintPayments,
                this.usBankTransferPayments,
                this.zipPayments);
          }

          /** Allow the merchant to process ACH debit payments. */
          public Builder setAchDebitPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AchDebitPayments
                  achDebitPayments) {
            this.achDebitPayments = achDebitPayments;
            return this;
          }

          /** Allow the merchant to process ACSS debit payments. */
          public Builder setAcssDebitPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AcssDebitPayments
                  acssDebitPayments) {
            this.acssDebitPayments = acssDebitPayments;
            return this;
          }

          /** Allow the merchant to process Affirm payments. */
          public Builder setAffirmPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AffirmPayments
                  affirmPayments) {
            this.affirmPayments = affirmPayments;
            return this;
          }

          /** Allow the merchant to process Afterpay/Clearpay payments. */
          public Builder setAfterpayClearpayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments
                  afterpayClearpayPayments) {
            this.afterpayClearpayPayments = afterpayClearpayPayments;
            return this;
          }

          /** Allow the merchant to process Alma payments. */
          public Builder setAlmaPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AlmaPayments almaPayments) {
            this.almaPayments = almaPayments;
            return this;
          }

          /** Allow the merchant to process Amazon Pay payments. */
          public Builder setAmazonPayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AmazonPayPayments
                  amazonPayPayments) {
            this.amazonPayPayments = amazonPayPayments;
            return this;
          }

          /** Allow the merchant to process Australian BECS Direct Debit payments. */
          public Builder setAuBecsDebitPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments
                  auBecsDebitPayments) {
            this.auBecsDebitPayments = auBecsDebitPayments;
            return this;
          }

          /** Allow the merchant to process BACS Direct Debit payments. */
          public Builder setBacsDebitPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.BacsDebitPayments
                  bacsDebitPayments) {
            this.bacsDebitPayments = bacsDebitPayments;
            return this;
          }

          /** Allow the merchant to process Bancontact payments. */
          public Builder setBancontactPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.BancontactPayments
                  bancontactPayments) {
            this.bancontactPayments = bancontactPayments;
            return this;
          }

          /** Allow the merchant to process BLIK payments. */
          public Builder setBlikPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.BlikPayments blikPayments) {
            this.blikPayments = blikPayments;
            return this;
          }

          /** Allow the merchant to process Boleto payments. */
          public Builder setBoletoPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.BoletoPayments
                  boletoPayments) {
            this.boletoPayments = boletoPayments;
            return this;
          }

          /** Allow the merchant to collect card payments. */
          public Builder setCardPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.CardPayments cardPayments) {
            this.cardPayments = cardPayments;
            return this;
          }

          /** Allow the merchant to process Cartes Bancaires payments. */
          public Builder setCartesBancairesPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments
                  cartesBancairesPayments) {
            this.cartesBancairesPayments = cartesBancairesPayments;
            return this;
          }

          /** Allow the merchant to process Cash App payments. */
          public Builder setCashappPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.CashappPayments
                  cashappPayments) {
            this.cashappPayments = cashappPayments;
            return this;
          }

          /** Allow the merchant to process EPS payments. */
          public Builder setEpsPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.EpsPayments epsPayments) {
            this.epsPayments = epsPayments;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Merchant.Capabilities#extraParams}
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
           * map. See {@link AccountUpdateParams.Configuration.Merchant.Capabilities#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Allow the merchant to process FPX payments. */
          public Builder setFpxPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.FpxPayments fpxPayments) {
            this.fpxPayments = fpxPayments;
            return this;
          }

          /** Allow the merchant to process UK bank transfer payments. */
          public Builder setGbBankTransferPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments
                  gbBankTransferPayments) {
            this.gbBankTransferPayments = gbBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process GrabPay payments. */
          public Builder setGrabpayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.GrabpayPayments
                  grabpayPayments) {
            this.grabpayPayments = grabpayPayments;
            return this;
          }

          /** Allow the merchant to process iDEAL payments. */
          public Builder setIdealPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.IdealPayments idealPayments) {
            this.idealPayments = idealPayments;
            return this;
          }

          /** Allow the merchant to process JCB card payments. */
          public Builder setJcbPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.JcbPayments jcbPayments) {
            this.jcbPayments = jcbPayments;
            return this;
          }

          /** Allow the merchant to process Japanese bank transfer payments. */
          public Builder setJpBankTransferPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments
                  jpBankTransferPayments) {
            this.jpBankTransferPayments = jpBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process Kakao Pay payments. */
          public Builder setKakaoPayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.KakaoPayPayments
                  kakaoPayPayments) {
            this.kakaoPayPayments = kakaoPayPayments;
            return this;
          }

          /** Allow the merchant to process Klarna payments. */
          public Builder setKlarnaPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.KlarnaPayments
                  klarnaPayments) {
            this.klarnaPayments = klarnaPayments;
            return this;
          }

          /** Allow the merchant to process Konbini convenience store payments. */
          public Builder setKonbiniPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.KonbiniPayments
                  konbiniPayments) {
            this.konbiniPayments = konbiniPayments;
            return this;
          }

          /** Allow the merchant to process Korean card payments. */
          public Builder setKrCardPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.KrCardPayments
                  krCardPayments) {
            this.krCardPayments = krCardPayments;
            return this;
          }

          /** Allow the merchant to process Link payments. */
          public Builder setLinkPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.LinkPayments linkPayments) {
            this.linkPayments = linkPayments;
            return this;
          }

          /** Allow the merchant to process MobilePay payments. */
          public Builder setMobilepayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.MobilepayPayments
                  mobilepayPayments) {
            this.mobilepayPayments = mobilepayPayments;
            return this;
          }

          /** Allow the merchant to process Multibanco payments. */
          public Builder setMultibancoPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.MultibancoPayments
                  multibancoPayments) {
            this.multibancoPayments = multibancoPayments;
            return this;
          }

          /** Allow the merchant to process Mexican bank transfer payments. */
          public Builder setMxBankTransferPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments
                  mxBankTransferPayments) {
            this.mxBankTransferPayments = mxBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process Naver Pay payments. */
          public Builder setNaverPayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.NaverPayPayments
                  naverPayPayments) {
            this.naverPayPayments = naverPayPayments;
            return this;
          }

          /** Allow the merchant to process OXXO payments. */
          public Builder setOxxoPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.OxxoPayments oxxoPayments) {
            this.oxxoPayments = oxxoPayments;
            return this;
          }

          /** Allow the merchant to process Przelewy24 (P24) payments. */
          public Builder setP24Payments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.P24Payments p24Payments) {
            this.p24Payments = p24Payments;
            return this;
          }

          /** Allow the merchant to process Pay by Bank payments. */
          public Builder setPayByBankPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.PayByBankPayments
                  payByBankPayments) {
            this.payByBankPayments = payByBankPayments;
            return this;
          }

          /** Allow the merchant to process PAYCO payments. */
          public Builder setPaycoPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.PaycoPayments paycoPayments) {
            this.paycoPayments = paycoPayments;
            return this;
          }

          /** Allow the merchant to process PayNow payments. */
          public Builder setPaynowPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.PaynowPayments
                  paynowPayments) {
            this.paynowPayments = paynowPayments;
            return this;
          }

          /** Allow the merchant to process PromptPay payments. */
          public Builder setPromptpayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.PromptpayPayments
                  promptpayPayments) {
            this.promptpayPayments = promptpayPayments;
            return this;
          }

          /** Allow the merchant to process Revolut Pay payments. */
          public Builder setRevolutPayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.RevolutPayPayments
                  revolutPayPayments) {
            this.revolutPayPayments = revolutPayPayments;
            return this;
          }

          /** Allow the merchant to process Samsung Pay payments. */
          public Builder setSamsungPayPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.SamsungPayPayments
                  samsungPayPayments) {
            this.samsungPayPayments = samsungPayPayments;
            return this;
          }

          /** Allow the merchant to process SEPA bank transfer payments. */
          public Builder setSepaBankTransferPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments
                  sepaBankTransferPayments) {
            this.sepaBankTransferPayments = sepaBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process SEPA Direct Debit payments. */
          public Builder setSepaDebitPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.SepaDebitPayments
                  sepaDebitPayments) {
            this.sepaDebitPayments = sepaDebitPayments;
            return this;
          }

          /** Allow the merchant to process Swish payments. */
          public Builder setSwishPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.SwishPayments swishPayments) {
            this.swishPayments = swishPayments;
            return this;
          }

          /** Allow the merchant to process TWINT payments. */
          public Builder setTwintPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.TwintPayments twintPayments) {
            this.twintPayments = twintPayments;
            return this;
          }

          /** Allow the merchant to process US bank transfer payments. */
          public Builder setUsBankTransferPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments
                  usBankTransferPayments) {
            this.usBankTransferPayments = usBankTransferPayments;
            return this;
          }

          /** Allow the merchant to process Zip payments. */
          public Builder setZipPayments(
              AccountUpdateParams.Configuration.Merchant.Capabilities.ZipPayments zipPayments) {
            this.zipPayments = zipPayments;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AchDebitPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AchDebitPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AchDebitPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.AchDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AchDebitPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AchDebitPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AcssDebitPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AcssDebitPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AcssDebitPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.AcssDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AcssDebitPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AcssDebitPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AffirmPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AffirmPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AffirmPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.AffirmPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AffirmPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AffirmPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AfterpayClearpayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AfterpayClearpayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .AfterpayClearpayPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AfterpayClearpayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AlmaPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AlmaPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AlmaPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.AlmaPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AlmaPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AlmaPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AmazonPayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AmazonPayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AmazonPayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.AmazonPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AmazonPayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AmazonPayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AuBecsDebitPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private AuBecsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .AuBecsDebitPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.AuBecsDebitPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BacsDebitPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BacsDebitPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.BacsDebitPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.BacsDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BacsDebitPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BacsDebitPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BancontactPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BancontactPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.BancontactPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.BancontactPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BancontactPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BancontactPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BlikPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BlikPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.BlikPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.BlikPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BlikPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BlikPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BoletoPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private BoletoPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.BoletoPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.BoletoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BoletoPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.BoletoPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CardPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CardPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.CardPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.CardPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.CardPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.CardPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CartesBancairesPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CartesBancairesPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .CartesBancairesPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.CartesBancairesPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CashappPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private CashappPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.CashappPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.CashappPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.CashappPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.CashappPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class EpsPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private EpsPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.EpsPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.EpsPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.EpsPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.EpsPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class FpxPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private FpxPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.FpxPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.FpxPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.FpxPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.FpxPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class GbBankTransferPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private GbBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .GbBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.GbBankTransferPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class GrabpayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private GrabpayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.GrabpayPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.GrabpayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.GrabpayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.GrabpayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class IdealPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private IdealPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.IdealPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.IdealPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.IdealPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.IdealPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class JcbPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private JcbPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.JcbPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.JcbPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.JcbPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.JcbPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class JpBankTransferPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private JpBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .JpBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.JpBankTransferPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KakaoPayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KakaoPayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.KakaoPayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.KakaoPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KakaoPayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KakaoPayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KlarnaPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KlarnaPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.KlarnaPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.KlarnaPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KlarnaPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KlarnaPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KonbiniPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KonbiniPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.KonbiniPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.KonbiniPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KonbiniPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KonbiniPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class KrCardPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private KrCardPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.KrCardPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.KrCardPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KrCardPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.KrCardPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class LinkPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private LinkPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.LinkPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.LinkPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.LinkPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.LinkPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MobilepayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private MobilepayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.MobilepayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.MobilepayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.MobilepayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.MobilepayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MultibancoPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private MultibancoPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.MultibancoPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.MultibancoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.MultibancoPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.MultibancoPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MxBankTransferPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private MxBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .MxBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.MxBankTransferPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class NaverPayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private NaverPayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.NaverPayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.NaverPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.NaverPayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.NaverPayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class OxxoPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private OxxoPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.OxxoPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.OxxoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.OxxoPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.OxxoPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class P24Payments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private P24Payments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.P24Payments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.P24Payments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.P24Payments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.P24Payments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PayByBankPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PayByBankPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.PayByBankPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.PayByBankPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PayByBankPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PayByBankPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PaycoPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PaycoPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.PaycoPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.PaycoPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PaycoPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PaycoPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PaynowPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PaynowPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.PaynowPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.PaynowPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PaynowPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PaynowPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PromptpayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private PromptpayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.PromptpayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.PromptpayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PromptpayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.PromptpayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class RevolutPayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private RevolutPayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.RevolutPayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.RevolutPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.RevolutPayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.RevolutPayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SamsungPayPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SamsungPayPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.SamsungPayPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.SamsungPayPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SamsungPayPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SamsungPayPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaBankTransferPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SepaBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .SepaBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SepaBankTransferPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SepaDebitPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SepaDebitPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.SepaDebitPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.SepaDebitPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SepaDebitPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SepaDebitPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SwishPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private SwishPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.SwishPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.SwishPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SwishPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.SwishPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class TwintPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private TwintPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.TwintPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.TwintPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.TwintPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.TwintPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class UsBankTransferPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private UsBankTransferPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments
                build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities
                  .UsBankTransferPayments(this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.UsBankTransferPayments#extraParams}
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ZipPayments {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private ZipPayments(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Capabilities.ZipPayments build() {
              return new AccountUpdateParams.Configuration.Merchant.Capabilities.ZipPayments(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.ZipPayments#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Capabilities.ZipPayments#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CardPayments {
        /**
         * Automatically declines certain charge types regardless of whether the card issuer
         * accepted or declined the charge.
         */
        @SerializedName("decline_on")
        DeclineOn declineOn;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private CardPayments(DeclineOn declineOn, Map<String, Object> extraParams) {
          this.declineOn = declineOn;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private DeclineOn declineOn;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Merchant.CardPayments build() {
            return new AccountUpdateParams.Configuration.Merchant.CardPayments(
                this.declineOn, this.extraParams);
          }

          /**
           * Automatically declines certain charge types regardless of whether the card issuer
           * accepted or declined the charge.
           */
          public Builder setDeclineOn(
              AccountUpdateParams.Configuration.Merchant.CardPayments.DeclineOn declineOn) {
            this.declineOn = declineOn;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Merchant.CardPayments#extraParams}
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
           * map. See {@link AccountUpdateParams.Configuration.Merchant.CardPayments#extraParams}
           * for the field documentation.
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
        @EqualsAndHashCode(callSuper = false)
        public static class DeclineOn {
          /**
           * Whether Stripe automatically declines charges with an incorrect ZIP or postal code.
           * This setting only applies when a ZIP or postal code is provided and they fail bank
           * verification.
           */
          @SerializedName("avs_failure")
          Boolean avsFailure;

          /**
           * Whether Stripe automatically declines charges with an incorrect CVC. This setting only
           * applies when a CVC is provided and it fails bank verification.
           */
          @SerializedName("cvc_failure")
          Boolean cvcFailure;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private DeclineOn(
              Boolean avsFailure, Boolean cvcFailure, Map<String, Object> extraParams) {
            this.avsFailure = avsFailure;
            this.cvcFailure = cvcFailure;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Boolean avsFailure;

            private Boolean cvcFailure;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.CardPayments.DeclineOn build() {
              return new AccountUpdateParams.Configuration.Merchant.CardPayments.DeclineOn(
                  this.avsFailure, this.cvcFailure, this.extraParams);
            }

            /**
             * Whether Stripe automatically declines charges with an incorrect ZIP or postal code.
             * This setting only applies when a ZIP or postal code is provided and they fail bank
             * verification.
             */
            public Builder setAvsFailure(Boolean avsFailure) {
              this.avsFailure = avsFailure;
              return this;
            }

            /**
             * Whether Stripe automatically declines charges with an incorrect CVC. This setting
             * only applies when a CVC is provided and it fails bank verification.
             */
            public Builder setCvcFailure(Boolean cvcFailure) {
              this.cvcFailure = cvcFailure;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.CardPayments.DeclineOn#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.CardPayments.DeclineOn#extraParams} for
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
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StatementDescriptor {
        /**
         * The default text that appears on statements for non-card charges outside of Japan. For
         * card charges, if you don’t set a statement_descriptor_prefix, this text is also used as
         * the statement descriptor prefix. In that case, if concatenating the statement descriptor
         * suffix causes the combined statement descriptor to exceed 22 characters, we truncate the
         * statement_descriptor text to limit the full descriptor to 22 characters. For more
         * information about statement descriptors and their requirements, see the Merchant
         * Configuration settings documentation.
         */
        @SerializedName("descriptor")
        Object descriptor;

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
         * Default text that appears on statements for card charges outside of Japan, prefixing any
         * dynamic statement_descriptor_suffix specified on the charge. To maximize space for the
         * dynamic part of the descriptor, keep this text short. If you don’t specify this value,
         * statement_descriptor is used as the prefix. For more information about statement
         * descriptors and their requirements, see the Merchant Configuration settings
         * documentation.
         */
        @SerializedName("prefix")
        Object prefix;

        private StatementDescriptor(
            Object descriptor, Map<String, Object> extraParams, Object prefix) {
          this.descriptor = descriptor;
          this.extraParams = extraParams;
          this.prefix = prefix;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object descriptor;

          private Map<String, Object> extraParams;

          private Object prefix;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Merchant.StatementDescriptor build() {
            return new AccountUpdateParams.Configuration.Merchant.StatementDescriptor(
                this.descriptor, this.extraParams, this.prefix);
          }

          /**
           * The default text that appears on statements for non-card charges outside of Japan. For
           * card charges, if you don’t set a statement_descriptor_prefix, this text is also used as
           * the statement descriptor prefix. In that case, if concatenating the statement
           * descriptor suffix causes the combined statement descriptor to exceed 22 characters, we
           * truncate the statement_descriptor text to limit the full descriptor to 22 characters.
           * For more information about statement descriptors and their requirements, see the
           * Merchant Configuration settings documentation.
           */
          public Builder setDescriptor(String descriptor) {
            this.descriptor = descriptor;
            return this;
          }

          /**
           * The default text that appears on statements for non-card charges outside of Japan. For
           * card charges, if you don’t set a statement_descriptor_prefix, this text is also used as
           * the statement descriptor prefix. In that case, if concatenating the statement
           * descriptor suffix causes the combined statement descriptor to exceed 22 characters, we
           * truncate the statement_descriptor text to limit the full descriptor to 22 characters.
           * For more information about statement descriptors and their requirements, see the
           * Merchant Configuration settings documentation.
           */
          public Builder setDescriptor(EmptyParam descriptor) {
            this.descriptor = descriptor;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Configuration.Merchant.StatementDescriptor#extraParams} for the
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
           * map. See {@link
           * AccountUpdateParams.Configuration.Merchant.StatementDescriptor#extraParams} for the
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
           * Default text that appears on statements for card charges outside of Japan, prefixing
           * any dynamic statement_descriptor_suffix specified on the charge. To maximize space for
           * the dynamic part of the descriptor, keep this text short. If you don’t specify this
           * value, statement_descriptor is used as the prefix. For more information about statement
           * descriptors and their requirements, see the Merchant Configuration settings
           * documentation.
           */
          public Builder setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
          }

          /**
           * Default text that appears on statements for card charges outside of Japan, prefixing
           * any dynamic statement_descriptor_suffix specified on the charge. To maximize space for
           * the dynamic part of the descriptor, keep this text short. If you don’t specify this
           * value, statement_descriptor is used as the prefix. For more information about statement
           * descriptors and their requirements, see the Merchant Configuration settings
           * documentation.
           */
          public Builder setPrefix(EmptyParam prefix) {
            this.prefix = prefix;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Support {
        /** A publicly available mailing address for sending support issues to. */
        @SerializedName("address")
        Address address;

        /** A publicly available email address for sending support issues to. */
        @SerializedName("email")
        Object email;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A publicly available phone number to call with support issues. */
        @SerializedName("phone")
        Object phone;

        /** A publicly available website for handling support issues. */
        @SerializedName("url")
        Object url;

        private Support(
            Address address,
            Object email,
            Map<String, Object> extraParams,
            Object phone,
            Object url) {
          this.address = address;
          this.email = email;
          this.extraParams = extraParams;
          this.phone = phone;
          this.url = url;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Object email;

          private Map<String, Object> extraParams;

          private Object phone;

          private Object url;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Merchant.Support build() {
            return new AccountUpdateParams.Configuration.Merchant.Support(
                this.address, this.email, this.extraParams, this.phone, this.url);
          }

          /** A publicly available mailing address for sending support issues to. */
          public Builder setAddress(
              AccountUpdateParams.Configuration.Merchant.Support.Address address) {
            this.address = address;
            return this;
          }

          /** A publicly available email address for sending support issues to. */
          public Builder setEmail(String email) {
            this.email = email;
            return this;
          }

          /** A publicly available email address for sending support issues to. */
          public Builder setEmail(EmptyParam email) {
            this.email = email;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Merchant.Support#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Configuration.Merchant.Support#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A publicly available phone number to call with support issues. */
          public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
          }

          /** A publicly available phone number to call with support issues. */
          public Builder setPhone(EmptyParam phone) {
            this.phone = phone;
            return this;
          }

          /** A publicly available website for handling support issues. */
          public Builder setUrl(String url) {
            this.url = url;
            return this;
          }

          /** A publicly available website for handling support issues. */
          public Builder setUrl(EmptyParam url) {
            this.url = url;
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
          ApiRequestParams.EnumParam country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          Object town;

          private Address(
              Object city,
              ApiRequestParams.EnumParam country,
              Map<String, Object> extraParams,
              Object line1,
              Object line2,
              Object postalCode,
              Object state,
              Object town) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
            this.town = town;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object city;

            private ApiRequestParams.EnumParam country;

            private Map<String, Object> extraParams;

            private Object line1;

            private Object line2;

            private Object postalCode;

            private Object state;

            private Object town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Merchant.Support.Address build() {
              return new AccountUpdateParams.Configuration.Merchant.Support.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(
                AccountUpdateParams.Configuration.Merchant.Support.Address.Country country) {
              this.country = country;
              return this;
            }

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Support.Address#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Merchant.Support.Address#extraParams} for the field
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }

            /** Town or cho-me. */
            public Builder setTown(EmptyParam town) {
              this.town = town;
              return this;
            }
          }

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("ad")
            AD("ad"),

            @SerializedName("ae")
            AE("ae"),

            @SerializedName("af")
            AF("af"),

            @SerializedName("ag")
            AG("ag"),

            @SerializedName("ai")
            AI("ai"),

            @SerializedName("al")
            AL("al"),

            @SerializedName("am")
            AM("am"),

            @SerializedName("ao")
            AO("ao"),

            @SerializedName("aq")
            AQ("aq"),

            @SerializedName("ar")
            AR("ar"),

            @SerializedName("as")
            AS("as"),

            @SerializedName("at")
            AT("at"),

            @SerializedName("au")
            AU("au"),

            @SerializedName("aw")
            AW("aw"),

            @SerializedName("ax")
            AX("ax"),

            @SerializedName("az")
            AZ("az"),

            @SerializedName("ba")
            BA("ba"),

            @SerializedName("bb")
            BB("bb"),

            @SerializedName("bd")
            BD("bd"),

            @SerializedName("be")
            BE("be"),

            @SerializedName("bf")
            BF("bf"),

            @SerializedName("bg")
            BG("bg"),

            @SerializedName("bh")
            BH("bh"),

            @SerializedName("bi")
            BI("bi"),

            @SerializedName("bj")
            BJ("bj"),

            @SerializedName("bl")
            BL("bl"),

            @SerializedName("bm")
            BM("bm"),

            @SerializedName("bn")
            BN("bn"),

            @SerializedName("bo")
            BO("bo"),

            @SerializedName("bq")
            BQ("bq"),

            @SerializedName("br")
            BR("br"),

            @SerializedName("bs")
            BS("bs"),

            @SerializedName("bt")
            BT("bt"),

            @SerializedName("bv")
            BV("bv"),

            @SerializedName("bw")
            BW("bw"),

            @SerializedName("by")
            BY("by"),

            @SerializedName("bz")
            BZ("bz"),

            @SerializedName("ca")
            CA("ca"),

            @SerializedName("cc")
            CC("cc"),

            @SerializedName("cd")
            CD("cd"),

            @SerializedName("cf")
            CF("cf"),

            @SerializedName("cg")
            CG("cg"),

            @SerializedName("ch")
            CH("ch"),

            @SerializedName("ci")
            CI("ci"),

            @SerializedName("ck")
            CK("ck"),

            @SerializedName("cl")
            CL("cl"),

            @SerializedName("cm")
            CM("cm"),

            @SerializedName("cn")
            CN("cn"),

            @SerializedName("co")
            CO("co"),

            @SerializedName("cr")
            CR("cr"),

            @SerializedName("cu")
            CU("cu"),

            @SerializedName("cv")
            CV("cv"),

            @SerializedName("cw")
            CW("cw"),

            @SerializedName("cx")
            CX("cx"),

            @SerializedName("cy")
            CY("cy"),

            @SerializedName("cz")
            CZ("cz"),

            @SerializedName("de")
            DE("de"),

            @SerializedName("dj")
            DJ("dj"),

            @SerializedName("dk")
            DK("dk"),

            @SerializedName("dm")
            DM("dm"),

            @SerializedName("do")
            DO("do"),

            @SerializedName("dz")
            DZ("dz"),

            @SerializedName("ec")
            EC("ec"),

            @SerializedName("ee")
            EE("ee"),

            @SerializedName("eg")
            EG("eg"),

            @SerializedName("eh")
            EH("eh"),

            @SerializedName("er")
            ER("er"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("et")
            ET("et"),

            @SerializedName("fi")
            FI("fi"),

            @SerializedName("fj")
            FJ("fj"),

            @SerializedName("fk")
            FK("fk"),

            @SerializedName("fm")
            FM("fm"),

            @SerializedName("fo")
            FO("fo"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("ga")
            GA("ga"),

            @SerializedName("gb")
            GB("gb"),

            @SerializedName("gd")
            GD("gd"),

            @SerializedName("ge")
            GE("ge"),

            @SerializedName("gf")
            GF("gf"),

            @SerializedName("gg")
            GG("gg"),

            @SerializedName("gh")
            GH("gh"),

            @SerializedName("gi")
            GI("gi"),

            @SerializedName("gl")
            GL("gl"),

            @SerializedName("gm")
            GM("gm"),

            @SerializedName("gn")
            GN("gn"),

            @SerializedName("gp")
            GP("gp"),

            @SerializedName("gq")
            GQ("gq"),

            @SerializedName("gr")
            GR("gr"),

            @SerializedName("gs")
            GS("gs"),

            @SerializedName("gt")
            GT("gt"),

            @SerializedName("gu")
            GU("gu"),

            @SerializedName("gw")
            GW("gw"),

            @SerializedName("gy")
            GY("gy"),

            @SerializedName("hk")
            HK("hk"),

            @SerializedName("hm")
            HM("hm"),

            @SerializedName("hn")
            HN("hn"),

            @SerializedName("hr")
            HR("hr"),

            @SerializedName("ht")
            HT("ht"),

            @SerializedName("hu")
            HU("hu"),

            @SerializedName("id")
            ID("id"),

            @SerializedName("ie")
            IE("ie"),

            @SerializedName("il")
            IL("il"),

            @SerializedName("im")
            IM("im"),

            @SerializedName("in")
            IN("in"),

            @SerializedName("io")
            IO("io"),

            @SerializedName("iq")
            IQ("iq"),

            @SerializedName("ir")
            IR("ir"),

            @SerializedName("is")
            IS("is"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("je")
            JE("je"),

            @SerializedName("jm")
            JM("jm"),

            @SerializedName("jo")
            JO("jo"),

            @SerializedName("jp")
            JP("jp"),

            @SerializedName("ke")
            KE("ke"),

            @SerializedName("kg")
            KG("kg"),

            @SerializedName("kh")
            KH("kh"),

            @SerializedName("ki")
            KI("ki"),

            @SerializedName("km")
            KM("km"),

            @SerializedName("kn")
            KN("kn"),

            @SerializedName("kp")
            KP("kp"),

            @SerializedName("kr")
            KR("kr"),

            @SerializedName("kw")
            KW("kw"),

            @SerializedName("ky")
            KY("ky"),

            @SerializedName("kz")
            KZ("kz"),

            @SerializedName("la")
            LA("la"),

            @SerializedName("lb")
            LB("lb"),

            @SerializedName("lc")
            LC("lc"),

            @SerializedName("li")
            LI("li"),

            @SerializedName("lk")
            LK("lk"),

            @SerializedName("lr")
            LR("lr"),

            @SerializedName("ls")
            LS("ls"),

            @SerializedName("lt")
            LT("lt"),

            @SerializedName("lu")
            LU("lu"),

            @SerializedName("lv")
            LV("lv"),

            @SerializedName("ly")
            LY("ly"),

            @SerializedName("ma")
            MA("ma"),

            @SerializedName("mc")
            MC("mc"),

            @SerializedName("md")
            MD("md"),

            @SerializedName("me")
            ME("me"),

            @SerializedName("mf")
            MF("mf"),

            @SerializedName("mg")
            MG("mg"),

            @SerializedName("mh")
            MH("mh"),

            @SerializedName("mk")
            MK("mk"),

            @SerializedName("ml")
            ML("ml"),

            @SerializedName("mm")
            MM("mm"),

            @SerializedName("mn")
            MN("mn"),

            @SerializedName("mo")
            MO("mo"),

            @SerializedName("mp")
            MP("mp"),

            @SerializedName("mq")
            MQ("mq"),

            @SerializedName("mr")
            MR("mr"),

            @SerializedName("ms")
            MS("ms"),

            @SerializedName("mt")
            MT("mt"),

            @SerializedName("mu")
            MU("mu"),

            @SerializedName("mv")
            MV("mv"),

            @SerializedName("mw")
            MW("mw"),

            @SerializedName("mx")
            MX("mx"),

            @SerializedName("my")
            MY("my"),

            @SerializedName("mz")
            MZ("mz"),

            @SerializedName("na")
            NA("na"),

            @SerializedName("nc")
            NC("nc"),

            @SerializedName("ne")
            NE("ne"),

            @SerializedName("nf")
            NF("nf"),

            @SerializedName("ng")
            NG("ng"),

            @SerializedName("ni")
            NI("ni"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("no")
            NO("no"),

            @SerializedName("np")
            NP("np"),

            @SerializedName("nr")
            NR("nr"),

            @SerializedName("nu")
            NU("nu"),

            @SerializedName("nz")
            NZ("nz"),

            @SerializedName("om")
            OM("om"),

            @SerializedName("pa")
            PA("pa"),

            @SerializedName("pe")
            PE("pe"),

            @SerializedName("pf")
            PF("pf"),

            @SerializedName("pg")
            PG("pg"),

            @SerializedName("ph")
            PH("ph"),

            @SerializedName("pk")
            PK("pk"),

            @SerializedName("pl")
            PL("pl"),

            @SerializedName("pm")
            PM("pm"),

            @SerializedName("pn")
            PN("pn"),

            @SerializedName("pr")
            PR("pr"),

            @SerializedName("ps")
            PS("ps"),

            @SerializedName("pt")
            PT("pt"),

            @SerializedName("pw")
            PW("pw"),

            @SerializedName("py")
            PY("py"),

            @SerializedName("qa")
            QA("qa"),

            @SerializedName("qz")
            QZ("qz"),

            @SerializedName("re")
            RE("re"),

            @SerializedName("ro")
            RO("ro"),

            @SerializedName("rs")
            RS("rs"),

            @SerializedName("ru")
            RU("ru"),

            @SerializedName("rw")
            RW("rw"),

            @SerializedName("sa")
            SA("sa"),

            @SerializedName("sb")
            SB("sb"),

            @SerializedName("sc")
            SC("sc"),

            @SerializedName("sd")
            SD("sd"),

            @SerializedName("se")
            SE("se"),

            @SerializedName("sg")
            SG("sg"),

            @SerializedName("sh")
            SH("sh"),

            @SerializedName("si")
            SI("si"),

            @SerializedName("sj")
            SJ("sj"),

            @SerializedName("sk")
            SK("sk"),

            @SerializedName("sl")
            SL("sl"),

            @SerializedName("sm")
            SM("sm"),

            @SerializedName("sn")
            SN("sn"),

            @SerializedName("so")
            SO("so"),

            @SerializedName("sr")
            SR("sr"),

            @SerializedName("ss")
            SS("ss"),

            @SerializedName("st")
            ST("st"),

            @SerializedName("sv")
            SV("sv"),

            @SerializedName("sx")
            SX("sx"),

            @SerializedName("sy")
            SY("sy"),

            @SerializedName("sz")
            SZ("sz"),

            @SerializedName("tc")
            TC("tc"),

            @SerializedName("td")
            TD("td"),

            @SerializedName("tf")
            TF("tf"),

            @SerializedName("tg")
            TG("tg"),

            @SerializedName("th")
            TH("th"),

            @SerializedName("tj")
            TJ("tj"),

            @SerializedName("tk")
            TK("tk"),

            @SerializedName("tl")
            TL("tl"),

            @SerializedName("tm")
            TM("tm"),

            @SerializedName("tn")
            TN("tn"),

            @SerializedName("to")
            TO("to"),

            @SerializedName("tr")
            TR("tr"),

            @SerializedName("tt")
            TT("tt"),

            @SerializedName("tv")
            TV("tv"),

            @SerializedName("tw")
            TW("tw"),

            @SerializedName("tz")
            TZ("tz"),

            @SerializedName("ua")
            UA("ua"),

            @SerializedName("ug")
            UG("ug"),

            @SerializedName("um")
            UM("um"),

            @SerializedName("us")
            US("us"),

            @SerializedName("uy")
            UY("uy"),

            @SerializedName("uz")
            UZ("uz"),

            @SerializedName("va")
            VA("va"),

            @SerializedName("vc")
            VC("vc"),

            @SerializedName("ve")
            VE("ve"),

            @SerializedName("vg")
            VG("vg"),

            @SerializedName("vi")
            VI("vi"),

            @SerializedName("vn")
            VN("vn"),

            @SerializedName("vu")
            VU("vu"),

            @SerializedName("wf")
            WF("wf"),

            @SerializedName("ws")
            WS("ws"),

            @SerializedName("ye")
            YE("ye"),

            @SerializedName("yt")
            YT("yt"),

            @SerializedName("za")
            ZA("za"),

            @SerializedName("zm")
            ZM("zm"),

            @SerializedName("zw")
            ZW("zw");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Recipient {
      /** Capabilities to request on the Recipient Configuration. */
      @SerializedName("capabilities")
      Capabilities capabilities;

      /**
       * The payout method id to be used as a default outbound destination. This will allow the
       * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
       * dashboard. Can also be explicitly set to {@code null} to clear the existing default
       * outbound destination.
       */
      @SerializedName("default_outbound_destination")
      Object defaultOutboundDestination;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Recipient(
          Capabilities capabilities,
          Object defaultOutboundDestination,
          Map<String, Object> extraParams) {
        this.capabilities = capabilities;
        this.defaultOutboundDestination = defaultOutboundDestination;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Capabilities capabilities;

        private Object defaultOutboundDestination;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Configuration.Recipient build() {
          return new AccountUpdateParams.Configuration.Recipient(
              this.capabilities, this.defaultOutboundDestination, this.extraParams);
        }

        /** Capabilities to request on the Recipient Configuration. */
        public Builder setCapabilities(
            AccountUpdateParams.Configuration.Recipient.Capabilities capabilities) {
          this.capabilities = capabilities;
          return this;
        }

        /**
         * The payout method id to be used as a default outbound destination. This will allow the
         * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
         * dashboard. Can also be explicitly set to {@code null} to clear the existing default
         * outbound destination.
         */
        public Builder setDefaultOutboundDestination(String defaultOutboundDestination) {
          this.defaultOutboundDestination = defaultOutboundDestination;
          return this;
        }

        /**
         * The payout method id to be used as a default outbound destination. This will allow the
         * PayoutMethod to be omitted on OutboundPayments made through API or sending payouts via
         * dashboard. Can also be explicitly set to {@code null} to clear the existing default
         * outbound destination.
         */
        public Builder setDefaultOutboundDestination(EmptyParam defaultOutboundDestination) {
          this.defaultOutboundDestination = defaultOutboundDestination;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Configuration.Recipient#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Configuration.Recipient#extraParams} for the field
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
      @EqualsAndHashCode(callSuper = false)
      public static class Capabilities {
        /** Capabilities that enable OutboundPayments to a bank account linked to this Account. */
        @SerializedName("bank_accounts")
        BankAccounts bankAccounts;

        /** Capability that enable OutboundPayments to a debit card linked to this Account. */
        @SerializedName("cards")
        Cards cards;

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
         * Capabilities that enable the recipient to receive money into their Stripe Balance
         * (/v1/balance).
         */
        @SerializedName("stripe_balance")
        StripeBalance stripeBalance;

        private Capabilities(
            BankAccounts bankAccounts,
            Cards cards,
            Map<String, Object> extraParams,
            StripeBalance stripeBalance) {
          this.bankAccounts = bankAccounts;
          this.cards = cards;
          this.extraParams = extraParams;
          this.stripeBalance = stripeBalance;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BankAccounts bankAccounts;

          private Cards cards;

          private Map<String, Object> extraParams;

          private StripeBalance stripeBalance;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Configuration.Recipient.Capabilities build() {
            return new AccountUpdateParams.Configuration.Recipient.Capabilities(
                this.bankAccounts, this.cards, this.extraParams, this.stripeBalance);
          }

          /** Capabilities that enable OutboundPayments to a bank account linked to this Account. */
          public Builder setBankAccounts(
              AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts bankAccounts) {
            this.bankAccounts = bankAccounts;
            return this;
          }

          /** Capability that enable OutboundPayments to a debit card linked to this Account. */
          public Builder setCards(
              AccountUpdateParams.Configuration.Recipient.Capabilities.Cards cards) {
            this.cards = cards;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Configuration.Recipient.Capabilities#extraParams}
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
           * map. See {@link AccountUpdateParams.Configuration.Recipient.Capabilities#extraParams}
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
           * Capabilities that enable the recipient to receive money into their Stripe Balance
           * (/v1/balance).
           */
          public Builder setStripeBalance(
              AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance
                  stripeBalance) {
            this.stripeBalance = stripeBalance;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BankAccounts {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Enables this Account to receive OutboundPayments to linked bank accounts over local
           * networks.
           */
          @SerializedName("local")
          Local local;

          /** Enables this Account to receive OutboundPayments to linked bank accounts over wire. */
          @SerializedName("wire")
          Wire wire;

          private BankAccounts(Map<String, Object> extraParams, Local local, Wire wire) {
            this.extraParams = extraParams;
            this.local = local;
            this.wire = wire;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Local local;

            private Wire wire;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts build() {
              return new AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts(
                  this.extraParams, this.local, this.wire);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts#extraParams}
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
             * Enables this Account to receive OutboundPayments to linked bank accounts over local
             * networks.
             */
            public Builder setLocal(
                AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Local local) {
              this.local = local;
              return this;
            }

            /**
             * Enables this Account to receive OutboundPayments to linked bank accounts over wire.
             */
            public Builder setWire(
                AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire wire) {
              this.wire = wire;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Local {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private Local(Map<String, Object> extraParams, Boolean requested) {
              this.extraParams = extraParams;
              this.requested = requested;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Boolean requested;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Local
                  build() {
                return new AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts
                    .Local(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Local#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Local#extraParams}
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
               * To request a new Capability for an account, pass true. There can be a delay before
               * the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Wire {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private Wire(Map<String, Object> extraParams, Boolean requested) {
              this.extraParams = extraParams;
              this.requested = requested;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Boolean requested;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire
                  build() {
                return new AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts
                    .Wire(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Recipient.Capabilities.BankAccounts.Wire#extraParams}
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
               * To request a new Capability for an account, pass true. There can be a delay before
               * the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Cards {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * To request a new Capability for an account, pass true. There can be a delay before the
           * requested Capability becomes active.
           */
          @SerializedName("requested")
          Boolean requested;

          private Cards(Map<String, Object> extraParams, Boolean requested) {
            this.extraParams = extraParams;
            this.requested = requested;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean requested;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Recipient.Capabilities.Cards build() {
              return new AccountUpdateParams.Configuration.Recipient.Capabilities.Cards(
                  this.extraParams, this.requested);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Recipient.Capabilities.Cards#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Recipient.Capabilities.Cards#extraParams} for the
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
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            public Builder setRequested(Boolean requested) {
              this.requested = requested;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class StripeBalance {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Allows the recipient to receive /v1/transfers into their Stripe Balance (/v1/balance).
           */
          @SerializedName("stripe_transfers")
          StripeTransfers stripeTransfers;

          private StripeBalance(Map<String, Object> extraParams, StripeTransfers stripeTransfers) {
            this.extraParams = extraParams;
            this.stripeTransfers = stripeTransfers;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private StripeTransfers stripeTransfers;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance build() {
              return new AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance(
                  this.extraParams, this.stripeTransfers);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance#extraParams}
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
             * Allows the recipient to receive /v1/transfers into their Stripe Balance
             * (/v1/balance).
             */
            public Builder setStripeTransfers(
                AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance
                        .StripeTransfers
                    stripeTransfers) {
              this.stripeTransfers = stripeTransfers;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class StripeTransfers {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * To request a new Capability for an account, pass true. There can be a delay before
             * the requested Capability becomes active.
             */
            @SerializedName("requested")
            Boolean requested;

            private StripeTransfers(Map<String, Object> extraParams, Boolean requested) {
              this.extraParams = extraParams;
              this.requested = requested;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Boolean requested;

              /** Finalize and obtain parameter instance from this builder. */
              public AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance
                      .StripeTransfers
                  build() {
                return new AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance
                    .StripeTransfers(this.extraParams, this.requested);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance.StripeTransfers#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Configuration.Recipient.Capabilities.StripeBalance.StripeTransfers#extraParams}
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
               * To request a new Capability for an account, pass true. There can be a delay before
               * the requested Capability becomes active.
               */
              public Builder setRequested(Boolean requested) {
                this.requested = requested;
                return this;
              }
            }
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Defaults {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    Currency currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The Account's preferred locales (languages), ordered by preference. */
    @SerializedName("locales")
    List<AccountUpdateParams.Defaults.Locale> locales;

    /** Default responsibilities held by either Stripe or the platform. */
    @SerializedName("responsibilities")
    Responsibilities responsibilities;

    private Defaults(
        Currency currency,
        Map<String, Object> extraParams,
        List<AccountUpdateParams.Defaults.Locale> locales,
        Responsibilities responsibilities) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.locales = locales;
      this.responsibilities = responsibilities;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Currency currency;

      private Map<String, Object> extraParams;

      private List<AccountUpdateParams.Defaults.Locale> locales;

      private Responsibilities responsibilities;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Defaults build() {
        return new AccountUpdateParams.Defaults(
            this.currency, this.extraParams, this.locales, this.responsibilities);
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(AccountUpdateParams.Defaults.Currency currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Defaults#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Defaults#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `locales` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AccountUpdateParams.Defaults#locales} for the field documentation.
       */
      public Builder addLocale(AccountUpdateParams.Defaults.Locale element) {
        if (this.locales == null) {
          this.locales = new ArrayList<>();
        }
        this.locales.add(element);
        return this;
      }

      /**
       * Add all elements to `locales` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AccountUpdateParams.Defaults#locales} for the field documentation.
       */
      public Builder addAllLocale(List<AccountUpdateParams.Defaults.Locale> elements) {
        if (this.locales == null) {
          this.locales = new ArrayList<>();
        }
        this.locales.addAll(elements);
        return this;
      }

      /** Default responsibilities held by either Stripe or the platform. */
      public Builder setResponsibilities(
          AccountUpdateParams.Defaults.Responsibilities responsibilities) {
        this.responsibilities = responsibilities;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Responsibilities {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> A value indicating the party responsible for collecting fees
       * from this account.
       */
      @SerializedName("fees_collector")
      FeesCollector feesCollector;

      /**
       * <strong>Required.</strong> A value indicating who is responsible for losses when this
       * Account can’t pay back negative balances from payments.
       */
      @SerializedName("losses_collector")
      LossesCollector lossesCollector;

      private Responsibilities(
          Map<String, Object> extraParams,
          FeesCollector feesCollector,
          LossesCollector lossesCollector) {
        this.extraParams = extraParams;
        this.feesCollector = feesCollector;
        this.lossesCollector = lossesCollector;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FeesCollector feesCollector;

        private LossesCollector lossesCollector;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Defaults.Responsibilities build() {
          return new AccountUpdateParams.Defaults.Responsibilities(
              this.extraParams, this.feesCollector, this.lossesCollector);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Defaults.Responsibilities#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Defaults.Responsibilities#extraParams} for the field
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
         * <strong>Required.</strong> A value indicating the party responsible for collecting fees
         * from this account.
         */
        public Builder setFeesCollector(
            AccountUpdateParams.Defaults.Responsibilities.FeesCollector feesCollector) {
          this.feesCollector = feesCollector;
          return this;
        }

        /**
         * <strong>Required.</strong> A value indicating who is responsible for losses when this
         * Account can’t pay back negative balances from payments.
         */
        public Builder setLossesCollector(
            AccountUpdateParams.Defaults.Responsibilities.LossesCollector lossesCollector) {
          this.lossesCollector = lossesCollector;
          return this;
        }
      }

      public enum FeesCollector implements ApiRequestParams.EnumParam {
        @SerializedName("application")
        APPLICATION("application"),

        @SerializedName("stripe")
        STRIPE("stripe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        FeesCollector(String value) {
          this.value = value;
        }
      }

      public enum LossesCollector implements ApiRequestParams.EnumParam {
        @SerializedName("application")
        APPLICATION("application"),

        @SerializedName("stripe")
        STRIPE("stripe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        LossesCollector(String value) {
          this.value = value;
        }
      }
    }

    public enum Currency implements ApiRequestParams.EnumParam {
      @SerializedName("aed")
      AED("aed"),

      @SerializedName("afn")
      AFN("afn"),

      @SerializedName("all")
      ALL("all"),

      @SerializedName("amd")
      AMD("amd"),

      @SerializedName("ang")
      ANG("ang"),

      @SerializedName("aoa")
      AOA("aoa"),

      @SerializedName("ars")
      ARS("ars"),

      @SerializedName("aud")
      AUD("aud"),

      @SerializedName("awg")
      AWG("awg"),

      @SerializedName("azn")
      AZN("azn"),

      @SerializedName("bam")
      BAM("bam"),

      @SerializedName("bbd")
      BBD("bbd"),

      @SerializedName("bdt")
      BDT("bdt"),

      @SerializedName("bgn")
      BGN("bgn"),

      @SerializedName("bhd")
      BHD("bhd"),

      @SerializedName("bif")
      BIF("bif"),

      @SerializedName("bmd")
      BMD("bmd"),

      @SerializedName("bnd")
      BND("bnd"),

      @SerializedName("bob")
      BOB("bob"),

      @SerializedName("bov")
      BOV("bov"),

      @SerializedName("brl")
      BRL("brl"),

      @SerializedName("bsd")
      BSD("bsd"),

      @SerializedName("btn")
      BTN("btn"),

      @SerializedName("bwp")
      BWP("bwp"),

      @SerializedName("byn")
      BYN("byn"),

      @SerializedName("byr")
      BYR("byr"),

      @SerializedName("bzd")
      BZD("bzd"),

      @SerializedName("cad")
      CAD("cad"),

      @SerializedName("cdf")
      CDF("cdf"),

      @SerializedName("che")
      CHE("che"),

      @SerializedName("chf")
      CHF("chf"),

      @SerializedName("chw")
      CHW("chw"),

      @SerializedName("clf")
      CLF("clf"),

      @SerializedName("clp")
      CLP("clp"),

      @SerializedName("cny")
      CNY("cny"),

      @SerializedName("cop")
      COP("cop"),

      @SerializedName("cou")
      COU("cou"),

      @SerializedName("crc")
      CRC("crc"),

      @SerializedName("cuc")
      CUC("cuc"),

      @SerializedName("cup")
      CUP("cup"),

      @SerializedName("cve")
      CVE("cve"),

      @SerializedName("czk")
      CZK("czk"),

      @SerializedName("djf")
      DJF("djf"),

      @SerializedName("dkk")
      DKK("dkk"),

      @SerializedName("dop")
      DOP("dop"),

      @SerializedName("dzd")
      DZD("dzd"),

      @SerializedName("eek")
      EEK("eek"),

      @SerializedName("egp")
      EGP("egp"),

      @SerializedName("ern")
      ERN("ern"),

      @SerializedName("etb")
      ETB("etb"),

      @SerializedName("eur")
      EUR("eur"),

      @SerializedName("fjd")
      FJD("fjd"),

      @SerializedName("fkp")
      FKP("fkp"),

      @SerializedName("gbp")
      GBP("gbp"),

      @SerializedName("gel")
      GEL("gel"),

      @SerializedName("ghc")
      GHC("ghc"),

      @SerializedName("ghs")
      GHS("ghs"),

      @SerializedName("gip")
      GIP("gip"),

      @SerializedName("gmd")
      GMD("gmd"),

      @SerializedName("gnf")
      GNF("gnf"),

      @SerializedName("gtq")
      GTQ("gtq"),

      @SerializedName("gyd")
      GYD("gyd"),

      @SerializedName("hkd")
      HKD("hkd"),

      @SerializedName("hnl")
      HNL("hnl"),

      @SerializedName("hrk")
      HRK("hrk"),

      @SerializedName("htg")
      HTG("htg"),

      @SerializedName("huf")
      HUF("huf"),

      @SerializedName("idr")
      IDR("idr"),

      @SerializedName("ils")
      ILS("ils"),

      @SerializedName("inr")
      INR("inr"),

      @SerializedName("iqd")
      IQD("iqd"),

      @SerializedName("irr")
      IRR("irr"),

      @SerializedName("isk")
      ISK("isk"),

      @SerializedName("jmd")
      JMD("jmd"),

      @SerializedName("jod")
      JOD("jod"),

      @SerializedName("jpy")
      JPY("jpy"),

      @SerializedName("kes")
      KES("kes"),

      @SerializedName("kgs")
      KGS("kgs"),

      @SerializedName("khr")
      KHR("khr"),

      @SerializedName("kmf")
      KMF("kmf"),

      @SerializedName("kpw")
      KPW("kpw"),

      @SerializedName("krw")
      KRW("krw"),

      @SerializedName("kwd")
      KWD("kwd"),

      @SerializedName("kyd")
      KYD("kyd"),

      @SerializedName("kzt")
      KZT("kzt"),

      @SerializedName("lak")
      LAK("lak"),

      @SerializedName("lbp")
      LBP("lbp"),

      @SerializedName("lkr")
      LKR("lkr"),

      @SerializedName("lrd")
      LRD("lrd"),

      @SerializedName("lsl")
      LSL("lsl"),

      @SerializedName("ltl")
      LTL("ltl"),

      @SerializedName("lvl")
      LVL("lvl"),

      @SerializedName("lyd")
      LYD("lyd"),

      @SerializedName("mad")
      MAD("mad"),

      @SerializedName("mdl")
      MDL("mdl"),

      @SerializedName("mga")
      MGA("mga"),

      @SerializedName("mkd")
      MKD("mkd"),

      @SerializedName("mmk")
      MMK("mmk"),

      @SerializedName("mnt")
      MNT("mnt"),

      @SerializedName("mop")
      MOP("mop"),

      @SerializedName("mro")
      MRO("mro"),

      @SerializedName("mru")
      MRU("mru"),

      @SerializedName("mur")
      MUR("mur"),

      @SerializedName("mvr")
      MVR("mvr"),

      @SerializedName("mwk")
      MWK("mwk"),

      @SerializedName("mxn")
      MXN("mxn"),

      @SerializedName("mxv")
      MXV("mxv"),

      @SerializedName("myr")
      MYR("myr"),

      @SerializedName("mzn")
      MZN("mzn"),

      @SerializedName("nad")
      NAD("nad"),

      @SerializedName("ngn")
      NGN("ngn"),

      @SerializedName("nio")
      NIO("nio"),

      @SerializedName("nok")
      NOK("nok"),

      @SerializedName("npr")
      NPR("npr"),

      @SerializedName("nzd")
      NZD("nzd"),

      @SerializedName("omr")
      OMR("omr"),

      @SerializedName("pab")
      PAB("pab"),

      @SerializedName("pen")
      PEN("pen"),

      @SerializedName("pgk")
      PGK("pgk"),

      @SerializedName("php")
      PHP("php"),

      @SerializedName("pkr")
      PKR("pkr"),

      @SerializedName("pln")
      PLN("pln"),

      @SerializedName("pyg")
      PYG("pyg"),

      @SerializedName("qar")
      QAR("qar"),

      @SerializedName("ron")
      RON("ron"),

      @SerializedName("rsd")
      RSD("rsd"),

      @SerializedName("rub")
      RUB("rub"),

      @SerializedName("rwf")
      RWF("rwf"),

      @SerializedName("sar")
      SAR("sar"),

      @SerializedName("sbd")
      SBD("sbd"),

      @SerializedName("scr")
      SCR("scr"),

      @SerializedName("sdg")
      SDG("sdg"),

      @SerializedName("sek")
      SEK("sek"),

      @SerializedName("sgd")
      SGD("sgd"),

      @SerializedName("shp")
      SHP("shp"),

      @SerializedName("sle")
      SLE("sle"),

      @SerializedName("sll")
      SLL("sll"),

      @SerializedName("sos")
      SOS("sos"),

      @SerializedName("srd")
      SRD("srd"),

      @SerializedName("ssp")
      SSP("ssp"),

      @SerializedName("std")
      STD("std"),

      @SerializedName("stn")
      STN("stn"),

      @SerializedName("svc")
      SVC("svc"),

      @SerializedName("syp")
      SYP("syp"),

      @SerializedName("szl")
      SZL("szl"),

      @SerializedName("thb")
      THB("thb"),

      @SerializedName("tjs")
      TJS("tjs"),

      @SerializedName("tmt")
      TMT("tmt"),

      @SerializedName("tnd")
      TND("tnd"),

      @SerializedName("top")
      TOP("top"),

      @SerializedName("try")
      TRY("try"),

      @SerializedName("ttd")
      TTD("ttd"),

      @SerializedName("twd")
      TWD("twd"),

      @SerializedName("tzs")
      TZS("tzs"),

      @SerializedName("uah")
      UAH("uah"),

      @SerializedName("ugx")
      UGX("ugx"),

      @SerializedName("usd")
      USD("usd"),

      @SerializedName("usdc")
      USDC("usdc"),

      @SerializedName("usn")
      USN("usn"),

      @SerializedName("uyi")
      UYI("uyi"),

      @SerializedName("uyu")
      UYU("uyu"),

      @SerializedName("uzs")
      UZS("uzs"),

      @SerializedName("vef")
      VEF("vef"),

      @SerializedName("ves")
      VES("ves"),

      @SerializedName("vnd")
      VND("vnd"),

      @SerializedName("vuv")
      VUV("vuv"),

      @SerializedName("wst")
      WST("wst"),

      @SerializedName("xaf")
      XAF("xaf"),

      @SerializedName("xcd")
      XCD("xcd"),

      @SerializedName("xcg")
      XCG("xcg"),

      @SerializedName("xof")
      XOF("xof"),

      @SerializedName("xpf")
      XPF("xpf"),

      @SerializedName("yer")
      YER("yer"),

      @SerializedName("zar")
      ZAR("zar"),

      @SerializedName("zmk")
      ZMK("zmk"),

      @SerializedName("zmw")
      ZMW("zmw"),

      @SerializedName("zwd")
      ZWD("zwd"),

      @SerializedName("zwg")
      ZWG("zwg"),

      @SerializedName("zwl")
      ZWL("zwl");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Currency(String value) {
        this.value = value;
      }
    }

    public enum Locale implements ApiRequestParams.EnumParam {
      @SerializedName("ar-SA")
      AR_SA("ar-SA"),

      @SerializedName("bg")
      BG("bg"),

      @SerializedName("bg-BG")
      BG_BG("bg-BG"),

      @SerializedName("cs")
      CS("cs"),

      @SerializedName("cs-CZ")
      CS_CZ("cs-CZ"),

      @SerializedName("da")
      DA("da"),

      @SerializedName("da-DK")
      DA_DK("da-DK"),

      @SerializedName("de")
      DE("de"),

      @SerializedName("de-DE")
      DE_DE("de-DE"),

      @SerializedName("el")
      EL("el"),

      @SerializedName("el-GR")
      EL_GR("el-GR"),

      @SerializedName("en")
      EN("en"),

      @SerializedName("en-AU")
      EN_AU("en-AU"),

      @SerializedName("en-CA")
      EN_CA("en-CA"),

      @SerializedName("en-GB")
      EN_GB("en-GB"),

      @SerializedName("en-IE")
      EN_IE("en-IE"),

      @SerializedName("en-IN")
      EN_IN("en-IN"),

      @SerializedName("en-NZ")
      EN_NZ("en-NZ"),

      @SerializedName("en-SG")
      EN_SG("en-SG"),

      @SerializedName("en-US")
      EN_US("en-US"),

      @SerializedName("es")
      ES("es"),

      @SerializedName("es-419")
      ES_419("es-419"),

      @SerializedName("es-ES")
      ES_ES("es-ES"),

      @SerializedName("et")
      ET("et"),

      @SerializedName("et-EE")
      ET_EE("et-EE"),

      @SerializedName("fi")
      FI("fi"),

      @SerializedName("fil")
      FIL("fil"),

      @SerializedName("fil-PH")
      FIL_PH("fil-PH"),

      @SerializedName("fi-FI")
      FI_FI("fi-FI"),

      @SerializedName("fr")
      FR("fr"),

      @SerializedName("fr-CA")
      FR_CA("fr-CA"),

      @SerializedName("fr-FR")
      FR_FR("fr-FR"),

      @SerializedName("he-IL")
      HE_IL("he-IL"),

      @SerializedName("hr")
      HR("hr"),

      @SerializedName("hr-HR")
      HR_HR("hr-HR"),

      @SerializedName("hu")
      HU("hu"),

      @SerializedName("hu-HU")
      HU_HU("hu-HU"),

      @SerializedName("id")
      ID("id"),

      @SerializedName("id-ID")
      ID_ID("id-ID"),

      @SerializedName("it")
      IT("it"),

      @SerializedName("it-IT")
      IT_IT("it-IT"),

      @SerializedName("ja")
      JA("ja"),

      @SerializedName("ja-JP")
      JA_JP("ja-JP"),

      @SerializedName("ko")
      KO("ko"),

      @SerializedName("ko-KR")
      KO_KR("ko-KR"),

      @SerializedName("lt")
      LT("lt"),

      @SerializedName("lt-LT")
      LT_LT("lt-LT"),

      @SerializedName("lv")
      LV("lv"),

      @SerializedName("lv-LV")
      LV_LV("lv-LV"),

      @SerializedName("ms")
      MS("ms"),

      @SerializedName("ms-MY")
      MS_MY("ms-MY"),

      @SerializedName("mt")
      MT("mt"),

      @SerializedName("mt-MT")
      MT_MT("mt-MT"),

      @SerializedName("nb")
      NB("nb"),

      @SerializedName("nb-NO")
      NB_NO("nb-NO"),

      @SerializedName("nl")
      NL("nl"),

      @SerializedName("nl-NL")
      NL_NL("nl-NL"),

      @SerializedName("pl")
      PL("pl"),

      @SerializedName("pl-PL")
      PL_PL("pl-PL"),

      @SerializedName("pt")
      PT("pt"),

      @SerializedName("pt-BR")
      PT_BR("pt-BR"),

      @SerializedName("pt-PT")
      PT_PT("pt-PT"),

      @SerializedName("ro")
      RO("ro"),

      @SerializedName("ro-RO")
      RO_RO("ro-RO"),

      @SerializedName("ru")
      RU("ru"),

      @SerializedName("ru-RU")
      RU_RU("ru-RU"),

      @SerializedName("sk")
      SK("sk"),

      @SerializedName("sk-SK")
      SK_SK("sk-SK"),

      @SerializedName("sl")
      SL("sl"),

      @SerializedName("sl-SI")
      SL_SI("sl-SI"),

      @SerializedName("sv")
      SV("sv"),

      @SerializedName("sv-SE")
      SV_SE("sv-SE"),

      @SerializedName("th")
      TH("th"),

      @SerializedName("th-TH")
      TH_TH("th-TH"),

      @SerializedName("tr")
      TR("tr"),

      @SerializedName("tr-TR")
      TR_TR("tr-TR"),

      @SerializedName("vi")
      VI("vi"),

      @SerializedName("vi-VN")
      VI_VN("vi-VN"),

      @SerializedName("zh")
      ZH("zh"),

      @SerializedName("zh-Hans")
      ZH_HANS("zh-Hans"),

      @SerializedName("zh-Hant-HK")
      ZH_HANT_HK("zh-Hant-HK"),

      @SerializedName("zh-Hant-TW")
      ZH_HANT_TW("zh-Hant-TW"),

      @SerializedName("zh-HK")
      ZH_HK("zh-HK"),

      @SerializedName("zh-TW")
      ZH_TW("zh-TW");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Locale(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Identity {
    /** Attestations from the identity's key people, e.g. owners, executives, directors. */
    @SerializedName("attestations")
    Attestations attestations;

    /** Information about the company or business. */
    @SerializedName("business_details")
    BusinessDetails businessDetails;

    /**
     * The country in which the account holder resides, or in which the business is legally
     * established. This should be an <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a> country code.
     */
    @SerializedName("country")
    Country country;

    /** The entity type. */
    @SerializedName("entity_type")
    EntityType entityType;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Information about the individual represented by the Account. This property is {@code null}
     * unless {@code entity_type} is set to {@code individual}.
     */
    @SerializedName("individual")
    Individual individual;

    private Identity(
        Attestations attestations,
        BusinessDetails businessDetails,
        Country country,
        EntityType entityType,
        Map<String, Object> extraParams,
        Individual individual) {
      this.attestations = attestations;
      this.businessDetails = businessDetails;
      this.country = country;
      this.entityType = entityType;
      this.extraParams = extraParams;
      this.individual = individual;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Attestations attestations;

      private BusinessDetails businessDetails;

      private Country country;

      private EntityType entityType;

      private Map<String, Object> extraParams;

      private Individual individual;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountUpdateParams.Identity build() {
        return new AccountUpdateParams.Identity(
            this.attestations,
            this.businessDetails,
            this.country,
            this.entityType,
            this.extraParams,
            this.individual);
      }

      /** Attestations from the identity's key people, e.g. owners, executives, directors. */
      public Builder setAttestations(AccountUpdateParams.Identity.Attestations attestations) {
        this.attestations = attestations;
        return this;
      }

      /** Information about the company or business. */
      public Builder setBusinessDetails(
          AccountUpdateParams.Identity.BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
        return this;
      }

      /**
       * The country in which the account holder resides, or in which the business is legally
       * established. This should be an <a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> country
       * code.
       */
      public Builder setCountry(AccountUpdateParams.Identity.Country country) {
        this.country = country;
        return this;
      }

      /** The entity type. */
      public Builder setEntityType(AccountUpdateParams.Identity.EntityType entityType) {
        this.entityType = entityType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountUpdateParams.Identity#extraParams} for the field documentation.
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
       * See {@link AccountUpdateParams.Identity#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Information about the individual represented by the Account. This property is {@code null}
       * unless {@code entity_type} is set to {@code individual}.
       */
      public Builder setIndividual(AccountUpdateParams.Identity.Individual individual) {
        this.individual = individual;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Attestations {
      /**
       * This hash is used to attest that the directors information provided to Stripe is both
       * current and correct.
       */
      @SerializedName("directorship_declaration")
      DirectorshipDeclaration directorshipDeclaration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * This hash is used to attest that the beneficial owner information provided to Stripe is
       * both current and correct.
       */
      @SerializedName("ownership_declaration")
      OwnershipDeclaration ownershipDeclaration;

      /** Attestation that all Persons with a specific Relationship value have been provided. */
      @SerializedName("persons_provided")
      PersonsProvided personsProvided;

      /** Attestations of accepted terms of service agreements. */
      @SerializedName("terms_of_service")
      TermsOfService termsOfService;

      private Attestations(
          DirectorshipDeclaration directorshipDeclaration,
          Map<String, Object> extraParams,
          OwnershipDeclaration ownershipDeclaration,
          PersonsProvided personsProvided,
          TermsOfService termsOfService) {
        this.directorshipDeclaration = directorshipDeclaration;
        this.extraParams = extraParams;
        this.ownershipDeclaration = ownershipDeclaration;
        this.personsProvided = personsProvided;
        this.termsOfService = termsOfService;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DirectorshipDeclaration directorshipDeclaration;

        private Map<String, Object> extraParams;

        private OwnershipDeclaration ownershipDeclaration;

        private PersonsProvided personsProvided;

        private TermsOfService termsOfService;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Identity.Attestations build() {
          return new AccountUpdateParams.Identity.Attestations(
              this.directorshipDeclaration,
              this.extraParams,
              this.ownershipDeclaration,
              this.personsProvided,
              this.termsOfService);
        }

        /**
         * This hash is used to attest that the directors information provided to Stripe is both
         * current and correct.
         */
        public Builder setDirectorshipDeclaration(
            AccountUpdateParams.Identity.Attestations.DirectorshipDeclaration
                directorshipDeclaration) {
          this.directorshipDeclaration = directorshipDeclaration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Identity.Attestations#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Identity.Attestations#extraParams} for the field
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
         * This hash is used to attest that the beneficial owner information provided to Stripe is
         * both current and correct.
         */
        public Builder setOwnershipDeclaration(
            AccountUpdateParams.Identity.Attestations.OwnershipDeclaration ownershipDeclaration) {
          this.ownershipDeclaration = ownershipDeclaration;
          return this;
        }

        /** Attestation that all Persons with a specific Relationship value have been provided. */
        public Builder setPersonsProvided(
            AccountUpdateParams.Identity.Attestations.PersonsProvided personsProvided) {
          this.personsProvided = personsProvided;
          return this;
        }

        /** Attestations of accepted terms of service agreements. */
        public Builder setTermsOfService(
            AccountUpdateParams.Identity.Attestations.TermsOfService termsOfService) {
          this.termsOfService = termsOfService;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DirectorshipDeclaration {
        /**
         * The time marking when the director attestation was made. Represented as a RFC 3339 date
         * &amp; time UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the director attestation was made. */
        @SerializedName("ip")
        Object ip;

        /** The user agent of the browser from which the director attestation was made. */
        @SerializedName("user_agent")
        Object userAgent;

        private DirectorshipDeclaration(
            Instant date, Map<String, Object> extraParams, Object ip, Object userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Instant date;

          private Map<String, Object> extraParams;

          private Object ip;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Attestations.DirectorshipDeclaration build() {
            return new AccountUpdateParams.Identity.Attestations.DirectorshipDeclaration(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The time marking when the director attestation was made. Represented as a RFC 3339 date
           * &amp; time UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
           */
          public Builder setDate(Instant date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Identity.Attestations.DirectorshipDeclaration#extraParams} for the
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
           * map. See {@link
           * AccountUpdateParams.Identity.Attestations.DirectorshipDeclaration#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the director attestation was made. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The IP address from which the director attestation was made. */
          public Builder setIp(EmptyParam ip) {
            this.ip = ip;
            return this;
          }

          /** The user agent of the browser from which the director attestation was made. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }

          /** The user agent of the browser from which the director attestation was made. */
          public Builder setUserAgent(EmptyParam userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class OwnershipDeclaration {
        /**
         * The time marking when the beneficial owner attestation was made. Represented as a RFC
         * 3339 date &amp; time UTC value in millisecond precision, for example:
         * 2022-09-18T13:22:18.123Z.
         */
        @SerializedName("date")
        Instant date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the beneficial owner attestation was made. */
        @SerializedName("ip")
        Object ip;

        /** The user agent of the browser from which the beneficial owner attestation was made. */
        @SerializedName("user_agent")
        Object userAgent;

        private OwnershipDeclaration(
            Instant date, Map<String, Object> extraParams, Object ip, Object userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Instant date;

          private Map<String, Object> extraParams;

          private Object ip;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Attestations.OwnershipDeclaration build() {
            return new AccountUpdateParams.Identity.Attestations.OwnershipDeclaration(
                this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The time marking when the beneficial owner attestation was made. Represented as a RFC
           * 3339 date &amp; time UTC value in millisecond precision, for example:
           * 2022-09-18T13:22:18.123Z.
           */
          public Builder setDate(Instant date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Identity.Attestations.OwnershipDeclaration#extraParams} for the
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
           * map. See {@link
           * AccountUpdateParams.Identity.Attestations.OwnershipDeclaration#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the beneficial owner attestation was made. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /** The IP address from which the beneficial owner attestation was made. */
          public Builder setIp(EmptyParam ip) {
            this.ip = ip;
            return this;
          }

          /** The user agent of the browser from which the beneficial owner attestation was made. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }

          /** The user agent of the browser from which the beneficial owner attestation was made. */
          public Builder setUserAgent(EmptyParam userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PersonsProvided {
        /**
         * Whether the company’s directors have been provided. Set this Boolean to true after
         * creating all the company’s directors with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("directors")
        Boolean directors;

        /**
         * Whether the company’s executives have been provided. Set this Boolean to true after
         * creating all the company’s executives with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("executives")
        Boolean executives;

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
         * Whether the company’s owners have been provided. Set this Boolean to true after creating
         * all the company’s owners with the <a
         * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
         */
        @SerializedName("owners")
        Boolean owners;

        /** Reason for why the company is exempt from providing ownership information. */
        @SerializedName("ownership_exemption_reason")
        OwnershipExemptionReason ownershipExemptionReason;

        private PersonsProvided(
            Boolean directors,
            Boolean executives,
            Map<String, Object> extraParams,
            Boolean owners,
            OwnershipExemptionReason ownershipExemptionReason) {
          this.directors = directors;
          this.executives = executives;
          this.extraParams = extraParams;
          this.owners = owners;
          this.ownershipExemptionReason = ownershipExemptionReason;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean directors;

          private Boolean executives;

          private Map<String, Object> extraParams;

          private Boolean owners;

          private OwnershipExemptionReason ownershipExemptionReason;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Attestations.PersonsProvided build() {
            return new AccountUpdateParams.Identity.Attestations.PersonsProvided(
                this.directors,
                this.executives,
                this.extraParams,
                this.owners,
                this.ownershipExemptionReason);
          }

          /**
           * Whether the company’s directors have been provided. Set this Boolean to true after
           * creating all the company’s directors with the <a
           * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
           */
          public Builder setDirectors(Boolean directors) {
            this.directors = directors;
            return this;
          }

          /**
           * Whether the company’s executives have been provided. Set this Boolean to true after
           * creating all the company’s executives with the <a
           * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
           */
          public Builder setExecutives(Boolean executives) {
            this.executives = executives;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Attestations.PersonsProvided#extraParams}
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
           * map. See {@link AccountUpdateParams.Identity.Attestations.PersonsProvided#extraParams}
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
           * Whether the company’s owners have been provided. Set this Boolean to true after
           * creating all the company’s owners with the <a
           * href="https://docs.stripe.com/api/v2/core/accounts/createperson">Persons API</a>.
           */
          public Builder setOwners(Boolean owners) {
            this.owners = owners;
            return this;
          }

          /** Reason for why the company is exempt from providing ownership information. */
          public Builder setOwnershipExemptionReason(
              AccountUpdateParams.Identity.Attestations.PersonsProvided.OwnershipExemptionReason
                  ownershipExemptionReason) {
            this.ownershipExemptionReason = ownershipExemptionReason;
            return this;
          }
        }

        public enum OwnershipExemptionReason implements ApiRequestParams.EnumParam {
          @SerializedName("qualified_entity_exceeds_ownership_threshold")
          QUALIFIED_ENTITY_EXCEEDS_OWNERSHIP_THRESHOLD(
              "qualified_entity_exceeds_ownership_threshold"),

          @SerializedName("qualifies_as_financial_institution")
          QUALIFIES_AS_FINANCIAL_INSTITUTION("qualifies_as_financial_institution");

          @Getter(onMethod_ = {@Override})
          private final String value;

          OwnershipExemptionReason(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class TermsOfService {
        /**
         * Details on the Account's acceptance of the <a
         * href="https://docs.stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
         * Agreement</a>.
         */
        @SerializedName("account")
        Account account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private TermsOfService(Account account, Map<String, Object> extraParams) {
          this.account = account;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Account account;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Attestations.TermsOfService build() {
            return new AccountUpdateParams.Identity.Attestations.TermsOfService(
                this.account, this.extraParams);
          }

          /**
           * Details on the Account's acceptance of the <a
           * href="https://docs.stripe.com/connect/updating-accounts#tos-acceptance">Stripe Services
           * Agreement</a>.
           */
          public Builder setAccount(
              AccountUpdateParams.Identity.Attestations.TermsOfService.Account account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Attestations.TermsOfService#extraParams}
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
           * map. See {@link AccountUpdateParams.Identity.Attestations.TermsOfService#extraParams}
           * for the field documentation.
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
        @EqualsAndHashCode(callSuper = false)
        public static class Account {
          /**
           * The time when the Account's representative accepted the terms of service. Represented
           * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
           * 2022-09-18T13:22:18.123Z.
           */
          @SerializedName("date")
          Instant date;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * The IP address from which the Account's representative accepted the terms of service.
           */
          @SerializedName("ip")
          Object ip;

          /**
           * The user agent of the browser from which the Account's representative accepted the
           * terms of service.
           */
          @SerializedName("user_agent")
          Object userAgent;

          private Account(
              Instant date, Map<String, Object> extraParams, Object ip, Object userAgent) {
            this.date = date;
            this.extraParams = extraParams;
            this.ip = ip;
            this.userAgent = userAgent;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Instant date;

            private Map<String, Object> extraParams;

            private Object ip;

            private Object userAgent;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Attestations.TermsOfService.Account build() {
              return new AccountUpdateParams.Identity.Attestations.TermsOfService.Account(
                  this.date, this.extraParams, this.ip, this.userAgent);
            }

            /**
             * The time when the Account's representative accepted the terms of service. Represented
             * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
             * 2022-09-18T13:22:18.123Z.
             */
            public Builder setDate(Instant date) {
              this.date = date;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Attestations.TermsOfService.Account#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Attestations.TermsOfService.Account#extraParams} for the
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
             * The IP address from which the Account's representative accepted the terms of service.
             */
            public Builder setIp(String ip) {
              this.ip = ip;
              return this;
            }

            /**
             * The IP address from which the Account's representative accepted the terms of service.
             */
            public Builder setIp(EmptyParam ip) {
              this.ip = ip;
              return this;
            }

            /**
             * The user agent of the browser from which the Account's representative accepted the
             * terms of service.
             */
            public Builder setUserAgent(String userAgent) {
              this.userAgent = userAgent;
              return this;
            }

            /**
             * The user agent of the browser from which the Account's representative accepted the
             * terms of service.
             */
            public Builder setUserAgent(EmptyParam userAgent) {
              this.userAgent = userAgent;
              return this;
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BusinessDetails {
      /** The business registration address of the business entity. */
      @SerializedName("address")
      Object address;

      /** The business gross annual revenue for its preceding fiscal year. */
      @SerializedName("annual_revenue")
      Object annualRevenue;

      /** A document verifying the business. */
      @SerializedName("documents")
      Object documents;

      /** The name which is used by the business. */
      @SerializedName("doing_business_as")
      Object doingBusinessAs;

      /**
       * An estimated upper bound of employees, contractors, vendors, etc. currently working for the
       * business.
       */
      @SerializedName("estimated_worker_count")
      Object estimatedWorkerCount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID numbers of a business entity. */
      @SerializedName("id_numbers")
      Object idNumbers;

      /** An estimate of the monthly revenue of the business. */
      @SerializedName("monthly_estimated_revenue")
      Object monthlyEstimatedRevenue;

      /** The phone number of the Business Entity. */
      @SerializedName("phone")
      Object phone;

      /**
       * Internal-only description of the product sold or service provided by the business. It’s
       * used by Stripe for risk and underwriting purposes.
       */
      @SerializedName("product_description")
      Object productDescription;

      /** The business legal name. */
      @SerializedName("registered_name")
      Object registeredName;

      /** The business registration address of the business entity in non latin script. */
      @SerializedName("script_addresses")
      Object scriptAddresses;

      /** The business legal name in non latin script. */
      @SerializedName("script_names")
      Object scriptNames;

      /** The category identifying the legal structure of the business. */
      @SerializedName("structure")
      ApiRequestParams.EnumParam structure;

      /** The business's publicly available website. */
      @SerializedName("url")
      Object url;

      private BusinessDetails(
          Object address,
          Object annualRevenue,
          Object documents,
          Object doingBusinessAs,
          Object estimatedWorkerCount,
          Map<String, Object> extraParams,
          Object idNumbers,
          Object monthlyEstimatedRevenue,
          Object phone,
          Object productDescription,
          Object registeredName,
          Object scriptAddresses,
          Object scriptNames,
          ApiRequestParams.EnumParam structure,
          Object url) {
        this.address = address;
        this.annualRevenue = annualRevenue;
        this.documents = documents;
        this.doingBusinessAs = doingBusinessAs;
        this.estimatedWorkerCount = estimatedWorkerCount;
        this.extraParams = extraParams;
        this.idNumbers = idNumbers;
        this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
        this.phone = phone;
        this.productDescription = productDescription;
        this.registeredName = registeredName;
        this.scriptAddresses = scriptAddresses;
        this.scriptNames = scriptNames;
        this.structure = structure;
        this.url = url;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object address;

        private Object annualRevenue;

        private Object documents;

        private Object doingBusinessAs;

        private Object estimatedWorkerCount;

        private Map<String, Object> extraParams;

        private Object idNumbers;

        private Object monthlyEstimatedRevenue;

        private Object phone;

        private Object productDescription;

        private Object registeredName;

        private Object scriptAddresses;

        private Object scriptNames;

        private ApiRequestParams.EnumParam structure;

        private Object url;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Identity.BusinessDetails build() {
          return new AccountUpdateParams.Identity.BusinessDetails(
              this.address,
              this.annualRevenue,
              this.documents,
              this.doingBusinessAs,
              this.estimatedWorkerCount,
              this.extraParams,
              this.idNumbers,
              this.monthlyEstimatedRevenue,
              this.phone,
              this.productDescription,
              this.registeredName,
              this.scriptAddresses,
              this.scriptNames,
              this.structure,
              this.url);
        }

        /** The business registration address of the business entity. */
        public Builder setAddress(AccountUpdateParams.Identity.BusinessDetails.Address address) {
          this.address = address;
          return this;
        }

        /** The business registration address of the business entity. */
        public Builder setAddress(EmptyParam address) {
          this.address = address;
          return this;
        }

        /** The business gross annual revenue for its preceding fiscal year. */
        public Builder setAnnualRevenue(
            AccountUpdateParams.Identity.BusinessDetails.AnnualRevenue annualRevenue) {
          this.annualRevenue = annualRevenue;
          return this;
        }

        /** The business gross annual revenue for its preceding fiscal year. */
        public Builder setAnnualRevenue(EmptyParam annualRevenue) {
          this.annualRevenue = annualRevenue;
          return this;
        }

        /** A document verifying the business. */
        public Builder setDocuments(
            AccountUpdateParams.Identity.BusinessDetails.Documents documents) {
          this.documents = documents;
          return this;
        }

        /** A document verifying the business. */
        public Builder setDocuments(EmptyParam documents) {
          this.documents = documents;
          return this;
        }

        /** The name which is used by the business. */
        public Builder setDoingBusinessAs(String doingBusinessAs) {
          this.doingBusinessAs = doingBusinessAs;
          return this;
        }

        /** The name which is used by the business. */
        public Builder setDoingBusinessAs(EmptyParam doingBusinessAs) {
          this.doingBusinessAs = doingBusinessAs;
          return this;
        }

        /**
         * An estimated upper bound of employees, contractors, vendors, etc. currently working for
         * the business.
         */
        public Builder setEstimatedWorkerCount(Integer estimatedWorkerCount) {
          this.estimatedWorkerCount = estimatedWorkerCount;
          return this;
        }

        /**
         * An estimated upper bound of employees, contractors, vendors, etc. currently working for
         * the business.
         */
        public Builder setEstimatedWorkerCount(EmptyParam estimatedWorkerCount) {
          this.estimatedWorkerCount = estimatedWorkerCount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Identity.BusinessDetails#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Identity.BusinessDetails#extraParams} for the field
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
         * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountUpdateParams.Identity.BusinessDetails#idNumbers} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addIdNumber(AccountUpdateParams.Identity.BusinessDetails.IdNumber element) {
          if (this.idNumbers == null || this.idNumbers instanceof EmptyParam) {
            this.idNumbers = new ArrayList<AccountUpdateParams.Identity.BusinessDetails.IdNumber>();
          }
          ((List<AccountUpdateParams.Identity.BusinessDetails.IdNumber>) this.idNumbers)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountUpdateParams.Identity.BusinessDetails#idNumbers} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllIdNumber(
            List<AccountUpdateParams.Identity.BusinessDetails.IdNumber> elements) {
          if (this.idNumbers == null || this.idNumbers instanceof EmptyParam) {
            this.idNumbers = new ArrayList<AccountUpdateParams.Identity.BusinessDetails.IdNumber>();
          }
          ((List<AccountUpdateParams.Identity.BusinessDetails.IdNumber>) this.idNumbers)
              .addAll(elements);
          return this;
        }

        /** The ID numbers of a business entity. */
        public Builder setIdNumbers(EmptyParam idNumbers) {
          this.idNumbers = idNumbers;
          return this;
        }

        /** The ID numbers of a business entity. */
        public Builder setIdNumbers(
            List<AccountUpdateParams.Identity.BusinessDetails.IdNumber> idNumbers) {
          this.idNumbers = idNumbers;
          return this;
        }

        /** An estimate of the monthly revenue of the business. */
        public Builder setMonthlyEstimatedRevenue(
            AccountUpdateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue
                monthlyEstimatedRevenue) {
          this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
          return this;
        }

        /** An estimate of the monthly revenue of the business. */
        public Builder setMonthlyEstimatedRevenue(EmptyParam monthlyEstimatedRevenue) {
          this.monthlyEstimatedRevenue = monthlyEstimatedRevenue;
          return this;
        }

        /** The phone number of the Business Entity. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** The phone number of the Business Entity. */
        public Builder setPhone(EmptyParam phone) {
          this.phone = phone;
          return this;
        }

        /**
         * Internal-only description of the product sold or service provided by the business. It’s
         * used by Stripe for risk and underwriting purposes.
         */
        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /**
         * Internal-only description of the product sold or service provided by the business. It’s
         * used by Stripe for risk and underwriting purposes.
         */
        public Builder setProductDescription(EmptyParam productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /** The business legal name. */
        public Builder setRegisteredName(String registeredName) {
          this.registeredName = registeredName;
          return this;
        }

        /** The business legal name. */
        public Builder setRegisteredName(EmptyParam registeredName) {
          this.registeredName = registeredName;
          return this;
        }

        /** The business registration address of the business entity in non latin script. */
        public Builder setScriptAddresses(
            AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The business registration address of the business entity in non latin script. */
        public Builder setScriptAddresses(EmptyParam scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The business legal name in non latin script. */
        public Builder setScriptNames(
            AccountUpdateParams.Identity.BusinessDetails.ScriptNames scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The business legal name in non latin script. */
        public Builder setScriptNames(EmptyParam scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The category identifying the legal structure of the business. */
        public Builder setStructure(
            AccountUpdateParams.Identity.BusinessDetails.Structure structure) {
          this.structure = structure;
          return this;
        }

        /** The category identifying the legal structure of the business. */
        public Builder setStructure(EmptyParam structure) {
          this.structure = structure;
          return this;
        }

        /** The business's publicly available website. */
        public Builder setUrl(String url) {
          this.url = url;
          return this;
        }

        /** The business's publicly available website. */
        public Builder setUrl(EmptyParam url) {
          this.url = url;
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
        ApiRequestParams.EnumParam country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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

        /** Town or cho-me. */
        @SerializedName("town")
        Object town;

        private Address(
            Object city,
            ApiRequestParams.EnumParam country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state,
            Object town) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
          this.town = town;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object city;

          private ApiRequestParams.EnumParam country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          private Object town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.Address build() {
            return new AccountUpdateParams.Identity.BusinessDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state,
                this.town);
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
          public Builder setCountry(
              AccountUpdateParams.Identity.BusinessDetails.Address.Country country) {
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
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.Address#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.Address#extraParams} for
           * the field documentation.
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

          /** Town or cho-me. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }

          /** Town or cho-me. */
          public Builder setTown(EmptyParam town) {
            this.town = town;
            return this;
          }
        }

        public enum Country implements ApiRequestParams.EnumParam {
          @SerializedName("ad")
          AD("ad"),

          @SerializedName("ae")
          AE("ae"),

          @SerializedName("af")
          AF("af"),

          @SerializedName("ag")
          AG("ag"),

          @SerializedName("ai")
          AI("ai"),

          @SerializedName("al")
          AL("al"),

          @SerializedName("am")
          AM("am"),

          @SerializedName("ao")
          AO("ao"),

          @SerializedName("aq")
          AQ("aq"),

          @SerializedName("ar")
          AR("ar"),

          @SerializedName("as")
          AS("as"),

          @SerializedName("at")
          AT("at"),

          @SerializedName("au")
          AU("au"),

          @SerializedName("aw")
          AW("aw"),

          @SerializedName("ax")
          AX("ax"),

          @SerializedName("az")
          AZ("az"),

          @SerializedName("ba")
          BA("ba"),

          @SerializedName("bb")
          BB("bb"),

          @SerializedName("bd")
          BD("bd"),

          @SerializedName("be")
          BE("be"),

          @SerializedName("bf")
          BF("bf"),

          @SerializedName("bg")
          BG("bg"),

          @SerializedName("bh")
          BH("bh"),

          @SerializedName("bi")
          BI("bi"),

          @SerializedName("bj")
          BJ("bj"),

          @SerializedName("bl")
          BL("bl"),

          @SerializedName("bm")
          BM("bm"),

          @SerializedName("bn")
          BN("bn"),

          @SerializedName("bo")
          BO("bo"),

          @SerializedName("bq")
          BQ("bq"),

          @SerializedName("br")
          BR("br"),

          @SerializedName("bs")
          BS("bs"),

          @SerializedName("bt")
          BT("bt"),

          @SerializedName("bv")
          BV("bv"),

          @SerializedName("bw")
          BW("bw"),

          @SerializedName("by")
          BY("by"),

          @SerializedName("bz")
          BZ("bz"),

          @SerializedName("ca")
          CA("ca"),

          @SerializedName("cc")
          CC("cc"),

          @SerializedName("cd")
          CD("cd"),

          @SerializedName("cf")
          CF("cf"),

          @SerializedName("cg")
          CG("cg"),

          @SerializedName("ch")
          CH("ch"),

          @SerializedName("ci")
          CI("ci"),

          @SerializedName("ck")
          CK("ck"),

          @SerializedName("cl")
          CL("cl"),

          @SerializedName("cm")
          CM("cm"),

          @SerializedName("cn")
          CN("cn"),

          @SerializedName("co")
          CO("co"),

          @SerializedName("cr")
          CR("cr"),

          @SerializedName("cu")
          CU("cu"),

          @SerializedName("cv")
          CV("cv"),

          @SerializedName("cw")
          CW("cw"),

          @SerializedName("cx")
          CX("cx"),

          @SerializedName("cy")
          CY("cy"),

          @SerializedName("cz")
          CZ("cz"),

          @SerializedName("de")
          DE("de"),

          @SerializedName("dj")
          DJ("dj"),

          @SerializedName("dk")
          DK("dk"),

          @SerializedName("dm")
          DM("dm"),

          @SerializedName("do")
          DO("do"),

          @SerializedName("dz")
          DZ("dz"),

          @SerializedName("ec")
          EC("ec"),

          @SerializedName("ee")
          EE("ee"),

          @SerializedName("eg")
          EG("eg"),

          @SerializedName("eh")
          EH("eh"),

          @SerializedName("er")
          ER("er"),

          @SerializedName("es")
          ES("es"),

          @SerializedName("et")
          ET("et"),

          @SerializedName("fi")
          FI("fi"),

          @SerializedName("fj")
          FJ("fj"),

          @SerializedName("fk")
          FK("fk"),

          @SerializedName("fm")
          FM("fm"),

          @SerializedName("fo")
          FO("fo"),

          @SerializedName("fr")
          FR("fr"),

          @SerializedName("ga")
          GA("ga"),

          @SerializedName("gb")
          GB("gb"),

          @SerializedName("gd")
          GD("gd"),

          @SerializedName("ge")
          GE("ge"),

          @SerializedName("gf")
          GF("gf"),

          @SerializedName("gg")
          GG("gg"),

          @SerializedName("gh")
          GH("gh"),

          @SerializedName("gi")
          GI("gi"),

          @SerializedName("gl")
          GL("gl"),

          @SerializedName("gm")
          GM("gm"),

          @SerializedName("gn")
          GN("gn"),

          @SerializedName("gp")
          GP("gp"),

          @SerializedName("gq")
          GQ("gq"),

          @SerializedName("gr")
          GR("gr"),

          @SerializedName("gs")
          GS("gs"),

          @SerializedName("gt")
          GT("gt"),

          @SerializedName("gu")
          GU("gu"),

          @SerializedName("gw")
          GW("gw"),

          @SerializedName("gy")
          GY("gy"),

          @SerializedName("hk")
          HK("hk"),

          @SerializedName("hm")
          HM("hm"),

          @SerializedName("hn")
          HN("hn"),

          @SerializedName("hr")
          HR("hr"),

          @SerializedName("ht")
          HT("ht"),

          @SerializedName("hu")
          HU("hu"),

          @SerializedName("id")
          ID("id"),

          @SerializedName("ie")
          IE("ie"),

          @SerializedName("il")
          IL("il"),

          @SerializedName("im")
          IM("im"),

          @SerializedName("in")
          IN("in"),

          @SerializedName("io")
          IO("io"),

          @SerializedName("iq")
          IQ("iq"),

          @SerializedName("ir")
          IR("ir"),

          @SerializedName("is")
          IS("is"),

          @SerializedName("it")
          IT("it"),

          @SerializedName("je")
          JE("je"),

          @SerializedName("jm")
          JM("jm"),

          @SerializedName("jo")
          JO("jo"),

          @SerializedName("jp")
          JP("jp"),

          @SerializedName("ke")
          KE("ke"),

          @SerializedName("kg")
          KG("kg"),

          @SerializedName("kh")
          KH("kh"),

          @SerializedName("ki")
          KI("ki"),

          @SerializedName("km")
          KM("km"),

          @SerializedName("kn")
          KN("kn"),

          @SerializedName("kp")
          KP("kp"),

          @SerializedName("kr")
          KR("kr"),

          @SerializedName("kw")
          KW("kw"),

          @SerializedName("ky")
          KY("ky"),

          @SerializedName("kz")
          KZ("kz"),

          @SerializedName("la")
          LA("la"),

          @SerializedName("lb")
          LB("lb"),

          @SerializedName("lc")
          LC("lc"),

          @SerializedName("li")
          LI("li"),

          @SerializedName("lk")
          LK("lk"),

          @SerializedName("lr")
          LR("lr"),

          @SerializedName("ls")
          LS("ls"),

          @SerializedName("lt")
          LT("lt"),

          @SerializedName("lu")
          LU("lu"),

          @SerializedName("lv")
          LV("lv"),

          @SerializedName("ly")
          LY("ly"),

          @SerializedName("ma")
          MA("ma"),

          @SerializedName("mc")
          MC("mc"),

          @SerializedName("md")
          MD("md"),

          @SerializedName("me")
          ME("me"),

          @SerializedName("mf")
          MF("mf"),

          @SerializedName("mg")
          MG("mg"),

          @SerializedName("mh")
          MH("mh"),

          @SerializedName("mk")
          MK("mk"),

          @SerializedName("ml")
          ML("ml"),

          @SerializedName("mm")
          MM("mm"),

          @SerializedName("mn")
          MN("mn"),

          @SerializedName("mo")
          MO("mo"),

          @SerializedName("mp")
          MP("mp"),

          @SerializedName("mq")
          MQ("mq"),

          @SerializedName("mr")
          MR("mr"),

          @SerializedName("ms")
          MS("ms"),

          @SerializedName("mt")
          MT("mt"),

          @SerializedName("mu")
          MU("mu"),

          @SerializedName("mv")
          MV("mv"),

          @SerializedName("mw")
          MW("mw"),

          @SerializedName("mx")
          MX("mx"),

          @SerializedName("my")
          MY("my"),

          @SerializedName("mz")
          MZ("mz"),

          @SerializedName("na")
          NA("na"),

          @SerializedName("nc")
          NC("nc"),

          @SerializedName("ne")
          NE("ne"),

          @SerializedName("nf")
          NF("nf"),

          @SerializedName("ng")
          NG("ng"),

          @SerializedName("ni")
          NI("ni"),

          @SerializedName("nl")
          NL("nl"),

          @SerializedName("no")
          NO("no"),

          @SerializedName("np")
          NP("np"),

          @SerializedName("nr")
          NR("nr"),

          @SerializedName("nu")
          NU("nu"),

          @SerializedName("nz")
          NZ("nz"),

          @SerializedName("om")
          OM("om"),

          @SerializedName("pa")
          PA("pa"),

          @SerializedName("pe")
          PE("pe"),

          @SerializedName("pf")
          PF("pf"),

          @SerializedName("pg")
          PG("pg"),

          @SerializedName("ph")
          PH("ph"),

          @SerializedName("pk")
          PK("pk"),

          @SerializedName("pl")
          PL("pl"),

          @SerializedName("pm")
          PM("pm"),

          @SerializedName("pn")
          PN("pn"),

          @SerializedName("pr")
          PR("pr"),

          @SerializedName("ps")
          PS("ps"),

          @SerializedName("pt")
          PT("pt"),

          @SerializedName("pw")
          PW("pw"),

          @SerializedName("py")
          PY("py"),

          @SerializedName("qa")
          QA("qa"),

          @SerializedName("qz")
          QZ("qz"),

          @SerializedName("re")
          RE("re"),

          @SerializedName("ro")
          RO("ro"),

          @SerializedName("rs")
          RS("rs"),

          @SerializedName("ru")
          RU("ru"),

          @SerializedName("rw")
          RW("rw"),

          @SerializedName("sa")
          SA("sa"),

          @SerializedName("sb")
          SB("sb"),

          @SerializedName("sc")
          SC("sc"),

          @SerializedName("sd")
          SD("sd"),

          @SerializedName("se")
          SE("se"),

          @SerializedName("sg")
          SG("sg"),

          @SerializedName("sh")
          SH("sh"),

          @SerializedName("si")
          SI("si"),

          @SerializedName("sj")
          SJ("sj"),

          @SerializedName("sk")
          SK("sk"),

          @SerializedName("sl")
          SL("sl"),

          @SerializedName("sm")
          SM("sm"),

          @SerializedName("sn")
          SN("sn"),

          @SerializedName("so")
          SO("so"),

          @SerializedName("sr")
          SR("sr"),

          @SerializedName("ss")
          SS("ss"),

          @SerializedName("st")
          ST("st"),

          @SerializedName("sv")
          SV("sv"),

          @SerializedName("sx")
          SX("sx"),

          @SerializedName("sy")
          SY("sy"),

          @SerializedName("sz")
          SZ("sz"),

          @SerializedName("tc")
          TC("tc"),

          @SerializedName("td")
          TD("td"),

          @SerializedName("tf")
          TF("tf"),

          @SerializedName("tg")
          TG("tg"),

          @SerializedName("th")
          TH("th"),

          @SerializedName("tj")
          TJ("tj"),

          @SerializedName("tk")
          TK("tk"),

          @SerializedName("tl")
          TL("tl"),

          @SerializedName("tm")
          TM("tm"),

          @SerializedName("tn")
          TN("tn"),

          @SerializedName("to")
          TO("to"),

          @SerializedName("tr")
          TR("tr"),

          @SerializedName("tt")
          TT("tt"),

          @SerializedName("tv")
          TV("tv"),

          @SerializedName("tw")
          TW("tw"),

          @SerializedName("tz")
          TZ("tz"),

          @SerializedName("ua")
          UA("ua"),

          @SerializedName("ug")
          UG("ug"),

          @SerializedName("um")
          UM("um"),

          @SerializedName("us")
          US("us"),

          @SerializedName("uy")
          UY("uy"),

          @SerializedName("uz")
          UZ("uz"),

          @SerializedName("va")
          VA("va"),

          @SerializedName("vc")
          VC("vc"),

          @SerializedName("ve")
          VE("ve"),

          @SerializedName("vg")
          VG("vg"),

          @SerializedName("vi")
          VI("vi"),

          @SerializedName("vn")
          VN("vn"),

          @SerializedName("vu")
          VU("vu"),

          @SerializedName("wf")
          WF("wf"),

          @SerializedName("ws")
          WS("ws"),

          @SerializedName("ye")
          YE("ye"),

          @SerializedName("yt")
          YT("yt"),

          @SerializedName("za")
          ZA("za"),

          @SerializedName("zm")
          ZM("zm"),

          @SerializedName("zw")
          ZW("zw");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Country(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AnnualRevenue {
        /** A non-negative integer representing the amount in the smallest currency unit. */
        @SerializedName("amount")
        Amount amount;

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
         * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
         * the 31st of December, 2023.
         */
        @SerializedName("fiscal_year_end")
        Object fiscalYearEnd;

        private AnnualRevenue(
            Amount amount, Map<String, Object> extraParams, Object fiscalYearEnd) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.fiscalYearEnd = fiscalYearEnd;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Amount amount;

          private Map<String, Object> extraParams;

          private Object fiscalYearEnd;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.AnnualRevenue build() {
            return new AccountUpdateParams.Identity.BusinessDetails.AnnualRevenue(
                this.amount, this.extraParams, this.fiscalYearEnd);
          }

          /** A non-negative integer representing the amount in the smallest currency unit. */
          public Builder setAmount(Amount amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.AnnualRevenue#extraParams}
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
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.AnnualRevenue#extraParams}
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
           * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
           * the 31st of December, 2023.
           */
          public Builder setFiscalYearEnd(String fiscalYearEnd) {
            this.fiscalYearEnd = fiscalYearEnd;
            return this;
          }

          /**
           * The close-out date of the preceding fiscal year in ISO 8601 format. E.g. 2023-12-31 for
           * the 31st of December, 2023.
           */
          public Builder setFiscalYearEnd(EmptyParam fiscalYearEnd) {
            this.fiscalYearEnd = fiscalYearEnd;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Documents {
        /**
         * One or more documents that support the bank account ownership verification requirement.
         * Must be a document associated with the account’s primary active bank account that
         * displays the last 4 digits of the account number, either a statement or a check.
         */
        @SerializedName("bank_account_ownership_verification")
        Object bankAccountOwnershipVerification;

        /** One or more documents that demonstrate proof of a company’s license to operate. */
        @SerializedName("company_license")
        Object companyLicense;

        /** One or more documents showing the company’s Memorandum of Association. */
        @SerializedName("company_memorandum_of_association")
        Object companyMemorandumOfAssociation;

        /**
         * Certain countries only: One or more documents showing the ministerial decree legalizing
         * the company’s establishment.
         */
        @SerializedName("company_ministerial_decree")
        Object companyMinisterialDecree;

        /**
         * One or more documents that demonstrate proof of a company’s registration with the
         * appropriate local authorities.
         */
        @SerializedName("company_registration_verification")
        Object companyRegistrationVerification;

        /** One or more documents that demonstrate proof of a company’s tax ID. */
        @SerializedName("company_tax_id_verification")
        Object companyTaxIdVerification;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A document verifying the business. */
        @SerializedName("primary_verification")
        Object primaryVerification;

        /**
         * One or more documents showing the company’s proof of registration with the national
         * business registry.
         */
        @SerializedName("proof_of_registration")
        Object proofOfRegistration;

        /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
        @SerializedName("proof_of_ultimate_beneficial_ownership")
        ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

        private Documents(
            Object bankAccountOwnershipVerification,
            Object companyLicense,
            Object companyMemorandumOfAssociation,
            Object companyMinisterialDecree,
            Object companyRegistrationVerification,
            Object companyTaxIdVerification,
            Map<String, Object> extraParams,
            Object primaryVerification,
            Object proofOfRegistration,
            ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership) {
          this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
          this.companyLicense = companyLicense;
          this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
          this.companyMinisterialDecree = companyMinisterialDecree;
          this.companyRegistrationVerification = companyRegistrationVerification;
          this.companyTaxIdVerification = companyTaxIdVerification;
          this.extraParams = extraParams;
          this.primaryVerification = primaryVerification;
          this.proofOfRegistration = proofOfRegistration;
          this.proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object bankAccountOwnershipVerification;

          private Object companyLicense;

          private Object companyMemorandumOfAssociation;

          private Object companyMinisterialDecree;

          private Object companyRegistrationVerification;

          private Object companyTaxIdVerification;

          private Map<String, Object> extraParams;

          private Object primaryVerification;

          private Object proofOfRegistration;

          private ProofOfUltimateBeneficialOwnership proofOfUltimateBeneficialOwnership;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.Documents build() {
            return new AccountUpdateParams.Identity.BusinessDetails.Documents(
                this.bankAccountOwnershipVerification,
                this.companyLicense,
                this.companyMemorandumOfAssociation,
                this.companyMinisterialDecree,
                this.companyRegistrationVerification,
                this.companyTaxIdVerification,
                this.extraParams,
                this.primaryVerification,
                this.proofOfRegistration,
                this.proofOfUltimateBeneficialOwnership);
          }

          /**
           * One or more documents that support the bank account ownership verification requirement.
           * Must be a document associated with the account’s primary active bank account that
           * displays the last 4 digits of the account number, either a statement or a check.
           */
          public Builder setBankAccountOwnershipVerification(
              AccountUpdateParams.Identity.BusinessDetails.Documents
                      .BankAccountOwnershipVerification
                  bankAccountOwnershipVerification) {
            this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
            return this;
          }

          /**
           * One or more documents that support the bank account ownership verification requirement.
           * Must be a document associated with the account’s primary active bank account that
           * displays the last 4 digits of the account number, either a statement or a check.
           */
          public Builder setBankAccountOwnershipVerification(
              EmptyParam bankAccountOwnershipVerification) {
            this.bankAccountOwnershipVerification = bankAccountOwnershipVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s license to operate. */
          public Builder setCompanyLicense(
              AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense
                  companyLicense) {
            this.companyLicense = companyLicense;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s license to operate. */
          public Builder setCompanyLicense(EmptyParam companyLicense) {
            this.companyLicense = companyLicense;
            return this;
          }

          /** One or more documents showing the company’s Memorandum of Association. */
          public Builder setCompanyMemorandumOfAssociation(
              AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation
                  companyMemorandumOfAssociation) {
            this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
            return this;
          }

          /** One or more documents showing the company’s Memorandum of Association. */
          public Builder setCompanyMemorandumOfAssociation(
              EmptyParam companyMemorandumOfAssociation) {
            this.companyMemorandumOfAssociation = companyMemorandumOfAssociation;
            return this;
          }

          /**
           * Certain countries only: One or more documents showing the ministerial decree legalizing
           * the company’s establishment.
           */
          public Builder setCompanyMinisterialDecree(
              AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree
                  companyMinisterialDecree) {
            this.companyMinisterialDecree = companyMinisterialDecree;
            return this;
          }

          /**
           * Certain countries only: One or more documents showing the ministerial decree legalizing
           * the company’s establishment.
           */
          public Builder setCompanyMinisterialDecree(EmptyParam companyMinisterialDecree) {
            this.companyMinisterialDecree = companyMinisterialDecree;
            return this;
          }

          /**
           * One or more documents that demonstrate proof of a company’s registration with the
           * appropriate local authorities.
           */
          public Builder setCompanyRegistrationVerification(
              AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification
                  companyRegistrationVerification) {
            this.companyRegistrationVerification = companyRegistrationVerification;
            return this;
          }

          /**
           * One or more documents that demonstrate proof of a company’s registration with the
           * appropriate local authorities.
           */
          public Builder setCompanyRegistrationVerification(
              EmptyParam companyRegistrationVerification) {
            this.companyRegistrationVerification = companyRegistrationVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s tax ID. */
          public Builder setCompanyTaxIdVerification(
              AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification
                  companyTaxIdVerification) {
            this.companyTaxIdVerification = companyTaxIdVerification;
            return this;
          }

          /** One or more documents that demonstrate proof of a company’s tax ID. */
          public Builder setCompanyTaxIdVerification(EmptyParam companyTaxIdVerification) {
            this.companyTaxIdVerification = companyTaxIdVerification;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.Documents#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.Documents#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A document verifying the business. */
          public Builder setPrimaryVerification(
              AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                  primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /** A document verifying the business. */
          public Builder setPrimaryVerification(EmptyParam primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /**
           * One or more documents showing the company’s proof of registration with the national
           * business registry.
           */
          public Builder setProofOfRegistration(
              AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration
                  proofOfRegistration) {
            this.proofOfRegistration = proofOfRegistration;
            return this;
          }

          /**
           * One or more documents showing the company’s proof of registration with the national
           * business registry.
           */
          public Builder setProofOfRegistration(EmptyParam proofOfRegistration) {
            this.proofOfRegistration = proofOfRegistration;
            return this;
          }

          /** One or more documents that demonstrate proof of ultimate beneficial ownership. */
          public Builder setProofOfUltimateBeneficialOwnership(
              AccountUpdateParams.Identity.BusinessDetails.Documents
                      .ProofOfUltimateBeneficialOwnership
                  proofOfUltimateBeneficialOwnership) {
            this.proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BankAccountOwnershipVerification {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private BankAccountOwnershipVerification(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents
                    .BankAccountOwnershipVerification
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents
                  .BankAccountOwnershipVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.BankAccountOwnershipVerification#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents
                        .BankAccountOwnershipVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyLicense {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyLicense(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense#files} for the
             * field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense#files} for the
             * field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyLicense.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyMemorandumOfAssociation {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyMemorandumOfAssociation(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents
                    .CompanyMemorandumOfAssociation
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents
                  .CompanyMemorandumOfAssociation(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMemorandumOfAssociation#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents
                        .CompanyMemorandumOfAssociation.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyMinisterialDecree {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyMinisterialDecree(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents
                  .CompanyMinisterialDecree(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyMinisterialDecree.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyRegistrationVerification {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyRegistrationVerification(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents
                    .CompanyRegistrationVerification
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents
                  .CompanyRegistrationVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyRegistrationVerification#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents
                        .CompanyRegistrationVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyTaxIdVerification {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyTaxIdVerification(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents
                  .CompanyTaxIdVerification(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents.CompanyTaxIdVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryVerification {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
           * referring to each side of the document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * <strong>Required.</strong> The format of the verification document. Currently supports
           * {@code front_back} only.
           */
          @SerializedName("type")
          Type type;

          private PrimaryVerification(
              Map<String, Object> extraParams, FrontBack frontBack, Type type) {
            this.extraParams = extraParams;
            this.frontBack = frontBack;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FrontBack frontBack;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification#extraParams}
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
             * <strong>Required.</strong> The <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
             * referring to each side of the document.
             */
            public Builder setFrontBack(
                AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack {
            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the back of the verification document. The purpose of the uploaded
             * file should be 'identity_document'. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            @SerializedName("back")
            Object back;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
             */
            @SerializedName("front")
            Object front;

            private FrontBack(Object back, Map<String, Object> extraParams, Object front) {
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
              public AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification
                      .FrontBack
                  build() {
                return new AccountUpdateParams.Identity.BusinessDetails.Documents
                    .PrimaryVerification.FrontBack(this.back, this.extraParams, this.front);
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(String back) {
                this.back = back;
                return this;
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(EmptyParam back) {
                this.back = back;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Identity.BusinessDetails.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setFront(String front) {
                this.front = front;
                return this;
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setFront(EmptyParam front) {
                this.front = front;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("front_back")
            FRONT_BACK("front_back");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfRegistration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private ProofOfRegistration(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#files} for
             * the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration#files} for
             * the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfRegistration.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ProofOfUltimateBeneficialOwnership {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private ProofOfUltimateBeneficialOwnership(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.Documents
                    .ProofOfUltimateBeneficialOwnership
                build() {
              return new AccountUpdateParams.Identity.BusinessDetails.Documents
                  .ProofOfUltimateBeneficialOwnership(this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#files}
             * for the field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.Documents.ProofOfUltimateBeneficialOwnership#files}
             * for the field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.BusinessDetails.Documents
                        .ProofOfUltimateBeneficialOwnership.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class IdNumber {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The registrar of the ID number (Only valid for DE ID number types). */
        @SerializedName("registrar")
        Object registrar;

        /** <strong>Required.</strong> Open Enum. The ID number type of a business entity. */
        @SerializedName("type")
        Type type;

        /** <strong>Required.</strong> The value of the ID number. */
        @SerializedName("value")
        Object value;

        private IdNumber(
            Map<String, Object> extraParams, Object registrar, Type type, Object value) {
          this.extraParams = extraParams;
          this.registrar = registrar;
          this.type = type;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object registrar;

          private Type type;

          private Object value;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.IdNumber build() {
            return new AccountUpdateParams.Identity.BusinessDetails.IdNumber(
                this.extraParams, this.registrar, this.type, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.IdNumber#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.IdNumber#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The registrar of the ID number (Only valid for DE ID number types). */
          public Builder setRegistrar(String registrar) {
            this.registrar = registrar;
            return this;
          }

          /** The registrar of the ID number (Only valid for DE ID number types). */
          public Builder setRegistrar(EmptyParam registrar) {
            this.registrar = registrar;
            return this;
          }

          /** <strong>Required.</strong> Open Enum. The ID number type of a business entity. */
          public Builder setType(AccountUpdateParams.Identity.BusinessDetails.IdNumber.Type type) {
            this.type = type;
            return this;
          }

          /** <strong>Required.</strong> The value of the ID number. */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }

          /** <strong>Required.</strong> The value of the ID number. */
          public Builder setValue(EmptyParam value) {
            this.value = value;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("ae_crn")
          AE_CRN("ae_crn"),

          @SerializedName("ae_vat")
          AE_VAT("ae_vat"),

          @SerializedName("at_fn")
          AT_FN("at_fn"),

          @SerializedName("au_abn")
          AU_ABN("au_abn"),

          @SerializedName("au_acn")
          AU_ACN("au_acn"),

          @SerializedName("au_in")
          AU_IN("au_in"),

          @SerializedName("be_cbe")
          BE_CBE("be_cbe"),

          @SerializedName("bg_uic")
          BG_UIC("bg_uic"),

          @SerializedName("br_cnpj")
          BR_CNPJ("br_cnpj"),

          @SerializedName("ca_cn")
          CA_CN("ca_cn"),

          @SerializedName("ca_crarr")
          CA_CRARR("ca_crarr"),

          @SerializedName("ca_neq")
          CA_NEQ("ca_neq"),

          @SerializedName("ca_rid")
          CA_RID("ca_rid"),

          @SerializedName("ch_chid")
          CH_CHID("ch_chid"),

          @SerializedName("ch_uid")
          CH_UID("ch_uid"),

          @SerializedName("cy_tic")
          CY_TIC("cy_tic"),

          @SerializedName("cz_ico")
          CZ_ICO("cz_ico"),

          @SerializedName("de_hrn")
          DE_HRN("de_hrn"),

          @SerializedName("de_vat")
          DE_VAT("de_vat"),

          @SerializedName("dk_cvr")
          DK_CVR("dk_cvr"),

          @SerializedName("ee_rk")
          EE_RK("ee_rk"),

          @SerializedName("es_cif")
          ES_CIF("es_cif"),

          @SerializedName("fi_yt")
          FI_YT("fi_yt"),

          @SerializedName("fr_siren")
          FR_SIREN("fr_siren"),

          @SerializedName("fr_vat")
          FR_VAT("fr_vat"),

          @SerializedName("gb_crn")
          GB_CRN("gb_crn"),

          @SerializedName("gi_crn")
          GI_CRN("gi_crn"),

          @SerializedName("gr_gemi")
          GR_GEMI("gr_gemi"),

          @SerializedName("hk_br")
          HK_BR("hk_br"),

          @SerializedName("hk_cr")
          HK_CR("hk_cr"),

          @SerializedName("hk_mbs")
          HK_MBS("hk_mbs"),

          @SerializedName("hu_cjs")
          HU_CJS("hu_cjs"),

          @SerializedName("ie_crn")
          IE_CRN("ie_crn"),

          @SerializedName("it_rea")
          IT_REA("it_rea"),

          @SerializedName("it_vat")
          IT_VAT("it_vat"),

          @SerializedName("jp_cn")
          JP_CN("jp_cn"),

          @SerializedName("li_uid")
          LI_UID("li_uid"),

          @SerializedName("lt_ccrn")
          LT_CCRN("lt_ccrn"),

          @SerializedName("lu_rcs")
          LU_RCS("lu_rcs"),

          @SerializedName("lv_urn")
          LV_URN("lv_urn"),

          @SerializedName("mt_crn")
          MT_CRN("mt_crn"),

          @SerializedName("mx_rfc")
          MX_RFC("mx_rfc"),

          @SerializedName("my_brn")
          MY_BRN("my_brn"),

          @SerializedName("my_coid")
          MY_COID("my_coid"),

          @SerializedName("my_sst")
          MY_SST("my_sst"),

          @SerializedName("nl_kvk")
          NL_KVK("nl_kvk"),

          @SerializedName("no_orgnr")
          NO_ORGNR("no_orgnr"),

          @SerializedName("nz_bn")
          NZ_BN("nz_bn"),

          @SerializedName("pl_regon")
          PL_REGON("pl_regon"),

          @SerializedName("pt_vat")
          PT_VAT("pt_vat"),

          @SerializedName("ro_cui")
          RO_CUI("ro_cui"),

          @SerializedName("se_orgnr")
          SE_ORGNR("se_orgnr"),

          @SerializedName("sg_uen")
          SG_UEN("sg_uen"),

          @SerializedName("si_msp")
          SI_MSP("si_msp"),

          @SerializedName("sk_ico")
          SK_ICO("sk_ico"),

          @SerializedName("th_crn")
          TH_CRN("th_crn"),

          @SerializedName("th_prn")
          TH_PRN("th_prn"),

          @SerializedName("th_tin")
          TH_TIN("th_tin"),

          @SerializedName("us_ein")
          US_EIN("us_ein");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MonthlyEstimatedRevenue {
        /** A non-negative integer representing the amount in the smallest currency unit. */
        @SerializedName("amount")
        Amount amount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private MonthlyEstimatedRevenue(Amount amount, Map<String, Object> extraParams) {
          this.amount = amount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Amount amount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue build() {
            return new AccountUpdateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue(
                this.amount, this.extraParams);
          }

          /** A non-negative integer representing the amount in the smallest currency unit. */
          public Builder setAmount(Amount amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue#extraParams} for
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
           * map. See {@link
           * AccountUpdateParams.Identity.BusinessDetails.MonthlyEstimatedRevenue#extraParams} for
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptAddresses {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Kana Address. */
        @SerializedName("kana")
        Object kana;

        /** Kanji Address. */
        @SerializedName("kanji")
        Object kanji;

        private ScriptAddresses(Map<String, Object> extraParams, Object kana, Object kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object kana;

          private Object kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses build() {
            return new AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses#extraParams} for the field
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
           * map. See {@link
           * AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Kana Address. */
          public Builder setKana(
              AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kana Address. */
          public Builder setKana(EmptyParam kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(
              AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(EmptyParam kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          ApiRequestParams.EnumParam country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          Object town;

          private Kana(
              Object city,
              ApiRequestParams.EnumParam country,
              Map<String, Object> extraParams,
              Object line1,
              Object line2,
              Object postalCode,
              Object state,
              Object town) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
            this.town = town;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object city;

            private ApiRequestParams.EnumParam country;

            private Map<String, Object> extraParams;

            private Object line1;

            private Object line2;

            private Object postalCode;

            private Object state;

            private Object town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kana build() {
              return new AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kana(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(
                AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kana.Country country) {
              this.country = country;
              return this;
            }

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kana#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kana#extraParams} for
             * the field documentation.
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }

            /** Town or cho-me. */
            public Builder setTown(EmptyParam town) {
              this.town = town;
              return this;
            }
          }

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("ad")
            AD("ad"),

            @SerializedName("ae")
            AE("ae"),

            @SerializedName("af")
            AF("af"),

            @SerializedName("ag")
            AG("ag"),

            @SerializedName("ai")
            AI("ai"),

            @SerializedName("al")
            AL("al"),

            @SerializedName("am")
            AM("am"),

            @SerializedName("ao")
            AO("ao"),

            @SerializedName("aq")
            AQ("aq"),

            @SerializedName("ar")
            AR("ar"),

            @SerializedName("as")
            AS("as"),

            @SerializedName("at")
            AT("at"),

            @SerializedName("au")
            AU("au"),

            @SerializedName("aw")
            AW("aw"),

            @SerializedName("ax")
            AX("ax"),

            @SerializedName("az")
            AZ("az"),

            @SerializedName("ba")
            BA("ba"),

            @SerializedName("bb")
            BB("bb"),

            @SerializedName("bd")
            BD("bd"),

            @SerializedName("be")
            BE("be"),

            @SerializedName("bf")
            BF("bf"),

            @SerializedName("bg")
            BG("bg"),

            @SerializedName("bh")
            BH("bh"),

            @SerializedName("bi")
            BI("bi"),

            @SerializedName("bj")
            BJ("bj"),

            @SerializedName("bl")
            BL("bl"),

            @SerializedName("bm")
            BM("bm"),

            @SerializedName("bn")
            BN("bn"),

            @SerializedName("bo")
            BO("bo"),

            @SerializedName("bq")
            BQ("bq"),

            @SerializedName("br")
            BR("br"),

            @SerializedName("bs")
            BS("bs"),

            @SerializedName("bt")
            BT("bt"),

            @SerializedName("bv")
            BV("bv"),

            @SerializedName("bw")
            BW("bw"),

            @SerializedName("by")
            BY("by"),

            @SerializedName("bz")
            BZ("bz"),

            @SerializedName("ca")
            CA("ca"),

            @SerializedName("cc")
            CC("cc"),

            @SerializedName("cd")
            CD("cd"),

            @SerializedName("cf")
            CF("cf"),

            @SerializedName("cg")
            CG("cg"),

            @SerializedName("ch")
            CH("ch"),

            @SerializedName("ci")
            CI("ci"),

            @SerializedName("ck")
            CK("ck"),

            @SerializedName("cl")
            CL("cl"),

            @SerializedName("cm")
            CM("cm"),

            @SerializedName("cn")
            CN("cn"),

            @SerializedName("co")
            CO("co"),

            @SerializedName("cr")
            CR("cr"),

            @SerializedName("cu")
            CU("cu"),

            @SerializedName("cv")
            CV("cv"),

            @SerializedName("cw")
            CW("cw"),

            @SerializedName("cx")
            CX("cx"),

            @SerializedName("cy")
            CY("cy"),

            @SerializedName("cz")
            CZ("cz"),

            @SerializedName("de")
            DE("de"),

            @SerializedName("dj")
            DJ("dj"),

            @SerializedName("dk")
            DK("dk"),

            @SerializedName("dm")
            DM("dm"),

            @SerializedName("do")
            DO("do"),

            @SerializedName("dz")
            DZ("dz"),

            @SerializedName("ec")
            EC("ec"),

            @SerializedName("ee")
            EE("ee"),

            @SerializedName("eg")
            EG("eg"),

            @SerializedName("eh")
            EH("eh"),

            @SerializedName("er")
            ER("er"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("et")
            ET("et"),

            @SerializedName("fi")
            FI("fi"),

            @SerializedName("fj")
            FJ("fj"),

            @SerializedName("fk")
            FK("fk"),

            @SerializedName("fm")
            FM("fm"),

            @SerializedName("fo")
            FO("fo"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("ga")
            GA("ga"),

            @SerializedName("gb")
            GB("gb"),

            @SerializedName("gd")
            GD("gd"),

            @SerializedName("ge")
            GE("ge"),

            @SerializedName("gf")
            GF("gf"),

            @SerializedName("gg")
            GG("gg"),

            @SerializedName("gh")
            GH("gh"),

            @SerializedName("gi")
            GI("gi"),

            @SerializedName("gl")
            GL("gl"),

            @SerializedName("gm")
            GM("gm"),

            @SerializedName("gn")
            GN("gn"),

            @SerializedName("gp")
            GP("gp"),

            @SerializedName("gq")
            GQ("gq"),

            @SerializedName("gr")
            GR("gr"),

            @SerializedName("gs")
            GS("gs"),

            @SerializedName("gt")
            GT("gt"),

            @SerializedName("gu")
            GU("gu"),

            @SerializedName("gw")
            GW("gw"),

            @SerializedName("gy")
            GY("gy"),

            @SerializedName("hk")
            HK("hk"),

            @SerializedName("hm")
            HM("hm"),

            @SerializedName("hn")
            HN("hn"),

            @SerializedName("hr")
            HR("hr"),

            @SerializedName("ht")
            HT("ht"),

            @SerializedName("hu")
            HU("hu"),

            @SerializedName("id")
            ID("id"),

            @SerializedName("ie")
            IE("ie"),

            @SerializedName("il")
            IL("il"),

            @SerializedName("im")
            IM("im"),

            @SerializedName("in")
            IN("in"),

            @SerializedName("io")
            IO("io"),

            @SerializedName("iq")
            IQ("iq"),

            @SerializedName("ir")
            IR("ir"),

            @SerializedName("is")
            IS("is"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("je")
            JE("je"),

            @SerializedName("jm")
            JM("jm"),

            @SerializedName("jo")
            JO("jo"),

            @SerializedName("jp")
            JP("jp"),

            @SerializedName("ke")
            KE("ke"),

            @SerializedName("kg")
            KG("kg"),

            @SerializedName("kh")
            KH("kh"),

            @SerializedName("ki")
            KI("ki"),

            @SerializedName("km")
            KM("km"),

            @SerializedName("kn")
            KN("kn"),

            @SerializedName("kp")
            KP("kp"),

            @SerializedName("kr")
            KR("kr"),

            @SerializedName("kw")
            KW("kw"),

            @SerializedName("ky")
            KY("ky"),

            @SerializedName("kz")
            KZ("kz"),

            @SerializedName("la")
            LA("la"),

            @SerializedName("lb")
            LB("lb"),

            @SerializedName("lc")
            LC("lc"),

            @SerializedName("li")
            LI("li"),

            @SerializedName("lk")
            LK("lk"),

            @SerializedName("lr")
            LR("lr"),

            @SerializedName("ls")
            LS("ls"),

            @SerializedName("lt")
            LT("lt"),

            @SerializedName("lu")
            LU("lu"),

            @SerializedName("lv")
            LV("lv"),

            @SerializedName("ly")
            LY("ly"),

            @SerializedName("ma")
            MA("ma"),

            @SerializedName("mc")
            MC("mc"),

            @SerializedName("md")
            MD("md"),

            @SerializedName("me")
            ME("me"),

            @SerializedName("mf")
            MF("mf"),

            @SerializedName("mg")
            MG("mg"),

            @SerializedName("mh")
            MH("mh"),

            @SerializedName("mk")
            MK("mk"),

            @SerializedName("ml")
            ML("ml"),

            @SerializedName("mm")
            MM("mm"),

            @SerializedName("mn")
            MN("mn"),

            @SerializedName("mo")
            MO("mo"),

            @SerializedName("mp")
            MP("mp"),

            @SerializedName("mq")
            MQ("mq"),

            @SerializedName("mr")
            MR("mr"),

            @SerializedName("ms")
            MS("ms"),

            @SerializedName("mt")
            MT("mt"),

            @SerializedName("mu")
            MU("mu"),

            @SerializedName("mv")
            MV("mv"),

            @SerializedName("mw")
            MW("mw"),

            @SerializedName("mx")
            MX("mx"),

            @SerializedName("my")
            MY("my"),

            @SerializedName("mz")
            MZ("mz"),

            @SerializedName("na")
            NA("na"),

            @SerializedName("nc")
            NC("nc"),

            @SerializedName("ne")
            NE("ne"),

            @SerializedName("nf")
            NF("nf"),

            @SerializedName("ng")
            NG("ng"),

            @SerializedName("ni")
            NI("ni"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("no")
            NO("no"),

            @SerializedName("np")
            NP("np"),

            @SerializedName("nr")
            NR("nr"),

            @SerializedName("nu")
            NU("nu"),

            @SerializedName("nz")
            NZ("nz"),

            @SerializedName("om")
            OM("om"),

            @SerializedName("pa")
            PA("pa"),

            @SerializedName("pe")
            PE("pe"),

            @SerializedName("pf")
            PF("pf"),

            @SerializedName("pg")
            PG("pg"),

            @SerializedName("ph")
            PH("ph"),

            @SerializedName("pk")
            PK("pk"),

            @SerializedName("pl")
            PL("pl"),

            @SerializedName("pm")
            PM("pm"),

            @SerializedName("pn")
            PN("pn"),

            @SerializedName("pr")
            PR("pr"),

            @SerializedName("ps")
            PS("ps"),

            @SerializedName("pt")
            PT("pt"),

            @SerializedName("pw")
            PW("pw"),

            @SerializedName("py")
            PY("py"),

            @SerializedName("qa")
            QA("qa"),

            @SerializedName("qz")
            QZ("qz"),

            @SerializedName("re")
            RE("re"),

            @SerializedName("ro")
            RO("ro"),

            @SerializedName("rs")
            RS("rs"),

            @SerializedName("ru")
            RU("ru"),

            @SerializedName("rw")
            RW("rw"),

            @SerializedName("sa")
            SA("sa"),

            @SerializedName("sb")
            SB("sb"),

            @SerializedName("sc")
            SC("sc"),

            @SerializedName("sd")
            SD("sd"),

            @SerializedName("se")
            SE("se"),

            @SerializedName("sg")
            SG("sg"),

            @SerializedName("sh")
            SH("sh"),

            @SerializedName("si")
            SI("si"),

            @SerializedName("sj")
            SJ("sj"),

            @SerializedName("sk")
            SK("sk"),

            @SerializedName("sl")
            SL("sl"),

            @SerializedName("sm")
            SM("sm"),

            @SerializedName("sn")
            SN("sn"),

            @SerializedName("so")
            SO("so"),

            @SerializedName("sr")
            SR("sr"),

            @SerializedName("ss")
            SS("ss"),

            @SerializedName("st")
            ST("st"),

            @SerializedName("sv")
            SV("sv"),

            @SerializedName("sx")
            SX("sx"),

            @SerializedName("sy")
            SY("sy"),

            @SerializedName("sz")
            SZ("sz"),

            @SerializedName("tc")
            TC("tc"),

            @SerializedName("td")
            TD("td"),

            @SerializedName("tf")
            TF("tf"),

            @SerializedName("tg")
            TG("tg"),

            @SerializedName("th")
            TH("th"),

            @SerializedName("tj")
            TJ("tj"),

            @SerializedName("tk")
            TK("tk"),

            @SerializedName("tl")
            TL("tl"),

            @SerializedName("tm")
            TM("tm"),

            @SerializedName("tn")
            TN("tn"),

            @SerializedName("to")
            TO("to"),

            @SerializedName("tr")
            TR("tr"),

            @SerializedName("tt")
            TT("tt"),

            @SerializedName("tv")
            TV("tv"),

            @SerializedName("tw")
            TW("tw"),

            @SerializedName("tz")
            TZ("tz"),

            @SerializedName("ua")
            UA("ua"),

            @SerializedName("ug")
            UG("ug"),

            @SerializedName("um")
            UM("um"),

            @SerializedName("us")
            US("us"),

            @SerializedName("uy")
            UY("uy"),

            @SerializedName("uz")
            UZ("uz"),

            @SerializedName("va")
            VA("va"),

            @SerializedName("vc")
            VC("vc"),

            @SerializedName("ve")
            VE("ve"),

            @SerializedName("vg")
            VG("vg"),

            @SerializedName("vi")
            VI("vi"),

            @SerializedName("vn")
            VN("vn"),

            @SerializedName("vu")
            VU("vu"),

            @SerializedName("wf")
            WF("wf"),

            @SerializedName("ws")
            WS("ws"),

            @SerializedName("ye")
            YE("ye"),

            @SerializedName("yt")
            YT("yt"),

            @SerializedName("za")
            ZA("za"),

            @SerializedName("zm")
            ZM("zm"),

            @SerializedName("zw")
            ZW("zw");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          ApiRequestParams.EnumParam country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          Object town;

          private Kanji(
              Object city,
              ApiRequestParams.EnumParam country,
              Map<String, Object> extraParams,
              Object line1,
              Object line2,
              Object postalCode,
              Object state,
              Object town) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
            this.town = town;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object city;

            private ApiRequestParams.EnumParam country;

            private Map<String, Object> extraParams;

            private Object line1;

            private Object line2;

            private Object postalCode;

            private Object state;

            private Object town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kanji build() {
              return new AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kanji(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(
                AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kanji.Country
                    country) {
              this.country = country;
              return this;
            }

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kanji#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptAddresses.Kanji#extraParams} for
             * the field documentation.
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }

            /** Town or cho-me. */
            public Builder setTown(EmptyParam town) {
              this.town = town;
              return this;
            }
          }

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("ad")
            AD("ad"),

            @SerializedName("ae")
            AE("ae"),

            @SerializedName("af")
            AF("af"),

            @SerializedName("ag")
            AG("ag"),

            @SerializedName("ai")
            AI("ai"),

            @SerializedName("al")
            AL("al"),

            @SerializedName("am")
            AM("am"),

            @SerializedName("ao")
            AO("ao"),

            @SerializedName("aq")
            AQ("aq"),

            @SerializedName("ar")
            AR("ar"),

            @SerializedName("as")
            AS("as"),

            @SerializedName("at")
            AT("at"),

            @SerializedName("au")
            AU("au"),

            @SerializedName("aw")
            AW("aw"),

            @SerializedName("ax")
            AX("ax"),

            @SerializedName("az")
            AZ("az"),

            @SerializedName("ba")
            BA("ba"),

            @SerializedName("bb")
            BB("bb"),

            @SerializedName("bd")
            BD("bd"),

            @SerializedName("be")
            BE("be"),

            @SerializedName("bf")
            BF("bf"),

            @SerializedName("bg")
            BG("bg"),

            @SerializedName("bh")
            BH("bh"),

            @SerializedName("bi")
            BI("bi"),

            @SerializedName("bj")
            BJ("bj"),

            @SerializedName("bl")
            BL("bl"),

            @SerializedName("bm")
            BM("bm"),

            @SerializedName("bn")
            BN("bn"),

            @SerializedName("bo")
            BO("bo"),

            @SerializedName("bq")
            BQ("bq"),

            @SerializedName("br")
            BR("br"),

            @SerializedName("bs")
            BS("bs"),

            @SerializedName("bt")
            BT("bt"),

            @SerializedName("bv")
            BV("bv"),

            @SerializedName("bw")
            BW("bw"),

            @SerializedName("by")
            BY("by"),

            @SerializedName("bz")
            BZ("bz"),

            @SerializedName("ca")
            CA("ca"),

            @SerializedName("cc")
            CC("cc"),

            @SerializedName("cd")
            CD("cd"),

            @SerializedName("cf")
            CF("cf"),

            @SerializedName("cg")
            CG("cg"),

            @SerializedName("ch")
            CH("ch"),

            @SerializedName("ci")
            CI("ci"),

            @SerializedName("ck")
            CK("ck"),

            @SerializedName("cl")
            CL("cl"),

            @SerializedName("cm")
            CM("cm"),

            @SerializedName("cn")
            CN("cn"),

            @SerializedName("co")
            CO("co"),

            @SerializedName("cr")
            CR("cr"),

            @SerializedName("cu")
            CU("cu"),

            @SerializedName("cv")
            CV("cv"),

            @SerializedName("cw")
            CW("cw"),

            @SerializedName("cx")
            CX("cx"),

            @SerializedName("cy")
            CY("cy"),

            @SerializedName("cz")
            CZ("cz"),

            @SerializedName("de")
            DE("de"),

            @SerializedName("dj")
            DJ("dj"),

            @SerializedName("dk")
            DK("dk"),

            @SerializedName("dm")
            DM("dm"),

            @SerializedName("do")
            DO("do"),

            @SerializedName("dz")
            DZ("dz"),

            @SerializedName("ec")
            EC("ec"),

            @SerializedName("ee")
            EE("ee"),

            @SerializedName("eg")
            EG("eg"),

            @SerializedName("eh")
            EH("eh"),

            @SerializedName("er")
            ER("er"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("et")
            ET("et"),

            @SerializedName("fi")
            FI("fi"),

            @SerializedName("fj")
            FJ("fj"),

            @SerializedName("fk")
            FK("fk"),

            @SerializedName("fm")
            FM("fm"),

            @SerializedName("fo")
            FO("fo"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("ga")
            GA("ga"),

            @SerializedName("gb")
            GB("gb"),

            @SerializedName("gd")
            GD("gd"),

            @SerializedName("ge")
            GE("ge"),

            @SerializedName("gf")
            GF("gf"),

            @SerializedName("gg")
            GG("gg"),

            @SerializedName("gh")
            GH("gh"),

            @SerializedName("gi")
            GI("gi"),

            @SerializedName("gl")
            GL("gl"),

            @SerializedName("gm")
            GM("gm"),

            @SerializedName("gn")
            GN("gn"),

            @SerializedName("gp")
            GP("gp"),

            @SerializedName("gq")
            GQ("gq"),

            @SerializedName("gr")
            GR("gr"),

            @SerializedName("gs")
            GS("gs"),

            @SerializedName("gt")
            GT("gt"),

            @SerializedName("gu")
            GU("gu"),

            @SerializedName("gw")
            GW("gw"),

            @SerializedName("gy")
            GY("gy"),

            @SerializedName("hk")
            HK("hk"),

            @SerializedName("hm")
            HM("hm"),

            @SerializedName("hn")
            HN("hn"),

            @SerializedName("hr")
            HR("hr"),

            @SerializedName("ht")
            HT("ht"),

            @SerializedName("hu")
            HU("hu"),

            @SerializedName("id")
            ID("id"),

            @SerializedName("ie")
            IE("ie"),

            @SerializedName("il")
            IL("il"),

            @SerializedName("im")
            IM("im"),

            @SerializedName("in")
            IN("in"),

            @SerializedName("io")
            IO("io"),

            @SerializedName("iq")
            IQ("iq"),

            @SerializedName("ir")
            IR("ir"),

            @SerializedName("is")
            IS("is"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("je")
            JE("je"),

            @SerializedName("jm")
            JM("jm"),

            @SerializedName("jo")
            JO("jo"),

            @SerializedName("jp")
            JP("jp"),

            @SerializedName("ke")
            KE("ke"),

            @SerializedName("kg")
            KG("kg"),

            @SerializedName("kh")
            KH("kh"),

            @SerializedName("ki")
            KI("ki"),

            @SerializedName("km")
            KM("km"),

            @SerializedName("kn")
            KN("kn"),

            @SerializedName("kp")
            KP("kp"),

            @SerializedName("kr")
            KR("kr"),

            @SerializedName("kw")
            KW("kw"),

            @SerializedName("ky")
            KY("ky"),

            @SerializedName("kz")
            KZ("kz"),

            @SerializedName("la")
            LA("la"),

            @SerializedName("lb")
            LB("lb"),

            @SerializedName("lc")
            LC("lc"),

            @SerializedName("li")
            LI("li"),

            @SerializedName("lk")
            LK("lk"),

            @SerializedName("lr")
            LR("lr"),

            @SerializedName("ls")
            LS("ls"),

            @SerializedName("lt")
            LT("lt"),

            @SerializedName("lu")
            LU("lu"),

            @SerializedName("lv")
            LV("lv"),

            @SerializedName("ly")
            LY("ly"),

            @SerializedName("ma")
            MA("ma"),

            @SerializedName("mc")
            MC("mc"),

            @SerializedName("md")
            MD("md"),

            @SerializedName("me")
            ME("me"),

            @SerializedName("mf")
            MF("mf"),

            @SerializedName("mg")
            MG("mg"),

            @SerializedName("mh")
            MH("mh"),

            @SerializedName("mk")
            MK("mk"),

            @SerializedName("ml")
            ML("ml"),

            @SerializedName("mm")
            MM("mm"),

            @SerializedName("mn")
            MN("mn"),

            @SerializedName("mo")
            MO("mo"),

            @SerializedName("mp")
            MP("mp"),

            @SerializedName("mq")
            MQ("mq"),

            @SerializedName("mr")
            MR("mr"),

            @SerializedName("ms")
            MS("ms"),

            @SerializedName("mt")
            MT("mt"),

            @SerializedName("mu")
            MU("mu"),

            @SerializedName("mv")
            MV("mv"),

            @SerializedName("mw")
            MW("mw"),

            @SerializedName("mx")
            MX("mx"),

            @SerializedName("my")
            MY("my"),

            @SerializedName("mz")
            MZ("mz"),

            @SerializedName("na")
            NA("na"),

            @SerializedName("nc")
            NC("nc"),

            @SerializedName("ne")
            NE("ne"),

            @SerializedName("nf")
            NF("nf"),

            @SerializedName("ng")
            NG("ng"),

            @SerializedName("ni")
            NI("ni"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("no")
            NO("no"),

            @SerializedName("np")
            NP("np"),

            @SerializedName("nr")
            NR("nr"),

            @SerializedName("nu")
            NU("nu"),

            @SerializedName("nz")
            NZ("nz"),

            @SerializedName("om")
            OM("om"),

            @SerializedName("pa")
            PA("pa"),

            @SerializedName("pe")
            PE("pe"),

            @SerializedName("pf")
            PF("pf"),

            @SerializedName("pg")
            PG("pg"),

            @SerializedName("ph")
            PH("ph"),

            @SerializedName("pk")
            PK("pk"),

            @SerializedName("pl")
            PL("pl"),

            @SerializedName("pm")
            PM("pm"),

            @SerializedName("pn")
            PN("pn"),

            @SerializedName("pr")
            PR("pr"),

            @SerializedName("ps")
            PS("ps"),

            @SerializedName("pt")
            PT("pt"),

            @SerializedName("pw")
            PW("pw"),

            @SerializedName("py")
            PY("py"),

            @SerializedName("qa")
            QA("qa"),

            @SerializedName("qz")
            QZ("qz"),

            @SerializedName("re")
            RE("re"),

            @SerializedName("ro")
            RO("ro"),

            @SerializedName("rs")
            RS("rs"),

            @SerializedName("ru")
            RU("ru"),

            @SerializedName("rw")
            RW("rw"),

            @SerializedName("sa")
            SA("sa"),

            @SerializedName("sb")
            SB("sb"),

            @SerializedName("sc")
            SC("sc"),

            @SerializedName("sd")
            SD("sd"),

            @SerializedName("se")
            SE("se"),

            @SerializedName("sg")
            SG("sg"),

            @SerializedName("sh")
            SH("sh"),

            @SerializedName("si")
            SI("si"),

            @SerializedName("sj")
            SJ("sj"),

            @SerializedName("sk")
            SK("sk"),

            @SerializedName("sl")
            SL("sl"),

            @SerializedName("sm")
            SM("sm"),

            @SerializedName("sn")
            SN("sn"),

            @SerializedName("so")
            SO("so"),

            @SerializedName("sr")
            SR("sr"),

            @SerializedName("ss")
            SS("ss"),

            @SerializedName("st")
            ST("st"),

            @SerializedName("sv")
            SV("sv"),

            @SerializedName("sx")
            SX("sx"),

            @SerializedName("sy")
            SY("sy"),

            @SerializedName("sz")
            SZ("sz"),

            @SerializedName("tc")
            TC("tc"),

            @SerializedName("td")
            TD("td"),

            @SerializedName("tf")
            TF("tf"),

            @SerializedName("tg")
            TG("tg"),

            @SerializedName("th")
            TH("th"),

            @SerializedName("tj")
            TJ("tj"),

            @SerializedName("tk")
            TK("tk"),

            @SerializedName("tl")
            TL("tl"),

            @SerializedName("tm")
            TM("tm"),

            @SerializedName("tn")
            TN("tn"),

            @SerializedName("to")
            TO("to"),

            @SerializedName("tr")
            TR("tr"),

            @SerializedName("tt")
            TT("tt"),

            @SerializedName("tv")
            TV("tv"),

            @SerializedName("tw")
            TW("tw"),

            @SerializedName("tz")
            TZ("tz"),

            @SerializedName("ua")
            UA("ua"),

            @SerializedName("ug")
            UG("ug"),

            @SerializedName("um")
            UM("um"),

            @SerializedName("us")
            US("us"),

            @SerializedName("uy")
            UY("uy"),

            @SerializedName("uz")
            UZ("uz"),

            @SerializedName("va")
            VA("va"),

            @SerializedName("vc")
            VC("vc"),

            @SerializedName("ve")
            VE("ve"),

            @SerializedName("vg")
            VG("vg"),

            @SerializedName("vi")
            VI("vi"),

            @SerializedName("vn")
            VN("vn"),

            @SerializedName("vu")
            VU("vu"),

            @SerializedName("wf")
            WF("wf"),

            @SerializedName("ws")
            WS("ws"),

            @SerializedName("ye")
            YE("ye"),

            @SerializedName("yt")
            YT("yt"),

            @SerializedName("za")
            ZA("za"),

            @SerializedName("zm")
            ZM("zm"),

            @SerializedName("zw")
            ZW("zw");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptNames {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Kana name. */
        @SerializedName("kana")
        Object kana;

        /** Kanji name. */
        @SerializedName("kanji")
        Object kanji;

        private ScriptNames(Map<String, Object> extraParams, Object kana, Object kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object kana;

          private Object kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.BusinessDetails.ScriptNames build() {
            return new AccountUpdateParams.Identity.BusinessDetails.ScriptNames(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.ScriptNames#extraParams}
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
           * map. See {@link AccountUpdateParams.Identity.BusinessDetails.ScriptNames#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Kana name. */
          public Builder setKana(
              AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kana name. */
          public Builder setKana(EmptyParam kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji name. */
          public Builder setKanji(
              AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }

          /** Kanji name. */
          public Builder setKanji(EmptyParam kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Registered name of the business. */
          @SerializedName("registered_name")
          Object registeredName;

          private Kana(Map<String, Object> extraParams, Object registeredName) {
            this.extraParams = extraParams;
            this.registeredName = registeredName;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object registeredName;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kana build() {
              return new AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kana(
                  this.extraParams, this.registeredName);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kana#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kana#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Registered name of the business. */
            public Builder setRegisteredName(String registeredName) {
              this.registeredName = registeredName;
              return this;
            }

            /** Registered name of the business. */
            public Builder setRegisteredName(EmptyParam registeredName) {
              this.registeredName = registeredName;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Registered name of the business. */
          @SerializedName("registered_name")
          Object registeredName;

          private Kanji(Map<String, Object> extraParams, Object registeredName) {
            this.extraParams = extraParams;
            this.registeredName = registeredName;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object registeredName;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kanji build() {
              return new AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kanji(
                  this.extraParams, this.registeredName);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kanji#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.BusinessDetails.ScriptNames.Kanji#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Registered name of the business. */
            public Builder setRegisteredName(String registeredName) {
              this.registeredName = registeredName;
              return this;
            }

            /** Registered name of the business. */
            public Builder setRegisteredName(EmptyParam registeredName) {
              this.registeredName = registeredName;
              return this;
            }
          }
        }
      }

      public enum Structure implements ApiRequestParams.EnumParam {
        @SerializedName("free_zone_establishment")
        FREE_ZONE_ESTABLISHMENT("free_zone_establishment"),

        @SerializedName("free_zone_llc")
        FREE_ZONE_LLC("free_zone_llc"),

        @SerializedName("governmental_unit")
        GOVERNMENTAL_UNIT("governmental_unit"),

        @SerializedName("government_instrumentality")
        GOVERNMENT_INSTRUMENTALITY("government_instrumentality"),

        @SerializedName("incorporated_non_profit")
        INCORPORATED_NON_PROFIT("incorporated_non_profit"),

        @SerializedName("incorporated_partnership")
        INCORPORATED_PARTNERSHIP("incorporated_partnership"),

        @SerializedName("llc")
        LLC("llc"),

        @SerializedName("multi_member_llc")
        MULTI_MEMBER_LLC("multi_member_llc"),

        @SerializedName("private_company")
        PRIVATE_COMPANY("private_company"),

        @SerializedName("private_corporation")
        PRIVATE_CORPORATION("private_corporation"),

        @SerializedName("private_partnership")
        PRIVATE_PARTNERSHIP("private_partnership"),

        @SerializedName("public_company")
        PUBLIC_COMPANY("public_company"),

        @SerializedName("public_corporation")
        PUBLIC_CORPORATION("public_corporation"),

        @SerializedName("public_partnership")
        PUBLIC_PARTNERSHIP("public_partnership"),

        @SerializedName("registered_charity")
        REGISTERED_CHARITY("registered_charity"),

        @SerializedName("single_member_llc")
        SINGLE_MEMBER_LLC("single_member_llc"),

        @SerializedName("sole_establishment")
        SOLE_ESTABLISHMENT("sole_establishment"),

        @SerializedName("sole_proprietorship")
        SOLE_PROPRIETORSHIP("sole_proprietorship"),

        @SerializedName("tax_exempt_government_instrumentality")
        TAX_EXEMPT_GOVERNMENT_INSTRUMENTALITY("tax_exempt_government_instrumentality"),

        @SerializedName("unincorporated_association")
        UNINCORPORATED_ASSOCIATION("unincorporated_association"),

        @SerializedName("unincorporated_non_profit")
        UNINCORPORATED_NON_PROFIT("unincorporated_non_profit"),

        @SerializedName("unincorporated_partnership")
        UNINCORPORATED_PARTNERSHIP("unincorporated_partnership");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Structure(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Individual {
      /** Additional addresses associated with the individual. */
      @SerializedName("additional_addresses")
      Object additionalAddresses;

      /** Additional names (e.g. aliases) associated with the individual. */
      @SerializedName("additional_names")
      Object additionalNames;

      /** The individual's residential address. */
      @SerializedName("address")
      Object address;

      /** The individual's date of birth. */
      @SerializedName("date_of_birth")
      Object dateOfBirth;

      /** Documents that may be submitted to satisfy various informational requests. */
      @SerializedName("documents")
      Object documents;

      /** The individual's email address. */
      @SerializedName("email")
      Object email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The individual's first name. */
      @SerializedName("given_name")
      Object givenName;

      /** The identification numbers (e.g., SSN) associated with the individual. */
      @SerializedName("id_numbers")
      Object idNumbers;

      /**
       * The individual's gender (International regulations require either &quot;male&quot; or
       * &quot;female&quot;).
       */
      @SerializedName("legal_gender")
      ApiRequestParams.EnumParam legalGender;

      /**
       * Set of key-value pairs that you can attach to an object. This can be useful for storing
       * additional information about the object in a structured format.
       */
      @SerializedName("metadata")
      Map<String, Object> metadata;

      /**
       * The countries where the individual is a national. Two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      @SerializedName("nationalities")
      List<AccountUpdateParams.Identity.Individual.Nationality> nationalities;

      /** The individual's phone number. */
      @SerializedName("phone")
      Object phone;

      /** The individual's political exposure. */
      @SerializedName("political_exposure")
      ApiRequestParams.EnumParam politicalExposure;

      /** The relationship that this individual has with the account's identity. */
      @SerializedName("relationship")
      Object relationship;

      /** The script addresses (e.g., non-Latin characters) associated with the individual. */
      @SerializedName("script_addresses")
      Object scriptAddresses;

      /** The individuals primary name in non latin script. */
      @SerializedName("script_names")
      Object scriptNames;

      /** The individual's last name. */
      @SerializedName("surname")
      Object surname;

      private Individual(
          Object additionalAddresses,
          Object additionalNames,
          Object address,
          Object dateOfBirth,
          Object documents,
          Object email,
          Map<String, Object> extraParams,
          Object givenName,
          Object idNumbers,
          ApiRequestParams.EnumParam legalGender,
          Map<String, Object> metadata,
          List<AccountUpdateParams.Identity.Individual.Nationality> nationalities,
          Object phone,
          ApiRequestParams.EnumParam politicalExposure,
          Object relationship,
          Object scriptAddresses,
          Object scriptNames,
          Object surname) {
        this.additionalAddresses = additionalAddresses;
        this.additionalNames = additionalNames;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.documents = documents;
        this.email = email;
        this.extraParams = extraParams;
        this.givenName = givenName;
        this.idNumbers = idNumbers;
        this.legalGender = legalGender;
        this.metadata = metadata;
        this.nationalities = nationalities;
        this.phone = phone;
        this.politicalExposure = politicalExposure;
        this.relationship = relationship;
        this.scriptAddresses = scriptAddresses;
        this.scriptNames = scriptNames;
        this.surname = surname;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object additionalAddresses;

        private Object additionalNames;

        private Object address;

        private Object dateOfBirth;

        private Object documents;

        private Object email;

        private Map<String, Object> extraParams;

        private Object givenName;

        private Object idNumbers;

        private ApiRequestParams.EnumParam legalGender;

        private Map<String, Object> metadata;

        private List<AccountUpdateParams.Identity.Individual.Nationality> nationalities;

        private Object phone;

        private ApiRequestParams.EnumParam politicalExposure;

        private Object relationship;

        private Object scriptAddresses;

        private Object scriptNames;

        private Object surname;

        /** Finalize and obtain parameter instance from this builder. */
        public AccountUpdateParams.Identity.Individual build() {
          return new AccountUpdateParams.Identity.Individual(
              this.additionalAddresses,
              this.additionalNames,
              this.address,
              this.dateOfBirth,
              this.documents,
              this.email,
              this.extraParams,
              this.givenName,
              this.idNumbers,
              this.legalGender,
              this.metadata,
              this.nationalities,
              this.phone,
              this.politicalExposure,
              this.relationship,
              this.scriptAddresses,
              this.scriptNames,
              this.surname);
        }

        /**
         * Add an element to `additionalAddresses` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Identity.Individual#additionalAddresses} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAdditionalAddress(
            AccountUpdateParams.Identity.Individual.AdditionalAddress element) {
          if (this.additionalAddresses == null || this.additionalAddresses instanceof EmptyParam) {
            this.additionalAddresses =
                new ArrayList<AccountUpdateParams.Identity.Individual.AdditionalAddress>();
          }
          ((List<AccountUpdateParams.Identity.Individual.AdditionalAddress>)
                  this.additionalAddresses)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `additionalAddresses` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Identity.Individual#additionalAddresses} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAdditionalAddress(
            List<AccountUpdateParams.Identity.Individual.AdditionalAddress> elements) {
          if (this.additionalAddresses == null || this.additionalAddresses instanceof EmptyParam) {
            this.additionalAddresses =
                new ArrayList<AccountUpdateParams.Identity.Individual.AdditionalAddress>();
          }
          ((List<AccountUpdateParams.Identity.Individual.AdditionalAddress>)
                  this.additionalAddresses)
              .addAll(elements);
          return this;
        }

        /** Additional addresses associated with the individual. */
        public Builder setAdditionalAddresses(EmptyParam additionalAddresses) {
          this.additionalAddresses = additionalAddresses;
          return this;
        }

        /** Additional addresses associated with the individual. */
        public Builder setAdditionalAddresses(
            List<AccountUpdateParams.Identity.Individual.AdditionalAddress> additionalAddresses) {
          this.additionalAddresses = additionalAddresses;
          return this;
        }

        /**
         * Add an element to `additionalNames` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Identity.Individual#additionalNames} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAdditionalName(
            AccountUpdateParams.Identity.Individual.AdditionalName element) {
          if (this.additionalNames == null || this.additionalNames instanceof EmptyParam) {
            this.additionalNames =
                new ArrayList<AccountUpdateParams.Identity.Individual.AdditionalName>();
          }
          ((List<AccountUpdateParams.Identity.Individual.AdditionalName>) this.additionalNames)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `additionalNames` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Identity.Individual#additionalNames} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAdditionalName(
            List<AccountUpdateParams.Identity.Individual.AdditionalName> elements) {
          if (this.additionalNames == null || this.additionalNames instanceof EmptyParam) {
            this.additionalNames =
                new ArrayList<AccountUpdateParams.Identity.Individual.AdditionalName>();
          }
          ((List<AccountUpdateParams.Identity.Individual.AdditionalName>) this.additionalNames)
              .addAll(elements);
          return this;
        }

        /** Additional names (e.g. aliases) associated with the individual. */
        public Builder setAdditionalNames(EmptyParam additionalNames) {
          this.additionalNames = additionalNames;
          return this;
        }

        /** Additional names (e.g. aliases) associated with the individual. */
        public Builder setAdditionalNames(
            List<AccountUpdateParams.Identity.Individual.AdditionalName> additionalNames) {
          this.additionalNames = additionalNames;
          return this;
        }

        /** The individual's residential address. */
        public Builder setAddress(AccountUpdateParams.Identity.Individual.Address address) {
          this.address = address;
          return this;
        }

        /** The individual's residential address. */
        public Builder setAddress(EmptyParam address) {
          this.address = address;
          return this;
        }

        /** The individual's date of birth. */
        public Builder setDateOfBirth(
            AccountUpdateParams.Identity.Individual.DateOfBirth dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
          return this;
        }

        /** The individual's date of birth. */
        public Builder setDateOfBirth(EmptyParam dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
          return this;
        }

        /** Documents that may be submitted to satisfy various informational requests. */
        public Builder setDocuments(AccountUpdateParams.Identity.Individual.Documents documents) {
          this.documents = documents;
          return this;
        }

        /** Documents that may be submitted to satisfy various informational requests. */
        public Builder setDocuments(EmptyParam documents) {
          this.documents = documents;
          return this;
        }

        /** The individual's email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /** The individual's email address. */
        public Builder setEmail(EmptyParam email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountUpdateParams.Identity.Individual#extraParams} for the field
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
         * map. See {@link AccountUpdateParams.Identity.Individual#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The individual's first name. */
        public Builder setGivenName(String givenName) {
          this.givenName = givenName;
          return this;
        }

        /** The individual's first name. */
        public Builder setGivenName(EmptyParam givenName) {
          this.givenName = givenName;
          return this;
        }

        /**
         * Add an element to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountUpdateParams.Identity.Individual#idNumbers} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addIdNumber(AccountUpdateParams.Identity.Individual.IdNumber element) {
          if (this.idNumbers == null || this.idNumbers instanceof EmptyParam) {
            this.idNumbers = new ArrayList<AccountUpdateParams.Identity.Individual.IdNumber>();
          }
          ((List<AccountUpdateParams.Identity.Individual.IdNumber>) this.idNumbers).add(element);
          return this;
        }

        /**
         * Add all elements to `idNumbers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountUpdateParams.Identity.Individual#idNumbers} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllIdNumber(
            List<AccountUpdateParams.Identity.Individual.IdNumber> elements) {
          if (this.idNumbers == null || this.idNumbers instanceof EmptyParam) {
            this.idNumbers = new ArrayList<AccountUpdateParams.Identity.Individual.IdNumber>();
          }
          ((List<AccountUpdateParams.Identity.Individual.IdNumber>) this.idNumbers)
              .addAll(elements);
          return this;
        }

        /** The identification numbers (e.g., SSN) associated with the individual. */
        public Builder setIdNumbers(EmptyParam idNumbers) {
          this.idNumbers = idNumbers;
          return this;
        }

        /** The identification numbers (e.g., SSN) associated with the individual. */
        public Builder setIdNumbers(
            List<AccountUpdateParams.Identity.Individual.IdNumber> idNumbers) {
          this.idNumbers = idNumbers;
          return this;
        }

        /**
         * The individual's gender (International regulations require either &quot;male&quot; or
         * &quot;female&quot;).
         */
        public Builder setLegalGender(
            AccountUpdateParams.Identity.Individual.LegalGender legalGender) {
          this.legalGender = legalGender;
          return this;
        }

        /**
         * The individual's gender (International regulations require either &quot;male&quot; or
         * &quot;female&quot;).
         */
        public Builder setLegalGender(EmptyParam legalGender) {
          this.legalGender = legalGender;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * AccountUpdateParams.Identity.Individual#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * AccountUpdateParams.Identity.Individual#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, EmptyParam value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. Map values can only be one of the following types: `String`, `EmptyParam`. See
         * {@link AccountUpdateParams.Identity.Individual#metadata} for the field documentation.
         */
        public Builder putAllMetadata(Map<String, Object> map) {
          if (!map.values().stream()
              .allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
            throw new IllegalArgumentException(
                "All map values must one of the following types: String, EmptyParam");
          }
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * Add an element to `nationalities` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AccountUpdateParams.Identity.Individual#nationalities} for the field documentation.
         */
        public Builder addNationality(AccountUpdateParams.Identity.Individual.Nationality element) {
          if (this.nationalities == null) {
            this.nationalities = new ArrayList<>();
          }
          this.nationalities.add(element);
          return this;
        }

        /**
         * Add all elements to `nationalities` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link AccountUpdateParams.Identity.Individual#nationalities} for the field
         * documentation.
         */
        public Builder addAllNationality(
            List<AccountUpdateParams.Identity.Individual.Nationality> elements) {
          if (this.nationalities == null) {
            this.nationalities = new ArrayList<>();
          }
          this.nationalities.addAll(elements);
          return this;
        }

        /** The individual's phone number. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** The individual's phone number. */
        public Builder setPhone(EmptyParam phone) {
          this.phone = phone;
          return this;
        }

        /** The individual's political exposure. */
        public Builder setPoliticalExposure(
            AccountUpdateParams.Identity.Individual.PoliticalExposure politicalExposure) {
          this.politicalExposure = politicalExposure;
          return this;
        }

        /** The individual's political exposure. */
        public Builder setPoliticalExposure(EmptyParam politicalExposure) {
          this.politicalExposure = politicalExposure;
          return this;
        }

        /** The relationship that this individual has with the account's identity. */
        public Builder setRelationship(
            AccountUpdateParams.Identity.Individual.Relationship relationship) {
          this.relationship = relationship;
          return this;
        }

        /** The relationship that this individual has with the account's identity. */
        public Builder setRelationship(EmptyParam relationship) {
          this.relationship = relationship;
          return this;
        }

        /** The script addresses (e.g., non-Latin characters) associated with the individual. */
        public Builder setScriptAddresses(
            AccountUpdateParams.Identity.Individual.ScriptAddresses scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The script addresses (e.g., non-Latin characters) associated with the individual. */
        public Builder setScriptAddresses(EmptyParam scriptAddresses) {
          this.scriptAddresses = scriptAddresses;
          return this;
        }

        /** The individuals primary name in non latin script. */
        public Builder setScriptNames(
            AccountUpdateParams.Identity.Individual.ScriptNames scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The individuals primary name in non latin script. */
        public Builder setScriptNames(EmptyParam scriptNames) {
          this.scriptNames = scriptNames;
          return this;
        }

        /** The individual's last name. */
        public Builder setSurname(String surname) {
          this.surname = surname;
          return this;
        }

        /** The individual's last name. */
        public Builder setSurname(EmptyParam surname) {
          this.surname = surname;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalAddress {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        ApiRequestParams.EnumParam country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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

        /** <strong>Required.</strong> Purpose of additional address. */
        @SerializedName("purpose")
        Purpose purpose;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        /** Town or cho-me. */
        @SerializedName("town")
        Object town;

        private AdditionalAddress(
            Object city,
            ApiRequestParams.EnumParam country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Purpose purpose,
            Object state,
            Object town) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.purpose = purpose;
          this.state = state;
          this.town = town;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object city;

          private ApiRequestParams.EnumParam country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Purpose purpose;

          private Object state;

          private Object town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.AdditionalAddress build() {
            return new AccountUpdateParams.Identity.Individual.AdditionalAddress(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.purpose,
                this.state,
                this.town);
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
          public Builder setCountry(
              AccountUpdateParams.Identity.Individual.AdditionalAddress.Country country) {
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
           * map. See {@link AccountUpdateParams.Identity.Individual.AdditionalAddress#extraParams}
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
           * map. See {@link AccountUpdateParams.Identity.Individual.AdditionalAddress#extraParams}
           * for the field documentation.
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

          /** <strong>Required.</strong> Purpose of additional address. */
          public Builder setPurpose(
              AccountUpdateParams.Identity.Individual.AdditionalAddress.Purpose purpose) {
            this.purpose = purpose;
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

          /** Town or cho-me. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }

          /** Town or cho-me. */
          public Builder setTown(EmptyParam town) {
            this.town = town;
            return this;
          }
        }

        public enum Country implements ApiRequestParams.EnumParam {
          @SerializedName("ad")
          AD("ad"),

          @SerializedName("ae")
          AE("ae"),

          @SerializedName("af")
          AF("af"),

          @SerializedName("ag")
          AG("ag"),

          @SerializedName("ai")
          AI("ai"),

          @SerializedName("al")
          AL("al"),

          @SerializedName("am")
          AM("am"),

          @SerializedName("ao")
          AO("ao"),

          @SerializedName("aq")
          AQ("aq"),

          @SerializedName("ar")
          AR("ar"),

          @SerializedName("as")
          AS("as"),

          @SerializedName("at")
          AT("at"),

          @SerializedName("au")
          AU("au"),

          @SerializedName("aw")
          AW("aw"),

          @SerializedName("ax")
          AX("ax"),

          @SerializedName("az")
          AZ("az"),

          @SerializedName("ba")
          BA("ba"),

          @SerializedName("bb")
          BB("bb"),

          @SerializedName("bd")
          BD("bd"),

          @SerializedName("be")
          BE("be"),

          @SerializedName("bf")
          BF("bf"),

          @SerializedName("bg")
          BG("bg"),

          @SerializedName("bh")
          BH("bh"),

          @SerializedName("bi")
          BI("bi"),

          @SerializedName("bj")
          BJ("bj"),

          @SerializedName("bl")
          BL("bl"),

          @SerializedName("bm")
          BM("bm"),

          @SerializedName("bn")
          BN("bn"),

          @SerializedName("bo")
          BO("bo"),

          @SerializedName("bq")
          BQ("bq"),

          @SerializedName("br")
          BR("br"),

          @SerializedName("bs")
          BS("bs"),

          @SerializedName("bt")
          BT("bt"),

          @SerializedName("bv")
          BV("bv"),

          @SerializedName("bw")
          BW("bw"),

          @SerializedName("by")
          BY("by"),

          @SerializedName("bz")
          BZ("bz"),

          @SerializedName("ca")
          CA("ca"),

          @SerializedName("cc")
          CC("cc"),

          @SerializedName("cd")
          CD("cd"),

          @SerializedName("cf")
          CF("cf"),

          @SerializedName("cg")
          CG("cg"),

          @SerializedName("ch")
          CH("ch"),

          @SerializedName("ci")
          CI("ci"),

          @SerializedName("ck")
          CK("ck"),

          @SerializedName("cl")
          CL("cl"),

          @SerializedName("cm")
          CM("cm"),

          @SerializedName("cn")
          CN("cn"),

          @SerializedName("co")
          CO("co"),

          @SerializedName("cr")
          CR("cr"),

          @SerializedName("cu")
          CU("cu"),

          @SerializedName("cv")
          CV("cv"),

          @SerializedName("cw")
          CW("cw"),

          @SerializedName("cx")
          CX("cx"),

          @SerializedName("cy")
          CY("cy"),

          @SerializedName("cz")
          CZ("cz"),

          @SerializedName("de")
          DE("de"),

          @SerializedName("dj")
          DJ("dj"),

          @SerializedName("dk")
          DK("dk"),

          @SerializedName("dm")
          DM("dm"),

          @SerializedName("do")
          DO("do"),

          @SerializedName("dz")
          DZ("dz"),

          @SerializedName("ec")
          EC("ec"),

          @SerializedName("ee")
          EE("ee"),

          @SerializedName("eg")
          EG("eg"),

          @SerializedName("eh")
          EH("eh"),

          @SerializedName("er")
          ER("er"),

          @SerializedName("es")
          ES("es"),

          @SerializedName("et")
          ET("et"),

          @SerializedName("fi")
          FI("fi"),

          @SerializedName("fj")
          FJ("fj"),

          @SerializedName("fk")
          FK("fk"),

          @SerializedName("fm")
          FM("fm"),

          @SerializedName("fo")
          FO("fo"),

          @SerializedName("fr")
          FR("fr"),

          @SerializedName("ga")
          GA("ga"),

          @SerializedName("gb")
          GB("gb"),

          @SerializedName("gd")
          GD("gd"),

          @SerializedName("ge")
          GE("ge"),

          @SerializedName("gf")
          GF("gf"),

          @SerializedName("gg")
          GG("gg"),

          @SerializedName("gh")
          GH("gh"),

          @SerializedName("gi")
          GI("gi"),

          @SerializedName("gl")
          GL("gl"),

          @SerializedName("gm")
          GM("gm"),

          @SerializedName("gn")
          GN("gn"),

          @SerializedName("gp")
          GP("gp"),

          @SerializedName("gq")
          GQ("gq"),

          @SerializedName("gr")
          GR("gr"),

          @SerializedName("gs")
          GS("gs"),

          @SerializedName("gt")
          GT("gt"),

          @SerializedName("gu")
          GU("gu"),

          @SerializedName("gw")
          GW("gw"),

          @SerializedName("gy")
          GY("gy"),

          @SerializedName("hk")
          HK("hk"),

          @SerializedName("hm")
          HM("hm"),

          @SerializedName("hn")
          HN("hn"),

          @SerializedName("hr")
          HR("hr"),

          @SerializedName("ht")
          HT("ht"),

          @SerializedName("hu")
          HU("hu"),

          @SerializedName("id")
          ID("id"),

          @SerializedName("ie")
          IE("ie"),

          @SerializedName("il")
          IL("il"),

          @SerializedName("im")
          IM("im"),

          @SerializedName("in")
          IN("in"),

          @SerializedName("io")
          IO("io"),

          @SerializedName("iq")
          IQ("iq"),

          @SerializedName("ir")
          IR("ir"),

          @SerializedName("is")
          IS("is"),

          @SerializedName("it")
          IT("it"),

          @SerializedName("je")
          JE("je"),

          @SerializedName("jm")
          JM("jm"),

          @SerializedName("jo")
          JO("jo"),

          @SerializedName("jp")
          JP("jp"),

          @SerializedName("ke")
          KE("ke"),

          @SerializedName("kg")
          KG("kg"),

          @SerializedName("kh")
          KH("kh"),

          @SerializedName("ki")
          KI("ki"),

          @SerializedName("km")
          KM("km"),

          @SerializedName("kn")
          KN("kn"),

          @SerializedName("kp")
          KP("kp"),

          @SerializedName("kr")
          KR("kr"),

          @SerializedName("kw")
          KW("kw"),

          @SerializedName("ky")
          KY("ky"),

          @SerializedName("kz")
          KZ("kz"),

          @SerializedName("la")
          LA("la"),

          @SerializedName("lb")
          LB("lb"),

          @SerializedName("lc")
          LC("lc"),

          @SerializedName("li")
          LI("li"),

          @SerializedName("lk")
          LK("lk"),

          @SerializedName("lr")
          LR("lr"),

          @SerializedName("ls")
          LS("ls"),

          @SerializedName("lt")
          LT("lt"),

          @SerializedName("lu")
          LU("lu"),

          @SerializedName("lv")
          LV("lv"),

          @SerializedName("ly")
          LY("ly"),

          @SerializedName("ma")
          MA("ma"),

          @SerializedName("mc")
          MC("mc"),

          @SerializedName("md")
          MD("md"),

          @SerializedName("me")
          ME("me"),

          @SerializedName("mf")
          MF("mf"),

          @SerializedName("mg")
          MG("mg"),

          @SerializedName("mh")
          MH("mh"),

          @SerializedName("mk")
          MK("mk"),

          @SerializedName("ml")
          ML("ml"),

          @SerializedName("mm")
          MM("mm"),

          @SerializedName("mn")
          MN("mn"),

          @SerializedName("mo")
          MO("mo"),

          @SerializedName("mp")
          MP("mp"),

          @SerializedName("mq")
          MQ("mq"),

          @SerializedName("mr")
          MR("mr"),

          @SerializedName("ms")
          MS("ms"),

          @SerializedName("mt")
          MT("mt"),

          @SerializedName("mu")
          MU("mu"),

          @SerializedName("mv")
          MV("mv"),

          @SerializedName("mw")
          MW("mw"),

          @SerializedName("mx")
          MX("mx"),

          @SerializedName("my")
          MY("my"),

          @SerializedName("mz")
          MZ("mz"),

          @SerializedName("na")
          NA("na"),

          @SerializedName("nc")
          NC("nc"),

          @SerializedName("ne")
          NE("ne"),

          @SerializedName("nf")
          NF("nf"),

          @SerializedName("ng")
          NG("ng"),

          @SerializedName("ni")
          NI("ni"),

          @SerializedName("nl")
          NL("nl"),

          @SerializedName("no")
          NO("no"),

          @SerializedName("np")
          NP("np"),

          @SerializedName("nr")
          NR("nr"),

          @SerializedName("nu")
          NU("nu"),

          @SerializedName("nz")
          NZ("nz"),

          @SerializedName("om")
          OM("om"),

          @SerializedName("pa")
          PA("pa"),

          @SerializedName("pe")
          PE("pe"),

          @SerializedName("pf")
          PF("pf"),

          @SerializedName("pg")
          PG("pg"),

          @SerializedName("ph")
          PH("ph"),

          @SerializedName("pk")
          PK("pk"),

          @SerializedName("pl")
          PL("pl"),

          @SerializedName("pm")
          PM("pm"),

          @SerializedName("pn")
          PN("pn"),

          @SerializedName("pr")
          PR("pr"),

          @SerializedName("ps")
          PS("ps"),

          @SerializedName("pt")
          PT("pt"),

          @SerializedName("pw")
          PW("pw"),

          @SerializedName("py")
          PY("py"),

          @SerializedName("qa")
          QA("qa"),

          @SerializedName("qz")
          QZ("qz"),

          @SerializedName("re")
          RE("re"),

          @SerializedName("ro")
          RO("ro"),

          @SerializedName("rs")
          RS("rs"),

          @SerializedName("ru")
          RU("ru"),

          @SerializedName("rw")
          RW("rw"),

          @SerializedName("sa")
          SA("sa"),

          @SerializedName("sb")
          SB("sb"),

          @SerializedName("sc")
          SC("sc"),

          @SerializedName("sd")
          SD("sd"),

          @SerializedName("se")
          SE("se"),

          @SerializedName("sg")
          SG("sg"),

          @SerializedName("sh")
          SH("sh"),

          @SerializedName("si")
          SI("si"),

          @SerializedName("sj")
          SJ("sj"),

          @SerializedName("sk")
          SK("sk"),

          @SerializedName("sl")
          SL("sl"),

          @SerializedName("sm")
          SM("sm"),

          @SerializedName("sn")
          SN("sn"),

          @SerializedName("so")
          SO("so"),

          @SerializedName("sr")
          SR("sr"),

          @SerializedName("ss")
          SS("ss"),

          @SerializedName("st")
          ST("st"),

          @SerializedName("sv")
          SV("sv"),

          @SerializedName("sx")
          SX("sx"),

          @SerializedName("sy")
          SY("sy"),

          @SerializedName("sz")
          SZ("sz"),

          @SerializedName("tc")
          TC("tc"),

          @SerializedName("td")
          TD("td"),

          @SerializedName("tf")
          TF("tf"),

          @SerializedName("tg")
          TG("tg"),

          @SerializedName("th")
          TH("th"),

          @SerializedName("tj")
          TJ("tj"),

          @SerializedName("tk")
          TK("tk"),

          @SerializedName("tl")
          TL("tl"),

          @SerializedName("tm")
          TM("tm"),

          @SerializedName("tn")
          TN("tn"),

          @SerializedName("to")
          TO("to"),

          @SerializedName("tr")
          TR("tr"),

          @SerializedName("tt")
          TT("tt"),

          @SerializedName("tv")
          TV("tv"),

          @SerializedName("tw")
          TW("tw"),

          @SerializedName("tz")
          TZ("tz"),

          @SerializedName("ua")
          UA("ua"),

          @SerializedName("ug")
          UG("ug"),

          @SerializedName("um")
          UM("um"),

          @SerializedName("us")
          US("us"),

          @SerializedName("uy")
          UY("uy"),

          @SerializedName("uz")
          UZ("uz"),

          @SerializedName("va")
          VA("va"),

          @SerializedName("vc")
          VC("vc"),

          @SerializedName("ve")
          VE("ve"),

          @SerializedName("vg")
          VG("vg"),

          @SerializedName("vi")
          VI("vi"),

          @SerializedName("vn")
          VN("vn"),

          @SerializedName("vu")
          VU("vu"),

          @SerializedName("wf")
          WF("wf"),

          @SerializedName("ws")
          WS("ws"),

          @SerializedName("ye")
          YE("ye"),

          @SerializedName("yt")
          YT("yt"),

          @SerializedName("za")
          ZA("za"),

          @SerializedName("zm")
          ZM("zm"),

          @SerializedName("zw")
          ZW("zw");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Country(String value) {
            this.value = value;
          }
        }

        public enum Purpose implements ApiRequestParams.EnumParam {
          @SerializedName("registered")
          REGISTERED("registered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Purpose(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AdditionalName {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The person's full name. */
        @SerializedName("full_name")
        Object fullName;

        /** The person's first or given name. */
        @SerializedName("given_name")
        Object givenName;

        /** <strong>Required.</strong> The purpose or type of the additional name. */
        @SerializedName("purpose")
        Purpose purpose;

        /** The person's last or family name. */
        @SerializedName("surname")
        Object surname;

        private AdditionalName(
            Map<String, Object> extraParams,
            Object fullName,
            Object givenName,
            Purpose purpose,
            Object surname) {
          this.extraParams = extraParams;
          this.fullName = fullName;
          this.givenName = givenName;
          this.purpose = purpose;
          this.surname = surname;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object fullName;

          private Object givenName;

          private Purpose purpose;

          private Object surname;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.AdditionalName build() {
            return new AccountUpdateParams.Identity.Individual.AdditionalName(
                this.extraParams, this.fullName, this.givenName, this.purpose, this.surname);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.AdditionalName#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.Individual.AdditionalName#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The person's full name. */
          public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
          }

          /** The person's full name. */
          public Builder setFullName(EmptyParam fullName) {
            this.fullName = fullName;
            return this;
          }

          /** The person's first or given name. */
          public Builder setGivenName(String givenName) {
            this.givenName = givenName;
            return this;
          }

          /** The person's first or given name. */
          public Builder setGivenName(EmptyParam givenName) {
            this.givenName = givenName;
            return this;
          }

          /** <strong>Required.</strong> The purpose or type of the additional name. */
          public Builder setPurpose(
              AccountUpdateParams.Identity.Individual.AdditionalName.Purpose purpose) {
            this.purpose = purpose;
            return this;
          }

          /** The person's last or family name. */
          public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
          }

          /** The person's last or family name. */
          public Builder setSurname(EmptyParam surname) {
            this.surname = surname;
            return this;
          }
        }

        public enum Purpose implements ApiRequestParams.EnumParam {
          @SerializedName("alias")
          ALIAS("alias"),

          @SerializedName("maiden")
          MAIDEN("maiden");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Purpose(String value) {
            this.value = value;
          }
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
        ApiRequestParams.EnumParam country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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

        /** Town or cho-me. */
        @SerializedName("town")
        Object town;

        private Address(
            Object city,
            ApiRequestParams.EnumParam country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state,
            Object town) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
          this.town = town;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object city;

          private ApiRequestParams.EnumParam country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          private Object town;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.Address build() {
            return new AccountUpdateParams.Identity.Individual.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state,
                this.town);
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
          public Builder setCountry(
              AccountUpdateParams.Identity.Individual.Address.Country country) {
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
           * map. See {@link AccountUpdateParams.Identity.Individual.Address#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Identity.Individual.Address#extraParams} for the
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

          /** Town or cho-me. */
          public Builder setTown(String town) {
            this.town = town;
            return this;
          }

          /** Town or cho-me. */
          public Builder setTown(EmptyParam town) {
            this.town = town;
            return this;
          }
        }

        public enum Country implements ApiRequestParams.EnumParam {
          @SerializedName("ad")
          AD("ad"),

          @SerializedName("ae")
          AE("ae"),

          @SerializedName("af")
          AF("af"),

          @SerializedName("ag")
          AG("ag"),

          @SerializedName("ai")
          AI("ai"),

          @SerializedName("al")
          AL("al"),

          @SerializedName("am")
          AM("am"),

          @SerializedName("ao")
          AO("ao"),

          @SerializedName("aq")
          AQ("aq"),

          @SerializedName("ar")
          AR("ar"),

          @SerializedName("as")
          AS("as"),

          @SerializedName("at")
          AT("at"),

          @SerializedName("au")
          AU("au"),

          @SerializedName("aw")
          AW("aw"),

          @SerializedName("ax")
          AX("ax"),

          @SerializedName("az")
          AZ("az"),

          @SerializedName("ba")
          BA("ba"),

          @SerializedName("bb")
          BB("bb"),

          @SerializedName("bd")
          BD("bd"),

          @SerializedName("be")
          BE("be"),

          @SerializedName("bf")
          BF("bf"),

          @SerializedName("bg")
          BG("bg"),

          @SerializedName("bh")
          BH("bh"),

          @SerializedName("bi")
          BI("bi"),

          @SerializedName("bj")
          BJ("bj"),

          @SerializedName("bl")
          BL("bl"),

          @SerializedName("bm")
          BM("bm"),

          @SerializedName("bn")
          BN("bn"),

          @SerializedName("bo")
          BO("bo"),

          @SerializedName("bq")
          BQ("bq"),

          @SerializedName("br")
          BR("br"),

          @SerializedName("bs")
          BS("bs"),

          @SerializedName("bt")
          BT("bt"),

          @SerializedName("bv")
          BV("bv"),

          @SerializedName("bw")
          BW("bw"),

          @SerializedName("by")
          BY("by"),

          @SerializedName("bz")
          BZ("bz"),

          @SerializedName("ca")
          CA("ca"),

          @SerializedName("cc")
          CC("cc"),

          @SerializedName("cd")
          CD("cd"),

          @SerializedName("cf")
          CF("cf"),

          @SerializedName("cg")
          CG("cg"),

          @SerializedName("ch")
          CH("ch"),

          @SerializedName("ci")
          CI("ci"),

          @SerializedName("ck")
          CK("ck"),

          @SerializedName("cl")
          CL("cl"),

          @SerializedName("cm")
          CM("cm"),

          @SerializedName("cn")
          CN("cn"),

          @SerializedName("co")
          CO("co"),

          @SerializedName("cr")
          CR("cr"),

          @SerializedName("cu")
          CU("cu"),

          @SerializedName("cv")
          CV("cv"),

          @SerializedName("cw")
          CW("cw"),

          @SerializedName("cx")
          CX("cx"),

          @SerializedName("cy")
          CY("cy"),

          @SerializedName("cz")
          CZ("cz"),

          @SerializedName("de")
          DE("de"),

          @SerializedName("dj")
          DJ("dj"),

          @SerializedName("dk")
          DK("dk"),

          @SerializedName("dm")
          DM("dm"),

          @SerializedName("do")
          DO("do"),

          @SerializedName("dz")
          DZ("dz"),

          @SerializedName("ec")
          EC("ec"),

          @SerializedName("ee")
          EE("ee"),

          @SerializedName("eg")
          EG("eg"),

          @SerializedName("eh")
          EH("eh"),

          @SerializedName("er")
          ER("er"),

          @SerializedName("es")
          ES("es"),

          @SerializedName("et")
          ET("et"),

          @SerializedName("fi")
          FI("fi"),

          @SerializedName("fj")
          FJ("fj"),

          @SerializedName("fk")
          FK("fk"),

          @SerializedName("fm")
          FM("fm"),

          @SerializedName("fo")
          FO("fo"),

          @SerializedName("fr")
          FR("fr"),

          @SerializedName("ga")
          GA("ga"),

          @SerializedName("gb")
          GB("gb"),

          @SerializedName("gd")
          GD("gd"),

          @SerializedName("ge")
          GE("ge"),

          @SerializedName("gf")
          GF("gf"),

          @SerializedName("gg")
          GG("gg"),

          @SerializedName("gh")
          GH("gh"),

          @SerializedName("gi")
          GI("gi"),

          @SerializedName("gl")
          GL("gl"),

          @SerializedName("gm")
          GM("gm"),

          @SerializedName("gn")
          GN("gn"),

          @SerializedName("gp")
          GP("gp"),

          @SerializedName("gq")
          GQ("gq"),

          @SerializedName("gr")
          GR("gr"),

          @SerializedName("gs")
          GS("gs"),

          @SerializedName("gt")
          GT("gt"),

          @SerializedName("gu")
          GU("gu"),

          @SerializedName("gw")
          GW("gw"),

          @SerializedName("gy")
          GY("gy"),

          @SerializedName("hk")
          HK("hk"),

          @SerializedName("hm")
          HM("hm"),

          @SerializedName("hn")
          HN("hn"),

          @SerializedName("hr")
          HR("hr"),

          @SerializedName("ht")
          HT("ht"),

          @SerializedName("hu")
          HU("hu"),

          @SerializedName("id")
          ID("id"),

          @SerializedName("ie")
          IE("ie"),

          @SerializedName("il")
          IL("il"),

          @SerializedName("im")
          IM("im"),

          @SerializedName("in")
          IN("in"),

          @SerializedName("io")
          IO("io"),

          @SerializedName("iq")
          IQ("iq"),

          @SerializedName("ir")
          IR("ir"),

          @SerializedName("is")
          IS("is"),

          @SerializedName("it")
          IT("it"),

          @SerializedName("je")
          JE("je"),

          @SerializedName("jm")
          JM("jm"),

          @SerializedName("jo")
          JO("jo"),

          @SerializedName("jp")
          JP("jp"),

          @SerializedName("ke")
          KE("ke"),

          @SerializedName("kg")
          KG("kg"),

          @SerializedName("kh")
          KH("kh"),

          @SerializedName("ki")
          KI("ki"),

          @SerializedName("km")
          KM("km"),

          @SerializedName("kn")
          KN("kn"),

          @SerializedName("kp")
          KP("kp"),

          @SerializedName("kr")
          KR("kr"),

          @SerializedName("kw")
          KW("kw"),

          @SerializedName("ky")
          KY("ky"),

          @SerializedName("kz")
          KZ("kz"),

          @SerializedName("la")
          LA("la"),

          @SerializedName("lb")
          LB("lb"),

          @SerializedName("lc")
          LC("lc"),

          @SerializedName("li")
          LI("li"),

          @SerializedName("lk")
          LK("lk"),

          @SerializedName("lr")
          LR("lr"),

          @SerializedName("ls")
          LS("ls"),

          @SerializedName("lt")
          LT("lt"),

          @SerializedName("lu")
          LU("lu"),

          @SerializedName("lv")
          LV("lv"),

          @SerializedName("ly")
          LY("ly"),

          @SerializedName("ma")
          MA("ma"),

          @SerializedName("mc")
          MC("mc"),

          @SerializedName("md")
          MD("md"),

          @SerializedName("me")
          ME("me"),

          @SerializedName("mf")
          MF("mf"),

          @SerializedName("mg")
          MG("mg"),

          @SerializedName("mh")
          MH("mh"),

          @SerializedName("mk")
          MK("mk"),

          @SerializedName("ml")
          ML("ml"),

          @SerializedName("mm")
          MM("mm"),

          @SerializedName("mn")
          MN("mn"),

          @SerializedName("mo")
          MO("mo"),

          @SerializedName("mp")
          MP("mp"),

          @SerializedName("mq")
          MQ("mq"),

          @SerializedName("mr")
          MR("mr"),

          @SerializedName("ms")
          MS("ms"),

          @SerializedName("mt")
          MT("mt"),

          @SerializedName("mu")
          MU("mu"),

          @SerializedName("mv")
          MV("mv"),

          @SerializedName("mw")
          MW("mw"),

          @SerializedName("mx")
          MX("mx"),

          @SerializedName("my")
          MY("my"),

          @SerializedName("mz")
          MZ("mz"),

          @SerializedName("na")
          NA("na"),

          @SerializedName("nc")
          NC("nc"),

          @SerializedName("ne")
          NE("ne"),

          @SerializedName("nf")
          NF("nf"),

          @SerializedName("ng")
          NG("ng"),

          @SerializedName("ni")
          NI("ni"),

          @SerializedName("nl")
          NL("nl"),

          @SerializedName("no")
          NO("no"),

          @SerializedName("np")
          NP("np"),

          @SerializedName("nr")
          NR("nr"),

          @SerializedName("nu")
          NU("nu"),

          @SerializedName("nz")
          NZ("nz"),

          @SerializedName("om")
          OM("om"),

          @SerializedName("pa")
          PA("pa"),

          @SerializedName("pe")
          PE("pe"),

          @SerializedName("pf")
          PF("pf"),

          @SerializedName("pg")
          PG("pg"),

          @SerializedName("ph")
          PH("ph"),

          @SerializedName("pk")
          PK("pk"),

          @SerializedName("pl")
          PL("pl"),

          @SerializedName("pm")
          PM("pm"),

          @SerializedName("pn")
          PN("pn"),

          @SerializedName("pr")
          PR("pr"),

          @SerializedName("ps")
          PS("ps"),

          @SerializedName("pt")
          PT("pt"),

          @SerializedName("pw")
          PW("pw"),

          @SerializedName("py")
          PY("py"),

          @SerializedName("qa")
          QA("qa"),

          @SerializedName("qz")
          QZ("qz"),

          @SerializedName("re")
          RE("re"),

          @SerializedName("ro")
          RO("ro"),

          @SerializedName("rs")
          RS("rs"),

          @SerializedName("ru")
          RU("ru"),

          @SerializedName("rw")
          RW("rw"),

          @SerializedName("sa")
          SA("sa"),

          @SerializedName("sb")
          SB("sb"),

          @SerializedName("sc")
          SC("sc"),

          @SerializedName("sd")
          SD("sd"),

          @SerializedName("se")
          SE("se"),

          @SerializedName("sg")
          SG("sg"),

          @SerializedName("sh")
          SH("sh"),

          @SerializedName("si")
          SI("si"),

          @SerializedName("sj")
          SJ("sj"),

          @SerializedName("sk")
          SK("sk"),

          @SerializedName("sl")
          SL("sl"),

          @SerializedName("sm")
          SM("sm"),

          @SerializedName("sn")
          SN("sn"),

          @SerializedName("so")
          SO("so"),

          @SerializedName("sr")
          SR("sr"),

          @SerializedName("ss")
          SS("ss"),

          @SerializedName("st")
          ST("st"),

          @SerializedName("sv")
          SV("sv"),

          @SerializedName("sx")
          SX("sx"),

          @SerializedName("sy")
          SY("sy"),

          @SerializedName("sz")
          SZ("sz"),

          @SerializedName("tc")
          TC("tc"),

          @SerializedName("td")
          TD("td"),

          @SerializedName("tf")
          TF("tf"),

          @SerializedName("tg")
          TG("tg"),

          @SerializedName("th")
          TH("th"),

          @SerializedName("tj")
          TJ("tj"),

          @SerializedName("tk")
          TK("tk"),

          @SerializedName("tl")
          TL("tl"),

          @SerializedName("tm")
          TM("tm"),

          @SerializedName("tn")
          TN("tn"),

          @SerializedName("to")
          TO("to"),

          @SerializedName("tr")
          TR("tr"),

          @SerializedName("tt")
          TT("tt"),

          @SerializedName("tv")
          TV("tv"),

          @SerializedName("tw")
          TW("tw"),

          @SerializedName("tz")
          TZ("tz"),

          @SerializedName("ua")
          UA("ua"),

          @SerializedName("ug")
          UG("ug"),

          @SerializedName("um")
          UM("um"),

          @SerializedName("us")
          US("us"),

          @SerializedName("uy")
          UY("uy"),

          @SerializedName("uz")
          UZ("uz"),

          @SerializedName("va")
          VA("va"),

          @SerializedName("vc")
          VC("vc"),

          @SerializedName("ve")
          VE("ve"),

          @SerializedName("vg")
          VG("vg"),

          @SerializedName("vi")
          VI("vi"),

          @SerializedName("vn")
          VN("vn"),

          @SerializedName("vu")
          VU("vu"),

          @SerializedName("wf")
          WF("wf"),

          @SerializedName("ws")
          WS("ws"),

          @SerializedName("ye")
          YE("ye"),

          @SerializedName("yt")
          YT("yt"),

          @SerializedName("za")
          ZA("za"),

          @SerializedName("zm")
          ZM("zm"),

          @SerializedName("zw")
          ZW("zw");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Country(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DateOfBirth {
        /** <strong>Required.</strong> The day of the birth. */
        @SerializedName("day")
        Integer day;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The month of birth. */
        @SerializedName("month")
        Integer month;

        /** <strong>Required.</strong> The year of birth. */
        @SerializedName("year")
        Integer year;

        private DateOfBirth(
            Integer day, Map<String, Object> extraParams, Integer month, Integer year) {
          this.day = day;
          this.extraParams = extraParams;
          this.month = month;
          this.year = year;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Integer day;

          private Map<String, Object> extraParams;

          private Integer month;

          private Integer year;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.DateOfBirth build() {
            return new AccountUpdateParams.Identity.Individual.DateOfBirth(
                this.day, this.extraParams, this.month, this.year);
          }

          /** <strong>Required.</strong> The day of the birth. */
          public Builder setDay(Integer day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.DateOfBirth#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.Individual.DateOfBirth#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The month of birth. */
          public Builder setMonth(Integer month) {
            this.month = month;
            return this;
          }

          /** <strong>Required.</strong> The year of birth. */
          public Builder setYear(Integer year) {
            this.year = year;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Documents {
        /**
         * One or more documents that demonstrate proof that this person is authorized to represent
         * the company.
         */
        @SerializedName("company_authorization")
        CompanyAuthorization companyAuthorization;

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
         * One or more documents showing the person’s passport page with photo and personal data.
         */
        @SerializedName("passport")
        Passport passport;

        /**
         * An identifying document showing the person's name, either a passport or local ID card.
         */
        @SerializedName("primary_verification")
        Object primaryVerification;

        /**
         * A document showing address, either a passport, local ID card, or utility bill from a
         * well-known utility company.
         */
        @SerializedName("secondary_verification")
        Object secondaryVerification;

        /**
         * One or more documents showing the person’s visa required for living in the country where
         * they are residing.
         */
        @SerializedName("visa")
        Visa visa;

        private Documents(
            CompanyAuthorization companyAuthorization,
            Map<String, Object> extraParams,
            Passport passport,
            Object primaryVerification,
            Object secondaryVerification,
            Visa visa) {
          this.companyAuthorization = companyAuthorization;
          this.extraParams = extraParams;
          this.passport = passport;
          this.primaryVerification = primaryVerification;
          this.secondaryVerification = secondaryVerification;
          this.visa = visa;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private CompanyAuthorization companyAuthorization;

          private Map<String, Object> extraParams;

          private Passport passport;

          private Object primaryVerification;

          private Object secondaryVerification;

          private Visa visa;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.Documents build() {
            return new AccountUpdateParams.Identity.Individual.Documents(
                this.companyAuthorization,
                this.extraParams,
                this.passport,
                this.primaryVerification,
                this.secondaryVerification,
                this.visa);
          }

          /**
           * One or more documents that demonstrate proof that this person is authorized to
           * represent the company.
           */
          public Builder setCompanyAuthorization(
              AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization
                  companyAuthorization) {
            this.companyAuthorization = companyAuthorization;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.Documents#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Identity.Individual.Documents#extraParams} for the
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
           * One or more documents showing the person’s passport page with photo and personal data.
           */
          public Builder setPassport(
              AccountUpdateParams.Identity.Individual.Documents.Passport passport) {
            this.passport = passport;
            return this;
          }

          /**
           * An identifying document showing the person's name, either a passport or local ID card.
           */
          public Builder setPrimaryVerification(
              AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification
                  primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /**
           * An identifying document showing the person's name, either a passport or local ID card.
           */
          public Builder setPrimaryVerification(EmptyParam primaryVerification) {
            this.primaryVerification = primaryVerification;
            return this;
          }

          /**
           * A document showing address, either a passport, local ID card, or utility bill from a
           * well-known utility company.
           */
          public Builder setSecondaryVerification(
              AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification
                  secondaryVerification) {
            this.secondaryVerification = secondaryVerification;
            return this;
          }

          /**
           * A document showing address, either a passport, local ID card, or utility bill from a
           * well-known utility company.
           */
          public Builder setSecondaryVerification(EmptyParam secondaryVerification) {
            this.secondaryVerification = secondaryVerification;
            return this;
          }

          /**
           * One or more documents showing the person’s visa required for living in the country
           * where they are residing.
           */
          public Builder setVisa(AccountUpdateParams.Identity.Individual.Documents.Visa visa) {
            this.visa = visa;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CompanyAuthorization {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private CompanyAuthorization(
              Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization build() {
              return new AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization#extraParams}
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization#files} for the
             * field documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization#files} for the
             * field documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.Individual.Documents.CompanyAuthorization.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Passport {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private Passport(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.Documents.Passport build() {
              return new AccountUpdateParams.Identity.Individual.Documents.Passport(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Passport#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Passport#extraParams} for the field
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Passport#files} for the field
             * documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Passport#files} for the field
             * documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.Individual.Documents.Passport.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PrimaryVerification {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
           * referring to each side of the document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * <strong>Required.</strong> The format of the verification document. Currently supports
           * {@code front_back} only.
           */
          @SerializedName("type")
          Type type;

          private PrimaryVerification(
              Map<String, Object> extraParams, FrontBack frontBack, Type type) {
            this.extraParams = extraParams;
            this.frontBack = frontBack;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FrontBack frontBack;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification build() {
              return new AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification#extraParams}
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
             * <strong>Required.</strong> The <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
             * referring to each side of the document.
             */
            public Builder setFrontBack(
                AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack {
            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the back of the verification document. The purpose of the uploaded
             * file should be 'identity_document'. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            @SerializedName("back")
            Object back;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
             */
            @SerializedName("front")
            Object front;

            private FrontBack(Object back, Map<String, Object> extraParams, Object front) {
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
              public AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack
                  build() {
                return new AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification
                    .FrontBack(this.back, this.extraParams, this.front);
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(String back) {
                this.back = back;
                return this;
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(EmptyParam back) {
                this.back = back;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Identity.Individual.Documents.PrimaryVerification.FrontBack#extraParams}
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
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setFront(String front) {
                this.front = front;
                return this;
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setFront(EmptyParam front) {
                this.front = front;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("front_back")
            FRONT_BACK("front_back");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class SecondaryVerification {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> The <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
           * referring to each side of the document.
           */
          @SerializedName("front_back")
          FrontBack frontBack;

          /**
           * <strong>Required.</strong> The format of the verification document. Currently supports
           * {@code front_back} only.
           */
          @SerializedName("type")
          Type type;

          private SecondaryVerification(
              Map<String, Object> extraParams, FrontBack frontBack, Type type) {
            this.extraParams = extraParams;
            this.frontBack = frontBack;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FrontBack frontBack;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification build() {
              return new AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification(
                  this.extraParams, this.frontBack, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification#extraParams}
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
             * <strong>Required.</strong> The <a
             * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> tokens
             * referring to each side of the document.
             */
            public Builder setFrontBack(
                AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack
                    frontBack) {
              this.frontBack = frontBack;
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the verification document. Currently
             * supports {@code front_back} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FrontBack {
            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the back of the verification document. The purpose of the uploaded
             * file should be 'identity_document'. The uploaded file needs to be a color image
             * (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10 MB in
             * size.
             */
            @SerializedName("back")
            Object back;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
             * token representing the front of the verification document. The purpose of the
             * uploaded file should be 'identity_document'. The uploaded file needs to be a color
             * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than 10
             * MB in size.
             */
            @SerializedName("front")
            Object front;

            private FrontBack(Object back, Map<String, Object> extraParams, Object front) {
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
              public AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification
                      .FrontBack
                  build() {
                return new AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification
                    .FrontBack(this.back, this.extraParams, this.front);
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(String back) {
                this.back = back;
                return this;
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the back of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setBack(EmptyParam back) {
                this.back = back;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * AccountUpdateParams.Identity.Individual.Documents.SecondaryVerification.FrontBack#extraParams}
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
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setFront(String front) {
                this.front = front;
                return this;
              }

              /**
               * A <a href="https://docs.stripe.com/api/persons/update#create_file">file upload</a>
               * token representing the front of the verification document. The purpose of the
               * uploaded file should be 'identity_document'. The uploaded file needs to be a color
               * image (smaller than 8,000px by 8,000px), in JPG, PNG, or PDF format, and less than
               * 10 MB in size.
               */
              public Builder setFront(EmptyParam front) {
                this.front = front;
                return this;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("front_back")
            FRONT_BACK("front_back");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Visa {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> One or more document IDs returned by a <a
           * href="https://docs.stripe.com/api/persons/update#create_file">file upload</a> with a
           * purpose value of {@code account_requirement}.
           */
          @SerializedName("files")
          List<String> files;

          /**
           * <strong>Required.</strong> The format of the document. Currently supports {@code files}
           * only.
           */
          @SerializedName("type")
          Type type;

          private Visa(Map<String, Object> extraParams, List<String> files, Type type) {
            this.extraParams = extraParams;
            this.files = files;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<String> files;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.Documents.Visa build() {
              return new AccountUpdateParams.Identity.Individual.Documents.Visa(
                  this.extraParams, this.files, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Visa#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Visa#extraParams} for the field
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
             * Add an element to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Visa#files} for the field
             * documentation.
             */
            public Builder addFile(String element) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.add(element);
              return this;
            }

            /**
             * Add all elements to `files` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * AccountUpdateParams.Identity.Individual.Documents.Visa#files} for the field
             * documentation.
             */
            public Builder addAllFile(List<String> elements) {
              if (this.files == null) {
                this.files = new ArrayList<>();
              }
              this.files.addAll(elements);
              return this;
            }

            /**
             * <strong>Required.</strong> The format of the document. Currently supports {@code
             * files} only.
             */
            public Builder setType(
                AccountUpdateParams.Identity.Individual.Documents.Visa.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("files")
            FILES("files");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class IdNumber {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The ID number type of an individual. */
        @SerializedName("type")
        Type type;

        /** <strong>Required.</strong> The value of the ID number. */
        @SerializedName("value")
        Object value;

        private IdNumber(Map<String, Object> extraParams, Type type, Object value) {
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

          private Object value;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.IdNumber build() {
            return new AccountUpdateParams.Identity.Individual.IdNumber(
                this.extraParams, this.type, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.IdNumber#extraParams} for the
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
           * map. See {@link AccountUpdateParams.Identity.Individual.IdNumber#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID number type of an individual. */
          public Builder setType(AccountUpdateParams.Identity.Individual.IdNumber.Type type) {
            this.type = type;
            return this;
          }

          /** <strong>Required.</strong> The value of the ID number. */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }

          /** <strong>Required.</strong> The value of the ID number. */
          public Builder setValue(EmptyParam value) {
            this.value = value;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("ae_eid")
          AE_EID("ae_eid"),

          @SerializedName("br_cpf")
          BR_CPF("br_cpf"),

          @SerializedName("de_stn")
          DE_STN("de_stn"),

          @SerializedName("hk_id")
          HK_ID("hk_id"),

          @SerializedName("mx_rfc")
          MX_RFC("mx_rfc"),

          @SerializedName("my_nric")
          MY_NRIC("my_nric"),

          @SerializedName("nl_bsn")
          NL_BSN("nl_bsn"),

          @SerializedName("sg_fin")
          SG_FIN("sg_fin"),

          @SerializedName("sg_nric")
          SG_NRIC("sg_nric"),

          @SerializedName("th_lc")
          TH_LC("th_lc"),

          @SerializedName("th_pin")
          TH_PIN("th_pin"),

          @SerializedName("us_itin")
          US_ITIN("us_itin"),

          @SerializedName("us_itin_last_4")
          US_ITIN_LAST_4("us_itin_last_4"),

          @SerializedName("us_ssn")
          US_SSN("us_ssn"),

          @SerializedName("us_ssn_last_4")
          US_SSN_LAST_4("us_ssn_last_4");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Relationship {
        /**
         * Whether the person is a director of the account's identity. Directors are typically
         * members of the governing board of the company, or responsible for ensuring the company
         * meets its regulatory obligations.
         */
        @SerializedName("director")
        Object director;

        /**
         * Whether the person has significant responsibility to control, manage, or direct the
         * organization.
         */
        @SerializedName("executive")
        Object executive;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Whether the person is an owner of the account’s identity. */
        @SerializedName("owner")
        Object owner;

        /** The percent owned by the person of the account's legal entity. */
        @SerializedName("percent_ownership")
        Object percentOwnership;

        /** The person's title (e.g., CEO, Support Engineer). */
        @SerializedName("title")
        Object title;

        private Relationship(
            Object director,
            Object executive,
            Map<String, Object> extraParams,
            Object owner,
            Object percentOwnership,
            Object title) {
          this.director = director;
          this.executive = executive;
          this.extraParams = extraParams;
          this.owner = owner;
          this.percentOwnership = percentOwnership;
          this.title = title;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object director;

          private Object executive;

          private Map<String, Object> extraParams;

          private Object owner;

          private Object percentOwnership;

          private Object title;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.Relationship build() {
            return new AccountUpdateParams.Identity.Individual.Relationship(
                this.director,
                this.executive,
                this.extraParams,
                this.owner,
                this.percentOwnership,
                this.title);
          }

          /**
           * Whether the person is a director of the account's identity. Directors are typically
           * members of the governing board of the company, or responsible for ensuring the company
           * meets its regulatory obligations.
           */
          public Builder setDirector(Boolean director) {
            this.director = director;
            return this;
          }

          /**
           * Whether the person is a director of the account's identity. Directors are typically
           * members of the governing board of the company, or responsible for ensuring the company
           * meets its regulatory obligations.
           */
          public Builder setDirector(EmptyParam director) {
            this.director = director;
            return this;
          }

          /**
           * Whether the person has significant responsibility to control, manage, or direct the
           * organization.
           */
          public Builder setExecutive(Boolean executive) {
            this.executive = executive;
            return this;
          }

          /**
           * Whether the person has significant responsibility to control, manage, or direct the
           * organization.
           */
          public Builder setExecutive(EmptyParam executive) {
            this.executive = executive;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.Relationship#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.Individual.Relationship#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Whether the person is an owner of the account’s identity. */
          public Builder setOwner(Boolean owner) {
            this.owner = owner;
            return this;
          }

          /** Whether the person is an owner of the account’s identity. */
          public Builder setOwner(EmptyParam owner) {
            this.owner = owner;
            return this;
          }

          /** The percent owned by the person of the account's legal entity. */
          public Builder setPercentOwnership(String percentOwnership) {
            this.percentOwnership = percentOwnership;
            return this;
          }

          /** The percent owned by the person of the account's legal entity. */
          public Builder setPercentOwnership(EmptyParam percentOwnership) {
            this.percentOwnership = percentOwnership;
            return this;
          }

          /** The person's title (e.g., CEO, Support Engineer). */
          public Builder setTitle(String title) {
            this.title = title;
            return this;
          }

          /** The person's title (e.g., CEO, Support Engineer). */
          public Builder setTitle(EmptyParam title) {
            this.title = title;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptAddresses {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Kana Address. */
        @SerializedName("kana")
        Object kana;

        /** Kanji Address. */
        @SerializedName("kanji")
        Object kanji;

        private ScriptAddresses(Map<String, Object> extraParams, Object kana, Object kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object kana;

          private Object kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.ScriptAddresses build() {
            return new AccountUpdateParams.Identity.Individual.ScriptAddresses(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.ScriptAddresses#extraParams}
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
           * map. See {@link AccountUpdateParams.Identity.Individual.ScriptAddresses#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Kana Address. */
          public Builder setKana(
              AccountUpdateParams.Identity.Individual.ScriptAddresses.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Kana Address. */
          public Builder setKana(EmptyParam kana) {
            this.kana = kana;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(
              AccountUpdateParams.Identity.Individual.ScriptAddresses.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }

          /** Kanji Address. */
          public Builder setKanji(EmptyParam kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          ApiRequestParams.EnumParam country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          Object town;

          private Kana(
              Object city,
              ApiRequestParams.EnumParam country,
              Map<String, Object> extraParams,
              Object line1,
              Object line2,
              Object postalCode,
              Object state,
              Object town) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
            this.town = town;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object city;

            private ApiRequestParams.EnumParam country;

            private Map<String, Object> extraParams;

            private Object line1;

            private Object line2;

            private Object postalCode;

            private Object state;

            private Object town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.ScriptAddresses.Kana build() {
              return new AccountUpdateParams.Identity.Individual.ScriptAddresses.Kana(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(
                AccountUpdateParams.Identity.Individual.ScriptAddresses.Kana.Country country) {
              this.country = country;
              return this;
            }

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptAddresses.Kana#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptAddresses.Kana#extraParams} for the
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }

            /** Town or cho-me. */
            public Builder setTown(EmptyParam town) {
              this.town = town;
              return this;
            }
          }

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("ad")
            AD("ad"),

            @SerializedName("ae")
            AE("ae"),

            @SerializedName("af")
            AF("af"),

            @SerializedName("ag")
            AG("ag"),

            @SerializedName("ai")
            AI("ai"),

            @SerializedName("al")
            AL("al"),

            @SerializedName("am")
            AM("am"),

            @SerializedName("ao")
            AO("ao"),

            @SerializedName("aq")
            AQ("aq"),

            @SerializedName("ar")
            AR("ar"),

            @SerializedName("as")
            AS("as"),

            @SerializedName("at")
            AT("at"),

            @SerializedName("au")
            AU("au"),

            @SerializedName("aw")
            AW("aw"),

            @SerializedName("ax")
            AX("ax"),

            @SerializedName("az")
            AZ("az"),

            @SerializedName("ba")
            BA("ba"),

            @SerializedName("bb")
            BB("bb"),

            @SerializedName("bd")
            BD("bd"),

            @SerializedName("be")
            BE("be"),

            @SerializedName("bf")
            BF("bf"),

            @SerializedName("bg")
            BG("bg"),

            @SerializedName("bh")
            BH("bh"),

            @SerializedName("bi")
            BI("bi"),

            @SerializedName("bj")
            BJ("bj"),

            @SerializedName("bl")
            BL("bl"),

            @SerializedName("bm")
            BM("bm"),

            @SerializedName("bn")
            BN("bn"),

            @SerializedName("bo")
            BO("bo"),

            @SerializedName("bq")
            BQ("bq"),

            @SerializedName("br")
            BR("br"),

            @SerializedName("bs")
            BS("bs"),

            @SerializedName("bt")
            BT("bt"),

            @SerializedName("bv")
            BV("bv"),

            @SerializedName("bw")
            BW("bw"),

            @SerializedName("by")
            BY("by"),

            @SerializedName("bz")
            BZ("bz"),

            @SerializedName("ca")
            CA("ca"),

            @SerializedName("cc")
            CC("cc"),

            @SerializedName("cd")
            CD("cd"),

            @SerializedName("cf")
            CF("cf"),

            @SerializedName("cg")
            CG("cg"),

            @SerializedName("ch")
            CH("ch"),

            @SerializedName("ci")
            CI("ci"),

            @SerializedName("ck")
            CK("ck"),

            @SerializedName("cl")
            CL("cl"),

            @SerializedName("cm")
            CM("cm"),

            @SerializedName("cn")
            CN("cn"),

            @SerializedName("co")
            CO("co"),

            @SerializedName("cr")
            CR("cr"),

            @SerializedName("cu")
            CU("cu"),

            @SerializedName("cv")
            CV("cv"),

            @SerializedName("cw")
            CW("cw"),

            @SerializedName("cx")
            CX("cx"),

            @SerializedName("cy")
            CY("cy"),

            @SerializedName("cz")
            CZ("cz"),

            @SerializedName("de")
            DE("de"),

            @SerializedName("dj")
            DJ("dj"),

            @SerializedName("dk")
            DK("dk"),

            @SerializedName("dm")
            DM("dm"),

            @SerializedName("do")
            DO("do"),

            @SerializedName("dz")
            DZ("dz"),

            @SerializedName("ec")
            EC("ec"),

            @SerializedName("ee")
            EE("ee"),

            @SerializedName("eg")
            EG("eg"),

            @SerializedName("eh")
            EH("eh"),

            @SerializedName("er")
            ER("er"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("et")
            ET("et"),

            @SerializedName("fi")
            FI("fi"),

            @SerializedName("fj")
            FJ("fj"),

            @SerializedName("fk")
            FK("fk"),

            @SerializedName("fm")
            FM("fm"),

            @SerializedName("fo")
            FO("fo"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("ga")
            GA("ga"),

            @SerializedName("gb")
            GB("gb"),

            @SerializedName("gd")
            GD("gd"),

            @SerializedName("ge")
            GE("ge"),

            @SerializedName("gf")
            GF("gf"),

            @SerializedName("gg")
            GG("gg"),

            @SerializedName("gh")
            GH("gh"),

            @SerializedName("gi")
            GI("gi"),

            @SerializedName("gl")
            GL("gl"),

            @SerializedName("gm")
            GM("gm"),

            @SerializedName("gn")
            GN("gn"),

            @SerializedName("gp")
            GP("gp"),

            @SerializedName("gq")
            GQ("gq"),

            @SerializedName("gr")
            GR("gr"),

            @SerializedName("gs")
            GS("gs"),

            @SerializedName("gt")
            GT("gt"),

            @SerializedName("gu")
            GU("gu"),

            @SerializedName("gw")
            GW("gw"),

            @SerializedName("gy")
            GY("gy"),

            @SerializedName("hk")
            HK("hk"),

            @SerializedName("hm")
            HM("hm"),

            @SerializedName("hn")
            HN("hn"),

            @SerializedName("hr")
            HR("hr"),

            @SerializedName("ht")
            HT("ht"),

            @SerializedName("hu")
            HU("hu"),

            @SerializedName("id")
            ID("id"),

            @SerializedName("ie")
            IE("ie"),

            @SerializedName("il")
            IL("il"),

            @SerializedName("im")
            IM("im"),

            @SerializedName("in")
            IN("in"),

            @SerializedName("io")
            IO("io"),

            @SerializedName("iq")
            IQ("iq"),

            @SerializedName("ir")
            IR("ir"),

            @SerializedName("is")
            IS("is"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("je")
            JE("je"),

            @SerializedName("jm")
            JM("jm"),

            @SerializedName("jo")
            JO("jo"),

            @SerializedName("jp")
            JP("jp"),

            @SerializedName("ke")
            KE("ke"),

            @SerializedName("kg")
            KG("kg"),

            @SerializedName("kh")
            KH("kh"),

            @SerializedName("ki")
            KI("ki"),

            @SerializedName("km")
            KM("km"),

            @SerializedName("kn")
            KN("kn"),

            @SerializedName("kp")
            KP("kp"),

            @SerializedName("kr")
            KR("kr"),

            @SerializedName("kw")
            KW("kw"),

            @SerializedName("ky")
            KY("ky"),

            @SerializedName("kz")
            KZ("kz"),

            @SerializedName("la")
            LA("la"),

            @SerializedName("lb")
            LB("lb"),

            @SerializedName("lc")
            LC("lc"),

            @SerializedName("li")
            LI("li"),

            @SerializedName("lk")
            LK("lk"),

            @SerializedName("lr")
            LR("lr"),

            @SerializedName("ls")
            LS("ls"),

            @SerializedName("lt")
            LT("lt"),

            @SerializedName("lu")
            LU("lu"),

            @SerializedName("lv")
            LV("lv"),

            @SerializedName("ly")
            LY("ly"),

            @SerializedName("ma")
            MA("ma"),

            @SerializedName("mc")
            MC("mc"),

            @SerializedName("md")
            MD("md"),

            @SerializedName("me")
            ME("me"),

            @SerializedName("mf")
            MF("mf"),

            @SerializedName("mg")
            MG("mg"),

            @SerializedName("mh")
            MH("mh"),

            @SerializedName("mk")
            MK("mk"),

            @SerializedName("ml")
            ML("ml"),

            @SerializedName("mm")
            MM("mm"),

            @SerializedName("mn")
            MN("mn"),

            @SerializedName("mo")
            MO("mo"),

            @SerializedName("mp")
            MP("mp"),

            @SerializedName("mq")
            MQ("mq"),

            @SerializedName("mr")
            MR("mr"),

            @SerializedName("ms")
            MS("ms"),

            @SerializedName("mt")
            MT("mt"),

            @SerializedName("mu")
            MU("mu"),

            @SerializedName("mv")
            MV("mv"),

            @SerializedName("mw")
            MW("mw"),

            @SerializedName("mx")
            MX("mx"),

            @SerializedName("my")
            MY("my"),

            @SerializedName("mz")
            MZ("mz"),

            @SerializedName("na")
            NA("na"),

            @SerializedName("nc")
            NC("nc"),

            @SerializedName("ne")
            NE("ne"),

            @SerializedName("nf")
            NF("nf"),

            @SerializedName("ng")
            NG("ng"),

            @SerializedName("ni")
            NI("ni"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("no")
            NO("no"),

            @SerializedName("np")
            NP("np"),

            @SerializedName("nr")
            NR("nr"),

            @SerializedName("nu")
            NU("nu"),

            @SerializedName("nz")
            NZ("nz"),

            @SerializedName("om")
            OM("om"),

            @SerializedName("pa")
            PA("pa"),

            @SerializedName("pe")
            PE("pe"),

            @SerializedName("pf")
            PF("pf"),

            @SerializedName("pg")
            PG("pg"),

            @SerializedName("ph")
            PH("ph"),

            @SerializedName("pk")
            PK("pk"),

            @SerializedName("pl")
            PL("pl"),

            @SerializedName("pm")
            PM("pm"),

            @SerializedName("pn")
            PN("pn"),

            @SerializedName("pr")
            PR("pr"),

            @SerializedName("ps")
            PS("ps"),

            @SerializedName("pt")
            PT("pt"),

            @SerializedName("pw")
            PW("pw"),

            @SerializedName("py")
            PY("py"),

            @SerializedName("qa")
            QA("qa"),

            @SerializedName("qz")
            QZ("qz"),

            @SerializedName("re")
            RE("re"),

            @SerializedName("ro")
            RO("ro"),

            @SerializedName("rs")
            RS("rs"),

            @SerializedName("ru")
            RU("ru"),

            @SerializedName("rw")
            RW("rw"),

            @SerializedName("sa")
            SA("sa"),

            @SerializedName("sb")
            SB("sb"),

            @SerializedName("sc")
            SC("sc"),

            @SerializedName("sd")
            SD("sd"),

            @SerializedName("se")
            SE("se"),

            @SerializedName("sg")
            SG("sg"),

            @SerializedName("sh")
            SH("sh"),

            @SerializedName("si")
            SI("si"),

            @SerializedName("sj")
            SJ("sj"),

            @SerializedName("sk")
            SK("sk"),

            @SerializedName("sl")
            SL("sl"),

            @SerializedName("sm")
            SM("sm"),

            @SerializedName("sn")
            SN("sn"),

            @SerializedName("so")
            SO("so"),

            @SerializedName("sr")
            SR("sr"),

            @SerializedName("ss")
            SS("ss"),

            @SerializedName("st")
            ST("st"),

            @SerializedName("sv")
            SV("sv"),

            @SerializedName("sx")
            SX("sx"),

            @SerializedName("sy")
            SY("sy"),

            @SerializedName("sz")
            SZ("sz"),

            @SerializedName("tc")
            TC("tc"),

            @SerializedName("td")
            TD("td"),

            @SerializedName("tf")
            TF("tf"),

            @SerializedName("tg")
            TG("tg"),

            @SerializedName("th")
            TH("th"),

            @SerializedName("tj")
            TJ("tj"),

            @SerializedName("tk")
            TK("tk"),

            @SerializedName("tl")
            TL("tl"),

            @SerializedName("tm")
            TM("tm"),

            @SerializedName("tn")
            TN("tn"),

            @SerializedName("to")
            TO("to"),

            @SerializedName("tr")
            TR("tr"),

            @SerializedName("tt")
            TT("tt"),

            @SerializedName("tv")
            TV("tv"),

            @SerializedName("tw")
            TW("tw"),

            @SerializedName("tz")
            TZ("tz"),

            @SerializedName("ua")
            UA("ua"),

            @SerializedName("ug")
            UG("ug"),

            @SerializedName("um")
            UM("um"),

            @SerializedName("us")
            US("us"),

            @SerializedName("uy")
            UY("uy"),

            @SerializedName("uz")
            UZ("uz"),

            @SerializedName("va")
            VA("va"),

            @SerializedName("vc")
            VC("vc"),

            @SerializedName("ve")
            VE("ve"),

            @SerializedName("vg")
            VG("vg"),

            @SerializedName("vi")
            VI("vi"),

            @SerializedName("vn")
            VN("vn"),

            @SerializedName("vu")
            VU("vu"),

            @SerializedName("wf")
            WF("wf"),

            @SerializedName("ws")
            WS("ws"),

            @SerializedName("ye")
            YE("ye"),

            @SerializedName("yt")
            YT("yt"),

            @SerializedName("za")
            ZA("za"),

            @SerializedName("zm")
            ZM("zm"),

            @SerializedName("zw")
            ZW("zw");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          ApiRequestParams.EnumParam country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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

          /** Town or cho-me. */
          @SerializedName("town")
          Object town;

          private Kanji(
              Object city,
              ApiRequestParams.EnumParam country,
              Map<String, Object> extraParams,
              Object line1,
              Object line2,
              Object postalCode,
              Object state,
              Object town) {
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
            this.town = town;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object city;

            private ApiRequestParams.EnumParam country;

            private Map<String, Object> extraParams;

            private Object line1;

            private Object line2;

            private Object postalCode;

            private Object state;

            private Object town;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.ScriptAddresses.Kanji build() {
              return new AccountUpdateParams.Identity.Individual.ScriptAddresses.Kanji(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state,
                  this.town);
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(
                AccountUpdateParams.Identity.Individual.ScriptAddresses.Kanji.Country country) {
              this.country = country;
              return this;
            }

            /**
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptAddresses.Kanji#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptAddresses.Kanji#extraParams} for the
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

            /** Town or cho-me. */
            public Builder setTown(String town) {
              this.town = town;
              return this;
            }

            /** Town or cho-me. */
            public Builder setTown(EmptyParam town) {
              this.town = town;
              return this;
            }
          }

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("ad")
            AD("ad"),

            @SerializedName("ae")
            AE("ae"),

            @SerializedName("af")
            AF("af"),

            @SerializedName("ag")
            AG("ag"),

            @SerializedName("ai")
            AI("ai"),

            @SerializedName("al")
            AL("al"),

            @SerializedName("am")
            AM("am"),

            @SerializedName("ao")
            AO("ao"),

            @SerializedName("aq")
            AQ("aq"),

            @SerializedName("ar")
            AR("ar"),

            @SerializedName("as")
            AS("as"),

            @SerializedName("at")
            AT("at"),

            @SerializedName("au")
            AU("au"),

            @SerializedName("aw")
            AW("aw"),

            @SerializedName("ax")
            AX("ax"),

            @SerializedName("az")
            AZ("az"),

            @SerializedName("ba")
            BA("ba"),

            @SerializedName("bb")
            BB("bb"),

            @SerializedName("bd")
            BD("bd"),

            @SerializedName("be")
            BE("be"),

            @SerializedName("bf")
            BF("bf"),

            @SerializedName("bg")
            BG("bg"),

            @SerializedName("bh")
            BH("bh"),

            @SerializedName("bi")
            BI("bi"),

            @SerializedName("bj")
            BJ("bj"),

            @SerializedName("bl")
            BL("bl"),

            @SerializedName("bm")
            BM("bm"),

            @SerializedName("bn")
            BN("bn"),

            @SerializedName("bo")
            BO("bo"),

            @SerializedName("bq")
            BQ("bq"),

            @SerializedName("br")
            BR("br"),

            @SerializedName("bs")
            BS("bs"),

            @SerializedName("bt")
            BT("bt"),

            @SerializedName("bv")
            BV("bv"),

            @SerializedName("bw")
            BW("bw"),

            @SerializedName("by")
            BY("by"),

            @SerializedName("bz")
            BZ("bz"),

            @SerializedName("ca")
            CA("ca"),

            @SerializedName("cc")
            CC("cc"),

            @SerializedName("cd")
            CD("cd"),

            @SerializedName("cf")
            CF("cf"),

            @SerializedName("cg")
            CG("cg"),

            @SerializedName("ch")
            CH("ch"),

            @SerializedName("ci")
            CI("ci"),

            @SerializedName("ck")
            CK("ck"),

            @SerializedName("cl")
            CL("cl"),

            @SerializedName("cm")
            CM("cm"),

            @SerializedName("cn")
            CN("cn"),

            @SerializedName("co")
            CO("co"),

            @SerializedName("cr")
            CR("cr"),

            @SerializedName("cu")
            CU("cu"),

            @SerializedName("cv")
            CV("cv"),

            @SerializedName("cw")
            CW("cw"),

            @SerializedName("cx")
            CX("cx"),

            @SerializedName("cy")
            CY("cy"),

            @SerializedName("cz")
            CZ("cz"),

            @SerializedName("de")
            DE("de"),

            @SerializedName("dj")
            DJ("dj"),

            @SerializedName("dk")
            DK("dk"),

            @SerializedName("dm")
            DM("dm"),

            @SerializedName("do")
            DO("do"),

            @SerializedName("dz")
            DZ("dz"),

            @SerializedName("ec")
            EC("ec"),

            @SerializedName("ee")
            EE("ee"),

            @SerializedName("eg")
            EG("eg"),

            @SerializedName("eh")
            EH("eh"),

            @SerializedName("er")
            ER("er"),

            @SerializedName("es")
            ES("es"),

            @SerializedName("et")
            ET("et"),

            @SerializedName("fi")
            FI("fi"),

            @SerializedName("fj")
            FJ("fj"),

            @SerializedName("fk")
            FK("fk"),

            @SerializedName("fm")
            FM("fm"),

            @SerializedName("fo")
            FO("fo"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("ga")
            GA("ga"),

            @SerializedName("gb")
            GB("gb"),

            @SerializedName("gd")
            GD("gd"),

            @SerializedName("ge")
            GE("ge"),

            @SerializedName("gf")
            GF("gf"),

            @SerializedName("gg")
            GG("gg"),

            @SerializedName("gh")
            GH("gh"),

            @SerializedName("gi")
            GI("gi"),

            @SerializedName("gl")
            GL("gl"),

            @SerializedName("gm")
            GM("gm"),

            @SerializedName("gn")
            GN("gn"),

            @SerializedName("gp")
            GP("gp"),

            @SerializedName("gq")
            GQ("gq"),

            @SerializedName("gr")
            GR("gr"),

            @SerializedName("gs")
            GS("gs"),

            @SerializedName("gt")
            GT("gt"),

            @SerializedName("gu")
            GU("gu"),

            @SerializedName("gw")
            GW("gw"),

            @SerializedName("gy")
            GY("gy"),

            @SerializedName("hk")
            HK("hk"),

            @SerializedName("hm")
            HM("hm"),

            @SerializedName("hn")
            HN("hn"),

            @SerializedName("hr")
            HR("hr"),

            @SerializedName("ht")
            HT("ht"),

            @SerializedName("hu")
            HU("hu"),

            @SerializedName("id")
            ID("id"),

            @SerializedName("ie")
            IE("ie"),

            @SerializedName("il")
            IL("il"),

            @SerializedName("im")
            IM("im"),

            @SerializedName("in")
            IN("in"),

            @SerializedName("io")
            IO("io"),

            @SerializedName("iq")
            IQ("iq"),

            @SerializedName("ir")
            IR("ir"),

            @SerializedName("is")
            IS("is"),

            @SerializedName("it")
            IT("it"),

            @SerializedName("je")
            JE("je"),

            @SerializedName("jm")
            JM("jm"),

            @SerializedName("jo")
            JO("jo"),

            @SerializedName("jp")
            JP("jp"),

            @SerializedName("ke")
            KE("ke"),

            @SerializedName("kg")
            KG("kg"),

            @SerializedName("kh")
            KH("kh"),

            @SerializedName("ki")
            KI("ki"),

            @SerializedName("km")
            KM("km"),

            @SerializedName("kn")
            KN("kn"),

            @SerializedName("kp")
            KP("kp"),

            @SerializedName("kr")
            KR("kr"),

            @SerializedName("kw")
            KW("kw"),

            @SerializedName("ky")
            KY("ky"),

            @SerializedName("kz")
            KZ("kz"),

            @SerializedName("la")
            LA("la"),

            @SerializedName("lb")
            LB("lb"),

            @SerializedName("lc")
            LC("lc"),

            @SerializedName("li")
            LI("li"),

            @SerializedName("lk")
            LK("lk"),

            @SerializedName("lr")
            LR("lr"),

            @SerializedName("ls")
            LS("ls"),

            @SerializedName("lt")
            LT("lt"),

            @SerializedName("lu")
            LU("lu"),

            @SerializedName("lv")
            LV("lv"),

            @SerializedName("ly")
            LY("ly"),

            @SerializedName("ma")
            MA("ma"),

            @SerializedName("mc")
            MC("mc"),

            @SerializedName("md")
            MD("md"),

            @SerializedName("me")
            ME("me"),

            @SerializedName("mf")
            MF("mf"),

            @SerializedName("mg")
            MG("mg"),

            @SerializedName("mh")
            MH("mh"),

            @SerializedName("mk")
            MK("mk"),

            @SerializedName("ml")
            ML("ml"),

            @SerializedName("mm")
            MM("mm"),

            @SerializedName("mn")
            MN("mn"),

            @SerializedName("mo")
            MO("mo"),

            @SerializedName("mp")
            MP("mp"),

            @SerializedName("mq")
            MQ("mq"),

            @SerializedName("mr")
            MR("mr"),

            @SerializedName("ms")
            MS("ms"),

            @SerializedName("mt")
            MT("mt"),

            @SerializedName("mu")
            MU("mu"),

            @SerializedName("mv")
            MV("mv"),

            @SerializedName("mw")
            MW("mw"),

            @SerializedName("mx")
            MX("mx"),

            @SerializedName("my")
            MY("my"),

            @SerializedName("mz")
            MZ("mz"),

            @SerializedName("na")
            NA("na"),

            @SerializedName("nc")
            NC("nc"),

            @SerializedName("ne")
            NE("ne"),

            @SerializedName("nf")
            NF("nf"),

            @SerializedName("ng")
            NG("ng"),

            @SerializedName("ni")
            NI("ni"),

            @SerializedName("nl")
            NL("nl"),

            @SerializedName("no")
            NO("no"),

            @SerializedName("np")
            NP("np"),

            @SerializedName("nr")
            NR("nr"),

            @SerializedName("nu")
            NU("nu"),

            @SerializedName("nz")
            NZ("nz"),

            @SerializedName("om")
            OM("om"),

            @SerializedName("pa")
            PA("pa"),

            @SerializedName("pe")
            PE("pe"),

            @SerializedName("pf")
            PF("pf"),

            @SerializedName("pg")
            PG("pg"),

            @SerializedName("ph")
            PH("ph"),

            @SerializedName("pk")
            PK("pk"),

            @SerializedName("pl")
            PL("pl"),

            @SerializedName("pm")
            PM("pm"),

            @SerializedName("pn")
            PN("pn"),

            @SerializedName("pr")
            PR("pr"),

            @SerializedName("ps")
            PS("ps"),

            @SerializedName("pt")
            PT("pt"),

            @SerializedName("pw")
            PW("pw"),

            @SerializedName("py")
            PY("py"),

            @SerializedName("qa")
            QA("qa"),

            @SerializedName("qz")
            QZ("qz"),

            @SerializedName("re")
            RE("re"),

            @SerializedName("ro")
            RO("ro"),

            @SerializedName("rs")
            RS("rs"),

            @SerializedName("ru")
            RU("ru"),

            @SerializedName("rw")
            RW("rw"),

            @SerializedName("sa")
            SA("sa"),

            @SerializedName("sb")
            SB("sb"),

            @SerializedName("sc")
            SC("sc"),

            @SerializedName("sd")
            SD("sd"),

            @SerializedName("se")
            SE("se"),

            @SerializedName("sg")
            SG("sg"),

            @SerializedName("sh")
            SH("sh"),

            @SerializedName("si")
            SI("si"),

            @SerializedName("sj")
            SJ("sj"),

            @SerializedName("sk")
            SK("sk"),

            @SerializedName("sl")
            SL("sl"),

            @SerializedName("sm")
            SM("sm"),

            @SerializedName("sn")
            SN("sn"),

            @SerializedName("so")
            SO("so"),

            @SerializedName("sr")
            SR("sr"),

            @SerializedName("ss")
            SS("ss"),

            @SerializedName("st")
            ST("st"),

            @SerializedName("sv")
            SV("sv"),

            @SerializedName("sx")
            SX("sx"),

            @SerializedName("sy")
            SY("sy"),

            @SerializedName("sz")
            SZ("sz"),

            @SerializedName("tc")
            TC("tc"),

            @SerializedName("td")
            TD("td"),

            @SerializedName("tf")
            TF("tf"),

            @SerializedName("tg")
            TG("tg"),

            @SerializedName("th")
            TH("th"),

            @SerializedName("tj")
            TJ("tj"),

            @SerializedName("tk")
            TK("tk"),

            @SerializedName("tl")
            TL("tl"),

            @SerializedName("tm")
            TM("tm"),

            @SerializedName("tn")
            TN("tn"),

            @SerializedName("to")
            TO("to"),

            @SerializedName("tr")
            TR("tr"),

            @SerializedName("tt")
            TT("tt"),

            @SerializedName("tv")
            TV("tv"),

            @SerializedName("tw")
            TW("tw"),

            @SerializedName("tz")
            TZ("tz"),

            @SerializedName("ua")
            UA("ua"),

            @SerializedName("ug")
            UG("ug"),

            @SerializedName("um")
            UM("um"),

            @SerializedName("us")
            US("us"),

            @SerializedName("uy")
            UY("uy"),

            @SerializedName("uz")
            UZ("uz"),

            @SerializedName("va")
            VA("va"),

            @SerializedName("vc")
            VC("vc"),

            @SerializedName("ve")
            VE("ve"),

            @SerializedName("vg")
            VG("vg"),

            @SerializedName("vi")
            VI("vi"),

            @SerializedName("vn")
            VN("vn"),

            @SerializedName("vu")
            VU("vu"),

            @SerializedName("wf")
            WF("wf"),

            @SerializedName("ws")
            WS("ws"),

            @SerializedName("ye")
            YE("ye"),

            @SerializedName("yt")
            YT("yt"),

            @SerializedName("za")
            ZA("za"),

            @SerializedName("zm")
            ZM("zm"),

            @SerializedName("zw")
            ZW("zw");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ScriptNames {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Persons name in kana script. */
        @SerializedName("kana")
        Object kana;

        /** Persons name in kanji script. */
        @SerializedName("kanji")
        Object kanji;

        private ScriptNames(Map<String, Object> extraParams, Object kana, Object kanji) {
          this.extraParams = extraParams;
          this.kana = kana;
          this.kanji = kanji;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object kana;

          private Object kanji;

          /** Finalize and obtain parameter instance from this builder. */
          public AccountUpdateParams.Identity.Individual.ScriptNames build() {
            return new AccountUpdateParams.Identity.Individual.ScriptNames(
                this.extraParams, this.kana, this.kanji);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AccountUpdateParams.Identity.Individual.ScriptNames#extraParams} for
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
           * map. See {@link AccountUpdateParams.Identity.Individual.ScriptNames#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Persons name in kana script. */
          public Builder setKana(AccountUpdateParams.Identity.Individual.ScriptNames.Kana kana) {
            this.kana = kana;
            return this;
          }

          /** Persons name in kana script. */
          public Builder setKana(EmptyParam kana) {
            this.kana = kana;
            return this;
          }

          /** Persons name in kanji script. */
          public Builder setKanji(AccountUpdateParams.Identity.Individual.ScriptNames.Kanji kanji) {
            this.kanji = kanji;
            return this;
          }

          /** Persons name in kanji script. */
          public Builder setKanji(EmptyParam kanji) {
            this.kanji = kanji;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kana {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The person's first or given name. */
          @SerializedName("given_name")
          Object givenName;

          /** The person's last or family name. */
          @SerializedName("surname")
          Object surname;

          private Kana(Map<String, Object> extraParams, Object givenName, Object surname) {
            this.extraParams = extraParams;
            this.givenName = givenName;
            this.surname = surname;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object givenName;

            private Object surname;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.ScriptNames.Kana build() {
              return new AccountUpdateParams.Identity.Individual.ScriptNames.Kana(
                  this.extraParams, this.givenName, this.surname);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptNames.Kana#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptNames.Kana#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The person's first or given name. */
            public Builder setGivenName(String givenName) {
              this.givenName = givenName;
              return this;
            }

            /** The person's first or given name. */
            public Builder setGivenName(EmptyParam givenName) {
              this.givenName = givenName;
              return this;
            }

            /** The person's last or family name. */
            public Builder setSurname(String surname) {
              this.surname = surname;
              return this;
            }

            /** The person's last or family name. */
            public Builder setSurname(EmptyParam surname) {
              this.surname = surname;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Kanji {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The person's first or given name. */
          @SerializedName("given_name")
          Object givenName;

          /** The person's last or family name. */
          @SerializedName("surname")
          Object surname;

          private Kanji(Map<String, Object> extraParams, Object givenName, Object surname) {
            this.extraParams = extraParams;
            this.givenName = givenName;
            this.surname = surname;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object givenName;

            private Object surname;

            /** Finalize and obtain parameter instance from this builder. */
            public AccountUpdateParams.Identity.Individual.ScriptNames.Kanji build() {
              return new AccountUpdateParams.Identity.Individual.ScriptNames.Kanji(
                  this.extraParams, this.givenName, this.surname);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptNames.Kanji#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * AccountUpdateParams.Identity.Individual.ScriptNames.Kanji#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The person's first or given name. */
            public Builder setGivenName(String givenName) {
              this.givenName = givenName;
              return this;
            }

            /** The person's first or given name. */
            public Builder setGivenName(EmptyParam givenName) {
              this.givenName = givenName;
              return this;
            }

            /** The person's last or family name. */
            public Builder setSurname(String surname) {
              this.surname = surname;
              return this;
            }

            /** The person's last or family name. */
            public Builder setSurname(EmptyParam surname) {
              this.surname = surname;
              return this;
            }
          }
        }
      }

      public enum LegalGender implements ApiRequestParams.EnumParam {
        @SerializedName("female")
        FEMALE("female"),

        @SerializedName("male")
        MALE("male");

        @Getter(onMethod_ = {@Override})
        private final String value;

        LegalGender(String value) {
          this.value = value;
        }
      }

      public enum Nationality implements ApiRequestParams.EnumParam {
        @SerializedName("ad")
        AD("ad"),

        @SerializedName("ae")
        AE("ae"),

        @SerializedName("af")
        AF("af"),

        @SerializedName("ag")
        AG("ag"),

        @SerializedName("ai")
        AI("ai"),

        @SerializedName("al")
        AL("al"),

        @SerializedName("am")
        AM("am"),

        @SerializedName("ao")
        AO("ao"),

        @SerializedName("aq")
        AQ("aq"),

        @SerializedName("ar")
        AR("ar"),

        @SerializedName("as")
        AS("as"),

        @SerializedName("at")
        AT("at"),

        @SerializedName("au")
        AU("au"),

        @SerializedName("aw")
        AW("aw"),

        @SerializedName("ax")
        AX("ax"),

        @SerializedName("az")
        AZ("az"),

        @SerializedName("ba")
        BA("ba"),

        @SerializedName("bb")
        BB("bb"),

        @SerializedName("bd")
        BD("bd"),

        @SerializedName("be")
        BE("be"),

        @SerializedName("bf")
        BF("bf"),

        @SerializedName("bg")
        BG("bg"),

        @SerializedName("bh")
        BH("bh"),

        @SerializedName("bi")
        BI("bi"),

        @SerializedName("bj")
        BJ("bj"),

        @SerializedName("bl")
        BL("bl"),

        @SerializedName("bm")
        BM("bm"),

        @SerializedName("bn")
        BN("bn"),

        @SerializedName("bo")
        BO("bo"),

        @SerializedName("bq")
        BQ("bq"),

        @SerializedName("br")
        BR("br"),

        @SerializedName("bs")
        BS("bs"),

        @SerializedName("bt")
        BT("bt"),

        @SerializedName("bv")
        BV("bv"),

        @SerializedName("bw")
        BW("bw"),

        @SerializedName("by")
        BY("by"),

        @SerializedName("bz")
        BZ("bz"),

        @SerializedName("ca")
        CA("ca"),

        @SerializedName("cc")
        CC("cc"),

        @SerializedName("cd")
        CD("cd"),

        @SerializedName("cf")
        CF("cf"),

        @SerializedName("cg")
        CG("cg"),

        @SerializedName("ch")
        CH("ch"),

        @SerializedName("ci")
        CI("ci"),

        @SerializedName("ck")
        CK("ck"),

        @SerializedName("cl")
        CL("cl"),

        @SerializedName("cm")
        CM("cm"),

        @SerializedName("cn")
        CN("cn"),

        @SerializedName("co")
        CO("co"),

        @SerializedName("cr")
        CR("cr"),

        @SerializedName("cu")
        CU("cu"),

        @SerializedName("cv")
        CV("cv"),

        @SerializedName("cw")
        CW("cw"),

        @SerializedName("cx")
        CX("cx"),

        @SerializedName("cy")
        CY("cy"),

        @SerializedName("cz")
        CZ("cz"),

        @SerializedName("de")
        DE("de"),

        @SerializedName("dj")
        DJ("dj"),

        @SerializedName("dk")
        DK("dk"),

        @SerializedName("dm")
        DM("dm"),

        @SerializedName("do")
        DO("do"),

        @SerializedName("dz")
        DZ("dz"),

        @SerializedName("ec")
        EC("ec"),

        @SerializedName("ee")
        EE("ee"),

        @SerializedName("eg")
        EG("eg"),

        @SerializedName("eh")
        EH("eh"),

        @SerializedName("er")
        ER("er"),

        @SerializedName("es")
        ES("es"),

        @SerializedName("et")
        ET("et"),

        @SerializedName("fi")
        FI("fi"),

        @SerializedName("fj")
        FJ("fj"),

        @SerializedName("fk")
        FK("fk"),

        @SerializedName("fm")
        FM("fm"),

        @SerializedName("fo")
        FO("fo"),

        @SerializedName("fr")
        FR("fr"),

        @SerializedName("ga")
        GA("ga"),

        @SerializedName("gb")
        GB("gb"),

        @SerializedName("gd")
        GD("gd"),

        @SerializedName("ge")
        GE("ge"),

        @SerializedName("gf")
        GF("gf"),

        @SerializedName("gg")
        GG("gg"),

        @SerializedName("gh")
        GH("gh"),

        @SerializedName("gi")
        GI("gi"),

        @SerializedName("gl")
        GL("gl"),

        @SerializedName("gm")
        GM("gm"),

        @SerializedName("gn")
        GN("gn"),

        @SerializedName("gp")
        GP("gp"),

        @SerializedName("gq")
        GQ("gq"),

        @SerializedName("gr")
        GR("gr"),

        @SerializedName("gs")
        GS("gs"),

        @SerializedName("gt")
        GT("gt"),

        @SerializedName("gu")
        GU("gu"),

        @SerializedName("gw")
        GW("gw"),

        @SerializedName("gy")
        GY("gy"),

        @SerializedName("hk")
        HK("hk"),

        @SerializedName("hm")
        HM("hm"),

        @SerializedName("hn")
        HN("hn"),

        @SerializedName("hr")
        HR("hr"),

        @SerializedName("ht")
        HT("ht"),

        @SerializedName("hu")
        HU("hu"),

        @SerializedName("id")
        ID("id"),

        @SerializedName("ie")
        IE("ie"),

        @SerializedName("il")
        IL("il"),

        @SerializedName("im")
        IM("im"),

        @SerializedName("in")
        IN("in"),

        @SerializedName("io")
        IO("io"),

        @SerializedName("iq")
        IQ("iq"),

        @SerializedName("ir")
        IR("ir"),

        @SerializedName("is")
        IS("is"),

        @SerializedName("it")
        IT("it"),

        @SerializedName("je")
        JE("je"),

        @SerializedName("jm")
        JM("jm"),

        @SerializedName("jo")
        JO("jo"),

        @SerializedName("jp")
        JP("jp"),

        @SerializedName("ke")
        KE("ke"),

        @SerializedName("kg")
        KG("kg"),

        @SerializedName("kh")
        KH("kh"),

        @SerializedName("ki")
        KI("ki"),

        @SerializedName("km")
        KM("km"),

        @SerializedName("kn")
        KN("kn"),

        @SerializedName("kp")
        KP("kp"),

        @SerializedName("kr")
        KR("kr"),

        @SerializedName("kw")
        KW("kw"),

        @SerializedName("ky")
        KY("ky"),

        @SerializedName("kz")
        KZ("kz"),

        @SerializedName("la")
        LA("la"),

        @SerializedName("lb")
        LB("lb"),

        @SerializedName("lc")
        LC("lc"),

        @SerializedName("li")
        LI("li"),

        @SerializedName("lk")
        LK("lk"),

        @SerializedName("lr")
        LR("lr"),

        @SerializedName("ls")
        LS("ls"),

        @SerializedName("lt")
        LT("lt"),

        @SerializedName("lu")
        LU("lu"),

        @SerializedName("lv")
        LV("lv"),

        @SerializedName("ly")
        LY("ly"),

        @SerializedName("ma")
        MA("ma"),

        @SerializedName("mc")
        MC("mc"),

        @SerializedName("md")
        MD("md"),

        @SerializedName("me")
        ME("me"),

        @SerializedName("mf")
        MF("mf"),

        @SerializedName("mg")
        MG("mg"),

        @SerializedName("mh")
        MH("mh"),

        @SerializedName("mk")
        MK("mk"),

        @SerializedName("ml")
        ML("ml"),

        @SerializedName("mm")
        MM("mm"),

        @SerializedName("mn")
        MN("mn"),

        @SerializedName("mo")
        MO("mo"),

        @SerializedName("mp")
        MP("mp"),

        @SerializedName("mq")
        MQ("mq"),

        @SerializedName("mr")
        MR("mr"),

        @SerializedName("ms")
        MS("ms"),

        @SerializedName("mt")
        MT("mt"),

        @SerializedName("mu")
        MU("mu"),

        @SerializedName("mv")
        MV("mv"),

        @SerializedName("mw")
        MW("mw"),

        @SerializedName("mx")
        MX("mx"),

        @SerializedName("my")
        MY("my"),

        @SerializedName("mz")
        MZ("mz"),

        @SerializedName("na")
        NA("na"),

        @SerializedName("nc")
        NC("nc"),

        @SerializedName("ne")
        NE("ne"),

        @SerializedName("nf")
        NF("nf"),

        @SerializedName("ng")
        NG("ng"),

        @SerializedName("ni")
        NI("ni"),

        @SerializedName("nl")
        NL("nl"),

        @SerializedName("no")
        NO("no"),

        @SerializedName("np")
        NP("np"),

        @SerializedName("nr")
        NR("nr"),

        @SerializedName("nu")
        NU("nu"),

        @SerializedName("nz")
        NZ("nz"),

        @SerializedName("om")
        OM("om"),

        @SerializedName("pa")
        PA("pa"),

        @SerializedName("pe")
        PE("pe"),

        @SerializedName("pf")
        PF("pf"),

        @SerializedName("pg")
        PG("pg"),

        @SerializedName("ph")
        PH("ph"),

        @SerializedName("pk")
        PK("pk"),

        @SerializedName("pl")
        PL("pl"),

        @SerializedName("pm")
        PM("pm"),

        @SerializedName("pn")
        PN("pn"),

        @SerializedName("pr")
        PR("pr"),

        @SerializedName("ps")
        PS("ps"),

        @SerializedName("pt")
        PT("pt"),

        @SerializedName("pw")
        PW("pw"),

        @SerializedName("py")
        PY("py"),

        @SerializedName("qa")
        QA("qa"),

        @SerializedName("qz")
        QZ("qz"),

        @SerializedName("re")
        RE("re"),

        @SerializedName("ro")
        RO("ro"),

        @SerializedName("rs")
        RS("rs"),

        @SerializedName("ru")
        RU("ru"),

        @SerializedName("rw")
        RW("rw"),

        @SerializedName("sa")
        SA("sa"),

        @SerializedName("sb")
        SB("sb"),

        @SerializedName("sc")
        SC("sc"),

        @SerializedName("sd")
        SD("sd"),

        @SerializedName("se")
        SE("se"),

        @SerializedName("sg")
        SG("sg"),

        @SerializedName("sh")
        SH("sh"),

        @SerializedName("si")
        SI("si"),

        @SerializedName("sj")
        SJ("sj"),

        @SerializedName("sk")
        SK("sk"),

        @SerializedName("sl")
        SL("sl"),

        @SerializedName("sm")
        SM("sm"),

        @SerializedName("sn")
        SN("sn"),

        @SerializedName("so")
        SO("so"),

        @SerializedName("sr")
        SR("sr"),

        @SerializedName("ss")
        SS("ss"),

        @SerializedName("st")
        ST("st"),

        @SerializedName("sv")
        SV("sv"),

        @SerializedName("sx")
        SX("sx"),

        @SerializedName("sy")
        SY("sy"),

        @SerializedName("sz")
        SZ("sz"),

        @SerializedName("tc")
        TC("tc"),

        @SerializedName("td")
        TD("td"),

        @SerializedName("tf")
        TF("tf"),

        @SerializedName("tg")
        TG("tg"),

        @SerializedName("th")
        TH("th"),

        @SerializedName("tj")
        TJ("tj"),

        @SerializedName("tk")
        TK("tk"),

        @SerializedName("tl")
        TL("tl"),

        @SerializedName("tm")
        TM("tm"),

        @SerializedName("tn")
        TN("tn"),

        @SerializedName("to")
        TO("to"),

        @SerializedName("tr")
        TR("tr"),

        @SerializedName("tt")
        TT("tt"),

        @SerializedName("tv")
        TV("tv"),

        @SerializedName("tw")
        TW("tw"),

        @SerializedName("tz")
        TZ("tz"),

        @SerializedName("ua")
        UA("ua"),

        @SerializedName("ug")
        UG("ug"),

        @SerializedName("um")
        UM("um"),

        @SerializedName("us")
        US("us"),

        @SerializedName("uy")
        UY("uy"),

        @SerializedName("uz")
        UZ("uz"),

        @SerializedName("va")
        VA("va"),

        @SerializedName("vc")
        VC("vc"),

        @SerializedName("ve")
        VE("ve"),

        @SerializedName("vg")
        VG("vg"),

        @SerializedName("vi")
        VI("vi"),

        @SerializedName("vn")
        VN("vn"),

        @SerializedName("vu")
        VU("vu"),

        @SerializedName("wf")
        WF("wf"),

        @SerializedName("ws")
        WS("ws"),

        @SerializedName("ye")
        YE("ye"),

        @SerializedName("yt")
        YT("yt"),

        @SerializedName("za")
        ZA("za"),

        @SerializedName("zm")
        ZM("zm"),

        @SerializedName("zw")
        ZW("zw");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Nationality(String value) {
          this.value = value;
        }
      }

      public enum PoliticalExposure implements ApiRequestParams.EnumParam {
        @SerializedName("existing")
        EXISTING("existing"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PoliticalExposure(String value) {
          this.value = value;
        }
      }
    }

    public enum Country implements ApiRequestParams.EnumParam {
      @SerializedName("ad")
      AD("ad"),

      @SerializedName("ae")
      AE("ae"),

      @SerializedName("af")
      AF("af"),

      @SerializedName("ag")
      AG("ag"),

      @SerializedName("ai")
      AI("ai"),

      @SerializedName("al")
      AL("al"),

      @SerializedName("am")
      AM("am"),

      @SerializedName("ao")
      AO("ao"),

      @SerializedName("aq")
      AQ("aq"),

      @SerializedName("ar")
      AR("ar"),

      @SerializedName("as")
      AS("as"),

      @SerializedName("at")
      AT("at"),

      @SerializedName("au")
      AU("au"),

      @SerializedName("aw")
      AW("aw"),

      @SerializedName("ax")
      AX("ax"),

      @SerializedName("az")
      AZ("az"),

      @SerializedName("ba")
      BA("ba"),

      @SerializedName("bb")
      BB("bb"),

      @SerializedName("bd")
      BD("bd"),

      @SerializedName("be")
      BE("be"),

      @SerializedName("bf")
      BF("bf"),

      @SerializedName("bg")
      BG("bg"),

      @SerializedName("bh")
      BH("bh"),

      @SerializedName("bi")
      BI("bi"),

      @SerializedName("bj")
      BJ("bj"),

      @SerializedName("bl")
      BL("bl"),

      @SerializedName("bm")
      BM("bm"),

      @SerializedName("bn")
      BN("bn"),

      @SerializedName("bo")
      BO("bo"),

      @SerializedName("bq")
      BQ("bq"),

      @SerializedName("br")
      BR("br"),

      @SerializedName("bs")
      BS("bs"),

      @SerializedName("bt")
      BT("bt"),

      @SerializedName("bv")
      BV("bv"),

      @SerializedName("bw")
      BW("bw"),

      @SerializedName("by")
      BY("by"),

      @SerializedName("bz")
      BZ("bz"),

      @SerializedName("ca")
      CA("ca"),

      @SerializedName("cc")
      CC("cc"),

      @SerializedName("cd")
      CD("cd"),

      @SerializedName("cf")
      CF("cf"),

      @SerializedName("cg")
      CG("cg"),

      @SerializedName("ch")
      CH("ch"),

      @SerializedName("ci")
      CI("ci"),

      @SerializedName("ck")
      CK("ck"),

      @SerializedName("cl")
      CL("cl"),

      @SerializedName("cm")
      CM("cm"),

      @SerializedName("cn")
      CN("cn"),

      @SerializedName("co")
      CO("co"),

      @SerializedName("cr")
      CR("cr"),

      @SerializedName("cu")
      CU("cu"),

      @SerializedName("cv")
      CV("cv"),

      @SerializedName("cw")
      CW("cw"),

      @SerializedName("cx")
      CX("cx"),

      @SerializedName("cy")
      CY("cy"),

      @SerializedName("cz")
      CZ("cz"),

      @SerializedName("de")
      DE("de"),

      @SerializedName("dj")
      DJ("dj"),

      @SerializedName("dk")
      DK("dk"),

      @SerializedName("dm")
      DM("dm"),

      @SerializedName("do")
      DO("do"),

      @SerializedName("dz")
      DZ("dz"),

      @SerializedName("ec")
      EC("ec"),

      @SerializedName("ee")
      EE("ee"),

      @SerializedName("eg")
      EG("eg"),

      @SerializedName("eh")
      EH("eh"),

      @SerializedName("er")
      ER("er"),

      @SerializedName("es")
      ES("es"),

      @SerializedName("et")
      ET("et"),

      @SerializedName("fi")
      FI("fi"),

      @SerializedName("fj")
      FJ("fj"),

      @SerializedName("fk")
      FK("fk"),

      @SerializedName("fm")
      FM("fm"),

      @SerializedName("fo")
      FO("fo"),

      @SerializedName("fr")
      FR("fr"),

      @SerializedName("ga")
      GA("ga"),

      @SerializedName("gb")
      GB("gb"),

      @SerializedName("gd")
      GD("gd"),

      @SerializedName("ge")
      GE("ge"),

      @SerializedName("gf")
      GF("gf"),

      @SerializedName("gg")
      GG("gg"),

      @SerializedName("gh")
      GH("gh"),

      @SerializedName("gi")
      GI("gi"),

      @SerializedName("gl")
      GL("gl"),

      @SerializedName("gm")
      GM("gm"),

      @SerializedName("gn")
      GN("gn"),

      @SerializedName("gp")
      GP("gp"),

      @SerializedName("gq")
      GQ("gq"),

      @SerializedName("gr")
      GR("gr"),

      @SerializedName("gs")
      GS("gs"),

      @SerializedName("gt")
      GT("gt"),

      @SerializedName("gu")
      GU("gu"),

      @SerializedName("gw")
      GW("gw"),

      @SerializedName("gy")
      GY("gy"),

      @SerializedName("hk")
      HK("hk"),

      @SerializedName("hm")
      HM("hm"),

      @SerializedName("hn")
      HN("hn"),

      @SerializedName("hr")
      HR("hr"),

      @SerializedName("ht")
      HT("ht"),

      @SerializedName("hu")
      HU("hu"),

      @SerializedName("id")
      ID("id"),

      @SerializedName("ie")
      IE("ie"),

      @SerializedName("il")
      IL("il"),

      @SerializedName("im")
      IM("im"),

      @SerializedName("in")
      IN("in"),

      @SerializedName("io")
      IO("io"),

      @SerializedName("iq")
      IQ("iq"),

      @SerializedName("ir")
      IR("ir"),

      @SerializedName("is")
      IS("is"),

      @SerializedName("it")
      IT("it"),

      @SerializedName("je")
      JE("je"),

      @SerializedName("jm")
      JM("jm"),

      @SerializedName("jo")
      JO("jo"),

      @SerializedName("jp")
      JP("jp"),

      @SerializedName("ke")
      KE("ke"),

      @SerializedName("kg")
      KG("kg"),

      @SerializedName("kh")
      KH("kh"),

      @SerializedName("ki")
      KI("ki"),

      @SerializedName("km")
      KM("km"),

      @SerializedName("kn")
      KN("kn"),

      @SerializedName("kp")
      KP("kp"),

      @SerializedName("kr")
      KR("kr"),

      @SerializedName("kw")
      KW("kw"),

      @SerializedName("ky")
      KY("ky"),

      @SerializedName("kz")
      KZ("kz"),

      @SerializedName("la")
      LA("la"),

      @SerializedName("lb")
      LB("lb"),

      @SerializedName("lc")
      LC("lc"),

      @SerializedName("li")
      LI("li"),

      @SerializedName("lk")
      LK("lk"),

      @SerializedName("lr")
      LR("lr"),

      @SerializedName("ls")
      LS("ls"),

      @SerializedName("lt")
      LT("lt"),

      @SerializedName("lu")
      LU("lu"),

      @SerializedName("lv")
      LV("lv"),

      @SerializedName("ly")
      LY("ly"),

      @SerializedName("ma")
      MA("ma"),

      @SerializedName("mc")
      MC("mc"),

      @SerializedName("md")
      MD("md"),

      @SerializedName("me")
      ME("me"),

      @SerializedName("mf")
      MF("mf"),

      @SerializedName("mg")
      MG("mg"),

      @SerializedName("mh")
      MH("mh"),

      @SerializedName("mk")
      MK("mk"),

      @SerializedName("ml")
      ML("ml"),

      @SerializedName("mm")
      MM("mm"),

      @SerializedName("mn")
      MN("mn"),

      @SerializedName("mo")
      MO("mo"),

      @SerializedName("mp")
      MP("mp"),

      @SerializedName("mq")
      MQ("mq"),

      @SerializedName("mr")
      MR("mr"),

      @SerializedName("ms")
      MS("ms"),

      @SerializedName("mt")
      MT("mt"),

      @SerializedName("mu")
      MU("mu"),

      @SerializedName("mv")
      MV("mv"),

      @SerializedName("mw")
      MW("mw"),

      @SerializedName("mx")
      MX("mx"),

      @SerializedName("my")
      MY("my"),

      @SerializedName("mz")
      MZ("mz"),

      @SerializedName("na")
      NA("na"),

      @SerializedName("nc")
      NC("nc"),

      @SerializedName("ne")
      NE("ne"),

      @SerializedName("nf")
      NF("nf"),

      @SerializedName("ng")
      NG("ng"),

      @SerializedName("ni")
      NI("ni"),

      @SerializedName("nl")
      NL("nl"),

      @SerializedName("no")
      NO("no"),

      @SerializedName("np")
      NP("np"),

      @SerializedName("nr")
      NR("nr"),

      @SerializedName("nu")
      NU("nu"),

      @SerializedName("nz")
      NZ("nz"),

      @SerializedName("om")
      OM("om"),

      @SerializedName("pa")
      PA("pa"),

      @SerializedName("pe")
      PE("pe"),

      @SerializedName("pf")
      PF("pf"),

      @SerializedName("pg")
      PG("pg"),

      @SerializedName("ph")
      PH("ph"),

      @SerializedName("pk")
      PK("pk"),

      @SerializedName("pl")
      PL("pl"),

      @SerializedName("pm")
      PM("pm"),

      @SerializedName("pn")
      PN("pn"),

      @SerializedName("pr")
      PR("pr"),

      @SerializedName("ps")
      PS("ps"),

      @SerializedName("pt")
      PT("pt"),

      @SerializedName("pw")
      PW("pw"),

      @SerializedName("py")
      PY("py"),

      @SerializedName("qa")
      QA("qa"),

      @SerializedName("qz")
      QZ("qz"),

      @SerializedName("re")
      RE("re"),

      @SerializedName("ro")
      RO("ro"),

      @SerializedName("rs")
      RS("rs"),

      @SerializedName("ru")
      RU("ru"),

      @SerializedName("rw")
      RW("rw"),

      @SerializedName("sa")
      SA("sa"),

      @SerializedName("sb")
      SB("sb"),

      @SerializedName("sc")
      SC("sc"),

      @SerializedName("sd")
      SD("sd"),

      @SerializedName("se")
      SE("se"),

      @SerializedName("sg")
      SG("sg"),

      @SerializedName("sh")
      SH("sh"),

      @SerializedName("si")
      SI("si"),

      @SerializedName("sj")
      SJ("sj"),

      @SerializedName("sk")
      SK("sk"),

      @SerializedName("sl")
      SL("sl"),

      @SerializedName("sm")
      SM("sm"),

      @SerializedName("sn")
      SN("sn"),

      @SerializedName("so")
      SO("so"),

      @SerializedName("sr")
      SR("sr"),

      @SerializedName("ss")
      SS("ss"),

      @SerializedName("st")
      ST("st"),

      @SerializedName("sv")
      SV("sv"),

      @SerializedName("sx")
      SX("sx"),

      @SerializedName("sy")
      SY("sy"),

      @SerializedName("sz")
      SZ("sz"),

      @SerializedName("tc")
      TC("tc"),

      @SerializedName("td")
      TD("td"),

      @SerializedName("tf")
      TF("tf"),

      @SerializedName("tg")
      TG("tg"),

      @SerializedName("th")
      TH("th"),

      @SerializedName("tj")
      TJ("tj"),

      @SerializedName("tk")
      TK("tk"),

      @SerializedName("tl")
      TL("tl"),

      @SerializedName("tm")
      TM("tm"),

      @SerializedName("tn")
      TN("tn"),

      @SerializedName("to")
      TO("to"),

      @SerializedName("tr")
      TR("tr"),

      @SerializedName("tt")
      TT("tt"),

      @SerializedName("tv")
      TV("tv"),

      @SerializedName("tw")
      TW("tw"),

      @SerializedName("tz")
      TZ("tz"),

      @SerializedName("ua")
      UA("ua"),

      @SerializedName("ug")
      UG("ug"),

      @SerializedName("um")
      UM("um"),

      @SerializedName("us")
      US("us"),

      @SerializedName("uy")
      UY("uy"),

      @SerializedName("uz")
      UZ("uz"),

      @SerializedName("va")
      VA("va"),

      @SerializedName("vc")
      VC("vc"),

      @SerializedName("ve")
      VE("ve"),

      @SerializedName("vg")
      VG("vg"),

      @SerializedName("vi")
      VI("vi"),

      @SerializedName("vn")
      VN("vn"),

      @SerializedName("vu")
      VU("vu"),

      @SerializedName("wf")
      WF("wf"),

      @SerializedName("ws")
      WS("ws"),

      @SerializedName("ye")
      YE("ye"),

      @SerializedName("yt")
      YT("yt"),

      @SerializedName("za")
      ZA("za"),

      @SerializedName("zm")
      ZM("zm"),

      @SerializedName("zw")
      ZW("zw");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Country(String value) {
        this.value = value;
      }
    }

    public enum EntityType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("government_entity")
      GOVERNMENT_ENTITY("government_entity"),

      @SerializedName("individual")
      INDIVIDUAL("individual"),

      @SerializedName("non_profit")
      NON_PROFIT("non_profit");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EntityType(String value) {
        this.value = value;
      }
    }
  }

  public enum Dashboard implements ApiRequestParams.EnumParam {
    @SerializedName("express")
    EXPRESS("express"),

    @SerializedName("full")
    FULL("full"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Dashboard(String value) {
      this.value = value;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("configuration.customer")
    CONFIGURATION__CUSTOMER("configuration.customer"),

    @SerializedName("configuration.merchant")
    CONFIGURATION__MERCHANT("configuration.merchant"),

    @SerializedName("configuration.recipient")
    CONFIGURATION__RECIPIENT("configuration.recipient"),

    @SerializedName("defaults")
    DEFAULTS("defaults"),

    @SerializedName("identity")
    IDENTITY("identity"),

    @SerializedName("requirements")
    REQUIREMENTS("requirements");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class GroupCreateParams extends ApiRequestParams {
  /** Billing setting overrides for the group. If omitted, the applicable defaults are used. */
  @SerializedName("billing_settings")
  BillingSettings billingSettings;

  /** <strong>Required.</strong> The ID of the Customer object whose invoices are grouped. */
  @SerializedName("customer")
  String customer;

  /**
   * The ID of the PaymentMethod object used by default. If unset, the customer's default payment
   * method is used.
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

  /** The strategy used to group member invoices. */
  @SerializedName("grouping_behavior")
  GroupingBehavior groupingBehavior;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<GroupCreateParams.Include> include;

  /**
   * An internal key you can use to find a particular billing group. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of key-value pairs that you can attach to an object for storing additional structured
   * information.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private GroupCreateParams(
      BillingSettings billingSettings,
      String customer,
      String defaultPaymentMethod,
      Map<String, Object> extraParams,
      GroupingBehavior groupingBehavior,
      List<GroupCreateParams.Include> include,
      String lookupKey,
      Map<String, String> metadata) {
    this.billingSettings = billingSettings;
    this.customer = customer;
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.extraParams = extraParams;
    this.groupingBehavior = groupingBehavior;
    this.include = include;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingSettings billingSettings;

    private String customer;

    private String defaultPaymentMethod;

    private Map<String, Object> extraParams;

    private GroupingBehavior groupingBehavior;

    private List<GroupCreateParams.Include> include;

    private String lookupKey;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public GroupCreateParams build() {
      return new GroupCreateParams(
          this.billingSettings,
          this.customer,
          this.defaultPaymentMethod,
          this.extraParams,
          this.groupingBehavior,
          this.include,
          this.lookupKey,
          this.metadata);
    }

    /** Billing setting overrides for the group. If omitted, the applicable defaults are used. */
    public Builder setBillingSettings(GroupCreateParams.BillingSettings billingSettings) {
      this.billingSettings = billingSettings;
      return this;
    }

    /** <strong>Required.</strong> The ID of the Customer object whose invoices are grouped. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The ID of the PaymentMethod object used by default. If unset, the customer's default payment
     * method is used.
     */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * GroupCreateParams#extraParams} for the field documentation.
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
     * See {@link GroupCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The strategy used to group member invoices. */
    public Builder setGroupingBehavior(GroupCreateParams.GroupingBehavior groupingBehavior) {
      this.groupingBehavior = groupingBehavior;
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * GroupCreateParams#include} for the field documentation.
     */
    public Builder addInclude(GroupCreateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * GroupCreateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<GroupCreateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * An internal key you can use to find a particular billing group. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * GroupCreateParams#metadata} for the field documentation.
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
     * See {@link GroupCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingSettings {
    /** How Stripe collects payment. */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /** Email delivery setting. */
    @SerializedName("email_delivery")
    EmailDelivery emailDelivery;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Settings for invoice presentation. */
    @SerializedName("invoice_presentation")
    InvoicePresentation invoicePresentation;

    /** The amount of time until the invoice is overdue for payment. */
    @SerializedName("invoice_time_until_due")
    InvoiceTimeUntilDue invoiceTimeUntilDue;

    /**
     * The ID of the payment method configuration, which controls which payment methods are
     * displayed to your customers.
     */
    @SerializedName("payment_method_configuration")
    String paymentMethodConfiguration;

    /** Payment Method specific configuration to be stored on the object. */
    @SerializedName("payment_method_options")
    PaymentMethodOptions paymentMethodOptions;

    /** Settings for calculating tax. */
    @SerializedName("tax")
    Tax tax;

    private BillingSettings(
        CollectionMethod collectionMethod,
        EmailDelivery emailDelivery,
        Map<String, Object> extraParams,
        InvoicePresentation invoicePresentation,
        InvoiceTimeUntilDue invoiceTimeUntilDue,
        String paymentMethodConfiguration,
        PaymentMethodOptions paymentMethodOptions,
        Tax tax) {
      this.collectionMethod = collectionMethod;
      this.emailDelivery = emailDelivery;
      this.extraParams = extraParams;
      this.invoicePresentation = invoicePresentation;
      this.invoiceTimeUntilDue = invoiceTimeUntilDue;
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      this.paymentMethodOptions = paymentMethodOptions;
      this.tax = tax;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CollectionMethod collectionMethod;

      private EmailDelivery emailDelivery;

      private Map<String, Object> extraParams;

      private InvoicePresentation invoicePresentation;

      private InvoiceTimeUntilDue invoiceTimeUntilDue;

      private String paymentMethodConfiguration;

      private PaymentMethodOptions paymentMethodOptions;

      private Tax tax;

      /** Finalize and obtain parameter instance from this builder. */
      public GroupCreateParams.BillingSettings build() {
        return new GroupCreateParams.BillingSettings(
            this.collectionMethod,
            this.emailDelivery,
            this.extraParams,
            this.invoicePresentation,
            this.invoiceTimeUntilDue,
            this.paymentMethodConfiguration,
            this.paymentMethodOptions,
            this.tax);
      }

      /** How Stripe collects payment. */
      public Builder setCollectionMethod(
          GroupCreateParams.BillingSettings.CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
        return this;
      }

      /** Email delivery setting. */
      public Builder setEmailDelivery(
          GroupCreateParams.BillingSettings.EmailDelivery emailDelivery) {
        this.emailDelivery = emailDelivery;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * GroupCreateParams.BillingSettings#extraParams} for the field documentation.
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
       * See {@link GroupCreateParams.BillingSettings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings for invoice presentation. */
      public Builder setInvoicePresentation(
          GroupCreateParams.BillingSettings.InvoicePresentation invoicePresentation) {
        this.invoicePresentation = invoicePresentation;
        return this;
      }

      /** The amount of time until the invoice is overdue for payment. */
      public Builder setInvoiceTimeUntilDue(
          GroupCreateParams.BillingSettings.InvoiceTimeUntilDue invoiceTimeUntilDue) {
        this.invoiceTimeUntilDue = invoiceTimeUntilDue;
        return this;
      }

      /**
       * The ID of the payment method configuration, which controls which payment methods are
       * displayed to your customers.
       */
      public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
        this.paymentMethodConfiguration = paymentMethodConfiguration;
        return this;
      }

      /** Payment Method specific configuration to be stored on the object. */
      public Builder setPaymentMethodOptions(
          GroupCreateParams.BillingSettings.PaymentMethodOptions paymentMethodOptions) {
        this.paymentMethodOptions = paymentMethodOptions;
        return this;
      }

      /** Settings for calculating tax. */
      public Builder setTax(GroupCreateParams.BillingSettings.Tax tax) {
        this.tax = tax;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EmailDelivery {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Controls emails for when the payment is due. Omit to use the applicable default. */
      @SerializedName("payment_due")
      PaymentDue paymentDue;

      private EmailDelivery(Map<String, Object> extraParams, PaymentDue paymentDue) {
        this.extraParams = extraParams;
        this.paymentDue = paymentDue;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PaymentDue paymentDue;

        /** Finalize and obtain parameter instance from this builder. */
        public GroupCreateParams.BillingSettings.EmailDelivery build() {
          return new GroupCreateParams.BillingSettings.EmailDelivery(
              this.extraParams, this.paymentDue);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link GroupCreateParams.BillingSettings.EmailDelivery#extraParams} for the
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
         * map. See {@link GroupCreateParams.BillingSettings.EmailDelivery#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Controls emails for when the payment is due. Omit to use the applicable default. */
        public Builder setPaymentDue(
            GroupCreateParams.BillingSettings.EmailDelivery.PaymentDue paymentDue) {
          this.paymentDue = paymentDue;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PaymentDue {
        /** If true an email for the invoice would be generated and sent out. */
        @SerializedName("enabled")
        Boolean enabled;

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
         * If true the payment link to hosted invoice page would be included in email and PDF of the
         * invoice.
         */
        @SerializedName("include_payment_link")
        Boolean includePaymentLink;

        private PaymentDue(
            Boolean enabled, Map<String, Object> extraParams, Boolean includePaymentLink) {
          this.enabled = enabled;
          this.extraParams = extraParams;
          this.includePaymentLink = includePaymentLink;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean enabled;

          private Map<String, Object> extraParams;

          private Boolean includePaymentLink;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.EmailDelivery.PaymentDue build() {
            return new GroupCreateParams.BillingSettings.EmailDelivery.PaymentDue(
                this.enabled, this.extraParams, this.includePaymentLink);
          }

          /** If true an email for the invoice would be generated and sent out. */
          public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link GroupCreateParams.BillingSettings.EmailDelivery.PaymentDue#extraParams}
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
           * map. See {@link GroupCreateParams.BillingSettings.EmailDelivery.PaymentDue#extraParams}
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
           * If true the payment link to hosted invoice page would be included in email and PDF of
           * the invoice.
           */
          public Builder setIncludePaymentLink(Boolean includePaymentLink) {
            this.includePaymentLink = includePaymentLink;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoicePresentation {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The ID of the invoice rendering template to be used when generating invoices. Omit to use
       * the applicable default.
       */
      @SerializedName("invoice_rendering_template")
      String invoiceRenderingTemplate;

      private InvoicePresentation(
          Map<String, Object> extraParams, String invoiceRenderingTemplate) {
        this.extraParams = extraParams;
        this.invoiceRenderingTemplate = invoiceRenderingTemplate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String invoiceRenderingTemplate;

        /** Finalize and obtain parameter instance from this builder. */
        public GroupCreateParams.BillingSettings.InvoicePresentation build() {
          return new GroupCreateParams.BillingSettings.InvoicePresentation(
              this.extraParams, this.invoiceRenderingTemplate);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link GroupCreateParams.BillingSettings.InvoicePresentation#extraParams} for
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
         * map. See {@link GroupCreateParams.BillingSettings.InvoicePresentation#extraParams} for
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
         * The ID of the invoice rendering template to be used when generating invoices. Omit to use
         * the applicable default.
         */
        public Builder setInvoiceRenderingTemplate(String invoiceRenderingTemplate) {
          this.invoiceRenderingTemplate = invoiceRenderingTemplate;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceTimeUntilDue {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The interval unit for the time until due. */
      @SerializedName("interval")
      Interval interval;

      /**
       * <strong>Required.</strong> The number of interval units. For example, if interval=day and
       * interval_count=30, the invoice is due in 30 days.
       */
      @SerializedName("interval_count")
      Long intervalCount;

      private InvoiceTimeUntilDue(
          Map<String, Object> extraParams, Interval interval, Long intervalCount) {
        this.extraParams = extraParams;
        this.interval = interval;
        this.intervalCount = intervalCount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Interval interval;

        private Long intervalCount;

        /** Finalize and obtain parameter instance from this builder. */
        public GroupCreateParams.BillingSettings.InvoiceTimeUntilDue build() {
          return new GroupCreateParams.BillingSettings.InvoiceTimeUntilDue(
              this.extraParams, this.interval, this.intervalCount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link GroupCreateParams.BillingSettings.InvoiceTimeUntilDue#extraParams} for
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
         * map. See {@link GroupCreateParams.BillingSettings.InvoiceTimeUntilDue#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The interval unit for the time until due. */
        public Builder setInterval(
            GroupCreateParams.BillingSettings.InvoiceTimeUntilDue.Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * <strong>Required.</strong> The number of interval units. For example, if interval=day and
         * interval_count=30, the invoice is due in 30 days.
         */
        public Builder setIntervalCount(Long intervalCount) {
          this.intervalCount = intervalCount;
          return this;
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week"),

        @SerializedName("year")
        YEAR("year");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodOptions {
      /**
       * This sub-hash contains details about the Canadian pre-authorized debit payment method
       * options.
       */
      @SerializedName("acss_debit")
      AcssDebit acssDebit;

      /** This sub-hash contains details about the Bancontact payment method. */
      @SerializedName("bancontact")
      Bancontact bancontact;

      /** This sub-hash contains details about the Card payment method options. */
      @SerializedName("card")
      Card card;

      /** This sub-hash contains details about the Bank transfer payment method options. */
      @SerializedName("customer_balance")
      CustomerBalance customerBalance;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** This sub-hash contains details about the Konbini payment method options. */
      @SerializedName("konbini")
      Konbini konbini;

      /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
      @SerializedName("sepa_debit")
      SepaDebit sepaDebit;

      /** This sub-hash contains details about the ACH direct debit payment method options. */
      @SerializedName("us_bank_account")
      UsBankAccount usBankAccount;

      private PaymentMethodOptions(
          AcssDebit acssDebit,
          Bancontact bancontact,
          Card card,
          CustomerBalance customerBalance,
          Map<String, Object> extraParams,
          Konbini konbini,
          SepaDebit sepaDebit,
          UsBankAccount usBankAccount) {
        this.acssDebit = acssDebit;
        this.bancontact = bancontact;
        this.card = card;
        this.customerBalance = customerBalance;
        this.extraParams = extraParams;
        this.konbini = konbini;
        this.sepaDebit = sepaDebit;
        this.usBankAccount = usBankAccount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AcssDebit acssDebit;

        private Bancontact bancontact;

        private Card card;

        private CustomerBalance customerBalance;

        private Map<String, Object> extraParams;

        private Konbini konbini;

        private SepaDebit sepaDebit;

        private UsBankAccount usBankAccount;

        /** Finalize and obtain parameter instance from this builder. */
        public GroupCreateParams.BillingSettings.PaymentMethodOptions build() {
          return new GroupCreateParams.BillingSettings.PaymentMethodOptions(
              this.acssDebit,
              this.bancontact,
              this.card,
              this.customerBalance,
              this.extraParams,
              this.konbini,
              this.sepaDebit,
              this.usBankAccount);
        }

        /**
         * This sub-hash contains details about the Canadian pre-authorized debit payment method
         * options.
         */
        public Builder setAcssDebit(
            GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit acssDebit) {
          this.acssDebit = acssDebit;
          return this;
        }

        /** This sub-hash contains details about the Bancontact payment method. */
        public Builder setBancontact(
            GroupCreateParams.BillingSettings.PaymentMethodOptions.Bancontact bancontact) {
          this.bancontact = bancontact;
          return this;
        }

        /** This sub-hash contains details about the Card payment method options. */
        public Builder setCard(GroupCreateParams.BillingSettings.PaymentMethodOptions.Card card) {
          this.card = card;
          return this;
        }

        /** This sub-hash contains details about the Bank transfer payment method options. */
        public Builder setCustomerBalance(
            GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance
                customerBalance) {
          this.customerBalance = customerBalance;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link GroupCreateParams.BillingSettings.PaymentMethodOptions#extraParams} for
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
         * map. See {@link GroupCreateParams.BillingSettings.PaymentMethodOptions#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This sub-hash contains details about the Konbini payment method options. */
        public Builder setKonbini(
            GroupCreateParams.BillingSettings.PaymentMethodOptions.Konbini konbini) {
          this.konbini = konbini;
          return this;
        }

        /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
        public Builder setSepaDebit(
            GroupCreateParams.BillingSettings.PaymentMethodOptions.SepaDebit sepaDebit) {
          this.sepaDebit = sepaDebit;
          return this;
        }

        /** This sub-hash contains details about the ACH direct debit payment method options. */
        public Builder setUsBankAccount(
            GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount usBankAccount) {
          this.usBankAccount = usBankAccount;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AcssDebit {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Additional fields for Mandate creation. */
        @SerializedName("mandate_options")
        MandateOptions mandateOptions;

        /** Verification method. */
        @SerializedName("verification_method")
        VerificationMethod verificationMethod;

        private AcssDebit(
            Map<String, Object> extraParams,
            MandateOptions mandateOptions,
            VerificationMethod verificationMethod) {
          this.extraParams = extraParams;
          this.mandateOptions = mandateOptions;
          this.verificationMethod = verificationMethod;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private MandateOptions mandateOptions;

          private VerificationMethod verificationMethod;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit(
                this.extraParams, this.mandateOptions, this.verificationMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit#extraParams} for the
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Additional fields for Mandate creation. */
          public Builder setMandateOptions(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                  mandateOptions) {
            this.mandateOptions = mandateOptions;
            return this;
          }

          /** Verification method. */
          public Builder setVerificationMethod(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit.VerificationMethod
                  verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MandateOptions {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Transaction type of the mandate. */
          @SerializedName("transaction_type")
          TransactionType transactionType;

          private MandateOptions(Map<String, Object> extraParams, TransactionType transactionType) {
            this.extraParams = extraParams;
            this.transactionType = transactionType;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private TransactionType transactionType;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                build() {
              return new GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit
                  .MandateOptions(this.extraParams, this.transactionType);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Transaction type of the mandate. */
            public Builder setTransactionType(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                        .TransactionType
                    transactionType) {
              this.transactionType = transactionType;
              return this;
            }
          }

          public enum TransactionType implements ApiRequestParams.EnumParam {
            @SerializedName("business")
            BUSINESS("business"),

            @SerializedName("personal")
            PERSONAL("personal");

            @Getter(onMethod_ = {@Override})
            private final String value;

            TransactionType(String value) {
              this.value = value;
            }
          }
        }

        public enum VerificationMethod implements ApiRequestParams.EnumParam {
          @SerializedName("automatic")
          AUTOMATIC("automatic"),

          @SerializedName("instant")
          INSTANT("instant"),

          @SerializedName("microdeposits")
          MICRODEPOSITS("microdeposits");

          @Getter(onMethod_ = {@Override})
          private final String value;

          VerificationMethod(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Bancontact {
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
         * Preferred language of the Bancontact authorization page that the customer is redirected
         * to.
         */
        @SerializedName("preferred_language")
        PreferredLanguage preferredLanguage;

        private Bancontact(Map<String, Object> extraParams, PreferredLanguage preferredLanguage) {
          this.extraParams = extraParams;
          this.preferredLanguage = preferredLanguage;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PreferredLanguage preferredLanguage;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.Bancontact build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.Bancontact(
                this.extraParams, this.preferredLanguage);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.Bancontact#extraParams} for the
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.Bancontact#extraParams} for the
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
           * Preferred language of the Bancontact authorization page that the customer is redirected
           * to.
           */
          public Builder setPreferredLanguage(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.Bancontact.PreferredLanguage
                  preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
          }
        }

        public enum PreferredLanguage implements ApiRequestParams.EnumParam {
          @SerializedName("de")
          DE("de"),

          @SerializedName("en")
          EN("en"),

          @SerializedName("fr")
          FR("fr"),

          @SerializedName("nl")
          NL("nl");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PreferredLanguage(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Card {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Configuration options for setting up an eMandate for cards issued in India. */
        @SerializedName("mandate_options")
        MandateOptions mandateOptions;

        /**
         * Selected network to process the payment on. Depends on the available networks of the
         * card.
         */
        @SerializedName("network")
        String network;

        /**
         * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine to
         * automatically prompt your customers for authentication based on risk level and <a
         * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. Read our guide on <a
         * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
         * requesting 3D Secure</a> for more information on how this configuration interacts with
         * Radar and our SCA Engine.
         */
        @SerializedName("request_three_d_secure")
        RequestThreeDSecure requestThreeDSecure;

        private Card(
            Map<String, Object> extraParams,
            MandateOptions mandateOptions,
            String network,
            RequestThreeDSecure requestThreeDSecure) {
          this.extraParams = extraParams;
          this.mandateOptions = mandateOptions;
          this.network = network;
          this.requestThreeDSecure = requestThreeDSecure;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private MandateOptions mandateOptions;

          private String network;

          private RequestThreeDSecure requestThreeDSecure;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.Card build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.Card(
                this.extraParams, this.mandateOptions, this.network, this.requestThreeDSecure);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.Card#extraParams} for the field
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.Card#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Configuration options for setting up an eMandate for cards issued in India. */
          public Builder setMandateOptions(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.MandateOptions
                  mandateOptions) {
            this.mandateOptions = mandateOptions;
            return this;
          }

          /**
           * Selected network to process the payment on. Depends on the available networks of the
           * card.
           */
          public Builder setNetwork(String network) {
            this.network = network;
            return this;
          }

          /**
           * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine to
           * automatically prompt your customers for authentication based on risk level and <a
           * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
           * However, if you wish to request 3D Secure based on logic from your own fraud engine,
           * provide this option. Read our guide on <a
           * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
           * requesting 3D Secure</a> for more information on how this configuration interacts with
           * Radar and our SCA Engine.
           */
          public Builder setRequestThreeDSecure(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.RequestThreeDSecure
                  requestThreeDSecure) {
            this.requestThreeDSecure = requestThreeDSecure;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MandateOptions {
          /** Amount to be charged for future payments. */
          @SerializedName("amount")
          @JsonAdapter(StringInt64TypeAdapter.class)
          Long amount;

          /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
          @SerializedName("amount_type")
          AmountType amountType;

          /** A description of the mandate that is meant to be displayed to the customer. */
          @SerializedName("description")
          String description;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private MandateOptions(
              Long amount,
              AmountType amountType,
              String description,
              Map<String, Object> extraParams) {
            this.amount = amount;
            this.amountType = amountType;
            this.description = description;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private AmountType amountType;

            private String description;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.MandateOptions
                build() {
              return new GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.MandateOptions(
                  this.amount, this.amountType, this.description, this.extraParams);
            }

            /** Amount to be charged for future payments. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
            public Builder setAmountType(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.MandateOptions
                        .AmountType
                    amountType) {
              this.amountType = amountType;
              return this;
            }

            /** A description of the mandate that is meant to be displayed to the customer. */
            public Builder setDescription(String description) {
              this.description = description;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.MandateOptions#extraParams}
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
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.Card.MandateOptions#extraParams}
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

          public enum AmountType implements ApiRequestParams.EnumParam {
            @SerializedName("fixed")
            FIXED("fixed"),

            @SerializedName("maximum")
            MAXIMUM("maximum");

            @Getter(onMethod_ = {@Override})
            private final String value;

            AmountType(String value) {
              this.value = value;
            }
          }
        }

        public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
          @SerializedName("any")
          ANY("any"),

          @SerializedName("automatic")
          AUTOMATIC("automatic"),

          @SerializedName("challenge")
          CHALLENGE("challenge");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RequestThreeDSecure(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomerBalance {
        /**
         * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
         * {@code bank_transfer}.
         */
        @SerializedName("bank_transfer")
        BankTransfer bankTransfer;

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
         * The funding method type to be used when there are not enough funds in the customer
         * balance. Currently the only supported value is {@code bank_transfer}.
         */
        @SerializedName("funding_type")
        FundingType fundingType;

        private CustomerBalance(
            BankTransfer bankTransfer, Map<String, Object> extraParams, FundingType fundingType) {
          this.bankTransfer = bankTransfer;
          this.extraParams = extraParams;
          this.fundingType = fundingType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BankTransfer bankTransfer;

          private Map<String, Object> extraParams;

          private FundingType fundingType;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance(
                this.bankTransfer, this.extraParams, this.fundingType);
          }

          /**
           * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
           * {@code bank_transfer}.
           */
          public Builder setBankTransfer(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer
                  bankTransfer) {
            this.bankTransfer = bankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance#extraParams} for
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance#extraParams} for
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
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Currently the only supported value is {@code bank_transfer}.
           */
          public Builder setFundingType(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.FundingType
                  fundingType) {
            this.fundingType = fundingType;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BankTransfer {
          /**
           * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
           * {@code eu_bank_transfer}.
           */
          @SerializedName("eu_bank_transfer")
          EuBankTransfer euBankTransfer;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The bank transfer type that can be used for funding. */
          @SerializedName("type")
          Type type;

          private BankTransfer(
              EuBankTransfer euBankTransfer, Map<String, Object> extraParams, Type type) {
            this.euBankTransfer = euBankTransfer;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private EuBankTransfer euBankTransfer;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer
                build() {
              return new GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance
                  .BankTransfer(this.euBankTransfer, this.extraParams, this.type);
            }

            /**
             * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
             * {@code eu_bank_transfer}.
             */
            public Builder setEuBankTransfer(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer
                        .EuBankTransfer
                    euBankTransfer) {
              this.euBankTransfer = euBankTransfer;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The bank transfer type that can be used for funding. */
            public Builder setType(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer
                        .Type
                    type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class EuBankTransfer {
            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             */
            @SerializedName("country")
            Country country;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private EuBankTransfer(Country country, Map<String, Object> extraParams) {
              this.country = country;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Country country;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance
                      .BankTransfer.EuBankTransfer
                  build() {
                return new GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer.EuBankTransfer(this.country, this.extraParams);
              }

              /**
               * <strong>Required.</strong> The desired country code of the bank account
               * information.
               */
              public Builder setCountry(
                  GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance
                          .BankTransfer.EuBankTransfer.Country
                      country) {
                this.country = country;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
               * GroupCreateParams.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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

            public enum Country implements ApiRequestParams.EnumParam {
              @SerializedName("BE")
              BE("BE"),

              @SerializedName("DE")
              DE("DE"),

              @SerializedName("ES")
              ES("ES"),

              @SerializedName("FR")
              FR("FR"),

              @SerializedName("IE")
              IE("IE"),

              @SerializedName("NL")
              NL("NL");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Country(String value) {
                this.value = value;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("eu_bank_transfer")
            EU_BANK_TRANSFER("eu_bank_transfer"),

            @SerializedName("gb_bank_transfer")
            GB_BANK_TRANSFER("gb_bank_transfer"),

            @SerializedName("jp_bank_transfer")
            JP_BANK_TRANSFER("jp_bank_transfer"),

            @SerializedName("mx_bank_transfer")
            MX_BANK_TRANSFER("mx_bank_transfer"),

            @SerializedName("us_bank_transfer")
            US_BANK_TRANSFER("us_bank_transfer");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        public enum FundingType implements ApiRequestParams.EnumParam {
          @SerializedName("bank_transfer")
          BANK_TRANSFER("bank_transfer");

          @Getter(onMethod_ = {@Override})
          private final String value;

          FundingType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Konbini {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Konbini(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.Konbini build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.Konbini(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.Konbini#extraParams} for the
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.Konbini#extraParams} for the
           * field documentation.
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
      public static class SepaDebit {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private SepaDebit(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.SepaDebit build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.SepaDebit(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.SepaDebit#extraParams} for the
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.SepaDebit#extraParams} for the
           * field documentation.
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
      public static class UsBankAccount {
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
         * <strong>Required.</strong> Additional fields for Financial Connections Session creation.
         */
        @SerializedName("financial_connections")
        FinancialConnections financialConnections;

        /** <strong>Required.</strong> Verification method. */
        @SerializedName("verification_method")
        VerificationMethod verificationMethod;

        private UsBankAccount(
            Map<String, Object> extraParams,
            FinancialConnections financialConnections,
            VerificationMethod verificationMethod) {
          this.extraParams = extraParams;
          this.financialConnections = financialConnections;
          this.verificationMethod = verificationMethod;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private FinancialConnections financialConnections;

          private VerificationMethod verificationMethod;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount build() {
            return new GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount(
                this.extraParams, this.financialConnections, this.verificationMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount#extraParams} for
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
           * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount#extraParams} for
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
           * <strong>Required.</strong> Additional fields for Financial Connections Session
           * creation.
           */
          public Builder setFinancialConnections(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections
                  financialConnections) {
            this.financialConnections = financialConnections;
            return this;
          }

          /** <strong>Required.</strong> Verification method. */
          public Builder setVerificationMethod(
              GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                      .VerificationMethod
                  verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class FinancialConnections {
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
           * Provide filters for the linked accounts that the customer can select for the payment
           * method.
           */
          @SerializedName("filters")
          Filters filters;

          /**
           * The list of permissions to request. If this parameter is passed, the {@code
           * payment_method} permission must be included.
           */
          @SerializedName("permissions")
          List<
                  GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Permission>
              permissions;

          /** List of data features that you would like to retrieve upon account creation. */
          @SerializedName("prefetch")
          List<
                  GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Prefetch>
              prefetch;

          private FinancialConnections(
              Map<String, Object> extraParams,
              Filters filters,
              List<
                      GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Permission>
                  permissions,
              List<
                      GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Prefetch>
                  prefetch) {
            this.extraParams = extraParams;
            this.filters = filters;
            this.permissions = permissions;
            this.prefetch = prefetch;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Filters filters;

            private List<
                    GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission>
                permissions;

            private List<
                    GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch>
                prefetch;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections
                build() {
              return new GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections(
                  this.extraParams, this.filters, this.permissions, this.prefetch);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
             * Provide filters for the linked accounts that the customer can select for the payment
             * method.
             */
            public Builder setFilters(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Filters
                    filters) {
              this.filters = filters;
              return this;
            }

            /**
             * Add an element to `permissions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
             * for the field documentation.
             */
            public Builder addPermission(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission
                    element) {
              if (this.permissions == null) {
                this.permissions = new ArrayList<>();
              }
              this.permissions.add(element);
              return this;
            }

            /**
             * Add all elements to `permissions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
             * for the field documentation.
             */
            public Builder addAllPermission(
                List<
                        GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Permission>
                    elements) {
              if (this.permissions == null) {
                this.permissions = new ArrayList<>();
              }
              this.permissions.addAll(elements);
              return this;
            }

            /**
             * Add an element to `prefetch` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
             * for the field documentation.
             */
            public Builder addPrefetch(
                GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch
                    element) {
              if (this.prefetch == null) {
                this.prefetch = new ArrayList<>();
              }
              this.prefetch.add(element);
              return this;
            }

            /**
             * Add all elements to `prefetch` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
             * for the field documentation.
             */
            public Builder addAllPrefetch(
                List<
                        GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Prefetch>
                    elements) {
              if (this.prefetch == null) {
                this.prefetch = new ArrayList<>();
              }
              this.prefetch.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Filters {
            /** The account subcategories to use to filter for selectable accounts. */
            @SerializedName("account_subcategories")
            List<
                    GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Filters.AccountSubcategory>
                accountSubcategories;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private Filters(
                List<
                        GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Filters.AccountSubcategory>
                    accountSubcategories,
                Map<String, Object> extraParams) {
              this.accountSubcategories = accountSubcategories;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private List<
                      GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Filters.AccountSubcategory>
                  accountSubcategories;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Filters
                  build() {
                return new GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections.Filters(this.accountSubcategories, this.extraParams);
              }

              /**
               * Add an element to `accountSubcategories` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
               * for the field documentation.
               */
              public Builder addAccountSubcategory(
                  GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Filters.AccountSubcategory
                      element) {
                if (this.accountSubcategories == null) {
                  this.accountSubcategories = new ArrayList<>();
                }
                this.accountSubcategories.add(element);
                return this;
              }

              /**
               * Add all elements to `accountSubcategories` list. A list is initialized for the
               * first `add/addAll` call, and subsequent calls adds additional elements to the
               * original list. See {@link
               * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
               * for the field documentation.
               */
              public Builder addAllAccountSubcategory(
                  List<
                          GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount
                              .FinancialConnections.Filters.AccountSubcategory>
                      elements) {
                if (this.accountSubcategories == null) {
                  this.accountSubcategories = new ArrayList<>();
                }
                this.accountSubcategories.addAll(elements);
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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
               * GroupCreateParams.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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

            public enum AccountSubcategory implements ApiRequestParams.EnumParam {
              @SerializedName("checking")
              CHECKING("checking"),

              @SerializedName("savings")
              SAVINGS("savings");

              @Getter(onMethod_ = {@Override})
              private final String value;

              AccountSubcategory(String value) {
                this.value = value;
              }
            }
          }

          public enum Permission implements ApiRequestParams.EnumParam {
            @SerializedName("balances")
            BALANCES("balances"),

            @SerializedName("ownership")
            OWNERSHIP("ownership"),

            @SerializedName("payment_method")
            PAYMENT_METHOD("payment_method"),

            @SerializedName("transactions")
            TRANSACTIONS("transactions");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Permission(String value) {
              this.value = value;
            }
          }

          public enum Prefetch implements ApiRequestParams.EnumParam {
            @SerializedName("balances")
            BALANCES("balances"),

            @SerializedName("ownership")
            OWNERSHIP("ownership"),

            @SerializedName("transactions")
            TRANSACTIONS("transactions");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Prefetch(String value) {
              this.value = value;
            }
          }
        }

        public enum VerificationMethod implements ApiRequestParams.EnumParam {
          @SerializedName("automatic")
          AUTOMATIC("automatic"),

          @SerializedName("instant")
          INSTANT("instant"),

          @SerializedName("microdeposits")
          MICRODEPOSITS("microdeposits");

          @Getter(onMethod_ = {@Override})
          private final String value;

          VerificationMethod(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Determines if tax is calculated automatically based on a product tax code or manually based
       * on rules defined by the business. Omit to use the applicable default.
       */
      @SerializedName("type")
      Type type;

      private Tax(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public GroupCreateParams.BillingSettings.Tax build() {
          return new GroupCreateParams.BillingSettings.Tax(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link GroupCreateParams.BillingSettings.Tax#extraParams} for the field
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
         * map. See {@link GroupCreateParams.BillingSettings.Tax#extraParams} for the field
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
         * Determines if tax is calculated automatically based on a product tax code or manually
         * based on rules defined by the business. Omit to use the applicable default.
         */
        public Builder setType(GroupCreateParams.BillingSettings.Tax.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum CollectionMethod implements ApiRequestParams.EnumParam {
      @SerializedName("charge_automatically")
      CHARGE_AUTOMATICALLY("charge_automatically"),

      @SerializedName("send_invoice")
      SEND_INVOICE("send_invoice");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CollectionMethod(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class GroupingBehavior {
    /** The cadence configuration when type is {@code by_cadence}. */
    @SerializedName("by_cadence")
    ByCadence byCadence;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The grouping strategy. */
    @SerializedName("type")
    Type type;

    private GroupingBehavior(ByCadence byCadence, Map<String, Object> extraParams, Type type) {
      this.byCadence = byCadence;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ByCadence byCadence;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public GroupCreateParams.GroupingBehavior build() {
        return new GroupCreateParams.GroupingBehavior(this.byCadence, this.extraParams, this.type);
      }

      /** The cadence configuration when type is {@code by_cadence}. */
      public Builder setByCadence(GroupCreateParams.GroupingBehavior.ByCadence byCadence) {
        this.byCadence = byCadence;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * GroupCreateParams.GroupingBehavior#extraParams} for the field documentation.
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
       * See {@link GroupCreateParams.GroupingBehavior#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The grouping strategy. */
      public Builder setType(GroupCreateParams.GroupingBehavior.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ByCadence {
      /** Timestamp that anchors the recurring grouping cadence. */
      @SerializedName("billing_cycle_anchor")
      Instant billingCycleAnchor;

      /** Daily cadence details. */
      @SerializedName("day")
      Day day;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The number of interval units between groups. Defaults to 1. */
      @SerializedName("interval_count")
      Long intervalCount;

      /** Monthly cadence details. */
      @SerializedName("month")
      Month month;

      /** <strong>Required.</strong> The interval unit for the cadence. */
      @SerializedName("type")
      Type type;

      /** Weekly cadence details. */
      @SerializedName("week")
      Week week;

      /** Yearly cadence details. */
      @SerializedName("year")
      Year year;

      private ByCadence(
          Instant billingCycleAnchor,
          Day day,
          Map<String, Object> extraParams,
          Long intervalCount,
          Month month,
          Type type,
          Week week,
          Year year) {
        this.billingCycleAnchor = billingCycleAnchor;
        this.day = day;
        this.extraParams = extraParams;
        this.intervalCount = intervalCount;
        this.month = month;
        this.type = type;
        this.week = week;
        this.year = year;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Instant billingCycleAnchor;

        private Day day;

        private Map<String, Object> extraParams;

        private Long intervalCount;

        private Month month;

        private Type type;

        private Week week;

        private Year year;

        /** Finalize and obtain parameter instance from this builder. */
        public GroupCreateParams.GroupingBehavior.ByCadence build() {
          return new GroupCreateParams.GroupingBehavior.ByCadence(
              this.billingCycleAnchor,
              this.day,
              this.extraParams,
              this.intervalCount,
              this.month,
              this.type,
              this.week,
              this.year);
        }

        /** Timestamp that anchors the recurring grouping cadence. */
        public Builder setBillingCycleAnchor(Instant billingCycleAnchor) {
          this.billingCycleAnchor = billingCycleAnchor;
          return this;
        }

        /** Daily cadence details. */
        public Builder setDay(GroupCreateParams.GroupingBehavior.ByCadence.Day day) {
          this.day = day;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence#extraParams} for the field
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
         * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The number of interval units between groups. Defaults to 1. */
        public Builder setIntervalCount(Long intervalCount) {
          this.intervalCount = intervalCount;
          return this;
        }

        /** Monthly cadence details. */
        public Builder setMonth(GroupCreateParams.GroupingBehavior.ByCadence.Month month) {
          this.month = month;
          return this;
        }

        /** <strong>Required.</strong> The interval unit for the cadence. */
        public Builder setType(GroupCreateParams.GroupingBehavior.ByCadence.Type type) {
          this.type = type;
          return this;
        }

        /** Weekly cadence details. */
        public Builder setWeek(GroupCreateParams.GroupingBehavior.ByCadence.Week week) {
          this.week = week;
          return this;
        }

        /** Yearly cadence details. */
        public Builder setYear(GroupCreateParams.GroupingBehavior.ByCadence.Year year) {
          this.year = year;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Day {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The time at which the daily grouping interval begins. */
        @SerializedName("time")
        Time time;

        private Day(Map<String, Object> extraParams, Time time) {
          this.extraParams = extraParams;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Time time;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.GroupingBehavior.ByCadence.Day build() {
            return new GroupCreateParams.GroupingBehavior.ByCadence.Day(
                this.extraParams, this.time);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Day#extraParams} for the
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
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Day#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The time at which the daily grouping interval begins. */
          public Builder setTime(GroupCreateParams.GroupingBehavior.ByCadence.Day.Time time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Time {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The hour, from 0 through 23. */
          @SerializedName("hour")
          Long hour;

          /** <strong>Required.</strong> The minute, from 0 through 59. */
          @SerializedName("minute")
          Long minute;

          /** <strong>Required.</strong> The second, from 0 through 59. */
          @SerializedName("second")
          Long second;

          private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
            this.extraParams = extraParams;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long hour;

            private Long minute;

            private Long second;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.GroupingBehavior.ByCadence.Day.Time build() {
              return new GroupCreateParams.GroupingBehavior.ByCadence.Day.Time(
                  this.extraParams, this.hour, this.minute, this.second);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.GroupingBehavior.ByCadence.Day.Time#extraParams} for the field
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
             * GroupCreateParams.GroupingBehavior.ByCadence.Day.Time#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            public Builder setHour(Long hour) {
              this.hour = hour;
              return this;
            }

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            public Builder setMinute(Long minute) {
              this.minute = minute;
              return this;
            }

            /** <strong>Required.</strong> The second, from 0 through 59. */
            public Builder setSecond(Long second) {
              this.second = second;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Month {
        /**
         * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months, the
         * cadence anchors to the month's last day.
         */
        @SerializedName("day_of_month")
        Long dayOfMonth;

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
         * The month of year, from 1 through 12, from which occurrences are calculated. Defaults to
         * the month when the billing group was created.
         */
        @SerializedName("month_of_year")
        Long monthOfYear;

        /**
         * The time at which the monthly grouping interval begins. Defaults to the time the billing
         * group is created, in UTC.
         */
        @SerializedName("time")
        Time time;

        private Month(
            Long dayOfMonth, Map<String, Object> extraParams, Long monthOfYear, Time time) {
          this.dayOfMonth = dayOfMonth;
          this.extraParams = extraParams;
          this.monthOfYear = monthOfYear;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long dayOfMonth;

          private Map<String, Object> extraParams;

          private Long monthOfYear;

          private Time time;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.GroupingBehavior.ByCadence.Month build() {
            return new GroupCreateParams.GroupingBehavior.ByCadence.Month(
                this.dayOfMonth, this.extraParams, this.monthOfYear, this.time);
          }

          /**
           * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months, the
           * cadence anchors to the month's last day.
           */
          public Builder setDayOfMonth(Long dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Month#extraParams} for the
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
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Month#extraParams} for the
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
           * The month of year, from 1 through 12, from which occurrences are calculated. Defaults
           * to the month when the billing group was created.
           */
          public Builder setMonthOfYear(Long monthOfYear) {
            this.monthOfYear = monthOfYear;
            return this;
          }

          /**
           * The time at which the monthly grouping interval begins. Defaults to the time the
           * billing group is created, in UTC.
           */
          public Builder setTime(GroupCreateParams.GroupingBehavior.ByCadence.Month.Time time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Time {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The hour, from 0 through 23. */
          @SerializedName("hour")
          Long hour;

          /** <strong>Required.</strong> The minute, from 0 through 59. */
          @SerializedName("minute")
          Long minute;

          /** <strong>Required.</strong> The second, from 0 through 59. */
          @SerializedName("second")
          Long second;

          private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
            this.extraParams = extraParams;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long hour;

            private Long minute;

            private Long second;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.GroupingBehavior.ByCadence.Month.Time build() {
              return new GroupCreateParams.GroupingBehavior.ByCadence.Month.Time(
                  this.extraParams, this.hour, this.minute, this.second);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.GroupingBehavior.ByCadence.Month.Time#extraParams} for the field
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
             * GroupCreateParams.GroupingBehavior.ByCadence.Month.Time#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            public Builder setHour(Long hour) {
              this.hour = hour;
              return this;
            }

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            public Builder setMinute(Long minute) {
              this.minute = minute;
              return this;
            }

            /** <strong>Required.</strong> The second, from 0 through 59. */
            public Builder setSecond(Long second) {
              this.second = second;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Week {
        /**
         * <strong>Required.</strong> The ISO-8601 day of week, from 1 for Monday through 7 for
         * Sunday.
         */
        @SerializedName("day_of_week")
        Long dayOfWeek;

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
         * The time at which the weekly grouping interval begins. Defaults to the time the billing
         * group is created, in UTC.
         */
        @SerializedName("time")
        Time time;

        private Week(Long dayOfWeek, Map<String, Object> extraParams, Time time) {
          this.dayOfWeek = dayOfWeek;
          this.extraParams = extraParams;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long dayOfWeek;

          private Map<String, Object> extraParams;

          private Time time;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.GroupingBehavior.ByCadence.Week build() {
            return new GroupCreateParams.GroupingBehavior.ByCadence.Week(
                this.dayOfWeek, this.extraParams, this.time);
          }

          /**
           * <strong>Required.</strong> The ISO-8601 day of week, from 1 for Monday through 7 for
           * Sunday.
           */
          public Builder setDayOfWeek(Long dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Week#extraParams} for the
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
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Week#extraParams} for the
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
           * The time at which the weekly grouping interval begins. Defaults to the time the billing
           * group is created, in UTC.
           */
          public Builder setTime(GroupCreateParams.GroupingBehavior.ByCadence.Week.Time time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Time {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The hour, from 0 through 23. */
          @SerializedName("hour")
          Long hour;

          /** <strong>Required.</strong> The minute, from 0 through 59. */
          @SerializedName("minute")
          Long minute;

          /** <strong>Required.</strong> The second, from 0 through 59. */
          @SerializedName("second")
          Long second;

          private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
            this.extraParams = extraParams;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long hour;

            private Long minute;

            private Long second;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.GroupingBehavior.ByCadence.Week.Time build() {
              return new GroupCreateParams.GroupingBehavior.ByCadence.Week.Time(
                  this.extraParams, this.hour, this.minute, this.second);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.GroupingBehavior.ByCadence.Week.Time#extraParams} for the field
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
             * GroupCreateParams.GroupingBehavior.ByCadence.Week.Time#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            public Builder setHour(Long hour) {
              this.hour = hour;
              return this;
            }

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            public Builder setMinute(Long minute) {
              this.minute = minute;
              return this;
            }

            /** <strong>Required.</strong> The second, from 0 through 59. */
            public Builder setSecond(Long second) {
              this.second = second;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Year {
        /**
         * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months, the
         * cadence anchors to the month's last day.
         */
        @SerializedName("day_of_month")
        Long dayOfMonth;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The month of year, from 1 through 12. */
        @SerializedName("month_of_year")
        Long monthOfYear;

        /**
         * The time at which the yearly grouping interval begins. Defaults to the time the billing
         * group is created, in UTC.
         */
        @SerializedName("time")
        Time time;

        private Year(
            Long dayOfMonth, Map<String, Object> extraParams, Long monthOfYear, Time time) {
          this.dayOfMonth = dayOfMonth;
          this.extraParams = extraParams;
          this.monthOfYear = monthOfYear;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long dayOfMonth;

          private Map<String, Object> extraParams;

          private Long monthOfYear;

          private Time time;

          /** Finalize and obtain parameter instance from this builder. */
          public GroupCreateParams.GroupingBehavior.ByCadence.Year build() {
            return new GroupCreateParams.GroupingBehavior.ByCadence.Year(
                this.dayOfMonth, this.extraParams, this.monthOfYear, this.time);
          }

          /**
           * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months, the
           * cadence anchors to the month's last day.
           */
          public Builder setDayOfMonth(Long dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Year#extraParams} for the
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
           * map. See {@link GroupCreateParams.GroupingBehavior.ByCadence.Year#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The month of year, from 1 through 12. */
          public Builder setMonthOfYear(Long monthOfYear) {
            this.monthOfYear = monthOfYear;
            return this;
          }

          /**
           * The time at which the yearly grouping interval begins. Defaults to the time the billing
           * group is created, in UTC.
           */
          public Builder setTime(GroupCreateParams.GroupingBehavior.ByCadence.Year.Time time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Time {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The hour, from 0 through 23. */
          @SerializedName("hour")
          Long hour;

          /** <strong>Required.</strong> The minute, from 0 through 59. */
          @SerializedName("minute")
          Long minute;

          /** <strong>Required.</strong> The second, from 0 through 59. */
          @SerializedName("second")
          Long second;

          private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
            this.extraParams = extraParams;
            this.hour = hour;
            this.minute = minute;
            this.second = second;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Long hour;

            private Long minute;

            private Long second;

            /** Finalize and obtain parameter instance from this builder. */
            public GroupCreateParams.GroupingBehavior.ByCadence.Year.Time build() {
              return new GroupCreateParams.GroupingBehavior.ByCadence.Year.Time(
                  this.extraParams, this.hour, this.minute, this.second);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * GroupCreateParams.GroupingBehavior.ByCadence.Year.Time#extraParams} for the field
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
             * GroupCreateParams.GroupingBehavior.ByCadence.Year.Time#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            public Builder setHour(Long hour) {
              this.hour = hour;
              return this;
            }

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            public Builder setMinute(Long minute) {
              this.minute = minute;
              return this;
            }

            /** <strong>Required.</strong> The second, from 0 through 59. */
            public Builder setSecond(Long second) {
              this.second = second;
              return this;
            }
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week"),

        @SerializedName("year")
        YEAR("year");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("by_cadence")
      BY_CADENCE("by_cadence");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("billing_settings")
    BILLING_SETTINGS("billing_settings"),

    @SerializedName("invoice_discount_rules")
    INVOICE_DISCOUNT_RULES("invoice_discount_rules");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}

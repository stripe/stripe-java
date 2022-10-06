// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class QuoteUpdateParams extends ApiRequestParams {
  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. There cannot be any line items with
   * recurring prices when using this field.
   */
  @SerializedName("application_fee_amount")
  Object applicationFeeAmount;

  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice subtotal that will be transferred to the application
   * owner's Stripe account. There must be at least 1 line item with a recurring price to use this
   * field.
   */
  @SerializedName("application_fee_percent")
  Object applicationFeePercent;

  /** Settings for automatic tax lookup for this quote and resulting invoices and subscriptions. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay invoices at the end of the subscription cycle or at invoice
   * finalization using the default payment method attached to the subscription or customer. When
   * sending an invoice, Stripe will email your customer an invoice with payment instructions and
   * mark the subscription as {@code active}. Defaults to {@code charge_automatically}.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /**
   * The customer for which this quote belongs to. A customer is required before finalizing the
   * quote. Once specified, it cannot be changed.
   */
  @SerializedName("customer")
  Object customer;

  /** The tax rates that will apply to any line item that does not have {@code tax_rates} set. */
  @SerializedName("default_tax_rates")
  Object defaultTaxRates;

  /** A description that will be displayed on the quote PDF. */
  @SerializedName("description")
  Object description;

  /** The discounts applied to the quote. You can only set up to one discount. */
  @SerializedName("discounts")
  Object discounts;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A future timestamp on which the quote will be canceled if in {@code open} or {@code draft}
   * status. Measured in seconds since the Unix epoch.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** A footer that will be displayed on the quote PDF. */
  @SerializedName("footer")
  Object footer;

  /** A header that will be displayed on the quote PDF. */
  @SerializedName("header")
  Object header;

  /** All invoices will be billed using the specified settings. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /**
   * A list of line items the customer is being quoted for. Each line item includes information
   * about the product, the quantity, and the resulting cost.
   */
  @SerializedName("line_items")
  List<QuoteUpdateParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The account on behalf of which to charge. */
  @SerializedName("on_behalf_of")
  Object onBehalfOf;

  /**
   * List representing phases of the Quote. Each phase can be customized to have different
   * durations, prices, and coupons.
   */
  @SerializedName("phases")
  List<QuoteUpdateParams.Phase> phases;

  /**
   * When creating a subscription or subscription schedule, the specified configuration data will be
   * used. There must be at least one line item with a recurring price for a subscription or
   * subscription schedule to be created. A subscription schedule is created if {@code
   * subscription_data[effective_date]} is present and in the future, otherwise a subscription is
   * created.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  /** The data with which to automatically create a Transfer for each of the invoices. */
  @SerializedName("transfer_data")
  Object transferData;

  private QuoteUpdateParams(
      Object applicationFeeAmount,
      Object applicationFeePercent,
      AutomaticTax automaticTax,
      CollectionMethod collectionMethod,
      Object customer,
      Object defaultTaxRates,
      Object description,
      Object discounts,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      Object footer,
      Object header,
      InvoiceSettings invoiceSettings,
      List<QuoteUpdateParams.LineItem> lineItems,
      Map<String, String> metadata,
      Object onBehalfOf,
      List<QuoteUpdateParams.Phase> phases,
      SubscriptionData subscriptionData,
      Object transferData) {
    this.applicationFeeAmount = applicationFeeAmount;
    this.applicationFeePercent = applicationFeePercent;
    this.automaticTax = automaticTax;
    this.collectionMethod = collectionMethod;
    this.customer = customer;
    this.defaultTaxRates = defaultTaxRates;
    this.description = description;
    this.discounts = discounts;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.footer = footer;
    this.header = header;
    this.invoiceSettings = invoiceSettings;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.phases = phases;
    this.subscriptionData = subscriptionData;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object applicationFeeAmount;

    private Object applicationFeePercent;

    private AutomaticTax automaticTax;

    private CollectionMethod collectionMethod;

    private Object customer;

    private Object defaultTaxRates;

    private Object description;

    private Object discounts;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private Object footer;

    private Object header;

    private InvoiceSettings invoiceSettings;

    private List<QuoteUpdateParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private Object onBehalfOf;

    private List<QuoteUpdateParams.Phase> phases;

    private SubscriptionData subscriptionData;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public QuoteUpdateParams build() {
      return new QuoteUpdateParams(
          this.applicationFeeAmount,
          this.applicationFeePercent,
          this.automaticTax,
          this.collectionMethod,
          this.customer,
          this.defaultTaxRates,
          this.description,
          this.discounts,
          this.expand,
          this.expiresAt,
          this.extraParams,
          this.footer,
          this.header,
          this.invoiceSettings,
          this.lineItems,
          this.metadata,
          this.onBehalfOf,
          this.phases,
          this.subscriptionData,
          this.transferData);
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. There cannot be any line
     * items with recurring prices when using this field.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. There cannot be any line
     * items with recurring prices when using this field.
     */
    public Builder setApplicationFeeAmount(EmptyParam applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. There must be at least 1 line item with a recurring price
     * to use this field.
     */
    public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
      this.applicationFeePercent = applicationFeePercent;
      return this;
    }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * application owner's Stripe account. There must be at least 1 line item with a recurring price
     * to use this field.
     */
    public Builder setApplicationFeePercent(EmptyParam applicationFeePercent) {
      this.applicationFeePercent = applicationFeePercent;
      return this;
    }

    /**
     * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
     */
    public Builder setAutomaticTax(QuoteUpdateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay invoices at the end of the subscription cycle or at invoice
     * finalization using the default payment method attached to the subscription or customer. When
     * sending an invoice, Stripe will email your customer an invoice with payment instructions and
     * mark the subscription as {@code active}. Defaults to {@code charge_automatically}.
     */
    public Builder setCollectionMethod(QuoteUpdateParams.CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /**
     * The customer for which this quote belongs to. A customer is required before finalizing the
     * quote. Once specified, it cannot be changed.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The customer for which this quote belongs to. A customer is required before finalizing the
     * quote. Once specified, it cannot be changed.
     */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#defaultTaxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDefaultTaxRate(String element) {
      if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
        this.defaultTaxRates = new ArrayList<String>();
      }
      ((List<String>) this.defaultTaxRates).add(element);
      return this;
    }

    /**
     * Add all elements to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#defaultTaxRates} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDefaultTaxRate(List<String> elements) {
      if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
        this.defaultTaxRates = new ArrayList<String>();
      }
      ((List<String>) this.defaultTaxRates).addAll(elements);
      return this;
    }

    /** The tax rates that will apply to any line item that does not have {@code tax_rates} set. */
    public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    /** The tax rates that will apply to any line item that does not have {@code tax_rates} set. */
    public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    /** A description that will be displayed on the quote PDF. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** A description that will be displayed on the quote PDF. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(QuoteUpdateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<QuoteUpdateParams.Discount>();
      }
      ((List<QuoteUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<QuoteUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<QuoteUpdateParams.Discount>();
      }
      ((List<QuoteUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /** The discounts applied to the quote. You can only set up to one discount. */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /** The discounts applied to the quote. You can only set up to one discount. */
    public Builder setDiscounts(List<QuoteUpdateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#expand} for the field documentation.
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
     * QuoteUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * A future timestamp on which the quote will be canceled if in {@code open} or {@code draft}
     * status. Measured in seconds since the Unix epoch.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * QuoteUpdateParams#extraParams} for the field documentation.
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
     * See {@link QuoteUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** A footer that will be displayed on the quote PDF. */
    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    /** A footer that will be displayed on the quote PDF. */
    public Builder setFooter(EmptyParam footer) {
      this.footer = footer;
      return this;
    }

    /** A header that will be displayed on the quote PDF. */
    public Builder setHeader(String header) {
      this.header = header;
      return this;
    }

    /** A header that will be displayed on the quote PDF. */
    public Builder setHeader(EmptyParam header) {
      this.header = header;
      return this;
    }

    /** All invoices will be billed using the specified settings. */
    public Builder setInvoiceSettings(QuoteUpdateParams.InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(QuoteUpdateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<QuoteUpdateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * QuoteUpdateParams#metadata} for the field documentation.
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
     * See {@link QuoteUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The account on behalf of which to charge. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /** The account on behalf of which to charge. */
    public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * Add an element to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#phases} for the field documentation.
     */
    public Builder addPhase(QuoteUpdateParams.Phase element) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.add(element);
      return this;
    }

    /**
     * Add all elements to `phases` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#phases} for the field documentation.
     */
    public Builder addAllPhase(List<QuoteUpdateParams.Phase> elements) {
      if (this.phases == null) {
        this.phases = new ArrayList<>();
      }
      this.phases.addAll(elements);
      return this;
    }

    /**
     * When creating a subscription or subscription schedule, the specified configuration data will
     * be used. There must be at least one line item with a recurring price for a subscription or
     * subscription schedule to be created. A subscription schedule is created if {@code
     * subscription_data[effective_date]} is present and in the future, otherwise a subscription is
     * created.
     */
    public Builder setSubscriptionData(QuoteUpdateParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /** The data with which to automatically create a Transfer for each of the invoices. */
    public Builder setTransferData(QuoteUpdateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /** The data with which to automatically create a Transfer for each of the invoices. */
    public Builder setTransferData(EmptyParam transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  public static class AutomaticTax {
    /**
     * Controls whether Stripe will automatically compute tax on the resulting invoices or
     * subscriptions as well as the quote itself.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.AutomaticTax build() {
        return new QuoteUpdateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /**
       * Controls whether Stripe will automatically compute tax on the resulting invoices or
       * subscriptions as well as the quote itself.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    Object coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    Object discount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Discount(Object coupon, Object discount, Map<String, Object> extraParams) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.Discount build() {
        return new QuoteUpdateParams.Discount(this.coupon, this.discount, this.extraParams);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(EmptyParam coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(EmptyParam discount) {
        this.discount = discount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.Discount#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.Discount#extraParams} for the field documentation.
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
  public static class InvoiceSettings {
    /**
     * Number of days within which a customer must pay the invoice generated by this quote. This
     * value will be {@code null} for quotes where {@code collection_method=charge_automatically}.
     */
    @SerializedName("days_until_due")
    Long daysUntilDue;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private InvoiceSettings(Long daysUntilDue, Map<String, Object> extraParams) {
      this.daysUntilDue = daysUntilDue;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long daysUntilDue;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.InvoiceSettings build() {
        return new QuoteUpdateParams.InvoiceSettings(this.daysUntilDue, this.extraParams);
      }

      /**
       * Number of days within which a customer must pay the invoice generated by this quote. This
       * value will be {@code null} for quotes where {@code collection_method=charge_automatically}.
       */
      public Builder setDaysUntilDue(Long daysUntilDue) {
        this.daysUntilDue = daysUntilDue;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.InvoiceSettings#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.InvoiceSettings#extraParams} for the field documentation.
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
  public static class LineItem {
    /** The discounts applied to this line item. */
    @SerializedName("discounts")
    Object discounts;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of an existing line item on the quote. */
    @SerializedName("id")
    Object id;

    /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
    @SerializedName("price")
    Object price;

    /**
     * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
     * inline. One of {@code price} or {@code price_data} is required.
     */
    @SerializedName("price_data")
    PriceData priceData;

    /** The quantity of the line item. */
    @SerializedName("quantity")
    Long quantity;

    /**
     * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
     * quote do not apply to this line item.
     */
    @SerializedName("tax_rates")
    Object taxRates;

    private LineItem(
        Object discounts,
        Map<String, Object> extraParams,
        Object id,
        Object price,
        PriceData priceData,
        Long quantity,
        Object taxRates) {
      this.discounts = discounts;
      this.extraParams = extraParams;
      this.id = id;
      this.price = price;
      this.priceData = priceData;
      this.quantity = quantity;
      this.taxRates = taxRates;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object discounts;

      private Map<String, Object> extraParams;

      private Object id;

      private Object price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.LineItem build() {
        return new QuoteUpdateParams.LineItem(
            this.discounts,
            this.extraParams,
            this.id,
            this.price,
            this.priceData,
            this.quantity,
            this.taxRates);
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(QuoteUpdateParams.LineItem.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<QuoteUpdateParams.LineItem.Discount>();
        }
        ((List<QuoteUpdateParams.LineItem.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(List<QuoteUpdateParams.LineItem.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<QuoteUpdateParams.LineItem.Discount>();
        }
        ((List<QuoteUpdateParams.LineItem.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(List<QuoteUpdateParams.LineItem.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of an existing line item on the quote. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The ID of an existing line item on the quote. */
      public Builder setId(EmptyParam id) {
        this.id = id;
        return this;
      }

      /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
      public Builder setPrice(EmptyParam price) {
        this.price = price;
        return this;
      }

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      public Builder setPriceData(QuoteUpdateParams.LineItem.PriceData priceData) {
        this.priceData = priceData;
        return this;
      }

      /** The quantity of the line item. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /**
       * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.LineItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addTaxRate(String element) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.LineItem#taxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllTaxRate(List<String> elements) {
        if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
          this.taxRates = new ArrayList<String>();
        }
        ((List<String>) this.taxRates).addAll(elements);
        return this;
      }

      /**
       * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
       * quote do not apply to this line item.
       */
      public Builder setTaxRates(EmptyParam taxRates) {
        this.taxRates = taxRates;
        return this;
      }

      /**
       * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
       * quote do not apply to this line item.
       */
      public Builder setTaxRates(List<String> taxRates) {
        this.taxRates = taxRates;
        return this;
      }
    }

    @Getter
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      Object coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      Object discount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Discount(Object coupon, Object discount, Map<String, Object> extraParams) {
        this.coupon = coupon;
        this.discount = discount;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.LineItem.Discount build() {
          return new QuoteUpdateParams.LineItem.Discount(
              this.coupon, this.discount, this.extraParams);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(EmptyParam coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(EmptyParam discount) {
          this.discount = discount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.LineItem.Discount#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.LineItem.Discount#extraParams} for the field
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
    public static class PriceData {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      Object currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the product that this price will belong to. */
      @SerializedName("product")
      Object product;

      /**
       * The recurring components of a price such as {@code interval} and {@code interval_count}.
       */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
       * {@code inclusive} or {@code exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how
       * much to charge.
       */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
       * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
       * unit_amount_decimal} can be set.
       */
      @SerializedName("unit_amount_decimal")
      Object unitAmountDecimal;

      private PriceData(
          Object currency,
          Map<String, Object> extraParams,
          Object product,
          Recurring recurring,
          TaxBehavior taxBehavior,
          Long unitAmount,
          Object unitAmountDecimal) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.product = product;
        this.recurring = recurring;
        this.taxBehavior = taxBehavior;
        this.unitAmount = unitAmount;
        this.unitAmountDecimal = unitAmountDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object currency;

        private Map<String, Object> extraParams;

        private Object product;

        private Recurring recurring;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private Object unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.LineItem.PriceData build() {
          return new QuoteUpdateParams.LineItem.PriceData(
              this.currency,
              this.extraParams,
              this.product,
              this.recurring,
              this.taxBehavior,
              this.unitAmount,
              this.unitAmountDecimal);
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.LineItem.PriceData#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.LineItem.PriceData#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /** The ID of the product that this price will belong to. */
        public Builder setProduct(EmptyParam product) {
          this.product = product;
          return this;
        }

        /**
         * The recurring components of a price such as {@code interval} and {@code interval_count}.
         */
        public Builder setRecurring(QuoteUpdateParams.LineItem.PriceData.Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /**
         * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
         * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
         * {@code inclusive} or {@code exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            QuoteUpdateParams.LineItem.PriceData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
          this.unitAmountDecimal = unitAmountDecimal;
          return this;
        }
      }

      @Getter
      public static class Recurring {
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
         * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
         * year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
         * interval allowed (1 year, 12 months, or 52 weeks).
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Recurring(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
          public QuoteUpdateParams.LineItem.PriceData.Recurring build() {
            return new QuoteUpdateParams.LineItem.PriceData.Recurring(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.LineItem.PriceData.Recurring#extraParams} for the
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
           * map. See {@link QuoteUpdateParams.LineItem.PriceData.Recurring#extraParams} for the
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
           * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
           * year}.
           */
          public Builder setInterval(
              QuoteUpdateParams.LineItem.PriceData.Recurring.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
           * interval allowed (1 year, 12 months, or 52 weeks).
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

      public enum TaxBehavior implements ApiRequestParams.EnumParam {
        @SerializedName("exclusive")
        EXCLUSIVE("exclusive"),

        @SerializedName("inclusive")
        INCLUSIVE("inclusive"),

        @SerializedName("unspecified")
        UNSPECIFIED("unspecified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TaxBehavior(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Phase {
    /**
     * When specified as {@code reset}, the subscription will always start a new billing period when
     * the quote is accepted.
     */
    @SerializedName("billing_cycle_anchor")
    BillingCycleAnchor billingCycleAnchor;

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay the underlying subscription at the end of each billing cycle using
     * the default source attached to the customer. When sending an invoice, Stripe will email your
     * customer an invoice with payment instructions and mark the subscription as {@code active}.
     * Defaults to {@code charge_automatically} on creation.
     */
    @SerializedName("collection_method")
    CollectionMethod collectionMethod;

    /**
     * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
     * will set the Subscription's <a
     * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
     * default_tax_rates}</a>, which means they will be the Invoice's <a
     * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
     * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
     */
    @SerializedName("default_tax_rates")
    Object defaultTaxRates;

    /**
     * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
     * discount from the subscription's customer. Pass an empty string to avoid inheriting any
     * discounts.
     */
    @SerializedName("discounts")
    Object discounts;

    /**
     * The date at which this phase of the quote ends. If set, {@code iterations} must not be set.
     */
    @SerializedName("end_date")
    Long endDate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * Integer representing the multiplier applied to the price interval. For example, {@code
     * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
     * results in a phase of duration {@code 2 * 3 months = 6 months}. If set, {@code end_date} must
     * not be set.
     */
    @SerializedName("iterations")
    Long iterations;

    /**
     * A list of line items the customer is being quoted for within this phase. Each line item
     * includes information about the product, the quantity, and the resulting cost.
     */
    @SerializedName("line_items")
    List<QuoteUpdateParams.Phase.LineItem> lineItems;

    /**
     * If the update changes the current phase, indicates whether the changes should be prorated.
     * The default value is {@code create_prorations}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * If set to true the entire phase is counted as a trial and the customer will not be charged
     * for any fees.
     */
    @SerializedName("trial")
    Boolean trial;

    /**
     * Sets the phase to trialing from the start date to this date. Must be before the phase end
     * date, can not be combined with {@code trial}.
     */
    @SerializedName("trial_end")
    Long trialEnd;

    private Phase(
        BillingCycleAnchor billingCycleAnchor,
        CollectionMethod collectionMethod,
        Object defaultTaxRates,
        Object discounts,
        Long endDate,
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Long iterations,
        List<QuoteUpdateParams.Phase.LineItem> lineItems,
        ProrationBehavior prorationBehavior,
        Boolean trial,
        Long trialEnd) {
      this.billingCycleAnchor = billingCycleAnchor;
      this.collectionMethod = collectionMethod;
      this.defaultTaxRates = defaultTaxRates;
      this.discounts = discounts;
      this.endDate = endDate;
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.iterations = iterations;
      this.lineItems = lineItems;
      this.prorationBehavior = prorationBehavior;
      this.trial = trial;
      this.trialEnd = trialEnd;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingCycleAnchor billingCycleAnchor;

      private CollectionMethod collectionMethod;

      private Object defaultTaxRates;

      private Object discounts;

      private Long endDate;

      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Long iterations;

      private List<QuoteUpdateParams.Phase.LineItem> lineItems;

      private ProrationBehavior prorationBehavior;

      private Boolean trial;

      private Long trialEnd;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.Phase build() {
        return new QuoteUpdateParams.Phase(
            this.billingCycleAnchor,
            this.collectionMethod,
            this.defaultTaxRates,
            this.discounts,
            this.endDate,
            this.extraParams,
            this.invoiceSettings,
            this.iterations,
            this.lineItems,
            this.prorationBehavior,
            this.trial,
            this.trialEnd);
      }

      /**
       * When specified as {@code reset}, the subscription will always start a new billing period
       * when the quote is accepted.
       */
      public Builder setBillingCycleAnchor(
          QuoteUpdateParams.Phase.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
       * Stripe will attempt to pay the underlying subscription at the end of each billing cycle
       * using the default source attached to the customer. When sending an invoice, Stripe will
       * email your customer an invoice with payment instructions and mark the subscription as
       * {@code active}. Defaults to {@code charge_automatically} on creation.
       */
      public Builder setCollectionMethod(
          QuoteUpdateParams.Phase.CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
        return this;
      }

      /**
       * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Phase#defaultTaxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDefaultTaxRate(String element) {
        if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
          this.defaultTaxRates = new ArrayList<String>();
        }
        ((List<String>) this.defaultTaxRates).add(element);
        return this;
      }

      /**
       * Add all elements to `defaultTaxRates` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link QuoteUpdateParams.Phase#defaultTaxRates} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDefaultTaxRate(List<String> elements) {
        if (this.defaultTaxRates == null || this.defaultTaxRates instanceof EmptyParam) {
          this.defaultTaxRates = new ArrayList<String>();
        }
        ((List<String>) this.defaultTaxRates).addAll(elements);
        return this;
      }

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a>, which means they will be the Invoice's <a
       * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
       * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
       */
      public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * A list of <a href="https://stripe.com/docs/api/tax_rates">Tax Rate</a> ids. These Tax Rates
       * will set the Subscription's <a
       * href="https://stripe.com/docs/api/subscriptions/create#create_subscription-default_tax_rates">{@code
       * default_tax_rates}</a>, which means they will be the Invoice's <a
       * href="https://stripe.com/docs/api/invoices/create#create_invoice-default_tax_rates">{@code
       * default_tax_rates}</a> for any Invoices issued by the Subscription during this Phase.
       */
      public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Phase#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(QuoteUpdateParams.Phase.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<QuoteUpdateParams.Phase.Discount>();
        }
        ((List<QuoteUpdateParams.Phase.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Phase#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(List<QuoteUpdateParams.Phase.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<QuoteUpdateParams.Phase.Discount>();
        }
        ((List<QuoteUpdateParams.Phase.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * The coupons to redeem into discounts for the schedule phase. If not specified, inherits the
       * discount from the subscription's customer. Pass an empty string to avoid inheriting any
       * discounts.
       */
      public Builder setDiscounts(List<QuoteUpdateParams.Phase.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * The date at which this phase of the quote ends. If set, {@code iterations} must not be set.
       */
      public Builder setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.Phase#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.Phase#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(QuoteUpdateParams.Phase.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
      }

      /**
       * Integer representing the multiplier applied to the price interval. For example, {@code
       * iterations=2} applied to a price with {@code interval=month} and {@code interval_count=3}
       * results in a phase of duration {@code 2 * 3 months = 6 months}. If set, {@code end_date}
       * must not be set.
       */
      public Builder setIterations(Long iterations) {
        this.iterations = iterations;
        return this;
      }

      /**
       * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Phase#lineItems} for the field documentation.
       */
      public Builder addLineItem(QuoteUpdateParams.Phase.LineItem element) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(element);
        return this;
      }

      /**
       * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Phase#lineItems} for the field documentation.
       */
      public Builder addAllLineItem(List<QuoteUpdateParams.Phase.LineItem> elements) {
        if (this.lineItems == null) {
          this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(elements);
        return this;
      }

      /**
       * If the update changes the current phase, indicates whether the changes should be prorated.
       * The default value is {@code create_prorations}.
       */
      public Builder setProrationBehavior(
          QuoteUpdateParams.Phase.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * If set to true the entire phase is counted as a trial and the customer will not be charged
       * for any fees.
       */
      public Builder setTrial(Boolean trial) {
        this.trial = trial;
        return this;
      }

      /**
       * Sets the phase to trialing from the start date to this date. Must be before the phase end
       * date, can not be combined with {@code trial}.
       */
      public Builder setTrialEnd(Long trialEnd) {
        this.trialEnd = trialEnd;
        return this;
      }
    }

    @Getter
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      Object coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      Object discount;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Discount(Object coupon, Object discount, Map<String, Object> extraParams) {
        this.coupon = coupon;
        this.discount = discount;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Phase.Discount build() {
          return new QuoteUpdateParams.Phase.Discount(this.coupon, this.discount, this.extraParams);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(EmptyParam coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(EmptyParam discount) {
          this.discount = discount;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Phase.Discount#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Phase.Discount#extraParams} for the field
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
    public static class InvoiceSettings {
      /**
       * Number of days within which a customer must pay invoices generated by this subscription
       * schedule. This value will be {@code null} for subscription schedules where {@code
       * billing=charge_automatically}.
       */
      @SerializedName("days_until_due")
      Long daysUntilDue;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InvoiceSettings(Long daysUntilDue, Map<String, Object> extraParams) {
        this.daysUntilDue = daysUntilDue;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long daysUntilDue;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Phase.InvoiceSettings build() {
          return new QuoteUpdateParams.Phase.InvoiceSettings(this.daysUntilDue, this.extraParams);
        }

        /**
         * Number of days within which a customer must pay invoices generated by this subscription
         * schedule. This value will be {@code null} for subscription schedules where {@code
         * billing=charge_automatically}.
         */
        public Builder setDaysUntilDue(Long daysUntilDue) {
          this.daysUntilDue = daysUntilDue;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Phase.InvoiceSettings#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Phase.InvoiceSettings#extraParams} for the field
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
    public static class LineItem {
      /** The discounts applied to this line item. */
      @SerializedName("discounts")
      Object discounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
      @SerializedName("price")
      Object price;

      /**
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      @SerializedName("price_data")
      PriceData priceData;

      /** The quantity of the line item. */
      @SerializedName("quantity")
      Long quantity;

      /**
       * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on the
       * quote do not apply to this line item.
       */
      @SerializedName("tax_rates")
      Object taxRates;

      private LineItem(
          Object discounts,
          Map<String, Object> extraParams,
          Object price,
          PriceData priceData,
          Long quantity,
          Object taxRates) {
        this.discounts = discounts;
        this.extraParams = extraParams;
        this.price = price;
        this.priceData = priceData;
        this.quantity = quantity;
        this.taxRates = taxRates;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object discounts;

        private Map<String, Object> extraParams;

        private Object price;

        private PriceData priceData;

        private Long quantity;

        private Object taxRates;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Phase.LineItem build() {
          return new QuoteUpdateParams.Phase.LineItem(
              this.discounts,
              this.extraParams,
              this.price,
              this.priceData,
              this.quantity,
              this.taxRates);
        }

        /**
         * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Phase.LineItem#discounts} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addDiscount(QuoteUpdateParams.Phase.LineItem.Discount element) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts = new ArrayList<QuoteUpdateParams.Phase.LineItem.Discount>();
          }
          ((List<QuoteUpdateParams.Phase.LineItem.Discount>) this.discounts).add(element);
          return this;
        }

        /**
         * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Phase.LineItem#discounts} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllDiscount(List<QuoteUpdateParams.Phase.LineItem.Discount> elements) {
          if (this.discounts == null || this.discounts instanceof EmptyParam) {
            this.discounts = new ArrayList<QuoteUpdateParams.Phase.LineItem.Discount>();
          }
          ((List<QuoteUpdateParams.Phase.LineItem.Discount>) this.discounts).addAll(elements);
          return this;
        }

        /** The discounts applied to this line item. */
        public Builder setDiscounts(EmptyParam discounts) {
          this.discounts = discounts;
          return this;
        }

        /** The discounts applied to this line item. */
        public Builder setDiscounts(List<QuoteUpdateParams.Phase.LineItem.Discount> discounts) {
          this.discounts = discounts;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Phase.LineItem#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Phase.LineItem#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
        public Builder setPrice(EmptyParam price) {
          this.price = price;
          return this;
        }

        /**
         * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
         * inline. One of {@code price} or {@code price_data} is required.
         */
        public Builder setPriceData(QuoteUpdateParams.Phase.LineItem.PriceData priceData) {
          this.priceData = priceData;
          return this;
        }

        /** The quantity of the line item. */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        /**
         * Add an element to `taxRates` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Phase.LineItem#taxRates} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addTaxRate(String element) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).add(element);
          return this;
        }

        /**
         * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Phase.LineItem#taxRates} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllTaxRate(List<String> elements) {
          if (this.taxRates == null || this.taxRates instanceof EmptyParam) {
            this.taxRates = new ArrayList<String>();
          }
          ((List<String>) this.taxRates).addAll(elements);
          return this;
        }

        /**
         * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on
         * the quote do not apply to this line item.
         */
        public Builder setTaxRates(EmptyParam taxRates) {
          this.taxRates = taxRates;
          return this;
        }

        /**
         * The tax rates which apply to the line item. When set, the {@code default_tax_rates} on
         * the quote do not apply to this line item.
         */
        public Builder setTaxRates(List<String> taxRates) {
          this.taxRates = taxRates;
          return this;
        }
      }

      @Getter
      public static class Discount {
        /** ID of the coupon to create a new discount for. */
        @SerializedName("coupon")
        Object coupon;

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        @SerializedName("discount")
        Object discount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Discount(Object coupon, Object discount, Map<String, Object> extraParams) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Phase.LineItem.Discount build() {
            return new QuoteUpdateParams.Phase.LineItem.Discount(
                this.coupon, this.discount, this.extraParams);
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of the coupon to create a new discount for. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Phase.LineItem.Discount#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Phase.LineItem.Discount#extraParams} for the field
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
      public static class PriceData {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        Object currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the product that this price will belong to. */
        @SerializedName("product")
        Object product;

        /**
         * The recurring components of a price such as {@code interval} and {@code interval_count}.
         */
        @SerializedName("recurring")
        Recurring recurring;

        /**
         * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
         * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
         * {@code inclusive} or {@code exclusive}, it cannot be changed.
         */
        @SerializedName("tax_behavior")
        TaxBehavior taxBehavior;

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
         * how much to charge.
         */
        @SerializedName("unit_amount")
        Long unitAmount;

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
         * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
         * unit_amount_decimal} can be set.
         */
        @SerializedName("unit_amount_decimal")
        Object unitAmountDecimal;

        private PriceData(
            Object currency,
            Map<String, Object> extraParams,
            Object product,
            Recurring recurring,
            TaxBehavior taxBehavior,
            Long unitAmount,
            Object unitAmountDecimal) {
          this.currency = currency;
          this.extraParams = extraParams;
          this.product = product;
          this.recurring = recurring;
          this.taxBehavior = taxBehavior;
          this.unitAmount = unitAmount;
          this.unitAmountDecimal = unitAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object currency;

          private Map<String, Object> extraParams;

          private Object product;

          private Recurring recurring;

          private TaxBehavior taxBehavior;

          private Long unitAmount;

          private Object unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Phase.LineItem.PriceData build() {
            return new QuoteUpdateParams.Phase.LineItem.PriceData(
                this.currency,
                this.extraParams,
                this.product,
                this.recurring,
                this.taxBehavior,
                this.unitAmount,
                this.unitAmountDecimal);
          }

          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Phase.LineItem.PriceData#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Phase.LineItem.PriceData#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of the product that this price will belong to. */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /** The ID of the product that this price will belong to. */
          public Builder setProduct(EmptyParam product) {
            this.product = product;
            return this;
          }

          /**
           * The recurring components of a price such as {@code interval} and {@code
           * interval_count}.
           */
          public Builder setRecurring(
              QuoteUpdateParams.Phase.LineItem.PriceData.Recurring recurring) {
            this.recurring = recurring;
            return this;
          }

          /**
           * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as
           * either {@code inclusive} or {@code exclusive}, it cannot be changed.
           */
          public Builder setTaxBehavior(
              QuoteUpdateParams.Phase.LineItem.PriceData.TaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
            return this;
          }

          /**
           * A positive integer in cents (or local equivalent) (or 0 for a free price) representing
           * how much to charge.
           */
          public Builder setUnitAmount(Long unitAmount) {
            this.unitAmount = unitAmount;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }

          /**
           * Same as {@code unit_amount}, but accepts a decimal value in cents (or local equivalent)
           * with at most 12 decimal places. Only one of {@code unit_amount} and {@code
           * unit_amount_decimal} can be set.
           */
          public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }
        }

        @Getter
        public static class Recurring {
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
           * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
           * year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one year
           * interval allowed (1 year, 12 months, or 52 weeks).
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Recurring(
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
            public QuoteUpdateParams.Phase.LineItem.PriceData.Recurring build() {
              return new QuoteUpdateParams.Phase.LineItem.PriceData.Recurring(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.Phase.LineItem.PriceData.Recurring#extraParams} for the field
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
             * QuoteUpdateParams.Phase.LineItem.PriceData.Recurring#extraParams} for the field
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
             * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or
             * {@code year}.
             */
            public Builder setInterval(
                QuoteUpdateParams.Phase.LineItem.PriceData.Recurring.Interval interval) {
              this.interval = interval;
              return this;
            }

            /**
             * The number of intervals between subscription billings. For example, {@code
             * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of one
             * year interval allowed (1 year, 12 months, or 52 weeks).
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

        public enum TaxBehavior implements ApiRequestParams.EnumParam {
          @SerializedName("exclusive")
          EXCLUSIVE("exclusive"),

          @SerializedName("inclusive")
          INCLUSIVE("inclusive"),

          @SerializedName("unspecified")
          UNSPECIFIED("unspecified");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TaxBehavior(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
      @SerializedName("reset")
      RESET("reset");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
        this.value = value;
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

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("always_invoice")
      ALWAYS_INVOICE("always_invoice"),

      @SerializedName("create_prorations")
      CREATE_PRORATIONS("create_prorations"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class SubscriptionData {
    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time.{@code prorate_up_front} will bill for all
     * phases within the current billing cycle up front.
     */
    @SerializedName("billing_behavior")
    BillingBehavior billingBehavior;

    /**
     * When specified as {@code reset}, the subscription will always start a new billing period when
     * the quote is accepted.
     */
    @SerializedName("billing_cycle_anchor")
    ApiRequestParams.EnumParam billingCycleAnchor;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription.
     */
    @SerializedName("description")
    Object description;

    /**
     * When creating a new subscription, the date of which the subscription schedule will start
     * after the quote is accepted. When updating a subscription, the date of which the subscription
     * will be updated using a subscription schedule. The special value {@code current_period_end}
     * can be provided to update a subscription at the end of its current period. The {@code
     * effective_date} is ignored if it is in the past when the quote is accepted.
     */
    @SerializedName("effective_date")
    Object effectiveDate;

    /**
     * Configures how the subscription schedule behaves when it ends. Possible values are {@code
     * release} or {@code cancel} with the default being {@code release}. {@code release} will end
     * the subscription schedule and keep the underlying subscription running.{@code cancel} will
     * end the subscription schedule and cancel the underlying subscription.
     */
    @SerializedName("end_behavior")
    EndBehavior endBehavior;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If specified, the invoicing for the given billing cycle iterations will be processed when the
     * quote is accepted. Cannot be used with {@code effective_date}.
     */
    @SerializedName("prebilling")
    Object prebilling;

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a>. When
     * creating a subscription, valid values are {@code create_prorations} or {@code none}.
     *
     * <p>When updating a subscription, valid values are {@code create_prorations}, {@code none}, or
     * {@code always_invoice}.
     *
     * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
     * applicable. These proration items will only be invoiced immediately under <a
     * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
     * conditions</a>. In order to always invoice immediately for prorations, pass {@code
     * always_invoice}.
     *
     * <p>Prorations can be disabled by passing {@code none}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.
     */
    @SerializedName("trial_period_days")
    Object trialPeriodDays;

    private SubscriptionData(
        BillingBehavior billingBehavior,
        ApiRequestParams.EnumParam billingCycleAnchor,
        Object description,
        Object effectiveDate,
        EndBehavior endBehavior,
        Map<String, Object> extraParams,
        Object prebilling,
        ProrationBehavior prorationBehavior,
        Object trialPeriodDays) {
      this.billingBehavior = billingBehavior;
      this.billingCycleAnchor = billingCycleAnchor;
      this.description = description;
      this.effectiveDate = effectiveDate;
      this.endBehavior = endBehavior;
      this.extraParams = extraParams;
      this.prebilling = prebilling;
      this.prorationBehavior = prorationBehavior;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingBehavior billingBehavior;

      private ApiRequestParams.EnumParam billingCycleAnchor;

      private Object description;

      private Object effectiveDate;

      private EndBehavior endBehavior;

      private Map<String, Object> extraParams;

      private Object prebilling;

      private ProrationBehavior prorationBehavior;

      private Object trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.SubscriptionData build() {
        return new QuoteUpdateParams.SubscriptionData(
            this.billingBehavior,
            this.billingCycleAnchor,
            this.description,
            this.effectiveDate,
            this.endBehavior,
            this.extraParams,
            this.prebilling,
            this.prorationBehavior,
            this.trialPeriodDays);
      }

      /**
       * Configures when the subscription schedule generates prorations for phase transitions.
       * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
       * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
       * changes and generate prorations at transition time.{@code prorate_up_front} will bill for
       * all phases within the current billing cycle up front.
       */
      public Builder setBillingBehavior(
          QuoteUpdateParams.SubscriptionData.BillingBehavior billingBehavior) {
        this.billingBehavior = billingBehavior;
        return this;
      }

      /**
       * When specified as {@code reset}, the subscription will always start a new billing period
       * when the quote is accepted.
       */
      public Builder setBillingCycleAnchor(
          QuoteUpdateParams.SubscriptionData.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * When specified as {@code reset}, the subscription will always start a new billing period
       * when the quote is accepted.
       */
      public Builder setBillingCycleAnchor(EmptyParam billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription.
       */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /**
       * When creating a new subscription, the date of which the subscription schedule will start
       * after the quote is accepted. When updating a subscription, the date of which the
       * subscription will be updated using a subscription schedule. The special value {@code
       * current_period_end} can be provided to update a subscription at the end of its current
       * period. The {@code effective_date} is ignored if it is in the past when the quote is
       * accepted.
       */
      public Builder setEffectiveDate(
          QuoteUpdateParams.SubscriptionData.EffectiveDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
      }

      /**
       * When creating a new subscription, the date of which the subscription schedule will start
       * after the quote is accepted. When updating a subscription, the date of which the
       * subscription will be updated using a subscription schedule. The special value {@code
       * current_period_end} can be provided to update a subscription at the end of its current
       * period. The {@code effective_date} is ignored if it is in the past when the quote is
       * accepted.
       */
      public Builder setEffectiveDate(Long effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
      }

      /**
       * When creating a new subscription, the date of which the subscription schedule will start
       * after the quote is accepted. When updating a subscription, the date of which the
       * subscription will be updated using a subscription schedule. The special value {@code
       * current_period_end} can be provided to update a subscription at the end of its current
       * period. The {@code effective_date} is ignored if it is in the past when the quote is
       * accepted.
       */
      public Builder setEffectiveDate(EmptyParam effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
      }

      /**
       * Configures how the subscription schedule behaves when it ends. Possible values are {@code
       * release} or {@code cancel} with the default being {@code release}. {@code release} will end
       * the subscription schedule and keep the underlying subscription running.{@code cancel} will
       * end the subscription schedule and cancel the underlying subscription.
       */
      public Builder setEndBehavior(QuoteUpdateParams.SubscriptionData.EndBehavior endBehavior) {
        this.endBehavior = endBehavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.SubscriptionData#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * If specified, the invoicing for the given billing cycle iterations will be processed when
       * the quote is accepted. Cannot be used with {@code effective_date}.
       */
      public Builder setPrebilling(QuoteUpdateParams.SubscriptionData.Prebilling prebilling) {
        this.prebilling = prebilling;
        return this;
      }

      /**
       * If specified, the invoicing for the given billing cycle iterations will be processed when
       * the quote is accepted. Cannot be used with {@code effective_date}.
       */
      public Builder setPrebilling(EmptyParam prebilling) {
        this.prebilling = prebilling;
        return this;
      }

      /**
       * Determines how to handle <a
       * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a>. When
       * creating a subscription, valid values are {@code create_prorations} or {@code none}.
       *
       * <p>When updating a subscription, valid values are {@code create_prorations}, {@code none},
       * or {@code always_invoice}.
       *
       * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
       * applicable. These proration items will only be invoiced immediately under <a
       * href="https://stripe.com/docs/subscriptions/upgrading-downgrading#immediate-payment">certain
       * conditions</a>. In order to always invoice immediately for prorations, pass {@code
       * always_invoice}.
       *
       * <p>Prorations can be disabled by passing {@code none}.
       */
      public Builder setProrationBehavior(
          QuoteUpdateParams.SubscriptionData.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time.
       */
      public Builder setTrialPeriodDays(EmptyParam trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }
    }

    @Getter
    public static class Prebilling {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** This is used to determine the number of billing cycles to prebill. */
      @SerializedName("iterations")
      Long iterations;

      private Prebilling(Map<String, Object> extraParams, Long iterations) {
        this.extraParams = extraParams;
        this.iterations = iterations;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long iterations;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.SubscriptionData.Prebilling build() {
          return new QuoteUpdateParams.SubscriptionData.Prebilling(
              this.extraParams, this.iterations);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.SubscriptionData.Prebilling#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.SubscriptionData.Prebilling#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This is used to determine the number of billing cycles to prebill. */
        public Builder setIterations(Long iterations) {
          this.iterations = iterations;
          return this;
        }
      }
    }

    public enum BillingBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("prorate_on_next_phase")
      PRORATE_ON_NEXT_PHASE("prorate_on_next_phase"),

      @SerializedName("prorate_up_front")
      PRORATE_UP_FRONT("prorate_up_front");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingBehavior(String value) {
        this.value = value;
      }
    }

    public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
      @SerializedName("reset")
      RESET("reset");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
        this.value = value;
      }
    }

    public enum EffectiveDate implements ApiRequestParams.EnumParam {
      @SerializedName("current_period_end")
      CURRENT_PERIOD_END("current_period_end");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EffectiveDate(String value) {
        this.value = value;
      }
    }

    public enum EndBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("cancel")
      CANCEL("cancel"),

      @SerializedName("release")
      RELEASE("release");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EndBehavior(String value) {
        this.value = value;
      }
    }

    public enum ProrationBehavior implements ApiRequestParams.EnumParam {
      @SerializedName("always_invoice")
      ALWAYS_INVOICE("always_invoice"),

      @SerializedName("create_prorations")
      CREATE_PRORATIONS("create_prorations"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ProrationBehavior(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class TransferData {
    /**
     * The amount that will be transferred automatically when the invoice is paid. If no amount is
     * set, the full amount is transferred. There cannot be any line items with recurring prices
     * when using this field.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * destination account. By default, the entire amount is transferred to the destination. There
     * must be at least 1 line item with a recurring price to use this field.
     */
    @SerializedName("amount_percent")
    BigDecimal amountPercent;

    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    Object destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(
        Long amount,
        BigDecimal amountPercent,
        Object destination,
        Map<String, Object> extraParams) {
      this.amount = amount;
      this.amountPercent = amountPercent;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private BigDecimal amountPercent;

      private Object destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.TransferData build() {
        return new QuoteUpdateParams.TransferData(
            this.amount, this.amountPercent, this.destination, this.extraParams);
      }

      /**
       * The amount that will be transferred automatically when the invoice is paid. If no amount is
       * set, the full amount is transferred. There cannot be any line items with recurring prices
       * when using this field.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
       * the percentage of the subscription invoice subtotal that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination. There
       * must be at least 1 line item with a recurring price to use this field.
       */
      public Builder setAmountPercent(BigDecimal amountPercent) {
        this.amountPercent = amountPercent;
        return this;
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(EmptyParam destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.TransferData#extraParams} for the field documentation.
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

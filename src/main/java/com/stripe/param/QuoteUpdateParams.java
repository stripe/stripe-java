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
   * Set to true to allow quote lines to have {@code starts_at} in the past if collection is paused
   * between {@code starts_at} and now.
   */
  @SerializedName("allow_backdated_lines")
  Boolean allowBackdatedLines;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. There cannot be any line items with
   * recurring prices when using this field.
   */
  @SerializedName("application_fee_amount")
  Object applicationFeeAmount;

  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice total that will be transferred to the application
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
   * A list of <a href="https://docs.stripe.com/api/quote_lines">quote lines</a> on the quote. These
   * lines describe changes, in the order provided, that will be used to create new subscription
   * schedules or update existing subscription schedules when the quote is accepted.
   */
  @SerializedName("lines")
  List<QuoteUpdateParams.Line> lines;

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

  /**
   * List representing overrides for {@code subscription_data} configurations for specific
   * subscription schedules.
   */
  @SerializedName("subscription_data_overrides")
  Object subscriptionDataOverrides;

  /** The data with which to automatically create a Transfer for each of the invoices. */
  @SerializedName("transfer_data")
  Object transferData;

  private QuoteUpdateParams(
      Boolean allowBackdatedLines,
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
      List<QuoteUpdateParams.Line> lines,
      Map<String, String> metadata,
      Object onBehalfOf,
      List<QuoteUpdateParams.Phase> phases,
      SubscriptionData subscriptionData,
      Object subscriptionDataOverrides,
      Object transferData) {
    this.allowBackdatedLines = allowBackdatedLines;
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
    this.lines = lines;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.phases = phases;
    this.subscriptionData = subscriptionData;
    this.subscriptionDataOverrides = subscriptionDataOverrides;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean allowBackdatedLines;

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

    private List<QuoteUpdateParams.Line> lines;

    private Map<String, String> metadata;

    private Object onBehalfOf;

    private List<QuoteUpdateParams.Phase> phases;

    private SubscriptionData subscriptionData;

    private Object subscriptionDataOverrides;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public QuoteUpdateParams build() {
      return new QuoteUpdateParams(
          this.allowBackdatedLines,
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
          this.lines,
          this.metadata,
          this.onBehalfOf,
          this.phases,
          this.subscriptionData,
          this.subscriptionDataOverrides,
          this.transferData);
    }

    /**
     * Set to true to allow quote lines to have {@code starts_at} in the past if collection is
     * paused between {@code starts_at} and now.
     */
    public Builder setAllowBackdatedLines(Boolean allowBackdatedLines) {
      this.allowBackdatedLines = allowBackdatedLines;
      return this;
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
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. There must be at least 1 line item with a recurring price to use this
     * field.
     */
    public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
      this.applicationFeePercent = applicationFeePercent;
      return this;
    }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. There must be at least 1 line item with a recurring price to use this
     * field.
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
     * Add an element to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#lines} for the field documentation.
     */
    public Builder addLine(QuoteUpdateParams.Line element) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.add(element);
      return this;
    }

    /**
     * Add all elements to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteUpdateParams#lines} for the field documentation.
     */
    public Builder addAllLine(List<QuoteUpdateParams.Line> elements) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.addAll(elements);
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

    /**
     * Add an element to `subscriptionDataOverrides` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link QuoteUpdateParams#subscriptionDataOverrides} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addSubscriptionDataOverride(QuoteUpdateParams.SubscriptionDataOverride element) {
      if (this.subscriptionDataOverrides == null
          || this.subscriptionDataOverrides instanceof EmptyParam) {
        this.subscriptionDataOverrides =
            new ArrayList<QuoteUpdateParams.SubscriptionDataOverride>();
      }
      ((List<QuoteUpdateParams.SubscriptionDataOverride>) this.subscriptionDataOverrides)
          .add(element);
      return this;
    }

    /**
     * Add all elements to `subscriptionDataOverrides` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link QuoteUpdateParams#subscriptionDataOverrides} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllSubscriptionDataOverride(
        List<QuoteUpdateParams.SubscriptionDataOverride> elements) {
      if (this.subscriptionDataOverrides == null
          || this.subscriptionDataOverrides instanceof EmptyParam) {
        this.subscriptionDataOverrides =
            new ArrayList<QuoteUpdateParams.SubscriptionDataOverride>();
      }
      ((List<QuoteUpdateParams.SubscriptionDataOverride>) this.subscriptionDataOverrides)
          .addAll(elements);
      return this;
    }

    /**
     * List representing overrides for {@code subscription_data} configurations for specific
     * subscription schedules.
     */
    public Builder setSubscriptionDataOverrides(EmptyParam subscriptionDataOverrides) {
      this.subscriptionDataOverrides = subscriptionDataOverrides;
      return this;
    }

    /**
     * List representing overrides for {@code subscription_data} configurations for specific
     * subscription schedules.
     */
    public Builder setSubscriptionDataOverrides(
        List<QuoteUpdateParams.SubscriptionDataOverride> subscriptionDataOverrides) {
      this.subscriptionDataOverrides = subscriptionDataOverrides;
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
     * <strong>Required.</strong> Controls whether Stripe will automatically compute tax on the
     * resulting invoices or subscriptions as well as the quote itself.
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

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams, Liability liability) {
      this.enabled = enabled;
      this.extraParams = extraParams;
      this.liability = liability;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      private Liability liability;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.AutomaticTax build() {
        return new QuoteUpdateParams.AutomaticTax(this.enabled, this.extraParams, this.liability);
      }

      /**
       * <strong>Required.</strong> Controls whether Stripe will automatically compute tax on the
       * resulting invoices or subscriptions as well as the quote itself.
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

      /**
       * The account that's liable for tax. If set, the business address and tax registrations
       * required to perform the tax calculation are loaded from this account. The tax transaction
       * is returned in the report of the connected account.
       */
      public Builder setLiability(QuoteUpdateParams.AutomaticTax.Liability liability) {
        this.liability = liability;
        return this;
      }
    }

    @Getter
    public static class Liability {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      Object account;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      @SerializedName("type")
      Type type;

      private Liability(Object account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.AutomaticTax.Liability build() {
          return new QuoteUpdateParams.AutomaticTax.Liability(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(EmptyParam account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.AutomaticTax.Liability#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.AutomaticTax.Liability#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        public Builder setType(QuoteUpdateParams.AutomaticTax.Liability.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("account")
        ACCOUNT("account"),

        @SerializedName("self")
        SELF("self");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
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

    /** Details to determine how long the discount should be applied for. */
    @SerializedName("discount_end")
    DiscountEnd discountEnd;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of the promotion code to create a new discount for. */
    @SerializedName("promotion_code")
    Object promotionCode;

    private Discount(
        Object coupon,
        Object discount,
        DiscountEnd discountEnd,
        Map<String, Object> extraParams,
        Object promotionCode) {
      this.coupon = coupon;
      this.discount = discount;
      this.discountEnd = discountEnd;
      this.extraParams = extraParams;
      this.promotionCode = promotionCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object coupon;

      private Object discount;

      private DiscountEnd discountEnd;

      private Map<String, Object> extraParams;

      private Object promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.Discount build() {
        return new QuoteUpdateParams.Discount(
            this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
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

      /** Details to determine how long the discount should be applied for. */
      public Builder setDiscountEnd(QuoteUpdateParams.Discount.DiscountEnd discountEnd) {
        this.discountEnd = discountEnd;
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

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }

      /** ID of the promotion code to create a new discount for. */
      public Builder setPromotionCode(EmptyParam promotionCode) {
        this.promotionCode = promotionCode;
        return this;
      }
    }

    @Getter
    public static class DiscountEnd {
      /** Time span for the redeemed discount. */
      @SerializedName("duration")
      Duration duration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A precise Unix timestamp for the discount to end. Must be in the future. */
      @SerializedName("timestamp")
      Long timestamp;

      /**
       * <strong>Required.</strong> The type of calculation made to determine when the discount
       * ends.
       */
      @SerializedName("type")
      Type type;

      private DiscountEnd(
          Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Discount.DiscountEnd build() {
          return new QuoteUpdateParams.Discount.DiscountEnd(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Time span for the redeemed discount. */
        public Builder setDuration(QuoteUpdateParams.Discount.DiscountEnd.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Discount.DiscountEnd#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Discount.DiscountEnd#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        public Builder setType(QuoteUpdateParams.Discount.DiscountEnd.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Duration {
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
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
         * Stripe multiplies this by the interval type to get the overall duration.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
          public QuoteUpdateParams.Discount.DiscountEnd.Duration build() {
            return new QuoteUpdateParams.Discount.DiscountEnd.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Discount.DiscountEnd.Duration#extraParams} for the
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
           * map. See {@link QuoteUpdateParams.Discount.DiscountEnd.Duration#extraParams} for the
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              QuoteUpdateParams.Discount.DiscountEnd.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
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

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
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

    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and
     * support information of the specified account.
     */
    @SerializedName("issuer")
    Issuer issuer;

    private InvoiceSettings(Long daysUntilDue, Map<String, Object> extraParams, Issuer issuer) {
      this.daysUntilDue = daysUntilDue;
      this.extraParams = extraParams;
      this.issuer = issuer;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long daysUntilDue;

      private Map<String, Object> extraParams;

      private Issuer issuer;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.InvoiceSettings build() {
        return new QuoteUpdateParams.InvoiceSettings(
            this.daysUntilDue, this.extraParams, this.issuer);
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

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      public Builder setIssuer(QuoteUpdateParams.InvoiceSettings.Issuer issuer) {
        this.issuer = issuer;
        return this;
      }
    }

    @Getter
    public static class Issuer {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      Object account;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      @SerializedName("type")
      Type type;

      private Issuer(Object account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.InvoiceSettings.Issuer build() {
          return new QuoteUpdateParams.InvoiceSettings.Issuer(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(EmptyParam account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.InvoiceSettings.Issuer#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.InvoiceSettings.Issuer#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        public Builder setType(QuoteUpdateParams.InvoiceSettings.Issuer.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("account")
        ACCOUNT("account"),

        @SerializedName("self")
        SELF("self");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Line {
    /** An array of operations the quote line performs. */
    @SerializedName("actions")
    List<QuoteUpdateParams.Line.Action> actions;

    /** Details to identify the subscription schedule the quote line applies to. */
    @SerializedName("applies_to")
    AppliesTo appliesTo;

    /**
     * For a point-in-time operation, this attribute lets you set or update whether the
     * subscription's billing cycle anchor is reset at the {@code starts_at} timestamp.
     */
    @SerializedName("billing_cycle_anchor")
    BillingCycleAnchor billingCycleAnchor;

    /**
     * A point-in-time operation that cancels an existing subscription schedule at the line's
     * starts_at timestamp. Currently only compatible with {@code quote_acceptance_date} for {@code
     * starts_at}. When using cancel_subscription_schedule, the subscription schedule on the quote
     * remains unalterable, except for modifications to the metadata, collection_method or
     * invoice_settings.
     */
    @SerializedName("cancel_subscription_schedule")
    CancelSubscriptionSchedule cancelSubscriptionSchedule;

    /**
     * Details to identify the end of the time range modified by the proposed change. If not
     * supplied, the quote line is considered a point-in-time operation that only affects the exact
     * timestamp at {@code starts_at}, and a restricted set of attributes is supported on the quote
     * line.
     */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of an existing line on the quote. */
    @SerializedName("id")
    Object id;

    /**
     * Changes to how Stripe handles prorations during the quote line's time span. Affects if and
     * how prorations are created when a future phase starts.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    /**
     * Defines how to pause collection for the underlying subscription throughout the duration of
     * the amendment.
     */
    @SerializedName("set_pause_collection")
    SetPauseCollection setPauseCollection;

    /**
     * Timestamp helper to end the underlying schedule early, based on the acompanying line's start
     * or end date.
     */
    @SerializedName("set_schedule_end")
    SetScheduleEnd setScheduleEnd;

    /** Details to identify the earliest timestamp where the proposed change should take effect. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /** Settings related to subscription trials. */
    @SerializedName("trial_settings")
    TrialSettings trialSettings;

    private Line(
        List<QuoteUpdateParams.Line.Action> actions,
        AppliesTo appliesTo,
        BillingCycleAnchor billingCycleAnchor,
        CancelSubscriptionSchedule cancelSubscriptionSchedule,
        EndsAt endsAt,
        Map<String, Object> extraParams,
        Object id,
        ProrationBehavior prorationBehavior,
        SetPauseCollection setPauseCollection,
        SetScheduleEnd setScheduleEnd,
        StartsAt startsAt,
        TrialSettings trialSettings) {
      this.actions = actions;
      this.appliesTo = appliesTo;
      this.billingCycleAnchor = billingCycleAnchor;
      this.cancelSubscriptionSchedule = cancelSubscriptionSchedule;
      this.endsAt = endsAt;
      this.extraParams = extraParams;
      this.id = id;
      this.prorationBehavior = prorationBehavior;
      this.setPauseCollection = setPauseCollection;
      this.setScheduleEnd = setScheduleEnd;
      this.startsAt = startsAt;
      this.trialSettings = trialSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<QuoteUpdateParams.Line.Action> actions;

      private AppliesTo appliesTo;

      private BillingCycleAnchor billingCycleAnchor;

      private CancelSubscriptionSchedule cancelSubscriptionSchedule;

      private EndsAt endsAt;

      private Map<String, Object> extraParams;

      private Object id;

      private ProrationBehavior prorationBehavior;

      private SetPauseCollection setPauseCollection;

      private SetScheduleEnd setScheduleEnd;

      private StartsAt startsAt;

      private TrialSettings trialSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.Line build() {
        return new QuoteUpdateParams.Line(
            this.actions,
            this.appliesTo,
            this.billingCycleAnchor,
            this.cancelSubscriptionSchedule,
            this.endsAt,
            this.extraParams,
            this.id,
            this.prorationBehavior,
            this.setPauseCollection,
            this.setScheduleEnd,
            this.startsAt,
            this.trialSettings);
      }

      /**
       * Add an element to `actions` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Line#actions} for the field documentation.
       */
      public Builder addAction(QuoteUpdateParams.Line.Action element) {
        if (this.actions == null) {
          this.actions = new ArrayList<>();
        }
        this.actions.add(element);
        return this;
      }

      /**
       * Add all elements to `actions` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteUpdateParams.Line#actions} for the field documentation.
       */
      public Builder addAllAction(List<QuoteUpdateParams.Line.Action> elements) {
        if (this.actions == null) {
          this.actions = new ArrayList<>();
        }
        this.actions.addAll(elements);
        return this;
      }

      /** Details to identify the subscription schedule the quote line applies to. */
      public Builder setAppliesTo(QuoteUpdateParams.Line.AppliesTo appliesTo) {
        this.appliesTo = appliesTo;
        return this;
      }

      /**
       * For a point-in-time operation, this attribute lets you set or update whether the
       * subscription's billing cycle anchor is reset at the {@code starts_at} timestamp.
       */
      public Builder setBillingCycleAnchor(
          QuoteUpdateParams.Line.BillingCycleAnchor billingCycleAnchor) {
        this.billingCycleAnchor = billingCycleAnchor;
        return this;
      }

      /**
       * A point-in-time operation that cancels an existing subscription schedule at the line's
       * starts_at timestamp. Currently only compatible with {@code quote_acceptance_date} for
       * {@code starts_at}. When using cancel_subscription_schedule, the subscription schedule on
       * the quote remains unalterable, except for modifications to the metadata, collection_method
       * or invoice_settings.
       */
      public Builder setCancelSubscriptionSchedule(
          QuoteUpdateParams.Line.CancelSubscriptionSchedule cancelSubscriptionSchedule) {
        this.cancelSubscriptionSchedule = cancelSubscriptionSchedule;
        return this;
      }

      /**
       * Details to identify the end of the time range modified by the proposed change. If not
       * supplied, the quote line is considered a point-in-time operation that only affects the
       * exact timestamp at {@code starts_at}, and a restricted set of attributes is supported on
       * the quote line.
       */
      public Builder setEndsAt(QuoteUpdateParams.Line.EndsAt endsAt) {
        this.endsAt = endsAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.Line#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.Line#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of an existing line on the quote. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The ID of an existing line on the quote. */
      public Builder setId(EmptyParam id) {
        this.id = id;
        return this;
      }

      /**
       * Changes to how Stripe handles prorations during the quote line's time span. Affects if and
       * how prorations are created when a future phase starts.
       */
      public Builder setProrationBehavior(
          QuoteUpdateParams.Line.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * Defines how to pause collection for the underlying subscription throughout the duration of
       * the amendment.
       */
      public Builder setSetPauseCollection(
          QuoteUpdateParams.Line.SetPauseCollection setPauseCollection) {
        this.setPauseCollection = setPauseCollection;
        return this;
      }

      /**
       * Timestamp helper to end the underlying schedule early, based on the acompanying line's
       * start or end date.
       */
      public Builder setSetScheduleEnd(QuoteUpdateParams.Line.SetScheduleEnd setScheduleEnd) {
        this.setScheduleEnd = setScheduleEnd;
        return this;
      }

      /**
       * Details to identify the earliest timestamp where the proposed change should take effect.
       */
      public Builder setStartsAt(QuoteUpdateParams.Line.StartsAt startsAt) {
        this.startsAt = startsAt;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(QuoteUpdateParams.Line.TrialSettings trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }
    }

    @Getter
    public static class Action {
      /** Details for the {@code add_discount} type. */
      @SerializedName("add_discount")
      AddDiscount addDiscount;

      /** Details for the {@code add_item} type. */
      @SerializedName("add_item")
      AddItem addItem;

      /** Details for the {@code add_metadata} type: specify a hash of key-value pairs. */
      @SerializedName("add_metadata")
      Map<String, String> addMetadata;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details for the {@code remove_discount} type. */
      @SerializedName("remove_discount")
      RemoveDiscount removeDiscount;

      /** Details for the {@code remove_item} type. */
      @SerializedName("remove_item")
      RemoveItem removeItem;

      /** Details for the {@code remove_metadata} type: specify an array of metadata keys. */
      @SerializedName("remove_metadata")
      List<String> removeMetadata;

      /** Details for the {@code set_discounts} type. */
      @SerializedName("set_discounts")
      List<QuoteUpdateParams.Line.Action.SetDiscount> setDiscounts;

      /** Details for the {@code set_items} type. */
      @SerializedName("set_items")
      List<QuoteUpdateParams.Line.Action.SetItem> setItems;

      /** Details for the {@code set_metadata} type: specify an array of key-value pairs. */
      @SerializedName("set_metadata")
      Object setMetadata;

      /** <strong>Required.</strong> The type of action the quote line performs. */
      @SerializedName("type")
      Type type;

      private Action(
          AddDiscount addDiscount,
          AddItem addItem,
          Map<String, String> addMetadata,
          Map<String, Object> extraParams,
          RemoveDiscount removeDiscount,
          RemoveItem removeItem,
          List<String> removeMetadata,
          List<QuoteUpdateParams.Line.Action.SetDiscount> setDiscounts,
          List<QuoteUpdateParams.Line.Action.SetItem> setItems,
          Object setMetadata,
          Type type) {
        this.addDiscount = addDiscount;
        this.addItem = addItem;
        this.addMetadata = addMetadata;
        this.extraParams = extraParams;
        this.removeDiscount = removeDiscount;
        this.removeItem = removeItem;
        this.removeMetadata = removeMetadata;
        this.setDiscounts = setDiscounts;
        this.setItems = setItems;
        this.setMetadata = setMetadata;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AddDiscount addDiscount;

        private AddItem addItem;

        private Map<String, String> addMetadata;

        private Map<String, Object> extraParams;

        private RemoveDiscount removeDiscount;

        private RemoveItem removeItem;

        private List<String> removeMetadata;

        private List<QuoteUpdateParams.Line.Action.SetDiscount> setDiscounts;

        private List<QuoteUpdateParams.Line.Action.SetItem> setItems;

        private Object setMetadata;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.Action build() {
          return new QuoteUpdateParams.Line.Action(
              this.addDiscount,
              this.addItem,
              this.addMetadata,
              this.extraParams,
              this.removeDiscount,
              this.removeItem,
              this.removeMetadata,
              this.setDiscounts,
              this.setItems,
              this.setMetadata,
              this.type);
        }

        /** Details for the {@code add_discount} type. */
        public Builder setAddDiscount(QuoteUpdateParams.Line.Action.AddDiscount addDiscount) {
          this.addDiscount = addDiscount;
          return this;
        }

        /** Details for the {@code add_item} type. */
        public Builder setAddItem(QuoteUpdateParams.Line.Action.AddItem addItem) {
          this.addItem = addItem;
          return this;
        }

        /**
         * Add a key/value pair to `addMetadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.Action#addMetadata} for the field documentation.
         */
        public Builder putAddMetadata(String key, String value) {
          if (this.addMetadata == null) {
            this.addMetadata = new HashMap<>();
          }
          this.addMetadata.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `addMetadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.Action#addMetadata} for the field documentation.
         */
        public Builder putAllAddMetadata(Map<String, String> map) {
          if (this.addMetadata == null) {
            this.addMetadata = new HashMap<>();
          }
          this.addMetadata.putAll(map);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.Action#extraParams} for the field documentation.
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
         * map. See {@link QuoteUpdateParams.Line.Action#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details for the {@code remove_discount} type. */
        public Builder setRemoveDiscount(
            QuoteUpdateParams.Line.Action.RemoveDiscount removeDiscount) {
          this.removeDiscount = removeDiscount;
          return this;
        }

        /** Details for the {@code remove_item} type. */
        public Builder setRemoveItem(QuoteUpdateParams.Line.Action.RemoveItem removeItem) {
          this.removeItem = removeItem;
          return this;
        }

        /**
         * Add an element to `removeMetadata` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Line.Action#removeMetadata} for the field documentation.
         */
        public Builder addRemoveMetadata(String element) {
          if (this.removeMetadata == null) {
            this.removeMetadata = new ArrayList<>();
          }
          this.removeMetadata.add(element);
          return this;
        }

        /**
         * Add all elements to `removeMetadata` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link QuoteUpdateParams.Line.Action#removeMetadata} for the field documentation.
         */
        public Builder addAllRemoveMetadata(List<String> elements) {
          if (this.removeMetadata == null) {
            this.removeMetadata = new ArrayList<>();
          }
          this.removeMetadata.addAll(elements);
          return this;
        }

        /**
         * Add an element to `setDiscounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Line.Action#setDiscounts} for the field documentation.
         */
        public Builder addSetDiscount(QuoteUpdateParams.Line.Action.SetDiscount element) {
          if (this.setDiscounts == null) {
            this.setDiscounts = new ArrayList<>();
          }
          this.setDiscounts.add(element);
          return this;
        }

        /**
         * Add all elements to `setDiscounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Line.Action#setDiscounts} for the field documentation.
         */
        public Builder addAllSetDiscount(List<QuoteUpdateParams.Line.Action.SetDiscount> elements) {
          if (this.setDiscounts == null) {
            this.setDiscounts = new ArrayList<>();
          }
          this.setDiscounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `setItems` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Line.Action#setItems} for the field documentation.
         */
        public Builder addSetItem(QuoteUpdateParams.Line.Action.SetItem element) {
          if (this.setItems == null) {
            this.setItems = new ArrayList<>();
          }
          this.setItems.add(element);
          return this;
        }

        /**
         * Add all elements to `setItems` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteUpdateParams.Line.Action#setItems} for the field documentation.
         */
        public Builder addAllSetItem(List<QuoteUpdateParams.Line.Action.SetItem> elements) {
          if (this.setItems == null) {
            this.setItems = new ArrayList<>();
          }
          this.setItems.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `setMetadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.Action#setMetadata} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putSetMetadata(String key, String value) {
          if (this.setMetadata == null || this.setMetadata instanceof EmptyParam) {
            this.setMetadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.setMetadata).put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `setMetadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.Action#setMetadata} for the field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putAllSetMetadata(Map<String, String> map) {
          if (this.setMetadata == null || this.setMetadata instanceof EmptyParam) {
            this.setMetadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.setMetadata).putAll(map);
          return this;
        }

        /** Details for the {@code set_metadata} type: specify an array of key-value pairs. */
        public Builder setSetMetadata(EmptyParam setMetadata) {
          this.setMetadata = setMetadata;
          return this;
        }

        /** Details for the {@code set_metadata} type: specify an array of key-value pairs. */
        public Builder setSetMetadata(Map<String, String> setMetadata) {
          this.setMetadata = setMetadata;
          return this;
        }

        /** <strong>Required.</strong> The type of action the quote line performs. */
        public Builder setType(QuoteUpdateParams.Line.Action.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class AddDiscount {
        /** The coupon code to redeem. */
        @SerializedName("coupon")
        Object coupon;

        /** An ID of an existing discount for a coupon that was already redeemed. */
        @SerializedName("discount")
        Object discount;

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

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
         * The index, starting at 0, at which to position the new discount. When not supplied,
         * Stripe defaults to appending the discount to the end of the {@code discounts} array.
         */
        @SerializedName("index")
        Long index;

        /** The promotion code to redeem. */
        @SerializedName("promotion_code")
        Object promotionCode;

        private AddDiscount(
            Object coupon,
            Object discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Long index,
            Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.index = index;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Long index;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.Action.AddDiscount build() {
            return new QuoteUpdateParams.Line.Action.AddDiscount(
                this.coupon,
                this.discount,
                this.discountEnd,
                this.extraParams,
                this.index,
                this.promotionCode);
          }

          /** The coupon code to redeem. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** The coupon code to redeem. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** An ID of an existing discount for a coupon that was already redeemed. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** An ID of an existing discount for a coupon that was already redeemed. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              QuoteUpdateParams.Line.Action.AddDiscount.DiscountEnd discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.AddDiscount#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.Action.AddDiscount#extraParams} for the field
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
           * The index, starting at 0, at which to position the new discount. When not supplied,
           * Stripe defaults to appending the discount to the end of the {@code discounts} array.
           */
          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }

          /** The promotion code to redeem. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** The promotion code to redeem. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }

        @Getter
        public static class DiscountEnd {
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
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(Map<String, Object> extraParams, Type type) {
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
            public QuoteUpdateParams.Line.Action.AddDiscount.DiscountEnd build() {
              return new QuoteUpdateParams.Line.Action.AddDiscount.DiscountEnd(
                  this.extraParams, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.Line.Action.AddDiscount.DiscountEnd#extraParams} for the field
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
             * QuoteUpdateParams.Line.Action.AddDiscount.DiscountEnd#extraParams} for the field
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
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                QuoteUpdateParams.Line.Action.AddDiscount.DiscountEnd.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("line_ends_at")
            LINE_ENDS_AT("line_ends_at");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class AddItem {
        /**
         * The discounts applied to the item. Subscription item discounts are applied before
         * subscription discounts.
         */
        @SerializedName("discounts")
        List<QuoteUpdateParams.Line.Action.AddItem.Discount> discounts;

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
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** <strong>Required.</strong> The ID of the price object. */
        @SerializedName("price")
        Object price;

        /** Quantity for this item. */
        @SerializedName("quantity")
        Long quantity;

        /**
         * The tax rates that apply to this subscription item. When set, the {@code
         * default_tax_rates} on the subscription do not apply to this {@code subscription_item}.
         */
        @SerializedName("tax_rates")
        List<String> taxRates;

        /** Options that configure the trial on the subscription item. */
        @SerializedName("trial")
        Trial trial;

        private AddItem(
            List<QuoteUpdateParams.Line.Action.AddItem.Discount> discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            Object price,
            Long quantity,
            List<String> taxRates,
            Trial trial) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.price = price;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<QuoteUpdateParams.Line.Action.AddItem.Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private Object price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.Action.AddItem build() {
            return new QuoteUpdateParams.Line.Action.AddItem(
                this.discounts,
                this.extraParams,
                this.metadata,
                this.price,
                this.quantity,
                this.taxRates,
                this.trial);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.AddItem#discounts} for the field documentation.
           */
          public Builder addDiscount(QuoteUpdateParams.Line.Action.AddItem.Discount element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.AddItem#discounts} for the field documentation.
           */
          public Builder addAllDiscount(
              List<QuoteUpdateParams.Line.Action.AddItem.Discount> elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.AddItem#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.Action.AddItem#extraParams} for the field
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
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link QuoteUpdateParams.Line.Action.AddItem#metadata} for the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.AddItem#metadata} for the field
           * documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /** <strong>Required.</strong> The ID of the price object. */
          public Builder setPrice(EmptyParam price) {
            this.price = price;
            return this;
          }

          /** Quantity for this item. */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.AddItem#taxRates} for the field documentation.
           */
          public Builder addTaxRate(String element) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.add(element);
            return this;
          }

          /**
           * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.AddItem#taxRates} for the field documentation.
           */
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.addAll(elements);
            return this;
          }

          /** Options that configure the trial on the subscription item. */
          public Builder setTrial(QuoteUpdateParams.Line.Action.AddItem.Trial trial) {
            this.trial = trial;
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

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** ID of the promotion code to create a new discount for. */
          @SerializedName("promotion_code")
          Object promotionCode;

          private Discount(
              Object coupon,
              Object discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              Object promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object coupon;

            private Object discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private Object promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.Line.Action.AddItem.Discount build() {
              return new QuoteUpdateParams.Line.Action.AddItem.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode);
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

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link QuoteUpdateParams.Line.Action.AddItem.Discount#extraParams}
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
             * original map. See {@link QuoteUpdateParams.Line.Action.AddItem.Discount#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(EmptyParam promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /** Time span for the redeemed discount. */
            @SerializedName("duration")
            Duration duration;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            @SerializedName("timestamp")
            Long timestamp;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            @SerializedName("type")
            Type type;

            private DiscountEnd(
                Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
              this.duration = duration;
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Duration duration;

              private Map<String, Object> extraParams;

              private Long timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd build() {
                return new QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd(
                    this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd#extraParams} for the
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd#extraParams} for the
               * field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** A precise Unix timestamp for the discount to end. Must be in the future. */
              public Builder setTimestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              public Builder setType(
                  QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Type type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class Duration {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              @SerializedName("interval")
              Interval interval;

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
               */
              @SerializedName("interval_count")
              Long intervalCount;

              private Duration(
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
                public QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration build() {
                  return new QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration(
                      this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration#extraParams}
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
                 * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
                 * {@code week}, {@code month} or {@code year}.
                 */
                public Builder setInterval(
                    QuoteUpdateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration.Interval
                        interval) {
                  this.interval = interval;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
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

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("duration")
              DURATION("duration"),

              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        public static class Trial {
          /**
           * List of price IDs which, if present on the subscription following a paid trial,
           * constitute opting-in to the paid trial. Currently only supports at most 1 price ID.
           */
          @SerializedName("converts_to")
          List<String> convertsTo;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Determines the type of trial for this item. */
          @SerializedName("type")
          Type type;

          private Trial(List<String> convertsTo, Map<String, Object> extraParams, Type type) {
            this.convertsTo = convertsTo;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<String> convertsTo;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.Line.Action.AddItem.Trial build() {
              return new QuoteUpdateParams.Line.Action.AddItem.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * QuoteUpdateParams.Line.Action.AddItem.Trial#convertsTo} for the field documentation.
             */
            public Builder addConvertsTo(String element) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.add(element);
              return this;
            }

            /**
             * Add all elements to `convertsTo` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link QuoteUpdateParams.Line.Action.AddItem.Trial#convertsTo} for the
             * field documentation.
             */
            public Builder addAllConvertsTo(List<String> elements) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link QuoteUpdateParams.Line.Action.AddItem.Trial#extraParams} for
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
             * original map. See {@link QuoteUpdateParams.Line.Action.AddItem.Trial#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Determines the type of trial for this item. */
            public Builder setType(QuoteUpdateParams.Line.Action.AddItem.Trial.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

            @SerializedName("paid")
            PAID("paid");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class RemoveDiscount {
        /** The coupon code to remove from the {@code discounts} array. */
        @SerializedName("coupon")
        Object coupon;

        /** The ID of a discount to remove from the {@code discounts} array. */
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

        /** The ID of a promotion code to remove from the {@code discounts} array. */
        @SerializedName("promotion_code")
        Object promotionCode;

        private RemoveDiscount(
            Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.Action.RemoveDiscount build() {
            return new QuoteUpdateParams.Line.Action.RemoveDiscount(
                this.coupon, this.discount, this.extraParams, this.promotionCode);
          }

          /** The coupon code to remove from the {@code discounts} array. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** The coupon code to remove from the {@code discounts} array. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** The ID of a discount to remove from the {@code discounts} array. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** The ID of a discount to remove from the {@code discounts} array. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.RemoveDiscount#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.Action.RemoveDiscount#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of a promotion code to remove from the {@code discounts} array. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** The ID of a promotion code to remove from the {@code discounts} array. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }
      }

      @Getter
      public static class RemoveItem {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> ID of a price to remove. */
        @SerializedName("price")
        Object price;

        private RemoveItem(Map<String, Object> extraParams, Object price) {
          this.extraParams = extraParams;
          this.price = price;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object price;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.Action.RemoveItem build() {
            return new QuoteUpdateParams.Line.Action.RemoveItem(this.extraParams, this.price);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.RemoveItem#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.Action.RemoveItem#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> ID of a price to remove. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /** <strong>Required.</strong> ID of a price to remove. */
          public Builder setPrice(EmptyParam price) {
            this.price = price;
            return this;
          }
        }
      }

      @Getter
      public static class SetDiscount {
        /** The coupon code to replace the {@code discounts} array with. */
        @SerializedName("coupon")
        Object coupon;

        /** An ID of an existing discount to replace the {@code discounts} array with. */
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

        /** An ID of an existing promotion code to replace the {@code discounts} array with. */
        @SerializedName("promotion_code")
        Object promotionCode;

        private SetDiscount(
            Object coupon, Object discount, Map<String, Object> extraParams, Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.Action.SetDiscount build() {
            return new QuoteUpdateParams.Line.Action.SetDiscount(
                this.coupon, this.discount, this.extraParams, this.promotionCode);
          }

          /** The coupon code to replace the {@code discounts} array with. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** The coupon code to replace the {@code discounts} array with. */
          public Builder setCoupon(EmptyParam coupon) {
            this.coupon = coupon;
            return this;
          }

          /** An ID of an existing discount to replace the {@code discounts} array with. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** An ID of an existing discount to replace the {@code discounts} array with. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.SetDiscount#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.Action.SetDiscount#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** An ID of an existing promotion code to replace the {@code discounts} array with. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** An ID of an existing promotion code to replace the {@code discounts} array with. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }
      }

      @Getter
      public static class SetItem {
        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * discounts} array on the subscription item that matches that price. Otherwise, the {@code
         * items} array is cleared and a single new item is added with the supplied {@code
         * discounts}.
         */
        @SerializedName("discounts")
        List<QuoteUpdateParams.Line.Action.SetItem.Discount> discounts;

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
         * If an item with the {@code price} already exists, passing this will override the {@code
         * metadata} on the subscription item that matches that price. Otherwise, the {@code items}
         * array is cleared and a single new item is added with the supplied {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** <strong>Required.</strong> The ID of the price object. */
        @SerializedName("price")
        Object price;

        /**
         * If an item with the {@code price} already exists, passing this will override the quantity
         * on the subscription item that matches that price. Otherwise, the {@code items} array is
         * cleared and a single new item is added with the supplied {@code quantity}.
         */
        @SerializedName("quantity")
        Long quantity;

        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * tax_rates} array on the subscription item that matches that price. Otherwise, the {@code
         * items} array is cleared and a single new item is added with the supplied {@code
         * tax_rates}.
         */
        @SerializedName("tax_rates")
        List<String> taxRates;

        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * trial} configuration on the subscription item that matches that price. Otherwise, the
         * {@code items} array is cleared and a single new item is added with the supplied {@code
         * trial}.
         */
        @SerializedName("trial")
        Trial trial;

        private SetItem(
            List<QuoteUpdateParams.Line.Action.SetItem.Discount> discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            Object price,
            Long quantity,
            List<String> taxRates,
            Trial trial) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.price = price;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<QuoteUpdateParams.Line.Action.SetItem.Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private Object price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.Action.SetItem build() {
            return new QuoteUpdateParams.Line.Action.SetItem(
                this.discounts,
                this.extraParams,
                this.metadata,
                this.price,
                this.quantity,
                this.taxRates,
                this.trial);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.SetItem#discounts} for the field documentation.
           */
          public Builder addDiscount(QuoteUpdateParams.Line.Action.SetItem.Discount element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.SetItem#discounts} for the field documentation.
           */
          public Builder addAllDiscount(
              List<QuoteUpdateParams.Line.Action.SetItem.Discount> elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.SetItem#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.Action.SetItem#extraParams} for the field
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
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link QuoteUpdateParams.Line.Action.SetItem#metadata} for the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.Action.SetItem#metadata} for the field
           * documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /** <strong>Required.</strong> The ID of the price object. */
          public Builder setPrice(EmptyParam price) {
            this.price = price;
            return this;
          }

          /**
           * If an item with the {@code price} already exists, passing this will override the
           * quantity on the subscription item that matches that price. Otherwise, the {@code items}
           * array is cleared and a single new item is added with the supplied {@code quantity}.
           */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.SetItem#taxRates} for the field documentation.
           */
          public Builder addTaxRate(String element) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.add(element);
            return this;
          }

          /**
           * Add all elements to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteUpdateParams.Line.Action.SetItem#taxRates} for the field documentation.
           */
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.addAll(elements);
            return this;
          }

          /**
           * If an item with the {@code price} already exists, passing this will override the {@code
           * trial} configuration on the subscription item that matches that price. Otherwise, the
           * {@code items} array is cleared and a single new item is added with the supplied {@code
           * trial}.
           */
          public Builder setTrial(QuoteUpdateParams.Line.Action.SetItem.Trial trial) {
            this.trial = trial;
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

          /** Details to determine how long the discount should be applied for. */
          @SerializedName("discount_end")
          DiscountEnd discountEnd;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** ID of the promotion code to create a new discount for. */
          @SerializedName("promotion_code")
          Object promotionCode;

          private Discount(
              Object coupon,
              Object discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              Object promotionCode) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object coupon;

            private Object discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private Object promotionCode;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.Line.Action.SetItem.Discount build() {
              return new QuoteUpdateParams.Line.Action.SetItem.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode);
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

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link QuoteUpdateParams.Line.Action.SetItem.Discount#extraParams}
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
             * original map. See {@link QuoteUpdateParams.Line.Action.SetItem.Discount#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(String promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }

            /** ID of the promotion code to create a new discount for. */
            public Builder setPromotionCode(EmptyParam promotionCode) {
              this.promotionCode = promotionCode;
              return this;
            }
          }

          @Getter
          public static class DiscountEnd {
            /** Time span for the redeemed discount. */
            @SerializedName("duration")
            Duration duration;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            @SerializedName("timestamp")
            Long timestamp;

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            @SerializedName("type")
            Type type;

            private DiscountEnd(
                Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
              this.duration = duration;
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Duration duration;

              private Map<String, Object> extraParams;

              private Long timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd build() {
                return new QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd(
                    this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd#extraParams} for the
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd#extraParams} for the
               * field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** A precise Unix timestamp for the discount to end. Must be in the future. */
              public Builder setTimestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /**
               * <strong>Required.</strong> The type of calculation made to determine when the
               * discount ends.
               */
              public Builder setType(
                  QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Type type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            public static class Duration {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              @SerializedName("interval")
              Interval interval;

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
               */
              @SerializedName("interval_count")
              Long intervalCount;

              private Duration(
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
                public QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration build() {
                  return new QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration(
                      this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration#extraParams}
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
                 * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
                 * {@code week}, {@code month} or {@code year}.
                 */
                public Builder setInterval(
                    QuoteUpdateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration.Interval
                        interval) {
                  this.interval = interval;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The number of intervals, as an whole number greater
                 * than 0. Stripe multiplies this by the interval type to get the overall duration.
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

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("duration")
              DURATION("duration"),

              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        public static class Trial {
          /**
           * List of price IDs which, if present on the subscription following a paid trial,
           * constitute opting-in to the paid trial. Currently only supports at most 1 price ID.
           */
          @SerializedName("converts_to")
          List<String> convertsTo;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Determines the type of trial for this item. */
          @SerializedName("type")
          Type type;

          private Trial(List<String> convertsTo, Map<String, Object> extraParams, Type type) {
            this.convertsTo = convertsTo;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<String> convertsTo;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.Line.Action.SetItem.Trial build() {
              return new QuoteUpdateParams.Line.Action.SetItem.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * QuoteUpdateParams.Line.Action.SetItem.Trial#convertsTo} for the field documentation.
             */
            public Builder addConvertsTo(String element) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.add(element);
              return this;
            }

            /**
             * Add all elements to `convertsTo` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link QuoteUpdateParams.Line.Action.SetItem.Trial#convertsTo} for the
             * field documentation.
             */
            public Builder addAllConvertsTo(List<String> elements) {
              if (this.convertsTo == null) {
                this.convertsTo = new ArrayList<>();
              }
              this.convertsTo.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link QuoteUpdateParams.Line.Action.SetItem.Trial#extraParams} for
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
             * original map. See {@link QuoteUpdateParams.Line.Action.SetItem.Trial#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Determines the type of trial for this item. */
            public Builder setType(QuoteUpdateParams.Line.Action.SetItem.Trial.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("free")
            FREE("free"),

            @SerializedName("paid")
            PAID("paid");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("add_discount")
        ADD_DISCOUNT("add_discount"),

        @SerializedName("add_item")
        ADD_ITEM("add_item"),

        @SerializedName("add_metadata")
        ADD_METADATA("add_metadata"),

        @SerializedName("clear_discounts")
        CLEAR_DISCOUNTS("clear_discounts"),

        @SerializedName("clear_metadata")
        CLEAR_METADATA("clear_metadata"),

        @SerializedName("remove_discount")
        REMOVE_DISCOUNT("remove_discount"),

        @SerializedName("remove_item")
        REMOVE_ITEM("remove_item"),

        @SerializedName("remove_metadata")
        REMOVE_METADATA("remove_metadata"),

        @SerializedName("set_discounts")
        SET_DISCOUNTS("set_discounts"),

        @SerializedName("set_items")
        SET_ITEMS("set_items"),

        @SerializedName("set_metadata")
        SET_METADATA("set_metadata");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class AppliesTo {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A custom string that identifies a new subscription schedule being created upon quote
       * acceptance. All quote lines with the same {@code new_reference} field will be applied to
       * the creation of a new subscription schedule.
       */
      @SerializedName("new_reference")
      Object newReference;

      /** The ID of the schedule the line applies to. */
      @SerializedName("subscription_schedule")
      Object subscriptionSchedule;

      /**
       * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule or
       * an existing schedule.
       */
      @SerializedName("type")
      Type type;

      private AppliesTo(
          Map<String, Object> extraParams,
          Object newReference,
          Object subscriptionSchedule,
          Type type) {
        this.extraParams = extraParams;
        this.newReference = newReference;
        this.subscriptionSchedule = subscriptionSchedule;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object newReference;

        private Object subscriptionSchedule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.AppliesTo build() {
          return new QuoteUpdateParams.Line.AppliesTo(
              this.extraParams, this.newReference, this.subscriptionSchedule, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.AppliesTo#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Line.AppliesTo#extraParams} for the field
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
         * A custom string that identifies a new subscription schedule being created upon quote
         * acceptance. All quote lines with the same {@code new_reference} field will be applied to
         * the creation of a new subscription schedule.
         */
        public Builder setNewReference(String newReference) {
          this.newReference = newReference;
          return this;
        }

        /**
         * A custom string that identifies a new subscription schedule being created upon quote
         * acceptance. All quote lines with the same {@code new_reference} field will be applied to
         * the creation of a new subscription schedule.
         */
        public Builder setNewReference(EmptyParam newReference) {
          this.newReference = newReference;
          return this;
        }

        /** The ID of the schedule the line applies to. */
        public Builder setSubscriptionSchedule(String subscriptionSchedule) {
          this.subscriptionSchedule = subscriptionSchedule;
          return this;
        }

        /** The ID of the schedule the line applies to. */
        public Builder setSubscriptionSchedule(EmptyParam subscriptionSchedule) {
          this.subscriptionSchedule = subscriptionSchedule;
          return this;
        }

        /**
         * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule
         * or an existing schedule.
         */
        public Builder setType(QuoteUpdateParams.Line.AppliesTo.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("new_reference")
        NEW_REFERENCE("new_reference"),

        @SerializedName("subscription_schedule")
        SUBSCRIPTION_SCHEDULE("subscription_schedule");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class CancelSubscriptionSchedule {
      /**
       * <strong>Required.</strong> Timestamp helper to cancel the underlying schedule on the
       * accompanying line's start date. Must be set to {@code line_starts_at}.
       */
      @SerializedName("cancel_at")
      CancelAt cancelAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * If the subscription schedule is {@code active}, indicates if a final invoice will be
       * generated that contains any un-invoiced metered usage and new/pending proration invoice
       * items. Boolean that defaults to {@code true}.
       */
      @SerializedName("invoice_now")
      Boolean invoiceNow;

      /**
       * If the subscription schedule is {@code active}, indicates if the cancellation should be
       * prorated. Boolean that defaults to {@code true}.
       */
      @SerializedName("prorate")
      Boolean prorate;

      private CancelSubscriptionSchedule(
          CancelAt cancelAt, Map<String, Object> extraParams, Boolean invoiceNow, Boolean prorate) {
        this.cancelAt = cancelAt;
        this.extraParams = extraParams;
        this.invoiceNow = invoiceNow;
        this.prorate = prorate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CancelAt cancelAt;

        private Map<String, Object> extraParams;

        private Boolean invoiceNow;

        private Boolean prorate;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.CancelSubscriptionSchedule build() {
          return new QuoteUpdateParams.Line.CancelSubscriptionSchedule(
              this.cancelAt, this.extraParams, this.invoiceNow, this.prorate);
        }

        /**
         * <strong>Required.</strong> Timestamp helper to cancel the underlying schedule on the
         * accompanying line's start date. Must be set to {@code line_starts_at}.
         */
        public Builder setCancelAt(
            QuoteUpdateParams.Line.CancelSubscriptionSchedule.CancelAt cancelAt) {
          this.cancelAt = cancelAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.CancelSubscriptionSchedule#extraParams} for the
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
         * map. See {@link QuoteUpdateParams.Line.CancelSubscriptionSchedule#extraParams} for the
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
         * If the subscription schedule is {@code active}, indicates if a final invoice will be
         * generated that contains any un-invoiced metered usage and new/pending proration invoice
         * items. Boolean that defaults to {@code true}.
         */
        public Builder setInvoiceNow(Boolean invoiceNow) {
          this.invoiceNow = invoiceNow;
          return this;
        }

        /**
         * If the subscription schedule is {@code active}, indicates if the cancellation should be
         * prorated. Boolean that defaults to {@code true}.
         */
        public Builder setProrate(Boolean prorate) {
          this.prorate = prorate;
          return this;
        }
      }

      public enum CancelAt implements ApiRequestParams.EnumParam {
        @SerializedName("line_starts_at")
        LINE_STARTS_AT("line_starts_at");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CancelAt(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class EndsAt {
      /** Use the {@code end} time of a given discount. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /** Time span for the quote line starting from the {@code starts_at} date. */
      @SerializedName("duration")
      Duration duration;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A precise Unix timestamp. */
      @SerializedName("timestamp")
      Long timestamp;

      /** <strong>Required.</strong> Select a way to pass in {@code ends_at}. */
      @SerializedName("type")
      Type type;

      private EndsAt(
          DiscountEnd discountEnd,
          Duration duration,
          Map<String, Object> extraParams,
          Long timestamp,
          Type type) {
        this.discountEnd = discountEnd;
        this.duration = duration;
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DiscountEnd discountEnd;

        private Duration duration;

        private Map<String, Object> extraParams;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.EndsAt build() {
          return new QuoteUpdateParams.Line.EndsAt(
              this.discountEnd, this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Use the {@code end} time of a given discount. */
        public Builder setDiscountEnd(QuoteUpdateParams.Line.EndsAt.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /** Time span for the quote line starting from the {@code starts_at} date. */
        public Builder setDuration(QuoteUpdateParams.Line.EndsAt.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.EndsAt#extraParams} for the field documentation.
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
         * map. See {@link QuoteUpdateParams.Line.EndsAt#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A precise Unix timestamp. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> Select a way to pass in {@code ends_at}. */
        public Builder setType(QuoteUpdateParams.Line.EndsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** <strong>Required.</strong> The ID of a specific discount. */
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

        private DiscountEnd(Object discount, Map<String, Object> extraParams) {
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.EndsAt.DiscountEnd build() {
            return new QuoteUpdateParams.Line.EndsAt.DiscountEnd(this.discount, this.extraParams);
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.EndsAt.DiscountEnd#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.EndsAt.DiscountEnd#extraParams} for the field
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
      public static class Duration {
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
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
         * Stripe multiplies this by the interval type to get the overall duration.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
          public QuoteUpdateParams.Line.EndsAt.Duration build() {
            return new QuoteUpdateParams.Line.EndsAt.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.EndsAt.Duration#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.EndsAt.Duration#extraParams} for the field
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(QuoteUpdateParams.Line.EndsAt.Duration.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
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

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("billing_period_end")
        BILLING_PERIOD_END("billing_period_end"),

        @SerializedName("discount_end")
        DISCOUNT_END("discount_end"),

        @SerializedName("duration")
        DURATION("duration"),

        @SerializedName("quote_acceptance_date")
        QUOTE_ACCEPTANCE_DATE("quote_acceptance_date"),

        @SerializedName("schedule_end")
        SCHEDULE_END("schedule_end"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp"),

        @SerializedName("upcoming_invoice")
        UPCOMING_INVOICE("upcoming_invoice");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class SetPauseCollection {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details of the pause_collection behavior to apply to the amendment. */
      @SerializedName("set")
      Set set;

      /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
      @SerializedName("type")
      Type type;

      private SetPauseCollection(Map<String, Object> extraParams, Set set, Type type) {
        this.extraParams = extraParams;
        this.set = set;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Set set;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.SetPauseCollection build() {
          return new QuoteUpdateParams.Line.SetPauseCollection(
              this.extraParams, this.set, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.SetPauseCollection#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Line.SetPauseCollection#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details of the pause_collection behavior to apply to the amendment. */
        public Builder setSet(QuoteUpdateParams.Line.SetPauseCollection.Set set) {
          this.set = set;
          return this;
        }

        /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
        public Builder setType(QuoteUpdateParams.Line.SetPauseCollection.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Set {
        /**
         * <strong>Required.</strong> The payment collection behavior for this subscription while
         * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
         */
        @SerializedName("behavior")
        Behavior behavior;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Set(Behavior behavior, Map<String, Object> extraParams) {
          this.behavior = behavior;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Behavior behavior;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.SetPauseCollection.Set build() {
            return new QuoteUpdateParams.Line.SetPauseCollection.Set(
                this.behavior, this.extraParams);
          }

          /**
           * <strong>Required.</strong> The payment collection behavior for this subscription while
           * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
           */
          public Builder setBehavior(
              QuoteUpdateParams.Line.SetPauseCollection.Set.Behavior behavior) {
            this.behavior = behavior;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.SetPauseCollection.Set#extraParams} for the
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
           * map. See {@link QuoteUpdateParams.Line.SetPauseCollection.Set#extraParams} for the
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

        public enum Behavior implements ApiRequestParams.EnumParam {
          @SerializedName("keep_as_draft")
          KEEP_AS_DRAFT("keep_as_draft"),

          @SerializedName("mark_uncollectible")
          MARK_UNCOLLECTIBLE("mark_uncollectible"),

          @SerializedName("void")
          VOID("void");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Behavior(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("remove")
        REMOVE("remove"),

        @SerializedName("set")
        SET("set");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class StartsAt {
      /** Use the {@code end} time of a given discount. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The timestamp the given line ends at. */
      @SerializedName("line_ends_at")
      LineEndsAt lineEndsAt;

      /** A precise Unix timestamp. */
      @SerializedName("timestamp")
      Long timestamp;

      /** <strong>Required.</strong> Select a way to pass in {@code starts_at}. */
      @SerializedName("type")
      Type type;

      private StartsAt(
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          LineEndsAt lineEndsAt,
          Long timestamp,
          Type type) {
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.lineEndsAt = lineEndsAt;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private LineEndsAt lineEndsAt;

        private Long timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.StartsAt build() {
          return new QuoteUpdateParams.Line.StartsAt(
              this.discountEnd, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
        }

        /** Use the {@code end} time of a given discount. */
        public Builder setDiscountEnd(QuoteUpdateParams.Line.StartsAt.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.StartsAt#extraParams} for the field documentation.
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
         * map. See {@link QuoteUpdateParams.Line.StartsAt#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp the given line ends at. */
        public Builder setLineEndsAt(QuoteUpdateParams.Line.StartsAt.LineEndsAt lineEndsAt) {
          this.lineEndsAt = lineEndsAt;
          return this;
        }

        /** A precise Unix timestamp. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> Select a way to pass in {@code starts_at}. */
        public Builder setType(QuoteUpdateParams.Line.StartsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** <strong>Required.</strong> The ID of a specific discount. */
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

        private DiscountEnd(Object discount, Map<String, Object> extraParams) {
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.StartsAt.DiscountEnd build() {
            return new QuoteUpdateParams.Line.StartsAt.DiscountEnd(this.discount, this.extraParams);
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(EmptyParam discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.StartsAt.DiscountEnd#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.StartsAt.DiscountEnd#extraParams} for the field
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
      public static class LineEndsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of a quote line. */
        @SerializedName("id")
        Object id;

        /**
         * The position of the previous quote line in the {@code lines} array after which this line
         * should begin. Indexes start from 0 and must be less than the index of the current line in
         * the array.
         */
        @SerializedName("index")
        Long index;

        private LineEndsAt(Map<String, Object> extraParams, Object id, Long index) {
          this.extraParams = extraParams;
          this.id = id;
          this.index = index;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object id;

          private Long index;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.StartsAt.LineEndsAt build() {
            return new QuoteUpdateParams.Line.StartsAt.LineEndsAt(
                this.extraParams, this.id, this.index);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.StartsAt.LineEndsAt#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Line.StartsAt.LineEndsAt#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of a quote line. */
          public Builder setId(String id) {
            this.id = id;
            return this;
          }

          /** The ID of a quote line. */
          public Builder setId(EmptyParam id) {
            this.id = id;
            return this;
          }

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          public Builder setIndex(Long index) {
            this.index = index;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("discount_end")
        DISCOUNT_END("discount_end"),

        @SerializedName("line_ends_at")
        LINE_ENDS_AT("line_ends_at"),

        @SerializedName("now")
        NOW("now"),

        @SerializedName("quote_acceptance_date")
        QUOTE_ACCEPTANCE_DATE("quote_acceptance_date"),

        @SerializedName("schedule_end")
        SCHEDULE_END("schedule_end"),

        @SerializedName("timestamp")
        TIMESTAMP("timestamp"),

        @SerializedName("upcoming_invoice")
        UPCOMING_INVOICE("upcoming_invoice");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class TrialSettings {
      /** Defines how the subscription should behave when a trial ends. */
      @SerializedName("end_behavior")
      EndBehavior endBehavior;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TrialSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
        this.endBehavior = endBehavior;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndBehavior endBehavior;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Line.TrialSettings build() {
          return new QuoteUpdateParams.Line.TrialSettings(this.endBehavior, this.extraParams);
        }

        /** Defines how the subscription should behave when a trial ends. */
        public Builder setEndBehavior(
            QuoteUpdateParams.Line.TrialSettings.EndBehavior endBehavior) {
          this.endBehavior = endBehavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.Line.TrialSettings#extraParams} for the field
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
         * map. See {@link QuoteUpdateParams.Line.TrialSettings#extraParams} for the field
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
      public static class EndBehavior {
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
         * Configure how an opt-in following a paid trial is billed when using {@code
         * billing_behavior: prorate_up_front}.
         */
        @SerializedName("prorate_up_front")
        ProrateUpFront prorateUpFront;

        private EndBehavior(Map<String, Object> extraParams, ProrateUpFront prorateUpFront) {
          this.extraParams = extraParams;
          this.prorateUpFront = prorateUpFront;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private ProrateUpFront prorateUpFront;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Line.TrialSettings.EndBehavior build() {
            return new QuoteUpdateParams.Line.TrialSettings.EndBehavior(
                this.extraParams, this.prorateUpFront);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Line.TrialSettings.EndBehavior#extraParams} for the
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
           * map. See {@link QuoteUpdateParams.Line.TrialSettings.EndBehavior#extraParams} for the
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
           * Configure how an opt-in following a paid trial is billed when using {@code
           * billing_behavior: prorate_up_front}.
           */
          public Builder setProrateUpFront(
              QuoteUpdateParams.Line.TrialSettings.EndBehavior.ProrateUpFront prorateUpFront) {
            this.prorateUpFront = prorateUpFront;
            return this;
          }
        }

        public enum ProrateUpFront implements ApiRequestParams.EnumParam {
          @SerializedName("defer")
          DEFER("defer"),

          @SerializedName("include")
          INCLUDE("include");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ProrateUpFront(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum BillingCycleAnchor implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("line_starts_at")
      LINE_STARTS_AT("line_starts_at");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillingCycleAnchor(String value) {
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

    public enum SetScheduleEnd implements ApiRequestParams.EnumParam {
      @SerializedName("line_ends_at")
      LINE_ENDS_AT("line_ends_at"),

      @SerializedName("line_starts_at")
      LINE_STARTS_AT("line_starts_at");

      @Getter(onMethod_ = {@Override})
      private final String value;

      SetScheduleEnd(String value) {
        this.value = value;
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

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** ID of the promotion code to create a new discount for. */
      @SerializedName("promotion_code")
      Object promotionCode;

      private Discount(
          Object coupon,
          Object discount,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          Object promotionCode) {
        this.coupon = coupon;
        this.discount = discount;
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.promotionCode = promotionCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private Object promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.LineItem.Discount build() {
          return new QuoteUpdateParams.LineItem.Discount(
              this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
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

        /** Details to determine how long the discount should be applied for. */
        public Builder setDiscountEnd(QuoteUpdateParams.LineItem.Discount.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
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

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(String promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(EmptyParam promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** Time span for the redeemed discount. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        @SerializedName("type")
        Type type;

        private DiscountEnd(
            Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
          this.duration = duration;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Duration duration;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.LineItem.Discount.DiscountEnd build() {
            return new QuoteUpdateParams.LineItem.Discount.DiscountEnd(
                this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Time span for the redeemed discount. */
          public Builder setDuration(
              QuoteUpdateParams.LineItem.Discount.DiscountEnd.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.LineItem.Discount.DiscountEnd#extraParams} for the
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
           * map. See {@link QuoteUpdateParams.LineItem.Discount.DiscountEnd#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          public Builder setType(QuoteUpdateParams.LineItem.Discount.DiscountEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Duration {
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
            public QuoteUpdateParams.LineItem.Discount.DiscountEnd.Duration build() {
              return new QuoteUpdateParams.LineItem.Discount.DiscountEnd.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.LineItem.Discount.DiscountEnd.Duration#extraParams} for the field
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
             * QuoteUpdateParams.LineItem.Discount.DiscountEnd.Duration#extraParams} for the field
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
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                QuoteUpdateParams.LineItem.Discount.DiscountEnd.Duration.Interval interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
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

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class PriceData {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

      /** <strong>Required.</strong> The ID of the product that this price will belong to. */
      @SerializedName("product")
      Object product;

      /**
       * The recurring components of a price such as {@code interval} and {@code interval_count}.
       */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Only required if a <a
       * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
       * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
       * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
       * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
       * exclusive}, it cannot be changed.
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
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

        /** <strong>Required.</strong> The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /** <strong>Required.</strong> The ID of the product that this price will belong to. */
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
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
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
         * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code week},
         * {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between subscription billings. For example, {@code
         * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three years
         * interval allowed (3 years, 36 months, or 156 weeks).
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
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              QuoteUpdateParams.LineItem.PriceData.Recurring.Interval interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
           * years interval allowed (3 years, 36 months, or 156 weeks).
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
     * <strong>Required.</strong> A list of line items the customer is being quoted for within this
     * phase. Each line item includes information about the product, the quantity, and the resulting
     * cost.
     */
    @SerializedName("line_items")
    List<QuoteUpdateParams.Phase.LineItem> lineItems;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
     * declaratively set metadata on the subscription schedule's phases when the quote is accepted.
     * After a quote has been finalized, this field can be updated by specifying an identical set of
     * quote phases to what was on the quote originally, excluding changes in metadata and phases
     * that are now in the past.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

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
        Map<String, String> metadata,
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
      this.metadata = metadata;
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

      private Map<String, String> metadata;

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
            this.metadata,
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
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.Phase#metadata} for the field documentation.
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
       * See {@link QuoteUpdateParams.Phase#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
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

      /** Details to determine how long the discount should be applied for. */
      @SerializedName("discount_end")
      DiscountEnd discountEnd;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** ID of the promotion code to create a new discount for. */
      @SerializedName("promotion_code")
      Object promotionCode;

      private Discount(
          Object coupon,
          Object discount,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          Object promotionCode) {
        this.coupon = coupon;
        this.discount = discount;
        this.discountEnd = discountEnd;
        this.extraParams = extraParams;
        this.promotionCode = promotionCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object coupon;

        private Object discount;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private Object promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.Phase.Discount build() {
          return new QuoteUpdateParams.Phase.Discount(
              this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
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

        /** Details to determine how long the discount should be applied for. */
        public Builder setDiscountEnd(QuoteUpdateParams.Phase.Discount.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
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

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(String promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }

        /** ID of the promotion code to create a new discount for. */
        public Builder setPromotionCode(EmptyParam promotionCode) {
          this.promotionCode = promotionCode;
          return this;
        }
      }

      @Getter
      public static class DiscountEnd {
        /** Time span for the redeemed discount. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** A precise Unix timestamp for the discount to end. Must be in the future. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * <strong>Required.</strong> The type of calculation made to determine when the discount
         * ends.
         */
        @SerializedName("type")
        Type type;

        private DiscountEnd(
            Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
          this.duration = duration;
          this.extraParams = extraParams;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Duration duration;

          private Map<String, Object> extraParams;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Phase.Discount.DiscountEnd build() {
            return new QuoteUpdateParams.Phase.Discount.DiscountEnd(
                this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Time span for the redeemed discount. */
          public Builder setDuration(
              QuoteUpdateParams.Phase.Discount.DiscountEnd.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteUpdateParams.Phase.Discount.DiscountEnd#extraParams} for the field
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
           * map. See {@link QuoteUpdateParams.Phase.Discount.DiscountEnd#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          public Builder setType(QuoteUpdateParams.Phase.Discount.DiscountEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Duration {
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
            public QuoteUpdateParams.Phase.Discount.DiscountEnd.Duration build() {
              return new QuoteUpdateParams.Phase.Discount.DiscountEnd.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.Phase.Discount.DiscountEnd.Duration#extraParams} for the field
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
             * QuoteUpdateParams.Phase.Discount.DiscountEnd.Duration#extraParams} for the field
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
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                QuoteUpdateParams.Phase.Discount.DiscountEnd.Duration.Interval interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
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

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
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

        /** Details to determine how long the discount should be applied for. */
        @SerializedName("discount_end")
        DiscountEnd discountEnd;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** ID of the promotion code to create a new discount for. */
        @SerializedName("promotion_code")
        Object promotionCode;

        private Discount(
            Object coupon,
            Object discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Object promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object coupon;

          private Object discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Object promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.Phase.LineItem.Discount build() {
            return new QuoteUpdateParams.Phase.LineItem.Discount(
                this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
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

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd discountEnd) {
            this.discountEnd = discountEnd;
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

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** ID of the promotion code to create a new discount for. */
          public Builder setPromotionCode(EmptyParam promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }
        }

        @Getter
        public static class DiscountEnd {
          /** Time span for the redeemed discount. */
          @SerializedName("duration")
          Duration duration;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A precise Unix timestamp for the discount to end. Must be in the future. */
          @SerializedName("timestamp")
          Long timestamp;

          /**
           * <strong>Required.</strong> The type of calculation made to determine when the discount
           * ends.
           */
          @SerializedName("type")
          Type type;

          private DiscountEnd(
              Duration duration, Map<String, Object> extraParams, Long timestamp, Type type) {
            this.duration = duration;
            this.extraParams = extraParams;
            this.timestamp = timestamp;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Duration duration;

            private Map<String, Object> extraParams;

            private Long timestamp;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd build() {
              return new QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd(
                  this.duration, this.extraParams, this.timestamp, this.type);
            }

            /** Time span for the redeemed discount. */
            public Builder setDuration(
                QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Duration duration) {
              this.duration = duration;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd#extraParams} for the field
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
             * QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A precise Unix timestamp for the discount to end. Must be in the future. */
            public Builder setTimestamp(Long timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /**
             * <strong>Required.</strong> The type of calculation made to determine when the
             * discount ends.
             */
            public Builder setType(
                QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          public static class Duration {
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
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            @SerializedName("interval")
            Interval interval;

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
             */
            @SerializedName("interval_count")
            Long intervalCount;

            private Duration(
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
              public QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Duration build() {
                return new QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Duration(
                    this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Duration#extraParams} for the
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Duration#extraParams} for the
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
               * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
               * {@code week}, {@code month} or {@code year}.
               */
              public Builder setInterval(
                  QuoteUpdateParams.Phase.LineItem.Discount.DiscountEnd.Duration.Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> The number of intervals, as an whole number greater than
               * 0. Stripe multiplies this by the interval type to get the overall duration.
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

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("duration")
            DURATION("duration"),

            @SerializedName("timestamp")
            TIMESTAMP("timestamp");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class PriceData {
        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

        /** <strong>Required.</strong> The ID of the product that this price will belong to. */
        @SerializedName("product")
        Object product;

        /**
         * The recurring components of a price such as {@code interval} and {@code interval_count}.
         */
        @SerializedName("recurring")
        Recurring recurring;

        /**
         * Only required if a <a
         * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
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
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * <strong>Required.</strong> Three-letter <a
           * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
           * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
           * currency</a>.
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

          /** <strong>Required.</strong> The ID of the product that this price will belong to. */
          public Builder setProduct(String product) {
            this.product = product;
            return this;
          }

          /** <strong>Required.</strong> The ID of the product that this price will belong to. */
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
           * Only required if a <a
           * href="https://stripe.com/docs/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
           * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the
           * price is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive},
           * {@code exclusive}, or {@code unspecified}. Once specified as either {@code inclusive}
           * or {@code exclusive}, it cannot be changed.
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
           * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
           * week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * The number of intervals between subscription billings. For example, {@code
           * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
           * years interval allowed (3 years, 36 months, or 156 weeks).
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
             * <strong>Required.</strong> Specifies billing frequency. Either {@code day}, {@code
             * week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                QuoteUpdateParams.Phase.LineItem.PriceData.Recurring.Interval interval) {
              this.interval = interval;
              return this;
            }

            /**
             * The number of intervals between subscription billings. For example, {@code
             * interval=month} and {@code interval_count=3} bills every 3 months. Maximum of three
             * years interval allowed (3 years, 36 months, or 156 weeks).
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
    /** Describes the period to bill for upon accepting the quote. */
    @SerializedName("bill_on_acceptance")
    Object billOnAcceptance;

    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
     * all phases within the current billing cycle up front.
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
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
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

    /** Behavior of the subscription schedule and underlying subscription when it ends. */
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will set
     * metadata on the subscription or subscription schedule when the quote is accepted. If a
     * recurring price is included in {@code line_items}, this field will be passed to the resulting
     * subscription's {@code metadata} field. If {@code subscription_data.effective_date} is used,
     * this field will be passed to the resulting subscription schedule's {@code phases.metadata}
     * field. Unlike object-level metadata, this field is declarative. Updates will clear prior
     * values.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

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
        Object billOnAcceptance,
        BillingBehavior billingBehavior,
        ApiRequestParams.EnumParam billingCycleAnchor,
        Object description,
        Object effectiveDate,
        EndBehavior endBehavior,
        Map<String, Object> extraParams,
        Map<String, String> metadata,
        Object prebilling,
        ProrationBehavior prorationBehavior,
        Object trialPeriodDays) {
      this.billOnAcceptance = billOnAcceptance;
      this.billingBehavior = billingBehavior;
      this.billingCycleAnchor = billingCycleAnchor;
      this.description = description;
      this.effectiveDate = effectiveDate;
      this.endBehavior = endBehavior;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.prebilling = prebilling;
      this.prorationBehavior = prorationBehavior;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object billOnAcceptance;

      private BillingBehavior billingBehavior;

      private ApiRequestParams.EnumParam billingCycleAnchor;

      private Object description;

      private Object effectiveDate;

      private EndBehavior endBehavior;

      private Map<String, Object> extraParams;

      private Map<String, String> metadata;

      private Object prebilling;

      private ProrationBehavior prorationBehavior;

      private Object trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.SubscriptionData build() {
        return new QuoteUpdateParams.SubscriptionData(
            this.billOnAcceptance,
            this.billingBehavior,
            this.billingCycleAnchor,
            this.description,
            this.effectiveDate,
            this.endBehavior,
            this.extraParams,
            this.metadata,
            this.prebilling,
            this.prorationBehavior,
            this.trialPeriodDays);
      }

      /** Describes the period to bill for upon accepting the quote. */
      public Builder setBillOnAcceptance(
          QuoteUpdateParams.SubscriptionData.BillOnAcceptance billOnAcceptance) {
        this.billOnAcceptance = billOnAcceptance;
        return this;
      }

      /** Describes the period to bill for upon accepting the quote. */
      public Builder setBillOnAcceptance(EmptyParam billOnAcceptance) {
        this.billOnAcceptance = billOnAcceptance;
        return this;
      }

      /**
       * Configures when the subscription schedule generates prorations for phase transitions.
       * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
       * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
       * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
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
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
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

      /** Behavior of the subscription schedule and underlying subscription when it ends. */
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
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.SubscriptionData#metadata} for the field documentation.
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
       * See {@link QuoteUpdateParams.SubscriptionData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
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
    public static class BillOnAcceptance {
      /** The start of the period to bill from when the Quote is accepted. */
      @SerializedName("bill_from")
      BillFrom billFrom;

      /** The end of the period to bill until when the Quote is accepted. */
      @SerializedName("bill_until")
      BillUntil billUntil;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BillOnAcceptance(
          BillFrom billFrom, BillUntil billUntil, Map<String, Object> extraParams) {
        this.billFrom = billFrom;
        this.billUntil = billUntil;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BillFrom billFrom;

        private BillUntil billUntil;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.SubscriptionData.BillOnAcceptance build() {
          return new QuoteUpdateParams.SubscriptionData.BillOnAcceptance(
              this.billFrom, this.billUntil, this.extraParams);
        }

        /** The start of the period to bill from when the Quote is accepted. */
        public Builder setBillFrom(
            QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom billFrom) {
          this.billFrom = billFrom;
          return this;
        }

        /** The end of the period to bill until when the Quote is accepted. */
        public Builder setBillUntil(
            QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.SubscriptionData.BillOnAcceptance#extraParams} for the
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
         * map. See {@link QuoteUpdateParams.SubscriptionData.BillOnAcceptance#extraParams} for the
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

      @Getter
      public static class BillFrom {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of a Quote line to start the bill period from. */
        @SerializedName("line_starts_at")
        LineStartsAt lineStartsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /** <strong>Required.</strong> The type of method to specify the {@code bill_from} time. */
        @SerializedName("type")
        Type type;

        private BillFrom(
            Map<String, Object> extraParams, LineStartsAt lineStartsAt, Long timestamp, Type type) {
          this.extraParams = extraParams;
          this.lineStartsAt = lineStartsAt;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private LineStartsAt lineStartsAt;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom build() {
            return new QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom(
                this.extraParams, this.lineStartsAt, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom#extraParams} for the field
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
           * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of a Quote line to start the bill period from. */
          public Builder setLineStartsAt(
              QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt
                  lineStartsAt) {
            this.lineStartsAt = lineStartsAt;
            return this;
          }

          /** A precise Unix timestamp. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of method to specify the {@code bill_from} time.
           */
          public Builder setType(
              QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class LineStartsAt {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The ID of a quote line. */
          @SerializedName("id")
          Object id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineStartsAt(Map<String, Object> extraParams, Object id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt
                build() {
              return new QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt(
                  this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
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
             * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(String id) {
              this.id = id;
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(EmptyParam id) {
              this.id = id;
              return this;
            }

            /**
             * The position of the previous quote line in the {@code lines} array after which this
             * line should begin. Indexes start from 0 and must be less than the index of the
             * current line in the array.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("line_starts_at")
          LINE_STARTS_AT("line_starts_at"),

          @SerializedName("now")
          NOW("now"),

          @SerializedName("pause_collection_start")
          PAUSE_COLLECTION_START("pause_collection_start"),

          @SerializedName("quote_acceptance_date")
          QUOTE_ACCEPTANCE_DATE("quote_acceptance_date"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class BillUntil {
        /** Details of the duration over which to bill. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of a Quote line item from which to bill until. */
        @SerializedName("line_ends_at")
        LineEndsAt lineEndsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /** <strong>Required.</strong> The type of method to specify the {@code bill_until} time. */
        @SerializedName("type")
        Type type;

        private BillUntil(
            Duration duration,
            Map<String, Object> extraParams,
            LineEndsAt lineEndsAt,
            Long timestamp,
            Type type) {
          this.duration = duration;
          this.extraParams = extraParams;
          this.lineEndsAt = lineEndsAt;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Duration duration;

          private Map<String, Object> extraParams;

          private LineEndsAt lineEndsAt;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil build() {
            return new QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil(
                this.duration, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
          }

          /** Details of the duration over which to bill. */
          public Builder setDuration(
              QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil#extraParams} for the
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
           * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of a Quote line item from which to bill until. */
          public Builder setLineEndsAt(
              QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt lineEndsAt) {
            this.lineEndsAt = lineEndsAt;
            return this;
          }

          /** A precise Unix timestamp. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of method to specify the {@code bill_until} time.
           */
          public Builder setType(
              QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Duration {
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
            public QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration build() {
              return new QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration#extraParams}
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
             * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration#extraParams}
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
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
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
        public static class LineEndsAt {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The ID of a quote line. */
          @SerializedName("id")
          Object id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineEndsAt(Map<String, Object> extraParams, Object id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt
                build() {
              return new QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt(
                  this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
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
             * QuoteUpdateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(String id) {
              this.id = id;
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(EmptyParam id) {
              this.id = id;
              return this;
            }

            /**
             * The position of the previous quote line in the {@code lines} array after which this
             * line should begin. Indexes start from 0 and must be less than the index of the
             * current line in the array.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("line_ends_at")
          LINE_ENDS_AT("line_ends_at"),

          @SerializedName("schedule_end")
          SCHEDULE_END("schedule_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp"),

          @SerializedName("upcoming_invoice")
          UPCOMING_INVOICE("upcoming_invoice");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
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

      /**
       * <strong>Required.</strong> This is used to determine the number of billing cycles to
       * prebill.
       */
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

        /**
         * <strong>Required.</strong> This is used to determine the number of billing cycles to
         * prebill.
         */
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
  public static class SubscriptionDataOverride {
    /**
     * <strong>Required.</strong> Whether the override applies to an existing Subscription Schedule
     * or a new Subscription Schedule.
     */
    @SerializedName("applies_to")
    AppliesTo appliesTo;

    /** Describes the period to bill for upon accepting the quote. */
    @SerializedName("bill_on_acceptance")
    Object billOnAcceptance;

    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
     * all phases within the current billing cycle up front.
     */
    @SerializedName("billing_behavior")
    BillingBehavior billingBehavior;

    /** The customer the Subscription Data override applies to. */
    @SerializedName("customer")
    Object customer;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    Object description;

    /** Behavior of the subscription schedule and underlying subscription when it ends. */
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

    private SubscriptionDataOverride(
        AppliesTo appliesTo,
        Object billOnAcceptance,
        BillingBehavior billingBehavior,
        Object customer,
        Object description,
        EndBehavior endBehavior,
        Map<String, Object> extraParams,
        ProrationBehavior prorationBehavior) {
      this.appliesTo = appliesTo;
      this.billOnAcceptance = billOnAcceptance;
      this.billingBehavior = billingBehavior;
      this.customer = customer;
      this.description = description;
      this.endBehavior = endBehavior;
      this.extraParams = extraParams;
      this.prorationBehavior = prorationBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AppliesTo appliesTo;

      private Object billOnAcceptance;

      private BillingBehavior billingBehavior;

      private Object customer;

      private Object description;

      private EndBehavior endBehavior;

      private Map<String, Object> extraParams;

      private ProrationBehavior prorationBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteUpdateParams.SubscriptionDataOverride build() {
        return new QuoteUpdateParams.SubscriptionDataOverride(
            this.appliesTo,
            this.billOnAcceptance,
            this.billingBehavior,
            this.customer,
            this.description,
            this.endBehavior,
            this.extraParams,
            this.prorationBehavior);
      }

      /**
       * <strong>Required.</strong> Whether the override applies to an existing Subscription
       * Schedule or a new Subscription Schedule.
       */
      public Builder setAppliesTo(QuoteUpdateParams.SubscriptionDataOverride.AppliesTo appliesTo) {
        this.appliesTo = appliesTo;
        return this;
      }

      /** Describes the period to bill for upon accepting the quote. */
      public Builder setBillOnAcceptance(
          QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance billOnAcceptance) {
        this.billOnAcceptance = billOnAcceptance;
        return this;
      }

      /** Describes the period to bill for upon accepting the quote. */
      public Builder setBillOnAcceptance(EmptyParam billOnAcceptance) {
        this.billOnAcceptance = billOnAcceptance;
        return this;
      }

      /**
       * Configures when the subscription schedule generates prorations for phase transitions.
       * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
       * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
       * changes and generate prorations at transition time. {@code prorate_up_front} will bill for
       * all phases within the current billing cycle up front.
       */
      public Builder setBillingBehavior(
          QuoteUpdateParams.SubscriptionDataOverride.BillingBehavior billingBehavior) {
        this.billingBehavior = billingBehavior;
        return this;
      }

      /** The customer the Subscription Data override applies to. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** The customer the Subscription Data override applies to. */
      public Builder setCustomer(EmptyParam customer) {
        this.customer = customer;
        return this;
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription for rendering in Stripe surfaces and
       * certain local payment methods UIs.
       */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /** Behavior of the subscription schedule and underlying subscription when it ends. */
      public Builder setEndBehavior(
          QuoteUpdateParams.SubscriptionDataOverride.EndBehavior endBehavior) {
        this.endBehavior = endBehavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteUpdateParams.SubscriptionDataOverride#extraParams} for the field documentation.
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
       * See {@link QuoteUpdateParams.SubscriptionDataOverride#extraParams} for the field
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
          QuoteUpdateParams.SubscriptionDataOverride.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }
    }

    @Getter
    public static class AppliesTo {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A custom string that identifies a new subscription schedule being created upon quote
       * acceptance. All quote lines with the same {@code new_reference} field will be applied to
       * the creation of a new subscription schedule.
       */
      @SerializedName("new_reference")
      Object newReference;

      /** The ID of the schedule the line applies to. */
      @SerializedName("subscription_schedule")
      Object subscriptionSchedule;

      /**
       * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule or
       * an existing schedule.
       */
      @SerializedName("type")
      Type type;

      private AppliesTo(
          Map<String, Object> extraParams,
          Object newReference,
          Object subscriptionSchedule,
          Type type) {
        this.extraParams = extraParams;
        this.newReference = newReference;
        this.subscriptionSchedule = subscriptionSchedule;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object newReference;

        private Object subscriptionSchedule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.SubscriptionDataOverride.AppliesTo build() {
          return new QuoteUpdateParams.SubscriptionDataOverride.AppliesTo(
              this.extraParams, this.newReference, this.subscriptionSchedule, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.SubscriptionDataOverride.AppliesTo#extraParams} for the
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
         * map. See {@link QuoteUpdateParams.SubscriptionDataOverride.AppliesTo#extraParams} for the
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
         * A custom string that identifies a new subscription schedule being created upon quote
         * acceptance. All quote lines with the same {@code new_reference} field will be applied to
         * the creation of a new subscription schedule.
         */
        public Builder setNewReference(String newReference) {
          this.newReference = newReference;
          return this;
        }

        /**
         * A custom string that identifies a new subscription schedule being created upon quote
         * acceptance. All quote lines with the same {@code new_reference} field will be applied to
         * the creation of a new subscription schedule.
         */
        public Builder setNewReference(EmptyParam newReference) {
          this.newReference = newReference;
          return this;
        }

        /** The ID of the schedule the line applies to. */
        public Builder setSubscriptionSchedule(String subscriptionSchedule) {
          this.subscriptionSchedule = subscriptionSchedule;
          return this;
        }

        /** The ID of the schedule the line applies to. */
        public Builder setSubscriptionSchedule(EmptyParam subscriptionSchedule) {
          this.subscriptionSchedule = subscriptionSchedule;
          return this;
        }

        /**
         * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule
         * or an existing schedule.
         */
        public Builder setType(QuoteUpdateParams.SubscriptionDataOverride.AppliesTo.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("new_reference")
        NEW_REFERENCE("new_reference"),

        @SerializedName("subscription_schedule")
        SUBSCRIPTION_SCHEDULE("subscription_schedule");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class BillOnAcceptance {
      /** The start of the period to bill from when the Quote is accepted. */
      @SerializedName("bill_from")
      BillFrom billFrom;

      /** The end of the period to bill until when the Quote is accepted. */
      @SerializedName("bill_until")
      BillUntil billUntil;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BillOnAcceptance(
          BillFrom billFrom, BillUntil billUntil, Map<String, Object> extraParams) {
        this.billFrom = billFrom;
        this.billUntil = billUntil;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BillFrom billFrom;

        private BillUntil billUntil;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance build() {
          return new QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance(
              this.billFrom, this.billUntil, this.extraParams);
        }

        /** The start of the period to bill from when the Quote is accepted. */
        public Builder setBillFrom(
            QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom billFrom) {
          this.billFrom = billFrom;
          return this;
        }

        /** The end of the period to bill until when the Quote is accepted. */
        public Builder setBillUntil(
            QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance#extraParams}
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
         * map. See {@link QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance#extraParams}
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
      public static class BillFrom {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of a Quote line to start the bill period from. */
        @SerializedName("line_starts_at")
        LineStartsAt lineStartsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /** <strong>Required.</strong> The type of method to specify the {@code bill_from} time. */
        @SerializedName("type")
        Type type;

        private BillFrom(
            Map<String, Object> extraParams, LineStartsAt lineStartsAt, Long timestamp, Type type) {
          this.extraParams = extraParams;
          this.lineStartsAt = lineStartsAt;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private LineStartsAt lineStartsAt;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom build() {
            return new QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom(
                this.extraParams, this.lineStartsAt, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom#extraParams} for
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
           * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of a Quote line to start the bill period from. */
          public Builder setLineStartsAt(
              QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt
                  lineStartsAt) {
            this.lineStartsAt = lineStartsAt;
            return this;
          }

          /** A precise Unix timestamp. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of method to specify the {@code bill_from} time.
           */
          public Builder setType(
              QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class LineStartsAt {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The ID of a quote line. */
          @SerializedName("id")
          Object id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineStartsAt(Map<String, Object> extraParams, Object id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt
                build() {
              return new QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom
                  .LineStartsAt(this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
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
             * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(String id) {
              this.id = id;
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(EmptyParam id) {
              this.id = id;
              return this;
            }

            /**
             * The position of the previous quote line in the {@code lines} array after which this
             * line should begin. Indexes start from 0 and must be less than the index of the
             * current line in the array.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("line_starts_at")
          LINE_STARTS_AT("line_starts_at"),

          @SerializedName("now")
          NOW("now"),

          @SerializedName("pause_collection_start")
          PAUSE_COLLECTION_START("pause_collection_start"),

          @SerializedName("quote_acceptance_date")
          QUOTE_ACCEPTANCE_DATE("quote_acceptance_date"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class BillUntil {
        /** Details of the duration over which to bill. */
        @SerializedName("duration")
        Duration duration;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Details of a Quote line item from which to bill until. */
        @SerializedName("line_ends_at")
        LineEndsAt lineEndsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /** <strong>Required.</strong> The type of method to specify the {@code bill_until} time. */
        @SerializedName("type")
        Type type;

        private BillUntil(
            Duration duration,
            Map<String, Object> extraParams,
            LineEndsAt lineEndsAt,
            Long timestamp,
            Type type) {
          this.duration = duration;
          this.extraParams = extraParams;
          this.lineEndsAt = lineEndsAt;
          this.timestamp = timestamp;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Duration duration;

          private Map<String, Object> extraParams;

          private LineEndsAt lineEndsAt;

          private Long timestamp;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil build() {
            return new QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil(
                this.duration, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
          }

          /** Details of the duration over which to bill. */
          public Builder setDuration(
              QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration
                  duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil#extraParams} for
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
           * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Details of a Quote line item from which to bill until. */
          public Builder setLineEndsAt(
              QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt
                  lineEndsAt) {
            this.lineEndsAt = lineEndsAt;
            return this;
          }

          /** A precise Unix timestamp. */
          public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /**
           * <strong>Required.</strong> The type of method to specify the {@code bill_until} time.
           */
          public Builder setType(
              QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class Duration {
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;

          private Duration(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
            public QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration
                build() {
              return new QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil
                  .Duration(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration#extraParams}
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
             * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration#extraParams}
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
             * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
             * {@code week}, {@code month} or {@code year}.
             */
            public Builder setInterval(
                QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration
                        .Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> The number of intervals, as an whole number greater than
             * 0. Stripe multiplies this by the interval type to get the overall duration.
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
        public static class LineEndsAt {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The ID of a quote line. */
          @SerializedName("id")
          Object id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineEndsAt(Map<String, Object> extraParams, Object id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt
                build() {
              return new QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil
                  .LineEndsAt(this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
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
             * QuoteUpdateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(String id) {
              this.id = id;
              return this;
            }

            /** The ID of a quote line. */
            public Builder setId(EmptyParam id) {
              this.id = id;
              return this;
            }

            /**
             * The position of the previous quote line in the {@code lines} array after which this
             * line should begin. Indexes start from 0 and must be less than the index of the
             * current line in the array.
             */
            public Builder setIndex(Long index) {
              this.index = index;
              return this;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("duration")
          DURATION("duration"),

          @SerializedName("line_ends_at")
          LINE_ENDS_AT("line_ends_at"),

          @SerializedName("schedule_end")
          SCHEDULE_END("schedule_end"),

          @SerializedName("timestamp")
          TIMESTAMP("timestamp"),

          @SerializedName("upcoming_invoice")
          UPCOMING_INVOICE("upcoming_invoice");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
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
     * the percentage of the subscription invoice total that will be transferred to the destination
     * account. By default, the entire amount is transferred to the destination. There must be at
     * least 1 line item with a recurring price to use this field.
     */
    @SerializedName("amount_percent")
    BigDecimal amountPercent;

    /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
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
       * the percentage of the subscription invoice total that will be transferred to the
       * destination account. By default, the entire amount is transferred to the destination. There
       * must be at least 1 line item with a recurring price to use this field.
       */
      public Builder setAmountPercent(BigDecimal amountPercent) {
        this.amountPercent = amountPercent;
        return this;
      }

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
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

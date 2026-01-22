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
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class QuoteCreateParams extends ApiRequestParams {
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
  String customer;

  /**
   * The account for which this quote belongs to. A customer or account is required before
   * finalizing the quote. Once specified, it cannot be changed.
   */
  @SerializedName("customer_account")
  String customerAccount;

  /** The tax rates that will apply to any line item that does not have {@code tax_rates} set. */
  @SerializedName("default_tax_rates")
  Object defaultTaxRates;

  /**
   * A description that will be displayed on the quote PDF. If no value is passed, the default
   * description configured in your <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template settings</a> will be
   * used.
   */
  @SerializedName("description")
  Object description;

  /** The discounts applied to the quote. */
  @SerializedName("discounts")
  Object discounts;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A future timestamp on which the quote will be canceled if in {@code open} or {@code draft}
   * status. Measured in seconds since the Unix epoch. If no value is passed, the default expiration
   * date configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote
   * template settings</a> will be used.
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

  /**
   * A footer that will be displayed on the quote PDF. If no value is passed, the default footer
   * configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote template
   * settings</a> will be used.
   */
  @SerializedName("footer")
  Object footer;

  /**
   * Clone an existing quote. The new quote will be created in {@code status=draft}. When using this
   * parameter, you cannot specify any other parameters except for {@code expires_at}.
   */
  @SerializedName("from_quote")
  FromQuote fromQuote;

  /**
   * A header that will be displayed on the quote PDF. If no value is passed, the default header
   * configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote template
   * settings</a> will be used.
   */
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
  List<QuoteCreateParams.LineItem> lineItems;

  /**
   * A list of <a href="https://docs.stripe.com/api/quote_lines">quote lines</a> on the quote. These
   * lines describe changes, in the order provided, that will be used to create new subscription
   * schedules or update existing subscription schedules when the quote is accepted.
   */
  @SerializedName("lines")
  List<QuoteCreateParams.Line> lines;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
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
  List<QuoteCreateParams.SubscriptionDataOverride> subscriptionDataOverrides;

  /** ID of the test clock to attach to the quote. */
  @SerializedName("test_clock")
  String testClock;

  /** The data with which to automatically create a Transfer for each of the invoices. */
  @SerializedName("transfer_data")
  Object transferData;

  private QuoteCreateParams(
      Boolean allowBackdatedLines,
      Object applicationFeeAmount,
      Object applicationFeePercent,
      AutomaticTax automaticTax,
      CollectionMethod collectionMethod,
      String customer,
      String customerAccount,
      Object defaultTaxRates,
      Object description,
      Object discounts,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      Object footer,
      FromQuote fromQuote,
      Object header,
      InvoiceSettings invoiceSettings,
      List<QuoteCreateParams.LineItem> lineItems,
      List<QuoteCreateParams.Line> lines,
      Map<String, String> metadata,
      Object onBehalfOf,
      SubscriptionData subscriptionData,
      List<QuoteCreateParams.SubscriptionDataOverride> subscriptionDataOverrides,
      String testClock,
      Object transferData) {
    this.allowBackdatedLines = allowBackdatedLines;
    this.applicationFeeAmount = applicationFeeAmount;
    this.applicationFeePercent = applicationFeePercent;
    this.automaticTax = automaticTax;
    this.collectionMethod = collectionMethod;
    this.customer = customer;
    this.customerAccount = customerAccount;
    this.defaultTaxRates = defaultTaxRates;
    this.description = description;
    this.discounts = discounts;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.footer = footer;
    this.fromQuote = fromQuote;
    this.header = header;
    this.invoiceSettings = invoiceSettings;
    this.lineItems = lineItems;
    this.lines = lines;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.subscriptionData = subscriptionData;
    this.subscriptionDataOverrides = subscriptionDataOverrides;
    this.testClock = testClock;
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

    private String customer;

    private String customerAccount;

    private Object defaultTaxRates;

    private Object description;

    private Object discounts;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private Object footer;

    private FromQuote fromQuote;

    private Object header;

    private InvoiceSettings invoiceSettings;

    private List<QuoteCreateParams.LineItem> lineItems;

    private List<QuoteCreateParams.Line> lines;

    private Map<String, String> metadata;

    private Object onBehalfOf;

    private SubscriptionData subscriptionData;

    private List<QuoteCreateParams.SubscriptionDataOverride> subscriptionDataOverrides;

    private String testClock;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public QuoteCreateParams build() {
      return new QuoteCreateParams(
          this.allowBackdatedLines,
          this.applicationFeeAmount,
          this.applicationFeePercent,
          this.automaticTax,
          this.collectionMethod,
          this.customer,
          this.customerAccount,
          this.defaultTaxRates,
          this.description,
          this.discounts,
          this.expand,
          this.expiresAt,
          this.extraParams,
          this.footer,
          this.fromQuote,
          this.header,
          this.invoiceSettings,
          this.lineItems,
          this.lines,
          this.metadata,
          this.onBehalfOf,
          this.subscriptionData,
          this.subscriptionDataOverrides,
          this.testClock,
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
    public Builder setAutomaticTax(QuoteCreateParams.AutomaticTax automaticTax) {
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
    public Builder setCollectionMethod(QuoteCreateParams.CollectionMethod collectionMethod) {
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
     * The account for which this quote belongs to. A customer or account is required before
     * finalizing the quote. Once specified, it cannot be changed.
     */
    public Builder setCustomerAccount(String customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#defaultTaxRates} for the field documentation.
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
     * QuoteCreateParams#defaultTaxRates} for the field documentation.
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

    /**
     * A description that will be displayed on the quote PDF. If no value is passed, the default
     * description configured in your <a
     * href="https://dashboard.stripe.com/settings/billing/quote">quote template settings</a> will
     * be used.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * A description that will be displayed on the quote PDF. If no value is passed, the default
     * description configured in your <a
     * href="https://dashboard.stripe.com/settings/billing/quote">quote template settings</a> will
     * be used.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(QuoteCreateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<QuoteCreateParams.Discount>();
      }
      ((List<QuoteCreateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<QuoteCreateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<QuoteCreateParams.Discount>();
      }
      ((List<QuoteCreateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /** The discounts applied to the quote. */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /** The discounts applied to the quote. */
    public Builder setDiscounts(List<QuoteCreateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#expand} for the field documentation.
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
     * QuoteCreateParams#expand} for the field documentation.
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
     * status. Measured in seconds since the Unix epoch. If no value is passed, the default
     * expiration date configured in your <a
     * href="https://dashboard.stripe.com/settings/billing/quote">quote template settings</a> will
     * be used.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * QuoteCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link QuoteCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A footer that will be displayed on the quote PDF. If no value is passed, the default footer
     * configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote
     * template settings</a> will be used.
     */
    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    /**
     * A footer that will be displayed on the quote PDF. If no value is passed, the default footer
     * configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote
     * template settings</a> will be used.
     */
    public Builder setFooter(EmptyParam footer) {
      this.footer = footer;
      return this;
    }

    /**
     * Clone an existing quote. The new quote will be created in {@code status=draft}. When using
     * this parameter, you cannot specify any other parameters except for {@code expires_at}.
     */
    public Builder setFromQuote(QuoteCreateParams.FromQuote fromQuote) {
      this.fromQuote = fromQuote;
      return this;
    }

    /**
     * A header that will be displayed on the quote PDF. If no value is passed, the default header
     * configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote
     * template settings</a> will be used.
     */
    public Builder setHeader(String header) {
      this.header = header;
      return this;
    }

    /**
     * A header that will be displayed on the quote PDF. If no value is passed, the default header
     * configured in your <a href="https://dashboard.stripe.com/settings/billing/quote">quote
     * template settings</a> will be used.
     */
    public Builder setHeader(EmptyParam header) {
      this.header = header;
      return this;
    }

    /** All invoices will be billed using the specified settings. */
    public Builder setInvoiceSettings(QuoteCreateParams.InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(QuoteCreateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<QuoteCreateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add an element to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#lines} for the field documentation.
     */
    public Builder addLine(QuoteCreateParams.Line element) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.add(element);
      return this;
    }

    /**
     * Add all elements to `lines` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#lines} for the field documentation.
     */
    public Builder addAllLine(List<QuoteCreateParams.Line> elements) {
      if (this.lines == null) {
        this.lines = new ArrayList<>();
      }
      this.lines.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * QuoteCreateParams#metadata} for the field documentation.
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
     * See {@link QuoteCreateParams#metadata} for the field documentation.
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
     * When creating a subscription or subscription schedule, the specified configuration data will
     * be used. There must be at least one line item with a recurring price for a subscription or
     * subscription schedule to be created. A subscription schedule is created if {@code
     * subscription_data[effective_date]} is present and in the future, otherwise a subscription is
     * created.
     */
    public Builder setSubscriptionData(QuoteCreateParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /**
     * Add an element to `subscriptionDataOverrides` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link QuoteCreateParams#subscriptionDataOverrides} for the field documentation.
     */
    public Builder addSubscriptionDataOverride(QuoteCreateParams.SubscriptionDataOverride element) {
      if (this.subscriptionDataOverrides == null) {
        this.subscriptionDataOverrides = new ArrayList<>();
      }
      this.subscriptionDataOverrides.add(element);
      return this;
    }

    /**
     * Add all elements to `subscriptionDataOverrides` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link QuoteCreateParams#subscriptionDataOverrides} for the field documentation.
     */
    public Builder addAllSubscriptionDataOverride(
        List<QuoteCreateParams.SubscriptionDataOverride> elements) {
      if (this.subscriptionDataOverrides == null) {
        this.subscriptionDataOverrides = new ArrayList<>();
      }
      this.subscriptionDataOverrides.addAll(elements);
      return this;
    }

    /** ID of the test clock to attach to the quote. */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }

    /** The data with which to automatically create a Transfer for each of the invoices. */
    public Builder setTransferData(QuoteCreateParams.TransferData transferData) {
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
  @EqualsAndHashCode(callSuper = false)
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
      public QuoteCreateParams.AutomaticTax build() {
        return new QuoteCreateParams.AutomaticTax(this.enabled, this.extraParams, this.liability);
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
       * QuoteCreateParams.AutomaticTax#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.AutomaticTax#extraParams} for the field documentation.
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
      public Builder setLiability(QuoteCreateParams.AutomaticTax.Liability liability) {
        this.liability = liability;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      String account;

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

      private Liability(String account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.AutomaticTax.Liability build() {
          return new QuoteCreateParams.AutomaticTax.Liability(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.AutomaticTax.Liability#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.AutomaticTax.Liability#extraParams} for the field
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
        public Builder setType(QuoteCreateParams.AutomaticTax.Liability.Type type) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    String coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    String discount;

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
    String promotionCode;

    private Discount(
        String coupon,
        String discount,
        DiscountEnd discountEnd,
        Map<String, Object> extraParams,
        String promotionCode) {
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
      private String coupon;

      private String discount;

      private DiscountEnd discountEnd;

      private Map<String, Object> extraParams;

      private String promotionCode;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.Discount build() {
        return new QuoteCreateParams.Discount(
            this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
      }

      /** ID of the coupon to create a new discount for. */
      public Builder setCoupon(String coupon) {
        this.coupon = coupon;
        return this;
      }

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      public Builder setDiscount(String discount) {
        this.discount = discount;
        return this;
      }

      /** Details to determine how long the discount should be applied for. */
      public Builder setDiscountEnd(QuoteCreateParams.Discount.DiscountEnd discountEnd) {
        this.discountEnd = discountEnd;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.Discount#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.Discount#extraParams} for the field documentation.
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.Discount.DiscountEnd build() {
          return new QuoteCreateParams.Discount.DiscountEnd(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Time span for the redeemed discount. */
        public Builder setDuration(QuoteCreateParams.Discount.DiscountEnd.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Discount.DiscountEnd#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.Discount.DiscountEnd#extraParams} for the field
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
        public Builder setType(QuoteCreateParams.Discount.DiscountEnd.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.Discount.DiscountEnd.Duration build() {
            return new QuoteCreateParams.Discount.DiscountEnd.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Discount.DiscountEnd.Duration#extraParams} for the
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
           * map. See {@link QuoteCreateParams.Discount.DiscountEnd.Duration#extraParams} for the
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
              QuoteCreateParams.Discount.DiscountEnd.Duration.Interval interval) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class FromQuote {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Whether this quote is a revision of the previous quote. */
    @SerializedName("is_revision")
    Boolean isRevision;

    /** <strong>Required.</strong> The {@code id} of the quote that will be cloned. */
    @SerializedName("quote")
    String quote;

    private FromQuote(Map<String, Object> extraParams, Boolean isRevision, String quote) {
      this.extraParams = extraParams;
      this.isRevision = isRevision;
      this.quote = quote;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Boolean isRevision;

      private String quote;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.FromQuote build() {
        return new QuoteCreateParams.FromQuote(this.extraParams, this.isRevision, this.quote);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.FromQuote#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.FromQuote#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Whether this quote is a revision of the previous quote. */
      public Builder setIsRevision(Boolean isRevision) {
        this.isRevision = isRevision;
        return this;
      }

      /** <strong>Required.</strong> The {@code id} of the quote that will be cloned. */
      public Builder setQuote(String quote) {
        this.quote = quote;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
      public QuoteCreateParams.InvoiceSettings build() {
        return new QuoteCreateParams.InvoiceSettings(
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
       * QuoteCreateParams.InvoiceSettings#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.InvoiceSettings#extraParams} for the field documentation.
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
      public Builder setIssuer(QuoteCreateParams.InvoiceSettings.Issuer issuer) {
        this.issuer = issuer;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Issuer {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      String account;

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

      private Issuer(String account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.InvoiceSettings.Issuer build() {
          return new QuoteCreateParams.InvoiceSettings.Issuer(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.InvoiceSettings.Issuer#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.InvoiceSettings.Issuer#extraParams} for the field
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
        public Builder setType(QuoteCreateParams.InvoiceSettings.Issuer.Type type) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Line {
    /** An array of operations the quote line performs. */
    @SerializedName("actions")
    List<QuoteCreateParams.Line.Action> actions;

    /** Details to identify the subscription schedule the quote line applies to. */
    @SerializedName("applies_to")
    AppliesTo appliesTo;

    /**
     * For point-in-time quote lines (having no {@code ends_at} timestamp), this attribute lets you
     * set or remove whether the subscription's billing cycle anchor is reset at the Quote Line
     * {@code starts_at} timestamp.For time-span based quote lines (having both {@code starts_at}
     * and {@code ends_at}), the only valid value is {@code automatic}, which removes any previously
     * configured billing cycle anchor resets during the window of time spanning the quote line.
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

    /** Configures how the quote handles billing for line transitions. */
    @SerializedName("effective_at")
    EffectiveAt effectiveAt;

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
        List<QuoteCreateParams.Line.Action> actions,
        AppliesTo appliesTo,
        BillingCycleAnchor billingCycleAnchor,
        CancelSubscriptionSchedule cancelSubscriptionSchedule,
        EffectiveAt effectiveAt,
        EndsAt endsAt,
        Map<String, Object> extraParams,
        ProrationBehavior prorationBehavior,
        SetPauseCollection setPauseCollection,
        SetScheduleEnd setScheduleEnd,
        StartsAt startsAt,
        TrialSettings trialSettings) {
      this.actions = actions;
      this.appliesTo = appliesTo;
      this.billingCycleAnchor = billingCycleAnchor;
      this.cancelSubscriptionSchedule = cancelSubscriptionSchedule;
      this.effectiveAt = effectiveAt;
      this.endsAt = endsAt;
      this.extraParams = extraParams;
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
      private List<QuoteCreateParams.Line.Action> actions;

      private AppliesTo appliesTo;

      private BillingCycleAnchor billingCycleAnchor;

      private CancelSubscriptionSchedule cancelSubscriptionSchedule;

      private EffectiveAt effectiveAt;

      private EndsAt endsAt;

      private Map<String, Object> extraParams;

      private ProrationBehavior prorationBehavior;

      private SetPauseCollection setPauseCollection;

      private SetScheduleEnd setScheduleEnd;

      private StartsAt startsAt;

      private TrialSettings trialSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.Line build() {
        return new QuoteCreateParams.Line(
            this.actions,
            this.appliesTo,
            this.billingCycleAnchor,
            this.cancelSubscriptionSchedule,
            this.effectiveAt,
            this.endsAt,
            this.extraParams,
            this.prorationBehavior,
            this.setPauseCollection,
            this.setScheduleEnd,
            this.startsAt,
            this.trialSettings);
      }

      /**
       * Add an element to `actions` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteCreateParams.Line#actions} for the field documentation.
       */
      public Builder addAction(QuoteCreateParams.Line.Action element) {
        if (this.actions == null) {
          this.actions = new ArrayList<>();
        }
        this.actions.add(element);
        return this;
      }

      /**
       * Add all elements to `actions` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteCreateParams.Line#actions} for the field documentation.
       */
      public Builder addAllAction(List<QuoteCreateParams.Line.Action> elements) {
        if (this.actions == null) {
          this.actions = new ArrayList<>();
        }
        this.actions.addAll(elements);
        return this;
      }

      /** Details to identify the subscription schedule the quote line applies to. */
      public Builder setAppliesTo(QuoteCreateParams.Line.AppliesTo appliesTo) {
        this.appliesTo = appliesTo;
        return this;
      }

      /**
       * For point-in-time quote lines (having no {@code ends_at} timestamp), this attribute lets
       * you set or remove whether the subscription's billing cycle anchor is reset at the Quote
       * Line {@code starts_at} timestamp.For time-span based quote lines (having both {@code
       * starts_at} and {@code ends_at}), the only valid value is {@code automatic}, which removes
       * any previously configured billing cycle anchor resets during the window of time spanning
       * the quote line.
       */
      public Builder setBillingCycleAnchor(
          QuoteCreateParams.Line.BillingCycleAnchor billingCycleAnchor) {
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
          QuoteCreateParams.Line.CancelSubscriptionSchedule cancelSubscriptionSchedule) {
        this.cancelSubscriptionSchedule = cancelSubscriptionSchedule;
        return this;
      }

      /** Configures how the quote handles billing for line transitions. */
      public Builder setEffectiveAt(QuoteCreateParams.Line.EffectiveAt effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
      }

      /**
       * Details to identify the end of the time range modified by the proposed change. If not
       * supplied, the quote line is considered a point-in-time operation that only affects the
       * exact timestamp at {@code starts_at}, and a restricted set of attributes is supported on
       * the quote line.
       */
      public Builder setEndsAt(QuoteCreateParams.Line.EndsAt endsAt) {
        this.endsAt = endsAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.Line#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.Line#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Changes to how Stripe handles prorations during the quote line's time span. Affects if and
       * how prorations are created when a future phase starts.
       */
      public Builder setProrationBehavior(
          QuoteCreateParams.Line.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }

      /**
       * Defines how to pause collection for the underlying subscription throughout the duration of
       * the amendment.
       */
      public Builder setSetPauseCollection(
          QuoteCreateParams.Line.SetPauseCollection setPauseCollection) {
        this.setPauseCollection = setPauseCollection;
        return this;
      }

      /**
       * Timestamp helper to end the underlying schedule early, based on the acompanying line's
       * start or end date.
       */
      public Builder setSetScheduleEnd(QuoteCreateParams.Line.SetScheduleEnd setScheduleEnd) {
        this.setScheduleEnd = setScheduleEnd;
        return this;
      }

      /**
       * Details to identify the earliest timestamp where the proposed change should take effect.
       */
      public Builder setStartsAt(QuoteCreateParams.Line.StartsAt startsAt) {
        this.startsAt = startsAt;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(QuoteCreateParams.Line.TrialSettings trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
      List<QuoteCreateParams.Line.Action.SetDiscount> setDiscounts;

      /** Details for the {@code set_items} type. */
      @SerializedName("set_items")
      List<QuoteCreateParams.Line.Action.SetItem> setItems;

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
          List<QuoteCreateParams.Line.Action.SetDiscount> setDiscounts,
          List<QuoteCreateParams.Line.Action.SetItem> setItems,
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

        private List<QuoteCreateParams.Line.Action.SetDiscount> setDiscounts;

        private List<QuoteCreateParams.Line.Action.SetItem> setItems;

        private Object setMetadata;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.Line.Action build() {
          return new QuoteCreateParams.Line.Action(
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
        public Builder setAddDiscount(QuoteCreateParams.Line.Action.AddDiscount addDiscount) {
          this.addDiscount = addDiscount;
          return this;
        }

        /** Details for the {@code add_item} type. */
        public Builder setAddItem(QuoteCreateParams.Line.Action.AddItem addItem) {
          this.addItem = addItem;
          return this;
        }

        /**
         * Add a key/value pair to `addMetadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.Action#addMetadata} for the field documentation.
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
         * map. See {@link QuoteCreateParams.Line.Action#addMetadata} for the field documentation.
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
         * map. See {@link QuoteCreateParams.Line.Action#extraParams} for the field documentation.
         */
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
         * map. See {@link QuoteCreateParams.Line.Action#extraParams} for the field documentation.
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
            QuoteCreateParams.Line.Action.RemoveDiscount removeDiscount) {
          this.removeDiscount = removeDiscount;
          return this;
        }

        /** Details for the {@code remove_item} type. */
        public Builder setRemoveItem(QuoteCreateParams.Line.Action.RemoveItem removeItem) {
          this.removeItem = removeItem;
          return this;
        }

        /**
         * Add an element to `removeMetadata` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.Line.Action#removeMetadata} for the field documentation.
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
         * See {@link QuoteCreateParams.Line.Action#removeMetadata} for the field documentation.
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
         * QuoteCreateParams.Line.Action#setDiscounts} for the field documentation.
         */
        public Builder addSetDiscount(QuoteCreateParams.Line.Action.SetDiscount element) {
          if (this.setDiscounts == null) {
            this.setDiscounts = new ArrayList<>();
          }
          this.setDiscounts.add(element);
          return this;
        }

        /**
         * Add all elements to `setDiscounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.Line.Action#setDiscounts} for the field documentation.
         */
        public Builder addAllSetDiscount(List<QuoteCreateParams.Line.Action.SetDiscount> elements) {
          if (this.setDiscounts == null) {
            this.setDiscounts = new ArrayList<>();
          }
          this.setDiscounts.addAll(elements);
          return this;
        }

        /**
         * Add an element to `setItems` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.Line.Action#setItems} for the field documentation.
         */
        public Builder addSetItem(QuoteCreateParams.Line.Action.SetItem element) {
          if (this.setItems == null) {
            this.setItems = new ArrayList<>();
          }
          this.setItems.add(element);
          return this;
        }

        /**
         * Add all elements to `setItems` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.Line.Action#setItems} for the field documentation.
         */
        public Builder addAllSetItem(List<QuoteCreateParams.Line.Action.SetItem> elements) {
          if (this.setItems == null) {
            this.setItems = new ArrayList<>();
          }
          this.setItems.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `setMetadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.Action#setMetadata} for the field documentation.
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
         * map. See {@link QuoteCreateParams.Line.Action#setMetadata} for the field documentation.
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
        public Builder setType(QuoteCreateParams.Line.Action.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AddDiscount {
        /** The coupon code to redeem. */
        @SerializedName("coupon")
        String coupon;

        /** An ID of an existing discount for a coupon that was already redeemed. */
        @SerializedName("discount")
        String discount;

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
        String promotionCode;

        /** Settings for discount application including service period anchoring. */
        @SerializedName("settings")
        Settings settings;

        private AddDiscount(
            String coupon,
            String discount,
            DiscountEnd discountEnd,
            Map<String, Object> extraParams,
            Long index,
            String promotionCode,
            Settings settings) {
          this.coupon = coupon;
          this.discount = discount;
          this.discountEnd = discountEnd;
          this.extraParams = extraParams;
          this.index = index;
          this.promotionCode = promotionCode;
          this.settings = settings;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private DiscountEnd discountEnd;

          private Map<String, Object> extraParams;

          private Long index;

          private String promotionCode;

          private Settings settings;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.Action.AddDiscount build() {
            return new QuoteCreateParams.Line.Action.AddDiscount(
                this.coupon,
                this.discount,
                this.discountEnd,
                this.extraParams,
                this.index,
                this.promotionCode,
                this.settings);
          }

          /** The coupon code to redeem. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** An ID of an existing discount for a coupon that was already redeemed. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /** Details to determine how long the discount should be applied for. */
          public Builder setDiscountEnd(
              QuoteCreateParams.Line.Action.AddDiscount.DiscountEnd discountEnd) {
            this.discountEnd = discountEnd;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.Action.AddDiscount#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.Action.AddDiscount#extraParams} for the field
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

          /** Settings for discount application including service period anchoring. */
          public Builder setSettings(QuoteCreateParams.Line.Action.AddDiscount.Settings settings) {
            this.settings = settings;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.Line.Action.AddDiscount.DiscountEnd build() {
              return new QuoteCreateParams.Line.Action.AddDiscount.DiscountEnd(
                  this.extraParams, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.Line.Action.AddDiscount.DiscountEnd#extraParams} for the field
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
             * QuoteCreateParams.Line.Action.AddDiscount.DiscountEnd#extraParams} for the field
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
                QuoteCreateParams.Line.Action.AddDiscount.DiscountEnd.Type type) {
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

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Settings {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Configures service period cycle anchoring. */
          @SerializedName("service_period_anchor_config")
          ServicePeriodAnchorConfig servicePeriodAnchorConfig;

          /**
           * The start date of the discount's service period when applying a coupon or promotion
           * code with a service period duration. Defaults to {@code line_start} if omitted.
           */
          @SerializedName("start_date")
          StartDate startDate;

          private Settings(
              Map<String, Object> extraParams,
              ServicePeriodAnchorConfig servicePeriodAnchorConfig,
              StartDate startDate) {
            this.extraParams = extraParams;
            this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
            this.startDate = startDate;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ServicePeriodAnchorConfig servicePeriodAnchorConfig;

            private StartDate startDate;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.Line.Action.AddDiscount.Settings build() {
              return new QuoteCreateParams.Line.Action.AddDiscount.Settings(
                  this.extraParams, this.servicePeriodAnchorConfig, this.startDate);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.Line.Action.AddDiscount.Settings#extraParams} for the field
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
             * QuoteCreateParams.Line.Action.AddDiscount.Settings#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Configures service period cycle anchoring. */
            public Builder setServicePeriodAnchorConfig(
                QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig
                    servicePeriodAnchorConfig) {
              this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
              return this;
            }

            /**
             * The start date of the discount's service period when applying a coupon or promotion
             * code with a service period duration. Defaults to {@code line_start} if omitted.
             */
            public Builder setStartDate(
                QuoteCreateParams.Line.Action.AddDiscount.Settings.StartDate startDate) {
              this.startDate = startDate;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class ServicePeriodAnchorConfig {
            /**
             * Anchor the service period to a custom date. Type must be {@code custom} to specify.
             */
            @SerializedName("custom")
            Custom custom;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** The type of service period anchor config. Defaults to {@code inherit} if omitted. */
            @SerializedName("type")
            Type type;

            private ServicePeriodAnchorConfig(
                Custom custom, Map<String, Object> extraParams, Type type) {
              this.custom = custom;
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Custom custom;

              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig
                  build() {
                return new QuoteCreateParams.Line.Action.AddDiscount.Settings
                    .ServicePeriodAnchorConfig(this.custom, this.extraParams, this.type);
              }

              /**
               * Anchor the service period to a custom date. Type must be {@code custom} to specify.
               */
              public Builder setCustom(
                  QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig
                          .Custom
                      custom) {
                this.custom = custom;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig#extraParams}
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
               * QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig#extraParams}
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
               * The type of service period anchor config. Defaults to {@code inherit} if omitted.
               */
              public Builder setType(
                  QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Custom {
              /**
               * <strong>Required.</strong> The day of the month the anchor should be. Ranges from 1
               * to 31.
               */
              @SerializedName("day_of_month")
              Long dayOfMonth;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** The hour of the day the anchor should be. Ranges from 0 to 23. */
              @SerializedName("hour")
              Long hour;

              /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
              @SerializedName("minute")
              Long minute;

              /** The month to start full cycle periods. Ranges from 1 to 12. */
              @SerializedName("month")
              Long month;

              /** The second of the minute the anchor should be. Ranges from 0 to 59. */
              @SerializedName("second")
              Long second;

              private Custom(
                  Long dayOfMonth,
                  Map<String, Object> extraParams,
                  Long hour,
                  Long minute,
                  Long month,
                  Long second) {
                this.dayOfMonth = dayOfMonth;
                this.extraParams = extraParams;
                this.hour = hour;
                this.minute = minute;
                this.month = month;
                this.second = second;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Long dayOfMonth;

                private Map<String, Object> extraParams;

                private Long hour;

                private Long minute;

                private Long month;

                private Long second;

                /** Finalize and obtain parameter instance from this builder. */
                public QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig
                        .Custom
                    build() {
                  return new QuoteCreateParams.Line.Action.AddDiscount.Settings
                      .ServicePeriodAnchorConfig.Custom(
                      this.dayOfMonth,
                      this.extraParams,
                      this.hour,
                      this.minute,
                      this.month,
                      this.second);
                }

                /**
                 * <strong>Required.</strong> The day of the month the anchor should be. Ranges from
                 * 1 to 31.
                 */
                public Builder setDayOfMonth(Long dayOfMonth) {
                  this.dayOfMonth = dayOfMonth;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
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
                 * QuoteCreateParams.Line.Action.AddDiscount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** The hour of the day the anchor should be. Ranges from 0 to 23. */
                public Builder setHour(Long hour) {
                  this.hour = hour;
                  return this;
                }

                /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
                public Builder setMinute(Long minute) {
                  this.minute = minute;
                  return this;
                }

                /** The month to start full cycle periods. Ranges from 1 to 12. */
                public Builder setMonth(Long month) {
                  this.month = month;
                  return this;
                }

                /** The second of the minute the anchor should be. Ranges from 0 to 59. */
                public Builder setSecond(Long second) {
                  this.second = second;
                  return this;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("custom")
              CUSTOM("custom"),

              @SerializedName("inherit")
              INHERIT("inherit");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          public enum StartDate implements ApiRequestParams.EnumParam {
            @SerializedName("current_period_end")
            CURRENT_PERIOD_END("current_period_end"),

            @SerializedName("current_period_start")
            CURRENT_PERIOD_START("current_period_start"),

            @SerializedName("line_start")
            LINE_START("line_start");

            @Getter(onMethod_ = {@Override})
            private final String value;

            StartDate(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AddItem {
        /**
         * The discounts applied to the item. Subscription item discounts are applied before
         * subscription discounts.
         */
        @SerializedName("discounts")
        List<QuoteCreateParams.Line.Action.AddItem.Discount> discounts;

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
         * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** <strong>Required.</strong> The ID of the price object. */
        @SerializedName("price")
        String price;

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

        /** The ID of the trial offer to apply to the configuration item. */
        @SerializedName("trial_offer")
        String trialOffer;

        private AddItem(
            List<QuoteCreateParams.Line.Action.AddItem.Discount> discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            String price,
            Long quantity,
            List<String> taxRates,
            Trial trial,
            String trialOffer) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.price = price;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
          this.trialOffer = trialOffer;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<QuoteCreateParams.Line.Action.AddItem.Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          private String trialOffer;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.Action.AddItem build() {
            return new QuoteCreateParams.Line.Action.AddItem(
                this.discounts,
                this.extraParams,
                this.metadata,
                this.price,
                this.quantity,
                this.taxRates,
                this.trial,
                this.trialOffer);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteCreateParams.Line.Action.AddItem#discounts} for the field documentation.
           */
          public Builder addDiscount(QuoteCreateParams.Line.Action.AddItem.Discount element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteCreateParams.Line.Action.AddItem#discounts} for the field documentation.
           */
          public Builder addAllDiscount(
              List<QuoteCreateParams.Line.Action.AddItem.Discount> elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.Action.AddItem#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.Action.AddItem#extraParams} for the field
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
           * {@link QuoteCreateParams.Line.Action.AddItem#metadata} for the field documentation.
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
           * map. See {@link QuoteCreateParams.Line.Action.AddItem#metadata} for the field
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

          /** Quantity for this item. */
          public Builder setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Add an element to `taxRates` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteCreateParams.Line.Action.AddItem#taxRates} for the field documentation.
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
           * QuoteCreateParams.Line.Action.AddItem#taxRates} for the field documentation.
           */
          public Builder addAllTaxRate(List<String> elements) {
            if (this.taxRates == null) {
              this.taxRates = new ArrayList<>();
            }
            this.taxRates.addAll(elements);
            return this;
          }

          /** Options that configure the trial on the subscription item. */
          public Builder setTrial(QuoteCreateParams.Line.Action.AddItem.Trial trial) {
            this.trial = trial;
            return this;
          }

          /** The ID of the trial offer to apply to the configuration item. */
          public Builder setTrialOffer(String trialOffer) {
            this.trialOffer = trialOffer;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discount {
          /** ID of the coupon to create a new discount for. */
          @SerializedName("coupon")
          String coupon;

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          @SerializedName("discount")
          String discount;

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
          String promotionCode;

          /** Settings for discount application including service period anchoring. */
          @SerializedName("settings")
          Settings settings;

          private Discount(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              String promotionCode,
              Settings settings) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
            this.settings = settings;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private String promotionCode;

            private Settings settings;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.Line.Action.AddItem.Discount build() {
              return new QuoteCreateParams.Line.Action.AddItem.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode,
                  this.settings);
            }

            /** ID of the coupon to create a new discount for. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link QuoteCreateParams.Line.Action.AddItem.Discount#extraParams}
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
             * original map. See {@link QuoteCreateParams.Line.Action.AddItem.Discount#extraParams}
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

            /** Settings for discount application including service period anchoring. */
            public Builder setSettings(
                QuoteCreateParams.Line.Action.AddItem.Discount.Settings settings) {
              this.settings = settings;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
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
              public QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd build() {
                return new QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd(
                    this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd#extraParams} for the
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
               * QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd#extraParams} for the
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
                  QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Type type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
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
                public QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration build() {
                  return new QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration(
                      this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration#extraParams}
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
                 * QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration#extraParams}
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
                    QuoteCreateParams.Line.Action.AddItem.Discount.DiscountEnd.Duration.Interval
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

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Settings {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Configures service period cycle anchoring. */
            @SerializedName("service_period_anchor_config")
            ServicePeriodAnchorConfig servicePeriodAnchorConfig;

            /**
             * The start date of the discount's service period when applying a coupon or promotion
             * code with a service period duration. Defaults to {@code line_start} if omitted.
             */
            @SerializedName("start_date")
            StartDate startDate;

            private Settings(
                Map<String, Object> extraParams,
                ServicePeriodAnchorConfig servicePeriodAnchorConfig,
                StartDate startDate) {
              this.extraParams = extraParams;
              this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
              this.startDate = startDate;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private ServicePeriodAnchorConfig servicePeriodAnchorConfig;

              private StartDate startDate;

              /** Finalize and obtain parameter instance from this builder. */
              public QuoteCreateParams.Line.Action.AddItem.Discount.Settings build() {
                return new QuoteCreateParams.Line.Action.AddItem.Discount.Settings(
                    this.extraParams, this.servicePeriodAnchorConfig, this.startDate);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.AddItem.Discount.Settings#extraParams} for the field
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.AddItem.Discount.Settings#extraParams} for the field
               * documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Configures service period cycle anchoring. */
              public Builder setServicePeriodAnchorConfig(
                  QuoteCreateParams.Line.Action.AddItem.Discount.Settings.ServicePeriodAnchorConfig
                      servicePeriodAnchorConfig) {
                this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
                return this;
              }

              /**
               * The start date of the discount's service period when applying a coupon or promotion
               * code with a service period duration. Defaults to {@code line_start} if omitted.
               */
              public Builder setStartDate(
                  QuoteCreateParams.Line.Action.AddItem.Discount.Settings.StartDate startDate) {
                this.startDate = startDate;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class ServicePeriodAnchorConfig {
              /**
               * Anchor the service period to a custom date. Type must be {@code custom} to specify.
               */
              @SerializedName("custom")
              Custom custom;

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
               * The type of service period anchor config. Defaults to {@code inherit} if omitted.
               */
              @SerializedName("type")
              Type type;

              private ServicePeriodAnchorConfig(
                  Custom custom, Map<String, Object> extraParams, Type type) {
                this.custom = custom;
                this.extraParams = extraParams;
                this.type = type;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Custom custom;

                private Map<String, Object> extraParams;

                private Type type;

                /** Finalize and obtain parameter instance from this builder. */
                public QuoteCreateParams.Line.Action.AddItem.Discount.Settings
                        .ServicePeriodAnchorConfig
                    build() {
                  return new QuoteCreateParams.Line.Action.AddItem.Discount.Settings
                      .ServicePeriodAnchorConfig(this.custom, this.extraParams, this.type);
                }

                /**
                 * Anchor the service period to a custom date. Type must be {@code custom} to
                 * specify.
                 */
                public Builder setCustom(
                    QuoteCreateParams.Line.Action.AddItem.Discount.Settings
                            .ServicePeriodAnchorConfig.Custom
                        custom) {
                  this.custom = custom;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteCreateParams.Line.Action.AddItem.Discount.Settings.ServicePeriodAnchorConfig#extraParams}
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
                 * QuoteCreateParams.Line.Action.AddItem.Discount.Settings.ServicePeriodAnchorConfig#extraParams}
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
                 * The type of service period anchor config. Defaults to {@code inherit} if omitted.
                 */
                public Builder setType(
                    QuoteCreateParams.Line.Action.AddItem.Discount.Settings
                            .ServicePeriodAnchorConfig.Type
                        type) {
                  this.type = type;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Custom {
                /**
                 * <strong>Required.</strong> The day of the month the anchor should be. Ranges from
                 * 1 to 31.
                 */
                @SerializedName("day_of_month")
                Long dayOfMonth;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The hour of the day the anchor should be. Ranges from 0 to 23. */
                @SerializedName("hour")
                Long hour;

                /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
                @SerializedName("minute")
                Long minute;

                /** The month to start full cycle periods. Ranges from 1 to 12. */
                @SerializedName("month")
                Long month;

                /** The second of the minute the anchor should be. Ranges from 0 to 59. */
                @SerializedName("second")
                Long second;

                private Custom(
                    Long dayOfMonth,
                    Map<String, Object> extraParams,
                    Long hour,
                    Long minute,
                    Long month,
                    Long second) {
                  this.dayOfMonth = dayOfMonth;
                  this.extraParams = extraParams;
                  this.hour = hour;
                  this.minute = minute;
                  this.month = month;
                  this.second = second;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Long dayOfMonth;

                  private Map<String, Object> extraParams;

                  private Long hour;

                  private Long minute;

                  private Long month;

                  private Long second;

                  /** Finalize and obtain parameter instance from this builder. */
                  public QuoteCreateParams.Line.Action.AddItem.Discount.Settings
                          .ServicePeriodAnchorConfig.Custom
                      build() {
                    return new QuoteCreateParams.Line.Action.AddItem.Discount.Settings
                        .ServicePeriodAnchorConfig.Custom(
                        this.dayOfMonth,
                        this.extraParams,
                        this.hour,
                        this.minute,
                        this.month,
                        this.second);
                  }

                  /**
                   * <strong>Required.</strong> The day of the month the anchor should be. Ranges
                   * from 1 to 31.
                   */
                  public Builder setDayOfMonth(Long dayOfMonth) {
                    this.dayOfMonth = dayOfMonth;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * QuoteCreateParams.Line.Action.AddItem.Discount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
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
                   * QuoteCreateParams.Line.Action.AddItem.Discount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The hour of the day the anchor should be. Ranges from 0 to 23. */
                  public Builder setHour(Long hour) {
                    this.hour = hour;
                    return this;
                  }

                  /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
                  public Builder setMinute(Long minute) {
                    this.minute = minute;
                    return this;
                  }

                  /** The month to start full cycle periods. Ranges from 1 to 12. */
                  public Builder setMonth(Long month) {
                    this.month = month;
                    return this;
                  }

                  /** The second of the minute the anchor should be. Ranges from 0 to 59. */
                  public Builder setSecond(Long second) {
                    this.second = second;
                    return this;
                  }
                }
              }

              public enum Type implements ApiRequestParams.EnumParam {
                @SerializedName("custom")
                CUSTOM("custom"),

                @SerializedName("inherit")
                INHERIT("inherit");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Type(String value) {
                  this.value = value;
                }
              }
            }

            public enum StartDate implements ApiRequestParams.EnumParam {
              @SerializedName("current_period_end")
              CURRENT_PERIOD_END("current_period_end"),

              @SerializedName("current_period_start")
              CURRENT_PERIOD_START("current_period_start"),

              @SerializedName("line_start")
              LINE_START("line_start");

              @Getter(onMethod_ = {@Override})
              private final String value;

              StartDate(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.Line.Action.AddItem.Trial build() {
              return new QuoteCreateParams.Line.Action.AddItem.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * QuoteCreateParams.Line.Action.AddItem.Trial#convertsTo} for the field documentation.
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
             * list. See {@link QuoteCreateParams.Line.Action.AddItem.Trial#convertsTo} for the
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
             * original map. See {@link QuoteCreateParams.Line.Action.AddItem.Trial#extraParams} for
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
             * original map. See {@link QuoteCreateParams.Line.Action.AddItem.Trial#extraParams} for
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
            public Builder setType(QuoteCreateParams.Line.Action.AddItem.Trial.Type type) {
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
      @EqualsAndHashCode(callSuper = false)
      public static class RemoveDiscount {
        /** The coupon code to remove from the {@code discounts} array. */
        @SerializedName("coupon")
        String coupon;

        /** The ID of a discount to remove from the {@code discounts} array. */
        @SerializedName("discount")
        String discount;

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
        String promotionCode;

        private RemoveDiscount(
            String coupon, String discount, Map<String, Object> extraParams, String promotionCode) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private Map<String, Object> extraParams;

          private String promotionCode;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.Action.RemoveDiscount build() {
            return new QuoteCreateParams.Line.Action.RemoveDiscount(
                this.coupon, this.discount, this.extraParams, this.promotionCode);
          }

          /** The coupon code to remove from the {@code discounts} array. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** The ID of a discount to remove from the {@code discounts} array. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.Action.RemoveDiscount#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.Action.RemoveDiscount#extraParams} for the field
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
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        String price;

        private RemoveItem(Map<String, Object> extraParams, String price) {
          this.extraParams = extraParams;
          this.price = price;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String price;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.Action.RemoveItem build() {
            return new QuoteCreateParams.Line.Action.RemoveItem(this.extraParams, this.price);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.Action.RemoveItem#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.Action.RemoveItem#extraParams} for the field
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
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class SetDiscount {
        /** The coupon code to replace the {@code discounts} array with. */
        @SerializedName("coupon")
        String coupon;

        /** An ID of an existing discount to replace the {@code discounts} array with. */
        @SerializedName("discount")
        String discount;

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
        String promotionCode;

        /** Settings for discount application including service period anchoring. */
        @SerializedName("settings")
        Settings settings;

        private SetDiscount(
            String coupon,
            String discount,
            Map<String, Object> extraParams,
            String promotionCode,
            Settings settings) {
          this.coupon = coupon;
          this.discount = discount;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
          this.settings = settings;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private String discount;

          private Map<String, Object> extraParams;

          private String promotionCode;

          private Settings settings;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.Action.SetDiscount build() {
            return new QuoteCreateParams.Line.Action.SetDiscount(
                this.coupon, this.discount, this.extraParams, this.promotionCode, this.settings);
          }

          /** The coupon code to replace the {@code discounts} array with. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /** An ID of an existing discount to replace the {@code discounts} array with. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.Action.SetDiscount#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.Action.SetDiscount#extraParams} for the field
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

          /** Settings for discount application including service period anchoring. */
          public Builder setSettings(QuoteCreateParams.Line.Action.SetDiscount.Settings settings) {
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
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Configures service period cycle anchoring. */
          @SerializedName("service_period_anchor_config")
          ServicePeriodAnchorConfig servicePeriodAnchorConfig;

          /**
           * The start date of the discount's service period when applying a coupon or promotion
           * code with a service period duration. Defaults to {@code line_start} if omitted.
           */
          @SerializedName("start_date")
          StartDate startDate;

          private Settings(
              Map<String, Object> extraParams,
              ServicePeriodAnchorConfig servicePeriodAnchorConfig,
              StartDate startDate) {
            this.extraParams = extraParams;
            this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
            this.startDate = startDate;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private ServicePeriodAnchorConfig servicePeriodAnchorConfig;

            private StartDate startDate;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.Line.Action.SetDiscount.Settings build() {
              return new QuoteCreateParams.Line.Action.SetDiscount.Settings(
                  this.extraParams, this.servicePeriodAnchorConfig, this.startDate);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.Line.Action.SetDiscount.Settings#extraParams} for the field
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
             * QuoteCreateParams.Line.Action.SetDiscount.Settings#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Configures service period cycle anchoring. */
            public Builder setServicePeriodAnchorConfig(
                QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig
                    servicePeriodAnchorConfig) {
              this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
              return this;
            }

            /**
             * The start date of the discount's service period when applying a coupon or promotion
             * code with a service period duration. Defaults to {@code line_start} if omitted.
             */
            public Builder setStartDate(
                QuoteCreateParams.Line.Action.SetDiscount.Settings.StartDate startDate) {
              this.startDate = startDate;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class ServicePeriodAnchorConfig {
            /**
             * Anchor the service period to a custom date. Type must be {@code custom} to specify.
             */
            @SerializedName("custom")
            Custom custom;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** The type of service period anchor config. Defaults to {@code inherit} if omitted. */
            @SerializedName("type")
            Type type;

            private ServicePeriodAnchorConfig(
                Custom custom, Map<String, Object> extraParams, Type type) {
              this.custom = custom;
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Custom custom;

              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig
                  build() {
                return new QuoteCreateParams.Line.Action.SetDiscount.Settings
                    .ServicePeriodAnchorConfig(this.custom, this.extraParams, this.type);
              }

              /**
               * Anchor the service period to a custom date. Type must be {@code custom} to specify.
               */
              public Builder setCustom(
                  QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig
                          .Custom
                      custom) {
                this.custom = custom;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig#extraParams}
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
               * QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig#extraParams}
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
               * The type of service period anchor config. Defaults to {@code inherit} if omitted.
               */
              public Builder setType(
                  QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Custom {
              /**
               * <strong>Required.</strong> The day of the month the anchor should be. Ranges from 1
               * to 31.
               */
              @SerializedName("day_of_month")
              Long dayOfMonth;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** The hour of the day the anchor should be. Ranges from 0 to 23. */
              @SerializedName("hour")
              Long hour;

              /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
              @SerializedName("minute")
              Long minute;

              /** The month to start full cycle periods. Ranges from 1 to 12. */
              @SerializedName("month")
              Long month;

              /** The second of the minute the anchor should be. Ranges from 0 to 59. */
              @SerializedName("second")
              Long second;

              private Custom(
                  Long dayOfMonth,
                  Map<String, Object> extraParams,
                  Long hour,
                  Long minute,
                  Long month,
                  Long second) {
                this.dayOfMonth = dayOfMonth;
                this.extraParams = extraParams;
                this.hour = hour;
                this.minute = minute;
                this.month = month;
                this.second = second;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Long dayOfMonth;

                private Map<String, Object> extraParams;

                private Long hour;

                private Long minute;

                private Long month;

                private Long second;

                /** Finalize and obtain parameter instance from this builder. */
                public QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig
                        .Custom
                    build() {
                  return new QuoteCreateParams.Line.Action.SetDiscount.Settings
                      .ServicePeriodAnchorConfig.Custom(
                      this.dayOfMonth,
                      this.extraParams,
                      this.hour,
                      this.minute,
                      this.month,
                      this.second);
                }

                /**
                 * <strong>Required.</strong> The day of the month the anchor should be. Ranges from
                 * 1 to 31.
                 */
                public Builder setDayOfMonth(Long dayOfMonth) {
                  this.dayOfMonth = dayOfMonth;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
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
                 * QuoteCreateParams.Line.Action.SetDiscount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** The hour of the day the anchor should be. Ranges from 0 to 23. */
                public Builder setHour(Long hour) {
                  this.hour = hour;
                  return this;
                }

                /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
                public Builder setMinute(Long minute) {
                  this.minute = minute;
                  return this;
                }

                /** The month to start full cycle periods. Ranges from 1 to 12. */
                public Builder setMonth(Long month) {
                  this.month = month;
                  return this;
                }

                /** The second of the minute the anchor should be. Ranges from 0 to 59. */
                public Builder setSecond(Long second) {
                  this.second = second;
                  return this;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("custom")
              CUSTOM("custom"),

              @SerializedName("inherit")
              INHERIT("inherit");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          public enum StartDate implements ApiRequestParams.EnumParam {
            @SerializedName("current_period_end")
            CURRENT_PERIOD_END("current_period_end"),

            @SerializedName("current_period_start")
            CURRENT_PERIOD_START("current_period_start"),

            @SerializedName("line_start")
            LINE_START("line_start");

            @Getter(onMethod_ = {@Override})
            private final String value;

            StartDate(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class SetItem {
        /**
         * If an item with the {@code price} already exists, passing this will override the {@code
         * discounts} array on the subscription item that matches that price. Otherwise, the {@code
         * items} array is cleared and a single new item is added with the supplied {@code
         * discounts}.
         */
        @SerializedName("discounts")
        List<QuoteCreateParams.Line.Action.SetItem.Discount> discounts;

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
        String price;

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

        /** The ID of the trial offer to apply to the configuration item. */
        @SerializedName("trial_offer")
        String trialOffer;

        private SetItem(
            List<QuoteCreateParams.Line.Action.SetItem.Discount> discounts,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            String price,
            Long quantity,
            List<String> taxRates,
            Trial trial,
            String trialOffer) {
          this.discounts = discounts;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.price = price;
          this.quantity = quantity;
          this.taxRates = taxRates;
          this.trial = trial;
          this.trialOffer = trialOffer;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<QuoteCreateParams.Line.Action.SetItem.Discount> discounts;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private String price;

          private Long quantity;

          private List<String> taxRates;

          private Trial trial;

          private String trialOffer;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.Action.SetItem build() {
            return new QuoteCreateParams.Line.Action.SetItem(
                this.discounts,
                this.extraParams,
                this.metadata,
                this.price,
                this.quantity,
                this.taxRates,
                this.trial,
                this.trialOffer);
          }

          /**
           * Add an element to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteCreateParams.Line.Action.SetItem#discounts} for the field documentation.
           */
          public Builder addDiscount(QuoteCreateParams.Line.Action.SetItem.Discount element) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.add(element);
            return this;
          }

          /**
           * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * QuoteCreateParams.Line.Action.SetItem#discounts} for the field documentation.
           */
          public Builder addAllDiscount(
              List<QuoteCreateParams.Line.Action.SetItem.Discount> elements) {
            if (this.discounts == null) {
              this.discounts = new ArrayList<>();
            }
            this.discounts.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.Action.SetItem#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.Action.SetItem#extraParams} for the field
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
           * {@link QuoteCreateParams.Line.Action.SetItem#metadata} for the field documentation.
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
           * map. See {@link QuoteCreateParams.Line.Action.SetItem#metadata} for the field
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
           * QuoteCreateParams.Line.Action.SetItem#taxRates} for the field documentation.
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
           * QuoteCreateParams.Line.Action.SetItem#taxRates} for the field documentation.
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
          public Builder setTrial(QuoteCreateParams.Line.Action.SetItem.Trial trial) {
            this.trial = trial;
            return this;
          }

          /** The ID of the trial offer to apply to the configuration item. */
          public Builder setTrialOffer(String trialOffer) {
            this.trialOffer = trialOffer;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discount {
          /** ID of the coupon to create a new discount for. */
          @SerializedName("coupon")
          String coupon;

          /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
          @SerializedName("discount")
          String discount;

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
          String promotionCode;

          /** Settings for discount application including service period anchoring. */
          @SerializedName("settings")
          Settings settings;

          private Discount(
              String coupon,
              String discount,
              DiscountEnd discountEnd,
              Map<String, Object> extraParams,
              String promotionCode,
              Settings settings) {
            this.coupon = coupon;
            this.discount = discount;
            this.discountEnd = discountEnd;
            this.extraParams = extraParams;
            this.promotionCode = promotionCode;
            this.settings = settings;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String coupon;

            private String discount;

            private DiscountEnd discountEnd;

            private Map<String, Object> extraParams;

            private String promotionCode;

            private Settings settings;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.Line.Action.SetItem.Discount build() {
              return new QuoteCreateParams.Line.Action.SetItem.Discount(
                  this.coupon,
                  this.discount,
                  this.discountEnd,
                  this.extraParams,
                  this.promotionCode,
                  this.settings);
            }

            /** ID of the coupon to create a new discount for. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
            public Builder setDiscount(String discount) {
              this.discount = discount;
              return this;
            }

            /** Details to determine how long the discount should be applied for. */
            public Builder setDiscountEnd(
                QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd discountEnd) {
              this.discountEnd = discountEnd;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link QuoteCreateParams.Line.Action.SetItem.Discount#extraParams}
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
             * original map. See {@link QuoteCreateParams.Line.Action.SetItem.Discount#extraParams}
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

            /** Settings for discount application including service period anchoring. */
            public Builder setSettings(
                QuoteCreateParams.Line.Action.SetItem.Discount.Settings settings) {
              this.settings = settings;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
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
              public QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd build() {
                return new QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd(
                    this.duration, this.extraParams, this.timestamp, this.type);
              }

              /** Time span for the redeemed discount. */
              public Builder setDuration(
                  QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration duration) {
                this.duration = duration;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd#extraParams} for the
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
               * QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd#extraParams} for the
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
                  QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Type type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
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
                public QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration build() {
                  return new QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration(
                      this.extraParams, this.interval, this.intervalCount);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration#extraParams}
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
                 * QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration#extraParams}
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
                    QuoteCreateParams.Line.Action.SetItem.Discount.DiscountEnd.Duration.Interval
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

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Settings {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Configures service period cycle anchoring. */
            @SerializedName("service_period_anchor_config")
            ServicePeriodAnchorConfig servicePeriodAnchorConfig;

            /**
             * The start date of the discount's service period when applying a coupon or promotion
             * code with a service period duration. Defaults to {@code line_start} if omitted.
             */
            @SerializedName("start_date")
            StartDate startDate;

            private Settings(
                Map<String, Object> extraParams,
                ServicePeriodAnchorConfig servicePeriodAnchorConfig,
                StartDate startDate) {
              this.extraParams = extraParams;
              this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
              this.startDate = startDate;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private ServicePeriodAnchorConfig servicePeriodAnchorConfig;

              private StartDate startDate;

              /** Finalize and obtain parameter instance from this builder. */
              public QuoteCreateParams.Line.Action.SetItem.Discount.Settings build() {
                return new QuoteCreateParams.Line.Action.SetItem.Discount.Settings(
                    this.extraParams, this.servicePeriodAnchorConfig, this.startDate);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.SetItem.Discount.Settings#extraParams} for the field
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * QuoteCreateParams.Line.Action.SetItem.Discount.Settings#extraParams} for the field
               * documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Configures service period cycle anchoring. */
              public Builder setServicePeriodAnchorConfig(
                  QuoteCreateParams.Line.Action.SetItem.Discount.Settings.ServicePeriodAnchorConfig
                      servicePeriodAnchorConfig) {
                this.servicePeriodAnchorConfig = servicePeriodAnchorConfig;
                return this;
              }

              /**
               * The start date of the discount's service period when applying a coupon or promotion
               * code with a service period duration. Defaults to {@code line_start} if omitted.
               */
              public Builder setStartDate(
                  QuoteCreateParams.Line.Action.SetItem.Discount.Settings.StartDate startDate) {
                this.startDate = startDate;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class ServicePeriodAnchorConfig {
              /**
               * Anchor the service period to a custom date. Type must be {@code custom} to specify.
               */
              @SerializedName("custom")
              Custom custom;

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
               * The type of service period anchor config. Defaults to {@code inherit} if omitted.
               */
              @SerializedName("type")
              Type type;

              private ServicePeriodAnchorConfig(
                  Custom custom, Map<String, Object> extraParams, Type type) {
                this.custom = custom;
                this.extraParams = extraParams;
                this.type = type;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Custom custom;

                private Map<String, Object> extraParams;

                private Type type;

                /** Finalize and obtain parameter instance from this builder. */
                public QuoteCreateParams.Line.Action.SetItem.Discount.Settings
                        .ServicePeriodAnchorConfig
                    build() {
                  return new QuoteCreateParams.Line.Action.SetItem.Discount.Settings
                      .ServicePeriodAnchorConfig(this.custom, this.extraParams, this.type);
                }

                /**
                 * Anchor the service period to a custom date. Type must be {@code custom} to
                 * specify.
                 */
                public Builder setCustom(
                    QuoteCreateParams.Line.Action.SetItem.Discount.Settings
                            .ServicePeriodAnchorConfig.Custom
                        custom) {
                  this.custom = custom;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * QuoteCreateParams.Line.Action.SetItem.Discount.Settings.ServicePeriodAnchorConfig#extraParams}
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
                 * QuoteCreateParams.Line.Action.SetItem.Discount.Settings.ServicePeriodAnchorConfig#extraParams}
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
                 * The type of service period anchor config. Defaults to {@code inherit} if omitted.
                 */
                public Builder setType(
                    QuoteCreateParams.Line.Action.SetItem.Discount.Settings
                            .ServicePeriodAnchorConfig.Type
                        type) {
                  this.type = type;
                  return this;
                }
              }

              @Getter
              @EqualsAndHashCode(callSuper = false)
              public static class Custom {
                /**
                 * <strong>Required.</strong> The day of the month the anchor should be. Ranges from
                 * 1 to 31.
                 */
                @SerializedName("day_of_month")
                Long dayOfMonth;

                /**
                 * Map of extra parameters for custom features not available in this client library.
                 * The content in this map is not serialized under this field's
                 * {@code @SerializedName} value. Instead, each key/value pair is serialized as if
                 * the key is a root-level field (serialized) name in this param object.
                 * Effectively, this map is flattened to its parent instance.
                 */
                @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
                Map<String, Object> extraParams;

                /** The hour of the day the anchor should be. Ranges from 0 to 23. */
                @SerializedName("hour")
                Long hour;

                /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
                @SerializedName("minute")
                Long minute;

                /** The month to start full cycle periods. Ranges from 1 to 12. */
                @SerializedName("month")
                Long month;

                /** The second of the minute the anchor should be. Ranges from 0 to 59. */
                @SerializedName("second")
                Long second;

                private Custom(
                    Long dayOfMonth,
                    Map<String, Object> extraParams,
                    Long hour,
                    Long minute,
                    Long month,
                    Long second) {
                  this.dayOfMonth = dayOfMonth;
                  this.extraParams = extraParams;
                  this.hour = hour;
                  this.minute = minute;
                  this.month = month;
                  this.second = second;
                }

                public static Builder builder() {
                  return new Builder();
                }

                public static class Builder {
                  private Long dayOfMonth;

                  private Map<String, Object> extraParams;

                  private Long hour;

                  private Long minute;

                  private Long month;

                  private Long second;

                  /** Finalize and obtain parameter instance from this builder. */
                  public QuoteCreateParams.Line.Action.SetItem.Discount.Settings
                          .ServicePeriodAnchorConfig.Custom
                      build() {
                    return new QuoteCreateParams.Line.Action.SetItem.Discount.Settings
                        .ServicePeriodAnchorConfig.Custom(
                        this.dayOfMonth,
                        this.extraParams,
                        this.hour,
                        this.minute,
                        this.month,
                        this.second);
                  }

                  /**
                   * <strong>Required.</strong> The day of the month the anchor should be. Ranges
                   * from 1 to 31.
                   */
                  public Builder setDayOfMonth(Long dayOfMonth) {
                    this.dayOfMonth = dayOfMonth;
                    return this;
                  }

                  /**
                   * Add a key/value pair to `extraParams` map. A map is initialized for the first
                   * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                   * original map. See {@link
                   * QuoteCreateParams.Line.Action.SetItem.Discount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
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
                   * QuoteCreateParams.Line.Action.SetItem.Discount.Settings.ServicePeriodAnchorConfig.Custom#extraParams}
                   * for the field documentation.
                   */
                  public Builder putAllExtraParam(Map<String, Object> map) {
                    if (this.extraParams == null) {
                      this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                  }

                  /** The hour of the day the anchor should be. Ranges from 0 to 23. */
                  public Builder setHour(Long hour) {
                    this.hour = hour;
                    return this;
                  }

                  /** The minute of the hour the anchor should be. Ranges from 0 to 59. */
                  public Builder setMinute(Long minute) {
                    this.minute = minute;
                    return this;
                  }

                  /** The month to start full cycle periods. Ranges from 1 to 12. */
                  public Builder setMonth(Long month) {
                    this.month = month;
                    return this;
                  }

                  /** The second of the minute the anchor should be. Ranges from 0 to 59. */
                  public Builder setSecond(Long second) {
                    this.second = second;
                    return this;
                  }
                }
              }

              public enum Type implements ApiRequestParams.EnumParam {
                @SerializedName("custom")
                CUSTOM("custom"),

                @SerializedName("inherit")
                INHERIT("inherit");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Type(String value) {
                  this.value = value;
                }
              }
            }

            public enum StartDate implements ApiRequestParams.EnumParam {
              @SerializedName("current_period_end")
              CURRENT_PERIOD_END("current_period_end"),

              @SerializedName("current_period_start")
              CURRENT_PERIOD_START("current_period_start"),

              @SerializedName("line_start")
              LINE_START("line_start");

              @Getter(onMethod_ = {@Override})
              private final String value;

              StartDate(String value) {
                this.value = value;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.Line.Action.SetItem.Trial build() {
              return new QuoteCreateParams.Line.Action.SetItem.Trial(
                  this.convertsTo, this.extraParams, this.type);
            }

            /**
             * Add an element to `convertsTo` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * QuoteCreateParams.Line.Action.SetItem.Trial#convertsTo} for the field documentation.
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
             * list. See {@link QuoteCreateParams.Line.Action.SetItem.Trial#convertsTo} for the
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
             * original map. See {@link QuoteCreateParams.Line.Action.SetItem.Trial#extraParams} for
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
             * original map. See {@link QuoteCreateParams.Line.Action.SetItem.Trial#extraParams} for
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
            public Builder setType(QuoteCreateParams.Line.Action.SetItem.Trial.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      String newReference;

      /** The ID of the schedule the line applies to. */
      @SerializedName("subscription_schedule")
      String subscriptionSchedule;

      /**
       * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule or
       * an existing schedule.
       */
      @SerializedName("type")
      Type type;

      private AppliesTo(
          Map<String, Object> extraParams,
          String newReference,
          String subscriptionSchedule,
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

        private String newReference;

        private String subscriptionSchedule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.Line.AppliesTo build() {
          return new QuoteCreateParams.Line.AppliesTo(
              this.extraParams, this.newReference, this.subscriptionSchedule, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.AppliesTo#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.Line.AppliesTo#extraParams} for the field
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

        /** The ID of the schedule the line applies to. */
        public Builder setSubscriptionSchedule(String subscriptionSchedule) {
          this.subscriptionSchedule = subscriptionSchedule;
          return this;
        }

        /**
         * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule
         * or an existing schedule.
         */
        public Builder setType(QuoteCreateParams.Line.AppliesTo.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.Line.CancelSubscriptionSchedule build() {
          return new QuoteCreateParams.Line.CancelSubscriptionSchedule(
              this.cancelAt, this.extraParams, this.invoiceNow, this.prorate);
        }

        /**
         * <strong>Required.</strong> Timestamp helper to cancel the underlying schedule on the
         * accompanying line's start date. Must be set to {@code line_starts_at}.
         */
        public Builder setCancelAt(
            QuoteCreateParams.Line.CancelSubscriptionSchedule.CancelAt cancelAt) {
          this.cancelAt = cancelAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.CancelSubscriptionSchedule#extraParams} for the
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
         * map. See {@link QuoteCreateParams.Line.CancelSubscriptionSchedule#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.Line.EndsAt build() {
          return new QuoteCreateParams.Line.EndsAt(
              this.discountEnd, this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Use the {@code end} time of a given discount. */
        public Builder setDiscountEnd(QuoteCreateParams.Line.EndsAt.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /** Time span for the quote line starting from the {@code starts_at} date. */
        public Builder setDuration(QuoteCreateParams.Line.EndsAt.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.EndsAt#extraParams} for the field documentation.
         */
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
         * map. See {@link QuoteCreateParams.Line.EndsAt#extraParams} for the field documentation.
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
        public Builder setType(QuoteCreateParams.Line.EndsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DiscountEnd {
        /** <strong>Required.</strong> The ID of a specific discount. */
        @SerializedName("discount")
        String discount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private DiscountEnd(String discount, Map<String, Object> extraParams) {
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.EndsAt.DiscountEnd build() {
            return new QuoteCreateParams.Line.EndsAt.DiscountEnd(this.discount, this.extraParams);
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.EndsAt.DiscountEnd#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.EndsAt.DiscountEnd#extraParams} for the field
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
          public QuoteCreateParams.Line.EndsAt.Duration build() {
            return new QuoteCreateParams.Line.EndsAt.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.EndsAt.Duration#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.EndsAt.Duration#extraParams} for the field
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
          public Builder setInterval(QuoteCreateParams.Line.EndsAt.Duration.Interval interval) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.Line.SetPauseCollection build() {
          return new QuoteCreateParams.Line.SetPauseCollection(
              this.extraParams, this.set, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.SetPauseCollection#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.Line.SetPauseCollection#extraParams} for the field
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
        public Builder setSet(QuoteCreateParams.Line.SetPauseCollection.Set set) {
          this.set = set;
          return this;
        }

        /** <strong>Required.</strong> Determines the type of the pause_collection amendment. */
        public Builder setType(QuoteCreateParams.Line.SetPauseCollection.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.Line.SetPauseCollection.Set build() {
            return new QuoteCreateParams.Line.SetPauseCollection.Set(
                this.behavior, this.extraParams);
          }

          /**
           * <strong>Required.</strong> The payment collection behavior for this subscription while
           * paused. One of {@code keep_as_draft}, {@code mark_uncollectible}, or {@code void}.
           */
          public Builder setBehavior(
              QuoteCreateParams.Line.SetPauseCollection.Set.Behavior behavior) {
            this.behavior = behavior;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.SetPauseCollection.Set#extraParams} for the
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
           * map. See {@link QuoteCreateParams.Line.SetPauseCollection.Set#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.Line.StartsAt build() {
          return new QuoteCreateParams.Line.StartsAt(
              this.discountEnd, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
        }

        /** Use the {@code end} time of a given discount. */
        public Builder setDiscountEnd(QuoteCreateParams.Line.StartsAt.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.StartsAt#extraParams} for the field documentation.
         */
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
         * map. See {@link QuoteCreateParams.Line.StartsAt#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp the given line ends at. */
        public Builder setLineEndsAt(QuoteCreateParams.Line.StartsAt.LineEndsAt lineEndsAt) {
          this.lineEndsAt = lineEndsAt;
          return this;
        }

        /** A precise Unix timestamp. */
        public Builder setTimestamp(Long timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> Select a way to pass in {@code starts_at}. */
        public Builder setType(QuoteCreateParams.Line.StartsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DiscountEnd {
        /** <strong>Required.</strong> The ID of a specific discount. */
        @SerializedName("discount")
        String discount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private DiscountEnd(String discount, Map<String, Object> extraParams) {
          this.discount = discount;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String discount;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.StartsAt.DiscountEnd build() {
            return new QuoteCreateParams.Line.StartsAt.DiscountEnd(this.discount, this.extraParams);
          }

          /** <strong>Required.</strong> The ID of a specific discount. */
          public Builder setDiscount(String discount) {
            this.discount = discount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.StartsAt.DiscountEnd#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.StartsAt.DiscountEnd#extraParams} for the field
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

        /**
         * The position of the previous quote line in the {@code lines} array after which this line
         * should begin. Indexes start from 0 and must be less than the index of the current line in
         * the array.
         */
        @SerializedName("index")
        Long index;

        private LineEndsAt(Map<String, Object> extraParams, Long index) {
          this.extraParams = extraParams;
          this.index = index;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Long index;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.Line.StartsAt.LineEndsAt build() {
            return new QuoteCreateParams.Line.StartsAt.LineEndsAt(this.extraParams, this.index);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.StartsAt.LineEndsAt#extraParams} for the field
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
           * map. See {@link QuoteCreateParams.Line.StartsAt.LineEndsAt#extraParams} for the field
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.Line.TrialSettings build() {
          return new QuoteCreateParams.Line.TrialSettings(this.endBehavior, this.extraParams);
        }

        /** Defines how the subscription should behave when a trial ends. */
        public Builder setEndBehavior(
            QuoteCreateParams.Line.TrialSettings.EndBehavior endBehavior) {
          this.endBehavior = endBehavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.Line.TrialSettings#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.Line.TrialSettings#extraParams} for the field
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
          public QuoteCreateParams.Line.TrialSettings.EndBehavior build() {
            return new QuoteCreateParams.Line.TrialSettings.EndBehavior(
                this.extraParams, this.prorateUpFront);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.Line.TrialSettings.EndBehavior#extraParams} for the
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
           * map. See {@link QuoteCreateParams.Line.TrialSettings.EndBehavior#extraParams} for the
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
              QuoteCreateParams.Line.TrialSettings.EndBehavior.ProrateUpFront prorateUpFront) {
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

    public enum EffectiveAt implements ApiRequestParams.EnumParam {
      @SerializedName("billing_period_start")
      BILLING_PERIOD_START("billing_period_start"),

      @SerializedName("line_start")
      LINE_START("line_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EffectiveAt(String value) {
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
  @EqualsAndHashCode(callSuper = false)
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

    /** The ID of the price object. One of {@code price} or {@code price_data} is required. */
    @SerializedName("price")
    String price;

    /**
     * Data used to generate a new <a href="https://docs.stripe.com/api/prices">Price</a> object
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
        String price,
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

      private String price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.LineItem build() {
        return new QuoteCreateParams.LineItem(
            this.discounts,
            this.extraParams,
            this.price,
            this.priceData,
            this.quantity,
            this.taxRates);
      }

      /**
       * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * QuoteCreateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addDiscount(QuoteCreateParams.LineItem.Discount element) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<QuoteCreateParams.LineItem.Discount>();
        }
        ((List<QuoteCreateParams.LineItem.Discount>) this.discounts).add(element);
        return this;
      }

      /**
       * Add all elements to `discounts` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteCreateParams.LineItem#discounts} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllDiscount(List<QuoteCreateParams.LineItem.Discount> elements) {
        if (this.discounts == null || this.discounts instanceof EmptyParam) {
          this.discounts = new ArrayList<QuoteCreateParams.LineItem.Discount>();
        }
        ((List<QuoteCreateParams.LineItem.Discount>) this.discounts).addAll(elements);
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(EmptyParam discounts) {
        this.discounts = discounts;
        return this;
      }

      /** The discounts applied to this line item. */
      public Builder setDiscounts(List<QuoteCreateParams.LineItem.Discount> discounts) {
        this.discounts = discounts;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.LineItem#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.LineItem#extraParams} for the field documentation.
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

      /**
       * Data used to generate a new <a href="https://docs.stripe.com/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      public Builder setPriceData(QuoteCreateParams.LineItem.PriceData priceData) {
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
       * QuoteCreateParams.LineItem#taxRates} for the field documentation.
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
       * QuoteCreateParams.LineItem#taxRates} for the field documentation.
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
    @EqualsAndHashCode(callSuper = false)
    public static class Discount {
      /** ID of the coupon to create a new discount for. */
      @SerializedName("coupon")
      String coupon;

      /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
      @SerializedName("discount")
      String discount;

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
      String promotionCode;

      private Discount(
          String coupon,
          String discount,
          DiscountEnd discountEnd,
          Map<String, Object> extraParams,
          String promotionCode) {
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
        private String coupon;

        private String discount;

        private DiscountEnd discountEnd;

        private Map<String, Object> extraParams;

        private String promotionCode;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.LineItem.Discount build() {
          return new QuoteCreateParams.LineItem.Discount(
              this.coupon, this.discount, this.discountEnd, this.extraParams, this.promotionCode);
        }

        /** ID of the coupon to create a new discount for. */
        public Builder setCoupon(String coupon) {
          this.coupon = coupon;
          return this;
        }

        /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
        public Builder setDiscount(String discount) {
          this.discount = discount;
          return this;
        }

        /** Details to determine how long the discount should be applied for. */
        public Builder setDiscountEnd(QuoteCreateParams.LineItem.Discount.DiscountEnd discountEnd) {
          this.discountEnd = discountEnd;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.LineItem.Discount#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.LineItem.Discount#extraParams} for the field
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.LineItem.Discount.DiscountEnd build() {
            return new QuoteCreateParams.LineItem.Discount.DiscountEnd(
                this.duration, this.extraParams, this.timestamp, this.type);
          }

          /** Time span for the redeemed discount. */
          public Builder setDuration(
              QuoteCreateParams.LineItem.Discount.DiscountEnd.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.LineItem.Discount.DiscountEnd#extraParams} for the
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
           * map. See {@link QuoteCreateParams.LineItem.Discount.DiscountEnd#extraParams} for the
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
          public Builder setType(QuoteCreateParams.LineItem.Discount.DiscountEnd.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.LineItem.Discount.DiscountEnd.Duration build() {
              return new QuoteCreateParams.LineItem.Discount.DiscountEnd.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.LineItem.Discount.DiscountEnd.Duration#extraParams} for the field
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
             * QuoteCreateParams.LineItem.Discount.DiscountEnd.Duration#extraParams} for the field
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
                QuoteCreateParams.LineItem.Discount.DiscountEnd.Duration.Interval interval) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class PriceData {
      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The ID of the <a
       * href="https://docs.stripe.com/api/products">Product</a> that this <a
       * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
       */
      @SerializedName("product")
      String product;

      /**
       * The recurring components of a price such as {@code interval} and {@code interval_count}.
       */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Only required if a <a
       * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
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
      BigDecimal unitAmountDecimal;

      private PriceData(
          String currency,
          Map<String, Object> extraParams,
          String product,
          Recurring recurring,
          TaxBehavior taxBehavior,
          Long unitAmount,
          BigDecimal unitAmountDecimal) {
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
        private String currency;

        private Map<String, Object> extraParams;

        private String product;

        private Recurring recurring;

        private TaxBehavior taxBehavior;

        private Long unitAmount;

        private BigDecimal unitAmountDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.LineItem.PriceData build() {
          return new QuoteCreateParams.LineItem.PriceData(
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.LineItem.PriceData#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.LineItem.PriceData#extraParams} for the field
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
         * <strong>Required.</strong> The ID of the <a
         * href="https://docs.stripe.com/api/products">Product</a> that this <a
         * href="https://docs.stripe.com/api/prices">Price</a> will belong to.
         */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /**
         * The recurring components of a price such as {@code interval} and {@code interval_count}.
         */
        public Builder setRecurring(QuoteCreateParams.LineItem.PriceData.Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /**
         * Only required if a <a
         * href="https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(recommended)">default
         * tax behavior</a> was not provided in the Stripe Tax settings. Specifies whether the price
         * is considered inclusive of taxes or exclusive of taxes. One of {@code inclusive}, {@code
         * exclusive}, or {@code unspecified}. Once specified as either {@code inclusive} or {@code
         * exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(
            QuoteCreateParams.LineItem.PriceData.TaxBehavior taxBehavior) {
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
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.LineItem.PriceData.Recurring build() {
            return new QuoteCreateParams.LineItem.PriceData.Recurring(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.LineItem.PriceData.Recurring#extraParams} for the
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
           * map. See {@link QuoteCreateParams.LineItem.PriceData.Recurring#extraParams} for the
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
              QuoteCreateParams.LineItem.PriceData.Recurring.Interval interval) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionData {
    /** Describes the period to bill for upon accepting the quote. */
    @SerializedName("bill_on_acceptance")
    BillOnAcceptance billOnAcceptance;

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

    /** Controls how prorations and invoices for subscriptions are calculated and orchestrated. */
    @SerializedName("billing_mode")
    BillingMode billingMode;

    /**
     * Billing schedules that will be applied to the subscription or subscription schedule created
     * when the quote is accepted.
     */
    @SerializedName("billing_schedules")
    List<QuoteCreateParams.SubscriptionData.BillingSchedule> billingSchedules;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    String description;

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
     * The id of a subscription that the quote will update. By default, the quote will contain the
     * state of the subscription (such as line items, collection method and billing thresholds)
     * unless overridden.
     */
    @SerializedName("from_subscription")
    String fromSubscription;

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that will set
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
     * Configures how the subscription schedule handles billing for phase transitions when the quote
     * is accepted.
     */
    @SerializedName("phase_effective_at")
    PhaseEffectiveAt phaseEffectiveAt;

    /**
     * If specified, the invoicing for the given billing cycle iterations will be processed when the
     * quote is accepted. Cannot be used with {@code effective_date}.
     */
    @SerializedName("prebilling")
    Object prebilling;

    /**
     * Determines how to handle <a
     * href="https://docs.stripe.com/subscriptions/billing-cycle#prorations">prorations</a>. When
     * creating a subscription, valid values are {@code create_prorations} or {@code none}.
     *
     * <p>When updating a subscription, valid values are {@code create_prorations}, {@code none}, or
     * {@code always_invoice}.
     *
     * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
     * applicable. These proration items will only be invoiced immediately under <a
     * href="https://docs.stripe.com/subscriptions/upgrading-downgrading#immediate-payment">certain
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
        BillOnAcceptance billOnAcceptance,
        BillingBehavior billingBehavior,
        ApiRequestParams.EnumParam billingCycleAnchor,
        BillingMode billingMode,
        List<QuoteCreateParams.SubscriptionData.BillingSchedule> billingSchedules,
        String description,
        Object effectiveDate,
        EndBehavior endBehavior,
        Map<String, Object> extraParams,
        String fromSubscription,
        Map<String, String> metadata,
        PhaseEffectiveAt phaseEffectiveAt,
        Object prebilling,
        ProrationBehavior prorationBehavior,
        Object trialPeriodDays) {
      this.billOnAcceptance = billOnAcceptance;
      this.billingBehavior = billingBehavior;
      this.billingCycleAnchor = billingCycleAnchor;
      this.billingMode = billingMode;
      this.billingSchedules = billingSchedules;
      this.description = description;
      this.effectiveDate = effectiveDate;
      this.endBehavior = endBehavior;
      this.extraParams = extraParams;
      this.fromSubscription = fromSubscription;
      this.metadata = metadata;
      this.phaseEffectiveAt = phaseEffectiveAt;
      this.prebilling = prebilling;
      this.prorationBehavior = prorationBehavior;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillOnAcceptance billOnAcceptance;

      private BillingBehavior billingBehavior;

      private ApiRequestParams.EnumParam billingCycleAnchor;

      private BillingMode billingMode;

      private List<QuoteCreateParams.SubscriptionData.BillingSchedule> billingSchedules;

      private String description;

      private Object effectiveDate;

      private EndBehavior endBehavior;

      private Map<String, Object> extraParams;

      private String fromSubscription;

      private Map<String, String> metadata;

      private PhaseEffectiveAt phaseEffectiveAt;

      private Object prebilling;

      private ProrationBehavior prorationBehavior;

      private Object trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.SubscriptionData build() {
        return new QuoteCreateParams.SubscriptionData(
            this.billOnAcceptance,
            this.billingBehavior,
            this.billingCycleAnchor,
            this.billingMode,
            this.billingSchedules,
            this.description,
            this.effectiveDate,
            this.endBehavior,
            this.extraParams,
            this.fromSubscription,
            this.metadata,
            this.phaseEffectiveAt,
            this.prebilling,
            this.prorationBehavior,
            this.trialPeriodDays);
      }

      /** Describes the period to bill for upon accepting the quote. */
      public Builder setBillOnAcceptance(
          QuoteCreateParams.SubscriptionData.BillOnAcceptance billOnAcceptance) {
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
          QuoteCreateParams.SubscriptionData.BillingBehavior billingBehavior) {
        this.billingBehavior = billingBehavior;
        return this;
      }

      /**
       * When specified as {@code reset}, the subscription will always start a new billing period
       * when the quote is accepted.
       */
      public Builder setBillingCycleAnchor(
          QuoteCreateParams.SubscriptionData.BillingCycleAnchor billingCycleAnchor) {
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

      /** Controls how prorations and invoices for subscriptions are calculated and orchestrated. */
      public Builder setBillingMode(QuoteCreateParams.SubscriptionData.BillingMode billingMode) {
        this.billingMode = billingMode;
        return this;
      }

      /**
       * Add an element to `billingSchedules` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteCreateParams.SubscriptionData#billingSchedules} for the field documentation.
       */
      public Builder addBillingSchedule(
          QuoteCreateParams.SubscriptionData.BillingSchedule element) {
        if (this.billingSchedules == null) {
          this.billingSchedules = new ArrayList<>();
        }
        this.billingSchedules.add(element);
        return this;
      }

      /**
       * Add all elements to `billingSchedules` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link QuoteCreateParams.SubscriptionData#billingSchedules} for the field documentation.
       */
      public Builder addAllBillingSchedule(
          List<QuoteCreateParams.SubscriptionData.BillingSchedule> elements) {
        if (this.billingSchedules == null) {
          this.billingSchedules = new ArrayList<>();
        }
        this.billingSchedules.addAll(elements);
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
       * When creating a new subscription, the date of which the subscription schedule will start
       * after the quote is accepted. When updating a subscription, the date of which the
       * subscription will be updated using a subscription schedule. The special value {@code
       * current_period_end} can be provided to update a subscription at the end of its current
       * period. The {@code effective_date} is ignored if it is in the past when the quote is
       * accepted.
       */
      public Builder setEffectiveDate(
          QuoteCreateParams.SubscriptionData.EffectiveDate effectiveDate) {
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
      public Builder setEndBehavior(QuoteCreateParams.SubscriptionData.EndBehavior endBehavior) {
        this.endBehavior = endBehavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.SubscriptionData#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The id of a subscription that the quote will update. By default, the quote will contain the
       * state of the subscription (such as line items, collection method and billing thresholds)
       * unless overridden.
       */
      public Builder setFromSubscription(String fromSubscription) {
        this.fromSubscription = fromSubscription;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.SubscriptionData#metadata} for the field documentation.
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
       * See {@link QuoteCreateParams.SubscriptionData#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * Configures how the subscription schedule handles billing for phase transitions when the
       * quote is accepted.
       */
      public Builder setPhaseEffectiveAt(
          QuoteCreateParams.SubscriptionData.PhaseEffectiveAt phaseEffectiveAt) {
        this.phaseEffectiveAt = phaseEffectiveAt;
        return this;
      }

      /**
       * If specified, the invoicing for the given billing cycle iterations will be processed when
       * the quote is accepted. Cannot be used with {@code effective_date}.
       */
      public Builder setPrebilling(QuoteCreateParams.SubscriptionData.Prebilling prebilling) {
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
       * href="https://docs.stripe.com/subscriptions/billing-cycle#prorations">prorations</a>. When
       * creating a subscription, valid values are {@code create_prorations} or {@code none}.
       *
       * <p>When updating a subscription, valid values are {@code create_prorations}, {@code none},
       * or {@code always_invoice}.
       *
       * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
       * applicable. These proration items will only be invoiced immediately under <a
       * href="https://docs.stripe.com/subscriptions/upgrading-downgrading#immediate-payment">certain
       * conditions</a>. In order to always invoice immediately for prorations, pass {@code
       * always_invoice}.
       *
       * <p>Prorations can be disabled by passing {@code none}.
       */
      public Builder setProrationBehavior(
          QuoteCreateParams.SubscriptionData.ProrationBehavior prorationBehavior) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.SubscriptionData.BillOnAcceptance build() {
          return new QuoteCreateParams.SubscriptionData.BillOnAcceptance(
              this.billFrom, this.billUntil, this.extraParams);
        }

        /** The start of the period to bill from when the Quote is accepted. */
        public Builder setBillFrom(
            QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom billFrom) {
          this.billFrom = billFrom;
          return this;
        }

        /** The end of the period to bill until when the Quote is accepted. */
        public Builder setBillUntil(
            QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionData.BillOnAcceptance#extraParams} for the
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
         * map. See {@link QuoteCreateParams.SubscriptionData.BillOnAcceptance#extraParams} for the
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
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom build() {
            return new QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom(
                this.extraParams, this.lineStartsAt, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom#extraParams} for the field
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
           * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom#extraParams} for the field
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
              QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt
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
              QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineStartsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt
                build() {
              return new QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt(
                  this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
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
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil build() {
            return new QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil(
                this.duration, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
          }

          /** Details of the duration over which to bill. */
          public Builder setDuration(
              QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil#extraParams} for the
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
           * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil#extraParams} for the
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
              QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt lineEndsAt) {
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
              QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration build() {
              return new QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration#extraParams}
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
             * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration#extraParams}
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
                QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.Duration.Interval
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
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineEndsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt
                build() {
              return new QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt(
                  this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionData.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
    public static class BillingMode {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Configure behavior for flexible billing mode. */
      @SerializedName("flexible")
      Flexible flexible;

      /**
       * <strong>Required.</strong> Controls the calculation and orchestration of prorations and
       * invoices for subscriptions. If no value is passed, the default is {@code flexible}.
       */
      @SerializedName("type")
      Type type;

      private BillingMode(Map<String, Object> extraParams, Flexible flexible, Type type) {
        this.extraParams = extraParams;
        this.flexible = flexible;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Flexible flexible;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.SubscriptionData.BillingMode build() {
          return new QuoteCreateParams.SubscriptionData.BillingMode(
              this.extraParams, this.flexible, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionData.BillingMode#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.SubscriptionData.BillingMode#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Configure behavior for flexible billing mode. */
        public Builder setFlexible(
            QuoteCreateParams.SubscriptionData.BillingMode.Flexible flexible) {
          this.flexible = flexible;
          return this;
        }

        /**
         * <strong>Required.</strong> Controls the calculation and orchestration of prorations and
         * invoices for subscriptions. If no value is passed, the default is {@code flexible}.
         */
        public Builder setType(QuoteCreateParams.SubscriptionData.BillingMode.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Flexible {
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
         * Controls how invoices and invoice items display proration amounts and discount amounts.
         */
        @SerializedName("proration_discounts")
        ProrationDiscounts prorationDiscounts;

        private Flexible(Map<String, Object> extraParams, ProrationDiscounts prorationDiscounts) {
          this.extraParams = extraParams;
          this.prorationDiscounts = prorationDiscounts;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private ProrationDiscounts prorationDiscounts;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.SubscriptionData.BillingMode.Flexible build() {
            return new QuoteCreateParams.SubscriptionData.BillingMode.Flexible(
                this.extraParams, this.prorationDiscounts);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link QuoteCreateParams.SubscriptionData.BillingMode.Flexible#extraParams}
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
           * map. See {@link QuoteCreateParams.SubscriptionData.BillingMode.Flexible#extraParams}
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
           * Controls how invoices and invoice items display proration amounts and discount amounts.
           */
          public Builder setProrationDiscounts(
              QuoteCreateParams.SubscriptionData.BillingMode.Flexible.ProrationDiscounts
                  prorationDiscounts) {
            this.prorationDiscounts = prorationDiscounts;
            return this;
          }
        }

        public enum ProrationDiscounts implements ApiRequestParams.EnumParam {
          @SerializedName("included")
          INCLUDED("included"),

          @SerializedName("itemized")
          ITEMIZED("itemized");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ProrationDiscounts(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("classic")
        CLASSIC("classic"),

        @SerializedName("flexible")
        FLEXIBLE("flexible");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingSchedule {
      /** Configure billing schedule differently for individual subscription items. */
      @SerializedName("applies_to")
      List<QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo> appliesTo;

      /**
       * <strong>Required.</strong> The start of the period to bill from when the Quote is accepted.
       */
      @SerializedName("bill_from")
      BillFrom billFrom;

      /**
       * <strong>Required.</strong> The end of the period to bill until when the Quote is accepted.
       */
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

      /**
       * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and up
       * to 200 characters. If not provided, a unique key will be generated.
       */
      @SerializedName("key")
      String key;

      private BillingSchedule(
          List<QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo> appliesTo,
          BillFrom billFrom,
          BillUntil billUntil,
          Map<String, Object> extraParams,
          String key) {
        this.appliesTo = appliesTo;
        this.billFrom = billFrom;
        this.billUntil = billUntil;
        this.extraParams = extraParams;
        this.key = key;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo> appliesTo;

        private BillFrom billFrom;

        private BillUntil billUntil;

        private Map<String, Object> extraParams;

        private String key;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.SubscriptionData.BillingSchedule build() {
          return new QuoteCreateParams.SubscriptionData.BillingSchedule(
              this.appliesTo, this.billFrom, this.billUntil, this.extraParams, this.key);
        }

        /**
         * Add an element to `appliesTo` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.SubscriptionData.BillingSchedule#appliesTo} for the field
         * documentation.
         */
        public Builder addAppliesTo(
            QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo element) {
          if (this.appliesTo == null) {
            this.appliesTo = new ArrayList<>();
          }
          this.appliesTo.add(element);
          return this;
        }

        /**
         * Add all elements to `appliesTo` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.SubscriptionData.BillingSchedule#appliesTo} for the field
         * documentation.
         */
        public Builder addAllAppliesTo(
            List<QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo> elements) {
          if (this.appliesTo == null) {
            this.appliesTo = new ArrayList<>();
          }
          this.appliesTo.addAll(elements);
          return this;
        }

        /**
         * <strong>Required.</strong> The start of the period to bill from when the Quote is
         * accepted.
         */
        public Builder setBillFrom(
            QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom billFrom) {
          this.billFrom = billFrom;
          return this;
        }

        /**
         * <strong>Required.</strong> The end of the period to bill until when the Quote is
         * accepted.
         */
        public Builder setBillUntil(
            QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionData.BillingSchedule#extraParams} for the
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
         * map. See {@link QuoteCreateParams.SubscriptionData.BillingSchedule#extraParams} for the
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
         * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and
         * up to 200 characters. If not provided, a unique key will be generated.
         */
        public Builder setKey(String key) {
          this.key = key;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AppliesTo {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the price object. */
        @SerializedName("price")
        String price;

        /**
         * <strong>Required.</strong> Controls which subscription items the billing schedule applies
         * to.
         */
        @SerializedName("type")
        Type type;

        private AppliesTo(Map<String, Object> extraParams, String price, Type type) {
          this.extraParams = extraParams;
          this.price = price;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String price;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo build() {
            return new QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo(
                this.extraParams, this.price, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo#extraParams} for the field
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
           * QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * <strong>Required.</strong> Controls which subscription items the billing schedule
           * applies to.
           */
          public Builder setType(
              QuoteCreateParams.SubscriptionData.BillingSchedule.AppliesTo.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("price")
          PRICE("price");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom build() {
            return new QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom(
                this.extraParams, this.lineStartsAt, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom#extraParams} for the field
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
           * QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom#extraParams} for the field
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
              QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom.LineStartsAt
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
              QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineStartsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom.LineStartsAt
                build() {
              return new QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom.LineStartsAt(
                  this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom.LineStartsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionData.BillingSchedule.BillFrom.LineStartsAt#extraParams}
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
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil build() {
            return new QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil(
                this.duration, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
          }

          /** Details of the duration over which to bill. */
          public Builder setDuration(
              QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Duration duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil#extraParams} for the field
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
           * QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil#extraParams} for the field
           * documentation.
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
              QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.LineEndsAt lineEndsAt) {
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
              QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Duration build() {
              return new QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Duration(
                  this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Duration#extraParams}
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
             * QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Duration#extraParams}
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
                QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.Duration.Interval
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
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineEndsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.LineEndsAt build() {
              return new QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.LineEndsAt(
                  this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.LineEndsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionData.BillingSchedule.BillUntil.LineEndsAt#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.SubscriptionData.Prebilling build() {
          return new QuoteCreateParams.SubscriptionData.Prebilling(
              this.extraParams, this.iterations);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionData.Prebilling#extraParams} for the field
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
         * map. See {@link QuoteCreateParams.SubscriptionData.Prebilling#extraParams} for the field
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

    public enum PhaseEffectiveAt implements ApiRequestParams.EnumParam {
      @SerializedName("billing_period_start")
      BILLING_PERIOD_START("billing_period_start"),

      @SerializedName("phase_start")
      PHASE_START("phase_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PhaseEffectiveAt(String value) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionDataOverride {
    /**
     * <strong>Required.</strong> Whether the override applies to an existing Subscription Schedule
     * or a new Subscription Schedule.
     */
    @SerializedName("applies_to")
    AppliesTo appliesTo;

    /** Describes the period to bill for upon accepting the quote. */
    @SerializedName("bill_on_acceptance")
    BillOnAcceptance billOnAcceptance;

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
     * Billing schedules that will be applied to the subscription or subscription schedule created
     * when the quote is accepted.
     */
    @SerializedName("billing_schedules")
    List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule> billingSchedules;

    /**
     * The customer the Subscription Data override applies to. This is only relevant when {@code
     * applies_to.type=new_reference}.
     */
    @SerializedName("customer")
    String customer;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    String description;

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
     * Configures how the subscription schedule handles billing for phase transitions when the quote
     * is accepted.
     */
    @SerializedName("phase_effective_at")
    PhaseEffectiveAt phaseEffectiveAt;

    /**
     * Determines how to handle <a
     * href="https://docs.stripe.com/subscriptions/billing-cycle#prorations">prorations</a>. When
     * creating a subscription, valid values are {@code create_prorations} or {@code none}.
     *
     * <p>When updating a subscription, valid values are {@code create_prorations}, {@code none}, or
     * {@code always_invoice}.
     *
     * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
     * applicable. These proration items will only be invoiced immediately under <a
     * href="https://docs.stripe.com/subscriptions/upgrading-downgrading#immediate-payment">certain
     * conditions</a>. In order to always invoice immediately for prorations, pass {@code
     * always_invoice}.
     *
     * <p>Prorations can be disabled by passing {@code none}.
     */
    @SerializedName("proration_behavior")
    ProrationBehavior prorationBehavior;

    private SubscriptionDataOverride(
        AppliesTo appliesTo,
        BillOnAcceptance billOnAcceptance,
        BillingBehavior billingBehavior,
        List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule> billingSchedules,
        String customer,
        String description,
        EndBehavior endBehavior,
        Map<String, Object> extraParams,
        PhaseEffectiveAt phaseEffectiveAt,
        ProrationBehavior prorationBehavior) {
      this.appliesTo = appliesTo;
      this.billOnAcceptance = billOnAcceptance;
      this.billingBehavior = billingBehavior;
      this.billingSchedules = billingSchedules;
      this.customer = customer;
      this.description = description;
      this.endBehavior = endBehavior;
      this.extraParams = extraParams;
      this.phaseEffectiveAt = phaseEffectiveAt;
      this.prorationBehavior = prorationBehavior;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AppliesTo appliesTo;

      private BillOnAcceptance billOnAcceptance;

      private BillingBehavior billingBehavior;

      private List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule> billingSchedules;

      private String customer;

      private String description;

      private EndBehavior endBehavior;

      private Map<String, Object> extraParams;

      private PhaseEffectiveAt phaseEffectiveAt;

      private ProrationBehavior prorationBehavior;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.SubscriptionDataOverride build() {
        return new QuoteCreateParams.SubscriptionDataOverride(
            this.appliesTo,
            this.billOnAcceptance,
            this.billingBehavior,
            this.billingSchedules,
            this.customer,
            this.description,
            this.endBehavior,
            this.extraParams,
            this.phaseEffectiveAt,
            this.prorationBehavior);
      }

      /**
       * <strong>Required.</strong> Whether the override applies to an existing Subscription
       * Schedule or a new Subscription Schedule.
       */
      public Builder setAppliesTo(QuoteCreateParams.SubscriptionDataOverride.AppliesTo appliesTo) {
        this.appliesTo = appliesTo;
        return this;
      }

      /** Describes the period to bill for upon accepting the quote. */
      public Builder setBillOnAcceptance(
          QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance billOnAcceptance) {
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
          QuoteCreateParams.SubscriptionDataOverride.BillingBehavior billingBehavior) {
        this.billingBehavior = billingBehavior;
        return this;
      }

      /**
       * Add an element to `billingSchedules` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * QuoteCreateParams.SubscriptionDataOverride#billingSchedules} for the field documentation.
       */
      public Builder addBillingSchedule(
          QuoteCreateParams.SubscriptionDataOverride.BillingSchedule element) {
        if (this.billingSchedules == null) {
          this.billingSchedules = new ArrayList<>();
        }
        this.billingSchedules.add(element);
        return this;
      }

      /**
       * Add all elements to `billingSchedules` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link QuoteCreateParams.SubscriptionDataOverride#billingSchedules} for the field
       * documentation.
       */
      public Builder addAllBillingSchedule(
          List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule> elements) {
        if (this.billingSchedules == null) {
          this.billingSchedules = new ArrayList<>();
        }
        this.billingSchedules.addAll(elements);
        return this;
      }

      /**
       * The customer the Subscription Data override applies to. This is only relevant when {@code
       * applies_to.type=new_reference}.
       */
      public Builder setCustomer(String customer) {
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

      /** Behavior of the subscription schedule and underlying subscription when it ends. */
      public Builder setEndBehavior(
          QuoteCreateParams.SubscriptionDataOverride.EndBehavior endBehavior) {
        this.endBehavior = endBehavior;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.SubscriptionDataOverride#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.SubscriptionDataOverride#extraParams} for the field
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
       * Configures how the subscription schedule handles billing for phase transitions when the
       * quote is accepted.
       */
      public Builder setPhaseEffectiveAt(
          QuoteCreateParams.SubscriptionDataOverride.PhaseEffectiveAt phaseEffectiveAt) {
        this.phaseEffectiveAt = phaseEffectiveAt;
        return this;
      }

      /**
       * Determines how to handle <a
       * href="https://docs.stripe.com/subscriptions/billing-cycle#prorations">prorations</a>. When
       * creating a subscription, valid values are {@code create_prorations} or {@code none}.
       *
       * <p>When updating a subscription, valid values are {@code create_prorations}, {@code none},
       * or {@code always_invoice}.
       *
       * <p>Passing {@code create_prorations} will cause proration invoice items to be created when
       * applicable. These proration items will only be invoiced immediately under <a
       * href="https://docs.stripe.com/subscriptions/upgrading-downgrading#immediate-payment">certain
       * conditions</a>. In order to always invoice immediately for prorations, pass {@code
       * always_invoice}.
       *
       * <p>Prorations can be disabled by passing {@code none}.
       */
      public Builder setProrationBehavior(
          QuoteCreateParams.SubscriptionDataOverride.ProrationBehavior prorationBehavior) {
        this.prorationBehavior = prorationBehavior;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
      String newReference;

      /** The ID of the schedule the line applies to. */
      @SerializedName("subscription_schedule")
      String subscriptionSchedule;

      /**
       * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule or
       * an existing schedule.
       */
      @SerializedName("type")
      Type type;

      private AppliesTo(
          Map<String, Object> extraParams,
          String newReference,
          String subscriptionSchedule,
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

        private String newReference;

        private String subscriptionSchedule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.SubscriptionDataOverride.AppliesTo build() {
          return new QuoteCreateParams.SubscriptionDataOverride.AppliesTo(
              this.extraParams, this.newReference, this.subscriptionSchedule, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionDataOverride.AppliesTo#extraParams} for the
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
         * map. See {@link QuoteCreateParams.SubscriptionDataOverride.AppliesTo#extraParams} for the
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

        /** The ID of the schedule the line applies to. */
        public Builder setSubscriptionSchedule(String subscriptionSchedule) {
          this.subscriptionSchedule = subscriptionSchedule;
          return this;
        }

        /**
         * <strong>Required.</strong> Describes whether the quote line is affecting a new schedule
         * or an existing schedule.
         */
        public Builder setType(QuoteCreateParams.SubscriptionDataOverride.AppliesTo.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance build() {
          return new QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance(
              this.billFrom, this.billUntil, this.extraParams);
        }

        /** The start of the period to bill from when the Quote is accepted. */
        public Builder setBillFrom(
            QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom billFrom) {
          this.billFrom = billFrom;
          return this;
        }

        /** The end of the period to bill until when the Quote is accepted. */
        public Builder setBillUntil(
            QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance#extraParams}
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
         * map. See {@link QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance#extraParams}
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
          public QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom build() {
            return new QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom(
                this.extraParams, this.lineStartsAt, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom#extraParams} for
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
           * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom#extraParams} for
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
              QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt
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
              QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineStartsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt
                build() {
              return new QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom
                  .LineStartsAt(this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillFrom.LineStartsAt#extraParams}
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
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil build() {
            return new QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil(
                this.duration, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
          }

          /** Details of the duration over which to bill. */
          public Builder setDuration(
              QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration
                  duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil#extraParams} for
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
           * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil#extraParams} for
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
              QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt
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
              QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration
                build() {
              return new QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil
                  .Duration(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration#extraParams}
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
             * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration#extraParams}
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
                QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.Duration
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
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineEndsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt
                build() {
              return new QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil
                  .LineEndsAt(this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionDataOverride.BillOnAcceptance.BillUntil.LineEndsAt#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
    public static class BillingSchedule {
      /** Configure billing schedule differently for individual subscription items. */
      @SerializedName("applies_to")
      List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo> appliesTo;

      /**
       * <strong>Required.</strong> The start of the period to bill from when the Quote is accepted.
       */
      @SerializedName("bill_from")
      BillFrom billFrom;

      /**
       * <strong>Required.</strong> The end of the period to bill until when the Quote is accepted.
       */
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

      /**
       * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and up
       * to 200 characters. If not provided, a unique key will be generated.
       */
      @SerializedName("key")
      String key;

      private BillingSchedule(
          List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo> appliesTo,
          BillFrom billFrom,
          BillUntil billUntil,
          Map<String, Object> extraParams,
          String key) {
        this.appliesTo = appliesTo;
        this.billFrom = billFrom;
        this.billUntil = billUntil;
        this.extraParams = extraParams;
        this.key = key;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo>
            appliesTo;

        private BillFrom billFrom;

        private BillUntil billUntil;

        private Map<String, Object> extraParams;

        private String key;

        /** Finalize and obtain parameter instance from this builder. */
        public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule build() {
          return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule(
              this.appliesTo, this.billFrom, this.billUntil, this.extraParams, this.key);
        }

        /**
         * Add an element to `appliesTo` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule#appliesTo} for the field
         * documentation.
         */
        public Builder addAppliesTo(
            QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo element) {
          if (this.appliesTo == null) {
            this.appliesTo = new ArrayList<>();
          }
          this.appliesTo.add(element);
          return this;
        }

        /**
         * Add all elements to `appliesTo` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule#appliesTo} for the field
         * documentation.
         */
        public Builder addAllAppliesTo(
            List<QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo> elements) {
          if (this.appliesTo == null) {
            this.appliesTo = new ArrayList<>();
          }
          this.appliesTo.addAll(elements);
          return this;
        }

        /**
         * <strong>Required.</strong> The start of the period to bill from when the Quote is
         * accepted.
         */
        public Builder setBillFrom(
            QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom billFrom) {
          this.billFrom = billFrom;
          return this;
        }

        /**
         * <strong>Required.</strong> The end of the period to bill until when the Quote is
         * accepted.
         */
        public Builder setBillUntil(
            QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil billUntil) {
          this.billUntil = billUntil;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link QuoteCreateParams.SubscriptionDataOverride.BillingSchedule#extraParams}
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
         * map. See {@link QuoteCreateParams.SubscriptionDataOverride.BillingSchedule#extraParams}
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
         * Specify a key for the billing schedule. Must be unique to this field, alphanumeric, and
         * up to 200 characters. If not provided, a unique key will be generated.
         */
        public Builder setKey(String key) {
          this.key = key;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class AppliesTo {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the price object. */
        @SerializedName("price")
        String price;

        /**
         * <strong>Required.</strong> Controls which subscription items the billing schedule applies
         * to.
         */
        @SerializedName("type")
        Type type;

        private AppliesTo(Map<String, Object> extraParams, String price, Type type) {
          this.extraParams = extraParams;
          this.price = price;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String price;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo build() {
            return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo(
                this.extraParams, this.price, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo#extraParams} for
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
           * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of the price object. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * <strong>Required.</strong> Controls which subscription items the billing schedule
           * applies to.
           */
          public Builder setType(
              QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.AppliesTo.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("price")
          PRICE("price");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom build() {
            return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom(
                this.extraParams, this.lineStartsAt, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom#extraParams} for
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
           * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom#extraParams} for
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
              QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom.LineStartsAt
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
              QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineStartsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom.LineStartsAt
                build() {
              return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom
                  .LineStartsAt(this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom.LineStartsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillFrom.LineStartsAt#extraParams}
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
      @EqualsAndHashCode(callSuper = false)
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
          public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil build() {
            return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil(
                this.duration, this.extraParams, this.lineEndsAt, this.timestamp, this.type);
          }

          /** Details of the duration over which to bill. */
          public Builder setDuration(
              QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.Duration
                  duration) {
            this.duration = duration;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil#extraParams} for
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
           * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil#extraParams} for
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
              QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.LineEndsAt
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
              QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.Duration
                build() {
              return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil
                  .Duration(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.Duration#extraParams}
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
             * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.Duration#extraParams}
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
                QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.Duration
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
        @EqualsAndHashCode(callSuper = false)
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
          String id;

          /**
           * The position of the previous quote line in the {@code lines} array after which this
           * line should begin. Indexes start from 0 and must be less than the index of the current
           * line in the array.
           */
          @SerializedName("index")
          Long index;

          private LineEndsAt(Map<String, Object> extraParams, String id, Long index) {
            this.extraParams = extraParams;
            this.id = id;
            this.index = index;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private Long index;

            /** Finalize and obtain parameter instance from this builder. */
            public QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.LineEndsAt
                build() {
              return new QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil
                  .LineEndsAt(this.extraParams, this.id, this.index);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.LineEndsAt#extraParams}
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
             * QuoteCreateParams.SubscriptionDataOverride.BillingSchedule.BillUntil.LineEndsAt#extraParams}
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

    public enum PhaseEffectiveAt implements ApiRequestParams.EnumParam {
      @SerializedName("billing_period_start")
      BILLING_PERIOD_START("billing_period_start"),

      @SerializedName("phase_start")
      PHASE_START("phase_start");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PhaseEffectiveAt(String value) {
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
  @EqualsAndHashCode(callSuper = false)
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
    String destination;

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
        String destination,
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

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public QuoteCreateParams.TransferData build() {
        return new QuoteCreateParams.TransferData(
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

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QuoteCreateParams.TransferData#extraParams} for the field documentation.
       */
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
       * See {@link QuoteCreateParams.TransferData#extraParams} for the field documentation.
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

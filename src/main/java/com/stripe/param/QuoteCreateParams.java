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
public class QuoteCreateParams extends ApiRequestParams {
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
   * sending an invoice, Stripe will email your customer an invoice with payment instructions.
   * Defaults to {@code charge_automatically}.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /**
   * The customer for which this quote belongs to. A customer is required before finalizing the
   * quote. Once specified, it cannot be changed.
   */
  @SerializedName("customer")
  String customer;

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
  String description;

  /** The discounts applied to the quote. You can only set up to one discount. */
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
  String footer;

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
  String header;

  /** All invoices will be billed using the specified settings. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /**
   * A list of line items the customer is being quoted for. Each line item includes information
   * about the product, the quantity, and the resulting cost.
   */
  @SerializedName("line_items")
  List<LineItem> lineItems;

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

  private QuoteCreateParams(
      Object applicationFeeAmount,
      Object applicationFeePercent,
      AutomaticTax automaticTax,
      CollectionMethod collectionMethod,
      String customer,
      Object defaultTaxRates,
      String description,
      Object discounts,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      String footer,
      FromQuote fromQuote,
      String header,
      InvoiceSettings invoiceSettings,
      List<LineItem> lineItems,
      Map<String, String> metadata,
      Object onBehalfOf,
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
    this.fromQuote = fromQuote;
    this.header = header;
    this.invoiceSettings = invoiceSettings;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
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

    private String customer;

    private Object defaultTaxRates;

    private String description;

    private Object discounts;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private String footer;

    private FromQuote fromQuote;

    private String header;

    private InvoiceSettings invoiceSettings;

    private List<LineItem> lineItems;

    private Map<String, String> metadata;

    private Object onBehalfOf;

    private SubscriptionData subscriptionData;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public QuoteCreateParams build() {
      return new QuoteCreateParams(
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
          this.fromQuote,
          this.header,
          this.invoiceSettings,
          this.lineItems,
          this.metadata,
          this.onBehalfOf,
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
    public Builder setAutomaticTax(AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay invoices at the end of the subscription cycle or at invoice
     * finalization using the default payment method attached to the subscription or customer. When
     * sending an invoice, Stripe will email your customer an invoice with payment instructions.
     * Defaults to {@code charge_automatically}.
     */
    public Builder setCollectionMethod(CollectionMethod collectionMethod) {
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
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(Discount element) {
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
    public Builder addAllDiscount(List<Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<QuoteCreateParams.Discount>();
      }
      ((List<QuoteCreateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /** The discounts applied to the quote. You can only set up to one discount. */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /** The discounts applied to the quote. You can only set up to one discount. */
    public Builder setDiscounts(List<Discount> discounts) {
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
     * Clone an existing quote. The new quote will be created in {@code status=draft}. When using
     * this parameter, you cannot specify any other parameters except for {@code expires_at}.
     */
    public Builder setFromQuote(FromQuote fromQuote) {
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

    /** All invoices will be billed using the specified settings. */
    public Builder setInvoiceSettings(InvoiceSettings invoiceSettings) {
      this.invoiceSettings = invoiceSettings;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QuoteCreateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(LineItem element) {
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
    public Builder addAllLineItem(List<LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
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
    public Builder setSubscriptionData(SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /** The data with which to automatically create a Transfer for each of the invoices. */
    public Builder setTransferData(TransferData transferData) {
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
      public AutomaticTax build() {
        return new AutomaticTax(this.enabled, this.extraParams);
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
    }
  }

  @Getter
  public static class Discount {
    /** ID of the coupon to create a new discount for. */
    @SerializedName("coupon")
    String coupon;

    /** ID of an existing discount on the object (or one of its ancestors) to reuse. */
    @SerializedName("discount")
    String discount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Discount(String coupon, String discount, Map<String, Object> extraParams) {
      this.coupon = coupon;
      this.discount = discount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String coupon;

      private String discount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Discount build() {
        return new Discount(this.coupon, this.discount, this.extraParams);
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
    }
  }

  @Getter
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

    /** The {@code id} of the quote that will be cloned. */
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
      public FromQuote build() {
        return new FromQuote(this.extraParams, this.isRevision, this.quote);
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

      /** The {@code id} of the quote that will be cloned. */
      public Builder setQuote(String quote) {
        this.quote = quote;
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
      public InvoiceSettings build() {
        return new InvoiceSettings(this.daysUntilDue, this.extraParams);
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
    }
  }

  @Getter
  public static class LineItem {
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
        Map<String, Object> extraParams,
        String price,
        PriceData priceData,
        Long quantity,
        Object taxRates) {
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
      private Map<String, Object> extraParams;

      private String price;

      private PriceData priceData;

      private Long quantity;

      private Object taxRates;

      /** Finalize and obtain parameter instance from this builder. */
      public LineItem build() {
        return new LineItem(
            this.extraParams, this.price, this.priceData, this.quantity, this.taxRates);
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
       * Data used to generate a new <a href="https://stripe.com/docs/api/prices">Price</a> object
       * inline. One of {@code price} or {@code price_data} is required.
       */
      public Builder setPriceData(PriceData priceData) {
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
    public static class PriceData {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
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

      /** The ID of the product that this price will belong to. */
      @SerializedName("product")
      String product;

      /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
      @SerializedName("recurring")
      Recurring recurring;

      /**
       * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
       * {@code inclusive} or {@code exclusive}, it cannot be changed.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
      @SerializedName("unit_amount")
      Long unitAmount;

      /**
       * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
       * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
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
        public PriceData build() {
          return new PriceData(
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

        /** The ID of the product that this price will belong to. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
        public Builder setRecurring(Recurring recurring) {
          this.recurring = recurring;
          return this;
        }

        /**
         * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One
         * of {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either
         * {@code inclusive} or {@code exclusive}, it cannot be changed.
         */
        public Builder setTaxBehavior(TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /** A positive integer in %s (or 0 for a free price) representing how much to charge. */
        public Builder setUnitAmount(Long unitAmount) {
          this.unitAmount = unitAmount;
          return this;
        }

        /**
         * Same as {@code unit_amount}, but accepts a decimal value in %s with at most 12 decimal
         * places. Only one of {@code unit_amount} and {@code unit_amount_decimal} can be set.
         */
        public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
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
          public Recurring build() {
            return new Recurring(this.extraParams, this.interval, this.intervalCount);
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
           * Specifies billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
           * year}.
           */
          public Builder setInterval(Interval interval) {
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
  public static class SubscriptionData {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.
     */
    @SerializedName("trial_period_days")
    Object trialPeriodDays;

    private SubscriptionData(
        Object effectiveDate, Map<String, Object> extraParams, Object trialPeriodDays) {
      this.effectiveDate = effectiveDate;
      this.extraParams = extraParams;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object effectiveDate;

      private Map<String, Object> extraParams;

      private Object trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionData build() {
        return new SubscriptionData(this.effectiveDate, this.extraParams, this.trialPeriodDays);
      }

      /**
       * When creating a new subscription, the date of which the subscription schedule will start
       * after the quote is accepted. When updating a subscription, the date of which the
       * subscription will be updated using a subscription schedule. The special value {@code
       * current_period_end} can be provided to update a subscription at the end of its current
       * period. The {@code effective_date} is ignored if it is in the past when the quote is
       * accepted.
       */
      public Builder setEffectiveDate(EffectiveDate effectiveDate) {
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

    public enum EffectiveDate implements ApiRequestParams.EnumParam {
      @SerializedName("current_period_end")
      CURRENT_PERIOD_END("current_period_end");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EffectiveDate(String value) {
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
      public TransferData build() {
        return new TransferData(
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

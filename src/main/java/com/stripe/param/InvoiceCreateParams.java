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
public class InvoiceCreateParams extends ApiRequestParams {
  /** The account tax IDs associated with the invoice. Only editable when the invoice is a draft. */
  @SerializedName("account_tax_ids")
  Object accountTaxIds;

  /**
   * A fee in cents (or local equivalent) that will be applied to the invoice and transferred to the
   * application owner's Stripe account. The request must be made with an OAuth key or the
   * Stripe-Account header in order to take an application fee. For more information, see the
   * application fees <a
   * href="https://stripe.com/docs/billing/invoices/connect#collecting-fees">documentation</a>.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Controls whether Stripe performs <a
   * href="https://stripe.com/docs/invoicing/integration/automatic-advancement-collection">automatic
   * collection</a> of the invoice. If {@code false}, the invoice's state doesn't automatically
   * advance without an explicit action.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /** Settings for automatic tax lookup for this invoice. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay this invoice using the default source attached to the customer. When
   * sending an invoice, Stripe will email this invoice to the customer with payment instructions.
   * Defaults to {@code charge_automatically}.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /**
   * The currency to create this invoice in. Defaults to that of {@code customer} if not specified.
   */
  @SerializedName("currency")
  String currency;

  /** A list of up to 4 custom fields to be displayed on the invoice. */
  @SerializedName("custom_fields")
  Object customFields;

  /** The ID of the customer who will be billed. */
  @SerializedName("customer")
  String customer;

  /**
   * The number of days from when the invoice is created until it is due. Valid only for invoices
   * where {@code collection_method=send_invoice}.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  String defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  String defaultSource;

  /** The tax rates that will apply to any line item that does not have {@code tax_rates} set. */
  @SerializedName("default_tax_rates")
  List<String> defaultTaxRates;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as
   * 'memo' in the Dashboard.
   */
  @SerializedName("description")
  String description;

  /**
   * The coupons to redeem into discounts for the invoice. If not specified, inherits the discount
   * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
   */
  @SerializedName("discounts")
  Object discounts;

  /**
   * The date on which payment for this invoice is due. Valid only for invoices where {@code
   * collection_method=send_invoice}.
   */
  @SerializedName("due_date")
  Long dueDate;

  /**
   * The date when this invoice is in effect. Same as {@code finalized_at} unless overwritten. When
   * defined, this value replaces the system-generated 'Date of issue' printed on the invoice PDF
   * and receipt.
   */
  @SerializedName("effective_at")
  Long effectiveAt;

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

  /** Footer to be displayed on the invoice. */
  @SerializedName("footer")
  String footer;

  /**
   * Revise an existing invoice. The new invoice will be created in {@code status=draft}. See the <a
   * href="https://stripe.com/docs/invoicing/invoice-revisions">revision documentation</a> for more
   * details.
   */
  @SerializedName("from_invoice")
  FromInvoice fromInvoice;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the
   * invoice will be presented with the branding and support information of the specified account.
   * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
   * documentation for details.
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
   */
  @SerializedName("payment_settings")
  PaymentSettings paymentSettings;

  /**
   * How to handle pending invoice items on invoice creation. One of {@code include} or {@code
   * exclude}. {@code include} will include any pending invoice items, and will create an empty
   * draft invoice if no pending invoice items exist. {@code exclude} will always create an empty
   * invoice draft regardless if there are pending invoice items or not. Defaults to {@code exclude}
   * if the parameter is omitted.
   */
  @SerializedName("pending_invoice_items_behavior")
  PendingInvoiceItemsBehavior pendingInvoiceItemsBehavior;

  /**
   * The rendering-related settings that control how the invoice is displayed on customer-facing
   * surfaces such as PDF and Hosted Invoice Page.
   */
  @SerializedName("rendering")
  Rendering rendering;

  /**
   * This is a legacy field that will be removed soon. For details about {@code rendering_options},
   * refer to {@code rendering} instead. Options for invoice PDF rendering.
   */
  @SerializedName("rendering_options")
  Object renderingOptions;

  /** Settings for the cost of shipping for this invoice. */
  @SerializedName("shipping_cost")
  ShippingCost shippingCost;

  /**
   * Shipping details for the invoice. The Invoice PDF will use the {@code shipping_details} value
   * if it is set, otherwise the PDF will render the shipping address from the customer.
   */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * {@code statement_descriptor} will be set to the first subscription item's product's {@code
   * statement_descriptor}.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The ID of the subscription to invoice, if any. If set, the created invoice will only include
   * pending invoice items for that subscription. The subscription's billing cycle and regular
   * subscription events won't be affected.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private InvoiceCreateParams(
      Object accountTaxIds,
      Long applicationFeeAmount,
      Boolean autoAdvance,
      AutomaticTax automaticTax,
      CollectionMethod collectionMethod,
      String currency,
      Object customFields,
      String customer,
      Long daysUntilDue,
      String defaultPaymentMethod,
      String defaultSource,
      List<String> defaultTaxRates,
      String description,
      Object discounts,
      Long dueDate,
      Long effectiveAt,
      List<String> expand,
      Map<String, Object> extraParams,
      String footer,
      FromInvoice fromInvoice,
      Object metadata,
      String onBehalfOf,
      PaymentSettings paymentSettings,
      PendingInvoiceItemsBehavior pendingInvoiceItemsBehavior,
      Rendering rendering,
      Object renderingOptions,
      ShippingCost shippingCost,
      ShippingDetails shippingDetails,
      String statementDescriptor,
      String subscription,
      TransferData transferData) {
    this.accountTaxIds = accountTaxIds;
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.automaticTax = automaticTax;
    this.collectionMethod = collectionMethod;
    this.currency = currency;
    this.customFields = customFields;
    this.customer = customer;
    this.daysUntilDue = daysUntilDue;
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.defaultSource = defaultSource;
    this.defaultTaxRates = defaultTaxRates;
    this.description = description;
    this.discounts = discounts;
    this.dueDate = dueDate;
    this.effectiveAt = effectiveAt;
    this.expand = expand;
    this.extraParams = extraParams;
    this.footer = footer;
    this.fromInvoice = fromInvoice;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentSettings = paymentSettings;
    this.pendingInvoiceItemsBehavior = pendingInvoiceItemsBehavior;
    this.rendering = rendering;
    this.renderingOptions = renderingOptions;
    this.shippingCost = shippingCost;
    this.shippingDetails = shippingDetails;
    this.statementDescriptor = statementDescriptor;
    this.subscription = subscription;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountTaxIds;

    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private AutomaticTax automaticTax;

    private CollectionMethod collectionMethod;

    private String currency;

    private Object customFields;

    private String customer;

    private Long daysUntilDue;

    private String defaultPaymentMethod;

    private String defaultSource;

    private List<String> defaultTaxRates;

    private String description;

    private Object discounts;

    private Long dueDate;

    private Long effectiveAt;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String footer;

    private FromInvoice fromInvoice;

    private Object metadata;

    private String onBehalfOf;

    private PaymentSettings paymentSettings;

    private PendingInvoiceItemsBehavior pendingInvoiceItemsBehavior;

    private Rendering rendering;

    private Object renderingOptions;

    private ShippingCost shippingCost;

    private ShippingDetails shippingDetails;

    private String statementDescriptor;

    private String subscription;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceCreateParams build() {
      return new InvoiceCreateParams(
          this.accountTaxIds,
          this.applicationFeeAmount,
          this.autoAdvance,
          this.automaticTax,
          this.collectionMethod,
          this.currency,
          this.customFields,
          this.customer,
          this.daysUntilDue,
          this.defaultPaymentMethod,
          this.defaultSource,
          this.defaultTaxRates,
          this.description,
          this.discounts,
          this.dueDate,
          this.effectiveAt,
          this.expand,
          this.extraParams,
          this.footer,
          this.fromInvoice,
          this.metadata,
          this.onBehalfOf,
          this.paymentSettings,
          this.pendingInvoiceItemsBehavior,
          this.rendering,
          this.renderingOptions,
          this.shippingCost,
          this.shippingDetails,
          this.statementDescriptor,
          this.subscription,
          this.transferData);
    }

    /**
     * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#accountTaxIds} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAccountTaxId(String element) {
      if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
        this.accountTaxIds = new ArrayList<String>();
      }
      ((List<String>) this.accountTaxIds).add(element);
      return this;
    }

    /**
     * Add all elements to `accountTaxIds` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#accountTaxIds} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllAccountTaxId(List<String> elements) {
      if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
        this.accountTaxIds = new ArrayList<String>();
      }
      ((List<String>) this.accountTaxIds).addAll(elements);
      return this;
    }

    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
      this.accountTaxIds = accountTaxIds;
      return this;
    }

    /**
     * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
     */
    public Builder setAccountTaxIds(List<String> accountTaxIds) {
      this.accountTaxIds = accountTaxIds;
      return this;
    }

    /**
     * A fee in cents (or local equivalent) that will be applied to the invoice and transferred to
     * the application owner's Stripe account. The request must be made with an OAuth key or the
     * Stripe-Account header in order to take an application fee. For more information, see the
     * application fees <a
     * href="https://stripe.com/docs/billing/invoices/connect#collecting-fees">documentation</a>.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Controls whether Stripe performs <a
     * href="https://stripe.com/docs/invoicing/integration/automatic-advancement-collection">automatic
     * collection</a> of the invoice. If {@code false}, the invoice's state doesn't automatically
     * advance without an explicit action.
     */
    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /** Settings for automatic tax lookup for this invoice. */
    public Builder setAutomaticTax(InvoiceCreateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
     * Stripe will attempt to pay this invoice using the default source attached to the customer.
     * When sending an invoice, Stripe will email this invoice to the customer with payment
     * instructions. Defaults to {@code charge_automatically}.
     */
    public Builder setCollectionMethod(InvoiceCreateParams.CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /**
     * The currency to create this invoice in. Defaults to that of {@code customer} if not
     * specified.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addCustomField(InvoiceCreateParams.CustomField element) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceCreateParams.CustomField>();
      }
      ((List<InvoiceCreateParams.CustomField>) this.customFields).add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllCustomField(List<InvoiceCreateParams.CustomField> elements) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceCreateParams.CustomField>();
      }
      ((List<InvoiceCreateParams.CustomField>) this.customFields).addAll(elements);
      return this;
    }

    /** A list of up to 4 custom fields to be displayed on the invoice. */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /** A list of up to 4 custom fields to be displayed on the invoice. */
    public Builder setCustomFields(List<InvoiceCreateParams.CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    /** The ID of the customer who will be billed. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The number of days from when the invoice is created until it is due. Valid only for invoices
     * where {@code collection_method=send_invoice}.
     */
    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#defaultTaxRates} for the field documentation.
     */
    public Builder addDefaultTaxRate(String element) {
      if (this.defaultTaxRates == null) {
        this.defaultTaxRates = new ArrayList<>();
      }
      this.defaultTaxRates.add(element);
      return this;
    }

    /**
     * Add all elements to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#defaultTaxRates} for the field documentation.
     */
    public Builder addAllDefaultTaxRate(List<String> elements) {
      if (this.defaultTaxRates == null) {
        this.defaultTaxRates = new ArrayList<>();
      }
      this.defaultTaxRates.addAll(elements);
      return this;
    }

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. Referenced
     * as 'memo' in the Dashboard.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(InvoiceCreateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceCreateParams.Discount>();
      }
      ((List<InvoiceCreateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<InvoiceCreateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceCreateParams.Discount>();
      }
      ((List<InvoiceCreateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The coupons to redeem into discounts for the invoice. If not specified, inherits the discount
     * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The coupons to redeem into discounts for the invoice. If not specified, inherits the discount
     * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
     */
    public Builder setDiscounts(List<InvoiceCreateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Valid only for invoices where {@code
     * collection_method=send_invoice}.
     */
    public Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    /**
     * The date when this invoice is in effect. Same as {@code finalized_at} unless overwritten.
     * When defined, this value replaces the system-generated 'Date of issue' printed on the invoice
     * PDF and receipt.
     */
    public Builder setEffectiveAt(Long effectiveAt) {
      this.effectiveAt = effectiveAt;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceCreateParams#expand} for the field documentation.
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
     * InvoiceCreateParams#expand} for the field documentation.
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
     * InvoiceCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link InvoiceCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Footer to be displayed on the invoice. */
    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    /**
     * Revise an existing invoice. The new invoice will be created in {@code status=draft}. See the
     * <a href="https://stripe.com/docs/invoicing/invoice-revisions">revision documentation</a> for
     * more details.
     */
    public Builder setFromInvoice(InvoiceCreateParams.FromInvoice fromInvoice) {
      this.fromInvoice = fromInvoice;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceCreateParams#metadata} for the field documentation.
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
     * See {@link InvoiceCreateParams#metadata} for the field documentation.
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

    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the
     * invoice will be presented with the branding and support information of the specified account.
     * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
     * documentation for details.
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
     */
    public Builder setPaymentSettings(InvoiceCreateParams.PaymentSettings paymentSettings) {
      this.paymentSettings = paymentSettings;
      return this;
    }

    /**
     * How to handle pending invoice items on invoice creation. One of {@code include} or {@code
     * exclude}. {@code include} will include any pending invoice items, and will create an empty
     * draft invoice if no pending invoice items exist. {@code exclude} will always create an empty
     * invoice draft regardless if there are pending invoice items or not. Defaults to {@code
     * exclude} if the parameter is omitted.
     */
    public Builder setPendingInvoiceItemsBehavior(
        InvoiceCreateParams.PendingInvoiceItemsBehavior pendingInvoiceItemsBehavior) {
      this.pendingInvoiceItemsBehavior = pendingInvoiceItemsBehavior;
      return this;
    }

    /**
     * The rendering-related settings that control how the invoice is displayed on customer-facing
     * surfaces such as PDF and Hosted Invoice Page.
     */
    public Builder setRendering(InvoiceCreateParams.Rendering rendering) {
      this.rendering = rendering;
      return this;
    }

    /**
     * This is a legacy field that will be removed soon. For details about {@code
     * rendering_options}, refer to {@code rendering} instead. Options for invoice PDF rendering.
     */
    public Builder setRenderingOptions(InvoiceCreateParams.RenderingOptions renderingOptions) {
      this.renderingOptions = renderingOptions;
      return this;
    }

    /**
     * This is a legacy field that will be removed soon. For details about {@code
     * rendering_options}, refer to {@code rendering} instead. Options for invoice PDF rendering.
     */
    public Builder setRenderingOptions(EmptyParam renderingOptions) {
      this.renderingOptions = renderingOptions;
      return this;
    }

    /** Settings for the cost of shipping for this invoice. */
    public Builder setShippingCost(InvoiceCreateParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /**
     * Shipping details for the invoice. The Invoice PDF will use the {@code shipping_details} value
     * if it is set, otherwise the PDF will render the shipping address from the customer.
     */
    public Builder setShippingDetails(InvoiceCreateParams.ShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * {@code statement_descriptor} will be set to the first subscription item's product's {@code
     * statement_descriptor}.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The ID of the subscription to invoice, if any. If set, the created invoice will only include
     * pending invoice items for that subscription. The subscription's billing cycle and regular
     * subscription events won't be affected.
     */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge.
     */
    public Builder setTransferData(InvoiceCreateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  public static class AutomaticTax {
    /**
     * <strong>Required.</strong> Whether Stripe automatically computes tax on this invoice. Note
     * that incompatible invoice items (invoice items with manually specified <a
     * href="https://stripe.com/docs/api/tax_rates">tax rates</a>, negative amounts, or {@code
     * tax_behavior=unspecified}) cannot be added to automatic tax invoices.
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
      public InvoiceCreateParams.AutomaticTax build() {
        return new InvoiceCreateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Whether Stripe automatically computes tax on this invoice. Note
       * that incompatible invoice items (invoice items with manually specified <a
       * href="https://stripe.com/docs/api/tax_rates">tax rates</a>, negative amounts, or {@code
       * tax_behavior=unspecified}) cannot be added to automatic tax invoices.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.AutomaticTax#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.AutomaticTax#extraParams} for the field documentation.
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
  public static class CustomField {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The name of the custom field. This may be up to 30 characters. */
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
      public InvoiceCreateParams.CustomField build() {
        return new InvoiceCreateParams.CustomField(this.extraParams, this.name, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.CustomField#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.CustomField#extraParams} for the field documentation.
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
       * <strong>Required.</strong> The value of the custom field. This may be up to 30 characters.
       */
      public Builder setValue(String value) {
        this.value = value;
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
      public InvoiceCreateParams.Discount build() {
        return new InvoiceCreateParams.Discount(this.coupon, this.discount, this.extraParams);
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
       * InvoiceCreateParams.Discount#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.Discount#extraParams} for the field documentation.
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
  public static class FromInvoice {
    /**
     * <strong>Required.</strong> The relation between the new invoice and the original invoice.
     * Currently, only 'revision' is permitted
     */
    @SerializedName("action")
    Action action;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The {@code id} of the invoice that will be cloned. */
    @SerializedName("invoice")
    String invoice;

    private FromInvoice(Action action, Map<String, Object> extraParams, String invoice) {
      this.action = action;
      this.extraParams = extraParams;
      this.invoice = invoice;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Action action;

      private Map<String, Object> extraParams;

      private String invoice;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceCreateParams.FromInvoice build() {
        return new InvoiceCreateParams.FromInvoice(this.action, this.extraParams, this.invoice);
      }

      /**
       * <strong>Required.</strong> The relation between the new invoice and the original invoice.
       * Currently, only 'revision' is permitted
       */
      public Builder setAction(InvoiceCreateParams.FromInvoice.Action action) {
        this.action = action;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.FromInvoice#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.FromInvoice#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The {@code id} of the invoice that will be cloned. */
      public Builder setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
      }
    }

    public enum Action implements ApiRequestParams.EnumParam {
      @SerializedName("revision")
      REVISION("revision");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Action(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class PaymentSettings {
    /**
     * ID of the mandate to be used for this invoice. It must correspond to the payment method used
     * to pay the invoice, including the invoice's default_payment_method or default_source, if set.
     */
    @SerializedName("default_mandate")
    Object defaultMandate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Payment-method-specific configuration to provide to the invoice’s PaymentIntent. */
    @SerializedName("payment_method_options")
    PaymentMethodOptions paymentMethodOptions;

    /**
     * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If
     * not set, Stripe attempts to automatically determine the types to use by looking at the
     * invoice’s default payment method, the subscription’s default payment method, the customer’s
     * default payment method, and your <a
     * href="https://dashboard.stripe.com/settings/billing/invoice">invoice template settings</a>.
     */
    @SerializedName("payment_method_types")
    Object paymentMethodTypes;

    private PaymentSettings(
        Object defaultMandate,
        Map<String, Object> extraParams,
        PaymentMethodOptions paymentMethodOptions,
        Object paymentMethodTypes) {
      this.defaultMandate = defaultMandate;
      this.extraParams = extraParams;
      this.paymentMethodOptions = paymentMethodOptions;
      this.paymentMethodTypes = paymentMethodTypes;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object defaultMandate;

      private Map<String, Object> extraParams;

      private PaymentMethodOptions paymentMethodOptions;

      private Object paymentMethodTypes;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceCreateParams.PaymentSettings build() {
        return new InvoiceCreateParams.PaymentSettings(
            this.defaultMandate,
            this.extraParams,
            this.paymentMethodOptions,
            this.paymentMethodTypes);
      }

      /**
       * ID of the mandate to be used for this invoice. It must correspond to the payment method
       * used to pay the invoice, including the invoice's default_payment_method or default_source,
       * if set.
       */
      public Builder setDefaultMandate(String defaultMandate) {
        this.defaultMandate = defaultMandate;
        return this;
      }

      /**
       * ID of the mandate to be used for this invoice. It must correspond to the payment method
       * used to pay the invoice, including the invoice's default_payment_method or default_source,
       * if set.
       */
      public Builder setDefaultMandate(EmptyParam defaultMandate) {
        this.defaultMandate = defaultMandate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.PaymentSettings#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.PaymentSettings#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Payment-method-specific configuration to provide to the invoice’s PaymentIntent. */
      public Builder setPaymentMethodOptions(
          InvoiceCreateParams.PaymentSettings.PaymentMethodOptions paymentMethodOptions) {
        this.paymentMethodOptions = paymentMethodOptions;
        return this;
      }

      /**
       * Add an element to `paymentMethodTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link InvoiceCreateParams.PaymentSettings#paymentMethodTypes} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addPaymentMethodType(
          InvoiceCreateParams.PaymentSettings.PaymentMethodType element) {
        if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
          this.paymentMethodTypes =
              new ArrayList<InvoiceCreateParams.PaymentSettings.PaymentMethodType>();
        }
        ((List<InvoiceCreateParams.PaymentSettings.PaymentMethodType>) this.paymentMethodTypes)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link InvoiceCreateParams.PaymentSettings#paymentMethodTypes} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllPaymentMethodType(
          List<InvoiceCreateParams.PaymentSettings.PaymentMethodType> elements) {
        if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
          this.paymentMethodTypes =
              new ArrayList<InvoiceCreateParams.PaymentSettings.PaymentMethodType>();
        }
        ((List<InvoiceCreateParams.PaymentSettings.PaymentMethodType>) this.paymentMethodTypes)
            .addAll(elements);
        return this;
      }

      /**
       * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If
       * not set, Stripe attempts to automatically determine the types to use by looking at the
       * invoice’s default payment method, the subscription’s default payment method, the customer’s
       * default payment method, and your <a
       * href="https://dashboard.stripe.com/settings/billing/invoice">invoice template settings</a>.
       */
      public Builder setPaymentMethodTypes(EmptyParam paymentMethodTypes) {
        this.paymentMethodTypes = paymentMethodTypes;
        return this;
      }

      /**
       * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If
       * not set, Stripe attempts to automatically determine the types to use by looking at the
       * invoice’s default payment method, the subscription’s default payment method, the customer’s
       * default payment method, and your <a
       * href="https://dashboard.stripe.com/settings/billing/invoice">invoice template settings</a>.
       */
      public Builder setPaymentMethodTypes(
          List<InvoiceCreateParams.PaymentSettings.PaymentMethodType> paymentMethodTypes) {
        this.paymentMethodTypes = paymentMethodTypes;
        return this;
      }
    }

    @Getter
    public static class PaymentMethodOptions {
      /**
       * If paying by {@code acss_debit}, this sub-hash contains details about the Canadian
       * pre-authorized debit payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("acss_debit")
      Object acssDebit;

      /**
       * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
       * payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("bancontact")
      Object bancontact;

      /**
       * If paying by {@code card}, this sub-hash contains details about the Card payment method
       * options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("card")
      Object card;

      /**
       * If paying by {@code customer_balance}, this sub-hash contains details about the Bank
       * transfer payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("customer_balance")
      Object customerBalance;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * If paying by {@code konbini}, this sub-hash contains details about the Konbini payment
       * method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("konbini")
      Object konbini;

      /**
       * If paying by {@code us_bank_account}, this sub-hash contains details about the ACH direct
       * debit payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("us_bank_account")
      Object usBankAccount;

      private PaymentMethodOptions(
          Object acssDebit,
          Object bancontact,
          Object card,
          Object customerBalance,
          Map<String, Object> extraParams,
          Object konbini,
          Object usBankAccount) {
        this.acssDebit = acssDebit;
        this.bancontact = bancontact;
        this.card = card;
        this.customerBalance = customerBalance;
        this.extraParams = extraParams;
        this.konbini = konbini;
        this.usBankAccount = usBankAccount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object acssDebit;

        private Object bancontact;

        private Object card;

        private Object customerBalance;

        private Map<String, Object> extraParams;

        private Object konbini;

        private Object usBankAccount;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions build() {
          return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions(
              this.acssDebit,
              this.bancontact,
              this.card,
              this.customerBalance,
              this.extraParams,
              this.konbini,
              this.usBankAccount);
        }

        /**
         * If paying by {@code acss_debit}, this sub-hash contains details about the Canadian
         * pre-authorized debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setAcssDebit(
            InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit acssDebit) {
          this.acssDebit = acssDebit;
          return this;
        }

        /**
         * If paying by {@code acss_debit}, this sub-hash contains details about the Canadian
         * pre-authorized debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setAcssDebit(EmptyParam acssDebit) {
          this.acssDebit = acssDebit;
          return this;
        }

        /**
         * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
         * payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setBancontact(
            InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Bancontact bancontact) {
          this.bancontact = bancontact;
          return this;
        }

        /**
         * If paying by {@code bancontact}, this sub-hash contains details about the Bancontact
         * payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setBancontact(EmptyParam bancontact) {
          this.bancontact = bancontact;
          return this;
        }

        /**
         * If paying by {@code card}, this sub-hash contains details about the Card payment method
         * options to pass to the invoice’s PaymentIntent.
         */
        public Builder setCard(InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card card) {
          this.card = card;
          return this;
        }

        /**
         * If paying by {@code card}, this sub-hash contains details about the Card payment method
         * options to pass to the invoice’s PaymentIntent.
         */
        public Builder setCard(EmptyParam card) {
          this.card = card;
          return this;
        }

        /**
         * If paying by {@code customer_balance}, this sub-hash contains details about the Bank
         * transfer payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setCustomerBalance(
            InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                customerBalance) {
          this.customerBalance = customerBalance;
          return this;
        }

        /**
         * If paying by {@code customer_balance}, this sub-hash contains details about the Bank
         * transfer payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setCustomerBalance(EmptyParam customerBalance) {
          this.customerBalance = customerBalance;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceCreateParams.PaymentSettings.PaymentMethodOptions#extraParams} for
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
         * map. See {@link InvoiceCreateParams.PaymentSettings.PaymentMethodOptions#extraParams} for
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
         * If paying by {@code konbini}, this sub-hash contains details about the Konbini payment
         * method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setKonbini(
            InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Konbini konbini) {
          this.konbini = konbini;
          return this;
        }

        /**
         * If paying by {@code konbini}, this sub-hash contains details about the Konbini payment
         * method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setKonbini(EmptyParam konbini) {
          this.konbini = konbini;
          return this;
        }

        /**
         * If paying by {@code us_bank_account}, this sub-hash contains details about the ACH direct
         * debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setUsBankAccount(
            InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount usBankAccount) {
          this.usBankAccount = usBankAccount;
          return this;
        }

        /**
         * If paying by {@code us_bank_account}, this sub-hash contains details about the ACH direct
         * debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setUsBankAccount(EmptyParam usBankAccount) {
          this.usBankAccount = usBankAccount;
          return this;
        }
      }

      @Getter
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

        /** Verification method for the intent. */
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
          public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit build() {
            return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit(
                this.extraParams, this.mandateOptions, this.verificationMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit#extraParams} for the
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
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit#extraParams} for the
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
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                  mandateOptions) {
            this.mandateOptions = mandateOptions;
            return this;
          }

          /** Verification method for the intent. */
          public Builder setVerificationMethod(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.VerificationMethod
                  verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
          }
        }

        @Getter
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
            public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                build() {
              return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit
                  .MandateOptions(this.extraParams, this.transactionType);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
                InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions
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
          public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Bancontact build() {
            return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Bancontact(
                this.extraParams, this.preferredLanguage);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Bancontact#extraParams} for
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
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Bancontact#extraParams} for
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
           * Preferred language of the Bancontact authorization page that the customer is redirected
           * to.
           */
          public Builder setPreferredLanguage(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Bancontact.PreferredLanguage
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

        /**
         * Installment configuration for payments attempted on this invoice (Mexico Only).
         *
         * <p>For more information, see the <a
         * href="https://stripe.com/docs/payments/installments">installments integration guide</a>.
         */
        @SerializedName("installments")
        Installments installments;

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. Read our guide on <a
         * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
         * Secure</a> for more information on how this configuration interacts with Radar and our
         * SCA Engine.
         */
        @SerializedName("request_three_d_secure")
        RequestThreeDSecure requestThreeDSecure;

        private Card(
            Map<String, Object> extraParams,
            Installments installments,
            RequestThreeDSecure requestThreeDSecure) {
          this.extraParams = extraParams;
          this.installments = installments;
          this.requestThreeDSecure = requestThreeDSecure;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Installments installments;

          private RequestThreeDSecure requestThreeDSecure;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card build() {
            return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card(
                this.extraParams, this.installments, this.requestThreeDSecure);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card#extraParams} for the
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
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card#extraParams} for the
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
           * Installment configuration for payments attempted on this invoice (Mexico Only).
           *
           * <p>For more information, see the <a
           * href="https://stripe.com/docs/payments/installments">installments integration
           * guide</a>.
           */
          public Builder setInstallments(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments
                  installments) {
            this.installments = installments;
            return this;
          }

          /**
           * We strongly recommend that you rely on our SCA Engine to automatically prompt your
           * customers for authentication based on risk level and <a
           * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
           * However, if you wish to request 3D Secure based on logic from your own fraud engine,
           * provide this option. Read our guide on <a
           * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting
           * 3D Secure</a> for more information on how this configuration interacts with Radar and
           * our SCA Engine.
           */
          public Builder setRequestThreeDSecure(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.RequestThreeDSecure
                  requestThreeDSecure) {
            this.requestThreeDSecure = requestThreeDSecure;
            return this;
          }
        }

        @Getter
        public static class Installments {
          /**
           * Setting to true enables installments for this invoice. Setting to false will prevent
           * any selected plan from applying to a payment.
           */
          @SerializedName("enabled")
          Boolean enabled;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The selected installment plan to use for this invoice. */
          @SerializedName("plan")
          Object plan;

          private Installments(Boolean enabled, Map<String, Object> extraParams, Object plan) {
            this.enabled = enabled;
            this.extraParams = extraParams;
            this.plan = plan;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Boolean enabled;

            private Map<String, Object> extraParams;

            private Object plan;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments
                build() {
              return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments(
                  this.enabled, this.extraParams, this.plan);
            }

            /**
             * Setting to true enables installments for this invoice. Setting to false will prevent
             * any selected plan from applying to a payment.
             */
            public Builder setEnabled(Boolean enabled) {
              this.enabled = enabled;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments#extraParams}
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The selected installment plan to use for this invoice. */
            public Builder setPlan(
                InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
                    plan) {
              this.plan = plan;
              return this;
            }

            /** The selected installment plan to use for this invoice. */
            public Builder setPlan(EmptyParam plan) {
              this.plan = plan;
              return this;
            }
          }

          @Getter
          public static class Plan {
            /**
             * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
             * number of installment payments your customer will make to their credit card.
             */
            @SerializedName("count")
            Long count;

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
             * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
             * interval between installment payments your customer will make to their credit card.
             * One of {@code month}.
             */
            @SerializedName("interval")
            Interval interval;

            /** <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}. */
            @SerializedName("type")
            Type type;

            private Plan(
                Long count, Map<String, Object> extraParams, Interval interval, Type type) {
              this.count = count;
              this.extraParams = extraParams;
              this.interval = interval;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long count;

              private Map<String, Object> extraParams;

              private Interval interval;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
                  build() {
                return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card
                    .Installments.Plan(this.count, this.extraParams, this.interval, this.type);
              }

              /**
               * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
               * number of installment payments your customer will make to their credit card.
               */
              public Builder setCount(Long count) {
                this.count = count;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
               * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
               * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
               * interval between installment payments your customer will make to their credit card.
               * One of {@code month}.
               */
              public Builder setInterval(
                  InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
                          .Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}.
               */
              public Builder setType(
                  InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Interval implements ApiRequestParams.EnumParam {
              @SerializedName("month")
              MONTH("month");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Interval(String value) {
                this.value = value;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("fixed_count")
              FIXED_COUNT("fixed_count");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
          @SerializedName("any")
          ANY("any"),

          @SerializedName("automatic")
          AUTOMATIC("automatic");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RequestThreeDSecure(String value) {
            this.value = value;
          }
        }
      }

      @Getter
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
         * balance. Permitted values include: {@code bank_transfer}.
         */
        @SerializedName("funding_type")
        String fundingType;

        private CustomerBalance(
            BankTransfer bankTransfer, Map<String, Object> extraParams, String fundingType) {
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

          private String fundingType;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance build() {
            return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance(
                this.bankTransfer, this.extraParams, this.fundingType);
          }

          /**
           * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
           * {@code bank_transfer}.
           */
          public Builder setBankTransfer(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer
                  bankTransfer) {
            this.bankTransfer = bankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance#extraParams}
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
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance#extraParams}
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
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Permitted values include: {@code bank_transfer}.
           */
          public Builder setFundingType(String fundingType) {
            this.fundingType = fundingType;
            return this;
          }
        }

        @Getter
        public static class BankTransfer {
          /** Configuration for eu_bank_transfer funding type. */
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

          /**
           * The bank transfer type that can be used for funding. Permitted values include: {@code
           * eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, {@code
           * mx_bank_transfer}, or {@code us_bank_transfer}.
           */
          @SerializedName("type")
          String type;

          private BankTransfer(
              EuBankTransfer euBankTransfer, Map<String, Object> extraParams, String type) {
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

            private String type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer
                build() {
              return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                  .BankTransfer(this.euBankTransfer, this.extraParams, this.type);
            }

            /** Configuration for eu_bank_transfer funding type. */
            public Builder setEuBankTransfer(
                InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                        .BankTransfer.EuBankTransfer
                    euBankTransfer) {
              this.euBankTransfer = euBankTransfer;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
             * The bank transfer type that can be used for funding. Permitted values include: {@code
             * eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, {@code
             * mx_bank_transfer}, or {@code us_bank_transfer}.
             */
            public Builder setType(String type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          public static class EuBankTransfer {
            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
             * or {@code NL}.
             */
            @SerializedName("country")
            String country;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private EuBankTransfer(String country, Map<String, Object> extraParams) {
              this.country = country;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private String country;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                      .BankTransfer.EuBankTransfer
                  build() {
                return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer.EuBankTransfer(this.country, this.extraParams);
              }

              /**
               * <strong>Required.</strong> The desired country code of the bank account
               * information. Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code
               * FR}, {@code IE}, or {@code NL}.
               */
              public Builder setCountry(String country) {
                this.country = country;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
               * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
          }
        }
      }

      @Getter
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
          public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Konbini build() {
            return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Konbini(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Konbini#extraParams} for the
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
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.Konbini#extraParams} for the
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

        /** Additional fields for Financial Connections Session creation. */
        @SerializedName("financial_connections")
        FinancialConnections financialConnections;

        /** Verification method for the intent. */
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
          public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount build() {
            return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount(
                this.extraParams, this.financialConnections, this.verificationMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount#extraParams} for
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
           * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Additional fields for Financial Connections Session creation. */
          public Builder setFinancialConnections(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections
                  financialConnections) {
            this.financialConnections = financialConnections;
            return this;
          }

          /** Verification method for the intent. */
          public Builder setVerificationMethod(
              InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .VerificationMethod
                  verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
          }
        }

        @Getter
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
           * The list of permissions to request. If this parameter is passed, the {@code
           * payment_method} permission must be included. Valid permissions include: {@code
           * balances}, {@code ownership}, {@code payment_method}, and {@code transactions}.
           */
          @SerializedName("permissions")
          List<
                  InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Permission>
              permissions;

          /** List of data features that you would like to retrieve upon account creation. */
          @SerializedName("prefetch")
          List<
                  InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Prefetch>
              prefetch;

          private FinancialConnections(
              Map<String, Object> extraParams,
              List<
                      InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Permission>
                  permissions,
              List<
                      InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Prefetch>
                  prefetch) {
            this.extraParams = extraParams;
            this.permissions = permissions;
            this.prefetch = prefetch;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<
                    InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission>
                permissions;

            private List<
                    InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch>
                prefetch;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections
                build() {
              return new InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections(this.extraParams, this.permissions, this.prefetch);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
             * Add an element to `permissions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
             * for the field documentation.
             */
            public Builder addPermission(
                InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
             * for the field documentation.
             */
            public Builder addAllPermission(
                List<
                        InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
             * for the field documentation.
             */
            public Builder addPrefetch(
                InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
             * InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
             * for the field documentation.
             */
            public Builder addAllPrefetch(
                List<
                        InvoiceCreateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Prefetch>
                    elements) {
              if (this.prefetch == null) {
                this.prefetch = new ArrayList<>();
              }
              this.prefetch.addAll(elements);
              return this;
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

    public enum PaymentMethodType implements ApiRequestParams.EnumParam {
      @SerializedName("ach_credit_transfer")
      ACH_CREDIT_TRANSFER("ach_credit_transfer"),

      @SerializedName("ach_debit")
      ACH_DEBIT("ach_debit"),

      @SerializedName("acss_debit")
      ACSS_DEBIT("acss_debit"),

      @SerializedName("au_becs_debit")
      AU_BECS_DEBIT("au_becs_debit"),

      @SerializedName("bacs_debit")
      BACS_DEBIT("bacs_debit"),

      @SerializedName("bancontact")
      BANCONTACT("bancontact"),

      @SerializedName("boleto")
      BOLETO("boleto"),

      @SerializedName("card")
      CARD("card"),

      @SerializedName("cashapp")
      CASHAPP("cashapp"),

      @SerializedName("customer_balance")
      CUSTOMER_BALANCE("customer_balance"),

      @SerializedName("eps")
      EPS("eps"),

      @SerializedName("fpx")
      FPX("fpx"),

      @SerializedName("giropay")
      GIROPAY("giropay"),

      @SerializedName("grabpay")
      GRABPAY("grabpay"),

      @SerializedName("ideal")
      IDEAL("ideal"),

      @SerializedName("konbini")
      KONBINI("konbini"),

      @SerializedName("link")
      LINK("link"),

      @SerializedName("p24")
      P24("p24"),

      @SerializedName("paynow")
      PAYNOW("paynow"),

      @SerializedName("paypal")
      PAYPAL("paypal"),

      @SerializedName("promptpay")
      PROMPTPAY("promptpay"),

      @SerializedName("sepa_credit_transfer")
      SEPA_CREDIT_TRANSFER("sepa_credit_transfer"),

      @SerializedName("sepa_debit")
      SEPA_DEBIT("sepa_debit"),

      @SerializedName("sofort")
      SOFORT("sofort"),

      @SerializedName("us_bank_account")
      US_BANK_ACCOUNT("us_bank_account"),

      @SerializedName("wechat_pay")
      WECHAT_PAY("wechat_pay");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PaymentMethodType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Rendering {
    /**
     * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
     * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
     * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code exclude_tax}
     * will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
     */
    @SerializedName("amount_tax_display")
    ApiRequestParams.EnumParam amountTaxDisplay;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Invoice pdf rendering options. */
    @SerializedName("pdf")
    Pdf pdf;

    private Rendering(
        ApiRequestParams.EnumParam amountTaxDisplay, Map<String, Object> extraParams, Pdf pdf) {
      this.amountTaxDisplay = amountTaxDisplay;
      this.extraParams = extraParams;
      this.pdf = pdf;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ApiRequestParams.EnumParam amountTaxDisplay;

      private Map<String, Object> extraParams;

      private Pdf pdf;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceCreateParams.Rendering build() {
        return new InvoiceCreateParams.Rendering(this.amountTaxDisplay, this.extraParams, this.pdf);
      }

      /**
       * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
       * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
       * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code
       * exclude_tax} will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
       */
      public Builder setAmountTaxDisplay(
          InvoiceCreateParams.Rendering.AmountTaxDisplay amountTaxDisplay) {
        this.amountTaxDisplay = amountTaxDisplay;
        return this;
      }

      /**
       * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
       * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
       * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code
       * exclude_tax} will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
       */
      public Builder setAmountTaxDisplay(EmptyParam amountTaxDisplay) {
        this.amountTaxDisplay = amountTaxDisplay;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.Rendering#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.Rendering#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Invoice pdf rendering options. */
      public Builder setPdf(InvoiceCreateParams.Rendering.Pdf pdf) {
        this.pdf = pdf;
        return this;
      }
    }

    @Getter
    public static class Pdf {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Page size for invoice PDF. Can be set to {@code a4}, {@code letter}, or {@code auto}. If
       * set to {@code auto}, invoice PDF page size defaults to {@code a4} for customers with
       * Japanese locale and {@code letter} for customers with other locales.
       */
      @SerializedName("page_size")
      PageSize pageSize;

      private Pdf(Map<String, Object> extraParams, PageSize pageSize) {
        this.extraParams = extraParams;
        this.pageSize = pageSize;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PageSize pageSize;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceCreateParams.Rendering.Pdf build() {
          return new InvoiceCreateParams.Rendering.Pdf(this.extraParams, this.pageSize);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceCreateParams.Rendering.Pdf#extraParams} for the field
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
         * map. See {@link InvoiceCreateParams.Rendering.Pdf#extraParams} for the field
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
         * Page size for invoice PDF. Can be set to {@code a4}, {@code letter}, or {@code auto}. If
         * set to {@code auto}, invoice PDF page size defaults to {@code a4} for customers with
         * Japanese locale and {@code letter} for customers with other locales.
         */
        public Builder setPageSize(InvoiceCreateParams.Rendering.Pdf.PageSize pageSize) {
          this.pageSize = pageSize;
          return this;
        }
      }

      public enum PageSize implements ApiRequestParams.EnumParam {
        @SerializedName("a4")
        A4("a4"),

        @SerializedName("auto")
        AUTO("auto"),

        @SerializedName("letter")
        LETTER("letter");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PageSize(String value) {
          this.value = value;
        }
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

  @Getter
  public static class RenderingOptions {
    /**
     * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
     * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
     * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code exclude_tax}
     * will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
     */
    @SerializedName("amount_tax_display")
    ApiRequestParams.EnumParam amountTaxDisplay;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public InvoiceCreateParams.RenderingOptions build() {
        return new InvoiceCreateParams.RenderingOptions(this.amountTaxDisplay, this.extraParams);
      }

      /**
       * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
       * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
       * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code
       * exclude_tax} will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
       */
      public Builder setAmountTaxDisplay(
          InvoiceCreateParams.RenderingOptions.AmountTaxDisplay amountTaxDisplay) {
        this.amountTaxDisplay = amountTaxDisplay;
        return this;
      }

      /**
       * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
       * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
       * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code
       * exclude_tax} will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
       */
      public Builder setAmountTaxDisplay(EmptyParam amountTaxDisplay) {
        this.amountTaxDisplay = amountTaxDisplay;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.RenderingOptions#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.RenderingOptions#extraParams} for the field documentation.
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

  @Getter
  public static class ShippingCost {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the shipping rate to use for this order. */
    @SerializedName("shipping_rate")
    String shippingRate;

    /** Parameters to create a new ad-hoc shipping rate for this order. */
    @SerializedName("shipping_rate_data")
    ShippingRateData shippingRateData;

    private ShippingCost(
        Map<String, Object> extraParams, String shippingRate, ShippingRateData shippingRateData) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.shippingRateData = shippingRateData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String shippingRate;

      private ShippingRateData shippingRateData;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceCreateParams.ShippingCost build() {
        return new InvoiceCreateParams.ShippingCost(
            this.extraParams, this.shippingRate, this.shippingRateData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.ShippingCost#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.ShippingCost#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the shipping rate to use for this order. */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** Parameters to create a new ad-hoc shipping rate for this order. */
      public Builder setShippingRateData(
          InvoiceCreateParams.ShippingCost.ShippingRateData shippingRateData) {
        this.shippingRateData = shippingRateData;
        return this;
      }
    }

    @Getter
    public static class ShippingRateData {
      /**
       * The estimated range for how long shipping will take, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("delivery_estimate")
      DeliveryEstimate deliveryEstimate;

      /**
       * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
       * customer. This will appear on CheckoutSessions.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Describes a fixed amount to charge for shipping. Must be present if type is {@code
       * fixed_amount}.
       */
      @SerializedName("fixed_amount")
      FixedAmount fixedAmount;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
       * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
       */
      @SerializedName("tax_behavior")
      TaxBehavior taxBehavior;

      /**
       * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
       * code is {@code txcd_92010001}.
       */
      @SerializedName("tax_code")
      String taxCode;

      /**
       * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for
       * now.
       */
      @SerializedName("type")
      Type type;

      private ShippingRateData(
          DeliveryEstimate deliveryEstimate,
          String displayName,
          Map<String, Object> extraParams,
          FixedAmount fixedAmount,
          Map<String, String> metadata,
          TaxBehavior taxBehavior,
          String taxCode,
          Type type) {
        this.deliveryEstimate = deliveryEstimate;
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.fixedAmount = fixedAmount;
        this.metadata = metadata;
        this.taxBehavior = taxBehavior;
        this.taxCode = taxCode;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private DeliveryEstimate deliveryEstimate;

        private String displayName;

        private Map<String, Object> extraParams;

        private FixedAmount fixedAmount;

        private Map<String, String> metadata;

        private TaxBehavior taxBehavior;

        private String taxCode;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceCreateParams.ShippingCost.ShippingRateData build() {
          return new InvoiceCreateParams.ShippingCost.ShippingRateData(
              this.deliveryEstimate,
              this.displayName,
              this.extraParams,
              this.fixedAmount,
              this.metadata,
              this.taxBehavior,
              this.taxCode,
              this.type);
        }

        /**
         * The estimated range for how long shipping will take, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDeliveryEstimate(
            InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate deliveryEstimate) {
          this.deliveryEstimate = deliveryEstimate;
          return this;
        }

        /**
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceCreateParams.ShippingCost.ShippingRateData#extraParams} for the
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
         * map. See {@link InvoiceCreateParams.ShippingCost.ShippingRateData#extraParams} for the
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
         * Describes a fixed amount to charge for shipping. Must be present if type is {@code
         * fixed_amount}.
         */
        public Builder setFixedAmount(
            InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount fixedAmount) {
          this.fixedAmount = fixedAmount;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * InvoiceCreateParams.ShippingCost.ShippingRateData#metadata} for the field documentation.
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
         * map. See {@link InvoiceCreateParams.ShippingCost.ShippingRateData#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /**
         * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of
         * {@code inclusive}, {@code exclusive}, or {@code unspecified}.
         */
        public Builder setTaxBehavior(
            InvoiceCreateParams.ShippingCost.ShippingRateData.TaxBehavior taxBehavior) {
          this.taxBehavior = taxBehavior;
          return this;
        }

        /**
         * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(String taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /**
         * The type of calculation to use on the shipping rate. Can only be {@code fixed_amount} for
         * now.
         */
        public Builder setType(InvoiceCreateParams.ShippingCost.ShippingRateData.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class DeliveryEstimate {
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
         * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
         * infinite.
         */
        @SerializedName("maximum")
        Maximum maximum;

        /** The lower bound of the estimated range. If empty, represents no lower bound. */
        @SerializedName("minimum")
        Minimum minimum;

        private DeliveryEstimate(
            Map<String, Object> extraParams, Maximum maximum, Minimum minimum) {
          this.extraParams = extraParams;
          this.maximum = maximum;
          this.minimum = minimum;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Maximum maximum;

          private Minimum minimum;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate build() {
            return new InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate(
                this.extraParams, this.maximum, this.minimum);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
           * InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
           * The upper bound of the estimated range. If empty, represents no upper bound i.e.,
           * infinite.
           */
          public Builder setMaximum(
              InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum maximum) {
            this.maximum = maximum;
            return this;
          }

          /** The lower bound of the estimated range. If empty, represents no lower bound. */
          public Builder setMinimum(
              InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum minimum) {
            this.minimum = minimum;
            return this;
          }
        }

        @Getter
        public static class Maximum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Maximum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum
                build() {
              return new InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
             * InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        public static class Minimum {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> A unit of time. */
          @SerializedName("unit")
          Unit unit;

          /** <strong>Required.</strong> Must be greater than 0. */
          @SerializedName("value")
          Long value;

          private Minimum(Map<String, Object> extraParams, Unit unit, Long value) {
            this.extraParams = extraParams;
            this.unit = unit;
            this.value = value;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Unit unit;

            private Long value;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum
                build() {
              return new InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
             * InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> A unit of time. */
            public Builder setUnit(
                InvoiceCreateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum.Unit
                    unit) {
              this.unit = unit;
              return this;
            }

            /** <strong>Required.</strong> Must be greater than 0. */
            public Builder setValue(Long value) {
              this.value = value;
              return this;
            }
          }

          public enum Unit implements ApiRequestParams.EnumParam {
            @SerializedName("business_day")
            BUSINESS_DAY("business_day"),

            @SerializedName("day")
            DAY("day"),

            @SerializedName("hour")
            HOUR("hour"),

            @SerializedName("month")
            MONTH("month"),

            @SerializedName("week")
            WEEK("week");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Unit(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class FixedAmount {
        /**
         * <strong>Required.</strong> A non-negative integer in cents representing how much to
         * charge.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * <strong>Required.</strong> Three-letter <a
         * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
         * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * Shipping rates defined in each available currency option. Each key must be a three-letter
         * <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
         * href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency_options")
        Map<String, InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
            currencyOptions;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private FixedAmount(
            Long amount,
            String currency,
            Map<
                    String,
                    InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
                currencyOptions,
            Map<String, Object> extraParams) {
          this.amount = amount;
          this.currency = currency;
          this.currencyOptions = currencyOptions;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String currency;

          private Map<
                  String,
                  InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
              currencyOptions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount build() {
            return new InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount(
                this.amount, this.currency, this.currencyOptions, this.extraParams);
          }

          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
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
           * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putCurrencyOption(
              String key,
              InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption value) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the
           * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
           * original map. See {@link
           * InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putAllCurrencyOption(
              Map<
                      String,
                      InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
                  map) {
            if (this.currencyOptions == null) {
              this.currencyOptions = new HashMap<>();
            }
            this.currencyOptions.putAll(map);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the
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
           * InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the
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
        public static class CurrencyOption {
          /**
           * <strong>Required.</strong> A non-negative integer in cents representing how much to
           * charge.
           */
          @SerializedName("amount")
          Long amount;

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
           * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One
           * of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
           */
          @SerializedName("tax_behavior")
          TaxBehavior taxBehavior;

          private CurrencyOption(
              Long amount, Map<String, Object> extraParams, TaxBehavior taxBehavior) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.taxBehavior = taxBehavior;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private TaxBehavior taxBehavior;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
                build() {
              return new InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount
                  .CurrencyOption(this.amount, this.extraParams, this.taxBehavior);
            }

            /**
             * <strong>Required.</strong> A non-negative integer in cents representing how much to
             * charge.
             */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes.
             * One of {@code inclusive}, {@code exclusive}, or {@code unspecified}.
             */
            public Builder setTaxBehavior(
                InvoiceCreateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
                        .TaxBehavior
                    taxBehavior) {
              this.taxBehavior = taxBehavior;
              return this;
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

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("fixed_amount")
        FIXED_AMOUNT("fixed_amount");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class ShippingDetails {
    /** <strong>Required.</strong> Shipping address */
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

    /** <strong>Required.</strong> Recipient name. */
    @SerializedName("name")
    String name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    Object phone;

    private ShippingDetails(
        Address address, Map<String, Object> extraParams, String name, Object phone) {
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

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceCreateParams.ShippingDetails build() {
        return new InvoiceCreateParams.ShippingDetails(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> Shipping address */
      public Builder setAddress(InvoiceCreateParams.ShippingDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceCreateParams.ShippingDetails#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.ShippingDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(EmptyParam phone) {
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
        public InvoiceCreateParams.ShippingDetails.Address build() {
          return new InvoiceCreateParams.ShippingDetails.Address(
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
         * map. See {@link InvoiceCreateParams.ShippingDetails.Address#extraParams} for the field
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
         * map. See {@link InvoiceCreateParams.ShippingDetails.Address#extraParams} for the field
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
  public static class TransferData {
    /**
     * The amount that will be transferred automatically when the invoice is paid. If no amount is
     * set, the full amount is transferred.
     */
    @SerializedName("amount")
    Long amount;

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

    private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceCreateParams.TransferData build() {
        return new InvoiceCreateParams.TransferData(
            this.amount, this.destination, this.extraParams);
      }

      /**
       * The amount that will be transferred automatically when the invoice is paid. If no amount is
       * set, the full amount is transferred.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
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
       * InvoiceCreateParams.TransferData#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceCreateParams.TransferData#extraParams} for the field documentation.
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

  public enum PendingInvoiceItemsBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("exclude")
    EXCLUDE("exclude"),

    @SerializedName("include")
    INCLUDE("include"),

    @SerializedName("include_and_require")
    INCLUDE_AND_REQUIRE("include_and_require");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PendingInvoiceItemsBehavior(String value) {
      this.value = value;
    }
  }
}

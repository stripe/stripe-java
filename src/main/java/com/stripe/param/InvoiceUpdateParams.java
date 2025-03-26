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
public class InvoiceUpdateParams extends ApiRequestParams {
  /** The account tax IDs associated with the invoice. Only editable when the invoice is a draft. */
  @SerializedName("account_tax_ids")
  Object accountTaxIds;

  /**
   * List of expected payments and corresponding due dates. Valid only for invoices where {@code
   * collection_method=send_invoice}.
   */
  @SerializedName("amounts_due")
  Object amountsDue;

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
   * collection</a> of the invoice.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /** Settings for automatic tax lookup for this invoice. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * The time when this invoice should be scheduled to finalize. The invoice will be finalized at
   * this time if it is still in draft state. To turn off automatic finalization, set {@code
   * auto_advance} to false.
   */
  @SerializedName("automatically_finalizes_at")
  Long automaticallyFinalizesAt;

  /**
   * Either {@code charge_automatically} or {@code send_invoice}. This field can be updated only on
   * {@code draft} invoices.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /**
   * A list of up to 4 custom fields to be displayed on the invoice. If a value for {@code
   * custom_fields} is specified, the list specified will replace the existing custom field list on
   * this invoice. Pass an empty string to remove previously-defined fields.
   */
  @SerializedName("custom_fields")
  Object customFields;

  /**
   * The number of days from which the invoice is created until it is due. Only valid for invoices
   * where {@code collection_method=send_invoice}. This field can only be updated on {@code draft}
   * invoices.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * The ids of the margins to apply to the invoice. Can be overridden by line item {@code margins}.
   */
  @SerializedName("default_margins")
  Object defaultMargins;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  Object defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  Object defaultSource;

  /**
   * The tax rates that will apply to any line item that does not have {@code tax_rates} set. Pass
   * an empty string to remove previously-defined tax rates.
   */
  @SerializedName("default_tax_rates")
  Object defaultTaxRates;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. Referenced as
   * 'memo' in the Dashboard.
   */
  @SerializedName("description")
  Object description;

  /**
   * The discounts that will apply to the invoice. Pass an empty string to remove previously-defined
   * discounts.
   */
  @SerializedName("discounts")
  Object discounts;

  /**
   * The date on which payment for this invoice is due. Only valid for invoices where {@code
   * collection_method=send_invoice}. This field can only be updated on {@code draft} invoices.
   */
  @SerializedName("due_date")
  Long dueDate;

  /**
   * The date when this invoice is in effect. Same as {@code finalized_at} unless overwritten. When
   * defined, this value replaces the system-generated 'Date of issue' printed on the invoice PDF
   * and receipt.
   */
  @SerializedName("effective_at")
  Object effectiveAt;

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
  Object footer;

  /**
   * The connected account that issues the invoice. The invoice is presented with the branding and
   * support information of the specified account.
   */
  @SerializedName("issuer")
  Issuer issuer;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Set the number for this invoice. If no number is present then a number will be assigned
   * automatically when the invoice is finalized. In many markets, regulations require invoices to
   * be unique, sequential and / or gapless. You are responsible for ensuring this is true across
   * all your different invoicing systems in the event that you edit the invoice number using our
   * API. If you use only Stripe for your invoices and do not change invoice numbers, Stripe handles
   * this aspect of compliance for you automatically.
   */
  @SerializedName("number")
  Object number;

  /**
   * The account (if any) for which the funds of the invoice payment are intended. If set, the
   * invoice will be presented with the branding and support information of the specified account.
   * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
   * documentation for details.
   */
  @SerializedName("on_behalf_of")
  Object onBehalfOf;

  /**
   * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
   */
  @SerializedName("payment_settings")
  PaymentSettings paymentSettings;

  /**
   * The rendering-related settings that control how the invoice is displayed on customer-facing
   * surfaces such as PDF and Hosted Invoice Page.
   */
  @SerializedName("rendering")
  Rendering rendering;

  /** Settings for the cost of shipping for this invoice. */
  @SerializedName("shipping_cost")
  Object shippingCost;

  /**
   * Shipping details for the invoice. The Invoice PDF will use the {@code shipping_details} value
   * if it is set, otherwise the PDF will render the shipping address from the customer.
   */
  @SerializedName("shipping_details")
  Object shippingDetails;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * {@code statement_descriptor} will be set to the first subscription item's product's {@code
   * statement_descriptor}.
   */
  @SerializedName("statement_descriptor")
  Object statementDescriptor;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge. This will be unset if you POST an
   * empty value.
   */
  @SerializedName("transfer_data")
  Object transferData;

  private InvoiceUpdateParams(
      Object accountTaxIds,
      Object amountsDue,
      Long applicationFeeAmount,
      Boolean autoAdvance,
      AutomaticTax automaticTax,
      Long automaticallyFinalizesAt,
      CollectionMethod collectionMethod,
      Object customFields,
      Long daysUntilDue,
      Object defaultMargins,
      Object defaultPaymentMethod,
      Object defaultSource,
      Object defaultTaxRates,
      Object description,
      Object discounts,
      Long dueDate,
      Object effectiveAt,
      List<String> expand,
      Map<String, Object> extraParams,
      Object footer,
      Issuer issuer,
      Object metadata,
      Object number,
      Object onBehalfOf,
      PaymentSettings paymentSettings,
      Rendering rendering,
      Object shippingCost,
      Object shippingDetails,
      Object statementDescriptor,
      Object transferData) {
    this.accountTaxIds = accountTaxIds;
    this.amountsDue = amountsDue;
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.automaticTax = automaticTax;
    this.automaticallyFinalizesAt = automaticallyFinalizesAt;
    this.collectionMethod = collectionMethod;
    this.customFields = customFields;
    this.daysUntilDue = daysUntilDue;
    this.defaultMargins = defaultMargins;
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
    this.issuer = issuer;
    this.metadata = metadata;
    this.number = number;
    this.onBehalfOf = onBehalfOf;
    this.paymentSettings = paymentSettings;
    this.rendering = rendering;
    this.shippingCost = shippingCost;
    this.shippingDetails = shippingDetails;
    this.statementDescriptor = statementDescriptor;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object accountTaxIds;

    private Object amountsDue;

    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private AutomaticTax automaticTax;

    private Long automaticallyFinalizesAt;

    private CollectionMethod collectionMethod;

    private Object customFields;

    private Long daysUntilDue;

    private Object defaultMargins;

    private Object defaultPaymentMethod;

    private Object defaultSource;

    private Object defaultTaxRates;

    private Object description;

    private Object discounts;

    private Long dueDate;

    private Object effectiveAt;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object footer;

    private Issuer issuer;

    private Object metadata;

    private Object number;

    private Object onBehalfOf;

    private PaymentSettings paymentSettings;

    private Rendering rendering;

    private Object shippingCost;

    private Object shippingDetails;

    private Object statementDescriptor;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceUpdateParams build() {
      return new InvoiceUpdateParams(
          this.accountTaxIds,
          this.amountsDue,
          this.applicationFeeAmount,
          this.autoAdvance,
          this.automaticTax,
          this.automaticallyFinalizesAt,
          this.collectionMethod,
          this.customFields,
          this.daysUntilDue,
          this.defaultMargins,
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
          this.issuer,
          this.metadata,
          this.number,
          this.onBehalfOf,
          this.paymentSettings,
          this.rendering,
          this.shippingCost,
          this.shippingDetails,
          this.statementDescriptor,
          this.transferData);
    }

    /**
     * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#accountTaxIds} for the field documentation.
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
     * InvoiceUpdateParams#accountTaxIds} for the field documentation.
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
     * Add an element to `amountsDue` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#amountsDue} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAmountsDue(InvoiceUpdateParams.AmountsDue element) {
      if (this.amountsDue == null || this.amountsDue instanceof EmptyParam) {
        this.amountsDue = new ArrayList<InvoiceUpdateParams.AmountsDue>();
      }
      ((List<InvoiceUpdateParams.AmountsDue>) this.amountsDue).add(element);
      return this;
    }

    /**
     * Add all elements to `amountsDue` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#amountsDue} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllAmountsDue(List<InvoiceUpdateParams.AmountsDue> elements) {
      if (this.amountsDue == null || this.amountsDue instanceof EmptyParam) {
        this.amountsDue = new ArrayList<InvoiceUpdateParams.AmountsDue>();
      }
      ((List<InvoiceUpdateParams.AmountsDue>) this.amountsDue).addAll(elements);
      return this;
    }

    /**
     * List of expected payments and corresponding due dates. Valid only for invoices where {@code
     * collection_method=send_invoice}.
     */
    public Builder setAmountsDue(EmptyParam amountsDue) {
      this.amountsDue = amountsDue;
      return this;
    }

    /**
     * List of expected payments and corresponding due dates. Valid only for invoices where {@code
     * collection_method=send_invoice}.
     */
    public Builder setAmountsDue(List<InvoiceUpdateParams.AmountsDue> amountsDue) {
      this.amountsDue = amountsDue;
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
     * collection</a> of the invoice.
     */
    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /** Settings for automatic tax lookup for this invoice. */
    public Builder setAutomaticTax(InvoiceUpdateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /**
     * The time when this invoice should be scheduled to finalize. The invoice will be finalized at
     * this time if it is still in draft state. To turn off automatic finalization, set {@code
     * auto_advance} to false.
     */
    public Builder setAutomaticallyFinalizesAt(Long automaticallyFinalizesAt) {
      this.automaticallyFinalizesAt = automaticallyFinalizesAt;
      return this;
    }

    /**
     * Either {@code charge_automatically} or {@code send_invoice}. This field can be updated only
     * on {@code draft} invoices.
     */
    public Builder setCollectionMethod(InvoiceUpdateParams.CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addCustomField(InvoiceUpdateParams.CustomField element) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceUpdateParams.CustomField>();
      }
      ((List<InvoiceUpdateParams.CustomField>) this.customFields).add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllCustomField(List<InvoiceUpdateParams.CustomField> elements) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<InvoiceUpdateParams.CustomField>();
      }
      ((List<InvoiceUpdateParams.CustomField>) this.customFields).addAll(elements);
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for {@code
     * custom_fields} is specified, the list specified will replace the existing custom field list
     * on this invoice. Pass an empty string to remove previously-defined fields.
     */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for {@code
     * custom_fields} is specified, the list specified will replace the existing custom field list
     * on this invoice. Pass an empty string to remove previously-defined fields.
     */
    public Builder setCustomFields(List<InvoiceUpdateParams.CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * The number of days from which the invoice is created until it is due. Only valid for invoices
     * where {@code collection_method=send_invoice}. This field can only be updated on {@code draft}
     * invoices.
     */
    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * Add an element to `defaultMargins` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#defaultMargins} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDefaultMargin(String element) {
      if (this.defaultMargins == null || this.defaultMargins instanceof EmptyParam) {
        this.defaultMargins = new ArrayList<String>();
      }
      ((List<String>) this.defaultMargins).add(element);
      return this;
    }

    /**
     * Add all elements to `defaultMargins` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#defaultMargins} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDefaultMargin(List<String> elements) {
      if (this.defaultMargins == null || this.defaultMargins instanceof EmptyParam) {
        this.defaultMargins = new ArrayList<String>();
      }
      ((List<String>) this.defaultMargins).addAll(elements);
      return this;
    }

    /**
     * The ids of the margins to apply to the invoice. Can be overridden by line item {@code
     * margins}.
     */
    public Builder setDefaultMargins(EmptyParam defaultMargins) {
      this.defaultMargins = defaultMargins;
      return this;
    }

    /**
     * The ids of the margins to apply to the invoice. Can be overridden by line item {@code
     * margins}.
     */
    public Builder setDefaultMargins(List<String> defaultMargins) {
      this.defaultMargins = defaultMargins;
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
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
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
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public Builder setDefaultSource(EmptyParam defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Add an element to `defaultTaxRates` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#defaultTaxRates} for the field documentation.
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
     * InvoiceUpdateParams#defaultTaxRates} for the field documentation.
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
     * The tax rates that will apply to any line item that does not have {@code tax_rates} set. Pass
     * an empty string to remove previously-defined tax rates.
     */
    public Builder setDefaultTaxRates(EmptyParam defaultTaxRates) {
      this.defaultTaxRates = defaultTaxRates;
      return this;
    }

    /**
     * The tax rates that will apply to any line item that does not have {@code tax_rates} set. Pass
     * an empty string to remove previously-defined tax rates.
     */
    public Builder setDefaultTaxRates(List<String> defaultTaxRates) {
      this.defaultTaxRates = defaultTaxRates;
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
     * An arbitrary string attached to the object. Often useful for displaying to users. Referenced
     * as 'memo' in the Dashboard.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addDiscount(InvoiceUpdateParams.Discount element) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceUpdateParams.Discount>();
      }
      ((List<InvoiceUpdateParams.Discount>) this.discounts).add(element);
      return this;
    }

    /**
     * Add all elements to `discounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#discounts} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllDiscount(List<InvoiceUpdateParams.Discount> elements) {
      if (this.discounts == null || this.discounts instanceof EmptyParam) {
        this.discounts = new ArrayList<InvoiceUpdateParams.Discount>();
      }
      ((List<InvoiceUpdateParams.Discount>) this.discounts).addAll(elements);
      return this;
    }

    /**
     * The discounts that will apply to the invoice. Pass an empty string to remove
     * previously-defined discounts.
     */
    public Builder setDiscounts(EmptyParam discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The discounts that will apply to the invoice. Pass an empty string to remove
     * previously-defined discounts.
     */
    public Builder setDiscounts(List<InvoiceUpdateParams.Discount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Only valid for invoices where {@code
     * collection_method=send_invoice}. This field can only be updated on {@code draft} invoices.
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
     * The date when this invoice is in effect. Same as {@code finalized_at} unless overwritten.
     * When defined, this value replaces the system-generated 'Date of issue' printed on the invoice
     * PDF and receipt.
     */
    public Builder setEffectiveAt(EmptyParam effectiveAt) {
      this.effectiveAt = effectiveAt;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#expand} for the field documentation.
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
     * InvoiceUpdateParams#expand} for the field documentation.
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
     * InvoiceUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link InvoiceUpdateParams#extraParams} for the field documentation.
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

    /** Footer to be displayed on the invoice. */
    public Builder setFooter(EmptyParam footer) {
      this.footer = footer;
      return this;
    }

    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and
     * support information of the specified account.
     */
    public Builder setIssuer(InvoiceUpdateParams.Issuer issuer) {
      this.issuer = issuer;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceUpdateParams#metadata} for the field documentation.
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
     * See {@link InvoiceUpdateParams#metadata} for the field documentation.
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
     * Set the number for this invoice. If no number is present then a number will be assigned
     * automatically when the invoice is finalized. In many markets, regulations require invoices to
     * be unique, sequential and / or gapless. You are responsible for ensuring this is true across
     * all your different invoicing systems in the event that you edit the invoice number using our
     * API. If you use only Stripe for your invoices and do not change invoice numbers, Stripe
     * handles this aspect of compliance for you automatically.
     */
    public Builder setNumber(String number) {
      this.number = number;
      return this;
    }

    /**
     * Set the number for this invoice. If no number is present then a number will be assigned
     * automatically when the invoice is finalized. In many markets, regulations require invoices to
     * be unique, sequential and / or gapless. You are responsible for ensuring this is true across
     * all your different invoicing systems in the event that you edit the invoice number using our
     * API. If you use only Stripe for your invoices and do not change invoice numbers, Stripe
     * handles this aspect of compliance for you automatically.
     */
    public Builder setNumber(EmptyParam number) {
      this.number = number;
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
     * The account (if any) for which the funds of the invoice payment are intended. If set, the
     * invoice will be presented with the branding and support information of the specified account.
     * See the <a href="https://stripe.com/docs/billing/invoices/connect">Invoices with Connect</a>
     * documentation for details.
     */
    public Builder setOnBehalfOf(EmptyParam onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * Configuration settings for the PaymentIntent that is generated when the invoice is finalized.
     */
    public Builder setPaymentSettings(InvoiceUpdateParams.PaymentSettings paymentSettings) {
      this.paymentSettings = paymentSettings;
      return this;
    }

    /**
     * The rendering-related settings that control how the invoice is displayed on customer-facing
     * surfaces such as PDF and Hosted Invoice Page.
     */
    public Builder setRendering(InvoiceUpdateParams.Rendering rendering) {
      this.rendering = rendering;
      return this;
    }

    /** Settings for the cost of shipping for this invoice. */
    public Builder setShippingCost(InvoiceUpdateParams.ShippingCost shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /** Settings for the cost of shipping for this invoice. */
    public Builder setShippingCost(EmptyParam shippingCost) {
      this.shippingCost = shippingCost;
      return this;
    }

    /**
     * Shipping details for the invoice. The Invoice PDF will use the {@code shipping_details} value
     * if it is set, otherwise the PDF will render the shipping address from the customer.
     */
    public Builder setShippingDetails(InvoiceUpdateParams.ShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }

    /**
     * Shipping details for the invoice. The Invoice PDF will use the {@code shipping_details} value
     * if it is set, otherwise the PDF will render the shipping address from the customer.
     */
    public Builder setShippingDetails(EmptyParam shippingDetails) {
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
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * {@code statement_descriptor} will be set to the first subscription item's product's {@code
     * statement_descriptor}.
     */
    public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(InvoiceUpdateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(EmptyParam transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountsDue {
    /** <strong>Required.</strong> The amount in cents (or local equivalent). */
    @SerializedName("amount")
    Long amount;

    /** Number of days from when invoice is finalized until the payment is due. */
    @SerializedName("days_until_due")
    Long daysUntilDue;

    /**
     * <strong>Required.</strong> An arbitrary string attached to the object. Often useful for
     * displaying to users.
     */
    @SerializedName("description")
    Object description;

    /** Date on which a payment plan’s payment is due. */
    @SerializedName("due_date")
    Long dueDate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AmountsDue(
        Long amount,
        Long daysUntilDue,
        Object description,
        Long dueDate,
        Map<String, Object> extraParams) {
      this.amount = amount;
      this.daysUntilDue = daysUntilDue;
      this.description = description;
      this.dueDate = dueDate;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Long daysUntilDue;

      private Object description;

      private Long dueDate;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpdateParams.AmountsDue build() {
        return new InvoiceUpdateParams.AmountsDue(
            this.amount, this.daysUntilDue, this.description, this.dueDate, this.extraParams);
      }

      /** <strong>Required.</strong> The amount in cents (or local equivalent). */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** Number of days from when invoice is finalized until the payment is due. */
      public Builder setDaysUntilDue(Long daysUntilDue) {
        this.daysUntilDue = daysUntilDue;
        return this;
      }

      /**
       * <strong>Required.</strong> An arbitrary string attached to the object. Often useful for
       * displaying to users.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * <strong>Required.</strong> An arbitrary string attached to the object. Often useful for
       * displaying to users.
       */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /** Date on which a payment plan’s payment is due. */
      public Builder setDueDate(Long dueDate) {
        this.dueDate = dueDate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.AmountsDue#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.AmountsDue#extraParams} for the field documentation.
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
      public InvoiceUpdateParams.AutomaticTax build() {
        return new InvoiceUpdateParams.AutomaticTax(this.enabled, this.extraParams, this.liability);
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
       * InvoiceUpdateParams.AutomaticTax#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
      public Builder setLiability(InvoiceUpdateParams.AutomaticTax.Liability liability) {
        this.liability = liability;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public InvoiceUpdateParams.AutomaticTax.Liability build() {
          return new InvoiceUpdateParams.AutomaticTax.Liability(
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
         * map. See {@link InvoiceUpdateParams.AutomaticTax.Liability#extraParams} for the field
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
         * map. See {@link InvoiceUpdateParams.AutomaticTax.Liability#extraParams} for the field
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
        public Builder setType(InvoiceUpdateParams.AutomaticTax.Liability.Type type) {
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
  public static class CustomField {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The name of the custom field. This may be up to 40 characters. */
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
      public InvoiceUpdateParams.CustomField build() {
        return new InvoiceUpdateParams.CustomField(this.extraParams, this.name, this.value);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.CustomField#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.CustomField#extraParams} for the field documentation.
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
       * <strong>Required.</strong> The value of the custom field. This may be up to 140 characters.
       */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }

      /**
       * <strong>Required.</strong> The value of the custom field. This may be up to 140 characters.
       */
      public Builder setValue(EmptyParam value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
      public InvoiceUpdateParams.Discount build() {
        return new InvoiceUpdateParams.Discount(
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
      public Builder setDiscountEnd(InvoiceUpdateParams.Discount.DiscountEnd discountEnd) {
        this.discountEnd = discountEnd;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.Discount#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.Discount#extraParams} for the field documentation.
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
        public InvoiceUpdateParams.Discount.DiscountEnd build() {
          return new InvoiceUpdateParams.Discount.DiscountEnd(
              this.duration, this.extraParams, this.timestamp, this.type);
        }

        /** Time span for the redeemed discount. */
        public Builder setDuration(InvoiceUpdateParams.Discount.DiscountEnd.Duration duration) {
          this.duration = duration;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpdateParams.Discount.DiscountEnd#extraParams} for the field
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
         * map. See {@link InvoiceUpdateParams.Discount.DiscountEnd#extraParams} for the field
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
        public Builder setType(InvoiceUpdateParams.Discount.DiscountEnd.Type type) {
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
          public InvoiceUpdateParams.Discount.DiscountEnd.Duration build() {
            return new InvoiceUpdateParams.Discount.DiscountEnd.Duration(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link InvoiceUpdateParams.Discount.DiscountEnd.Duration#extraParams} for the
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
           * map. See {@link InvoiceUpdateParams.Discount.DiscountEnd.Duration#extraParams} for the
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
              InvoiceUpdateParams.Discount.DiscountEnd.Duration.Interval interval) {
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
  public static class Issuer {
    /** The connected account being referenced when {@code type} is {@code account}. */
    @SerializedName("account")
    Object account;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
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
      public InvoiceUpdateParams.Issuer build() {
        return new InvoiceUpdateParams.Issuer(this.account, this.extraParams, this.type);
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.Issuer#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.Issuer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      public Builder setType(InvoiceUpdateParams.Issuer.Type type) {
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
     * Should not be specified with payment_method_configuration
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
      public InvoiceUpdateParams.PaymentSettings build() {
        return new InvoiceUpdateParams.PaymentSettings(
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
       * InvoiceUpdateParams.PaymentSettings#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.PaymentSettings#extraParams} for the field documentation.
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
          InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions paymentMethodOptions) {
        this.paymentMethodOptions = paymentMethodOptions;
        return this;
      }

      /**
       * Add an element to `paymentMethodTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link InvoiceUpdateParams.PaymentSettings#paymentMethodTypes} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addPaymentMethodType(
          InvoiceUpdateParams.PaymentSettings.PaymentMethodType element) {
        if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
          this.paymentMethodTypes =
              new ArrayList<InvoiceUpdateParams.PaymentSettings.PaymentMethodType>();
        }
        ((List<InvoiceUpdateParams.PaymentSettings.PaymentMethodType>) this.paymentMethodTypes)
            .add(element);
        return this;
      }

      /**
       * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link InvoiceUpdateParams.PaymentSettings#paymentMethodTypes} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllPaymentMethodType(
          List<InvoiceUpdateParams.PaymentSettings.PaymentMethodType> elements) {
        if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
          this.paymentMethodTypes =
              new ArrayList<InvoiceUpdateParams.PaymentSettings.PaymentMethodType>();
        }
        ((List<InvoiceUpdateParams.PaymentSettings.PaymentMethodType>) this.paymentMethodTypes)
            .addAll(elements);
        return this;
      }

      /**
       * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If
       * not set, Stripe attempts to automatically determine the types to use by looking at the
       * invoice’s default payment method, the subscription’s default payment method, the customer’s
       * default payment method, and your <a
       * href="https://dashboard.stripe.com/settings/billing/invoice">invoice template settings</a>.
       * Should not be specified with payment_method_configuration
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
       * Should not be specified with payment_method_configuration
       */
      public Builder setPaymentMethodTypes(
          List<InvoiceUpdateParams.PaymentSettings.PaymentMethodType> paymentMethodTypes) {
        this.paymentMethodTypes = paymentMethodTypes;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
       * If paying by {@code id_bank_transfer}, this sub-hash contains details about the Indonesia
       * bank transfer payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("id_bank_transfer")
      Object idBankTransfer;

      /**
       * If paying by {@code konbini}, this sub-hash contains details about the Konbini payment
       * method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("konbini")
      Object konbini;

      /**
       * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Direct Debit
       * payment method options to pass to the invoice’s PaymentIntent.
       */
      @SerializedName("sepa_debit")
      Object sepaDebit;

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
          Object idBankTransfer,
          Object konbini,
          Object sepaDebit,
          Object usBankAccount) {
        this.acssDebit = acssDebit;
        this.bancontact = bancontact;
        this.card = card;
        this.customerBalance = customerBalance;
        this.extraParams = extraParams;
        this.idBankTransfer = idBankTransfer;
        this.konbini = konbini;
        this.sepaDebit = sepaDebit;
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

        private Object idBankTransfer;

        private Object konbini;

        private Object sepaDebit;

        private Object usBankAccount;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions build() {
          return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions(
              this.acssDebit,
              this.bancontact,
              this.card,
              this.customerBalance,
              this.extraParams,
              this.idBankTransfer,
              this.konbini,
              this.sepaDebit,
              this.usBankAccount);
        }

        /**
         * If paying by {@code acss_debit}, this sub-hash contains details about the Canadian
         * pre-authorized debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setAcssDebit(
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit acssDebit) {
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
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Bancontact bancontact) {
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
        public Builder setCard(InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card card) {
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
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
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
         * map. See {@link InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions#extraParams} for
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
         * map. See {@link InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions#extraParams} for
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
         * If paying by {@code id_bank_transfer}, this sub-hash contains details about the Indonesia
         * bank transfer payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setIdBankTransfer(
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.IdBankTransfer
                idBankTransfer) {
          this.idBankTransfer = idBankTransfer;
          return this;
        }

        /**
         * If paying by {@code id_bank_transfer}, this sub-hash contains details about the Indonesia
         * bank transfer payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setIdBankTransfer(EmptyParam idBankTransfer) {
          this.idBankTransfer = idBankTransfer;
          return this;
        }

        /**
         * If paying by {@code konbini}, this sub-hash contains details about the Konbini payment
         * method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setKonbini(
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Konbini konbini) {
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
         * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Direct
         * Debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setSepaDebit(
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.SepaDebit sepaDebit) {
          this.sepaDebit = sepaDebit;
          return this;
        }

        /**
         * If paying by {@code sepa_debit}, this sub-hash contains details about the SEPA Direct
         * Debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setSepaDebit(EmptyParam sepaDebit) {
          this.sepaDebit = sepaDebit;
          return this;
        }

        /**
         * If paying by {@code us_bank_account}, this sub-hash contains details about the ACH direct
         * debit payment method options to pass to the invoice’s PaymentIntent.
         */
        public Builder setUsBankAccount(
            InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount usBankAccount) {
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
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit(
                this.extraParams, this.mandateOptions, this.verificationMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit#extraParams} for the
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit#extraParams} for the
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
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                  mandateOptions) {
            this.mandateOptions = mandateOptions;
            return this;
          }

          /** Verification method for the intent. */
          public Builder setVerificationMethod(
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.VerificationMethod
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
            public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions
                build() {
              return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit
                  .MandateOptions(this.extraParams, this.transactionType);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
                InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.AcssDebit.MandateOptions
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
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Bancontact build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Bancontact(
                this.extraParams, this.preferredLanguage);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Bancontact#extraParams} for
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Bancontact#extraParams} for
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
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Bancontact.PreferredLanguage
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
         * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
         * requesting 3D Secure</a> for more information on how this configuration interacts with
         * Radar and our SCA Engine.
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
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card(
                this.extraParams, this.installments, this.requestThreeDSecure);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card#extraParams} for the
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card#extraParams} for the
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
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments
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
           * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
           * requesting 3D Secure</a> for more information on how this configuration interacts with
           * Radar and our SCA Engine.
           */
          public Builder setRequestThreeDSecure(
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.RequestThreeDSecure
                  requestThreeDSecure) {
            this.requestThreeDSecure = requestThreeDSecure;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments
                build() {
              return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments(
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments#extraParams}
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments#extraParams}
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
                InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
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
          @EqualsAndHashCode(callSuper = false)
          public static class Plan {
            /**
             * For {@code fixed_count} installment plans, this is required. It represents the number
             * of installment payments your customer will make to their credit card.
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
             * For {@code fixed_count} installment plans, this is required. It represents the
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
              public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
                  build() {
                return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card
                    .Installments.Plan(this.count, this.extraParams, this.interval, this.type);
              }

              /**
               * For {@code fixed_count} installment plans, this is required. It represents the
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
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
               * For {@code fixed_count} installment plans, this is required. It represents the
               * interval between installment payments your customer will make to their credit card.
               * One of {@code month}.
               */
              public Builder setInterval(
                  InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
                          .Interval
                      interval) {
                this.interval = interval;
                return this;
              }

              /**
               * <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}.
               */
              public Builder setType(
                  InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Card.Installments.Plan
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
         * balance. Permitted values include: {@code bank_transfer}.
         */
        @SerializedName("funding_type")
        Object fundingType;

        private CustomerBalance(
            BankTransfer bankTransfer, Map<String, Object> extraParams, Object fundingType) {
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

          private Object fundingType;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance(
                this.bankTransfer, this.extraParams, this.fundingType);
          }

          /**
           * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
           * {@code bank_transfer}.
           */
          public Builder setBankTransfer(
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer
                  bankTransfer) {
            this.bankTransfer = bankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance#extraParams}
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance#extraParams}
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

          /**
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Permitted values include: {@code bank_transfer}.
           */
          public Builder setFundingType(EmptyParam fundingType) {
            this.fundingType = fundingType;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
          Object type;

          private BankTransfer(
              EuBankTransfer euBankTransfer, Map<String, Object> extraParams, Object type) {
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

            private Object type;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                    .BankTransfer
                build() {
              return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                  .BankTransfer(this.euBankTransfer, this.extraParams, this.type);
            }

            /** Configuration for eu_bank_transfer funding type. */
            public Builder setEuBankTransfer(
                InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                        .BankTransfer.EuBankTransfer
                    euBankTransfer) {
              this.euBankTransfer = euBankTransfer;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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

            /**
             * The bank transfer type that can be used for funding. Permitted values include: {@code
             * eu_bank_transfer}, {@code gb_bank_transfer}, {@code jp_bank_transfer}, {@code
             * mx_bank_transfer}, or {@code us_bank_transfer}.
             */
            public Builder setType(EmptyParam type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class EuBankTransfer {
            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
             * or {@code NL}.
             */
            @SerializedName("country")
            Object country;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private EuBankTransfer(Object country, Map<String, Object> extraParams) {
              this.country = country;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Object country;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
                      .BankTransfer.EuBankTransfer
                  build() {
                return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance
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
               * <strong>Required.</strong> The desired country code of the bank account
               * information. Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code
               * FR}, {@code IE}, or {@code NL}.
               */
              public Builder setCountry(EmptyParam country) {
                this.country = country;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
      @EqualsAndHashCode(callSuper = false)
      public static class IdBankTransfer {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private IdBankTransfer(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.IdBankTransfer build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.IdBankTransfer(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.IdBankTransfer#extraParams}
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.IdBankTransfer#extraParams}
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
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Konbini build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Konbini(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Konbini#extraParams} for the
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.Konbini#extraParams} for the
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
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.SepaDebit build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.SepaDebit(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.SepaDebit#extraParams} for the
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.SepaDebit#extraParams} for the
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
          public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount build() {
            return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount(
                this.extraParams, this.financialConnections, this.verificationMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount#extraParams} for
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
           * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount#extraParams} for
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
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections
                  financialConnections) {
            this.financialConnections = financialConnections;
            return this;
          }

          /** Verification method for the intent. */
          public Builder setVerificationMethod(
              InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
           * payment_method} permission must be included. Valid permissions include: {@code
           * balances}, {@code ownership}, {@code payment_method}, and {@code transactions}.
           */
          @SerializedName("permissions")
          List<
                  InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Permission>
              permissions;

          /** List of data features that you would like to retrieve upon account creation. */
          @SerializedName("prefetch")
          List<
                  InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Prefetch>
              prefetch;

          private FinancialConnections(
              Map<String, Object> extraParams,
              Filters filters,
              List<
                      InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Permission>
                  permissions,
              List<
                      InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
                    InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission>
                permissions;

            private List<
                    InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch>
                prefetch;

            /** Finalize and obtain parameter instance from this builder. */
            public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections
                build() {
              return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections(
                  this.extraParams, this.filters, this.permissions, this.prefetch);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
                InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Filters
                    filters) {
              this.filters = filters;
              return this;
            }

            /**
             * Add an element to `permissions` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
             * for the field documentation.
             */
            public Builder addPermission(
                InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
             * for the field documentation.
             */
            public Builder addAllPermission(
                List<
                        InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
             * for the field documentation.
             */
            public Builder addPrefetch(
                InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
             * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
             * for the field documentation.
             */
            public Builder addAllPrefetch(
                List<
                        InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
            /**
             * The account subcategories to use to filter for selectable accounts. Valid
             * subcategories are {@code checking} and {@code savings}.
             */
            @SerializedName("account_subcategories")
            List<
                    InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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

            /** ID of the institution to use to filter for selectable accounts. */
            @SerializedName("institution")
            Object institution;

            private Filters(
                List<
                        InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Filters.AccountSubcategory>
                    accountSubcategories,
                Map<String, Object> extraParams,
                Object institution) {
              this.accountSubcategories = accountSubcategories;
              this.extraParams = extraParams;
              this.institution = institution;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private List<
                      InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Filters.AccountSubcategory>
                  accountSubcategories;

              private Map<String, Object> extraParams;

              private Object institution;

              /** Finalize and obtain parameter instance from this builder. */
              public InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Filters
                  build() {
                return new InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections.Filters(
                    this.accountSubcategories, this.extraParams, this.institution);
              }

              /**
               * Add an element to `accountSubcategories` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
               * for the field documentation.
               */
              public Builder addAccountSubcategory(
                  InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
               * for the field documentation.
               */
              public Builder addAllAccountSubcategory(
                  List<
                          InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount
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
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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
               * InvoiceUpdateParams.PaymentSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** ID of the institution to use to filter for selectable accounts. */
              public Builder setInstitution(String institution) {
                this.institution = institution;
                return this;
              }

              /** ID of the institution to use to filter for selectable accounts. */
              public Builder setInstitution(EmptyParam institution) {
                this.institution = institution;
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

            @SerializedName("inferred_balances")
            INFERRED_BALANCES("inferred_balances"),

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

    public enum PaymentMethodType implements ApiRequestParams.EnumParam {
      @SerializedName("ach_credit_transfer")
      ACH_CREDIT_TRANSFER("ach_credit_transfer"),

      @SerializedName("ach_debit")
      ACH_DEBIT("ach_debit"),

      @SerializedName("acss_debit")
      ACSS_DEBIT("acss_debit"),

      @SerializedName("amazon_pay")
      AMAZON_PAY("amazon_pay"),

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

      @SerializedName("custom")
      CUSTOM("custom"),

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

      @SerializedName("id_bank_transfer")
      ID_BANK_TRANSFER("id_bank_transfer"),

      @SerializedName("ideal")
      IDEAL("ideal"),

      @SerializedName("jp_credit_transfer")
      JP_CREDIT_TRANSFER("jp_credit_transfer"),

      @SerializedName("kakao_pay")
      KAKAO_PAY("kakao_pay"),

      @SerializedName("klarna")
      KLARNA("klarna"),

      @SerializedName("konbini")
      KONBINI("konbini"),

      @SerializedName("kr_card")
      KR_CARD("kr_card"),

      @SerializedName("link")
      LINK("link"),

      @SerializedName("multibanco")
      MULTIBANCO("multibanco"),

      @SerializedName("naver_pay")
      NAVER_PAY("naver_pay"),

      @SerializedName("nz_bank_account")
      NZ_BANK_ACCOUNT("nz_bank_account"),

      @SerializedName("p24")
      P24("p24"),

      @SerializedName("payco")
      PAYCO("payco"),

      @SerializedName("paynow")
      PAYNOW("paynow"),

      @SerializedName("paypal")
      PAYPAL("paypal"),

      @SerializedName("promptpay")
      PROMPTPAY("promptpay"),

      @SerializedName("revolut_pay")
      REVOLUT_PAY("revolut_pay"),

      @SerializedName("sepa_credit_transfer")
      SEPA_CREDIT_TRANSFER("sepa_credit_transfer"),

      @SerializedName("sepa_debit")
      SEPA_DEBIT("sepa_debit"),

      @SerializedName("sofort")
      SOFORT("sofort"),

      @SerializedName("stripe_balance")
      STRIPE_BALANCE("stripe_balance"),

      @SerializedName("swish")
      SWISH("swish"),

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
  @EqualsAndHashCode(callSuper = false)
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

    /** ID of the invoice rendering template to use for this invoice. */
    @SerializedName("template")
    Object template;

    /** The specific version of invoice rendering template to use for this invoice. */
    @SerializedName("template_version")
    Object templateVersion;

    private Rendering(
        ApiRequestParams.EnumParam amountTaxDisplay,
        Map<String, Object> extraParams,
        Pdf pdf,
        Object template,
        Object templateVersion) {
      this.amountTaxDisplay = amountTaxDisplay;
      this.extraParams = extraParams;
      this.pdf = pdf;
      this.template = template;
      this.templateVersion = templateVersion;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ApiRequestParams.EnumParam amountTaxDisplay;

      private Map<String, Object> extraParams;

      private Pdf pdf;

      private Object template;

      private Object templateVersion;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpdateParams.Rendering build() {
        return new InvoiceUpdateParams.Rendering(
            this.amountTaxDisplay, this.extraParams, this.pdf, this.template, this.templateVersion);
      }

      /**
       * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. One
       * of {@code exclude_tax} or {@code include_inclusive_tax}. {@code include_inclusive_tax} will
       * include inclusive tax (and exclude exclusive tax) in invoice PDF amounts. {@code
       * exclude_tax} will exclude all tax (inclusive and exclusive alike) from invoice PDF amounts.
       */
      public Builder setAmountTaxDisplay(
          InvoiceUpdateParams.Rendering.AmountTaxDisplay amountTaxDisplay) {
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
       * InvoiceUpdateParams.Rendering#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.Rendering#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Invoice pdf rendering options. */
      public Builder setPdf(InvoiceUpdateParams.Rendering.Pdf pdf) {
        this.pdf = pdf;
        return this;
      }

      /** ID of the invoice rendering template to use for this invoice. */
      public Builder setTemplate(String template) {
        this.template = template;
        return this;
      }

      /** ID of the invoice rendering template to use for this invoice. */
      public Builder setTemplate(EmptyParam template) {
        this.template = template;
        return this;
      }

      /** The specific version of invoice rendering template to use for this invoice. */
      public Builder setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
      }

      /** The specific version of invoice rendering template to use for this invoice. */
      public Builder setTemplateVersion(EmptyParam templateVersion) {
        this.templateVersion = templateVersion;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public InvoiceUpdateParams.Rendering.Pdf build() {
          return new InvoiceUpdateParams.Rendering.Pdf(this.extraParams, this.pageSize);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpdateParams.Rendering.Pdf#extraParams} for the field
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
         * map. See {@link InvoiceUpdateParams.Rendering.Pdf#extraParams} for the field
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
        public Builder setPageSize(InvoiceUpdateParams.Rendering.Pdf.PageSize pageSize) {
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
  @EqualsAndHashCode(callSuper = false)
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
    Object shippingRate;

    /** Parameters to create a new ad-hoc shipping rate for this order. */
    @SerializedName("shipping_rate_data")
    ShippingRateData shippingRateData;

    private ShippingCost(
        Map<String, Object> extraParams, Object shippingRate, ShippingRateData shippingRateData) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
      this.shippingRateData = shippingRateData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object shippingRate;

      private ShippingRateData shippingRateData;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpdateParams.ShippingCost build() {
        return new InvoiceUpdateParams.ShippingCost(
            this.extraParams, this.shippingRate, this.shippingRateData);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.ShippingCost#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.ShippingCost#extraParams} for the field documentation.
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

      /** The ID of the shipping rate to use for this order. */
      public Builder setShippingRate(EmptyParam shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }

      /** Parameters to create a new ad-hoc shipping rate for this order. */
      public Builder setShippingRateData(
          InvoiceUpdateParams.ShippingCost.ShippingRateData shippingRateData) {
        this.shippingRateData = shippingRateData;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
      Object displayName;

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
      Object taxCode;

      /** The type of calculation to use on the shipping rate. */
      @SerializedName("type")
      Type type;

      private ShippingRateData(
          DeliveryEstimate deliveryEstimate,
          Object displayName,
          Map<String, Object> extraParams,
          FixedAmount fixedAmount,
          Map<String, String> metadata,
          TaxBehavior taxBehavior,
          Object taxCode,
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

        private Object displayName;

        private Map<String, Object> extraParams;

        private FixedAmount fixedAmount;

        private Map<String, String> metadata;

        private TaxBehavior taxBehavior;

        private Object taxCode;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public InvoiceUpdateParams.ShippingCost.ShippingRateData build() {
          return new InvoiceUpdateParams.ShippingCost.ShippingRateData(
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
            InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate deliveryEstimate) {
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
         * <strong>Required.</strong> The name of the shipping rate, meant to be displayable to the
         * customer. This will appear on CheckoutSessions.
         */
        public Builder setDisplayName(EmptyParam displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link InvoiceUpdateParams.ShippingCost.ShippingRateData#extraParams} for the
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
         * map. See {@link InvoiceUpdateParams.ShippingCost.ShippingRateData#extraParams} for the
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
            InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount fixedAmount) {
          this.fixedAmount = fixedAmount;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * InvoiceUpdateParams.ShippingCost.ShippingRateData#metadata} for the field documentation.
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
         * map. See {@link InvoiceUpdateParams.ShippingCost.ShippingRateData#metadata} for the field
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
            InvoiceUpdateParams.ShippingCost.ShippingRateData.TaxBehavior taxBehavior) {
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
         * A <a href="https://stripe.com/docs/tax/tax-categories">tax code</a> ID. The Shipping tax
         * code is {@code txcd_92010001}.
         */
        public Builder setTaxCode(EmptyParam taxCode) {
          this.taxCode = taxCode;
          return this;
        }

        /** The type of calculation to use on the shipping rate. */
        public Builder setType(InvoiceUpdateParams.ShippingCost.ShippingRateData.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate build() {
            return new InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate(
                this.extraParams, this.maximum, this.minimum);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
           * InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate#extraParams} for the
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
              InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum maximum) {
            this.maximum = maximum;
            return this;
          }

          /** The lower bound of the estimated range. If empty, represents no lower bound. */
          public Builder setMinimum(
              InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum minimum) {
            this.minimum = minimum;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum
                build() {
              return new InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
             * InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum#extraParams}
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
                InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Maximum.Unit
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
        @EqualsAndHashCode(callSuper = false)
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
            public InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum
                build() {
              return new InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum(
                  this.extraParams, this.unit, this.value);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
             * InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum#extraParams}
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
                InvoiceUpdateParams.ShippingCost.ShippingRateData.DeliveryEstimate.Minimum.Unit
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
      @EqualsAndHashCode(callSuper = false)
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
        Object currency;

        /**
         * Shipping rates defined in each available currency option. Each key must be a three-letter
         * <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
         * href="https://stripe.com/docs/currencies">supported currency</a>.
         */
        @SerializedName("currency_options")
        Map<String, InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
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
            Object currency,
            Map<
                    String,
                    InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
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

          private Object currency;

          private Map<
                  String,
                  InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
              currencyOptions;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount build() {
            return new InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount(
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
           * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putCurrencyOption(
              String key,
              InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption value) {
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
           * InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount#currencyOptions} for the
           * field documentation.
           */
          public Builder putAllCurrencyOption(
              Map<
                      String,
                      InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption>
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
           * InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the
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
           * InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount#extraParams} for the
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
            public InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
                build() {
              return new InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount
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
             * InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
             * InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption#extraParams}
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
                InvoiceUpdateParams.ShippingCost.ShippingRateData.FixedAmount.CurrencyOption
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
  @EqualsAndHashCode(callSuper = false)
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
    Object name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    Object phone;

    private ShippingDetails(
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
      public InvoiceUpdateParams.ShippingDetails build() {
        return new InvoiceUpdateParams.ShippingDetails(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> Shipping address */
      public Builder setAddress(InvoiceUpdateParams.ShippingDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.ShippingDetails#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.ShippingDetails#extraParams} for the field documentation.
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

      /** <strong>Required.</strong> Recipient name. */
      public Builder setName(EmptyParam name) {
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
        public InvoiceUpdateParams.ShippingDetails.Address build() {
          return new InvoiceUpdateParams.ShippingDetails.Address(
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
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
         * map. See {@link InvoiceUpdateParams.ShippingDetails.Address#extraParams} for the field
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
         * map. See {@link InvoiceUpdateParams.ShippingDetails.Address#extraParams} for the field
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
  public static class TransferData {
    /**
     * The amount that will be transferred automatically when the invoice is paid. If no amount is
     * set, the full amount is transferred.
     */
    @SerializedName("amount")
    Long amount;

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

    private TransferData(Long amount, Object destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Object destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public InvoiceUpdateParams.TransferData build() {
        return new InvoiceUpdateParams.TransferData(
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

      /** <strong>Required.</strong> ID of an existing, connected Stripe account. */
      public Builder setDestination(EmptyParam destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InvoiceUpdateParams.TransferData#extraParams} for the field documentation.
       */
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
       * See {@link InvoiceUpdateParams.TransferData#extraParams} for the field documentation.
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

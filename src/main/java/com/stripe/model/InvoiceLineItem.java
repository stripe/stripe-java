// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.CreditBalanceTransaction;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceLineItemUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Invoice Line Items represent the individual lines within an <a
 * href="https://stripe.com/docs/api/invoices">invoice</a> and only exist within the context of an
 * invoice.
 *
 * <p>Each line item is backed by either an <a
 * href="https://stripe.com/docs/api/invoiceitems">invoice item</a> or a <a
 * href="https://stripe.com/docs/api/subscription_items">subscription item</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceLineItem extends ApiResource implements HasId, MetadataStore<InvoiceLineItem> {
  /** The amount, in cents (or local equivalent). */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** The amount of discount calculated per discount for this line item. */
  @SerializedName("discount_amounts")
  List<InvoiceLineItem.DiscountAmount> discountAmounts;

  /** If true, discounts will apply to this line item. Always false for prorations. */
  @SerializedName("discountable")
  Boolean discountable;

  /**
   * The discounts applied to the invoice line item. Line item discounts are applied before invoice
   * discounts. Use {@code expand[]=discounts} to expand each discount.
   */
  @SerializedName("discounts")
  List<ExpandableField<Discount>> discounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the invoice that contains this line item. */
  @SerializedName("invoice")
  String invoice;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The amount of margin calculated per margin for this line item. */
  @SerializedName("margin_amounts")
  List<InvoiceLineItem.MarginAmount> marginAmounts;

  /**
   * The margins applied to the line item. When set, the {@code default_margins} on the invoice do
   * not apply to the line item. Use {@code expand[]=margins} to expand each margin.
   */
  @SerializedName("margins")
  List<ExpandableField<Margin>> margins;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Note that for line items with {@code type=subscription}, {@code metadata}
   * reflects the current metadata from the subscription associated with the line item, unless the
   * invoice line was directly updated with different metadata after creation.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code line_item}.
   */
  @SerializedName("object")
  String object;

  /** The parent that generated this line item. */
  @SerializedName("parent")
  Parent parent;

  @SerializedName("period")
  Period period;

  /**
   * Contains pretax credit amounts (ex: discount, credit grants, etc) that apply to this line item.
   */
  @SerializedName("pretax_credit_amounts")
  List<InvoiceLineItem.PretaxCreditAmount> pretaxCreditAmounts;

  /** The pricing information of the line item. */
  @SerializedName("pricing")
  Pricing pricing;

  /** The quantity of the subscription, if the line item is a subscription or a proration. */
  @SerializedName("quantity")
  Long quantity;

  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /** The tax calculation identifiers of the line item. */
  @SerializedName("tax_calculation_reference")
  TaxCalculationReference taxCalculationReference;

  /** The tax information of the line item. */
  @SerializedName("taxes")
  List<InvoiceLineItem.Tax> taxes;

  /** Get ID of expandable {@code subscription} object. */
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String id) {
    this.subscription = ApiResource.setExpandableFieldId(id, this.subscription);
  }

  /** Get expanded {@code subscription}. */
  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription expandableObject) {
    this.subscription =
        new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
  }

  /** Get IDs of expandable {@code discounts} object list. */
  public List<String> getDiscounts() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDiscounts(List<String> ids) {
    if (ids == null) {
      this.discounts = null;
      return;
    }
    if (this.discounts != null
        && this.discounts.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.discounts =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<Discount>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code discounts}. */
  public List<Discount> getDiscountObjects() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDiscountObjects(List<Discount> objs) {
    this.discounts =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<Discount>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Get IDs of expandable {@code margins} object list. */
  public List<String> getMargins() {
    return (this.margins != null)
        ? this.margins.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setMargins(List<String> ids) {
    if (ids == null) {
      this.margins = null;
      return;
    }
    if (this.margins != null
        && this.margins.stream().map(x -> x.getId()).collect(Collectors.toList()).equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.margins =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<Margin>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code margins}. */
  public List<Margin> getMarginObjects() {
    return (this.margins != null)
        ? this.margins.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setMarginObjects(List<Margin> objs) {
    this.margins =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<Margin>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  @Override
  public InvoiceLineItem update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  @Override
  public InvoiceLineItem update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/invoices/%s/lines/%s",
            ApiResource.urlEncodeId(this.getInvoice()), ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, InvoiceLineItem.class);
  }

  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(InvoiceLineItemUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an invoice’s line item. Some fields, such as {@code tax_amounts}, only live on the
   * invoice line item, so they can only be updated through this endpoint. Other fields, such as
   * {@code amount}, live on both the invoice item and the invoice line item, so updates on this
   * endpoint will propagate to the invoice item as well. Updating an invoice’s line item is only
   * possible before the invoice is finalized.
   */
  public InvoiceLineItem update(InvoiceLineItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/invoices/%s/lines/%s",
            ApiResource.urlEncodeId(this.getInvoice()), ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, InvoiceLineItem.class);
  }

  /**
   * For more details about DiscountAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DiscountAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the discount. */
    @SerializedName("amount")
    Long amount;

    /** The discount that was applied to get this discount amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about MarginAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MarginAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the reduction in line item amount. */
    @SerializedName("amount")
    Long amount;

    /** The margin that was applied to get this margin amount. */
    @SerializedName("margin")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Margin> margin;

    /** Get ID of expandable {@code margin} object. */
    public String getMargin() {
      return (this.margin != null) ? this.margin.getId() : null;
    }

    public void setMargin(String id) {
      this.margin = ApiResource.setExpandableFieldId(id, this.margin);
    }

    /** Get expanded {@code margin}. */
    public Margin getMarginObject() {
      return (this.margin != null) ? this.margin.getExpanded() : null;
    }

    public void setMarginObject(Margin expandableObject) {
      this.margin = new ExpandableField<Margin>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Parent, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Parent extends StripeObject {
    /** Details about the invoice item that generated this line item. */
    @SerializedName("invoice_item_details")
    InvoiceItemDetails invoiceItemDetails;

    /** Details about the subscription item that generated this line item. */
    @SerializedName("subscription_item_details")
    SubscriptionItemDetails subscriptionItemDetails;

    /**
     * The type of parent that generated this line item
     *
     * <p>One of {@code invoice_item_details}, or {@code subscription_item_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about InvoiceItemDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceItemDetails extends StripeObject {
      /** The invoice item that generated this line item. */
      @SerializedName("invoice_item")
      String invoiceItem;

      /** Whether this is a proration. */
      @SerializedName("proration")
      Boolean proration;

      /** Additional details for proration line items. */
      @SerializedName("proration_details")
      ProrationDetails prorationDetails;

      /** The subscription that the invoice item belongs to. */
      @SerializedName("subscription")
      String subscription;

      /**
       * For more details about ProrationDetails, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ProrationDetails extends StripeObject {
        /**
         * For a credit proration {@code line_item}, the original debit line_items to which the
         * credit proration applies.
         */
        @SerializedName("credited_items")
        CreditedItems creditedItems;

        /**
         * For more details about CreditedItems, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CreditedItems extends StripeObject {
          /** Invoice containing the credited invoice line items. */
          @SerializedName("invoice")
          String invoice;

          /** Credited invoice line items. */
          @SerializedName("invoice_line_items")
          List<String> invoiceLineItems;
        }
      }
    }

    /**
     * For more details about SubscriptionItemDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionItemDetails extends StripeObject {
      /** The invoice item that generated this line item. */
      @SerializedName("invoice_item")
      String invoiceItem;

      /** Whether this is a proration. */
      @SerializedName("proration")
      Boolean proration;

      /** Additional details for proration line items. */
      @SerializedName("proration_details")
      ProrationDetails prorationDetails;

      /** The subscription that the subscription item belongs to. */
      @SerializedName("subscription")
      String subscription;

      /** The subscription item that generated this line item. */
      @SerializedName("subscription_item")
      String subscriptionItem;

      /**
       * For more details about ProrationDetails, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ProrationDetails extends StripeObject {
        /**
         * For a credit proration {@code line_item}, the original debit line_items to which the
         * credit proration applies.
         */
        @SerializedName("credited_items")
        CreditedItems creditedItems;

        /**
         * For more details about CreditedItems, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CreditedItems extends StripeObject {
          /** Invoice containing the credited invoice line items. */
          @SerializedName("invoice")
          String invoice;

          /** Credited invoice line items. */
          @SerializedName("invoice_line_items")
          List<String> invoiceLineItems;
        }
      }
    }
  }

  /**
   * For more details about Period, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Period extends StripeObject {
    /**
     * The end of the period, which must be greater than or equal to the start. This value is
     * inclusive.
     */
    @SerializedName("end")
    Long end;

    /** The start of the period. This value is inclusive. */
    @SerializedName("start")
    Long start;
  }

  /**
   * For more details about PretaxCreditAmount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PretaxCreditAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the pretax credit amount. */
    @SerializedName("amount")
    Long amount;

    /** The credit balance transaction that was applied to get this pretax credit amount. */
    @SerializedName("credit_balance_transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<CreditBalanceTransaction> creditBalanceTransaction;

    /** The discount that was applied to get this pretax credit amount. */
    @SerializedName("discount")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Discount> discount;

    /** The margin that was applied to get this pretax credit amount. */
    @SerializedName("margin")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Margin> margin;

    /**
     * Type of the pretax credit amount referenced.
     *
     * <p>One of {@code credit_balance_transaction}, {@code discount}, or {@code margin}.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code creditBalanceTransaction} object. */
    public String getCreditBalanceTransaction() {
      return (this.creditBalanceTransaction != null) ? this.creditBalanceTransaction.getId() : null;
    }

    public void setCreditBalanceTransaction(String id) {
      this.creditBalanceTransaction =
          ApiResource.setExpandableFieldId(id, this.creditBalanceTransaction);
    }

    /** Get expanded {@code creditBalanceTransaction}. */
    public CreditBalanceTransaction getCreditBalanceTransactionObject() {
      return (this.creditBalanceTransaction != null)
          ? this.creditBalanceTransaction.getExpanded()
          : null;
    }

    public void setCreditBalanceTransactionObject(CreditBalanceTransaction expandableObject) {
      this.creditBalanceTransaction =
          new ExpandableField<CreditBalanceTransaction>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code discount} object. */
    public String getDiscount() {
      return (this.discount != null) ? this.discount.getId() : null;
    }

    public void setDiscount(String id) {
      this.discount = ApiResource.setExpandableFieldId(id, this.discount);
    }

    /** Get expanded {@code discount}. */
    public Discount getDiscountObject() {
      return (this.discount != null) ? this.discount.getExpanded() : null;
    }

    public void setDiscountObject(Discount expandableObject) {
      this.discount = new ExpandableField<Discount>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code margin} object. */
    public String getMargin() {
      return (this.margin != null) ? this.margin.getId() : null;
    }

    public void setMargin(String id) {
      this.margin = ApiResource.setExpandableFieldId(id, this.margin);
    }

    /** Get expanded {@code margin}. */
    public Margin getMarginObject() {
      return (this.margin != null) ? this.margin.getExpanded() : null;
    }

    public void setMarginObject(Margin expandableObject) {
      this.margin = new ExpandableField<Margin>(expandableObject.getId(), expandableObject);
    }
  }

  /**
   * For more details about Pricing, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pricing extends StripeObject {
    @SerializedName("price_details")
    PriceDetails priceDetails;

    /**
     * The type of the pricing details.
     *
     * <p>Equal to {@code price_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * The unit amount (in the {@code currency} specified) of the item which contains a decimal
     * value with at most 12 decimal places.
     */
    @SerializedName("unit_amount_decimal")
    BigDecimal unitAmountDecimal;

    /**
     * For more details about PriceDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PriceDetails extends StripeObject {
      /** The ID of the price this item is associated with. */
      @SerializedName("price")
      String price;

      /** The ID of the product this item is associated with. */
      @SerializedName("product")
      String product;
    }
  }

  /**
   * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Tax extends StripeObject {
    /** The amount of the tax, in cents (or local equivalent). */
    @SerializedName("amount")
    Long amount;

    /**
     * Whether this tax is inclusive or exclusive.
     *
     * <p>One of {@code exclusive}, or {@code inclusive}.
     */
    @SerializedName("tax_behavior")
    String taxBehavior;

    /**
     * Additional details about the tax rate. Only present when {@code type} is {@code
     * tax_rate_details}.
     */
    @SerializedName("tax_rate_details")
    TaxRateDetails taxRateDetails;

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values
     * for this field may be extended as new tax rules are supported.
     *
     * <p>One of {@code customer_exempt}, {@code not_available}, {@code not_collecting}, {@code
     * not_subject_to_tax}, {@code not_supported}, {@code portion_product_exempt}, {@code
     * portion_reduced_rated}, {@code portion_standard_rated}, {@code product_exempt}, {@code
     * product_exempt_holiday}, {@code proportionally_rated}, {@code reduced_rated}, {@code
     * reverse_charge}, {@code standard_rated}, {@code taxable_basis_reduced}, or {@code
     * zero_rated}.
     */
    @SerializedName("taxability_reason")
    String taxabilityReason;

    /** The amount on which tax is calculated, in cents (or local equivalent). */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    /**
     * The type of tax information.
     *
     * <p>Equal to {@code tax_rate_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about TaxRateDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxRateDetails extends StripeObject {
      @SerializedName("tax_rate")
      String taxRate;
    }
  }

  /**
   * For more details about TaxCalculationReference, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxCalculationReference extends StripeObject {
    /** The calculation identifier for tax calculation response. */
    @SerializedName("calculation_id")
    String calculationId;

    /** The calculation identifier for tax calculation response line item. */
    @SerializedName("calculation_item_id")
    String calculationItemId;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(parent, responseGetter);
    trySetResponseGetter(period, responseGetter);
    trySetResponseGetter(pricing, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(taxCalculationReference, responseGetter);
  }
}

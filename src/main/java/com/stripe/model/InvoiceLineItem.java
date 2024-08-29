// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
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
   * The integer amount in cents (or local equivalent) representing the amount for this line item,
   * excluding all tax and discounts.
   */
  @SerializedName("amount_excluding_tax")
  Long amountExcludingTax;

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
   * The ID of the <a href="https://stripe.com/docs/api/invoiceitems">invoice item</a> associated
   * with this line item if any.
   */
  @SerializedName("invoice_item")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<InvoiceItem> invoiceItem;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

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

  @SerializedName("period")
  Period period;

  /** The plan of the subscription, if the line item is a subscription or a proration. */
  @SerializedName("plan")
  Plan plan;

  /** The price of the line item. */
  @SerializedName("price")
  Price price;

  /** Whether this is a proration. */
  @SerializedName("proration")
  Boolean proration;

  /** Additional details for proration line items. */
  @SerializedName("proration_details")
  ProrationDetails prorationDetails;

  /** The quantity of the subscription, if the line item is a subscription or a proration. */
  @SerializedName("quantity")
  Long quantity;

  /** The subscription that the invoice item pertains to, if any. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /**
   * The subscription item that generated this line item. Left empty if the line item is not an
   * explicit result of a subscription.
   */
  @SerializedName("subscription_item")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SubscriptionItem> subscriptionItem;

  /** The amount of tax calculated per tax rate for this line item. */
  @SerializedName("tax_amounts")
  List<InvoiceLineItem.TaxAmount> taxAmounts;

  /** The tax rates which apply to the line item. */
  @SerializedName("tax_rates")
  List<TaxRate> taxRates;

  /**
   * A string identifying the type of the source of this line item, either an {@code invoiceitem} or
   * a {@code subscription}.
   *
   * <p>One of {@code invoiceitem}, or {@code subscription}.
   */
  @SerializedName("type")
  String type;

  /**
   * The amount in cents (or local equivalent) representing the unit amount for this line item,
   * excluding all tax and discounts.
   */
  @SerializedName("unit_amount_excluding_tax")
  BigDecimal unitAmountExcludingTax;

  /** Get ID of expandable {@code invoiceItem} object. */
  public String getInvoiceItem() {
    return (this.invoiceItem != null) ? this.invoiceItem.getId() : null;
  }

  public void setInvoiceItem(String id) {
    this.invoiceItem = ApiResource.setExpandableFieldId(id, this.invoiceItem);
  }

  /** Get expanded {@code invoiceItem}. */
  public InvoiceItem getInvoiceItemObject() {
    return (this.invoiceItem != null) ? this.invoiceItem.getExpanded() : null;
  }

  public void setInvoiceItemObject(InvoiceItem expandableObject) {
    this.invoiceItem = new ExpandableField<InvoiceItem>(expandableObject.getId(), expandableObject);
  }

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

  /** Get ID of expandable {@code subscriptionItem} object. */
  public String getSubscriptionItem() {
    return (this.subscriptionItem != null) ? this.subscriptionItem.getId() : null;
  }

  public void setSubscriptionItem(String id) {
    this.subscriptionItem = ApiResource.setExpandableFieldId(id, this.subscriptionItem);
  }

  /** Get expanded {@code subscriptionItem}. */
  public SubscriptionItem getSubscriptionItemObject() {
    return (this.subscriptionItem != null) ? this.subscriptionItem.getExpanded() : null;
  }

  public void setSubscriptionItemObject(SubscriptionItem expandableObject) {
    this.subscriptionItem =
        new ExpandableField<SubscriptionItem>(expandableObject.getId(), expandableObject);
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
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
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
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, InvoiceLineItem.class);
  }

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProrationDetails extends StripeObject {
    /**
     * For a credit proration {@code line_item}, the original debit line_items to which the credit
     * proration applies.
     */
    @SerializedName("credited_items")
    CreditedItems creditedItems;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxAmount extends StripeObject {
    /** The amount, in cents (or local equivalent), of the tax. */
    @SerializedName("amount")
    Long amount;

    /** Whether this tax amount is inclusive or exclusive. */
    @SerializedName("inclusive")
    Boolean inclusive;

    /** The tax rate that was applied to get this tax amount. */
    @SerializedName("tax_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<TaxRate> taxRate;

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values
     * for this field may be extended as new tax rules are supported.
     *
     * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax}, {@code
     * not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated}, {@code
     * portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday}, {@code
     * proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code standard_rated},
     * {@code taxable_basis_reduced}, or {@code zero_rated}.
     */
    @SerializedName("taxability_reason")
    String taxabilityReason;

    /** The amount on which tax is calculated, in cents (or local equivalent). */
    @SerializedName("taxable_amount")
    Long taxableAmount;

    /** Get ID of expandable {@code taxRate} object. */
    public String getTaxRate() {
      return (this.taxRate != null) ? this.taxRate.getId() : null;
    }

    public void setTaxRate(String id) {
      this.taxRate = ApiResource.setExpandableFieldId(id, this.taxRate);
    }

    /** Get expanded {@code taxRate}. */
    public TaxRate getTaxRateObject() {
      return (this.taxRate != null) ? this.taxRate.getExpanded() : null;
    }

    public void setTaxRateObject(TaxRate expandableObject) {
      this.taxRate = new ExpandableField<TaxRate>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(invoiceItem, responseGetter);
    trySetResponseGetter(period, responseGetter);
    trySetResponseGetter(plan, responseGetter);
    trySetResponseGetter(price, responseGetter);
    trySetResponseGetter(prorationDetails, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(subscriptionItem, responseGetter);
  }
}

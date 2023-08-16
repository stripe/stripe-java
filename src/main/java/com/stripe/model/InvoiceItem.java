// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.InvoiceItemCreateParams;
import com.stripe.param.InvoiceItemListParams;
import com.stripe.param.InvoiceItemRetrieveParams;
import com.stripe.param.InvoiceItemUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Invoice Items represent the component lines of an <a
 * href="https://stripe.com/docs/api/invoices">invoice</a>. An invoice item is added to an invoice
 * by creating or updating it with an {@code invoice} field, at which point it will be included as
 * <a href="https://stripe.com/docs/api/invoices/line_item">an invoice line item</a> within <a
 * href="https://stripe.com/docs/api/invoices/object#invoice_object-lines">invoice.lines</a>.
 *
 * <p>Invoice Items can be created before you are ready to actually send the invoice. This can be
 * particularly useful when combined with a <a
 * href="https://stripe.com/docs/api/subscriptions">subscription</a>. Sometimes you want to add a
 * charge or credit to a customer, but actually charge or credit the customer’s card only at the end
 * of a regular billing cycle. This is useful for combining several charges (to minimize
 * per-transaction fees), or for having Stripe tabulate your usage-based billing totals.
 *
 * <p>Related guides: <a href="https://stripe.com/docs/invoicing/integration">Integrate with the
 * Invoicing API</a>, <a
 * href="https://stripe.com/docs/billing/invoices/subscription#adding-upcoming-invoice-items">Subscription
 * Invoices</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InvoiceItem extends ApiResource implements HasId, MetadataStore<InvoiceItem> {
  /**
   * Amount (in the {@code currency} specified) of the invoice item. This should always be equal to
   * {@code unit_amount * quantity}.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer who will be billed when this invoice item is billed. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("date")
  Long date;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** If true, discounts will apply to this invoice item. Always false for prorations. */
  @SerializedName("discountable")
  Boolean discountable;

  /**
   * The discounts which apply to the invoice item. Item discounts are applied before invoice
   * discounts. Use {@code expand[]=discounts} to expand each discount.
   */
  @SerializedName("discounts")
  List<ExpandableField<Discount>> discounts;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the invoice this invoice item belongs to. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code invoiceitem}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("period")
  Period period;

  /**
   * If the invoice item is a proration, the plan of the subscription that the proration was
   * computed for.
   */
  @SerializedName("plan")
  Plan plan;

  /** The price of the invoice item. */
  @SerializedName("price")
  Price price;

  /**
   * Whether the invoice item was created automatically as a proration adjustment when the customer
   * switched plans.
   */
  @SerializedName("proration")
  Boolean proration;

  /**
   * Quantity of units for the invoice item. If the invoice item is a proration, the quantity of the
   * subscription that the proration was computed for.
   */
  @SerializedName("quantity")
  Long quantity;

  /** The subscription that this invoice item has been created for, if any. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /** The subscription item that this invoice item has been created for, if any. */
  @SerializedName("subscription_item")
  String subscriptionItem;

  /**
   * The tax rates which apply to the invoice item. When set, the {@code default_tax_rates} on the
   * invoice do not apply to this invoice item.
   */
  @SerializedName("tax_rates")
  List<TaxRate> taxRates;

  /** ID of the test clock this invoice item belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  /** Unit amount (in the {@code currency} specified) of the invoice item. */
  @SerializedName("unit_amount")
  Long unitAmount;

  /** Same as {@code unit_amount}, but contains a decimal value with at most 12 decimal places. */
  @SerializedName("unit_amount_decimal")
  BigDecimal unitAmountDecimal;

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code invoice} object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded {@code invoice}. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code testClock} object. */
  public String getTestClock() {
    return (this.testClock != null) ? this.testClock.getId() : null;
  }

  public void setTestClock(String id) {
    this.testClock = ApiResource.setExpandableFieldId(id, this.testClock);
  }

  /** Get expanded {@code testClock}. */
  public TestClock getTestClockObject() {
    return (this.testClock != null) ? this.testClock.getExpanded() : null;
  }

  public void setTestClockObject(TestClock expandableObject) {
    this.testClock = new ExpandableField<TestClock>(expandableObject.getId(), expandableObject);
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
   * Creates an item to be added to a draft invoice (up to 250 items per invoice). If no invoice is
   * specified, the item will be on the next invoice created for the customer specified.
   */
  public static InvoiceItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an item to be added to a draft invoice (up to 250 items per invoice). If no invoice is
   * specified, the item will be on the next invoice created for the customer specified.
   */
  public static InvoiceItem create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoiceitems";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            InvoiceItem.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates an item to be added to a draft invoice (up to 250 items per invoice). If no invoice is
   * specified, the item will be on the next invoice created for the customer specified.
   */
  public static InvoiceItem create(InvoiceItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an item to be added to a draft invoice (up to 250 items per invoice). If no invoice is
   * specified, the item will be on the next invoice created for the customer specified.
   */
  public static InvoiceItem create(InvoiceItemCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoiceitems";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoiceItem.class,
            options,
            ApiMode.V1);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            params,
            InvoiceItem.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoiceitems";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            InvoiceItemCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(InvoiceItemListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(InvoiceItemListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/invoiceitems";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoiceItemCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the invoice item with the given ID. */
  public static InvoiceItem retrieve(String invoiceitem) throws StripeException {
    return retrieve(invoiceitem, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the invoice item with the given ID. */
  public static InvoiceItem retrieve(String invoiceitem, RequestOptions options)
      throws StripeException {
    return retrieve(invoiceitem, (Map<String, Object>) null, options);
  }

  /** Retrieves the invoice item with the given ID. */
  public static InvoiceItem retrieve(
      String invoiceitem, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            InvoiceItem.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the invoice item with the given ID. */
  public static InvoiceItem retrieve(
      String invoiceitem, InvoiceItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoiceItem.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            InvoiceItem.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(InvoiceItemUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(InvoiceItemUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoiceItem.class,
            options,
            ApiMode.V1);
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(period, responseGetter);
    trySetResponseGetter(plan, responseGetter);
    trySetResponseGetter(price, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
  }
}

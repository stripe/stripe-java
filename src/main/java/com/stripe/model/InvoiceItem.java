// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiRequest;
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
 * href="https://docs.stripe.com/api/invoices">invoice</a>. When you create an invoice item with an
 * {@code invoice} field, it is attached to the specified invoice and included as <a
 * href="https://docs.stripe.com/api/invoices/line_item">an invoice line item</a> within <a
 * href="https://docs.stripe.com/api/invoices/object#invoice_object-lines">invoice.lines</a>.
 *
 * <p>Invoice Items can be created before you are ready to actually send the invoice. This can be
 * particularly useful when combined with a <a
 * href="https://docs.stripe.com/api/subscriptions">subscription</a>. Sometimes you want to add a
 * charge or credit to a customer, but actually charge or credit the customer's card only at the end
 * of a regular billing cycle. This is useful for combining several charges (to minimize
 * per-transaction fees), or for having Stripe tabulate your usage-based billing totals.
 *
 * <p>Related guides: <a href="https://docs.stripe.com/invoicing/integration">Integrate with the
 * Invoicing API</a>, <a
 * href="https://docs.stripe.com/billing/invoices/subscription#adding-upcoming-invoice-items">Subscription
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

  /** The ID of the customer to bill for this invoice item. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The ID of the account to bill for this invoice item. */
  @SerializedName("customer_account")
  String customerAccount;

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
   * The margins which apply to the invoice item. When set, the {@code default_margins} on the
   * invoice do not apply to this invoice item.
   */
  @SerializedName("margins")
  List<ExpandableField<Margin>> margins;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The amount after discounts, but before credits and taxes. This field is {@code null} for {@code
   * discountable=true} items.
   */
  @SerializedName("net_amount")
  Long netAmount;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code invoiceitem}.
   */
  @SerializedName("object")
  String object;

  /** The parent that generated this invoice item. */
  @SerializedName("parent")
  Parent parent;

  @SerializedName("period")
  Period period;

  /** The pricing information of the invoice item. */
  @SerializedName("pricing")
  Pricing pricing;

  /**
   * Whether the invoice item was created automatically as a proration adjustment when the customer
   * switched plans.
   */
  @SerializedName("proration")
  Boolean proration;

  @SerializedName("proration_details")
  ProrationDetails prorationDetails;

  /**
   * Quantity of units for the invoice item. If the invoice item is a proration, the quantity of the
   * subscription that the proration was computed for.
   */
  @SerializedName("quantity")
  Long quantity;

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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, InvoiceItem.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InvoiceItem.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, InvoiceItem.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, InvoiceItemCollection.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InvoiceItemCollection.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, InvoiceItem.class);
  }

  /** Retrieves the invoice item with the given ID. */
  public static InvoiceItem retrieve(
      String invoiceitem, InvoiceItemRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InvoiceItem.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, InvoiceItem.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, InvoiceItem.class);
  }

  /**
   * For more details about Parent, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Parent extends StripeObject {
    /** Details about the license fee subscription that generated this invoice item. */
    @SerializedName("license_fee_subscription_details")
    LicenseFeeSubscriptionDetails licenseFeeSubscriptionDetails;

    /** Details about the rate card subscription that generated this invoice item. */
    @SerializedName("rate_card_subscription_details")
    RateCardSubscriptionDetails rateCardSubscriptionDetails;

    /** Details about the subscription schedule that generated this invoice item. */
    @SerializedName("schedule_details")
    ScheduleDetails scheduleDetails;

    /** Details about the subscription that generated this invoice item. */
    @SerializedName("subscription_details")
    SubscriptionDetails subscriptionDetails;

    /**
     * The type of parent that generated this invoice item
     *
     * <p>One of {@code license_fee_subscription_details}, {@code rate_card_subscription_details},
     * {@code schedule_details}, or {@code subscription_details}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about LicenseFeeSubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LicenseFeeSubscriptionDetails extends StripeObject {
      /** The license fee subscription that generated this invoice item. */
      @SerializedName("license_fee_subscription")
      String licenseFeeSubscription;

      /** The license fee version that generated this invoice item. */
      @SerializedName("license_fee_version")
      String licenseFeeVersion;

      /** The pricing plan subscription that manages the license fee subscription. */
      @SerializedName("pricing_plan_subscription")
      String pricingPlanSubscription;

      /** The pricing plan version at the time this invoice item was generated. */
      @SerializedName("pricing_plan_version")
      String pricingPlanVersion;
    }

    /**
     * For more details about RateCardSubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RateCardSubscriptionDetails extends StripeObject {
      /** The pricing plan subscription that manages the rate card subscription. */
      @SerializedName("pricing_plan_subscription")
      String pricingPlanSubscription;

      /** The pricing plan version at the time this invoice item was generated. */
      @SerializedName("pricing_plan_version")
      String pricingPlanVersion;

      /** The rate card subscription that generated this invoice item. */
      @SerializedName("rate_card_subscription")
      String rateCardSubscription;

      /** The rate card version that generated this invoice item. */
      @SerializedName("rate_card_version")
      String rateCardVersion;
    }

    /**
     * For more details about ScheduleDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ScheduleDetails extends StripeObject {
      /** The subscription schedule that generated this invoice item. */
      @SerializedName("schedule")
      String schedule;
    }

    /**
     * For more details about SubscriptionDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SubscriptionDetails extends StripeObject {
      /** The subscription that generated this invoice item. */
      @SerializedName("subscription")
      String subscription;

      /** The subscription item that generated this invoice item. */
      @SerializedName("subscription_item")
      String subscriptionItem;
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
   * For more details about Pricing, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pricing extends StripeObject {
    @SerializedName("license_fee_details")
    LicenseFeeDetails licenseFeeDetails;

    @SerializedName("price_details")
    PriceDetails priceDetails;

    @SerializedName("rate_card_rate_details")
    RateCardRateDetails rateCardRateDetails;

    /**
     * The type of the pricing details.
     *
     * <p>One of {@code license_fee_details}, {@code price_details}, or {@code
     * rate_card_rate_details}.
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
     * For more details about LicenseFeeDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LicenseFeeDetails extends StripeObject {
      /** The ID of the license fee this item is associated with. */
      @SerializedName("license_fee")
      String licenseFee;

      /** The version of the license fee this item is associated with. */
      @SerializedName("license_fee_version")
      String licenseFeeVersion;

      /** The ID of the licensed item this item is associated with. */
      @SerializedName("licensed_item")
      String licensedItem;
    }

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
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Price> price;

      /** The ID of the product this item is associated with. */
      @SerializedName("product")
      String product;

      /** Get ID of expandable {@code price} object. */
      public String getPrice() {
        return (this.price != null) ? this.price.getId() : null;
      }

      public void setPrice(String id) {
        this.price = ApiResource.setExpandableFieldId(id, this.price);
      }

      /** Get expanded {@code price}. */
      public Price getPriceObject() {
        return (this.price != null) ? this.price.getExpanded() : null;
      }

      public void setPriceObject(Price expandableObject) {
        this.price = new ExpandableField<Price>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about RateCardRateDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RateCardRateDetails extends StripeObject {
      /** The ID of billable item this item is associated with. */
      @SerializedName("metered_item")
      String meteredItem;

      /** The ID of the rate card this item is associated with. */
      @SerializedName("rate_card")
      String rateCard;

      /** The ID of the rate card rate this item is associated with. */
      @SerializedName("rate_card_rate")
      String rateCardRate;
    }
  }

  /**
   * For more details about ProrationDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProrationDetails extends StripeObject {
    /** Discount amounts applied when the proration was created. */
    @SerializedName("discount_amounts")
    List<InvoiceItem.ProrationDetails.DiscountAmount> discountAmounts;

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
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(parent, responseGetter);
    trySetResponseGetter(period, responseGetter);
    trySetResponseGetter(pricing, responseGetter);
    trySetResponseGetter(prorationDetails, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
  }
}

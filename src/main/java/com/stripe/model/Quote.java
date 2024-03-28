// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.QuoteAcceptParams;
import com.stripe.param.QuoteCancelParams;
import com.stripe.param.QuoteCreateParams;
import com.stripe.param.QuoteFinalizeQuoteParams;
import com.stripe.param.QuoteListComputedUpfrontLineItemsParams;
import com.stripe.param.QuoteListLineItemsParams;
import com.stripe.param.QuoteListParams;
import com.stripe.param.QuotePdfParams;
import com.stripe.param.QuoteRetrieveParams;
import com.stripe.param.QuoteUpdateParams;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Quote is a way to model prices that you'd like to provide to a customer. Once accepted, it will
 * automatically create an invoice, subscription or subscription schedule.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Quote extends ApiResource implements HasId, MetadataStore<Quote> {
  /** Total before any discounts or taxes are applied. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total after discounts and taxes are applied. */
  @SerializedName("amount_total")
  Long amountTotal;

  /** ID of the Connect Application that created the quote. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. Only applicable if there are no line
   * items with recurring prices on the quote.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice total that will be transferred to the application
   * owner's Stripe account. Only applicable if there are line items with recurring prices on the
   * quote.
   */
  @SerializedName("application_fee_percent")
  BigDecimal applicationFeePercent;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Either {@code charge_automatically}, or {@code send_invoice}. When charging automatically,
   * Stripe will attempt to pay invoices at the end of the subscription cycle or on finalization
   * using the default payment method attached to the subscription or customer. When sending an
   * invoice, Stripe will email your customer an invoice with payment instructions and mark the
   * subscription as {@code active}. Defaults to {@code charge_automatically}.
   *
   * <p>One of {@code charge_automatically}, or {@code send_invoice}.
   */
  @SerializedName("collection_method")
  String collectionMethod;

  @SerializedName("computed")
  Computed computed;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The customer which this quote belongs to. A customer is required before finalizing the quote.
   * Once specified, it cannot be changed.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** The tax rates applied to this quote. */
  @SerializedName("default_tax_rates")
  List<ExpandableField<TaxRate>> defaultTaxRates;

  /** A description that will be displayed on the quote PDF. */
  @SerializedName("description")
  String description;

  /** The discounts applied to this quote. */
  @SerializedName("discounts")
  List<ExpandableField<com.stripe.model.Discount>> discounts;

  /**
   * The date on which the quote will be canceled if in {@code open} or {@code draft} status.
   * Measured in seconds since the Unix epoch.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /** A footer that will be displayed on the quote PDF. */
  @SerializedName("footer")
  String footer;

  /**
   * Details of the quote that was cloned. See the <a
   * href="https://stripe.com/docs/quotes/clone">cloning documentation</a> for more details.
   */
  @SerializedName("from_quote")
  FromQuote fromQuote;

  /** A header that will be displayed on the quote PDF. */
  @SerializedName("header")
  String header;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The invoice that was created from this quote. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /** A list of items the customer is being quoted for. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

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
   * A unique number that identifies this particular quote. This number is assigned once the quote
   * is <a href="https://stripe.com/docs/quotes/overview#finalize">finalized</a>.
   */
  @SerializedName("number")
  String number;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code quote}.
   */
  @SerializedName("object")
  String object;

  /**
   * The account on behalf of which to charge. See the <a
   * href="https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts">Connect
   * documentation</a> for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /**
   * The status of the quote.
   *
   * <p>One of {@code accepted}, {@code canceled}, {@code draft}, or {@code open}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The subscription that was created or updated from this quote. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  /** The subscription schedule that was created or updated from this quote. */
  @SerializedName("subscription_schedule")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SubscriptionSchedule> subscriptionSchedule;

  /** ID of the test clock this quote belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  @SerializedName("total_details")
  TotalDetails totalDetails;

  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from
   * each payment will be transferred to for each of the invoices.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

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

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code subscriptionSchedule} object. */
  public String getSubscriptionSchedule() {
    return (this.subscriptionSchedule != null) ? this.subscriptionSchedule.getId() : null;
  }

  public void setSubscriptionSchedule(String id) {
    this.subscriptionSchedule = ApiResource.setExpandableFieldId(id, this.subscriptionSchedule);
  }

  /** Get expanded {@code subscriptionSchedule}. */
  public SubscriptionSchedule getSubscriptionScheduleObject() {
    return (this.subscriptionSchedule != null) ? this.subscriptionSchedule.getExpanded() : null;
  }

  public void setSubscriptionScheduleObject(SubscriptionSchedule expandableObject) {
    this.subscriptionSchedule =
        new ExpandableField<SubscriptionSchedule>(expandableObject.getId(), expandableObject);
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

  /** Get IDs of expandable {@code defaultTaxRates} object list. */
  public List<String> getDefaultTaxRates() {
    return (this.defaultTaxRates != null)
        ? this.defaultTaxRates.stream().map(x -> x.getId()).collect(Collectors.toList())
        : null;
  }

  public void setDefaultTaxRates(List<String> ids) {
    if (ids == null) {
      this.defaultTaxRates = null;
      return;
    }
    if (this.defaultTaxRates != null
        && this.defaultTaxRates.stream()
            .map(x -> x.getId())
            .collect(Collectors.toList())
            .equals(ids)) {
      // noop if the ids are equal to what are already present
      return;
    }
    this.defaultTaxRates =
        (ids != null)
            ? ids.stream()
                .map(id -> new ExpandableField<TaxRate>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code defaultTaxRates}. */
  public List<TaxRate> getDefaultTaxRateObjects() {
    return (this.defaultTaxRates != null)
        ? this.defaultTaxRates.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDefaultTaxRateObjects(List<TaxRate> objs) {
    this.defaultTaxRates =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<TaxRate>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
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
                .map(id -> new ExpandableField<com.stripe.model.Discount>(id, null))
                .collect(Collectors.toList())
            : null;
  }

  /** Get expanded {@code discounts}. */
  public List<com.stripe.model.Discount> getDiscountObjects() {
    return (this.discounts != null)
        ? this.discounts.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
        : null;
  }

  public void setDiscountObjects(List<com.stripe.model.Discount> objs) {
    this.discounts =
        objs != null
            ? objs.stream()
                .map(x -> new ExpandableField<com.stripe.model.Discount>(x.getId(), x))
                .collect(Collectors.toList())
            : null;
  }

  /** Accepts the specified quote. */
  public Quote accept() throws StripeException {
    return accept((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Accepts the specified quote. */
  public Quote accept(RequestOptions options) throws StripeException {
    return accept((Map<String, Object>) null, options);
  }

  /** Accepts the specified quote. */
  public Quote accept(Map<String, Object> params) throws StripeException {
    return accept(params, (RequestOptions) null);
  }

  /** Accepts the specified quote. */
  public Quote accept(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/accept", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /** Accepts the specified quote. */
  public Quote accept(QuoteAcceptParams params) throws StripeException {
    return accept(params, (RequestOptions) null);
  }

  /** Accepts the specified quote. */
  public Quote accept(QuoteAcceptParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/accept", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /** Cancels the quote. */
  public Quote cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancels the quote. */
  public Quote cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancels the quote. */
  public Quote cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels the quote. */
  public Quote cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /** Cancels the quote. */
  public Quote cancel(QuoteCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels the quote. */
  public Quote cancel(QuoteCancelParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public static Quote create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public static Quote create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Quote.class);
  }

  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public static Quote create(QuoteCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * A quote models prices and services for a customer. Default options for {@code header}, {@code
   * description}, {@code footer}, and {@code expires_at} can be set in the dashboard via the <a
   * href="https://dashboard.stripe.com/settings/billing/quote">quote template</a>.
   */
  public static Quote create(QuoteCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/quotes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Quote.class);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote() throws StripeException {
    return finalizeQuote((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(RequestOptions options) throws StripeException {
    return finalizeQuote((Map<String, Object>) null, options);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(Map<String, Object> params) throws StripeException {
    return finalizeQuote(params, (RequestOptions) null);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/finalize", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(QuoteFinalizeQuoteParams params) throws StripeException {
    return finalizeQuote(params, (RequestOptions) null);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(QuoteFinalizeQuoteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/finalize", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/quotes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, QuoteCollection.class);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(QuoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(QuoteListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/quotes";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, QuoteCollection.class);
  }

  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public LineItemCollection listComputedUpfrontLineItems() throws StripeException {
    return listComputedUpfrontLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public LineItemCollection listComputedUpfrontLineItems(Map<String, Object> params)
      throws StripeException {
    return listComputedUpfrontLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public LineItemCollection listComputedUpfrontLineItems(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/quotes/%s/computed_upfront_line_items", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public LineItemCollection listComputedUpfrontLineItems(
      QuoteListComputedUpfrontLineItemsParams params) throws StripeException {
    return listComputedUpfrontLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <a
   * href="https://stripe.com/docs/api/quotes/object#quote_object-computed-upfront-line_items"><strong>computed.upfront.line_items</strong></a>
   * property containing the first handful of those items. There is also a URL where you can
   * retrieve the full (paginated) list of upfront line items.
   */
  public LineItemCollection listComputedUpfrontLineItems(
      QuoteListComputedUpfrontLineItemsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/quotes/%s/computed_upfront_line_items", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public LineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public LineItemCollection listLineItems(QuoteListLineItemsParams params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a quote, there is an includable <strong>line_items</strong> property containing
   * the first handful of those items. There is also a URL where you can retrieve the full
   * (paginated) list of line items.
   */
  public LineItemCollection listLineItems(QuoteListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, LineItemCollection.class);
  }

  /**
   * Download the PDF for a finalized quote. Explanation for special handling can be found <a
   * href="https://docs.corp.stripe.com/quotes/overview#quote_pdf">here</a>
   */
  public InputStream pdf() throws StripeException {
    return pdf((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Download the PDF for a finalized quote. Explanation for special handling can be found <a
   * href="https://docs.corp.stripe.com/quotes/overview#quote_pdf">here</a>
   */
  public InputStream pdf(Map<String, Object> params) throws StripeException {
    return pdf(params, (RequestOptions) null);
  }

  /**
   * Download the PDF for a finalized quote. Explanation for special handling can be found <a
   * href="https://docs.corp.stripe.com/quotes/overview#quote_pdf">here</a>
   */
  public InputStream pdf(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s/pdf", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().requestStream(request);
  }

  /**
   * Download the PDF for a finalized quote. Explanation for special handling can be found <a
   * href="https://docs.corp.stripe.com/quotes/overview#quote_pdf">here</a>
   */
  public InputStream pdf(QuotePdfParams params) throws StripeException {
    return pdf(params, (RequestOptions) null);
  }

  /**
   * Download the PDF for a finalized quote. Explanation for special handling can be found <a
   * href="https://docs.corp.stripe.com/quotes/overview#quote_pdf">here</a>
   */
  public InputStream pdf(QuotePdfParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s/pdf", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().requestStream(request);
  }

  /** Retrieves the quote with the given ID. */
  public static Quote retrieve(String quote) throws StripeException {
    return retrieve(quote, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the quote with the given ID. */
  public static Quote retrieve(String quote, RequestOptions options) throws StripeException {
    return retrieve(quote, (Map<String, Object>) null, options);
  }

  /** Retrieves the quote with the given ID. */
  public static Quote retrieve(String quote, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s", ApiResource.urlEncodeId(quote));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Quote.class);
  }

  /** Retrieves the quote with the given ID. */
  public static Quote retrieve(String quote, QuoteRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/quotes/%s", ApiResource.urlEncodeId(quote));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Quote.class);
  }

  /** A quote models prices and services for a customer. */
  @Override
  public Quote update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** A quote models prices and services for a customer. */
  @Override
  public Quote update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  /** A quote models prices and services for a customer. */
  public Quote update(QuoteUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** A quote models prices and services for a customer. */
  public Quote update(QuoteUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/quotes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Quote.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Automatically calculate taxes. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    /**
     * The status of the most recent automated tax calculation for this quote.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability extends StripeObject {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Account> account;

      /**
       * Type of the account referenced.
       *
       * <p>One of {@code account}, or {@code self}.
       */
      @SerializedName("type")
      String type;

      /** Get ID of expandable {@code account} object. */
      public String getAccount() {
        return (this.account != null) ? this.account.getId() : null;
      }

      public void setAccount(String id) {
        this.account = ApiResource.setExpandableFieldId(id, this.account);
      }

      /** Get expanded {@code account}. */
      public Account getAccountObject() {
        return (this.account != null) ? this.account.getExpanded() : null;
      }

      public void setAccountObject(Account expandableObject) {
        this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Computed extends StripeObject {
    /**
     * The definitive totals and line items the customer will be charged on a recurring basis. Takes
     * into account the line items with recurring prices and discounts with {@code duration=forever}
     * coupons only. Defaults to {@code null} if no inputted line items with recurring prices.
     */
    @SerializedName("recurring")
    Recurring recurring;

    @SerializedName("upfront")
    Upfront upfront;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Recurring extends StripeObject {
      /** Total before any discounts or taxes are applied. */
      @SerializedName("amount_subtotal")
      Long amountSubtotal;

      /** Total after discounts and taxes are applied. */
      @SerializedName("amount_total")
      Long amountTotal;

      /**
       * The frequency at which a subscription is billed. One of {@code day}, {@code week}, {@code
       * month} or {@code year}.
       */
      @SerializedName("interval")
      String interval;

      /**
       * The number of intervals (specified in the {@code interval} attribute) between subscription
       * billings. For example, {@code interval=month} and {@code interval_count=3} bills every 3
       * months.
       */
      @SerializedName("interval_count")
      Long intervalCount;

      @SerializedName("total_details")
      TotalDetails totalDetails;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TotalDetails extends StripeObject {
        /** This is the sum of all the discounts. */
        @SerializedName("amount_discount")
        Long amountDiscount;

        /** This is the sum of all the shipping amounts. */
        @SerializedName("amount_shipping")
        Long amountShipping;

        /** This is the sum of all the tax amounts. */
        @SerializedName("amount_tax")
        Long amountTax;

        @SerializedName("breakdown")
        Breakdown breakdown;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Breakdown extends StripeObject {
          /** The aggregated discounts. */
          @SerializedName("discounts")
          List<Quote.Computed.Recurring.TotalDetails.Breakdown.Discount> discounts;

          /** The aggregated tax amounts by rate. */
          @SerializedName("taxes")
          List<Quote.Computed.Recurring.TotalDetails.Breakdown.Tax> taxes;

          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Discount extends StripeObject {
            /** The amount discounted. */
            @SerializedName("amount")
            Long amount;

            /**
             * A discount represents the actual application of a <a
             * href="https://stripe.com/docs/api#coupons">coupon</a> or <a
             * href="https://stripe.com/docs/api#promotion_codes">promotion code</a>. It contains
             * information about when the discount began, when it will end, and what it is applied
             * to.
             *
             * <p>Related guide: <a
             * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying discounts to
             * subscriptions</a>
             */
            @SerializedName("discount")
            com.stripe.model.Discount discount;
          }

          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Tax extends StripeObject {
            /** Amount of tax applied for this rate. */
            @SerializedName("amount")
            Long amount;

            /**
             * Tax rates can be applied to <a
             * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
             * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
             * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
             * Sessions</a> to collect tax.
             *
             * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax
             * rates</a>
             */
            @SerializedName("rate")
            TaxRate rate;

            /**
             * The reasoning behind this tax, for example, if the product is tax exempt. The
             * possible values for this field may be extended as new tax rules are supported.
             *
             * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code
             * not_subject_to_tax}, {@code not_supported}, {@code portion_product_exempt}, {@code
             * portion_reduced_rated}, {@code portion_standard_rated}, {@code product_exempt},
             * {@code product_exempt_holiday}, {@code proportionally_rated}, {@code reduced_rated},
             * {@code reverse_charge}, {@code standard_rated}, {@code taxable_basis_reduced}, or
             * {@code zero_rated}.
             */
            @SerializedName("taxability_reason")
            String taxabilityReason;

            /** The amount on which tax is calculated, in cents (or local equivalent). */
            @SerializedName("taxable_amount")
            Long taxableAmount;
          }
        }
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Upfront extends StripeObject {
      /** Total before any discounts or taxes are applied. */
      @SerializedName("amount_subtotal")
      Long amountSubtotal;

      /** Total after discounts and taxes are applied. */
      @SerializedName("amount_total")
      Long amountTotal;

      /**
       * The line items that will appear on the next invoice after this quote is accepted. This does
       * not include pending invoice items that exist on the customer but may still be included in
       * the next invoice.
       */
      @SerializedName("line_items")
      LineItemCollection lineItems;

      @SerializedName("total_details")
      TotalDetails totalDetails;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TotalDetails extends StripeObject {
        /** This is the sum of all the discounts. */
        @SerializedName("amount_discount")
        Long amountDiscount;

        /** This is the sum of all the shipping amounts. */
        @SerializedName("amount_shipping")
        Long amountShipping;

        /** This is the sum of all the tax amounts. */
        @SerializedName("amount_tax")
        Long amountTax;

        @SerializedName("breakdown")
        Breakdown breakdown;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Breakdown extends StripeObject {
          /** The aggregated discounts. */
          @SerializedName("discounts")
          List<Quote.Computed.Upfront.TotalDetails.Breakdown.Discount> discounts;

          /** The aggregated tax amounts by rate. */
          @SerializedName("taxes")
          List<Quote.Computed.Upfront.TotalDetails.Breakdown.Tax> taxes;

          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Discount extends StripeObject {
            /** The amount discounted. */
            @SerializedName("amount")
            Long amount;

            /**
             * A discount represents the actual application of a <a
             * href="https://stripe.com/docs/api#coupons">coupon</a> or <a
             * href="https://stripe.com/docs/api#promotion_codes">promotion code</a>. It contains
             * information about when the discount began, when it will end, and what it is applied
             * to.
             *
             * <p>Related guide: <a
             * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying discounts to
             * subscriptions</a>
             */
            @SerializedName("discount")
            com.stripe.model.Discount discount;
          }

          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Tax extends StripeObject {
            /** Amount of tax applied for this rate. */
            @SerializedName("amount")
            Long amount;

            /**
             * Tax rates can be applied to <a
             * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
             * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
             * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
             * Sessions</a> to collect tax.
             *
             * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax
             * rates</a>
             */
            @SerializedName("rate")
            TaxRate rate;

            /**
             * The reasoning behind this tax, for example, if the product is tax exempt. The
             * possible values for this field may be extended as new tax rules are supported.
             *
             * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code
             * not_subject_to_tax}, {@code not_supported}, {@code portion_product_exempt}, {@code
             * portion_reduced_rated}, {@code portion_standard_rated}, {@code product_exempt},
             * {@code product_exempt_holiday}, {@code proportionally_rated}, {@code reduced_rated},
             * {@code reverse_charge}, {@code standard_rated}, {@code taxable_basis_reduced}, or
             * {@code zero_rated}.
             */
            @SerializedName("taxability_reason")
            String taxabilityReason;

            /** The amount on which tax is calculated, in cents (or local equivalent). */
            @SerializedName("taxable_amount")
            Long taxableAmount;
          }
        }
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FromQuote extends StripeObject {
    /** Whether this quote is a revision of a different quote. */
    @SerializedName("is_revision")
    Boolean isRevision;

    /** The quote that was cloned. */
    @SerializedName("quote")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Quote> quote;

    /** Get ID of expandable {@code quote} object. */
    public String getQuote() {
      return (this.quote != null) ? this.quote.getId() : null;
    }

    public void setQuote(String id) {
      this.quote = ApiResource.setExpandableFieldId(id, this.quote);
    }

    /** Get expanded {@code quote}. */
    public Quote getQuoteObject() {
      return (this.quote != null) ? this.quote.getExpanded() : null;
    }

    public void setQuoteObject(Quote expandableObject) {
      this.quote = new ExpandableField<Quote>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceSettings extends StripeObject {
    /**
     * Number of days within which a customer must pay invoices generated by this quote. This value
     * will be {@code null} for quotes where {@code collection_method=charge_automatically}.
     */
    @SerializedName("days_until_due")
    Long daysUntilDue;

    @SerializedName("issuer")
    Issuer issuer;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Issuer extends StripeObject {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Account> account;

      /**
       * Type of the account referenced.
       *
       * <p>One of {@code account}, or {@code self}.
       */
      @SerializedName("type")
      String type;

      /** Get ID of expandable {@code account} object. */
      public String getAccount() {
        return (this.account != null) ? this.account.getId() : null;
      }

      public void setAccount(String id) {
        this.account = ApiResource.setExpandableFieldId(id, this.account);
      }

      /** Get expanded {@code account}. */
      public Account getAccountObject() {
        return (this.account != null) ? this.account.getExpanded() : null;
      }

      public void setAccountObject(Account expandableObject) {
        this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time that the quote was accepted. Measured in seconds since Unix epoch. */
    @SerializedName("accepted_at")
    Long acceptedAt;

    /** The time that the quote was canceled. Measured in seconds since Unix epoch. */
    @SerializedName("canceled_at")
    Long canceledAt;

    /** The time that the quote was finalized. Measured in seconds since Unix epoch. */
    @SerializedName("finalized_at")
    Long finalizedAt;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionData extends StripeObject {
    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    String description;

    /**
     * When creating a new subscription, the date of which the subscription schedule will start
     * after the quote is accepted. This date is ignored if it is in the past when the quote is
     * accepted. Measured in seconds since the Unix epoch.
     */
    @SerializedName("effective_date")
    Long effectiveDate;

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
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDetails extends StripeObject {
    /** This is the sum of all the discounts. */
    @SerializedName("amount_discount")
    Long amountDiscount;

    /** This is the sum of all the shipping amounts. */
    @SerializedName("amount_shipping")
    Long amountShipping;

    /** This is the sum of all the tax amounts. */
    @SerializedName("amount_tax")
    Long amountTax;

    @SerializedName("breakdown")
    Breakdown breakdown;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Breakdown extends StripeObject {
      /** The aggregated discounts. */
      @SerializedName("discounts")
      List<Quote.TotalDetails.Breakdown.Discount> discounts;

      /** The aggregated tax amounts by rate. */
      @SerializedName("taxes")
      List<Quote.TotalDetails.Breakdown.Tax> taxes;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Discount extends StripeObject {
        /** The amount discounted. */
        @SerializedName("amount")
        Long amount;

        /**
         * A discount represents the actual application of a <a
         * href="https://stripe.com/docs/api#coupons">coupon</a> or <a
         * href="https://stripe.com/docs/api#promotion_codes">promotion code</a>. It contains
         * information about when the discount began, when it will end, and what it is applied to.
         *
         * <p>Related guide: <a
         * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying discounts to
         * subscriptions</a>
         */
        @SerializedName("discount")
        com.stripe.model.Discount discount;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /** Amount of tax applied for this rate. */
        @SerializedName("amount")
        Long amount;

        /**
         * Tax rates can be applied to <a
         * href="https://stripe.com/docs/billing/invoices/tax-rates">invoices</a>, <a
         * href="https://stripe.com/docs/billing/subscriptions/taxes">subscriptions</a> and <a
         * href="https://stripe.com/docs/payments/checkout/set-up-a-subscription#tax-rates">Checkout
         * Sessions</a> to collect tax.
         *
         * <p>Related guide: <a href="https://stripe.com/docs/billing/taxes/tax-rates">Tax rates</a>
         */
        @SerializedName("rate")
        TaxRate rate;

        /**
         * The reasoning behind this tax, for example, if the product is tax exempt. The possible
         * values for this field may be extended as new tax rules are supported.
         *
         * <p>One of {@code customer_exempt}, {@code not_collecting}, {@code not_subject_to_tax},
         * {@code not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated},
         * {@code portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
         * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
         * standard_rated}, {@code taxable_basis_reduced}, or {@code zero_rated}.
         */
        @SerializedName("taxability_reason")
        String taxabilityReason;

        /** The amount on which tax is calculated, in cents (or local equivalent). */
        @SerializedName("taxable_amount")
        Long taxableAmount;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount in cents (or local equivalent) that will be transferred to the destination account
     * when the invoice is paid. By default, the entire amount is transferred to the destination.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the destination
     * account. By default, the entire amount will be transferred to the destination.
     */
    @SerializedName("amount_percent")
    BigDecimal amountPercent;

    /** The account where funds from the payment will be transferred to upon payment success. */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get ID of expandable {@code destination} object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded {@code destination}. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
    trySetResponseGetter(computed, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(fromQuote, responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(invoiceSettings, responseGetter);
    trySetResponseGetter(lineItems, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(subscription, responseGetter);
    trySetResponseGetter(subscriptionData, responseGetter);
    trySetResponseGetter(subscriptionSchedule, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
    trySetResponseGetter(totalDetails, responseGetter);
    trySetResponseGetter(transferData, responseGetter);
  }
}

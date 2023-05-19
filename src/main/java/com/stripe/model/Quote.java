// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.QuoteAcceptParams;
import com.stripe.param.QuoteCancelParams;
import com.stripe.param.QuoteCreateParams;
import com.stripe.param.QuoteDraftQuoteParams;
import com.stripe.param.QuoteFinalizeQuoteParams;
import com.stripe.param.QuoteListComputedUpfrontLineItemsParams;
import com.stripe.param.QuoteListLineItemsParams;
import com.stripe.param.QuoteListLinesParams;
import com.stripe.param.QuoteListParams;
import com.stripe.param.QuoteMarkStaleQuoteParams;
import com.stripe.param.QuotePdfParams;
import com.stripe.param.QuotePreviewInvoicesParams;
import com.stripe.param.QuotePreviewSubscriptionSchedulesParams;
import com.stripe.param.QuoteReestimateParams;
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
   * percentage of the subscription invoice subtotal that will be transferred to the application
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

  /** All invoices will be billed using the specified settings. */
  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

  /** A list of items the customer is being quoted for. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

  /**
   * A list of lines on the quote. These lines describe changes that will be used to create new
   * subscription schedules or update existing subscription schedules when the quote is accepted.
   */
  @SerializedName("lines")
  List<String> lines;

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
   * <p>One of {@code accepted}, {@code accepting}, {@code canceled}, {@code draft}, {@code open},
   * or {@code stale}.
   */
  @SerializedName("status")
  String status;

  /** Details on when and why a quote has been marked as stale or canceled. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The subscription that was created or updated from this quote. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  @SerializedName("subscription_data_overrides")
  List<Quote.SubscriptionDataOverride> subscriptionDataOverrides;

  /** The subscription schedule that was created or updated from this quote. */
  @SerializedName("subscription_schedule")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<com.stripe.model.SubscriptionSchedule> subscriptionSchedule;

  /** The subscription schedules that were created or updated from this quote. */
  @SerializedName("subscription_schedules")
  List<Quote.SubscriptionSchedule> subscriptionSchedules;

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
  public com.stripe.model.SubscriptionSchedule getSubscriptionScheduleObject() {
    return (this.subscriptionSchedule != null) ? this.subscriptionSchedule.getExpanded() : null;
  }

  public void setSubscriptionScheduleObject(
      com.stripe.model.SubscriptionSchedule expandableObject) {
    this.subscriptionSchedule =
        new ExpandableField<com.stripe.model.SubscriptionSchedule>(
            expandableObject.getId(), expandableObject);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/accept", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Accepts the specified quote. */
  public Quote accept(QuoteAcceptParams params) throws StripeException {
    return accept(params, (RequestOptions) null);
  }

  /** Accepts the specified quote. */
  public Quote accept(QuoteAcceptParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/accept", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Cancels the quote. */
  public Quote cancel(QuoteCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels the quote. */
  public Quote cancel(QuoteCancelParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
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
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/quotes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
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
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/quotes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Converts a stale quote to draft. */
  public Quote draftQuote() throws StripeException {
    return draftQuote((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Converts a stale quote to draft. */
  public Quote draftQuote(RequestOptions options) throws StripeException {
    return draftQuote((Map<String, Object>) null, options);
  }

  /** Converts a stale quote to draft. */
  public Quote draftQuote(Map<String, Object> params) throws StripeException {
    return draftQuote(params, (RequestOptions) null);
  }

  /** Converts a stale quote to draft. */
  public Quote draftQuote(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/mark_draft", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Converts a stale quote to draft. */
  public Quote draftQuote(QuoteDraftQuoteParams params) throws StripeException {
    return draftQuote(params, (RequestOptions) null);
  }

  /** Converts a stale quote to draft. */
  public Quote draftQuote(QuoteDraftQuoteParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/mark_draft", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/finalize", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(QuoteFinalizeQuoteParams params) throws StripeException {
    return finalizeQuote(params, (RequestOptions) null);
  }

  /** Finalizes the quote. */
  public Quote finalizeQuote(QuoteFinalizeQuoteParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/finalize", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/quotes");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, QuoteCollection.class, options);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(QuoteListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your quotes. */
  public static QuoteCollection list(QuoteListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/quotes");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, QuoteCollection.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/quotes/%s/computed_upfront_line_items",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, LineItemCollection.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/quotes/%s/computed_upfront_line_items",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, LineItemCollection.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, LineItemCollection.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, LineItemCollection.class, options);
  }

  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public QuoteLineCollection listLines() throws StripeException {
    return listLines((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public QuoteLineCollection listLines(Map<String, Object> params) throws StripeException {
    return listLines(params, (RequestOptions) null);
  }

  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public QuoteLineCollection listLines(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/lines", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, QuoteLineCollection.class, options);
  }

  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public QuoteLineCollection listLines(QuoteListLinesParams params) throws StripeException {
    return listLines(params, (RequestOptions) null);
  }

  /**
   * Retrieves a paginated list of lines for a quote. These lines describe changes that will be used
   * to create new subscription schedules or update existing subscription schedules when the quote
   * is accepted.
   */
  public QuoteLineCollection listLines(QuoteListLinesParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/lines", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, QuoteLineCollection.class, options);
  }

  /** Converts a draft or open quote to stale. */
  public Quote markStaleQuote() throws StripeException {
    return markStaleQuote((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Converts a draft or open quote to stale. */
  public Quote markStaleQuote(RequestOptions options) throws StripeException {
    return markStaleQuote((Map<String, Object>) null, options);
  }

  /** Converts a draft or open quote to stale. */
  public Quote markStaleQuote(Map<String, Object> params) throws StripeException {
    return markStaleQuote(params, (RequestOptions) null);
  }

  /** Converts a draft or open quote to stale. */
  public Quote markStaleQuote(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/mark_stale", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Converts a draft or open quote to stale. */
  public Quote markStaleQuote(QuoteMarkStaleQuoteParams params) throws StripeException {
    return markStaleQuote(params, (RequestOptions) null);
  }

  /** Converts a draft or open quote to stale. */
  public Quote markStaleQuote(QuoteMarkStaleQuoteParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/mark_stale", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Download the PDF for a finalized quote. */
  public InputStream pdf() throws StripeException {
    return pdf((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Download the PDF for a finalized quote. */
  public InputStream pdf(Map<String, Object> params) throws StripeException {
    return pdf(params, (RequestOptions) null);
  }

  /** Download the PDF for a finalized quote. */
  public InputStream pdf(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getUploadBase(),
            options,
            String.format("/v1/quotes/%s/pdf", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestStream(ApiResource.RequestMethod.GET, url, params, options);
  }

  /** Download the PDF for a finalized quote. */
  public InputStream pdf(QuotePdfParams params) throws StripeException {
    return pdf(params, (RequestOptions) null);
  }

  /** Download the PDF for a finalized quote. */
  public InputStream pdf(QuotePdfParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getUploadBase(),
            options,
            String.format("/v1/quotes/%s/pdf", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestStream(ApiResource.RequestMethod.GET, url, params, options);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public InvoiceCollection previewInvoices() throws StripeException {
    return previewInvoices((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public InvoiceCollection previewInvoices(Map<String, Object> params) throws StripeException {
    return previewInvoices(params, (RequestOptions) null);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public InvoiceCollection previewInvoices(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/preview_invoices", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, InvoiceCollection.class, options);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public InvoiceCollection previewInvoices(QuotePreviewInvoicesParams params)
      throws StripeException {
    return previewInvoices(params, (RequestOptions) null);
  }

  /** Preview the invoices that would be generated by accepting the quote. */
  public InvoiceCollection previewInvoices(
      QuotePreviewInvoicesParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/preview_invoices", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, InvoiceCollection.class, options);
  }

  /** Preview the schedules that would be generated by accepting the quote. */
  public SubscriptionScheduleCollection previewSubscriptionSchedules() throws StripeException {
    return previewSubscriptionSchedules((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Preview the schedules that would be generated by accepting the quote. */
  public SubscriptionScheduleCollection previewSubscriptionSchedules(Map<String, Object> params)
      throws StripeException {
    return previewSubscriptionSchedules(params, (RequestOptions) null);
  }

  /** Preview the schedules that would be generated by accepting the quote. */
  public SubscriptionScheduleCollection previewSubscriptionSchedules(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/quotes/%s/preview_subscription_schedules",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SubscriptionScheduleCollection.class, options);
  }

  /** Preview the schedules that would be generated by accepting the quote. */
  public SubscriptionScheduleCollection previewSubscriptionSchedules(
      QuotePreviewSubscriptionSchedulesParams params) throws StripeException {
    return previewSubscriptionSchedules(params, (RequestOptions) null);
  }

  /** Preview the schedules that would be generated by accepting the quote. */
  public SubscriptionScheduleCollection previewSubscriptionSchedules(
      QuotePreviewSubscriptionSchedulesParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/quotes/%s/preview_subscription_schedules",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, SubscriptionScheduleCollection.class, options);
  }

  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate() throws StripeException {
    return reestimate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(RequestOptions options) throws StripeException {
    return reestimate((Map<String, Object>) null, options);
  }

  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(Map<String, Object> params) throws StripeException {
    return reestimate(params, (RequestOptions) null);
  }

  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/reestimate", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(QuoteReestimateParams params) throws StripeException {
    return reestimate(params, (RequestOptions) null);
  }

  /** Recompute the upcoming invoice estimate for the quote. */
  public Quote reestimate(QuoteReestimateParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s/reestimate", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
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
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s", ApiResource.urlEncodeId(quote)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Quote.class, options);
  }

  /** Retrieves the quote with the given ID. */
  public static Quote retrieve(String quote, QuoteRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s", ApiResource.urlEncodeId(quote)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Quote.class, options);
  }

  /** A quote models prices and services for a customer. */
  @Override
  public Quote update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** A quote models prices and services for a customer. */
  @Override
  public Quote update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** A quote models prices and services for a customer. */
  public Quote update(QuoteUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** A quote models prices and services for a customer. */
  public Quote update(QuoteUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/quotes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Quote.class, options);
  }

  /** Preview the invoice line items that would be generated by accepting the quote. */
  public InvoiceLineItemCollection previewInvoiceLines(
      String invoice, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/quotes/%s/preview_invoices/%s/lines",
                ApiResource.urlEncodeId(this.getId()), ApiResource.urlEncodeId(invoice)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, InvoiceLineItemCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Automatically calculate taxes. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The status of the most recent automated tax calculation for this quote.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;
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

    /** The time at which the quote's estimated schedules and upcoming invoices were generated. */
    @SerializedName("updated_at")
    Long updatedAt;

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
             * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying Discounts to
             * Subscriptions</a>.
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
             * Rates</a>.
             */
            @SerializedName("rate")
            TaxRate rate;

            /**
             * The reasoning behind this tax, for example, if the product is tax exempt. The
             * possible values for this field may be extended as new tax rules are supported.
             *
             * <p>One of {@code customer_exempt}, {@code excluded_territory}, {@code
             * jurisdiction_unsupported}, {@code not_collecting}, {@code not_subject_to_tax}, {@code
             * not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated}, {@code
             * portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
             * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
             * standard_rated}, {@code taxable_basis_reduced}, {@code vat_exempt}, or {@code
             * zero_rated}.
             */
            @SerializedName("taxability_reason")
            String taxabilityReason;

            /** The amount on which tax is calculated, in %s. */
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
             * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying Discounts to
             * Subscriptions</a>.
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
             * Rates</a>.
             */
            @SerializedName("rate")
            TaxRate rate;

            /**
             * The reasoning behind this tax, for example, if the product is tax exempt. The
             * possible values for this field may be extended as new tax rules are supported.
             *
             * <p>One of {@code customer_exempt}, {@code excluded_territory}, {@code
             * jurisdiction_unsupported}, {@code not_collecting}, {@code not_subject_to_tax}, {@code
             * not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated}, {@code
             * portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday},
             * {@code proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
             * standard_rated}, {@code taxable_basis_reduced}, {@code vat_exempt}, or {@code
             * zero_rated}.
             */
            @SerializedName("taxability_reason")
            String taxabilityReason;

            /** The amount on which tax is calculated, in %s. */
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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("canceled")
    Canceled canceled;

    @SerializedName("stale")
    Stale stale;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /**
       * The reason this quote was marked as canceled.
       *
       * <p>One of {@code canceled}, {@code quote_accepted}, {@code quote_expired}, {@code
       * quote_superseded}, or {@code subscription_canceled}.
       */
      @SerializedName("reason")
      String reason;

      /**
       * Time at which the quote was marked as canceled. Measured in seconds since the Unix epoch.
       */
      @SerializedName("transitioned_at")
      Long transitionedAt;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Stale extends StripeObject {
      /** Time at which the quote expires. Measured in seconds since the Unix epoch. */
      @SerializedName("expires_at")
      Long expiresAt;

      /** The most recent reason this quote was marked as stale. */
      @SerializedName("last_reason")
      LastReason lastReason;

      /** Time at which the stale reason was updated. Measured in seconds since the Unix epoch. */
      @SerializedName("last_updated_at")
      Long lastUpdatedAt;

      /** Time at which the quote was marked as stale. Measured in seconds since the Unix epoch. */
      @SerializedName("transitioned_at")
      Long transitionedAt;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class LastReason extends StripeObject {
        /** The ID of the line that is invalid if the stale reason type is {@code line_invalid}. */
        @SerializedName("line_invalid")
        String lineInvalid;

        /** The ID of the subscription that was canceled. */
        @SerializedName("subscription_canceled")
        String subscriptionCanceled;

        @SerializedName("subscription_changed")
        SubscriptionChanged subscriptionChanged;

        /** The ID of the subscription that was expired. */
        @SerializedName("subscription_expired")
        String subscriptionExpired;

        /** The ID of the subscription schedule that was canceled. */
        @SerializedName("subscription_schedule_canceled")
        String subscriptionScheduleCanceled;

        @SerializedName("subscription_schedule_changed")
        SubscriptionScheduleChanged subscriptionScheduleChanged;

        /** The ID of the subscription schedule that was released. */
        @SerializedName("subscription_schedule_released")
        String subscriptionScheduleReleased;

        /**
         * The reason the quote was marked as stale.
         *
         * <p>One of {@code bill_on_acceptance_invalid}, {@code line_invalid}, {@code marked_stale},
         * {@code subscription_canceled}, {@code subscription_changed}, {@code
         * subscription_expired}, {@code subscription_schedule_canceled}, {@code
         * subscription_schedule_changed}, or {@code subscription_schedule_released}.
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SubscriptionChanged extends StripeObject {
          /** The subscription's state before the quote was marked as stale. */
          @SerializedName("previous_subscription")
          Subscription previousSubscription;
        }

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SubscriptionScheduleChanged extends StripeObject {
          /** The subscription schedule's state before the quote was marked as stale. */
          @SerializedName("previous_subscription_schedule")
          com.stripe.model.SubscriptionSchedule previousSubscriptionSchedule;
        }
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
    /** Describes the period to bill for upon accepting the quote. */
    @SerializedName("bill_on_acceptance")
    BillOnAcceptance billOnAcceptance;

    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time.{@code prorate_up_front} will bill for all
     * phases within the current billing cycle up front.
     *
     * <p>One of {@code prorate_on_next_phase}, or {@code prorate_up_front}.
     */
    @SerializedName("billing_behavior")
    String billingBehavior;

    /**
     * Whether the subscription will always start a new billing period when the quote is accepted.
     *
     * <p>Equal to {@code reset}.
     */
    @SerializedName("billing_cycle_anchor")
    String billingCycleAnchor;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription.
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
     * Behavior of the subscription schedule and underlying subscription when it ends.
     *
     * <p>One of {@code cancel}, or {@code release}.
     */
    @SerializedName("end_behavior")
    String endBehavior;

    /** The id of the subscription schedule that will be updated when the quote is accepted. */
    @SerializedName("from_schedule")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<com.stripe.model.SubscriptionSchedule> fromSchedule;

    /** The id of the subscription that will be updated when the quote is accepted. */
    @SerializedName("from_subscription")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Subscription> fromSubscription;

    /**
     * If specified, the invoicing for the given billing cycle iterations will be processed when the
     * quote is accepted. Cannot be used with {@code effective_date}.
     */
    @SerializedName("prebilling")
    Prebilling prebilling;

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
     * quote is accepted.
     *
     * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
     */
    @SerializedName("proration_behavior")
    String prorationBehavior;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    /** Get ID of expandable {@code fromSchedule} object. */
    public String getFromSchedule() {
      return (this.fromSchedule != null) ? this.fromSchedule.getId() : null;
    }

    public void setFromSchedule(String id) {
      this.fromSchedule = ApiResource.setExpandableFieldId(id, this.fromSchedule);
    }

    /** Get expanded {@code fromSchedule}. */
    public com.stripe.model.SubscriptionSchedule getFromScheduleObject() {
      return (this.fromSchedule != null) ? this.fromSchedule.getExpanded() : null;
    }

    public void setFromScheduleObject(com.stripe.model.SubscriptionSchedule expandableObject) {
      this.fromSchedule =
          new ExpandableField<com.stripe.model.SubscriptionSchedule>(
              expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code fromSubscription} object. */
    public String getFromSubscription() {
      return (this.fromSubscription != null) ? this.fromSubscription.getId() : null;
    }

    public void setFromSubscription(String id) {
      this.fromSubscription = ApiResource.setExpandableFieldId(id, this.fromSubscription);
    }

    /** Get expanded {@code fromSubscription}. */
    public Subscription getFromSubscriptionObject() {
      return (this.fromSubscription != null) ? this.fromSubscription.getExpanded() : null;
    }

    public void setFromSubscriptionObject(Subscription expandableObject) {
      this.fromSubscription =
          new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillOnAcceptance extends StripeObject {
      /** The start of the period to bill from when the Quote is accepted. */
      @SerializedName("bill_from")
      BillFrom billFrom;

      /** The end of the period to bill until when the Quote is accepted. */
      @SerializedName("bill_until")
      BillUntil billUntil;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillFrom extends StripeObject {
        /** The materialized time. */
        @SerializedName("computed")
        Long computed;

        /** The timestamp the given line starts at. */
        @SerializedName("line_starts_at")
        LineStartsAt lineStartsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * The type of method to specify the {@code bill_from} time.
         *
         * <p>One of {@code line_starts_at}, {@code now}, {@code quote_acceptance_date}, or {@code
         * timestamp}.
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class LineStartsAt extends StripeObject implements HasId {
          /** Unique identifier for the object. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;
        }
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillUntil extends StripeObject {
        /** The materialized time. */
        @SerializedName("computed")
        Long computed;

        /** Time span for the quote line starting from the {@code starts_at} date. */
        @SerializedName("duration")
        Duration duration;

        /** The timestamp the given line ends at. */
        @SerializedName("line_ends_at")
        LineEndsAt lineEndsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * The type of method to specify the {@code bill_until} time.
         *
         * <p>One of {@code duration}, {@code line_ends_at}, {@code schedule_end}, {@code
         * timestamp}, or {@code upcoming_invoice}.
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Duration extends StripeObject {
          /**
           * Specifies a type of interval unit. Either {@code day}, {@code week}, {@code month} or
           * {@code year}.
           *
           * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
           */
          @SerializedName("interval")
          String interval;

          /**
           * The number of intervals, as an whole number greater than 0. Stripe multiplies this by
           * the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;
        }

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class LineEndsAt extends StripeObject implements HasId {
          /** Unique identifier for the object. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;
        }
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Prebilling extends StripeObject {
      @SerializedName("iterations")
      Long iterations;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionDataOverride extends StripeObject {
    @SerializedName("applies_to")
    AppliesTo appliesTo;

    /** Describes the period to bill for upon accepting the quote. */
    @SerializedName("bill_on_acceptance")
    BillOnAcceptance billOnAcceptance;

    /**
     * Configures when the subscription schedule generates prorations for phase transitions.
     * Possible values are {@code prorate_on_next_phase} or {@code prorate_up_front} with the
     * default being {@code prorate_on_next_phase}. {@code prorate_on_next_phase} will apply phase
     * changes and generate prorations at transition time.{@code prorate_up_front} will bill for all
     * phases within the current billing cycle up front.
     *
     * <p>One of {@code prorate_on_next_phase}, or {@code prorate_up_front}.
     */
    @SerializedName("billing_behavior")
    String billingBehavior;

    /**
     * The customer which this quote belongs to. A customer is required before finalizing the quote.
     * Once specified, it cannot be changed.
     */
    @SerializedName("customer")
    String customer;

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription.
     */
    @SerializedName("description")
    String description;

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends.
     *
     * <p>One of {@code cancel}, or {@code release}.
     */
    @SerializedName("end_behavior")
    String endBehavior;

    /**
     * Determines how to handle <a
     * href="https://stripe.com/docs/subscriptions/billing-cycle#prorations">prorations</a> when the
     * quote is accepted.
     *
     * <p>One of {@code always_invoice}, {@code create_prorations}, or {@code none}.
     */
    @SerializedName("proration_behavior")
    String prorationBehavior;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AppliesTo extends StripeObject {
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
       * Describes whether the quote line is affecting a new schedule or an existing schedule.
       *
       * <p>One of {@code new_reference}, or {@code subscription_schedule}.
       */
      @SerializedName("type")
      String type;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillOnAcceptance extends StripeObject {
      /** The start of the period to bill from when the Quote is accepted. */
      @SerializedName("bill_from")
      BillFrom billFrom;

      /** The end of the period to bill until when the Quote is accepted. */
      @SerializedName("bill_until")
      BillUntil billUntil;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillFrom extends StripeObject {
        /** The materialized time. */
        @SerializedName("computed")
        Long computed;

        /** The timestamp the given line starts at. */
        @SerializedName("line_starts_at")
        LineStartsAt lineStartsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * The type of method to specify the {@code bill_from} time.
         *
         * <p>One of {@code line_starts_at}, {@code now}, {@code quote_acceptance_date}, or {@code
         * timestamp}.
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class LineStartsAt extends StripeObject implements HasId {
          /** Unique identifier for the object. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;
        }
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillUntil extends StripeObject {
        /** The materialized time. */
        @SerializedName("computed")
        Long computed;

        /** Time span for the quote line starting from the {@code starts_at} date. */
        @SerializedName("duration")
        Duration duration;

        /** The timestamp the given line ends at. */
        @SerializedName("line_ends_at")
        LineEndsAt lineEndsAt;

        /** A precise Unix timestamp. */
        @SerializedName("timestamp")
        Long timestamp;

        /**
         * The type of method to specify the {@code bill_until} time.
         *
         * <p>One of {@code duration}, {@code line_ends_at}, {@code schedule_end}, {@code
         * timestamp}, or {@code upcoming_invoice}.
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Duration extends StripeObject {
          /**
           * Specifies a type of interval unit. Either {@code day}, {@code week}, {@code month} or
           * {@code year}.
           *
           * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
           */
          @SerializedName("interval")
          String interval;

          /**
           * The number of intervals, as an whole number greater than 0. Stripe multiplies this by
           * the interval type to get the overall duration.
           */
          @SerializedName("interval_count")
          Long intervalCount;
        }

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class LineEndsAt extends StripeObject implements HasId {
          /** Unique identifier for the object. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;
        }
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionSchedule extends StripeObject {
    @SerializedName("applies_to")
    AppliesTo appliesTo;

    /** The subscription schedule that was created or updated from this quote. */
    @SerializedName("subscription_schedule")
    String subscriptionSchedule;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AppliesTo extends StripeObject {
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
       * Describes whether the quote line is affecting a new schedule or an existing schedule.
       *
       * <p>One of {@code new_reference}, or {@code subscription_schedule}.
       */
      @SerializedName("type")
      String type;
    }
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
         * href="https://stripe.com/docs/billing/subscriptions/discounts">Applying Discounts to
         * Subscriptions</a>.
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
         * Rates</a>.
         */
        @SerializedName("rate")
        TaxRate rate;

        /**
         * The reasoning behind this tax, for example, if the product is tax exempt. The possible
         * values for this field may be extended as new tax rules are supported.
         *
         * <p>One of {@code customer_exempt}, {@code excluded_territory}, {@code
         * jurisdiction_unsupported}, {@code not_collecting}, {@code not_subject_to_tax}, {@code
         * not_supported}, {@code portion_product_exempt}, {@code portion_reduced_rated}, {@code
         * portion_standard_rated}, {@code product_exempt}, {@code product_exempt_holiday}, {@code
         * proportionally_rated}, {@code reduced_rated}, {@code reverse_charge}, {@code
         * standard_rated}, {@code taxable_basis_reduced}, {@code vat_exempt}, or {@code
         * zero_rated}.
         */
        @SerializedName("taxability_reason")
        String taxabilityReason;

        /** The amount on which tax is calculated, in %s. */
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
     * The amount in %s that will be transferred to the destination account when the invoice is
     * paid. By default, the entire amount is transferred to the destination.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice subtotal that will be transferred to the
     * destination account. By default, the entire amount will be transferred to the destination.
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
}

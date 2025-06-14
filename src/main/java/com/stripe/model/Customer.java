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
import com.stripe.param.CustomerBalanceTransactionsParams;
import com.stripe.param.CustomerCashBalanceTransactionsParams;
import com.stripe.param.CustomerCreateFundingInstructionsParams;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.CustomerFundCashBalanceParams;
import com.stripe.param.CustomerListParams;
import com.stripe.param.CustomerListPaymentMethodsParams;
import com.stripe.param.CustomerRetrieveParams;
import com.stripe.param.CustomerRetrievePaymentMethodParams;
import com.stripe.param.CustomerSearchParams;
import com.stripe.param.CustomerUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This object represents a customer of your business. Use it to <a
 * href="https://stripe.com/docs/invoicing/customer">create recurring charges</a>, <a
 * href="https://stripe.com/docs/payments/save-during-payment">save payment</a> and contact
 * information, and track payments that belong to the same customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Customer extends ApiResource implements HasId, MetadataStore<Customer> {
  /** The customer's address. */
  @SerializedName("address")
  Address address;

  /**
   * The current balance, if any, that's stored on the customer. If negative, the customer has
   * credit to apply to their next invoice. If positive, the customer has an amount owed that's
   * added to their next invoice. The balance only considers amounts that Stripe hasn't successfully
   * applied to any invoice. It doesn't reflect unpaid invoices. This balance is only taken into
   * account after invoices finalize.
   */
  @SerializedName("balance")
  Long balance;

  /**
   * The current funds being held by Stripe on behalf of the customer. You can apply these funds
   * towards payment intents when the source is &quot;cash_balance&quot;. The {@code
   * settings[reconciliation_mode]} field describes if these funds apply to these payment intents
   * manually or automatically.
   */
  @SerializedName("cash_balance")
  CashBalance cashBalance;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> the
   * customer can be charged in for recurring billing purposes.
   */
  @SerializedName("currency")
  String currency;

  /**
   * ID of the default payment source for the customer.
   *
   * <p>If you use payment methods created through the PaymentMethods API, see the <a
   * href="https://stripe.com/docs/api/customers/object#customer_object-invoice_settings-default_payment_method">invoice_settings.default_payment_method</a>
   * field instead.
   */
  @SerializedName("default_source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentSource> defaultSource;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * Tracks the most recent state change on any invoice belonging to the customer. Paying an invoice
   * or marking it uncollectible via the API will set this field to false. An automatic payment
   * failure or passing the {@code invoice.due_date} will set this field to {@code true}.
   *
   * <p>If an invoice becomes uncollectible by <a
   * href="https://stripe.com/docs/billing/automatic-collection">dunning</a>, {@code delinquent}
   * doesn't reset to {@code false}.
   *
   * <p>If you care whether the customer has paid their most recent subscription invoice, use {@code
   * subscription.status} instead. Paying or marking uncollectible any customer invoice regardless
   * of whether it is the latest invoice for a subscription will always set this field to {@code
   * false}.
   */
  @SerializedName("delinquent")
  Boolean delinquent;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Describes the current discount active on the customer, if there is one. */
  @SerializedName("discount")
  Discount discount;

  /** The customer's email address. */
  @SerializedName("email")
  String email;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The current multi-currency balances, if any, that's stored on the customer. If positive in a
   * currency, the customer has a credit to apply to their next invoice denominated in that
   * currency. If negative, the customer has an amount owed that's added to their next invoice
   * denominated in that currency. These balances don't apply to unpaid invoices. They solely track
   * amounts that Stripe hasn't successfully applied to any invoice. Stripe only applies a balance
   * in a specific currency to an invoice after that invoice (which is in the same currency)
   * finalizes.
   */
  @SerializedName("invoice_credit_balance")
  Map<String, Long> invoiceCreditBalance;

  /** The prefix for the customer used to generate unique invoice numbers. */
  @SerializedName("invoice_prefix")
  String invoicePrefix;

  @SerializedName("invoice_settings")
  InvoiceSettings invoiceSettings;

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

  /** The customer's full name or business name. */
  @SerializedName("name")
  String name;

  /**
   * The suffix of the customer's next invoice number (for example, 0001). When the account uses
   * account level sequencing, this parameter is ignored in API requests and the field omitted in
   * API responses.
   */
  @SerializedName("next_invoice_sequence")
  Long nextInvoiceSequence;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code customer}.
   */
  @SerializedName("object")
  String object;

  /** The customer's phone number. */
  @SerializedName("phone")
  String phone;

  /** The customer's preferred locales (languages), ordered by preference. */
  @SerializedName("preferred_locales")
  List<String> preferredLocales;

  /**
   * Mailing and shipping address for the customer. Appears on invoices emailed to this customer.
   */
  @SerializedName("shipping")
  ShippingDetails shipping;

  /** The customer's payment sources, if any. */
  @SerializedName("sources")
  PaymentSourceCollection sources;

  /** The customer's current subscriptions, if any. */
  @SerializedName("subscriptions")
  SubscriptionCollection subscriptions;

  @SerializedName("tax")
  Tax tax;

  /**
   * Describes the customer's tax exemption status, which is {@code none}, {@code exempt}, or {@code
   * reverse}. When set to {@code reverse}, invoice and receipt PDFs include the following text:
   * <strong>&quot;Reverse charge&quot;</strong>.
   *
   * <p>One of {@code exempt}, {@code none}, or {@code reverse}.
   */
  @SerializedName("tax_exempt")
  String taxExempt;

  /** The customer's tax IDs. */
  @SerializedName("tax_ids")
  TaxIdCollection taxIds;

  /** ID of the test clock that this customer belongs to. */
  @SerializedName("test_clock")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TestClock> testClock;

  /** Get ID of expandable {@code defaultSource} object. */
  public String getDefaultSource() {
    return (this.defaultSource != null) ? this.defaultSource.getId() : null;
  }

  public void setDefaultSource(String id) {
    this.defaultSource = ApiResource.setExpandableFieldId(id, this.defaultSource);
  }

  /** Get expanded {@code defaultSource}. */
  public PaymentSource getDefaultSourceObject() {
    return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
  }

  public void setDefaultSourceObject(PaymentSource expandableObject) {
    this.defaultSource =
        new ExpandableField<PaymentSource>(expandableObject.getId(), expandableObject);
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

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection balanceTransactions() throws StripeException {
    return balanceTransactions((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection balanceTransactions(Map<String, Object> params)
      throws StripeException {
    return balanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection balanceTransactions(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/balance_transactions", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, CustomerBalanceTransactionCollection.class);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection balanceTransactions(
      CustomerBalanceTransactionsParams params) throws StripeException {
    return balanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that updated the customer’s <a
   * href="https://stripe.com/docs/billing/customer/balance">balances</a>.
   */
  public CustomerBalanceTransactionCollection balanceTransactions(
      CustomerBalanceTransactionsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/balance_transactions", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CustomerBalanceTransactionCollection.class);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection cashBalanceTransactions() throws StripeException {
    return cashBalanceTransactions((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection cashBalanceTransactions(
      Map<String, Object> params) throws StripeException {
    return cashBalanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection cashBalanceTransactions(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/cash_balance_transactions", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, CustomerCashBalanceTransactionCollection.class);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection cashBalanceTransactions(
      CustomerCashBalanceTransactionsParams params) throws StripeException {
    return cashBalanceTransactions(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that modified the customer’s <a
   * href="https://stripe.com/docs/payments/customer-balance">cash balance</a>.
   */
  public CustomerCashBalanceTransactionCollection cashBalanceTransactions(
      CustomerCashBalanceTransactionsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/cash_balance_transactions", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, CustomerCashBalanceTransactionCollection.class);
  }

  /** Creates a new customer object. */
  public static Customer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new customer object. */
  public static Customer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Customer.class);
  }

  /** Creates a new customer object. */
  public static Customer create(CustomerCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new customer object. */
  public static Customer create(CustomerCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Customer.class);
  }

  /**
   * Retrieve funding instructions for a customer cash balance. If funding instructions do not yet
   * exist for the customer, new funding instructions will be created. If funding instructions have
   * already been created for a given customer, the same funding instructions will be retrieved. In
   * other words, we will return the same funding instructions each time.
   */
  public FundingInstructions createFundingInstructions(Map<String, Object> params)
      throws StripeException {
    return createFundingInstructions(params, (RequestOptions) null);
  }

  /**
   * Retrieve funding instructions for a customer cash balance. If funding instructions do not yet
   * exist for the customer, new funding instructions will be created. If funding instructions have
   * already been created for a given customer, the same funding instructions will be retrieved. In
   * other words, we will return the same funding instructions each time.
   */
  public FundingInstructions createFundingInstructions(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/funding_instructions", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, FundingInstructions.class);
  }

  /**
   * Retrieve funding instructions for a customer cash balance. If funding instructions do not yet
   * exist for the customer, new funding instructions will be created. If funding instructions have
   * already been created for a given customer, the same funding instructions will be retrieved. In
   * other words, we will return the same funding instructions each time.
   */
  public FundingInstructions createFundingInstructions(
      CustomerCreateFundingInstructionsParams params) throws StripeException {
    return createFundingInstructions(params, (RequestOptions) null);
  }

  /**
   * Retrieve funding instructions for a customer cash balance. If funding instructions do not yet
   * exist for the customer, new funding instructions will be created. If funding instructions have
   * already been created for a given customer, the same funding instructions will be retrieved. In
   * other words, we will return the same funding instructions each time.
   */
  public FundingInstructions createFundingInstructions(
      CustomerCreateFundingInstructionsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/funding_instructions", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, FundingInstructions.class);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Customer.class);
  }

  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount() throws StripeException {
    return deleteDiscount((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount(Map<String, Object> params) throws StripeException {
    return deleteDiscount(params, (RequestOptions) null);
  }

  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/discount", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Discount.class);
  }

  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public static CustomerCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public static CustomerCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerCollection.class);
  }

  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public static CustomerCollection list(CustomerListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public static CustomerCollection list(CustomerListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerCollection.class);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods() throws StripeException {
    return listPaymentMethods((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(Map<String, Object> params)
      throws StripeException {
    return listPaymentMethods(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/customers/%s/payment_methods", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, PaymentMethodCollection.class);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(CustomerListPaymentMethodsParams params)
      throws StripeException {
    return listPaymentMethods(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(
      CustomerListPaymentMethodsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/customers/%s/payment_methods", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentMethodCollection.class);
  }

  /** Retrieves a Customer object. */
  public static Customer retrieve(String customer) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Customer object. */
  public static Customer retrieve(String customer, RequestOptions options) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, options);
  }

  /** Retrieves a Customer object. */
  public static Customer retrieve(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Customer.class);
  }

  /** Retrieves a Customer object. */
  public static Customer retrieve(
      String customer, CustomerRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Customer.class);
  }

  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrievePaymentMethod(String paymentMethod) throws StripeException {
    return retrievePaymentMethod(paymentMethod, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrievePaymentMethod(String paymentMethod, RequestOptions options)
      throws StripeException {
    return retrievePaymentMethod(paymentMethod, (Map<String, Object>) null, options);
  }

  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrievePaymentMethod(String paymentMethod, Map<String, Object> params)
      throws StripeException {
    return retrievePaymentMethod(paymentMethod, params, (RequestOptions) null);
  }

  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrievePaymentMethod(
      String paymentMethod, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/payment_methods/%s",
            ApiResource.urlEncodeId(this.getId()), ApiResource.urlEncodeId(paymentMethod));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, PaymentMethod.class);
  }

  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrievePaymentMethod(
      String paymentMethod, CustomerRetrievePaymentMethodParams params) throws StripeException {
    return retrievePaymentMethod(paymentMethod, params, (RequestOptions) null);
  }

  /** Retrieves a PaymentMethod object for a given Customer. */
  public PaymentMethod retrievePaymentMethod(
      String paymentMethod, CustomerRetrievePaymentMethodParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/payment_methods/%s",
            ApiResource.urlEncodeId(this.getId()), ApiResource.urlEncodeId(paymentMethod));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentMethod.class);
  }

  /**
   * Search for customers you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static CustomerSearchResult search(Map<String, Object> params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for customers you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static CustomerSearchResult search(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers/search";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerSearchResult.class);
  }

  /**
   * Search for customers you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static CustomerSearchResult search(CustomerSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for customers you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static CustomerSearchResult search(CustomerSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/customers/search";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerSearchResult.class);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  @Override
  public Customer update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  @Override
  public Customer update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Customer.class);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(CustomerUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the {@code past_due} state, then the latest open
   * invoice for the subscription with automatic collection enabled will be retried. This retry will
   * not count as an automatic retry, and will not affect the next regularly scheduled payment for
   * the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this
   * behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(CustomerUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Customer.class);
  }

  /**
   * For more details about InvoiceSettings, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceSettings extends StripeObject {
    /** Default custom fields to be displayed on invoices for this customer. */
    @SerializedName("custom_fields")
    List<Customer.InvoiceSettings.CustomField> customFields;

    /**
     * ID of a payment method that's attached to the customer, to be used as the customer's default
     * payment method for subscriptions and invoices.
     */
    @SerializedName("default_payment_method")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<PaymentMethod> defaultPaymentMethod;

    /** Default footer to be displayed on invoices for this customer. */
    @SerializedName("footer")
    String footer;

    /** Default options for invoice PDF rendering for this customer. */
    @SerializedName("rendering_options")
    RenderingOptions renderingOptions;

    /** Get ID of expandable {@code defaultPaymentMethod} object. */
    public String getDefaultPaymentMethod() {
      return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getId() : null;
    }

    public void setDefaultPaymentMethod(String id) {
      this.defaultPaymentMethod = ApiResource.setExpandableFieldId(id, this.defaultPaymentMethod);
    }

    /** Get expanded {@code defaultPaymentMethod}. */
    public PaymentMethod getDefaultPaymentMethodObject() {
      return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getExpanded() : null;
    }

    public void setDefaultPaymentMethodObject(PaymentMethod expandableObject) {
      this.defaultPaymentMethod =
          new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
    }

    /**
     * For more details about CustomField, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomField extends StripeObject {
      /** The name of the custom field. */
      @SerializedName("name")
      String name;

      /** The value of the custom field. */
      @SerializedName("value")
      String value;
    }

    /**
     * For more details about RenderingOptions, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RenderingOptions extends StripeObject {
      /** How line-item prices and amounts will be displayed with respect to tax on invoice PDFs. */
      @SerializedName("amount_tax_display")
      String amountTaxDisplay;

      /**
       * ID of the invoice rendering template to be used for this customer's invoices. If set, the
       * template will be used on all invoices for this customer unless a template is set directly
       * on the invoice.
       */
      @SerializedName("template")
      String template;
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
    /**
     * Surfaces if automatic tax computation is possible given the current customer location
     * information.
     *
     * <p>One of {@code failed}, {@code not_collecting}, {@code supported}, or {@code
     * unrecognized_location}.
     */
    @SerializedName("automatic_tax")
    String automaticTax;

    /** A recent IP address of the customer used for tax reporting and tax location inference. */
    @SerializedName("ip_address")
    String ipAddress;

    /** The identified tax location of the customer. */
    @SerializedName("location")
    Location location;

    /**
     * For more details about Location, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Location extends StripeObject {
      /** The identified tax country of the customer. */
      @SerializedName("country")
      String country;

      /**
       * The data source used to infer the customer's location.
       *
       * <p>One of {@code billing_address}, {@code ip_address}, {@code payment_method}, or {@code
       * shipping_destination}.
       */
      @SerializedName("source")
      String source;

      /** The identified tax state, county, province, or region of the customer. */
      @SerializedName("state")
      String state;
    }
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final Customer resource;

    private TestHelpers(Customer resource) {
      this.resource = resource;
    }

    /** Create an incoming testmode bank transfer. */
    public CustomerCashBalanceTransaction fundCashBalance(Map<String, Object> params)
        throws StripeException {
      return fundCashBalance(params, (RequestOptions) null);
    }

    /** Create an incoming testmode bank transfer. */
    public CustomerCashBalanceTransaction fundCashBalance(
        Map<String, Object> params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/customers/%s/fund_cash_balance",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, CustomerCashBalanceTransaction.class);
    }

    /** Create an incoming testmode bank transfer. */
    public CustomerCashBalanceTransaction fundCashBalance(CustomerFundCashBalanceParams params)
        throws StripeException {
      return fundCashBalance(params, (RequestOptions) null);
    }

    /** Create an incoming testmode bank transfer. */
    public CustomerCashBalanceTransaction fundCashBalance(
        CustomerFundCashBalanceParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/customers/%s/fund_cash_balance",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, CustomerCashBalanceTransaction.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(address, responseGetter);
    trySetResponseGetter(cashBalance, responseGetter);
    trySetResponseGetter(defaultSource, responseGetter);
    trySetResponseGetter(discount, responseGetter);
    trySetResponseGetter(invoiceSettings, responseGetter);
    trySetResponseGetter(shipping, responseGetter);
    trySetResponseGetter(sources, responseGetter);
    trySetResponseGetter(subscriptions, responseGetter);
    trySetResponseGetter(tax, responseGetter);
    trySetResponseGetter(taxIds, responseGetter);
    trySetResponseGetter(testClock, responseGetter);
  }
}

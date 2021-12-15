// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerBalanceTransactionsParams;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.CustomerListParams;
import com.stripe.param.CustomerListPaymentMethodsParams;
import com.stripe.param.CustomerRetrieveParams;
import com.stripe.param.CustomerUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Customer extends ApiResource implements HasId, MetadataStore<Customer> {
  /** The customer's address. */
  @SerializedName("address")
  Address address;

  /**
   * Current balance, if any, being stored on the customer. If negative, the customer has credit to
   * apply to their next invoice. If positive, the customer has an amount owed that will be added to
   * their next invoice. The balance does not refer to any unpaid invoices; it solely takes into
   * account amounts that have yet to be successfully applied to any invoice. This balance is only
   * taken into account as invoices are finalized.
   */
  @SerializedName("balance")
  Long balance;

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
   * <p>If you are using payment methods created via the PaymentMethods API, see the <a
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
   * When the customer's latest invoice is billed by charging automatically, {@code delinquent} is
   * {@code true} if the invoice's latest charge failed. When the customer's latest invoice is
   * billed by sending an invoice, {@code delinquent} is {@code true} if the invoice isn't paid by
   * its due date.
   *
   * <p>If an invoice is marked uncollectible by <a
   * href="https://stripe.com/docs/billing/automatic-collection">dunning</a>, {@code delinquent}
   * doesn't get reset to {@code false}.
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

  /** The suffix of the customer's next invoice number, e.g., 0001. */
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
   * Describes the customer's tax exemption status. One of {@code none}, {@code exempt}, or {@code
   * reverse}. When set to {@code reverse}, invoice and receipt PDFs include the text
   * <strong>&quot;Reverse charge&quot;</strong>.
   */
  @SerializedName("tax_exempt")
  String taxExempt;

  /** The customer's tax IDs. */
  @SerializedName("tax_ids")
  TaxIdCollection taxIds;

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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/customers");
    return ApiResource.requestCollection(url, params, CustomerCollection.class, options);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/customers");
    return ApiResource.requestCollection(url, params, CustomerCollection.class, options);
  }

  /** Creates a new customer object. */
  public static Customer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new customer object. */
  public static Customer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/customers");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Customer.class, options);
  }

  /** Creates a new customer object. */
  public static Customer create(CustomerCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new customer object. */
  public static Customer create(CustomerCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/customers");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Customer.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Customer.class, options);
  }

  /** Retrieves a Customer object. */
  public static Customer retrieve(
      String customer, CustomerRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Customer.class, options);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the <code>past_due</code> state, then the latest
   * open invoice for the subscription with automatic collection enabled will be retried. This retry
   * will not count as an automatic retry, and will not affect the next regularly scheduled payment
   * for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger
   * this behavior.
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
   * subscription bills automatically and is in the <code>past_due</code> state, then the latest
   * open invoice for the subscription with automatic collection enabled will be retried. This retry
   * will not count as an automatic retry, and will not affect the next regularly scheduled payment
   * for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger
   * this behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  @Override
  public Customer update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Customer.class, options);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the <code>past_due</code> state, then the latest
   * open invoice for the subscription with automatic collection enabled will be retried. This retry
   * will not count as an automatic retry, and will not affect the next regularly scheduled payment
   * for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger
   * this behavior.
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
   * subscription bills automatically and is in the <code>past_due</code> state, then the latest
   * open invoice for the subscription with automatic collection enabled will be retried. This retry
   * will not count as an automatic retry, and will not affect the next regularly scheduled payment
   * for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger
   * this behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(CustomerUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Customer.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Customer.class, options);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(Map<String, Object> params)
      throws StripeException {
    return listPaymentMethods(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/payment_methods", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, PaymentMethodCollection.class, options);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(CustomerListPaymentMethodsParams params)
      throws StripeException {
    return listPaymentMethods(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public PaymentMethodCollection listPaymentMethods(
      CustomerListPaymentMethodsParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/payment_methods", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, PaymentMethodCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/balance_transactions", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(
        url, params, CustomerBalanceTransactionCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/balance_transactions", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(
        url, params, CustomerBalanceTransactionCollection.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/discount", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Discount.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceSettings extends StripeObject {
    /** Default custom fields to be displayed on invoices for this customer. */
    @SerializedName("custom_fields")
    List<Invoice.CustomField> customFields;

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
  }

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

    /** The customer's location as identified by Stripe Tax. */
    @SerializedName("location")
    Location location;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Location extends StripeObject {
      /** The customer's country as identified by Stripe Tax. */
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

      /** The customer's state, county, province, or region as identified by Stripe Tax. */
      @SerializedName("state")
      String state;
    }
  }
}

// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.OutboundPaymentCancelParams;
import com.stripe.param.treasury.OutboundPaymentCreateParams;
import com.stripe.param.treasury.OutboundPaymentFailParams;
import com.stripe.param.treasury.OutboundPaymentListParams;
import com.stripe.param.treasury.OutboundPaymentPostParams;
import com.stripe.param.treasury.OutboundPaymentRetrieveParams;
import com.stripe.param.treasury.OutboundPaymentReturnOutboundPaymentParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Use OutboundPayments to send funds to another party's external bank account or <a
 * href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a>. To send money to an
 * account belonging to the same user, use an <a
 * href="https://stripe.com/docs/api#outbound_transfers">OutboundTransfer</a>.
 *
 * <p>Simulate OutboundPayment state changes with the {@code
 * /v1/test_helpers/treasury/outbound_payments} endpoints. These methods can only be called on test
 * mode objects.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OutboundPayment extends ApiResource implements HasId {
  /** Amount (in cents) transferred. */
  @SerializedName("amount")
  Long amount;

  /** Returns {@code true} if the object can be canceled, and {@code false} otherwise. */
  @SerializedName("cancelable")
  Boolean cancelable;

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
   * ID of the <a href="https://stripe.com/docs/api/customers">customer</a> to whom an
   * OutboundPayment is sent.
   */
  @SerializedName("customer")
  String customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The PaymentMethod via which an OutboundPayment is sent. This field can be empty if the
   * OutboundPayment was created using {@code destination_payment_method_data}.
   */
  @SerializedName("destination_payment_method")
  String destinationPaymentMethod;

  /** Details about the PaymentMethod for an OutboundPayment. */
  @SerializedName("destination_payment_method_details")
  DestinationPaymentMethodDetails destinationPaymentMethodDetails;

  /** Details about the end user. */
  @SerializedName("end_user_details")
  EndUserDetails endUserDetails;

  /** The date when funds are expected to arrive in the destination account. */
  @SerializedName("expected_arrival_date")
  Long expectedArrivalDate;

  /** The FinancialAccount that funds were pulled from. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * A <a href="https://stripe.com/docs/treasury/moving-money/regulatory-receipts">hosted
   * transaction receipt</a> URL that is provided when money movement is considered regulated under
   * Stripe's money transmission licenses.
   */
  @SerializedName("hosted_regulatory_receipt_url")
  String hostedRegulatoryReceiptUrl;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.outbound_payment}.
   */
  @SerializedName("object")
  String object;

  /** Details about a returned OutboundPayment. Only set when the status is {@code returned}. */
  @SerializedName("returned_details")
  ReturnedDetails returnedDetails;

  /**
   * The description that appears on the receiving end for an OutboundPayment (for example, bank
   * statement for external bank transfer).
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Current status of the OutboundPayment: {@code processing}, {@code failed}, {@code posted},
   * {@code returned}, {@code canceled}. An OutboundPayment is {@code processing} if it has been
   * created and is pending. The status changes to {@code posted} once the OutboundPayment has been
   * &quot;confirmed&quot; and funds have left the account, or to {@code failed} or {@code
   * canceled}. If an OutboundPayment fails to arrive at its destination, its status will change to
   * {@code returned}.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code posted}, {@code processing}, or {@code
   * returned}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The Transaction associated with this object. */
  @SerializedName("transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transaction> transaction;

  /** Get ID of expandable {@code transaction} object. */
  public String getTransaction() {
    return (this.transaction != null) ? this.transaction.getId() : null;
  }

  public void setTransaction(String id) {
    this.transaction = ApiResource.setExpandableFieldId(id, this.transaction);
  }

  /** Get expanded {@code transaction}. */
  public Transaction getTransactionObject() {
    return (this.transaction != null) ? this.transaction.getExpanded() : null;
  }

  public void setTransactionObject(Transaction expandableObject) {
    this.transaction = new ExpandableField<Transaction>(expandableObject.getId(), expandableObject);
  }

  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_payments/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, OutboundPayment.class);
  }

  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(OutboundPaymentCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancel an OutboundPayment. */
  public OutboundPayment cancel(OutboundPaymentCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_payments/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, OutboundPayment.class);
  }

  /** Creates an OutboundPayment. */
  public static OutboundPayment create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an OutboundPayment. */
  public static OutboundPayment create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, OutboundPayment.class);
  }

  /** Creates an OutboundPayment. */
  public static OutboundPayment create(OutboundPaymentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an OutboundPayment. */
  public static OutboundPayment create(OutboundPaymentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_payments";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, OutboundPayment.class);
  }

  /** Returns a list of OutboundPayments sent from the specified FinancialAccount. */
  public static OutboundPaymentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of OutboundPayments sent from the specified FinancialAccount. */
  public static OutboundPaymentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_payments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, OutboundPaymentCollection.class);
  }

  /** Returns a list of OutboundPayments sent from the specified FinancialAccount. */
  public static OutboundPaymentCollection list(OutboundPaymentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of OutboundPayments sent from the specified FinancialAccount. */
  public static OutboundPaymentCollection list(
      OutboundPaymentListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/outbound_payments";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, OutboundPaymentCollection.class);
  }

  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public static OutboundPayment retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public static OutboundPayment retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public static OutboundPayment retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/treasury/outbound_payments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, OutboundPayment.class);
  }

  /**
   * Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID
   * from either the OutboundPayment creation request or OutboundPayment list.
   */
  public static OutboundPayment retrieve(
      String id, OutboundPaymentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/outbound_payments/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, OutboundPayment.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DestinationPaymentMethodDetails extends StripeObject {
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    @SerializedName("financial_account")
    FinancialAccount financialAccount;

    /**
     * The type of the payment method used in the OutboundPayment.
     *
     * <p>One of {@code financial_account}, or {@code us_bank_account}.
     */
    @SerializedName("type")
    String type;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      @SerializedName("address")
      Address address;

      /** Email address. */
      @SerializedName("email")
      String email;

      /** Full name. */
      @SerializedName("name")
      String name;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FinancialAccount extends StripeObject implements HasId {
      /** Token of the FinancialAccount. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /**
       * The rails used to send funds.
       *
       * <p>Equal to {@code stripe}.
       */
      @SerializedName("network")
      String network;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /**
       * Account holder type: individual or company.
       *
       * <p>One of {@code company}, or {@code individual}.
       */
      @SerializedName("account_holder_type")
      String accountHolderType;

      /**
       * Account type: checkings or savings. Defaults to checking if omitted.
       *
       * <p>One of {@code checking}, or {@code savings}.
       */
      @SerializedName("account_type")
      String accountType;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /**
       * The US bank account network used to send funds.
       *
       * <p>One of {@code ach}, or {@code us_domestic_wire}.
       */
      @SerializedName("network")
      String network;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EndUserDetails extends StripeObject {
    /**
     * IP address of the user initiating the OutboundPayment. Set if {@code present} is set to
     * {@code true}. IP address collection is required for risk and compliance reasons. This will be
     * used to help determine if the OutboundPayment is authorized or should be blocked.
     */
    @SerializedName("ip_address")
    String ipAddress;

    /**
     * {@code true} if the OutboundPayment creation request is being made on behalf of an end user
     * by a platform. Otherwise, {@code false}.
     */
    @SerializedName("present")
    Boolean present;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReturnedDetails extends StripeObject {
    /**
     * Reason for the return.
     *
     * <p>One of {@code account_closed}, {@code account_frozen}, {@code bank_account_restricted},
     * {@code bank_ownership_changed}, {@code declined}, {@code incorrect_account_holder_name},
     * {@code invalid_account_number}, {@code invalid_currency}, {@code no_account}, or {@code
     * other}.
     */
    @SerializedName("code")
    String code;

    /** The Transaction associated with this object. */
    @SerializedName("transaction")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Transaction> transaction;

    /** Get ID of expandable {@code transaction} object. */
    public String getTransaction() {
      return (this.transaction != null) ? this.transaction.getId() : null;
    }

    public void setTransaction(String id) {
      this.transaction = ApiResource.setExpandableFieldId(id, this.transaction);
    }

    /** Get expanded {@code transaction}. */
    public Transaction getTransactionObject() {
      return (this.transaction != null) ? this.transaction.getExpanded() : null;
    }

    public void setTransactionObject(Transaction expandableObject) {
      this.transaction =
          new ExpandableField<Transaction>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when an OutboundPayment changed status to {@code canceled}. */
    @SerializedName("canceled_at")
    Long canceledAt;

    /** Timestamp describing when an OutboundPayment changed status to {@code failed}. */
    @SerializedName("failed_at")
    Long failedAt;

    /** Timestamp describing when an OutboundPayment changed status to {@code posted}. */
    @SerializedName("posted_at")
    Long postedAt;

    /** Timestamp describing when an OutboundPayment changed status to {@code returned}. */
    @SerializedName("returned_at")
    Long returnedAt;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final OutboundPayment resource;

    private TestHelpers(OutboundPayment resource) {
      this.resource = resource;
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code failed} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment fail() throws StripeException {
      return fail((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code failed} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment fail(RequestOptions options) throws StripeException {
      return fail((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code failed} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment fail(Map<String, Object> params) throws StripeException {
      return fail(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code failed} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment fail(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_payments/%s/fail",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
      return resource.getResponseGetter().request(request, OutboundPayment.class);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code failed} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment fail(OutboundPaymentFailParams params) throws StripeException {
      return fail(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code failed} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment fail(OutboundPaymentFailParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_payments/%s/fail",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options,
              ApiMode.V1);
      return resource.getResponseGetter().request(request, OutboundPayment.class);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code posted} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment post() throws StripeException {
      return post((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code posted} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment post(RequestOptions options) throws StripeException {
      return post((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code posted} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment post(Map<String, Object> params) throws StripeException {
      return post(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code posted} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment post(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_payments/%s/post",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
      return resource.getResponseGetter().request(request, OutboundPayment.class);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code posted} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment post(OutboundPaymentPostParams params) throws StripeException {
      return post(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code posted} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment post(OutboundPaymentPostParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_payments/%s/post",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options,
              ApiMode.V1);
      return resource.getResponseGetter().request(request, OutboundPayment.class);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code returned} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment returnOutboundPayment() throws StripeException {
      return returnOutboundPayment((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code returned} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment returnOutboundPayment(RequestOptions options) throws StripeException {
      return returnOutboundPayment((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code returned} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment returnOutboundPayment(Map<String, Object> params)
        throws StripeException {
      return returnOutboundPayment(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code returned} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment returnOutboundPayment(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_payments/%s/return",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
      return resource.getResponseGetter().request(request, OutboundPayment.class);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code returned} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment returnOutboundPayment(OutboundPaymentReturnOutboundPaymentParams params)
        throws StripeException {
      return returnOutboundPayment(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundPayment to the {@code returned} status. The
     * OutboundPayment must already be in the {@code processing} state.
     */
    public OutboundPayment returnOutboundPayment(
        OutboundPaymentReturnOutboundPaymentParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_payments/%s/return",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options,
              ApiMode.V1);
      return resource.getResponseGetter().request(request, OutboundPayment.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(destinationPaymentMethodDetails, responseGetter);
    trySetResponseGetter(endUserDetails, responseGetter);
    trySetResponseGetter(returnedDetails, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(transaction, responseGetter);
  }
}

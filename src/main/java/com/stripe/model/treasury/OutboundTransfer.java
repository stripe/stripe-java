// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Mandate;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.OutboundTransferCancelParams;
import com.stripe.param.treasury.OutboundTransferCreateParams;
import com.stripe.param.treasury.OutboundTransferFailParams;
import com.stripe.param.treasury.OutboundTransferListParams;
import com.stripe.param.treasury.OutboundTransferPostParams;
import com.stripe.param.treasury.OutboundTransferRetrieveParams;
import com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams;
import com.stripe.param.treasury.OutboundTransferUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Use <a
 * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-transfers">OutboundTransfers</a>
 * to transfer funds from a <a
 * href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a> to a PaymentMethod
 * belonging to the same entity. To send funds to a different party, use <a
 * href="https://stripe.com/docs/api#outbound_payments">OutboundPayments</a> instead. You can send
 * funds over ACH rails or through a domestic wire transfer to a user's own external bank account.
 *
 * <p>Simulate OutboundTransfer state changes with the {@code
 * /v1/test_helpers/treasury/outbound_transfers} endpoints. These methods can only be called on test
 * mode objects.
 *
 * <p>Related guide: <a
 * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-transfers">Moving
 * money with Treasury using OutboundTransfer objects</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OutboundTransfer extends ApiResource implements HasId {
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

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** The PaymentMethod used as the payment instrument for an OutboundTransfer. */
  @SerializedName("destination_payment_method")
  String destinationPaymentMethod;

  @SerializedName("destination_payment_method_details")
  DestinationPaymentMethodDetails destinationPaymentMethodDetails;

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

  /** Details about the network used for the OutboundTransfer. */
  @SerializedName("network_details")
  NetworkDetails networkDetails;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.outbound_transfer}.
   */
  @SerializedName("object")
  String object;

  /** Details about a returned OutboundTransfer. Only set when the status is {@code returned}. */
  @SerializedName("returned_details")
  ReturnedDetails returnedDetails;

  /** Information about the OutboundTransfer to be sent to the recipient account. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Current status of the OutboundTransfer: {@code processing}, {@code failed}, {@code canceled},
   * {@code posted}, {@code returned}. An OutboundTransfer is {@code processing} if it has been
   * created and is pending. The status changes to {@code posted} once the OutboundTransfer has been
   * &quot;confirmed&quot; and funds have left the account, or to {@code failed} or {@code
   * canceled}. If an OutboundTransfer fails to arrive at its destination, its status will change to
   * {@code returned}.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code posted}, {@code processing}, or {@code
   * returned}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Details about network-specific tracking information if available. */
  @SerializedName("tracking_details")
  TrackingDetails trackingDetails;

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

  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_transfers/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, OutboundTransfer.class);
  }

  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(OutboundTransferCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(OutboundTransferCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_transfers/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, OutboundTransfer.class);
  }

  /** Creates an OutboundTransfer. */
  public static OutboundTransfer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an OutboundTransfer. */
  public static OutboundTransfer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, OutboundTransfer.class);
  }

  /** Creates an OutboundTransfer. */
  public static OutboundTransfer create(OutboundTransferCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an OutboundTransfer. */
  public static OutboundTransfer create(OutboundTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OutboundTransfer.class);
  }

  /** Returns a list of OutboundTransfers sent from the specified FinancialAccount. */
  public static OutboundTransferCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of OutboundTransfers sent from the specified FinancialAccount. */
  public static OutboundTransferCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OutboundTransferCollection.class);
  }

  /** Returns a list of OutboundTransfers sent from the specified FinancialAccount. */
  public static OutboundTransferCollection list(OutboundTransferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of OutboundTransfers sent from the specified FinancialAccount. */
  public static OutboundTransferCollection list(
      OutboundTransferListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OutboundTransferCollection.class);
  }

  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public static OutboundTransfer retrieve(String outboundTransfer) throws StripeException {
    return retrieve(outboundTransfer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public static OutboundTransfer retrieve(String outboundTransfer, RequestOptions options)
      throws StripeException {
    return retrieve(outboundTransfer, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public static OutboundTransfer retrieve(
      String outboundTransfer, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_transfers/%s", ApiResource.urlEncodeId(outboundTransfer));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OutboundTransfer.class);
  }

  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public static OutboundTransfer retrieve(
      String outboundTransfer, OutboundTransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_transfers/%s", ApiResource.urlEncodeId(outboundTransfer));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OutboundTransfer.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DestinationPaymentMethodDetails extends StripeObject {
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * The type of the payment method used in the OutboundTransfer.
     *
     * <p>Equal to {@code us_bank_account}.
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

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> mandate;

      /**
       * The network rails used. See the <a
       * href="https://stripe.com/docs/treasury/money-movement/timelines">docs</a> to learn more
       * about money movement timelines for each network type.
       *
       * <p>One of {@code ach}, or {@code us_domestic_wire}.
       */
      @SerializedName("network")
      String network;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;

      /** Get ID of expandable {@code mandate} object. */
      public String getMandate() {
        return (this.mandate != null) ? this.mandate.getId() : null;
      }

      public void setMandate(String id) {
        this.mandate = ApiResource.setExpandableFieldId(id, this.mandate);
      }

      /** Get expanded {@code mandate}. */
      public Mandate getMandateObject() {
        return (this.mandate != null) ? this.mandate.getExpanded() : null;
      }

      public void setMandateObject(Mandate expandableObject) {
        this.mandate = new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkDetails extends StripeObject {
    /** Details about an ACH transaction. */
    @SerializedName("ach")
    Ach ach;

    /**
     * The type of flow that originated the OutboundTransfer.
     *
     * <p>Equal to {@code ach}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach extends StripeObject {
      /** ACH Addenda record. */
      @SerializedName("addenda")
      String addenda;
    }
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
    /** Timestamp describing when an OutboundTransfer changed status to {@code canceled}. */
    @SerializedName("canceled_at")
    Long canceledAt;

    /** Timestamp describing when an OutboundTransfer changed status to {@code failed}. */
    @SerializedName("failed_at")
    Long failedAt;

    /** Timestamp describing when an OutboundTransfer changed status to {@code posted}. */
    @SerializedName("posted_at")
    Long postedAt;

    /** Timestamp describing when an OutboundTransfer changed status to {@code returned}. */
    @SerializedName("returned_at")
    Long returnedAt;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TrackingDetails extends StripeObject {
    @SerializedName("ach")
    Ach ach;

    /**
     * The US bank account network used to send funds.
     *
     * <p>One of {@code ach}, or {@code us_domestic_wire}.
     */
    @SerializedName("type")
    String type;

    @SerializedName("us_domestic_wire")
    UsDomesticWire usDomesticWire;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ach extends StripeObject {
      /** ACH trace ID of the OutboundTransfer for transfers sent over the {@code ach} network. */
      @SerializedName("trace_id")
      String traceId;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsDomesticWire extends StripeObject {
      /**
       * CHIPS System Sequence Number (SSN) of the OutboundTransfer for transfers sent over the
       * {@code us_domestic_wire} network.
       */
      @SerializedName("chips")
      String chips;

      /**
       * IMAD of the OutboundTransfer for transfers sent over the {@code us_domestic_wire} network.
       */
      @SerializedName("imad")
      String imad;

      /**
       * OMAD of the OutboundTransfer for transfers sent over the {@code us_domestic_wire} network.
       */
      @SerializedName("omad")
      String omad;
    }
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final OutboundTransfer resource;

    private TestHelpers(OutboundTransfer resource) {
      this.resource = resource;
    }

    /**
     * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
     * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
     */
    public OutboundTransfer update(Map<String, Object> params) throws StripeException {
      return update(params, (RequestOptions) null);
    }

    /**
     * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
     * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
     */
    public OutboundTransfer update(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
     * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
     */
    public OutboundTransfer update(OutboundTransferUpdateParams params) throws StripeException {
      return update(params, (RequestOptions) null);
    }

    /**
     * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
     * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
     */
    public OutboundTransfer update(OutboundTransferUpdateParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer fail() throws StripeException {
      return fail((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer fail(RequestOptions options) throws StripeException {
      return fail((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer fail(Map<String, Object> params) throws StripeException {
      return fail(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer fail(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s/fail",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer fail(OutboundTransferFailParams params) throws StripeException {
      return fail(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer fail(OutboundTransferFailParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s/fail",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer post() throws StripeException {
      return post((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer post(RequestOptions options) throws StripeException {
      return post((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer post(Map<String, Object> params) throws StripeException {
      return post(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer post(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s/post",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer post(OutboundTransferPostParams params) throws StripeException {
      return post(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer post(OutboundTransferPostParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s/post",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer returnOutboundTransfer() throws StripeException {
      return returnOutboundTransfer((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer returnOutboundTransfer(RequestOptions options) throws StripeException {
      return returnOutboundTransfer((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer returnOutboundTransfer(Map<String, Object> params)
        throws StripeException {
      return returnOutboundTransfer(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer returnOutboundTransfer(
        Map<String, Object> params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s/return",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer returnOutboundTransfer(
        OutboundTransferReturnOutboundTransferParams params) throws StripeException {
      return returnOutboundTransfer(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
     * OutboundTransfer must already be in the {@code processing} state.
     */
    public OutboundTransfer returnOutboundTransfer(
        OutboundTransferReturnOutboundTransferParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/treasury/outbound_transfers/%s/return",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, OutboundTransfer.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(destinationPaymentMethodDetails, responseGetter);
    trySetResponseGetter(networkDetails, responseGetter);
    trySetResponseGetter(returnedDetails, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(trackingDetails, responseGetter);
    trySetResponseGetter(transaction, responseGetter);
  }
}

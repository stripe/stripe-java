// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.treasury.InboundTransferCancelParams;
import com.stripe.param.treasury.InboundTransferCreateParams;
import com.stripe.param.treasury.InboundTransferFailParams;
import com.stripe.param.treasury.InboundTransferListParams;
import com.stripe.param.treasury.InboundTransferRetrieveParams;
import com.stripe.param.treasury.InboundTransferReturnInboundTransferParams;
import com.stripe.param.treasury.InboundTransferSucceedParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InboundTransfer extends ApiResource implements HasId {
  /** Amount (in cents) transferred. */
  @SerializedName("amount")
  Long amount;

  /** Returns {@code true} if the InboundTransfer is able to be canceled. */
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

  /** Details about this InboundTransfer's failure. Only set when status is {@code failed}. */
  @SerializedName("failure_details")
  FailureDetails failureDetails;

  /** The FinancialAccount that received the funds. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * A hosted transaction receipt URL that is provided when money movement is considered regulated
   * under Stripe's money transmission licenses.
   */
  @SerializedName("hosted_regulatory_receipt_url")
  String hostedRegulatoryReceiptUrl;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("linked_flows")
  LinkedFlows linkedFlows;

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
   * <p>Equal to {@code treasury.inbound_transfer}.
   */
  @SerializedName("object")
  String object;

  /** The origin payment method to be debited for an InboundTransfer. */
  @SerializedName("origin_payment_method")
  String originPaymentMethod;

  /** Details about the PaymentMethod for an InboundTransfer. */
  @SerializedName("origin_payment_method_details")
  PaymentMethodDetails originPaymentMethodDetails;

  /**
   * Returns {@code true} if the funds for an InboundTransfer were returned after the
   * InboundTransfer went to the {@code succeeded} state.
   */
  @SerializedName("returned")
  Boolean returned;

  /**
   * Statement descriptor shown when funds are debited from the source. Not all payment networks
   * support {@code statement_descriptor}.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Status of the InboundTransfer: {@code processing}, {@code succeeded}, {@code failed}, and
   * {@code canceled}. An InboundTransfer is {@code processing} if it is created and pending. The
   * status changes to {@code succeeded} once the funds have been &quot;confirmed&quot; and a {@code
   * transaction} is created and posted. The status changes to {@code failed} if the transfer fails.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code processing}, or {@code succeeded}.
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

  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/inbound_transfers/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
  }

  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(InboundTransferCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(InboundTransferCancelParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/inbound_transfers/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
  }

  /** Creates an InboundTransfer. */
  public static InboundTransfer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an InboundTransfer. */
  public static InboundTransfer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/inbound_transfers");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
  }

  /** Creates an InboundTransfer. */
  public static InboundTransfer create(InboundTransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an InboundTransfer. */
  public static InboundTransfer create(InboundTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/inbound_transfers");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
  }

  /** Retrieves the details of an existing InboundTransfer. */
  public static InboundTransfer retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an existing InboundTransfer. */
  public static InboundTransfer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an existing InboundTransfer. */
  public static InboundTransfer retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/inbound_transfers/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, InboundTransfer.class, options);
  }

  /** Retrieves the details of an existing InboundTransfer. */
  public static InboundTransfer retrieve(
      String id, InboundTransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/inbound_transfers/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, InboundTransfer.class, options);
  }

  /** Returns a list of InboundTransfers sent from the specified FinancialAccount. */
  public static InboundTransferCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of InboundTransfers sent from the specified FinancialAccount. */
  public static InboundTransferCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/inbound_transfers");
    return ApiResource.requestCollection(url, params, InboundTransferCollection.class, options);
  }

  /** Returns a list of InboundTransfers sent from the specified FinancialAccount. */
  public static InboundTransferCollection list(InboundTransferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of InboundTransfers sent from the specified FinancialAccount. */
  public static InboundTransferCollection list(
      InboundTransferListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/inbound_transfers");
    return ApiResource.requestCollection(url, params, InboundTransferCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FailureDetails extends StripeObject {
    /**
     * Reason for the failure.
     *
     * <p>One of {@code account_closed}, {@code account_frozen}, {@code bank_account_restricted},
     * {@code bank_ownership_changed}, {@code debit_not_authorized}, {@code
     * incorrect_account_holder_address}, {@code incorrect_account_holder_name}, {@code
     * incorrect_account_holder_tax_id}, {@code insufficient_funds}, {@code invalid_account_number},
     * {@code invalid_currency}, {@code no_account}, or {@code other}.
     */
    @SerializedName("code")
    String code;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkedFlows extends StripeObject {
    /**
     * If funds for this flow were returned after the flow went to the {@code succeeded} state, this
     * field contains a reference to the ReceivedDebit return.
     */
    @SerializedName("received_debit")
    String receivedDebit;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * The type of the payment method used in the InboundTransfer.
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
       * The US bank account network used to debit funds.
       *
       * <p>Equal to {@code ach}.
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
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when an InboundTransfer changed status to {@code canceled}. */
    @SerializedName("canceled_at")
    Long canceledAt;

    /** Timestamp describing when an InboundTransfer changed status to {@code failed}. */
    @SerializedName("failed_at")
    Long failedAt;

    /** Timestamp describing when an InboundTransfer changed status to {@code succeeded}. */
    @SerializedName("succeeded_at")
    Long succeededAt;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers();
  }

  public class TestHelpers {
    /**
     * Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer succeed() throws StripeException {
      return succeed((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer succeed(RequestOptions options) throws StripeException {
      return succeed((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer succeed(Map<String, Object> params) throws StripeException {
      return succeed(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer succeed(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/treasury/inbound_transfers/%s/succeed",
                  ApiResource.urlEncodeId(InboundTransfer.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer succeed(InboundTransferSucceedParams params) throws StripeException {
      return succeed(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer succeed(InboundTransferSucceedParams params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/treasury/inbound_transfers/%s/succeed",
                  ApiResource.urlEncodeId(InboundTransfer.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>failed</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer fail() throws StripeException {
      return fail((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>failed</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer fail(RequestOptions options) throws StripeException {
      return fail((Map<String, Object>) null, options);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>failed</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer fail(Map<String, Object> params) throws StripeException {
      return fail(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>failed</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer fail(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/treasury/inbound_transfers/%s/fail",
                  ApiResource.urlEncodeId(InboundTransfer.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>failed</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer fail(InboundTransferFailParams params) throws StripeException {
      return fail(params, (RequestOptions) null);
    }

    /**
     * Transitions a test mode created InboundTransfer to the <code>failed</code> status. The
     * InboundTransfer must already be in the <code>processing</code> state.
     */
    public InboundTransfer fail(InboundTransferFailParams params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/treasury/inbound_transfers/%s/fail",
                  ApiResource.urlEncodeId(InboundTransfer.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
    }

    /**
     * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
     * ReceivedDebit. The InboundTransfer must already be in the <code>succeeded</code> state.
     */
    public InboundTransfer returnInboundTransfer() throws StripeException {
      return returnInboundTransfer((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
     * ReceivedDebit. The InboundTransfer must already be in the <code>succeeded</code> state.
     */
    public InboundTransfer returnInboundTransfer(RequestOptions options) throws StripeException {
      return returnInboundTransfer((Map<String, Object>) null, options);
    }

    /**
     * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
     * ReceivedDebit. The InboundTransfer must already be in the <code>succeeded</code> state.
     */
    public InboundTransfer returnInboundTransfer(Map<String, Object> params)
        throws StripeException {
      return returnInboundTransfer(params, (RequestOptions) null);
    }

    /**
     * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
     * ReceivedDebit. The InboundTransfer must already be in the <code>succeeded</code> state.
     */
    public InboundTransfer returnInboundTransfer(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/treasury/inbound_transfers/%s/return",
                  ApiResource.urlEncodeId(InboundTransfer.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
    }

    /**
     * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
     * ReceivedDebit. The InboundTransfer must already be in the <code>succeeded</code> state.
     */
    public InboundTransfer returnInboundTransfer(InboundTransferReturnInboundTransferParams params)
        throws StripeException {
      return returnInboundTransfer(params, (RequestOptions) null);
    }

    /**
     * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
     * ReceivedDebit. The InboundTransfer must already be in the <code>succeeded</code> state.
     */
    public InboundTransfer returnInboundTransfer(
        InboundTransferReturnInboundTransferParams params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/treasury/inbound_transfers/%s/return",
                  ApiResource.urlEncodeId(InboundTransfer.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, InboundTransfer.class, options);
    }
  }
}

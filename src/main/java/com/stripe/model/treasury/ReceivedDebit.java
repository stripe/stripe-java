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
import com.stripe.param.treasury.ReceivedDebitCreateParams;
import com.stripe.param.treasury.ReceivedDebitListParams;
import com.stripe.param.treasury.ReceivedDebitRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReceivedDebit extends ApiResource implements HasId {
  /** Amount (in cents) transferred. */
  @SerializedName("amount")
  Long amount;

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

  /**
   * Reason for the failure. A ReceivedDebit might fail because the FinancialAccount doesn't have
   * sufficient funds, is closed, or is frozen.
   *
   * <p>One of {@code account_closed}, {@code account_frozen}, {@code insufficient_funds}, or {@code
   * other}.
   */
  @SerializedName("failure_code")
  String failureCode;

  /** The FinancialAccount that funds were pulled from. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("initiating_payment_method_details")
  InitiatingPaymentMethodDetails initiatingPaymentMethodDetails;

  @SerializedName("linked_flows")
  LinkedFlows linkedFlows;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The network used for the ReceivedDebit.
   *
   * <p>One of {@code ach}, {@code card}, or {@code stripe}.
   */
  @SerializedName("network")
  String network;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.received_debit}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the ReceivedDebit. ReceivedDebits are created with a status of either {@code
   * succeeded} (approved) or {@code failed} (declined). The failure reason can be found under the
   * {@code failure_code}.
   *
   * <p>One of {@code failed}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

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

  /** Returns a list of ReceivedDebits. */
  public static ReceivedDebitCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of ReceivedDebits. */
  public static ReceivedDebitCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/received_debits");
    return ApiResource.requestCollection(url, params, ReceivedDebitCollection.class, options);
  }

  /** Returns a list of ReceivedDebits. */
  public static ReceivedDebitCollection list(ReceivedDebitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of ReceivedDebits. */
  public static ReceivedDebitCollection list(ReceivedDebitListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/received_debits");
    return ApiResource.requestCollection(url, params, ReceivedDebitCollection.class, options);
  }

  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public static ReceivedDebit retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public static ReceivedDebit retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public static ReceivedDebit retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/received_debits/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReceivedDebit.class, options);
  }

  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public static ReceivedDebit retrieve(
      String id, ReceivedDebitRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/received_debits/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReceivedDebit.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkedFlows extends StripeObject {
    /** Set if the ReceivedDebit is associated with an InboundTransfer's return of funds. */
    @SerializedName("inbound_transfer")
    String inboundTransfer;

    /**
     * Set if the ReceivedCredit was created due to an <a
     * href="https://stripe.com/docs/api#issuing_authorizations">Issuing Authorization</a> object.
     */
    @SerializedName("issuing_authorization")
    String issuingAuthorization;

    /**
     * Set if the ReceivedDebit is also viewable as an <a
     * href="https://stripe.com/docs/api#issuing_disputes">Issuing Dispute</a> object.
     */
    @SerializedName("issuing_transaction")
    String issuingTransaction;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when the DebitReversal changed status to {@code completed}. */
    @SerializedName("completed_at")
    Long completedAt;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers();
  }

  public class TestHelpers {
    /**
     * Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live
     * mode, you can’t directly create ReceivedDebits initiated by third parties.
     */
    public static ReceivedDebit create(Map<String, Object> params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live
     * mode, you can’t directly create ReceivedDebits initiated by third parties.
     */
    public static ReceivedDebit create(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/treasury/received_debits");
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, ReceivedDebit.class, options);
    }

    /**
     * Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live
     * mode, you can’t directly create ReceivedDebits initiated by third parties.
     */
    public static ReceivedDebit create(ReceivedDebitCreateParams params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live
     * mode, you can’t directly create ReceivedDebits initiated by third parties.
     */
    public static ReceivedDebit create(ReceivedDebitCreateParams params, RequestOptions options)
        throws StripeException {
      String url =
          String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/treasury/received_debits");
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, ReceivedDebit.class, options);
    }
  }
}

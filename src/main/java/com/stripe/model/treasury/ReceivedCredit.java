// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.Payout;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.treasury.ReceivedCreditCreateParams;
import com.stripe.param.treasury.ReceivedCreditListParams;
import com.stripe.param.treasury.ReceivedCreditRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReceivedCredit extends ApiResource implements HasId {
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
   * Reason for the failure. A ReceivedCredit might fail because the receiving FinancialAccount is
   * closed or frozen.
   *
   * <p>One of {@code account_closed}, {@code account_frozen}, or {@code other}.
   */
  @SerializedName("failure_code")
  String failureCode;

  /** The FinancialAccount that received the funds. */
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
   * The rails used to send the funds.
   *
   * <p>One of {@code ach}, {@code card}, {@code stripe}, or {@code us_domestic_wire}.
   */
  @SerializedName("network")
  String network;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.received_credit}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the ReceivedCredit. ReceivedCredits are created either {@code succeeded} (approved)
   * or {@code failed} (declined). If a ReceivedCredit is declined, the failure reason can be found
   * in the {@code failure_code} field.
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

  /** Returns a list of ReceivedCredits. */
  public static ReceivedCreditCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of ReceivedCredits. */
  public static ReceivedCreditCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/received_credits");
    return ApiResource.requestCollection(url, params, ReceivedCreditCollection.class, options);
  }

  /** Returns a list of ReceivedCredits. */
  public static ReceivedCreditCollection list(ReceivedCreditListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of ReceivedCredits. */
  public static ReceivedCreditCollection list(
      ReceivedCreditListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/received_credits");
    return ApiResource.requestCollection(url, params, ReceivedCreditCollection.class, options);
  }

  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public static ReceivedCredit retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public static ReceivedCredit retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public static ReceivedCredit retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/received_credits/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReceivedCredit.class, options);
  }

  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public static ReceivedCredit retrieve(
      String id, ReceivedCreditRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/received_credits/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReceivedCredit.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InitiatingPaymentMethodDetails extends StripeObject {
    /**
     * Set when {@code type} is {@code balance}.
     *
     * <p>Equal to {@code payments}.
     */
    @SerializedName("balance")
    String balance;

    @SerializedName("billing_details")
    BillingDetails billingDetails;

    @SerializedName("financial_account")
    FinancialAccount financialAccount;

    /**
     * Set when {@code type} is {@code issuing_card}. This is an <a
     * href="https://stripe.com/docs/api#issuing_cards">Issuing Card</a> ID.
     */
    @SerializedName("issuing_card")
    String issuingCard;

    /**
     * Polymorphic type matching the originating money movement's source. This can be an external
     * account, a Stripe balance, or a FinancialAccount.
     *
     * <p>One of {@code balance}, {@code financial_account}, {@code issuing_card}, {@code stripe},
     * or {@code us_bank_account}.
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
      /** The FinancialAccount ID. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /**
       * The rails the ReceivedCredit was sent over. A FinancialAccount can only send funds over
       * {@code stripe}.
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
      /** Bank name. */
      @SerializedName("bank_name")
      String bankName;

      /** The last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** The routing number for the bank account. */
      @SerializedName("routing_number")
      String routingNumber;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkedFlows extends StripeObject {
    /** The CreditReversal created as a result of this ReceivedCredit being reversed. */
    @SerializedName("credit_reversal")
    String creditReversal;

    /**
     * Set if the ReceivedCredit was created due to an <a
     * href="https://stripe.com/docs/api#issuing_authorizations">Issuing Authorization</a> object.
     */
    @SerializedName("issuing_authorization")
    String issuingAuthorization;

    /**
     * Set if the ReceivedCredit is also viewable as an <a
     * href="https://stripe.com/docs/api#issuing_transactions">Issuing transaction</a> object.
     */
    @SerializedName("issuing_transaction")
    String issuingTransaction;

    /**
     * ID of the source flow. Set if {@code network} is {@code stripe} and the source flow is
     * visible to the merchant. Examples of source flows include OutboundPayments, payouts, or
     * CreditReversals.
     */
    @SerializedName("source_flow")
    String sourceFlow;

    /** The expandable object of the source flow. */
    @SerializedName("source_flow_details")
    SourceFlowDetails sourceFlowDetails;

    /**
     * The type of flow that originated the ReceivedCredit (for example, {@code outbound_payment}).
     */
    @SerializedName("source_flow_type")
    String sourceFlowType;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceFlowDetails extends StripeObject {
      /**
       * You can reverse some <a
       * href="https://stripe.com/docs/api#received_credits">ReceivedCredits</a> depending on their
       * network and source flow. Reversing a ReceivedCredit leads to the creation of a new object
       * known as a CreditReversal.
       */
      @SerializedName("credit_reversal")
      CreditReversal creditReversal;

      /**
       * Use OutboundPayments to send funds to another party's external bank account or <a
       * href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a>. To send money
       * to an account belonging to the same user, use an <a
       * href="https://stripe.com/docs/api#outbound_transfers">OutboundTransfer</a>.
       *
       * <p>Simulate OutboundPayment state changes with the {@code
       * /v1/test_helpers/treasury/outbound_payments} endpoints. These methods can only be called on
       * test mode objects.
       */
      @SerializedName("outbound_payment")
      OutboundPayment outboundPayment;

      /**
       * A {@code Payout} object is created when you receive funds from Stripe, or when you initiate
       * a payout to either a bank account or debit card of a <a
       * href="https://stripe.com/docs/connect/bank-debit-card-payouts">connected Stripe
       * account</a>. You can retrieve individual payouts, as well as list all payouts. Payouts are
       * made on <a href="https://stripe.com/docs/connect/manage-payout-schedule">varying
       * schedules</a>, depending on your country and industry.
       *
       * <p>Related guide: <a href="https://stripe.com/docs/payouts">Receiving Payouts</a>.
       */
      @SerializedName("payout")
      Payout payout;

      /**
       * The type of the source flow that originated the ReceivedCredit.
       *
       * <p>One of {@code credit_reversal}, {@code other}, {@code outbound_payment}, or {@code
       * payout}.
       */
      @SerializedName("type")
      String type;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when the CreditReversal changed status to {@code posted}. */
    @SerializedName("posted_at")
    Long postedAt;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers();
  }

  public class TestHelpers {
    /**
     * Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live
     * mode, you can’t directly create ReceivedCredits initiated by third parties.
     */
    public static ReceivedCredit create(Map<String, Object> params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live
     * mode, you can’t directly create ReceivedCredits initiated by third parties.
     */
    public static ReceivedCredit create(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/treasury/received_credits");
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, ReceivedCredit.class, options);
    }

    /**
     * Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live
     * mode, you can’t directly create ReceivedCredits initiated by third parties.
     */
    public static ReceivedCredit create(ReceivedCreditCreateParams params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live
     * mode, you can’t directly create ReceivedCredits initiated by third parties.
     */
    public static ReceivedCredit create(ReceivedCreditCreateParams params, RequestOptions options)
        throws StripeException {
      String url =
          String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/treasury/received_credits");
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, ReceivedCredit.class, options);
    }
  }
}

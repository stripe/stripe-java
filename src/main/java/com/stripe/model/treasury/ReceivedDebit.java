// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.ReceivedDebitCreateParams;
import com.stripe.param.treasury.ReceivedDebitListParams;
import com.stripe.param.treasury.ReceivedDebitRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * ReceivedDebits represent funds pulled from a <a
 * href="https://stripe.com/docs/api#financial_accounts">FinancialAccount</a>. These are not
 * initiated from the FinancialAccount.
 */
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
   * <p>One of {@code account_closed}, {@code account_frozen}, {@code insufficient_funds}, {@code
   * international_transaction}, or {@code other}.
   */
  @SerializedName("failure_code")
  String failureCode;

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

  /** Details describing when a ReceivedDebit might be reversed. */
  @SerializedName("reversal_details")
  ReversalDetails reversalDetails;

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
    String path = "/v1/treasury/received_debits";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ReceivedDebitCollection.class);
  }

  /** Returns a list of ReceivedDebits. */
  public static ReceivedDebitCollection list(ReceivedDebitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of ReceivedDebits. */
  public static ReceivedDebitCollection list(ReceivedDebitListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/received_debits";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ReceivedDebitCollection.class);
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
    String path = String.format("/v1/treasury/received_debits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ReceivedDebit.class);
  }

  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public static ReceivedDebit retrieve(
      String id, ReceivedDebitRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/received_debits/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ReceivedDebit.class);
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
    /** The DebitReversal created as a result of this ReceivedDebit being reversed. */
    @SerializedName("debit_reversal")
    String debitReversal;

    /** Set if the ReceivedDebit is associated with an InboundTransfer's return of funds. */
    @SerializedName("inbound_transfer")
    String inboundTransfer;

    /**
     * Set if the ReceivedDebit was created due to an <a
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

    /**
     * Set if the ReceivedDebit was created due to a <a
     * href="https://stripe.com/docs/api#payouts">Payout</a> object.
     */
    @SerializedName("payout")
    String payout;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReversalDetails extends StripeObject {
    /** Time before which a ReceivedDebit can be reversed. */
    @SerializedName("deadline")
    Long deadline;

    /**
     * Set if a ReceivedDebit can't be reversed.
     *
     * <p>One of {@code already_reversed}, {@code deadline_passed}, {@code network_restricted},
     * {@code other}, or {@code source_flow_restricted}.
     */
    @SerializedName("restricted_reason")
    String restrictedReason;
  }

  public static class TestHelpers {
    private TestHelpers() {}

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
      String path = "/v1/test_helpers/treasury/received_debits";
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return getGlobalResponseGetter().request(request, ReceivedDebit.class);
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
      String path = "/v1/test_helpers/treasury/received_debits";
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return getGlobalResponseGetter().request(request, ReceivedDebit.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(initiatingPaymentMethodDetails, responseGetter);
    trySetResponseGetter(linkedFlows, responseGetter);
    trySetResponseGetter(reversalDetails, responseGetter);
    trySetResponseGetter(transaction, responseGetter);
  }
}

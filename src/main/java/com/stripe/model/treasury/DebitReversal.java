// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.DebitReversalCreateParams;
import com.stripe.param.treasury.DebitReversalListParams;
import com.stripe.param.treasury.DebitReversalRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can reverse some <a href="https://stripe.com/docs/api#received_debits">ReceivedDebits</a>
 * depending on their network and source flow. Reversing a ReceivedDebit leads to the creation of a
 * new object known as a DebitReversal.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DebitReversal extends ApiResource implements HasId {
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

  /** The FinancialAccount to reverse funds from. */
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

  /** Other flows linked to a DebitReversal. */
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
   * The rails used to reverse the funds.
   *
   * <p>One of {@code ach}, or {@code card}.
   */
  @SerializedName("network")
  String network;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.debit_reversal}.
   */
  @SerializedName("object")
  String object;

  /** The ReceivedDebit being reversed. */
  @SerializedName("received_debit")
  String receivedDebit;

  /**
   * Status of the DebitReversal
   *
   * <p>One of {@code failed}, {@code processing}, or {@code succeeded}.
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

  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public static DebitReversal create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public static DebitReversal create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, DebitReversal.class);
  }

  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public static DebitReversal create(DebitReversalCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Reverses a ReceivedDebit and creates a DebitReversal object. */
  public static DebitReversal create(DebitReversalCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DebitReversal.class);
  }

  /** Returns a list of DebitReversals. */
  public static DebitReversalCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of DebitReversals. */
  public static DebitReversalCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, DebitReversalCollection.class);
  }

  /** Returns a list of DebitReversals. */
  public static DebitReversalCollection list(DebitReversalListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of DebitReversals. */
  public static DebitReversalCollection list(DebitReversalListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/debit_reversals";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DebitReversalCollection.class);
  }

  /** Retrieves a DebitReversal object. */
  public static DebitReversal retrieve(String debitReversal) throws StripeException {
    return retrieve(debitReversal, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a DebitReversal object. */
  public static DebitReversal retrieve(String debitReversal, RequestOptions options)
      throws StripeException {
    return retrieve(debitReversal, (Map<String, Object>) null, options);
  }

  /** Retrieves a DebitReversal object. */
  public static DebitReversal retrieve(
      String debitReversal, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/debit_reversals/%s", ApiResource.urlEncodeId(debitReversal));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, DebitReversal.class);
  }

  /** Retrieves a DebitReversal object. */
  public static DebitReversal retrieve(
      String debitReversal, DebitReversalRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/debit_reversals/%s", ApiResource.urlEncodeId(debitReversal));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, DebitReversal.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkedFlows extends StripeObject {
    /** Set if there is an Issuing dispute associated with the DebitReversal. */
    @SerializedName("issuing_dispute")
    String issuingDispute;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when the DebitReversal changed status to {@code completed}. */
    @SerializedName("completed_at")
    Long completedAt;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(linkedFlows, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(transaction, responseGetter);
  }
}

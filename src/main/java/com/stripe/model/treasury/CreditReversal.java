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
import com.stripe.param.treasury.CreditReversalCreateParams;
import com.stripe.param.treasury.CreditReversalListParams;
import com.stripe.param.treasury.CreditReversalRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can reverse some <a href="https://api.stripe.com#received_credits">ReceivedCredits</a>
 * depending on their network and source flow. Reversing a ReceivedCredit leads to the creation of a
 * new object known as a CreditReversal.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditReversal extends ApiResource implements HasId {
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
   * A <a href="https://docs.stripe.com/treasury/moving-money/regulatory-receipts">hosted
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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The rails used to reverse the funds.
   *
   * <p>One of {@code ach}, or {@code stripe}.
   */
  @SerializedName("network")
  String network;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.credit_reversal}.
   */
  @SerializedName("object")
  String object;

  /** The ReceivedCredit being reversed. */
  @SerializedName("received_credit")
  String receivedCredit;

  /**
   * Status of the CreditReversal
   *
   * <p>One of {@code canceled}, {@code posted}, or {@code processing}.
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

  /** Reverses a ReceivedCredit and creates a CreditReversal object. */
  public static CreditReversal create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Reverses a ReceivedCredit and creates a CreditReversal object. */
  public static CreditReversal create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/credit_reversals";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, CreditReversal.class);
  }

  /** Reverses a ReceivedCredit and creates a CreditReversal object. */
  public static CreditReversal create(CreditReversalCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Reverses a ReceivedCredit and creates a CreditReversal object. */
  public static CreditReversal create(CreditReversalCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/credit_reversals";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditReversal.class);
  }

  /** Returns a list of CreditReversals. */
  public static CreditReversalCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of CreditReversals. */
  public static CreditReversalCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/credit_reversals";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditReversalCollection.class);
  }

  /** Returns a list of CreditReversals. */
  public static CreditReversalCollection list(CreditReversalListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of CreditReversals. */
  public static CreditReversalCollection list(
      CreditReversalListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/credit_reversals";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditReversalCollection.class);
  }

  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public static CreditReversal retrieve(String creditReversal) throws StripeException {
    return retrieve(creditReversal, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public static CreditReversal retrieve(String creditReversal, RequestOptions options)
      throws StripeException {
    return retrieve(creditReversal, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public static CreditReversal retrieve(
      String creditReversal, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/credit_reversals/%s", ApiResource.urlEncodeId(creditReversal));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CreditReversal.class);
  }

  /**
   * Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID
   * from either the CreditReversal creation request or CreditReversal list.
   */
  public static CreditReversal retrieve(
      String creditReversal, CreditReversalRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/credit_reversals/%s", ApiResource.urlEncodeId(creditReversal));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CreditReversal.class);
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when the CreditReversal changed status to {@code posted}. */
    @SerializedName("posted_at")
    Long postedAt;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(transaction, responseGetter);
  }
}

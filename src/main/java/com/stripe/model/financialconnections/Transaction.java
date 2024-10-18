// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.TransactionListParams;
import com.stripe.param.financialconnections.TransactionRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Transaction represents a real transaction that affects a Financial Connections Account balance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource implements HasId {
  /** The ID of the Financial Connections Account this transaction belongs to. */
  @SerializedName("account")
  String account;

  /** The amount of this transaction, in cents (or local equivalent). */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The description of this transaction. */
  @SerializedName("description")
  String description;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the transaction.
   *
   * <p>One of {@code pending}, {@code posted}, or {@code void}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Time at which the transaction was transacted. Measured in seconds since the Unix epoch. */
  @SerializedName("transacted_at")
  Long transactedAt;

  /** The token of the transaction refresh that last updated or created this transaction. */
  @SerializedName("transaction_refresh")
  String transactionRefresh;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/transactions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TransactionCollection.class);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public static TransactionCollection list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Transaction} objects. */
  public static TransactionCollection list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/transactions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TransactionCollection.class);
  }

  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public static Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public static Transaction retrieve(String transaction, RequestOptions options)
      throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public static Transaction retrieve(
      String transaction, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/transactions/%s", ApiResource.urlEncodeId(transaction));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Transaction.class);
  }

  /** Retrieves the details of a Financial Connections {@code Transaction}. */
  public static Transaction retrieve(
      String transaction, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/transactions/%s", ApiResource.urlEncodeId(transaction));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Transaction.class);
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Time at which this transaction posted. Measured in seconds since the Unix epoch. */
    @SerializedName("posted_at")
    Long postedAt;

    /** Time at which this transaction was voided. Measured in seconds since the Unix epoch. */
    @SerializedName("void_at")
    Long voidAt;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
  }
}

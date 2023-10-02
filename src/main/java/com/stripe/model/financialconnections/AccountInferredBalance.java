// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.financialconnections.AccountInferredBalanceListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A historical balance for the account on a particular day. It may be sourced from a balance
 * snapshot provided by a financial institution, or inferred using transactions data.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountInferredBalance extends ApiResource implements HasId {
  /**
   * The time for which this balance was calculated, measured in seconds since the Unix epoch. If
   * the balance was computed by Stripe and not provided directly by a financial institution, it
   * will always be 23:59:59 UTC.
   */
  @SerializedName("as_of")
  Long asOf;

  /**
   * The balances owed to (or by) the account holder.
   *
   * <p>Each key is a three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO
   * currency code</a>, in lowercase.
   *
   * <p>Each value is a integer amount. A positive amount indicates money owed to the account
   * holder. A negative amount indicates money owed by the account holder.
   */
  @SerializedName("current")
  Map<String, Long> current;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.account_inferred_balance}.
   */
  @SerializedName("object")
  String object;

  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public static AccountInferredBalanceCollection list(String account, Map<String, Object> params)
      throws StripeException {
    return list(account, params, (RequestOptions) null);
  }

  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public static AccountInferredBalanceCollection list(
      String account, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/inferred_balances",
            ApiResource.urlEncodeId(account));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            AccountInferredBalanceCollection.class,
            options,
            ApiMode.V1);
  }

  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public static AccountInferredBalanceCollection list(
      String account, AccountInferredBalanceListParams params) throws StripeException {
    return list(account, params, (RequestOptions) null);
  }

  /** Lists the recorded inferred balances for a Financial Connections {@code Account}. */
  public static AccountInferredBalanceCollection list(
      String account, AccountInferredBalanceListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/accounts/%s/inferred_balances",
            ApiResource.urlEncodeId(account));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            AccountInferredBalanceCollection.class,
            options,
            ApiMode.V1);
  }
}

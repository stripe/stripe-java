// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CashBalanceRetrieveCashBalanceParams;
import com.stripe.param.CashBalanceRetrieveParams;
import com.stripe.param.CashBalanceUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CashBalance extends ApiResource {
  /**
   * A hash of all cash balances available to this customer. You cannot delete a customer with any
   * cash balances, even if the balance is 0. Amounts are represented in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("available")
  Map<String, Long> available;

  /** The ID of the customer whose cash balance this object represents. */
  @SerializedName("customer")
  String customer;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code cash_balance}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("settings")
  BalanceSettings settings;

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieveCashBalance(String customer) throws StripeException {
    return retrieveCashBalance(customer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieveCashBalance(String customer, RequestOptions options)
      throws StripeException {
    return retrieveCashBalance(customer, (Map<String, Object>) null, options);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieveCashBalance(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CashBalance.class, options);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieveCashBalance(
      String customer, CashBalanceRetrieveCashBalanceParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CashBalance.class, options);
  }

  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String customer) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String customer, RequestOptions options) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, options);
  }

  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(String customer, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CashBalance.class, options);
  }

  /** Retrieves a customer’s cash balance. */
  public CashBalance retrieve(
      String customer, CashBalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CashBalance.class, options);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(this.getCustomer())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CashBalance.class, options);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(CashBalanceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(CashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(this.getCustomer())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, CashBalance.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceSettings extends StripeObject {
    /**
     * The configuration for how funds that land in the customer cash balance are reconciled.
     *
     * <p>One of {@code automatic}, or {@code manual}.
     */
    @SerializedName("reconciliation_mode")
    String reconciliationMode;
  }
}

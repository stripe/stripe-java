// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CashBalanceRetrieveParams;
import com.stripe.param.CashBalanceUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A customer's {@code Cash balance} represents real funds. Customers can add funds to their cash
 * balance by sending a bank transfer. These funds can be used for payment and can eventually be
 * paid out to your bank account.
 */
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
  Settings settings;

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(String customer) throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(String customer, RequestOptions options)
      throws StripeException {
    return retrieve(customer, (Map<String, Object>) null, options);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(
      String customer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CashBalance.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a customer’s cash balance. */
  public static CashBalance retrieve(
      String customer, CashBalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(customer));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CashBalance.class,
            options,
            ApiMode.V1);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(this.getCustomer()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CashBalance.class,
            options,
            ApiMode.V1);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(CashBalanceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Changes the settings on a customer’s cash balance. */
  public CashBalance update(CashBalanceUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/customers/%s/cash_balance", ApiResource.urlEncodeId(this.getCustomer()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CashBalance.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Settings extends StripeObject {
    /**
     * The configuration for how funds that land in the customer cash balance are reconciled.
     *
     * <p>One of {@code automatic}, or {@code manual}.
     */
    @SerializedName("reconciliation_mode")
    String reconciliationMode;

    /**
     * A flag to indicate if reconciliation mode returned is the user's default or is specific to
     * this customer cash balance.
     */
    @SerializedName("using_merchant_default")
    Boolean usingMerchantDefault;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(settings, responseGetter);
  }
}

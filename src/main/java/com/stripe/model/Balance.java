// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.BalanceRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Balance extends ApiResource {
  /**
   * Funds that are available to be transferred or paid out, whether automatically by Stripe or
   * explicitly via the <a href="https://stripe.com/docs/api#transfers">Transfers API</a> or <a
   * href="https://stripe.com/docs/api#payouts">Payouts API</a>. The available balance for each
   * currency and payment type can be found in the {@code source_types} property.
   */
  @SerializedName("available")
  List<Balance.Money> available;

  /**
   * Funds held due to negative balances on connected Custom accounts. The connect reserve balance
   * for each currency and payment type can be found in the {@code source_types} property.
   */
  @SerializedName("connect_reserved")
  List<Balance.Money> connectReserved;

  /** Funds that can be paid out using Instant Payouts. */
  @SerializedName("instant_available")
  List<Balance.Money> instantAvailable;

  @SerializedName("issuing")
  Details issuing;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code balance}.
   */
  @SerializedName("object")
  String object;

  /**
   * Funds that are not yet available in the balance, due to the 7-day rolling pay cycle. The
   * pending balance for each currency, and for each payment type, can be found in the {@code
   * source_types} property.
   */
  @SerializedName("pending")
  List<Balance.Money> pending;

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Balance.class, options);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="https://stripe.com/docs/connect/account-balances#accounting-for-negative-balances">Accounting
   * for negative balances</a>.
   */
  public static Balance retrieve(BalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Balance.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Details extends StripeObject {
    /** Funds that are available for use. */
    @SerializedName("available")
    List<Balance.Money> available;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Money extends StripeObject {
    /** Balance amount. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    @SerializedName("source_types")
    SourceTypes sourceTypes;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceTypes extends StripeObject {
      /** Amount for bank account. */
      @SerializedName("bank_account")
      Long bankAccount;

      /** Amount for card. */
      @SerializedName("card")
      Long card;

      /** Amount for FPX. */
      @SerializedName("fpx")
      Long fpx;
    }
  }
}

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
   * explicitly via the [Transfers API](#transfers) or [Payouts API](#payouts). The available
   * balance for each currency and payment type can be found in the `source_types` property.
   */
  @SerializedName("available")
  List<Balance.Money> available;

  /**
   * Funds held due to negative balances on connected Custom accounts. The connect reserve balance
   * for each currency and payment type can be found in the `source_types` property.
   */
  @SerializedName("connect_reserved")
  List<Balance.Money> connectReserved;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `balance`.
   */
  @SerializedName("object")
  String object;

  /**
   * Funds that are not yet available in the balance, due to the 7-day rolling pay cycle. The
   * pending balance for each currency, and for each payment type, can be found in the
   * `source_types` property.
   */
  @SerializedName("pending")
  List<Balance.Money> pending;

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for negative
   * balances</a>.
   */
  public static Balance retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for negative
   * balances</a>.
   */
  public static Balance retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for negative
   * balances</a>.
   */
  public static Balance retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Balance.class, options);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for negative
   * balances</a>.
   */
  public static Balance retrieve(BalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Balance.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Money extends StripeObject {
    /** Balance amount. */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
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
    }
  }
}

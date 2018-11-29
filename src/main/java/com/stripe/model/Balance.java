package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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
   * Funds that are available to be paid out, whether automatically by Stripe or explicitly via the
   * [transfers API](#transfers). The available balance for each currency and payment type can be
   * found in the `source_types` property.
   */
  List<BalanceAmount> available;

  /**
   * Funds held due to negative balances on connected Custom accounts. The connect reserve balance
   * for each currency and payment type can be found in the `source_types` property.
   */
  List<BalanceAmount> connectReserved;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Funds that are not yet available in the balance, due to the 7-day rolling pay cycle. The
   * pending balance for each currency, and for each payment type, can be found in the
   * `source_types` property.
   */
  List<BalanceAmount> pending;

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request.
   */
  public static Balance retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request.
   */
  public static Balance retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request.
   */
  public static Balance retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance");
    return request(ApiResource.RequestMethod.GET, url, params, Balance.class, options);
  }
}

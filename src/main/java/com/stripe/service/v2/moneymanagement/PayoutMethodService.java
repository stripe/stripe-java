// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.CannotProceedException;
import com.stripe.exception.ControlledByAlternateResourceException;
import com.stripe.exception.InvalidPayoutMethodException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.PayoutMethod;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.PayoutMethodListParams;

public final class PayoutMethodService extends ApiService {
  public PayoutMethodService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List objects that adhere to the PayoutMethod interface. */
  public StripeCollection<PayoutMethod> list(PayoutMethodListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List objects that adhere to the PayoutMethod interface. */
  public StripeCollection<PayoutMethod> list(RequestOptions options) throws StripeException {
    return list((PayoutMethodListParams) null, options);
  }
  /** List objects that adhere to the PayoutMethod interface. */
  public StripeCollection<PayoutMethod> list() throws StripeException {
    return list((PayoutMethodListParams) null, (RequestOptions) null);
  }
  /** List objects that adhere to the PayoutMethod interface. */
  public StripeCollection<PayoutMethod> list(PayoutMethodListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/payout_methods";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PayoutMethod>>() {}.getType());
  }
  /** Retrieve a PayoutMethod object. */
  public PayoutMethod retrieve(String id) throws StripeException, InvalidPayoutMethodException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a PayoutMethod object. */
  public PayoutMethod retrieve(String id, RequestOptions options)
      throws StripeException, InvalidPayoutMethodException {
    String path =
        String.format("/v2/money_management/payout_methods/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PayoutMethod.class);
  }
  /**
   * Archive a {@code PayoutMethod}. Archiving prevents the Payout Method from being used for
   * outbound payments or transfers and omits it from normal list results. To restore list
   * visibility, use the <a
   * href="https://docs.stripe.com/api/v2/money-management/payout-methods/unarchive">unarchive
   * endpoint</a>.
   */
  public PayoutMethod archive(String id)
      throws StripeException, CannotProceedException, InvalidPayoutMethodException,
          ControlledByAlternateResourceException {
    return archive(id, (RequestOptions) null);
  }
  /**
   * Archive a {@code PayoutMethod}. Archiving prevents the Payout Method from being used for
   * outbound payments or transfers and omits it from normal list results. To restore list
   * visibility, use the <a
   * href="https://docs.stripe.com/api/v2/money-management/payout-methods/unarchive">unarchive
   * endpoint</a>.
   */
  public PayoutMethod archive(String id, RequestOptions options)
      throws StripeException, CannotProceedException, InvalidPayoutMethodException,
          ControlledByAlternateResourceException {
    String path =
        String.format(
            "/v2/money_management/payout_methods/%s/archive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutMethod.class);
  }
  /**
   * Disable a {@code PayoutMethod}. Disabling temporarily prevents the Payout Method from being
   * used for outbound payments or transfers while keeping it in normal list results. To re-enable
   * it, complete setup again by <a
   * href="https://docs.stripe.com/api/v2/money-management/outbound-setup-intents/create">creating
   * an Outbound Setup Intent</a>.
   */
  public PayoutMethod disable(String id) throws StripeException, CannotProceedException {
    return disable(id, (RequestOptions) null);
  }
  /**
   * Disable a {@code PayoutMethod}. Disabling temporarily prevents the Payout Method from being
   * used for outbound payments or transfers while keeping it in normal list results. To re-enable
   * it, complete setup again by <a
   * href="https://docs.stripe.com/api/v2/money-management/outbound-setup-intents/create">creating
   * an Outbound Setup Intent</a>.
   */
  public PayoutMethod disable(String id, RequestOptions options)
      throws StripeException, CannotProceedException {
    String path =
        String.format(
            "/v2/money_management/payout_methods/%s/disable", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutMethod.class);
  }
  /**
   * Unarchive a {@code PayoutMethod}. Unarchiving restores the Payout Method to normal list results
   * and clears only its archived state. It doesn't guarantee that the Payout Method can be used.
   */
  public PayoutMethod unarchive(String id)
      throws StripeException, InvalidPayoutMethodException, ControlledByAlternateResourceException {
    return unarchive(id, (RequestOptions) null);
  }
  /**
   * Unarchive a {@code PayoutMethod}. Unarchiving restores the Payout Method to normal list results
   * and clears only its archived state. It doesn't guarantee that the Payout Method can be used.
   */
  public PayoutMethod unarchive(String id, RequestOptions options)
      throws StripeException, InvalidPayoutMethodException, ControlledByAlternateResourceException {
    String path =
        String.format(
            "/v2/money_management/payout_methods/%s/unarchive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutMethod.class);
  }
}

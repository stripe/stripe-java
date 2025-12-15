// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.ControlledByAlternateResourceException;
import com.stripe.exception.ControlledByDashboardException;
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
   * Archive a PayoutMethod object. Archived objects cannot be used as payout methods and will not
   * appear in the payout method list.
   */
  public PayoutMethod archive(String id)
      throws StripeException, ControlledByDashboardException, InvalidPayoutMethodException,
          ControlledByAlternateResourceException {
    return archive(id, (RequestOptions) null);
  }
  /**
   * Archive a PayoutMethod object. Archived objects cannot be used as payout methods and will not
   * appear in the payout method list.
   */
  public PayoutMethod archive(String id, RequestOptions options)
      throws StripeException, ControlledByDashboardException, InvalidPayoutMethodException,
          ControlledByAlternateResourceException {
    String path =
        String.format(
            "/v2/money_management/payout_methods/%s/archive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutMethod.class);
  }
  /** Unarchive an PayoutMethod object. */
  public PayoutMethod unarchive(String id)
      throws StripeException, ControlledByDashboardException, InvalidPayoutMethodException,
          ControlledByAlternateResourceException {
    return unarchive(id, (RequestOptions) null);
  }
  /** Unarchive an PayoutMethod object. */
  public PayoutMethod unarchive(String id, RequestOptions options)
      throws StripeException, ControlledByDashboardException, InvalidPayoutMethodException,
          ControlledByAlternateResourceException {
    String path =
        String.format(
            "/v2/money_management/payout_methods/%s/unarchive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutMethod.class);
  }
}

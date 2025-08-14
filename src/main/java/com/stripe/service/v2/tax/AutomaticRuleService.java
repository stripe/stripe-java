// File generated from our OpenAPI spec
package com.stripe.service.v2.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.tax.AutomaticRule;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.tax.AutomaticRuleCreateParams;
import com.stripe.param.v2.tax.AutomaticRuleFindParams;
import com.stripe.param.v2.tax.AutomaticRuleUpdateParams;

public final class AutomaticRuleService extends ApiService {
  public AutomaticRuleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Creates an AutomaticRule object. */
  public AutomaticRule create(AutomaticRuleCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an AutomaticRule object. */
  public AutomaticRule create(AutomaticRuleCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/tax/automatic_rules";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AutomaticRule.class);
  }
  /** Finds an AutomaticRule object by BillableItem ID. */
  public AutomaticRule find(AutomaticRuleFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }
  /** Finds an AutomaticRule object by BillableItem ID. */
  public AutomaticRule find(AutomaticRuleFindParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/tax/automatic_rules/find";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AutomaticRule.class);
  }
  /** Retrieves an AutomaticRule object by ID. */
  public AutomaticRule retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an AutomaticRule object by ID. */
  public AutomaticRule retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/tax/automatic_rules/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AutomaticRule.class);
  }
  /** Updates the automatic Tax configuration for an AutomaticRule object. */
  public AutomaticRule update(String id, AutomaticRuleUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the automatic Tax configuration for an AutomaticRule object. */
  public AutomaticRule update(String id, AutomaticRuleUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/tax/automatic_rules/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AutomaticRule.class);
  }
  /**
   * Deactivates an AutomaticRule object. Deactivated AutomaticRule objects are ignored in future
   * tax calculations.
   */
  public AutomaticRule deactivate(String id) throws StripeException {
    return deactivate(id, (RequestOptions) null);
  }
  /**
   * Deactivates an AutomaticRule object. Deactivated AutomaticRule objects are ignored in future
   * tax calculations.
   */
  public AutomaticRule deactivate(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/tax/automatic_rules/%s/deactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, AutomaticRule.class);
  }
}

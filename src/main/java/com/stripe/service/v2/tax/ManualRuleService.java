// File generated from our OpenAPI spec
package com.stripe.service.v2.tax;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.tax.ManualRule;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.tax.ManualRuleCreateParams;
import com.stripe.param.v2.tax.ManualRuleListParams;
import com.stripe.param.v2.tax.ManualRuleUpdateParams;

public final class ManualRuleService extends ApiService {
  public ManualRuleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all ManualRule objects. */
  public StripeCollection<ManualRule> list(ManualRuleListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all ManualRule objects. */
  public StripeCollection<ManualRule> list(RequestOptions options) throws StripeException {
    return list((ManualRuleListParams) null, options);
  }
  /** List all ManualRule objects. */
  public StripeCollection<ManualRule> list() throws StripeException {
    return list((ManualRuleListParams) null, (RequestOptions) null);
  }
  /** List all ManualRule objects. */
  public StripeCollection<ManualRule> list(ManualRuleListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/tax/manual_rules";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<ManualRule>>() {}.getType());
  }
  /** Creates a ManualRule object. */
  public ManualRule create(ManualRuleCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a ManualRule object. */
  public ManualRule create(ManualRuleCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/tax/manual_rules";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ManualRule.class);
  }
  /** Retrieves a ManualRule object by ID. */
  public ManualRule retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a ManualRule object by ID. */
  public ManualRule retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/tax/manual_rules/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ManualRule.class);
  }
  /** Updates the Tax configuration for a ManualRule object. */
  public ManualRule update(String id, ManualRuleUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the Tax configuration for a ManualRule object. */
  public ManualRule update(String id, ManualRuleUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/tax/manual_rules/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, ManualRule.class);
  }
  /** Deactivates a ManualRule object. */
  public ManualRule deactivate(String id) throws StripeException {
    return deactivate(id, (RequestOptions) null);
  }
  /** Deactivates a ManualRule object. */
  public ManualRule deactivate(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/tax/manual_rules/%s/deactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, ManualRule.class);
  }
}

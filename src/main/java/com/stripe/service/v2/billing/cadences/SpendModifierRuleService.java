// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.cadences;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.CadenceSpendModifier;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.cadences.SpendModifierRuleListParams;

public final class SpendModifierRuleService extends ApiService {
  public SpendModifierRuleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all Spend Modifiers associated with a Billing Cadence. */
  public StripeCollection<CadenceSpendModifier> list(
      String cadenceId, SpendModifierRuleListParams params) throws StripeException {
    return list(cadenceId, params, (RequestOptions) null);
  }
  /** List all Spend Modifiers associated with a Billing Cadence. */
  public StripeCollection<CadenceSpendModifier> list(String cadenceId, RequestOptions options)
      throws StripeException {
    return list(cadenceId, (SpendModifierRuleListParams) null, options);
  }
  /** List all Spend Modifiers associated with a Billing Cadence. */
  public StripeCollection<CadenceSpendModifier> list(String cadenceId) throws StripeException {
    return list(cadenceId, (SpendModifierRuleListParams) null, (RequestOptions) null);
  }
  /** List all Spend Modifiers associated with a Billing Cadence. */
  public StripeCollection<CadenceSpendModifier> list(
      String cadenceId, SpendModifierRuleListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/cadences/%s/spend_modifier_rules", ApiResource.urlEncodeId(cadenceId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CadenceSpendModifier>>() {}.getType());
  }
  /** Retrieve a Spend Modifier associated with a Billing Cadence. */
  public CadenceSpendModifier retrieve(String cadenceId, String id) throws StripeException {
    return retrieve(cadenceId, id, (RequestOptions) null);
  }
  /** Retrieve a Spend Modifier associated with a Billing Cadence. */
  public CadenceSpendModifier retrieve(String cadenceId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/cadences/%s/spend_modifier_rules/%s",
            ApiResource.urlEncodeId(cadenceId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, CadenceSpendModifier.class);
  }
}

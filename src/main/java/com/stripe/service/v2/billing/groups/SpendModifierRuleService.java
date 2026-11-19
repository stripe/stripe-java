// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.groups;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.GroupSpendModifier;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.groups.SpendModifierRuleListParams;

public final class SpendModifierRuleService extends ApiService {
  public SpendModifierRuleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List spend modifiers associated with a billing group. */
  public StripeCollection<GroupSpendModifier> list(
      String groupId, SpendModifierRuleListParams params) throws StripeException {
    return list(groupId, params, (RequestOptions) null);
  }
  /** List spend modifiers associated with a billing group. */
  public StripeCollection<GroupSpendModifier> list(String groupId, RequestOptions options)
      throws StripeException {
    return list(groupId, (SpendModifierRuleListParams) null, options);
  }
  /** List spend modifiers associated with a billing group. */
  public StripeCollection<GroupSpendModifier> list(String groupId) throws StripeException {
    return list(groupId, (SpendModifierRuleListParams) null, (RequestOptions) null);
  }
  /** List spend modifiers associated with a billing group. */
  public StripeCollection<GroupSpendModifier> list(
      String groupId, SpendModifierRuleListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/groups/%s/spend_modifier_rules", ApiResource.urlEncodeId(groupId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<GroupSpendModifier>>() {}.getType());
  }
  /** Retrieve a spend modifier associated with a billing group. */
  public GroupSpendModifier retrieve(String groupId, String id) throws StripeException {
    return retrieve(groupId, id, (RequestOptions) null);
  }
  /** Retrieve a spend modifier associated with a billing group. */
  public GroupSpendModifier retrieve(String groupId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/groups/%s/spend_modifier_rules/%s",
            ApiResource.urlEncodeId(groupId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, GroupSpendModifier.class);
  }
}

// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement.rewardprograms;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.RewardProgramRule;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.rewardprograms.RuleCreateParams;
import com.stripe.param.v2.moneymanagement.rewardprograms.RuleListParams;
import com.stripe.param.v2.moneymanagement.rewardprograms.RuleUpdateParams;

public final class RuleService extends ApiService {
  public RuleService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of RewardProgramRules for a RewardProgram. */
  public StripeCollection<RewardProgramRule> list(String rewardProgramId, RuleListParams params)
      throws StripeException {
    return list(rewardProgramId, params, (RequestOptions) null);
  }
  /** Returns a list of RewardProgramRules for a RewardProgram. */
  public StripeCollection<RewardProgramRule> list(String rewardProgramId, RequestOptions options)
      throws StripeException {
    return list(rewardProgramId, (RuleListParams) null, options);
  }
  /** Returns a list of RewardProgramRules for a RewardProgram. */
  public StripeCollection<RewardProgramRule> list(String rewardProgramId) throws StripeException {
    return list(rewardProgramId, (RuleListParams) null, (RequestOptions) null);
  }
  /** Returns a list of RewardProgramRules for a RewardProgram. */
  public StripeCollection<RewardProgramRule> list(
      String rewardProgramId, RuleListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/rules",
            ApiResource.urlEncodeId(rewardProgramId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<RewardProgramRule>>() {}.getType());
  }
  /**
   * Creates a new RewardProgramRule under the given RewardProgram. RewardProgramRules are inactive
   * by default on creation; use ActivateRewardProgramRule to make them eligible for reward
   * evaluation.
   */
  public RewardProgramRule create(String rewardProgramId, RuleCreateParams params)
      throws StripeException {
    return create(rewardProgramId, params, (RequestOptions) null);
  }
  /**
   * Creates a new RewardProgramRule under the given RewardProgram. RewardProgramRules are inactive
   * by default on creation; use ActivateRewardProgramRule to make them eligible for reward
   * evaluation.
   */
  public RewardProgramRule create(
      String rewardProgramId, RuleCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/rules",
            ApiResource.urlEncodeId(rewardProgramId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RewardProgramRule.class);
  }
  /** Retrieves the details of an existing RewardProgramRule. */
  public RewardProgramRule retrieve(String rewardProgramId, String id) throws StripeException {
    return retrieve(rewardProgramId, id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing RewardProgramRule. */
  public RewardProgramRule retrieve(String rewardProgramId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/rules/%s",
            ApiResource.urlEncodeId(rewardProgramId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RewardProgramRule.class);
  }
  /**
   * Updates the mutable fields of an existing RewardProgramRule. Use ActivateRewardProgramRule /
   * DeactivateRewardProgramRule to change the RewardProgramRule's status.
   */
  public RewardProgramRule update(String rewardProgramId, String id, RuleUpdateParams params)
      throws StripeException {
    return update(rewardProgramId, id, params, (RequestOptions) null);
  }
  /**
   * Updates the mutable fields of an existing RewardProgramRule. Use ActivateRewardProgramRule /
   * DeactivateRewardProgramRule to change the RewardProgramRule's status.
   */
  public RewardProgramRule update(String rewardProgramId, String id, RequestOptions options)
      throws StripeException {
    return update(rewardProgramId, id, (RuleUpdateParams) null, options);
  }
  /**
   * Updates the mutable fields of an existing RewardProgramRule. Use ActivateRewardProgramRule /
   * DeactivateRewardProgramRule to change the RewardProgramRule's status.
   */
  public RewardProgramRule update(String rewardProgramId, String id) throws StripeException {
    return update(rewardProgramId, id, (RuleUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the mutable fields of an existing RewardProgramRule. Use ActivateRewardProgramRule /
   * DeactivateRewardProgramRule to change the RewardProgramRule's status.
   */
  public RewardProgramRule update(
      String rewardProgramId, String id, RuleUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/rules/%s",
            ApiResource.urlEncodeId(rewardProgramId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RewardProgramRule.class);
  }
  /**
   * Activates a RewardProgramRule. At most one RewardProgramRule may be active per RewardProgram at
   * a time. Idempotent: calling this on a RewardProgramRule that is already active returns 200 with
   * the current object unchanged.
   */
  public RewardProgramRule activate(String rewardProgramId, String id) throws StripeException {
    return activate(rewardProgramId, id, (RequestOptions) null);
  }
  /**
   * Activates a RewardProgramRule. At most one RewardProgramRule may be active per RewardProgram at
   * a time. Idempotent: calling this on a RewardProgramRule that is already active returns 200 with
   * the current object unchanged.
   */
  public RewardProgramRule activate(String rewardProgramId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/rules/%s/activate",
            ApiResource.urlEncodeId(rewardProgramId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RewardProgramRule.class);
  }
  /**
   * Deactivates a RewardProgramRule. Idempotent: calling this on a RewardProgramRule that is
   * already inactive returns 200 with the current object unchanged.
   */
  public RewardProgramRule deactivate(String rewardProgramId, String id) throws StripeException {
    return deactivate(rewardProgramId, id, (RequestOptions) null);
  }
  /**
   * Deactivates a RewardProgramRule. Idempotent: calling this on a RewardProgramRule that is
   * already inactive returns 200 with the current object unchanged.
   */
  public RewardProgramRule deactivate(String rewardProgramId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/rules/%s/deactivate",
            ApiResource.urlEncodeId(rewardProgramId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RewardProgramRule.class);
  }
}

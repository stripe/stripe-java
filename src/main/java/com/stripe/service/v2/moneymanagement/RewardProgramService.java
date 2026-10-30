// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.RewardProgram;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.RewardProgramCreateParams;
import com.stripe.param.v2.moneymanagement.RewardProgramListParams;
import com.stripe.param.v2.moneymanagement.RewardProgramUpdateParams;

public final class RewardProgramService extends ApiService {
  public RewardProgramService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of RewardPrograms. */
  public StripeCollection<RewardProgram> list(RewardProgramListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of RewardPrograms. */
  public StripeCollection<RewardProgram> list(RequestOptions options) throws StripeException {
    return list((RewardProgramListParams) null, options);
  }
  /** Returns a list of RewardPrograms. */
  public StripeCollection<RewardProgram> list() throws StripeException {
    return list((RewardProgramListParams) null, (RequestOptions) null);
  }
  /** Returns a list of RewardPrograms. */
  public StripeCollection<RewardProgram> list(
      RewardProgramListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/reward_programs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<RewardProgram>>() {}.getType());
  }
  /**
   * Creates a new RewardProgram. RewardPrograms are inactive by default on creation; use
   * ActivateRewardProgram to make them eligible for reward evaluation.
   */
  public RewardProgram create(RewardProgramCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new RewardProgram. RewardPrograms are inactive by default on creation; use
   * ActivateRewardProgram to make them eligible for reward evaluation.
   */
  public RewardProgram create(RewardProgramCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/reward_programs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RewardProgram.class);
  }
  /** Retrieves the details of an existing RewardProgram. */
  public RewardProgram retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing RewardProgram. */
  public RewardProgram retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/reward_programs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RewardProgram.class);
  }
  /**
   * Updates the mutable fields of an existing RewardProgram. Use ActivateRewardProgram /
   * DeactivateRewardProgram to change the RewardProgram's status.
   */
  public RewardProgram update(String id, RewardProgramUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the mutable fields of an existing RewardProgram. Use ActivateRewardProgram /
   * DeactivateRewardProgram to change the RewardProgram's status.
   */
  public RewardProgram update(String id, RequestOptions options) throws StripeException {
    return update(id, (RewardProgramUpdateParams) null, options);
  }
  /**
   * Updates the mutable fields of an existing RewardProgram. Use ActivateRewardProgram /
   * DeactivateRewardProgram to change the RewardProgram's status.
   */
  public RewardProgram update(String id) throws StripeException {
    return update(id, (RewardProgramUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the mutable fields of an existing RewardProgram. Use ActivateRewardProgram /
   * DeactivateRewardProgram to change the RewardProgram's status.
   */
  public RewardProgram update(String id, RewardProgramUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v2/money_management/reward_programs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RewardProgram.class);
  }
  /**
   * Activates a RewardProgram, making it eligible for reward evaluation. Idempotent: calling this
   * on a RewardProgram that is already active returns 200 with the current object unchanged.
   */
  public RewardProgram activate(String id) throws StripeException {
    return activate(id, (RequestOptions) null);
  }
  /**
   * Activates a RewardProgram, making it eligible for reward evaluation. Idempotent: calling this
   * on a RewardProgram that is already active returns 200 with the current object unchanged.
   */
  public RewardProgram activate(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/activate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RewardProgram.class);
  }
  /**
   * Deactivates a RewardProgram. Idempotent: calling this on a RewardProgram that is already
   * inactive returns 200 with the current object unchanged.
   */
  public RewardProgram deactivate(String id) throws StripeException {
    return deactivate(id, (RequestOptions) null);
  }
  /**
   * Deactivates a RewardProgram. Idempotent: calling this on a RewardProgram that is already
   * inactive returns 200 with the current object unchanged.
   */
  public RewardProgram deactivate(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_programs/%s/deactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RewardProgram.class);
  }

  public com.stripe.service.v2.moneymanagement.rewardprograms.RuleService rules() {
    return new com.stripe.service.v2.moneymanagement.rewardprograms.RuleService(
        this.getResponseGetter());
  }
}

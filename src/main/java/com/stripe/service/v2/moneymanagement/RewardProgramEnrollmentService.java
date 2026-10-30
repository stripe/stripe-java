// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.RewardProgramEnrollment;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.RewardProgramEnrollmentCreateParams;
import com.stripe.param.v2.moneymanagement.RewardProgramEnrollmentListParams;

public final class RewardProgramEnrollmentService extends ApiService {
  public RewardProgramEnrollmentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of RewardProgramEnrollments. Omitting {@code reward_program} returns
   * platform-wide enrollments across all RewardPrograms.
   */
  public StripeCollection<RewardProgramEnrollment> list(RewardProgramEnrollmentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of RewardProgramEnrollments. Omitting {@code reward_program} returns
   * platform-wide enrollments across all RewardPrograms.
   */
  public StripeCollection<RewardProgramEnrollment> list(RequestOptions options)
      throws StripeException {
    return list((RewardProgramEnrollmentListParams) null, options);
  }
  /**
   * Returns a list of RewardProgramEnrollments. Omitting {@code reward_program} returns
   * platform-wide enrollments across all RewardPrograms.
   */
  public StripeCollection<RewardProgramEnrollment> list() throws StripeException {
    return list((RewardProgramEnrollmentListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of RewardProgramEnrollments. Omitting {@code reward_program} returns
   * platform-wide enrollments across all RewardPrograms.
   */
  public StripeCollection<RewardProgramEnrollment> list(
      RewardProgramEnrollmentListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/reward_program_enrollments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<RewardProgramEnrollment>>() {}.getType());
  }
  /**
   * Creates a new RewardProgramEnrollment, binding a connected account / Issuer Program to a
   * RewardProgram. RewardProgramEnrollments are active by default on creation.
   */
  public RewardProgramEnrollment create(RewardProgramEnrollmentCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new RewardProgramEnrollment, binding a connected account / Issuer Program to a
   * RewardProgram. RewardProgramEnrollments are active by default on creation.
   */
  public RewardProgramEnrollment create(
      RewardProgramEnrollmentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/reward_program_enrollments";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RewardProgramEnrollment.class);
  }
  /** Retrieves the details of an existing RewardProgramEnrollment. */
  public RewardProgramEnrollment retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing RewardProgramEnrollment. */
  public RewardProgramEnrollment retrieve(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_program_enrollments/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, RewardProgramEnrollment.class);
  }
  /**
   * Activates a RewardProgramEnrollment. At most one RewardProgramEnrollment may be active per
   * Issuer Program globally, across all RewardPrograms. Idempotent: calling this on a
   * RewardProgramEnrollment that is already active returns 200 with the current object unchanged.
   */
  public RewardProgramEnrollment activate(String id) throws StripeException {
    return activate(id, (RequestOptions) null);
  }
  /**
   * Activates a RewardProgramEnrollment. At most one RewardProgramEnrollment may be active per
   * Issuer Program globally, across all RewardPrograms. Idempotent: calling this on a
   * RewardProgramEnrollment that is already active returns 200 with the current object unchanged.
   */
  public RewardProgramEnrollment activate(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_program_enrollments/%s/activate",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RewardProgramEnrollment.class);
  }
  /**
   * Deactivates a RewardProgramEnrollment. Idempotent: calling this on a RewardProgramEnrollment
   * that is already inactive returns 200 with the current object unchanged.
   */
  public RewardProgramEnrollment deactivate(String id) throws StripeException {
    return deactivate(id, (RequestOptions) null);
  }
  /**
   * Deactivates a RewardProgramEnrollment. Idempotent: calling this on a RewardProgramEnrollment
   * that is already inactive returns 200 with the current object unchanged.
   */
  public RewardProgramEnrollment deactivate(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/reward_program_enrollments/%s/deactivate",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, RewardProgramEnrollment.class);
  }
}

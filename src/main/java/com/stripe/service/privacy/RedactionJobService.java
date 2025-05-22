// File generated from our OpenAPI spec
package com.stripe.service.privacy;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.privacy.RedactionJob;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.privacy.RedactionJobCancelParams;
import com.stripe.param.privacy.RedactionJobCreateParams;
import com.stripe.param.privacy.RedactionJobListParams;
import com.stripe.param.privacy.RedactionJobRetrieveParams;
import com.stripe.param.privacy.RedactionJobRunParams;
import com.stripe.param.privacy.RedactionJobUpdateParams;
import com.stripe.param.privacy.RedactionJobValidateParams;

public final class RedactionJobService extends ApiService {
  public RedactionJobService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of redaction jobs. */
  public StripeCollection<RedactionJob> list(RedactionJobListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of redaction jobs. */
  public StripeCollection<RedactionJob> list(RequestOptions options) throws StripeException {
    return list((RedactionJobListParams) null, options);
  }
  /** Returns a list of redaction jobs. */
  public StripeCollection<RedactionJob> list() throws StripeException {
    return list((RedactionJobListParams) null, (RequestOptions) null);
  }
  /** Returns a list of redaction jobs. */
  public StripeCollection<RedactionJob> list(RedactionJobListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<RedactionJob>>() {}.getType());
  }
  /** Creates a redaction job. When a job is created, it will start to validate. */
  public RedactionJob create(RedactionJobCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a redaction job. When a job is created, it will start to validate. */
  public RedactionJob create(RedactionJobCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RedactionJob.class);
  }
  /** Retrieves the details of a previously created redaction job. */
  public RedactionJob retrieve(String job, RedactionJobRetrieveParams params)
      throws StripeException {
    return retrieve(job, params, (RequestOptions) null);
  }
  /** Retrieves the details of a previously created redaction job. */
  public RedactionJob retrieve(String job, RequestOptions options) throws StripeException {
    return retrieve(job, (RedactionJobRetrieveParams) null, options);
  }
  /** Retrieves the details of a previously created redaction job. */
  public RedactionJob retrieve(String job) throws StripeException {
    return retrieve(job, (RedactionJobRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of a previously created redaction job. */
  public RedactionJob retrieve(
      String job, RedactionJobRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RedactionJob.class);
  }
  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(String job, RedactionJobUpdateParams params) throws StripeException {
    return update(job, params, (RequestOptions) null);
  }
  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(String job, RequestOptions options) throws StripeException {
    return update(job, (RedactionJobUpdateParams) null, options);
  }
  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(String job) throws StripeException {
    return update(job, (RedactionJobUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(String job, RedactionJobUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RedactionJob.class);
  }
  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(String job, RedactionJobCancelParams params) throws StripeException {
    return cancel(job, params, (RequestOptions) null);
  }
  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(String job, RequestOptions options) throws StripeException {
    return cancel(job, (RedactionJobCancelParams) null, options);
  }
  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(String job) throws StripeException {
    return cancel(job, (RedactionJobCancelParams) null, (RequestOptions) null);
  }
  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(String job, RedactionJobCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s/cancel", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RedactionJob.class);
  }
  /**
   * Run a redaction job in a {@code ready} status.
   *
   * <p>When you run a job, the configured objects will be redacted asynchronously. This action is
   * irreversible and cannot be canceled once started.
   *
   * <p>The status of the job will move to {@code redacting}. Once all of the objects are redacted,
   * the status will become {@code succeeded}. If the job’s {@code validation_behavior} is set to
   * {@code fix}, the automatic fixes will be applied to objects at this step.
   */
  public RedactionJob run(String job, RedactionJobRunParams params) throws StripeException {
    return run(job, params, (RequestOptions) null);
  }
  /**
   * Run a redaction job in a {@code ready} status.
   *
   * <p>When you run a job, the configured objects will be redacted asynchronously. This action is
   * irreversible and cannot be canceled once started.
   *
   * <p>The status of the job will move to {@code redacting}. Once all of the objects are redacted,
   * the status will become {@code succeeded}. If the job’s {@code validation_behavior} is set to
   * {@code fix}, the automatic fixes will be applied to objects at this step.
   */
  public RedactionJob run(String job, RequestOptions options) throws StripeException {
    return run(job, (RedactionJobRunParams) null, options);
  }
  /**
   * Run a redaction job in a {@code ready} status.
   *
   * <p>When you run a job, the configured objects will be redacted asynchronously. This action is
   * irreversible and cannot be canceled once started.
   *
   * <p>The status of the job will move to {@code redacting}. Once all of the objects are redacted,
   * the status will become {@code succeeded}. If the job’s {@code validation_behavior} is set to
   * {@code fix}, the automatic fixes will be applied to objects at this step.
   */
  public RedactionJob run(String job) throws StripeException {
    return run(job, (RedactionJobRunParams) null, (RequestOptions) null);
  }
  /**
   * Run a redaction job in a {@code ready} status.
   *
   * <p>When you run a job, the configured objects will be redacted asynchronously. This action is
   * irreversible and cannot be canceled once started.
   *
   * <p>The status of the job will move to {@code redacting}. Once all of the objects are redacted,
   * the status will become {@code succeeded}. If the job’s {@code validation_behavior} is set to
   * {@code fix}, the automatic fixes will be applied to objects at this step.
   */
  public RedactionJob run(String job, RedactionJobRunParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/privacy/redaction_jobs/%s/run", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RedactionJob.class);
  }
  /**
   * Validate a redaction job when it is in a {@code failed} status.
   *
   * <p>When a job is created, it automatically begins to validate on the configured objects’
   * eligibility for redaction. Use this to validate the job again after its validation errors are
   * resolved or the job’s {@code validation_behavior} is changed.
   *
   * <p>The status of the job will move to {@code validating}. Once all of the objects are
   * validated, the status of the job will become {@code ready}. If there are any validation errors
   * preventing the job from running, the status will become {@code failed}.
   */
  public RedactionJob validate(String job, RedactionJobValidateParams params)
      throws StripeException {
    return validate(job, params, (RequestOptions) null);
  }
  /**
   * Validate a redaction job when it is in a {@code failed} status.
   *
   * <p>When a job is created, it automatically begins to validate on the configured objects’
   * eligibility for redaction. Use this to validate the job again after its validation errors are
   * resolved or the job’s {@code validation_behavior} is changed.
   *
   * <p>The status of the job will move to {@code validating}. Once all of the objects are
   * validated, the status of the job will become {@code ready}. If there are any validation errors
   * preventing the job from running, the status will become {@code failed}.
   */
  public RedactionJob validate(String job, RequestOptions options) throws StripeException {
    return validate(job, (RedactionJobValidateParams) null, options);
  }
  /**
   * Validate a redaction job when it is in a {@code failed} status.
   *
   * <p>When a job is created, it automatically begins to validate on the configured objects’
   * eligibility for redaction. Use this to validate the job again after its validation errors are
   * resolved or the job’s {@code validation_behavior} is changed.
   *
   * <p>The status of the job will move to {@code validating}. Once all of the objects are
   * validated, the status of the job will become {@code ready}. If there are any validation errors
   * preventing the job from running, the status will become {@code failed}.
   */
  public RedactionJob validate(String job) throws StripeException {
    return validate(job, (RedactionJobValidateParams) null, (RequestOptions) null);
  }
  /**
   * Validate a redaction job when it is in a {@code failed} status.
   *
   * <p>When a job is created, it automatically begins to validate on the configured objects’
   * eligibility for redaction. Use this to validate the job again after its validation errors are
   * resolved or the job’s {@code validation_behavior} is changed.
   *
   * <p>The status of the job will move to {@code validating}. Once all of the objects are
   * validated, the status of the job will become {@code ready}. If there are any validation errors
   * preventing the job from running, the status will become {@code failed}.
   */
  public RedactionJob validate(
      String job, RedactionJobValidateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s/validate", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, RedactionJob.class);
  }

  public com.stripe.service.privacy.RedactionJobValidationErrorService validationErrors() {
    return new com.stripe.service.privacy.RedactionJobValidationErrorService(
        this.getResponseGetter());
  }
}

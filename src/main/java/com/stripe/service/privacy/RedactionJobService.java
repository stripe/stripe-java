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

  /** List redaction jobs method... */
  public StripeCollection<RedactionJob> list(RedactionJobListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List redaction jobs method... */
  public StripeCollection<RedactionJob> list(RequestOptions options) throws StripeException {
    return list((RedactionJobListParams) null, options);
  }
  /** List redaction jobs method... */
  public StripeCollection<RedactionJob> list() throws StripeException {
    return list((RedactionJobListParams) null, (RequestOptions) null);
  }
  /** List redaction jobs method... */
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
  /** Create redaction job method. */
  public RedactionJob create(RedactionJobCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create redaction job method. */
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
  /** Retrieve redaction job method. */
  public RedactionJob retrieve(String job, RedactionJobRetrieveParams params)
      throws StripeException {
    return retrieve(job, params, (RequestOptions) null);
  }
  /** Retrieve redaction job method. */
  public RedactionJob retrieve(String job, RequestOptions options) throws StripeException {
    return retrieve(job, (RedactionJobRetrieveParams) null, options);
  }
  /** Retrieve redaction job method. */
  public RedactionJob retrieve(String job) throws StripeException {
    return retrieve(job, (RedactionJobRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve redaction job method. */
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
  /** Update redaction job method. */
  public RedactionJob update(String job, RedactionJobUpdateParams params) throws StripeException {
    return update(job, params, (RequestOptions) null);
  }
  /** Update redaction job method. */
  public RedactionJob update(String job, RequestOptions options) throws StripeException {
    return update(job, (RedactionJobUpdateParams) null, options);
  }
  /** Update redaction job method. */
  public RedactionJob update(String job) throws StripeException {
    return update(job, (RedactionJobUpdateParams) null, (RequestOptions) null);
  }
  /** Update redaction job method. */
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
  /** Cancel redaction job method. */
  public RedactionJob cancel(String job, RedactionJobCancelParams params) throws StripeException {
    return cancel(job, params, (RequestOptions) null);
  }
  /** Cancel redaction job method. */
  public RedactionJob cancel(String job, RequestOptions options) throws StripeException {
    return cancel(job, (RedactionJobCancelParams) null, options);
  }
  /** Cancel redaction job method. */
  public RedactionJob cancel(String job) throws StripeException {
    return cancel(job, (RedactionJobCancelParams) null, (RequestOptions) null);
  }
  /** Cancel redaction job method. */
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
  /** Run redaction job method. */
  public RedactionJob run(String job, RedactionJobRunParams params) throws StripeException {
    return run(job, params, (RequestOptions) null);
  }
  /** Run redaction job method. */
  public RedactionJob run(String job, RequestOptions options) throws StripeException {
    return run(job, (RedactionJobRunParams) null, options);
  }
  /** Run redaction job method. */
  public RedactionJob run(String job) throws StripeException {
    return run(job, (RedactionJobRunParams) null, (RequestOptions) null);
  }
  /** Run redaction job method. */
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
  /** Validate redaction job method. */
  public RedactionJob validate(String job, RedactionJobValidateParams params)
      throws StripeException {
    return validate(job, params, (RequestOptions) null);
  }
  /** Validate redaction job method. */
  public RedactionJob validate(String job, RequestOptions options) throws StripeException {
    return validate(job, (RedactionJobValidateParams) null, options);
  }
  /** Validate redaction job method. */
  public RedactionJob validate(String job) throws StripeException {
    return validate(job, (RedactionJobValidateParams) null, (RequestOptions) null);
  }
  /** Validate redaction job method. */
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

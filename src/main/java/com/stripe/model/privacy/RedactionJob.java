// File generated from our OpenAPI spec
package com.stripe.model.privacy;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
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
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Redaction Jobs store the status of a redaction request. They are created when a redaction request
 * is made and track the redaction validation and execution.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RedactionJob extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code privacy.redaction_job}.
   */
  @SerializedName("object")
  String object;

  /** The objects at the root level that are subject to redaction. */
  @SerializedName("objects")
  RedactionJobRootObjects objects;

  /**
   * The status field represents the current state of the redaction job. It can take on any of the
   * following values: VALIDATING, READY, REDACTING, SUCCEEDED, CANCELED, FAILED.
   */
  @SerializedName("status")
  String status;

  /**
   * Default is &quot;error&quot;. If &quot;error&quot;, we will make sure all objects in the graph
   * are redactable in the 1st traversal, otherwise error. If &quot;fix&quot;, where possible, we
   * will auto-fix any validation errors (e.g. by auto-transitioning objects to a terminal state,
   * etc.) in the 2nd traversal before redacting
   */
  @SerializedName("validation_behavior")
  String validationBehavior;

  /** Cancel redaction job method. */
  public RedactionJob cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancel redaction job method. */
  public RedactionJob cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancel redaction job method. */
  public RedactionJob cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancel redaction job method. */
  public RedactionJob cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Cancel redaction job method. */
  public RedactionJob cancel(RedactionJobCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancel redaction job method. */
  public RedactionJob cancel(RedactionJobCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Create redaction job method. */
  public static RedactionJob create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create redaction job method. */
  public static RedactionJob create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJob.class);
  }

  /** Create redaction job method. */
  public static RedactionJob create(RedactionJobCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create redaction job method. */
  public static RedactionJob create(RedactionJobCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RedactionJob.class);
  }

  /** List redaction jobs method... */
  public static RedactionJobCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List redaction jobs method... */
  public static RedactionJobCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJobCollection.class);
  }

  /** List redaction jobs method... */
  public static RedactionJobCollection list(RedactionJobListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List redaction jobs method... */
  public static RedactionJobCollection list(RedactionJobListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RedactionJobCollection.class);
  }

  /** Retrieve redaction job method. */
  public static RedactionJob retrieve(String job) throws StripeException {
    return retrieve(job, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve redaction job method. */
  public static RedactionJob retrieve(String job, RequestOptions options) throws StripeException {
    return retrieve(job, (Map<String, Object>) null, options);
  }

  /** Retrieve redaction job method. */
  public static RedactionJob retrieve(
      String job, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJob.class);
  }

  /** Retrieve redaction job method. */
  public static RedactionJob retrieve(
      String job, RedactionJobRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(job));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RedactionJob.class);
  }

  /** Run redaction job method. */
  public RedactionJob run() throws StripeException {
    return run((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Run redaction job method. */
  public RedactionJob run(RequestOptions options) throws StripeException {
    return run((Map<String, Object>) null, options);
  }

  /** Run redaction job method. */
  public RedactionJob run(Map<String, Object> params) throws StripeException {
    return run(params, (RequestOptions) null);
  }

  /** Run redaction job method. */
  public RedactionJob run(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s/run", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Run redaction job method. */
  public RedactionJob run(RedactionJobRunParams params) throws StripeException {
    return run(params, (RequestOptions) null);
  }

  /** Run redaction job method. */
  public RedactionJob run(RedactionJobRunParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s/run", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Update redaction job method. */
  public RedactionJob update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update redaction job method. */
  public RedactionJob update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Update redaction job method. */
  public RedactionJob update(RedactionJobUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update redaction job method. */
  public RedactionJob update(RedactionJobUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Validate redaction job method. */
  public RedactionJob validate() throws StripeException {
    return validate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Validate redaction job method. */
  public RedactionJob validate(RequestOptions options) throws StripeException {
    return validate((Map<String, Object>) null, options);
  }

  /** Validate redaction job method. */
  public RedactionJob validate(Map<String, Object> params) throws StripeException {
    return validate(params, (RequestOptions) null);
  }

  /** Validate redaction job method. */
  public RedactionJob validate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /** Validate redaction job method. */
  public RedactionJob validate(RedactionJobValidateParams params) throws StripeException {
    return validate(params, (RequestOptions) null);
  }

  /** Validate redaction job method. */
  public RedactionJob validate(RedactionJobValidateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(objects, responseGetter);
  }
}

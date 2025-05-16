// File generated from our OpenAPI spec
package com.stripe.model.privacy;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.privacy.RedactionJobValidationErrorListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The Redaction Job validation error object contains information about errors that affect the
 * ability to redact a specific object in a redaction job.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RedactionJobValidationError extends ApiResource implements HasId {
  /**
   * A code indicating the reason for the error.
   *
   * <p>One of {@code invalid_cascading_source}, {@code invalid_file_purpose}, {@code
   * invalid_state}, {@code locked_by_other_job}, or {@code too_many_objects}.
   */
  @SerializedName("code")
  String code;

  /**
   * If the error is related to a specific object, this field includes the object's identifier and
   * object type.
   */
  @SerializedName("erroring_object")
  ErroringObject erroringObject;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** A human-readable message providing more details about the error. */
  @SerializedName("message")
  String message;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code privacy.redaction_job_validation_error}.
   */
  @SerializedName("object")
  String object;

  /** Returns a list of validation errors for the specified redaction job. */
  public static RedactionJobValidationErrorCollection list(String job, Map<String, Object> params)
      throws StripeException {
    return list(job, params, (RequestOptions) null);
  }

  /** Returns a list of validation errors for the specified redaction job. */
  public static RedactionJobValidationErrorCollection list(
      String job, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validation_errors", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJobValidationErrorCollection.class);
  }

  /** Returns a list of validation errors for the specified redaction job. */
  public static RedactionJobValidationErrorCollection list(
      String job, RedactionJobValidationErrorListParams params) throws StripeException {
    return list(job, params, (RequestOptions) null);
  }

  /** Returns a list of validation errors for the specified redaction job. */
  public static RedactionJobValidationErrorCollection list(
      String job, RedactionJobValidationErrorListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validation_errors", ApiResource.urlEncodeId(job));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RedactionJobValidationErrorCollection.class);
  }

  /**
   * If a Redaction Job Validation Error occurred because of a specific object, this will contain
   * its identifier and object type.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ErroringObject extends StripeObject implements HasId {
    /** Unique identifier for the object. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Erroring object type. */
    @SerializedName("object_type")
    String objectType;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(erroringObject, responseGetter);
  }
}

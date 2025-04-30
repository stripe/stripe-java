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
import com.stripe.param.privacy.RedactionJobValidationErrorListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Validation errors. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RedactionJobValidationError extends ApiResource implements HasId {
  @SerializedName("code")
  String code;

  @SerializedName("erroring_object")
  Map<String, String> erroringObject;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("message")
  String message;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code privacy.redaction_job_validation_error}.
   */
  @SerializedName("object")
  String object;

  /** List validation errors method. */
  public static RedactionJobValidationErrorCollection list(String job, Map<String, Object> params)
      throws StripeException {
    return list(job, params, (RequestOptions) null);
  }

  /** List validation errors method. */
  public static RedactionJobValidationErrorCollection list(
      String job, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validation_errors", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJobValidationErrorCollection.class);
  }

  /** List validation errors method. */
  public static RedactionJobValidationErrorCollection list(
      String job, RedactionJobValidationErrorListParams params) throws StripeException {
    return list(job, params, (RequestOptions) null);
  }

  /** List validation errors method. */
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
}

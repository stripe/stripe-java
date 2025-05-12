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
import com.stripe.param.privacy.RedactionJobCancelParams;
import com.stripe.param.privacy.RedactionJobCreateParams;
import com.stripe.param.privacy.RedactionJobListParams;
import com.stripe.param.privacy.RedactionJobRetrieveParams;
import com.stripe.param.privacy.RedactionJobRunParams;
import com.stripe.param.privacy.RedactionJobUpdateParams;
import com.stripe.param.privacy.RedactionJobValidateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The Redaction Job object is used to redact Stripe objects. It is used to coordinate the removal
 * of personal information from selected objects, making them permanently inaccessible in the Stripe
 * Dashboard and API.
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
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code privacy.redaction_job}.
   */
  @SerializedName("object")
  String object;

  /** The objects to redact in this job. */
  @SerializedName("objects")
  Objects objects;

  /**
   * The status of the job.
   *
   * <p>One of {@code canceled}, {@code canceling}, {@code created}, {@code failed}, {@code ready},
   * {@code redacting}, {@code succeeded}, or {@code validating}.
   */
  @SerializedName("status")
  String status;

  /**
   * Validation behavior determines how a job validates objects for redaction eligibility. Default
   * is {@code error}.
   *
   * <p>One of {@code error}, or {@code fix}.
   */
  @SerializedName("validation_behavior")
  String validationBehavior;

  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
  public RedactionJob cancel(RedactionJobCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * You can cancel a redaction job when it’s in one of these statuses: {@code ready}, {@code
   * failed}.
   *
   * <p>Canceling the redaction job will abandon its attempt to redact the configured objects. A
   * canceled job cannot be used again.
   */
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

  /** Creates a redaction job. When a job is created, it will start to validate. */
  public static RedactionJob create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a redaction job. When a job is created, it will start to validate. */
  public static RedactionJob create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJob.class);
  }

  /** Creates a redaction job. When a job is created, it will start to validate. */
  public static RedactionJob create(RedactionJobCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a redaction job. When a job is created, it will start to validate. */
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

  /** Returns a list of redaction jobs. */
  public static RedactionJobCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of redaction jobs. */
  public static RedactionJobCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/privacy/redaction_jobs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJobCollection.class);
  }

  /** Returns a list of redaction jobs. */
  public static RedactionJobCollection list(RedactionJobListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of redaction jobs. */
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

  /** Retrieves the details of a previously created redaction job. */
  public static RedactionJob retrieve(String job) throws StripeException {
    return retrieve(job, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a previously created redaction job. */
  public static RedactionJob retrieve(String job, RequestOptions options) throws StripeException {
    return retrieve(job, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a previously created redaction job. */
  public static RedactionJob retrieve(
      String job, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(job));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RedactionJob.class);
  }

  /** Retrieves the details of a previously created redaction job. */
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
  public RedactionJob run() throws StripeException {
    return run((Map<String, Object>) null, (RequestOptions) null);
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
  public RedactionJob run(RequestOptions options) throws StripeException {
    return run((Map<String, Object>) null, options);
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
  public RedactionJob run(Map<String, Object> params) throws StripeException {
    return run(params, (RequestOptions) null);
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
  public RedactionJob run(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s/run", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
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
  public RedactionJob run(RedactionJobRunParams params) throws StripeException {
    return run(params, (RequestOptions) null);
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

  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/privacy/redaction_jobs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
  }

  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
  public RedactionJob update(RedactionJobUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the properties of a redaction job without running or canceling the job.
   *
   * <p>If the job to update is in a {@code failed} status, it will not automatically start to
   * validate. Once you applied all of the changes, use the validate API to start validation again.
   */
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
  public RedactionJob validate() throws StripeException {
    return validate((Map<String, Object>) null, (RequestOptions) null);
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
  public RedactionJob validate(RequestOptions options) throws StripeException {
    return validate((Map<String, Object>) null, options);
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
  public RedactionJob validate(Map<String, Object> params) throws StripeException {
    return validate(params, (RequestOptions) null);
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
  public RedactionJob validate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RedactionJob.class);
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
  public RedactionJob validate(RedactionJobValidateParams params) throws StripeException {
    return validate(params, (RequestOptions) null);
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

  /**
   * The objects to redact, grouped by type. All redactable objects associated with these objects
   * will be redacted as well.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Objects extends StripeObject {
    /** Charge object identifiers usually starting with {@code ch_}. */
    @SerializedName("charges")
    List<String> charges;

    /** CheckoutSession object identifiers starting with {@code cs_}. */
    @SerializedName("checkout_sessions")
    List<String> checkoutSessions;

    /** Customer object identifiers starting with {@code cus_}. */
    @SerializedName("customers")
    List<String> customers;

    /** Identity VerificationSessions object identifiers starting with {@code vs_}. */
    @SerializedName("identity_verification_sessions")
    List<String> identityVerificationSessions;

    /** Invoice object identifiers starting with {@code in_}. */
    @SerializedName("invoices")
    List<String> invoices;

    /** Issuing Cardholder object identifiers starting with {@code ich_}. */
    @SerializedName("issuing_cardholders")
    List<String> issuingCardholders;

    /** PaymentIntent object identifiers starting with {@code pi_}. */
    @SerializedName("payment_intents")
    List<String> paymentIntents;

    /** Fraud ValueListItem object identifiers starting with {@code rsli_}. */
    @SerializedName("radar_value_list_items")
    List<String> radarValueListItems;

    /** SetupIntent object identifiers starting with {@code seti_}. */
    @SerializedName("setup_intents")
    List<String> setupIntents;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(objects, responseGetter);
  }
}

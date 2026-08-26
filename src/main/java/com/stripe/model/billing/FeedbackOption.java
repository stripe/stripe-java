// File generated from our OpenAPI spec
package com.stripe.model.billing;

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
import com.stripe.param.billing.FeedbackOptionCreateParams;
import com.stripe.param.billing.FeedbackOptionDeactivateParams;
import com.stripe.param.billing.FeedbackOptionListParams;
import com.stripe.param.billing.FeedbackOptionRetrieveParams;
import com.stripe.param.billing.FeedbackOptionUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A resource for the feedback options model (for custom cancellation reasons). */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FeedbackOption extends ApiResource implements HasId {
  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.feedback_option}.
   */
  @SerializedName("object")
  String object;

  /**
   * The feedback option's status.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Creates a new feedback option. */
  public static FeedbackOption create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new feedback option. */
  public static FeedbackOption create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/feedback_options";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, FeedbackOption.class);
  }

  /** Creates a new feedback option. */
  public static FeedbackOption create(FeedbackOptionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new feedback option. */
  public static FeedbackOption create(FeedbackOptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/feedback_options";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FeedbackOption.class);
  }

  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate() throws StripeException {
    return deactivate((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(RequestOptions options) throws StripeException {
    return deactivate((Map<String, Object>) null, options);
  }

  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(Map<String, Object> params) throws StripeException {
    return deactivate(params, (RequestOptions) null);
  }

  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing/feedback_options/%s/deactivate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, FeedbackOption.class);
  }

  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(FeedbackOptionDeactivateParams params) throws StripeException {
    return deactivate(params, (RequestOptions) null);
  }

  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(FeedbackOptionDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/billing/feedback_options/%s/deactivate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, FeedbackOption.class);
  }

  /** An API method for listing the feedback options model. */
  public static FeedbackOptionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** An API method for listing the feedback options model. */
  public static FeedbackOptionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/feedback_options";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FeedbackOptionCollection.class);
  }

  /** An API method for listing the feedback options model. */
  public static FeedbackOptionCollection list(FeedbackOptionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** An API method for listing the feedback options model. */
  public static FeedbackOptionCollection list(
      FeedbackOptionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/feedback_options";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FeedbackOptionCollection.class);
  }

  /** Retrieves a feedback options object given an ID. */
  public static FeedbackOption retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a feedback options object given an ID. */
  public static FeedbackOption retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a feedback options object given an ID. */
  public static FeedbackOption retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/feedback_options/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FeedbackOption.class);
  }

  /** Retrieves a feedback options object given an ID. */
  public static FeedbackOption retrieve(
      String id, FeedbackOptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/feedback_options/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FeedbackOption.class);
  }

  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/feedback_options/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, FeedbackOption.class);
  }

  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(FeedbackOptionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(FeedbackOptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/feedback_options/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, FeedbackOption.class);
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * The time the feedback option was deactivated, if any. Measured in seconds since Unix epoch.
     */
    @SerializedName("deactivated_at")
    Long deactivatedAt;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
  }
}

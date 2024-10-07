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
import com.stripe.param.billing.MeterCreateParams;
import com.stripe.param.billing.MeterDeactivateParams;
import com.stripe.param.billing.MeterEventSummariesParams;
import com.stripe.param.billing.MeterListParams;
import com.stripe.param.billing.MeterReactivateParams;
import com.stripe.param.billing.MeterRetrieveParams;
import com.stripe.param.billing.MeterUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A billing meter is a resource that allows you to track usage of a particular event. For example,
 * you might create a billing meter to track the number of API calls made by a particular user. You
 * can then attach the billing meter to a price and attach the price to a subscription to charge the
 * user for the number of API calls they make.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/billing/subscriptions/usage-based">Usage based
 * billing</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Meter extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  @SerializedName("customer_mapping")
  CustomerMapping customerMapping;

  @SerializedName("default_aggregation")
  DefaultAggregation defaultAggregation;

  /** The meter's name. */
  @SerializedName("display_name")
  String displayName;

  /**
   * The name of the meter event to record usage for. Corresponds with the {@code event_name} field
   * on meter events.
   */
  @SerializedName("event_name")
  String eventName;

  /**
   * The time window to pre-aggregate meter events for, if any.
   *
   * <p>One of {@code day}, or {@code hour}.
   */
  @SerializedName("event_time_window")
  String eventTimeWindow;

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
   * <p>Equal to {@code billing.meter}.
   */
  @SerializedName("object")
  String object;

  /**
   * The meter's status.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Time at which the object was last updated. Measured in seconds since the Unix epoch. */
  @SerializedName("updated")
  Long updated;

  @SerializedName("value_settings")
  ValueSettings valueSettings;

  /** Creates a billing meter. */
  public static Meter create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter. */
  public static Meter create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meters";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Meter.class);
  }

  /** Creates a billing meter. */
  public static Meter create(MeterCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter. */
  public static Meter create(MeterCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meters";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Meter.class);
  }

  /** Deactivates a billing meter. */
  public Meter deactivate() throws StripeException {
    return deactivate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deactivates a billing meter. */
  public Meter deactivate(RequestOptions options) throws StripeException {
    return deactivate((Map<String, Object>) null, options);
  }

  /** Deactivates a billing meter. */
  public Meter deactivate(Map<String, Object> params) throws StripeException {
    return deactivate(params, (RequestOptions) null);
  }

  /** Deactivates a billing meter. */
  public Meter deactivate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/deactivate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Meter.class);
  }

  /** Deactivates a billing meter. */
  public Meter deactivate(MeterDeactivateParams params) throws StripeException {
    return deactivate(params, (RequestOptions) null);
  }

  /** Deactivates a billing meter. */
  public Meter deactivate(MeterDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/deactivate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Meter.class);
  }

  /** Retrieve a list of billing meter event summaries. */
  public MeterEventSummaryCollection eventSummaries(Map<String, Object> params)
      throws StripeException {
    return eventSummaries(params, (RequestOptions) null);
  }

  /** Retrieve a list of billing meter event summaries. */
  public MeterEventSummaryCollection eventSummaries(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/billing/meters/%s/event_summaries", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, MeterEventSummaryCollection.class);
  }

  /** Retrieve a list of billing meter event summaries. */
  public MeterEventSummaryCollection eventSummaries(MeterEventSummariesParams params)
      throws StripeException {
    return eventSummaries(params, (RequestOptions) null);
  }

  /** Retrieve a list of billing meter event summaries. */
  public MeterEventSummaryCollection eventSummaries(
      MeterEventSummariesParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/billing/meters/%s/event_summaries", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, MeterEventSummaryCollection.class);
  }

  /** Retrieve a list of billing meters. */
  public static MeterCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of billing meters. */
  public static MeterCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meters";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, MeterCollection.class);
  }

  /** Retrieve a list of billing meters. */
  public static MeterCollection list(MeterListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieve a list of billing meters. */
  public static MeterCollection list(MeterListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meters";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, MeterCollection.class);
  }

  /** Reactivates a billing meter. */
  public Meter reactivate() throws StripeException {
    return reactivate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Reactivates a billing meter. */
  public Meter reactivate(RequestOptions options) throws StripeException {
    return reactivate((Map<String, Object>) null, options);
  }

  /** Reactivates a billing meter. */
  public Meter reactivate(Map<String, Object> params) throws StripeException {
    return reactivate(params, (RequestOptions) null);
  }

  /** Reactivates a billing meter. */
  public Meter reactivate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/reactivate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Meter.class);
  }

  /** Reactivates a billing meter. */
  public Meter reactivate(MeterReactivateParams params) throws StripeException {
    return reactivate(params, (RequestOptions) null);
  }

  /** Reactivates a billing meter. */
  public Meter reactivate(MeterReactivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/meters/%s/reactivate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Meter.class);
  }

  /** Retrieves a billing meter given an ID. */
  public static Meter retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a billing meter given an ID. */
  public static Meter retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a billing meter given an ID. */
  public static Meter retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/meters/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Meter.class);
  }

  /** Retrieves a billing meter given an ID. */
  public static Meter retrieve(String id, MeterRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/meters/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Meter.class);
  }

  /** Updates a billing meter. */
  public Meter update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a billing meter. */
  public Meter update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/meters/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Meter.class);
  }

  /** Updates a billing meter. */
  public Meter update(MeterUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a billing meter. */
  public Meter update(MeterUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/billing/meters/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Meter.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerMapping extends StripeObject {
    /** The key in the meter event payload to use for mapping the event to a customer. */
    @SerializedName("event_payload_key")
    String eventPayloadKey;

    /**
     * The method for mapping a meter event to a customer.
     *
     * <p>Equal to {@code by_id}.
     */
    @SerializedName("type")
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DefaultAggregation extends StripeObject {
    /**
     * Specifies how events are aggregated.
     *
     * <p>One of {@code count}, or {@code sum}.
     */
    @SerializedName("formula")
    String formula;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time the meter was deactivated, if any. Measured in seconds since Unix epoch. */
    @SerializedName("deactivated_at")
    Long deactivatedAt;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ValueSettings extends StripeObject {
    /** The key in the meter event payload to use as the value for this meter. */
    @SerializedName("event_payload_key")
    String eventPayloadKey;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customerMapping, responseGetter);
    trySetResponseGetter(defaultAggregation, responseGetter);
    trySetResponseGetter(statusTransitions, responseGetter);
    trySetResponseGetter(valueSettings, responseGetter);
  }
}

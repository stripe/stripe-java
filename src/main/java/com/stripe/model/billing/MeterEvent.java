// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.billing.MeterEventCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Meter events represent actions that customers take in your system. You can use meter events to
 * bill a customer based on their usage. Meter events are associated with billing meters, which
 * define both the contents of the event’s payload and how to aggregate those events.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterEvent extends ApiResource {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The name of the meter event. Corresponds with the {@code event_name} field on a meter. */
  @SerializedName("event_name")
  String eventName;

  /** A unique identifier for the event. */
  @SerializedName("identifier")
  String identifier;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.meter_event}.
   */
  @SerializedName("object")
  String object;

  /**
   * The payload of the event. This contains the fields corresponding to a meter's {@code
   * customer_mapping.event_payload_key} (default is {@code stripe_customer_id}) and {@code
   * value_settings.event_payload_key} (default is {@code value}). Read more about the <a
   * href="https://stripe.com/docs/billing/subscriptions/usage-based/recording-usage#payload-key-overrides">payload</a>.
   */
  @SerializedName("payload")
  Map<String, String> payload;

  /** The timestamp passed in when creating the event. Measured in seconds since the Unix epoch. */
  @SerializedName("timestamp")
  Long timestamp;

  /** Creates a billing meter event. */
  public static MeterEvent create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter event. */
  public static MeterEvent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meter_events";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, MeterEvent.class);
  }

  /** Creates a billing meter event. */
  public static MeterEvent create(MeterEventCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter event. */
  public static MeterEvent create(MeterEventCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meter_events";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, MeterEvent.class);
  }
}

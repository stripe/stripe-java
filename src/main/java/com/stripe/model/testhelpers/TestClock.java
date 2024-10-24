// File generated from our OpenAPI spec
package com.stripe.model.testhelpers;

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
import com.stripe.param.testhelpers.TestClockAdvanceParams;
import com.stripe.param.testhelpers.TestClockCreateParams;
import com.stripe.param.testhelpers.TestClockListParams;
import com.stripe.param.testhelpers.TestClockRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A test clock enables deterministic control over objects in testmode. With a test clock, you can
 * create objects at a frozen time in the past or future, and advance to a specific future time to
 * observe webhooks and state changes. After the clock advances, you can either validate the current
 * state of your scenario (and test your assumptions), change the current state of your scenario
 * (and test more complex scenarios), or keep advancing forward in time.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TestClock extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** Time at which this clock is scheduled to auto delete. */
  @SerializedName("deletes_after")
  Long deletesAfter;

  /** Time at which all objects belonging to this clock are frozen. */
  @SerializedName("frozen_time")
  Long frozenTime;

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

  /** The custom name supplied at creation. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code test_helpers.test_clock}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the Test Clock.
   *
   * <p>One of {@code advancing}, {@code internal_failure}, or {@code ready}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * Starts advancing a test clock to a specified time in the future. Advancement is done when
   * status changes to {@code Ready}.
   */
  public TestClock advance(Map<String, Object> params) throws StripeException {
    return advance(params, (RequestOptions) null);
  }

  /**
   * Starts advancing a test clock to a specified time in the future. Advancement is done when
   * status changes to {@code Ready}.
   */
  public TestClock advance(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/test_clocks/%s/advance", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, TestClock.class);
  }

  /**
   * Starts advancing a test clock to a specified time in the future. Advancement is done when
   * status changes to {@code Ready}.
   */
  public TestClock advance(TestClockAdvanceParams params) throws StripeException {
    return advance(params, (RequestOptions) null);
  }

  /**
   * Starts advancing a test clock to a specified time in the future. Advancement is done when
   * status changes to {@code Ready}.
   */
  public TestClock advance(TestClockAdvanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/test_clocks/%s/advance", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, TestClock.class);
  }

  /** Creates a new test clock that can be attached to new customers and quotes. */
  public static TestClock create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new test clock that can be attached to new customers and quotes. */
  public static TestClock create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/test_clocks";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, TestClock.class);
  }

  /** Creates a new test clock that can be attached to new customers and quotes. */
  public static TestClock create(TestClockCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new test clock that can be attached to new customers and quotes. */
  public static TestClock create(TestClockCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/test_clocks";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TestClock.class);
  }

  /** Deletes a test clock. */
  public TestClock delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a test clock. */
  public TestClock delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a test clock. */
  public TestClock delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a test clock. */
  public TestClock delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, TestClock.class);
  }

  /** Returns a list of your test clocks. */
  public static TestClockCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your test clocks. */
  public static TestClockCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/test_clocks";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TestClockCollection.class);
  }

  /** Returns a list of your test clocks. */
  public static TestClockCollection list(TestClockListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your test clocks. */
  public static TestClockCollection list(TestClockListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/test_clocks";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TestClockCollection.class);
  }

  /** Retrieves a test clock. */
  public static TestClock retrieve(String testClock) throws StripeException {
    return retrieve(testClock, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a test clock. */
  public static TestClock retrieve(String testClock, RequestOptions options)
      throws StripeException {
    return retrieve(testClock, (Map<String, Object>) null, options);
  }

  /** Retrieves a test clock. */
  public static TestClock retrieve(
      String testClock, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(testClock));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TestClock.class);
  }

  /** Retrieves a test clock. */
  public static TestClock retrieve(
      String testClock, TestClockRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(testClock));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TestClock.class);
  }

  /**
   * For more details about StatusDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("advancing")
    Advancing advancing;

    /**
     * For more details about Advancing, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Advancing extends StripeObject {
      /** The {@code frozen_time} that the Test Clock is advancing towards. */
      @SerializedName("target_frozen_time")
      Long targetFrozenTime;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(statusDetails, responseGetter);
  }
}

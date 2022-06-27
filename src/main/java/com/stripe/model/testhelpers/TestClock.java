// File generated from our OpenAPI spec
package com.stripe.model.testhelpers;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.testhelpers.TestClockAdvanceParams;
import com.stripe.param.testhelpers.TestClockCreateParams;
import com.stripe.param.testhelpers.TestClockListParams;
import com.stripe.param.testhelpers.TestClockRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TestClock extends ApiResource implements HasId {
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * Time at which this clock is scheduled to auto delete.
   */
  @SerializedName("deletes_after")
  Long deletesAfter;

  /**
   * Time at which all objects belonging to this clock are frozen.
   */
  @SerializedName("frozen_time")
  Long frozenTime;

  /**
   * Unique identifier for the object.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The custom name supplied at creation.
   */
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

  /**
   * <p>Retrieves a test clock.</p>
   */
  public static TestClock retrieve(String testClock) throws StripeException {
    return retrieve(testClock, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves a test clock.</p>
   */
  public static TestClock retrieve(
      String testClock,
      RequestOptions options) throws StripeException {
    return retrieve(testClock, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves a test clock.</p>
   */
  public static TestClock retrieve(
      String testClock,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(testClock))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Retrieves a test clock.</p>
   */
  public static TestClock retrieve(
      String testClock,
      TestClockRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(testClock))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Creates a new test clock that can be attached to new customers and quotes.</p>
   */
  public static TestClock create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new test clock that can be attached to new customers and quotes.</p>
   */
  public static TestClock create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/test_clocks");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Creates a new test clock that can be attached to new customers and quotes.</p>
   */
  public static TestClock create(TestClockCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Creates a new test clock that can be attached to new customers and quotes.</p>
   */
  public static TestClock create(
      TestClockCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/test_clocks");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Deletes a test clock.</p>
   */
  public TestClock delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Deletes a test clock.</p>
   */
  public TestClock delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * <p>Deletes a test clock.</p>
   */
  public TestClock delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * <p>Deletes a test clock.</p>
   */
  public TestClock delete(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(this.getId()))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.DELETE,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Starts advancing a test clock to a specified time in the future. Advancement is done when status changes to <code>Ready</code>.</p>
   */
  public TestClock advance(Map<String, Object> params) throws StripeException {
    return advance(params, (RequestOptions) null);
  }

  /**
   * <p>Starts advancing a test clock to a specified time in the future. Advancement is done when status changes to <code>Ready</code>.</p>
   */
  public TestClock advance(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format(
          "/v1/test_helpers/test_clocks/%s/advance",
          ApiResource.urlEncodeId(this.getId())
        )
      );
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Starts advancing a test clock to a specified time in the future. Advancement is done when status changes to <code>Ready</code>.</p>
   */
  public TestClock advance(TestClockAdvanceParams params) throws StripeException {
    return advance(params, (RequestOptions) null);
  }

  /**
   * <p>Starts advancing a test clock to a specified time in the future. Advancement is done when status changes to <code>Ready</code>.</p>
   */
  public TestClock advance(
      TestClockAdvanceParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format(
          "/v1/test_helpers/test_clocks/%s/advance",
          ApiResource.urlEncodeId(this.getId())
        )
      );
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      TestClock.class,
      options
    );
  }

  /**
   * <p>Returns a list of your test clocks.</p>
   */
  public static TestClockCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your test clocks.</p>
   */
  public static TestClockCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/test_clocks");
    return ApiResource.requestCollection(url, params, TestClockCollection.class, options);
  }

  /**
   * <p>Returns a list of your test clocks.</p>
   */
  public static TestClockCollection list(TestClockListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your test clocks.</p>
   */
  public static TestClockCollection list(
      TestClockListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/test_helpers/test_clocks");
    return ApiResource.requestCollection(url, params, TestClockCollection.class, options);
  }
}
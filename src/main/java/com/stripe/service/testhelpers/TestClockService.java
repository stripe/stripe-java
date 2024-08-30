// File generated from our OpenAPI spec
package com.stripe.service.testhelpers;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.testhelpers.TestClock;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.testhelpers.TestClockAdvanceParams;
import com.stripe.param.testhelpers.TestClockCreateParams;
import com.stripe.param.testhelpers.TestClockListParams;
import com.stripe.param.testhelpers.TestClockRetrieveParams;

public final class TestClockService extends ApiService {
  public TestClockService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes a test clock. */
  public TestClock delete(String testClock) throws StripeException {
    return delete(testClock, (RequestOptions) null);
  }
  /** Deletes a test clock. */
  public TestClock delete(String testClock, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(testClock));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options, ApiMode.V1);
    return this.request(request, TestClock.class);
  }
  /** Retrieves a test clock. */
  public TestClock retrieve(String testClock, TestClockRetrieveParams params)
      throws StripeException {
    return retrieve(testClock, params, (RequestOptions) null);
  }
  /** Retrieves a test clock. */
  public TestClock retrieve(String testClock, RequestOptions options) throws StripeException {
    return retrieve(testClock, (TestClockRetrieveParams) null, options);
  }
  /** Retrieves a test clock. */
  public TestClock retrieve(String testClock) throws StripeException {
    return retrieve(testClock, (TestClockRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a test clock. */
  public TestClock retrieve(
      String testClock, TestClockRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/test_helpers/test_clocks/%s", ApiResource.urlEncodeId(testClock));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, TestClock.class);
  }
  /** Returns a list of your test clocks. */
  public StripeCollection<TestClock> list(TestClockListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your test clocks. */
  public StripeCollection<TestClock> list(RequestOptions options) throws StripeException {
    return list((TestClockListParams) null, options);
  }
  /** Returns a list of your test clocks. */
  public StripeCollection<TestClock> list() throws StripeException {
    return list((TestClockListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your test clocks. */
  public StripeCollection<TestClock> list(TestClockListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/test_clocks";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<TestClock>>() {}.getType());
  }
  /** Creates a new test clock that can be attached to new customers and quotes. */
  public TestClock create(TestClockCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new test clock that can be attached to new customers and quotes. */
  public TestClock create(TestClockCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/test_helpers/test_clocks";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, TestClock.class);
  }
  /**
   * Starts advancing a test clock to a specified time in the future. Advancement is done when
   * status changes to {@code Ready}.
   */
  public TestClock advance(String testClock, TestClockAdvanceParams params) throws StripeException {
    return advance(testClock, params, (RequestOptions) null);
  }
  /**
   * Starts advancing a test clock to a specified time in the future. Advancement is done when
   * status changes to {@code Ready}.
   */
  public TestClock advance(String testClock, TestClockAdvanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/test_clocks/%s/advance", ApiResource.urlEncodeId(testClock));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, TestClock.class);
  }
}

package com.stripe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.reset;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObjectInterface;
import com.stripe.net.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import lombok.Cleanup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.stubbing.Answer;

public class BaseStripeTest {
  private static final String MOCK_MINIMUM_VERSION = "0.109.0";

  private static String port;

  public static HttpClient httpClientSpy;
  public static StripeResponseGetter networkSpy;
  public static StripeClient mockClient;

  private String origApiBase;
  private String origApiKey;
  private String origClientId;
  private String origUploadBase;

  protected static final String TEST_API_KEY = "sk_test_123";

  static {
    // To only stop stripe-mock process after all the test classes.
    // Alternative solution using @AfterClass will stop the stripe-mock after
    // every test class.
    Runtime.getRuntime()
        .addShutdownHook(
            new Thread(
                new Runnable() {
                  @Override
                  public void run() {
                    try {
                      StripeMockProcess.stop();
                    } catch (Exception e) {
                      // ignore any exception from trying to stop embedded stripe-mock
                    }
                  }
                }));
  }

  /** Checks that stripe-mock is running and up-to-date. */
  @BeforeAll
  public static void checkStripeMock() throws Exception {
    if (StripeMockProcess.start()) {
      port = StripeMockProcess.getPort();
      return;
    }

    port = System.getenv().get("STRIPE_MOCK_PORT");
    if (port == null) {
      port = "12111";
    }

    URL url = new URL(String.format("http://localhost:%s", port));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");

    try {
      conn.getResponseCode();
    } catch (IOException e) {
      throw new RuntimeException(
          String.format(
              "Couldn't reach stripe-mock at `localhost:%s`. Is it "
                  + "running? Please see README for setup instructions.",
              port));
    }

    String version = conn.getHeaderField("Stripe-Mock-Version");
    if (!"master".equals(version) && (compareVersions(version, MOCK_MINIMUM_VERSION) > 0)) {
      throw new RuntimeException(
          String.format(
              "Your version of stripe-mock (%s) is too old. The minimum "
                  + "version to run this test suite is %s. Please see its "
                  + "repository for upgrade instructions.",
              version, MOCK_MINIMUM_VERSION));
    }
  }

  /**
   * Activates usage of stripe-mock by overriding the API host and putting a test key into the
   * environment. This is required independent of how stripe-mock is started.
   */
  @BeforeEach
  public void setUpStripeMockUsage() {
    this.origApiBase = Stripe.getApiBase();
    this.origUploadBase = Stripe.getUploadBase();
    this.origApiKey = Stripe.apiKey;
    this.origClientId = Stripe.clientId;

    Stripe.overrideApiBase("http://localhost:" + port);
    Stripe.overrideUploadBase("http://localhost:" + port);
    Stripe.apiKey = "sk_test_123";
    Stripe.clientId = "ca_123";
    Stripe.enableTelemetry = false;

    httpClientSpy = Mockito.spy(new HttpURLConnectionClient());
    networkSpy = Mockito.spy(new LiveStripeResponseGetter(null, httpClientSpy));
    mockClient = new StripeClient(networkSpy);

    ApiResource.setGlobalResponseGetter(networkSpy);
    OAuth.setGlobalResponseGetter(networkSpy);
  }

  /**
   * Deactivates usage stripe-mock by returning the API host to whatever it was before stripe-mock
   * was activated.
   */
  @AfterEach
  public void tearDownStripeMockUsage() {
    ApiResource.setGlobalResponseGetter(new LiveStripeResponseGetter());

    Stripe.overrideApiBase(this.origApiBase);
    Stripe.overrideUploadBase(this.origUploadBase);
    Stripe.apiKey = this.origApiKey;
    Stripe.clientId = this.origClientId;
  }

  public static String getStripeMockUrl() {
    return "http://localhost:" + port;
  }

  /**
   * {@code params} and {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#verifyRequest(ApiResource.RequestMethod, String, Map, RequestOptions)
   */
  public static <T> void verifyRequest(ApiResource.RequestMethod method, String path)
      throws StripeException {
    verifyRequest(method, path, null);
  }

  /**
   * {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#verifyRequest(ApiResource.RequestMethod, String, Map, RequestOptions)
   */
  public static <T> void verifyRequest(
      ApiResource.RequestMethod method, String path, Map<String, Object> params)
      throws StripeException {
    verifyRequest(method, path, params, null);
  }

  public static <T extends StripeObjectInterface> void verifyRequest(
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options)
      throws StripeException {
    verifyRequest(BaseAddress.API, method, path, params, options);
  }
  /**
   * Verifies that a request was made with the provided parameters.
   *
   * @param method HTTP method (GET, POST or DELETE)
   * @param path request path (e.g. "/v1/charges"). Can also be an abolute URL.
   * @param params map containing the parameters. If null, the parameters are not checked.
   * @param options request options. If null, the options are not checked.
   */
  @SuppressWarnings("AssertionFailureIgnored")
  public static <T extends StripeObjectInterface> void verifyRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options)
      throws StripeException {

    verifyRequest(
        (req) -> {
          assertEquals(baseAddress, req.getBaseAddress());
          assertEquals(method, req.getMethod());
          assertEquals(path, req.getPath());
          if (params != null) {
            final String msg =
                String.format(
                    "Params did not match - expected: %s, received: %s", params, req.getParams());
            assertTrue(msg, compareParamObjects(params, req.getParams()));
          }
          if (options != null) {
            assertEquals(options, req.getOptions());
          }
        });
  }

  @SuppressWarnings("AssertionFailureIgnored")
  public static <T extends StripeObjectInterface> void verifyRequest(
      Consumer<ApiRequest> assertOnApiRequest) throws StripeException {

    ArgumentCaptor<ApiRequest> requestCaptor = ArgumentCaptor.forClass(ApiRequest.class);
    List<AssertionError> exceptions = new ArrayList<AssertionError>();
    try {
      Mockito.verify(networkSpy, Mockito.atLeastOnce()).requestStream(requestCaptor.capture());
    } catch (MockitoAssertionError e) {
      Mockito.verify(networkSpy, Mockito.atLeastOnce())
          .request(requestCaptor.capture(), Mockito.<Type>any());
    }

    for (ApiRequest req : requestCaptor.getAllValues()) {
      try {
        assertOnApiRequest.accept(req);
        return;
      } catch (AssertionError e) {
        exceptions.add(e);
      }
    }

    // If we get here, each request failed an assertion.
    if (exceptions.size() != 0) {
      // Combine all exceptions into a single message
      String msg = "";
      for (AssertionError e : exceptions) {
        msg += e.getMessage() + "\n\n";
      }
      throw new AssertionError(msg);
    }
  }

  @SuppressWarnings("AssertionFailureIgnored")
  public static <T extends StripeObjectInterface> void verifyStripeRequest(
      Consumer<StripeRequest> assertOnStripeRequest) throws StripeException {

    ArgumentCaptor<StripeRequest> requestCaptor = ArgumentCaptor.forClass(StripeRequest.class);
    List<AssertionError> exceptions = new ArrayList<AssertionError>();
    Mockito.verify(httpClientSpy, Mockito.atLeastOnce()).request(requestCaptor.capture());

    for (StripeRequest req : requestCaptor.getAllValues()) {
      try {
        assertOnStripeRequest.accept(req);
        return;
      } catch (AssertionError e) {
        exceptions.add(e);
      }
    }

    // If we get here, each request failed an assertion.
    if (exceptions.size() != 0) {
      // Combine all exceptions into a single message
      String msg = "";
      for (AssertionError e : exceptions) {
        msg += e.getMessage() + "\n\n";
      }
      throw new AssertionError(msg);
    }
  }

  /** Verifies that no request was made. */
  public static <T> void verifyNoRequest() {
    Mockito.verifyNoInteractions(networkSpy);
  }

  /** Verifies that no additional requests were made since the last verification. */
  public static <T> void verifyNoMoreRequests() {
    Mockito.verifyNoMoreInteractions(networkSpy);
  }

  /**
   * {@code params} and {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#stubRequest(ApiResource.RequestMethod, String, Map, RequestOptions, Class,
   *     String)
   */
  public static <T extends StripeObjectInterface> void stubRequest(
      ApiResource.RequestMethod method, String path, Type typeToken, String response)
      throws StripeException {
    stubRequest(BaseAddress.API, method, path, null, null, typeToken, response);
  }

  /**
   * {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#stubRequest(ApiResource.RequestMethod, String, Map, RequestOptions, Class,
   *     String)
   */
  public static <T extends StripeObjectInterface> void stubRequest(
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      String response)
      throws StripeException {
    stubRequest(BaseAddress.API, method, path, params, null, typeToken, response);
  }

  /**
   * Stubs an API request. This should rarely be necessary, but some endpoints are not supported by
   * stripe-mock yet.
   *
   * @param method HTTP method (GET, POST or DELETE)
   * @param path request path (e.g. "/v1/charges"). Can also be an abolute URL.
   * @param params map containing the parameters. If null, the parameters are not checked.
   * @param options request options. If null, the options are not checked.
   * @param typeToken Class of the API resource that will be returned for the stubbed request.
   * @param response JSON payload of the API resource that will be returned for the stubbed request.
   */
  public static <T extends StripeObjectInterface> void stubRequest(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      Type typeToken,
      String response)
      throws StripeException {

    Mockito.doReturn(ApiResource.GSON.fromJson(response, typeToken))
        .when(networkSpy)
        .request(
            Mockito.argThat(
                (req) -> {
                  return req.getBaseAddress().equals(baseAddress)
                      && req.getMethod().equals(method)
                      && req.getPath().equals(path)
                      && (params == null || new ParamMapMatcher(params).matches(req.getParams()))
                      && (options == null
                          || new RequestOptionsMatcher(options).matches(req.getOptions()));
                }),
            Mockito.<Type>any());
  }

  /**
   * Stubs an API request. This should rarely be necessary, but some endpoints are not supported by
   * stripe-mock yet.
   *
   * @param method HTTP method (GET, POST or DELETE)
   * @param path request path (e.g. "/v1/charges"). Can also be an abolute URL.
   * @param params map containing the parameters. If null, the parameters are not checked.
   * @param options request options. If null, the options are not checked.
   * @param typeToken Class of the API resource that will be returned for the stubbed request.
   * @param response JSON payload of the API resource that will be returned for the stubbed request.
   */
  public static <T extends StripeObjectInterface> void stubRequestReturnError(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      String response,
      Integer code)
      throws StripeException {

    Mockito.doAnswer(
            (Answer<StripeResponse>)
                invocation ->
                    new StripeResponse(400, HttpHeaders.of(Collections.emptyMap()), response))
        .when(httpClientSpy)
        .request(Mockito.any());
  }

  /** Stubs an OAuth API request. stripe-mock does not supported OAuth endpoints at this time. */
  public static <T extends StripeObjectInterface> void stubOAuthRequest(
      Class<T> clazz, String response) throws StripeException {
    Mockito.doReturn(ApiResource.GSON.fromJson(response, clazz))
        .when(networkSpy)
        .request(Mockito.any(ApiRequest.class), Mockito.<Type>any());
  }

  /**
   * Resets the network spy. This is useful when you need to retrieve a resource from stripe-mock to
   * use as a fixture, but the retrieval request is not part of the test.
   */
  public static void resetNetworkSpy() {
    reset(networkSpy);
  }

  /**
   * Convenience method that extracts a subset of JSON data and returns it.
   *
   * <p>For example, if I know that my charge object has a customer under it, I can pass my charge
   * JSON data and specify {@code field} as {@code customer}. This returns everything that had been
   * under the {@code customer} key (encoded as JSON).
   *
   * @param data JSON encoded data.
   * @param field Field under data which to extract.
   * @return Extracted JSON encoded data.
   */
  protected static String getDataAt(String data, String field) {
    Gson gson = new Gson();
    Type type = new TypeToken<Map<String, Object>>() {}.getType();
    Map<String, Object> map = gson.fromJson(data, type);
    Object value = map.get(field);
    return gson.toJson(value);
  }

  /**
   * Convenience method that extracts a subset of JSON data and returns it.
   *
   * <p>For example, if I know that my charge object has a customer under it, I can pass my charge
   * JSON data and specify {@code field} as {@code customer}. This returns everything that had been
   * under the {@code customer} key (encoded as JSON).
   *
   * @param data JSON encoded data.
   * @param index Index of the data to extract.
   * @return Extracted JSON encoded data.
   */
  protected static String getDataAt(String data, Integer index) {
    Gson gson = new Gson();
    Type type = new TypeToken<List<Object>>() {}.getType();
    List<Object> list = gson.fromJson(data, type);
    Object value = list.get(index);
    return gson.toJson(value);
  }

  /**
   * Gets fixture data from stripe-mock for a resource expected to be at the given API path.
   * stripe-mock ignores whether IDs are actually valid, so it's only important to make sure that
   * the route exists, rather than the actual resource. It's common to use a symbolic ID stand-in
   * like {@code ch_123}.
   *
   * <pre>
   * getFixture("/v1/charges/ch_123")
   * </pre>
   *
   * @param path API path to use to get a fixture for stripe-mock.
   * @return Fixture data encoded as JSON.
   */
  protected static String getFixture(String path) throws Exception {
    return getFixture(path, null);
  }

  /**
   * Gets fixture data with expansions specified. Expansions are specified the same way as they are
   * in the normal API like {@code customer} or {@code data.customer}. Use the special {@code *}
   * character to specify that all fields should be expanded.
   *
   * @param path API path to use to get a fixture for stripe-mock.
   * @param expansions Set of expansions that should be applied.
   * @return Fixture data encoded as JSON.
   */
  protected static String getFixture(String path, String[] expansions) throws Exception {
    int status;

    StringBuilder urlStringBuilder = new StringBuilder();
    urlStringBuilder.append("http://localhost:" + port + path);

    if (expansions != null) {
      urlStringBuilder.append("?");
      for (String expansion : expansions) {
        urlStringBuilder.append("expand[]=");
        urlStringBuilder.append(expansion);
        urlStringBuilder.append("&");
      }
    }
    URL url = new URL(urlStringBuilder.toString());

    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Authorization", "Bearer sk_test_123");

    // This is the line that actually triggers the request.
    try {
      status = conn.getResponseCode();
    } catch (IOException e) {
      throw new RuntimeException(
          String.format(
              "Couldn't reach stripe-mock at `localhost:%s`. Is it "
                  + "running? Please see README for setup instructions.",
              port));
    }

    if (status != 200) {
      throw new RuntimeException(String.format("Connection to stripe-mock at : %d.", status));
    }

    return readUntilEnd(conn.getInputStream());
  }

  /**
   * Gets a resource file and returns its contents in a string.
   *
   * @param path path to the resource file.
   * @return File contents.
   */
  protected String getResourceAsString(String path) throws IOException {
    InputStream resource = getClass().getResourceAsStream(path);

    ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
    byte[] buf = new byte[1024];

    for (int i = resource.read(buf); i > 0; i = resource.read(buf)) {
      os.write(buf, 0, i);
    }

    return os.toString("utf8");
  }

  private static String readUntilEnd(InputStream inputStream) throws IOException {
    @Cleanup
    BufferedReader reader =
        new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    StringBuilder builder = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      builder.append(line);
      builder.append("\r");
    }
    return builder.toString();
  }

  /**
   * Compares two version strings (e.g. "1.2.3").
   *
   * @param a First version string.
   * @param b Second version string.
   * @return -1 if a > b, 1 if a < b, 0 if a == b.
   */
  private static int compareVersions(String a, String b) {
    int ret = 0;

    String[] as = a.split("\\.", -1);
    String[] bs = b.split("\\.", -1);

    int loopMax = bs.length;
    if (as.length > bs.length) {
      loopMax = as.length;
    }

    for (int i = 0; i < loopMax; i++) {
      String x = "";
      String y = "";
      if (as.length > i) {
        x = as[i];
      }
      if (bs.length > i) {
        y = bs[i];
      }

      int xi = Integer.parseInt(x);
      int yi = Integer.parseInt(y);

      if (xi > yi) {
        ret = -1;
      } else if (xi < yi) {
        ret = 1;
      }
      if (ret != 0) {
        break;
      }
    }

    return ret;
  }

  public static class ParamMapMatcher implements ArgumentMatcher<Map<String, Object>> {
    private Map<String, Object> other;

    public ParamMapMatcher(Map<String, Object> other) {
      this.other = other;
    }

    /** Informs if this matcher accepts the given argument. */
    @Override
    public boolean matches(Map<String, Object> paramMap) {
      if (this.other == null) {
        // If the matcher was constructed with null, accept any params
        return true;
      } else {
        if (paramMap == null) {
          return this.other.isEmpty();
        } else {
          return compareParamObjects(this.other, paramMap);
        }
      }
    }

    @Override
    public String toString() {
      return other.toString();
    }
  }

  @SuppressWarnings("unchecked")
  private static Boolean compareParamObjects(Object thisValue, Object otherValue) {
    if (thisValue == null) {
      return otherValue == null;
    }

    if (thisValue instanceof Map<?, ?>) {
      if (!(otherValue instanceof Map<?, ?>)) {
        return false;
      }
      Map<String, Object> thisMap = (Map<String, Object>) thisValue;
      Map<String, Object> otherMap = (Map<String, Object>) otherValue;
      Set<String> thisKeySet = thisMap.keySet();
      if (!thisKeySet.equals(otherMap.keySet())) {
        return false;
      }
      for (String thisKey : thisKeySet) {
        if (!compareParamObjects(thisMap.get(thisKey), otherMap.get(thisKey))) {
          return false;
        }
      }
      return true;
    }

    if (thisValue instanceof Object[]) {
      thisValue = Arrays.asList((Object[]) thisValue);
    }
    if (otherValue instanceof Object[]) {
      otherValue = Arrays.asList((Object[]) otherValue);
    }

    if (thisValue instanceof List<?> && otherValue instanceof List<?>) {
      List<Object> thisListValue = (List<Object>) thisValue;
      List<Object> otherListValue = (List<Object>) otherValue;
      if (thisListValue.size() != otherListValue.size()) {
        return false;
      }
      for (int i = 0; i < thisListValue.size(); i++) {
        if (!compareParamObjects(thisListValue.get(i), otherListValue.get(i))) {
          return false;
        }
      }
      return true;
    }

    if (thisValue instanceof Integer) {
      thisValue = Long.valueOf((Integer) thisValue);
    }
    if (otherValue instanceof Integer) {
      otherValue = Long.valueOf((Integer) otherValue);
    }

    return thisValue.equals(otherValue);
  }

  public static class RequestOptionsMatcher implements ArgumentMatcher<RequestOptions> {
    private RequestOptions other;

    public RequestOptionsMatcher(RequestOptions other) {
      this.other = other;
    }

    /** Informs if this matcher accepts the given argument. */
    @Override
    public boolean matches(RequestOptions requestOptions) {
      if (this.other == null) {
        // If the matcher was constructed with null, accept any options
        return true;
      } else {
        if (requestOptions == null) {
          /* Treat null reference as RequestOptions.getDefault() */
          RequestOptions defaultOptions = RequestOptions.getDefault();
          return this.other.equals(defaultOptions);
        } else {
          return this.other.equals(requestOptions);
        }
      }
    }
  }
}

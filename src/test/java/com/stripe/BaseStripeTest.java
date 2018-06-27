package com.stripe;

import static org.mockito.Mockito.reset;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.OAuth;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import lombok.Cleanup;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

public class BaseStripeTest {
  // If changing this number, please also change it in `.travis.yml`.
  private static final String MOCK_MINIMUM_VERSION = "0.17.0";

  private static String port;

  public static StripeResponseGetter networkSpy;

  private String origApiBase;
  private String origApiKey;
  private String origClientId;
  private String origUploadBase;

  /**
   * Checks that stripe-mock is running and up-to-date.
   */
  @BeforeClass
  public static void checkStripeMock() throws Exception {
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
      throw new RuntimeException(String.format(
        "Couldn't reach stripe-mock at `localhost:%s`. Is it "
        + "running? Please see README for setup instructions.",
        port
      ));
    }

    String version = conn.getHeaderField("Stripe-Mock-Version");
    if (!(version.equals("master")) && (compareVersions(version, MOCK_MINIMUM_VERSION) > 0)) {
      throw new RuntimeException(String.format(
        "Your version of stripe-mock (%s) is too old. The minimum "
        + "version to run this test suite is %s. Please see its "
        + "repository for upgrade instructions.",
        version, MOCK_MINIMUM_VERSION
      ));
    }
  }

  /**
   * Activates stripe-mock by overriding the API host and putting a test key
   * into the environment.
   */
  @Before
  public void setUpStripeMock() {
    this.origApiBase = Stripe.getApiBase();
    this.origUploadBase = Stripe.getUploadBase();
    this.origApiKey = Stripe.apiKey;
    this.origClientId = Stripe.clientId;

    Stripe.overrideApiBase("http://localhost:" + port);
    Stripe.overrideUploadBase("http://localhost:" + port);
    Stripe.apiKey = "sk_test_123";
    Stripe.clientId = "ca_123";

    networkSpy = Mockito.spy(new LiveStripeResponseGetter());
    ApiResource.setStripeResponseGetter(networkSpy);
    OAuth.setStripeResponseGetter(networkSpy);
  }

  /**
   * Deactivates stripe-mock by returning the API host to whatever it was
   * before stripe-mock was activated.
   */
  @After
  public void tearDownStripeMock() {
    ApiResource.setStripeResponseGetter(new LiveStripeResponseGetter());

    Stripe.overrideApiBase(this.origApiBase);
    Stripe.overrideUploadBase(this.origUploadBase);
    Stripe.apiKey = this.origApiKey;
    Stripe.clientId = this.origClientId;
  }

  /**
   * {@code params}, {@code requestType} and {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#verifyRequest(ApiResource.RequestMethod, String, Map,
   *     ApiResource.RequestType, RequestOptions)
   */
  public static <T> void verifyRequest(
      ApiResource.RequestMethod method,
      String path) throws StripeException {
    verifyRequest(method, path, null, null, null);
  }

  /**
   * {@code requestType} and {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#verifyRequest(ApiResource.RequestMethod, String, Map,
   *     ApiResource.RequestType, RequestOptions)
   */
  public static <T> void verifyRequest(
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params) throws StripeException {
    verifyRequest(method, path, params, null, null);
  }

  /**
   * Verifies that a request was made with the provided parameters.
   *
   * @param method HTTP method (GET, POST or DELETE)
   * @param path request path (e.g. "/v1/charges"). Can also be an abolute URL.
   * @param params map containing the parameters. If null, the parameters are not checked.
   * @param requestType request type (NORMAL or MULTIPART). If null, the request type is not
   *     checked.
   * @param options request options. If null, the options are not checked.
   */
  public static <T> void verifyRequest(
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      ApiResource.RequestType requestType,
      RequestOptions options) throws StripeException {
    String url;
    if (path.startsWith("/")) {
      url = String.format("%s%s", Stripe.getApiBase(), path);
    } else {
      url = path;
    }

    Mockito.verify(networkSpy).request(
        Mockito.eq(method),
        Mockito.eq(url),
        (params != null) ? Mockito.argThat(new ParamMapMatcher(params))
          : Mockito.<Map<String, Object>>any(),
        Mockito.<Class<T>>any(),
        (requestType != null) ? Mockito.eq(requestType) :
          Mockito.any(ApiResource.RequestType.class),
        (options != null) ? Mockito.argThat(new RequestOptionsMatcher(options))
          : Mockito.<RequestOptions>any()
    );
  }

  /**
   * Verifies that no request was made.
   */
  public static <T> void verifyNoRequest() {
    Mockito.verifyZeroInteractions(networkSpy);
  }

  /**
   * Verifies that no additionalrequests were made since the last verification.
   */
  public static <T> void verifyNoMoreRequests() {
    Mockito.verifyNoMoreInteractions(networkSpy);
  }

  /**
   * {@code params}, {@code requestType} and {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#stubRequest(ApiResource.RequestMethod, String, Map,
   *     ApiResource.RequestType, RequestOptions, Class, String)
   */
  public static <T> void stubRequest(
      ApiResource.RequestMethod method,
      String path,
      Class<T> clazz,
      String response) throws StripeException {
    stubRequest(method, path, null, null, null, clazz, response);
  }

  /**
   * {@code requestType} and {@code options} defaults to {@code null}.
   *
   * @see BaseStripeTest#stubRequest(ApiResource.RequestMethod, String, Map,
   *     ApiResource.RequestType, RequestOptions, Class, String)
   */
  public static <T> void stubRequest(
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Class<T> clazz,
      String response) throws StripeException {
    stubRequest(method, path, params, null, null, clazz, response);
  }

  /**
   * Stubs an API request. This should rarely be necessary, but some endpoints are not
   * supported by stripe-mock yet.
   *
   * @param method HTTP method (GET, POST or DELETE)
   * @param path request path (e.g. "/v1/charges"). Can also be an abolute URL.
   * @param params map containing the parameters. If null, the parameters are not checked.
   * @param requestType request type (NORMAL or MULTIPART). If null, the request type is not
   *     checked.
   * @param options request options. If null, the options are not checked.
   * @param clazz Class of the API resource that will be returned for the stubbed request.
   * @param response JSON payload of the API resource that will be returned for the stubbed
   *     request.
   */
  public static <T> void stubRequest(
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      ApiResource.RequestType requestType,
      RequestOptions options,
      Class<T> clazz,
      String response) throws StripeException {
    String url;
    if (path.startsWith("/")) {
      url = String.format("%s%s", Stripe.getApiBase(), path);
    } else {
      url = path;
    }

    Mockito
        .doReturn(ApiResource.GSON.fromJson(response, clazz))
        .when(networkSpy).request(
          Mockito.eq(method),
          Mockito.eq(url),
          (params != null) ? Mockito.argThat(new ParamMapMatcher(params))
            : Mockito.<Map<String, Object>>any(),
          Mockito.<Class<T>>any(),
          (requestType != null) ? Mockito.eq(requestType)
            : Mockito.any(ApiResource.RequestType.class),
          (options != null) ? Mockito.argThat(new RequestOptionsMatcher(options))
            : Mockito.<RequestOptions>any()
      );
  }

  /**
   * Stubs an OAuth API request. stripe-mock does not supported OAuth endpoints at this time.
   */
  public static <T> void stubOAuthRequest(Class<T> clazz, String response)
      throws StripeException {
    Mockito
        .doReturn(ApiResource.GSON.fromJson(response, clazz))
        .when(networkSpy).oauthRequest(
          Mockito.any(ApiResource.RequestMethod.class),
          Mockito.anyString(),
          Mockito.<Map<String, Object>>any(),
          Mockito.<Class<T>>any(),
          Mockito.any(ApiResource.RequestType.class),
          Mockito.<RequestOptions>any()
      );
  }

  /**
   * Resets the network spy. This is useful when you need to retrieve a resource from stripe-mock
   * to use as a fixture, but the retrieval request is not part of the test.
   */
  public static void resetNetworkSpy() {
    reset(networkSpy);
  }

  /**
   * Convenience method that extracts a subset of JSON data and returns it.
   *
   * <p>For example, if I know that my charge object has a customer under it,
   * I can pass my charge JSON data and specify {@code field} as {@code
   * customer}. This returns everything that had been under the {@code
   * customer} key (encoded as JSON).
   *
   * @param data JSON encoded data.
   * @param field Field under data which to extract.
   * @return Extracted JSON encoded data.
   */
  protected static String getDataAt(String data, String field) {
    Gson gson = new Gson();
    Type type = new TypeToken<Map<String, Object>>(){}.getType();
    Map<String, Object> map = gson.fromJson(data, type);
    Object value = map.get(field);
    return gson.toJson(value);
  }

  /**
   * Convenience method that extracts a subset of JSON data and returns it.
   *
   * <p>For example, if I know that my charge object has a customer under it,
   * I can pass my charge JSON data and specify {@code field} as {@code
   * customer}. This returns everything that had been under the {@code
   * customer} key (encoded as JSON).
   *
   * @param data JSON encoded data.
   * @param index Index of the data to extract.
   * @return Extracted JSON encoded data.
   */
  protected static String getDataAt(String data, Integer index) {
    Gson gson = new Gson();
    Type type = new TypeToken<List<Object>>(){}.getType();
    List<Object> list = gson.fromJson(data, type);
    Object value = list.get(index);
    return gson.toJson(value);
  }

  /**
   * Gets fixture data from stripe-mock for a resource expected to be at the
   * given API path. stripe-mock ignores whether IDs are actually valid, so
   * it's only important to make sure that the route exists, rather than the
   * actual resource. It's common to use a symbolic ID stand-in like {@code
   * ch_123}.
   *
   * <pre>
   * getFixture("/v1/charges/ch_123")
   * </pre>
   *
   * @param path API path to use to get a fixture for stripe-mock.
   * @return Fixture data encoded as JSON.
   */
  protected static String getFixture(String path) throws Exception, IOException,
      MalformedURLException, ProtocolException {
    return getFixture(path, null);
  }

  /**
   * Gets fixture data with expansions specified. Expansions are specified
   * the same way as they are in the normal API like {@code customer} or
   * {@code data.customer}. Use the special {@code *} character to specify
   * that all fields should be expanded.
   *
   * @param path API path to use to get a fixture for stripe-mock.
   * @param expansions Set of expansions that should be applied.
   * @return Fixture data encoded as JSON.
   */
  protected static String getFixture(String path, String[] expansions) throws Exception,
      IOException, MalformedURLException, ProtocolException {
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

    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Authorization", "Bearer sk_test_123");

    // This is the line that actually triggers the request.
    try {
      status = conn.getResponseCode();
    } catch (IOException e) {
      throw new RuntimeException(String.format(
        "Couldn't reach stripe-mock at `localhost:%s`. Is it "
        + "running? Please see README for setup instructions.",
        port
      ));
    }

    if (status != 200) {
      throw new RuntimeException(String.format(
        "Connection to stripe-mock at : %d.",
        status
      ));
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
    @Cleanup BufferedReader reader =
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

    /**
     * Informs if this matcher accepts the given argument.
     */
    @Override
    public boolean matches(Map<String,Object> paramMap) {
      if (this.other == null) {
        // If the matcher was constructed with null, accept any params
        return true;
      } else {
        if (paramMap == null) {
          return this.other.isEmpty();
        } else {
          return this.other.equals(paramMap);
        }
      }
    }
  }

  public static class RequestOptionsMatcher implements ArgumentMatcher<RequestOptions> {
    private RequestOptions other;

    public RequestOptionsMatcher(RequestOptions other) {
      this.other = other;
    }

    /**
     * Informs if this matcher accepts the given argument.
     */
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

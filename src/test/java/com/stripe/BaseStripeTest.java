package com.stripe;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

public class BaseStripeTest {
  public static StripeResponseGetter networkMock;

  public static <T> void verifyGet(Class<T> clazz, String url) throws StripeException {
    verifyRequest(APIResource.RequestMethod.GET, clazz, url, null, APIResource.RequestType.NORMAL,
        RequestOptions.getDefault());
  }

  public static <T> void verifyGet(Class<T> clazz, String url, Map<String, Object> params)
      throws StripeException {
    verifyRequest(APIResource.RequestMethod.GET, clazz, url, params, APIResource.RequestType.NORMAL,
        RequestOptions.getDefault());
  }

  public static <T> void verifyGet(Class<T> clazz, String url, RequestOptions requestOptions)
      throws StripeException {
    verifyRequest(APIResource.RequestMethod.GET, clazz, url, null, APIResource.RequestType.NORMAL,
        requestOptions);
  }

  public static <T> void verifyGet(Class<T> clazz, String url, Map<String, Object> params,
      RequestOptions requestOptions) throws StripeException {
    verifyRequest(APIResource.RequestMethod.GET, clazz, url, params, APIResource.RequestType.NORMAL,
        requestOptions);
  }

  public static <T> void verifyPost(Class<T> clazz, String url) throws StripeException {
    verifyRequest(APIResource.RequestMethod.POST, clazz, url, null, APIResource.RequestType.NORMAL,
        RequestOptions.getDefault());
  }

  public static <T> void verifyPost(Class<T> clazz, String url, Map<String, Object> params)
      throws StripeException {
    verifyRequest(APIResource.RequestMethod.POST, clazz, url, params,
        APIResource.RequestType.NORMAL, RequestOptions.getDefault());
  }

  public static <T> void verifyPost(Class<T> clazz, String url, RequestOptions requestOptions)
      throws StripeException {
    verifyRequest(APIResource.RequestMethod.POST, clazz, url, null, APIResource.RequestType.NORMAL,
        requestOptions);
  }

  public static <T> void verifyPost(Class<T> clazz, String url, Map<String, Object> params,
      RequestOptions requestOptions) throws StripeException {
    verifyRequest(APIResource.RequestMethod.POST, clazz, url, params,
        APIResource.RequestType.NORMAL, requestOptions);
  }

  public static <T> void verifyDelete(Class<T> clazz, String url, Map<String, Object> params)
      throws StripeException {
    verifyRequest(APIResource.RequestMethod.DELETE, clazz, url, params,
        APIResource.RequestType.NORMAL, RequestOptions.getDefault());
  }

  public static <T> void verifyDelete(Class<T> clazz, String url, RequestOptions requestOptions)
      throws StripeException {
    verifyRequest(APIResource.RequestMethod.DELETE, clazz, url, null,
        APIResource.RequestType.NORMAL, requestOptions);
  }

  public static <T> void verifyDelete(Class<T> clazz, String url, Map<String, Object> params,
      RequestOptions requestOptions) throws StripeException {
    verifyRequest(APIResource.RequestMethod.DELETE, clazz, url, params,
        APIResource.RequestType.NORMAL, requestOptions);
  }

  public static <T> void verifyDelete(Class<T> clazz, String url) throws StripeException {
    verifyRequest(APIResource.RequestMethod.DELETE, clazz, url, null,
        APIResource.RequestType.NORMAL, RequestOptions.getDefault());
  }

  /**
   * Verifies that the specified request occurred.
   */
  public static <T> void verifyRequest(APIResource.RequestMethod method, Class<T> clazz, String url,
      Map<String, Object> params, APIResource.RequestType requestType, RequestOptions options)
      throws StripeException {
    verify(networkMock).request(eq(method), eq(url), argThat(new ParamMapMatcher(params)),
        eq(clazz), eq(requestType), argThat(new RequestOptionsMatcher(options)));
  }

  /**
   * Stubs the next API request and return the provided response.
   */
  public static <T> void stubNetwork(Class<T> clazz, String response) throws StripeException {
    when(networkMock.request(Mockito.any(APIResource.RequestMethod.class), Mockito.anyString(),
        Mockito.<Map<String, Object>>any(), Mockito.<Class<T>>any(),
        Mockito.any(APIResource.RequestType.class), Mockito.<RequestOptions>any()))
            .thenReturn(APIResource.GSON.fromJson(response, clazz));
  }

  /**
   * Stubs the next OAuth request and return the provided response.
   */
  public static <T> void stubOAuth(Class<T> clazz, String response) throws StripeException {
    when(networkMock.oauthRequest(Mockito.any(APIResource.RequestMethod.class), Mockito.anyString(),
        Mockito.<Map<String, Object>>any(), Mockito.<Class<T>>any(),
        Mockito.any(APIResource.RequestType.class), Mockito.<RequestOptions>any()))
            .thenReturn(APIResource.GSON.fromJson(response, clazz));
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
    public boolean matches(Map<String, Object> paramMap) {
      // Treat null references as equal to empty maps
      if (paramMap == null) {
        return this.other == null || this.other.isEmpty();
      } else {
        if (this.other == null) {
          return paramMap.isEmpty();
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
      // Treat null reference as RequestOptions.getDefault()
      RequestOptions defaultOptions = RequestOptions.getDefault();
      if (requestOptions == null) {
        return this.other == null || this.other.equals(defaultOptions);
      } else {
        if (this.other == null) {
          return requestOptions.equals(defaultOptions);
        } else {
          return this.other.equals(requestOptions);
        }
      }
    }
  }

  @BeforeClass
  public static void setUp() {
    Stripe.apiKey = "foobar";
  }

  @Before
  public void setUpMock() {
    networkMock = mock(StripeResponseGetter.class);
  }

  protected String resource(String path) throws IOException {
    InputStream resource = getClass().getResourceAsStream(path);

    try (ByteArrayOutputStream os = new ByteArrayOutputStream(1024)) {
      byte[] buf = new byte[1024];

      for (int i = resource.read(buf); i > 0; i = resource.read(buf)) {
        os.write(buf, 0, i);
      }

      return os.toString("utf8");
    }
  }
}

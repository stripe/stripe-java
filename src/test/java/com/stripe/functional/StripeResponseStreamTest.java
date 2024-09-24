package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.util.StreamUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import lombok.Cleanup;
import lombok.Getter;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;

public class StripeResponseStreamTest extends BaseStripeTest {

  private static class TestResource extends ApiResource implements HasId {
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    public static TestResource retrieve(String id) throws StripeException {
      return getGlobalResponseGetter()
          .request(
              new ApiRequest(
                  BaseAddress.API,
                  ApiResource.RequestMethod.GET,
                  String.format("/v1/foos/%s", ApiResource.urlEncodeId(id)),
                  (Map<String, Object>) null,
                  (RequestOptions) null),
              TestResource.class);
    }

    public InputStream pdf() throws StripeException {
      String url = String.format("/v1/foobars/%s/pdf", ApiResource.urlEncodeId(this.getId()));
      return getResponseGetter()
          .requestStream(
            new ApiRequest(
              BaseAddress.FILES,
              ApiResource.RequestMethod.POST,
              url,
              (Map<String, Object>) null,
              (RequestOptions) null)
              );
    }
  }

  @Test
  public void testStreamedResponseSuccess()
      throws StripeException, IOException, InterruptedException {
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(new MockResponse().setBody("{\"id\": \"foo_123\"}"));
    server.enqueue(new MockResponse().setBody("}this is a pdf, not valid json{"));
    server.start();

    Stripe.overrideApiBase(server.url("").toString());

    TestResource t = TestResource.retrieve("foo_123");
    server.takeRequest();
    assertEquals("foo_123", t.id);

    InputStream stream = t.pdf();

    final String body = StreamUtils.readToEnd(stream, ApiResource.CHARSET);
    stream.close();
    assertEquals("}this is a pdf, not valid json{", body);
    server.shutdown();
  }

  @Test
  public void testStreamedResponseFailure()
      throws StripeException, IOException, InterruptedException {
    @Cleanup MockWebServer server = new MockWebServer();
    server.enqueue(new MockResponse().setBody("{\"id\": \"foo_123\"}"));
    server.enqueue(
        new MockResponse()
            .setResponseCode(400)
            .setBody("{\"error\": {\"message\": \"bad bad bad\"}}"));
    server.start();

    Stripe.overrideApiBase(server.url("").toString());

    TestResource r = TestResource.retrieve("foo_123");
    server.takeRequest();
    assertEquals("foo_123", r.id);

    assertThrows(
        InvalidRequestException.class,
        () -> {
          r.pdf();
        });
    server.shutdown();
  }
}

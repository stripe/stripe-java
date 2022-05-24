import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.exception.*;
import com.stripe.model.Subscription;
import com.stripe.net.ApiResource;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpHeaders;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.StripeRequest;
import com.stripe.net.StripeResponse;
import com.stripe.net.StripeResponseGetter;
import java.util.Collections;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

public class LiveStripeResponseGetterTest extends BaseStripeTest {

  @Test
  public void testInvalidJson() throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setStripeResponseGetter(srg);
    StripeResponse response =
      new StripeResponse(200, HttpHeaders.of(Collections.emptyMap()), "invalid JSON");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());
    Exception exception =
      assertThrows(
        ApiException.class,
        () -> {
          Subscription.retrieve("sub_123");
        });
    assertThat(
      exception.getMessage(), CoreMatchers.containsString("Invalid response object from API"));
    assertNotNull(exception.getCause());
    assertThat(exception.getCause(), CoreMatchers.instanceOf(JsonSyntaxException.class));
  }

  public static Object[][] responseExceptionsByType() {
    return new Object[][] {
      { "card_error", CardException.class },
      { "invalid_request_error", InvalidRequestException.class },
      { "idempotency_error", IdempotencyException.class }
    };
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource(value = "responseExceptionsByType")
  public void testCreatesCorrectExceptionFromType(String type, Class<? extends Exception> exceptionClass) throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setStripeResponseGetter(srg);
    StripeResponse response =
      new StripeResponse(432, HttpHeaders.of(Collections.emptyMap()), "{\"error\":{ \"type\":\""+ type + "\" }}");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());

    assertThrows(
      exceptionClass,
      () -> {
        Subscription.retrieve("sub_123");
      });
  }

  public static Object[][] responseExceptionsByStatus() {
    return new Object[][] {
      { 402, CardException.class },
      { 400, InvalidRequestException.class },
      { 404, InvalidRequestException.class },
      { 401, AuthenticationException.class },
      { 403, PermissionException.class },
      { 429, RateLimitException.class },
      { 499, ApiException.class },
    };
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource(value = "responseExceptionsByStatus")
  public void testCreatesCorrectExceptionFromStatus(Integer status, Class<? extends Exception> exceptionClass) throws StripeException {
    HttpClient spy = Mockito.spy(new HttpURLConnectionClient());
    StripeResponseGetter srg = new LiveStripeResponseGetter(spy);
    ApiResource.setStripeResponseGetter(srg);
    StripeResponse response =
      new StripeResponse(status, HttpHeaders.of(Collections.emptyMap()), "{\"error\":{ \"type\":\"???\" }}");
    Mockito.doReturn(response).when(spy).requestWithRetries(Mockito.<StripeRequest>any());

    assertThrows(
      exceptionClass,
      () -> {
        Subscription.retrieve("sub_123");
      });
  }
}

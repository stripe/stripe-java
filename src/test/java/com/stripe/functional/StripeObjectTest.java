import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.exception.ApiException;
import com.stripe.exception.StripeException;
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
import org.mockito.Mockito;

public class StripeObjectTest extends BaseStripeTest {
  @Test
  public void testGetRawJsonObject() throws StripeException {
    final Subscription subscription = Subscription.retrieve("sub_123");

    // Access `id`, a string element
    assertEquals(
        subscription.getId(),
        subscription.getRawJsonObject().getAsJsonPrimitive("id").getAsString());

    // Access `created`, a number element
    assertEquals(
        subscription.getCreated(),
        subscription.getRawJsonObject().getAsJsonPrimitive("created").getAsLong());

    // Access `items[data][0][id]`, a deeply nested string element
    assertEquals(
        subscription.getItems().getData().get(0).getId(),
        subscription
            .getRawJsonObject()
            .getAsJsonObject("items")
            .getAsJsonArray("data")
            .get(0)
            .getAsJsonObject()
            .getAsJsonPrimitive("id")
            .getAsString());
  }

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
}

package com.stripe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.model.terminal.Reader;
import com.stripe.net.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class StripeClientTest {
  @Test
  public void testFlowsStripeResponseGetter() throws Exception {
    StripeResponseGetter responseGetter = Mockito.spy(new LiveStripeResponseGetter());
    StripeClient client = new StripeClient(responseGetter);

    Mockito.doAnswer((Answer<Reader>) invocation -> new Reader())
        .when(responseGetter)
        .request(
            Mockito.<BaseAddress>any(),
            Mockito.<ApiResource.RequestMethod>any(),
            Mockito.anyString(),
            Mockito.<Map<String, Object>>any(),
            Mockito.<Class<Reader>>any(),
            Mockito.<RequestOptions>any(),
            Mockito.<ApiMode>any());

    client.terminal().readers().retrieve("r_123");

    assertTrue(Mockito.mockingDetails(responseGetter).getInvocations().stream().count() > 0);
  }

  @Test
  public void clientOptionsDefaults() {
    StripeResponseGetterOptions options = StripeClient.builder().setApiKey("sk_123").buildOptions();

    assertEquals(Stripe.DEFAULT_CONNECT_TIMEOUT, options.getConnectTimeout());
    assertEquals(Stripe.DEFAULT_READ_TIMEOUT, options.getReadTimeout());
    assertEquals(Stripe.LIVE_API_BASE, options.getApiBase());
    assertEquals(Stripe.CONNECT_API_BASE, options.getConnectBase());
    assertEquals(Stripe.UPLOAD_API_BASE, options.getFilesBase());
    assertEquals(0, options.getMaxNetworkRetries());
  }

  @Test
  public void setsUsageOnResponseGetter() throws Exception {
    StripeResponseGetter responseGetter = new LiveStripeResponseGetter();
    new StripeClient(responseGetter);
    Field field = responseGetter.getClass().getDeclaredField("usage");
    field.setAccessible(true);
    Object usage = field.get(responseGetter);
    assertTrue(usage instanceof List);
    assertEquals(1, ((List<?>) usage).size());
    assertEquals("stripe_client", ((List<?>) usage).get(0));
  }
}

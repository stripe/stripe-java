package com.stripe;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.ThinEvent;
import com.stripe.model.terminal.Reader;
import com.stripe.net.*;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class StripeClientTest extends BaseStripeTest {
  @Test
  public void testFlowsStripeResponseGetter() throws Exception {
    StripeResponseGetter responseGetter = Mockito.spy(new LiveStripeResponseGetter());
    StripeClient client = new StripeClient(responseGetter);

    Mockito.doAnswer((Answer<Reader>) invocation -> new Reader())
        .when(responseGetter)
        .request(Mockito.<ApiRequest>any(), Mockito.<Type>any());

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
    assertEquals(Stripe.EVENTS_API_BASE, options.getEventsBase());
    assertEquals(0, options.getMaxNetworkRetries());
  }

  @Test
  public void checksWebhookSignature()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {
    StripeClient client = new StripeClient("sk_123");

    String payload = "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"event\"\n}";
    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);

    ThinEvent e = client.parseThinEvent(payload, signature, secret);
    assertEquals(e.getId(), "evt_test_webhook");
  }

  @Test
  public void failsWebhookVerification()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {
    StripeClient client = new StripeClient("sk_123");

    String payload = "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"event\"\n}";
    String secret = "whsec_test_secret";
    String signature = "bad signature";

    assertThrows(
        SignatureVerificationException.class,
        () -> {
          client.parseThinEvent(payload, signature, secret);
        });
  }
}

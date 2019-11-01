package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.stripe.Stripe;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class HttpURLConnectionClientTest {
  @Test
  public void testAppInfo() {
    final RequestOptions options = new RequestOptionsBuilder().setApiKey("sk_foobar").build();

    Stripe.setAppInfo(
        "MyAwesomePlugin", "1.2.34", "https://myawesomeplugin.info", "pp_partner_1234");

    final Map<String, String> headers = HttpURLConnectionClient.getHeaders(options);

    final String expectedUserAgent =
        String.format(
            "Stripe/v1 JavaBindings/%s MyAwesomePlugin/1.2.34 (https://myawesomeplugin.info)",
            Stripe.VERSION);
    assertEquals(expectedUserAgent, headers.get("User-Agent"));

    final Gson gson = new Gson();

    final Map<String, String> uaMap =
        gson.fromJson(
            headers.get("X-Stripe-Client-User-Agent"),
            new TypeToken<Map<String, String>>() {}.getType());
    assertNotNull(uaMap.get("application"));

    final Map<String, String> appMap =
        gson.fromJson(uaMap.get("application"), new TypeToken<Map<String, String>>() {}.getType());
    assertEquals("MyAwesomePlugin", appMap.get("name"));
    assertEquals("1.2.34", appMap.get("version"));
    assertEquals("https://myawesomeplugin.info", appMap.get("url"));
    assertEquals("pp_partner_1234", appMap.get("partner_id"));
  }

  @Test
  public void testStripeVersion() {
    final RequestOptions versionOverrideOpts =
        new RequestOptionsBuilder().setStripeVersionOverride("2015-05-05").build();
    assertEquals(
        "2015-05-05",
        HttpURLConnectionClient.getHeaders(versionOverrideOpts).get("Stripe-Version"));

    final RequestOptions options = new RequestOptionsBuilder().build();
    assertEquals(
        Stripe.API_VERSION, HttpURLConnectionClient.getHeaders(options).get("Stripe-Version"));
  }
}

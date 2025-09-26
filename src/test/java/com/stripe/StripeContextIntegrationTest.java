package com.stripe;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.model.v2.EventNotification;
import com.stripe.net.RawRequestOptions;
import com.stripe.net.RequestOptions;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class StripeContextIntegrationTest {

  @Test
  public void testRequestOptionsWithStringContext() {
    RequestOptions options = RequestOptions.builder().setStripeContext("a/b/c").build();

    assertEquals("a/b/c", options.getStripeContext());
  }

  @Test
  public void testRawRequestOptionsWithStringContext() {
    RawRequestOptions options = RawRequestOptions.builder().setStripeContext("a/b/c").build();

    assertEquals("a/b/c", options.getStripeContext());
  }

  @Test
  public void testRequestOptionsWithContextObject() {
    StripeContext context = new StripeContext(Arrays.asList("a", "b", "c"));
    RequestOptions options = RequestOptions.builder().setStripeContext(context).build();

    assertEquals("a/b/c", options.getStripeContext());
  }

  @Test
  public void testRequestOptionsWithNullContext() {
    RequestOptions options = RequestOptions.builder().setStripeContext(new StripeContext()).build();

    assertEquals("", options.getStripeContext());
  }

  @Test
  public void testStripeClientBuilderWithStringContext() {
    StripeClient.StripeClientBuilder builder =
        StripeClient.builder().setApiKey("sk_test_123").setStripeContext("a/b/c");

    assertEquals("a/b/c", builder.getStripeContext());
  }

  @Test
  public void testStripeClientBuilderWithContextObject() {
    StripeContext context = new StripeContext(Arrays.asList("a", "b", "c"));
    StripeClient.StripeClientBuilder builder =
        StripeClient.builder().setApiKey("sk_test_123").setStripeContext(context);

    assertEquals("a/b/c", builder.getStripeContext());
  }

  @Test
  public void testStripeClientBuilderWithNullContext() {
    StripeClient.StripeClientBuilder builder =
        StripeClient.builder().setApiKey("sk_test_123").setStripeContext((StripeContext) null);

    assertNull(builder.getStripeContext());
  }

  @Test
  public void testStripeClientBuilderEmptyContextOverwrites() {
    StripeClient.StripeClientBuilder builder =
        StripeClient.builder()
            .setApiKey("sk_test_123")
            .setStripeContext("ctx_123")
            .setStripeContext(new StripeContext());

    assertEquals("", builder.getStripeContext());
  }

  @Test
  public void testStripeClientBuilderWithEmptyContext() {
    StripeClient.StripeClientBuilder builder =
        StripeClient.builder().setApiKey("sk_test_123").setStripeContext(new StripeContext());

    assertEquals("", builder.getStripeContext());
  }

  @Test
  public void testEventNotificationParsing() {
    String payload =
        "{\"id\":\"evt_123\",\"type\":\"test.event\",\"created\":\"2023-01-01T00:00:00Z\",\"livemode\":false,\"context\":\"a/b/c\"}";
    StripeClient client = new StripeClient("sk_test_123");

    EventNotification notification = EventNotification.fromJson(payload, client);

    assertNotNull(notification.context);
    assertEquals(Arrays.asList("a", "b", "c"), notification.context.getSegments());
    assertEquals("a/b/c", notification.context.toString());
  }

  @Test
  public void testEventNotificationNoContext() {
    String payload =
        "{\"id\":\"evt_123\",\"type\":\"test.event\",\"created\":\"2023-01-01T00:00:00Z\",\"livemode\":false}";
    StripeClient client = new StripeClient("sk_test_123");

    EventNotification notification = EventNotification.fromJson(payload, client);

    assertNull(notification.getContext());
  }

  @Test
  public void testEventNotificationEmptyContext() {
    String payload =
        "{\"id\":\"evt_123\",\"type\":\"test.event\",\"created\":\"2023-01-01T00:00:00Z\",\"livemode\":false,\"context\":\"\"}";
    StripeClient client = new StripeClient("sk_test_123");

    EventNotification notification = EventNotification.fromJson(payload, client);

    assertNull(notification.getContext());
  }

  @Test
  public void testEventNotificationNullContext() {
    String payload =
        "{\"id\":\"evt_123\",\"type\":\"test.event\",\"created\":\"2023-01-01T00:00:00Z\",\"livemode\":false,\"context\":null}";
    StripeClient client = new StripeClient("sk_test_123");

    EventNotification notification = EventNotification.fromJson(payload, client);

    assertNull(notification.getContext());
  }

  @Test
  public void testContextBuilderPattern() {
    // Test the builder pattern works well with StripeContext
    StripeContext baseContext = StripeContext.parse("workspace_123");

    RequestOptions options =
        RequestOptions.builder()
            .setApiKey("sk_test_123")
            .setStripeContext(baseContext.push("account_456"))
            .build();

    assertEquals("workspace_123/account_456", options.getStripeContext());
  }

  @Test
  public void testContextCompatibility() {
    // Test that both string and StripeContext work equivalently
    RequestOptions stringOptions = RequestOptions.builder().setStripeContext("a/b/c").build();

    StripeContext context = new StripeContext(Arrays.asList("a", "b", "c"));
    RequestOptions contextOptions = RequestOptions.builder().setStripeContext(context).build();

    assertEquals(stringOptions.getStripeContext(), contextOptions.getStripeContext());
  }
}

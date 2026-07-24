package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.StripeClient;
import com.stripe.model.Event;
import com.stripe.model.v2.core.EventNotification;
import org.junit.jupiter.api.Test;

public class CloudProviderEventTest extends BaseStripeTest {

  private static final String EVENTBRIDGE_PAYLOAD =
      "{\"version\":\"0\",\"id\":\"17e8dff5-d6cd-3770-ace9-aeac02b6ac3f\","
          + "\"detail-type\":\"customer.created\","
          + "\"source\":\"aws.partner/stripe.com/ed_123\","
          + "\"account\":\"506417113029\","
          + "\"time\":\"2024-03-07T18:27:56Z\","
          + "\"region\":\"us-west-2\","
          + "\"resources\":[],"
          + "\"detail\":{"
          + "\"id\":\"evt_test_123\","
          + "\"object\":\"event\","
          + "\"api_version\":\"2023-10-16\","
          + "\"created\":1709836076,"
          + "\"data\":{\"object\":{\"id\":\"cus_123\",\"object\":\"customer\"}},"
          + "\"livemode\":true,"
          + "\"pending_webhooks\":0,"
          + "\"request\":{\"id\":\"req_123\",\"idempotency_key\":null},"
          + "\"type\":\"customer.created\"}}";

  private static final String EVENTGRID_PAYLOAD =
      "{\"specversion\":\"1.0\","
          + "\"type\":\"customer.created\","
          + "\"source\":\"/providers/stripe/ed_test_123\","
          + "\"id\":\"9aeb0fdf-c01e-0131-0922-9eb54906e209\","
          + "\"time\":\"2025-07-11T14:30:00Z\","
          + "\"subject\":null,"
          + "\"dataContentType\":\"application/cloudevents+json\","
          + "\"data\":{"
          + "\"id\":\"evt_test_456\","
          + "\"object\":\"event\","
          + "\"api_version\":\"2023-10-16\","
          + "\"created\":1709836076,"
          + "\"data\":{\"object\":{\"id\":\"cus_456\",\"object\":\"customer\"}},"
          + "\"livemode\":false,"
          + "\"pending_webhooks\":0,"
          + "\"request\":{\"id\":\"req_456\",\"idempotency_key\":null},"
          + "\"type\":\"customer.created\"}}";

  private static final String EVENTBRIDGE_NOTIFICATION_PAYLOAD =
      "{\"version\":\"0\",\"id\":\"17e8dff5-d6cd-3770-ace9-aeac02b6ac3f\","
          + "\"detail-type\":\"v2.core.event_destination.ping\","
          + "\"source\":\"aws.partner/stripe.com/ed_123\","
          + "\"detail\":{"
          + "\"id\":\"evt_test_789\","
          + "\"object\":\"v2.core.event\","
          + "\"type\":\"v2.core.event_destination.ping\","
          + "\"created\":\"2024-03-07T18:27:56.000Z\","
          + "\"livemode\":true}}";

  private static final String EVENTGRID_NOTIFICATION_PAYLOAD =
      "{\"specversion\":\"1.0\","
          + "\"type\":\"v2.core.event_destination.ping\","
          + "\"source\":\"/providers/stripe/ed_test_123\","
          + "\"id\":\"9aeb0fdf-c01e-0131-0922-9eb54906e209\","
          + "\"data\":{"
          + "\"id\":\"evt_test_789\","
          + "\"object\":\"v2.core.event\","
          + "\"type\":\"v2.core.event_destination.ping\","
          + "\"created\":\"2024-03-07T18:27:56.000Z\","
          + "\"livemode\":true}}";

  // constructEventFromCloudProvider tests

  @Test
  public void testEventBridgeViaClient() {
    StripeClient client = new StripeClient("sk_test_fake");
    Event event = client.constructEventFromCloudProvider(EVENTBRIDGE_PAYLOAD);
    assertNotNull(event);
    assertEquals("evt_test_123", event.getId());
    assertEquals("customer.created", event.getType());
  }

  @Test
  public void testEventGridViaClient() {
    StripeClient client = new StripeClient("sk_test_fake");
    Event event = client.constructEventFromCloudProvider(EVENTGRID_PAYLOAD);
    assertNotNull(event);
    assertEquals("evt_test_456", event.getId());
    assertEquals("customer.created", event.getType());
  }

  @Test
  public void testInvalidJsonViaClient() {
    StripeClient client = new StripeClient("sk_test_fake");
    assertThrows(
        JsonSyntaxException.class, () -> client.constructEventFromCloudProvider("not valid json"));
  }

  @Test
  public void testRawEventFromClientSuggestsConstructEvent() {
    String rawEvent =
        "{\"id\":\"evt_test_123\",\"object\":\"event\",\"type\":\"customer.created\"}";
    StripeClient client = new StripeClient("sk_test_fake");
    IllegalArgumentException ex =
        assertThrows(
            IllegalArgumentException.class, () -> client.constructEventFromCloudProvider(rawEvent));
    assertTrue(ex.getMessage().contains("constructEvent"));
  }

  @Test
  public void testUnrecognizedFormatViaClient() {
    StripeClient client = new StripeClient("sk_test_fake");
    IllegalArgumentException ex =
        assertThrows(
            IllegalArgumentException.class,
            () -> client.constructEventFromCloudProvider("{\"foo\":\"bar\"}"));
    assertTrue(ex.getMessage().contains("Unrecognized cloud event format"));
  }

  // parseEventNotificationFromCloudProvider tests

  @Test
  public void testEventBridgeNotificationViaClient() {
    StripeClient client = new StripeClient("sk_test_fake");
    EventNotification notification =
        client.parseEventNotificationFromCloudProvider(EVENTBRIDGE_NOTIFICATION_PAYLOAD);
    assertNotNull(notification);
    assertEquals("evt_test_789", notification.getId());
  }

  @Test
  public void testEventGridNotificationViaClient() {
    StripeClient client = new StripeClient("sk_test_fake");
    EventNotification notification =
        client.parseEventNotificationFromCloudProvider(EVENTGRID_NOTIFICATION_PAYLOAD);
    assertNotNull(notification);
    assertEquals("evt_test_789", notification.getId());
  }

  @Test
  public void testParseNotificationWithV1EventSuggestsConstructEventFromCloudProvider() {
    StripeClient client = new StripeClient("sk_test_fake");
    assertThrows(
        IllegalArgumentException.class,
        () -> client.parseEventNotificationFromCloudProvider(EVENTBRIDGE_PAYLOAD));
  }
}

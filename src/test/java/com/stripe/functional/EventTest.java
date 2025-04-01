package com.stripe.functional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import com.stripe.model.EventCollection;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.param.EventListParams;
import com.stripe.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class EventTest extends BaseStripeTest {
  public static final String EVENT_ID = "evt_123";

  @Test
  public void testRetrieve() throws StripeException {
    final Event event = Event.retrieve(EVENT_ID);

    assertNotNull(event);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/events/%s", EVENT_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final EventCollection resources = Event.list(params);

    assertNotNull(resources);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/events"), params);
  }

  @Test
  public void testListWithTypedParams() throws StripeException {
    EventListParams typedParams =
        EventListParams.builder().setLimit(1L).setType("charge.succeeded").build();

    final EventCollection resources = Event.list(typedParams);

    assertNotNull(resources);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/events"),
        ImmutableMap.of("limit", 1L, "type", "charge.succeeded"));
  }

  @Test
  public void testGetDataObjectWithSameApiVersion() throws StripeException {
    final Event event = Event.retrieve(EVENT_ID);
    // Suppose event has the same API version as the library's pinned version. Note that beta
    // payloads don't return beta headeres, so we trim.
    event.setApiVersion(StringUtils.trimApiVersion(Stripe.API_VERSION));

    Optional<StripeObject> stripeObject = event.getDataObjectDeserializer().getObject();

    assertTrue(stripeObject.isPresent());
  }

  @Test
  public void testGetDataObjectWithNewApiVersionInSameReleaseTrain() throws StripeException {
    String expectedReleaseTrain = Stripe.API_VERSION.split("\\.")[1];
    final Event event = Event.retrieve(EVENT_ID);
    // Suppose event has a different API version within the same release train as the
    // library's pinned version
    event.setApiVersion("2999-10-10." + expectedReleaseTrain);

    Optional<StripeObject> stripeObject = event.getDataObjectDeserializer().getObject();

    // true in GA, but false in beta
    assertFalse(stripeObject.isPresent());
  }

  @Test
  public void testGetDataObjectWithLegacyApiVersion() throws StripeException {
    final Event event = Event.retrieve(EVENT_ID);
    // Suppose event has different API version from the library's pinned version
    event.setApiVersion("2017-05-25");

    Optional<StripeObject> stripeObject = event.getDataObjectDeserializer().getObject();

    // See compatibility helper in `EventDataObjectDeserializerTest` for
    // handling schema incompatibility
    assertFalse(stripeObject.isPresent());
  }

  @Test
  public void testGetDataObjectWithReleaseTrainMismatch() throws StripeException {
    final Event event = Event.retrieve(EVENT_ID);
    // Suppose event has different API version and different release train from
    // the libraries pinned version
    event.setApiVersion("2999-10-10.the_larch");

    Optional<StripeObject> stripeObject = event.getDataObjectDeserializer().getObject();

    // See compatibility helper in `EventDataObjectDeserializerTest` for
    // handling schema incompatibility
    assertFalse(stripeObject.isPresent());
  }
}
